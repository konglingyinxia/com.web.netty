package Web3jNetty.openreq.controller;

import Web3jNetty.common.core.commonClass;
import Web3jNetty.openreq.service.AccountManageSevice;
import Web3jNetty.openreq.service.impl.AccountManageSeviceImpl;

import java.util.Map;

/**
 * 请求路径转发
 *
 * @author 卫星
 * @package Web3jNetty.admin.controller
 * @date 2018-11-05  22:20
 * @project comwebnetty
 */
public class OpenreqCommInterface extends commonClass {

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

    //创建账号
    public String openreqCreateAccount(Map<String, Object> params) {
        String jsonStr = accountManageSevice.createAccount();
        return jsonStr;
    }

}

