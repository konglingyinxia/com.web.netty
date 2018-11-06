/*
package Web3jNetty.datebirth.utilClass;
*/
/*
 * 简单的看日子吉凶星实现
 *@author luozhuang 大师♂罗莊
 *//*

import java.text.ParseException;
import luozhuanghehun.BaiziRecord;

public class Luozhuangjixiong {

    public static boolean ishuoyao;
    public static boolean isxiesheng;
    public static boolean isyihou;
    public static boolean isyaoan;
    public static boolean isyima;
    public static boolean isliuhe;
    public static boolean isdahongsha;
    public static boolean istianrui;
    public static boolean isshuidei;
    public static boolean iswuhe;
    public static boolean istiangang;
    public static boolean istianli;
    public static boolean istianwen;
    public static boolean istianyue;
    public static boolean istiandizhuansha;
    public static boolean isshousi;
    public static boolean issiqi;
    public static boolean isyuepo;
    public static boolean iszhengsifei;
    public static boolean ispangsifei;
    public static boolean isdahao;
    public static boolean isxiaohao;
    public static boolean isbaihu;
    public static boolean isxuanwu;
    public static boolean isgoucheng;
    public static boolean isbima;
    public static String jiristring="";
    public static boolean isshenge;
    public static boolean isrenge;
    public static boolean iszhuque;
    public static boolean islubansha;
    public static boolean isfutousha;
    public static boolean ismumasha;
    public static boolean iswankansha;
    public static boolean isyangbai;
    public static boolean isleigong;
    public static boolean iswuxu;
    public static boolean iskuyu;
    public static boolean isbazuo;
    public static boolean isxueji;
    public static boolean ischongfu;
    public static boolean istuji;
    public static boolean issishidamu;
    public static boolean islingri;
    public static boolean ishekui;
    public static boolean iswugui;
    public static boolean isgoujiao;
    public static boolean isdangliang;
    public static boolean isbingxiaowajie;
    public static boolean isfeilian;
    public static boolean iswangwang;
    public static boolean isjiukong;
    public static boolean iscongshang;
    public static boolean istufu;
    public static boolean istuwen;
    public static boolean ismufusha;
    public static boolean ismushuisha;
    public static boolean iskuigai;
    public static boolean ispoqunri;
    public static boolean istiangou;
    public static boolean istianhuo;
    public static boolean isdihuo;
    public static boolean isyuehuo;
    public static boolean isyueyan;
    public static boolean isyuesha;
    public static boolean ishuangchu;
    public static boolean isxiaohongsha;
    public static boolean ishuangsha;
    public static boolean isliubucheng;
    public static String badrizi="";
    public static boolean isyuehai;
    public static boolean istianzei;
    public static boolean istianderi;
    public static boolean isyuede;
    public static boolean istiandehe;
    public static boolean isyuedehe;
    public static boolean istianxi;
    public static boolean istiancheng;
    public static boolean istianguan;
    public static boolean istianyi;
    public static boolean istianma;
    public static boolean istiancai;
    public static boolean isyuekong;
    public static boolean isshengqi;
    public static boolean istianen;
    public static boolean isshenzai;
    public static boolean istianfu;
    public static boolean istiandui;
    public static boolean istianshe;
    public static boolean isyuecai;
    public static boolean isyueen;
    public static boolean ismucang;
    public static boolean isshengxing;
    public static boolean iswufu;
    public static boolean isfuhou;
    public static boolean isyingde;


    */
/**
     *
     * @param intChinesemonth 农历月份数字
     * @param baizi 八字数组
     *//*

    public static void panduan(int intChinesemonth, String baizi[]) {

        if ((tianderi(intChinesemonth, baizi[5])) || tianderi(intChinesemonth, baizi[6])) {
            jiristring += "天德 ";
            istianderi = true;
        }
        if (yuede(intChinesemonth, baizi[5])) {
            jiristring += "月德 ";
            isyuede = true;
        }
        if ((tiandehe(intChinesemonth, baizi[5]))) {
            jiristring += "天德合 ";
            istiandehe = true;
        }
        if (yuedehe(intChinesemonth, baizi[5])) {
            jiristring += "月德合 ";
            isyuedehe = true;
        }
        if (tianxi(intChinesemonth, baizi[6])) {
            jiristring += "天喜 ";
            istianxi = true;
        }
        if (tiancheng(intChinesemonth, baizi[6])) {
            jiristring += "天成 ";
            istiancheng = true;
        }
        if (tianguan(intChinesemonth, baizi[6])) {
            jiristring += "天官 ";
            istianguan = true;
        }
        if (tianyi(intChinesemonth, baizi[6])) {
            jiristring += "天医 ";
            istianyi = true;
        }
        if (tianma(intChinesemonth, baizi[6])) {
            jiristring += "天马 ";
            istianma = true;
        }
        if (tiancai(intChinesemonth, baizi[6])) {
            jiristring += "天财 ";
            istiancai = true;
        }
        if (yuekong(baizi[4], baizi[5])) {
            jiristring += "月空 ";
            isyuekong = true;
        }
        if (shengqi(intChinesemonth, baizi[6])) {
            jiristring += "生气 ";
            isshengqi = true;
        }
        if (tianen(baizi[5] + baizi[6])) {
            jiristring += "天恩 ";
            istianen = true;
        }
        if (shenzai(baizi[5] + baizi[6])) {
            jiristring += "神在 ";
            isshenzai = true;
        }
        if (tianfu(intChinesemonth, baizi[6])) {
            jiristring += "天富 ";
            istianfu = true;
        }
        if (tiandui(baizi[4], baizi[5])) {
            jiristring += "天贵 ";
            istiandui = true;
        }
        if (tianshe(baizi[4], baizi[5] + baizi[6])) {
            jiristring += "天赦 ";
            istianshe = true;
        }
        if (yuecai(intChinesemonth, baizi[6])) {
            jiristring += "月财 ";
            isyuecai = true;
        }
        if (yueen(intChinesemonth, baizi[5])) {
            jiristring += "月恩 ";
            isyueen = true;
        }
        if (mucang(baizi[4], baizi[6])) {
            jiristring += "母仓 ";
            ismucang = true;
        }
        if (shengxing(intChinesemonth, baizi[6])) {
            jiristring += "圣心 ";
            isshengxing = true;
        }
        if (wufu(intChinesemonth, baizi[6])) {
            jiristring += "五富 ";
            iswufu = true;
        }
        if (fuhou(baizi[4], baizi[6])) {
            jiristring += "福厚 ";
            isfuhou = true;
        }
        if (yingde(intChinesemonth, baizi[6])) {
            jiristring += "阴德 ";
            isyingde = true;
        }
        if (huoyao(intChinesemonth, baizi[6])) {
            jiristring += "活曜 ";
            ishuoyao = true;
        }
        if (xiesheng(intChinesemonth, baizi[6])) {
            jiristring += "解神 ";
            isxiesheng = true;
        }
        if (yihou(intChinesemonth, baizi[6])) {
            jiristring += "益后 ";
            isyihou = true;
        }
        if (yaoan(intChinesemonth, baizi[6])) {
            jiristring += "要安 ";
            isyaoan = true;
        }
        if (yima(intChinesemonth, baizi[6])) {
            jiristring += "驿马 ";
            isyima = true;
        }
        if (liuhe(baizi[4], baizi[6])) {
            jiristring += "六合 ";
            isliuhe = true;
        }
        if (dahongsha(baizi[4], baizi[6], baizi[5] + baizi[6])) {
            jiristring += "大红砂 ";
            isdahongsha = true;
        }
        if (tianrui(baizi[5] + baizi[6])) {
            jiristring += "天瑞 ";
            istianrui = true;
        }
        if (shuidei(baizi[1], baizi[5])) {
            jiristring += "岁德 ";
            isshuidei = true;
        }
        if (wuhe(baizi[3] + baizi[4], baizi[5] + baizi[6])) {
            jiristring += "五合 ";
            iswuhe = true;
        }
        if (wangri(baizi[5] + baizi[6])) {
            jiristring += "旺日 ";
        }
        if (xiangri(baizi[4], baizi[6])) {
            jiristring += "相日 ";
        }
        if (shagong(intChinesemonth, baizi[5] + baizi[6])) {
            jiristring += "煞贡 ";
        }
        if (zhixing(intChinesemonth, baizi[5] + baizi[6])) {
            jiristring += "直星 ";
        }
        if (renzhuan(intChinesemonth, baizi[5] + baizi[6])) {
            jiristring += "人专 ";
        }
        if (tiangang(intChinesemonth, baizi[6])) {
            badrizi += "天罡 ";
            istiangang = true;
        }
        if (tianli(intChinesemonth, baizi[6])) {
            badrizi += "天吏 ";
            istianli = true;
        }
        if (tianwen(intChinesemonth, baizi[6])) {
            badrizi += "天瘟 ";
            istianwen = true;
        }
        if (tianyue(intChinesemonth, baizi[6])) {
            badrizi += "天狱 ";
            istianyue = true;
        }
        if (tiandizhuansha(baizi[4], baizi[5] + baizi[6])) {
            badrizi += "天地转煞 ";
            istiandizhuansha = true;
        }
        if (shousi(intChinesemonth, baizi[6])) {
            badrizi += "受死 ";
            isshousi = true;
        }
        if (siqi(intChinesemonth, baizi[6])) {
            badrizi += "死气 ";
            issiqi = true;
        }
        if (yuepo(baizi[4], baizi[6])) {
            badrizi += "月破 ";
            isyuepo = true;
        }
        if (zhengsifei(baizi[4], baizi[5] + baizi[6])) {
            badrizi += "正四废 ";
            iszhengsifei = true;
        }
        if (pangsifei(baizi[4], baizi[5])) {
            badrizi += "傍四废 ";
            ispangsifei = true;
        }
        if (dahao(intChinesemonth, baizi[6])) {
            badrizi += "大耗 ";
            isdahao = true;
        }
        if (xiaohao(intChinesemonth, baizi[6])) {
            badrizi += "小耗 ";
            isxiaohao = true;
        }
        if (baihu(intChinesemonth, baizi[6])) {
            badrizi += "白虎 ";
            isbaihu = true;
        }
        if (xuanwu(intChinesemonth, baizi[6])) {
            badrizi += "玄武 ";
            isxuanwu = true;
        }
        if (goucheng(intChinesemonth, baizi[6])) {
            badrizi += "勾陈 ";
            isgoucheng = true;
        }
        if (bima(intChinesemonth, baizi[6])) {
            badrizi += "披麻 ";
            isbima = true;
        }
        if (wugui(intChinesemonth, baizi[6])) {
            badrizi += "五鬼 ";
            iswugui = true;
        }
        if (goujiao(baizi[4], baizi[6])) {
            badrizi += "勾绞 ";
            isgoujiao = true;
        }
        if (dangliang(baizi[4], baizi[6])) {
            badrizi += "当梁 ";
            isdangliang = true;
        }
        if (bingxiaowajie(intChinesemonth, baizi[6])) {
            badrizi += "冰消瓦解 ";
            isbingxiaowajie = true;
        }
        if (feilian(intChinesemonth, baizi[6])) {
            badrizi += "飞廉 ";
            isfeilian = true;
        }
        if (wangwang(intChinesemonth, baizi[6])) {
            badrizi += "往亡 ";
            iswangwang = true;
        }
        if (jiukong(intChinesemonth, baizi[6])) {
            badrizi += "九空 ";
            isjiukong = true;
        }
        if (congshang(intChinesemonth, baizi[5])) {
            badrizi += "重丧 ";
            iscongshang = true;
        }
        if (tufu(intChinesemonth, baizi[6])) {
            badrizi += "土府 ";
            istufu = true;
        }
        if (tuwen(intChinesemonth, baizi[6])) {
            badrizi += "土瘟 ";
            istuwen = true;
        }
        if (mufusha(intChinesemonth, baizi[5], baizi[5] + baizi[6], baizi[6])) {
            badrizi += "木呼煞 ";
            ismufusha = true;
        }
        if (mushuisha(intChinesemonth, baizi[6])) {
            badrizi += "木髓煞 ";
            ismushuisha = true;
        }
        if (kuigai(baizi[5] + baizi[6])) {
            badrizi += "魁罡 ";
            iskuigai = true;
        }
        if (poqunri(baizi[5] + baizi[6])) {
            badrizi += "破群日 ";
            ispoqunri = true;
        }
        if (tiangou(intChinesemonth, baizi[6])) {
            badrizi += "天狗 ";
            istiangou = true;
        }
        if (tianhuo(intChinesemonth, baizi[6])) {
            badrizi += "天火 ";
            istianhuo = true;
        }
        if (dihuo(intChinesemonth, baizi[6])) {
            badrizi += "地火 ";
            isdihuo = true;
        }
        if (yuehuo(intChinesemonth, baizi[6])) {
            badrizi += "月火 ";
            isyuehuo = true;
        }
        if (yueyan(intChinesemonth, baizi[6])) {
            badrizi += "月厌 ";
            isyueyan = true;
        }
        if (yuesha(intChinesemonth, baizi[6])) {
            badrizi += "月杀 ";
            isyuesha = true;
        }
        if (huangchu(baizi[4], baizi[6])) {
            badrizi += "荒鞠 ";
            ishuangchu = true;
        }
        if (xiaohongsha(intChinesemonth, baizi[6])) {
            badrizi += "小红沙 ";
            isxiaohongsha = true;
        }
        if (huangsha(intChinesemonth, baizi[6])) {
            badrizi += "黄沙 ";
            ishuangsha = true;
        }
        if (liubucheng(intChinesemonth, baizi[6])) {
            badrizi += "六不成 ";
            isliubucheng = true;
        }
        if (shengge(intChinesemonth, baizi[6])) {
            badrizi += "神隔 ";
            isshenge = true;
        }
        if (renge(intChinesemonth, baizi[6])) {
            badrizi += "人隔 ";
            isrenge = true;
        }
        if (zhuque(intChinesemonth, baizi[6])) {
            badrizi += "朱雀 ";
            iszhuque = true;
        }
        if (lubansha(baizi[4], baizi[6])) {
            badrizi += "鲁班杀 ";
            islubansha = true;
        }
        if (futousha(baizi[4], baizi[6])) {
            badrizi += "斧头杀 ";
            isfutousha = true;
        }
        if (mumasha(intChinesemonth, baizi[6])) {
            badrizi += "木马杀 ";
            ismumasha = true;
        }
        if (wankansha(baizi[4], baizi[6])) {
            badrizi += "万砍杀 ";
            iswankansha = true;
        }
        if (yangbai(intChinesemonth, baizi[6])) {
            badrizi += "殃败 ";
            isyangbai = true;
        }
        if (leigong(intChinesemonth, baizi[6])) {
            badrizi += "雷公 ";
            isleigong = true;
        }
        if (wuxu(baizi[4], baizi[6])) {
            badrizi += "五虚 ";
            iswuxu = true;
        }
        if (kuyu(intChinesemonth, baizi[6])) {
            badrizi += "枯鱼 ";
            iskuyu = true;
        }
        if (bazuo(intChinesemonth, baizi[6])) {
            badrizi += "八座 ";
            isbazuo = true;
        }
        if (xueji(intChinesemonth, baizi[6])) {
            badrizi += "血忌 ";
            isxueji = true;
        }
        if (chongfu(intChinesemonth, baizi[5])) {
            badrizi += "重复 ";
            ischongfu = true;
        }
        if (tuji(baizi[4], baizi[6])) {
            badrizi += "土禁 ";
            istuji = true;
        }
        if (sishidamu(baizi[4], baizi[5] + baizi[6])) {
            badrizi += "四时大墓 ";
            issishidamu = true;
        }
        if (lingri(intChinesemonth, baizi[6])) {
            badrizi += "临日 ";
            islingri = true;
        }
        if (hekui(intChinesemonth, baizi[6])) {
            badrizi += "河魁 ";
            ishekui = true;
        }

        if (yuehai(baizi[4], baizi[6])) {
            badrizi += "月害 ";
            isyuehai = true;
        }
        if (tianzei(intChinesemonth, baizi[6])) {
            badrizi += "天贼日 ";
            istianzei = true;
        }
        if (baihurugong(baizi[5] + baizi[6])) {
            badrizi += "白虎入中宫 ";
        }
        if (guiku(baizi[6])) {
            badrizi += "鬼哭日 ";
        }
    }


    */
/**
     * 天吏
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianli(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 5) && (ChinesemonthInt != 9)) || ((rizhiString.equals("酉")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 6) && (ChinesemonthInt != 10)) || ((rizhiString.equals("卯")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 7) && (ChinesemonthInt != 11)) || ((rizhiString.equals("午")) || (((ChinesemonthInt == 4) || (ChinesemonthInt == 8) || (ChinesemonthInt == 12)) && (rizhiString.equals("子"))))))));
    }

    */
/**
     * 天瘟
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianwen(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("卯")));
    }

    */
/**
     * 天狱
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianyue(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 5) && (ChinesemonthInt != 9)) || ((rizhiString.equals("子")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 6) && (ChinesemonthInt != 10)) || ((rizhiString.equals("午")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 7) && (ChinesemonthInt != 11)) || ((rizhiString.equals("卯")) || (((ChinesemonthInt == 4) || (ChinesemonthInt == 8) || (ChinesemonthInt == 12)) && (rizhiString.equals("酉"))))))));
    }

    */
/**
     * 受死
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean shousi(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("酉")));
    }

    */
/**
     * 死气
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean siqi(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("巳")));
    }

    */
/**
     * 大耗
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean dahao(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("巳")));
    }

    */
/**
     * 小耗
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean xiaohao(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 2) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 1) && (rizhiString.equals("巳")));
    }

    */
/**
     * 白虎
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean baihu(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 7)) || ((rizhiString.equals("午")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 8)) || ((rizhiString.equals("申")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 9)) || ((rizhiString.equals("戌")) || (((ChinesemonthInt != 4) && (ChinesemonthInt != 10)) || ((rizhiString.equals("子")) || (((ChinesemonthInt != 5) && (ChinesemonthInt != 11)) || ((rizhiString.equals("寅")) || (((ChinesemonthInt == 6) || (ChinesemonthInt == 12)) && (rizhiString.equals("辰"))))))))))));
    }

    */
/**
     * 玄武
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean xuanwu(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 7)) || ((rizhiString.equals("酉")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 8)) || ((rizhiString.equals("亥")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 9)) || ((rizhiString.equals("丑")) || (((ChinesemonthInt != 4) && (ChinesemonthInt != 10)) || ((rizhiString.equals("卯")) || (((ChinesemonthInt != 5) && (ChinesemonthInt != 11)) || ((rizhiString.equals("巳")) || (((ChinesemonthInt == 6) || (ChinesemonthInt == 12)) && (rizhiString.equals("未"))))))))))));
    }

    */
/**
     * 勾陈
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean goucheng(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 7)) || ((rizhiString.equals("亥")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 8)) || ((rizhiString.equals("丑")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 9)) || ((rizhiString.equals("卯")) || (((ChinesemonthInt != 4) && (ChinesemonthInt != 10)) || ((rizhiString.equals("巳")) || (((ChinesemonthInt != 5) && (ChinesemonthInt != 11)) || ((rizhiString.equals("未")) || (((ChinesemonthInt == 6) || (ChinesemonthInt == 12)) && (rizhiString.equals("酉"))))))))))));
    }

    */
/**
     * 披麻
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean bima(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 5) && (ChinesemonthInt != 9)) || ((rizhiString.equals("子")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 6) && (ChinesemonthInt != 10)) || ((rizhiString.equals("酉")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 7) && (ChinesemonthInt != 11)) || ((rizhiString.equals("午")) || (((ChinesemonthInt == 4) || (ChinesemonthInt == 8) || (ChinesemonthInt == 12)) && (rizhiString.equals("卯"))))))));
    }

    */
/**
     * 五鬼
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean wugui(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("戌")));
    }

    */
/**
     * 冰消瓦解
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean bingxiaowajie(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("辰")));
    }

    */
/**
     * 飞廉
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean feilian(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("酉")));
    }

    */
/**
     * 往亡
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean wangwang(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("丑")));
    }

    */
/**
     * 九空
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean jiukong(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("巳")));
    }

    */
/**
     * 重丧
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean congshang(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("甲"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("乙"))) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 6) && (ChinesemonthInt != 9) && (ChinesemonthInt != 12)) || ((rizhiString.equals("己")) || ((ChinesemonthInt == 4) && (rizhiString.equals("丙"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("丁"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("庚"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("辛"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("壬"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("癸")))));
    }

    */
/**
     * 土府
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tufu(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("丑")));
    }

    */
/**
     * 土瘟
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tuwen(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("卯")));
    }

    */
/**
     * 木髓煞
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean mushuisha(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && ((rizhiString.equals("申")) || (rizhiString.equals("辰")))) || ((ChinesemonthInt == 2) && ((rizhiString.equals("寅")) || (rizhiString.equals("子")))) || ((ChinesemonthInt == 3) && ((rizhiString.equals("申")) || (rizhiString.equals("戌")))) || ((ChinesemonthInt == 4) && ((rizhiString.equals("申")) || (rizhiString.equals("卯")))) || ((ChinesemonthInt == 5) && ((rizhiString.equals("午")) || (rizhiString.equals("酉")))) || ((ChinesemonthInt == 6) && ((rizhiString.equals("申")) || (rizhiString.equals("辰")))) || ((ChinesemonthInt == 7) && ((rizhiString.equals("巳")) || (rizhiString.equals("酉")))) || ((ChinesemonthInt == 8) && ((rizhiString.equals("丑")) || (rizhiString.equals("酉")))) || ((ChinesemonthInt == 9) && ((rizhiString.equals("寅")) || (rizhiString.equals("亥")))) || ((ChinesemonthInt == 10) && ((rizhiString.equals("卯")) || (rizhiString.equals("亥")))) || ((ChinesemonthInt == 11) && ((rizhiString.equals("午")) || (rizhiString.equals("酉")))) || ((ChinesemonthInt == 12) && (rizhiString.equals("未")));
    }

    */
/**
     * 天狗
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tiangou(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("卯")));
    }

    */
/**
     * 天火
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianhuo(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("酉")));
    }

    */
/**
     * 地火
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean dihuo(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 月火
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yuehuo(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("午")));
    }

    */
/**
     * 月厌
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yueyan(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 月杀
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yuesha(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("辰")));
    }


    */
/**
     * 天德日：正丁二坤申，三壬四辛同，五乾亥六甲，七癸八艮寅，九丙十月乙，十一月巽巳，十二月庚。
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianderi(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("丁"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("壬"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("辛"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("甲"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("癸"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丙"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("乙"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("庚")));
    }

    */
/**
     * 木呼煞
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @param rizhiString 日支字符串3
     * @return
     *//*

    public static boolean mufusha(int ChinesemonthInt, String rizhiString1, String rizhiString2, String rizhiString3) {
        return ((ChinesemonthInt == 1) && (rizhiString2.equals("壬申"))) || ((ChinesemonthInt == 2) && (rizhiString2.equals("庚子"))) || ((ChinesemonthInt == 3) && ((rizhiString2.equals("戊辰")) || (rizhiString2.equals("戊申")))) || ((ChinesemonthInt == 4) && ((rizhiString3.equals("戌")) || (rizhiString1.equals("丙")))) || ((ChinesemonthInt == 5) && (rizhiString2.equals("丁亥"))) || ((ChinesemonthInt == 6) && ((rizhiString2.equals("己未")) || (rizhiString2.equals("己卯")))) || ((ChinesemonthInt == 7) && ((rizhiString2.equals("乙未")) || (rizhiString2.equals("庚申")))) || ((ChinesemonthInt == 8) && (rizhiString1.equals("辛"))) || ((ChinesemonthInt == 9) && (rizhiString2.equals("壬戌"))) || ((ChinesemonthInt == 10) && (rizhiString2.equals("丁巳"))) || ((ChinesemonthInt == 11) && ((rizhiString2.equals("癸未")) || (rizhiString2.equals("己酉")))) || ((ChinesemonthInt == 12) && ((rizhiString2.equals("乙丑")) || (rizhiString2.equals("己丑"))));
    }

    */
/**
     * 天恩
     *
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianen(String rizhiString) {
        return (rizhiString.equals("甲子")) || (rizhiString.equals("乙丑")) || (rizhiString.equals("丙寅")) || (rizhiString.equals("丁卯")) || (rizhiString.equals("戊辰")) || (rizhiString.equals("己卯")) || (rizhiString.equals("庚辰")) || (rizhiString.equals("辛巳")) || (rizhiString.equals("壬午")) || (rizhiString.equals("癸未")) || (rizhiString.equals("己酉")) || (rizhiString.equals("庚戌")) || (rizhiString.equals("辛亥")) || (rizhiString.equals("壬子")) || (rizhiString.equals("癸丑"));
    }

    public static boolean a(String rizhiString, int ChinesemonthInt) {
        return (rizhiString.equals("酉")) || (rizhiString.equals("申")) || (ChinesemonthInt == 7) || (ChinesemonthInt == 8);
    }

    */
/**
     * 月空
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean yuekong(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("子")) && (!rizhiString1.equals("辰")) && (!rizhiString1.equals("申"))) || ((rizhiString2.equals("壬")) || (((!rizhiString1.equals("丑")) && (!rizhiString1.equals("巳")) && (!rizhiString1.equals("酉"))) || ((rizhiString2.equals("庚")) || (((!rizhiString1.equals("寅")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("丙")) || (((rizhiString1.equals("卯")) || (rizhiString1.equals("未")) || (rizhiString1.equals("亥"))) && (rizhiString2.equals("甲"))))))));
    }

    */
/**
     * 大红砂
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @param rizhiString 日支字符串3
     * @return
     *//*

    public static boolean dahongsha(String rizhiString1, String rizhiString2, String rizhiString3) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString3.equals("戊子")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("辰")) || (rizhiString2.equals("巳")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("午")) || (rizhiString2.equals("未")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && (rizhiString3.equals("甲戌"))))))));
    }

    */
/**
     *
     * 一、何为红砂日 每年正、四、七、十月的巳日，二、五、八、冬月的酉日，三、六、九、腊月的丑日即为红砂日。或曰： 四孟之月，巳日为红砂；
     * 四仲之月，酉日为红砂； 四季之月，丑日为红砂。 或曰： 四长生之月，巳日为红砂； 四帝旺之月，酉日为红砂； 四墓库之月，丑日为红砂。
     *
     * @param ChinesemonthInt 农历月份数字 农历月份数字
     * @param rizhiString 日支字符串 日支
     * @return
     *//*

    public static boolean xiaohongsha(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("丑")));
    }

    */
/**
     * 黄沙
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean huangsha(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("子")));
    }

    */
/**
     * 六不成
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean liubucheng(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("丑")));
    }

    */
/**
     * 神隔
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean shengge(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("未")));
    }

    */
/**
     * 人隔
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean renge(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 朱雀
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean zhuque(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("丑")));
    }

    */
/**
     * 木马杀
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean mumasha(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("午")));
    }

    */
/**
     * 殃败
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yangbai(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("辰")));
    }

    */
/**
     * 雷公
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean leigong(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("申")));
    }

    */
/**
     * 枯鱼
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean kuyu(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("巳")));
    }

    */
/**
     * 八座
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean bazuo(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("戌")));
    }

    */
/**
     * 血忌
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean xueji(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("子")));
    }

    */
/**
     * 重复
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean chongfu(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("庚"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("辛"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("己"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("壬"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("癸"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戊"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("甲"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("乙"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("己"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("壬"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("癸"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("己")));
    }

    */
/**
     * 临日
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean lingri(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("辰")));
    }

    */
/**
     * 河魁
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean hekui(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("辰")));
    }

    */
/**
     * 天贼日
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianzei(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    public static boolean b(int ChinesemonthInt1, int ChinesemonthInt2) {
        return ((ChinesemonthInt1 == 1) && ((ChinesemonthInt2 == 6) || (ChinesemonthInt2 == 14) || (ChinesemonthInt2 == 22) || (ChinesemonthInt2 == 30) || (ChinesemonthInt2 == 2) || (ChinesemonthInt2 == 10) || (ChinesemonthInt2 == 18) || (ChinesemonthInt2 == 26))) || ((ChinesemonthInt1 == 2) && ((ChinesemonthInt2 == 5) || (ChinesemonthInt2 == 13) || (ChinesemonthInt2 == 21) || (ChinesemonthInt2 == 29) || (ChinesemonthInt2 == 1) || (ChinesemonthInt2 == 9) || (ChinesemonthInt2 == 17) || (ChinesemonthInt2 == 25))) || ((ChinesemonthInt1 == 3) && ((ChinesemonthInt2 == 4) || (ChinesemonthInt2 == 12) || (ChinesemonthInt2 == 20) || (ChinesemonthInt2 == 30) || (ChinesemonthInt2 == 8) || (ChinesemonthInt2 == 16) || (ChinesemonthInt2 == 24))) || ((ChinesemonthInt1 == 4) && ((ChinesemonthInt2 == 3) || (ChinesemonthInt2 == 11) || (ChinesemonthInt2 == 19) || (ChinesemonthInt2 == 27) || (ChinesemonthInt2 == 7) || (ChinesemonthInt2 == 15) || (ChinesemonthInt2 == 23) || (ChinesemonthInt2 == 30))) || ((ChinesemonthInt1 == 5) && ((ChinesemonthInt2 == 2) || (ChinesemonthInt2 == 10) || (ChinesemonthInt2 == 18) || (ChinesemonthInt2 == 26) || (ChinesemonthInt2 == 6) || (ChinesemonthInt2 == 14) || (ChinesemonthInt2 == 22) || (ChinesemonthInt2 == 29))) || ((ChinesemonthInt1 == 6) && ((ChinesemonthInt2 == 1) || (ChinesemonthInt2 == 17) || (ChinesemonthInt2 == 25) || (ChinesemonthInt2 == 29) || (ChinesemonthInt2 == 5) || (ChinesemonthInt2 == 13) || (ChinesemonthInt2 == 21) || (ChinesemonthInt2 == 28))) || ((ChinesemonthInt1 == 7) && ((ChinesemonthInt2 == 8) || (ChinesemonthInt2 == 16) || (ChinesemonthInt2 == 24) || (ChinesemonthInt2 == 4) || (ChinesemonthInt2 == 12) || (ChinesemonthInt2 == 20) || (ChinesemonthInt2 == 27))) || ((ChinesemonthInt1 == 8) && ((ChinesemonthInt2 == 7) || (ChinesemonthInt2 == 15) || (ChinesemonthInt2 == 23) || (ChinesemonthInt2 == 30) || (ChinesemonthInt2 == 3) || (ChinesemonthInt2 == 11) || (ChinesemonthInt2 == 19) || (ChinesemonthInt2 == 26))) || ((ChinesemonthInt1 == 9) && ((ChinesemonthInt2 == 6) || (ChinesemonthInt2 == 13) || (ChinesemonthInt2 == 22) || (ChinesemonthInt2 == 29) || (ChinesemonthInt2 == 2) || (ChinesemonthInt2 == 10) || (ChinesemonthInt2 == 18) || (ChinesemonthInt2 == 25))) || ((ChinesemonthInt1 == 10) && ((ChinesemonthInt2 == 4) || (ChinesemonthInt2 == 12) || (ChinesemonthInt2 == 21) || (ChinesemonthInt2 == 28) || (ChinesemonthInt2 == 1) || (ChinesemonthInt2 == 9) || (ChinesemonthInt2 == 17) || (ChinesemonthInt2 == 24))) || ((ChinesemonthInt1 == 11) && ((ChinesemonthInt2 == 4) || (ChinesemonthInt2 == 13) || (ChinesemonthInt2 == 20) || (ChinesemonthInt2 == 27) || (ChinesemonthInt2 == 8) || (ChinesemonthInt2 == 16) || (ChinesemonthInt2 == 23))) || ((ChinesemonthInt1 == 12) && ((ChinesemonthInt2 == 3) || (ChinesemonthInt2 == 11) || (ChinesemonthInt2 == 19) || (ChinesemonthInt2 == 7) || (ChinesemonthInt2 == 15)));
    }

    */
/**
     * 月德 正五九月丙，二六十月甲，三七十一月壬，四八十二月庚
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yuede(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 5) && (ChinesemonthInt != 9)) || ((rizhiString.equals("丙")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 7) && (ChinesemonthInt != 11)) || ((rizhiString.equals("壬")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 6) && (ChinesemonthInt != 10)) || ((rizhiString.equals("甲")) || (((ChinesemonthInt == 4) || (ChinesemonthInt == 8) || (ChinesemonthInt == 12)) && (rizhiString.equals("庚"))))))));
    }

    */
/**
     * 神在
     *
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean shenzai(String rizhiString) {
        return (rizhiString.equals("甲子")) || (rizhiString.equals("乙丑")) || (rizhiString.equals("丁卯")) || (rizhiString.equals("戊辰")) || (rizhiString.equals("辛未")) || (rizhiString.equals("己丑")) || (rizhiString.equals("辛卯")) || (rizhiString.equals("甲午")) || (rizhiString.equals("乙未")) || (rizhiString.equals("丙申")) || (rizhiString.equals("丁酉")) || (rizhiString.equals("丙午")) || (rizhiString.equals("丁未")) || (rizhiString.equals("戊申")) || (rizhiString.equals("庚戌")) || (rizhiString.equals("乙酉")) || (rizhiString.equals("乙卯")) || (rizhiString.equals("丙辰")) || (rizhiString.equals("丁巳")) || (rizhiString.equals("戊午")) || (rizhiString.equals("己未")) || (rizhiString.equals("辛酉")) || (rizhiString.equals("癸亥"));
    }

    */
/**
     * 天贵
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean tiandui(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("甲")) || (rizhiString2.equals("乙")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("丙")) || (rizhiString2.equals("丁")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("庚")) || (rizhiString2.equals("辛")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("壬")) || (rizhiString2.equals("癸")))))))));
    }

    */
/**
     * 天德合：正壬二巳三丁四丙五寅六己七戊八亥九辛十庚十一甲十二乙
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tiandehe(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("壬"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丁"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("丙"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("己"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("戊"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("辛"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("庚"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("乙")));
    }

    */
/**
     * 天瑞
     *
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianrui(String rizhiString) {
        return (rizhiString.equals("戊寅")) || (rizhiString.equals("己卯")) || (rizhiString.equals("辛巳")) || (rizhiString.equals("庚寅")) || (rizhiString.equals("壬子"));
    }

    */
/**
     * 天赦
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean tianshe(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("戊寅")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("甲午")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("戊申")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && (rizhiString2.equals("甲子"))))))));
    }

    */
/**
     * 月德合：正五九月辛，二六十月巳，三七十一月丁，四八十二月乙。
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yuedehe(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 5) && (ChinesemonthInt != 9)) || ((rizhiString.equals("辛")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 7) && (ChinesemonthInt != 11)) || ((rizhiString.equals("丁")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 6) && (ChinesemonthInt != 10)) || ((rizhiString.equals("己")) || (((ChinesemonthInt == 4) || (ChinesemonthInt == 8) || (ChinesemonthInt == 12)) && (rizhiString.equals("乙"))))))));
    }

    */
/**
     * 魁罡
     *
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean kuigai(String rizhiString) {
        return (rizhiString.equals("壬辰")) || (rizhiString.equals("庚戌")) || (rizhiString.equals("庚辰")) || (rizhiString.equals("戊戌"));
    }

    */
/**
     * 母仓
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean mucang(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("亥")) || (rizhiString2.equals("子")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("寅")) || (rizhiString2.equals("卯")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("辰")) || (rizhiString2.equals("戌")) || (rizhiString2.equals("丑")) || (rizhiString2.equals("未")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("申")) || (rizhiString2.equals("酉")))))))));
    }

    */
/**
     * 天喜 天喜日：宜婚姻、纳采、百事吉 正戍二亥三子四丑五寅六卯七辰八巳九午十未十一申十二酉
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianxi(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 12) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 1) && (rizhiString.equals("戌")));
    }

    */
/**
     * 破群日
     *
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean poqunri(String rizhiString) {
        return (rizhiString.equals("庚寅")) || (rizhiString.equals("庚申")) || (rizhiString.equals("壬辰")) || (rizhiString.equals("戊辰")) || (rizhiString.equals("甲寅")) || (rizhiString.equals("己卯"));
    }

    */
/**
     * 福厚
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean fuhou(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("寅")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("巳")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("申")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && (rizhiString2.equals("亥"))))))));
    }

    */
/**
     * 天成
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tiancheng(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 7)) || ((rizhiString.equals("未")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 8)) || ((rizhiString.equals("酉")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 9)) || ((rizhiString.equals("亥")) || (((ChinesemonthInt != 4) && (ChinesemonthInt != 10)) || ((rizhiString.equals("丑")) || (((ChinesemonthInt != 5) && (ChinesemonthInt != 11)) || ((rizhiString.equals("卯")) || (((ChinesemonthInt == 6) || (ChinesemonthInt == 12)) && (rizhiString.equals("巳"))))))))))));
    }

    */
/**
     * 旺日
     *
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean wangri(String rizhiString) {
        return (rizhiString.equals("甲寅")) || (rizhiString.equals("乙卯")) || (rizhiString.equals("丙午")) || (rizhiString.equals("丁巳")) || (rizhiString.equals("庚申")) || (rizhiString.equals("辛酉")) || (rizhiString.equals("壬子")) || (rizhiString.equals("癸亥")) || (rizhiString.equals("戊辰")) || (rizhiString.equals("戊戌")) || (rizhiString.equals("己丑")) || (rizhiString.equals("己未"));
    }

    */
/**
     * 六合
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean liuhe(String rizhiString1, String rizhiString2) {
        return ((rizhiString1.equals("寅")) && (rizhiString2.equals("亥"))) || ((rizhiString1.equals("卯")) && (rizhiString2.equals("戌"))) || ((rizhiString1.equals("辰")) && (rizhiString2.equals("酉"))) || ((rizhiString1.equals("巳")) && (rizhiString2.equals("申"))) || ((rizhiString1.equals("午")) && (rizhiString2.equals("未"))) || ((rizhiString1.equals("未")) && (rizhiString2.equals("午"))) || ((rizhiString1.equals("申")) && (rizhiString2.equals("巳"))) || ((rizhiString1.equals("酉")) && (rizhiString2.equals("辰"))) || ((rizhiString1.equals("戌")) && (rizhiString2.equals("卯"))) || ((rizhiString1.equals("亥")) && (rizhiString2.equals("寅"))) || ((rizhiString1.equals("子")) && (rizhiString2.equals("丑"))) || ((rizhiString1.equals("丑")) && (rizhiString2.equals("子")));
    }

    */
/**
     * 天官
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianguan(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 7)) || ((rizhiString.equals("戌")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 8)) || ((rizhiString.equals("子")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 9)) || ((rizhiString.equals("寅")) || (((ChinesemonthInt != 4) && (ChinesemonthInt != 10)) || ((rizhiString.equals("辰")) || (((ChinesemonthInt != 5) && (ChinesemonthInt != 11)) || ((rizhiString.equals("午")) || (((ChinesemonthInt == 6) || (ChinesemonthInt == 12)) && (rizhiString.equals("申"))))))))))));
    }

    public static boolean g(String rizhiString) {
        return (rizhiString.equals("角")) || (rizhiString.equals("亢")) || (rizhiString.equals("奎")) || (rizhiString.equals("娄")) || (rizhiString.equals("牛")) || (rizhiString.equals("鬼")) || (rizhiString.equals("星"));
    }

    */
/**
     * 岁德
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean shuidei(String rizhiString1, String rizhiString2) {
        return ((rizhiString1.equals("甲")) && (rizhiString2.equals("甲"))) || ((rizhiString1.equals("乙")) && (rizhiString2.equals("庚"))) || ((rizhiString1.equals("丙")) && (rizhiString2.equals("丙"))) || ((rizhiString1.equals("丁")) && (rizhiString2.equals("壬"))) || ((rizhiString1.equals("戊")) && (rizhiString2.equals("壬"))) || ((rizhiString1.equals("己")) && (rizhiString2.equals("甲"))) || ((rizhiString1.equals("庚")) && (rizhiString2.equals("庚"))) || ((rizhiString1.equals("辛")) && (rizhiString2.equals("丙"))) || ((rizhiString1.equals("壬")) && (rizhiString2.equals("壬"))) || ((rizhiString1.equals("癸")) && (rizhiString2.equals("戊")));
    }

    */
/**
     * 天医
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianyi(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 12) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 1) && (rizhiString.equals("丑")));
    }

    public static boolean baihurugong(String rizhiString) {
        return (rizhiString.equals("戊寅")) || (rizhiString.equals("丁丑")) || (rizhiString.equals("丙戌")) || (rizhiString.equals("乙未")) || (rizhiString.equals("甲辰")) || (rizhiString.equals("癸丑")) || (rizhiString.equals("壬戌"));
    }

    */
/**
     * 五合
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean wuhe(String rizhiString1, String rizhiString2) {
        return ((rizhiString1.equals("甲寅")) && (rizhiString2.equals("乙卯"))) || ((rizhiString1.equals("乙卯")) && (rizhiString2.equals("甲寅"))) || ((rizhiString1.equals("戊寅")) && (rizhiString2.equals("己卯"))) || ((rizhiString1.equals("己卯")) && (rizhiString2.equals("戊寅"))) || ((rizhiString1.equals("丙寅")) && (rizhiString2.equals("丁卯"))) || ((rizhiString1.equals("丁卯")) && (rizhiString2.equals("丙寅"))) || ((rizhiString1.equals("庚寅")) && (rizhiString2.equals("辛卯"))) || ((rizhiString1.equals("辛卯")) && (rizhiString2.equals("庚寅"))) || ((rizhiString1.equals("壬寅")) && (rizhiString2.equals("癸卯"))) || ((rizhiString1.equals("癸卯")) && (rizhiString2.equals("壬寅")));
    }

    */
/**
     * 天马
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianma(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 7)) || ((rizhiString.equals("午")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 8)) || ((rizhiString.equals("申")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 9)) || ((rizhiString.equals("戌")) || (((ChinesemonthInt != 4) && (ChinesemonthInt != 10)) || ((rizhiString.equals("子")) || (((ChinesemonthInt != 5) && (ChinesemonthInt != 11)) || ((rizhiString.equals("寅")) || (((ChinesemonthInt == 6) || (ChinesemonthInt == 12)) && (rizhiString.equals("辰"))))))))))));
    }

    */
/**
     * 鬼哭日
     *
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean guiku(String rizhiString) {
        return rizhiString.equals("戌");
    }

    */
/**
     * 天地转煞
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean tiandizhuansha(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("乙卯")) || (rizhiString2.equals("辛卯")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("丙午")) || (rizhiString2.equals("戊午")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("辛酉")) || (rizhiString2.equals("癸酉")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("壬子")) || (rizhiString2.equals("丙子")))))))));
    }

    */
/**
     * 天财
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tiancai(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 7)) || ((rizhiString.equals("辰")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 8)) || ((rizhiString.equals("午")) || (((ChinesemonthInt != 3) && (ChinesemonthInt != 9)) || ((rizhiString.equals("申")) || (((ChinesemonthInt != 4) && (ChinesemonthInt != 10)) || ((rizhiString.equals("戌")) || (((ChinesemonthInt != 5) && (ChinesemonthInt != 11)) || ((rizhiString.equals("子")) || (((ChinesemonthInt == 6) || (ChinesemonthInt == 12)) && (rizhiString.equals("寅"))))))))))));
    }

    */
/**
     * 月破
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean yuepo(String rizhiString1, String rizhiString2) {
        return ((rizhiString1.equals("寅")) && (rizhiString2.equals("申"))) || ((rizhiString1.equals("卯")) && (rizhiString2.equals("酉"))) || ((rizhiString1.equals("辰")) && (rizhiString2.equals("戌"))) || ((rizhiString1.equals("巳")) && (rizhiString2.equals("亥"))) || ((rizhiString1.equals("午")) && (rizhiString2.equals("子"))) || ((rizhiString1.equals("未")) && (rizhiString2.equals("丑"))) || ((rizhiString1.equals("申")) && (rizhiString2.equals("寅"))) || ((rizhiString1.equals("酉")) && (rizhiString2.equals("卯"))) || ((rizhiString1.equals("戌")) && (rizhiString2.equals("辰"))) || ((rizhiString1.equals("亥")) && (rizhiString2.equals("巳"))) || ((rizhiString1.equals("子")) && (rizhiString2.equals("午"))) || ((rizhiString1.equals("丑")) && (rizhiString2.equals("未")));
    }

    */
/**
     * 生气
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean shengqi(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 12) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 1) && (rizhiString.equals("子")));
    }

    */
/**
     * 正四废
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean zhengsifei(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("庚申")) || (rizhiString2.equals("辛酉")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("壬子")) || (rizhiString2.equals("癸亥")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("甲寅")) || (rizhiString2.equals("乙卯")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("丙午")) || (rizhiString2.equals("丁巳")))))))));
    }

    */
/**
     * 天富
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tianfu(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("卯")));
    }

    */
/**
     * 傍四废
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean pangsifei(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("庚")) || (rizhiString2.equals("辛")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("壬")) || (rizhiString2.equals("癸")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("甲")) || (rizhiString2.equals("乙")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("丙")) || (rizhiString2.equals("丁")))))))));
    }

    */
/**
     * 月财
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yuecai(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 勾绞
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean goujiao(String rizhiString1, String rizhiString2) {
        return ((rizhiString1.equals("寅")) && (rizhiString2.equals("亥"))) || ((rizhiString1.equals("卯")) && (rizhiString2.equals("午"))) || ((rizhiString1.equals("辰")) && (rizhiString2.equals("丑"))) || ((rizhiString1.equals("巳")) && (rizhiString2.equals("申"))) || ((rizhiString1.equals("午")) && (rizhiString2.equals("卯"))) || ((rizhiString1.equals("未")) && (rizhiString2.equals("戌"))) || ((rizhiString1.equals("申")) && (rizhiString2.equals("巳"))) || ((rizhiString1.equals("酉")) && (rizhiString2.equals("子"))) || ((rizhiString1.equals("戌")) && (rizhiString2.equals("未"))) || ((rizhiString1.equals("亥")) && (rizhiString2.equals("寅"))) || ((rizhiString1.equals("子")) && (rizhiString2.equals("酉"))) || ((rizhiString1.equals("丑")) && (rizhiString2.equals("辰")));
    }

    */
/**
     * 月恩
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yueen(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("丙"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("丁"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("庚"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("己"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("戊"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("辛"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("壬"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("癸"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("庚"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("乙"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("甲"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("辛")));
    }

    */
/**
     * 当梁
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean dangliang(String rizhiString1, String rizhiString2) {
        return ((rizhiString1.equals("寅")) && (rizhiString2.equals("巳"))) || ((rizhiString1.equals("卯")) && (rizhiString2.equals("子"))) || ((rizhiString1.equals("辰")) && (rizhiString2.equals("未"))) || ((rizhiString1.equals("巳")) && (rizhiString2.equals("寅"))) || ((rizhiString1.equals("午")) && (rizhiString2.equals("酉"))) || ((rizhiString1.equals("未")) && (rizhiString2.equals("辰"))) || ((rizhiString1.equals("申")) && (rizhiString2.equals("亥"))) || ((rizhiString1.equals("酉")) && (rizhiString2.equals("午"))) || ((rizhiString1.equals("戌")) && (rizhiString2.equals("丑"))) || ((rizhiString1.equals("亥")) && (rizhiString2.equals("申"))) || ((rizhiString1.equals("子")) && (rizhiString2.equals("卯"))) || ((rizhiString1.equals("丑")) && (rizhiString2.equals("戌")));
    }

    */
/**
     * 圣心
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean shengxing(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("戌")));
    }

    */
/**
     * 荒鞠
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean huangchu(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("巳")) || (rizhiString2.equals("酉")) || (rizhiString2.equals("丑")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("申")) || (rizhiString2.equals("子")) || (rizhiString2.equals("辰")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("亥")) || (rizhiString2.equals("卯")) || (rizhiString2.equals("未")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("寅")) || (rizhiString2.equals("午")) || (rizhiString2.equals("戌")))))))));
    }

    */
/**
     * 五富
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean wufu(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 鲁班杀
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean lubansha(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("子")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("卯")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("午")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && (rizhiString2.equals("酉"))))))));
    }

    */
/**
     * 阴德
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yingde(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 斧头杀
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean futousha(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("辰")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("未")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("酉")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && (rizhiString2.equals("子"))))))));
    }

    */
/**
     * 活曜
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean huoyao(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("申")));
    }

    */
/**
     * 万砍杀
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean wankansha(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("亥")) || (rizhiString2.equals("子")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("寅")) || (rizhiString2.equals("卯")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("巳")) || (rizhiString2.equals("午")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("申")) || (rizhiString2.equals("酉")))))))));
    }

    */
/**
     * 解神
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean xiesheng(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("午")));
    }

    */
/**
     * 五虚
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean wuxu(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("巳")) || (rizhiString2.equals("酉")) || (rizhiString2.equals("丑")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("申")) || (rizhiString2.equals("子")) || (rizhiString2.equals("辰")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("亥")) || (rizhiString2.equals("卯")) || (rizhiString2.equals("未")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("寅")) || (rizhiString2.equals("午")) || (rizhiString2.equals("戌")))))))));
    }

    */
/**
     * 益后
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yihou(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 土禁
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean tuji(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("亥")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("寅")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("巳")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && (rizhiString2.equals("申"))))))));
    }

    */
/**
     * 要安
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yaoan(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("戌"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("丑")));
    }

    */
/**
     * 四时大墓
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean sishidamu(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("乙未")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("丙戌")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("辛丑")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && (rizhiString2.equals("壬辰"))))))));
    }

    */
/**
     * 驿马
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean yima(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("亥")));
    }

    */
/**
     * 月害
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean yuehai(String rizhiString1, String rizhiString2) {
        return ((rizhiString1.equals("子")) && (rizhiString2.equals("未"))) || ((rizhiString1.equals("丑")) && (rizhiString2.equals("午"))) || ((rizhiString1.equals("寅")) && (rizhiString2.equals("巳"))) || ((rizhiString1.equals("卯")) && (rizhiString2.equals("辰"))) || ((rizhiString1.equals("申")) && (rizhiString2.equals("亥"))) || ((rizhiString1.equals("酉")) && (rizhiString2.equals("戌"))) || ((rizhiString1.equals("未")) && (rizhiString2.equals("子"))) || ((rizhiString1.equals("午")) && (rizhiString2.equals("丑"))) || ((rizhiString1.equals("巳")) && (rizhiString2.equals("寅"))) || ((rizhiString1.equals("辰")) && (rizhiString2.equals("卯"))) || ((rizhiString1.equals("亥")) && (rizhiString2.equals("申"))) || ((rizhiString1.equals("戌")) && (rizhiString2.equals("酉")));
    }

    */
/**
     * 煞贡
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean shagong(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 4) && (ChinesemonthInt != 7) && (ChinesemonthInt != 10)) || ((rizhiString.equals("丁卯")) || (rizhiString.equals("丙子")) || (rizhiString.equals("乙酉")) || (rizhiString.equals("甲午")) || (rizhiString.equals("癸卯")) || (rizhiString.equals("壬子")) || (rizhiString.equals("辛酉")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 5) && (ChinesemonthInt != 8) && (ChinesemonthInt != 11)) || ((rizhiString.equals("丙寅")) || (rizhiString.equals("乙亥")) || (rizhiString.equals("甲申")) || (rizhiString.equals("癸巳")) || (rizhiString.equals("壬寅")) || (rizhiString.equals("辛亥")) || (rizhiString.equals("庚申")) || (((ChinesemonthInt == 3) || (ChinesemonthInt == 6) || (ChinesemonthInt == 9) || (ChinesemonthInt == 12)) && ((rizhiString.equals("己丑")) || (rizhiString.equals("甲戌")) || (rizhiString.equals("癸未")) || (rizhiString.equals("壬辰")) || (rizhiString.equals("辛丑")) || (rizhiString.equals("庚戌")) || (rizhiString.equals("己未")))))));
    }

    */
/**
     * 相日
     *
     * @param rizhiString 日支字符串1
     * @param rizhiString 日支字符串2
     * @return
     *//*

    public static boolean xiangri(String rizhiString1, String rizhiString2) {
        return ((!rizhiString1.equals("寅")) && (!rizhiString1.equals("卯")) && (!rizhiString1.equals("辰"))) || ((rizhiString2.equals("巳")) || (rizhiString2.equals("午")) || (((!rizhiString1.equals("巳")) && (!rizhiString1.equals("午")) && (!rizhiString1.equals("未"))) || ((rizhiString2.equals("戌")) || (rizhiString2.equals("未")) || (rizhiString2.equals("辰")) || (rizhiString2.equals("丑")) || (((!rizhiString1.equals("申")) && (!rizhiString1.equals("酉")) && (!rizhiString1.equals("戌"))) || ((rizhiString2.equals("亥")) || (rizhiString2.equals("子")) || (((rizhiString1.equals("亥")) || (rizhiString1.equals("子")) || (rizhiString1.equals("丑"))) && ((rizhiString2.equals("寅")) || (rizhiString2.equals("卯")))))))));
    }

    */
/**
     * 直星
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean zhixing(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 4) && (ChinesemonthInt != 7) && (ChinesemonthInt != 10)) || ((rizhiString.equals("戊辰")) || (rizhiString.equals("丁丑")) || (rizhiString.equals("丙戌")) || (rizhiString.equals("乙未")) || (rizhiString.equals("甲辰")) || (rizhiString.equals("癸丑")) || (rizhiString.equals("壬戌")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 5) && (ChinesemonthInt != 8) && (ChinesemonthInt != 11)) || ((rizhiString.equals("丁卯")) || (rizhiString.equals("丙子")) || (rizhiString.equals("乙酉")) || (rizhiString.equals("甲午")) || (rizhiString.equals("癸卯")) || (rizhiString.equals("壬子")) || (rizhiString.equals("辛酉")) || (((ChinesemonthInt == 3) || (ChinesemonthInt == 6) || (ChinesemonthInt == 9) || (ChinesemonthInt == 12)) && ((rizhiString.equals("丙寅")) || (rizhiString.equals("乙亥")) || (rizhiString.equals("甲申")) || (rizhiString.equals("癸巳")) || (rizhiString.equals("壬寅")) || (rizhiString.equals("辛卯")) || (rizhiString.equals("庚申")))))));
    }

    */
/**
     * 人专
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean renzhuan(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt != 1) && (ChinesemonthInt != 4) && (ChinesemonthInt != 7) && (ChinesemonthInt != 10)) || ((rizhiString.equals("辛未")) || (rizhiString.equals("庚辰")) || (rizhiString.equals("己丑")) || (rizhiString.equals("戊戌")) || (rizhiString.equals("丁未")) || (rizhiString.equals("丙辰")) || (((ChinesemonthInt != 2) && (ChinesemonthInt != 5) && (ChinesemonthInt != 8) && (ChinesemonthInt != 11)) || ((rizhiString.equals("庚午")) || (rizhiString.equals("己卯")) || (rizhiString.equals("戊子")) || (rizhiString.equals("丁酉")) || (rizhiString.equals("丙午")) || (rizhiString.equals("乙卯")) || (((ChinesemonthInt == 3) || (ChinesemonthInt == 6) || (ChinesemonthInt == 9) || (ChinesemonthInt == 12)) && ((rizhiString.equals("己巳")) || (rizhiString.equals("戊寅")) || (rizhiString.equals("己亥")) || (rizhiString.equals("丙申")) || (rizhiString.equals("乙巳")) || (rizhiString.equals("甲寅")) || (rizhiString.equals("癸亥")))))));
    }

    */
/**
     * 天罡
     *
     * @param ChinesemonthInt 农历月份数字
     * @param rizhiString 日支字符串
     * @return
     *//*

    public static boolean tiangang(int ChinesemonthInt, String rizhiString) {
        return ((ChinesemonthInt == 1) && (rizhiString.equals("巳"))) || ((ChinesemonthInt == 2) && (rizhiString.equals("子"))) || ((ChinesemonthInt == 3) && (rizhiString.equals("未"))) || ((ChinesemonthInt == 4) && (rizhiString.equals("寅"))) || ((ChinesemonthInt == 5) && (rizhiString.equals("酉"))) || ((ChinesemonthInt == 6) && (rizhiString.equals("辰"))) || ((ChinesemonthInt == 7) && (rizhiString.equals("亥"))) || ((ChinesemonthInt == 8) && (rizhiString.equals("午"))) || ((ChinesemonthInt == 9) && (rizhiString.equals("丑"))) || ((ChinesemonthInt == 10) && (rizhiString.equals("申"))) || ((ChinesemonthInt == 11) && (rizhiString.equals("卯"))) || ((ChinesemonthInt == 12) && (rizhiString.equals("戌")));
    }


    luozhuangjiandanxuanri my = new luozhuangjiandanxuanri();

    void test(BaiziRecord cal) {
        int intChinesemonth = cal.lunaryue.getLunarMonth();
        int intChineseday = cal.lunaryue.getLunarDay();
        panduan(intChinesemonth, cal.getganzhiString());
        my.println("今天吉星");
        my.println(jiristring);

        my.println("今天凶星");
        my.println(badrizi);

    }

    public static void main(String[] args) throws ParseException {

        luozhuangjiandanxuanri myluozhuangjiandanxuanri = new luozhuangjiandanxuanri();
        Luozhuangjixiong myLuozhuangjixiong = new Luozhuangjixiong();
        myLuozhuangjixiong.test(myluozhuangjiandanxuanri.getbazi("2013-8-12"));

    }
}*/
