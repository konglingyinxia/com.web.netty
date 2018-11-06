package Web3jNetty.datebirth.util;
/*
 * 简单的每月国际国内节日显示实现
 *@author luozhuang 大师♂罗莊
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author luozhuang
 */
public class internationalholiday {

    public static String getinternationalholiday(int year, int month, int Chinesemonth) throws ParseException {
        String retunholidaystring = "本月节日<br>";
        if (month == 1) {
            retunholidaystring = retunholidaystring + "1月1日:元旦" + "<br>" + "1月" + Integer.toString(getSunday(year, month, SUNDAY, 1)) + "日:黑人日" + "<br>";
            retunholidaystring = retunholidaystring + "1月" + Integer.toString(getSunday(year, month, SUNDAY, 4)) + "日:世界防治麻风病日" + "<br>";
        }
        if (month == 2) {
            retunholidaystring = retunholidaystring + "2月2日:世界湿地日" + "<br>" + "2月7日:国际声援南非日" + "<br>" + "2月10日:国际气象节" + "<br>" + "2月14日:情人节旦" + "<br>" + "2月15日:中国12亿人口日" + "<br>" + "2月21日:反对殖民制度斗争日" + "<br>" + "2月24日:第三世界青年日" + "<br>" + "2月28日:世界居住条件调查日" + "<br>";
        }
        if (month == 3) {
            retunholidaystring = retunholidaystring + "3月1日:国际海豹日" + "<br>" + "3月3日:全国爱耳日" + "<br>" + "3月5日:中国青年志愿者服务日" + "<br>" + "3月8日:国际妇女节" + "<br>" + "3月12日:中国植树节" + "<br>" + "3月14日:国际警察日" + "<br>" + "3月15日:国际消费者权益日" + "<br>" + "3月17日:国际航海日 中国国医节" + "<br>" + "3月18日:全国科技人才活动日" + "<br>" + "3月21日:世界森林日 消除种族歧视国际日 世界儿歌日 世界睡眠日" + "<br>" + "3月22日:世界水日" + "<br>" + "3月23日:世界气象日" + "<br>" + "3月24日:世界防治结核病日" + "<br>";
            retunholidaystring = retunholidaystring + "3月" + Integer.toString(getSunday(year, month, MONDAY, 4)) + "日:全国中小学生安全教育日" + "<br>";
        }
        if (month == 4) {
            retunholidaystring = retunholidaystring + "4月1日:国际愚人节" + "<br>" + "4月2日:国际儿童图书日" + "<br>" + "<br>" + "4月7日:世界卫生日" + "<br>" + "4月" + Integer.toString(getSunday(year, month, SUNDAY, 4)) + "日:世界儿童日" + "<br>" + "4月21日:全国企业家活动日" + "<br>" + "4月22日:世界地球日 世界法律日" + "<br>" + "4月23日:世界图书和版权日" + "<br>" + "4月24日:世界青年反对殖民主义日 亚非新闻工作者日" + "<br>" + "4月25日:全国预防接种宣传日" + "<br>" + "4月26日:世界知识产权日" + "<br>" + "4月27日:联谊城日" + "<br>" + "4月30日:全国交通安全反思日" + "<br>";
            retunholidaystring = retunholidaystring + "4月" + Integer.toString(getSunday(year, month, WEDNESDAY, 4)) + "日:秘书节" + "<br>";
        }
        if (month == 5) {
            retunholidaystring = retunholidaystring + "5月1日:国际劳动节" + "<br>" + "5月3日:世界哮喘日" + "<br>" + "5月4日:青年节 五四运动纪念日" + "<br>" + "5月5日:全国碘缺乏病防治日" + "<br>" + "5月8日:世界红十字日 世界微笑日" + "<br>" + "5月" + Integer.toString(getSunday(year, month, SUNDAY, 2)) + "日:母亲节 救助贫困母亲日" + "<br>" + "5月12日:国际护士节" + "<br>" + "5月15日:国际家庭日" + "<br>" + "5月16日:全国助残日" + "<br>" + "5月" + Integer.toString(getSunday(year, month, SUNDAY, 3)) + "日:全国助残日" + "<br>" + "5月17日:国际电信日" + "<br>" + "5月18日:国际博物馆日" + "<br>" + "5月20日:全国母乳喂养宣传日" + "<br>" + "5月30日:反对帝国主义运动纪念日" + "<br>" + "5月31日:世界无烟日" + "<br>";
        }
        if (month == 6) {
            retunholidaystring = retunholidaystring + "6月1日:国际儿童节、世界牛奶日" + "<br>" + "6月5日:世界环境日" + "<br>" + "6月6日:全国爱眼日" + "<br>" + "6月11日:中国人口日" + "<br>" + "6月17日:世界防止荒漠化和干旱日" + "<br>" + "6月20日:世界难民日" + "<br>" + "6月22日:中国儿童慈善活动日" + "<br>" + "6月" + Integer.toString(getSunday(year, month, SUNDAY, 3)) + "日:父亲节" + "<br>" + "6月23日:国际奥林匹克日 世界手球日" + "<br>" + "6月25日 全国土地日" + "<br>" + "6月26日:国际禁毒日 国际宪章日" + "<br>" + "6月30日:世界青年联欢节" + "<br>";
        }
        if (month == 7) {
            retunholidaystring = retunholidaystring + "7月1日:党的生日 香港回归纪念 国际建筑日 亚洲‘三十亿人口日’" + "<br>" + "7月2日:国际体育记者日" + "<br>";
            retunholidaystring = retunholidaystring + "7月" + Integer.toString(getSunday(year, month, SATURDAY, 1)) + "日:国际合作节" + "<br>" + "7月7日:中国人民抗日战争纪念日" + "<br>" + "7月11日:世界(50亿)人口日" + "<br>" + "7月26日:世界语(言)创立日" + "<br>" + "7月28日:第一次世界大战爆发" + "<br>" + "7月30日:非洲妇女日" + "<br>";
        }
        if (month == 8) {
            retunholidaystring = retunholidaystring + "8月1日:中国人民解放军建军节" + "<br>" + "8月6日:国际电影节" + "<br>" + "8月8日:中国男子节" + "<br>" + "8月15日:日本正式宣布无条件投降日" + "<br>" + "8月26日:全国律师咨询日" + "<br>";
        }
        if (month == 9) {
            retunholidaystring = retunholidaystring + "9月3日:中国抗日战争胜利纪念日" + "<br>" + "9月8日:国际新闻工作者(团结)日 世界扫盲日" + "<br>" + "9月10日:中国教师节" + "<br>" + "9月14日:世界清洁地球日" + "<br>" + "9月" + Integer.toString(getSunday(year, month, SATURDAY, 3)) + "日:全民国防教育日" + "<br>" + "9月16日:国际臭氧层保护日" + "<br>" + "9月18日:‘九·一八’事变纪念日" + "<br>" + "9月20日:全国爱牙日" + "<br>" + "9月21日:国际和平日" + "<br>" + "9月" + Integer.toString(getSunday(year, month, SUNDAY, 4)) + "日:国际聋人节" + "<br>";
            retunholidaystring = retunholidaystring + "9月" + Integer.toString(getSunday(year, month, SUNDAY, 4)) + "日:世界心脏日 世界海事日" + "<br>" + "9月27日:世界旅游日" + "<br>";
        }
        if (month == 10) {
            retunholidaystring = retunholidaystring + "10月1日:国庆节 国际音乐日 老人节" + "<br>" + "10月2日:国际和平与民主自由斗争日" + "<br>" + "10月" + Integer.toString(getSunday(year, month, MONDAY, 1)) + "日:国际住房日" + "<br>" + "10月4日:世界动物日" + "<br>" + "10月8日:全国高血压日 世界视觉日" + "<br>" + "10月9日:世界邮政日" + "<br>" + "10月10日:辛亥革命纪念日 世界居室卫生日 世界精神卫生日" + "<br>" + "10月13日:中国少年先锋队诞辰日 世界保健日 国际教师节" + "<br>" + "10月14日:世界标准日" + "<br>" + "10月15日:国际盲人节" + "<br>" + "10月16日:世界粮食日" + "<br>" + "10月17日:世界消除贫困日" + "<br>" + "10月22日:世界传统医药日" + "<br>" + "10月24日:联合国日 世界发展信息日" + "<br>" + "10月28日:世界‘男性健康日’" + "<br>" + "10月31日:世界勤俭日" + "<br>";
        }
        if (month == 11) {
            retunholidaystring = retunholidaystring + "11月1日:万圣节" + "<br>" + "11月2日:万灵节" + "<br>" + "11月8日:中国记者节" + "<br>" + "11月9日:中国消防宣传日(消防节)" + "<br>" + "11月10日:世界青年节" + "<br>" + "11月12日:孙中山诞辰" + "<br>" + "11月14日:世界糖尿病日" + "<br>" + "11月17日:国际大学生节 国际学生日" + "<br>" + "11月21日:世界电视日 世界问候日" + "<br>";
            retunholidaystring = retunholidaystring + "11月" + Integer.toString(getSunday(year, month, THURSDAY, 4)) + "日:感恩节" + "<br>";
        }
        if (month == 12) {
            retunholidaystring = retunholidaystring + "12月1日:世界艾滋病日" + "<br>" + "12月2日:废除一切形式奴役世界日" + "<br>" + "12月3日:世界残疾人日" + "<br>" + "12月4日:中国法制宣传日" + "<br>" + "12月5日:国际志愿人员日" + "<br>" + "12月7日:国际民航日" + "<br>" + "12月9日:‘一二·九’运动纪念日 世界足球日" + "<br>" + "12月" + Integer.toString(getSunday(year, month, SUNDAY, 2)) + "日:国际儿童电视广播日" + "<br>" + "12月10日:世界人权日" + "<br>" + "12月11日:世界防治哮喘日" + "<br>" + "12月12日:西安事变纪念日" + "<br>" + "12月13日:南京大屠杀纪念日" + "<br>" + "12月15日:世界强化免疫日" + "<br>" + "12月20日:澳门回归纪念日" + "<br>" + "12月21日:国际篮球日" + "<br>" + "12月25日:圣诞节" + "<br>" + "12月26日:毛泽东诞辰" + "<br>";
        }
        if (Chinesemonth == 1) {
            retunholidaystring = retunholidaystring + "<br>" + "正月初一:春节 弥勒诞" + "<br>" + "正月初六:定光佛诞" + "<br>" + "正月初九:帝释天尊诞" + "<br>" + "正月十五:元宵节" + "<br>";
        }
        if (Chinesemonth == 2) {
            retunholidaystring = retunholidaystring + "<br>" + "二月初二:龙抬头节" + "<br>" + "二月初八:释迦牟尼出家日" + "<br>" + "二月十五:释迦牟尼涅槃" + "<br>" + "二月十九:观音诞" + "<br>" + "二月二十一:普贤诞" + "<br>";
        }
        if (Chinesemonth == 3) {
            retunholidaystring = retunholidaystring + "<br>" + "三月十六:准提诞" + "<br>";
        }
        if (Chinesemonth == 4) {
            retunholidaystring = retunholidaystring + "<br>" + "四月初一:文殊山庙会" + "<br>" + "四月初四:文殊诞" + "<br>" + "四月初八:释迦牟尼诞生日" + "<br>" + "四月二十八:药王诞" + "<br>";
        }
        if (Chinesemonth == 5) {
            retunholidaystring = retunholidaystring + "<br>" + "五月初五:端午节" + "<br>";
        }
        if (Chinesemonth == 6) {
            retunholidaystring = retunholidaystring + "<br>" + "六月初三:韦驮诞" + "<br>" + "六月十九:观音成道" + "<br>";
        }
        if (Chinesemonth == 7) {
            retunholidaystring = retunholidaystring + "<br>" + "七月初七:七夕" + "<br>" + "七月十三:大势至诞" + "<br>" + "七月十五:佛欢喜日" + "<br>" + "七月二十一:普安祖师诞" + "<br>" + "七月二十四:龙树诞" + "<br>" + "七月三十:地藏诞" + "<br>";
        }
        if (Chinesemonth == 8) {
            retunholidaystring = retunholidaystring + "<br>" + "八月十五:中秋节" + "<br>" + "八月二十二:燃灯古佛诞" + "<br>";
        }
        if (Chinesemonth == 9) {
            retunholidaystring = retunholidaystring + "<br>" + "九月初九:重阳节 中国老年节" + "<br>" + "九月十九:观音出家" + "<br>" + "九月三十:药师诞" + "<br>";
        }
        if (Chinesemonth == 10) {
            retunholidaystring = retunholidaystring + "<br>" + "十月初五:达摩诞" + "<br>" + "十月二十五:宗喀巴涅槃" + "<br>";
        }
        if (Chinesemonth == 11) {
            retunholidaystring = retunholidaystring + "<br>" + "十一月十七:阿弥陀佛诞" + "<br>";
        }
        if (Chinesemonth == 12) {
            retunholidaystring = retunholidaystring + "<br>" + "十二月初八:释迦牟尼成道日 腊八节" + "<br>" + "十二月二十九:华严诞" + "<br>" + "十二月三十:除夕" + "<br>";
        }
        return retunholidaystring;
    }

    public static int getSunday(int year, int month, int DayOfWeek, int NumofSunday) throws ParseException {
        return getSunday(Integer.toString(year), Integer.toString(month), DayOfWeek, NumofSunday);
    }

    public final static int SUNDAY = 6;
    public final static int MONDAY = 7;
    public final static int TUESDAY = 1;
    public final static int WEDNESDAY = 2;
    public final static int THURSDAY = 3;
    public final static int FRIDAY = 4;
    public final static int SATURDAY = 5;

    /**
     * 取该年该月第几个星期几
     *
     * @param year        年
     * @param month       月
     * @param DayOfWeek   星期几 用 Calendar.MONDAY此类表示
     * @param NumofSunday 第几个星期几,星期一为7 星期天为4,星期二为1
     * @return 第几个星期几是几号
     * @throws ParseException
     */
    public static int getSunday(String year, String month, int DayOfWeek, int NumofSunday) throws ParseException {

        if (NumofSunday <= 0) {
            return -1;
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;

        date = df.parse(year + "-" + month + "-01"); //开始时间
        Calendar calender = Calendar.getInstance();
        Calendar calenderend = Calendar.getInstance();//结束时间
        calender.setTime(date);
        calender.setFirstDayOfWeek(Calendar.SUNDAY);
        int DAY_OF_MONTH = calender.getActualMaximum(Calendar.DAY_OF_MONTH);

        if (calender.get(Calendar.DAY_OF_WEEK_IN_MONTH) >= NumofSunday && calender.get(Calendar.DAY_OF_WEEK) == DayOfWeek) {
            return calender.get(Calendar.DAY_OF_MONTH);
        }
        for (int i = 0; i <= DAY_OF_MONTH; ++i) {
            calender.add(Calendar.DAY_OF_MONTH, 1);
            if (calender.get(Calendar.DAY_OF_WEEK_IN_MONTH) >= NumofSunday && calender.get(Calendar.DAY_OF_WEEK) == DayOfWeek) {

                return calender.get(Calendar.DATE);
            }

        }
        return -1;
    }

    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        System.out.println(getinternationalholiday(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 7));

    }
}