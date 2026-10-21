package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.f;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u000eR\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\b\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/aci;", "Lkotlin/collections/AbstractList;", "Lcom/mypinpad/tsdk/i/abw;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "p0", "[Lcom/mypinpad/tsdk/i/abw;", "setDividerPadding", "()[Lcom/mypinpad/tsdk/i/abw;", "setY", "", "q0", "[I", "setOnFocusChangeListener", "()[I", "", "getSize", "()I", "setX"}, k = 1, mv = {1, 5, 1})
public final class aci extends AbstractList<abw> implements RandomAccess {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52390r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52391s0 = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final abw[] setY;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aci$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52394a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52395b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0260  */
        /* JADX WARN: Code duplicated, block: B:41:0x02ed  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x02ed -> B:30:0x01a7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static /* synthetic */ void a(java.lang.Object[] r32) throws java.security.NoSuchAlgorithmException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 2544
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aci.Companion.a(java.lang.Object[]):void");
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
            int i13 = ~i12;
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = i13 | (~(i14 | i15));
            int i17 = ~(i10 | i11);
            int i18 = (((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721));
            char c10 = 0;
            if (i18 == 1) {
                abx abxVar = (abx) objArr[0];
                int i19 = f52395b;
                int i20 = ((i19 & (-44)) | ((~i19) & 43)) + ((i19 & 43) << 1);
                f52394a = i20 % 128;
                return Long.valueOf(i20 % 2 != 0 ? ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + 4 : ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() / 4);
            }
            if (i18 != 2) {
                if (i18 != 3) {
                    Companion companion = (Companion) objArr[0];
                    abx abxVar2 = (abx) objArr[1];
                    List list = (List) objArr[2];
                    List list2 = (List) objArr[3];
                    int i21 = f52394a;
                    int i22 = i21 | 103;
                    int i23 = i22 << 1;
                    int i24 = -((~(i21 & 103)) & i22);
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    f52395b = i25 % 128;
                    if (i25 % 2 == 0) {
                        setY(new Object[]{companion, 0L, abxVar2, 1, list, 0, Integer.valueOf(list.size()), list2}, 931345407, -931345404, 1);
                    } else {
                        setY(new Object[]{companion, 0L, abxVar2, 0, list, 0, Integer.valueOf(list.size()), list2}, 931345407, -931345404, 0);
                    }
                } else {
                    a(objArr);
                }
                return null;
            }
            Companion companion2 = (Companion) objArr[0];
            abw[] abwVarArr = (abw[]) objArr[1];
            Intrinsics.checkNotNullParameter(abwVarArr, "");
            int length = abwVarArr.length;
            List mutableList = ArraysKt___ArraysKt.toMutableList(abwVarArr);
            f.sort(mutableList);
            ArrayList arrayList = new ArrayList(abwVarArr.length);
            int i26 = f52395b;
            int i27 = ((i26 & 122) + (i26 | 122)) - 1;
            f52394a = i27 % 128;
            int i28 = i27 % 2;
            int i29 = 0;
            while (i29 < 5) {
                int i30 = f52394a;
                int i31 = (i30 & 27) + (i30 | 27);
                f52395b = i31 % 128;
                if (i31 % 2 == 0) {
                    abw abwVar = abwVarArr[i29];
                    arrayList.add(-1);
                    int i32 = (i29 ^ (-55)) + ((i29 & (-55)) << 1);
                    i29 = (i32 & 109) + (i32 | 109);
                } else {
                    abw abwVar2 = abwVarArr[i29];
                    arrayList.add(-1);
                    int i33 = (i29 & (-2)) | ((~i29) & 1);
                    int i34 = -(-((i29 & 1) << 1));
                    i29 = (i33 ^ i34) + ((i34 & i33) << 1);
                }
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Integer[] numArr = (Integer[]) array;
            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int i35 = f52395b;
            int i36 = i35 ^ 17;
            int i37 = (((i35 & 17) | i36) << 1) - i36;
            f52394a = i37 % 128;
            int i38 = i37 % 2;
            int i39 = 0;
            int i40 = 0;
            for (int i41 = 5; i39 < i41; i41 = 5) {
                System.identityHashCode(companion2);
                System.identityHashCode(companion2);
                abw abwVar3 = abwVarArr[i39];
                int i42 = i40 ^ 1;
                int i43 = ((((i40 & 1) | i42) << 1) - (~(-i42))) - 1;
                int i44 = i39;
                List list3 = listMutableListOf;
                list3.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, abwVar3, 0, 0, 6, (Object) null), Integer.valueOf(i40));
                int i45 = i44 ^ 1;
                i39 = ((((i44 & 1) | i45) << 1) - (~(-i45))) - 1;
                int i46 = f52394a;
                int i47 = i46 ^ 57;
                int i48 = (i46 & 57) << 1;
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                f52395b = i49 % 128;
                int i50 = i49 % 2;
                listMutableListOf = list3;
                i40 = i43;
            }
            List list4 = listMutableListOf;
            abw abwVar4 = (abw) mutableList.get(0);
            if (((Integer) abw.setX(new Object[]{abwVar4}, -1716166708, 1716166712, System.identityHashCode(abwVar4))).intValue() > 0) {
                int i51 = f52395b + 63;
                int i52 = i51 % 128;
                f52394a = i52;
                boolean z10 = i51 % 2 == 0;
                int i53 = (i52 & (-36)) | ((~i52) & 35);
                int i54 = -(-((i52 & 35) << 1));
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                f52395b = i55 % 128;
                int i56 = i55 % 2;
                if (z10) {
                    System.identityHashCode(companion2);
                    System.identityHashCode(companion2);
                    int i57 = 0;
                    while (i57 < mutableList.size()) {
                        int i58 = f52395b;
                        int i59 = ((((i58 ^ 111) | (i58 & 111)) << 1) - (~(-((111 & (~i58)) | (i58 & (-112)))))) - 1;
                        f52394a = i59 % 128;
                        int i60 = i59 % 2;
                        abw abwVar5 = (abw) mutableList.get(i57);
                        int iIdentityHashCode = System.identityHashCode(companion2);
                        int i61 = -(-(i57 * 421));
                        int i62 = ((-419) & i61) + ((-419) | i61);
                        int i63 = i57 & iIdentityHashCode;
                        int i64 = (~i63) & (i57 | iIdentityHashCode);
                        int i65 = ~iIdentityHashCode;
                        int i66 = i64 | i63;
                        int i67 = ~i66;
                        int i68 = ((i66 | i67) & i67) * TypedValues.CycleType.TYPE_EASING;
                        int i69 = ((i62 & i68) - (~(i62 | i68))) - 1;
                        int i70 = -(-(((i57 ^ (-2)) | (i57 & (-2))) * (-420)));
                        int i71 = i69 & i70;
                        int i72 = (i70 | i69) & (~i71);
                        int i73 = i71 << 1;
                        int i74 = (i72 & i73) + (i72 | i73);
                        int i75 = ~i57;
                        int i76 = (i75 | i57) & i75;
                        int i77 = ~(((-2) ^ i76) | (i76 & (-2)));
                        int i78 = i65 & (iIdentityHashCode | i65);
                        int i79 = (i75 & i78) | ((~i78) & i57);
                        int i80 = i78 & i57;
                        int i81 = (i80 & i79) | (i79 ^ i80);
                        int i82 = ~i81;
                        int i83 = (i81 | i82) & i82;
                        int i84 = ((~i83) & i77) | ((~i77) & i83);
                        int i85 = i83 & i77;
                        int i86 = (((i85 & i84) | (i84 ^ i85)) * TypedValues.CycleType.TYPE_EASING) + i74;
                        int i87 = f52395b;
                        int i88 = i87 & 107;
                        int i89 = ((i87 | 107) & (~i88)) + (i88 << 1);
                        f52394a = i89 % 128;
                        int i90 = i89 % 2;
                        while (i86 < mutableList.size()) {
                            int i91 = f52394a;
                            int i92 = ((i91 & 82) + (i91 | 82)) - 1;
                            f52395b = i92 % 128;
                            int i93 = i92 % 2;
                            abw abwVar6 = (abw) mutableList.get(i86);
                            Object[] objArr2 = new Object[2];
                            objArr2[c10] = abwVar6;
                            objArr2[1] = abwVar5;
                            if (!((Boolean) abw.setX(objArr2, -262670654, 262670657, System.identityHashCode(abwVar6))).booleanValue()) {
                                break;
                            }
                            int i94 = f52395b;
                            int i95 = (i94 & 103) + (i94 | 103);
                            f52394a = i95 % 128;
                            if (i95 % 2 != 0) {
                                ((Integer) abw.setX(new Object[]{abwVar6}, -1716166708, 1716166712, System.identityHashCode(abwVar6))).intValue();
                                ((Integer) abw.setX(new Object[]{abwVar5}, -1716166708, 1716166712, System.identityHashCode(abwVar5))).intValue();
                                throw null;
                            }
                            Object[] objArr3 = new Object[1];
                            objArr3[c10] = abwVar6;
                            int iIntValue = ((Integer) abw.setX(objArr3, -1716166708, 1716166712, System.identityHashCode(abwVar6))).intValue();
                            Object[] objArr4 = new Object[1];
                            objArr4[c10] = abwVar5;
                            if (iIntValue == ((Integer) abw.setX(objArr4, -1716166708, 1716166712, System.identityHashCode(abwVar5))).intValue()) {
                                int i96 = f52394a + 7;
                                f52395b = i96 % 128;
                                int i97 = i96 % 2;
                                throw new IllegalArgumentException(Intrinsics.stringPlus("duplicate option: ", abwVar6).toString());
                            }
                            int i98 = f52395b;
                            int i99 = (i98 ^ 63) + ((i98 & 63) << 1);
                            f52394a = i99 % 128;
                            int i100 = i99 % 2;
                            if (((Number) list4.get(i86)).intValue() > ((Number) list4.get(i57)).intValue()) {
                                int i101 = f52395b;
                                int i102 = ((i101 ^ 97) | (i101 & 97)) << 1;
                                int i103 = -(((~i101) & 97) | (i101 & (-98)));
                                int i104 = (i102 & i103) + (i103 | i102);
                                f52394a = i104 % 128;
                                if (i104 % 2 != 0) {
                                    mutableList.remove(i86);
                                    list4.remove(i86);
                                    throw null;
                                }
                                mutableList.remove(i86);
                                list4.remove(i86);
                            } else {
                                i86 = ((i86 & 1) << 1) + ((i86 & (-2)) | ((~i86) & 1));
                                int i105 = f52395b;
                                int i106 = ((i105 ^ 85) | (i105 & 85)) << 1;
                                int i107 = -(((~i105) & 85) | (i105 & (-86)));
                                int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                                f52394a = i108 % 128;
                                int i109 = i108 % 2;
                            }
                            c10 = 0;
                        }
                        int i110 = (i57 | 1) << 1;
                        int i111 = -(i57 ^ 1);
                        i57 = (i110 & i111) + (i110 | i111);
                        int i112 = f52394a;
                        int i113 = (i112 | 33) << 1;
                        int i114 = -(((~i112) & 33) | (i112 & (-34)));
                        int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                        f52395b = i115 % 128;
                        int i116 = i115 % 2;
                        c10 = 0;
                    }
                    abx abxVar3 = new abx();
                    setY(new Object[]{companion2, abxVar3, mutableList, list4}, 1996061895, -1996061895, (int) System.currentTimeMillis());
                    int[] iArr = new int[(int) ((Long) setY(new Object[]{abxVar3}, 1461605412, -1461605411, (int) System.currentTimeMillis())).longValue()];
                    int i117 = f52395b;
                    int i118 = i117 & 121;
                    int i119 = i118 + ((i117 ^ 121) | i118);
                    f52394a = i119 % 128;
                    int i120 = i119 % 2;
                    int i121 = 0;
                    while (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar3}, -1474615858, 1474615886, System.identityHashCode(abxVar3))).booleanValue()) {
                        int i122 = f52395b + 85;
                        f52394a = i122 % 128;
                        int i123 = i122 % 2;
                        int i124 = i121 ^ 1;
                        int i125 = -(-((i121 & 1) << 1));
                        int i126 = (i124 | i125) + (i124 & i125);
                        iArr[i121] = abxVar3.setLayoutAnimation();
                        int i127 = f52395b;
                        int i128 = i127 & 13;
                        int i129 = ((i127 ^ 13) | i128) << 1;
                        int i130 = -((i127 | 13) & (~i128));
                        int i131 = (i129 & i130) + (i130 | i129);
                        f52394a = i131 % 128;
                        int i132 = i131 % 2;
                        i121 = i126;
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(abwVarArr, abwVarArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    aci aciVar = new aci((abw[]) objArrCopyOf, iArr, null);
                    int i133 = f52394a;
                    int i134 = (i133 & 87) + (i133 | 87);
                    f52395b = i134 % 128;
                    if (i134 % 2 != 0) {
                        return aciVar;
                    }
                    throw null;
                }
            } else {
                int i135 = f52394a;
                int i136 = i135 & 57;
                int i137 = i135 | 57;
                int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                f52395b = i138 % 128;
                int i139 = i138 % 2;
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }

        @JvmStatic
        @NotNull
        public final aci setX(@NotNull abw... abwVarArr) {
            return (aci) setY(new Object[]{this, abwVarArr}, -1159774451, 1159774453, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f52390r0;
        int i11 = i10 & 59;
        int i12 = i11 + ((i10 ^ 59) | i11);
        f52391s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public aci(abw[] abwVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.setY = abwVarArr;
        this.setDividerPadding = iArr;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i11;
        int i14 = ((~((~i12) | i13 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
        int i15 = i13 | i10;
        switch ((((~((~i10) | i11)) | (~(i15 | i12))) * 130) + ((~i15) * (-260)) + i14) {
            case 1:
                aci aciVar = (aci) objArr[0];
                int i16 = f52391s0 + 5;
                int i17 = i16 % 128;
                f52390r0 = i17;
                int i18 = i16 % 2;
                abw[] abwVarArr = aciVar.setY;
                if (i18 != 0) {
                    int length = abwVarArr.length;
                    throw null;
                }
                int length2 = abwVarArr.length;
                int i19 = i17 & 119;
                int i20 = i19 + ((i17 ^ 119) | i19);
                f52391s0 = i20 % 128;
                int i21 = i20 % 2;
                return Integer.valueOf(length2);
            case 2:
                aci aciVar2 = (aci) objArr[0];
                abw abwVar = (abw) objArr[1];
                int i22 = f52390r0;
                int i23 = (i22 | 71) << 1;
                int i24 = -(((~i22) & 71) | (i22 & (-72)));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f52391s0 = i25 % 128;
                if (i25 % 2 == 0) {
                    super.contains(abwVar);
                    throw null;
                }
                boolean zContains = super.contains(abwVar);
                int i26 = f52391s0;
                int i27 = i26 & 17;
                int i28 = i26 | 17;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f52390r0 = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.valueOf(zContains);
            case 3:
                aci aciVar3 = (aci) objArr[0];
                Object obj = objArr[1];
                int i31 = f52390r0;
                int i32 = i31 & 29;
                int i33 = (i31 ^ 29) | i32;
                int i34 = (i32 & i33) + (i33 | i32);
                int i35 = i34 % 128;
                f52391s0 = i35;
                if (i34 % 2 == 0) {
                    boolean z10 = obj instanceof abw;
                    throw null;
                }
                if (!(obj instanceof abw)) {
                    int i36 = (((i35 & (-46)) | ((~i35) & 45)) - (~(-(-((i35 & 45) << 1))))) - 1;
                    f52390r0 = i36 % 128;
                    int i37 = i36 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{aciVar3, (abw) obj}, 373833419, -373833417, System.identityHashCode(aciVar3))).booleanValue();
                    int i38 = f52391s0;
                    int i39 = (i38 & 7) + (i38 | 7);
                    f52390r0 = i39 % 128;
                    int i40 = i39 % 2;
                    objValueOf = Boolean.valueOf(zBooleanValue);
                }
                break;
                break;
            case 4:
                aci aciVar4 = (aci) objArr[0];
                Object obj2 = objArr[1];
                int i41 = f52391s0;
                int i42 = i41 & 17;
                int i43 = (i41 ^ 17) | i42;
                int i44 = (i42 & i43) + (i42 | i43);
                f52390r0 = i44 % 128;
                if (i44 % 2 != 0) {
                    boolean z11 = obj2 instanceof abw;
                    throw null;
                }
                if (!(obj2 instanceof abw)) {
                    int i45 = (-2) - ((i41 + 28) ^ (-1));
                    f52390r0 = i45 % 128;
                    if (i45 % 2 == 0) {
                        return -1;
                    }
                    throw null;
                }
                int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{aciVar4, (abw) obj2}, 2146780292, -2146780282, System.identityHashCode(aciVar4))).intValue();
                int i46 = f52391s0;
                int i47 = ((i46 | 3) << 1) - (i46 ^ 3);
                f52390r0 = i47 % 128;
                if (i47 % 2 != 0) {
                    int i48 = 95 / 0;
                }
                return Integer.valueOf(iIntValue);
            case 5:
                aci aciVar5 = (aci) objArr[0];
                int i49 = f52391s0 + 79;
                f52390r0 = i49 % 128;
                int i50 = i49 % 2;
                objValueOf = aciVar5.setY;
                if (i50 != 0) {
                    int i51 = 10 / 0;
                }
                break;
            case 6:
                aci aciVar6 = (aci) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i52 = f52391s0;
                int i53 = i52 & 35;
                int i54 = (i52 | 35) & (~i53);
                int i55 = -(-(i53 << 1));
                int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                f52390r0 = i56 % 128;
                int i57 = i56 % 2;
                abw abwVar2 = (abw) setOnFocusChangeListener(new Object[]{aciVar6, Integer.valueOf(iIntValue2)}, 453164418, -453164409, iIntValue2);
                int i58 = f52391s0;
                int i59 = ((i58 ^ 35) - (~((i58 & 35) << 1))) - 1;
                f52390r0 = i59 % 128;
                int i60 = i59 % 2;
                return abwVar2;
            case 7:
                aci aciVar7 = (aci) objArr[0];
                abw abwVar3 = (abw) objArr[1];
                int i61 = f52391s0 + 55;
                f52390r0 = i61 % 128;
                int i62 = i61 % 2;
                int iLastIndexOf = super.lastIndexOf(abwVar3);
                int i63 = f52390r0;
                int i64 = (i63 & (-88)) | ((~i63) & 87);
                int i65 = (i63 & 87) << 1;
                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                f52391s0 = i66 % 128;
                if (i66 % 2 != 0) {
                    return Integer.valueOf(iLastIndexOf);
                }
                throw null;
            case 8:
                aci aciVar8 = (aci) objArr[0];
                int i67 = f52390r0;
                int i68 = i67 & 51;
                int i69 = (i67 ^ 51) | i68;
                int i70 = (i68 & i69) + (i69 | i68);
                f52391s0 = i70 % 128;
                if (i70 % 2 != 0) {
                    return aciVar8.setDividerPadding;
                }
                int[] iArr = aciVar8.setDividerPadding;
                throw null;
            case 9:
                aci aciVar9 = (aci) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i71 = f52390r0;
                int i72 = i71 & 117;
                int i73 = (i72 - (~(-(-((i71 ^ 117) | i72))))) - 1;
                f52391s0 = i73 % 128;
                int i74 = i73 % 2;
                abw abwVar4 = aciVar9.setY[iIntValue3];
                int i75 = i71 ^ 105;
                int i76 = (i71 & 105) << 1;
                int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                f52391s0 = i77 % 128;
                int i78 = i77 % 2;
                return abwVar4;
            case 10:
                aci aciVar10 = (aci) objArr[0];
                abw abwVar5 = (abw) objArr[1];
                int i79 = (-2) - ((-1) ^ (f52391s0 + 4));
                f52390r0 = i79 % 128;
                if (i79 % 2 != 0) {
                    super.indexOf(abwVar5);
                    throw null;
                }
                int iIndexOf = super.indexOf(abwVar5);
                int i80 = f52390r0;
                int i81 = (i80 & (-76)) | ((~i80) & 75);
                int i82 = (i80 & 75) << 1;
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f52391s0 = i83 % 128;
                int i84 = i83 % 2;
                return Integer.valueOf(iIndexOf);
            default:
                aci aciVar11 = (aci) objArr[0];
                Object obj3 = objArr[1];
                int i85 = f52391s0;
                int i86 = ((i85 ^ 79) | (i85 & 79)) << 1;
                int i87 = -(((~i85) & 79) | (i85 & (-80)));
                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                int i89 = i88 % 128;
                f52390r0 = i89;
                int i90 = i88 % 2;
                if (!(obj3 instanceof abw)) {
                    int i91 = i89 + 101;
                    f52391s0 = i91 % 128;
                    if (i91 % 2 != 0) {
                        return -1;
                    }
                    throw null;
                }
                int iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{aciVar11, (abw) obj3}, -640646009, 640646016, System.identityHashCode(aciVar11))).intValue();
                int i92 = f52391s0;
                int i93 = (i92 & 25) + (i92 | 25);
                f52390r0 = i93 % 128;
                int i94 = i93 % 2;
                return Integer.valueOf(iIntValue4);
        }
        return objValueOf;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, -963449615, 963449618, System.identityHashCode(this))).booleanValue();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -637442877, 637442883, i10);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    @JvmName(name = "getSize")
    /* JADX INFO: renamed from: getSize */
    public final int getF79490r0() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1347281208, -1347281207, System.identityHashCode(this))).intValue();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, obj}, 1461068592, -1461068588, System.identityHashCode(this))).intValue();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, obj}, 2005319445, -2005319445, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final abw[] setDividerPadding() {
        return (abw[]) setOnFocusChangeListener(new Object[]{this}, 642933220, -642933215, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final int[] setOnFocusChangeListener() {
        return (int[]) setOnFocusChangeListener(new Object[]{this}, -852072050, 852072058, System.identityHashCode(this));
    }
}
