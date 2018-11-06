package Web3jNetty.common.basics;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslHandler;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import java.io.FileInputStream;
import java.security.KeyStore;

import static Web3jNetty.common.basics.httpConfig.keyStoreFilePath;
import static Web3jNetty.common.basics.httpConfig.keyStorePassword;

/**
 * 构建https请求
 *
 * @author 卫星
 * @package Web3jNetty.common.basics
 * @date 2018-11-05  15:28
 * @project comwebnetty
 */
public class SSLChannelInitializer extends ChannelInitializer<SocketChannel> {
    private final SslContext sslContext;

    public SSLChannelInitializer() {

        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(keyStoreFilePath), keyStorePassword.toCharArray());
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, keyStorePassword.toCharArray());
            sslContext = SslContextBuilder.forServer(keyManagerFactory).build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void initChannel(SocketChannel ch) {
        ChannelPipeline pipeline = ch.pipeline();
        SSLEngine sslEngine = sslContext.newEngine(ch.alloc());
        pipeline.addLast(
                new SslHandler(sslEngine)).
                addLast("decoder", new HttpRequestDecoder()).
                addLast("encoder", new HttpResponseEncoder()).
                addLast("aggregator", new HttpObjectAggregator(512 * 1024)).
                addLast("handler", new HttpHandler());
    }
}

