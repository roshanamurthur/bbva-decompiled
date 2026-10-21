package kotlin.collections;

import androidx.camera.camera2.internal.n1;
import androidx.exifinterface.media.ExifInterface;
import bk.p;
import bk.v;
import bk.w;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24423:1\n12524#1,2:24424\n12534#1,2:24426\n1282#1,2:24428\n1290#1,2:24430\n1298#1,2:24432\n1306#1,2:24434\n1314#1,2:24436\n1322#1,2:24438\n1330#1,2:24440\n1338#1,2:24442\n1346#1,2:24444\n2298#1,5:24446\n2311#1,5:24451\n2324#1,5:24456\n2337#1,5:24461\n2350#1,5:24466\n2363#1,5:24471\n2376#1,5:24476\n2389#1,5:24481\n2402#1,5:24486\n4307#1,2:24492\n4317#1,2:24494\n4327#1,2:24496\n4337#1,2:24498\n4347#1,2:24500\n4357#1,2:24502\n4367#1,2:24504\n4377#1,2:24506\n4387#1,2:24508\n3974#1:24510\n13374#1,2:24511\n3975#1,2:24513\n13376#1:24515\n3977#1:24516\n3988#1:24517\n13384#1,2:24518\n3989#1,2:24520\n13386#1:24522\n3991#1:24523\n4002#1:24524\n13394#1,2:24525\n4003#1,2:24527\n13396#1:24529\n4005#1:24530\n4016#1:24531\n13404#1,2:24532\n4017#1,2:24534\n13406#1:24536\n4019#1:24537\n4030#1:24538\n13414#1,2:24539\n4031#1,2:24541\n13416#1:24543\n4033#1:24544\n4044#1:24545\n13424#1,2:24546\n4045#1,2:24548\n13426#1:24550\n4047#1:24551\n4058#1:24552\n13434#1,2:24553\n4059#1,2:24555\n13436#1:24557\n4061#1:24558\n4072#1:24559\n13444#1,2:24560\n4073#1,2:24562\n13446#1:24564\n4075#1:24565\n4086#1:24566\n13454#1,2:24567\n4087#1,2:24569\n13456#1:24571\n4089#1:24572\n13374#1,3:24573\n13384#1,3:24576\n13394#1,3:24579\n13404#1,3:24582\n13414#1,3:24585\n13424#1,3:24588\n13434#1,3:24591\n13444#1,3:24594\n13454#1,3:24597\n4107#1,2:24600\n4217#1,2:24602\n4227#1,2:24604\n4237#1,2:24606\n4247#1,2:24608\n4257#1,2:24610\n4267#1,2:24612\n4277#1,2:24614\n4287#1,2:24616\n4297#1,2:24618\n9088#1,4:24620\n9103#1,4:24624\n9118#1,4:24628\n9133#1,4:24632\n9148#1,4:24636\n9163#1,4:24640\n9178#1,4:24644\n9193#1,4:24648\n9208#1,4:24652\n8801#1,4:24656\n8817#1,4:24660\n8833#1,4:24664\n8849#1,4:24668\n8865#1,4:24672\n8881#1,4:24676\n8897#1,4:24680\n8913#1,4:24684\n8929#1,4:24688\n8945#1,4:24692\n8961#1,4:24696\n8977#1,4:24700\n8993#1,4:24704\n9009#1,4:24708\n9025#1,4:24712\n9041#1,4:24716\n9057#1,4:24720\n9073#1,4:24724\n9376#1,4:24728\n10394#1,5:24732\n10405#1,5:24737\n10416#1,5:24742\n10427#1,5:24747\n10438#1,5:24752\n10449#1,5:24757\n10460#1,5:24762\n10471#1,5:24767\n10482#1,5:24772\n10497#1,5:24777\n10738#1,3:24782\n10741#1,3:24792\n10755#1,3:24795\n10758#1,3:24805\n10772#1,3:24808\n10775#1,3:24818\n10789#1,3:24821\n10792#1,3:24831\n10806#1,3:24834\n10809#1,3:24844\n10823#1,3:24847\n10826#1,3:24857\n10840#1,3:24860\n10843#1,3:24870\n10857#1,3:24873\n10860#1,3:24883\n10874#1,3:24886\n10877#1,3:24896\n10892#1,3:24899\n10895#1,3:24909\n10910#1,3:24912\n10913#1,3:24922\n10928#1,3:24925\n10931#1,3:24935\n10946#1,3:24938\n10949#1,3:24948\n10964#1,3:24951\n10967#1,3:24961\n10982#1,3:24964\n10985#1,3:24974\n11000#1,3:24977\n11003#1,3:24987\n11018#1,3:24990\n11021#1,3:25000\n11036#1,3:25003\n11039#1,3:25013\n11400#1,3:25142\n11410#1,3:25145\n11420#1,3:25148\n11430#1,3:25151\n11440#1,3:25154\n11450#1,3:25157\n11460#1,3:25160\n11470#1,3:25163\n11480#1,3:25166\n11266#1,4:25169\n11279#1,4:25173\n11292#1,4:25177\n11305#1,4:25181\n11318#1,4:25185\n11331#1,4:25189\n11344#1,4:25193\n11357#1,4:25197\n11370#1,4:25201\n11255#1:25205\n13374#1,2:25206\n13376#1:25209\n11256#1:25210\n13374#1,3:25211\n11391#1:25214\n13309#1:25215\n13310#1:25217\n11392#1:25218\n13309#1,2:25219\n13374#1,3:25221\n13384#1,3:25224\n13394#1,3:25227\n13404#1,3:25230\n13414#1,3:25233\n13424#1,3:25236\n13434#1,3:25239\n13444#1,3:25242\n13454#1,3:25245\n20623#1,2:25248\n20625#1,6:25251\n20839#1,2:25257\n20841#1,6:25260\n23035#1,6:25266\n23051#1,6:25272\n23067#1,6:25278\n23083#1,6:25284\n23099#1,6:25290\n23115#1,6:25296\n23131#1,6:25302\n23147#1,6:25308\n23163#1,6:25314\n23269#1,8:25320\n23287#1,8:25328\n23305#1,8:25336\n23323#1,8:25344\n23341#1,8:25352\n23359#1,8:25360\n23377#1,8:25368\n23395#1,8:25376\n23413#1,8:25384\n23511#1,6:25392\n23527#1,6:25398\n23543#1,6:25404\n23559#1,6:25410\n23575#1,6:25416\n23591#1,6:25422\n23607#1,6:25428\n23623#1,6:25434\n1#2:24491\n1#2:25208\n1#2:25216\n1#2:25250\n1#2:25259\n372#3,7:24785\n372#3,7:24798\n372#3,7:24811\n372#3,7:24824\n372#3,7:24837\n372#3,7:24850\n372#3,7:24863\n372#3,7:24876\n372#3,7:24889\n372#3,7:24902\n372#3,7:24915\n372#3,7:24928\n372#3,7:24941\n372#3,7:24954\n372#3,7:24967\n372#3,7:24980\n372#3,7:24993\n372#3,7:25006\n372#3,7:25016\n372#3,7:25023\n372#3,7:25030\n372#3,7:25037\n372#3,7:25044\n372#3,7:25051\n372#3,7:25058\n372#3,7:25065\n372#3,7:25072\n372#3,7:25079\n372#3,7:25086\n372#3,7:25093\n372#3,7:25100\n372#3,7:25107\n372#3,7:25114\n372#3,7:25121\n372#3,7:25128\n372#3,7:25135\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n556#1:24424,2\n565#1:24426,2\n832#1:24428,2\n842#1:24430,2\n852#1:24432,2\n862#1:24434,2\n872#1:24436,2\n882#1:24438,2\n892#1:24440,2\n902#1:24442,2\n912#1:24444,2\n922#1:24446,5\n932#1:24451,5\n942#1:24456,5\n952#1:24461,5\n962#1:24466,5\n972#1:24471,5\n982#1:24476,5\n992#1:24481,5\n1002#1:24486,5\n3792#1:24492,2\n3801#1:24494,2\n3810#1:24496,2\n3819#1:24498,2\n3828#1:24500,2\n3837#1:24502,2\n3846#1:24504,2\n3855#1:24506,2\n3864#1:24508,2\n3875#1:24510\n3875#1:24511,2\n3875#1:24513,2\n3875#1:24515\n3875#1:24516\n3886#1:24517\n3886#1:24518,2\n3886#1:24520,2\n3886#1:24522\n3886#1:24523\n3897#1:24524\n3897#1:24525,2\n3897#1:24527,2\n3897#1:24529\n3897#1:24530\n3908#1:24531\n3908#1:24532,2\n3908#1:24534,2\n3908#1:24536\n3908#1:24537\n3919#1:24538\n3919#1:24539,2\n3919#1:24541,2\n3919#1:24543\n3919#1:24544\n3930#1:24545\n3930#1:24546,2\n3930#1:24548,2\n3930#1:24550\n3930#1:24551\n3941#1:24552\n3941#1:24553,2\n3941#1:24555,2\n3941#1:24557\n3941#1:24558\n3952#1:24559\n3952#1:24560,2\n3952#1:24562,2\n3952#1:24564\n3952#1:24565\n3963#1:24566\n3963#1:24567,2\n3963#1:24569,2\n3963#1:24571\n3963#1:24572\n3974#1:24573,3\n3988#1:24576,3\n4002#1:24579,3\n4016#1:24582,3\n4030#1:24585,3\n4044#1:24588,3\n4058#1:24591,3\n4072#1:24594,3\n4086#1:24597,3\n4098#1:24600,2\n4117#1:24602,2\n4126#1:24604,2\n4135#1:24606,2\n4144#1:24608,2\n4153#1:24610,2\n4162#1:24612,2\n4171#1:24614,2\n4180#1:24616,2\n4189#1:24618,2\n8407#1:24620,4\n8422#1:24624,4\n8437#1:24628,4\n8452#1:24632,4\n8467#1:24636,4\n8482#1:24640,4\n8497#1:24644,4\n8512#1:24648,4\n8527#1:24652,4\n8542#1:24656,4\n8557#1:24660,4\n8572#1:24664,4\n8587#1:24668,4\n8602#1:24672,4\n8617#1:24676,4\n8632#1:24680,4\n8647#1:24684,4\n8662#1:24688,4\n8676#1:24692,4\n8690#1:24696,4\n8704#1:24700,4\n8718#1:24704,4\n8732#1:24708,4\n8746#1:24712,4\n8760#1:24716,4\n8774#1:24720,4\n8788#1:24724,4\n9227#1:24728,4\n9972#1:24732,5\n9981#1:24737,5\n9990#1:24742,5\n9999#1:24747,5\n10008#1:24752,5\n10017#1:24757,5\n10026#1:24762,5\n10035#1:24767,5\n10044#1:24772,5\n10057#1:24777,5\n10513#1:24782,3\n10513#1:24792,3\n10525#1:24795,3\n10525#1:24805,3\n10537#1:24808,3\n10537#1:24818,3\n10549#1:24821,3\n10549#1:24831,3\n10561#1:24834,3\n10561#1:24844,3\n10573#1:24847,3\n10573#1:24857,3\n10585#1:24860,3\n10585#1:24870,3\n10597#1:24873,3\n10597#1:24883,3\n10609#1:24886,3\n10609#1:24896,3\n10622#1:24899,3\n10622#1:24909,3\n10635#1:24912,3\n10635#1:24922,3\n10648#1:24925,3\n10648#1:24935,3\n10661#1:24938,3\n10661#1:24948,3\n10674#1:24951,3\n10674#1:24961,3\n10687#1:24964,3\n10687#1:24974,3\n10700#1:24977,3\n10700#1:24987,3\n10713#1:24990,3\n10713#1:25000,3\n10726#1:25003,3\n10726#1:25013,3\n11065#1:25142,3\n11075#1:25145,3\n11085#1:25148,3\n11095#1:25151,3\n11105#1:25154,3\n11115#1:25157,3\n11125#1:25160,3\n11135#1:25163,3\n11145#1:25166,3\n11155#1:25169,4\n11165#1:25173,4\n11175#1:25177,4\n11185#1:25181,4\n11195#1:25185,4\n11205#1:25189,4\n11215#1:25193,4\n11225#1:25197,4\n11235#1:25201,4\n11245#1:25205\n11245#1:25206,2\n11245#1:25209\n11245#1:25210\n11255#1:25211,3\n11383#1:25214\n11383#1:25215\n11383#1:25217\n11383#1:25218\n11391#1:25219,2\n18891#1:25221,3\n18903#1:25224,3\n18915#1:25227,3\n18927#1:25230,3\n18939#1:25233,3\n18951#1:25236,3\n18963#1:25239,3\n18975#1:25242,3\n18987#1:25245,3\n21455#1:25248,2\n21455#1:25251,6\n21617#1:25257,2\n21617#1:25260,6\n22944#1:25266,6\n22954#1:25272,6\n22964#1:25278,6\n22974#1:25284,6\n22984#1:25290,6\n22994#1:25296,6\n23004#1:25302,6\n23014#1:25308,6\n23024#1:25314,6\n23178#1:25320,8\n23188#1:25328,8\n23198#1:25336,8\n23208#1:25344,8\n23218#1:25352,8\n23228#1:25360,8\n23238#1:25368,8\n23248#1:25376,8\n23258#1:25384,8\n23430#1:25392,6\n23440#1:25398,6\n23450#1:25404,6\n23460#1:25410,6\n23470#1:25416,6\n23480#1:25422,6\n23490#1:25428,6\n23500#1:25434,6\n11245#1:25208\n11383#1:25216\n21455#1:25250\n21617#1:25259\n10513#1:24785,7\n10525#1:24798,7\n10537#1:24811,7\n10549#1:24824,7\n10561#1:24837,7\n10573#1:24850,7\n10585#1:24863,7\n10597#1:24876,7\n10609#1:24889,7\n10622#1:24902,7\n10635#1:24915,7\n10648#1:24928,7\n10661#1:24941,7\n10674#1:24954,7\n10687#1:24967,7\n10700#1:24980,7\n10713#1:24993,7\n10726#1:25006,7\n10740#1:25016,7\n10757#1:25023,7\n10774#1:25030,7\n10791#1:25037,7\n10808#1:25044,7\n10825#1:25051,7\n10842#1:25058,7\n10859#1:25065,7\n10876#1:25072,7\n10894#1:25079,7\n10912#1:25086,7\n10930#1:25093,7\n10948#1:25100,7\n10966#1:25107,7\n10984#1:25114,7\n11002#1:25121,7\n11020#1:25128,7\n11038#1:25135,7\n*E\n"})
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends Lambda implements Function0<Iterator<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T[] f79445p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T[] tArr) {
            super(0);
            this.f79445p0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<T> invoke() {
            return ArrayIteratorKt.iterator(this.f79445p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<Iterator<? extends Byte>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f79464p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr) {
            super(0);
            this.f79464p0 = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Byte> invoke() {
            return ArrayIteratorsKt.iterator(this.f79464p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\n\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends Lambda implements Function0<Iterator<? extends Short>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ short[] f79465p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(short[] sArr) {
            super(0);
            this.f79465p0 = sArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Short> invoke() {
            return ArrayIteratorsKt.iterator(this.f79465p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends Lambda implements Function0<Iterator<? extends Integer>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int[] f79466p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int[] iArr) {
            super(0);
            this.f79466p0 = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Integer> invoke() {
            return ArrayIteratorsKt.iterator(this.f79466p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends Lambda implements Function0<Iterator<? extends Long>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long[] f79467p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long[] jArr) {
            super(0);
            this.f79467p0 = jArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Long> invoke() {
            return ArrayIteratorsKt.iterator(this.f79467p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends Lambda implements Function0<Iterator<? extends Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float[] f79468p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float[] fArr) {
            super(0);
            this.f79468p0 = fArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Float> invoke() {
            return ArrayIteratorsKt.iterator(this.f79468p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends Lambda implements Function0<Iterator<? extends Double>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ double[] f79469p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(double[] dArr) {
            super(0);
            this.f79469p0 = dArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Double> invoke() {
            return ArrayIteratorsKt.iterator(this.f79469p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends Lambda implements Function0<Iterator<? extends Boolean>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean[] f79472p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean[] zArr) {
            super(0);
            this.f79472p0 = zArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Boolean> invoke() {
            return ArrayIteratorsKt.iterator(this.f79472p0);
        }
    }

    /* JADX INFO: compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\f\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends Lambda implements Function0<Iterator<? extends Character>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ char[] f79473p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(char[] cArr) {
            super(0);
            this.f79473p0 = cArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Character> invoke() {
            return ArrayIteratorsKt.iterator(this.f79473p0);
        }
    }

    public static final <T> boolean all(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(tArr);
    }

    @NotNull
    public static <T> Sequence<T> asSequence(@NotNull final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<T>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(tArr.length), 16));
        for (a.d dVar : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(dVar);
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(t10);
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <K, V> Map<K, V> associateWith(@NotNull K[] kArr, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(kArr.length), 16));
        for (K k10 : kArr) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull K[] kArr, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k10 : kArr) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    public static final double average(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double d2 = 0.0d;
        int i10 = 0;
        for (byte b10 : bArr) {
            d2 += (double) b10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i10);
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double dByteValue = 0.0d;
        int i10 = 0;
        for (Byte b10 : bArr) {
            dByteValue += (double) b10.byteValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        int i10 = 0;
        for (Double d2 : dArr) {
            dDoubleValue += d2.doubleValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double dFloatValue = 0.0d;
        int i10 = 0;
        for (Float f6 : fArr) {
            dFloatValue += (double) f6.floatValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        double dIntValue = 0.0d;
        int i10 = 0;
        for (Integer num : numArr) {
            dIntValue += (double) num.intValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        double dLongValue = 0.0d;
        int i10 = 0;
        for (Long l6 : lArr) {
            dLongValue += l6.longValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        double dShortValue = 0.0d;
        int i10 = 0;
        for (Short sh2 : shArr) {
            dShortValue += (double) sh2.shortValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    public static <T> boolean contains(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return indexOf(tArr, t10) >= 0;
    }

    public static final <T> int count(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final <T> List<T> distinct(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(tArr));
    }

    @NotNull
    public static final <T, K> List<T> distinctBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> drop(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 >= 0) {
            return takeLast(tArr, kotlin.ranges.c.coerceAtLeast(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLast(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 >= 0) {
            return take(tArr, kotlin.ranges.c.coerceAtLeast(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return take(tArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <T> List<T> dropWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : tArr) {
            if (z10) {
                arrayList.add(t10);
            } else if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> filter(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> filterIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                arrayList.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                destination.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T> List<T> filterNot(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> filterNotNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static <T> T first(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static <T> T firstOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @NotNull
    public static final <T, R> List<R> flatMap(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            bk.g.addAll(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequence")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> List<R> flatMapSequence(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            bk.g.addAll(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequenceTo")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            bk.g.addAll(destination, transform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            bk.g.addAll(destination, transform.invoke(t10));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R fold(@NotNull T[] tArr, R r3, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (a.d dVar : tArr) {
            r3 = operation.invoke(r3, dVar);
        }
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldIndexed(@NotNull T[] tArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, tArr[i10]);
            i10++;
            i11++;
        }
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRight(@NotNull T[] tArr, R r3, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(tArr[lastIndex], r3);
        }
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRightIndexed(@NotNull T[] tArr, R r3, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r3);
        }
        return r3;
    }

    public static final <T> void forEach(@NotNull T[] tArr, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (T t10 : tArr) {
            action.invoke(t10);
        }
    }

    public static final <T> void forEachIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <T> IntRange getIndices(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IntRange(0, getLastIndex(tArr));
    }

    public static <T> int getLastIndex(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    @Nullable
    public static <T> T getOrNull(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(t10);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(t10);
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final T[] tArr, @NotNull final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.collections.ArraysKt___ArraysKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public K keyOf(T element) {
                return keySelector.invoke(element);
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<T> sourceIterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    public static <T> int indexOf(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (Intrinsics.areEqual(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(tArr[i10]).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <T> Set<T> intersect(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull T[] tArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            kotlin.text.d.appendElement(buffer, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final <T> String joinToString(@NotNull T[] tArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, function1);
    }

    public static <T> T last(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[getLastIndex(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> int lastIndexOf(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (Intrinsics.areEqual(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static <T> T lastOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @NotNull
    public static <T, R> List<R> map(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(transform.invoke(t10));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexedNotNull(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <T, R> List<R> mapNotNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            destination.add(transform.invoke(t10));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            T t11 = tArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            T t11 = tArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[Iterator2.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[Iterator2.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T maxWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            T t11 = tArr[Iterator2.nextInt()];
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            T t11 = tArr[Iterator2.nextInt()];
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            T t11 = tArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            T t11 = tArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[Iterator2.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[Iterator2.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T minWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            T t11 = tArr[Iterator2.nextInt()];
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            T t11 = tArr[Iterator2.nextInt()];
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static final <T> boolean none(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    public static final <T> T random(@NotNull T[] tArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length != 0) {
            return tArr[random.nextInt(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <T> T randomOrNull(@NotNull T[] tArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final <S, T extends S> S reduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[Iterator2.nextInt()]);
        }
        return sInvoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final <S, T extends S> S reduceIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            sInvoke = operation.invoke(Integer.valueOf(iNextInt), sInvoke, (Object) tArr[iNextInt]);
        }
        return sInvoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (S) tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            sInvoke = operation.invoke(Integer.valueOf(iNextInt), sInvoke, (Object) tArr[iNextInt]);
        }
        return sInvoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceOrNull(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (S) tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[Iterator2.nextInt()]);
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRight(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke((Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRightIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke(Integer.valueOf(i10), (Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceRightIndexedOrNull(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke(Integer.valueOf(i10), (Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceRightOrNull(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke((Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @NotNull
    public static final <T> T[] requireNoNulls(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        for (T t10 : tArr) {
            if (t10 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    public static final <T> void reverse(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            T t10 = tArr[iNextInt];
            tArr[iNextInt] = tArr[lastIndex];
            tArr[lastIndex] = t10;
            lastIndex--;
        }
    }

    @NotNull
    public static <T> List<T> reversed(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final <T> T[] reversedArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) bk.b.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            tArr2[lastIndex - iNextInt] = tArr[iNextInt];
        }
        return tArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFold(@NotNull T[] tArr, R r3, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r3);
        for (a.d dVar : tArr) {
            r3 = operation.invoke(r3, dVar);
            arrayList.add(r3);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFoldIndexed(@NotNull T[] tArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r3);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r3 = operation.invoke(Integer.valueOf(i10), r3, tArr[i10]);
            arrayList.add(r3);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <S, T extends S> List<S> runningReduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> runningReduceIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> List<R> scan(@NotNull T[] tArr, R r3, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r3);
        for (a.d dVar : tArr) {
            r3 = operation.invoke(r3, dVar);
            arrayList.add(r3);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> List<R> scanIndexed(@NotNull T[] tArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r3);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r3 = operation.invoke(Integer.valueOf(i10), r3, tArr[i10]);
            arrayList.add(r3);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        shuffle(tArr, Random.INSTANCE);
    }

    public static <T> T single(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static <T> T singleOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    public static <T> List<T> slice(@NotNull T[] tArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        T[] tArr2 = (T[]) bk.b.arrayOfNulls(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            tArr2[i10] = tArr[it.next().intValue()];
            i10++;
        }
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(tArr, dk.e.reverseOrder());
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sorted(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return ArraysKt___ArraysJvmKt.asList(sortedArray(tArr));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        ArraysKt___ArraysJvmKt.sort(tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        ArraysKt___ArraysJvmKt.sortWith(tArr2, dk.e.reverseOrder());
        return tArr2;
    }

    @NotNull
    public static final <T> T[] sortedArrayWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sortWith(tArr2, comparator);
        return tArr2;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sortedDescending(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return sortedWith(tArr, dk.e.reverseOrder());
    }

    @NotNull
    public static <T> List<T> sortedWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysJvmKt.asList(sortedArrayWith(tArr, comparator));
    }

    @NotNull
    public static final <T> Set<T> subtract(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sum(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10;
        }
        return i10;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final <T> int sumBy(@NotNull T[] tArr, @NotNull Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (T t10 : tArr) {
            iIntValue += selector.invoke(t10).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final <T> double sumByDouble(@NotNull T[] tArr, @NotNull Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t10 : tArr) {
            dDoubleValue += selector.invoke(t10).doubleValue();
        }
        return dDoubleValue;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int iByteValue = 0;
        for (Byte b10 : bArr) {
            iByteValue += b10.byteValue();
        }
        return iByteValue;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        for (Double d2 : dArr) {
            dDoubleValue += d2.doubleValue();
        }
        return dDoubleValue;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float fFloatValue = 0.0f;
        for (Float f6 : fArr) {
            fFloatValue += f6.floatValue();
        }
        return fFloatValue;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        long jLongValue = 0;
        for (Long l6 : lArr) {
            jLongValue += l6.longValue();
        }
        return jLongValue;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int iShortValue = 0;
        for (Short sh2 : shArr) {
            iShortValue += sh2.shortValue();
        }
        return iShortValue;
    }

    @NotNull
    public static final <T> List<T> take(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= tArr.length) {
            return toList(tArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (T t10 : tArr) {
            arrayList.add(t10);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> takeLast(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return toList(tArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> takeLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return drop(tArr, lastIndex + 1);
            }
        }
        return toList(tArr);
    }

    @NotNull
    public static final <T> List<T> takeWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    @NotNull
    public static final boolean[] toBooleanArray(@NotNull Boolean[] boolArr) {
        Intrinsics.checkNotNullParameter(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    @NotNull
    public static byte[] toByteArray(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    @NotNull
    public static final char[] toCharArray(@NotNull Character[] chArr) {
        Intrinsics.checkNotNullParameter(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = chArr[i10].charValue();
        }
        return cArr;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    @NotNull
    public static final double[] toDoubleArray(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }

    @NotNull
    public static final float[] toFloatArray(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    @NotNull
    public static final <T> HashSet<T> toHashSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (HashSet) toCollection(tArr, new HashSet(p.mapCapacity(tArr.length)));
    }

    @NotNull
    public static final int[] toIntArray(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    @NotNull
    public static <T> List<T> toList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? toMutableList(tArr) : bk.d.listOf(tArr[0]);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final long[] toLongArray(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    @NotNull
    public static <T> List<T> toMutableList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(tArr));
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (Set) toCollection(tArr, new LinkedHashSet(p.mapCapacity(tArr.length)));
    }

    @NotNull
    public static <T> Set<T> toSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) toCollection(tArr, new LinkedHashSet(p.mapCapacity(tArr.length))) : v.setOf(tArr[0]);
        }
        return w.emptySet();
    }

    @NotNull
    public static final short[] toShortArray(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = shArr[i10].shortValue();
        }
        return sArr;
    }

    @NotNull
    public static final <T> Set<T> union(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static <T> Iterable<IndexedValue<T>> withIndex(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IndexingIterable(new a(tArr));
    }

    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull R[] other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final double average(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        double d2 = 0.0d;
        int i10 = 0;
        for (short s4 : sArr) {
            d2 += (double) s4;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i10);
    }

    public static boolean contains(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return indexOf(bArr, b10) >= 0;
    }

    public static final int count(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Byte> distinct(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(bArr));
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterNotTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    public static final <R> R fold(@NotNull byte[] bArr, R r3, @NotNull Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (byte b10 : bArr) {
            r3 = operation.invoke(r3, Byte.valueOf(b10));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull byte[] bArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final void forEach(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b10 : bArr) {
            action.invoke(Byte.valueOf(b10));
        }
    }

    public static final void forEachIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IntRange(0, getLastIndex(bArr));
    }

    public static int getLastIndex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    @Nullable
    public static final Byte getOrNull(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i10]);
    }

    @NotNull
    public static final String joinToString(@NotNull byte[] bArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(bArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Byte, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final boolean none(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        shuffle(bArr, (Random) Random.INSTANCE);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(bArr);
            reverse(bArr);
        }
    }

    @NotNull
    public static final List<Byte> sorted(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Byte> sortedDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(bArrCopyOf);
        return reversed(bArrCopyOf);
    }

    @NotNull
    public static final List<Byte> sortedWith(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final int sum(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int i10 = 0;
        for (short s4 : sArr) {
            i10 += s4;
        }
        return i10;
    }

    @NotNull
    public static final HashSet<Byte> toHashSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (HashSet) toCollection(bArr, new HashSet(p.mapCapacity(bArr.length)));
    }

    @NotNull
    public static final List<Byte> toMutableList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int iA = 0;
        while (iA < length) {
            iA = androidx.room.a.a(bArr[iA], arrayList, iA, 1);
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Byte> toMutableSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (Set) toCollection(bArr, new LinkedHashSet(p.mapCapacity(bArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Byte>> withIndex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IndexingIterable(new b(bArr));
    }

    public static final boolean all(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @NotNull
    public static Iterable<Byte> asIterable(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(bArr);
    }

    @NotNull
    public static final Sequence<Byte> asSequence(@NotNull final byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Byte>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Byte> iterator() {
                return ArrayIteratorsKt.iterator(bArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    public static final double average(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        double d2 = 0.0d;
        int i10 = 0;
        for (int i11 : iArr) {
            d2 += (double) i11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i10);
    }

    public static boolean contains(@NotNull short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return indexOf(sArr, s4) >= 0;
    }

    public static final int count(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Short> distinct(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(sArr));
    }

    @NotNull
    public static final List<Byte> filter(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterIndexedTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Byte> filterNot(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterNotTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R fold(@NotNull short[] sArr, R r3, @NotNull Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (short s4 : sArr) {
            r3 = operation.invoke(r3, Short.valueOf(s4));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull short[] sArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final <R> R foldRight(@NotNull byte[] bArr, R r3, @NotNull Function2<? super Byte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Byte.valueOf(bArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull byte[] bArr, R r3, @NotNull Function3<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final void forEach(@NotNull short[] sArr, @NotNull Function1<? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s4 : sArr) {
            action.invoke(Short.valueOf(s4));
        }
    }

    public static final void forEachIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new IntRange(0, getLastIndex(sArr));
    }

    public static int getLastIndex(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length - 1;
    }

    @Nullable
    public static final Short getOrNull(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i10]);
    }

    public static final int indexOfFirst(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Byte.valueOf(bArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Byte> intersect(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final String joinToString(@NotNull short[] sArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Short, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(sArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Short, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b10 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    public static final boolean none(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte randomOrNull(@NotNull byte[] bArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        shuffle(sArr, (Random) Random.INSTANCE);
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    @NotNull
    public static List<Byte> slice(@NotNull byte[] bArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final List<Short> sorted(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final byte[] sortedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final byte[] sortedArrayDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        sortDescending(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Short> sortedDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(sArrCopyOf);
        return reversed(sArrCopyOf);
    }

    @NotNull
    public static final List<Short> sortedWith(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Byte> subtract(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static int sum(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Integer> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b10)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C toCollection(@NotNull byte[] bArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (byte b10 : bArr) {
            destination.add(Byte.valueOf(b10));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Short> toHashSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (HashSet) toCollection(sArr, new HashSet(p.mapCapacity(sArr.length)));
    }

    @NotNull
    public static final Set<Short> toMutableSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (Set) toCollection(sArr, new LinkedHashSet(p.mapCapacity(sArr.length)));
    }

    @NotNull
    public static final Set<Byte> union(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Short>> withIndex(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new IndexingIterable(new c(sArr));
    }

    public static final boolean all(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final double average(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        double d2 = 0.0d;
        int i10 = 0;
        for (long j10 : jArr) {
            d2 += j10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i10);
    }

    public static boolean contains(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return indexOf(iArr, i10) >= 0;
    }

    public static final int count(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Integer> distinct(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(iArr));
    }

    @NotNull
    public static final List<Byte> filterIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterNotTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    public static byte first(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b10 : bArr) {
            bk.g.addAll(destination, transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull int[] iArr, R r3, @NotNull Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i10 : iArr) {
            r3 = operation.invoke(r3, Integer.valueOf(i10));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull int[] iArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final void forEach(@NotNull int[] iArr, @NotNull Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i10 : iArr) {
            action.invoke(Integer.valueOf(i10));
        }
    }

    public static final void forEachIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IntRange(0, getLastIndex(iArr));
    }

    public static int getLastIndex(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    @Nullable
    public static Integer getOrNull(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    @NotNull
    public static final String joinToString(@NotNull int[] iArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Integer, ? extends CharSequence>) function1);
    }

    public static byte last(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[getLastIndex(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final boolean none(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    @SinceKotlin(version = "1.3")
    public static final byte random(@NotNull byte[] bArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length != 0) {
            return bArr[random.nextInt(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceRightIndexedOrNull(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceRightOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @NotNull
    public static final List<Byte> reversed(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Byte> mutableList = toMutableList(bArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        shuffle(iArr, (Random) Random.INSTANCE);
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr2[i10] = bArr[it.next().intValue()];
            i10++;
        }
        return bArr2;
    }

    @NotNull
    public static final List<Integer> sorted(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Integer> sortedDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(iArrCopyOf);
        return reversed(iArrCopyOf);
    }

    @NotNull
    public static final List<Integer> sortedWith(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final long sum(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    @NotNull
    public static final HashSet<Integer> toHashSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (HashSet) toCollection(iArr, new HashSet(p.mapCapacity(iArr.length)));
    }

    @NotNull
    public static final Set<Integer> toMutableSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (Set) toCollection(iArr, new LinkedHashSet(p.mapCapacity(iArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Integer>> withIndex(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IndexingIterable(new d(iArr));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull R[] other, @NotNull Function2<? super Byte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @NotNull
    public static Iterable<Short> asIterable(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(sArr);
    }

    @NotNull
    public static final Sequence<Short> asSequence(@NotNull final short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Short>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Short> iterator() {
                return ArrayIteratorsKt.iterator(sArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(bArr.length), 16));
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Byte> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s4 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s4));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    public static final double average(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d2 = 0.0d;
        int i10 = 0;
        for (float f6 : fArr) {
            d2 += (double) f6;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i10);
    }

    public static boolean contains(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return indexOf(jArr, j10) >= 0;
    }

    public static final int count(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Long> distinct(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(jArr));
    }

    @NotNull
    public static final List<Byte> dropLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return take(bArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Short> filter(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterIndexedTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s4 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Short> filterNot(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterNotTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            bk.g.addAll(arrayList, transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull long[] jArr, R r3, @NotNull Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (long j10 : jArr) {
            r3 = operation.invoke(r3, Long.valueOf(j10));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull long[] jArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final <R> R foldRight(@NotNull short[] sArr, R r3, @NotNull Function2<? super Short, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Short.valueOf(sArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull short[] sArr, R r3, @NotNull Function3<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final void forEach(@NotNull long[] jArr, @NotNull Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j10 : jArr) {
            action.invoke(Long.valueOf(j10));
        }
    }

    public static final void forEachIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new IntRange(0, getLastIndex(jArr));
    }

    public static int getLastIndex(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    @Nullable
    public static final Long getOrNull(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i10]);
    }

    public static int indexOf(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Short.valueOf(sArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Short> intersect(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final String joinToString(@NotNull long[] jArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Long, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(jArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Long, ? extends CharSequence>) function1);
    }

    public static int lastIndexOf(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final boolean none(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short randomOrNull(@NotNull short[] sArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceIndexedOrNull(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            bByteValue = operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt])).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
        while (Iterator2.hasNext()) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[Iterator2.nextInt()])).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    public static final byte reduceRight(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                bByteValue = operation.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceRightIndexed(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        shuffle(jArr, (Random) Random.INSTANCE);
    }

    public static final byte single(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(sArr);
            reverse(sArr);
        }
    }

    @NotNull
    public static final List<Long> sorted(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final short[] sortedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final short[] sortedArrayDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        sortDescending(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Long> sortedDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(jArrCopyOf);
        return reversed(jArrCopyOf);
    }

    @NotNull
    public static final List<Long> sortedWith(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Short> subtract(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final float sum(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f6 = 0.0f;
        for (float f10 : fArr) {
            f6 += f10;
        }
        return f6;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull short[] sArr, @NotNull Function1<? super Short, Integer> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (short s4 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s4)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull short[] sArr, @NotNull Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s4 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s4)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Byte> takeLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return drop(bArr, lastIndex + 1);
            }
        }
        return toList(bArr);
    }

    @NotNull
    public static final List<Byte> takeWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int iA = 0;
        while (iA < length) {
            byte b10 = bArr[iA];
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                break;
            }
            iA = androidx.room.a.a(b10, arrayList, iA, 1);
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C toCollection(@NotNull short[] sArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (short s4 : sArr) {
            destination.add(Short.valueOf(s4));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Long> toHashSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (HashSet) toCollection(jArr, new HashSet(p.mapCapacity(jArr.length)));
    }

    @NotNull
    public static List<Byte> toList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(bArr);
        }
        return bk.d.listOf(Byte.valueOf(bArr[0]));
    }

    @NotNull
    public static final Set<Long> toMutableSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (Set) toCollection(jArr, new LinkedHashSet(p.mapCapacity(jArr.length)));
    }

    @NotNull
    public static final Set<Byte> toSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(bArr, new LinkedHashSet(p.mapCapacity(bArr.length)));
        }
        return v.setOf(Byte.valueOf(bArr[0]));
    }

    @NotNull
    public static final Set<Short> union(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Long>> withIndex(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new IndexingIterable(new e(jArr));
    }

    public static final boolean all(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f6 : fArr) {
            if (!predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final double average(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d2 = 0.0d;
        int i10 = 0;
        for (double d3 : dArr) {
            d2 += d3;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i10);
    }

    public static final boolean contains(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z10) >= 0;
    }

    public static final int count(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Float> distinct(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(fArr));
    }

    @NotNull
    public static final List<Byte> dropWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (z10) {
                arrayList.add(Byte.valueOf(b10));
            } else if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterNotTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f6 : fArr) {
            if (!predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                destination.add(Float.valueOf(f6));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                destination.add(Float.valueOf(f6));
            }
        }
        return destination;
    }

    @Nullable
    public static Float firstOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R fold(@NotNull float[] fArr, R r3, @NotNull Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (float f6 : fArr) {
            r3 = operation.invoke(r3, Float.valueOf(f6));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull float[] fArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final void forEach(@NotNull float[] fArr, @NotNull Function1<? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f6 : fArr) {
            action.invoke(Float.valueOf(f6));
        }
    }

    public static final void forEachIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IntRange(0, getLastIndex(fArr));
    }

    public static int getLastIndex(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    @Nullable
    public static final Float getOrNull(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i10]);
    }

    @NotNull
    public static final String joinToString(@NotNull float[] fArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Float, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
        while (Iterator2.hasNext()) {
            byte b11 = bArr[Iterator2.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
        while (Iterator2.hasNext()) {
            byte b11 = bArr[Iterator2.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    public static final boolean none(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final byte reduce(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length != 0) {
            byte bByteValue = bArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
            while (Iterator2.hasNext()) {
                bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[Iterator2.nextInt()])).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final byte reduceIndexed(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length != 0) {
            byte bByteValue = bArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                bByteValue = operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt])).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        shuffle(fArr, (Random) Random.INSTANCE);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Float> sorted(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Float> sortedDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(fArrCopyOf);
        return reversed(fArrCopyOf);
    }

    @NotNull
    public static final List<Float> sortedWith(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final double sum(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += d3;
        }
        return d2;
    }

    @NotNull
    public static final HashSet<Float> toHashSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (HashSet) toCollection(fArr, new HashSet(p.mapCapacity(fArr.length)));
    }

    @NotNull
    public static final Set<Float> toMutableSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (Set) toCollection(fArr, new LinkedHashSet(p.mapCapacity(fArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Float>> withIndex(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IndexingIterable(new f(fArr));
    }

    public static final boolean all(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @NotNull
    public static Iterable<Integer> asIterable(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(iArr);
    }

    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Integer>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Integer> iterator() {
                return ArrayIteratorsKt.iterator(iArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    public static boolean contains(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c10) >= 0;
    }

    public static final int count(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Double> distinct(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(dArr));
    }

    @NotNull
    public static final <K> List<Byte> distinctBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b10)))) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> filter(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> filterIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s4 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterIndexedTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                destination.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return destination;
    }

    @NotNull
    public static final List<Integer> filterNot(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterNotTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                destination.add(Double.valueOf(d2));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                destination.add(Double.valueOf(d2));
            }
        }
        return destination;
    }

    public static final short first(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            bk.g.addAll(destination, transform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull double[] dArr, R r3, @NotNull Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (double d2 : dArr) {
            r3 = operation.invoke(r3, Double.valueOf(d2));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull double[] dArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final <R> R foldRight(@NotNull int[] iArr, R r3, @NotNull Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(iArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull int[] iArr, R r3, @NotNull Function3<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final void forEach(@NotNull double[] dArr, @NotNull Function1<? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d2 : dArr) {
            action.invoke(Double.valueOf(d2));
        }
    }

    public static final void forEachIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IntRange(0, getLastIndex(dArr));
    }

    public static final int getLastIndex(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length - 1;
    }

    @Nullable
    public static final Double getOrNull(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static int indexOf(@NotNull short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s4 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Integer> intersect(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull byte[] bArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final String joinToString(@NotNull double[] dArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Double, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(dArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Double, ? extends CharSequence>) function1);
    }

    public static final short last(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[getLastIndex(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int lastIndexOf(@NotNull short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (s4 == sArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s4)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            fFloatValue = Math.max(fFloatValue, fArr[Iterator2.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0].floatValue();
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                fFloatValue = Math.max(fFloatValue, fArr[Iterator2.nextInt()].floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final byte maxWithOrThrow(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
            while (Iterator2.hasNext()) {
                byte b11 = bArr[Iterator2.nextInt()];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            fFloatValue = Math.min(fFloatValue, fArr[Iterator2.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0].floatValue();
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                fFloatValue = Math.min(fFloatValue, fArr[Iterator2.nextInt()].floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final byte minWithOrThrow(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
            while (Iterator2.hasNext()) {
                byte b11 = bArr[Iterator2.nextInt()];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @SinceKotlin(version = "1.3")
    public static final short random(@NotNull short[] sArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length != 0) {
            return sArr[random.nextInt(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer randomOrNull(@NotNull int[] iArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    @NotNull
    public static final List<Short> reversed(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Short> mutableList = toMutableList(sArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        shuffle(dArr, Random.INSTANCE);
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr2[i10] = sArr[it.next().intValue()];
            i10++;
        }
        return sArr2;
    }

    @NotNull
    public static final List<Double> sorted(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final int[] sortedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final int[] sortedArrayDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        sortDescending(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Double> sortedDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(dArrCopyOf);
        return reversed(dArrCopyOf);
    }

    @NotNull
    public static final List<Double> sortedWith(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Integer> subtract(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, Integer> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i10)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull int[] iArr, @NotNull Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C toCollection(@NotNull int[] iArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Double> toHashSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (HashSet) toCollection(dArr, new HashSet(p.mapCapacity(dArr.length)));
    }

    @NotNull
    public static final List<Short> toMutableList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Double> toMutableSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (Set) toCollection(dArr, new LinkedHashSet(p.mapCapacity(dArr.length)));
    }

    @NotNull
    public static final Set<Integer> union(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Double>> withIndex(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IndexingIterable(new g(dArr));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull R[] other, @NotNull Function2<? super Short, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(float[] fArr, float f6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        for (float f10 : fArr) {
            if (f10 == f6) {
                return true;
            }
        }
        return false;
    }

    public static final int count(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Boolean> distinct(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(zArr));
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterNotTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    public static final <R> R fold(@NotNull boolean[] zArr, R r3, @NotNull Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (boolean z10 : zArr) {
            r3 = operation.invoke(r3, Boolean.valueOf(z10));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull boolean[] zArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final void forEach(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z10 : zArr) {
            action.invoke(Boolean.valueOf(z10));
        }
    }

    public static final void forEachIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IntRange(0, getLastIndex(zArr));
    }

    public static final int getLastIndex(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length - 1;
    }

    @Nullable
    public static final Boolean getOrNull(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i10]);
    }

    @NotNull
    public static final String joinToString(@NotNull boolean[] zArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(zArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(zArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Boolean, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    public static final boolean none(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @NotNull
    public static final Pair<List<Byte>, List<Byte>> partition(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            } else {
                arrayList2.add(Byte.valueOf(b10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceRightIndexedOrNull(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceRightOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        shuffle(zArr, Random.INSTANCE);
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(iArr);
            reverse(iArr);
        }
    }

    @NotNull
    public static final List<Character> sorted(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Character> sortedDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(cArrCopyOf);
        return reversed(cArrCopyOf);
    }

    @NotNull
    public static final List<Boolean> sortedWith(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Boolean[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(zArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final HashSet<Boolean> toHashSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (HashSet) toCollection(zArr, new HashSet(p.mapCapacity(zArr.length)));
    }

    @NotNull
    public static final Set<Boolean> toMutableSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (Set) toCollection(zArr, new LinkedHashSet(p.mapCapacity(zArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Boolean>> withIndex(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IndexingIterable(new h(zArr));
    }

    public static final boolean all(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @NotNull
    public static Iterable<Long> asIterable(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(jArr);
    }

    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Long>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Long> iterator() {
                return ArrayIteratorsKt.iterator(jArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(sArr.length), 16));
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s4));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Short> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(sArr.length), 16));
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(double[] dArr, double d2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        for (double d3 : dArr) {
            if (d3 == d2) {
                return true;
            }
        }
        return false;
    }

    public static final int count(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Character> distinct(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(cArr));
    }

    @NotNull
    public static final List<Short> dropLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return take(sArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Long> filter(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterIndexedTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Long> filterNot(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterNotTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            bk.g.addAll(arrayList, transform.invoke(Short.valueOf(s4)));
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull char[] cArr, R r3, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (char c10 : cArr) {
            r3 = operation.invoke(r3, Character.valueOf(c10));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull char[] cArr, R r3, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final <R> R foldRight(@NotNull long[] jArr, R r3, @NotNull Function2<? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Long.valueOf(jArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull long[] jArr, R r3, @NotNull Function3<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final void forEach(@NotNull char[] cArr, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (char c10 : cArr) {
            action.invoke(Character.valueOf(c10));
        }
    }

    public static final void forEachIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IntRange(0, getLastIndex(cArr));
    }

    public static final int getLastIndex(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length - 1;
    }

    @Nullable
    public static final Character getOrNull(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 < 0 || i10 > getLastIndex(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i10]);
    }

    public static int indexOf(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Long.valueOf(jArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Long> intersect(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final String joinToString(@NotNull char[] cArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Character, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(cArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(cArr, charSequence, charSequence5, charSequence6, i12, charSequence7, (Function1<? super Character, ? extends CharSequence>) function1);
    }

    public static int lastIndexOf(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 >= 0) {
                    length = i11;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j10 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    public static final boolean none(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long randomOrNull(@NotNull long[] jArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    public static final short reduceRight(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                sShortValue = operation.invoke(Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceRightIndexed(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        shuffle(cArr, (Random) Random.INSTANCE);
    }

    public static final short single(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final long[] sortedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final long[] sortedArrayDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        sortDescending(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Character> sortedWith(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Long> subtract(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull long[] jArr, @NotNull Function1<? super Long, Integer> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j10)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull long[] jArr, @NotNull Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Short> takeLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return drop(sArr, lastIndex + 1);
            }
        }
        return toList(sArr);
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C toCollection(@NotNull long[] jArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (long j10 : jArr) {
            destination.add(Long.valueOf(j10));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (HashSet) toCollection(cArr, new HashSet(p.mapCapacity(kotlin.ranges.c.coerceAtMost(cArr.length, 128))));
    }

    @NotNull
    public static List<Short> toList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(sArr);
        }
        return bk.d.listOf(Short.valueOf(sArr[0]));
    }

    @NotNull
    public static List<Integer> toMutableList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Character> toMutableSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (Set) toCollection(cArr, new LinkedHashSet(p.mapCapacity(kotlin.ranges.c.coerceAtMost(cArr.length, 128))));
    }

    @NotNull
    public static final Set<Short> toSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(sArr, new LinkedHashSet(p.mapCapacity(sArr.length)));
        }
        return v.setOf(Short.valueOf(sArr[0]));
    }

    @NotNull
    public static final Set<Long> union(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IndexingIterable(new i(cArr));
    }

    public static final <T> boolean any(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Integer> filterIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                arrayList.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return arrayList;
    }

    public static final int first(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T firstOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 : iArr) {
            bk.g.addAll(destination, transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    public static final int last(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[getLastIndex(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            T t10 = tArr[length];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <T> boolean none(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull int[] iArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length != 0) {
            return iArr[random.nextInt(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceIndexedOrNull(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            sShortValue = operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt])).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
        while (Iterator2.hasNext()) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[Iterator2.nextInt()])).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @NotNull
    public static final List<Integer> reversed(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Integer> mutableList = toMutableList(iArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(tArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            T t10 = tArr[lastIndex];
            tArr[lastIndex] = tArr[iNextInt];
            tArr[iNextInt] = t10;
        }
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr2[i10] = iArr[it.next().intValue()];
            i10++;
        }
        return iArr2;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull R[] other, @NotNull Function2<? super Integer, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static Iterable<Float> asIterable(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(fArr);
    }

    @NotNull
    public static final Sequence<Float> asSequence(@NotNull final float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Float>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Float> iterator() {
                return ArrayIteratorsKt.iterator(fArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f6 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f6)), Float.valueOf(f6));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f6 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f6));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @NotNull
    public static final List<Short> dropWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (short s4 : sArr) {
            if (z10) {
                arrayList.add(Short.valueOf(s4));
            } else if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filter(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                arrayList.add(Float.valueOf(f6));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterIndexedTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f6 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f6)).booleanValue()) {
                destination.add(Float.valueOf(f6));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Float> filterNot(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f6 : fArr) {
            if (!predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                arrayList.add(Float.valueOf(f6));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull float[] fArr, R r3, @NotNull Function2<? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Float.valueOf(fArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull float[] fArr, R r3, @NotNull Function3<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r3);
        }
        return r3;
    }

    @NotNull
    public static final <K> Map<K, List<Byte>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    public static int indexOf(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Float.valueOf(fArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Float> intersect(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static int lastIndexOf(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (j10 == jArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f6 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f6)));
        }
        return destination;
    }

    public static final boolean none(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float randomOrNull(@NotNull float[] fArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final short reduce(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length != 0) {
            short sShortValue = sArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
            while (Iterator2.hasNext()) {
                sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[Iterator2.nextInt()])).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final short reduceIndexed(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length != 0) {
            short sShortValue = sArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                sShortValue = operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt])).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Float> slice(@NotNull float[] fArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(jArr);
            reverse(jArr);
        }
    }

    @NotNull
    public static final float[] sortedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final float[] sortedArrayDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        sortDescending(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final Set<Float> subtract(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull float[] fArr, @NotNull Function1<? super Float, Integer> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (float f6 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f6)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull float[] fArr, @NotNull Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f6 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f6)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Short> takeWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C toCollection(@NotNull float[] fArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (float f6 : fArr) {
            destination.add(Float.valueOf(f6));
        }
        return destination;
    }

    @NotNull
    public static final List<Long> toMutableList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Float> union(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
        while (Iterator2.hasNext()) {
            short s7 = sArr[Iterator2.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s7)) < 0) {
                s4 = s7;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
        while (Iterator2.hasNext()) {
            short s7 = sArr[Iterator2.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s7)) > 0) {
                s4 = s7;
            }
        }
        return Short.valueOf(s4);
    }

    public static final boolean none(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceRightIndexedOrNull(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceRightOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte bValueOf = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                bValueOf = Byte.valueOf(b10);
                z10 = true;
            }
        }
        if (z10) {
            return bValueOf;
        }
        return null;
    }

    public static final boolean any(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static Iterable<Double> asIterable(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(dArr);
    }

    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Double>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Double> iterator() {
                return ArrayIteratorsKt.iterator(dArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(iArr.length), 16));
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Integer> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d2 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d2 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d2));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Short> distinctBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s4)))) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> dropLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return take(iArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Double> filter(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> filterIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterIndexedTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d2 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d2)).booleanValue()) {
                destination.add(Double.valueOf(d2));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Double> filterNot(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    public static final long first(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            bk.g.addAll(arrayList, transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j10 : jArr) {
            bk.g.addAll(destination, transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    public static final <R> R foldRight(@NotNull double[] dArr, R r3, @NotNull Function2<? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Double.valueOf(dArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull double[] dArr, R r3, @NotNull Function3<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r3);
        }
        return r3;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(float[] fArr, float f6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (f6 == fArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Double.valueOf(dArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Double> intersect(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final long last(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[getLastIndex(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(float[] fArr, float f6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (f6 == fArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d2 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T maxOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            T t11 = tArr[Iterator2.nextInt()];
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOrThrow(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t10 = tArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (Iterator2.hasNext()) {
                T t11 = tArr[Iterator2.nextInt()];
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final short maxWithOrThrow(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
            while (Iterator2.hasNext()) {
                short s7 = sArr[Iterator2.nextInt()];
                if (comparator.compare(Short.valueOf(s4), Short.valueOf(s7)) < 0) {
                    s4 = s7;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T minOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (Iterator2.hasNext()) {
            T t11 = tArr[Iterator2.nextInt()];
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOrThrow(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t10 = tArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (Iterator2.hasNext()) {
                T t11 = tArr[Iterator2.nextInt()];
                if (t10.compareTo(t11) > 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final short minWithOrThrow(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
            while (Iterator2.hasNext()) {
                short s7 = sArr[Iterator2.nextInt()];
                if (comparator.compare(Short.valueOf(s4), Short.valueOf(s7)) > 0) {
                    s4 = s7;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull long[] jArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length != 0) {
            return jArr[random.nextInt(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double randomOrNull(@NotNull double[] dArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    public static final int reduceRight(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                iIntValue = operation.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceRightIndexed(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Long> reversed(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Long> mutableList = toMutableList(jArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    public static final int single(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr2[i10] = jArr[it.next().intValue()];
            i10++;
        }
        return jArr2;
    }

    @NotNull
    public static final double[] sortedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final double[] sortedArrayDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        sortDescending(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final Set<Double> subtract(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull double[] dArr, @NotNull Function1<? super Double, Integer> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (double d2 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d2)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull double[] dArr, @NotNull Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d2 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d2)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Integer> takeLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return drop(iArr, lastIndex + 1);
            }
        }
        return toList(iArr);
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C toCollection(@NotNull double[] dArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (double d2 : dArr) {
            destination.add(Double.valueOf(d2));
        }
        return destination;
    }

    @NotNull
    public static List<Integer> toList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(iArr);
        }
        return bk.d.listOf(Integer.valueOf(iArr[0]));
    }

    @NotNull
    public static final List<Float> toMutableList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f6 : fArr) {
            arrayList.add(Float.valueOf(f6));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Integer> toSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(iArr, new LinkedHashSet(p.mapCapacity(iArr.length)));
        }
        return v.setOf(Integer.valueOf(iArr[0]));
    }

    @NotNull
    public static final Set<Double> union(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull R[] other, @NotNull Function2<? super Long, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Byte> drop(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 >= 0) {
            return takeLast(bArr, kotlin.ranges.c.coerceAtLeast(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static List<Byte> dropLast(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 >= 0) {
            return take(bArr, kotlin.ranges.c.coerceAtLeast(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull short[] sArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Short, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (short s4 : sArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Short.valueOf(s4)));
            } else {
                buffer.append(String.valueOf((int) s4));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean none(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void sortDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(fArr);
            reverse(fArr);
        }
    }

    public static final boolean any(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static Iterable<Boolean> asIterable(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(zArr);
    }

    @NotNull
    public static final Sequence<Boolean> asSequence(@NotNull final boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Boolean>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Boolean> iterator() {
                return ArrayIteratorsKt.iterator(zArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @NotNull
    public static final List<Boolean> filter(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Boolean> filterNot(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                return Float.valueOf(f6);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull boolean[] zArr, R r3, @NotNull Function2<? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Boolean.valueOf(zArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull boolean[] zArr, R r3, @NotNull Function3<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r3);
        }
        return r3;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(double[] dArr, double d2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (d2 == dArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Boolean> intersect(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(double[] dArr, double d2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (d2 == dArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z10 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    public static final boolean none(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Pair<List<Short>, List<Short>> partition(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            } else {
                arrayList2.add(Short.valueOf(s4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean randomOrNull(@NotNull boolean[] zArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceIndexedOrNull(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            iIntValue = operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt])).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
        while (Iterator2.hasNext()) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[Iterator2.nextInt()])).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            byte b10 = bArr[lastIndex];
            bArr[lastIndex] = bArr[iNextInt];
            bArr[iNextInt] = b10;
        }
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short shValueOf = null;
        boolean z10 = false;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                if (z10) {
                    return null;
                }
                shValueOf = Short.valueOf(s4);
                z10 = true;
            }
        }
        if (z10) {
            return shValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final char[] sortedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final char[] sortedArrayDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        sortDescending(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final Set<Boolean> subtract(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Integer> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (boolean z10 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z10)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z10 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Integer> takeWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C toCollection(@NotNull boolean[] zArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (boolean z10 : zArr) {
            destination.add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @NotNull
    public static final List<Double> toMutableList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Boolean> union(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Integer> dropWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (int i10 : iArr) {
            if (z10) {
                arrayList.add(Integer.valueOf(i10));
            } else if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filterIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f6 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f6)).booleanValue()) {
                arrayList.add(Float.valueOf(f6));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    public static final float first(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
        }
        return null;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f6 : fArr) {
            bk.g.addAll(destination, transform.invoke(Float.valueOf(f6)));
        }
        return destination;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Byte.valueOf(b10));
        }
        return destination;
    }

    public static final float last(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[getLastIndex(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s4 = sArr[length];
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f6 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f6)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final boolean none(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final float random(@NotNull float[] fArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length != 0) {
            return fArr[random.nextInt(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int reduce(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length != 0) {
            int iIntValue = iArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
            while (Iterator2.hasNext()) {
                iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[Iterator2.nextInt()])).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int reduceIndexed(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length != 0) {
            int iIntValue = iArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                iIntValue = operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt])).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceRightIndexedOrNull(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceRightOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @NotNull
    public static final List<Float> reversed(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Float> mutableList = toMutableList(fArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static byte[] reversedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int lastIndex = getLastIndex(bArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            bArr2[lastIndex - iNextInt] = bArr[iNextInt];
        }
        return bArr2;
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr2[i10] = fArr[it.next().intValue()];
            i10++;
        }
        return fArr2;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull R[] other, @NotNull Function2<? super Float, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static Iterable<Character> asIterable(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(cArr);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Character> iterator() {
                return ArrayIteratorsKt.iterator(cArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(jArr.length), 16));
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Long> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @NotNull
    public static final List<Long> dropLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return take(jArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> filter(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterIndexedTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Character> filterNot(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            bk.g.addAll(arrayList, transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    public static final <R> R foldRight(@NotNull char[] cArr, R r3, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Character.valueOf(cArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull char[] cArr, R r3, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r3);
        }
        return r3;
    }

    public static final int indexOf(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10 == zArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Character.valueOf(cArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Character> intersect(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        bk.g.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final int lastIndexOf(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (z10 == zArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c10 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    public static final boolean none(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull char[] cArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    public static final long reduceRight(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                jLongValue = operation.invoke(Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceRightIndexed(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long single(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(dArr);
            reverse(dArr);
        }
    }

    @NotNull
    public static final Set<Character> subtract(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        bk.g.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull char[] cArr, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (char c10 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c10)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull char[] cArr, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c10 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Long> takeLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return drop(jArr, lastIndex + 1);
            }
        }
        return toList(jArr);
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull char[] cArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (char c10 : cArr) {
            destination.add(Character.valueOf(c10));
        }
        return destination;
    }

    @NotNull
    public static List<Long> toList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(jArr);
        }
        return bk.d.listOf(Long.valueOf(jArr[0]));
    }

    @NotNull
    public static final List<Boolean> toMutableList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Long> toSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(jArr, new LinkedHashSet(p.mapCapacity(jArr.length)));
        }
        return v.setOf(Long.valueOf(jArr[0]));
    }

    @NotNull
    public static final Set<Character> union(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        bk.g.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
        while (Iterator2.hasNext()) {
            byte b11 = bArr[Iterator2.nextInt()];
            if (b10 < b11) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
        while (Iterator2.hasNext()) {
            int i11 = iArr[Iterator2.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) < 0) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
        while (Iterator2.hasNext()) {
            byte b11 = bArr[Iterator2.nextInt()];
            if (b10 > b11) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer minWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
        while (Iterator2.hasNext()) {
            int i11 = iArr[Iterator2.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) > 0) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    public static final boolean none(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer numValueOf = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                numValueOf = Integer.valueOf(i10);
                z10 = true;
            }
        }
        if (z10) {
            return numValueOf;
        }
        return null;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Integer> distinctBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i10)))) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> filterIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d2 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    public static final double first(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d2 : dArr) {
            bk.g.addAll(destination, transform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    public static int indexOf(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final double last(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[getLastIndex(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int lastIndexOf(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (c10 == cArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            int i11 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return Integer.valueOf(i11);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final byte maxOrThrow(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
            while (Iterator2.hasNext()) {
                byte b11 = bArr[Iterator2.nextInt()];
                if (b10 < b11) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final int maxWithOrThrow(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
            while (Iterator2.hasNext()) {
                int i11 = iArr[Iterator2.nextInt()];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) < 0) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final byte minOrThrow(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(bArr)).iterator();
            while (Iterator2.hasNext()) {
                byte b11 = bArr[Iterator2.nextInt()];
                if (b10 > b11) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final int minWithOrThrow(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
            while (Iterator2.hasNext()) {
                int i11 = iArr[Iterator2.nextInt()];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) > 0) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    public static final double random(@NotNull double[] dArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length != 0) {
            return dArr[random.nextInt(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Double> reversed(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Double> mutableList = toMutableList(dArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final <T> List<T> slice(@NotNull T[] tArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr2[i10] = dArr[it.next().intValue()];
            i10++;
        }
        return dArr2;
    }

    @NotNull
    public static List<Byte> take(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= bArr.length) {
            return toList(bArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iA = 0;
        for (byte b10 : bArr) {
            iA = androidx.room.a.a(b10, arrayList, iA, 1);
            if (iA == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static List<Byte> takeLast(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = bArr.length;
        if (i10 >= length) {
            return toList(bArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iA = length - i10;
        while (iA < length) {
            iA = androidx.room.a.a(bArr[iA], arrayList, iA, 1);
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> takeWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull R[] other, @NotNull Function2<? super Double, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), other[i10]));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceIndexedOrNull(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            jLongValue = operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt])).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
        while (Iterator2.hasNext()) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[Iterator2.nextInt()])).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceRightIndexedOrNull(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceRightOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            short s4 = sArr[lastIndex];
            sArr[lastIndex] = sArr[iNextInt];
            sArr[iNextInt] = s4;
        }
    }

    public static final void sortDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(cArr);
            reverse(cArr);
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(fArr.length), 16));
        for (float f6 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f6));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Float> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(fArr.length), 16));
        for (float f6 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f6)), Float.valueOf(f6));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @NotNull
    public static final List<Float> dropLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return take(fArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Long> dropWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (long j10 : jArr) {
            if (z10) {
                arrayList.add(Long.valueOf(j10));
            } else if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f6 : fArr) {
            bk.g.addAll(arrayList, transform.invoke(Float.valueOf(f6)));
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Short>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s4));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull int[] iArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Integer, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final long reduce(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length != 0) {
            long jLongValue = jArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
            while (Iterator2.hasNext()) {
                jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[Iterator2.nextInt()])).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final long reduceIndexed(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length != 0) {
            long jLongValue = jArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                jLongValue = operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt])).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRight(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                fFloatValue = operation.invoke(Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRightIndexed(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float single(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long lValueOf = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                lValueOf = Long.valueOf(j10);
                z10 = true;
            }
        }
        if (z10) {
            return lValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Float> takeLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return drop(fArr, lastIndex + 1);
            }
        }
        return toList(fArr);
    }

    @NotNull
    public static List<Float> toList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(fArr);
        }
        return bk.d.listOf(Float.valueOf(fArr[0]));
    }

    @NotNull
    public static final Set<Float> toSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(fArr, new LinkedHashSet(p.mapCapacity(fArr.length)));
        }
        return v.setOf(Float.valueOf(fArr[0]));
    }

    @NotNull
    public static final List<Boolean> filterIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    public static final boolean first(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z10 : zArr) {
            bk.g.addAll(destination, transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    public static final boolean last(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[getLastIndex(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final Pair<List<Integer>, List<Integer>> partition(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            } else {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    public static final boolean random(@NotNull boolean[] zArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length != 0) {
            return zArr[random.nextInt(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Boolean> reversed(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Boolean> mutableList = toMutableList(zArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr2[i10] = zArr[it.next().intValue()];
            i10++;
        }
        return zArr2;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull R[] other, @NotNull Function2<? super Boolean, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s4)), valueTransform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
        while (Iterator2.hasNext()) {
            short s7 = sArr[Iterator2.nextInt()];
            if (s4 < s7) {
                s4 = s7;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
        while (Iterator2.hasNext()) {
            short s7 = sArr[Iterator2.nextInt()];
            if (s4 > s7) {
                s4 = s7;
            }
        }
        return Short.valueOf(s4);
    }

    public static void reverse(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(bArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            byte b10 = bArr[iNextInt];
            bArr[iNextInt] = bArr[lastIndex];
            bArr[lastIndex] = b10;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(tArr, dk.e.reverseOrder(), i10, i11);
    }

    @NotNull
    public static final List<Float> takeWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f6 : fArr) {
            if (!predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f6));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final short maxOrThrow(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
            while (Iterator2.hasNext()) {
                short s7 = sArr[Iterator2.nextInt()];
                if (s4 < s7) {
                    s4 = s7;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
        while (Iterator2.hasNext()) {
            long j11 = jArr[Iterator2.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final short minOrThrow(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(sArr)).iterator();
            while (Iterator2.hasNext()) {
                short s7 = sArr[Iterator2.nextInt()];
                if (s4 > s7) {
                    s4 = s7;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
        while (Iterator2.hasNext()) {
            long j11 = jArr[Iterator2.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceRightIndexedOrNull(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceRightOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float fValueOf = null;
        boolean z10 = false;
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                if (z10) {
                    return null;
                }
                fValueOf = Float.valueOf(f6);
                z10 = true;
            }
        }
        if (z10) {
            return fValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Byte> slice(@NotNull byte[] bArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(bArr, i10, i11);
        reverse(bArr, i10, i11);
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(dArr.length), 16));
        for (double d2 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d2));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Double> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Long> distinctBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j10)))) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return take(dArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> filterIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    public static char first(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            bk.g.addAll(arrayList, transform.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c10 : cArr) {
            bk.g.addAll(destination, transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    public static final char last(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[getLastIndex(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            float f6 = fArr[length];
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                return Float.valueOf(f6);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte maxByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            byte b11 = bArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final long maxWithOrThrow(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
            while (Iterator2.hasNext()) {
                long j11 = jArr[Iterator2.nextInt()];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte minByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            byte b11 = bArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final long minWithOrThrow(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
            while (Iterator2.hasNext()) {
                long j11 = jArr[Iterator2.nextInt()];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull char[] cArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length != 0) {
            return cArr[random.nextInt(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceIndexedOrNull(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            fFloatValue = operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt])).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[Iterator2.nextInt()])).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double reduceRight(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                dDoubleValue = operation.invoke(Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceRightIndexed(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Character> reversed(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Character> mutableList = toMutableList(cArr);
        bk.i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            int i10 = iArr[lastIndex];
            iArr[lastIndex] = iArr[iNextInt];
            iArr[iNextInt] = i10;
        }
    }

    public static final double single(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr2[i10] = cArr[it.next().intValue()];
            i10++;
        }
        return cArr2;
    }

    @NotNull
    public static final List<Double> takeLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return drop(dArr, lastIndex + 1);
            }
        }
        return toList(dArr);
    }

    @NotNull
    public static List<Double> toList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(dArr);
        }
        return bk.d.listOf(Double.valueOf(dArr[0]));
    }

    @NotNull
    public static final Set<Double> toSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(dArr, new LinkedHashSet(p.mapCapacity(dArr.length)));
        }
        return v.setOf(Double.valueOf(dArr[0]));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull R[] other, @NotNull Function2<? super Character, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> dropWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (float f6 : fArr) {
            if (z10) {
                arrayList.add(Float.valueOf(f6));
            } else if (!predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                arrayList.add(Float.valueOf(f6));
                z10 = true;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final float reduce(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[Iterator2.nextInt()])).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final float reduceIndexed(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                fFloatValue = operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt])).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(sArr, i10, i11);
        reverse(sArr, i10, i11);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @NotNull
    public static final List<Short> drop(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 >= 0) {
            return takeLast(sArr, kotlin.ranges.c.coerceAtLeast(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropLast(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 >= 0) {
            return take(sArr, kotlin.ranges.c.coerceAtLeast(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double dValueOf = null;
        boolean z10 = false;
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                if (z10) {
                    return null;
                }
                dValueOf = Double.valueOf(d2);
                z10 = true;
            }
        }
        if (z10) {
            return dValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Double> takeWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static final <T> T first(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull long[] jArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Long, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Long.valueOf(j10)));
            } else {
                buffer.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> T last(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            double d2 = dArr[length];
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
        while (Iterator2.hasNext()) {
            int i11 = iArr[Iterator2.nextInt()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static Integer minOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
        while (Iterator2.hasNext()) {
            int i11 = iArr[Iterator2.nextInt()];
            if (i10 > i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceRightIndexedOrNull(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceRightOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, 0, 0) : (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static void sortDescending(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(iArr, i10, i11);
        reverse(iArr, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i10], r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(zArr.length), 16));
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Boolean> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f6 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f6)), valueTransform.invoke(Float.valueOf(f6)));
        }
        return destination;
    }

    @NotNull
    public static final List<Boolean> dropLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return take(zArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            bk.g.addAll(arrayList, transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte maxByOrThrow(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b10;
            }
            R rInvoke = selector.invoke(Byte.valueOf(b10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                byte b11 = bArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static int maxOrThrow(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
            while (Iterator2.hasNext()) {
                int i11 = iArr[Iterator2.nextInt()];
                if (i10 < i11) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte minByOrThrow(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b10;
            }
            R rInvoke = selector.invoke(Byte.valueOf(b10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                byte b11 = bArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final int minOrThrow(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(iArr)).iterator();
            while (Iterator2.hasNext()) {
                int i11 = iArr[Iterator2.nextInt()];
                if (i10 > i11) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final Pair<List<Long>, List<Long>> partition(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            } else {
                arrayList2.add(Long.valueOf(j10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduceRight(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceRightIndexed(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean single(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> takeLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return drop(zArr, lastIndex + 1);
            }
        }
        return toList(zArr);
    }

    @NotNull
    public static List<Boolean> toList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(zArr);
        }
        return bk.d.listOf(Boolean.valueOf(zArr[0]));
    }

    @NotNull
    public static final Set<Boolean> toSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(zArr, new LinkedHashSet(p.mapCapacity(zArr.length)));
        }
        return v.setOf(Boolean.valueOf(zArr[0]));
    }

    public static final byte first(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return b10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f6 = fArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            float f10 = fArr[Iterator2.nextInt()];
            if (comparator.compare(Float.valueOf(f6), Float.valueOf(f10)) < 0) {
                f6 = f10;
            }
        }
        return Float.valueOf(f6);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f6 = fArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            float f10 = fArr[Iterator2.nextInt()];
            if (comparator.compare(Float.valueOf(f6), Float.valueOf(f10)) > 0) {
                f6 = f10;
            }
        }
        return Float.valueOf(f6);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceIndexedOrNull(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            dDoubleValue = operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt])).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[Iterator2.nextInt()])).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            long j10 = jArr[lastIndex];
            jArr[lastIndex] = jArr[iNextInt];
            jArr[iNextInt] = j10;
        }
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z11);
                z10 = true;
            }
        }
        if (z10) {
            return boolValueOf;
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static void sortDescending(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(jArr, i10, i11);
        reverse(jArr, i10, i11);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d2 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d2)), valueTransform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Float> distinctBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f6 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f6)))) {
                arrayList.add(Float.valueOf(f6));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (double d2 : dArr) {
            if (z10) {
                arrayList.add(Double.valueOf(d2));
            } else if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Integer>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s4 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s4));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Short.valueOf(s4));
        }
        return destination;
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            boolean z10 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final float maxWithOrThrow(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f6 = fArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                float f10 = fArr[Iterator2.nextInt()];
                if (comparator.compare(Float.valueOf(f6), Float.valueOf(f10)) < 0) {
                    f6 = f10;
                }
            }
            return f6;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final float minWithOrThrow(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f6 = fArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                float f10 = fArr[Iterator2.nextInt()];
                if (comparator.compare(Float.valueOf(f6), Float.valueOf(f10)) > 0) {
                    f6 = f10;
                }
            }
            return f6;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final double reduce(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (Iterator2.hasNext()) {
                dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[Iterator2.nextInt()])).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final double reduceIndexed(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                dDoubleValue = operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt])).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final short[] reversedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int lastIndex = getLastIndex(sArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            sArr2[lastIndex - iNextInt] = sArr[iNextInt];
        }
        return sArr2;
    }

    @NotNull
    public static final List<Boolean> takeWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final short first(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return s4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte last(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                    return b10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new short[0] : ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static void sortDescending(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(fArr, i10, i11);
        reverse(fArr, i10, i11);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Byte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(cArr.length), 16));
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @NotNull
    public static final List<Character> dropLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return take(cArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            bk.g.addAll(arrayList, transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
        while (Iterator2.hasNext()) {
            long j11 = jArr[Iterator2.nextInt()];
            if (j10 < j11) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
        while (Iterator2.hasNext()) {
            long j11 = jArr[Iterator2.nextInt()];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    public static final char reduceRight(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                cCharValue = operation.invoke(Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceRightIndexed(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static char single(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(c10);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Character> takeLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return drop(cArr, lastIndex + 1);
            }
        }
        return toList(cArr);
    }

    @NotNull
    public static List<Character> toList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(cArr);
        }
        return bk.d.listOf(Character.valueOf(cArr[0]));
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return w.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(cArr, new LinkedHashSet(p.mapCapacity(kotlin.ranges.c.coerceAtMost(cArr.length, 128))));
        }
        return v.setOf(Character.valueOf(cArr[0]));
    }

    public static final int first(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return i10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char c10 = cArr[length];
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final long maxOrThrow(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
            while (Iterator2.hasNext()) {
                long j11 = jArr[Iterator2.nextInt()];
                if (j10 < j11) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final long minOrThrow(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(jArr)).iterator();
            while (Iterator2.hasNext()) {
                long j11 = jArr[Iterator2.nextInt()];
                if (j10 > j11) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new int[0] : ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(dArr, i10, i11);
        reverse(dArr, i10, i11);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull float[] fArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Float, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f6 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Float.valueOf(f6)));
            } else {
                buffer.append(String.valueOf(f6));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceIndexedOrNull(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            zBooleanValue = operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt])).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (Iterator2.hasNext()) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[Iterator2.nextInt()])).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(fArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            float f6 = fArr[lastIndex];
            fArr[lastIndex] = fArr[iNextInt];
            fArr[iNextInt] = f6;
        }
    }

    @NotNull
    public static final List<Character> takeWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> dropWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (z10) {
                arrayList.add(Boolean.valueOf(z11));
            } else if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final long first(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final short last(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s4 = sArr[length];
                if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                    return s4;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            double d3 = dArr[Iterator2.nextInt()];
            if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) < 0) {
                d2 = d3;
            }
        }
        return Double.valueOf(d2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            double d3 = dArr[Iterator2.nextInt()];
            if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) > 0) {
                d2 = d3;
            }
        }
        return Double.valueOf(d2);
    }

    @NotNull
    public static final Pair<List<Float>, List<Float>> partition(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                arrayList.add(Float.valueOf(f6));
            } else {
                arrayList2.add(Float.valueOf(f6));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final boolean reduce(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (Iterator2.hasNext()) {
                zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[Iterator2.nextInt()])).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final boolean reduceIndexed(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                zBooleanValue = operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt])).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new long[0] : ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(cArr, i10, i11);
        reverse(cArr, i10, i11);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Short, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Double> distinctBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d2)))) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final double maxWithOrThrow(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (Iterator2.hasNext()) {
                double d3 = dArr[Iterator2.nextInt()];
                if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) < 0) {
                    d2 = d3;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final double minWithOrThrow(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (Iterator2.hasNext()) {
                double d3 = dArr[Iterator2.nextInt()];
                if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) > 0) {
                    d2 = d3;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    public static final <T> T single(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                return f6;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            fMax = Math.max(fMax, fArr[Iterator2.nextInt()]);
        }
        return Float.valueOf(fMax);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (Iterator2.hasNext()) {
            fMin = Math.min(fMin, fArr[Iterator2.nextInt()]);
        }
        return Float.valueOf(fMin);
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new float[0] : ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fMax = fArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                fMax = Math.max(fMax, fArr[Iterator2.nextInt()]);
            }
            return fMax;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fMin = fArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (Iterator2.hasNext()) {
                fMin = Math.min(fMin, fArr[Iterator2.nextInt()]);
            }
            return fMin;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> take(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= sArr.length) {
            return toList(sArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> drop(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 >= 0) {
            return takeLast(iArr, kotlin.ranges.c.coerceAtLeast(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> dropLast(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 >= 0) {
            return take(iArr, kotlin.ranges.c.coerceAtLeast(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final double first(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return d2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                    return i11;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (Iterator2.hasNext()) {
            int iNextInt = Iterator2.nextInt();
            cCharValue = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt])).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (Iterator2.hasNext()) {
            cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[Iterator2.nextInt()])).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(dArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            double d2 = dArr[lastIndex];
            dArr[lastIndex] = dArr[iNextInt];
            dArr[iNextInt] = d2;
        }
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new double[0] : ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final List<Short> takeLast(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = sArr.length;
        if (i10 >= length) {
            return toList(sArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Short.valueOf(sArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Integer, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<Character> dropWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (char c10 : cArr) {
            if (z10) {
                arrayList.add(Character.valueOf(c10));
            } else if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Long>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduce(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (Iterator2.hasNext()) {
                cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[Iterator2.nextInt()])).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduceIndexed(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (Iterator2.hasNext()) {
                int iNextInt = Iterator2.nextInt();
                cCharValue = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt])).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte single(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte bValueOf = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (!z10) {
                    bValueOf = Byte.valueOf(b10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
            return bValueOf.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return z10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull double[] dArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Double, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (double d2 : dArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Double.valueOf(d2)));
            } else {
                buffer.append(String.valueOf(d2));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean maxWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (Iterator2.hasNext()) {
            boolean z11 = zArr[Iterator2.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                z10 = z11;
            }
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean minWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (Iterator2.hasNext()) {
            boolean z11 = zArr[Iterator2.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                z10 = z11;
            }
        }
        return Boolean.valueOf(z10);
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <K> List<Boolean> distinctBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z10)))) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final boolean maxWithOrThrow(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z10 = zArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (Iterator2.hasNext()) {
                boolean z11 = zArr[Iterator2.nextInt()];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                    z10 = z11;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final boolean minWithOrThrow(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z10 = zArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (Iterator2.hasNext()) {
                boolean z11 = zArr[Iterator2.nextInt()];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                    z10 = z11;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final Pair<List<Double>, List<Double>> partition(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            } else {
                arrayList2.add(Double.valueOf(d2));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final char first(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return c10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                    return j10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            dMax = Math.max(dMax, dArr[Iterator2.nextInt()]);
        }
        return Double.valueOf(dMax);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (Iterator2.hasNext()) {
            dMin = Math.min(dMin, dArr[Iterator2.nextInt()]);
        }
        return Double.valueOf(dMin);
    }

    @NotNull
    public static final List<Float> slice(@NotNull float[] fArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new char[0] : ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Long, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(sArr.length), 16));
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s4)), valueTransform.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double dMax = dArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (Iterator2.hasNext()) {
                dMax = Math.max(dMax, dArr[Iterator2.nextInt()]);
            }
            return dMax;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double dMin = dArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (Iterator2.hasNext()) {
                dMin = Math.min(dMin, dArr[Iterator2.nextInt()]);
            }
            return dMin;
        }
        throw new NoSuchElementException();
    }

    public static void reverse(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(sArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            short s4 = sArr[iNextInt];
            sArr[iNextInt] = sArr[lastIndex];
            sArr[lastIndex] = s4;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(zArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            boolean z10 = zArr[lastIndex];
            zArr[lastIndex] = zArr[iNextInt];
            zArr[iNextInt] = z10;
        }
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Integer.valueOf(i10));
        }
        return destination;
    }

    @NotNull
    public static final int[] reversedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int lastIndex = getLastIndex(iArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            iArr2[lastIndex - iNextInt] = iArr[iNextInt];
        }
        return iArr2;
    }

    public static final short single(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short shValueOf = null;
        boolean z10 = false;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                if (!z10) {
                    shValueOf = Short.valueOf(s4);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(shValueOf, "null cannot be cast to non-null type kotlin.Short");
            return shValueOf.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                float f6 = fArr[length];
                if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                    return f6;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (Iterator2.hasNext()) {
            char c11 = cArr[Iterator2.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (Iterator2.hasNext()) {
            char c11 = cArr[Iterator2.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Float, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Character> distinctBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c10)))) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull boolean[] zArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (boolean z10 : zArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Boolean.valueOf(z10)));
            } else {
                buffer.append(String.valueOf(z10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (Iterator2.hasNext()) {
                char c11 = cArr[Iterator2.nextInt()];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (Iterator2.hasNext()) {
                char c11 = cArr[Iterator2.nextInt()];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (Iterator2.hasNext()) {
            char c11 = cArr[Iterator2.nextInt()];
            if (Intrinsics.compare((int) c10, (int) c11) < 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (Iterator2.hasNext()) {
            char c11 = cArr[Iterator2.nextInt()];
            if (Intrinsics.compare((int) c10, (int) c11) > 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final Pair<List<Boolean>, List<Boolean>> partition(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            } else {
                arrayList2.add(Boolean.valueOf(z10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(cArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            char c10 = cArr[lastIndex];
            cArr[lastIndex] = cArr[iNextInt];
            cArr[iNextInt] = c10;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Float>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f6 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f6));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Float.valueOf(f6));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (Iterator2.hasNext()) {
                char c11 = cArr[Iterator2.nextInt()];
                if (Intrinsics.compare((int) c10, (int) c11) < 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            ?? Iterator2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (Iterator2.hasNext()) {
                char c11 = cArr[Iterator2.nextInt()];
                if (Intrinsics.compare((int) c10, (int) c11) > 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    public static final double last(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d2 = dArr[length];
                if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                    return d2;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Double, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<Long> drop(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 >= 0) {
            return takeLast(jArr, kotlin.ranges.c.coerceAtLeast(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> dropLast(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 >= 0) {
            return take(jArr, kotlin.ranges.c.coerceAtLeast(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final int single(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer numValueOf = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (!z10) {
                    numValueOf = Integer.valueOf(i10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(numValueOf, "null cannot be cast to non-null type kotlin.Int");
            return numValueOf.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short maxByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R rInvoke = selector.invoke(Short.valueOf(s4));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            short s7 = sArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s7));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s4 = s7;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s4);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short minByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R rInvoke = selector.invoke(Short.valueOf(s4));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            short s7 = sArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s7));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s4 = s7;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s4);
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull char[] cArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Character, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (char c10 : cArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Character.valueOf(c10)));
            } else {
                buffer.append(c10);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean last(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                    return z10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Boolean, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(fArr.length), 16));
        for (float f6 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f6)), valueTransform.invoke(Float.valueOf(f6)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short maxByOrThrow(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s4;
            }
            R rInvoke = selector.invoke(Short.valueOf(s4));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                short s7 = sArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Short.valueOf(s7));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s4 = s7;
                    rInvoke = rInvoke2;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short minByOrThrow(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s4;
            }
            R rInvoke = selector.invoke(Short.valueOf(s4));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                short s7 = sArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Short.valueOf(s7));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s4 = s7;
                    rInvoke = rInvoke2;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final Pair<List<Character>, List<Character>> partition(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            } else {
                arrayList2.add(Character.valueOf(c10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static final List<Integer> take(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= iArr.length) {
            return toList(iArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (int i12 : iArr) {
            arrayList.add(Integer.valueOf(i12));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> takeLast(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = iArr.length;
        if (i10 >= length) {
            return toList(iArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Integer.valueOf(iArr[i11]));
        }
        return arrayList;
    }

    public static final long single(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long lValueOf = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (!z10) {
                    lValueOf = Long.valueOf(j10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(lValueOf, "null cannot be cast to non-null type kotlin.Long");
            return lValueOf.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final char last(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char c10 = cArr[length];
                if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                    return c10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Character, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d2)), valueTransform.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Double>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Long.valueOf(j10));
        }
        return destination;
    }

    @NotNull
    public static final long[] reversedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int lastIndex = getLastIndex(jArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            jArr2[lastIndex - iNextInt] = jArr[iNextInt];
        }
        return jArr2;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull byte[] bArr, @NotNull byte[] other, @NotNull Function2<? super Byte, ? super Byte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    public static final float single(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float fValueOf = null;
        boolean z10 = false;
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                if (!z10) {
                    fValueOf = Float.valueOf(f6);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(fValueOf, "null cannot be cast to non-null type kotlin.Float");
            return fValueOf.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Float> drop(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 >= 0) {
            return takeLast(fArr, kotlin.ranges.c.coerceAtLeast(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> dropLast(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 >= 0) {
            return take(fArr, kotlin.ranges.c.coerceAtLeast(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    public static void reverse(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(iArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            int i10 = iArr[iNextInt];
            iArr[iNextInt] = iArr[lastIndex];
            iArr[lastIndex] = i10;
            lastIndex--;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull short[] sArr, @NotNull short[] other, @NotNull Function2<? super Short, ? super Short, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull int[] iArr, @NotNull int[] other, @NotNull Function2<? super Integer, ? super Integer, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Boolean>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    public static final double single(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double dValueOf = null;
        boolean z10 = false;
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                if (!z10) {
                    dValueOf = Double.valueOf(d2);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(dValueOf, "null cannot be cast to non-null type kotlin.Double");
            return dValueOf.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull long[] jArr, @NotNull long[] other, @NotNull Function2<? super Long, ? super Long, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> take(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= jArr.length) {
            return toList(jArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f6 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f6));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Float.valueOf(f6));
        }
        return destination;
    }

    @NotNull
    public static final float[] reversedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            fArr2[lastIndex - iNextInt] = fArr[iNextInt];
        }
        return fArr2;
    }

    @NotNull
    public static final List<Long> takeLast(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = jArr.length;
        if (i10 >= length) {
            return toList(jArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Long.valueOf(jArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull float[] fArr, @NotNull float[] other, @NotNull Function2<? super Float, ? super Float, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    public static final boolean single(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (!z10) {
                    boolValueOf = Boolean.valueOf(z11);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
            return boolValueOf.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Double> drop(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 >= 0) {
            return takeLast(dArr, kotlin.ranges.c.coerceAtLeast(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> dropLast(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 >= 0) {
            return take(dArr, kotlin.ranges.c.coerceAtLeast(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull double[] dArr, @NotNull double[] other, @NotNull Function2<? super Double, ? super Double, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull boolean[] zArr, @NotNull boolean[] other, @NotNull Function2<? super Boolean, ? super Boolean, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer maxByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            int i11 = iArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer minByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            int i11 = iArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    public static final char single(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (!z10) {
                    chValueOf = Character.valueOf(c10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int maxByOrThrow(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i10;
            }
            R rInvoke = selector.invoke(Integer.valueOf(i10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                int i11 = iArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Integer.valueOf(i11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i10 = i11;
                    rInvoke = rInvoke2;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int minByOrThrow(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i10;
            }
            R rInvoke = selector.invoke(Integer.valueOf(i10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                int i11 = iArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Integer.valueOf(i11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i10 = i11;
                    rInvoke = rInvoke2;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull char[] cArr, @NotNull char[] other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static void reverse(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(jArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            long j10 = jArr[iNextInt];
            jArr[iNextInt] = jArr[lastIndex];
            jArr[lastIndex] = j10;
            lastIndex--;
        }
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Double.valueOf(d2));
        }
        return destination;
    }

    @NotNull
    public static final double[] reversedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            dArr2[lastIndex - iNextInt] = dArr[iNextInt];
        }
        return dArr2;
    }

    @NotNull
    public static final List<Boolean> drop(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 >= 0) {
            return takeLast(zArr, kotlin.ranges.c.coerceAtLeast(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> dropLast(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 >= 0) {
            return take(zArr, kotlin.ranges.c.coerceAtLeast(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> take(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= fArr.length) {
            return toList(fArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (float f6 : fArr) {
            arrayList.add(Float.valueOf(f6));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = bArr[i10];
            arrayList.add(TuplesKt.to(Byte.valueOf(b10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> takeLast(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = fArr.length;
        if (i10 >= length) {
            return toList(fArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Float.valueOf(fArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short s4 = sArr[i10];
            arrayList.add(TuplesKt.to(Short.valueOf(s4), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            arrayList.add(TuplesKt.to(Integer.valueOf(i11), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> drop(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 >= 0) {
            return takeLast(cArr, kotlin.ranges.c.coerceAtLeast(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Character> dropLast(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 >= 0) {
            return take(cArr, kotlin.ranges.c.coerceAtLeast(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @NotNull
    public static final boolean[] reversedArray(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            zArr2[lastIndex - iNextInt] = zArr[iNextInt];
        }
        return zArr2;
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long j10 = jArr[i10];
            arrayList.add(TuplesKt.to(Long.valueOf(j10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s4));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    public static final void reverse(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            float f6 = fArr[iNextInt];
            fArr[iNextInt] = fArr[lastIndex];
            fArr[lastIndex] = f6;
            lastIndex--;
        }
    }

    @NotNull
    public static final List<Double> take(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= dArr.length) {
            return toList(dArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long maxByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            long j11 = jArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                j10 = j11;
                rInvoke = rInvoke2;
            }
        }
        return Long.valueOf(j10);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long minByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            long j11 = jArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                j10 = j11;
                rInvoke = rInvoke2;
            }
        }
        return Long.valueOf(j10);
    }

    @NotNull
    public static final List<Double> takeLast(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = dArr.length;
        if (i10 >= length) {
            return toList(dArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Double.valueOf(dArr[i11]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long maxByOrThrow(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j10;
            }
            R rInvoke = selector.invoke(Long.valueOf(j10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                long j11 = jArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long minByOrThrow(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j10;
            }
            R rInvoke = selector.invoke(Long.valueOf(j10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                long j11 = jArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            float f6 = fArr[i10];
            arrayList.add(TuplesKt.to(Float.valueOf(f6), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            double d2 = dArr[i10];
            arrayList.add(TuplesKt.to(Double.valueOf(d2), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Character.valueOf(c10));
        }
        return destination;
    }

    @NotNull
    public static final char[] reversedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        IntIterator intIteratorG = n1.g(0, lastIndex);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            cArr2[lastIndex - iNextInt] = cArr[iNextInt];
        }
        return cArr2;
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            boolean z10 = zArr[i10];
            arrayList.add(TuplesKt.to(Boolean.valueOf(z10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            char c10 = cArr[i10];
            arrayList.add(TuplesKt.to(Character.valueOf(c10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> take(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= zArr.length) {
            return toList(zArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> takeLast(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = zArr.length;
        if (i10 >= length) {
            return toList(zArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(zArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final void reverse(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(dArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            double d2 = dArr[iNextInt];
            dArr[iNextInt] = dArr[lastIndex];
            dArr[lastIndex] = d2;
            lastIndex--;
        }
    }

    @NotNull
    public static <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(tArr[i10], r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f6 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f6));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Float.valueOf(f6)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float maxByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f6 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f6);
        }
        R rInvoke = selector.invoke(Float.valueOf(f6));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            float f10 = fArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f10));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f6 = f10;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f6);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float maxByOrThrow(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float f6 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f6;
            }
            R rInvoke = selector.invoke(Float.valueOf(f6));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                float f10 = fArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Float.valueOf(f10));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f6 = f10;
                    rInvoke = rInvoke2;
                }
            }
            return f6;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float minByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f6 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f6);
        }
        R rInvoke = selector.invoke(Float.valueOf(f6));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            float f10 = fArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f10));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f6 = f10;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f6);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float minByOrThrow(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float f6 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f6;
            }
            R rInvoke = selector.invoke(Float.valueOf(f6));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                float f10 = fArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Float.valueOf(f10));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f6 = f10;
                    rInvoke = rInvoke2;
                }
            }
            return f6;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> take(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= cArr.length) {
            return toList(cArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> takeLast(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = cArr.length;
        if (i10 >= length) {
            return toList(cArr);
        }
        if (i10 == 1) {
            return bk.d.listOf(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Character.valueOf(cArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    public static final void reverse(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            boolean z10 = zArr[iNextInt];
            zArr[iNextInt] = zArr[lastIndex];
            zArr[lastIndex] = z10;
            lastIndex--;
        }
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s4));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double maxByOrThrow(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d2;
            }
            R rInvoke = selector.invoke(Double.valueOf(d2));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                double d3 = dArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Double.valueOf(d3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d2 = d3;
                    rInvoke = rInvoke2;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double minByOrThrow(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d2;
            }
            R rInvoke = selector.invoke(Double.valueOf(d2));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                double d3 = dArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Double.valueOf(d3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d2 = d3;
                    rInvoke = rInvoke2;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double maxByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            double d3 = dArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                d2 = d3;
                rInvoke = rInvoke2;
            }
        }
        return Double.valueOf(d2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double minByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            double d3 = dArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                d2 = d3;
                rInvoke = rInvoke2;
            }
        }
        return Double.valueOf(d2);
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    public static final void reverse(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(cArr);
        IntIterator intIteratorG = n1.g(0, length);
        while (intIteratorG.hasNext()) {
            int iNextInt = intIteratorG.nextInt();
            char c10 = cArr[iNextInt];
            cArr[iNextInt] = cArr[lastIndex];
            cArr[lastIndex] = c10;
            lastIndex--;
        }
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i10]), r3));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Byte, Byte>> zip(@NotNull byte[] bArr, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Short, Short>> zip(@NotNull short[] sArr, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean maxByOrThrow(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            boolean z10 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z10;
            }
            R rInvoke = selector.invoke(Boolean.valueOf(z10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                boolean z11 = zArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean minByOrThrow(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            boolean z10 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z10;
            }
            R rInvoke = selector.invoke(Boolean.valueOf(z10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                boolean z11 = zArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final List<Pair<Integer, Integer>> zip(@NotNull int[] iArr, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            boolean z11 = zArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean minByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            boolean z11 = zArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void reverse(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, tArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            T t10 = tArr[i10];
            tArr[i10] = tArr[i13];
            tArr[i13] = t10;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final List<Pair<Long, Long>> zip(@NotNull long[] jArr, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, bArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i13];
            bArr[i13] = b10;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final List<Pair<Float, Float>> zip(@NotNull float[] fArr, @NotNull float[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, sArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            short s4 = sArr[i10];
            sArr[i10] = sArr[i13];
            sArr[i13] = s4;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f6 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f6));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Float.valueOf(f6)));
        }
        return destination;
    }

    @NotNull
    public static final List<Pair<Double, Double>> zip(@NotNull double[] dArr, @NotNull double[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, iArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            int i14 = iArr[i10];
            iArr[i10] = iArr[i13];
            iArr[i13] = i14;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final List<Pair<Boolean, Boolean>> zip(@NotNull boolean[] zArr, @NotNull boolean[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, jArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i13];
            jArr[i13] = j10;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull char[] cArr, @NotNull char[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, fArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            float f6 = fArr[i10];
            fArr[i10] = fArr[i13];
            fArr[i13] = f6;
            i13--;
            i10++;
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c10;
            }
            R rInvoke = selector.invoke(Character.valueOf(c10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                char c11 = cArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c10;
            }
            R rInvoke = selector.invoke(Character.valueOf(c10));
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                char c11 = cArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char c11 = cArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char c11 = cArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, dArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            double d2 = dArr[i10];
            dArr[i10] = dArr[i13];
            dArr[i13] = d2;
            i13--;
            i10++;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull boolean[] zArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, zArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i13];
            zArr[i13] = z10;
            i13--;
            i10++;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, cArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[i13];
            cArr[i13] = c10;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }
}
