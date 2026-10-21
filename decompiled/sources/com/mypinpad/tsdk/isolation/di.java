package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class di {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55187c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55188d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final db f55189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setContentDescription f55190b;

    public di(@NotNull db dbVar, @NotNull setContentDescription setcontentdescription) {
        Intrinsics.checkNotNullParameter(dbVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f55189a = dbVar;
        this.f55190b = setcontentdescription;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x05ed A[EDGE_INSN: B:114:0x05ed->B:115:0x05f9 BREAK  A[LOOP:2: B:89:0x04d7->B:146:0x0784]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0782  */
    /* JADX WARN: Code duplicated, block: B:146:0x0784 A[LOOP:2: B:89:0x04d7->B:146:0x0784, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[LOOP:1: B:51:0x0358->B:159:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0345  */
    /* JADX WARN: Code duplicated, block: B:53:0x035e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0374  */
    /* JADX WARN: Code duplicated, block: B:57:0x0392  */
    /* JADX WARN: Code duplicated, block: B:60:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:69:0x041b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0450  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object next;
        dg dgVar;
        String str;
        boolean z10;
        int i13;
        int i14;
        Iterator<T> it;
        int i15;
        dg dgVar2;
        boolean z11;
        int i16;
        int i17;
        int i18;
        Object next2;
        boolean z12;
        int i19 = ~i11;
        int i20 = ~(i19 | i10);
        int i21 = ~(i11 | i12);
        int i22 = (((~((~i10) | i19)) | i21) * 196) + ((i11 | i10) * 392) + ((i20 | i21) * (-196)) + (i11 * (-195)) + (i10 * (-391));
        int i23 = 696526760;
        if (i22 == 1) {
            di diVar = (di) objArr[0];
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            byte[] bArr = (byte[]) objArr[2];
            Byte b10 = (Byte) objArr[3];
            int i24 = f55188d + 49;
            f55187c = i24 % 128;
            if (i24 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                Intrinsics.checkNotNullParameter(bArr, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            if (b10 != null) {
                Iterator<T> it2 = diVar.f55189a.setX().iterator();
                int i25 = f55187c;
                int i26 = (((i25 ^ 65) | (i25 & 65)) << 1) - ((65 & (~i25)) | (i25 & (-66)));
                f55188d = i26 % 128;
                int i27 = i26 % 2;
                while (true) {
                    if (!it2.hasNext()) {
                        int i28 = f55188d;
                        int i29 = i28 & 5;
                        int i30 = i29 + ((i28 ^ 5) | i29);
                        f55187c = i30 % 128;
                        int i31 = i30 % 2;
                        next = null;
                        break;
                    }
                    int i32 = f55188d;
                    int i33 = i32 & 87;
                    int i34 = (i32 | 87) & (~i33);
                    int i35 = i33 << 1;
                    int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                    f55187c = i36 % 128;
                    int i37 = i36 % 2;
                    next = it2.next();
                    dg dgVar3 = (dg) next;
                    if (((Byte) dg.setX(new Object[]{dgVar3}, i23, -696526756, System.identityHashCode(dgVar3))).byteValue() == b10.byteValue()) {
                        int i38 = f55187c;
                        int i39 = (i38 ^ 49) + ((i38 & 49) << 1);
                        int i40 = i39 % 128;
                        f55188d = i40;
                        int i41 = i39 % 2;
                        int i42 = (((i40 | 92) << 1) - (i40 ^ 92)) - 1;
                        int i43 = i42 % 128;
                        f55187c = i43;
                        int i44 = i42 % 2;
                        int i45 = i43 + 75;
                        f55188d = i45 % 128;
                        if (i45 % 2 == 0) {
                            Arrays.equals((byte[]) dg.setX(new Object[]{dgVar3}, 1618145048, -1618145046, System.identityHashCode(dgVar3)), bArr);
                            throw null;
                        }
                        if (Arrays.equals((byte[]) dg.setX(new Object[]{dgVar3}, 1618145048, -1618145046, System.identityHashCode(dgVar3)), bArr)) {
                            int i46 = f55187c;
                            int i47 = i46 & 9;
                            int i48 = i47 + ((i46 ^ 9) | i47);
                            f55188d = i48 % 128;
                            if (i48 % 2 != 0 ? ((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar3}, 208355073, -208355069, System.identityHashCode(dgVar3))).byteValue() == 1 : ((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar3}, 208355073, -208355069, System.identityHashCode(dgVar3))).byteValue() == 1) {
                                int i49 = f55187c;
                                int i50 = i49 & 13;
                                int i51 = ((i49 ^ 13) | i50) << 1;
                                int i52 = -((i49 | 13) & (~i50));
                                int i53 = (i51 & i52) + (i52 | i51);
                                f55188d = i53 % 128;
                                int i54 = i53 % 2;
                                z10 = true;
                            }
                        }
                        if (!(!z10)) {
                            i13 = f55188d + 3;
                            i14 = i13 % 128;
                            f55187c = i14;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                            int i55 = (((i14 | 92) << 1) - (i14 ^ 92)) - 1;
                            f55188d = i55 % 128;
                            int i56 = i55 % 2;
                            break;
                        }
                        i23 = 696526760;
                    } else {
                        int i57 = f55187c + 7;
                        f55188d = i57 % 128;
                        int i58 = i57 % 2;
                    }
                    int i59 = f55187c;
                    int i60 = (i59 & (-68)) | ((~i59) & 67);
                    int i61 = -(-((i59 & 67) << 1));
                    int i62 = (i60 & i61) + (i61 | i60);
                    f55188d = i62 % 128;
                    int i63 = i62 % 2;
                    z10 = false;
                    if (!(!z10)) {
                        i13 = f55188d + 3;
                        i14 = i13 % 128;
                        f55187c = i14;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        int i510 = (((i14 | 92) << 1) - (i14 ^ 92)) - 1;
                        f55188d = i510 % 128;
                        int i511 = i510 % 2;
                        break;
                    }
                    i23 = 696526760;
                }
                dg dgVar4 = (dg) next;
                if (dgVar4 != null) {
                    int i64 = f55187c;
                    int i65 = i64 & 75;
                    int i66 = i65 + ((i64 ^ 75) | i65);
                    f55188d = i66 % 128;
                    int i67 = i66 % 2;
                    if (!((Boolean) setDividerPadding(new Object[]{diVar, setscrollbardefaultdelaybeforefade, dgVar4}, -876300370, 876300370, System.identityHashCode(diVar))).booleanValue()) {
                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Certificate found for index: ", (String) setInputExtras.setDividerPadding(new Object[]{new byte[]{b10.byteValue()}}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                        if (!((Boolean) dg.setX(new Object[]{dgVar4, diVar.f55190b}, 1394609679, -1394609678, System.identityHashCode(dgVar4))).booleanValue()) {
                            int i68 = f55187c;
                            int i69 = i68 & 51;
                            int i70 = (i68 ^ 51) | i69;
                            int i71 = (i69 & i70) + (i70 | i69);
                            f55188d = i71 % 128;
                            int i72 = i71 % 2;
                            byte[] bArr2 = (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar4}, 298274011, -298274005, System.identityHashCode(dgVar4));
                            if (bArr2 == null) {
                                int i73 = f55188d;
                                int i74 = ((i73 | 77) << 1) - (i73 ^ 77);
                                f55187c = i74 % 128;
                                int i75 = i74 % 2;
                                int i76 = i73 & 5;
                                int i77 = -(-((i73 ^ 5) | i76));
                                int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                                f55187c = i78 % 128;
                                int i79 = i78 % 2;
                                str = null;
                            } else {
                                str = (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                                int i80 = f55188d + 91;
                                f55187c = i80 % 128;
                                int i81 = i80 % 2;
                            }
                            SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Certificate expired, expiration date: ", str)}, 818541572, -818541572, (int) System.currentTimeMillis());
                            int i82 = f55187c;
                            int i83 = i82 & 25;
                            int i84 = -(-(i82 | 25));
                            int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                            f55188d = i85 % 128;
                            if (i85 % 2 == 0) {
                                throw null;
                            }
                        }
                        return dgVar;
                    }
                    int i86 = f55187c;
                    int i87 = ((i86 & (-50)) | ((~i86) & 49)) + ((i86 & 49) << 1);
                    int i88 = i87 % 128;
                    f55188d = i88;
                    if (i87 % 2 == 0) {
                        throw null;
                    }
                    int i89 = ((i88 | 33) << 1) - (i88 ^ 33);
                    f55187c = i89 % 128;
                    if (i89 % 2 != 0) {
                        throw null;
                    }
                } else {
                    SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Certificate not found for index: ", (String) setInputExtras.setDividerPadding(new Object[]{new byte[]{b10.byteValue()}}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                    int i90 = f55188d;
                    int i91 = (i90 | 61) << 1;
                    int i92 = -(i90 ^ 61);
                    int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                    f55187c = i93 % 128;
                    int i94 = i93 % 2;
                }
                int i95 = f55188d;
                int i96 = i95 & 71;
                int i97 = (i95 | 71) & (~i96);
                int i98 = i96 << 1;
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                f55187c = i99 % 128;
                int i100 = i99 % 2;
                dgVar = dgVar4;
                return dgVar;
            }
            int i101 = (-2) - ((f55188d + 90) ^ (-1));
            f55187c = i101 % 128;
            int i102 = i101 % 2;
            dgVar = null;
            return dgVar;
        }
        if (i22 != 2) {
            di diVar2 = (di) objArr[0];
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            dg dgVar5 = (dg) objArr[2];
            int i103 = f55188d;
            int i104 = i103 ^ 99;
            int i105 = -(-((i103 & 99) << 1));
            int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
            f55187c = i106 % 128;
            int i107 = i106 % 2;
            dj.setY sety = dj.setY;
            dj djVar = (dj) dj.setY.setX(new Object[]{setscrollbardefaultdelaybeforefade2, diVar2.f55190b, dgVar5}, 1210480347, -1210480347, (int) System.currentTimeMillis());
            if (djVar == null) {
                int i108 = f55187c;
                int i109 = i108 & 93;
                int i110 = -(-(i108 | 93));
                int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                f55188d = i111 % 128;
                int i112 = i111 % 2;
                int i113 = (i108 ^ 31) + ((i108 & 31) << 1);
                f55188d = i113 % 128;
                if (i113 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
            byte[] bArr3 = (byte[]) dj.setOnFocusChangeListener(new Object[]{djVar}, -792361021, 792361021, System.identityHashCode(djVar));
            Iterator<T> it3 = diVar2.f55189a.setDividerPadding().iterator();
            int i114 = f55188d;
            int i115 = i114 & 13;
            int i116 = ((i114 | 13) & (~i115)) + (i115 << 1);
            f55187c = i116 % 128;
            int i117 = i116 % 2;
            while (true) {
                if (!it3.hasNext()) {
                    int i118 = f55187c + 69;
                    f55188d = i118 % 128;
                    int i119 = i118 % 2;
                    next2 = null;
                    break;
                }
                int i120 = f55188d;
                int i121 = (((i120 | 116) << 1) - (i120 ^ 116)) - 1;
                f55187c = i121 % 128;
                int i122 = i121 % 2;
                next2 = it3.next();
                dn dnVar = (dn) next2;
                if (Arrays.equals((byte[]) dn.setY(new Object[]{dnVar}, -1393450637, 1393450639, System.identityHashCode(dnVar)), (byte[]) dg.setX(new Object[]{dgVar5}, 1618145048, -1618145046, System.identityHashCode(dgVar5)))) {
                    int i123 = f55188d + 95;
                    f55187c = i123 % 128;
                    if (i123 % 2 != 0) {
                        ((Byte) dn.setY(new Object[]{dnVar}, -558820173, 558820174, System.identityHashCode(dnVar))).byteValue();
                        ((Byte) dg.setX(new Object[]{dgVar5}, 696526760, -696526756, System.identityHashCode(dgVar5))).byteValue();
                        throw null;
                    }
                    if (((Byte) dn.setY(new Object[]{dnVar}, -558820173, 558820174, System.identityHashCode(dnVar))).byteValue() == ((Byte) dg.setX(new Object[]{dgVar5}, 696526760, -696526756, System.identityHashCode(dgVar5))).byteValue()) {
                        int i124 = f55187c;
                        int i125 = ((i124 ^ 102) + ((i124 & 102) << 1)) - 1;
                        f55188d = i125 % 128;
                        int i126 = i125 % 2;
                        if (((List) dn.setY(new Object[]{dnVar}, -858994576, 858994576, System.identityHashCode(dnVar))).contains((String) setInputExtras.setDividerPadding(new Object[]{bArr3}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                            int i127 = f55188d;
                            int i128 = ((i127 | 33) << 1) - (i127 ^ 33);
                            f55187c = i128 % 128;
                            int i129 = i128 % 2;
                            int i130 = ((i127 ^ 52) + ((i127 & 52) << 1)) - 1;
                            f55187c = i130 % 128;
                            int i131 = i130 % 2;
                            int i132 = i127 + 31;
                            int i133 = i132 % 128;
                            f55187c = i133;
                            int i134 = i132 % 2;
                            int i135 = i133 ^ 19;
                            int i136 = -(-((i133 & 19) << 1));
                            int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                            f55188d = i137 % 128;
                            int i138 = i137 % 2;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                int i139 = f55187c;
                int i140 = i139 & 13;
                int i141 = (i139 | 13) & (~i140);
                int i142 = -(-(i140 << 1));
                int i143 = (i141 & i142) + (i141 | i142);
                f55188d = i143 % 128;
                int i144 = i143 % 2;
            }
            if (next2 != null) {
                int i145 = f55188d;
                int i146 = (i145 ^ 81) + ((i145 & 81) << 1);
                f55187c = i146 % 128;
                int i147 = i146 % 2;
                z12 = true;
            } else {
                int i148 = f55187c;
                int i149 = i148 & 31;
                int i150 = (i148 ^ 31) | i149;
                int i151 = ((i149 | i150) << 1) - (i150 ^ i149);
                f55188d = i151 % 128;
                int i152 = i151 % 2;
                z12 = false;
            }
            if (z12) {
                int i153 = f55187c;
                int i154 = (i153 | 59) << 1;
                int i155 = -(i153 ^ 59);
                int i156 = (i154 & i155) + (i155 | i154);
                f55188d = i156 % 128;
                if (i156 % 2 == 0) {
                    SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Certificate is revoked, index:", (String) setInputExtras.setDividerPadding(new Object[]{new byte[]{((Byte) dg.setX(new Object[]{dgVar5}, 696526760, -696526756, System.identityHashCode(dgVar5))).byteValue()}}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                } else {
                    SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Certificate is revoked, index:", (String) setInputExtras.setDividerPadding(new Object[]{new byte[]{((Byte) dg.setX(new Object[]{dgVar5}, 696526760, -696526756, System.identityHashCode(dgVar5))).byteValue()}}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                }
            }
            int i157 = f55188d;
            int i158 = i157 & 101;
            int i159 = i157 | 101;
            int i160 = (i158 & i159) + (i159 | i158);
            f55187c = i160 % 128;
            if (i160 % 2 == 0) {
                return Boolean.valueOf(z12);
            }
            throw null;
        }
        di diVar3 = (di) objArr[0];
        byte[] bArr4 = (byte[]) objArr[1];
        Byte b11 = (Byte) objArr[2];
        int i161 = f55187c;
        int i162 = ((i161 & 92) + (i161 | 92)) - 1;
        f55188d = i162 % 128;
        int i163 = i162 % 2;
        Intrinsics.checkNotNullParameter(bArr4, "");
        if (b11 == null) {
            int i164 = f55187c;
            int i165 = (i164 | 73) << 1;
            int i166 = -(((~i164) & 73) | (i164 & (-74)));
            int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
            int i168 = i167 % 128;
            f55188d = i168;
            int i169 = i167 % 2;
            int i170 = i168 | 125;
            int i171 = i170 << 1;
            int i172 = -((~(i168 & 125)) & i170);
            int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
            f55187c = i173 % 128;
            int i174 = i173 % 2;
        } else {
            List<dg> x4 = diVar3.f55189a.setX();
            if (x4 instanceof Collection) {
                int i175 = f55188d;
                int i176 = i175 & 53;
                int i177 = (i175 | 53) & (~i176);
                int i178 = -(-(i176 << 1));
                int i179 = ((i177 | i178) << 1) - (i177 ^ i178);
                f55187c = i179 % 128;
                int i180 = i179 % 2;
                if (!x4.isEmpty()) {
                    it = x4.iterator();
                    int i181 = f55187c;
                    int i182 = i181 & 59;
                    int i183 = (i182 - (~((i181 ^ 59) | i182))) - 1;
                    f55188d = i183 % 128;
                    int i184 = i183 % 2;
                    while (it.hasNext()) {
                        int i185 = f55188d;
                        i15 = (((i185 ^ 41) | (i185 & 41)) << 1) - (((~i185) & 41) | (i185 & (-42)));
                        f55187c = i15 % 128;
                        if (i15 % 2 == 0) {
                            dg dgVar6 = (dg) it.next();
                            ((Byte) dg.setX(new Object[]{dgVar6}, 696526760, -696526756, System.identityHashCode(dgVar6))).byteValue();
                            throw null;
                        }
                        dgVar2 = (dg) it.next();
                        if (((Byte) dg.setX(new Object[]{dgVar2}, 696526760, -696526756, System.identityHashCode(dgVar2))).byteValue() == b11.byteValue()) {
                            int i186 = f55188d;
                            i16 = ((i186 ^ 75) - (~((i186 & 75) << 1))) - 1;
                            i17 = i16 % 128;
                            f55187c = i17;
                            if (i16 % 2 != 0) {
                                i18 = (-2) - ((i17 + 42) ^ (-1));
                                f55188d = i18 % 128;
                                if (i18 % 2 != 0) {
                                    Arrays.equals((byte[]) dg.setX(new Object[]{dgVar2}, 1618145048, -1618145046, System.identityHashCode(dgVar2)), bArr4);
                                    throw null;
                                }
                                if (!(!Arrays.equals((byte[]) dg.setX(new Object[]{dgVar2}, 1618145048, -1618145046, System.identityHashCode(dgVar2)), bArr4))) {
                                    int i187 = f55188d;
                                    int i188 = (((i187 | 70) << 1) - (i187 ^ 70)) - 1;
                                    f55187c = i188 % 128;
                                    int i189 = i188 % 2;
                                    if (((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar2}, 208355073, -208355069, System.identityHashCode(dgVar2))).byteValue() == 1) {
                                        int i190 = f55188d;
                                        int i191 = i190 + 29;
                                        f55187c = i191 % 128;
                                        int i192 = i191 % 2;
                                        int i193 = ((i190 & 5) - (~(-(-(i190 | 5))))) - 1;
                                        f55187c = i193 % 128;
                                        int i194 = i193 % 2;
                                        z11 = true;
                                    }
                                }
                            }
                            if (!z11) {
                                int i195 = f55187c;
                                int i196 = ((i195 & (-24)) | ((~i195) & 23)) + ((i195 & 23) << 1);
                                f55188d = i196 % 128;
                                return Boolean.valueOf(i196 % 2 != 0);
                            }
                        } else {
                            int i197 = f55187c;
                            int i198 = ((i197 & 82) + (i197 | 82)) - 1;
                            f55188d = i198 % 128;
                            int i199 = i198 % 2;
                        }
                        int i200 = f55188d;
                        int i201 = (i200 ^ 119) + ((i200 & 119) << 1);
                        f55187c = i201 % 128;
                        int i202 = i201 % 2;
                        z11 = false;
                        if (!z11) {
                            int i1910 = f55187c;
                            int i1911 = ((i1910 & (-24)) | ((~i1910) & 23)) + ((i1910 & 23) << 1);
                            f55188d = i1911 % 128;
                            return Boolean.valueOf(i1911 % 2 != 0);
                        }
                    }
                }
            } else {
                it = x4.iterator();
                int i1810 = f55187c;
                int i1811 = i1810 & 59;
                int i1812 = (i1811 - (~((i1810 ^ 59) | i1811))) - 1;
                f55188d = i1812 % 128;
                int i1813 = i1812 % 2;
                while (it.hasNext()) {
                    int i1814 = f55188d;
                    i15 = (((i1814 ^ 41) | (i1814 & 41)) << 1) - (((~i1814) & 41) | (i1814 & (-42)));
                    f55187c = i15 % 128;
                    if (i15 % 2 == 0) {
                        dg dgVar7 = (dg) it.next();
                        ((Byte) dg.setX(new Object[]{dgVar7}, 696526760, -696526756, System.identityHashCode(dgVar7))).byteValue();
                        throw null;
                    }
                    dgVar2 = (dg) it.next();
                    if (((Byte) dg.setX(new Object[]{dgVar2}, 696526760, -696526756, System.identityHashCode(dgVar2))).byteValue() == b11.byteValue()) {
                        int i1815 = f55188d;
                        i16 = ((i1815 ^ 75) - (~((i1815 & 75) << 1))) - 1;
                        i17 = i16 % 128;
                        f55187c = i17;
                        if (i16 % 2 != 0) {
                            i18 = (-2) - ((i17 + 42) ^ (-1));
                            f55188d = i18 % 128;
                            if (i18 % 2 != 0) {
                                Arrays.equals((byte[]) dg.setX(new Object[]{dgVar2}, 1618145048, -1618145046, System.identityHashCode(dgVar2)), bArr4);
                                throw null;
                            }
                            if (!(!Arrays.equals((byte[]) dg.setX(new Object[]{dgVar2}, 1618145048, -1618145046, System.identityHashCode(dgVar2)), bArr4))) {
                                int i1816 = f55188d;
                                int i1817 = (((i1816 | 70) << 1) - (i1816 ^ 70)) - 1;
                                f55187c = i1817 % 128;
                                int i1818 = i1817 % 2;
                                if (((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar2}, 208355073, -208355069, System.identityHashCode(dgVar2))).byteValue() == 1) {
                                    int i1912 = f55188d;
                                    int i1913 = i1912 + 29;
                                    f55187c = i1913 % 128;
                                    int i1914 = i1913 % 2;
                                    int i1915 = ((i1912 & 5) - (~(-(-(i1912 | 5))))) - 1;
                                    f55187c = i1915 % 128;
                                    int i1916 = i1915 % 2;
                                    z11 = true;
                                }
                            }
                        }
                        if (!z11) {
                            int i1917 = f55187c;
                            int i1918 = ((i1917 & (-24)) | ((~i1917) & 23)) + ((i1917 & 23) << 1);
                            f55188d = i1918 % 128;
                            return Boolean.valueOf(i1918 % 2 != 0);
                        }
                    } else {
                        int i1919 = f55187c;
                        int i1920 = ((i1919 & 82) + (i1919 | 82)) - 1;
                        f55188d = i1920 % 128;
                        int i1921 = i1920 % 2;
                    }
                    int i203 = f55188d;
                    int i204 = (i203 ^ 119) + ((i203 & 119) << 1);
                    f55187c = i204 % 128;
                    int i205 = i204 % 2;
                    z11 = false;
                    if (!z11) {
                        int i19110 = f55187c;
                        int i19111 = ((i19110 & (-24)) | ((~i19110) & 23)) + ((i19110 & 23) << 1);
                        f55188d = i19111 % 128;
                        return Boolean.valueOf(i19111 % 2 != 0);
                    }
                }
            }
            int i206 = f55187c;
            int i207 = i206 ^ 35;
            int i208 = (((i206 & 35) | i207) << 1) - i207;
            f55188d = i208 % 128;
            int i209 = i208 % 2;
        }
        return Boolean.FALSE;
    }

    @Nullable
    public final dg setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull byte[] bArr, @Nullable Byte b10) {
        return (dg) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, bArr, b10}, 1002023655, -1002023654, System.identityHashCode(this));
    }

    public final boolean setY(@NotNull byte[] bArr, @Nullable Byte b10) {
        return ((Boolean) setDividerPadding(new Object[]{this, bArr, b10}, -1412595436, 1412595438, System.identityHashCode(this))).booleanValue();
    }
}
