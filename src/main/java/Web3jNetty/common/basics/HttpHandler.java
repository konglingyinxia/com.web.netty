package Web3jNetty.common.basics;

import Web3jNetty.common.constant.UrlConstant;
import Web3jNetty.common.response.responseBody;
import Web3jNetty.common.response.responseMsg;
import Web3jNetty.common.util.StringUtil;
import Web3jNetty.openreq.controller.OpenreqCommInterface;
import com.google.common.collect.Lists;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;
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

    private static List<String> httpMethods = Lists.newArrayList(HttpMethod.GET.name(), HttpMethod.POST.name());

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest msg) {
        String fullpath = msg.uri();
        String httpMethod = msg.method().name();
        String json = responseBody.getResponseFailDefinedDataMsg(new Object(), responseMsg.NO_SUPORT_REQ_METHOD);
        if (!httpMethods.contains(httpMethod)) {
            writeBufferUtil.writeBuffer(ctx, json);
            return;
        }
        json = responseBody.getResponseFailDefinedDataMsg(new Object(), responseMsg.USELESS_REQUEST);
        if (StringUtil.isHaveStartStr(Lists.newArrayList(httpConfig.PORT_REQUEST_PATH), fullpath)) {
            String method = getMethodStr(fullpath, msg, ctx);
            if (StringUtils.isNotBlank(method)) {
                Map<String, Object> params;
                try {
                    params = getReqParams(msg, ctx);
                } catch (Exception e) {
                    json = responseBody.getResponseFailDefinedDataMsg(new Object(), responseMsg.REQ_PARAMS_ANALYSIS);
                    writeBufferUtil.writeBuffer(ctx, json);
                    return;
                }
                if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.ADMIN)) {


                } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.APP)) {


                } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.OPENREQ)) {
                    json = OpenreqCommInterface.OpenreqComm(method,params);
                } else if (StringUtils.startsWithIgnoreCase(fullpath, UrlConstant.DATEBIRTH)) {

                }
            }
        } else {

        }
        writeBufferUtil.writeBuffer(ctx, json);
        return;
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
        ctx.flush(); // 4
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        if (null != cause) {
            cause.printStackTrace();
        }
        if (null != ctx) {
            ctx.close();
        }
    }

    private static final Pattern INSECURE_URI = Pattern.compile(".*[<>&\"].*");

    /**
     * 获取请求方法名
     * 去除斜杠 首字母变大写
     *
     * @param fullpath
     * @param msg
     * @param ctx
     * @return
     */
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


    /**
     * 构造请求参数
     *
     * @param msg
     * @param ctx
     * @return
     */
    private Map<String, Object> getReqParams(FullHttpRequest msg, ChannelHandlerContext ctx) throws IOException {
        Map<String, Object> params = new RequestParser(msg).parse();
        return params;
    }

}
