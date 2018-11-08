package Web3jNetty;

import Web3jNetty.common.basics.HttpHandler;
import Web3jNetty.common.basics.httpConfig;
import Web3jNetty.common.core.InitClass;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpContentCompressor;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;

/**
 * main 处理启动程序
 */
public class httpServerStart {

    private static int ports = httpConfig.port;

    public static void start() throws Exception {
        ServerBootstrap b = new ServerBootstrap();
        NioEventLoopGroup group = new NioEventLoopGroup();
        b.group(group).channel(NioServerSocketChannel.class).childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            public void initChannel(SocketChannel ch) {
                ch.pipeline().addLast("decoder", new HttpRequestDecoder()) // 1解码
                        .addLast("encoder", new HttpResponseEncoder()) // 2编码
                        .addLast("aggregator", new HttpObjectAggregator(512 * 1024)) // 3
                        .addLast(new HttpContentCompressor(1))//压缩4
                        .addLast("handler", new HttpHandler())
                ; // 4
            }
        })
                .option(ChannelOption.SO_BACKLOG, 128) //determining the number of connections queued
                .childOption(ChannelOption.SO_KEEPALIVE, Boolean.TRUE);
        b.bind(ports).sync();
    }


    public static void main(String[] args) throws Exception {
        InitClass.iniMthod();

        //List list = JdbcTemplateUtil.jdbcTemplate.queryForList("select  * from main.user_account");
        //System.out.println(list);
        start();
    }

}
