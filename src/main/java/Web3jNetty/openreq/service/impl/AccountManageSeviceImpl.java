package Web3jNetty.openreq.service.impl;

import Web3jNetty.common.constant.CoinCodeEnum;
import Web3jNetty.common.dbUtil.JdbcTemplateUtil;
import Web3jNetty.common.response.ResponseBody;
import Web3jNetty.common.response.ResponseMsg;
import Web3jNetty.common.util.DealDateUtil;
import Web3jNetty.common.walletconfig.WalletConfig;
import Web3jNetty.openreq.ReqParamsConstant.ReqConstant;
import Web3jNetty.openreq.dao.AccountManageDao;
import Web3jNetty.openreq.dao.impl.AccountManageDaoImpl;
import Web3jNetty.openreq.domain.AccountVO;
import Web3jNetty.openreq.service.AccountManageSevice;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Keys;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthAccounts;

import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.service.impl
 * @date 2018-11-09  16:30
 * @project com.web.netty
 */
public class AccountManageSeviceImpl implements AccountManageSevice {

    AccountManageDao  accountManageDao = new AccountManageDaoImpl();

    /**
     * 创建账号
     *
     * @param params
     * @return
     */
    @Override
    public String createAccount(Map<String, Object> params) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        AccountVO accountVO = new AccountVO();
        accountManageDao.createAccount(accountVO,params);
        return ResponseBody.getResponseSuccessDefinedDataMsg(accountVO, ResponseMsg.SUCCESS_MSG);
    }

}
