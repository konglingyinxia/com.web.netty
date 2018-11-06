package Web3jNetty.common.response;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 卫星
 * @package Web3jNetty.common.response
 * @date 2018-11-05  19:40
 * @project comwebnetty
 */
public class responseBody {
    private static String codeStr = "code";//code码
    private static String dataStr = "data";//data数据
    private static String msgStr = "msg";//响应信息

    public static String getResponseBody(Object data, String msg, Integer code) {
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put(codeStr, code);
        jsonMap.put(dataStr, data);
        jsonMap.put(msgStr, msg);
        return JSONObject.toJSONString(jsonMap, SerializerFeature.WriteMapNullValue);
    }

    /**
     * 操作成功
     */
    public static String getResponseSuccess() {
        String successStr = getResponseBody(new Object(), responseMsg.SUCCESS_MSG, responseCode.code_0.getCode());
        return successStr;
    }

    /**
     * 操作失败
     */
    public static String getResponseFail() {
        String failStr = getResponseBody(new Object(), responseMsg.FAIL_MSG, responseCode.code_1.getCode());
        return failStr;
    }

    /**
     * 操作成功自定义信息与返回数据
     */
    public static String getResponseSuccessDefinedDataMsg(Object data, String msg) {
        String successStr = getResponseBody(data, msg, responseCode.code_0.getCode());
        return successStr;
    }

    /**
     * 操作失败自定义信息与返回数据
     */
    public static String getResponseFailDefinedDataMsg(Object data, String msg) {
        String failStr = getResponseBody(data, msg, responseCode.code_1.getCode());
        return failStr;
    }

    /**
     * 100其他异常
     */
    public static String getResponseCode100() {
        String failStr = getResponseBody(null, responseMsg.EXCEPTION_100, responseCode.code_100.getCode());
        return failStr;
    }

    public static void main(String[] args) {
        System.out.println(getResponseCode100());
    }


}
