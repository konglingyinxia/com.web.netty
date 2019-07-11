package Web3jNetty.openreq.vo;

import Web3jNetty.common.walletconfig.WalletConfig;
import org.web3j.crypto.*;

import java.io.File;
import java.io.IOException;

/**
 * @author kongling
 * @package Web3jNetty.openreq.vo
 * @date 2019-07-11  10:30
 * @project com.web.netty
 */
public class MnemonicAccountVO {
    /**
     * 助记词
     */
    String mnemonic;

    /**
     * 钱包地址
     */
    String account;

    /**
     * 文件名字
     */
    String fileName;

    public MnemonicAccountVO() {
    }

    public MnemonicAccountVO(String pwd) {
        try {
            Bip39Wallet wallet = WalletUtils.generateBip39Wallet(pwd,new File(WalletConfig.walletFile) );
           this.mnemonic = wallet.getMnemonic();
           this.fileName = wallet.getFilename();
           this.account=WalletUtils.loadBip39Credentials(pwd,wallet.getMnemonic()).getAddress();
        } catch (CipherException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
