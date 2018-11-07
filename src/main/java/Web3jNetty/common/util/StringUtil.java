package Web3jNetty.common.util;

import java.util.List;

/**
 * @author 卫星
 * @package Web3jNetty.common.util
 * @date 2018-11-05  17:50
 * @project comwebnetty
 */
public class StringUtil {


    /**
     * 判断集合中是否包含以指定字符串开头的 字符串
     */
    public static Boolean isHaveStartStr(List<String> listStr, String str) {
        for (String s : listStr) {
            if (org.apache.commons.lang.StringUtils.startsWithIgnoreCase(str, s)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }




}
