package Web3jNetty.openreq.service;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;

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
}
