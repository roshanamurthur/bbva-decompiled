package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class apx extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53546g = apz.setOnLongClickListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f53547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BigInteger f53548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f53549j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f53550k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final apv f53551f;

    static {
        BigInteger bigInteger = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        f53547h = bigInteger;
        f53548i = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        new apz(apj.setOnFocusChangeListener);
        new apz(bigInteger);
        int i10 = f53550k;
        int i11 = (i10 ^ 121) + ((i10 & 121) << 1);
        f53549j = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public apx() {
        super(f53546g);
        this.f53551f = new apv(this, null, null);
        this.setX = setOnFocusChangeListener(f53547h);
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(f53548i);
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(8L);
        this.setDividerPadding = 4;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        switch ((((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167))) {
            case 1:
                apv apvVar = new apv((apx) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i15 = f53550k + 7;
                f53549j = i15 % 128;
                int i16 = i15 % 2;
                return apvVar;
            case 2:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i17 = f53550k;
                int i18 = i17 & 121;
                int i19 = ((i17 ^ 121) | i18) << 1;
                int i20 = -((~i18) & (i17 | 121));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                f53549j = i21 % 128;
                int i22 = i21 % 2;
                if (iIntValue != 4) {
                    int i23 = i17 ^ 21;
                    int i24 = -(-((i17 & 21) << 1));
                    int i25 = (i23 & i24) + (i23 | i24);
                    f53549j = i25 % 128;
                    int i26 = i25 % 2;
                    return Boolean.FALSE;
                }
                int i27 = ((i17 ^ 93) | (i17 & 93)) << 1;
                int i28 = -(((~i17) & 93) | (i17 & (-94)));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                f53549j = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.TRUE;
            case 3:
                int i31 = f53550k + 83;
                f53549j = i31 % 128;
                int i32 = i31 % 2;
                int iBitLength = f53546g.bitLength();
                int i33 = f53549j;
                int i34 = i33 & 81;
                int i35 = (i33 | 81) & (~i34);
                int i36 = -(-(i34 << 1));
                int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                f53550k = i37 % 128;
                if (i37 % 2 != 0) {
                    return Integer.valueOf(iBitLength);
                }
                throw null;
            case 4:
                apx apxVar = (apx) objArr[0];
                int i38 = f53549j + 111;
                int i39 = i38 % 128;
                f53550k = i39;
                int i40 = i38 % 2;
                apv apvVar2 = apxVar.f53551f;
                int i41 = ((i39 & 85) - (~(i39 | 85))) - 1;
                f53549j = i41 % 128;
                if (i41 % 2 == 0) {
                    return apvVar2;
                }
                int i42 = 16 / 0;
                return apvVar2;
            case 5:
                apz apzVar = new apz((BigInteger) objArr[1]);
                int i43 = f53549j + 7;
                f53550k = i43 % 128;
                if (i43 % 2 == 0) {
                    int i44 = 36 / 0;
                }
                return apzVar;
            case 6:
                apx apxVar2 = new apx();
                int i45 = f53550k;
                int i46 = i45 ^ 29;
                int i47 = ((((i45 & 29) | i46) << 1) - (~(-i46))) - 1;
                f53549j = i47 % 128;
                int i48 = i47 % 2;
                return apxVar2;
            default:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{secureRandom, iArr}, -697595785, 697595801, (int) System.currentTimeMillis());
                apz apzVar2 = new apz(iArr);
                int i49 = f53549j;
                int i50 = ((i49 ^ 66) + ((i49 & 66) << 1)) - 1;
                f53550k = i50 % 128;
                int i51 = i50 % 2;
                return apzVar2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, -1090811054, 1090811060, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setOnFocusChangeListener(new Object[]{this, apkVar, apkVar2}, 1272789094, -1272789093, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setOnFocusChangeListener(new Object[]{this, secureRandom}, -2026034731, 2026034731, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 1077736455, -1077736453, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, -800892688, 800892692, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setOnFocusChangeListener(new Object[]{this, bigInteger}, -39051670, 39051675, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1145020547, -1145020544, System.identityHashCode(this))).intValue();
    }
}
