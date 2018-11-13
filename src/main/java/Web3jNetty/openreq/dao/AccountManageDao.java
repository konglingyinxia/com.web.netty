package Web3jNetty.openreq.dao;

import Web3jNetty.openreq.domain.AccountVO;

import java.util.Map;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.dao
 * @date 2018-11-13  16:06
 * @project com.web.netty
 */
public interface AccountManageDao {

    void createAccount(AccountVO accountVO, Map<String, Object> params);
}
