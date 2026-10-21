package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqs extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53617g = aqq.setOnLongClickListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53618h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53619i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aqx f53620f;

    static {
        new aqq(apj.setOnFocusChangeListener);
        int i10 = f53618h;
        int i11 = i10 & 19;
        int i12 = (((i10 | 19) & (~i11)) - (~(i11 << 1))) - 1;
        f53619i = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 14 / 0;
        }
    }

    public aqs() {
        super(f53617g);
        this.f53620f = new aqx(this, null, null);
        this.setX = setOnFocusChangeListener(apj.setY);
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(3L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        switch ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16) {
            case 1:
                aqs aqsVar = new aqs();
                int i20 = f53619i;
                int i21 = i20 & 45;
                int i22 = -(-((i20 ^ 45) | i21));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f53618h = i23 % 128;
                int i24 = i23 % 2;
                return aqsVar;
            case 2:
                aqx aqxVar = new aqx((aqs) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i25 = f53618h;
                int i26 = ((i25 & (-66)) | ((~i25) & 65)) + ((i25 & 65) << 1);
                f53619i = i26 % 128;
                if (i26 % 2 != 0) {
                    return aqxVar;
                }
                throw null;
            case 3:
                aqq aqqVar = new aqq((BigInteger) objArr[1]);
                int i27 = f53618h + 15;
                f53619i = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 72 / 0;
                }
                return aqqVar;
            case 4:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i29 = f53618h;
                int i30 = ((i29 ^ 51) | (i29 & 51)) << 1;
                int i31 = ~i29;
                int i32 = -((i29 & (-52)) | (51 & i31));
                int i33 = ((i30 | i32) << 1) - (i30 ^ i32);
                int i34 = i33 % 128;
                f53619i = i34;
                int i35 = i33 % 2;
                if (iIntValue != 2) {
                    int i36 = (i34 ^ 87) + ((i34 & 87) << 1);
                    f53618h = i36 % 128;
                    if (i36 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                int i37 = ((i29 & (-116)) | (i31 & 115)) + ((i29 & 115) << 1);
                f53619i = i37 % 128;
                if (i37 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 5:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{secureRandom, iArr}, -882904101, 882904104, (int) System.currentTimeMillis());
                aqq aqqVar2 = new aqq(iArr);
                int i38 = f53618h;
                int i39 = i38 & 123;
                int i40 = (i38 ^ 123) | i39;
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                f53619i = i41 % 128;
                if (i41 % 2 != 0) {
                    return aqqVar2;
                }
                throw null;
            case 6:
                aqs aqsVar2 = (aqs) objArr[0];
                int i42 = f53618h;
                int i43 = i42 ^ 17;
                int i44 = ((i42 & 17) | i43) << 1;
                int i45 = -i43;
                int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                int i47 = i46 % 128;
                f53619i = i47;
                int i48 = i46 % 2;
                aqx aqxVar2 = aqsVar2.f53620f;
                if (i48 == 0) {
                    int i49 = 20 / 0;
                }
                int i50 = ((i47 & 20) + (i47 | 20)) - 1;
                f53618h = i50 % 128;
                int i51 = i50 % 2;
                return aqxVar2;
            default:
                int i52 = f53618h;
                int i53 = ((i52 & 16) + (i52 | 16)) - 1;
                f53619i = i53 % 128;
                int i54 = i53 % 2;
                BigInteger bigInteger = f53617g;
                if (i54 == 0) {
                    bigInteger.bitLength();
                    throw null;
                }
                int iBitLength = bigInteger.bitLength();
                int i55 = f53619i;
                int i56 = i55 & 95;
                int i57 = i56 + ((i55 ^ 95) | i56);
                f53618h = i57 % 128;
                if (i57 % 2 == 0) {
                    return Integer.valueOf(iBitLength);
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, -356215065, 356215066, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, 2041151196, -2041151193, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setDividerPadding(new Object[]{this, secureRandom}, 1226598450, -1226598445, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 405281047, -405281047, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -1708967312, 1708967318, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -171497984, 171497986, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -1815170490, 1815170494, i10)).booleanValue();
    }
}
