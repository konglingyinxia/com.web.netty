package Web3jNetty.openreq.vo;

import Web3jNetty.common.constant.CommonConstant;
import Web3jNetty.common.walletconfig.WalletConfig;
import org.web3j.crypto.RawTransaction;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.utils.Convert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * 交易VO
 *
 * @author 卫星
 * @package Web3jNetty.openreq.vo
 * @date 2018-11-19  11:22
 * @project com.web.netty
 */
public class TransactionDealVO {
    //默认 22000000000 wei
    static BigInteger gasPrice = new BigInteger("22000000000");
    //默认 6700000
    static BigInteger gasLimit = new BigInteger("6700000");
    static BigInteger nonce = null;
    static String data = null;

    /**
     * 普通单节点测试  （普通交易）
     *
     * @param from
     * @param to
     * @param valueStr
     * @return
     */
    public static Transaction getTransaction(String from, String to, String valueStr) {
        BigDecimal valueBig = new BigDecimal(valueStr).multiply(new BigDecimal(CommonConstant.aLong)).setScale(0, RoundingMode.DOWN);
        BigInteger value = valueBig.toBigInteger();
        Transaction tx = new Transaction(from, nonce, gasPrice, gasLimit, to, value, data);
        return tx;
    }

    /**
     * 公共多节点测试（裸交易）
     * <p>
     * getRawTransaction
     */
    public static RawTransaction getRawTransaction(String from, String to, String valueStr) throws IOException {
        BigInteger nonce = getNonce(from);
        //转换单位
        BigInteger value = Convert.toWei(valueStr, Convert.Unit.ETHER).toBigInteger();
        //创建发送对象
        RawTransaction rawTransaction = RawTransaction.createEtherTransaction(
                nonce, gasPrice, gasLimit, to, value);
        return rawTransaction;
    }

    static BigInteger getNonce(String addr) throws IOException {
        return WalletConfig.getWeb3j().ethGetTransactionCount(addr, DefaultBlockParameterName.LATEST)
                .send().getTransactionCount();
    }

    public static TransactionBackVO getTransactionBackVO(String transactionHash, String value) {
        return new TransactionBackVO(transactionHash, value);
    }


}
