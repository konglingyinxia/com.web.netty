package Web3jNetty.datebirth.utilClass;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**称骨算命算法
 *
 * @author luozhuang 大师♂罗莊
 */
public class LuozhuangChenggu {

    int yy[] = {0, 6, 8, 7, 5, 15, 6, 16, 15, 7, 9, 12, 10,
            7, 15, 6, 5, 14, 14, 9, 7, 7, 9, 12, 8,
            7, 13, 5, 14, 5, 9, 17, 5, 7, 12, 8, 8,
            6, 19, 6, 8, 16, 10, 6, 12, 9, 6, 7, 12,
            5, 9, 8, 7, 8, 15, 9, 16, 8, 8, 19, 12};
    int mm[] = {0, 6, 7, 18, 9, 5, 16, 9, 15, 18, 8, 9, 5};
    int dd[] = {0, 5, 10, 8, 15, 16, 15, 8, 16, 8, 16, 19, 17, 8, 17, 10,
            8, 9, 18, 5, 15, 10, 9, 8, 9, 15, 18, 7, 8, 16, 6};
    int hh[] = {0, 0, 6, 7, 10, 9, 16, 10, 8, 8, 9, 6, 6, 16};

    /**
     *
     * @param year 年
     * @param month 月
     * @param day 日
     * @param hour 时
     * @return
     */
    public String Chenggu(int year, int month, int day, int hour) {
        int zong, zong1, zong2, n;
        if (hour % 2 == 0) {
            n = (hour + 2) / 2;
        } else {
            n = (hour + 3) / 2;
        }
        zong = yy[(year - 1821) % 60 + 1] + mm[month] + dd[day] + hh[n];
        zong1 = zong % 10;
        zong2 = zong / 10;

        System.out.print("你的命有" + zong2 + "两" + zong1 + "钱!\n\n");
        return "你的命有" + zong2 + "两" + zong1 + "钱!\n\n";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LuozhuangChenggu my = new LuozhuangChenggu();
        my.Chenggu(1846, 2, 14, 2);
    }
}