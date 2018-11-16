package Web3jNetty.common.walletconfig;

import Web3jNetty.common.util.PropertiesUtil;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.DefaultBlockParameterNumber;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;

/**
 * 钱包配置
 *
 * @author 卫星
 * @package Web3jNetty.common.walletconfig
 * @date 2018-11-12  14:39
 * @project com.web.netty
 */
public class WalletConfig {

    private static Web3j web3j;
    private static String nodes_req;

    static {
        nodes_req = PropertiesUtil.readProperties("eth_nodes_req");
        web3j = Web3j.build(new HttpService(nodes_req));
    }

    public static Web3j getWeb3j() {
        return web3j;
    }

    public static void main(String[] args) throws IOException {

        //String account = web3j.ethAccounts().send().getAccounts().get(0);
        //System.out.println(account);
        EthGetBalance balance = web3j.ethGetBalance("0xa44901bA971a0B9b0f47C2B7da454fE3E90462B4",
                DefaultBlockParameterName.LATEST).send();
        System.out.println( balance.getBalance());
    }

}
