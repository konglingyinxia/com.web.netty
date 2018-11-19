package Web3jNetty.openreq.vo;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.vo
 * @date 2018-11-19  18:02
 * @project com.web.netty
 */
public class TransactionBackVO {
    private String tx_hash;
    private String value;

    public TransactionBackVO(String tx_hash, String value) {
        this.tx_hash = tx_hash;
        this.value = value;
    }

    public String getTx_hash() {
        return tx_hash;
    }

    public void setTx_hash(String tx_hash) {
        this.tx_hash = tx_hash;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}