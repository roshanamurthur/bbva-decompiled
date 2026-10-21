package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class apy extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53552g = aqd.setLayoutAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53553h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53554i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aqe f53555f;

    static {
        new aqd(apj.setOnFocusChangeListener);
        int i10 = f53554i;
        int i11 = i10 & 27;
        int i12 = (i10 ^ 27) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f53553h = i13 % 128;
        int i14 = i13 % 2;
    }

    public apy() {
        super(f53552g);
        this.f53555f = new aqe(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Boolean bool;
        int i13 = (i11 * (-574)) + (i10 * (-574));
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~((~i11) | i12);
        switch ((((~(i10 | i15)) | (~(i12 | i14))) * 575) + (((~(i11 | i15)) | i17) * (-575)) + ((i16 | i17) * 1150) + i13) {
            case 1:
                apy apyVar = (apy) objArr[0];
                int i18 = f53554i;
                int i19 = (i18 & (-50)) | ((~i18) & 49);
                int i20 = -(-((i18 & 49) << 1));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f53553h = i21 % 128;
                int i22 = i21 % 2;
                aqe aqeVar = apyVar.f53555f;
                int i23 = i18 & 3;
                int i24 = -(-((i18 ^ 3) | i23));
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                f53553h = i25 % 128;
                int i26 = i25 % 2;
                return aqeVar;
            case 2:
                apy apyVar2 = new apy();
                int i27 = f53553h;
                int i28 = i27 & 23;
                int i29 = ((i27 ^ 23) | i28) << 1;
                int i30 = -((i27 | 23) & (~i28));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f53554i = i31 % 128;
                if (i31 % 2 != 0) {
                    return apyVar2;
                }
                throw null;
            case 3:
                int i32 = f53554i + 59;
                f53553h = i32 % 128;
                int i33 = i32 % 2;
                int iBitLength = f53552g.bitLength();
                int i34 = f53554i;
                int i35 = i34 & 93;
                int i36 = (i34 | 93) & (~i35);
                int i37 = i35 << 1;
                int i38 = (i36 & i37) + (i36 | i37);
                f53553h = i38 % 128;
                if (i38 % 2 == 0) {
                    return Integer.valueOf(iBitLength);
                }
                throw null;
            case 4:
                aqd aqdVar = new aqd((BigInteger) objArr[1]);
                int i39 = f53553h;
                int i40 = (i39 & 55) + (i39 | 55);
                f53554i = i40 % 128;
                int i41 = i40 % 2;
                return aqdVar;
            case 5:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{secureRandom, iArr}, 641649766, -641649752, (int) System.currentTimeMillis());
                aqd aqdVar2 = new aqd(iArr);
                int i42 = f53553h;
                int i43 = (i42 ^ 75) + ((i42 & 75) << 1);
                f53554i = i43 % 128;
                int i44 = i43 % 2;
                return aqdVar2;
            case 6:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i45 = f53554i;
                int i46 = i45 & 93;
                int i47 = (i46 - (~(-(-((i45 ^ 93) | i46))))) - 1;
                int i48 = i47 % 128;
                f53553h = i48;
                if (i47 % 2 != 0) {
                    throw null;
                }
                if (iIntValue != 2) {
                    int i49 = i45 & 125;
                    int i50 = (i45 ^ 125) | i49;
                    int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                    f53553h = i51 % 128;
                    int i52 = i51 % 2;
                    bool = Boolean.FALSE;
                } else {
                    int i53 = (((i48 | 110) << 1) - (i48 ^ 110)) - 1;
                    f53554i = i53 % 128;
                    if (i53 % 2 == 0) {
                        throw null;
                    }
                    bool = Boolean.TRUE;
                }
                return bool;
            default:
                aqe aqeVar2 = new aqe((apy) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i54 = f53553h;
                int i55 = i54 & 61;
                int i56 = -(-((i54 ^ 61) | i55));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f53554i = i57 % 128;
                int i58 = i57 % 2;
                return aqeVar2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, 1566550907, -1566550907, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, 964956305, -964956301, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, secureRandom}, 681805246, -681805241, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1959816660, 1959816666, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 696829511, -696829508, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -96253198, 96253199, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, 90570055, -90570053, System.identityHashCode(this));
    }
}
