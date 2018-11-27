package Web3jNetty.openreq.dao.impl;

import Web3jNetty.common.dbUtil.JdbcTemplateUtil;
import Web3jNetty.common.exception.CommonException;
import Web3jNetty.openreq.dao.TransferDealManageDao;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.dao.impl
 * @date 2018-11-20  15:12
 * @project com.web.netty
 */
public class TransferDealManageDaoImpl implements TransferDealManageDao {
    /**
     * 交易记录处理
     */
    String insertTransferDealSql = "INSERT INTO \"transfer_deal_record\" ( \"from\", \"to\", \"tx_hash\", \"value\") VALUES (\"%s\", \"%s\", \"%s\",\"%s\")";

    @Override
    public Integer insertTransferDeal(String transactionHash, String from, String to, String value) {
        String insertSql = String.format(insertTransferDealSql, from, to, transactionHash, value);
        //使用编程式事物处理
        JdbcTemplateUtil.transactionTemplate.execute(transactionStatus -> {
            int ints = JdbcTemplateUtil.jdbcTemplate.update(insertSql);
            if (ints <= 0) {
                throw new CommonException("数据插入失败！");
            }
            return 1;
        });
        return 1;
    }
}
