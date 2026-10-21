package ck;

import bk.i;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.UArraySortingKt;
import kotlin.collections.unsigned.UArraysKt___UArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _UArrays.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10733:1\n3775#1:10734\n3783#1:10735\n3791#1:10736\n3799#1:10737\n3775#1:10738\n3783#1:10739\n3791#1:10740\n3799#1:10741\n3775#1:10742\n3783#1:10743\n3791#1:10744\n3799#1:10745\n3775#1:10795\n3783#1:10796\n3791#1:10797\n3799#1:10798\n3775#1:10799\n3783#1:10800\n3791#1:10801\n3799#1:10802\n3775#1:10803\n3783#1:10804\n3791#1:10805\n3799#1:10806\n3775#1:10863\n3783#1:10864\n3791#1:10865\n3799#1:10866\n3775#1:10867\n3783#1:10868\n3791#1:10869\n3799#1:10870\n3775#1:10871\n3783#1:10872\n3791#1:10873\n3799#1:10874\n3775#1:10875\n3783#1:10876\n3791#1:10877\n3799#1:10878\n3775#1:10879\n3783#1:10880\n3791#1:10881\n3799#1:10882\n3775#1:10883\n3783#1:10884\n3791#1:10885\n3799#1:10886\n3775#1:10887\n3783#1:10888\n3791#1:10889\n3799#1:10890\n3775#1:10891\n3783#1:10892\n3791#1:10893\n3799#1:10894\n3775#1:10895\n3783#1:10896\n3791#1:10897\n3799#1:10898\n3775#1:10899\n3783#1:10900\n3791#1:10901\n3799#1:10902\n3775#1:10903\n3783#1:10904\n3791#1:10905\n3799#1:10906\n3775#1:10907\n3783#1:10908\n3791#1:10909\n3799#1:10910\n3775#1:10911\n3783#1:10912\n3791#1:10913\n3799#1:10914\n3775#1:10915\n3783#1:10916\n3791#1:10917\n3799#1:10918\n3775#1:10919\n3783#1:10920\n3791#1:10921\n3799#1:10922\n3775#1:10923\n3783#1:10924\n3791#1:10925\n3799#1:10926\n3775#1:10927\n3783#1:10928\n3791#1:10929\n3799#1:10930\n3775#1:10931\n3783#1:10932\n3791#1:10933\n3799#1:10934\n3775#1:10935\n3783#1:10936\n3791#1:10937\n3799#1:10938\n3775#1:10939\n3783#1:10940\n3791#1:10941\n3799#1:10942\n3775#1:10943\n3783#1:10944\n3791#1:10945\n3799#1:10946\n3775#1:10947\n3783#1:10948\n3791#1:10949\n3799#1:10950\n3775#1:10951\n3783#1:10952\n3791#1:10953\n3799#1:10954\n3775#1:10955\n3783#1:10956\n3791#1:10957\n3799#1:10958\n3775#1:10959\n3783#1:10960\n3791#1:10961\n3799#1:10962\n3775#1:10963\n3783#1:10964\n3791#1:10965\n3799#1:10966\n3775#1:10967\n3783#1:10968\n3791#1:10969\n3799#1:10970\n3775#1:10971\n3783#1:10972\n3791#1:10973\n3799#1:10974\n3775#1:10975\n3783#1:10976\n3791#1:10977\n3799#1:10978\n3775#1:10979\n3783#1:10980\n3791#1:10981\n3799#1:10982\n3775#1:10983\n3783#1:10984\n3791#1:10985\n3799#1:10986\n3775#1:10987\n3783#1:10988\n3791#1:10989\n3799#1:10990\n3775#1:10991\n3783#1:10992\n3791#1:10993\n3799#1:10994\n3775#1:10995\n3783#1:10996\n3791#1:10997\n3799#1:10998\n3775#1:10999\n3783#1:11000\n3791#1:11001\n3799#1:11002\n3775#1:11003\n3783#1:11004\n3791#1:11005\n3799#1:11006\n3775#1:11007\n3783#1:11008\n3791#1:11009\n3799#1:11010\n3775#1:11011\n3783#1:11012\n3791#1:11013\n3799#1:11014\n1663#2,6:10746\n1675#2,6:10752\n1639#2,6:10758\n1651#2,6:10764\n1771#2,6:10770\n1783#2,6:10776\n1747#2,6:10782\n1759#2,6:10788\n1#3:10794\n372#4,7:10807\n372#4,7:10814\n372#4,7:10821\n372#4,7:10828\n372#4,7:10835\n372#4,7:10842\n372#4,7:10849\n372#4,7:10856\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n326#1:10734\n338#1:10735\n350#1:10736\n362#1:10737\n692#1:10738\n702#1:10739\n712#1:10740\n722#1:10741\n733#1:10742\n744#1:10743\n755#1:10744\n766#1:10745\n1718#1:10795\n1735#1:10796\n1752#1:10797\n1769#1:10798\n2546#1:10799\n2563#1:10800\n2580#1:10801\n2597#1:10802\n2913#1:10803\n2929#1:10804\n2945#1:10805\n2961#1:10806\n5573#1:10863\n5593#1:10864\n5613#1:10865\n5633#1:10866\n5654#1:10867\n5676#1:10868\n5698#1:10869\n5720#1:10870\n5833#1:10871\n5852#1:10872\n5871#1:10873\n5890#1:10874\n5912#1:10875\n5941#1:10876\n5970#1:10877\n5999#1:10878\n6024#1:10879\n6049#1:10880\n6074#1:10881\n6099#1:10882\n6129#1:10883\n6152#1:10884\n6175#1:10885\n6198#1:10886\n6221#1:10887\n6244#1:10888\n6267#1:10889\n6290#1:10890\n6311#1:10891\n6334#1:10892\n6357#1:10893\n6380#1:10894\n6403#1:10895\n6424#1:10896\n6445#1:10897\n6466#1:10898\n6487#1:10899\n6508#1:10900\n6529#1:10901\n6550#1:10902\n6569#1:10903\n6590#1:10904\n6611#1:10905\n6632#1:10906\n6655#1:10907\n6678#1:10908\n6701#1:10909\n6724#1:10910\n6745#1:10911\n6766#1:10912\n6787#1:10913\n6808#1:10914\n6825#1:10915\n6840#1:10916\n6855#1:10917\n6870#1:10918\n6889#1:10919\n6908#1:10920\n6927#1:10921\n6946#1:10922\n6961#1:10923\n6976#1:10924\n6991#1:10925\n7006#1:10926\n7025#1:10927\n7044#1:10928\n7063#1:10929\n7082#1:10930\n7104#1:10931\n7133#1:10932\n7162#1:10933\n7191#1:10934\n7216#1:10935\n7241#1:10936\n7266#1:10937\n7291#1:10938\n7321#1:10939\n7344#1:10940\n7367#1:10941\n7390#1:10942\n7413#1:10943\n7436#1:10944\n7459#1:10945\n7482#1:10946\n7503#1:10947\n7526#1:10948\n7549#1:10949\n7572#1:10950\n7595#1:10951\n7616#1:10952\n7637#1:10953\n7658#1:10954\n7679#1:10955\n7700#1:10956\n7721#1:10957\n7742#1:10958\n7761#1:10959\n7782#1:10960\n7803#1:10961\n7824#1:10962\n7847#1:10963\n7870#1:10964\n7893#1:10965\n7916#1:10966\n7937#1:10967\n7958#1:10968\n7979#1:10969\n8000#1:10970\n8017#1:10971\n8032#1:10972\n8047#1:10973\n8062#1:10974\n8081#1:10975\n8100#1:10976\n8119#1:10977\n8138#1:10978\n8153#1:10979\n8168#1:10980\n8183#1:10981\n8198#1:10982\n8416#1:10983\n8441#1:10984\n8466#1:10985\n8491#1:10986\n8516#1:10987\n8541#1:10988\n8566#1:10989\n8591#1:10990\n8615#1:10991\n8639#1:10992\n8663#1:10993\n8687#1:10994\n8712#1:10995\n8737#1:10996\n8762#1:10997\n8787#1:10998\n8809#1:10999\n8834#1:11000\n8859#1:11001\n8884#1:11002\n8909#1:11003\n8935#1:11004\n8961#1:11005\n8987#1:11006\n9012#1:11007\n9037#1:11008\n9062#1:11009\n9087#1:11010\n9113#1:11011\n9138#1:11012\n9163#1:11013\n9188#1:11014\n816#1:10746,6\n826#1:10752,6\n836#1:10758,6\n846#1:10764,6\n856#1:10770,6\n866#1:10776,6\n876#1:10782,6\n886#1:10788,6\n4791#1:10807,7\n4811#1:10814,7\n4831#1:10821,7\n4851#1:10828,7\n4872#1:10835,7\n4893#1:10842,7\n4914#1:10849,7\n4935#1:10856,7\n*E\n"})
public class a extends UArraysKt___UArraysJvmKt {

    /* JADX INFO: renamed from: ck.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: _UArrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/UInt;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C0113a extends Lambda implements Function0<Iterator<? extends UInt>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int[] f25446p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0113a(int[] iArr) {
            super(0);
            this.f25446p0 = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends UInt> invoke() {
            return UIntArray.m5587iteratorimpl(this.f25446p0);
        }
    }

    /* JADX INFO: compiled from: _UArrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/ULong;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<Iterator<? extends ULong>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long[] f25447p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long[] jArr) {
            super(0);
            this.f25447p0 = jArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends ULong> invoke() {
            return ULongArray.m5612iteratorimpl(this.f25447p0);
        }
    }

    /* JADX INFO: compiled from: _UArrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/UByte;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends Lambda implements Function0<Iterator<? extends UByte>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f25448p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr) {
            super(0);
            this.f25448p0 = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends UByte> invoke() {
            return UByteArray.m5562iteratorimpl(this.f25448p0);
        }
    }

    /* JADX INFO: compiled from: _UArrays.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/UShort;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends Lambda implements Function0<Iterator<? extends UShort>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ short[] f25449p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(short[] sArr) {
            super(0);
            this.f25449p0 = sArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends UShort> invoke() {
            return UShortArray.m5637iteratorimpl(this.f25449p0);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m4656contentEqualsFGO6Aew(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m4657contentEqualsKJPZfPQ(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m4658contentEqualskV0jMPg(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m4659contentEqualslec5QzE(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m4660contentHashCode2csIQuQ(@Nullable byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m4661contentHashCodeXUkPCBk(@Nullable int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m4662contentHashCoded6D3K8(@Nullable short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m4663contentHashCodeuLth9ew(@Nullable long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m4664contentToString2csIQuQ(@Nullable byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UByteArray.m5551boximpl(bArr), ", ", Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m4665contentToStringXUkPCBk(@Nullable int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UIntArray.m5576boximpl(iArr), ", ", Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m4666contentToStringd6D3K8(@Nullable short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UShortArray.m5626boximpl(sArr), ", ", Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m4667contentToStringuLth9ew(@Nullable long[] jArr) {
        String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(ULongArray.m5601boximpl(jArr), ", ", Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4668dropPpDY95g(@NotNull byte[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m4828takeLastPpDY95g(drop, kotlin.ranges.c.coerceAtLeast(UByteArray.m5559getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4669dropnggk6HY(@NotNull short[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m4829takeLastnggk6HY(drop, kotlin.ranges.c.coerceAtLeast(UShortArray.m5634getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4670dropqFRl0hI(@NotNull int[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m4830takeLastqFRl0hI(drop, kotlin.ranges.c.coerceAtLeast(UIntArray.m5584getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4671dropr7IrZao(@NotNull long[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m4831takeLastr7IrZao(drop, kotlin.ranges.c.coerceAtLeast(ULongArray.m5609getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4672dropLastPpDY95g(@NotNull byte[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m4824takePpDY95g(dropLast, kotlin.ranges.c.coerceAtLeast(UByteArray.m5559getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4673dropLastnggk6HY(@NotNull short[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m4825takenggk6HY(dropLast, kotlin.ranges.c.coerceAtLeast(UShortArray.m5634getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4674dropLastqFRl0hI(@NotNull int[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m4826takeqFRl0hI(dropLast, kotlin.ranges.c.coerceAtLeast(UIntArray.m5584getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4675dropLastr7IrZao(@NotNull long[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m4827taker7IrZao(dropLast, kotlin.ranges.c.coerceAtLeast(ULongArray.m5609getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m4676fill2fe2U9s(@NotNull int[] fill, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, i10, i11, i12);
    }

    /* JADX INFO: renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m4677fill2fe2U9s$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = UIntArray.m5584getSizeimpl(iArr);
        }
        m4676fill2fe2U9s(iArr, i10, i11, i12);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m4678fillEtDCXyQ(@NotNull short[] fill, short s4, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, s4, i10, i11);
    }

    /* JADX INFO: renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m4679fillEtDCXyQ$default(short[] sArr, short s4, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = UShortArray.m5634getSizeimpl(sArr);
        }
        m4678fillEtDCXyQ(sArr, s4, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m4680fillK6DWlUc(@NotNull long[] fill, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, j10, i10, i11);
    }

    /* JADX INFO: renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m4681fillK6DWlUc$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = ULongArray.m5609getSizeimpl(jArr);
        }
        m4680fillK6DWlUc(jArr, j10, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m4682fillWpHrYlw(@NotNull byte[] fill, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, b10, i10, i11);
    }

    /* JADX INFO: renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m4683fillWpHrYlw$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = UByteArray.m5559getSizeimpl(bArr);
        }
        m4682fillWpHrYlw(bArr, b10, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4684firstOrNullajY9A(@NotNull int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UIntArray.m5586isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4685firstOrNullGBYM_sE(@NotNull byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UByteArray.m5561isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4686firstOrNullQwZRm1k(@NotNull long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (ULongArray.m5611isEmptyimpl(firstOrNull)) {
            return null;
        }
        return ULong.m5594boximpl(ULongArray.m5608getsVKNKU(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4687firstOrNullrL5Bavg(@NotNull short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UShortArray.m5636isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(firstOrNull, 0));
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final IntRange m4688getIndicesajY9A(@NotNull int[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final IntRange m4690getIndicesGBYM_sE(@NotNull byte[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final IntRange m4692getIndicesQwZRm1k(@NotNull long[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final IntRange m4694getIndicesrL5Bavg(@NotNull short[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    /* JADX INFO: renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m4696getLastIndexajY9A(@NotNull int[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    /* JADX INFO: renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m4698getLastIndexGBYM_sE(@NotNull byte[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    /* JADX INFO: renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m4700getLastIndexQwZRm1k(@NotNull long[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    /* JADX INFO: renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m4702getLastIndexrL5Bavg(@NotNull short[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final UByte m4704getOrNullPpDY95g(@NotNull byte[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(getOrNull, i10));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final UShort m4705getOrNullnggk6HY(@NotNull short[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(getOrNull, i10));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final UInt m4706getOrNullqFRl0hI(@NotNull int[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(getOrNull, i10));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final ULong m4707getOrNullr7IrZao(@NotNull long[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return ULong.m5594boximpl(ULongArray.m5608getsVKNKU(getOrNull, i10));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4708lastOrNullajY9A(@NotNull int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UIntArray.m5586isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(lastOrNull, UIntArray.m5584getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4709lastOrNullGBYM_sE(@NotNull byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UByteArray.m5561isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(lastOrNull, UByteArray.m5559getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4710lastOrNullQwZRm1k(@NotNull long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (ULongArray.m5611isEmptyimpl(lastOrNull)) {
            return null;
        }
        return ULong.m5594boximpl(ULongArray.m5608getsVKNKU(lastOrNull, ULongArray.m5609getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4711lastOrNullrL5Bavg(@NotNull short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UShortArray.m5636isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(lastOrNull, UShortArray.m5634getSizeimpl(lastOrNull) - 1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4712maxOrNullajY9A(@NotNull int[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UIntArray.m5586isEmptyimpl(maxOrNull)) {
            return null;
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(maxOrNull, it.nextInt());
            if (Integer.compare(iM5583getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM5583getpVg5ArA2) < 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return UInt.m5569boximpl(iM5583getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4713maxOrNullGBYM_sE(@NotNull byte[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UByteArray.m5561isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(maxOrNull, it.nextInt());
            if (Intrinsics.compare(bM5558getw2LRezQ & 255, bM5558getw2LRezQ2 & 255) < 0) {
                bM5558getw2LRezQ = bM5558getw2LRezQ2;
            }
        }
        return UByte.m5544boximpl(bM5558getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4714maxOrNullQwZRm1k(@NotNull long[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (ULongArray.m5611isEmptyimpl(maxOrNull)) {
            return null;
        }
        long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(maxOrNull, it.nextInt());
            if (Long.compare(jM5608getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM5608getsVKNKU2) < 0) {
                jM5608getsVKNKU = jM5608getsVKNKU2;
            }
        }
        return ULong.m5594boximpl(jM5608getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4715maxOrNullrL5Bavg(@NotNull short[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UShortArray.m5636isEmptyimpl(maxOrNull)) {
            return null;
        }
        short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(maxOrNull, it.nextInt());
            if (Intrinsics.compare(sM5633getMh2AYeg & UShort.MAX_VALUE, 65535 & sM5633getMh2AYeg2) < 0) {
                sM5633getMh2AYeg = sM5633getMh2AYeg2;
            }
        }
        return UShort.m5619boximpl(sM5633getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m4717maxOrThrowU(@NotNull int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UIntArray.m5586isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(max, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(max, it.nextInt());
            if (Integer.compare(iM5583getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM5583getpVg5ArA2) < 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return iM5583getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m4720maxWithOrNullXMRcp5o(@NotNull byte[] maxWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m5561isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(maxWithOrNull, it.nextInt());
            if (comparator.compare(UByte.m5544boximpl(bM5558getw2LRezQ), UByte.m5544boximpl(bM5558getw2LRezQ2)) < 0) {
                bM5558getw2LRezQ = bM5558getw2LRezQ2;
            }
        }
        return UByte.m5544boximpl(bM5558getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m4721maxWithOrNullYmdZ_VM(@NotNull int[] maxWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m5586isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(maxWithOrNull, it.nextInt());
            if (comparator.compare(UInt.m5569boximpl(iM5583getpVg5ArA), UInt.m5569boximpl(iM5583getpVg5ArA2)) < 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return UInt.m5569boximpl(iM5583getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m4722maxWithOrNulleOHTfZs(@NotNull short[] maxWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m5636isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(maxWithOrNull, it.nextInt());
            if (comparator.compare(UShort.m5619boximpl(sM5633getMh2AYeg), UShort.m5619boximpl(sM5633getMh2AYeg2)) < 0) {
                sM5633getMh2AYeg = sM5633getMh2AYeg2;
            }
        }
        return UShort.m5619boximpl(sM5633getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m4723maxWithOrNullzrEWJaI(@NotNull long[] maxWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m5611isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(maxWithOrNull, it.nextInt());
            if (comparator.compare(ULong.m5594boximpl(jM5608getsVKNKU), ULong.m5594boximpl(jM5608getsVKNKU2)) < 0) {
                jM5608getsVKNKU = jM5608getsVKNKU2;
            }
        }
        return ULong.m5594boximpl(jM5608getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m4725maxWithOrThrowU(@NotNull int[] maxWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m5586isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(maxWith, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(maxWith, it.nextInt());
            if (comparator.compare(UInt.m5569boximpl(iM5583getpVg5ArA), UInt.m5569boximpl(iM5583getpVg5ArA2)) < 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return iM5583getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4728minOrNullajY9A(@NotNull int[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UIntArray.m5586isEmptyimpl(minOrNull)) {
            return null;
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(minOrNull, it.nextInt());
            if (Integer.compare(iM5583getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM5583getpVg5ArA2) > 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return UInt.m5569boximpl(iM5583getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4729minOrNullGBYM_sE(@NotNull byte[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UByteArray.m5561isEmptyimpl(minOrNull)) {
            return null;
        }
        byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(minOrNull, it.nextInt());
            if (Intrinsics.compare(bM5558getw2LRezQ & 255, bM5558getw2LRezQ2 & 255) > 0) {
                bM5558getw2LRezQ = bM5558getw2LRezQ2;
            }
        }
        return UByte.m5544boximpl(bM5558getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4730minOrNullQwZRm1k(@NotNull long[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (ULongArray.m5611isEmptyimpl(minOrNull)) {
            return null;
        }
        long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(minOrNull, it.nextInt());
            if (Long.compare(jM5608getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM5608getsVKNKU2) > 0) {
                jM5608getsVKNKU = jM5608getsVKNKU2;
            }
        }
        return ULong.m5594boximpl(jM5608getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4731minOrNullrL5Bavg(@NotNull short[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UShortArray.m5636isEmptyimpl(minOrNull)) {
            return null;
        }
        short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(minOrNull, it.nextInt());
            if (Intrinsics.compare(sM5633getMh2AYeg & UShort.MAX_VALUE, 65535 & sM5633getMh2AYeg2) > 0) {
                sM5633getMh2AYeg = sM5633getMh2AYeg2;
            }
        }
        return UShort.m5619boximpl(sM5633getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m4733minOrThrowU(@NotNull int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UIntArray.m5586isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(min, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(min, it.nextInt());
            if (Integer.compare(iM5583getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM5583getpVg5ArA2) > 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return iM5583getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m4736minWithOrNullXMRcp5o(@NotNull byte[] minWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m5561isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(minWithOrNull, it.nextInt());
            if (comparator.compare(UByte.m5544boximpl(bM5558getw2LRezQ), UByte.m5544boximpl(bM5558getw2LRezQ2)) > 0) {
                bM5558getw2LRezQ = bM5558getw2LRezQ2;
            }
        }
        return UByte.m5544boximpl(bM5558getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m4737minWithOrNullYmdZ_VM(@NotNull int[] minWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m5586isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(minWithOrNull, it.nextInt());
            if (comparator.compare(UInt.m5569boximpl(iM5583getpVg5ArA), UInt.m5569boximpl(iM5583getpVg5ArA2)) > 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return UInt.m5569boximpl(iM5583getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m4738minWithOrNulleOHTfZs(@NotNull short[] minWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m5636isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(minWithOrNull, it.nextInt());
            if (comparator.compare(UShort.m5619boximpl(sM5633getMh2AYeg), UShort.m5619boximpl(sM5633getMh2AYeg2)) > 0) {
                sM5633getMh2AYeg = sM5633getMh2AYeg2;
            }
        }
        return UShort.m5619boximpl(sM5633getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m4739minWithOrNullzrEWJaI(@NotNull long[] minWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m5611isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(minWithOrNull, it.nextInt());
            if (comparator.compare(ULong.m5594boximpl(jM5608getsVKNKU), ULong.m5594boximpl(jM5608getsVKNKU2)) > 0) {
                jM5608getsVKNKU = jM5608getsVKNKU2;
            }
        }
        return ULong.m5594boximpl(jM5608getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m4741minWithOrThrowU(@NotNull int[] minWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m5586isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(minWith, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
        while (it.hasNext()) {
            int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(minWith, it.nextInt());
            if (comparator.compare(UInt.m5569boximpl(iM5583getpVg5ArA), UInt.m5569boximpl(iM5583getpVg5ArA2)) > 0) {
                iM5583getpVg5ArA = iM5583getpVg5ArA2;
            }
        }
        return iM5583getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m4744plusCFIt9YE(@NotNull int[] plus, @NotNull Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM5584getSizeimpl = UIntArray.m5584getSizeimpl(plus);
        int[] iArrCopyOf = Arrays.copyOf(plus, elements.size() + UIntArray.m5584getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        Iterator<UInt> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iM5584getSizeimpl] = it.next().getF79399p0();
            iM5584getSizeimpl++;
        }
        return UIntArray.m5578constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m4745pluskzHmqpY(@NotNull long[] plus, @NotNull Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM5609getSizeimpl = ULongArray.m5609getSizeimpl(plus);
        long[] jArrCopyOf = Arrays.copyOf(plus, elements.size() + ULongArray.m5609getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        Iterator<ULong> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iM5609getSizeimpl] = it.next().getF79403p0();
            iM5609getSizeimpl++;
        }
        return ULongArray.m5603constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m4746plusojwP5H8(@NotNull short[] plus, @NotNull Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM5634getSizeimpl = UShortArray.m5634getSizeimpl(plus);
        short[] sArrCopyOf = Arrays.copyOf(plus, elements.size() + UShortArray.m5634getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        Iterator<UShort> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iM5634getSizeimpl] = it.next().getF79407p0();
            iM5634getSizeimpl++;
        }
        return UShortArray.m5628constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m4747plusxo_DsdI(@NotNull byte[] plus, @NotNull Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM5559getSizeimpl = UByteArray.m5559getSizeimpl(plus);
        byte[] bArrCopyOf = Arrays.copyOf(plus, elements.size() + UByteArray.m5559getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        Iterator<UByte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iM5559getSizeimpl] = it.next().getF79395p0();
            iM5559getSizeimpl++;
        }
        return UByteArray.m5553constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m4748random2D5oskM(@NotNull int[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UIntArray.m5586isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.m5583getpVg5ArA(random, random2.nextInt(UIntArray.m5584getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m4749randomJzugnMA(@NotNull long[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (ULongArray.m5611isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.m5608getsVKNKU(random, random2.nextInt(ULongArray.m5609getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m4750randomoSF2wD8(@NotNull byte[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UByteArray.m5561isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.m5558getw2LRezQ(random, random2.nextInt(UByteArray.m5559getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m4751randoms5X_as8(@NotNull short[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UShortArray.m5636isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.m5633getMh2AYeg(random, random2.nextInt(UShortArray.m5634getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final UInt m4752randomOrNull2D5oskM(@NotNull int[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UIntArray.m5586isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(randomOrNull, random.nextInt(UIntArray.m5584getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final ULong m4753randomOrNullJzugnMA(@NotNull long[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (ULongArray.m5611isEmptyimpl(randomOrNull)) {
            return null;
        }
        return ULong.m5594boximpl(ULongArray.m5608getsVKNKU(randomOrNull, random.nextInt(ULongArray.m5609getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final UByte m4754randomOrNulloSF2wD8(@NotNull byte[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UByteArray.m5561isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(randomOrNull, random.nextInt(UByteArray.m5559getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final UShort m4755randomOrNulls5X_as8(@NotNull short[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UShortArray.m5636isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(randomOrNull, random.nextInt(UShortArray.m5634getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<UInt> m4756reversedajY9A(@NotNull int[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UIntArray.m5586isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UInt> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UIntArray.m5576boximpl(reversed));
        i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m4757reversedGBYM_sE(@NotNull byte[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UByteArray.m5561isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UByte> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UByteArray.m5551boximpl(reversed));
        i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m4758reversedQwZRm1k(@NotNull long[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (ULongArray.m5611isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<ULong> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ULongArray.m5601boximpl(reversed));
        i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m4759reversedrL5Bavg(@NotNull short[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UShortArray.m5636isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UShort> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UShortArray.m5626boximpl(reversed));
        i.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m4760shuffleajY9A(@NotNull int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m4761shuffle2D5oskM(shuffle, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m4761shuffle2D5oskM(@NotNull int[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(shuffle, lastIndex);
            UIntArray.m5588setVXSXFK8(shuffle, lastIndex, UIntArray.m5583getpVg5ArA(shuffle, iNextInt));
            UIntArray.m5588setVXSXFK8(shuffle, iNextInt, iM5583getpVg5ArA);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m4762shuffleGBYM_sE(@NotNull byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m4765shuffleoSF2wD8(shuffle, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m4763shuffleJzugnMA(@NotNull long[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(shuffle, lastIndex);
            ULongArray.m5613setk8EXiF4(shuffle, lastIndex, ULongArray.m5608getsVKNKU(shuffle, iNextInt));
            ULongArray.m5613setk8EXiF4(shuffle, iNextInt, jM5608getsVKNKU);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m4764shuffleQwZRm1k(@NotNull long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m4763shuffleJzugnMA(shuffle, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m4765shuffleoSF2wD8(@NotNull byte[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(shuffle, lastIndex);
            UByteArray.m5563setVurrAj0(shuffle, lastIndex, UByteArray.m5558getw2LRezQ(shuffle, iNextInt));
            UByteArray.m5563setVurrAj0(shuffle, iNextInt, bM5558getw2LRezQ);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m4766shufflerL5Bavg(@NotNull short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m4767shuffles5X_as8(shuffle, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m4767shuffles5X_as8(@NotNull short[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(shuffle, lastIndex);
            UShortArray.m5638set01HTLdE(shuffle, lastIndex, UShortArray.m5633getMh2AYeg(shuffle, iNextInt));
            UShortArray.m5638set01HTLdE(shuffle, iNextInt, sM5633getMh2AYeg);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4768singleOrNullajY9A(@NotNull int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UIntArray.m5584getSizeimpl(singleOrNull) == 1) {
            return UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4769singleOrNullGBYM_sE(@NotNull byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UByteArray.m5559getSizeimpl(singleOrNull) == 1) {
            return UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4770singleOrNullQwZRm1k(@NotNull long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (ULongArray.m5609getSizeimpl(singleOrNull) == 1) {
            return ULong.m5594boximpl(ULongArray.m5608getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4771singleOrNullrL5Bavg(@NotNull short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UShortArray.m5634getSizeimpl(singleOrNull) == 1) {
            return UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<ULong> m4772sliceF7u83W8(@NotNull long[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(ULong.m5594boximpl(ULongArray.m5608getsVKNKU(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<UInt> m4773sliceHwE9HBo(@NotNull int[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<UShort> m4774sliceJGPC0M(@NotNull short[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<UByte> m4775sliceJQknh5Q(@NotNull byte[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<UShort> m4776sliceQ6IL4kU(@NotNull short[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m5672asListrL5Bavg(UShortArray.m5628constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<ULong> m4777sliceZRhS8yI(@NotNull long[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m5671asListQwZRm1k(ULongArray.m5603constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<UByte> m4778slicec0bezYM(@NotNull byte[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m5670asListGBYM_sE(UByteArray.m5553constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<UInt> m4779slicetAntMlw(@NotNull int[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m5669asListajY9A(UIntArray.m5578constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m4780sliceArrayCFIt9YE(@NotNull int[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m5578constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m4781sliceArrayQ6IL4kU(@NotNull short[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m5628constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m4782sliceArrayZRhS8yI(@NotNull long[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m5603constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m4783sliceArrayc0bezYM(@NotNull byte[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m5553constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m4784sliceArraykzHmqpY(@NotNull long[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m5603constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m4785sliceArrayojwP5H8(@NotNull short[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m5628constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m4786sliceArraytAntMlw(@NotNull int[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m5578constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m4787sliceArrayxo_DsdI(@NotNull byte[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m5553constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m4788sortajY9A(@NotNull int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UIntArray.m5584getSizeimpl(sort) > 1) {
            UArraySortingKt.m5667sortArrayoBK06Vg(sort, 0, UIntArray.m5584getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m4789sortnroSd4(@NotNull long[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, ULongArray.m5609getSizeimpl(sort));
        UArraySortingKt.m5664sortArraynroSd4(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m4790sortnroSd4$default(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = ULongArray.m5609getSizeimpl(jArr);
        }
        m4789sortnroSd4(jArr, i10, i11);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m4791sort4UcCI2c(@NotNull byte[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, UByteArray.m5559getSizeimpl(sort));
        UArraySortingKt.m5665sortArray4UcCI2c(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m4792sort4UcCI2c$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = UByteArray.m5559getSizeimpl(bArr);
        }
        m4791sort4UcCI2c(bArr, i10, i11);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m4793sortAa5vz7o(@NotNull short[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, UShortArray.m5634getSizeimpl(sort));
        UArraySortingKt.m5666sortArrayAa5vz7o(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m4794sortAa5vz7o$default(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = UShortArray.m5634getSizeimpl(sArr);
        }
        m4793sortAa5vz7o(sArr, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m4795sortGBYM_sE(@NotNull byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UByteArray.m5559getSizeimpl(sort) > 1) {
            UArraySortingKt.m5665sortArray4UcCI2c(sort, 0, UByteArray.m5559getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m4796sortQwZRm1k(@NotNull long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (ULongArray.m5609getSizeimpl(sort) > 1) {
            UArraySortingKt.m5664sortArraynroSd4(sort, 0, ULongArray.m5609getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m4797sortoBK06Vg(@NotNull int[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, UIntArray.m5584getSizeimpl(sort));
        UArraySortingKt.m5667sortArrayoBK06Vg(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m4798sortoBK06Vg$default(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = UIntArray.m5584getSizeimpl(iArr);
        }
        m4797sortoBK06Vg(iArr, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m4799sortrL5Bavg(@NotNull short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UShortArray.m5634getSizeimpl(sort) > 1) {
            UArraySortingKt.m5666sortArrayAa5vz7o(sort, 0, UShortArray.m5634getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m4800sortDescendingajY9A(@NotNull int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UIntArray.m5584getSizeimpl(sortDescending) > 1) {
            m4788sortajY9A(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m4801sortDescendingnroSd4(@NotNull long[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m4789sortnroSd4(sortDescending, i10, i11);
        ArraysKt___ArraysKt.reverse(sortDescending, i10, i11);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m4802sortDescending4UcCI2c(@NotNull byte[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m4791sort4UcCI2c(sortDescending, i10, i11);
        ArraysKt___ArraysKt.reverse(sortDescending, i10, i11);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m4803sortDescendingAa5vz7o(@NotNull short[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m4793sortAa5vz7o(sortDescending, i10, i11);
        ArraysKt___ArraysKt.reverse(sortDescending, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m4804sortDescendingGBYM_sE(@NotNull byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UByteArray.m5559getSizeimpl(sortDescending) > 1) {
            m4795sortGBYM_sE(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m4805sortDescendingQwZRm1k(@NotNull long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (ULongArray.m5609getSizeimpl(sortDescending) > 1) {
            m4796sortQwZRm1k(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m4806sortDescendingoBK06Vg(@NotNull int[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m4797sortoBK06Vg(sortDescending, i10, i11);
        ArraysKt___ArraysKt.reverse(sortDescending, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m4807sortDescendingrL5Bavg(@NotNull short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UShortArray.m5634getSizeimpl(sortDescending) > 1) {
            m4799sortrL5Bavg(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<UInt> m4808sortedajY9A(@NotNull int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM5578constructorimpl = UIntArray.m5578constructorimpl(iArrCopyOf);
        m4788sortajY9A(iArrM5578constructorimpl);
        return UArraysKt___UArraysJvmKt.m5669asListajY9A(iArrM5578constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m4809sortedGBYM_sE(@NotNull byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM5553constructorimpl = UByteArray.m5553constructorimpl(bArrCopyOf);
        m4795sortGBYM_sE(bArrM5553constructorimpl);
        return UArraysKt___UArraysJvmKt.m5670asListGBYM_sE(bArrM5553constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m4810sortedQwZRm1k(@NotNull long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM5603constructorimpl = ULongArray.m5603constructorimpl(jArrCopyOf);
        m4796sortQwZRm1k(jArrM5603constructorimpl);
        return UArraysKt___UArraysJvmKt.m5671asListQwZRm1k(jArrM5603constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m4811sortedrL5Bavg(@NotNull short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM5628constructorimpl = UShortArray.m5628constructorimpl(sArrCopyOf);
        m4799sortrL5Bavg(sArrM5628constructorimpl);
        return UArraysKt___UArraysJvmKt.m5672asListrL5Bavg(sArrM5628constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m4812sortedArrayajY9A(@NotNull int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UIntArray.m5586isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM5578constructorimpl = UIntArray.m5578constructorimpl(iArrCopyOf);
        m4788sortajY9A(iArrM5578constructorimpl);
        return iArrM5578constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m4813sortedArrayGBYM_sE(@NotNull byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UByteArray.m5561isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM5553constructorimpl = UByteArray.m5553constructorimpl(bArrCopyOf);
        m4795sortGBYM_sE(bArrM5553constructorimpl);
        return bArrM5553constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m4814sortedArrayQwZRm1k(@NotNull long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (ULongArray.m5611isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM5603constructorimpl = ULongArray.m5603constructorimpl(jArrCopyOf);
        m4796sortQwZRm1k(jArrM5603constructorimpl);
        return jArrM5603constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m4815sortedArrayrL5Bavg(@NotNull short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UShortArray.m5636isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM5628constructorimpl = UShortArray.m5628constructorimpl(sArrCopyOf);
        m4799sortrL5Bavg(sArrM5628constructorimpl);
        return sArrM5628constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m4816sortedArrayDescendingajY9A(@NotNull int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UIntArray.m5586isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM5578constructorimpl = UIntArray.m5578constructorimpl(iArrCopyOf);
        m4800sortDescendingajY9A(iArrM5578constructorimpl);
        return iArrM5578constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m4817sortedArrayDescendingGBYM_sE(@NotNull byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UByteArray.m5561isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM5553constructorimpl = UByteArray.m5553constructorimpl(bArrCopyOf);
        m4804sortDescendingGBYM_sE(bArrM5553constructorimpl);
        return bArrM5553constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m4818sortedArrayDescendingQwZRm1k(@NotNull long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (ULongArray.m5611isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM5603constructorimpl = ULongArray.m5603constructorimpl(jArrCopyOf);
        m4805sortDescendingQwZRm1k(jArrM5603constructorimpl);
        return jArrM5603constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m4819sortedArrayDescendingrL5Bavg(@NotNull short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UShortArray.m5636isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM5628constructorimpl = UShortArray.m5628constructorimpl(sArrCopyOf);
        m4807sortDescendingrL5Bavg(sArrM5628constructorimpl);
        return sArrM5628constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<UInt> m4820sortedDescendingajY9A(@NotNull int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM5578constructorimpl = UIntArray.m5578constructorimpl(iArrCopyOf);
        m4788sortajY9A(iArrM5578constructorimpl);
        return m4756reversedajY9A(iArrM5578constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m4821sortedDescendingGBYM_sE(@NotNull byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM5553constructorimpl = UByteArray.m5553constructorimpl(bArrCopyOf);
        m4795sortGBYM_sE(bArrM5553constructorimpl);
        return m4757reversedGBYM_sE(bArrM5553constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m4822sortedDescendingQwZRm1k(@NotNull long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM5603constructorimpl = ULongArray.m5603constructorimpl(jArrCopyOf);
        m4796sortQwZRm1k(jArrM5603constructorimpl);
        return m4758reversedQwZRm1k(jArrM5603constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m4823sortedDescendingrL5Bavg(@NotNull short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM5628constructorimpl = UShortArray.m5628constructorimpl(sArrCopyOf);
        m4799sortrL5Bavg(sArrM5628constructorimpl);
        return m4759reversedrL5Bavg(sArrM5628constructorimpl);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int iM5570constructorimpl = 0;
        for (UByte uByte : uByteArr) {
            iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(uByte.getF79395p0() & 255) + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int iM5570constructorimpl = 0;
        for (UInt uInt : uIntArr) {
            iM5570constructorimpl = UInt.m5570constructorimpl(uInt.getF79399p0() + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        long jM5595constructorimpl = 0;
        for (ULong uLong : uLongArr) {
            jM5595constructorimpl = ULong.m5595constructorimpl(uLong.getF79403p0() + jM5595constructorimpl);
        }
        return jM5595constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int iM5570constructorimpl = 0;
        for (UShort uShort : uShortArr) {
            iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(uShort.getF79407p0() & UShort.MAX_VALUE) + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4824takePpDY95g(@NotNull byte[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= UByteArray.m5559getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.m5551boximpl(take));
        }
        if (i10 == 1) {
            return bk.d.listOf(UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM5559getSizeimpl = UByteArray.m5559getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM5559getSizeimpl; i12++) {
            arrayList.add(UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4825takenggk6HY(@NotNull short[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= UShortArray.m5634getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.m5626boximpl(take));
        }
        if (i10 == 1) {
            return bk.d.listOf(UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM5634getSizeimpl = UShortArray.m5634getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM5634getSizeimpl; i12++) {
            arrayList.add(UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4826takeqFRl0hI(@NotNull int[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= UIntArray.m5584getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.m5576boximpl(take));
        }
        if (i10 == 1) {
            return bk.d.listOf(UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM5584getSizeimpl = UIntArray.m5584getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM5584getSizeimpl; i12++) {
            arrayList.add(UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4827taker7IrZao(@NotNull long[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= ULongArray.m5609getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.m5601boximpl(take));
        }
        if (i10 == 1) {
            return bk.d.listOf(ULong.m5594boximpl(ULongArray.m5608getsVKNKU(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM5609getSizeimpl = ULongArray.m5609getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM5609getSizeimpl; i12++) {
            arrayList.add(ULong.m5594boximpl(ULongArray.m5608getsVKNKU(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4828takeLastPpDY95g(@NotNull byte[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM5559getSizeimpl = UByteArray.m5559getSizeimpl(takeLast);
        if (i10 >= iM5559getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.m5551boximpl(takeLast));
        }
        if (i10 == 1) {
            return bk.d.listOf(UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(takeLast, iM5559getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM5559getSizeimpl - i10; i11 < iM5559getSizeimpl; i11++) {
            arrayList.add(UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(takeLast, i11)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4829takeLastnggk6HY(@NotNull short[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM5634getSizeimpl = UShortArray.m5634getSizeimpl(takeLast);
        if (i10 >= iM5634getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.m5626boximpl(takeLast));
        }
        if (i10 == 1) {
            return bk.d.listOf(UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(takeLast, iM5634getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM5634getSizeimpl - i10; i11 < iM5634getSizeimpl; i11++) {
            arrayList.add(UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(takeLast, i11)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4830takeLastqFRl0hI(@NotNull int[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM5584getSizeimpl = UIntArray.m5584getSizeimpl(takeLast);
        if (i10 >= iM5584getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.m5576boximpl(takeLast));
        }
        if (i10 == 1) {
            return bk.d.listOf(UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(takeLast, iM5584getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM5584getSizeimpl - i10; i11 < iM5584getSizeimpl; i11++) {
            arrayList.add(UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(takeLast, i11)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4831takeLastr7IrZao(@NotNull long[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM5609getSizeimpl = ULongArray.m5609getSizeimpl(takeLast);
        if (i10 >= iM5609getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.m5601boximpl(takeLast));
        }
        if (i10 == 1) {
            return bk.d.listOf(ULong.m5594boximpl(ULongArray.m5608getsVKNKU(takeLast, iM5609getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM5609getSizeimpl - i10; i11 < iM5609getSizeimpl; i11++) {
            arrayList.add(ULong.m5594boximpl(ULongArray.m5608getsVKNKU(takeLast, i11)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final UInt[] m4832toTypedArrayajY9A(@NotNull int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM5584getSizeimpl = UIntArray.m5584getSizeimpl(toTypedArray);
        UInt[] uIntArr = new UInt[iM5584getSizeimpl];
        for (int i10 = 0; i10 < iM5584getSizeimpl; i10++) {
            uIntArr[i10] = UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(toTypedArray, i10));
        }
        return uIntArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final UByte[] m4833toTypedArrayGBYM_sE(@NotNull byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM5559getSizeimpl = UByteArray.m5559getSizeimpl(toTypedArray);
        UByte[] uByteArr = new UByte[iM5559getSizeimpl];
        for (int i10 = 0; i10 < iM5559getSizeimpl; i10++) {
            uByteArr[i10] = UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(toTypedArray, i10));
        }
        return uByteArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final ULong[] m4834toTypedArrayQwZRm1k(@NotNull long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM5609getSizeimpl = ULongArray.m5609getSizeimpl(toTypedArray);
        ULong[] uLongArr = new ULong[iM5609getSizeimpl];
        for (int i10 = 0; i10 < iM5609getSizeimpl; i10++) {
            uLongArr[i10] = ULong.m5594boximpl(ULongArray.m5608getsVKNKU(toTypedArray, i10));
        }
        return uLongArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final UShort[] m4835toTypedArrayrL5Bavg(@NotNull short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM5634getSizeimpl = UShortArray.m5634getSizeimpl(toTypedArray);
        UShort[] uShortArr = new UShort[iM5634getSizeimpl];
        for (int i10 = 0; i10 < iM5634getSizeimpl; i10++) {
            uShortArr[i10] = UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(toTypedArray, i10));
        }
        return uShortArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int length = uByteArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = uByteArr[i10].getF79395p0();
        }
        return UByteArray.m5553constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int length = uIntArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = uIntArr[i10].getF79399p0();
        }
        return UIntArray.m5578constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        int length = uLongArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = uLongArr[i10].getF79403p0();
        }
        return ULongArray.m5603constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int length = uShortArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = uShortArr[i10].getF79407p0();
        }
        return UShortArray.m5628constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<IndexedValue<UInt>> m4836withIndexajY9A(@NotNull int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new C0113a(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<IndexedValue<UByte>> m4837withIndexGBYM_sE(@NotNull byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new c(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<IndexedValue<ULong>> m4838withIndexQwZRm1k(@NotNull long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new b(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<IndexedValue<UShort>> m4839withIndexrL5Bavg(@NotNull short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new d(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m4840zipCE_24M(@NotNull int[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UIntArray.m5584getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(zip, i10);
            arrayList.add(TuplesKt.to(UInt.m5569boximpl(iM5583getpVg5ArA), other[i10]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m4841zipF7u83W8(@NotNull long[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5609getSizeimpl = ULongArray.m5609getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM5609getSizeimpl));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= iM5609getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(ULong.m5594boximpl(ULongArray.m5608getsVKNKU(zip, i10)), r3));
            i10++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m4842zipHwE9HBo(@NotNull int[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5584getSizeimpl = UIntArray.m5584getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM5584getSizeimpl));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= iM5584getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(zip, i10)), r3));
            i10++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m4843zipJGPC0M(@NotNull short[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5634getSizeimpl = UShortArray.m5634getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM5634getSizeimpl));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= iM5634getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(zip, i10)), r3));
            i10++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m4844zipJQknh5Q(@NotNull byte[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5559getSizeimpl = UByteArray.m5559getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM5559getSizeimpl));
        int i10 = 0;
        for (R r3 : other) {
            if (i10 >= iM5559getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(zip, i10)), r3));
            i10++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<Pair<UInt, UInt>> m4845zipctEhBpI(@NotNull int[] zip, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UIntArray.m5584getSizeimpl(zip), UIntArray.m5584getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(zip, i10)), UInt.m5569boximpl(UIntArray.m5583getpVg5ArA(other, i10))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m4846zipf7H3mmw(@NotNull long[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(ULongArray.m5609getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(zip, i10);
            arrayList.add(TuplesKt.to(ULong.m5594boximpl(jM5608getsVKNKU), other[i10]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<Pair<UByte, UByte>> m4847zipkdPth3s(@NotNull byte[] zip, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UByteArray.m5559getSizeimpl(zip), UByteArray.m5559getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(zip, i10)), UByte.m5544boximpl(UByteArray.m5558getw2LRezQ(other, i10))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<Pair<UShort, UShort>> m4848zipmazbYpA(@NotNull short[] zip, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UShortArray.m5634getSizeimpl(zip), UShortArray.m5634getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(zip, i10)), UShort.m5619boximpl(UShortArray.m5633getMh2AYeg(other, i10))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m4849zipnl983wc(@NotNull byte[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UByteArray.m5559getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(zip, i10);
            arrayList.add(TuplesKt.to(UByte.m5544boximpl(bM5558getw2LRezQ), other[i10]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m4850zipuaTIQ5s(@NotNull short[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UShortArray.m5634getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(zip, i10);
            arrayList.add(TuplesKt.to(UShort.m5619boximpl(sM5633getMh2AYeg), other[i10]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<Pair<ULong, ULong>> m4851zipus8wMrg(@NotNull long[] zip, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(ULongArray.m5609getSizeimpl(zip), ULongArray.m5609getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(ULong.m5594boximpl(ULongArray.m5608getsVKNKU(zip, i10)), ULong.m5594boximpl(ULongArray.m5608getsVKNKU(other, i10))));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m4718maxOrThrowU(@NotNull long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!ULongArray.m5611isEmptyimpl(max)) {
            long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(max, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(max, it.nextInt());
                if (Long.compare(jM5608getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM5608getsVKNKU2) < 0) {
                    jM5608getsVKNKU = jM5608getsVKNKU2;
                }
            }
            return jM5608getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m4726maxWithOrThrowU(@NotNull long[] maxWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m5611isEmptyimpl(maxWith)) {
            long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(maxWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(maxWith, it.nextInt());
                if (comparator.compare(ULong.m5594boximpl(jM5608getsVKNKU), ULong.m5594boximpl(jM5608getsVKNKU2)) < 0) {
                    jM5608getsVKNKU = jM5608getsVKNKU2;
                }
            }
            return jM5608getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m4734minOrThrowU(@NotNull long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!ULongArray.m5611isEmptyimpl(min)) {
            long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(min, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(min, it.nextInt());
                if (Long.compare(jM5608getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM5608getsVKNKU2) > 0) {
                    jM5608getsVKNKU = jM5608getsVKNKU2;
                }
            }
            return jM5608getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m4742minWithOrThrowU(@NotNull long[] minWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m5611isEmptyimpl(minWith)) {
            long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(minWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(minWith, it.nextInt());
                if (comparator.compare(ULong.m5594boximpl(jM5608getsVKNKU), ULong.m5594boximpl(jM5608getsVKNKU2)) > 0) {
                    jM5608getsVKNKU = jM5608getsVKNKU2;
                }
            }
            return jM5608getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m4716maxOrThrowU(@NotNull byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UByteArray.m5561isEmptyimpl(max)) {
            byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(max, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(max, it.nextInt());
                if (Intrinsics.compare(bM5558getw2LRezQ & 255, bM5558getw2LRezQ2 & 255) < 0) {
                    bM5558getw2LRezQ = bM5558getw2LRezQ2;
                }
            }
            return bM5558getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m4724maxWithOrThrowU(@NotNull byte[] maxWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m5561isEmptyimpl(maxWith)) {
            byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(maxWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(maxWith, it.nextInt());
                if (comparator.compare(UByte.m5544boximpl(bM5558getw2LRezQ), UByte.m5544boximpl(bM5558getw2LRezQ2)) < 0) {
                    bM5558getw2LRezQ = bM5558getw2LRezQ2;
                }
            }
            return bM5558getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m4732minOrThrowU(@NotNull byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UByteArray.m5561isEmptyimpl(min)) {
            byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(min, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(min, it.nextInt());
                if (Intrinsics.compare(bM5558getw2LRezQ & 255, bM5558getw2LRezQ2 & 255) > 0) {
                    bM5558getw2LRezQ = bM5558getw2LRezQ2;
                }
            }
            return bM5558getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m4740minWithOrThrowU(@NotNull byte[] minWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m5561isEmptyimpl(minWith)) {
            byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(minWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(minWith, it.nextInt());
                if (comparator.compare(UByte.m5544boximpl(bM5558getw2LRezQ), UByte.m5544boximpl(bM5558getw2LRezQ2)) > 0) {
                    bM5558getw2LRezQ = bM5558getw2LRezQ2;
                }
            }
            return bM5558getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m4689getIndicesajY9A$annotations(int[] iArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m4691getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m4693getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m4695getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m4697getLastIndexajY9A$annotations(int[] iArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m4699getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m4701getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m4703getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m4719maxOrThrowU(@NotNull short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UShortArray.m5636isEmptyimpl(max)) {
            short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(max, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(max, it.nextInt());
                if (Intrinsics.compare(sM5633getMh2AYeg & UShort.MAX_VALUE, 65535 & sM5633getMh2AYeg2) < 0) {
                    sM5633getMh2AYeg = sM5633getMh2AYeg2;
                }
            }
            return sM5633getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m4727maxWithOrThrowU(@NotNull short[] maxWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m5636isEmptyimpl(maxWith)) {
            short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(maxWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(maxWith, it.nextInt());
                if (comparator.compare(UShort.m5619boximpl(sM5633getMh2AYeg), UShort.m5619boximpl(sM5633getMh2AYeg2)) < 0) {
                    sM5633getMh2AYeg = sM5633getMh2AYeg2;
                }
            }
            return sM5633getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m4735minOrThrowU(@NotNull short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UShortArray.m5636isEmptyimpl(min)) {
            short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(min, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(min, it.nextInt());
                if (Intrinsics.compare(sM5633getMh2AYeg & UShort.MAX_VALUE, 65535 & sM5633getMh2AYeg2) > 0) {
                    sM5633getMh2AYeg = sM5633getMh2AYeg2;
                }
            }
            return sM5633getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m4743minWithOrThrowU(@NotNull short[] minWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m5636isEmptyimpl(minWith)) {
            short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(minWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(minWith, it.nextInt());
                if (comparator.compare(UShort.m5619boximpl(sM5633getMh2AYeg), UShort.m5619boximpl(sM5633getMh2AYeg2)) > 0) {
                    sM5633getMh2AYeg = sM5633getMh2AYeg2;
                }
            }
            return sM5633getMh2AYeg;
        }
        throw new NoSuchElementException();
    }
}
