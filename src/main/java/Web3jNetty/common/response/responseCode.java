package Web3jNetty.common.response;

/**
 * @author 卫星
 * @package Web3jNetty.common.response
 * @date 2018-11-05  19:41
 * @project comwebnetty
 */
public enum responseCode {
    /**
     * 业务异常
     */
    code_1(1),
    /**
     * 正常
     */
    code_0(0),
    /**
     * 其他异常
     */
    code_100(100);
    private int code;

    responseCode(int code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}
