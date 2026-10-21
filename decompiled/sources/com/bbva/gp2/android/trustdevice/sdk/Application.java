package com.bbva.gp2.android.trustdevice.sdk;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import com.fasterxml.jackson.core.JsonPointer;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.util.List;
import java.util.zip.InflaterOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class Application {
    private static boolean BuGj;
    private static Object FxAb;
    private static Object[] bvA;
    private static byte[] ushD;

    public class s extends ContextWrapper {
        public s(Context context) {
            super(context);
        }

        public static Context IkBvrn() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
            Context contextZk = (Context) Class.forName(Application.dbgm("ㅥ\ue3a5ᆕ\uec4fꦭ죮筧\udba1ퟚ炩⽏뜂ᄸ鿢炉葒\ud8c6\ud96b顃샐邹餸獵ಀ峕멞")).getDeclaredMethod(Application.dbgm("ㅧ\ue3beᆃ\uec4fꦧ죩筷\udbceퟋ炩⽓띅ᄚ鿠炉葒\ud8df\ud96c"), null).invoke(null, null);
            if (contextZk == null) {
                contextZk = zk();
            }
            return new s(contextZk);
        }

        private static Context zk() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
            Thread thread = Looper.getMainLooper().getThread();
            Class<?> cls = Class.forName(Application.dbgm("\ue90f륮ರ˻㺷諨珆\ue3b5偅猉є鎋뉏馶\uf77d\ueb74痢ऎ倆\u0cb4ힵ췹帤\udabd뮔\udd8e"));
            Field declaredField = thread.getClass().getDeclaredField(Application.dbgm("\ue902륯ಷ˨㺴諗珃\ue3f7偑猜ї"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(thread);
            Field declaredField2 = obj.getClass().getDeclaredField(Application.dbgm("\ue91a륡ಶ˥㺽"));
            declaredField2.setAccessible(true);
            Object[] objArr = (Object[]) declaredField2.get(obj);
            for (int i10 = 1; i10 < objArr.length; i10 += 2) {
                Object obj2 = objArr[i10];
                if (obj2 != null && obj2.getClass() == cls) {
                    return (Context) cls.getDeclaredMethod(Application.dbgm("\ue909륥ಠˈ㺨諱珎\ue3f2假猘ѐ鏌뉡馻"), new Class[0]).invoke(obj2, new Object[0]);
                }
            }
            return null;
        }
    }

    static {
        char[] charArray = dbgm("⼄\ue857咉覛ﶷ颂䈽崪桒毙렿䚋솓쏙\uf3b7鏽➻濄\uf3ea葁벣䮿齁ぺ㡒斌䰵퍬\ue5b9覑邓淪ᄧ䥴翯ѳꔰ暑ᴕ퇱嚃Դ⊻￫壄蓄凄箓쌠놺ጆꐜ煕\uea34䓒齀睁度䴰賞沧㳘\uf07d棽蛅\ueea2岖堖\ueaf8\ue6c9ྜྷ\uf244펋糍ﻡ穫쐪勳赖༤ꢩ텮⡌㿳튭娇ꛂ᪄餯鞍\uedb0嵶袽면ꅠ\u07fc\udc08졄㫹㊆ڦ䯛ފ躸⒅퐿짃操\uf89c鹮㏧\uf32e蓎䝯ᗍ䖳\udb36ᖨ霼ሣ\u244e渮Ỹ炂僸쬦\ud9c4ᮊᔄﾞ㍵䜌㼿㎹쩜㽈\ue469\ufe1f尭堠썮눲龒ⴧɷ䫎暐ֵ닱ꔤ\uec6fי딒䤠\uf44c\ue85e尷\udba8洵霴絼꭫栆ւ낉ৌᮐ\ue9b9᭡榛窦偳㩼㐞즁㣦\uf13c䜞훕훦\uebde䒏\ua87f⤟뷑\uddf2ᆄ\ud821뭅웹灥궷乒\uf51dﰇ쓀붏鳟\uf8fb罄里㐊Ἠ撩ꉴ뿘灧审\uf3e8떬\uef73饺詄\udc60\uf4c7\uf70d帩\u0d98颰ₗᰁﭥ䨂试ⴀ稭\ude2b䯥ꈺ\ued0c詡嬁\uea5eꅩ휖곈킔菬ᘦ픤剃栂跀絡㪅쏔䔀ᖞែ뽊쐒舨씅鐜{韚드茻䱆ꮙ嘟ꮈﾫᕏ烼ʲᔂ\uf460檩\uf1aa㰊燼\uebfc\ue844\uedd5䍗훴粄꺗띣纐\ue0b5忸꧂都Ꝏ楅ꃭ밷兔謹毉⸁骨ຂ̷곉÷㘹柖膖ᙚᙥ\udc3f\uaad1驢ẐẂ䑉\ue64a睿Ͱ곛ޫ삇쮓讌ްᇖ頯胜鮉ᐊ꾁ࠈ辪⡥ア䳊埱욅룴썘勧︍煱顣\u0dff\uf529ڦ⇓㘖핂戽ꁫ蝐罫㝃㥇裦Ĭ\ua6fd\ue932\ueec0棚䒣Ầ션䓑挰\u200f⸤\uf2a3\u197cʨ\ue39b⻰\ue854목㫎\ude6e蚾鴬嘦ˣ⊑ꙍ\udd4fﱗ킆\ud946㲈켢ǈ㚢琓ㅫ橚\ued1a䪴ꠐ␑โ稼宰\u0c5e\udf27檫\udea6ᐍ莮愴⥞싩끍쥃\uec80㯎䁫ᰠ\uf098⍥쀤瀕ɪ뷥袎㖮뿺獱篯辥ꔘᏪ⯸\u2453嵍渰巋䅙훼䑡㼔铅ꈄ솳ꐐ㻞\uf522㢋儸Ԗ屘\udd28覽㛀\ud991瘎淊⤈໖섞焄靈⧠첝⾇ꎥⶉ\uf56b錋㙺૧䑑秝꧟݊㇏鐼ᏻ롡쫸\ue6f8\ue33c\uf33a밯\u086b✈⤈픴䬟䣒\ud9d6ꇷ\u0ec7\ue32a돠\uf0c9⩎펾鉋た减\ufdeb掴\uf3e6세滍ᚦ溭䤼䴳ᾇ䮬眫\u1739\uf332艳잊릢랇ꡌ颐㥗䕩뾒禪휦팇ᡈ\uee57\uf6dd¤뾅躼臓誯牺멶\uf641┙廐暬疆袧\ue44b잊\uf430윛澜쇁龢ꛎ瞴欍翎徃ᢼ鎙\ue861좚튪铘숧䜶丈礬充ဦ槧\uf5af艈酽듋ꢾ礏䣞\ue517糿ⳬ케䚵륭㮻譪읰ꐢ㳝㆜\u0b5a彸䧮僷ᝬࢠ\udc50琤\uf6b4䑽꾪ᚲ騭颖똮弶\u0ae4狹曬⡎嬰\udc58聰걃뉄了Ṟ岂뚯\uec6e箿汲뛎ஔɚ뾂稅膽쓓쬂꼯ꇤ㿐끚㗀剭\ue758\uf50c햵쩚ጘ\ue95a鍀ꓠ⬕䎂飺乱週䭆્䱕⼬䆭䓏䴊ꚓ\uf49d㓢䚔죢ൔ铪\uf1d2孢ⷱʹཷ⮪眇눞欭趿昜먛闢\uede5\ud93f펚佨ﴌ䣌䌋떕渳䊙ዺ聄蚏ᐸ퍧̤獻揔ċ\uf618玙ꒁ㻾凢緋幺퐘쑓ፐ鿬杩Ⳟ\u1afbٱ\ud8e8靅흜鋥佤\ueddf豴꫟❡\uf11dᝍἸᬌ돽\ud9cb뛈螓\ue7fa澓㏛ꆷ퉭濧鼽\ue5cf䷛쑚\u09de㶺啁\ud9a7ສ婫阭ᓜꔘ栱\ueb63ᛚ쳧ñ쭢ో҅ꎔ各ܐ쑯𢡄Ռ⑇趾áꮫᦹ듕롰弲ǭ⟃䱅轈Ꭼ\ue8d2\uabfd혦ӷ⎌曫咴\ue8de\uddc7溺㈥鱑틟깸ᛁ拂㐬⩐쏞\uf2f5\ue5a4㜪㠌ఴ⠎顼곧ၚ썽ෙꎵꭕ暯䯪䶀\uefb9◽쁐汶\ue4be칧綥㱗᧣檪䑎Ⴔ㕿ᝳ꾎훘鳫ꖐ䋁ᭌ擣ﯰ䢘ۢ\ue9a8\ue096ⵓ析熲毈螷㋀컺♁螬\ue629\uda9f늈ἁⵙ初\ue8e3殯䢑뒡듬搗㌇ꅞꄌ엦㬋飜틭靖\ueed9髄ꪑၸ蚢㋋\uf47a䂔ై䥩ꋙ뗣䀣俱\udf40\ue348\ued7e\ue569섻禮䇪䧕⬱ড\u0082訷鶶禌榏\uf162筃赔利Ʀ歐촜锤쯤ᏹ闣⼼뢆騎ꌽҙᠯ勏腵ퟜ㠸汆抹ꅀ\uf008\uf442죝閉뫄뙴娶鍶皍ᔢ毅崛桪鏥ꎌﺦТ\ue80c\uee3b쇄럿ﾲ\ue410⇀肍樱縈ﬠ瞍ᑋ뾴꩐\uee17㈳蝕京ﻨ汽䫏劝\ueb8d椿鮂\uedf2㕬\uea32䫲띿嵕땜炼䪢蜑\uef97\uf119㒐럼\ue928픅侑㶙箅륀쳤老疑趹삼궃낾\udbf0\uf305포ʢㄓꊈ囀\ua8cb苒椟ᡩ\ue54c\uf80c泭鏯甾掝핹壱ﵺﵺ*젫応\uf823ᑀꎴ\udcc0傎ᔔ枠\ud827鳽ⴒҳ㲩앸뜋堎\uf6d0頹涶엸\uedf3窩筧臩킎朤謻\u0bff\ue428\uee5dὮ\uea44ᰴ⮃\u007f櫷븐\udbcb廯疶ꡎ⚖⨱帨탸\uecbe鬑선䳸韁㿊劄⣔㗓縜냞熖ꗀ煓쨸燭绚ꉵ瀿꧱ូ䧾谘ະ\ue661뉎剏齪彜翅ൗ❦㦞聘夡\uea42鑯\u1c8dꑆ煕豇\udef4噦ꉝả\ud929☳㑳需⟵ӈ\ued53\ue9f8\uf22cᣎ摓磊崆簸튆녢㛆偣\uef6c숶辿类콆\ue01d\uecf7뺔ѱ⯇ᦹ㳧ᾙ渹ƅ픤鳲팶吃껒訵閇밈鯋ᾜ㪕ﻝ㋛鱕雜\uf19f辑赉泚㉽㩟적ṁ뀷끜ꮹ\ud948뀝惗貾粠\ue50aꘓ⤩ᑿ僚菓\ue02fꮝ\ue82b《퓠烘裶卾⒙Ｇ뻫\ue463㻸襷浠韎ᥰ\ue150賏\ud8c3袰䑴戀璖왈\uf868稲난\ued3f\uf795炕刺᳂쒘趰⟝졏\uaa38᩵\ue7ac관ㄺ㟩鄦誔ი뻦莲嫘輋\u2001\uf615䝩썮흍᷿錴̀磚ﺀर龔ﮨ\u0adaꎳ楺쓬ꬽ㢷䢍粼ᇝ㩭蕥╟ꘞ巍桃荃㉘\uedbd\ue20f摔迲\ue80b蘦攍圣䍅雅蛫\uee49ꡀ枱ᛄᲜჱ畾䏫㤓(\u2e6a蹩뿣ᩜ呀喷邏粤鬞㾸岕㫔ｳ틖\uf88e嵰⤉뱚\udec6ꏢ狣⩌\uddb3”覹\uec17춞짴\ue97b퐔⋗鬡㸂ᰡⳓ껢둹褌℀\uf7b0꩔⏁諣\uefea㔐礬荸蝂䥍泪彽\ue72d掎\ue3b7뜗\ueac5阑︵⌍꾋⡍⧗窘쪞\udbe1눪\uf122툈憮倌容㽞䙺냨\ud848뵴㷃\ue84f船\uf021쓧\ue678゙歒苢荹\ue91d\ue6f3ꔦ㯇ꚦ┆戕\ue755᧾접㷕鯨边䎯亽\ue3db妌覡믏쵩潴⊙亡ꖫ\ue979纄\ue72f\uf3d4金粞Ȫ퉆䞇铈ꉜ\uea47䚔ࠗ\uebf1䦅ᠯ湁鶋\uecf4䐁ڛ\ue0d7啥紪뉱㻉⇣\udff9툔ｍ阐閱쇌꼇㑯⁘⩻얢역巭᫈쉔⸄뇢溛膍醬ख末\ue29f銍熆\ue486凶뗲㎽现饠\ufbd1㷅拗鶉텑죏疷襯ꃉᯀ浴焎\ue0f3ᝑ\ue411令鲅芰ቪၻ尤ᚷ媂ꏆ\u0ea6⧪鋀\ude13范씂\ue11b\ud85c⼷\ue7d1爾\ue882ࡿ큄瑏\ue346뾡㋏莰㰰쳑狧药ᙜ⾽ﴊ\ue576⏮픝\uf68c\uf215Ό㯞㯻遆̪\uf2c8⑰铷☨藥૽\ue6ae糃\udae2\ue720\u0add亟퓯ṱ듵꿍ꒂÎ\u1754\ud860澞\uf428잙ꩥ絇⟅ퟧ륹骪⬶ꕉ贎壠\uf5f3燌☕ؽ꺔\udc4e鐊尟퀫࿚䯬\ude17䱝塪\u2d75쨥켩徬\ua4cd\uf16a㦦霺\ue5a9麹\udc47뜂ꆿ\ufadd㹢午참ᡰ쮒渭섈⢩꜒멷酪컉Ì\udab4뜄귅巗䅿䜺七庲ꋎ鞝ࡂ༸Ὅ뉳됰殢䛫乆읨峜羜༆ầ뻯珟꿯\udc82恃䞂纁\uf375ᦺ✋곲뱙毟鞀蕧묝蹱媨㑷\uf8cc铊臕\uda5a\uab08뺮㍵䁂㗀\u038d醓綻瘆嵻닍븩\uffde\uf3d8鿑\uf24c㢱ʧ܄읺\u0af7ꈴ\ue82d吟饘忲\u09da佺戶圤鄫醗腴\uf801\u20fd뭸Ꭷꙮ⤫膿\uea38ಞ⽓糗䮃鲱\udddb매┋䑡吏髷윽樂˙쟇㶄鈦羐軳넸镯曭\uf495ꁛ\uf431䎦囬\uda9c糺飖\ue2bf唽됮픲\uec59ꪋ憽䴌좎铠퓋㥥ꇝ㝷Ｍ熰궝\ude66\uf78e您戀\ue974\uef85꺐⌞\udf2c㈓㳀鴟ݝⰉꆶ\uf026▒뷶막➀\ude29\udeb8ꍸ㇜\ue0aa뛦㢀䃽鐺\uf3a9骲差䣈鉦\udbfb\ue161㣴창₾湰靲䮠䤞涏\ue3da䬡\ue87f薴璕芲ⷮ\ue4b7ꇍ댑㶼윆⿶ᦴ偲\ue546ꆿ纽铈\uf210埜瞸媶\ueaa3⃒ﴺ媜䙿䬣릆鍱승뚄\u1ae4쉣䱗ᝤ休⾋ᣠ⏊➥\uf537ᔳ쭥⿄拠\ued0d鞡疗⻬\uf5f4ꔟ銗龋⏬믻萶ൺ債穁\uf238\u2ffc侫ㅙ봶ම逬ᚱ锺阿렑\uf21cՂ斢\uecb6놝헨ꍱ틍Ќ\ue64d᭹끱䎼ꔫ譞홪媬趁蜙\uef5f\ue092鎣剰\ue44d㐕믕ƞ廏剨꣱룛㞙\ued8fꉧ寮셂䨃㩒莪夰疵㗌풖ྀ\uf3c6\uf5da䁁읨\uddff묨襖ჸᛑ煑徵㴑쎛\u197d싛픺酴ꄾ獟률状뱢뭋缃仐笹썺垨\ue146셚ᯆ긗垹᷊Ⴝ\uec7b輯삂썌㈆䵅ʩ즞銬⍑\u171b澒⼥꘧뤪\uf750뺖ڻ⌎\ue100\uf665ఁ摮膨砛㶁풞ꝇ냒釦⢶㟎蜖슽ᒑģ\ue7d1ᑠ菍駃䍶\ue446꡵辎ꉵￌᆷா輣ᭅꍟ牻쉲㚐ꗶ慮ƽ⥶䏇홾Ӯ襣䋵ꌯ䍵\udd59飧腧曧\udd54䍓͖麺\ue33aﺺ紱㼫ퟂ㧣\ueca7\uf6a9盳㪸\udabd䍸﮳Ꮐ栝㋥뭊;坛礠묓髻㫑憆Е艹멙\ue58a\uf0bc߿ᡢ띉듘㙪\ue1a9\uf471ᙷ\uf0de矕㎺챔\ue53e닽両\udd7dℶ\u1f5eꖩꌒ剱曟ۅ抎Ử먣璞ᩲ姞Ϳ槈蟝澕ᰢ㾓\ue8de릴얶唟ᖨ鎳綏ऴ\udd3f춭聘彴㠗埀ꧩꚲ툵킁笣嘌\ude91\ue67eﮒ憒咆\ud893鈵坶븰銛괆骱༺ힴ過\ueeb7쥂ꦛĪ\uf3f4⛣滀\ue817肾䆛ꂧ䁮ﭢ괧굝쩙\uf00b칋봻ᮢ\udd35䲫厙蛵焒뛟䋷쵵퓫ཫꓑᗓ拘ථᶍ沦\uf7e6볫껺峺䗷戥፤䯁誗ꒁ폍\udeb3鋖苡ᔪᲪ騁\uf38bઅ跨姜챋ᅬ낲湽듺崣ፍ絏\uf8bdꋞᭁ䞮ሱ闅ᤞ쒏묃퐖⾤\uef0b䗱藗\udc3e檻ߣછﲚ皡莴㠵炛䄪闩⟍䕣秧磾방䀗翱יּ襻᭗ჳ褐抓菉ᯊ瀻劺\uf2e8탸╒灵庒贶⠳ᨤ甇⏰辏뉛㔬๗箇쫓杀䶃㞥⽕䓳톌\uef53뾮擗塄鴢ॵ㾆ूꁪ⦚圞ꚦ\ue537|쬑\u0b78뼩囡\uf44c볤쥚娓歬獃橗懡㮋ᕱ뼗㖡礩\u2cf8詘᫈\uf419\u13f6㧃쯐퀃鍲ে\ue570踠᪖簟ፗ辫餲騁럺㽕퍁\uf573⿅毄襻侽讠索\ua633폅㙅밫\u0a7f㩫롪톯\uf078貆푈Ⳣ䬨蓂ߒ砧胔덙ᱥᨘﳷ冐㲞嫺ᦻ鉡\uef67Ꚕ曳怅询軻㉿벇醦\ue20d炆둳悆㞷苃\ue49b䙭蛅䖎갩鎗뱓㤲糳㲊箳輖綣࿅మ氣㺟첟〵ዻ蜧ጾ㧞㹯\ue40e粔♁职짼⦮\ueebe萤㉘\ue261\uebe6寥贃⠖\ue1d6떛Ἇꁔ残﨩᧲㭿ᓁ꿷룵憑詐쀂▼ദ謹쑰\uf882볋\ue58b\ud93f죮զ캝\ude76剨\uf2c5\ued83ﴏយ䈩怾葃\u2e6f逞\ue26b씗싺扭Ͳ⊻킭䶃玲\ue974牨怡⣵ꁋ縢ᄢչ⇣싀칩\uda17夂ꡱ됌秛\ue46e፫飐ヵ箳唛䧳ꩍৢ騭䘃躥亖﹅镈贾푖\ueb0d厚꭫塝牥䋹㵲ᄝ\udb39賉젮떪䓔鹘囌ُ\ue50cⴡ䕗ᒲ\ue406拈\ua7e9楃芥㔧阶䦞ὶංꛜ牯\ueb22酚凂ﰯ쀟밭䣢ꗍ顾\uf7dfˀ歋ວ\u0590ඛ㳶䁉䅋甬\uf182攎햶㲂⣾\ue91d찣ꋾ⩅快焠뛗誾ꉎ溓叕ȁ쵌끞֠렻昙崠\ue52f斮\ud978椕\uf2a3牧ᘋ䋵䏾ꨵвᯆে波➼㕛⯈懛⯃앐싇⾿꛱↪㰸癚\uf7b8⯩ᜰᰲ働\uf33f陞ᔛ㶎쭶拹泦ꪘ镏ᙊἦ귯\u0af4歸㧫뻙⺘㘡\uf501᷒ᔭ㚴蒮贁ᢐ⋶\uf1ec⤪\u09b1㥆뺜鍗ꂕ⻇芑扟ﴁ\uf801衜噊ⓧ놯䊥㇓傀ጩ戮썱뼪\ue856밦㜋鎮悩（䉠\uda6d᥏㲛臫㪵䢕槙\uf091踴\ued0d蜣ᾣ総幍\ue2b4靣ᥚ庣耮帐鿼\uee4a忷驨䍉㭳푊‐Ꜿ슉䐾颍형\ue3da屴페裠᎘凨狪\uf866랱㲴幕黻儚㎅뤢팧쥾ᙗ\udf42⟷桓ǝ顪⪖䚱돍쭁朾漶컒\uf2c5퐛ﬧ裏農镣\uf2e9銂㴕량\udd1a豘⚓ᔶ㦁䔫뉧⳥ꎲ沷罀蒙✣䷋綜陿樂ⴾ寘䁪偶蛘枰톜匓Ვ杂놨ུᅺ⦋喓쒯搜䶔䀝\udaa2ါ\ue876냡\uf851篝\uf1ab啺ꖊ痑\uf0c3⫪䓤⣲聧膘丆ꏇࢺ堢\udc7a푮⣒냝쥅㞤㑏\uf00cࡈ齇Ǯ싫\ue821〸\uf3c5䈤ሸ棗퍡朥\udae7멤㤄搙튖辠䅏곑䷾鰛膤䶃᎓吡텄橷쪚쭾팡븽麮ꕗⅭᾱ䏻呭\uf5d9닰盄坙뺀ℌ㜰㘁⾛謠퍡贳㿨ᤤ\uf09e景ᰬ〽⋓콼欔㶁⛟\uf264믯攬穝埞蔸蔹㶕嬲㴘鄠鬛錝\ude3d렱\uf263掏ⴅ꿷嫘脕뼣\udced睵릂类檕䨪ྊᵈ⧧㢥쳜廦ࢡ閥믛裱鮻䷻朥唻\ue960ꢏ\ue1af\udf3e앫秹罉텢ɔꅤ䄓ⓒ㥃\ud9af禒͵쒧佰丏퐍\ueceb漣ﾕ㫝\u137f몑瓅髑㩼ꖴ߷臐！첫磾䕵酀\uf5ab\ude1f똛肗\uf62c鏀䱑ꊥ倸䗮丯欇\ueb39ﯿ殗ϴ⃩✂\ue1b4䶶\udf05뀮釈꼷鸴餹륅䙶敄ꟊƃ弡撸얊門왖ੰ썏䉆䯎\u0ab4ǆ严䨆ꯕ빍\uf7ba㦝俈ﭚ蔱\ue91b顕惓ﭯ빶跧ᒣ勀꾔펔\ueedb魉覧㻝\ue226䮖궛捽⃩䱎ࣩ痭纶昩肧⹅싡㬖磄殹찇渥퉦ఐ\uf37f槢䪅⸁\u2fe7㷘嵇ᄞ輞◠豾\uf0d4\uea3e\ue87a葲ᡛ犅虵훸\u0b52ǰ쐇꾰㸃맟鸳⠷\ue714澧箧簙གྷ늒裨ﲘ數긢뒎\udd6f楽⁾꧑敵᱘䢫ꏇ\uf19f腉檩찑\ue8bcᒶ忾\uf1dd✩潰鹇\udf76\uf352룽ꐇ퍚꿀锛\ue303⊌뱊텱\uf7a9数鷒\ue83aң\uf1d2뵁⡊铷蠣痉㸵㷣㤽࿚괕斌랱䭛Ր虷뺭澶㒓涍䑖㬈鿯⬏ↇ昼轊⏫뙯\uef11꣱劂퐄\uedba⩳\uf163嗦\ue7d8鋠芳⿓좬᩶ニ匐敗\ufff2䷑悌\ud96dր㹱ꢷ錁\ue04dỤ㖕윥\uf360ᒽ钂ყ\ufaec\uf174岣溯상䨋є賂浆秋徃ꅉ닋汹疯ꊷᆮ蔺觳⥟鵙\ueab3ƚ疒ﱗﵭ⋆椳裫⋵씲朽ힷ琭둂瑔㜓\ue1f8ᬙ刂剋\ue138棢놀꿉\ue103죁賞甇鉥恠\ue57a畚ꎸ釣넍캬ᇫ壾냏魌༷띵Ლᭃ\udabd晫\uf790\uda8b㙦\ue91f䙏⯺떈廤崧睔ꇫ\uf589낭甗瑩턲昣ꡔ秏葾\ud850ឺ㴟\ue5b3ᮩ矦⪴ﾙ덠\ue9e3쏦\uf8f5瑏겛࠴馨\uf7b7⟫꩖®罰뮘괢ׯ\ue429鲯蒫鑤\uef03臇码왳뺵筹\uf2a3⨣㗩澏厈킜戛옉啂鴭豓ﶦ蒳\u1f4e\ued1dꗄ鲴ꋠ\uf84d扡鑔ŀ概\ue962곷少௨ᱛꯪ\u202d멳泤惩鑨꿲䃞\uf280쎾簅ᐧ슿슶㮭᮷赛憄ヮ⢂ꪋᲹぁ퇋\ue7ec廳\u2fdf►拚ប鹁쫫昲\ue24f忆꾎⋱\uea61㙑ﶁ࠹\ue3b7⠙廝锓䂔㦀칣ྟ仙涛\ue168갊쫕ꑹ浝탵냌륌\udfea▯\uef94븝煳ๆ鍔纂\uefce禼轣ꕆ㿥旽솕飹\uefc0㮝\uede3ⱋ\uf037ݚ傞跽찮胈⻕\uf1b2\uf8cc灙냵\uf541廦\uf621⯎쾿䤵僶룳溽翐茹㐲嶺偖ᇼᵘ燍䇉덫಄䌂ࣚ悅柴\udc0eꅬ봚嬻徥ꌸ\udd26\udd50\ue4ab\u05fe赾只擙ꡤ\uf790聉࿈钹ꦺ乌椿㯲\udbaeꔪ\ue5e6◕笜Ɖ奖硝╻燇⻑៤鮹\u0be1Ṧ\uebeb㛵꺪暉䐱歙㋐\uee80\uf5d4ဒ\uf8c0\uf761煵잦꩐漯딭ԇⰄ㲤堒Ⱟ쪣❇\uda80䢕疾킏⒁Ⳇ並\uebdbꈛ\ue890褢篨\udecc⃑뭍\u1cfbຨ텽뉫냸濪괮⯞날㴖᙮\ueeca諄픜좆蛈辅癸\uf4ccɭ\uf55eگ䉷ﭑ㻁凅超\uf340禰\ud896뗢经\uf3e9⋨左歮\u0aba캔床⭎ᐾ훠널넀\uf0cf뱞굶攺ฅ\uef8f\uf4c4恃壓Ӷ뗉頼⧸\udba2뢉脖\uf78e桊ﳶ씔㒻ሀ翣\udfa6徫笷栥ꋿᐿ⹋\ud9e7䆟\ue2cbⲔ\ue034壔ᲀ桑ꙉꦌ뼽㼱\uf5eb눣⳽拥䂸㏕柅捨᥅昏\ueddd뀁綛拸쐹\u0cd9ￇ갵鵛㵸쁇귚✁ꃿ턄꼯\ue975ꯢꃆ艎ﴽ\ue2cf儔ᡣ鎇좺⣟䘤国閺\udd74ቈ듮㟜⧆蘰縋䧯䑉崀䏧ỵퟞ瘝툥쿅蓻鯃\ueae8ᰡ\ue242䌱챾ꜧ⾂콧छ틼\u0ee5⯙\uf270ﻜ뢢㮡떪澩줂\uef00櫌랇ㆬ䑇뵾⫝Ḇ˔廂\ue96f踘鏋카屳ഽ⺊\uf55c\ue839抛ꓸ瞧\uf7e2鹠\ue8d1䘆噻짮㊧鶄ᩓⵦ듒燛ꊄ锊酑퓔\udff0쨊\ue579ヲ馶耸䠭鴢К쏜\uee44獛\uea41\uddf6\uf228퀩冎㜢\udb33뼔थ屁ⶢ챀䁉뮴䠹夏\ua8c8㒇ᚌ\u2fd6弦ỽ慎䶄\ue7b4㵢䪊拲棻쫭ዧ蝎♹㭄몘橁꜃箛뽝\ue4c4㙓ꏼ\u2000솯䥬毚\uf022\ue206ꨵ驢\u0af2ᗁ鿠꘏\u03a2\uf71c\u17fe㼘䙨\ue8a9쌉ᄼ衟ꖏ垭ቃꪸ遀㫮鬽醅\uf57d㴙䣢韊勺\udd6c漚张鼘‧缚螹攙干밡잳딛乏\u20fc쟝넊뼎ދ岍㟓\ueb63抒떷᪈ⴙ㢉ᣳู犵㚶狧\uebf7緡癡\ue704흭⭘佝\uf787炷◾\ufadf\uf656ᄧ의괃᪉⇅⪫ᣇ来燏횕␓ㅴ\ud8dbᒜ\ue6f6⨰ꬣ氍榰针ꪤ빼ꋰ䶘䫿쀐ꖕ\ue276\udc17⃟⩰\udcd5ﶭ揭\uf6f5śМ㑌㑵\uecd2\udec2钳ᦐಥ툎읝兗\ue995颍⌞\udef4\udae6⛡ꕯꃨ\ue864扃꯴\uefb1푈戨椅￬蜟婁\u20c6毚璏࿁瓚萰\uf157\udc5bﯜ␈앳뜭뽖磍▒\udf6d\u192d裖洽푬\uf4b4䓥艀甂\ue222尌籰뢗௯ஂ荬\udc98죅훕즉隞彣㕯쨆憊Ӱ볌\u0cfbꨋ頍楨魨禐ﴵ뀩譔鈏ꔃᾚ䩹欣䛘ᛐꐫ㹍ꕌ\uf8f9꾡疜⓸ே劍恁禛䲐쬓븯쒻⾰꘦忊ਰꕂ\uf257ᘭ鿙\u0a0e쿜절ᵊ䫊︃죅둀⇘괜顟\u20fd蚹鱗굥\uf2bcዦ⻪躳咤ㆦ捿\uec53⸸⭓핋ᄸ菱\uf31a둛踠ⴣ뽈\ue9ad㫌\uf02e썩ె癁䝻淚씭\uf002츶\ue391\ue1ff鵸떹噑䩈鯹킧㊎㼄乔㕚鳠篒\uf790㦾ᒯ乽㖓尙적\uf59d당ν䄔⦕\ue777瑚ό棴爰撷楠鵆諅믪瀞ⶶ\udf08츞뙴漠闽\uebc0闒몱\ue0bc꡵ﮤ嘾\udae0\uf1ef\ue438呌\udea2\ude89蜞꺠퐭\uf363\ue2f3铭\uf27b\uefa7秪琭旻깸䶭\uf2d4컌\uf5a1즡ធ⋟魉뀟쥬\ue92f狼䴳鷀漞〚⟇屆铧소\ue788Ą\ue9e7턝ཫ惏\uf3a8᨞㷝⍿놊\uf0c3缅\ue611숿娒귣꼷晥崍㊑Ώ䧇퀫帮ũ솝ဪழ弲\ue332똖䏎啮\u0002눖ް媘鑩颯뵂᭧៎쫜૰瘗맴볜賭躊捦桨ㅹ\udf58䔎관羶ꈧ辒鵷㯎粵\ue609鉞퉚\uee12Ɏ㹰꒔푠\uf242愰㘍嘊ᑕ\udb2d䳜曚悱樒꒨媾튘啫Ꭿ蝖ꃰ\ue4a7⒇㿋薋⨲뎀诅ㄉ꺻㙩ࣹᲞ﹝ꆕⳃ끩\uef31쮮ꂔ\udda5査ꢖힵ傀睼\uf457\uf171햶걬凔⊌䈈᪃栀噏嫊珴㿌ᾡ\udde4뮥껱㋔⺀嶺ﱘﻱ\uf302㙆舓劅闟鰇偒ᔧ\ufdce̻Ꭲ뱑\uda95蔍黝剁ᾅἲ㴝\uf25e絭ڸ䃙ѡ쓸\ua6ff녕ࣺ⸛\u0590\u196e쩱\uf1acꛀ뛷酞\ue3c2\ue495㜉\uda0b䱹\uef74\uec77㊰滪秀យ瘇뎀ൢ醽述⧼狾赆\udb0c嵍霊\ue07e䬌㖌㦱䂏옾時ගﮇ\u20ff䴽່貔㒡\u1716№県ꭶ\ued65寺訥í漜\ude51魟건ꋃ➼\uea40ꭒ\uf7ee뜋䑘㬸葳뀉풌觗蒝脨\uefbc\uf4f0瘓蟪쩰䇄\uf0fd誹ᆍ◪隦阤颍\ueb9d鱈꤮졏쥽탄ᴋ渞冿謫\ude21쳟久㹭帥浤袃\uf00d트寏溫坋줚⦾\u12b6檴眇ꄓ哕Q⊨\udb7b䤁\uf3dd胙蟿䨿⚯㐂࠵砓틀杵쒿硘秣洫Ƕꃅꜩ훤ĭ⣹勜嗪䬉䁶そ鶪Ꟗ矻䙩ࠪ怭矸膴樂\ud8c0蹃\ue13fꇒ焗蠻ၟ௪㦓铟쫣\ufbc5\ue6fd⼔켯ቲ릀⠨캙\udcbc횋ꕙ郡鼢｡뭍基쐳㓫ㅦꙦᚧㄾ\uee9e黺䂩狰횕迿վપᕖ㯲谁㌆ⴁ縆콒冷矸຺ꔪ온舫凣⠓헂齭涡蚀环犘ﴶ蹗렍㬖焧麌⎿ꕖ暦났쓎♬䎖뛪謜⳺\ue26d\udebeᡜﮣ芙⎟칸᷼\u001e\uf084荱\ue80fꌄꩵ⨁\uead2\uea47\ue81d벸햞篰祙骦\uf015份쭸壋⃛콉\ue167\ue76c꒧泌⧊⦖濽仅쵂\u0a12\uaad3l叓ﴨ촜쉥鸛䃐\udcc9\ue0ed\uee95懑䓒\u0a0d蜂ｓ㯽გﺌ\udb2b伔骄ᯅ䑭羒ᵻ㮌埲豐㙂簮\uf88c铐㽰纃䄳툂ᖐ䪣毜\u05f6䮢䑪豐눘᪫霣楏抽\uf22a⯐釫綻剬瀎츟\ue9a6裃Ὓ펑픅ᵟꀑ烸例臾㍬◍洅췒첫盿뉰奼젠\udaaeꦹ\uf51c\udfb3㩏뢢핕軆퓢⦫\u0ff2嬏忦ꊚ痍\uec63囇景栖寜鑹晜曡櫭䇼夃撰ٟ該\uec4a\uea29S酏ᘖ䣥䃼蔾\u181eᗍ㽹ᓯᚩ뚇\ud91c찜꽽甤恥ẜ䉢걎髋⠏틗멫\uebb5᮲議\udbca뼇턤晕碣\ue6d1\u1fff邡ǿꎝ쵶\u0be3牯㋌䐄\uf063쐠\u0a11䳒赎쬀⛢Ì崃籠\uee19ힸꡳ穾෭埌ბ勽䄵⏙ᗵ녂ള鄓飆\udf32掁㹢꒻ᐠ䏀輬鬫榮쎅蠦쑐튈鍞脫ḳ乇\uec7e嗐膉ꖹ쎟ڵ悔彿켇㶖\udbb1㳆ᆎ\uecc0ꍕ꯴\u1a8fﻐ⏷\uf866Ⓧ楌躙蚢괛Ꭻ⟾傕᳟ᄦ讄⛲뎤Ꜽ\uf641丈唆廫油읉켻輹젬ᓭ㕡\uf730契쀥ㇽ㝙ꪐ椅쑫\udd2c\uf216簳⛼堣谬殚瀜ꩭ䖌䅫꭛\ue0ffꃷ坃茠倕ྍ척䅄揉㧺\uec38❟큲賥등瞛䪬鉯ነⱥ〘፳䶇Ỿ왶명ି\uaa3cᰵ㪛郮麽㋩뵠倬㮮ෳ⸎\ued92儜뤝⫤\uf5a1庮꼓붳ﮣ鵀䧧摦䵱숝\uf770䰩⻡称Ⴏ屔였牏哌퓎옃㓢\u09d0\uf4ec酟酞ሐ䬽氵\ue1e8\u173c䯉쒭馐ᛨ弣䕶䶄둯桙쨃㔹稂ꮰ\ue6de湈噽ᕗᩰ얳ʥ꤆ﺾ퉾抶ᄹ㌣乀\uf5d6툨彌\ued81퍍\ud94b獞뚆姜톭⦃\u08e2\ufadd䔥邰쓤ळ㓌톺ힾ>☲춛突㒚\uf343\uab1d觻薮젬\uf538⏡\ue15f특ẵ‵궎⢑\udba9\uf893≒盳\udb08\ue576\uda59显ᒴ碙넌緥彫跌뻍ꕓ퓻빬\uee07ɷ苏術椯禽썀耺䉂⤴ᐕ\ue5ad份姗\ufde7⽕㫗楜\udc0d`\ue36c栺\uf678\uebfa鲕᥌좋⒑\uee72\u2d6a渭\u17de儶⇽ﴑ∮뼞鸨妙Ჶ\uf72d\uf197䘒৽ﭜ欄㜼粇㝵Ձ函占祶\uda37\ueb67䄫㜊韤⚳宗꙲몉㉈\udbee鷔㗔物\ueaaa彣菹ᵐຌ\u2068央铯斄\uf1b8⡚㚞뜡艭虆▥픽셚⒎睓Ӎ\udfa0捜䠛ሧ塪㥧岳\ue711測螳䢋⨹\uf799\u07b3胍\ue832蠋葑我튼႐⟡ఖ\u181c㬺귑胲蹰两₊톗ᯯ原⠦眱樂㽃눢襃\u20cd䷆뢷₰\udba7츣뿉١괏莽ꠄ\udb49䓑嫫㬶獳듡स谌ꣻ햤獪\ue59b珬区\uf853톑獓︬ㄞ\uf3ba").toCharArray();
        byte[] bArr = new byte[charArray.length];
        for (int i10 = 0; i10 < charArray.length; i10++) {
            bArr[i10] = (byte) (charArray[i10] & 255);
        }
        ushD = bArr;
    }

    private static final void AmivA8047() {
        int[] iArr = new int[256];
        byte[] bArr = new byte[256];
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[256];
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int[] iArr6 = new int[30];
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = i11;
            i11 ^= (i11 << 1) ^ ((i11 >>> 7) * 283);
        }
        bArr[0] = 99;
        for (int i13 = 0; i13 < 255; i13++) {
            try {
                int i14 = iArr[255 - i13];
                int i15 = i14 | (i14 << 8);
                bArr[iArr[i13]] = (byte) ((i15 ^ ((((i15 >> 4) ^ (i15 >> 5)) ^ (i15 >> 6)) ^ (i15 >> 7))) ^ 99);
            } catch (Exception unused) {
            }
        }
        for (int i16 = 0; i16 < 256; i16++) {
            int i17 = bArr[i16] & 255;
            int i18 = (i17 << 1) ^ ((i17 >>> 7) * 283);
            int i19 = ((i17 << 8) ^ (((i17 ^ i18) << 24) ^ (i17 << 16))) ^ i18;
            iArr2[i16] = i19;
            iArr3[i16] = (i19 << 8) | (i19 >>> (-8));
            iArr4[i16] = (i19 << 16) | (i19 >>> (-16));
            iArr5[i16] = (i19 >>> (-24)) | (i19 << 24);
        }
        int i20 = 1;
        for (int i21 = 0; i21 < 30; i21++) {
            iArr6[i21] = i20;
            i20 = ((i20 >>> 7) * 283) ^ (i20 << 1);
        }
        byte[] bArr2 = new byte[16];
        int i22 = 0;
        while (true) {
            if (i22 != 0) {
                bArr2[8] = 31;
                bArr2[9] = UtilitiesSDKConstants.SRP_LABEL_MAC;
                bArr2[10] = 33;
                bArr2[11] = -26;
                bArr2[12] = -50;
                bArr2[13] = 89;
                bArr2[14] = -74;
                bArr2[15] = 88;
                break;
            }
            i22++;
            try {
                bArr2[0] = -90;
                bArr2[1] = 7;
                bArr2[2] = 55;
                bArr2[3] = 66;
                bArr2[4] = -105;
                bArr2[5] = -52;
                bArr2[6] = -14;
                bArr2[7] = -106;
                bArr2[8] = 31;
                bArr2[9] = UtilitiesSDKConstants.SRP_LABEL_MAC;
                bArr2[10] = 33;
                bArr2[11] = -26;
                bArr2[12] = -50;
                bArr2[13] = 89;
                bArr2[14] = -74;
                bArr2[15] = 88;
                break;
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                bArr2[8] = 31;
                bArr2[9] = UtilitiesSDKConstants.SRP_LABEL_MAC;
                bArr2[10] = 33;
                bArr2[11] = -26;
                bArr2[12] = -50;
                bArr2[13] = 89;
                bArr2[14] = -74;
                bArr2[15] = 88;
                throw th2;
            }
        }
        int[] iArr7 = new int[44];
        int i23 = 0;
        loop3: while (i23 == 0) {
            i23 += 3;
            int i24 = i10;
            int i25 = i24;
            while (true) {
                int i26 = i10;
                while (true) {
                    if (i26 != 0) {
                        break;
                    }
                    i26 += 3;
                    if (i24 >= 16) {
                        break;
                    }
                    try {
                        try {
                            iArr7[(((i25 >> 2) * 4) + i25) & 3] = (bArr2[i24] & 255) | ((bArr2[i24 + 1] & 255) << 8) | ((bArr2[i24 + 2] & 255) << 16) | (bArr2[i24 + 3] << 24);
                            break;
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                    }
                }
                i24 += 4;
                i25++;
                i10 = 0;
            }
            for (int i27 = 4; i27 < 44; i27++) {
                int i28 = i27 - 1;
                try {
                    int iEmkAtHpce = iArr7[((i28 >> 2) * 4) + (i28 & 3)];
                    if (i27 % 4 == 0) {
                        iEmkAtHpce = emkAtHpce(bArr, k(iEmkAtHpce, 8)) ^ iArr6[(i27 / 4) - 1];
                    }
                    int i29 = i27 - 4;
                    iArr7[((i27 >> 2) * 4) + (i27 & 3)] = iEmkAtHpce ^ iArr7[((i29 >> 2) * 4) + (i29 & 3)];
                } catch (Exception unused5) {
                    i10 = 0;
                }
            }
            break loop3;
        }
        Object[] objArr = new Object[8];
        objArr[0] = bArr;
        objArr[1] = iArr2;
        objArr[2] = iArr3;
        objArr[3] = iArr4;
        objArr[4] = iArr5;
        objArr[5] = iArr7;
        objArr[6] = new int[]{1445730175, -1254716784, -1690906022, -1214889347};
        bvA = objArr;
        fipkfGnB();
    }

    private static void Ankpuqdi(String str, InputStream inputStream, OutputStream outputStream) throws Exception {
        char[] charArray = str.toCharArray();
        int[] iArr = {charArray[0] | (charArray[1] << 16), charArray[2] | (charArray[3] << 16), charArray[4] | (charArray[5] << 16), charArray[6] | (charArray[7] << 16)};
        int[] iArr2 = {charArray[8] | (charArray[9] << 16), (charArray[11] << 16) | charArray[10]};
        int[] iArrPfE = pfE(iArr);
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 < 0) {
                return;
            }
            int i12 = i10 + i11;
            int i13 = 0;
            while (i10 < i12) {
                int i14 = i10 % 8;
                int i15 = i14 / 4;
                int i16 = i10 % 4;
                if (i14 == 0) {
                    unwnj(iArrPfE, iArr2);
                }
                bArr[i13] = (byte) (((byte) (iArr2[i15] >> (i16 * 8))) ^ bArr[i13]);
                i10++;
                i13++;
            }
            outputStream.write(bArr, 0, i11);
        }
    }

    public static void FzkE(Context context) {
        vgkDcq(context);
    }

    private static String Hdnx() {
        byte[] bArr = new byte[20];
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(dbgm("귫漱钠㱢⟈♾ᒠⰣ캵燦翹\ue1a3蒔瀌"), dbgm("궶"));
            try {
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                if (bArr[0] != 127 || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70) {
                    return dbgm("궆漠钶㰭⟮☝ᒕⱦ캴燡羱\ue1af蒏");
                }
                int i10 = ((bArr[19] & 255) << 8) | (bArr[18] & 255);
                if (i10 == 3) {
                    return dbgm("궼潹铤");
                }
                if (i10 == 40) {
                    return dbgm("궥漳钿");
                }
                if (i10 == 62) {
                    return dbgm("궼潹铤㱒➝♥");
                }
                if (i10 == 183) {
                    return dbgm("궥漳钿㰻➟");
                }
                return dbgm("궇漎钖㱈➋♡ᒫ") + Integer.toHexString(i10);
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        } catch (Exception unused) {
            return dbgm("궖漤钳㱩➋☔ᒟⰀ컹燥群\ue1b4蒃瀛");
        }
    }

    public static final String dbgm(String str) {
        char c10;
        int i10;
        char[] cArr;
        int i11;
        if (bvA == null) {
            AmivA8047();
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iHashCode = (stackTrace[((Integer) bvA[7]).intValue()].getClassName() + stackTrace[((Integer) bvA[7]).intValue()].getMethodName()).hashCode();
        Object[] objArr = bvA;
        int[] iArr = (int[]) objArr[6];
        int i12 = 0;
        int i13 = iArr[0] ^ iHashCode;
        char c11 = 1;
        int i14 = iArr[1] ^ iHashCode;
        char c12 = 2;
        int i15 = iArr[2] ^ iHashCode;
        int i16 = iHashCode ^ iArr[3];
        int[] iArr2 = (int[]) objArr[5];
        int[] iArr3 = (int[]) objArr[1];
        int[] iArr4 = (int[]) objArr[2];
        int[] iArr5 = (int[]) objArr[3];
        int[] iArr6 = (int[]) objArr[4];
        byte[] bArr = (byte[]) objArr[0];
        char[] charArray = str.toCharArray();
        for (boolean z10 = false; !z10; z10 = true) {
            try {
                int length = charArray.length;
                int i17 = i12;
                while (i17 < length) {
                    try {
                        if (i17 % 8 == 0) {
                            int i18 = i13 ^ iArr2[i12];
                            c10 = 3;
                            try {
                                i16 = i16;
                                int i19 = i18;
                                int i20 = i14 ^ iArr2[c11];
                                int i21 = i15 ^ iArr2[c12];
                                int i22 = i16 ^ iArr2[3];
                                int i23 = i13;
                                int i24 = i14;
                                int i25 = 4;
                                while (i25 < 36) {
                                    try {
                                        i11 = i15;
                                        try {
                                            int i26 = (((iArr3[i19 & 255] ^ iArr4[(i20 >> 8) & 255]) ^ iArr5[(i21 >> 16) & 255]) ^ iArr6[i22 >>> 24]) ^ iArr2[i25];
                                            int i27 = length;
                                            int i28 = (((iArr3[i20 & 255] ^ iArr4[(i21 >> 8) & 255]) ^ iArr5[(i22 >> 16) & 255]) ^ iArr6[i19 >>> 24]) ^ iArr2[i25 + 1];
                                            cArr = charArray;
                                            try {
                                                int i29 = (((iArr3[i21 & 255] ^ iArr4[(i22 >> 8) & 255]) ^ iArr5[(i19 >> 16) & 255]) ^ iArr6[i20 >>> 24]) ^ iArr2[i25 + 2];
                                                int i30 = (((iArr3[i22 & 255] ^ iArr4[(i19 >> 8) & 255]) ^ iArr5[(i20 >> 16) & 255]) ^ iArr6[i21 >>> 24]) ^ iArr2[i25 + 3];
                                                i19 = iArr2[i25 + 4] ^ (((iArr3[i26 & 255] ^ iArr4[(i28 >> 8) & 255]) ^ iArr5[(i29 >> 16) & 255]) ^ iArr6[i30 >>> 24]);
                                                i20 = (((iArr3[i28 & 255] ^ iArr4[(i29 >> 8) & 255]) ^ iArr5[(i30 >> 16) & 255]) ^ iArr6[i26 >>> 24]) ^ iArr2[i25 + 5];
                                                i21 = (((iArr3[i29 & 255] ^ iArr4[(i30 >> 8) & 255]) ^ iArr5[(i26 >> 16) & 255]) ^ iArr6[i28 >>> 24]) ^ iArr2[i25 + 6];
                                                i22 = (((iArr3[i30 & 255] ^ iArr4[(i26 >> 8) & 255]) ^ iArr5[(i28 >> 16) & 255]) ^ iArr6[i29 >>> 24]) ^ iArr2[i25 + 7];
                                                i25 += 8;
                                                i15 = i11;
                                                length = i27;
                                                charArray = cArr;
                                            } catch (Exception unused) {
                                                i13 = i23;
                                                i14 = i24;
                                                i15 = i11;
                                                charArray = cArr;
                                                i12 = 0;
                                                c11 = 1;
                                                c12 = 2;
                                            }
                                        } catch (Exception unused2) {
                                            i16 = i16;
                                            i13 = i23;
                                            i14 = i24;
                                            i15 = i11;
                                            i12 = 0;
                                            c11 = 1;
                                            c12 = 2;
                                        }
                                    } catch (Exception unused3) {
                                        i16 = i16;
                                        i13 = i23;
                                        i14 = i24;
                                    }
                                }
                                i11 = i15;
                                i10 = length;
                                cArr = charArray;
                                int i31 = (((iArr3[i19 & 255] ^ iArr4[(i20 >> 8) & 255]) ^ iArr5[(i21 >> 16) & 255]) ^ iArr6[i22 >>> 24]) ^ iArr2[i25];
                                int i32 = (((iArr3[i20 & 255] ^ iArr4[(i21 >> 8) & 255]) ^ iArr5[(i22 >> 16) & 255]) ^ iArr6[i19 >>> 24]) ^ iArr2[i25 + 1];
                                int i33 = (((iArr3[i21 & 255] ^ iArr4[(i22 >> 8) & 255]) ^ iArr5[(i19 >> 16) & 255]) ^ iArr6[i20 >>> 24]) ^ iArr2[i25 + 2];
                                int i34 = (((iArr3[i22 & 255] ^ iArr4[(i19 >> 8) & 255]) ^ iArr5[(i20 >> 16) & 255]) ^ iArr6[i21 >>> 24]) ^ iArr2[i25 + 3];
                                int i35 = iArr2[i25 + 4] ^ ((((bArr[i31 & 255] & 255) ^ ((bArr[(i32 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i33 >> 16) & 255] & 255) << 16)) ^ (bArr[i34 >>> 24] << 24));
                                try {
                                    int i36 = ((((bArr[i32 & 255] & 255) ^ ((bArr[(i33 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i34 >> 16) & 255] & 255) << 16)) ^ (bArr[i31 >>> 24] << 24)) ^ iArr2[i25 + 5];
                                    try {
                                        int i37 = ((((bArr[i33 & 255] & 255) ^ ((bArr[(i34 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i31 >> 16) & 255] & 255) << 16)) ^ (bArr[i32 >>> 24] << 24)) ^ iArr2[i25 + 6];
                                        try {
                                            i16 = ((((bArr[i34 & 255] & 255) ^ ((bArr[(i31 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i32 >> 16) & 255] & 255) << 16)) ^ (bArr[i33 >>> 24] << 24)) ^ iArr2[i25 + 7];
                                            i13 = i35;
                                            i14 = i36;
                                            i15 = i37;
                                        } catch (Exception unused4) {
                                            i16 = i16;
                                            i13 = i35;
                                            i14 = i36;
                                            i15 = i37;
                                            charArray = cArr;
                                            i12 = 0;
                                            c11 = 1;
                                            c12 = 2;
                                        }
                                    } catch (Exception unused5) {
                                        i16 = i16;
                                        i13 = i35;
                                        i14 = i36;
                                        i15 = i11;
                                        charArray = cArr;
                                        i12 = 0;
                                        c11 = 1;
                                        c12 = 2;
                                    }
                                } catch (Exception unused6) {
                                    i13 = i35;
                                    i14 = i24;
                                    i15 = i11;
                                    charArray = cArr;
                                    i12 = 0;
                                    c11 = 1;
                                    c12 = 2;
                                }
                            } catch (Exception unused7) {
                                c11 = 1;
                            }
                        } else {
                            i10 = length;
                            cArr = charArray;
                        }
                        try {
                            switch (i17 % 8) {
                                case 0:
                                    cArr[i17] = (char) ((i13 >> 16) ^ cArr[i17]);
                                    break;
                                case 1:
                                    cArr[i17] = (char) (cArr[i17] ^ i13);
                                    break;
                                case 2:
                                    cArr[i17] = (char) ((i14 >> 16) ^ cArr[i17]);
                                    break;
                                case 3:
                                    cArr[i17] = (char) (cArr[i17] ^ i14);
                                    break;
                                case 4:
                                    cArr[i17] = (char) ((i15 >> 16) ^ cArr[i17]);
                                    break;
                                case 5:
                                    cArr[i17] = (char) (cArr[i17] ^ i15);
                                    break;
                                case 6:
                                    cArr[i17] = (char) ((i16 >> 16) ^ cArr[i17]);
                                    break;
                                case 7:
                                    cArr[i17] = (char) (cArr[i17] ^ i16);
                                    break;
                            }
                        } catch (Exception unused8) {
                        }
                        i17++;
                        length = i10;
                        charArray = cArr;
                        i12 = 0;
                        c11 = 1;
                        c12 = 2;
                    } catch (Exception unused9) {
                        c10 = 3;
                    }
                }
                return new String(charArray);
            } catch (Exception unused10) {
            }
        }
        return new String(charArray);
    }

    private static final int emkAtHpce(byte[] bArr, int i10) {
        try {
            return (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 8) & 255] & 255) << 8) | ((bArr[(i10 >> 16) & 255] & 255) << 16) | (bArr[(i10 >> 24) & 255] << 24);
        } catch (Exception unused) {
            try {
                return bArr[i10 & 127] >> 8;
            } catch (Exception unused2) {
                return bArr[14] << 16;
            }
        }
    }

    private static final void fipkfGnB() {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int length = stackTrace.length;
            for (int i10 = 1; i10 < length; i10++) {
                StringBuilder sb2 = new StringBuilder();
                try {
                    try {
                        sb2.append(stackTrace[i10].getClassName());
                        sb2.append(stackTrace[i10].getMethodName());
                        if (sb2.toString().hashCode() == -410383583) {
                            bvA[7] = Integer.valueOf(i10);
                            return;
                        }
                    } catch (Exception unused) {
                        bvA[7] = 4;
                        if (sb2.toString().hashCode() == -410383583) {
                            bvA[7] = Integer.valueOf(i10);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    if (sb2.toString().hashCode() != -410383583) {
                        throw th2;
                    }
                    bvA[7] = Integer.valueOf(i10);
                    return;
                }
            }
        } catch (Exception unused2) {
            bvA[7] = 3;
        }
    }

    private static void hdBn(File file, String str) throws Exception {
        String strDbgm;
        String str2;
        if (dbgm("风⩐〠").equals(str)) {
            strDbgm = dbgm("波쿫藯纥燒ళ㼡Ꝓ灴\ueb5c沱둋");
            str2 = "飌⩍〠㵬쉋ꮬ₍㈄动곸ࠤ\u2e67簤潍萗嚗狻⑺\u2e79⃬좋ⶸ訲퇶\uf3db佻듨⏣⬾钧";
        } else if (dbgm("风⩐〠㵴숝").equals(str)) {
            strDbgm = dbgm("\uf1a4끤슽ؕṑ肯垂䯝䮎\ue002䌀꿄");
            str2 = "飌⩍〠㵬쉋ꮬ₍㈄动곸ࠤ\u2e67簤潍萗嚗狻⑵\u2e79⃬좋ⶸ詺톳\uf3d9伡듨⏣⬾钧";
        } else if (dbgm("飗⨚ほ").equals(str)) {
            strDbgm = dbgm("倮ঈ畗旮\uef67\u0bff⍥繉⠮\u175aබﴕ");
            str2 = "飌⩍〠㵬쉋ꮬ₍㈄动곸ࠤ\u2e67簽漇葌嚔狾␢\u2e79₦좁ⷣ話퇨\uf3c4伾듵";
        } else {
            if (!dbgm("飗⨚ほ㴝숟\uabfa").equals(str)) {
                throw new IllegalArgumentException(dbgm("飺⩌〾㴷쉙ꮾₔ㈗勲곮ࠬ\u2e69簬潑萉囎狿\u2438⸴⃫좍ⷹ訦퇦\uf3da伫뒲⎮") + str);
            }
            strDbgm = dbgm("\ue020屿칡딬焢쉼ꫛ䀯טฃ肰\b");
            str2 = "飌⩍〠㵬쉋ꮬ₍㈄动곸ࠤ\u2e67簽漇葌囥犻⑹\u2e79⃬좋ⶸ訢톨\uf39c佶듨⏣⬾钧";
        }
        InputStream inputStreamOpen = ((Context) FxAb).getAssets().open(dbgm(str2));
        try {
            InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(new FileOutputStream(file));
            try {
                Ankpuqdi(strDbgm, inputStreamOpen, inflaterOutputStream);
                inflaterOutputStream.close();
                inputStreamOpen.close();
            } catch (Throwable th2) {
                inflaterOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStreamOpen.close();
            throw th3;
        }
    }

    private static final int k(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public static native boolean kw(String str, int i10, List list);

    private static native void lvFukwpoh(int[] iArr);

    private static void nDzrqg(String str) {
        File file = new File(((Context) FxAb).getDir(dbgm("破佸쉾魤䶷穉"), 0), dbgm("砷佤쉨魤䶷穉䝘커캆쏖\uf504ｕ\u0a5fᴡﮧ瀭墝맯\uedd3䯆\udfb6ہ踕") + Process.myPid() + dbgm("硵佾쉥"));
        try {
            hdBn(file, str);
            System.load(file.getAbsolutePath());
        } finally {
            file.delete();
        }
    }

    private static int[] pfE(int[] iArr) {
        int[] iArr2 = new int[27];
        int i10 = 0;
        int i11 = iArr[0];
        iArr2[0] = i11;
        int[] iArr3 = {iArr[1], iArr[2], iArr[3]};
        while (i10 < 26) {
            int i12 = i10 % 3;
            int i13 = iArr3[i12];
            int i14 = (((i13 << 24) | (i13 >>> 8)) + i11) ^ i10;
            iArr3[i12] = i14;
            i11 = ((i11 >>> 29) | (i11 << 3)) ^ i14;
            i10++;
            iArr2[i10] = i11;
        }
        return iArr2;
    }

    public static native String s(String str);

    private static native InputStream tAnBf(String str);

    public static InputStream tEoqf(Class cls, String str) {
        String strSubstring;
        if (str == null) {
            return cls.getResourceAsStream(str);
        }
        if (str.charAt(0) == '/') {
            strSubstring = str.substring(1);
        } else {
            strSubstring = cls.getName().replace('.', JsonPointer.SEPARATOR) + JsonPointer.SEPARATOR + str;
        }
        return tAnBf(strSubstring);
    }

    private static void unwnj(int[] iArr, int[] iArr2) {
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        int i12 = (((i11 << 24) | (i11 >>> 8)) + i10) ^ iArr[0];
        int i13 = ((i10 >>> 29) | (i10 << 3)) ^ i12;
        int i14 = (((i12 << 24) | (i12 >>> 8)) + i13) ^ iArr[1];
        int i15 = ((i13 >>> 29) | (i13 << 3)) ^ i14;
        int i16 = (((i14 << 24) | (i14 >>> 8)) + i15) ^ iArr[2];
        int i17 = ((i15 >>> 29) | (i15 << 3)) ^ i16;
        int i18 = (((i16 << 24) | (i16 >>> 8)) + i17) ^ iArr[3];
        int i19 = ((i17 >>> 29) | (i17 << 3)) ^ i18;
        int i20 = (((i18 << 24) | (i18 >>> 8)) + i19) ^ iArr[4];
        int i21 = ((i19 >>> 29) | (i19 << 3)) ^ i20;
        int i22 = (((i20 << 24) | (i20 >>> 8)) + i21) ^ iArr[5];
        int i23 = ((i21 >>> 29) | (i21 << 3)) ^ i22;
        int i24 = (((i22 << 24) | (i22 >>> 8)) + i23) ^ iArr[6];
        int i25 = ((i23 >>> 29) | (i23 << 3)) ^ i24;
        int i26 = (((i24 << 24) | (i24 >>> 8)) + i25) ^ iArr[7];
        int i27 = ((i25 >>> 29) | (i25 << 3)) ^ i26;
        int i28 = (((i26 << 24) | (i26 >>> 8)) + i27) ^ iArr[8];
        int i29 = ((i27 >>> 29) | (i27 << 3)) ^ i28;
        int i30 = (((i28 << 24) | (i28 >>> 8)) + i29) ^ iArr[9];
        int i31 = ((i29 >>> 29) | (i29 << 3)) ^ i30;
        int i32 = (((i30 << 24) | (i30 >>> 8)) + i31) ^ iArr[10];
        int i33 = ((i31 >>> 29) | (i31 << 3)) ^ i32;
        int i34 = (((i32 << 24) | (i32 >>> 8)) + i33) ^ iArr[11];
        int i35 = ((i33 >>> 29) | (i33 << 3)) ^ i34;
        int i36 = (((i34 << 24) | (i34 >>> 8)) + i35) ^ iArr[12];
        int i37 = ((i35 >>> 29) | (i35 << 3)) ^ i36;
        int i38 = (((i36 << 24) | (i36 >>> 8)) + i37) ^ iArr[13];
        int i39 = ((i37 >>> 29) | (i37 << 3)) ^ i38;
        int i40 = (((i38 << 24) | (i38 >>> 8)) + i39) ^ iArr[14];
        int i41 = ((i39 >>> 29) | (i39 << 3)) ^ i40;
        int i42 = (((i40 << 24) | (i40 >>> 8)) + i41) ^ iArr[15];
        int i43 = ((i41 >>> 29) | (i41 << 3)) ^ i42;
        int i44 = (((i42 << 24) | (i42 >>> 8)) + i43) ^ iArr[16];
        int i45 = ((i43 >>> 29) | (i43 << 3)) ^ i44;
        int i46 = (((i44 << 24) | (i44 >>> 8)) + i45) ^ iArr[17];
        int i47 = ((i45 >>> 29) | (i45 << 3)) ^ i46;
        int i48 = (((i46 << 24) | (i46 >>> 8)) + i47) ^ iArr[18];
        int i49 = ((i47 >>> 29) | (i47 << 3)) ^ i48;
        int i50 = (((i48 << 24) | (i48 >>> 8)) + i49) ^ iArr[19];
        int i51 = ((i49 >>> 29) | (i49 << 3)) ^ i50;
        int i52 = (((i50 << 24) | (i50 >>> 8)) + i51) ^ iArr[20];
        int i53 = ((i51 >>> 29) | (i51 << 3)) ^ i52;
        int i54 = (((i52 << 24) | (i52 >>> 8)) + i53) ^ iArr[21];
        int i55 = ((i53 >>> 29) | (i53 << 3)) ^ i54;
        int i56 = (((i54 << 24) | (i54 >>> 8)) + i55) ^ iArr[22];
        int i57 = ((i55 >>> 29) | (i55 << 3)) ^ i56;
        int i58 = (((i56 << 24) | (i56 >>> 8)) + i57) ^ iArr[23];
        int i59 = ((i57 >>> 29) | (i57 << 3)) ^ i58;
        int i60 = (((i58 << 24) | (i58 >>> 8)) + i59) ^ iArr[24];
        int i61 = ((i59 >>> 29) | (i59 << 3)) ^ i60;
        int i62 = (((i60 << 24) | (i60 >>> 8)) + i61) ^ iArr[25];
        int i63 = ((i61 >>> 29) | (i61 << 3)) ^ i62;
        int i64 = iArr[26];
        int i65 = i64 ^ (((i62 << 24) | (i62 >>> 8)) + i63);
        iArr2[0] = ((i63 >>> 29) | (i63 << 3)) ^ i65;
        iArr2[1] = i65;
    }

    private static void vgkDcq(Object obj) {
        if (BuGj) {
            return;
        }
        FxAb = obj;
        String strHdnx = Hdnx();
        String str = dbgm("뚝蚁䁉筷툌쓰॥뽕ａ\ue9ff欔櫘响㜝ㇳ챣ࡅ낢櫌ᦰ\ue28b\ud89e즪睱絊䗳牬拲\ue769ᖼ咵ᎋ\ua6fe\ue1a2牷評侾ᇤ蛔憗\ue77fꒅ㥆杻") + strHdnx + AbstractJsonLexerKt.COLON + Build.CPU_ABI + ' ' + Build.VERSION.SDK_INT + ' ' + Build.FINGERPRINT;
        dbgm("뚟蚍䁟筀툛쓭ॡ뽂ｋ\ue9e5欏檊");
        dbgm("뚝蚁䁉筷툌쓰॥뽕ａ\ue9ff欔櫘").concat(str);
        nDzrqg(strHdnx);
        char[] charArray = dbgm("炑ⅳ⼲戮Ѯዬ캓ⶱﯮᗑ便\ud9b5쳿쁭촳뇑").toCharArray();
        int length = charArray.length / 2;
        int[] iArr = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i10 + 1;
            char c10 = charArray[i10];
            i10 += 2;
            iArr[i11] = (charArray[i12] << 16) | c10;
        }
        lvFukwpoh(iArr);
        BuGj = true;
    }
}
