package Web3jNetty.openreq.dao.impl;

import Web3jNetty.common.constant.CoinCodeEnum;
import Web3jNetty.common.dbUtil.JdbcTemplateUtil;
import Web3jNetty.common.util.DealDateUtil;
import Web3jNetty.openreq.ReqParamsConstant.ReqConstant;
import Web3jNetty.openreq.dao.AccountManageDao;
import Web3jNetty.openreq.vo.AccountVO;

import java.util.Date;
import java.util.Map;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.dao.impl
 * @date 2018-11-13  16:06
 * @project com.web.netty
 */

public class AccountManageDaoImpl implements AccountManageDao {


    @Override
    public void createAccount(AccountVO accountVO, Map<String, Object> params) {
        String sql = "INSERT INTO \"user_account\" ( \"username\", \"address\", \"salt\", \"publicKey\", \"code\", \"create_time\") VALUES (\'%s\', '%s', '%s', '%s','%s','%s')";
        String formatSql = String.format(sql, params.get(ReqConstant.CREATE_ACCOUNT), accountVO.getAccount(), accountVO.getPrivateKey(), accountVO.getPublicKey(), CoinCodeEnum.ETH.getName(), DealDateUtil.dateToString(new Date()));
        JdbcTemplateUtil.jdbcTemplate.execute(formatSql);
    }
}
