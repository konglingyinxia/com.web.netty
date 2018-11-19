package Web3jNetty.common.walletconfig;

import Web3jNetty.common.util.PropertiesUtil;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.http.HttpService;
import org.web3j.utils.Convert;
import org.web3j.utils.Numeric;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

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

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        //转账交易
        String from = "0xe17bf9bd301148cd3e128a862d3a3997f480e1e1";
        String to = "0x0e9361ecb513327990bd3ba76d534f925c488415";
        BigInteger gasPrice = new BigInteger("22000000000");
        BigInteger gasLimit = new BigInteger("6700000");

        //转换单位
        BigInteger value = Convert.toWei("1", Convert.Unit.ETHER).toBigInteger();
        System.out.println("147400000000000000".length());
        Credentials credentials = Credentials.create("0x09590615d9a0e2c94ae257d92dbaffebe96c0e24cbc1bf2e3bb240e41547e1ed");
        System.out.println("credentials:" + credentials.getAddress());
        BigInteger nonce = getNonce(credentials.getAddress());

        //创建发送对象
        RawTransaction rawTransaction = RawTransaction.createEtherTransaction(
                nonce, gasPrice, gasLimit, to, value);


        byte[] signedMessage = TransactionEncoder.signMessage(rawTransaction, credentials);
        String hexValue = Numeric.toHexString(signedMessage);

        EthSendTransaction ethSendTransaction = web3j.ethSendRawTransaction(hexValue).sendAsync().get();
        String transactionHash = ethSendTransaction.getTransactionHash();
        ethSendTransaction.getError();
        System.out.println(ethSendTransaction.getError().getMessage());

    }

    static BigInteger getNonce(String addr) throws IOException {
        return web3j.ethGetTransactionCount(addr, DefaultBlockParameterName.LATEST)
                .send().getTransactionCount();
    }


}
