package Web3jNetty.common.basics;

import Web3jNetty.common.constant.UrlConstant;
import Web3jNetty.common.response.responseBody;
import Web3jNetty.common.response.responseMsg;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import org.apache.commons.lang.StringUtils;

import java.util.regex.Pattern;

import static io.netty.handler.codec.http.HttpResponseStatus.FOUND;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * http 自定义处理程序
 *
 * @author 卫星
 * @package Web3jNetty.common.basics
 * @date 2018-11-05  13:29
 * @project comwebnetty
 */
public class HttpHandler extends SimpleChannelInboundHandler<FullHttpRequest> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest msg) throws Exception {
        String fullpath = msg.uri();
        String json = responseBody.getResponseSuccess();
        String method = getMethodStr(fullpath, msg, ctx);
        if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.ADMIN)) {

        } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.APP)) {

        } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.OPENREQ)) {

        } else {
            json = responseBody.getResponseFailDefinedDataMsg(new Object(), responseMsg.USELESS_REQUEST);
            writeBufferUtil.writeBuffer(ctx, json);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelReadComplete");
        super.channelReadComplete(ctx);
        ctx.flush(); // 4
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("exceptionCaught");
        if (null != cause) {
            cause.printStackTrace();
        }
        if (null != ctx) {
            ctx.close();
        }
    }

    private static final Pattern INSECURE_URI = Pattern.compile(".*[<>&\"].*");

    private String getMethodStr(String fullpath, FullHttpRequest msg, ChannelHandlerContext ctx) {
        String method = "";
        if (UrlConstant.SLASH_PARTITION.equalsIgnoreCase(fullpath)) {

        }

        return method;
    }

}
