package Web3jNetty.openreq.controller;

import Web3jNetty.common.core.CommonClass;
import Web3jNetty.common.response.ResponseBody;
import Web3jNetty.common.util.StringUtil;
import Web3jNetty.openreq.ReqParamsConstant.ReqConstant;
import Web3jNetty.openreq.service.AccountManageSevice;
import Web3jNetty.openreq.service.impl.AccountManageSeviceImpl;
import org.apache.commons.lang.StringUtils;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;

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
        String jsonStr = ResponseBody.getResponseFailDefinedDataMsg(new Object(),"帐号account未传！");
        String account =(String) params.get(ReqConstant.ACCOUNT);
        if(StringUtils.isNotBlank(account)){
            jsonStr = accountManageSevice.createAccount(params);
        }
        return jsonStr;
    }


}

