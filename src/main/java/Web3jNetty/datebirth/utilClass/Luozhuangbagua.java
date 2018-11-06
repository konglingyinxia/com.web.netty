package Web3jNetty.datebirth.utilClass;
/*
 * 硬币占卜解卦实现
 * @author luozhuang  大师♂罗莊
 */

/**
 * @author luozhuang 大师♂罗莊
 */
public class Luozhuangbagua {

    /**
     * 获得每一卦解释
     *
     * @param guanameString 卦名，可以参考baidu知道
     * @return 解释
     */
    public static String getbagua(String guanameString) {
        if (guanameString == null) {
            return null;
        }
        if (guanameString.equals("乾")) {
            return "第1卦 乾为天（乾卦）  刚健中正<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>困龙得水好运交，不由喜气上眉梢，一切谋望皆如意，向后时运渐渐高。<br>　　这个卦是同卦（下乾上乾）相叠。象征天，喻龙（德才的君子），又象征纯粹的阳和健，表明兴盛强健。乾卦是根据万物变通的道理，以[元、亨、利、贞]为卦辞，示吉祥如意，教导人遵守天道的德行。<br>　　<font color='yellow'>事业：</font>大吉大利，万事如意，心想事成，自有天佑，春风得意，事业如日中天。但阳气已达顶点，盛极必衰，务须提高警惕，小心谨慎。力戒骄傲，冷静处世，心境平和，如是则能充分发挥才智，保证事业成功。<br>　　<font color='yellow'>经商：</font>十分顺利，有发展向上的大好机会。但切勿操之过急，宜冷静分析形势，把握时机，坚持商业道德，冷静对待中途出现的困难，定会有满意的结果。<br>　　<font color='yellow'>求名：</font>潜在能力尚未充分发挥，只要进一步努力，克服骄傲自满情绪，进业修德，以渊博学识和高尚品质，成君子之名。<br>　　<font color='yellow'>外出：</font>利于出行，结伴而行更佳。<br>　　<font color='yellow'>婚恋：</font>阳盛阴衰，但刚柔可相济，形成美满结果。女性温柔者更佳。<br>　　<font color='yellow'>交易：</font>非常顺利，若买方是女人，则一谈即成。<br>　　<font color='yellow'>求职：</font>有女贵人相助，可成，不用怀疑。<br>　　<font color='yellow'>求财：</font>不可与人同求，应自求自得，有十分财喜。<br>　　<font color='yellow'>求官：</font>有贵人提拔，连升三级，官运亨通。<br>　　<font color='yellow'>升学：</font>顺利，若考生为男，能考上重点大学。<br>　　<font color='yellow'>寻人：</font>在东南方遇，九日内可于途中相见。<br>　　<font color='yellow'>见贵：</font>可见权贵，并得到帮助。<br>　　<font color='yellow'>官司：</font>诉讼有理，最终胜诉，也可于法庭上调解。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>可成就大的事业。坚持此卦的刚健、正直、公允的实质，修养德行，积累知识，坚定信念，自强不息，必能克服困难，消除灾难。<br>";
        }
        if (guanameString.equals("履")) {
            return "第10卦 天泽履（履卦）  脚踏实地<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>凤凰落在西歧山，去鸣几声出圣贤，天降文王开基业，富贵荣华八百年。<br>　　这个卦是异卦（下兑上乾）相叠，乾为天；兑为泽，以天喻君，以泽喻民，原文：[履（踩）虎尾、不咥（咬）人。]因此，结果吉利。君上民下，各得其位。兑柔遇乾刚，所履危。履意为实践，卦义是脚踏实地的向前进取的意思。<br>　　<font color='yellow'>事业：</font>起初很不顺利，受到种种威胁，若能提高警惕，谨小慎微，脚踏实地，逐个地去克服困难，不改变自己的决心，一定可以达到目的。办事有自知之明，务必量力而行，不可不顾实际，尤其不得逞强，急于求成。<br>　　<font color='yellow'>经商：</font>宜待观动静，勿为小利而动摇自己计划，尤其不得贪得无厌，遵循商业道德，了解全面信息。<br>　　<font color='yellow'>求名：</font>务必有恒心，孜孜以求，不为财富利诱，不为世俗干扰，坚持自己的志向和理想，可以取得成功。<br>　　<font color='yellow'>外出：</font>有惊无险，可以外出，但非紧急情况可以缓行。<br>　　<font color='yellow'>婚恋：</font>双方安贫乐道，可和睦相处，若一方为富贵所动，会发生婚变。<br>　　<font color='yellow'>交易：</font>事难成，坚持努力方成，防是非口舌。<br>　　<font color='yellow'>求职：</font>先难后易，久议可得。<br>　　<font color='yellow'>求财：</font>阳爻动方有财，三四人同求有。<br>　　<font color='yellow'>求官：</font>多反复，费力，终难成。<br>　　<font color='yellow'>升学：</font>不顺，内外有阻，须求三四人帮忙方有转机。<br>　　<font color='yellow'>行人：</font>身已动，至途中有阻。<br>　　<font color='yellow'>见贵：</font>须有熟人推荐方可得见。<br>　　<font color='yellow'>官司：</font>为他人无理侵我，有头无尾。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>诸事必须小心慎重，不利的情况经常会出现，但若能处理得好，总会是有惊无险，化险为夷。为此，办事必须认认真真，遵循正道，虚心听取别人的建议，量力而行，切莫自负逞强，一定会有好的结果。<br>";
        }
        if (guanameString.equals("同人")) {
            return "第13卦 天火同人（同人卦）  上下和同<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>心中有事犯猜疑，谋望从前不着实，幸遇明人来指引，诸般忧闷自消之。<br>　　这个卦是异卦（下离上乾）相叠，乾为天，为君；离为火，为臣民百姓，上天下火，火性上升，同于天，上下和同，同舟共济，人际关系和谐，天下大同。<br>　　<font color='yellow'>事业：</font> 顺利、平安、尤其是在与他人的合作方面会十分成功，宜广泛开展人际活动，建立广泛的联系，克服狭隘的门户之见，照顾各方面的利益，求大同，存小异，坚持正确的原则，必能成就大事业。<br>　　<font color='yellow'>经商：</font>以真诚合作、精诚团结的态度与同行共事，公平竞争，必可获得自己应得的利益。<br>　　<font color='yellow'>求名：</font>自己必须刻苦努力，尤其必要取行师长和志同道全的朋友的指教、帮助，自己虚心进取，完全能够达到目的。<br>　　<font color='yellow'>外出：</font>很平安、顺利，并可以结交新朋友，获得帮助。<br>　　<font color='yellow'>婚恋：</font>多情、善交际，认识的异性朋友多，故需慎重选择，注意维护双方关系和家庭和睦。<br>　　<font color='yellow'>交易：</font>二人合伙吉利，马到成功，心想事成。<br>　　<font color='yellow'>求职：</font>二人同求可成，但有反复，无妨。<br>　　<font color='yellow'>求财：</font>宜与朋友或情人同求可得。<br>　　<font color='yellow'>求官：</font>二人用力，一人拆台，同姓人相助可成。<br>　　<font color='yellow'>升学：</font>宜奋进，第依次不顺，第二年考外省院校顺利。<br>　　<font color='yellow'>官司：</font>不久将和，上九爻动为他侵我。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>性格开朗、乐观，为人热情，人际关系好，社交能力强，要善于同他人合作，尤其要协调多方面的关系，要有原则性，与不良风气斗争，有魄力，敢作敢为，富有自我奉献精神，并具有统御能力，适于担任一定的负责。<br>";
        }
        if (guanameString.equals("无妄")) {
            return "第25卦 天雷无妄（无妄卦）  无妄而得<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>飞鸟失机落笼中，纵然奋飞不能腾，目下只宜守本分，妄想扒高万不能。<br>　　这个卦是异卦（下震上乾）相叠。乾为天为刚为健；震为雷为刚为动。动而健，刚阳盛，人心振奋，必有所得，但唯循纯正，不可妄行。无妄必有获，必可致福。<br>　　<font color='yellow'>事业：</font>贵自知之明，从个人实际出发，不抱非分之想，脚踏实地，勤奋努力，检点行为，防意外灾祸。不计较得失，诚心追求，待机而动，事业必成。<br>　　<font color='yellow'>经商：</font>切勿勉为其难，遵循市场规律，讲究商业道德，屏弃投机心理，勿贪暴利，经过辛勤努力，日积月累，必将成功。<br>　　<font color='yellow'>求名：</font>以良好的动机，刻苦努力，丢弃幻想，但问耕耘，不问收获，终将有所获。<br>　　<font color='yellow'>外出：</font>不存妄想则平安无事。为谋私利或邪念而行则大为不利，不宜行。<br>　　<font color='yellow'>婚恋：</font>双方务以诚相待，绝不可抱以轻率的态度，亦不宜急于求成、顺其发展，水到渠成。<br>　　<font color='yellow'>交易：</font>宜守旧，维持小收入，不可投资新项目。<br>　　<font color='yellow'>求职：</font>春夏成，秋冬不成，有阻隔，不可等待。<br>　　<font color='yellow'>求财：</font>先难后易，不宜多求。<br>　　<font color='yellow'>求官：</font>进前则成，宜托人求之。<br>　　<font color='yellow'>升学：</font>量力而行，不要好高婺远。<br>　　<font color='yellow'>官司：</font>多因意外事故，或为女人不和，必有争斗，宜劝和。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>精力充沛，富有上进心，可有作为。但务必勤勉努力，诚心诚恳，奋发向上，刻苦钻研。不可因小有成就而得意忘形。不必追求所得，而应追求实干。遵循规律办事，等待时机再行动。尤其应清除非份的念头。这样，可实现自己的理想。<br>";
        }
        if (guanameString.equals("姤")) {
            return "第44卦 天风姤（姤卦）  天下有风<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>他乡遇友喜气欢，须知运气福重添，自今交了顺当运，向后管保不相干。<br>　　这个卦是异卦（下巽上乾）相叠。乾为天，巽为风。天下有风，吹遍大地，阴阳交合，万物茂盛。姤（gǒu）卦与夬卦相反，互为[综卦]。姤即遘，阴阳相遇。但五阳一阴，不能长久相处。<br>　　<font color='yellow'>事业：</font>合时宜，循时序。但潜在着危机，阴阳不协调。务必依附于强者，多方联系，增强势力，防止小人渔利，争取形势好转。诸事宜及早准备，等待时机，一旦成熟立刻行动。<br>　　<font color='yellow'>经商：</font>市场正从红火的状态走向衰危，及早脱身为妙，强行发展有危险。无正直的人相助，却有小人在暗中盘算。对此，务必保持清醒的头脑，寻求可靠的合作伙伴，隐忍待时，以图商业活动的再发展。<br>　　<font color='yellow'>求名：</font>性格不很合群，内心自视过高，不免处于困境而不得志。应投靠真诚正直的人，在其支持下成功。<br>　　<font color='yellow'>外出：</font>有困难，虽无大灾祸，但无人相助。<br>　　<font color='yellow'>婚恋：</font>严格考察对方的道德品质，避免陷入[三角]纠纷。夫妻以诚相待，可转危为安。<br>　　<font color='yellow'>交易：</font>若由女人主持则一切顺利，若由男人主持应与一女性合伙经营方成。<br>　　<font color='yellow'>求职：</font>有女人为福，可进前，若无女人助，不可成。<br>　　<font color='yellow'>求财：</font>五分财运，先难后易，与女人合伙吉利，防女人口舌。女人成财亦破财。<br>　　<font color='yellow'>求官：</font>须托女人代求方成，有反复，终成。<br>　　<font color='yellow'>升学：</font>主女生有喜讯，考试成绩必佳。<br>　　<font color='yellow'>见贵：</font>迟见方可，得女贵人帮忙则吉利。<br>　　<font color='yellow'>官司：</font>女人在内，不怕口舌是非，有惊阻，但不足为害。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>吉利。可在有利的环境中顺利发展，但决不可冒险行事，以免适得其反。其次在于随时提防身边小人的陷害。为此，在邪恶未成势之前即应制止，宁可孤立也不可与小人结伴。<br>";
        }
        if (guanameString.equals("讼")) {
            return "第6卦 天水讼（讼卦）  慎争戒讼<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>心中有事事难做，恰是二人争路走，雨下俱是要占先，谁肯让谁走一步。<br>　　这个卦是异卦（下坎上乾）相叠。同需卦相反，互为[综卦]。乾为刚健，坎为险陷。刚与险，健与险，彼此反对，定生争讼。争讼非善事，务必慎重戒惧。<br>　　<font color='yellow'>事业：</font>起初顺利，有利可图，继而受挫，务必警惕，慎之又慎，不得固执已见，极力避免介入诉讼纠纷的争执之中。与其这样，不如退而让人，求得化解，安于正理，可免除意外之灾。陷入争讼，即使获胜，最后还得失去，得不偿失。<br>　　<font color='yellow'>经商：</font>和气生财，吃亏是福。切勿追求不义之财。商业谈判坚持公正公平、互利的原则，尽量避免发生冲突。这样，会有好结果。<br>　　<font color='yellow'>求名：</font>不利。自己尚缺乏竞争实力，应坚守纯正，隐忍自励，自强自勉，切莫逞强。依靠有地位的人的帮助，及早渡过难关。<br>　　<font color='yellow'>外出：</font>途中多有变故，宜改日出行。<br>　　<font color='yellow'>婚恋：</font>虽不尽人意，倒也般配，彼此理解，未尝不可。双方应以温和的方式处理生活。<br>　　<font color='yellow'>交易：</font>不成，事后有经济纠纷。<br>　　<font color='yellow'>求职：</font>利众不利私，三人同求吉。<br>　　<font color='yellow'>求财：</font>不能多得，多则惹官司。<br>　　<font color='yellow'>求官：</font>须迟当得，为副职，六三爻动则不遂。<br>　　<font color='yellow'>升学：</font>虽有口舌，但可成。<br>　　<font color='yellow'>寻人：</font>宜动不宜静。<br>　　<font color='yellow'>见贵：</font>难遂，宜守旧。<br>　　<font color='yellow'>官司：</font>言语口舌引起，宜撤诉。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>争强好胜，不安于现状，为改变命运和超越他人而奋斗。头脑聪颖，反应敏捷，有贵人相助。但缺乏持之以恒的毅力，容易露出锋芒，得罪他人，带来诉讼之灾。宜承认现实，顺其自然，知足，适可而止。接受教训，引以为戒，可功成名就。<br>";
        }
        if (guanameString.equals("遁")) {
            return "第33卦 天山遁（遁卦）  遁世救世<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>浓云蔽日不光明，劝君且莫出远行，婚姻求财皆不利，提防口舌到门庭。<br>　　这个卦是异卦（下艮上乾）相叠。乾为天，艮为山。天下有山，山高天退。阴长阳消，小人得势，君子退隐，明哲保身，伺机救天下。<br>　　<font color='yellow'>事业：</font>时运不佳，应考虑退隐，勿与不正派的人同流合污。但不是消极逃避，而是为保存实力，总结经验，把握时机，待机而出。切忌贸然行事，造成不必要的损失。同时勿为眼前小利禄所诱惑。<br>　　<font color='yellow'>经商：</font>市场进入衰落的状况，行情不佳。决不可执意追求，盲目投入，而应沉着冷静，坚持商业道德，远离小人、奸商，保存自己的实力，等待市场行情好转，再图发展。<br>　　<font color='yellow'>求名：</font>宜暂名哲保身，甘居退隐。全力总结提高，为复出做准备。<br>　　<font color='yellow'>外出：</font>不宜积极行动，而应等待时机，创造条件，争取早日而行。<br>　　<font color='yellow'>婚恋：</font>勿急于解决，更不可妄动强求。时机成熟时，须以纯正的态度去正确对待。<br>　　<font color='yellow'>交易：</font>不利，守旧为好。<br>　　<font color='yellow'>求财：</font>不宜进前，退步吉利，求之有破财之厄。<br>　　<font color='yellow'>求官：</font>迟缓，有阻力，求得亦不利。<br>　　<font color='yellow'>升学：</font>有阻力，换一所学校就读有利。<br>　　<font color='yellow'>官司：</font>旅居他乡，亦有是非之事牵连，可大事化小，无事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>处于衰败时期，小人得志。盲目行动必遭不利。虽不必以恶报恶，但更不可同流合污，因小失大，因权宜轻重，韬光养晦，保存实力，断然离去，不可犹豫不决。潜心发展个人实力，隐忍待机。只要能坚定正道，坚持中正，必可在时机成熟时复出，成就大业。<br>";
        }
        if (guanameString.equals("否")) {
            return "第12卦 天地否（否卦）  不交不通<br>　　中中卦<br>　　<font color='yellow'>象曰：</font>虎落陷坑不堪言，进前容易退后难，谋望不遂自己便，疾病口舌事牵连。<br>　　这个卦是异卦（下坤上乾）相叠，其结构同泰卦相反，系阳气上升，阴气下降，天地不交，万物不通。它们彼此为[综卦]，表明泰极而否，否极泰来，互为因果。<br>　　<font color='yellow'>事业：</font>陷入逆境，事业处于衰退阶段，多有不顺利。受小人干扰而不得志，爱挫折。应坚持正道，勿与小人合流，团结志同道合者，自保以等待时机。保持自信心，戒慎恐惧，形势定会好转，事业终能成功。<br>　　<font color='yellow'>经商：</font>遇到强大的竞争对手，处于不利地位。信息不灵造成重大损失。应格外小心谨慎，坚持守势，等待有利时机到来，再发展自己的营销事业。<br>　　<font color='yellow'>求名：</font> 条件还不成熟，再努力一阵子，并得到他人的帮助，理想可以实现。<br>　　<font color='yellow'>外出：</font>会遇到不少麻烦和困难，宜推迟或提前行动。<br>　　<font color='yellow'>婚恋：</font>容易出现节外生枝的事情，甚至发生挫折和变故，双方若都充满信心，好的结果会出现。<br>　　<font color='yellow'>交易：</font>有贵人相助可成，但中间波折多，利薄。<br>　　<font color='yellow'>求职：</font>先难后易，所求得职业劳累，且薪水不多。<br>　　<font color='yellow'>求财：</font>有口舌是非，有反复，迟得五分财。<br>　　<font color='yellow'>求官：</font>先否后泰终成，职位不高，若得贵人助力，可得高位。<br>　　<font color='yellow'>升学：</font>先难后易，有贵人帮助，虽有阻力，终成。<br>　　<font color='yellow'>官司：</font>有不明之事，有口难言，后得理，大吉。<br>　　<font color='yellow'>行人：</font>身未动，平安，近日有信。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>本人聪慧，精明，勤奋努力，但不注意人际关系，加上小人的排斥，命运或遭厄运。意志坚强，具有奋斗精神，且克服了不足，尽管付出的代价很高，必能成全事业。<br>";
        }
        if (guanameString.equals("夬")) {
            return "第43卦 泽天夬 （夬卦）  决而能和<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>蜘蛛脱网赛天军，粘住游蜂翅翎毛，幸有大风吹破网，脱离灾难又逍遥。<br>　　这个卦是异卦（下乾上兑）相叠。乾为天为健；兑为泽为悦。泽气上升，决注成雨，雨施大地，滋润万物。五阳去一阴，去之不难，决（去之意）即可，故名为夬（guài），夬即决。<br>　　<font color='yellow'>事业：</font>处在兴盛阶段，但已孕育着普遍的危险。务必施恩泽给他人，勿居功自傲，主动团结他人，不干冒险的事。时时提高警惕，防止小人的破坏。但不可莽撞，应持和缓的手段去决断小人，避免过犹不及。<br>　　<font color='yellow'>经商：</font>市场正在走向衰落的状态，不宜大量活动，随时注意转向。开拓新领域时，加强同他人的合作。但务必充分注意别有用心的奸诈小人趁机捣乱和破坏。<br>　　<font color='yellow'>求名：</font>虚心求教，充实自身实力。但应量力而行，不可盲目自大。更不可同小人合流，徒虚名而败坏事业。<br>　　<font color='yellow'>外出：</font>不宜过于频繁，以逸待劳最佳。外出旅行吉利。<br>　　<font color='yellow'>婚恋：</font>防止上介绍人的当，也应注意对方的目的。<br>　　<font color='yellow'>交易：</font>暗中有小人阻扰，几经反复，终成。<br>　　<font color='yellow'>求职：</font>有阻力，坚持求之，可成。<br>　　<font color='yellow'>求财：</font>宜二人同求，先失后得。<br>　　<font color='yellow'>求官：</font>必遂，有反复，虽有小人阻扰，但最终能成。<br>　　<font color='yellow'>升学：</font>有阻力，坚持不懈可成。<br>　　<font color='yellow'>见贵：</font>未遇时机，纵见亦难得助。<br>　　<font color='yellow'>官司：</font>宜急不宜缓，久拖不利。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>性格矛盾，往往表面刚强而内心虚弱，在关键的时刻，败坏事业。虚心听取他人劝告，切勿鲁莽，多谋深思，用柔和的态度待人处世。<br>";
        }
        if (guanameString.equals("兑")) {
            return "第58卦 兑为泽（泽卦）  刚内柔外<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>这个卦象真可取，觉着做事不费力，休要错过这机关，事事觉得随心意。<br>　　这个卦是同卦（下泽上泽）相叠。泽为水。两泽相连，两水交流，上下相和，团结一致，朋友相助，欢欣喜悦。兑为悦也。同秉刚健之德，外抱柔和之姿，坚行正道，导民向上。<br>　　<font color='yellow'>事业：</font>由于善长人际关系，能团结他人，获得援助。因此，各项事业都十分顺利。只要本人坚持中正之道，动机纯正，是非分明，以诚心与人和悦，前途光明。<br>　　<font color='yellow'>经商：</font>很有利。可以取得多种渠道的支持。但在顺利时切莫忘记谨慎小心的原则，尤其警惕上小人的当。<br>　　<font color='yellow'>求名：</font>只要自己目的纯正，并有真才实学，一定可以受到多方面的热情帮助和资助，实现追求目的。<br>　　<font color='yellow'>外出：</font>一路平安，即使遇到困难也会有人帮助，解脱困境。<br>　　婚恋彼此满意，成功的可能性很大。但千万不要过于坚持己见。<br>　　<font color='yellow'>交易：</font>虽有反复，用力必成。<br>　　<font color='yellow'>求职：</font>顺利，可求得一称心职务。<br>　　<font color='yellow'>求财：</font>先难后易，在喜悦中得财。<br>　　<font color='yellow'>求官：</font>必遂，为有实权之职，到任后将有女人喜欢。<br>　　<font color='yellow'>升学：</font>顺利，举家皆乐。<br>　　<font color='yellow'>寻人：</font>无变爻则不可寻，宜等待。<br>　　<font color='yellow'>见贵：</font>可见，有口舌无妨。<br>　　<font color='yellow'>官司：</font>非大事，乃男女是非，有人劝说终和。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>为人聪颖，性格开朗，头脑灵活，心地善良，热心为公众服务，富有组织才能。因此，可以比较顺利地走上领导岗位。但一定要坚持中正原则，秉公办事，不得诌媚讨好上级，更不可欺压民众。永远保持谦虚品德，尤其不可过分自信，否则很容易为坏人包围。<br>";
        }
        if (guanameString.equals("革")) {
            return "第49卦 泽火革（革卦）  顺天应人<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>苗逢旱天渐渐衰，幸得天恩降雨来，忧去喜来能变化，求谋干事遂心怀。<br>　　这个卦是异卦（下离上兑）相叠。离为火、兑为泽，泽内有水。水在上而下浇，火在下而上升。火旺水干；水大火熄。二者相生亦相克，必然出现变革。变革是宇宙的基本规律。<br>　　<font color='yellow'>事业：</font>正处在转折的关键时刻，必须密切注意各种信息，认真思考。首先巩固自己的地位，完善个人的行为。时机成熟后，立即行动，积极进行变革。但应注意动机纯正，手段正当，不保守也不妄进，事业必定发达。<br>　　<font color='yellow'>经商：</font>市场竞争十分激烈。为了立于不败之地，一定要敢于大胆求新，适时改变自己的经营方向，受到挫败，马上总结经验，重新奋起，拓展商业活动。注意竞争方式。<br>　　<font color='yellow'>求名：</font>首先要努力提高自己，完善个人的学识和品德。同时，服从上级指挥搞好工作。二者的关系一定要得到妥善处理。<br>　　<font color='yellow'>外出：</font>十分顺利，积极活动，扩大人际关系。<br>　　<font color='yellow'>婚恋：</font>可能会出现一些节外生枝的麻烦事，应冷静处理，感情专注。<br>　　<font color='yellow'>交易：</font>初阻，七日有信，若是他人找我交易可成。<br>　　<font color='yellow'>求职：</font>可成，有七分可能。<br>　　<font color='yellow'>求财：</font>宜与人同求，有五六分财。<br>　　<font color='yellow'>求官：</font>难成，先有喜讯后落空。<br>　　<font color='yellow'>升学：</font>有阻，宜转学或改报志愿。<br>　　<font color='yellow'>官司：</font>宜和解不宜争胜，有贵人劝和。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>十分吉利、顺利。以自己的聪明才智，顺应形势，根据时代特点，依理而动，变革渐合时宜的事物，壮大自己的事业。但应谨慎，时机不成熟不可妄动，尤忌急功近利。行动之前应三思而行。<br>";
        }
        if (guanameString.equals("随")) {
            return "第17卦 泽雷随（随卦）  随时变通<br>　　中中卦<br>　　<font color='yellow'>象曰：</font>泥里步踏这几年，推车靠崖在眼前，目下就该再使力，扒上崖去发财源。<br>　　这个卦是异卦（下震上兑）相叠，震为雷、为动；兑为悦。动而悦就是[随]。随指相互顺从，己有随物，物能随己，彼此沟通。随必依时顺势，有原则和条件，以坚贞为前提。<br>　　<font color='yellow'>事业：</font>对社会和人生有正确的估价，重视人际关系，善于同他人合作，事业会很顺利。为了保证取得更进一步的成功，不得贪图小利，向比自己优秀的人学习，择善而从，心存诚信、努力开拓事业。<br>　　<font color='yellow'>经商：</font>顺利。在与他人的真诚合作下，能够达到预期的目的。在竞争中应保持清醒头脑，从大处、长远考虑，遵守商业道德，保持至诚的态度对待顾客和同行，会保持竞争优势。<br>　　<font color='yellow'>求名：</font>在自己刻苦钻研的基础上，虚心向有德有才的师长学习，借助外界的力量，促使自己更快的进步，实现个人的理想。<br>　　<font color='yellow'>外出：</font>吉利。可以改变处境。<br>　　<font color='yellow'>婚恋：</font>双方情投意合可以成功，家庭和睦，但若迷恋于情爱，会影响双方的事业，务必注意。<br>　　<font color='yellow'>交易：</font>亦有阻难，但可成。<br>　　<font color='yellow'>求职：</font>迟则可用，遇人可说。<br>　　<font color='yellow'>求财：</font>未可妄动，如遇人相寻则可获的财，非买卖之财。<br>　　<font color='yellow'>求官：</font>只可顺求，待文书到时自然而至。<br>　　<font color='yellow'>升学：</font>通达，路虽有阻而无虑，最终能考上所希望的学校。<br>　　<font color='yellow'>行人：</font>随时而动，有留则止，遇行则行。<br>　　<font color='yellow'>见贵：</font>亦有阻，尽力可见。<br>　　<font color='yellow'>官司：</font>无忧，不久有变，有热心人说和。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>个人成长道路并不十分顺利，但由于谦虚、随和，人际关系好，尤其能够得到长辈的器重，各种事都能在他人的帮助和关心下成功。但务必注意追随他人应有的立场和原则，不可趋炎附势，招致祸凶。<br>";
        }
        if (guanameString.equals("大过")) {
            return "第28卦 泽风大过（大过卦）  非常行动<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>夜晚梦里梦金银，醒来仍不见一文，目下只宜求本分，思想络是空劳神。<br>　　这个卦是异卦（下巽上兑）相叠。兑为泽、为悦，巽为木、为顺，泽水淹舟，遂成大错。阴阳爻相反，阳大阴小，行动非常，有过度形象，内刚外柔。<br>　　<font color='yellow'>事业：</font>事业出现隐患，甚至危机四伏，务必十分小心谨慎，唯有坚守中道，以谦虚和悦的手段，胆大心细，求助他人相助。必要时可采取非常手段，不拘常规，予以冒险。<br>　　<font color='yellow'>经商：</font>操之过急，发展过快，宜收缩调整。竞争处于不利地步，切勿过度自信，更不得刚愎自用，宜随时观测风向，待机行动。在有确切把握之下，不妨冒险，争取时机的好转。<br>　　<font color='yellow'>求名：</font>最忌不务实际，追求不切实际的虚名，以致盛名不符。唯以谦逊态度，谨慎行动，潜心努力，不怕世人指现，一往直前，追求最初的目标。<br>　　<font color='yellow'>外出：</font>行动务必慎重，但不可过于拘泥，必要时不妨采取特殊行动。<br>　　<font color='yellow'>婚恋：</font>自知之明最为重要，不可急于求成，应慎重考虑，并以正当手段，促成事情的成功。但也不排除必要的精明手段。<br>　　<font color='yellow'>交易：</font>可成，宜与异性伙伴合作。<br>　　<font color='yellow'>求职：</font>内外皆有人缘，自然成就，亦待内人来才有分晓。<br>　　<font color='yellow'>求财：</font>为两家之财，与女人共求方遂。<br>　　<font color='yellow'>求官：</font>必遂，文书有阻，得官后有男女是非。<br>　　<font color='yellow'>升学：</font>有阻，即或成也不宜往读。<br>　　<font color='yellow'>行人：</font>外忧内，内忧外，不久有信，四、七、八日可回。<br>　　<font color='yellow'>见贵：</font>先难后易，不可急。<br>　　<font color='yellow'>官司：</font>有内贼为患，有人劝解方可罢休。<br>　　       ※           ※            ※<br>　　<font color='yellow'>决策：</font>处在非常时期，若不能妥善处置，则极为不利，针对实际情况，既不可轻举妄动，也不可优柔寡断，而应刚柔相济，虚心征求他人意见，慎重行动，大胆追求，却又不怕流言，争取时局好转。<br>";
        }
        if (guanameString.equals("困")) {
            return "第47卦 泽水困（困卦）  困境求通<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>时运不来好伤怀，撮上押去把梯抬，一筒虫翼无到手，转了上去下不来。<br>　　这个卦是异卦（下坎上兑）相叠。兑为阴为泽喻悦；坎为阳为水喻险。泽水困，陷入困境，才智难以施展，仍坚守正道，自得其乐，必可成事，摆脱困境。<br>　　<font color='yellow'>事业：</font>境况十分不佳，遭受到很大的困难。人生面临巨大的考验，如采取不正当的手段，会愈陷愈深。相反，如身陷困逆境地而不失节操，自勉自坚，泰然处之。不失其志。终能成事。<br>　　<font color='yellow'>经商：</font>面临激烈竞争，很有破产的可能。切勿失望，而应在困境中奋斗。为此，只能靠平日加强修养。认真反省自己的行为，总结教训，重新奋起，但也不宜浮躁，应缓慢而进。同时，更要警惕因致富发财，得意忘形而陷入新的困境。<br>　　<font color='yellow'>求名：</font>欲速则不达。应以谦虚的态度，缓慢前进，尤应有坚定的志向，唯有志才能促成事业的成功。<br>　　<font color='yellow'>外出：</font>困难多，慎重考虑。<br>　　<font color='yellow'>婚恋：</font>以乐观态度冷静处理，尤应注重人品。<br>　　<font color='yellow'>交易：</font>难成，若用力，反有是非。<br>　　<font color='yellow'>求职：</font>眼下有阻，他人代求，反复可成。<br>　　<font color='yellow'>求财：</font>只可内求，不可外求，九二爻动可成。<br>　　<font color='yellow'>求官：</font>不成，宜安于现职，不生妄念为上。<br>　　<font color='yellow'>升学：</font>不顺，若不努力，会降级。<br>　　<font color='yellow'>官司：</font>若人在狱中，九五爻动可以依该爻辞断。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>聪明智慧，但怀才不遇。若不因困境而失去信心，坚持努力上进，放弃侥幸心理，锲而不舍，虽不一定能守全实现自己的理想，但终会有所成。<br>";
        }
        if (guanameString.equals("咸")) {
            return "第31卦 泽山咸（咸卦）  相互感应<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>运去黄金失色，时来棒槌发芽，月令极好无差，且喜心宽意大。<br>　　这个卦是异卦（下艮上兑）相叠。艮为山；泽为水。兑柔在上，艮刚在下，水向下渗，柔上而刚下，交相感应。感则成。<br>　　<font color='yellow'>事业：</font>和为贵，和则万事兴，务以诚感人，以诚待人。广泛交往朋友，谦虚礼让。树立大志向，坚持主见，不可盲目随大流。不利时应安居待机，不可妄动强求。<br>　　<font color='yellow'>经商：</font>有利可图。但应以纯正之心，以诚待人，加强合作。市场若不景气，决不可妄动，不可强求，而应静待发展。虚心听取不同意见。<br>　　<font color='yellow'>求名：</font>志向应宏大，脚踏实地，虚心请教他人，使人悦而应，帮助、重用自己。切莫自我封闭，更不得冷漠孤僻，以广阔的胸怀发展自身。<br>　　<font color='yellow'>外出：</font>虽希望外出，但暂时不宜远行。待时机成熟时再出行。<br>　　<font color='yellow'>婚恋：</font>成功的可能性极大。双方很有感情，但动机务要纯正，婚姻方可幸福、永久。<br>　　<font color='yellow'>交易：</font>买进顺利，卖出不顺利。<br>　　<font color='yellow'>求职：</font>必成，只有些口舌不妨，若同声相应者在内为福。<br>　　<font color='yellow'>求财：</font>与他人共求之，有同声相应者同事，有望，准得手。<br>　　<font color='yellow'>求官：</font>有旧日恩人助力，必能迁官荣达，宜进不宜退。<br>　　<font color='yellow'>升学：</font>子女争气，不辜负父母期望。<br>　　<font color='yellow'>官司：</font>宜和，为一秀美女人事，可注意，同声相应者是为贵人。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>吉祥如意。人际关系好，善于交际。以真诚的态度，无私的心去处世，不会有不利的地方。与他人合作应坚持原则。办事不可优柔寡断。不顺利时，应停止行动，总结经验，以图发展。待人诚恳，但不可与玩弄口舌的小人交往，防止受骗。<br>";
        }
        if (guanameString.equals("萃")) {
            return "第45卦 泽地萃（萃卦）  荟萃聚集<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>游鱼戏水被网惊，跳过龙门身化龙，三尺杨柳垂金钱，万朵桃花显你能。<br>　　这个卦是异卦相叠（下坤上兑）。坤为地、为顺；兑为泽、为水。泽泛滥淹没大地，人众多相互斗争，危机必四伏，务必顺天任贤，未雨绸缪，柔顺而又和悦，彼此相得益彰，安居乐业。萃，聚集、团结。<br>　　<font color='yellow'>事业：</font>兴旺发达，团结和睦。正在蒸蒸日上，但水多泛滥，人多竞争必然激烈。盛则必衰，切勿骄傲，谨慎小心为好。但也不得犹豫不决，宜勇往直前，开拓新的业务。务以高尚的品德服众。<br>　　<font color='yellow'>经商：</font>真诚合作，团结互助。鼓励是事业兴旺发达的标志。大胆开拓市场，稳妥前进，有备无患，必可取得不断发展。<br>　　<font color='yellow'>求名：</font>光靠个人努力，建树不会很大，定要取得他人的帮助，加上个人的条件方可达到理想的境界。<br>　　<font color='yellow'>外出：</font>出行虽可能遇到小麻烦，但不要害怕，应以大局为重，积极行动。<br>　　<font color='yellow'>婚恋：</font>勿急于求成，相亲相爱，美满幸福。<br>　　<font color='yellow'>交易：</font>必有成就，勿须自疑。<br>　　<font color='yellow'>求职：</font>与男人同求，为女人阻。<br>　　<font color='yellow'>求财：</font>不宜自求，宜与人共求，有七分财，出外求遂。<br>　　<font color='yellow'>求官：</font>迟成，贵人在内助力，得任军官，活司法官职。<br>　　<font color='yellow'>升学：</font>先难后易，可提前求有权人物帮忙，必成。<br>　　<font color='yellow'>行人：</font>目下动身，有妇人阻，有二人在路途虚惊。<br>　　<font color='yellow'>见贵：</font>用力可见。<br>　　<font color='yellow'>官司：</font>有始无终，有二人牵扯在内，得贵人助，终没事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>善于团结他人共同合作，具有领导才能。但心胸宽阔，眼光务必远大，以诚信、中正为本，不失原则，尤其要严格要求自己，宽容他人，遭到他人反对时，应认真反省自己，得出教训，以这种心境处世为人，终生可平安，事业必通达。<br>";
        }
        if (guanameString.equals("大有")) {
            return "第14卦 火天大有（大有卦）  顺天依时<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>砍树摸雀作事牢，是非口舌自然消，婚姻合伙来费力，若问走失未逃脱。<br>　　这个卦是异卦（下乾上离）相叠。上卦为离，为火；下卦为乾，为天。火在天上，普照万物，万民归顺，顺天依时，大有所成。<br>　　<font color='yellow'>事业：</font>事业已经取得一定的成就，最忌得意忘形，胡作非为。务必止恶扬善，坚守中止，交往正直的朋友，戒惧谨慎，兢兢业业，真正做到大而不盈，满而不溢，事业可望迈上新的台阶。<br>　　<font color='yellow'>经商：</font>兴隆昌盛，已摆脱困难状态，进入兴旺发达的阶段，如能克制贪财的心理，确守诚信原则，公平待人，克勤克俭，尤其应时刻注意市场动向，适时转轨，可望长久。<br>　　<font color='yellow'>求名：</font>已经小有名气，切勿就此满足，停顿不前，尤其不可陷入世俗圈内，应继续努力，在真正朋友的帮助下，更上一层楼。<br>　　<font color='yellow'>外出：</font>平安，可动身。<br>　　<font color='yellow'>婚恋：</font>条件优越，可供选择者多，以慎重为好。对于家庭双方应尽力维护。<br>　　<font color='yellow'>交易：</font>可成，防酒色是非。<br>　　<font color='yellow'>求职：</font>动而必得，所得职位收入较丰。<br>　　<font color='yellow'>求财：</font>动有静无，得贵人助，不用费大力，有十分财。<br>　　<font color='yellow'>求官：</font>显达，得较高官位，且薪金丰厚。<br>　　<font color='yellow'>升学：</font>顺之又顺，如高考定能考上重点大学。<br>　　<font color='yellow'>见贵：</font>初阻后顺，能得贵人赏识。<br>　　<font color='yellow'>官司：</font>大事化小，小事有头无尾，得贵人劝和。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>性格坚强，勇于战胜困难，奋斗向上，前进途中困难和厄运很多，唯有认真对待才能不断取得成功，如放松警惕，骄傲自满，将带来惨重失败。朋友很多，交际广泛，对事业很有帮助，但其中也有拆台的小人。<br>";
        }
        if (guanameString.equals("睽")) {
            return "第38卦 火泽睽（睽卦）  异中求同<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>此卦占来运气歹，如同太公作买卖，贩猪牛快贩羊迟，猪羊齐贩断了宰。<br>　　这个卦是异卦（下兑上离）相叠。离为火；兑为泽。上火下泽，相违不相济。克则生，往复无空。万物有所不同，必有所异，相互矛盾。睽即矛盾。<br>　　<font color='yellow'>事业：</font>事业开创困难，处境艰辛。如能志同道合，相互信任，目的可以达到。但起初成功的多是小事。小事积累可成大事。事成于协力合作，败于众志相异。应加强团结，委曲以求相通。最忌内部相互猜疑。<br>　　<font color='yellow'>经商：</font>应以心平气和的态度投入市场竞争，求大同而存小异。对竞争对手不应敌视，可和而不流，群而不党。尤其不能惹起纠纷，极力避免灾祸。<br>　　<font color='yellow'>求名：</font>以真诚的心努力上进。对于恶人必要时亦不可完全不交往，应采取宽大包容的态度，适度往来。对志同道合者也不必完全一致，可异中求同。<br>　　<font color='yellow'>外出：</font>顺利。途中可以得到善人相助。<br>　　<font color='yellow'>婚恋：</font>双方必真诚相待。否则，第三者极易介入，夫妻相疑则家破。<br>　　<font color='yellow'>交易：</font>反复，若成必有是非。<br>　　<font color='yellow'>求职：</font>可成，先难后易，终成。<br>　　<font color='yellow'>求财：</font>二人同求方可得三四分财，不宜独求不明之财。<br>　　<font color='yellow'>求官：</font>反复难成，若得女贵人助方遂。<br>　　<font color='yellow'>升学：</font>有阻，宜与家长沟通意见，消除矛盾后方可成。<br>　　<font color='yellow'>见贵：</font>难见，有人从中作梗。<br>　　<font color='yellow'>官司：</font>宜和，事小气大，先争后合。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>处于矛盾、对应状态。必须注意以宽宏大度、平和、柔顺的态度对待人生。这样才能心平气和，柔而上进。认清合必有离，离必有合；同中有异，异中有同的道理。否则，刚极暴躁，明极生疑。暴疑皆可致命。<br>";
        }
        if (guanameString.equals("离")) {
            return "第30卦 离为火（离卦）  附和依托<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>官人来占主高升，庄农人家产业增，生意买卖利息厚，匠艺占之大亨通。<br>　　这个卦是同卦（下离上离）相叠。离者丽也，附着之意，一阴附丽，上下二阳，该卦象征火，内空外明。离为火、为明、太阳反复升落，运行不息，柔顺为心。<br>　　<font color='yellow'>事业：</font>已快进入顶点，盛极而衰，务必总结经验教训，趋善避邪，以顺自养，居危知危，激励志气，切勿妄动。尤应求助中正的人援助，以期重振事业。<br>　　<font color='yellow'>经商：</font>戒急于求成，宜兢兢业业，忧深虑远，考察市场行情，公平竞争，不可投机取巧。争取与他人密切合作。<br>　　<font color='yellow'>求名：</font>方向未确定之前，不可到处乱撞，应持之以恒，执意追求，虚心向有才德的长者请教。<br>　　<font color='yellow'>外出：</font>可行动，事先应准备充分，不可仓促上路。<br>　　<font color='yellow'>婚恋：</font>自己寻找对象恐怕有困难，最好请可靠的朋友、长辈帮忙，不得急躁。双方应相互尊敬，最忌生邪念。<br>　　<font color='yellow'>交易：</font>两人合伙一人得利，有口舌。<br>　　<font color='yellow'>求职：</font>不宜动，有阻隔，进则有损。<br>　　<font color='yellow'>求财：</font>先求得，后失财。<br>　　<font color='yellow'>求官：</font>有望，不宜急求，官运自来。<br>　　<font color='yellow'>升学：</font>成绩不佳，求权势人物帮忙可成。<br>　　<font color='yellow'>寻人：</font>不宜相寻，恐有伤他人，若有信来，皆为虚报。<br>　　<font color='yellow'>见贵：</font>力求进前可见。<br>　　<font color='yellow'>官司：</font>内动外则凶，宜同行业熟人调停，否则，结果两败俱伤。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>乐天知命，顺应自然，年轻时急于上进，未能实现理想，但坚持中正、谦和，可无灾祸，时常警觉，更可化险为夷。在危难时要寻求依托，但要慎重选择对象。晚年应知天命，尤不可不顾时势而轻举妄图动。<br>";
        }
        if (guanameString.equals("噬嗑")) {
            return "第21卦 火雷噬嗑（噬嗑卦）  刚柔相济<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>运拙如同身受饥，幸得送饭又送食，适口充腹心欢喜，忧愁从此渐消移。<br>　　这个卦是异卦（下震上离）相叠。离为阴卦；震为阳卦。阴阳相交，咬碎硬物，喻恩威并施，宽严结合，刚柔相济。噬嗑（shihe）为上下颚咬合，咀嚼。<br>　　<font color='yellow'>事业：</font>困难与阻力非常大，应以坚强的意志，果敢的行为，公正无私的态度去战胜种种厄运，争取事态好转。为了早日化险为夷，必要时可采取强硬手段，甚至诉诸法律。<br>　　<font color='yellow'>经商：</font>处于不利的时候，头脑冷静，明察形势，寻求机遇，不为眼前小利所诱，不发非分之财。认真听取忠告，遵守法纪，秉公办事，不得徇私情，更警惕不得触犯刑律。<br>　　<font color='yellow'>求名：</font>自己的努力尚不为人所知，不可急于求成，受到挫折应看作是对自己的考验，持之以恒，必能成功。<br>　　<font color='yellow'>外出：</font>另择他日为佳。若非出门不可，务必充分准备，小心为是。<br>　　<font color='yellow'>婚恋：</font>初不顺利，须有顽强精神可以取得满意的结果，不可以个的情绪左右家庭事务。<br>　　<font color='yellow'>交易：</font>力求则可，不可半途而废。<br>　　<font color='yellow'>求职：</font>宜两人求，先难后易，或有口舌。<br>　　<font color='yellow'>求财：</font>若独求可，若两人求，不容易得到。<br>　　<font color='yellow'>求官：</font>得中级官职，宜速求。<br>　　<font color='yellow'>升学：</font>有阻，能成，要过两重难关方可考上。<br>　　<font color='yellow'>行人：</font>欲行不行之兆，不久见信。<br>　　<font color='yellow'>见贵：</font>反复进往可见。<br>　　<font color='yellow'>官司：</font>若四爻动，则有外地官司，解决宜早不宜迟。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>一生不平坦，会遇到挫折和磨难，但应看作是对个人的考验，应认真总结经验教训，以更为坚强的意志，不屈不挠，继续前进。经过锻炼，各方面都会有较大的进展，终将进入光明境地，取得重大成就。<br>";
        }
        if (guanameString.equals("鼎")) {
            return "第50卦 火风鼎（鼎卦）  稳重图变<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>莺鹜蛤蜊落沙滩，蛤蜊莺鹜两翅扇，渔人进前双得利，失走行人却自在。<br>　　这个卦是异卦（下巽上离）相叠。燃木煮食，化生为熟，除旧布新的意思。鼎为重宝大器，三足稳重之象。煮食，喻食物充足，不再有困难和困扰。在此基础上宜变革，发展事业。<br>　　<font color='yellow'>事业：</font>具备开拓事业的各种条件。耳聪目明，头脑冷静，应以端正的态度去为人处世，严于律已，慎终如始，刚柔兼备，与有才德的人合作，勿妄进失度，无往不利。<br>　　<font color='yellow'>经商：</font>经过一番奋斗，已经可以比较顺利地发展自己的商业活动，遇到困难也能够克服。如果坚持商业道德，参与正常竞争活动，无轻举妄动和邪思，刚中自守，商业可大发展，但若不量入为出，坐吃山空，必败业。<br>　　<font color='yellow'>求名：</font>首先应实德积识，严于律已，不陷入与他人的怨仇之中，柔而上行，循序渐进。得到知人者的善用，更是前途广大。<br>　　<font color='yellow'>外出：</font>无重大事情不宜外出。为发展事业外出顺利。<br>　　<font color='yellow'>婚恋：</font>个人条件比较理想，顺利，但勿不切合自己的实际。<br>　　<font color='yellow'>交易：</font>必成，有是非口舌，但无妨碍。<br>　　<font color='yellow'>求职：</font>远方求职顺利。<br>　　<font color='yellow'>求财：</font>三人求，先难后易，有八分财。<br>　　<font color='yellow'>求官：</font>必遂，有小人阻，但最终能被慧眼首长提拔重用。<br>　　<font color='yellow'>升学：</font>大吉，定能考上重点大学。<br>　　<font color='yellow'>行人：</font>恐途中与陌生人同行，小有忧虑，三人中一人不合。<br>　　<font color='yellow'>官司：</font>因小是非起，宜劝和。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>天资聪颖，反应敏捷，头脑灵活，具备随机应变，随时应变和随势应变的能力。因此，前程远大，即使暂时不受重视，无出路也无妨，最终可实现抱负。<br>";
        }
        if (guanameString.equals("未济")) {
            return "第64卦 火水未济 （未济卦）  事业未竟<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>离地着人几丈深，是防偷营劫寨人，后封太岁为凶煞，时加谨慎祸不侵。<br>　　这个卦是异卦（下坎上离）相叠 。离为火，坎为水。火上水下，火势压倒水势，救火大功未成，故称未济。《周易》以乾坤二卦为始，以既济、未济二卦为终，充分反映了变化发展的思想。<br>　　<font color='yellow'>事业：</font>处于最后的关键时刻，成功与否就在眼前。因此务必不可掉以轻心。自我节制非常重要，坚持到底，必要时也可能慎重地进行适度冒险，以成就事业。<br>　　<font color='yellow'>经商：</font>市场处于大变动的前夕，前景如何尚不明显。这是最为艰苦的时期，头脑必冷静，切勿冒险，不可行动过度，适度节制，观察动向，决定行动。<br>　　<font color='yellow'>求名：</font>长期的努力和追求即会有结果。在成败的关键时刻应泰然自若，听天由命，顺其自然。<br>　　<font color='yellow'>外出：</font>行动难达愿望，最好改日而行。<br>　　<font color='yellow'>婚恋：</font>已经渡过了困难阶段，再慎重地加把劲，会有美满的结果。<br>　　<font color='yellow'>交易：</font>先难后易，有三分财运，易被女人冲散。<br>　　<font color='yellow'>求财：</font>有三分财，先难后易，恐被女人冲散。<br>　　<font color='yellow'>求官：</font>反复努力，可得一小官正职。<br>　　<font color='yellow'>升学：</font>终不能成，复读再考顺利。<br>　　<font color='yellow'>行人：</font>有四人同行，虽有口舌无妨。<br>　　<font color='yellow'>官司：</font>终和，不了了之。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>此卦的意思是[未完成]，表明前途无量，有充分发展的可能。因此，必须坚持中正的原则，以明智、中庸、诚信、谦逊的态度，成就事业。面对人生，唯有勤勤恳恳，极力尽人事，听天命，不必过分计较成功与否。<br>";
        }
        if (guanameString.equals("旅")) {
            return "第56卦 火山旅（旅卦）  依义顺时<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>飞鸟树上垒窝巢，小人使计举火烧，君占此卦为不吉，一切谋望枉徒劳。<br>　　这个卦是异卦（下艮上离）相叠。此卦与丰卦相反，互为[综卦]。山中燃火，烧而不止，火势不停地向前蔓延，如同途中行人，急于赶路。因而称旅卦。<br>　　<font color='yellow'>事业：</font>正处于创业、发展的阶段，各种困难很多。只要能坚持中正的方针，依正道办事，注意调查，处处小心谨慎，并根据情况的变化，采取应变措施，事业可顺利前进。<br>　　<font color='yellow'>经商：</font>市场行情犹如旅途一样，意想不到的情况，会随时发生。因此，首先应采取慎重的原则，不要冒险。但也不应缩手缩脚，尤其不要猜疑。开发市场之前，应进行充分的调查研究。<br>　　<font color='yellow'>求名：</font>根据时代的要求，丰富自己的知识和能力，不断提高自己，并且争取得到他人的相助。<br>　　<font color='yellow'>外出：</font>很顺利，且经常出行。因此，要时时注意安全。<br>　　<font color='yellow'>婚恋：</font>双方的不确定因素较多，如确有感情，可顺其发展，再行确定。婚姻美满。<br>　　<font color='yellow'>交易：</font>宜缓，久后方有贵人助力，必就。<br>　　<font color='yellow'>求职：</font>宜往外方，一人独求则利，不可信他人。<br>　　<font color='yellow'>求财：</font>宜远求，宜慢不宜急，静则有二三分财。<br>　　<font color='yellow'>求官：</font>急求不遂，宜迟缓。<br>　　<font color='yellow'>升学：</font>难成，如非考大学则可成。<br>　　<font color='yellow'>行人：</font>远在外地，虽有阻无妨，有信为虚信。<br>　　<font color='yellow'>见贵：</font>迟则可见，初求不如意，须再求。<br>　　<font color='yellow'>官司：</font>有理亦宜和，若不和，有灾。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>人生处于多变状态，一定要眼光远大，树立大志向，不断地充实自己，以诚心实意和谦虚的态度去待人处事，勿计较一时得失，广泛交际朋友。人生旅途十分顺利。<br>";
        }
        if (guanameString.equals("晋")) {
            return "第35卦 火地晋（晋卦）  求进发展<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>锄地锄去苗里草，谁想财帛将人找，一锄锄出银子来，这个运气也算好。<br>　　这个卦是异卦（下坤上离）相叠。离为日，为光明；坤为地。太阳高悬，普照大地，大地卑顺，万物生长，光明磊落，柔进上行，喻事业蒸蒸日上。<br>　　<font color='yellow'>事业：</font>顺利。应遵守正道，迎难而上，克敌制胜，因势利导。树立良好的人际关系，深得人心。全力以赴，不得有丝毫犹豫不决，更忌优柔寡断，而应败不馁，勇往直前。注意和衷共济，共同前进。<br>　　<font color='yellow'>经商：</font>行情好。市场竞争顺利。但也会遇到一些困难，必迎难而上，因势利导，克敌制胜。争取众人支持。前进中的挫折不可免，只要动机纯正，必可转危为安。<br>　　<font color='yellow'>求名：</font>经刻苦努力与奋斗，已具备开拓事业的基础，却因无人引荐，暂时不得志，决不可因此自暴自弃，须耐心等待时机。同时，更加积极地创造条件。<br>　　<font color='yellow'>外出：</font>克服犹豫心理，大胆前进，可无往而不顺。<br>　　<font color='yellow'>婚恋：</font>吉星高照。会有理想的结果，但决不可自恃条件优越而抱无所谓的态度或过于挑剔。<br>　　<font color='yellow'>交易：</font>可成，一年内成交三笔买卖。<br>　　<font color='yellow'>求职：</font>二次得之，或用他人代求方得。<br>　　<font color='yellow'>求财：</font>不可独求，须二人同求，虽反复终得。<br>　　<font color='yellow'>求官：</font>须托人求方可，恐有人阻扰，但可成。<br>　　<font color='yellow'>升学：</font>顺利，若考大学定考上。<br>　　<font color='yellow'>见贵：</font>可见，托人引见方可。<br>　　<font color='yellow'>官司：</font>二人官司，内外不和，自身不可动，终能得理。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>处于不断上升的形势，不会有过大的阻力。但务必争取众人信任，获取人心，再接再厉，只要动机纯正，克服侥幸心理，必有喜从天降。<br>";
        }
        if (guanameString.equals("大壮")) {
            return "第34卦 雷天大壮（大壮卦）  壮勿妄动<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>卦占工师得大木，眼前该着走上路，时来运转多顺当，有事自管放心宽。<br>　　这个卦是异卦（下乾上震）相叠。震为雷；乾为天。乾刚震动。天鸣雷，云雷滚，声势宏大，阳气盛壮，万物生长。刚壮有力故曰壮。大而且壮，故名大壮。四阳壮盛，积极而有所作为，上正下正，标正影直。<br>　　<font color='yellow'>事业：</font>处世凭智不凭力，有勇更有谋，切忌蛮干，该守不守，自取其凶。不可逞强，否则自取凶险。对小人应有防犯，尤其不得忽视小人的奸诈。对事业应勇往直前，但切忌冒进。<br>　　<font color='yellow'>经商：</font>处在高涨阶段，形势很好。但决不可逞强，更不可妄动，应主动增强与他人的合作。提高警惕，认识物极必反的道理，做事业衰退的准备。<br>　　<font color='yellow'>求名：</font>务必注意妥善地运用自己的力量，不可自恃刚健强壮而冒进。尤其不可自负。适当发挥自己的才干，加上外力的援助，必有所作为。<br>　　<font color='yellow'>外出：</font>慎重外出，不可莽撞，否则不吉利。<br>　　<font color='yellow'>婚恋：</font>决不可因自己条件好而高傲。切勿错过好姻缘。<br>　　<font color='yellow'>交易：</font>难成，若用智谋诱导后方可成。<br>　　<font color='yellow'>求职：</font>先难后易，最终成功。<br>　　<font color='yellow'>求财：</font>有疑虑，说有未有，得到亦不成财。<br>　　<font color='yellow'>求官：</font>必有迁升之职，先难后易，托人转求必成。<br>　　<font color='yellow'>升学：</font>可成，一次考试便获通过。<br>　　<font color='yellow'>行人：</font>有二人同行，有惊恐，不久将至，九二爻动则迟归。<br>　　<font color='yellow'>见贵：</font>须要求人引荐方得见。<br>　　<font color='yellow'>官司：</font>有惊无事，将得到有地位的朋友相助。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>强健适中，不可过分消耗自己的力量。在事业顺利的时刻，尤其不可妄动。更应注意，很可能已经处于进退维谷的状态，务必自保待机，及早有所准备。<br>";
        }
        if (guanameString.equals("归妹")) {
            return "第54卦 雷泽归妹（归妹卦）  立家兴业<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>求鱼须当向水中，树上求之不顺情，受尽爬揭难随意，劳而无功运平平。<br>　　这个卦是异卦（下兑上震）相叠。震为动、为长男；兑为悦、为少女。以少女从长男，产生爱慕之情，有婚姻之动，有嫁女之象，故称归妹。男婚女嫁，天地大义，人的开始和终结。上卦与渐卦为综卦，交互为用。<br>　　<font color='yellow'>事业：</font>正在进入新的阶段，很快将会出现另一番景象。这时首先必须具备远大眼光，识破利弊和吉凶，有备始能无患。其次是坚守纯正的品德和正确的原则。<br>　　<font color='yellow'>经商：</font>开拓新的市场即将成功。在未来的商业活动中必须注意经营的方向和种类，加强与他人合作。<br>　　<font color='yellow'>求名：</font>务必以坚定的决心，努力提高自己，为成名立业奠定基础，最可怕是儿女情长影响了自己的前途和事业。<br>　　<font color='yellow'>外出：</font>十分顺利，即便发生意外也会有人相助。<br>　　<font color='yellow'>婚恋：</font>顺其自然，不可违背原则，尤其不可强求，宁可晚婚也要选择理想的对象。夫妻经过生活考验，可和谐到老。<br>　　<font color='yellow'>交易：</font>有事情自扰，难有成就。<br>　　<font color='yellow'>求职：</font>难成，若为少女求职可成，但就职后有隐私是非。<br>　　<font color='yellow'>求财：</font>女贵人为助，可得二三分财。<br>　　<font color='yellow'>求官：</font>求小得大，因裙带关系而得。<br>　　<font color='yellow'>升学：</font>就近不就远，有阻不顺。<br>　　<font color='yellow'>见贵：</font>有阻难见。<br>　　<font color='yellow'>官司：</font>因女人事暧昧不清，虽有是非，最终无事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>对于人生必须坚持公正纯洁的品德，正确对待婚姻和家庭，以幸福美满的家庭为基础，开拓和发展自己的事业。<br>";
        }
        if (guanameString.equals("丰")) {
            return "第55卦 雷火丰（丰卦）  日中则斜<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>古镜昏暗好几年，一朝磨明似月圆，君子谋事逢此卦，近来运转喜自然。<br>　　这个卦是异卦（下离上震）相叠，电闪雷鸣，成就巨大，喻达到顶峰，如日中天。告戒；务必注意事物向相反方面发展。治乱相因，盛衰无常，不可不警惕。<br>　　<font color='yellow'>事业：</font>处于十分顺利的鼎盛时期，各方面都很顺利，成就很大。但务必注意开始出现的衰败症状，防微杜渐，严防骄傲自满。同时，不必盲目追求不切实际的事情，全力保持当前状况的延长。<br>　　<font color='yellow'>经商：</font>由于准确地把握了市场动态，商情对自己十分有利，可以大胆发展，但一定要密切注意行情，分析信息，稍有不慎，破产可能在一夜间。一旦破产应立即总结教训寻求真诚的合作者，早日走出困境。<br>　　<font color='yellow'>求名：</font>经过努力和奋斗，已获得成就，应注意保持和稳步发展，切勿追求虚名。<br>　　<font color='yellow'>外出：</font>十分顺利。但应提高警惕，防止乐极生悲。<br>　　<font color='yellow'>婚恋：</font>可以成功，也会美满幸福，但若一方自持条件变化而动摇，则会导致不利。<br>　　<font color='yellow'>交易：</font>无变爻可大成，若九四、九五爻动则小成。<br>　　<font color='yellow'>求职：</font>先难后易。<br>　　<font color='yellow'>求财：</font>得而失，失而复得，有七分财。<br>　　<font color='yellow'>求官：</font>即将有消息，当为文化官员。<br>　　<font color='yellow'>升学：</font>有望，本人或子女考大学皆顺利。<br>　　<font color='yellow'>行人：</font>有阻隔，为他人所耽搁。<br>　　<font color='yellow'>官司：</font>小事变大，多反复，后必和解。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>由于个人天资聪颖，条件好，因此各方面十分顺利。但务必深刻认识人生无常的真理，一切应保持适度，切记物极必反。更不应自我封闭，陷入困境，切莫灰心。<br>";
        }
        if (guanameString.equals("震")) {
            return "第51卦 震为雷（震卦）  临危不乱<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>一口金钟在淤泥，人人拿着当玩石，忽然一日钟悬起，响亮一声天下知。<br>　　这个卦是同卦（下震上震）相叠。震为雷，两震相叠，反响巨大，可消除沉闷之气，亨通畅达。平日应居安思危，怀恐惧心理，不敢有所怠慢，遇到突发事变，也能安然自若，谈笑如常。<br>　　<font color='yellow'>事业：</font>处于不顺利、甚至面临危险的局面，对此务必提高警惕，有备方可无患，一旦出现突发事件，可以泰然处之，并且可以由此引吸取教训，一方面使损失减少，另一方面可以迅速复原，使事业迈上新的高度。<br>　　<font color='yellow'>经商：</font>在激烈的商场竞争中，随时可能出现问题，陷入困境。冷静、从容地应付到来的现实，坚持不偏不激的中正原则，以刚毅的态度，从容不迫地去战胜困难。经过一番危机后，一定可以获得巨大利益。<br>　　<font color='yellow'>求名：</font>很可能会遭到挫折。不必灰心，而应自我反省，找出问题的症结所在。<br>　　<font color='yellow'>外出：</font>大胆出行，不必理会小的灾祸。<br>　　<font color='yellow'>婚恋：</font>恋爱和家庭都可能出现变故，应以冷静态度处理，会有理想的结果。<br>　　<font color='yellow'>交易：</font>静中求利，动极难成。<br>　　<font color='yellow'>求职：</font>难成，辰巳日得此卦方遂。<br>　　<font color='yellow'>求财：</font>难成，宜防钱财有失。<br>　　<font color='yellow'>求官：</font>春夏测之，必迁高位，秋冬测之难求，亦无名声之兆。<br>　　<font color='yellow'>升学：</font>有阻，求人亦难有成。<br>　　<font color='yellow'>见贵：</font>与女贵人同往可见。<br>　　<font color='yellow'>官司：</font>因男女关系而有惊，多反复。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>处于人生的转折关头。应正确地总结过去，为开拓新的事业奠定基础。在前进的道路上应随时心怀恐惧，勤勤恳恳，坚持正确原则，在困难中前进，命运亨通。<br>";
        }
        if (guanameString.equals("恒")) {
            return "第32卦 雷风恒（恒卦）  恒心有成<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>鱼翁寻鱼运气好，鱼来撞网跑不了，别人使本挣不来，谁想一到就凑和。<br>　　这个卦是异卦（下巽上震）相叠。震为男、为雷；巽为女、为风。震刚在上，巽柔在下。刚上柔下，造化有常，相互助长。阴阳相应，常情，故称为恒。<br>　　<font color='yellow'>事业：</font>诸事无不成于恒，持之以恒，必有成效。恒乃成功之本。为此，务必动机纯正，守静而勿躁动，不可急于求成，也不可固守死道，应从个人实际出发。最忌人云亦云，最宜随机应变。如此，诸事顺而成。<br>　　<font color='yellow'>经商：</font>大胆行动，有所往必有所利。注意市场行情和周围的情况。随时变化经营策略，但不得改变常理常道，坚持慎重选择的方向，勿追随潮流。忌不自量而冒险强求。<br>　　<font color='yellow'>求名：</font>有始有终，善始善终，立于正道，坚持不懈，学习方面尤应提高涵养，必可成。<br>　　<font color='yellow'>外出：</font>果敢行动，有利。<br>　　<font color='yellow'>婚恋：</font>好事多磨，有曲折，唯不可见异思迁，和睦相处，勿固执己见。<br>　　<font color='yellow'>交易：</font>得贵人扶持，不久即成。<br>　　<font color='yellow'>求职：</font>有望，防人阻扰，努力终成。<br>　　<font color='yellow'>求财：</font>城市中求易得，乡村求难得。<br>　　<font color='yellow'>求官：</font>有阻，应有耐心多方努力方可成。<br>　　<font color='yellow'>升学：</font>虽有阻，但经努力可成。<br>　　<font color='yellow'>寻人：</font>宜缓，若欲速须二人同往。<br>　　<font color='yellow'>见贵：</font>可遂，所求见之贵人能给你帮助。<br>　　<font color='yellow'>官司：</font>因口舌引起，有惊无患，宜庭外和解。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>循序渐进，不得在一开始期望过高，但不得因此放弃追求，应脚踏实地，从实际也发，不要好高骛远，更不可不自量，勿冒险激进，勿反复无常。坚信宇宙常新，不断修正自己的见解，补充新内容。<br>";
        }
        if (guanameString.equals("解")) {
            return "第40卦 雷水解（解卦）  柔道致治<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>目下月令如过关，千辛万苦受熬煎，时来恰相有人救，任意所为不相干。<br>　　这个卦是异卦（下坎上震）相叠。震为雷、为动；坎为水、为险。险在内，动在外。严冬天地闭塞，静极而动。万象更新，冬去春来，一切消除，是为解。<br>　　<font color='yellow'>事业：</font>元气初复，宜休养生息，安静平易为佳，宜宽宜和。当准备就绪则应立即行动，争取主动，不可拖廷，所往必有功利。但切勿贪得无厌。克勤克俭，刚柔相济，以柔为主。远辟小人，团结君子，相互依托，共成事业。<br>　　<font color='yellow'>经商：</font>行动贵神速，积极而为，方可摆脱险境。行商宜循正道，切勿招摇过市。此乃愚蠢行动，必自招灾祸。<br>　　<font color='yellow'>求名：</font>初出茅庐，应继续充实自己。待机行动。尤应远小人近君子和有才德的人，以期迅速提高自己。<br>　　<font color='yellow'>外出：</font>一旦准备充分，立即行动，捷足先登必有所获。<br>　　<font color='yellow'>婚恋：</font>应适时进行。夫妻和衷共济，可家庭和睦，免除灾难。<br>　　<font color='yellow'>交易：</font>有阻隔，久终成。<br>　　<font color='yellow'>求职：</font>未遂，久等不见回音。<br>　　<font color='yellow'>求财：</font>向西北方，三次方求得，可得七八分财。<br>　　<font color='yellow'>求官：</font>须三五次方可，只能调任副职。<br>　　<font color='yellow'>升学：</font>有阻，再考或改志愿可成。<br>　　<font color='yellow'>见贵：</font>可遂，宜速往可见。<br>　　<font color='yellow'>官司：</font>宜解不宜结，久拖不利，尽快和解为好。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>稳妥为宜，亦不应冒险，因一切尚在元气初复阶段。为争取大发展，务必宽以待人，以柔致治，广交贤者，遣散小人，以中庸、正直的方式，张驰结合的手段，开拓方兴未艾的事业。<br>";
        }
        if (guanameString.equals("小过")) {
            return "第62卦 雷山小过（小过卦）  行动有度<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>行人路过独木桥，心内惶恐眼里瞧，爽利保保过得去，慢行一定不安牢。<br>　　这个卦是异卦（下艮上震）相叠。艮为山，震为雷，过山雷鸣，不可不畏惧。阳为大，阴为小，卦外四阴超过中二阳，故称[小过]，小有越过。<br>　　<font color='yellow'>事业：</font>行动宜谨慎小心，切勿冒险，尤其不得钻营。但只要坚持正当的行为，可勇敢向前，努力奋斗，开拓事业。不过，一定要把握尺度，不要好高骛远，以免招致灾祸。随机应变是关键。<br>　　<font color='yellow'>经商：</font>对市场行情不十分掌握，可先稍试探一下，随即收敛行为。否则会导致危险。不应大规模行动，也不必胆小怕事。稳扎稳打，逐步发展。<br>　　<font color='yellow'>求名：</font>应遵循中正的原则和循序渐进的道理，求得稳步前进。切勿追求虚名，更不得不顾实际情况攀高位。<br>　　处出：慎重考虑和做好充分准备后再外出，否则不利。<br>　　<font color='yellow'>婚恋：</font>应较长时间的彼此了解，不可仓促行事。<br>　　<font color='yellow'>交易：</font>难成，做点小生意有薄利。<br>　　<font color='yellow'>求职：</font>慢则成，急则有口舌。<br>　　<font color='yellow'>求财：</font>宜出外求，未有分晓，小望则可，大望有失。<br>　　<font color='yellow'>求官：</font>难遂，即使得官，上任不久即会改任副职。<br>　　<font color='yellow'>升学：</font>一般升级无碍，考大学无望。<br>　　<font color='yellow'>行人：</font>在途中，身动便至。<br>　　<font color='yellow'>官司：</font>咎由自取，宜安守本份。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>行动必须把握分寸，适可而止。盛时应防止办事过火，应即时收敛自己。过度将不足成事，反会招祸。一切行动都要因应变通，不可固执。<br>";
        }
        if (guanameString.equals("豫")) {
            return "第16卦 雷地豫（豫卦）  顺时依势<br>　　中中卦<br>　　<font color='yellow'>象曰：</font>太公插下杏黄旗，收妖为徒归西歧，自此青龙得了位，一旦谋望百事宜。<br>　　这个卦是异卦（下坤上震）相叠，坤为地，为顺；震为雷，为动。雷依时出，预示大地回春。因顺而动，和乐之源。此卦与谦卦互为综卦，交互作用。<br>　　<font color='yellow'>事业：</font>十分顺利，事业可以获得成功，但必须符合实际，顺应潮流，且得自己努力奋斗，树立远大目光，尤其不可因事业的顺利而放松谨慎小心的态度，陷于懒散享乐。否则，必将后悔莫及。<br>　　<font color='yellow'>经商：</font>时运已到，应大胆行动，即使发生挫折，也可以很快化险为夷。应加强同他人的合作，开诚布公，共同开发事业。<br>　　<font color='yellow'>求名：</font>天资聪颖，如能坚守正直的品德，严格要求自己，努力上进，不因有成绩骄傲满足，停止前进，而是兢兢业业，不惰不怠，必定可以有重大成功。<br>　　<font color='yellow'>外出：</font>充分准备，从容出发，会十分顺利和平安。<br>　　<font color='yellow'>婚恋：</font>十分顺利，一生顺利和吉祥，但万不可掉以轻心，更不可玩弄感情，否则将会出现悲剧。<br>　　<font color='yellow'>交易：</font>宜秋成，得贵人力，反复终成。<br>　　<font color='yellow'>求职：</font>成，主动往求难成。<br>　　<font color='yellow'>求财：</font>逢四五动吉，有两重财。<br>　　<font color='yellow'>求官：</font>迟可成，当于酒色宴饮中托人求方成。<br>　　<font color='yellow'>升学：</font>可成，须防学子玩物丧志，懈怠学业。<br>　　<font color='yellow'>行人：</font>不久便归，略有失，行人在外吉。<br>　　<font color='yellow'>见贵：</font>宜速，宜于酒色饮宴中见。<br>　　<font color='yellow'>官司：</font>有头无尾，不见官只是破小财。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>一生顺利，不会出现大的波折，容易比较顺利得到自己应该得到的。但关键在于自己的努力和奋斗，不得耽于安乐，不可玩物丧志。豁达、大度更有利于健康和长寿。一旦遇到意外的灾害，只要时时严格要求自己，坚守纯正，乐不忘忧，居安思危，必可转危为安。<br>";
        }
        if (guanameString.equals("小畜")) {
            return "第9卦 风天小畜（小畜卦）  蓄养待进<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>苗逢旱天尽焦梢，水想云浓雨不浇，农人仰面长吁气，是从款来莫心高。<br>　　这个卦是异卦（下乾上巽）相叠，乾为天；巽为风。喻风调雨顺，谷物滋长，故卦名小畜（蓄）。力量有限，须待发展到一定程度，才可大有作为。<br>　　<font color='yellow'>事业：</font>时机尚不成熟，应当耐心而积极地积存力量，切不可冒险行动。遇到挫折不可灰心，鼓起勇气战胜困难，坚持原则，加强团结合作，提前做好各项准备，会有所成。<br>　　<font color='yellow'>经商：</font>已有一定的基础，但有失去危险，一定要特别慎重，争取与他人真诚合作，共同获利，决不贪心，适可而止，但更不能满足现状，不图进取。<br>　　<font color='yellow'>求名：</font>树立远大目标，尽最大努力去争取，虚心求教他人，取得真诚帮助，实现自己的理想，警惕小人的破坏。<br>　　<font color='yellow'>外出：</font>准备尚未充分，不得仓促出行，尤其忌长途旅行，会有意外的灾害。应另择他日外出。<br>　　<font color='yellow'>婚恋：</font>双方必须十分忠诚，第三者插足的现象极有可能发生。<br>　　<font color='yellow'>交易：</font>难成，与妇人交往则有口舌。<br>　　<font color='yellow'>求职：</font>成后必有口舌，只宜向女人求职。<br>　　<font color='yellow'>求财：</font>有亦不多，主反复，望小则得。<br>　　<font color='yellow'>求官：</font>迟得，职位不高，子午月可见。<br>　　<font color='yellow'>升学：</font>不成，如考大学，须复读后方能考上。<br>　　<font color='yellow'>行人：</font>二来一去，丑日或午日见。<br>　　<font color='yellow'>见贵：</font>不遂。<br>　　<font color='yellow'>官司：</font>不宜见官，宜庭外和解。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>不很顺利，前进途中会遇到一些意想不到的困难。但由于本人性格坚强，具有战胜不利条件的意志。因此，可以实理自己的理想。但极有可能遭到小人的伤害，必须得到志同道合者的真诚相助，才能可能排除障碍。对所得应满足，适可而止，切不可过度追求，以免满招损。<br>";
        }
        if (guanameString.equals("中孚")) {
            return "第61卦 风泽中孚（中孚卦）  诚信立身<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>路上行人色匆匆，急忙无桥过薄冰，小心谨慎过得去，一步错了落水中。<br>　　这个卦是异卦（下兑上巽）相叠 。孚（fú）本义孵，孵卵出壳的日期非常准确，有信的意义。卦形外实内虚，喻心中诚信，所以称中孚卦。这是立身处世的根本。<br>　　<font color='yellow'>事业：</font>以诚实忠信的态度对待事业，获得重大的成就，发展顺利。必须继续遵循正道的原则，不可掉以轻心，也不可过分地相信人，尤其不可以孤傲的性格自我封闭。否则事业将走向失败。<br>　　<font color='yellow'>经商：</font>处理得很好，符合市场的要求。小心谨慎地经营，讲究信义，优质服务，可有满意的结果，甚至冒险犯难也不会出问题。<br>　　<font color='yellow'>求名：</font>必须在道德修养的基础上，刻苦学习知识和本领，不断提高自己。同时，不要惧怕困难，努力向前。<br>　　<font color='yellow'>外出：</font>非常顺利，根据工作的需要可以经常外出。<br>　　<font color='yellow'>婚恋：</font>双方以诚信的态度相互对待，幸福美满。<br>　　<font color='yellow'>交易：</font>难成，互相猜疑，言而无信。<br>　　<font color='yellow'>求职：</font>宜熟人，或同行业中人代谋方遂。<br>　　<font color='yellow'>求财：</font>本卦无财，得亦薄。<br>　　<font color='yellow'>求官：</font>必高迁，初九爻动，有望之兆。<br>　　<font color='yellow'>升学：</font>有望，宜远不宜近，志愿选填外省院校为宜。<br>　　<font color='yellow'>行人：</font>有信至。<br>　　<font color='yellow'>见贵：</font>努力可见。<br>　　<font color='yellow'>官司：</font>主意外之事，宜急解决，迟则有损失。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>以诚信为立身处世的基石，真诚待人，信守制度，坚持原则，和悦谦虚，可以战胜任何困难，即使出现了问题也可以亡羊补牢。但务必增强对人的观察能力，提高分辨是非的水平。<br>";
        }
        if (guanameString.equals("家人")) {
            return "第37卦 风火家人（家人卦）  诚威治业<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>一朵鲜花镜中开，看着极好取不来，劝君休把镜花恋，卦若逢之主可怪。<br>　　这个卦是异卦（下离上巽）相叠。离为火；巽为风。火使热气上升，成为风。一切事物皆应以内在为本，然后伸延到外。发生于内，形成于外。喻先治家而后治天下，家道正，天下安乐。<br>　　<font color='yellow'>事业：</font>成功与否取决于家庭的情况。严格治家，防止[后院]起火出现意外事故，这是事业成功的先决条件。夫妇和睦，共同合作，必可脱贫致富。事业应由内而外，循序渐进，持之以恒，而后必有所成。<br>　　<font color='yellow'>经商：</font>以治家方式用于商业活动。对待公司职工应严宽结合，以严为主。宜集中领导，主事一人，共同合作，日积月累。<br>　　<font color='yellow'>求名：</font>以勤苦努力和安贫乐道为主，更应有家庭的支持。家道兴盛的同时，个人的事业也就容易成功。<br>　　<font color='yellow'>外出：</font>在家千日好，外出一时难，准备充分后再行动。<br>　　<font color='yellow'>婚恋：</font>和睦的家庭，是一切的基础，而妻子又是家道的根本。择妻应慎重，和乐兴家。<br>　　<font color='yellow'>求职：</font>宜随时，已有消息，时下未定。<br>　　<font color='yellow'>求财：</font>过六日可进前求，有两重，一大一小，小可求。<br>　　<font color='yellow'>求官：</font>不遂，有人虚诈其职而不能得。<br>　　<font color='yellow'>升学：</font>如为女生则可成。<br>　　<font color='yellow'>行人：</font>六二爻动，必有妇人事，不日得见。<br>　　<font color='yellow'>见贵：</font>可见，必有助益。<br>　　<font color='yellow'>官司：</font>有理，但有疑虑无妨。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>因好的家庭和妻子的支持而顺利成功，务必保持这种优势，否则，由盛转衰在顷刻之间。尤其应预防家庭变故。持家重在谦和待人，勤俭积蓄以致富。亲人相互和睦、友好。<br>";
        }
        if (guanameString.equals("益")) {
            return "第42卦 风雷益（益卦）  损上益下<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>时来运转吉气发，多年枯木又开花，枝叶重生多茂盛，几人见了几人夸。<br>　　这个卦是异卦（下震上巽）相叠。巽为风；震为雷。风雷激荡，其势愈强，雷愈响，风雷相助互长，交相助益。此卦与损卦相反。它是损上以益下，后者是损下以益上。二卦阐述的是损益的原则。<br>　　<font color='yellow'>事业：</font>大胆投入，勇于支持他人事业，必相得益彰。勇敢前进，敢作敢为。只要心地善良、纯洁、谦虚，事业必定与日俱增，前程无可限量。助人宜即时，要在应急，开拓事业，内部团结一致，人心所向，树立恒心，不怕冒险犯难。<br>　　<font color='yellow'>经商：</font>勿追求小利，让利于顾客，反而必获丰厚利润。切忌贪心不足。在遇到危险时应向他人求教，争取诚实的援助。<br>　　<font color='yellow'>求名：</font> 真心实意地施惠于他人，自己必然可以得到诚心诚意的回报，并且获得支持，事业必成。<br>　　婚姻：女方身高漂亮，男方缺乏信心和勇气，故迟迟未能进行，可能过期作废，另觅佳婿。<br>　　<font color='yellow'>外出：</font>有利可获。大胆外出行动。<br>　　<font color='yellow'>交易：</font>求朋友帮忙方成，能赚一笔小钱。<br>　　<font color='yellow'>求职：</font>有望，能得一主管或领班职务，但薪金不高。<br>　　<font color='yellow'>求财：</font>有五分财，与朋友一起求财顺利，切忌贪心，钱财到手就回家，不可再求。<br>　　<font color='yellow'>求官：</font>仕途升迁有望，但官职不高，且容易贬职。<br>　　<font color='yellow'>升学：</font>可成，继续努力可考上普通大学。<br>　　<font color='yellow'>官司：</font>因钱财而起争讼，可破点小财，私下和解为宜。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>心胸开阔，乐于助人。人际关系好，得到众人的支持。自己贵在树立恒心，克服三心二意。尤其要向比自己优秀的人学习，借助对方的力量，充实和发展自己。树立必要的冒险精神。平日要施善于人。因此，即使遇到危险也会得到他人救助。<br>";
        }
        if (guanameString.equals("巽")) {
            return "第57卦 巽为风（巽卦）  谦逊受益<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>一叶孤舟落沙滩，有篙无水进退难，时逢大雨江湖溢，不用费力任往返。<br>　　这个卦是同卦（下巽上巽）相叠，巽（xùn）为风，两风相重，长风不绝，无孔不入，巽义为顺。谦逊的态度和行为可无往不利。<br>　　<font color='yellow'>事业：</font>正在发展中，应本着勇往直前的精神，战胜一切困难和险阻，奋发向上。万事起头难，开始会受挫折，但在有才德和有力量的人物帮助下，会有理想的结果。<br>　　<font color='yellow'>经商：</font>市场竞争激烈，风险大。商业活动务必小心谨慎，遵守商业道德，以谦逊的态度对待同行和顾客，及至竞争对手，必定可以取得利益。<br>　　<font color='yellow'>求名：</font>以谦逊的态度对待一切，但又不可自卑、软弱、做作，更不可虚伪，这样就可以进步很快。<br>　　<font color='yellow'>外出：</font>一帆风顺，十分顺利，但仍得注意安全，防止发生意外事故。<br>　　<font color='yellow'>婚恋：</font>不可抱轻率的态度，而应慎重，相互尊重。<br>　　<font color='yellow'>交易：</font>有小成就，宜请人担保方能成。<br>　　<font color='yellow'>求职：</font>宜急不宜迟，二十一日后方就。<br>　　<font color='yellow'>求财：</font>不可独求，宜二人同求，有二三分财喜。<br>　　<font color='yellow'>求官：</font>未遂，先难后易，逢贵人助力方动。<br>　　<font color='yellow'>升学：</font>可成，但须努力，考大学须求贵人帮忙才能成。<br>　　<font color='yellow'>见贵：</font>不遂，见亦无所助益。<br>　　<font color='yellow'>官司：</font>有钱财之争，见官才能动身。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>头脑聪明、灵活，性格开朗，以谦虚的态度处世，会受到各个方面的欢迎，也会得到上级的重视。谦虚不可过度，应以刚健中正为前提，决不可表现为懦弱和虚伪。否则，不利于自身的成长。<br>";
        }
        if (guanameString.equals("涣")) {
            return "第59卦 风水涣（涣卦）  拯救涣散<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>隔河望见一锭金，欲取岸宽水又深，指望资财难到手，尽夜资财枉费心。<br>　　这个卦是异卦（下坎上巽）相叠。风在水上行，推波助澜，四方流溢。涣，水流流散之意。象征组织和人心涣散，必用积极的手段和方法克服，战胜弊端，挽救涣散，转危为安。<br>　　<font color='yellow'>事业：</font>处于比较困难的地步，主要是因为人心不齐。要采取强有力的办法，求得安定团结。其中，最为重要的是坚持正道，秉持大公无私的精神，收人心以聚涣散。<br>　　<font color='yellow'>经商：</font>市场状况混乱，方向不明。适当的冒险是完全必要的。但必须公正无私，克制私欲。争取有实力者的合作和支援也是完全有必要的。<br>　　<font color='yellow'>求名：</font>必须静下心来努力学习和提高知识水平，增加才干。涣散的形势必须进行治理，这需要多方面的人才。前途是光明的，关键取决于个人的努力。<br>　　<font color='yellow'>外出：</font>平安无事，水路更顺利。<br>　　<font color='yellow'>婚恋：</font>只要双方都抱着纯正的目的，一定美满成功。<br>　　<font color='yellow'>交易：</font>可成，中有反复，先难后成。<br>　　<font color='yellow'>求职：</font>二人同求，再求而后成。<br>　　<font color='yellow'>求财：</font>须用外力人为助，同求方可，强求不遂。<br>　　<font color='yellow'>求官：</font>宜缓，先难后易，得亦任不久。<br>　　<font color='yellow'>升学：</font>先难后顺，须求贵人帮助方可成。<br>　　<font color='yellow'>行人：</font>身已动又回，九五爻动则行人将至。<br>　　<font color='yellow'>官司：</font>宜缓不宜急，有朋友帮为和解，或不成事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>为了开拓事业，必须使用积极的手段，克服和战胜内部不团结的弊病。首先自己要除私心，牺牲小我，完成大我。切莫介入是非争端之中。这样，可以重新获得安定的局面。在良好的环境里，各项事业前途光明。<br>";
        }
        if (guanameString.equals("渐")) {
            return "第53卦 风山渐（渐卦）  渐进蓄德<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>俊鸟幸得出笼中，脱离灾难显威风，一朝得意福力至，东西南北任意行。<br>　　这个卦是异卦（下艮上巽）相叠。艮为山，巽为木。山上有木，逐渐成长，山也随着增高。这是逐渐进步的过程，所以称渐，渐即进，渐渐前进而不急速。<br>　　<font color='yellow'>事业：</font>在经过一个相对静止的时期后，重新开始了事业的新阶段。这时最怕的是急躁冒进，务必循序上进，脚踏实地。同是注意品德修养，以沉着、谦逊的态度对待事业，可无往而不利。<br>　　<font color='yellow'>经商：</font>正处在稳步向前发展的阶段，定要把握时机，既不可盲目乐观，也不要停步不前，而应采取逐步前进的策略，量力而行。遵守商业道德，以良好的服务，开拓市场。<br>　　<font color='yellow'>求名：</font>效法树木植根山上，逐渐生长的精神。在品德和学业两个方面，扎扎实实地提高自己。同时，肩负起改善社会风俗的责任。求名应以渐进为宜，切不可争进。<br>　　<font color='yellow'>外出：</font>准备充分，从容外出， 一路平安。<br>　　<font color='yellow'>婚恋：</font>不可操之过急。幸福、美满，夫妻白头和谐。<br>　　<font color='yellow'>交易：</font>有阻，若有三人合伙则有利。<br>　　<font color='yellow'>求职：</font>宜进不宜退。<br>　　<font color='yellow'>求财：</font>难遂，宜往西北方，反复努力可得。<br>　　<font color='yellow'>求官：</font>必成，但难得高位，宜一步步升阶而上。<br>　　<font color='yellow'>升学：</font>有望，先忧后喜，佳音迟来。<br>　　<font color='yellow'>行人：</font>有信，三人中有一人先去。<br>　　<font color='yellow'>见贵：</font>用力向前，防女人口舌是非。<br>　　<font color='yellow'>官司：</font>宜进不宜退，退则输，进则胜，一波未平，一波又起。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>时来运转的时刻已经到来，切莫错过良机。务必小心谨慎，渐进有益有利。以谦和的态度处世，可以得到强有力的支持，会获得重大成功。<br>";
        }
        if (guanameString.equals("观")) {
            return "第20卦 风地观（观卦）  观下瞻上<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>卦遇蓬花旱逢河，生意买卖利息多，婚姻自有人来助，出门永不受折磨。<br>　　这个卦是异卦（下坤上巽）相叠，风行地上，喻德教遍施。观卦与临卦互为综卦，交相使用。在上者以道义观天下；在下者以敬仰瞻上，人心顺服归从。<br>　　<font color='yellow'>事业：</font>事业已出现不顺利的迹象，务必谦虚慎重，高瞻远瞩，尤忌短期行为，心胸开阔，注意搞好人际关系，团结他人，不宜轻率行动。必要时不妨投靠德行高的人，以图再度发展。<br>　　<font color='yellow'>经商：</font>市场形势不稳定，正处于变动，应谨慎小心，随时观察动向，从长计议，做好退却的准备。<br>　　<font color='yellow'>求名：</font>贵在自知之明，虚心向他人求教，端正处世态度，尤其不可自我满足，更须守中持正，树立远大理想，勿丧失个人追求的目标，勿偏离正道。<br>　　<font color='yellow'>外出：</font>有风险，择日而行。<br>　　<font color='yellow'>婚恋：</font>不顺利，双方应经受住考验，从长计议，会有理想的结果。<br>　　<font color='yellow'>交易：</font>称意，与人合伙可成。<br>　　<font color='yellow'>求职：</font>有女贵人助，不可有疑。<br>　　<font color='yellow'>求财：</font>宜与人同求，待时而有。<br>　　<font color='yellow'>求官：</font>得贵人相助，不日可得任命文书。<br>　　<font color='yellow'>升学：</font>得贵人相助，可成。<br>　　<font color='yellow'>行人：</font>有三四人结伴，不日有信至，行未归。<br>　　<font color='yellow'>见贵：</font>难见，只可托人代见。<br>　　<font color='yellow'>官司：</font>有人劝和，皆大欢喜。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>具有组织能力，适宜担任负责工作，但人生旅途多曲折，必须注意培养自己的预见性和观察力，办事务必公正，实事求是，注意人心动向，关心他人。尤其不可以陷入小人之道和近视行为之中。应有决断精神，不可盲从，必要时可进行策略依附。<br>";
        }
        if (guanameString.equals("需")) {
            return "第5卦 水天需（需卦）  守正待机<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>明珠土埋日久深，无光无亮到如今，忽然大风吹土去，自然显露有重新。<br>　　这个卦是异卦（下乾上坎）相叠，下卦是乾，刚健之意；上卦是坎，险陷之意。以刚逢险，宜稳健之妥，不可冒失行动，观时待变，所往一定成功。<br>　　<font color='yellow'>事业：</font>关键在于审时度势，耐心等待，事成于安祥，切勿冒险，欲速不达。自己要充满自信，临危不惧，坚守中正，必可化险为夷。情况有利时，仍得居安思危。<br>　　<font color='yellow'>经商：</font>行动之初，情况困难，必须以极大的耐心，创造条件和机会，行事光明磊落，观时待变，实现愿望。事情接近成功时，更应小心谨慎，切莫功亏一篑。<br>　　<font color='yellow'>求名：</font>时机尚不成熟，应耐心等待。这时应坚定信念，不为闲言流语所动摇，努力丰富自己，再求助可靠的人便可成功。<br>　　<font color='yellow'>外出：</font>充分准备齐全后，可平安无事。<br>　　<font color='yellow'>婚恋：</font>慎重，切不可草率行事，逐渐培养感情，以诚实、热情相待，会发生变故，仍可以有良好的结局。双方都应懂得以柔克刚的道理。<br>　　<font color='yellow'>交易：</font>有险，难成。<br>　　<font color='yellow'>求职：</font>与人同求可也，切忌与赌博吃酒之人同事。<br>　　<font color='yellow'>求财：</font>宜往西北方求，用力辛勤亦难得手。<br>　　<font color='yellow'>求官：</font>虚劳力，枉费财，不遂，求亦空。<br>　　<font color='yellow'>升学：</font>不成，学期中男生有险，无灾。<br>　　<font color='yellow'>行人：</font>在东北方，欲动有阻，初九爻、九三爻动方回。<br>　　<font color='yellow'>见贵：</font>不宜进，宜守旧。<br>　　<font color='yellow'>官司：</font>有女人是非，小心为宜。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>前途光明，有雄心大志，且可实现。为此需要积蓄实力，等待时机，大器晚成。本人具有坚强的意志，冷静静的头脑。前进途中会遇到困难和险阻，必须十分谨慎，坦然对待小人的中伤，在灾祸在面前能镇静自若。不轻举妄动，冷静选择方向。为人谦和、坦率，多有他人相助，促使事业成功。<br>";
        }
        if (guanameString.equals("节")) {
            return "第60卦 水泽节（节卦）  万物有节<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>时来运转喜气生，登台封神姜太公，到此诸神皆退位，纵然有祸不成凶。<br>　　这个卦是异卦（下兑上坎）相叠。兑为泽，坎为水。泽有水而流有限，多必溢于泽外。因此要有节度，故称节。节卦与涣卦相反，互为综卦，交相使用。天地有节度才能常新，国家有节度才能安稳，个人有节度才能完美。<br>　　<font color='yellow'>事业：</font>正处在发展时期，一定要注意切勿冒进。但更不应放弃良好的机遇，只要坚持遵利守义的原则，可大胆行动。这样，事业可以继续兴旺发达。<br>　　<font color='yellow'>经商：</font>市场行情好，对自己很有利，应该努力开拓，勿失去机会。不过，头脑一定要冷静，投入应有限度，适可而止，该收则收。<br>　　<font color='yellow'>求名：</font>严格要求自己，办事知道节度，不走极端，可以通行无阻，顺利前进。<br>　　<font color='yellow'>外出：</font>大胆外出顺利。<br>　　<font color='yellow'>婚恋：</font>不要陷入情不自禁的地步，顺其自然会有好结果。<br>　　<font color='yellow'>交易：</font>寅午戌日成，否则难成。<br>　　<font color='yellow'>求职：</font>二三次方遂，不可过分挑剔，要求太高难成。<br>　　<font color='yellow'>求财：</font>往东南方，宜快，慢则不可得。<br>　　<font color='yellow'>升学：</font>有阻，若降低志愿方可。<br>　　<font color='yellow'>行人：</font>在路，未归。<br>　　<font color='yellow'>见贵：</font>不成，待有人引见方可。<br>　　<font color='yellow'>官司：</font>防女人，是我告他，久必和。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>抓住机遇，勿失良机。适当节制自己的行动，不可勉强，更不可冒险，恰如其分。一切不可拘泥，该变就变。但是，该节制的时候一定要节制。节制必须有限度，过于节制就成为苦，不会有好的结果，这叫适得其反，务必十分注意。<br>";
        }
        if (guanameString.equals("既济")) {
            return "第63卦 水火既济（既济卦）  盛极将衰<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>金榜以上题姓名，不负当年苦用功，人逢此卦名吉庆，一切谋望大亨通。<br>　　这个卦是异卦（下离上坎）相叠。坎为水，离为火，水火相交，水在火上，水势压倒火势，救火大功告成。既，已经；济，成也。既济就是事情已经成功，但终将发生变故。<br>　　<font color='yellow'>事业：</font>处在顺利和兴旺的阶段，甚至大功已经告成。如何才能保住这种势头，是问题的关键。必须认识盛极将衰的真理，必思患预防，防微杜渐，有备可无患。同时，一定要密切注意形势，抓住有利时机，继续奋发向上，推动事业发展。<br>　　<font color='yellow'>经商：</font>由于市场形势有利，已经赚得许多。但同时也预示着危机的随时出现。因此，务必小心在意，事未到，先预防，终日提防戒惧。同时，认真观察市场的变化，随时转向，开拓新市场。<br>　　<font color='yellow'>求名：</font>个人追求名利的基本条件已经具备。必须防止因此而变得僵化和保守，以致功亏一篑，半途而废。<br>　　<font color='yellow'>外出：</font>利于出行，途中需注意安全。<br>　　<font color='yellow'>婚恋：</font>起初顺利，只中途会出现挫折。<br>　　<font color='yellow'>交易：</font>得贵人助力可成，九五爻动则宜速。<br>　　<font color='yellow'>求职：</font>三次可得。<br>　　<font color='yellow'>求财：</font>初求未得，再求方有，九五爻动则有二重财。<br>　　<font color='yellow'>求官：</font>先阻，后遂，宜抓紧时间，先求先得。<br>　　<font color='yellow'>升学：</font>有望，有变爻则难遂人意。<br>　　<font color='yellow'>行人：</font>在外有阻，亦有信至，九五爻动则无信。<br>　　<font color='yellow'>见贵：</font>可见，有变爻则难见。<br>　　<font color='yellow'>官司：</font>无事生非，一场虚惊。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>各方面条件都很好，环境又有利于成长。但因此反而会使自己满足，停止前进，甚至变得颓废，趋向没落。一定要不断刻苦努力，保持谦虚美德，常怀不安之心，防止不测事件发生。<br>";
        }
        if (guanameString.equals("屯")) {
            return "第3卦 水雷屯（屯卦）  起始维艰<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>风刮乱丝不见头，颠三倒四犯忧愁，慢从款来左顺遂，急促反惹不自由。<br>　　这个卦是异卦（下震上坎）相叠，震为雷，喻动；坎为雨，喻险。雷雨交加，险象丛生，环境恶劣。[屯]原指植物萌生大地。万物始生，充满艰难险阻，然而顺时应运，必欣欣向荣。<br>　　<font color='yellow'>事业：</font>起初多不利，必知难而进，小心翼翼，勇往直前，灵活机动，可望获得大的成功，时机到来时一定要抓住，却也不得操之太急，且仍有困难，务必有他人相助，故平时应多施恩惠。<br>　　<font color='yellow'>经商：</font>创业初期步履艰难，多有挫折。坚定信念最重要，不要为表面现象所迷惑，应积极进取，行动果断，打开出路。若仍无法摆脱困境，则应退守保全，等待机会，再展宏图。<br>　　<font color='yellow'>求名：</font>积极争取，主动追求，可以成功。<br>　　<font color='yellow'>外出：</font>慎重为好，有危险，宜改日动身。<br>　　<font color='yellow'>婚恋：</font>好事多磨，忠贞纯洁，大胆追求，能够成功，婚姻美满。<br>　　<font color='yellow'>交易：</font>有阻，耐心等待有望。<br>　　<font color='yellow'>求职：</font>他人代求才吉。<br>　　<font color='yellow'>求财：</font>远求有，近求无，迟遂，不可与人同求。<br>　　<font color='yellow'>求官：</font>缓求可成，有女人口舌。<br>　　<font color='yellow'>升学：</font>有阻，宜专心学习，当有飞黄腾达的一天。<br>　　<font color='yellow'>行人：</font>二人同行，中途有阻。<br>　　<font color='yellow'>见贵：</font>未遂，有人阻。<br>　　<font color='yellow'>官司：</font>六二爻若动主有官司，不动则安。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>初始困难，但若具有坚忍不拔的毅力和锲而不舍的奋斗精神，前途不可估量，但往往不为他人理解而陷于孤独苦闷，事业会因此处于困难状态，需要得到贤德之人的帮助才能摆脱。如能以乐观主义精神处世，能取得成就。<br>";
        }
        if (guanameString.equals("井")) {
            return "第48卦 水风井（井卦）  求贤若渴<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>枯井破费已多年，一朝流泉出来鲜，资生济渴人称羡，时来运转喜自然。<br>　　这个卦是异卦（下巽上坎）相叠。坎为水；巽为木。树木得水而蓬勃生长。人靠水井生活，水井由人挖掘而成。相互为养，井以水养人，经久不竭，人应取此德而勤劳自勉。<br>　　<font color='yellow'>事业：</font> 处于平稳状态。既不宜贸然前进，也不必后退，而应以积极的态度努力进修，提高自己，充实个人实力，待机而起，将大有成就。最怕的是停顿不前，否则将会因不合时宜而被淘汰。<br>　　<font color='yellow'>经商：</font>市场情况良好，可继续按照原来的方针。同时，继续本着勤劳、奋进的精神，诚心诚意地开拓市场，特别注意与人的合作，相互协助，在实践活动中丰富和积累经验。<br>　　<font color='yellow'>求名：</font>本着正当的目的，为社会做贡献，因此而努力学习。应特别注意向贤德的人求教，以便被发现而受到推荐。<br>　　<font color='yellow'>外出：</font>没有十分的必要和充分的把握不可随意出行。<br>　　<font color='yellow'>婚恋：</font>不必过急，会有般配的伴侣。<br>　　<font color='yellow'>交易：</font>未就，虽成亦不长久。<br>　　<font color='yellow'>求职：</font>用二人只见信，虽成，虚多实少。<br>　　<font color='yellow'>求财：</font>逢酉日得，不然须过二十日方遂，二人同求可得。<br>　　<font color='yellow'>求官：</font>不遂，空费力，破财亦难成。<br>　　<font color='yellow'>升学：</font>有阻，宜静心苦读后再考。<br>　　<font color='yellow'>寻人：</font>未见，但有信，有井及香火处偶遇。<br>　　<font color='yellow'>见贵：</font>有阻。<br>　　<font color='yellow'>官司：</font>有田土房产之争，宜和，无事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>聪明、机敏、乐于助人。同时，也会有机会充分施展个人的才能。只要能学习[水井]的精神，真诚奉献，不断丰富自己的才能，一定会受到社会的重视。<br>";
        }
        if (guanameString.equals("坎")) {
            return "第29卦 坎为水（坎卦）  行险用险<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>一轮明月照水中，只见影儿不见踪，愚夫当财下去取，摸来摸去一场空。<br>　　这个卦是同卦（下坎上坎）相叠。坎为水、为险，两坎相重，险上加险，险阻重重。一阳陷二阴。所幸阴虚阳实，诚信可豁然贯通。虽险难重重，却方能显人性光彩。<br>　　<font color='yellow'>事业：</font>陷入重重艰难险阻之中，险况丛生。既不得冒险，也不可束手待毙，应以积极态度，努力创造条件，改变处境，化险为夷。务必实心实意，充满信心，不图侥幸，不辞艰险，宜静观待变，运用智慧，突破险境，转危为安。<br>　　<font color='yellow'>经商：</font>十分不利，甚至陷入面临破产的境地，但内心应沉着踏实，保持头脑冷静，身陷险境而心不陷，勿轻举妄动，先求自保以观变，把握时机以脱险。<br>　　<font color='yellow'>求名：</font>不为他人理解，怀才不遇。不可自暴自弃。不改初衷，泰然自若，循序渐进，终可为人理解和发现。<br>　　<font color='yellow'>外出：</font>大胆外出，另辟新路，必有所成，且得到他人相助。<br>　　<font color='yellow'>婚恋：</font>多遭不利，应冷静分析原因，积极改变自身条件。双方同舟共济，共渡难关。<br>　　<font color='yellow'>交易：</font>难成，有人设置障碍。<br>　　<font color='yellow'>求职：</font>有反复，须三四次，前往方有消息。<br>　　<font color='yellow'>求财：</font>须二人同求，久求有小得。<br>　　<font color='yellow'>求官：</font>有阻，虽托人代求亦难成。<br>　　<font color='yellow'>升学：</font>有二重阻力，不顺。<br>　　<font color='yellow'>行人：</font>有艰险，不安，寅午日有信，未戌日归。<br>　　<font color='yellow'>见贵：</font>防小人嫉妒。<br>　　<font color='yellow'>官司：</font>因土地或房地产之事争讼，自身有理变无理。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>不幸。然而是转运前的考验。只要能不因困境而失常，且不图侥幸，保持信心，勿自陷险境。镇定自若，不轻举妄动，洞察时机，必可转危为安，成出险之功。<br>";
        }
        if (guanameString.equals("蹇")) {
            return "第39卦 水山蹇（蹇卦）  险阻在前<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>大雨倾地雪满天，路上行人苦又寒，拖泥带水费尽力，事不遂心且耐烦。<br>　　这个卦是异卦（下艮上坎）相叠。坎为水，艮为山。山高水深，困难重重，人生险阻，见险而止，明哲保身，可谓智慧。蹇，跋行艰难。<br>　　<font color='yellow'>事业：</font>诸事开头难，坚持下去，会有好的结果。人生不易，首先得求诸自己，修德养性。志高自信，奋勇进取。逢到困难，得求友人相助，行动不可冒险，必以柔克刚，待机候时，量力而行。<br>　　<font color='yellow'>经商：</font>逐步起业，冒险行事，自寻苦恼。宜加强商业道德，真诚同他人合作，陷入困境时，不得见死不救，而应奋不顾身。联合行动，可活跃于市场竞争之中。<br>　　<font color='yellow'>求名：</font>循序渐进，加强自身修道。居静观动，待变，俟机而动，能进则进。内心坦然，不可为追逐名利而冒险。与贤能结合，追随高人，必能转危为安。<br>　　<font color='yellow'>外出：</font>出门可能有难，利于西南行。如外出遇难，可得救助，转危为安。<br>　　<font color='yellow'>婚恋：</font>不很顺利，不得急，宜慎重选择。但应有自知之明。<br>　　<font color='yellow'>交易：</font>有阻难成。<br>　　<font color='yellow'>求职：</font>托他人代说方成，急则有忧。<br>　　<font color='yellow'>求财：</font>反复，有是非口舌，可得二三分财。<br>　　<font color='yellow'>求官：</font>先难后易，反复努力可成。<br>　　<font color='yellow'>升学：</font>阻力重重，最后托人帮忙也只能上二三等学校。<br>　　<font color='yellow'>行人：</font>欲动有阻，或少路费，不日将有信至。<br>　　<font color='yellow'>见贵：</font>难见，用力方遂。<br>　　<font color='yellow'>官司：</font>不宜见官，只宜回避。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>艰难不利。但可视为考验。奋进向前，充满信心，切勿自寻苦恼，交结贤人，相互帮助，坚守中正之道，可遇难呈祥，结得善果。<br>";
        }
        if (guanameString.equals("比")) {
            return "第8卦 水地比（比卦）  诚信团结<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>顺风行船撒起帆，上天又助一蓬风，不用费力逍遥去，任意而行大亨通。<br>　　这个卦是异卦（下坤上坎）相叠，坤为地；坎为水。水附大地，地纳河海，相互依赖，亲密无间。此卦与师卦完全相反，互为综卦。它阐述的是相亲相辅，宽宏无私，精诚团结的道理。<br>　　<font color='yellow'>事业：</font>顺利能够成功，向前发展，可以得到他人的帮助和辅佐，以诚实、信任的态度去做事。待人宽厚、正直，主动热情，向才德高尚的人士学习，听取建议。<br>　　<font color='yellow'>经商：</font>愿望能够实现，且有较丰厚的利润，但需要与他人密切合作，真诚交往，讲究商业道德，遵守信义，如唯利是图，贪心不足，或自以为是，会导致严重损失。<br>　　<font color='yellow'>求名：</font>有成功的希望，不仅要靠个人的努力，更为重要的是他人的赏识和栽培。<br>　　<font color='yellow'>外出：</font>旅途平安，一路顺风。<br>　　<font color='yellow'>婚恋：</font>美好姻缘，相亲相爱，彼此忠诚，白头到老。<br>　　<font color='yellow'>交易：</font>反复难成之兆，但二人同求，或与女人交易可成。<br>　　<font color='yellow'>求职：</font>半月后当成，时下不利，但无虑。<br>　　<font color='yellow'>求财：</font>必遂，须而人同求，不然则向女人求，宜近不宜远。<br>　　<font color='yellow'>求官：</font>量材而用，无反复，其职不高。<br>　　<font color='yellow'>升学：</font>可成，与平时同班好友考入同一所学校。<br>　　<font color='yellow'>见贵：</font>宜依时进见，可免羞辱。<br>　　<font color='yellow'>官司：</font>朋友之间纠纷，宜劝解。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>心地善良，待人忠诚、厚道，乐于帮助他人，也能得到回报。工作勤恳，对自己要求严格，可以实现自己的理想，但要多动脑筋，多思考，善于判断是非，尤其要注意选择朋友，一旦结上品行不端的人，会成为自己的祸患。如果与比自己高明的人交朋友，并取得帮助，会终身受益。<br>";
        }
        if (guanameString.equals("大畜")) {
            return "第26卦 山天大畜（大畜卦）  止而不止<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>忧愁常锁两眉头，千头万绪挂心间，从今以后防开阵，任意行而不相干。<br>　　这个卦是异卦（下乾上艮）相叠。乾为天，刚健；艮为山，笃实。畜者积聚，大畜意为大积蓄。为此不畏严重的艰难险阻，努力修身养性以丰富德业。<br>　　<font color='yellow'>事业：</font>务必端正行为，滋养德行。行为应大胆，果断，但需适可而止，注意休整，决不可冒险闯进。宜注意吸收前人的经验教训，有所畏而不行，否则必有危害。再取得成就之后，应适可而止，不可贪图眼前小利而走向反面。<br>　　<font color='yellow'>经商：</font>本着循序渐进的原则，把握正当的商业道德，会有重大收获。此时，切忌贪心不足，而应见机而退，保守事业，深思熟虑，再图发展，一味自信冒进，决不可取。<br>　　<font color='yellow'>求名：</font>注意积累学问，提高德行，勿三天打鱼两天晒网，持之以恒，且以学问、知识报效国家，抱负终将实现。<br>　　<font color='yellow'>外出：</font>不宜守于家中，出行必得，且畅通无阻。不过应处处小心谨慎。<br>　　<font color='yellow'>婚恋：</font>顺利。建立在共同勤俭持家的基础上，相互坦诚而待，美满幸福。<br>　　<font color='yellow'>交易：</font>先曲后直，有厚利。<br>　　<font color='yellow'>求职：</font>先难后易，再三求可得一高薪之职。<br>　　<font color='yellow'>求财：</font>不宜自求，只宜隔手求，先难后易。<br>　　<font color='yellow'>求官：</font>荣显之兆，先难后顺，得升高位。<br>　　<font color='yellow'>升学：</font>大吉，能考上名牌大学。<br>　　<font color='yellow'>行人：</font>主二人同归，丑戌亥日见，只恐同行有阻。<br>　　<font color='yellow'>见贵：</font>吉，应由人引见有利。<br>　　<font color='yellow'>官司：</font>多因财物房产之争，有头无尾，宜和解不宜见官。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>蓄财的人，但决不可抱投机取巧心理，得靠个人诚实工作，多动心机，真诚与他人合作，共创事业，困难时仍应持正道，尤其不可粗心大意，牢记成就大阻力也大的道理。<br>";
        }
        if (guanameString.equals("损")) {
            return "第41卦 山泽损（损卦）  损益制衡<br>　　下下卦<br>　　<font color='yellow'>象曰：</font>时动不至费心多，比作推车受折磨，山路崎岖吊下耳，做插右按按不着。<br>　　这个卦是异卦（下兑上艮）相叠。艮为山；兑为泽。上山下泽，大泽浸蚀山根。损益相间，损中有益，益中有损。二者之间，不可不慎重对待。损下益上，治理国家，过度会损伤国基。应损则损，但必量力、适度。少损而益最佳。<br>　　<font color='yellow'>事业：</font>开拓事业必有投入。投入多少应事先精心算计，力求损益得当。诸事皆应有节度，切忌欺诈、贪婪。天下事克已最难，务严格要求自己，刻苦奋斗，手段灵活，争取事业成功。<br>　　<font color='yellow'>经商：</font>全面调查市场行情，计算投入和收益的比例。不必过于计较利润的多少，获利即可。真诚与他人合作，彼此信任，手段灵活，切勿自我封闭。<br>　　<font color='yellow'>求名：</font>为了成长进步，务必有所投入，且应付诸实践。以损增益，成就理想。<br>　　<font color='yellow'>外出：</font>有益可行。注意节省费用，防止损多于益。<br>　　<font color='yellow'>婚恋：</font>全面权衡对方的长处与短处。大处着眼。<br>　　<font color='yellow'>交易：</font>有三人合伙可成，其中二人得利，一人受损。<br>　　<font color='yellow'>求职：</font>破财后可求，宜与他人同求。<br>　　<font color='yellow'>求财：</font>只得六七分，须破财请酒食方可成。<br>　　<font color='yellow'>求官：</font>先难后易，要用钱疏通，方得成就。<br>　　<font color='yellow'>升学：</font>有阻，但能成，须用钱求人帮忙方可。<br>　　<font color='yellow'>见贵：</font>有反复，但最后得见。<br>　　<font color='yellow'>官司：</font>为钱财事，先损他人，破财后得理。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>为人聪颖，善于权衡利弊。顺应自然发展规律，积极主动与他人合作，助人为乐，适度投入，资助他人，而自己要宁俭勿奢。如此，诸事都可以十分顺利。<br>";
        }
        if (guanameString.equals("贲")) {
            return "第22卦 山火贲（贲卦）  饰外扬质<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>近来运转锐气周，窈窕淑女君子求，钟鼓乐之大吉庆，占者逢之喜临头。<br>　　这个卦是异卦（下离上艮）相叠。离为火为明；艮为山为止。文明而有节制。贲（bi）卦论述文与质的关系，以质为主，以文调节。贲，文饰、修饰。<br>　　<font color='yellow'>事业：</font>顺利，小有成绩，宜即时总结经验，图谋更大的发展。树立信心，不计较一时的得失。追求实质性的内容，慎重诸事，不得随波逐流，寻求有实力的人物提携自己。<br>　　<font color='yellow'>经商：</font>开初会遇到困难，不应灰心，宜全面分析形势，大胆开拓，勇敢地投入，联合他人，共同合作，根据市场，运转业务。<br>　　<font color='yellow'>求名：</font>不可过多地注重外表，而应着重于内在的素质。大胆地推荐自己，但应坚持自己的理想。<br>　　<font color='yellow'>外出：</font>慎远行。但只要准备充分，注意安全，不会出麻烦。<br>　　<font color='yellow'>婚恋：</font>慎重选择，有合适者，则应迫切追求，不可三心二意，务必专一。注重对方的内在气质，勿为表面现象所欺骗。<br>　　<font color='yellow'>交易：</font>小成，防货物破碎，有贵人助无碍。<br>　　<font color='yellow'>求职：</font>他人无心，与他人同求，宜迟不宜早，待他人信至方可。<br>　　<font color='yellow'>求财：</font>不宜买卖中求，应在东南方。<br>　　<font color='yellow'>求官：</font>初未遂，后得声名之职。<br>　　<font color='yellow'>升学：</font>有望，若考大学只能勉强上线。<br>　　<font color='yellow'>行人：</font>行未远，动有阻，非与他人同行，乃独行。<br>　　<font color='yellow'>见贵：</font>宜向前方，一男一女同往顺利。<br>　　<font color='yellow'>官司：</font>先喜，中忧，后和解。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>喜爱注重外表，缺乏追求内在气质的恒心。生性较为浮躁，好务虚名，往往因此而碰壁，或半途而废。在事实的教育下，改变不切实际的做法，明察社会和人生，会有所收敛，变得自持，注重自身修养，成全事业，中年以后会大有作为，老年仍可发挥余热。<br>";
        }
        if (guanameString.equals("颐")) {
            return "第27卦 山雷颐（颐卦）  纯正以养<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>太公独钓渭水河，手执丝杆忧愁多，时来又遇文王访，自此永不受折磨。<br>　　这个卦是异卦（下震上艮）相叠。震为雷，艮为山。山在上而雷在下，外实内虚。春暖万物养育，依时养贤育民。阳实阴虚，实者养人，虚者为人养。自食其力。<br>　　<font color='yellow'>事业：</font>凡事得靠个人追求，自己奋斗，而不能依赖他人。更不得用不光彩的手段谋求财物。只要遵循正道，自食其力，慎言敏行，一定会有好的机遇。这时，经过一番艰苦奋斗，能够成功。<br>　　<font color='yellow'>经商：</font>不得急于求成，初仅以勉强维持生活为限。谨慎小心，循序渐进，诚以待人，真诚与他人合作，因时制宜，不断追求新的开拓方向，必要时可适当冒险。<br>　　<font color='yellow'>求名：</font>以丰富自身知识为目的，知足安贫，刻苦努力，成功的希望极大。<br>　　<font color='yellow'>外出：</font>应慎重，不宜过多外出。如无充分准备，仓促出行，将可能会遇到凶险。<br>　　<font color='yellow'>婚恋：</font>不可急于求成。关键在于加强自己的修养。一旦选中应全力追求，尤其不可三心二意。<br>　　<font color='yellow'>交易：</font>只宜守旧，不可投资新项目。<br>　　<font color='yellow'>求职：</font>难成，即使成工资也不高。<br>　　<font color='yellow'>求财：</font>能得二三分财。<br>　　<font color='yellow'>求官：</font>不遂，反生忧闷，且容易受骗。<br>　　<font color='yellow'>升学：</font>难成，须复读再考。<br>　　<font color='yellow'>行人：</font>一往一来，事多疑虑，反复欲动不动。<br>　　<font color='yellow'>官司：</font>有头无尾，我告他人，终不成。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>注意道德修养，乐于尽力而为地去帮助他人，救人急难，不贪求不应得到的财物。因此，能受到他人的尊重，也能不断得到外来的援助，个人事业十分顺利，成功的可能性很大。<br>";
        }
        if (guanameString.equals("蛊")) {
            return "第18卦 山风蛊（蛊卦）  振疲起衰<br>　　中中卦<br>　　<font color='yellow'>象曰：</font>卦中爻象如推磨，顺当为福反为祸，心中有益且迟迟，凡事尽从忙处错。<br>　　这个卦是异卦（下巽上艮）相叠，与随卦互为综卦。蛊（gu）本意为事，引申为多事、混乱。器皿久不用而生虫称[蛊]，喻天下久安而因循、腐败，必须革新创造，治理整顿，挽救危机，重振事业。<br>　　<font color='yellow'>事业：</font>运气处于不佳状态，或因外界条件，或因个人因素所致。唯有谨慎分析原因，找出弊端，坚决，大胆，不惜冒险，战胜阻力。这时一要头脑冷静，二要向高明的人请教，必能创造业绩。<br>　　<font color='yellow'>经商：</font>诸多不利困扰着自己，不宜继续走老路。应全面分析市场动向，当机立断，另外找寻出路。<br>　　<font color='yellow'>求名：</font>会遇到许多困难和不利，应看作是对自己的考验，要以百倍的勇气，继续奋斗。同时，虚心寻找自己的不足，加以补救。<br>　　<font color='yellow'>外出：</font>宜推迟或提前。否则会出现危险，务必小心谨慎。<br>　　<font color='yellow'>婚恋：</font>不顺利。双方如情投意合，则应全力以赴促成此事，夫妇应共同努力维系家庭。<br>　　<font color='yellow'>求职：</font>请亲戚或内部人代求可成。<br>　　<font color='yellow'>求财：</font>用三人同求，有二三分财。<br>　　<font color='yellow'>求官：</font>二次求有望，必须等主管首长换届方成。<br>　　<font color='yellow'>升学：</font>先难后易，努力可成。<br>　　<font color='yellow'>官司：</font>先是他告我，中途我告他，有热心人劝和，可从之。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>生不逢时，家道或事业有中落现象，个人陷入多事之秋。唯有正视现实，勤奋勉励，不屈不挠，有所作为，甚至不惜冒险，挽救败落状况。必要时还需耐心等待时机。<br>";
        }
        if (guanameString.equals("蒙")) {
            return "第4卦 山水蒙（蒙卦）  启蒙奋发<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>卦中爻象犯小耗，君子占之运不高，婚姻合伙有琐碎，做事必然受苦劳。<br>　　这个卦是异卦（下坎上艮 ）相叠，艮是山的形象，喻止；坎是水的形象，喻险。卦形为山下有险，仍不停止前进，是为蒙昧，故称蒙卦。但因把握时机，行动切合时宜，因此，具有启蒙和通达的卦象。<br>　　<font color='yellow'>事业：</font>事业开始，混乱无序，危机四伏，以勇敢坚毅的行动可以扭转局面。然而必须接受严格教育，培养这种奋发图强的精神。务必脚踏实地，最忌好高骛远，否则会陷入孤立无援的境地。<br>　　<font color='yellow'>经商：</font>务必小心谨慎，不得急功近利，尤其应树立高尚的商业道德，以良好的信誉提高竞争力而取胜。<br>　　<font color='yellow'>求名：</font>必须接受良好的基础教育，陶冶情操。且动机纯正，可以达到目的。<br>　　<font color='yellow'>外出：</font>等候有利时机再行动，等待期间应积极做准备。<br>　　<font color='yellow'>婚恋：</font>注意考察对方品德，不可以金钱为诱铒。夫妻需相互宽容、理解。<br>　　<font color='yellow'>交易：</font>不可急，慢慢来可成。<br>　　<font color='yellow'>求职：</font>一次则成，反复求不可成。<br>　　<font color='yellow'>求财：</font>过旬方有，失而复得。<br>　　<font color='yellow'>求官：</font>宜进不宜退，有女贵人助。<br>　　<font color='yellow'>升学：</font>有望，不甚用力便可上进。<br>　　<font color='yellow'>行人：</font>在他处，出门时未定，又往西北方向。<br>　　<font color='yellow'>见贵：</font>迟则吉，见之有喜。<br>　　<font color='yellow'>官司：</font>久缠不结案。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>有时会陷入迷惘困顿的境地，加上胆小、不果断，往往误事。如能接受长辈的教诲，甚至严酷的考验，抛弃疑惧的心理，等待适当时机，必然一帆风顺。<br>";
        }
        if (guanameString.equals("艮")) {
            return "第52卦 艮为山（艮卦）  动静适时<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>财帛常打心头走，可惜眼前难到手，不如意时且忍耐，逢着闲事休开口。<br>　　这个卦是同卦（下艮上艮）相叠。艮为山，二山相重，喻静止。它和震卦相反。高潮过后，必然出现低潮，进入事物的相对静止阶段。静止如山，宜止则止，宜行则行。行止即动和静，都不可失机，应恰到好处，动静得宜，适可而止。<br>　　<font color='yellow'>事业：</font>在经过一段发展后，应进行调整，暂时停止行动，总结经验教训。不可因贪名利而妄进。自我克制，自我约束，谨言慎行，不要盲目追求他人。经过休整后，在适当时机到来时，再大显身手。<br>　　<font color='yellow'>经商：</font>进入停滞不前的状态，切勿盲目冒进，而宜适时停止，进入安静退守，不要受外界干扰，尤其是应该保持内心和理智上的宁静，更不要轻易与他人合作。等待时机，必有光明前途。<br>　　<font color='yellow'>求名：</font>应保持纯正的目的，静守正道。勿为功名诱惑，秉守忠厚，可得成功。<br>　　<font color='yellow'>外出：</font>慎重为好，宜另择佳日。<br>　　<font color='yellow'>婚恋：</font>重感情，彼此以诚相待，可白头到老。<br>　　<font color='yellow'>交易：</font>难成，两次皆错过机会。<br>　　<font color='yellow'>求职：</font>三无次方成。<br>　　<font color='yellow'>求财：</font>不可出外求，在家亦难得。<br>　　<font color='yellow'>求官：</font>难成，得迁职，为同级调任。<br>　　<font color='yellow'>升学：</font>难成，有两重阻力。<br>　　<font color='yellow'>行人：</font>未至，九三爻动，则不日将归。<br>　　<font color='yellow'>见贵：</font>未遂，有二人从中作梗。<br>　　<font color='yellow'>官司：</font>当止则止，最后无事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>性格沉静、内向，不喜好活动，也不善于交际，为人忠诚老实，讲信义。注意听取他人的建议，明哲保身。机遇不到，不宜积极活动，该止则止，勿抱不切实际的想法。<br>";
        }
        if (guanameString.equals("剥")) {
            return "第23卦 山地剥（剥卦）  顺势而止<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>鹊遇天晚宿林中，不知林内先有鹰，虽然同处心生恶，卦若逢之是非轻。<br>　　这个卦是异卦（下坤上艮）相叠。五阴在下，一阳在上，阴盛而阳孤；高山附于地。二者都是剥落象，故为[剥卦]。此卦阴盛阳衰，喻小人得势，君子困顿，事业败坏。<br>　　<font color='yellow'>事业：</font>时运不佳，乃大势所趋，个人只能顺应时势而暂停行动，静观待变，不可冒险，积极创造条件，增强实力，谨慎隐忍，勿与小人同流。时来运转，成就事业，为期不远。<br>　　<font color='yellow'>经商：</font>已从高峰转入低落，进入不景气时期，需要认真总结经验教训，进行整顿，尤其不可孤注一掷。景气形势一旦到来，可顺势从容再起。<br>　　<font color='yellow'>求名：</font>成功的可能性不大，不宜执意强求，应继续创造条件，努力提高自己，充实处世的本领，增强实力，待机东山再起。<br>　　<font color='yellow'>外出：</font>暂缓为好。可在充分准备之后动身。<br>　　<font color='yellow'>婚恋：</font>务须慎重考虑，除非有十分般配者，不要随便进行。双方应注意维护家庭的和睦。<br>　　<font color='yellow'>交易：</font>宜托人辗转中介方成，得薄利少许。<br>　　<font color='yellow'>求职：</font>宜远，须三次方可成。<br>　　<font color='yellow'>求财：</font>与三人同求，有五分财，无厚利。<br>　　<font color='yellow'>求官：</font>先难后易，望小得大位，丑辰日月应。<br>　　<font color='yellow'>升学：</font>难成，须来年再考方成。<br>　　<font color='yellow'>行人：</font>三人同行，不和睦，欲动不动，多惊疑。<br>　　<font color='yellow'>见贵：</font>可见，防小人嫉妒。<br>　　<font color='yellow'>官司：</font>因财禄争斗，若见官则散，不见官防皮肉之苦。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>一生曲折较多，往往隐入不顺利的境况，甚至绝境。但可绝处逢生。只要冷静分析形势，顽强拼搏，一定会彻底改变命运，获得美好的结果，为他人惊羡。关键是不可急于求成，尤其不可冒险。须顺应时势，并防小人陷害。<br>";
        }
        if (guanameString.equals("泰")) {
            return "第11卦 地天泰（泰卦）  应时而变<br>　　中中卦<br>　　<font color='yellow'>象曰：</font>学文满腹入场闱，三元及第得意回，从今解去愁和闷，喜庆平地一声雷。<br>　　这个卦是异卦（下乾上坤）相叠，乾为天，为阳；坤为地，为阴，阴阳交感，上下互通，天地相交，万物纷纭。反之则凶。万事万物，皆对立，转化，盛极必衰，衰而转盛，故应时而变者泰（通）。<br>　　<font color='yellow'>事业：</font>坚持由小而大，循序渐进的原则，事业已达到顺利的境地，更应小心从事，居安思危，积极寻求、开拓新的事业，方可继续前进，若因循守旧，不思进取，必遭失败。<br>　　<font color='yellow'>经商：</font>顺利。务必注意市场动向，开拓新的领域，展开新的竞争。为此，密切与他人的合作，争取各方面的帮助，但需谦虚谨慎，警惕巧言令色的小人。<br>　　<font color='yellow'>求名：</font>具有成功的条件，但一定得更加努力，刻苦追求，最忌聪明反被聪明误。<br>　　<font color='yellow'>外出：</font>一帆风顺。<br>　　<font color='yellow'>婚恋：</font>美满姻缘。谈恋爱却不可不认真对待。<br>　　<font color='yellow'>交易：</font>宜用力，必然成就。<br>　　<font color='yellow'>求职：</font>求小得大，事易成。<br>　　<font color='yellow'>求官：</font>有晋升之喜，有贵人相助。<br>　　<font color='yellow'>升学：</font>非常顺利，不用父母操心，定能考上大学。<br>　　<font color='yellow'>行人：</font>身动，三人行，不久当见。<br>　　<font color='yellow'>见贵：</font>宜前进，顺利。<br>　　<font color='yellow'>官司：</font>乃邻里纠纷，或因小儿引起，宜和，不宜见官。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>吉祥如意。适应能力强，各项事业能成功。能谋善断，长于人际关系，能团结他人共创业绩，灵活机动，很能适应形势的变化，不断向新的领域迈进。但在人生途中必须兢兢业业，尤其不可麻痹大意，在择朋选友方面更应慎重，切防小人倒运。<br>";
        }
        if (guanameString.equals("临")) {
            return "第19卦 地泽临（临卦）  教民保民<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>君王无道民倒悬，常想拨云见青天，幸逢明主施仁政，重又安居乐自然。<br>　　这个卦是异卦（下兑上坤）相叠。坤为地；兑为泽，地高于泽，泽容于地。喻君主亲临天下，治国安邦，上下融洽。<br>　　<font color='yellow'>事业：</font>正是成功的极好时机，务必抓紧，不可失去良机。但却不可就此满足，时运会很快消失，一定要从长计议，注意总结经验，团结他人，共同开拓新领域。<br>　　<font color='yellow'>经商：</font>会十分顺利，并有收获，但须随时注意市场动向，兢兢业业，防止出现意外的事故，尤其应妥善处理人际关系。<br>　　<font color='yellow'>求名：</font>自己的努力已到了收获的季节，应更加虚心，严格要求自己，谨慎小心地实现自己的目标。很可能出现意外，应以刚强的意志去从容对付，过于软弱将失去机会。<br>　　<font color='yellow'>外出：</font>在准备充分的情况下，立即行动，不必再犹豫。<br>　　<font color='yellow'>婚恋：</font>加紧进行，全力以赴，双方以诚信相待，美满、和谐。<br>　　<font color='yellow'>交易：</font>多有人破坏，终成，有口舌是非。<br>　　<font color='yellow'>求职：</font>与人相约求无忧，顺利。<br>　　<font color='yellow'>求财：</font>与人同求，先难后易，有两重财。<br>　　<font color='yellow'>求官：</font>迁职之喜，会调任另一个更高的职位。<br>　　<font color='yellow'>升学：</font>可成，但宜趁早活动，至阴历八月有阻。<br>　　<font color='yellow'>行人：</font>三人等一人，不久即见，有口舌。<br>　　<font color='yellow'>见贵：</font>只宜守旧，若要进前，恐有不当。<br>　　<font color='yellow'>官司：</font>事涉三人，本欲告他人，反伤了自己，宜和解。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>头脑灵活，善于同他人交往，并有主见，具有领导才能。务必加强个人的全面修养，诚信待人，树立良好的个人威望，尤其要有远大的眼光，长久的计划，可以保证事业的发达和前程的光明。<br>";
        }
        if (guanameString.equals("明夷")) {
            return "第36卦 地火明夷（明夷卦）  晦而转明<br>　　中下卦<br>　　<font color='yellow'>象曰：</font>时乖运拙走不着，急忙过河拆了桥，恩人无义反为怨，凡事无功枉受劳。<br>　　这个卦是异卦（下离上坤）相叠。离为明，坤为顺；离为日；坤为地。日没入地，光明受损，前途不明，环境困难，宜遵时养晦，坚守正道，外愚内慧，韬光养晦。<br>　　<font color='yellow'>事业：</font>处于不利的环境，宜心境坦然地处置险恶的条件，增强心理素质，承受各种压力。表面柔顺小心，内心洞察事理，当离去则离去，避免灾祸，脱离危险。防患于未然，坚持逆境中奋斗。<br>　　<font color='yellow'>经商：</font>认真观察言市场动态，待机行动，但须坚持商业道德，即使处于不利情况下，也要冒险向前，特别是要向南方发展，会大有收获。<br>　　<font color='yellow'>求名：</font>内心保持大志，行动刻苦忍耐，奋斗于逆境，自守其志，收敛聪明而不外露，于混乱中更应坚持正义，藏拙守愚。<br>　　<font color='yellow'>外出：</font>最好不要马上行动，再等待一个时期，做好充分准备。<br>　　<font color='yellow'>婚恋：</font>必须全面分析对方情况，不能因小失大。注意大节。<br>　　<font color='yellow'>交易：</font>难成，宜关门修身，清点帐目。<br>　　<font color='yellow'>求职：</font>难成，岁多处推荐难有结果。<br>　　<font color='yellow'>求财：</font>不可与人求，反复努力终得。<br>　　<font color='yellow'>升学：</font>艰难，或留级或高考落榜。<br>　　<font color='yellow'>寻人：</font>藏蔽难见，可见信，可问他人。<br>　　<font color='yellow'>见贵：</font>未遂，应缓求方得。<br>　　<font color='yellow'>官司：</font>人在罗网中，见官亦难脱。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>处在不佳的状况下，环境困难，前途不明。但若能坦处厄运，能伸能屈，前景会变光明。尤其应加强修养，隐忍行志，外愚内慧，可以遇难呈祥。如能谨慎行事，处处小心，更能有所作为。<br>";
        }
        if (guanameString.equals("复")) {
            return "第24卦 地雷复（复卦）  寓动于顺<br>　　中中卦<br>　　<font color='yellow'>象曰：</font>马氏太公不相合，世人占之忧疑多，恩人无义反为怨，是非平地起风波。<br>　　这个卦是异卦（下震上坤）相叠。震为雷、为动；坤为地、为顺，动则顺，顺其自然。动在顺中，内阳外阴，循序运动，进退自如，利于前进。<br>　　<font color='yellow'>事业：</font>已经渡过了困难时期，开始进入积极行动的阶段。但务必抓住时机，当机立断，却不可急躁，且应时常反省个人行动，严于修身，勇往直前，可望成功。<br>　　<font color='yellow'>经商：</font>可大胆投资，与志同道合的伙伴坦诚合作，打开市场，勿因挫折而退缩。更可以打入外地，坚持商业道德，循序渐进，一定会有所赢利。<br>　　<font color='yellow'>求名：</font>时机正在成熟，不要急于求成，继续奠定基础，机遇一旦到来，务必要抓住，必将转运。最忌自伤意志。<br>　　<font color='yellow'>外出：</font>无灾无祸，且有收获。<br>　　<font color='yellow'>婚恋：</font>顺利。但切不可性急，应冷静考虑。家庭的美满幸福，靠严于律己维持。<br>　　<font color='yellow'>交易：</font>若无变爻，反复努力终成，日后有是非之事。<br>　　<font color='yellow'>求职：</font>人心不齐，后复成。<br>　　<font color='yellow'>求财：</font>若无变爻，反复终成，有十分财。<br>　　<font color='yellow'>求官：</font>因事罢官者，宜求，若无变爻，七个月后官复原职。<br>　　<font color='yellow'>升学：</font>有阻力，若为复读生再考则有望。<br>　　<font color='yellow'>寻人：</font>自身反复，其人即在返回途中去寻便见。<br>　　<font color='yellow'>见贵：</font>有反复，力求可见。<br>　　<font color='yellow'>官司：</font>若无变爻，终无事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>性格活泼，精力旺盛，但因急躁情绪会造成事业损失。一定要冷静思考，勇于改正错误，必能重振事业。此时应抓住时机，明确方向，灵活机敏，脚踏实地改变处境。一旦出现意外，宜当机立断，暂行退让。如能准确驾驶自己，努力奋斗，成就事业十分顺利。<br>";
        }
        if (guanameString.equals("升")) {
            return "第46卦 地风升（升卦）  柔顺谦虚<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>士人来占必得名，生意买卖也兴隆，匠艺逢之交易好，农间庄稼亦收成。<br>　　这个卦是异卦相叠（下巽上坤）。坤为地、为顺；巽为木、为逊。大地生长树木，逐的成长，日渐高大成材，喻事业步步高升，前程远大，故名[升]。<br>　　<font color='yellow'>事业：</font>十分顺利，不断发展，依时而进，逐步上升，前程远大，但应逐步发展，切莫因顺利而冒进。谨慎小心，修养德行，追随有德行的前辈，真诚对待事业。<br>　　<font color='yellow'>经商：</font>遵守商业道德，从小处着手，逐渐开拓，通过自己的勤劳，真诚竞争，稳重为好，切莫冒失而成大错。<br>　　<font color='yellow'>求名：</font>努力学习，加强修养，以自己的聪明才智，必能得志，若有人引荐，前途更为广阔。但应注意节制。<br>　　<font color='yellow'>外出：</font>十分顺利，尤其是南行，不会有灾祸。<br>　　<font color='yellow'>婚恋：</font>双方以诚相待，逐步培养情感，一定可以成功。<br>　　<font color='yellow'>交易：</font>多有利，应在南方求得。<br>　　<font color='yellow'>求职：</font>时下未遂，终得成，心急事迟。<br>　　<font color='yellow'>求财：</font>小求大得，一人求，二人望，三人分财，有两处无虑。<br>　　<font color='yellow'>求官：</font>努力可得官，急求不成。<br>　　<font color='yellow'>升学：</font>正应之卦，若考大学宜报考南方院校。<br>　　<font color='yellow'>行人：</font>身当动，不从大路归，在小路见。<br>　　<font color='yellow'>见贵：</font>可进不可退，必有荣显之兆。<br>　　<font color='yellow'>官司：</font>宜进不宜退，终无大害。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>如意随愿。聪明、灵活、具有良好的成功基础，严格要求自己，谦虚和顺，虚心向长辈求教，逐步、稳健地发展自己的事业，将犹如树木的成长，终于会成栋梁之才。但在成长过程中，务必处处谨慎，坚持真诚和正直，大胆前进。<br>";
        }
        if (guanameString.equals("师")) {
            return "第7卦 地水师（师卦）  行险而顺<br>　　中上卦<br>　　<font color='yellow'>象曰：</font>将帅领旨去出征，骑着烈马拉硬弓，百步穿杨去得准，箭中金钱喜气生。<br>　　这个卦是异卦（下坎上坤）相叠。[师]指军队。坎为水、为险；坤为地、为顺，喻寓兵于农。兵凶战危，用兵乃圣人不得已而为之，但它可以顺利无阻碍地解决矛盾，因为顺乎形势，师出有名，故能化凶为吉。<br>　　<font color='yellow'>事业：</font>阻力很大，困难很多，处于激烈的竞争状态，必与他人密切合作，谨小慎微，行为果断，切忌盲目妄动，适度即可，注意保全自己。机动灵活，严于律已。从容沉着对付一切，必能成功。<br>　　<font color='yellow'>经商：</font>已有一定的积蓄，可以从事大的营销活动，但必卷入激烈商战，以刚毅顽强的精神和高尚的商业道德，辅以灵活的方法，勿贪图小利，勿掉以轻心，加强与他人的沟通，必可摆脱困境，化险为夷。<br>　　<font color='yellow'>求名：</font>具备很好的条件，但须有正确的引导，务必严格要求自己，克服不利因素的干扰，经过扎实努力，必可名利双全。<br>　　<font color='yellow'>外出：</font>[行险而顺。]虽有可能遇到麻烦，但结果一定十分顺利，可放心出行。<br>　　<font color='yellow'>婚恋：</font>慎重、专注，否则会陷入[三角]纠纷。痴情追求可以达到目的。<br>　　<font color='yellow'>交易：</font>有小成，不宜与人合伙。<br>　　<font color='yellow'>求职：</font>能成，在本市能得他人帮助。<br>　　<font color='yellow'>求财：</font>先难后易，有四分财。<br>　　<font color='yellow'>求官：</font>有贵人助，主有上品之官。<br>　　<font color='yellow'>升学：</font>有望，宜考军事类院校。<br>　　<font color='yellow'>行人：</font>在途，亥日可见信。<br>　　<font color='yellow'>官司：</font>有贵人相助，先忧后喜。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>天资聪颖，性格灵活，具有坚强的意志，对事业执着追求，迎难而进。可成就大事业。喜竞争，善争辩，富有冒险精神，不免带来麻烦，务老成持重，不贪功，以中正为要。<br>";
        }
        if (guanameString.equals("谦")) {
            return "第15卦 地山谦（谦卦）  内高外低<br>　　中中卦<br>　　<font color='yellow'>象曰：</font>天赐贫人一封金，不争不抢两平分，彼此分得金到手，一切谋望皆遂心。<br>　　这个卦是异卦（下艮上坤）相叠，艮为山，坤为地。地面有山，地卑（低）而山高，是为内高外低，比喻功高不自居，名高不自誉，位高不自傲。这就是谦。<br>　　<font color='yellow'>事业：</font>尚未被人器重，但因品德高尚，终会为人发现。自己不必有意表现，尤其不可放弃谦虚的美德，埋头苦干，一定会得到他人的帮助，在事业上大有作为。<br>　　<font color='yellow'>经商：</font>较为顺利，但不会获暴利，须逐步积累，故应极其小心谨慎，诚心与他人合作，遵守商业道德，通过自已的勤劳努力，取得商业的发展。<br>　　<font color='yellow'>求名：</font>天资聪明，但因性格不善于表现自己，起初往往被埋没，自己只要不灰心，继续努力钻研业务，保持谦逊好学精神，更大的成功正在未来。<br>　　<font color='yellow'>外出：</font>顺利，但应准备充分，途中小心，不可忽视安全。<br>　　<font color='yellow'>婚恋：</font>美满的婚姻应由双方共同去努力争取。否则，恋爱不成功，家庭不能和睦。<br>　　<font color='yellow'>交易：</font>以谦让态度待人，终成，有小是非不妨。<br>　　<font color='yellow'>求职：</font>三人同求，一人在内相让，再求有成。<br>　　<font color='yellow'>求官：</font>难成，三五次往求徒然费力，宜安于原位。<br>　　<font color='yellow'>升学：</font>有阻，降低志向可考上普通院校。<br>　　<font color='yellow'>官司：</font>小纠纷，礼让无事。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>具有内高外低的谦虚美德，善于团结他人，也能得到别人的帮助，事业很顺利，遇到困难，很快可以化险为夷，有惊无险。由于能够认真吸取别人的长处，进步很快，会畅通无阻，但需要特别注意学业、德业和修养。<br>";
        }
        if (guanameString.equals("坤")) {
            return "第2卦 坤为地（坤卦）  柔顺伸展<br>　　上上卦<br>　　<font color='yellow'>象曰：</font>肥羊失群入山岗，饿虎逢之把口张，适口充肠心欢喜，卦若占之大吉昌。<br>　　这个卦是同卦（下坤上坤）相叠，阴性。象征地（与乾卦相反），顺从天。承载万物，伸展无穷无尽。坤卦以雌马为象征，表明地道生育抚养万物，而又依天顺时，性情温顺。它以[先迷后得]证明[坤]顺从[乾]，依随[乾]，才能把握正确方向，遵循正道，获取吉利。<br>　　<font color='yellow'>事业：</font>诸项事业可以成功，得到预想的结果，但开始出师不利，为困境所扰。切莫冒险急进，须小心谨言慎行，尤其不可单枪匹马，独断专行。取得朋友的关心和支持最为重要，在他人的合作下，共同完成事业。因此，应注重内心修养，积蓄养德，效法大地，容忍负重，宽厚大度，以直率、方正、含蓄为原则，不得贪功自傲，持之以恒，谋求事业的成功。 <br>　　<font color='yellow'>经商：</font>机遇不很好，切莫冒险，以稳健为妥，遇到挫折，务必即时总结经验。注意储存货物，待价而沽，处处小心为是。<br>　　<font color='yellow'>求名：</font>比较顺利，具备基本条件，踏踏实实，埋头苦干，不追求身外之物，即可吉祥。<br>　　<font color='yellow'>外出：</font>宜结伴而行。可去陌生的地方。<br>　　<font color='yellow'>婚恋：</font>阴盛。以柔克刚，女方柔顺，美好姻缘，白头到老。<br>　　<font color='yellow'>交易：</font>宜往西南方向去，可成，有四五分财运。<br>　　<font color='yellow'>求职：</font>有始无终，枉费心力，不可前进。<br>　　<font color='yellow'>求财：</font>难求，宜缓不宜急，不宜与军人同求，否则有损。<br>　　<font color='yellow'>求官：</font>难成，再求有阻，若求官者为女性则有望成。<br>　　<font color='yellow'>升学：</font>第一志愿难成，第二志愿耐心等待有望。<br>　　<font color='yellow'>寻人：</font>空忙，纵在亦不相见。<br>　　<font color='yellow'>见贵：</font>虽有是非口舌，不防。<br>　　<font color='yellow'>官司：</font>因田土房产之争讼，宜和，有始无终之象。<br>　　　　※　　　※　　　※<br>　　<font color='yellow'>决策：</font>忠厚、温和，待人真诚，热心助人，因此也能得到他人的帮助，可往往因不提防小人而受到伤害，但无大碍。性格灵活，工作方法多样，可以左右逢源，得到赞许。难，消除灾难。<br>";
        }
        return "";
    }

    /**
     * 根据结果解卦
     *
     * @param gua_name 结果
     * @return 卦名
     */
    public static String jiegua(String gua_name) {
        if (gua_name.equals("000000")) {
            return ("乾");
        }
        if (gua_name.equals("00000x")) {
            return ("坤");
        }
        if (gua_name.equals("0000xx")) {
            return ("屯");
        }
        if (gua_name.equals("000xxx")) {
            return ("蒙");
        }
        if (gua_name.equals("00xxxx")) {
            return ("需");
        }
        if (gua_name.equals("0xxxxx")) {
            return ("讼");
        }
        if (gua_name.equals("0x0xxx")) {
            return ("师");
        }
        if (gua_name.equals("0x0000")) {
            return ("比");
        }
        if (gua_name.equals("x00x00")) {
            return ("小畜");
        }
        if (gua_name.equals("x00x0x")) {
            return ("履");
        }
        if (gua_name.equals("x00xxx")) {
            return ("泰");
        }
        if (gua_name.equals("x000xx")) {
            return ("否");
        }
        if (gua_name.equals("x0x0xx")) {
            return ("同人");
        }
        if (gua_name.equals("xxx0xx")) {
            return ("大有");
        }
        if (gua_name.equals("xx00xx")) {
            return ("谦");
        }
        if (gua_name.equals("xx0x00")) {
            return ("豫");
        }
        if (gua_name.equals("0x00x0")) {
            return ("随");
        }
        if (gua_name.equals("0x00xx")) {
            return ("蛊");
        }
        if (gua_name.equals("0x000x")) {
            return ("临");
        }
        if (gua_name.equals("0x0x0x")) {
            return ("观");
        }
        if (gua_name.equals("0xxx0x")) {
            return ("噬嗑");
        }
        if (gua_name.equals("00xx0x")) {
            return ("贲");
        }
        if (gua_name.equals("000x0x")) {
            return ("剥");
        }
        if (gua_name.equals("0000x0")) {
            return ("复");
        }
        if (gua_name.equals("xx0xx0")) {
            return ("无妄");
        }
        if (gua_name.equals("xx0xxx")) {
            return ("大畜");
        }
        if (gua_name.equals("xx0x0x")) {
            return ("颐");
        }
        if (gua_name.equals("xx000x")) {
            return ("大过");
        }
        if (gua_name.equals("xxx00x")) {
            return ("坎");
        }
        if (gua_name.equals("x0x00x")) {
            return ("离");
        }
        if (gua_name.equals("x0000x")) {

            return ("咸");
        }
        if (gua_name.equals("x00xx0")) {

            return ("恒");
        }
        if (gua_name.equals("00x00x")) {

            return ("遁");
        }
        if (gua_name.equals("00x000")) {

            return ("大壮");
        }
        if (gua_name.equals("00x0x0")) {

            return ("晋");
        }
        if (gua_name.equals("00xxx0")) {

            return ("明夷");
        }
        if (gua_name.equals("000xx0")) {

            return ("家人");
        }
        if (gua_name.equals("0x0xx0")) {

            return ("睽");
        }
        if (gua_name.equals("0xxxx0")) {

            return ("蹇");
        }
        if (gua_name.equals("0xx00x")) {

            return ("解");
        }
        if (gua_name.equals("x0xx0x")) {

            return ("损");
        }
        if (gua_name.equals("x0xx00")) {

            return ("益");
        }
        if (gua_name.equals("x0xxx0")) {

            return ("夬");
        }
        if (gua_name.equals("x0x0x0")) {

            return ("姤");
        }
        if (gua_name.equals("x000x0")) {

            return ("萃");
        }
        if (gua_name.equals("xx00x0")) {

            return ("升");
        }
        if (gua_name.equals("xxx0x0")) {

            return ("困");
        }
        if (gua_name.equals("xxxx0x")) {

            return ("井");
        }
        if (gua_name.equals("0xx0xx")) {

            return ("革");
        }
        if (gua_name.equals("0xx0x0")) {

            return ("鼎");
        }
        if (gua_name.equals("0xx000")) {

            return ("震");
        }
        if (gua_name.equals("0xxx00")) {

            return ("艮");
        }
        if (gua_name.equals("0x0x00")) {

            return ("渐");
        }
        if (gua_name.equals("000x00")) {

            return ("归妹");
        }
        if (gua_name.equals("00xx00")) {

            return ("丰");
        }
        if (gua_name.equals("00x0xx")) {

            return ("旅");
        }
        if (gua_name.equals("xxxxxx")) {

            return ("巽");
        }
        if (gua_name.equals("xxxxx0")) {

            return ("兑");
        }
        if (gua_name.equals("xxxx00")) {

            return ("涣");
        }
        if (gua_name.equals("xxx000")) {

            return ("节");
        }
        if (gua_name.equals("xx0000")) {

            return ("中孚");
        }
        if (gua_name.equals("x00000")) {

            return ("小过");
        }
        if (gua_name.equals("x0x000")) {

            return ("既济");
        }
        if (gua_name.equals("x0xxxx")) {

            return ("未济");
        }
        return null;
    }

    public static void main(String[] args) {
//        String[] gua = {"乾", "坤", "屯", "蒙", "需", "讼", "师", "比", "小畜", "履", "泰", "否", "同人", "大有", "谦", "豫", "随", "蛊", "临", "观", "噬嗑", "贲", "剥", "复", "无妄", "大畜", "颐", "大过", "坎", "离", "咸", "恒", "遁", "大壮", "晋", "明夷", "家人", "睽", "蹇", "解", "损", "益", "夬", "姤", "萃", "升", "困", "井", "革", "鼎", "震", "艮", "渐", "归妹", "丰", "旅", "巽", "兑", "涣", "节", "中孚", "小过", "既济", "未济"};
//        for (int i = 0; i < gua.length; i++) {
//            String result = Luozhuangbagua.getbagua(gua[i]);
//            if (result == null) {
//                i++;
//            }
//        }
        System.out.println("1、三枚相同的硬币。最佳为“乾隆通宝”，“乾隆通宝”正面有八卦和六十四卦首卦的“乾”字，注意不要用假古币，用假古币不如用现在1元、5角、1角硬币。");
        System.out.println("2、确定硬币正反两面的阴阳两仪，这个确定可以是任意的，但确定好之后就不要反复改变。一般是把有汉字的一面当作正面、阳面，把有图（古币满文也算图）的一面当作反面、阴面。");
        System.out.println("3、把三枚硬币装在乌龟壳里，没有乌龟壳用竹筒这些都可以，要求两面都有开口，需要记住硬币投放入口，扑卦要求一口入另一口出。");
        System.out.println("4、双手握住两端开口，让硬币不至于掉出去。诚心默念要卜测的事情，或将要问的事情说出来也行，但是不可以发呆。脑子一片空白的话静一下再扑。");
        System.out.println("4、摇动几下，自然的让硬币从另一口有顺序得倒出来，把结果记下来。根据刚刚定义，正面、阳面，在纸上画一圆圈，反面、阴面，在纸上画一叉，这里要求按硬币出来顺序记录。");
        System.out.println("5、重复刚刚动作，记录结果应该类似00xx00");
        System.out.print(Luozhuangbagua.getbagua(Luozhuangbagua.jiegua("00xx00")));

    }
}