package Web3jNetty.common.constant;

/**
 * 请求地址常量值
 *
 * @author 卫星
 * @package Web3jNetty.common.constant
 * @date 2018-11-05  15:47
 * @project comwebnetty
 */
public class UrlConstant {
    public  static  String  SLASH_PARTITION="/";
    //admin
    public static String ADMIN = "/admin/";
    //app
    public static String APP = "/app/";
    //openreq
    public static String OPENREQ = "/openreq/";
    //datebirth
    public static String DATEBIRTH = "/datebirth/";


    /**
     * 创建账号：
     */
    public static String CREATE_ACCOUNT_URL = "/openreq/createAccount";

    /**
     * 查询余额
     */
    public static String GET_ALLBALANCE_URL = "/openrep/getAllBalance";

    /**
     * 转账交易
     */
    public static String TRANSFER_BOOK_DEAL = "/openreq/transferDeal";

    /**
     * 查询订单
     */
    public static String DEAL_FLOW_RECORD = "/openreq/dealRecord";

    /**
     * 检测以太坊地址 正确性
     */
    public static String CHECK_ETH_ADDRESS = "/openreq/checkAddress";




}
