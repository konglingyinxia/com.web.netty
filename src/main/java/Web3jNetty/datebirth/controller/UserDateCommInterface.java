package Web3jNetty.datebirth.controller;

import Web3jNetty.common.core.CommonClass;
import Web3jNetty.openreq.controller.OpenreqCommInterface;

import java.util.Map;

/**
 * 用户生日类查询
 *
 * @author 卫星
 * @package Web3jNetty.datebirth.controller
 * @date 2019-01-17  17:37
 * @project com.web.netty
 */
public class UserDateCommInterface extends CommonClass {

    private static UserDateCommInterface userdateinterface = new UserDateCommInterface();
    /**
     * @param method 方法名
     * @param params
     * @return
     */
    public static String OpenreqComm(String method, Map<String, Object> params) {
        return OpenreqCommInterface.getMethod(method, userdateinterface, params);
    }



}
