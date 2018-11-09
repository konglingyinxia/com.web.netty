package Web3jNetty.common.core;

import Web3jNetty.common.response.responseBody;
import Web3jNetty.common.response.responseMsg;

import java.util.Map;

/**
 * java 反射机制处理调用方法
 *
 * @author 卫星
 * @package Web3jNetty.common.core
 * @date 2018-11-09  13:21
 * @project com.web.netty
 */
public class commonClass {
    /**
     * @param method 方法名
     * @param object 类名
     * @param params 参数
     * @return
     */
    public static String getMethod(String method, Object object, Map<String, Object> params) {
        String json = responseBody.getResponseFail();
        try {
            json = object.getClass().getMethod(method, new Class[]{Map.class}).invoke(object, new Object[]{params}).toString();
        } catch (NoSuchMethodException nme) {
            nme.printStackTrace();
            json = responseBody.getResponseFailDefinedDataMsg(new Object(), responseMsg.USELESS_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
