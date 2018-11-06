package Web3jNetty.openreq.controller;

/**
 * 请求路径转发
 *
 * @author 卫星
 * @package Web3jNetty.admin.controller
 * @date 2018-11-05  22:20
 * @project comwebnetty
 */
public class OpenreqCommInterface {

    private static OpenreqCommInterface commInterface = new OpenreqCommInterface();

    //根据str字符串调用方法
    public void getMethod(String method) {
        try {
            commInterface.getMethodPrivate(method);
        } catch (NoSuchMethodException nme) {
            nme.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    private void getMethodPrivate(String method) throws Exception {
        commInterface.getClass().getMethod(method, new Class[]{}).invoke(commInterface, new Object[]{});
    }

    public static void main(String[] args) {
        commInterface.getMethod("dfsfh");
    }

}

