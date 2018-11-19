package Web3jNetty.openreq.vo;

import Web3jNetty.common.constant.CommonConstant;
import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 币种余额VO
 *
 * @author 卫星
 * @package Web3jNetty.openreq.vo
 * @date 2018-11-16  14:56
 * @project com.web.netty
 */
public class CoinBlanceVO {

    private String EthBlance;

    public void setEthBlance(String ethBlance) {
        if (StringUtils.isNumeric(ethBlance)) {
            BigDecimal decimal = new BigDecimal(ethBlance).divide(new BigDecimal(CommonConstant.aLong), CommonConstant.DECIMAL_PLACE_EIGHT, RoundingMode.DOWN);
            ethBlance = decimal.stripTrailingZeros().toPlainString();
        }
        EthBlance = ethBlance;
    }

    public String getEthBlance() {
        return EthBlance;
    }
}
