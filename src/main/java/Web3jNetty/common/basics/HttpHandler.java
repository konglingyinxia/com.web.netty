package Web3jNetty.common.basics;

import Web3jNetty.common.constant.UrlConstant;
import Web3jNetty.common.response.responseBody;
import Web3jNetty.common.response.responseMsg;
import Web3jNetty.common.util.StringUtil;
import com.google.common.collect.Lists;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import org.apache.commons.lang.StringUtils;

import java.util.regex.Pattern;

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
        if (StringUtil.isHaveStartStr(Lists.newArrayList(httpConfig.PORT_REQUEST_PATH), fullpath)) {
            String method = getMethodStr(fullpath, msg, ctx);
            if (StringUtils.isNotBlank(method)) {
                if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.ADMIN)) {


                    return;
                } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.APP)) {


                    return;
                } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.OPENREQ)) {


                    return;
                } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.DATEBIRTH)) {


                    return;
                }
            }
        } else {
            json = responseBody.getResponseFailDefinedDataMsg(new Object(), responseMsg.USELESS_REQUEST);
            writeBufferUtil.writeBuffer(ctx, json);
            return;
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
        if (fullpath.contains("?")) {
            fullpath = fullpath.substring(fullpath.indexOf("/", 0), fullpath.indexOf("?", 0));
        }
        String[] fullpats = fullpath.split("/");
        fullpats = StringUtil.removeNullEmpty(fullpats);
        StringBuilder sbu = new StringBuilder();
        int i = 0;
        for (String path : fullpats) {
            if (i > 0) {
                sbu = sbu.append(path.substring(0, 1).toUpperCase() + path.substring(1));
            } else {
                sbu = sbu.append(path);
            }
            i++;
        }
        method = sbu.toString();

        return method;
    }

}
