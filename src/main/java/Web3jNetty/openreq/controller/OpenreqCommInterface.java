package Web3jNetty.openreq.controller;

import Web3jNetty.common.core.CommonClass;
import Web3jNetty.common.exception.CommonException;
import Web3jNetty.common.response.ResponseBody;
import Web3jNetty.common.response.ResponseMsg;
import Web3jNetty.common.util.StringUtil;
import Web3jNetty.openreq.ReqParamsConstant.ReqConstant;
import Web3jNetty.openreq.service.AccountManageSevice;
import Web3jNetty.openreq.service.impl.AccountManageSeviceImpl;
import org.apache.commons.lang.StringUtils;
import org.web3j.crypto.WalletUtils;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * 请求路径转发
 *
 * @author 卫星
 * @package Web3jNetty.admin.controller
 * @date 2018-11-05  22:20
 * @project comwebnetty
 */
public class OpenreqCommInterface extends CommonClass {

    private static OpenreqCommInterface openreqCommInterface = new OpenreqCommInterface();
    private AccountManageSevice accountManageSevice = new AccountManageSeviceImpl();

    /**
     * @param method 方法名
     * @param params
     * @return
     */
    public static String OpenreqComm(String method, Map<String, Object> params) {
        return OpenreqCommInterface.getMethod(method, openreqCommInterface, params);
    }

    /**
     * 创建账号
     *
     * @param params account:帐号
     * @return
     * @throws InvalidAlgorithmParameterException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchProviderException
     */
    public String openreqCreateAccount(Map<String, Object> params) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        String jsonStr = ResponseBody.getResponseFailDefinedDataMsg(new Object(), String.format("帐号%s未传！", ReqConstant.CREATE_ACCOUNT));
        String account = (String) params.get(ReqConstant.CREATE_ACCOUNT);
        if(StringUtils.isNotBlank(account)){
            jsonStr = accountManageSevice.createAccount(params);
        }
        return jsonStr;
    }

    /**
     * 查询账户余额
     */
    public String openreqGetAllBalance(Map<String, Object> params) {
        String address = (String) params.get( ReqConstant.BLANCE_ADDRESS);
        String jsonStr = ResponseBody.getResponseFailDefinedDataMsg(new Object(), String.format("eth地址%s未传！", ReqConstant.BLANCE_ADDRESS));
        if (StringUtils.isNotBlank(address)) {
            jsonStr = accountManageSevice.getAllBalance(address);
        }
        return jsonStr;
    }

    /**
     * 转账交易openreq/transferDeal
     */
    public String openreqTransferDeal(Map<String, Object> params) throws IOException, ExecutionException, InterruptedException {
        String from = (String) params.get(ReqConstant.TRANSACTION_FROM);
        String to = (String) params.get(ReqConstant.TRANSACTION_TO);
        String value = (String) params.get(ReqConstant.TRANSACTION_VALUE);
        String privateKey = (String) params.get(ReqConstant.TRANSACTION_PRIKEY);
        String jsonStr = ResponseBody.getResponseFailDefinedDataMsg(new Object(), String.format("检查以下参数｛%s ,%s,%s,%s｝是否传入！", ReqConstant.TRANSACTION_FROM
                , ReqConstant.TRANSACTION_TO, ReqConstant.TRANSACTION_VALUE, ReqConstant.TRANSACTION_PRIKEY));
        if (StringUtils.isNotBlank(from) && StringUtils.isNotBlank(to) && StringUtils.isNotBlank(value) && StringUtils.isNotBlank(privateKey)) {
            if (!StringUtil.isAllNums(value)) {
                throw new CommonException("参数value应为数字！");
            }
            jsonStr = accountManageSevice.transferDeal(from, to, value, privateKey);
        }
        return jsonStr;
    }

    /**
     * 查询订单交易 /openreq/dealRecord
     */
    public String openreqDealRecord(Map<String, Object> params) {



        return "";

    }

    /**
     * 检测以太坊地址 check_eth_address
     */
    public String openreqCheckAddress(Map<String, Object> params) {
        String checkAddress = (String) params.get(ReqConstant.CHECK_ADDRESS_ISTRUE);
        String jsonStr = ResponseBody.getResponseFailDefinedDataMsg(new Object(), String.format("需检测地址%s未传！", ReqConstant.CHECK_ADDRESS_ISTRUE));
        if (StringUtils.isNotBlank(checkAddress)) {
            jsonStr = ResponseBody.getResponseSuccessDefinedDataMsg(WalletUtils.isValidAddress(checkAddress), ResponseMsg.SUCCESS_MSG);
        }
        return jsonStr;
    }


}

