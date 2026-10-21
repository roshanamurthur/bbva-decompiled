package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 extends aed {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f61221y0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public byte[] f61222x0;

    /* JADX WARN: Code duplicated, block: B:30:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x020c  */
    /* JADX WARN: Code duplicated, block: B:34:0x022a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0242  */
    /* JADX WARN: Code duplicated, block: B:39:0x0263  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
        adl adlVarI;
        int i13;
        int length;
        int iIntValue;
        int i14;
        Object objValueOf;
        int i15 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = (~(i16 | i17)) | (~(i17 | i12));
        int i19 = ~(i11 | (~i12) | i10);
        switch ((((~(i10 | i17 | i12)) | i19) * 470) + ((i18 | i19) * (-470)) + i15) {
            case 1:
                u0 u0Var = (u0) objArr[0];
                int i20 = f61221y0 + 51;
                E0 = i20 % 128;
                int i21 = i20 % 2;
                u0Var.m();
                add[] addVarArrK = u0Var.k();
                int i22 = f61221y0;
                int i23 = (((i22 | 66) << 1) - (i22 ^ 66)) - 1;
                E0 = i23 % 128;
                int i24 = i23 % 2;
                return addVarArrK;
            case 2:
                u0 u0Var2 = (u0) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i25 = f61221y0 + 23;
                E0 = i25 % 128;
                int i26 = i25 % 2;
                u0Var2.m();
                add x4 = super.setX(iIntValue2);
                int i27 = f61221y0;
                int i28 = (i27 & 71) + (i27 | 71);
                E0 = i28 % 128;
                if (i28 % 2 != 0) {
                    return x4;
                }
                int i29 = 8 / 0;
                return x4;
            case 3:
                u0 u0Var3 = (u0) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i30 = f61221y0 + 119;
                E0 = i30 % 128;
                if (i30 % 2 == 0) {
                    u0Var3.l();
                    throw null;
                }
                byte[] bArrL = u0Var3.l();
                if (bArrL == null) {
                    super.a().c(aebVar, zBooleanValue);
                    int i31 = f61221y0;
                    int i32 = (i31 & (-12)) | ((~i31) & 11);
                    int i33 = -(-((i31 & 11) << 1));
                    int i34 = (i32 & i33) + (i33 | i32);
                    E0 = i34 % 128;
                    if (i34 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i35 = f61221y0;
                int i36 = (i35 & (-28)) | ((~i35) & 27);
                int i37 = -(-((i35 & 27) << 1));
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                E0 = i38 % 128;
                int i39 = i38 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 48, bArrL}, 478760665, -478760661, 48);
                int i40 = E0 + 114;
                int i41 = (i40 ^ (-1)) + (i40 << 1);
                f61221y0 = i41 % 128;
                int i42 = i41 % 2;
                return null;
            case 4:
                u0 u0Var4 = (u0) objArr[0];
                int i43 = E0;
                int i44 = i43 & 17;
                int i45 = (i44 - (~(-(-((i43 ^ 17) | i44))))) - 1;
                f61221y0 = i45 % 128;
                int i46 = i45 % 2;
                u0Var4.m();
                Iterator<add> it = super.iterator();
                int i47 = E0;
                int i48 = ((i47 & 107) - (~(-(-(i47 | 107))))) - 1;
                f61221y0 = i48 % 128;
                int i49 = i48 % 2;
                return it;
            case 5:
                u0 u0Var5 = (u0) objArr[0];
                int i50 = f61221y0;
                int i51 = i50 ^ 55;
                int i52 = ((i50 & 55) | i51) << 1;
                int i53 = -i51;
                int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                E0 = i54 % 128;
                Object[] objArr2 = new Object[1];
                if (i54 % 2 == 0) {
                    objArr2[0] = u0Var5;
                    adlVarI = ((aed) ((ady) setDividerPadding(objArr2, 948108167, -948108157, System.identityHashCode(u0Var5)))).i();
                    int i55 = 57 / 0;
                } else {
                    objArr2[0] = u0Var5;
                    adlVarI = ((aed) ((ady) setDividerPadding(objArr2, 948108167, -948108157, System.identityHashCode(u0Var5)))).i();
                }
                adl adlVar = adlVarI;
                int i56 = E0;
                int i57 = i56 & 121;
                int i58 = i57 + ((i56 ^ 121) | i57);
                f61221y0 = i58 % 128;
                int i59 = i58 % 2;
                return adlVar;
            case 6:
                u0 u0Var6 = (u0) objArr[0];
                int i60 = f61221y0;
                int i61 = i60 & 23;
                int i62 = (i60 | 23) & (~i61);
                int i63 = -(-(i61 << 1));
                int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                E0 = i64 % 128;
                int i65 = i64 % 2;
                ads adsVarH = ((aed) ((ady) setDividerPadding(new Object[]{u0Var6}, 948108167, -948108157, System.identityHashCode(u0Var6)))).h();
                int i66 = f61221y0 + 81;
                E0 = i66 % 128;
                int i67 = i66 % 2;
                return adsVarH;
            case 7:
                u0 u0Var7 = (u0) objArr[0];
                int i68 = f61221y0;
                int i69 = i68 & 125;
                int i70 = (i69 - (~(-(-((i68 ^ 125) | i69))))) - 1;
                E0 = i70 % 128;
                int i71 = i70 % 2;
                u0Var7.m();
                int iHashCode = super.hashCode();
                int i72 = E0;
                int i73 = i72 ^ 75;
                int i74 = (((i72 & 75) | i73) << 1) - i73;
                f61221y0 = i74 % 128;
                if (i74 % 2 == 0) {
                    return Integer.valueOf(iHashCode);
                }
                throw null;
            case 8:
                u0 u0Var8 = (u0) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i75 = E0;
                int i76 = ((i75 ^ 55) | (i75 & 55)) << 1;
                int i77 = -(((~i75) & 55) | (i75 & (-56)));
                int i78 = (i76 & i77) + (i77 | i76);
                f61221y0 = i78 % 128;
                int i79 = i78 % 2;
                byte[] bArrL2 = u0Var8.l();
                if (i79 != 0) {
                    int i80 = 4 / 0;
                    if (bArrL2 != null) {
                        int i81 = E0;
                        int i82 = i81 & 41;
                        int i83 = (i81 ^ 41) | i82;
                        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                        f61221y0 = i84 % 128;
                        i13 = i84 % 2;
                        length = bArrL2.length;
                        if (i13 == 0) {
                            ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                            throw null;
                        }
                        iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                    } else {
                        iIntValue = super.a().b(zBooleanValue2);
                        int i85 = E0;
                        int i86 = (i85 | 63) << 1;
                        int i87 = -(((~i85) & 63) | (i85 & (-64)));
                        i14 = ((i86 | i87) << 1) - (i87 ^ i86);
                        f61221y0 = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                    }
                } else if (bArrL2 != null) {
                    int i88 = E0;
                    int i89 = i88 & 41;
                    int i810 = (i88 ^ 41) | i89;
                    int i811 = (i89 ^ i810) + ((i810 & i89) << 1);
                    f61221y0 = i811 % 128;
                    i13 = i811 % 2;
                    length = bArrL2.length;
                    if (i13 == 0) {
                        ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                        throw null;
                    }
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                } else {
                    iIntValue = super.a().b(zBooleanValue2);
                    int i812 = E0;
                    int i813 = (i812 | 63) << 1;
                    int i814 = -(((~i812) & 63) | (i812 & (-64)));
                    i14 = ((i813 | i814) << 1) - (i814 ^ i813);
                    f61221y0 = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                }
                objValueOf = Integer.valueOf(iIntValue);
                break;
            case 9:
                u0 u0Var9 = (u0) objArr[0];
                int i90 = E0;
                int i91 = i90 & 19;
                int i92 = (i91 - (~(-(-((i90 ^ 19) | i91))))) - 1;
                f61221y0 = i92 % 128;
                int i93 = i92 % 2;
                byte[] bArrL3 = u0Var9.l();
                if (bArrL3 == null) {
                    Enumeration dividerPadding = super.setDividerPadding();
                    int i94 = E0;
                    int i95 = i94 | 13;
                    int i96 = ((i95 << 1) - (~(-((~(i94 & 13)) & i95)))) - 1;
                    f61221y0 = i96 % 128;
                    int i97 = i96 % 2;
                    objValueOf = dividerPadding;
                } else {
                    t0 t0Var = new t0();
                    t0Var.f60964a = new adq(bArrL3, (byte) 0);
                    t0Var.f60965b = t0.a(new Object[]{t0Var}, 2080550194, -2080550193, System.identityHashCode(t0Var));
                    int i98 = f61221y0;
                    int i99 = ((((i98 ^ 83) | (i98 & 83)) << 1) - (~(-(((~i98) & 83) | (i98 & (-84)))))) - 1;
                    E0 = i99 % 128;
                    int i100 = i99 % 2;
                    objValueOf = t0Var;
                }
                break;
            case 10:
                u0 u0Var10 = (u0) objArr[0];
                int i101 = f61221y0 + 109;
                E0 = i101 % 128;
                int i102 = i101 % 2;
                u0Var10.m();
                ady adyVarA = super.a();
                int i103 = (-2) - ((f61221y0 + 14) ^ (-1));
                E0 = i103 % 128;
                if (i103 % 2 != 0) {
                    return adyVarA;
                }
                int i104 = 34 / 0;
                return adyVarA;
            case 11:
                u0 u0Var11 = (u0) objArr[0];
                int i105 = f61221y0 + 109;
                E0 = i105 % 128;
                if (i105 % 2 == 0) {
                    ((aed) ((ady) setDividerPadding(new Object[]{u0Var11}, 948108167, -948108157, System.identityHashCode(u0Var11)))).g();
                    throw null;
                }
                aee aeeVarG = ((aed) ((ady) setDividerPadding(new Object[]{u0Var11}, 948108167, -948108157, System.identityHashCode(u0Var11)))).g();
                int i106 = E0;
                int i107 = ((i106 & 102) + (i106 | 102)) - 1;
                f61221y0 = i107 % 128;
                int i108 = i107 % 2;
                return aeeVarG;
            case 12:
                u0 u0Var12 = (u0) objArr[0];
                int i109 = f61221y0;
                int i110 = i109 & 67;
                int i111 = (i109 | 67) & (~i110);
                int i112 = i110 << 1;
                int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
                E0 = i113 % 128;
                Object[] objArr3 = new Object[1];
                if (i113 % 2 == 0) {
                    objArr3[0] = u0Var12;
                    ((aed) ((ady) setDividerPadding(objArr3, 948108167, -948108157, System.identityHashCode(u0Var12)))).setOnFocusChangeListener();
                    throw null;
                }
                objArr3[0] = u0Var12;
                acz onFocusChangeListener = ((aed) ((ady) setDividerPadding(objArr3, 948108167, -948108157, System.identityHashCode(u0Var12)))).setOnFocusChangeListener();
                int i114 = f61221y0 + 21;
                E0 = i114 % 128;
                int i115 = i114 % 2;
                return onFocusChangeListener;
            case 13:
                u0 u0Var13 = (u0) objArr[0];
                int i116 = f61221y0;
                int i117 = i116 ^ 79;
                int i118 = ((i116 & 79) | i117) << 1;
                int i119 = -i117;
                int i120 = ((i118 | i119) << 1) - (i118 ^ i119);
                E0 = i120 % 128;
                int i121 = i120 % 2;
                u0Var13.m();
                int compoundDrawableTintBlendMode = super.setCompoundDrawableTintBlendMode();
                int i122 = f61221y0;
                int i123 = (i122 & (-44)) | ((~i122) & 43);
                int i124 = (i122 & 43) << 1;
                int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                E0 = i125 % 128;
                int i126 = i125 % 2;
                return Integer.valueOf(compoundDrawableTintBlendMode);
            default:
                u0 u0Var14 = (u0) objArr[0];
                int i127 = f61221y0;
                int i128 = i127 & 75;
                int i129 = ((i127 ^ 75) | i128) << 1;
                int i130 = -((i127 | 75) & (~i128));
                int i131 = (i129 & i130) + (i130 | i129);
                E0 = i131 % 128;
                int i132 = i131 % 2;
                u0Var14.m();
                ady adyVarE = super.e();
                int i133 = E0;
                int i134 = i133 & 31;
                int i135 = (i134 - (~(-(-((i133 ^ 31) | i134))))) - 1;
                f61221y0 = i135 % 128;
                int i136 = i135 % 2;
                return adyVarE;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.aed, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setDividerPadding(new Object[]{this}, 948108167, -948108157, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1838181961, -1838181953, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 2136302043, -2136302040, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setDividerPadding(new Object[]{this}, 844848082, -844848082, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final aee g() {
        return (aee) setDividerPadding(new Object[]{this}, -90081417, 90081428, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final ads h() {
        return (ads) setDividerPadding(new Object[]{this}, -1076686321, 1076686327, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed, com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1420478530, 1420478537, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final adl i() {
        return (adl) setDividerPadding(new Object[]{this}, -2055514855, 2055514860, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed, java.lang.Iterable
    public final Iterator<add> iterator() {
        return (Iterator) setDividerPadding(new Object[]{this}, -1801796520, 1801796524, System.identityHashCode(this));
    }

    public final synchronized byte[] l() {
        byte[] bArr;
        int i10 = E0;
        int i11 = (((i10 | 50) << 1) - (i10 ^ 50)) - 1;
        f61221y0 = i11 % 128;
        int i12 = i11 % 2;
        bArr = this.f61222x0;
        int i13 = ((i10 ^ 117) | (i10 & 117)) << 1;
        int i14 = -(((~i10) & 117) | (i10 & (-118)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f61221y0 = i15 % 128;
        int i16 = i15 % 2;
        return bArr;
    }

    public final synchronized void m() {
        int i10 = f61221y0;
        int i11 = (i10 | 51) << 1;
        int i12 = -(i10 ^ 51);
        int i13 = (i11 & i12) + (i11 | i12);
        E0 = i13 % 128;
        int i14 = i13 % 2;
        if (this.f61222x0 == null) {
            int i15 = i10 & 89;
            int i16 = ((i10 ^ 89) | i15) << 1;
            int i17 = -((i10 | 89) & (~i15));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            E0 = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 49 / 0;
                return;
            }
            return;
        }
        adq adqVar = new adq(this.f61222x0, (byte) 0);
        try {
            adh adhVar = (adh) adq.setOnFocusChangeListener(new Object[]{adqVar}, 1289812975, -1289812962, System.identityHashCode(adqVar));
            adqVar.close();
            this.f52530t0 = (add[]) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar}, -497700352, 497700355, System.identityHashCode(adhVar));
            this.f61222x0 = null;
            int i20 = E0;
            int i21 = (i20 & 21) + (i20 | 21);
            f61221y0 = i21 % 128;
            int i22 = i21 % 2;
            return;
        } catch (IOException e5) {
            throw new adx("malformed ASN.1: ".concat(String.valueOf(e5)), e5);
        }
        throw th;
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1596964761, -1596964748, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final acz setOnFocusChangeListener() {
        return (acz) setDividerPadding(new Object[]{this}, -180010721, 180010733, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final add setX(int i10) {
        return (add) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 855717417, -855717415, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final Enumeration setDividerPadding() {
        return (Enumeration) setDividerPadding(new Object[]{this}, -299155184, 299155193, System.identityHashCode(this));
    }
}
