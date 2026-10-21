package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class ade extends ady {
    public static final a v0 = new a(ade.class, 10);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final ade[] f52454w0 = new ade[12];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52455x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52456y0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f52457t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f52458u0;

    public static class a extends j0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52459f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f52460g = 1;

        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            Object[] objArr = {this, aftVar};
            System.identityHashCode(this);
            aft aftVar2 = (aft) objArr[1];
            int i10 = f52460g;
            int i11 = i10 & 3;
            int i12 = i11 + ((i10 ^ 3) | i11);
            f52459f = i12 % 128;
            ade adeVar = (ade) (i12 % 2 != 0 ? ade.setY(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar2}, -952512304, 952512305, System.identityHashCode(aftVar2)), Boolean.FALSE}, 657279853, -657279847, (int) System.currentTimeMillis()) : ade.setY(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar2}, -952512304, 952512305, System.identityHashCode(aftVar2)), Boolean.FALSE}, 657279853, -657279847, (int) System.currentTimeMillis()));
            int i13 = f52459f;
            int i14 = i13 ^ 45;
            int i15 = (((i13 & 45) | i14) << 1) - i14;
            f52460g = i15 % 128;
            int i16 = i15 % 2;
            return adeVar;
        }
    }

    static {
        int i10 = f52455x0;
        int i11 = ((i10 ^ 102) + ((i10 & 102) << 1)) - 1;
        f52456y0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public ade(byte[] bArr, boolean z10) {
        if (((Boolean) adp.setOnFocusChangeListener(new Object[]{bArr}, 1574757708, -1574757697, (int) System.currentTimeMillis())).booleanValue()) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f52457t0 = z10 ? (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis()) : bArr;
        this.f52458u0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{bArr}, 1273588141, -1273588125, (int) System.currentTimeMillis())).intValue();
    }

    public static ade setCompoundDrawableTintBlendMode(Object obj) {
        return (ade) setY(new Object[]{obj}, -1255399082, 1255399087, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x020e  */
    /* JADX WARN: Code duplicated, block: B:59:0x021a  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object objValueOf;
        int i13;
        ade adeVar;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = i14 | (~i12);
        switch ((((~(i10 | i15)) | (~(i11 | i17))) * 241) + ((i10 | i11) * (-482)) + ((i16 | (~i17)) * (-241)) + (i11 * 242) + (i10 * 483)) {
            case 1:
                BigInteger bigInteger = new BigInteger(((ade) objArr[0]).f52457t0);
                int i18 = f52456y0 + 45;
                f52455x0 = i18 % 128;
                int i19 = i18 % 2;
                return bigInteger;
            case 2:
                int i20 = f52455x0;
                int i21 = ((i20 | 11) << 1) - (i20 ^ 11);
                f52456y0 = i21 % 128;
                int i22 = i21 % 2;
                int i23 = i20 & 83;
                int i24 = i23 + ((i20 ^ 83) | i23);
                f52456y0 = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 28 / 0;
                }
                objValueOf = Boolean.FALSE;
                break;
            case 3:
                ade adeVar2 = (ade) objArr[0];
                int i26 = f52456y0;
                int i27 = i26 & 67;
                int i28 = -(-((i26 ^ 67) | i27));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                f52455x0 = i29 % 128;
                int i30 = i29 % 2;
                int length = adeVar2.f52457t0.length;
                int i31 = adeVar2.f52458u0;
                int i32 = -i31;
                int iIdentityHashCode = System.identityHashCode(adeVar2);
                int i33 = i32 * 881;
                int i34 = -(-(length * 881));
                int i35 = ((~i34) & i33) | ((~i33) & i34);
                int i36 = (i33 & i34) << 1;
                int i37 = (i35 & i36) + (i36 | i35);
                int i38 = ~i32;
                int i39 = (i38 | i32) & i38;
                int i40 = ~length;
                int i41 = i40 & (i40 | length);
                int i42 = i39 ^ i41;
                int i43 = i39 & i41;
                int i44 = (~((i43 & i42) | (i42 ^ i43))) | (~((i38 ^ iIdentityHashCode) | (i38 & iIdentityHashCode)));
                int i45 = i41 & iIdentityHashCode;
                int i46 = (i41 | iIdentityHashCode) & (~i45);
                int i47 = ~iIdentityHashCode;
                int i48 = (i46 ^ i45) | (i46 & i45);
                int i49 = ~i48;
                int i50 = (i48 | i49) & i49;
                int i51 = i44 & i50;
                int i52 = (~i51) & (i44 | i50);
                int i53 = -(-(((i52 & i51) | (i52 ^ i51)) * (-880)));
                int i54 = i37 & i53;
                int i55 = i54 + ((i53 ^ i37) | i54);
                int i56 = ~(((~i47) & i38) | ((~i38) & i47) | (i38 & i47));
                int i57 = (length & i56) | (length ^ i56);
                int i58 = (i32 ^ iIdentityHashCode) | (i32 & iIdentityHashCode);
                int i59 = ~i58;
                int i60 = (i58 | i59) & i59;
                int i61 = ((i57 & i60) | ((~i60) & i57) | ((~i57) & i60)) * (-880);
                int i62 = ((i55 | i61) << 1) - (i61 ^ i55);
                int i63 = -(-(i60 * 880));
                if ((i62 & i63) + (i63 | i62) > 4) {
                    throw new ArithmeticException("ASN.1 Enumerated out of int range");
                }
                int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adeVar2.f52457t0, Integer.valueOf(i31), -1}, 2139027336, -2139027323, i31)).intValue();
                int i64 = f52455x0;
                int i65 = ((i64 & 80) + (i64 | 80)) - 1;
                f52456y0 = i65 % 128;
                if (i65 % 2 == 0) {
                    int i66 = 19 / 0;
                }
                objValueOf = Integer.valueOf(iIntValue);
                break;
                break;
            case 4:
                ade adeVar3 = (ade) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i67 = f52456y0;
                int i68 = ((i67 & 24) + (i67 | 24)) - 1;
                int i69 = i68 % 128;
                f52455x0 = i69;
                int i70 = i68 % 2;
                if (adyVar instanceof ade) {
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adeVar3.f52457t0, ((ade) adyVar).f52457t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i71 = f52456y0;
                    int i72 = i71 & 29;
                    int i73 = (i72 - (~((i71 ^ 29) | i72))) - 1;
                    f52455x0 = i73 % 128;
                    if (i73 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    int i74 = ((i69 | 85) << 1) - (i69 ^ 85);
                    f52456y0 = i74 % 128;
                    boolean z10 = i74 % 2 == 0;
                    int i75 = i69 & 87;
                    int i76 = i69 | 87;
                    int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                    f52456y0 = i77 % 128;
                    if (i77 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = Boolean.valueOf(z10);
                }
                break;
            case 5:
                Object obj = objArr[0];
                int i78 = f52455x0;
                int i79 = i78 & 123;
                int i80 = (i79 - (~(-(-((i78 ^ 123) | i79))))) - 1;
                f52456y0 = i80 % 128;
                int i81 = i80 % 2;
                if (obj != null) {
                    int i82 = i78 + 55;
                    int i83 = i82 % 128;
                    f52456y0 = i83;
                    int i84 = i82 % 2;
                    if (obj instanceof ade) {
                        objValueOf = (ade) obj;
                        i13 = i78 + 81;
                        f52456y0 = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        if (!(obj instanceof byte[])) {
                            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
                        }
                        int i85 = (i83 & 126) + (i83 | 126);
                        int i86 = (i85 ^ (-1)) + (i85 << 1);
                        f52455x0 = i86 % 128;
                        int i87 = i86 % 2;
                        a aVar = v0;
                        try {
                            if (i87 != 0) {
                                try {
                                    throw null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            objValueOf = (ade) j0.c(-1221427223, 1221427224, System.identityHashCode(aVar), new Object[]{aVar, (byte[]) obj});
                        } catch (Exception e5) {
                            StringBuilder sb2 = new StringBuilder("encoding error in getInstance: ");
                            sb2.append(e5.toString());
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                } else {
                    objValueOf = (ade) obj;
                    i13 = i78 + 81;
                    f52456y0 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                }
                break;
            case 6:
                byte[] bArr = (byte[]) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i88 = f52455x0;
                int i89 = i88 & 53;
                int i90 = (i88 | 53) & (~i89);
                int i91 = i89 << 1;
                int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
                f52456y0 = i92 % 128;
                int i93 = i92 % 2;
                int length2 = bArr.length;
                if (i93 != 0 ? length2 > 1 : length2 > 0) {
                    adeVar = new ade(bArr, zBooleanValue2);
                    int i94 = f52456y0;
                    int i95 = (i94 & 99) + (i94 | 99);
                    f52455x0 = i95 % 128;
                    if (i95 % 2 != 0) {
                        throw null;
                    }
                } else {
                    if (bArr.length == 0) {
                        throw new IllegalArgumentException("ENUMERATED has zero length");
                    }
                    int i96 = bArr[0] & 255;
                    ade[] adeVarArr = f52454w0;
                    if (i96 < adeVarArr.length) {
                        ade adeVar4 = adeVarArr[i96];
                        if (adeVar4 == null) {
                            adeVar4 = new ade(bArr, zBooleanValue2);
                            adeVarArr[i96] = adeVar4;
                            int i97 = f52455x0 + 65;
                            f52456y0 = i97 % 128;
                            int i98 = i97 % 2;
                        }
                        int i99 = f52455x0;
                        int i100 = i99 & 41;
                        int i101 = (i100 - (~((i99 ^ 41) | i100))) - 1;
                        f52456y0 = i101 % 128;
                        if (i101 % 2 == 0) {
                            int i102 = 87 / 0;
                        }
                        return adeVar4;
                    }
                    adeVar = new ade(bArr, zBooleanValue2);
                    int i103 = f52455x0;
                    int i104 = i103 & 121;
                    int i105 = (i103 | 121) & (~i104);
                    int i106 = -(-(i104 << 1));
                    int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                    f52456y0 = i107 % 128;
                    if (i107 % 2 == 0) {
                        int i108 = 79 / 0;
                    }
                }
                return adeVar;
            case 7:
                ade adeVar5 = (ade) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                int i109 = f52455x0;
                int i110 = i109 & 97;
                int i111 = (i110 - (~(-(-((i109 ^ 97) | i110))))) - 1;
                f52456y0 = i111 % 128;
                int i112 = i111 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue3), 10, adeVar5.f52457t0}, 478760665, -478760661, 10);
                int i113 = f52455x0;
                int i114 = i113 & 41;
                int i115 = (((i113 | 41) & (~i114)) - (~(-(-(i114 << 1))))) - 1;
                f52456y0 = i115 % 128;
                int i116 = i115 % 2;
                return null;
            default:
                ade adeVar6 = (ade) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int i117 = f52455x0;
                int i118 = (i117 & (-106)) | ((~i117) & 105);
                int i119 = -(-((i117 & 105) << 1));
                int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                f52456y0 = i120 % 128;
                int i121 = i120 % 2;
                int length3 = adeVar6.f52457t0.length;
                int iIntValue2 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue4), Integer.valueOf(length3)}, 1150803379, -1150803367, length3)).intValue();
                int i122 = f52456y0;
                int i123 = (i122 & (-84)) | ((~i122) & 83);
                int i124 = (i122 & 83) << 1;
                int i125 = (i123 & i124) + (i124 | i123);
                f52455x0 = i125 % 128;
                if (i125 % 2 == 0) {
                    return Integer.valueOf(iIntValue2);
                }
                throw null;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setY(new Object[]{this, Boolean.valueOf(z10)}, -2034302744, 2034302744, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setY(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -2129111197, 2129111204, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setY(new Object[]{this, adyVar}, -1625881638, 1625881642, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52456y0 + 48;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f52455x0 = i11 % 128;
        int i12 = i11 % 2;
        int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{this.f52457t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        int i13 = f52456y0;
        int i14 = (i13 & (-28)) | ((~i13) & 27);
        int i15 = (i13 & 27) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f52455x0 = i16 % 128;
        if (i16 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    public final int setDividerPadding() {
        return ((Integer) setY(new Object[]{this}, -943305917, 943305920, System.identityHashCode(this))).intValue();
    }

    public final BigInteger setX() {
        return (BigInteger) setY(new Object[]{this}, 1706244763, -1706244762, System.identityHashCode(this));
    }

    public ade(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f52457t0 = BigInteger.valueOf(i10).toByteArray();
        this.f52458u0 = 0;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setY(new Object[]{this}, -1466959526, 1466959528, System.identityHashCode(this))).booleanValue();
    }
}
