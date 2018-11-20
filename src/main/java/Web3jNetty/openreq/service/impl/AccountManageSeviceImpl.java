package Web3jNetty.openreq.service.impl;

import Web3jNetty.common.exception.CommonException;
import Web3jNetty.common.response.ResponseBody;
import Web3jNetty.common.response.ResponseMsg;
import Web3jNetty.common.walletconfig.WalletConfig;
import Web3jNetty.openreq.dao.AccountManageDao;
import Web3jNetty.openreq.dao.TransferDealManageDao;
import Web3jNetty.openreq.dao.impl.AccountManageDaoImpl;
import Web3jNetty.openreq.dao.impl.TransferDealManageDaoImpl;
import Web3jNetty.openreq.service.AccountManageSevice;
import Web3jNetty.openreq.vo.AccountVO;
import Web3jNetty.openreq.vo.CoinBlanceVO;
import Web3jNetty.openreq.vo.TransactionBackVO;
import Web3jNetty.openreq.vo.TransactionDealVO;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.Response;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.utils.Numeric;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.service.impl
 * @date 2018-11-09  16:30
 * @project com.web.netty
 */
public class AccountManageSeviceImpl implements AccountManageSevice {

    AccountManageDao  accountManageDao = new AccountManageDaoImpl();
    TransferDealManageDao transferDealManageDao = new TransferDealManageDaoImpl();

    /**
     * 创建账号
     *
     * @param params
     * @return
     */
    @Override
    public String createAccount(Map<String, Object> params) {
        AccountVO accountVO = new AccountVO();
        accountManageDao.createAccount(accountVO,params);
        return ResponseBody.getResponseSuccessDefinedDataMsg(accountVO, ResponseMsg.SUCCESS_MSG);
    }

    /**
     * 查询账号余额
     * <p>
     * 货币单位：1 ether = 1000000000000000000 wei
     * </p>
     *
     * @param address
     * @return
     */
    @Override
    public String getAllBalance(String address) {
        CoinBlanceVO coinBlance = new CoinBlanceVO();
        try {
            BigInteger balance = WalletConfig.getWeb3j().ethGetBalance(address,
                    DefaultBlockParameterName.LATEST).send().getBalance();
            coinBlance.setEthBlance(String.valueOf(balance));
        } catch (Exception e) {
            // e.printStackTrace();
            throw new CommonException("检查地址是否正确,稍后重试！" + e.getMessage());
        }
        return ResponseBody.getResponseSuccessDefinedDataMsg(coinBlance, ResponseMsg.SUCCESS_MSG);
    }

    /**
     * 转账交易
     *
     * @return
     */
    @Override
    public String transferDeal(String from, String to, String value, String privateKey) throws IOException, ExecutionException, InterruptedException {
        Credentials credentials = Credentials.create(privateKey);
        if (!from.equalsIgnoreCase(credentials.getAddress())) {
            throw new CommonException("转出密钥或地址不正确！");
        }
        RawTransaction rawTransaction = TransactionDealVO.getRawTransaction(from, to, value);
        byte[] signedMessage = TransactionEncoder.signMessage(rawTransaction, credentials);
        String hexValue = Numeric.toHexString(signedMessage);
        EthSendTransaction ethSendTransaction = WalletConfig.getWeb3j().ethSendRawTransaction(hexValue).sendAsync().get();
        Response.Error error = ethSendTransaction.getError();
        if (error != null) {
            throw new CommonException(error.getMessage());
        } else {
            String transactionHash = ethSendTransaction.getTransactionHash();
            TransactionBackVO transactionBackVO = TransactionDealVO.getTransactionBackVO(transactionHash, value);
            Integer status =  transferDealManageDao.insertTransferDeal(transactionHash,from,to,value);
            return ResponseBody.getResponseSuccessDefinedDataMsg(transactionBackVO, ResponseMsg.SUCCESS_MSG);
        }
    }

}
