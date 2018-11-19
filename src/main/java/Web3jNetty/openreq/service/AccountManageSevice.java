package Web3jNetty.openreq.service;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * etf 以太坊帐号管理
 *
 * @author 卫星
 * @package Web3jNetty.openreq.service
 * @date 2018-11-09  16:28
 * @project com.web.netty
 */
public interface AccountManageSevice {

    public String  createAccount(Map<String, Object> params) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException;

    String getAllBalance(String address);

    String transferDeal(String from, String to, String value,String privateKey) throws IOException, ExecutionException, InterruptedException;
}
