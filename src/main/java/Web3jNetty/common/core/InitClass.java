package Web3jNetty.common.core;


import Web3jNetty.common.dbUtil.JdbcTemplateUtil;

/**
 * @author 卫星
 * @package Web3jNetty.common.core
 * @date 2018-11-07  19:31
 * @project com.web.netty
 */
public class InitClass {

    public static void iniMthod() {
        new JdbcTemplateUtil();
    }
}
