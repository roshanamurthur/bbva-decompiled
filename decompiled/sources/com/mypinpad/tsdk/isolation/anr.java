package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class anr implements akk {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f53344r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53345s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f53346p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f53347q0;

    public anr(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f53346p0 = bigInteger2;
        this.f53347q0 = bigInteger;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0157  */
    /* JADX WARN: Code duplicated, block: B:34:0x0188  */
    /* JADX WARN: Code duplicated, block: B:37:0x0198  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (~i10) | i11;
        int i14 = ~i13;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~((~i11) | i10)) | (~(i13 | i12))) * 140) + ((i14 | (~(i15 | i11))) * (-280)) + ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        if (i16 == 1) {
            anr anrVar = (anr) objArr[0];
            int iIdentityHashCode = System.identityHashCode(anrVar);
            int i17 = (-1726834915) ^ iIdentityHashCode;
            int i18 = ~iIdentityHashCode;
            int i19 = iIdentityHashCode & (-1726834915);
            int i20 = (i19 & i17) | (i17 ^ i19);
            int i21 = ~i20;
            int i22 = (i20 | i21) & i21;
            int i23 = -(~(-(-(((i22 & 805811008) | (805811008 ^ i22)) * (-964)))));
            int i24 = (((-1444698711) ^ i23) + ((i23 & (-1444698711)) << 1)) - 1;
            int i25 = ((~i18) & (-1726834915)) | (1726834914 & i18);
            int i26 = (-1726834915) & i18;
            int i27 = ~((i25 & i26) | (i25 ^ i26));
            int i28 = -(-(((i27 & 537206848) | ((-537206849) & i27) | ((~i27) & 537206848)) * (-964)));
            int i29 = i24 & i28;
            int i30 = (((i28 | i24) & (~i29)) - (~(i29 << 1))) - 1;
            int iIdentityHashCode2 = System.identityHashCode(anrVar);
            int i31 = ~iIdentityHashCode2;
            int i32 = -(~(-(-((((-1342259243) & i31) | ((-1342259243) ^ i31)) * 184))));
            int i33 = (((-1766002240) ^ i32) + ((i32 & (-1766002240)) << 1)) - 1;
            int i34 = (i31 | iIdentityHashCode2) & i31;
            int i35 = ~((i34 & (-2032226475)) | (i34 ^ (-2032226475)));
            int i36 = (i35 & (-2142983103)) | ((-2142983103) ^ i35);
            int i37 = ((-689967233) & i36) | ((~i36) & 689967232);
            int i38 = i36 & 689967232;
            int i39 = ((i38 & i37) | (i37 ^ i38)) * 184;
            int i40 = i33 & i39;
            int i41 = -(-((i39 ^ i33) | i40));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            BigInteger bigInteger = anrVar.f53346p0;
            if (i30 > i42) {
                throw null;
            }
            int i43 = f53344r0;
            int i44 = ((i43 | 45) << 1) - (i43 ^ 45);
            f53345s0 = i44 % 128;
            if (i44 % 2 != 0) {
                return bigInteger;
            }
            int i45 = 18 / 0;
            return bigInteger;
        }
        if (i16 == 2) {
            anr anrVar2 = (anr) objArr[0];
            int iIdentityHashCode3 = System.identityHashCode(anrVar2);
            int i46 = ~iIdentityHashCode3;
            int i47 = ~((763521814 ^ iIdentityHashCode3) | (763521814 & iIdentityHashCode3));
            int i48 = i47 ^ 687892998;
            int i49 = i47 & 687892998;
            int i50 = ((i49 & i48) | (i48 ^ i49)) * (-502);
            int i51 = (1153026346 & i50) + (i50 | 1153026346);
            int i52 = 763521814 & i46;
            int i53 = (i46 | 763521814) & (~i52);
            int i54 = (i52 & i53) | (i53 ^ i52);
            int i55 = i54 ^ (-726007311);
            int i56 = i54 & (-726007311);
            int i57 = -(-((~((i56 & i55) | (i55 ^ i56))) * (-502)));
            int i58 = ((i51 | i57) << 1) - (i57 ^ i51);
            int i59 = 726007310 ^ iIdentityHashCode3;
            int i60 = iIdentityHashCode3 & 726007310;
            int i61 = (i60 & i59) | (i59 ^ i60);
            int i62 = ~i61;
            int i63 = (i61 | i62) & i62;
            int i64 = ((~i63) & 763521814) | ((-763521815) & i63);
            int i65 = i63 & 763521814;
            int i66 = ((i65 & i64) | (i64 ^ i65)) * 502;
            int i67 = i58 & i66;
            int i68 = i67 + ((i66 ^ i58) | i67);
            int iIdentityHashCode4 = System.identityHashCode(anrVar2);
            int i69 = ~iIdentityHashCode4;
            int i70 = (i69 | iIdentityHashCode4) & i69;
            int i71 = (-1591971870) & i70;
            int i72 = (i70 | (-1591971870)) & (~i71);
            int i73 = ((i72 & i71) | (i72 ^ i71)) * (-757);
            int i74 = (460835896 ^ i73) + ((i73 & 460835896) << 1);
            int i75 = -(-((~(((-444796930) & iIdentityHashCode4) | ((-444796930) & i69) | (444796929 & iIdentityHashCode4))) * 1514));
            int i76 = (i74 & i75) + (i75 | i74);
            int i77 = (-999503362) & i69;
            int i78 = (i69 | (-999503362)) & (~i77);
            int i79 = ~((i78 & i77) | (i78 ^ i77));
            int i80 = (i79 & 554706432) | (554706432 ^ i79);
            int i81 = (-1147174941) & iIdentityHashCode4;
            int i82 = (iIdentityHashCode4 | (-1147174941)) & (~i81);
            int i83 = ~((i82 & i81) | (i82 ^ i81));
            int i84 = ((i83 & i80) | ((~i83) & i80) | ((~i80) & i83)) * 757;
            int i85 = (i76 ^ i84) + ((i84 & i76) << 1);
            BigInteger bigInteger2 = anrVar2.f53347q0;
            if (i68 <= i85) {
                return bigInteger2;
            }
            throw null;
        }
        if (i16 == 3) {
            anr anrVar3 = (anr) objArr[0];
            int i86 = f53344r0;
            int i87 = i86 & 57;
            int i88 = (i86 | 57) & (~i87);
            int i89 = -(-(i87 << 1));
            int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
            f53345s0 = i90 % 128;
            int i91 = i90 % 2;
            anrVar3.getClass();
            if (i91 == 0) {
                int i92 = 32 / 0;
            }
            return 0;
        }
        if (i16 != 4) {
            anr anrVar4 = (anr) objArr[0];
            int i93 = f53345s0;
            int i94 = (i93 ^ 93) + ((i93 & 93) << 1);
            f53344r0 = i94 % 128;
            int i95 = i94 % 2;
            int iHashCode = ((BigInteger) setDividerPadding(new Object[]{anrVar4}, -1862473625, 1862473627, System.identityHashCode(anrVar4))).hashCode();
            int iHashCode2 = ((BigInteger) setDividerPadding(new Object[]{anrVar4}, -1220214721, 1220214722, System.identityHashCode(anrVar4))).hashCode();
            int i96 = (~iHashCode2) & iHashCode;
            int i97 = (~iHashCode) & iHashCode2;
            int i98 = (i97 & i96) | (i96 ^ i97);
            anrVar4.getClass();
            System.identityHashCode(anrVar4);
            int i99 = -(~(i98 * 917));
            int i100 = ((i99 << 1) - i99) - 1;
            int i101 = ~i98;
            int i102 = -(~((~(i98 | i101)) * 2748));
            int i103 = ((i100 & i102) + (i102 | i100)) - 1;
            int i104 = (-1) ^ i101;
            int i105 = ((i104 & i101) | (i104 ^ i101)) * (-916);
            int i106 = ((~i105) & i103) | ((~i103) & i105);
            int i107 = (i105 & i103) << 1;
            int i108 = (i106 & i107) + (i107 | i106);
            int i109 = ~i101;
            int i110 = ~((i109 ^ i101) | (i109 & i101));
            int i111 = -(~(((i101 & i110) | (i109 & i110) | ((~i110) & i101)) * 916));
            int i112 = ((i108 ^ i111) + ((i111 & i108) << 1)) - 1;
            int i113 = f53345s0;
            int i114 = i113 & 79;
            int i115 = ((((i113 ^ 79) | i114) << 1) - (~(-((i113 | 79) & (~i114))))) - 1;
            f53344r0 = i115 % 128;
            if (i115 % 2 == 0) {
                return Integer.valueOf(i112);
            }
            throw null;
        }
        anr anrVar5 = (anr) objArr[0];
        Object obj = objArr[1];
        int i116 = f53345s0 + 63;
        int i117 = i116 % 128;
        f53344r0 = i117;
        if (i116 % 2 != 0) {
            boolean z10 = obj instanceof anr;
            throw null;
        }
        if (!(obj instanceof anr)) {
            int i118 = ((i117 & (-74)) | ((~i117) & 73)) + ((i117 & 73) << 1);
            f53345s0 = i118 % 128;
            if (i118 % 2 == 0) {
                throw null;
            }
        } else {
            anr anrVar6 = (anr) obj;
            if (((BigInteger) setDividerPadding(new Object[]{anrVar6}, -1862473625, 1862473627, System.identityHashCode(anrVar6))).equals(anrVar5.f53347q0)) {
                int i119 = f53345s0 + 37;
                f53344r0 = i119 % 128;
                int i120 = i119 % 2;
                BigInteger bigInteger3 = anrVar5.f53346p0;
                if (i120 != 0) {
                    int i121 = 44 / 0;
                    if (((BigInteger) setDividerPadding(new Object[]{anrVar6}, -1220214721, 1220214722, System.identityHashCode(anrVar6))).equals(bigInteger3)) {
                        int i122 = f53345s0;
                        int i123 = i122 & 31;
                        int i124 = ((i122 ^ 31) | i123) << 1;
                        int i125 = -((i122 | 31) & (~i123));
                        int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                        f53344r0 = i126 % 128;
                        int i127 = i126 % 2;
                        if (((Integer) setDividerPadding(new Object[]{anrVar6}, 1707218919, -1707218916, System.identityHashCode(anrVar6))).intValue() == 0) {
                            int i128 = f53345s0;
                            int i129 = ((i128 | 57) << 1) - (i128 ^ 57);
                            int i130 = i129 % 128;
                            f53344r0 = i130;
                            boolean z11 = i129 % 2 == 0;
                            int i131 = i130 & 65;
                            int i132 = (i130 ^ 65) | i131;
                            int i133 = (i131 & i132) + (i132 | i131);
                            f53345s0 = i133 % 128;
                            int i134 = i133 % 2;
                            return Boolean.valueOf(z11);
                        }
                    }
                } else if (((BigInteger) setDividerPadding(new Object[]{anrVar6}, -1220214721, 1220214722, System.identityHashCode(anrVar6))).equals(bigInteger3)) {
                    int i1210 = f53345s0;
                    int i1211 = i1210 & 31;
                    int i1212 = ((i1210 ^ 31) | i1211) << 1;
                    int i1213 = -((i1210 | 31) & (~i1211));
                    int i1214 = ((i1212 | i1213) << 1) - (i1213 ^ i1212);
                    f53344r0 = i1214 % 128;
                    int i1215 = i1214 % 2;
                    if (((Integer) setDividerPadding(new Object[]{anrVar6}, 1707218919, -1707218916, System.identityHashCode(anrVar6))).intValue() == 0) {
                        int i1216 = f53345s0;
                        int i1217 = ((i1216 | 57) << 1) - (i1216 ^ 57);
                        int i135 = i1217 % 128;
                        f53344r0 = i135;
                        if (i1217 % 2 == 0) {
                        }
                        int i136 = i135 & 65;
                        int i137 = (i135 ^ 65) | i136;
                        int i138 = (i136 & i137) + (i137 | i136);
                        f53345s0 = i138 % 128;
                        int i139 = i138 % 2;
                        return Boolean.valueOf(z11);
                    }
                }
            }
            int i140 = f53344r0;
            int i141 = i140 ^ 101;
            int i142 = ((((i140 & 101) | i141) << 1) - (~(-i141))) - 1;
            f53345s0 = i142 % 128;
            if (i142 % 2 == 0) {
                int i143 = 99 / 0;
            }
        }
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -1434585895, 1434585899, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1457334550, 1457334550, System.identityHashCode(this))).intValue();
    }
}
