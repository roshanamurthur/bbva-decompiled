package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class are extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53661g = arj.setOnDragListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53662h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53663i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final arn f53664f;

    static {
        new arj(apj.setOnFocusChangeListener);
        int i10 = f53662h;
        int i11 = i10 ^ 93;
        int i12 = (((i10 & 93) | i11) << 1) - i11;
        f53663i = i12 % 128;
        int i13 = i12 % 2;
    }

    public are() {
        super(f53661g);
        this.f53664f = new arn(this, null, null);
        this.setX = setOnFocusChangeListener(apj.setY);
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(7L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        switch (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13) {
            case 1:
                are areVar = (are) objArr[0];
                int i16 = f53662h;
                int i17 = i16 ^ 57;
                int i18 = -(-((i16 & 57) << 1));
                int i19 = (i17 & i18) + (i18 | i17);
                int i20 = i19 % 128;
                f53663i = i20;
                int i21 = i19 % 2;
                arn arnVar = areVar.f53664f;
                int i22 = i20 + 63;
                f53662h = i22 % 128;
                if (i22 % 2 == 0) {
                    return arnVar;
                }
                throw null;
            case 2:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{secureRandom, iArr}, -366531067, 366531069, (int) System.currentTimeMillis());
                arj arjVar = new arj(iArr);
                int i23 = f53662h;
                int i24 = i23 & 77;
                int i25 = ((i23 ^ 77) | i24) << 1;
                int i26 = -((i23 | 77) & (~i24));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f53663i = i27 % 128;
                int i28 = i27 % 2;
                return arjVar;
            case 3:
                are areVar2 = new are();
                int i29 = f53662h + 9;
                f53663i = i29 % 128;
                if (i29 % 2 != 0) {
                    return areVar2;
                }
                throw null;
            case 4:
                arn arnVar2 = new arn((are) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i30 = f53662h;
                int i31 = (i30 & (-70)) | ((~i30) & 69);
                int i32 = (i30 & 69) << 1;
                int i33 = (i31 & i32) + (i32 | i31);
                f53663i = i33 % 128;
                if (i33 % 2 != 0) {
                    return arnVar2;
                }
                throw null;
            case 5:
                arj arjVar2 = new arj((BigInteger) objArr[1]);
                int i34 = f53663i;
                int i35 = i34 & 27;
                int i36 = (i35 - (~((i34 ^ 27) | i35))) - 1;
                f53662h = i36 % 128;
                int i37 = i36 % 2;
                return arjVar2;
            case 6:
                int i38 = f53662h;
                int i39 = ((i38 ^ 96) + ((i38 & 96) << 1)) - 1;
                f53663i = i39 % 128;
                int i40 = i39 % 2;
                BigInteger bigInteger = f53661g;
                if (i40 != 0) {
                    return Integer.valueOf(bigInteger.bitLength());
                }
                bigInteger.bitLength();
                throw null;
            default:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i41 = f53663i;
                int i42 = i41 & 53;
                int i43 = (i42 - (~(-(-((i41 ^ 53) | i42))))) - 1;
                int i44 = i43 % 128;
                f53662h = i44;
                int i45 = i43 % 2;
                if (iIntValue != 2) {
                    int i46 = (i41 ^ 9) + ((i41 & 9) << 1);
                    f53662h = i46 % 128;
                    if (i46 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                int i47 = (i44 ^ 81) + ((i44 & 81) << 1);
                f53663i = i47 % 128;
                if (i47 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, 1998838262, -1998838259, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setOnFocusChangeListener(new Object[]{this, apkVar, apkVar2}, 856554418, -856554414, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setOnFocusChangeListener(new Object[]{this, secureRandom}, 1460928009, -1460928007, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -192195167, 192195167, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, 1122729732, -1122729731, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setOnFocusChangeListener(new Object[]{this, bigInteger}, -1895121476, 1895121481, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 195242294, -195242288, System.identityHashCode(this))).intValue();
    }
}
