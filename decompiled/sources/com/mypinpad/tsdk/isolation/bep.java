package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class bep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54644b = 1;
    public static final BigInteger setCompoundDrawableTintBlendMode = BigInteger.valueOf(0);
    public static final BigInteger setY = BigInteger.valueOf(1);

    public static class setX {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f54645d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f54646e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap f54647a = new WeakHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigInteger[] f54648b = new BigInteger[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54649c = 0;

        public final synchronized boolean setX(BigInteger bigInteger) {
            boolean zContainsKey;
            int i10 = f54645d + 93;
            f54646e = i10 % 128;
            if (i10 % 2 == 0) {
                this.f54647a.containsKey(bigInteger);
                throw null;
            }
            zContainsKey = this.f54647a.containsKey(bigInteger);
            int i11 = f54645d;
            int i12 = (-2) - ((((i11 | 24) << 1) - (i11 ^ 24)) ^ (-1));
            f54646e = i12 % 128;
            int i13 = i12 % 2;
            return zContainsKey;
        }

        public final synchronized void setY(BigInteger bigInteger) {
            int i10 = f54645d;
            int i11 = ((i10 | 65) << 1) - (i10 ^ 65);
            f54646e = i11 % 128;
            int i12 = i11 % 2;
            this.f54647a.put(bigInteger, Boolean.TRUE);
            BigInteger[] bigIntegerArr = this.f54648b;
            int i13 = this.f54649c;
            bigIntegerArr[i13] = bigInteger;
            this.f54649c = (i13 + 1) % bigIntegerArr.length;
            int i14 = f54646e;
            int i15 = ((i14 ^ 33) | (i14 & 33)) << 1;
            int i16 = -(((~i14) & 33) | (i14 & (-34)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f54645d = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    static {
        BigInteger.valueOf(2L);
        BigInteger.valueOf(3L);
        new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
        BigInteger.valueOf(743L).bitLength();
        int i10 = f54644b;
        int i11 = i10 & 19;
        int i12 = -(-(i10 | 19));
        int i13 = (i11 & i12) + (i12 | i11);
        f54643a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x062f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x033b  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        BigInteger bigInteger;
        BigInteger bigIntegerAdd;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = (i15 * 677) + (i11 * (-676)) + (i10 * 678);
        int i17 = ~i11;
        int i18 = 0;
        switch (((~(i10 | i17)) * 677) + ((i15 | i17) * (-677)) + i16) {
            case 1:
                int iIntValue = ((Number) objArr[0]).intValue();
                bigInteger = new BigInteger(1, (byte[]) setDividerPadding(new Object[]{Integer.valueOf(iIntValue), (SecureRandom) objArr[1]}, -267492683, 267492688, iIntValue));
                int i19 = f54643a;
                int i20 = (i19 & 23) + (i19 | 23);
                f54644b = i20 % 128;
                int i21 = i20 % 2;
                break;
            case 2:
                byte[] bArr = (byte[]) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i22 = f54643a;
                int i23 = i22 & 71;
                int i24 = ((i22 ^ 71) | i23) << 1;
                int i25 = -((~i23) & (i22 | 71));
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                f54644b = i26 % 128;
                int i27 = i26 % 2;
                if (iIntValue2 == 0) {
                    int i28 = i22 & 75;
                    int i29 = (i22 ^ 75) | i28;
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    f54644b = i30 % 128;
                    int i31 = i30 % 2;
                    int length = bArr.length;
                    if (i31 == 0) {
                        int i32 = 62 / 0;
                        if (iIntValue3 != length) {
                            byte[] bArr2 = new byte[iIntValue3];
                            System.arraycopy(bArr, iIntValue2, bArr2, 0, iIntValue3);
                            int i33 = (-2) - ((f54644b + 74) ^ (-1));
                            f54643a = i33 % 128;
                            int i34 = i33 % 2;
                            bArr = bArr2;
                        }
                    } else if (iIntValue3 != length) {
                        byte[] bArr3 = new byte[iIntValue3];
                        System.arraycopy(bArr, iIntValue2, bArr3, 0, iIntValue3);
                        int i35 = (-2) - ((f54644b + 74) ^ (-1));
                        f54643a = i35 % 128;
                        int i36 = i35 % 2;
                        bArr = bArr3;
                    }
                } else {
                    byte[] bArr4 = new byte[iIntValue3];
                    System.arraycopy(bArr, iIntValue2, bArr4, 0, iIntValue3);
                    int i37 = (-2) - ((f54644b + 74) ^ (-1));
                    f54643a = i37 % 128;
                    int i38 = i37 % 2;
                    bArr = bArr4;
                }
                BigInteger bigInteger2 = new BigInteger(1, bArr);
                int i39 = f54644b;
                int i40 = ((i39 | 55) << 1) - (i39 ^ 55);
                f54643a = i40 % 128;
                int i41 = i40 % 2;
                return bigInteger2;
            case 3:
                BigInteger bigInteger3 = (BigInteger) objArr[0];
                BigInteger bigInteger4 = (BigInteger) objArr[1];
                SecureRandom secureRandom = (SecureRandom) objArr[2];
                int i42 = f54643a;
                int i43 = i42 & 121;
                int i44 = ((i42 | 121) & (~i43)) + (i43 << 1);
                f54644b = i44 % 128;
                if (i44 % 2 == 0) {
                    bigInteger3.compareTo(bigInteger4);
                    throw null;
                }
                int iCompareTo = bigInteger3.compareTo(bigInteger4);
                if (iCompareTo >= 0) {
                    if (iCompareTo > 0) {
                        throw new IllegalArgumentException("'min' may not be greater than 'max'");
                    }
                    int i45 = f54643a;
                    int i46 = i45 & 87;
                    int i47 = i46 + ((i45 ^ 87) | i46);
                    f54644b = i47 % 128;
                    if (i47 % 2 != 0) {
                        return bigInteger3;
                    }
                    throw null;
                }
                if (bigInteger3.bitLength() > bigInteger4.bitLength() / 2) {
                    int i48 = f54644b;
                    int i49 = ((i48 | 54) << 1) - (i48 ^ 54);
                    int i50 = (i49 ^ (-1)) + (i49 << 1);
                    f54643a = i50 % 128;
                    int i51 = i50 % 2;
                    bigIntegerAdd = ((BigInteger) setDividerPadding(new Object[]{setCompoundDrawableTintBlendMode, bigInteger4.subtract(bigInteger3), secureRandom}, -1670582261, 1670582264, (int) System.currentTimeMillis())).add(bigInteger3);
                    int i52 = f54643a;
                    int i53 = (i52 & (-112)) | ((~i52) & 111);
                    int i54 = (i52 & 111) << 1;
                    i13 = (i53 & i54) + (i54 | i53);
                    f54644b = i13 % 128;
                } else {
                    int i55 = f54643a;
                    int i56 = (i55 & (-68)) | ((~i55) & 67);
                    int i57 = (i55 & 67) << 1;
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f54644b = i58 % 128;
                    int i59 = i58 % 2;
                    int i60 = 0;
                    while (i60 < 1000) {
                        int i61 = f54643a;
                        int i62 = (i61 ^ 59) + ((i61 & 59) << 1);
                        f54644b = i62 % 128;
                        int i63 = i62 % 2;
                        int iBitLength = bigInteger4.bitLength();
                        bigInteger = (BigInteger) setDividerPadding(new Object[]{Integer.valueOf(iBitLength), secureRandom}, 948832868, -948832867, iBitLength);
                        if (bigInteger.compareTo(bigInteger3) >= 0) {
                            int i64 = f54644b;
                            int i65 = (i64 & 7) + (i64 | 7);
                            f54643a = i65 % 128;
                            if (i65 % 2 != 0) {
                                bigInteger.compareTo(bigInteger4);
                                throw null;
                            }
                            if (bigInteger.compareTo(bigInteger4) <= 0) {
                                int i66 = f54644b;
                                int i67 = (i66 & 19) + (i66 | 19);
                                f54643a = i67 % 128;
                                if (i67 % 2 != 0) {
                                    throw null;
                                }
                            }
                        }
                        int i68 = (i60 & 115) + (i60 | 115);
                        i60 = ((i68 | (-114)) << 1) - (i68 ^ (-114));
                        int i69 = f54643a;
                        int i70 = i69 & 29;
                        int i71 = (i70 - (~(-(-((i69 ^ 29) | i70))))) - 1;
                        f54644b = i71 % 128;
                        int i72 = i71 % 2;
                    }
                    int iBitLength2 = bigInteger4.subtract(bigInteger3).bitLength();
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i73 = -(-(iBitLength2 * Opcodes.INSTANCEOF));
                    int i74 = ((-193) & i73) + (i73 | (-193));
                    int i75 = ~iCurrentTimeMillis;
                    int i76 = ~iBitLength2;
                    int i77 = i75 & i76;
                    int i78 = (i76 | i75) & (~i77);
                    int i79 = -(-(((i78 & i77) | (i78 ^ i77)) * (-192)));
                    int i80 = i74 & i79;
                    int i81 = -(-((i79 ^ i74) | i80));
                    int i82 = (i80 & i81) + (i81 | i80);
                    int i83 = ~iBitLength2;
                    int i84 = (i83 | iBitLength2) & i83;
                    int i85 = ~i84;
                    int i86 = (i84 | i85) & i85;
                    int i87 = i83 ^ i75;
                    int i88 = ~i75;
                    int i89 = i83 & i75;
                    int i90 = (i87 & i89) | (i87 ^ i89);
                    int i91 = ~i90;
                    int i92 = (i90 | i91) & i91;
                    int i93 = i86 & i92;
                    int i94 = (~i93) & (i86 | i92);
                    int i95 = ((i94 & i93) | (i94 ^ i93)) * (-384);
                    int i96 = ((i82 & i95) - (~(-(-(i95 | i82))))) - 1;
                    int i97 = (i83 ^ iCurrentTimeMillis) | (i83 & iCurrentTimeMillis);
                    int i98 = ~i97;
                    int i99 = (i97 | i98) & i98;
                    int i100 = (i75 & (~i83)) | (i83 & i88);
                    int i101 = (i100 & i89) | (i100 ^ i89);
                    int i102 = ~i101;
                    int i103 = (i101 & i102) | (i102 ^ i101);
                    int i104 = ~i103;
                    int i105 = (i103 | i104) & i104;
                    int i106 = i99 & i105;
                    int i107 = ((i105 | i99) & (~i106)) | i106;
                    int i108 = iBitLength2 | ((-1) ^ iBitLength2);
                    int i109 = i108 & iCurrentTimeMillis;
                    int i110 = (i108 | iCurrentTimeMillis) & (~i109);
                    int i111 = ~((i110 & i109) | (i110 ^ i109));
                    int i112 = i107 & i111;
                    int i113 = (i111 | i107) & (~i112);
                    int i114 = -(-(((i113 & i112) | (i113 ^ i112)) * 192));
                    int i115 = (i96 & i114) + (i114 | i96);
                    bigIntegerAdd = ((BigInteger) setDividerPadding(new Object[]{Integer.valueOf(i115), secureRandom}, 948832868, -948832867, i115)).add(bigInteger3);
                    int i116 = f54644b;
                    int i117 = i116 ^ 107;
                    int i118 = ((i116 & 107) | i117) << 1;
                    int i119 = -i117;
                    i13 = (i118 ^ i119) + ((i118 & i119) << 1);
                    f54643a = i13 % 128;
                }
                int i120 = i13 % 2;
                return bigIntegerAdd;
            case 4:
                BigInteger bigInteger5 = (BigInteger) objArr[0];
                BigInteger bigIntegerMod = (BigInteger) objArr[1];
                int i121 = f54643a + 29;
                f54644b = i121 % 128;
                if (i121 % 2 != 0 ? !bigInteger5.testBit(0) : !bigInteger5.testBit(0)) {
                    throw new IllegalArgumentException("'M' must be odd");
                }
                if (bigInteger5.signum() != 1) {
                    throw new ArithmeticException("BigInteger: modulus not positive");
                }
                if (bigIntegerMod.signum() >= 0) {
                    int i122 = f54644b;
                    int i123 = i122 & 11;
                    int i124 = ((i122 | 11) & (~i123)) + (i123 << 1);
                    f54643a = i124 % 128;
                    int i125 = i124 % 2;
                    if (bigIntegerMod.compareTo(bigInteger5) >= 0) {
                        bigIntegerMod = bigIntegerMod.mod(bigInteger5);
                        int i126 = f54644b;
                        int i127 = i126 & 87;
                        int i128 = (i126 | 87) & (~i127);
                        int i129 = -(-(i127 << 1));
                        int i130 = ((i128 | i129) << 1) - (i128 ^ i129);
                        f54643a = i130 % 128;
                        i14 = 2;
                        int i131 = i130 % 2;
                    } else {
                        i14 = 2;
                    }
                } else {
                    bigIntegerMod = bigIntegerMod.mod(bigInteger5);
                    int i1210 = f54644b;
                    int i1211 = i1210 & 87;
                    int i1212 = (i1210 | 87) & (~i1211);
                    int i1213 = -(-(i1211 << 1));
                    int i132 = ((i1212 | i1213) << 1) - (i1212 ^ i1213);
                    f54643a = i132 % 128;
                    i14 = 2;
                    int i133 = i132 % 2;
                }
                int iBitLength3 = bigInteger5.bitLength();
                Object[] objArr2 = new Object[i14];
                objArr2[0] = Integer.valueOf(iBitLength3);
                objArr2[1] = bigInteger5;
                int[] iArr = (int[]) auy.setOnFocusChangeListener(objArr2, 1842671690, -1842671680, iBitLength3);
                Object[] objArr3 = new Object[i14];
                objArr3[0] = Integer.valueOf(iBitLength3);
                objArr3[1] = bigIntegerMod;
                int[] iArr2 = (int[]) auy.setOnFocusChangeListener(objArr3, 1842671690, -1842671680, iBitLength3);
                int length2 = iArr.length;
                int[] iArr3 = (int[]) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(length2)}, 1950542281, -1950542250, length2);
                if (((Integer) ava.setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 754311344, -754311332, (int) System.currentTimeMillis())).intValue() == 0) {
                    throw new ArithmeticException("BigInteger not invertible.");
                }
                BigInteger bigInteger6 = (BigInteger) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(length2), iArr3}, 218333483, -218333460, length2);
                int i134 = f54643a + 79;
                f54644b = i134 % 128;
                if (i134 % 2 != 0) {
                    return bigInteger6;
                }
                throw null;
            case 5:
                int iIntValue4 = ((Number) objArr[0]).intValue();
                SecureRandom secureRandom2 = (SecureRandom) objArr[1];
                int i135 = f54644b + 43;
                f54643a = i135 % 128;
                if (i135 % 2 != 0) {
                    throw null;
                }
                if (iIntValue4 <= 0) {
                    throw new IllegalArgumentException("bitLength must be at least 1");
                }
                int i136 = (((iIntValue4 | 7) << 1) - (iIntValue4 ^ 7)) / 8;
                byte[] bArr5 = new byte[i136];
                secureRandom2.nextBytes(bArr5);
                int i137 = i136 << 3;
                int i138 = -iIntValue4;
                int i139 = i138 * (-661);
                int i140 = -(-(i137 * (-661)));
                int i141 = ((((~i140) & i139) | ((~i139) & i140)) - (~(-(-((i139 & i140) << 1))))) - 1;
                int i142 = ~iIntValue4;
                int i143 = ~i138;
                int i144 = ~i137;
                int i145 = ~(i143 | i144);
                int i146 = i142 ^ i145;
                int i147 = i142 & i145;
                int i148 = ((i147 & i146) | (i146 ^ i147)) * 1324;
                int i149 = ((~i148) & i141) | ((~i141) & i148);
                int i150 = (i148 & i141) << 1;
                int i151 = ((i149 | i150) << 1) - (i150 ^ i149);
                int i152 = i138 ^ iIntValue4;
                int i153 = i138 & iIntValue4;
                int i154 = ~((i152 & i153) | (i152 ^ i153));
                int i155 = i137 ^ iIntValue4;
                int i156 = iIntValue4 & i137;
                int i157 = ~((i156 & i155) | (i155 ^ i156));
                int i158 = i154 & i157;
                int i159 = (i157 | i154) & (~i158);
                int i160 = -(-(((i159 & i158) | (i159 ^ i158)) * (-1324)));
                int i161 = i151 | i160;
                int i162 = i161 << 1;
                int i163 = -((~(i160 & i151)) & i161);
                int i164 = (i162 ^ i163) + ((i163 & i162) << 1);
                int i165 = (i143 | i138) & i143;
                int i166 = (i165 & i144) | ((~i165) & i137);
                int i167 = i165 & i137;
                int i168 = ~((i167 & i166) | (i166 ^ i167));
                int i169 = i144 | i138;
                int i170 = ~i169;
                int i171 = (i169 | i170) & i170;
                int i172 = i168 & i171;
                int i173 = (i168 | i171) & (~i172);
                int i174 = -(-(((i173 & i172) | (i173 ^ i172)) * 662));
                int i175 = i164 & i174;
                int i176 = (i174 | i164) & (~i175);
                int i177 = -(-(i175 << 1));
                bArr5[0] = (byte) (bArr5[0] & ((byte) (255 >>> ((i176 ^ i177) + ((i176 & i177) << 1)))));
                int i178 = f54643a + 121;
                f54644b = i178 % 128;
                if (i178 % 2 != 0) {
                    return bArr5;
                }
                throw null;
            case 6:
                int iIntValue5 = ((Number) objArr[0]).intValue();
                BigInteger bigInteger7 = (BigInteger) objArr[1];
                int i179 = f54644b;
                int i180 = (i179 ^ 103) + ((i179 & 103) << 1);
                f54643a = i180 % 128;
                if (i180 % 2 != 0) {
                    int length3 = bigInteger7.toByteArray().length;
                    throw null;
                }
                byte[] byteArray = bigInteger7.toByteArray();
                if (byteArray.length == iIntValue5) {
                    int i181 = f54643a;
                    int i182 = (i181 | 83) << 1;
                    int i183 = -(((~i181) & 83) | (i181 & (-84)));
                    int i184 = ((i182 | i183) << 1) - (i183 ^ i182);
                    f54644b = i184 % 128;
                    int i185 = i184 % 2;
                    return byteArray;
                }
                if (byteArray[0] == 0) {
                    int i186 = f54644b;
                    int i187 = (i186 ^ 39) + ((i186 & 39) << 1);
                    f54643a = i187 % 128;
                    if (i187 % 2 == 0 ? byteArray.length == 1 : byteArray.length == 0) {
                        int i188 = f54643a + 85;
                        f54644b = i188 % 128;
                        int i189 = i188 % 2;
                    } else {
                        int i190 = (i186 ^ 25) + ((i186 & 25) << 1);
                        int i191 = i190 % 128;
                        f54643a = i191;
                        int i192 = i190 % 2;
                        int i193 = (((i191 | 57) << 1) - (~(-(i191 ^ 57)))) - 1;
                        f54644b = i193 % 128;
                        int i194 = i193 % 2;
                        i18 = 1;
                    }
                } else {
                    int i1810 = f54643a + 85;
                    f54644b = i1810 % 128;
                    int i1811 = i1810 % 2;
                }
                int length4 = byteArray.length;
                int i195 = -i18;
                int i196 = i195 * 236;
                int i197 = -(-(length4 * 471));
                int i198 = ((i196 | i197) << 1) - (i196 ^ i197);
                int i199 = ~i195;
                int i200 = ~iIntValue5;
                int i201 = ~(i199 | i200);
                int i202 = length4 & i201;
                int i203 = (i201 | length4) & (~i202);
                int i204 = -(~(((i203 & i202) | (i203 ^ i202)) * (-235)));
                int i205 = (i198 & i204) + (i198 | i204);
                int i206 = (i205 ^ (-1)) + (i205 << 1);
                int i207 = i199 & iIntValue5;
                int i208 = (~i207) & (i199 | iIntValue5);
                int i209 = (i207 & i208) | (i208 ^ i207);
                int i210 = ~i209;
                int i211 = (i209 | i210) & i210;
                int i212 = length4 ^ i211;
                int i213 = i211 & length4;
                int i214 = -(-(((i213 & i212) | (i212 ^ i213)) * (-470)));
                int i215 = i206 & i214;
                int i216 = ((i206 ^ i214) | i215) << 1;
                int i217 = -((i206 | i214) & (~i215));
                int i218 = (i216 & i217) + (i217 | i216);
                int i219 = ~length4;
                int i220 = (i219 & i199) | ((~i219) & i195);
                int i221 = i219 & i195;
                int i222 = (i221 & i220) | (i220 ^ i221);
                int i223 = ~i222;
                int i224 = (i222 | i223) & i223;
                int i225 = (i195 | i199) & i199;
                int i226 = (length4 & i225) | (i225 ^ length4);
                int i227 = i226 & iIntValue5;
                int i228 = ~(((i226 | iIntValue5) & (~i227)) | i227);
                int i229 = ((i228 & i224) | ((~i228) & i224) | ((~i224) & i228)) * 235;
                int i230 = (i218 ^ i229) + ((i229 & i218) << 1);
                if (i230 > iIntValue5) {
                    throw new IllegalArgumentException("standard length exceeded for value");
                }
                byte[] bArr6 = new byte[iIntValue5];
                int i231 = -i230;
                int i232 = i231 * (-496);
                int i233 = -(-(iIntValue5 * (-496)));
                int i234 = i232 & i233;
                int i235 = (i234 - (~(-(-((i232 ^ i233) | i234))))) - 1;
                int i236 = ~i231;
                int i237 = (i236 | i231) & i236;
                int i238 = (~((i237 & i200) | (i237 ^ i200))) * 497;
                int i239 = i235 | i238;
                int i240 = i239 << 1;
                int i241 = -((~(i238 & i235)) & i239);
                int i242 = (i240 ^ i241) + ((i241 & i240) << 1);
                int i243 = (i200 | iIntValue5) & i200;
                int i244 = i236 & i243;
                int i245 = (~i244) & (i236 | i243);
                int i246 = ~((i245 ^ i244) | (i245 & i244) | iIntValue5);
                int i247 = i243 & i200;
                int i248 = (~i247) & (i243 | i200);
                int i249 = (i248 ^ i247) | (i247 & i248);
                int i250 = ((~i249) & i231) | (i249 & i236);
                int i251 = i249 & i231;
                int i252 = ~((i251 & i250) | (i250 ^ i251));
                int i253 = i246 ^ i252;
                int i254 = i252 & i246;
                int i255 = ((i254 & i253) | (i253 ^ i254)) * 497;
                int i256 = (i242 & i255) + (i255 | i242);
                int i257 = ~i243;
                int i258 = ~i236;
                int i259 = ~((i236 & i257) | (i243 & i258) | i244);
                int i260 = (i200 & i236) | (i258 & iIntValue5);
                int i261 = i236 & iIntValue5;
                int i262 = (i260 & i261) | (i260 ^ i261);
                int i263 = ~i262;
                int i264 = (i262 | i263) & i263;
                int i265 = i259 ^ i264;
                int i266 = i259 & i264;
                int i267 = (i266 & i265) | (i265 ^ i266);
                int i268 = (i257 & i231) | i244;
                int i269 = i231 & i243;
                int i270 = (i268 & i269) | (i268 ^ i269);
                int i271 = i270 ^ iIntValue5;
                int i272 = iIntValue5 & i270;
                int i273 = (i272 & i271) | (i271 ^ i272);
                int i274 = ~i273;
                int i275 = (i273 | i274) & i274;
                int i276 = i267 & i275;
                int i277 = -(~(-(-((((i275 | i267) & (~i276)) | i276) * 497))));
                int i278 = (i256 ^ i277) + ((i277 & i256) << 1);
                System.arraycopy(byteArray, i18, bArr6, (i278 ^ (-1)) + (i278 << 1), i230);
                int i279 = f54643a;
                int i280 = (-2) - ((-1) ^ (((i279 | 42) << 1) - (i279 ^ 42)));
                f54644b = i280 % 128;
                if (i280 % 2 != 0) {
                    return bArr6;
                }
                throw null;
            default:
                BigInteger bigInteger8 = (BigInteger) objArr[0];
                int i281 = f54644b;
                int i282 = (((i281 ^ 121) | (i281 & 121)) << 1) - (((~i281) & 121) | (i281 & (-122)));
                f54643a = i282 % 128;
                int i283 = i282 % 2;
                int iBitLength4 = bigInteger8.bitLength();
                if (i283 == 0 ? iBitLength4 > 31 : iBitLength4 > 3) {
                    throw new ArithmeticException("BigInteger out of int range");
                }
                int iIntValue6 = bigInteger8.intValue();
                int i284 = f54643a + 67;
                f54644b = i284 % 128;
                if (i284 % 2 == 0) {
                    int i285 = 14 / 0;
                }
                return Integer.valueOf(iIntValue6);
        }
        return bigInteger;
    }

    public static BigInteger setOnFocusChangeListener(int i10, SecureRandom secureRandom) {
        return (BigInteger) setDividerPadding(new Object[]{Integer.valueOf(i10), secureRandom}, 948832868, -948832867, i10);
    }

    public static int setX(BigInteger bigInteger) {
        return ((Integer) setDividerPadding(new Object[]{bigInteger}, -1431901371, 1431901371, (int) System.currentTimeMillis())).intValue();
    }

    public static BigInteger setY(byte[] bArr, int i10, int i11) {
        return (BigInteger) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1740367673, 1740367675, i10);
    }

    public static byte[] setOnFocusChangeListener(int i10, BigInteger bigInteger) {
        return (byte[]) setDividerPadding(new Object[]{Integer.valueOf(i10), bigInteger}, -602888520, 602888526, i10);
    }

    public static BigInteger setY(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return (BigInteger) setDividerPadding(new Object[]{bigInteger, bigInteger2, secureRandom}, -1670582261, 1670582264, (int) System.currentTimeMillis());
    }

    public static BigInteger setDividerPadding(BigInteger bigInteger, BigInteger bigInteger2) {
        return (BigInteger) setDividerPadding(new Object[]{bigInteger, bigInteger2}, -906767090, 906767094, (int) System.currentTimeMillis());
    }
}
