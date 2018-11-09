package Web3jNetty.common.response;

/**
 * @author 卫星
 * @package Web3jNetty.common.response
 * @date 2018-11-05  19:40
 * @project comwebnetty
 */
public class responseMsg {
    public static String SUCCESS_MSG = "操作成功";
    public static String FAIL_MSG = "操作失败";

    public static String EXCEPTION_100 = "重新请求或登录";

    /**
     * 无效的请求地址
     */
    public static String USELESS_REQUEST = "无效的请求!";

    /**
     * 不支持的请求方式
     */
    public static String NO_SUPORT_REQ_METHOD = "不支持的请求方式";

    /**
     * 参数解析错误
     */
    public static String REQ_PARAMS_ANALYSIS = "参数解析错误";
}
