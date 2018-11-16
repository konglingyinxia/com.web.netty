package Web3jNetty.openreq.vo;

import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Keys;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * @author 卫星
 * @package Web3jNetty.openreq.domain
 * @date 2018-11-13  11:49
 * @project com.web.netty
 */
public class AccountVO {

    String privateKey;
    String publicKey;
    String account;

    public AccountVO() {
        ECKeyPair keyPair = null;
        try {
            keyPair = Keys.createEcKeyPair();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        this.privateKey = keyPair.getPrivateKey().toString(16);
        this.publicKey = keyPair.getPublicKey().toString(16);
        this.account = Keys.getAddress(keyPair);
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
