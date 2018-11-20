package Web3jNetty.openreq.dao;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.dao
 * @date 2018-11-20  15:11
 * @project com.web.netty
 */
public interface TransferDealManageDao {
    /**
     * 插入交易记录
     *
     * @param transactionHash
     * @param from
     * @param to
     * @param value
     * @return
     */
    Integer insertTransferDeal(String transactionHash, String from, String to, String value);
}
