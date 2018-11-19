package Web3jNetty.common.util;

import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.regex.Pattern;

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

    /**
     * 去除数组中的空值
     */
    public static String[] removeNullEmpty(String[] arrStr) {
        List<String> arrayStr = Lists.newArrayList();
        for (String arr : arrStr) {
            if (StringUtils.isNotBlank(arr)) {
                arrayStr.add(arr);
            }
        }
        String[] array = new String[arrayStr.size()];
        return arrayStr.toArray(array);
    }

    /**
     * 判断是否是整数或小数（不含负号）
     * <p>
     * true:是
     * false:否
     *
     * @param str
     * @return
     */
    public static boolean isAllNums(String str) {
        if (str == null) {
            return false;
        }
        // -?[0-9]+.?[0-9]*
        String RegEx = "[0-9]+|[0-9]+.[0-9]+";
        Pattern pattern = Pattern.compile(RegEx);
        return pattern.matcher(str).matches();
    }



}
