package Web3jNetty.common.core;


import Web3jNetty.common.exception.CommonException;
import Web3jNetty.common.response.ResponseBody;
import Web3jNetty.common.response.ResponseMsg;

import java.util.Map;

/**
 * java 反射机制处理调用方法
 *
 * @author 卫星
 * @package Web3jNetty.common.core
 * @date 2018-11-09  13:21
 * @project com.web.netty
 */
public class CommonClass {
    /**
     * @param method 方法名
     * @param object 类名
     * @param params 参数
     * @return
     */
    public static String getMethod(String method, Object object, Map<String, Object> params) {
        String json = ResponseBody.getResponseFail();
        try {
            json = String.valueOf(object.getClass().getMethod(method, new Class[]{Map.class}).invoke(object, new Object[]{params}));
        } catch (NoSuchMethodException nme) {
            nme.printStackTrace();
            json = ResponseBody.getResponseFailDefinedDataMsg(new Object(), ResponseMsg.USELESS_REQUEST);
        } catch (Exception e) {
            //获取反射方法中的异常

            e = (Exception) e.getCause();
            if (!(e instanceof CommonException)) {
                e.printStackTrace();
            }
            json = ResponseBody.getResponseFailDefinedDataMsg(new Object(), e.getMessage());
        }
        return json;
    }
}
