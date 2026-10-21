package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ati extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53821g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53822h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atk f53823f;

    static {
        new atj(apj.setOnFocusChangeListener);
        int i10 = f53821g;
        int i11 = ((i10 ^ 64) + ((i10 & 64) << 1)) - 1;
        f53822h = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public ati() {
        super(283, 5, 7, 12);
        this.f53823f = new atk(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(0L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(4L);
        this.setDividerPadding = 6;
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i15 | i17;
        int i19 = (((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13;
        if (i19 == 1) {
            int i20 = f53821g;
            int i21 = ((i20 ^ 41) - (~((i20 & 41) << 1))) - 1;
            int i22 = i21 % 128;
            f53822h = i22;
            int i23 = i21 % 2;
            int i24 = ((-1) << 1) - (((i22 ^ 4) + ((i22 & 4) << 1)) ^ (-1));
            f53821g = i24 % 128;
            int i25 = i24 % 2;
            return 283;
        }
        if (i19 == 2) {
            atk atkVar = new atk((ati) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i26 = f53822h + 53;
            f53821g = i26 % 128;
            int i27 = i26 % 2;
            return atkVar;
        }
        if (i19 == 3) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i28 = f53822h;
            int i29 = (-2) - ((-1) ^ (i28 + 110));
            int i30 = i29 % 128;
            f53821g = i30;
            if (i29 % 2 != 0) {
                throw null;
            }
            if (iIntValue != 6) {
                int i31 = i30 & 45;
                int i32 = ((i30 ^ 45) | i31) << 1;
                int i33 = -((~i31) & (i30 | 45));
                int i34 = (i32 & i33) + (i32 | i33);
                f53822h = i34 % 128;
                int i35 = i34 % 2;
                obj = Boolean.FALSE;
            } else {
                int i36 = ((i28 ^ 17) | (i28 & 17)) << 1;
                int i37 = -(((~i28) & 17) | (i28 & (-18)));
                int i38 = (i36 & i37) + (i36 | i37);
                f53821g = i38 % 128;
                if (i38 % 2 != 0) {
                    throw null;
                }
                obj = Boolean.TRUE;
            }
        } else {
            if (i19 != 4) {
                if (i19 != 5) {
                    atj atjVar = new atj((BigInteger) objArr[1]);
                    int i39 = f53822h;
                    int i40 = (i39 & 29) + (i39 | 29);
                    f53821g = i40 % 128;
                    int i41 = i40 % 2;
                    return atjVar;
                }
                ati atiVar = new ati();
                int i42 = f53822h;
                int i43 = i42 & 37;
                int i44 = -(-((i42 ^ 37) | i43));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                f53821g = i45 % 128;
                int i46 = i45 % 2;
                return atiVar;
            }
            ati atiVar2 = (ati) objArr[0];
            int i47 = f53821g;
            int i48 = (((i47 ^ 51) | (i47 & 51)) << 1) - ((i47 & (-52)) | ((~i47) & 51));
            f53822h = i48 % 128;
            int i49 = i48 % 2;
            obj = atiVar2.f53823f;
            int i50 = i47 & 93;
            int i51 = ((((i47 ^ 93) | i50) << 1) - (~(-((i47 | 93) & (~i50))))) - 1;
            f53822h = i51 % 128;
            int i52 = i51 % 2;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setY(new Object[]{this}, -1483880563, 1483880568, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setY(new Object[]{this, apkVar, apkVar2}, 2141918475, -2141918473, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setY(new Object[]{this, bigInteger}, 1227104126, -1227104126, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setY(new Object[]{this, Integer.valueOf(i10)}, -1867738137, 1867738140, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, -877794875, 877794876, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setY(new Object[]{this}, -1848865063, 1848865067, System.identityHashCode(this));
    }
}
