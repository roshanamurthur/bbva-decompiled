package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class anw extends amw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final bep.setX f53354t0 = new bep.setX();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final BigInteger f53355u0 = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    public static final BigInteger v0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f53356w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f53357x0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f53358r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f53359s0;

    static {
        int i10 = f53356w0;
        int i11 = ((i10 ^ 70) + ((i10 & 70) << 1)) - 1;
        f53357x0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public anw(BigInteger bigInteger, BigInteger bigInteger2) {
        super(false);
        if ((bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        this.f53358r0 = f53354t0.setX(bigInteger) ? bigInteger : (BigInteger) setX(new Object[]{bigInteger, Boolean.FALSE}, -943589823, 943589823, (int) System.currentTimeMillis());
        this.f53359s0 = bigInteger2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object objValueOf;
        int i14 = (i11 * 263) + (i10 * (-523));
        int i15 = ~((~i10) | i11);
        int i16 = ~i11;
        int i17 = ~(i10 | i16);
        int i18 = ((i17 | (~(i16 | (~i12))) | i15) * 262) + (i17 * (-786)) + ((i15 | i17 | (~(i16 | i12))) * 262) + i14;
        if (i18 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i19 = f53356w0;
            int i20 = i19 ^ 69;
            int i21 = ((((i19 & 69) | i20) << 1) - (~(-i20))) - 1;
            int i22 = i21 % 128;
            f53357x0 = i22;
            int i23 = i21 % 2;
            if (iIntValue >= 1536) {
                int i24 = i19 + 33;
                f53357x0 = i24 % 128;
                int i25 = i24 % 2;
                int i26 = (i19 & (-46)) | ((~i19) & 45);
                int i27 = (i19 & 45) << 1;
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                f53357x0 = i28 % 128;
                int i29 = i28 % 2;
                objValueOf = 3;
            } else {
                if (iIntValue >= 1024) {
                    int i30 = i19 & 117;
                    int i31 = i30 + ((i19 ^ 117) | i30);
                    int i32 = i31 % 128;
                    f53357x0 = i32;
                    int i33 = i31 % 2;
                    int i34 = i32 & 55;
                    int i35 = (((i32 ^ 55) | i34) << 1) - ((i32 | 55) & (~i34));
                    f53356w0 = i35 % 128;
                    if (i35 % 2 != 0) {
                        throw null;
                    }
                    i13 = 4;
                } else if (iIntValue >= 512) {
                    int i36 = i22 ^ 65;
                    int i37 = (((i22 & 65) | i36) << 1) - i36;
                    f53356w0 = i37 % 128;
                    i13 = i37 % 2 != 0 ? 64 : 7;
                } else {
                    int i38 = i19 ^ 23;
                    int i39 = ((i19 & 23) | i38) << 1;
                    int i40 = -i38;
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    f53357x0 = i41 % 128;
                    if (i41 % 2 == 0) {
                        throw null;
                    }
                    i13 = 50;
                }
                objValueOf = Integer.valueOf(i13);
            }
        } else if (i18 == 2) {
            anw anwVar = (anw) objArr[0];
            int i42 = f53356w0;
            int i43 = i42 & 97;
            int i44 = (i43 - (~((i42 ^ 97) | i43))) - 1;
            int i45 = i44 % 128;
            f53357x0 = i45;
            int i46 = i44 % 2;
            objValueOf = anwVar.f53359s0;
            if (i46 == 0) {
                throw null;
            }
            int i47 = i45 & 121;
            int i48 = (i45 | 121) & (~i47);
            int i49 = i47 << 1;
            int i50 = (i48 & i49) + (i48 | i49);
            f53356w0 = i50 % 128;
            if (i50 % 2 != 0) {
                int i51 = 84 / 0;
            }
        } else {
            if (i18 != 3) {
                BigInteger bigInteger = (BigInteger) objArr[0];
                ((Boolean) objArr[1]).booleanValue();
                int i52 = f53357x0;
                int i53 = i52 & 3;
                int i54 = (i52 | 3) & (~i53);
                int i55 = -(-(i53 << 1));
                int i56 = (i54 & i55) + (i54 | i55);
                f53356w0 = i56 % 128;
                if (i56 % 2 != 0) {
                    bigInteger.intValue();
                } else if ((bigInteger.intValue() & 1) != 0) {
                    if (((Boolean) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.rsa.allow_unsafe_mod"}, 1196176667, -1196176666, (int) System.currentTimeMillis())).booleanValue()) {
                        int i57 = f53357x0;
                        int i58 = i57 ^ 25;
                        int i59 = -(-((i57 & 25) << 1));
                        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                        int i61 = i60 % 128;
                        f53356w0 = i61;
                        int i62 = i60 % 2;
                        int i63 = i61 & 101;
                        int i64 = (i61 | 101) & (~i63);
                        int i65 = i63 << 1;
                        int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
                        f53357x0 = i66 % 128;
                        if (i66 % 2 != 0) {
                            return bigInteger;
                        }
                        int i67 = 86 / 0;
                        return bigInteger;
                    }
                    if (((Integer) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.rsa.max_size", 15360}, 1567609481, -1567609476, 15360)).intValue() < bigInteger.bitLength()) {
                        throw new IllegalArgumentException("modulus value out of range");
                    }
                    if (!bigInteger.gcd(f53355u0).equals(v0)) {
                        throw new IllegalArgumentException("RSA modulus has a small prime factor");
                    }
                    int iBitLength = bigInteger.bitLength() / 2;
                    int iIntValue2 = ((Integer) setX(new Object[]{Integer.valueOf(iBitLength)}, 1059682335, -1059682334, iBitLength)).intValue();
                    int iIntValue3 = ((Integer) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.rsa.max_mr_tests", Integer.valueOf(iIntValue2)}, 1567609481, -1567609476, iIntValue2)).intValue();
                    if (iIntValue3 > 0) {
                        int i68 = f53356w0;
                        int i69 = ((i68 ^ 93) | (i68 & 93)) << 1;
                        int i70 = -(((~i68) & 93) | (i68 & (-94)));
                        int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                        f53357x0 = i71 % 128;
                        if (i71 % 2 == 0) {
                            apg.setX setx = (apg.setX) apg.setOnFocusChangeListener(new Object[]{bigInteger, (SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis()), Integer.valueOf(iIntValue3)}, 1367544983, -1367544983, iIntValue3);
                            ((Boolean) apg.setX.setCompoundDrawableTintBlendMode(new Object[]{setx}, -2000342845, 2000342845, System.identityHashCode(setx))).booleanValue();
                            throw null;
                        }
                        apg.setX setx2 = (apg.setX) apg.setOnFocusChangeListener(new Object[]{bigInteger, (SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis()), Integer.valueOf(iIntValue3)}, 1367544983, -1367544983, iIntValue3);
                        if (!((Boolean) apg.setX.setCompoundDrawableTintBlendMode(new Object[]{setx2}, -2000342845, 2000342845, System.identityHashCode(setx2))).booleanValue()) {
                            throw new IllegalArgumentException("RSA modulus is not composite");
                        }
                    }
                    f53354t0.setY(bigInteger);
                    int i72 = f53357x0;
                    int i73 = (i72 | 57) << 1;
                    int i74 = -(i72 ^ 57);
                    int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                    f53356w0 = i75 % 128;
                    if (i75 % 2 == 0) {
                        return bigInteger;
                    }
                    throw null;
                }
                throw new IllegalArgumentException("RSA modulus is even");
            }
            anw anwVar2 = (anw) objArr[0];
            int i76 = f53357x0;
            int i77 = ((i76 | 109) << 1) - (i76 ^ 109);
            f53356w0 = i77 % 128;
            int i78 = i77 % 2;
            objValueOf = anwVar2.f53358r0;
            if (i78 != 0) {
                throw null;
            }
            int i79 = ((i76 ^ 13) | (i76 & 13)) << 1;
            int i80 = -(((~i76) & 13) | (i76 & (-14)));
            int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
            f53356w0 = i81 % 128;
            int i82 = i81 % 2;
        }
        return objValueOf;
    }

    public final BigInteger setDividerPadding() {
        return (BigInteger) setX(new Object[]{this}, -674276868, 674276871, System.identityHashCode(this));
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setX(new Object[]{this}, -782811276, 782811278, System.identityHashCode(this));
    }
}
