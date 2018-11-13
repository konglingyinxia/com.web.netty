package Web3jNetty.common.constant;

/**
 * @author 卫星
 * @package Web3jNetty.common.constant
 * @date 2018-11-13  15:32
 * @project com.web.netty
 */
public enum CoinCodeEnum {
    /**
     * eth币
     */
    ETH(1, "ETH");

    private Integer code;
    private String name;

    CoinCodeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
