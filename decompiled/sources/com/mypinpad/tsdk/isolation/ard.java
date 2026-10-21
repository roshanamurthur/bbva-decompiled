package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class ard extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53657g = arf.getNavBarTitleString;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53658h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53659i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final arg f53660f;

    static {
        new arf(apj.setOnFocusChangeListener);
        int i10 = f53658h + 111;
        f53659i = i10 % 128;
        int i11 = i10 % 2;
    }

    public ard() {
        super(f53657g);
        this.f53660f = new arg(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        switch (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711))) {
            case 1:
                arf arfVar = new arf((BigInteger) objArr[1]);
                int i17 = f53659i;
                int i18 = ((i17 & (-36)) | ((~i17) & 35)) + ((i17 & 35) << 1);
                f53658h = i18 % 128;
                if (i18 % 2 == 0) {
                    return arfVar;
                }
                throw null;
            case 2:
                arg argVar = new arg((ard) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i19 = f53659i;
                int i20 = ((i19 | 73) << 1) - (i19 ^ 73);
                f53658h = i20 % 128;
                int i21 = i20 % 2;
                return argVar;
            case 3:
                ard ardVar = (ard) objArr[0];
                int i22 = f53658h;
                int i23 = ((i22 & 40) + (i22 | 40)) - 1;
                f53659i = i23 % 128;
                int i24 = i23 % 2;
                arg argVar2 = ardVar.f53660f;
                if (i24 != 0) {
                    return argVar2;
                }
                throw null;
            case 4:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i25 = f53658h;
                int i26 = ((i25 ^ 36) + ((i25 & 36) << 1)) - 1;
                int i27 = i26 % 128;
                f53659i = i27;
                int i28 = i26 % 2;
                if (iIntValue != 2) {
                    int i29 = i27 + 49;
                    f53658h = i29 % 128;
                    int i30 = i29 % 2;
                    return Boolean.FALSE;
                }
                int i31 = i25 & 103;
                int i32 = (i31 - (~(-(-((i25 ^ 103) | i31))))) - 1;
                f53659i = i32 % 128;
                if (i32 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 5:
                ard ardVar2 = new ard();
                int i33 = f53658h;
                int i34 = ((((i33 ^ 39) | (i33 & 39)) << 1) - (~(-(((~i33) & 39) | (i33 & (-40)))))) - 1;
                f53659i = i34 % 128;
                if (i34 % 2 != 0) {
                    return ardVar2;
                }
                int i35 = 7 / 0;
                return ardVar2;
            case 6:
                int i36 = f53659i;
                int i37 = i36 & 9;
                int i38 = i36 | 9;
                int i39 = (i37 & i38) + (i38 | i37);
                f53658h = i39 % 128;
                int i40 = i39 % 2;
                int iBitLength = f53657g.bitLength();
                int i41 = f53659i + 55;
                f53658h = i41 % 128;
                int i42 = i41 % 2;
                return Integer.valueOf(iBitLength);
            default:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                ari.setOnFocusChangeListener(new Object[]{secureRandom, iArr}, 1035719548, -1035719536, (int) System.currentTimeMillis());
                arf arfVar2 = new arf(iArr);
                int i43 = f53659i;
                int i44 = i43 & 1;
                int i45 = ((i43 | 1) & (~i44)) + (i44 << 1);
                f53658h = i45 % 128;
                if (i45 % 2 == 0) {
                    return arfVar2;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, 146210586, -146210581, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setOnFocusChangeListener(new Object[]{this, apkVar, apkVar2}, 2123749824, -2123749822, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setOnFocusChangeListener(new Object[]{this, secureRandom}, 430769494, -430769494, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1778710876, 1778710880, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, -1358936165, 1358936168, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setOnFocusChangeListener(new Object[]{this, bigInteger}, 887951982, -887951981, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1013927292, -1013927286, System.identityHashCode(this))).intValue();
    }
}
