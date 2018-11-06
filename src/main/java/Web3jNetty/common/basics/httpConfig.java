package Web3jNetty.common.basics;

import Web3jNetty.common.util.PropertiesUtil;

/**
 * @author 卫星
 * @package Web3jNetty.common.basics
 * @date 2018-11-05  14:00
 * @project comwebnetty
 */
public class httpConfig {

     public static Integer port = Integer.parseInt(PropertiesUtil.readProperties("http.port"));

    //https证书
    public  static String keyStoreFilePath = PropertiesUtil.readProperties("http.ssl.keyStoreFilePath");
    public  static String keyStorePassword =PropertiesUtil.readProperties("http.ssl.keyStorePassword");

}
