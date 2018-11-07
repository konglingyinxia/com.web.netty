package Web3jNetty.common.basics;

import Web3jNetty.common.constant.UrlConstant;
import Web3jNetty.common.util.PropertiesUtil;
import com.google.common.collect.Sets;

import java.util.Set;


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


    //静态文件过滤
    private static final String APP_JS_STATIC = "/static";
    //静态文件过滤
    private static final String STATIC_FAVICON = "/favicon.ico";


    public static final Set<String> WEB_NOT_NEED_LOGIN = Sets.newHashSet();
    public static final Set<String> APP_NOT_NEED_LOGIN = Sets.newHashSet();
    public static final Set<String> NOT_NEED_FILTER_LOGIN = Sets.newHashSet();
    //接口请求路径
    public static final Set<String> PORT_REQUEST_PATH = Sets.newHashSet();

    static {
        NOT_NEED_FILTER_LOGIN.add(APP_JS_STATIC);
        NOT_NEED_FILTER_LOGIN.add(STATIC_FAVICON);

        PORT_REQUEST_PATH.add(UrlConstant.ADMIN);
        PORT_REQUEST_PATH.add(UrlConstant.APP);
        PORT_REQUEST_PATH.add(UrlConstant.DATEBIRTH);
        PORT_REQUEST_PATH.add(UrlConstant.OPENREQ);
    }


}
