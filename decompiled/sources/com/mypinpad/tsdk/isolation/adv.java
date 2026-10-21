package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class adv extends ady {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52516u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ado f52517t0;

    static {
        Integer num = 7;
        num.intValue();
        int i10 = f52516u0 + 51;
        v0 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public adv(ado adoVar) {
        if (adoVar == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.f52517t0 = adoVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x01c8  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        adv advVar;
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i11);
        int i17 = ~i11;
        int i18 = i14 | i17;
        switch (((i10 | i11) * 184) + (((~i18) | (~(i13 | i17)) | (~i15)) * 184) + ((i16 | (~(i18 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183))) {
            case 1:
                adv advVar2 = (adv) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i19 = f52516u0;
                int i20 = i19 & 103;
                int i21 = -(-((i19 ^ 103) | i20));
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                v0 = i22 % 128;
                if (i22 % 2 == 0) {
                    boolean z10 = adyVar instanceof adv;
                    throw null;
                }
                if (!(!(adyVar instanceof adv))) {
                    ado adoVar = advVar2.f52517t0;
                    boolean zBooleanValue = ((Boolean) ado.setDividerPadding(new Object[]{adoVar, ((adv) adyVar).f52517t0}, -1267727625, 1267727630, System.identityHashCode(adoVar))).booleanValue();
                    int i23 = v0;
                    int i24 = i23 & 67;
                    int i25 = -(-((i23 ^ 67) | i24));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    f52516u0 = i26 % 128;
                    int i27 = i26 % 2;
                    objValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    int i28 = i19 + 91;
                    v0 = i28 % 128;
                    if (i28 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
                break;
            case 2:
                adv advVar3 = (adv) objArr[0];
                int i29 = v0;
                int i30 = i29 + 17;
                f52516u0 = i30 % 128;
                int i31 = i30 % 2;
                ado adoVar2 = advVar3.f52517t0;
                int i32 = i29 & 33;
                int i33 = ((i29 | 33) & (~i32)) + (i32 << 1);
                f52516u0 = i33 % 128;
                objValueOf = adoVar2;
                if (i33 % 2 != 0) {
                    throw null;
                }
                break;
            case 3:
                int i34 = v0;
                int i35 = (i34 & (-70)) | ((~i34) & 69);
                int i36 = (i34 & 69) << 1;
                int i37 = (i35 & i36) + (i36 | i35);
                int i38 = i37 % 128;
                f52516u0 = i38;
                int i39 = i37 % 2;
                int i40 = ((i38 ^ 99) | (i38 & 99)) << 1;
                int i41 = -(((~i38) & 99) | (i38 & (-100)));
                int i42 = (i40 & i41) + (i41 | i40);
                v0 = i42 % 128;
                int i43 = i42 % 2;
                return Boolean.FALSE;
            case 4:
                adv advVar4 = (adv) objArr[0];
                int i44 = f52516u0;
                int i45 = (((i44 ^ 109) | (i44 & 109)) << 1) - (((~i44) & 109) | (i44 & (-110)));
                v0 = i45 % 128;
                int i46 = i45 % 2;
                ado adoVar3 = advVar4.f52517t0;
                adoVar3.a();
                if (i46 == 0) {
                    int i47 = 41 / 0;
                    if (adoVar3 != advVar4.f52517t0) {
                        adv advVar5 = new adv(adoVar3);
                        int i48 = f52516u0 + 33;
                        v0 = i48 % 128;
                        int i49 = i48 % 2;
                        objValueOf = advVar5;
                    } else {
                        int i50 = f52516u0;
                        int i51 = i50 | 83;
                        int i52 = (i51 << 1) - ((~(i50 & 83)) & i51);
                        v0 = i52 % 128;
                        int i53 = i52 % 2;
                        objValueOf = advVar4;
                    }
                } else if (adoVar3 != advVar4.f52517t0) {
                    adv advVar6 = new adv(adoVar3);
                    int i410 = f52516u0 + 33;
                    v0 = i410 % 128;
                    int i411 = i410 % 2;
                    objValueOf = advVar6;
                } else {
                    int i54 = f52516u0;
                    int i55 = i54 | 83;
                    int i56 = (i55 << 1) - ((~(i54 & 83)) & i55);
                    v0 = i56 % 128;
                    int i57 = i56 % 2;
                    objValueOf = advVar4;
                }
                break;
            case 5:
                adv advVar7 = (adv) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i58 = f52516u0;
                int i59 = i58 & 69;
                int i60 = i59 + ((i58 ^ 69) | i59);
                v0 = i60 % 128;
                int i61 = i60 % 2;
                ado adoVar4 = advVar7.f52517t0;
                if (i61 != 0) {
                    return Integer.valueOf(((Integer) ado.setDividerPadding(new Object[]{adoVar4, Boolean.valueOf(zBooleanValue2)}, 1019432356, -1019432355, System.identityHashCode(adoVar4))).intValue());
                }
                ((Integer) ado.setDividerPadding(new Object[]{adoVar4, Boolean.valueOf(zBooleanValue2)}, 1019432356, -1019432355, System.identityHashCode(adoVar4))).intValue();
                throw null;
            case 6:
                adv advVar8 = (adv) objArr[0];
                int i62 = v0 + 65;
                f52516u0 = i62 % 128;
                int i63 = i62 % 2;
                ado adoVar5 = advVar8.f52517t0;
                if (i63 == 0) {
                    return Integer.valueOf(~adoVar5.hashCode());
                }
                adoVar5.hashCode();
                throw null;
            case 7:
                byte[] bArr = (byte[]) objArr[0];
                int i64 = ado.f52485u0;
                adv advVar9 = new adv((ado) ado.setDividerPadding(new Object[]{bArr}, 1819217987, -1819217981, (int) System.currentTimeMillis()));
                int i65 = v0 + 63;
                f52516u0 = i65 % 128;
                int i66 = i65 % 2;
                return advVar9;
            case 8:
                adv advVar10 = (adv) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                int i67 = v0 + 95;
                f52516u0 = i67 % 128;
                int i68 = i67 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue3), 7}, 1303469841, -1303469839, 7);
                ado adoVar6 = advVar10.f52517t0;
                ado.setDividerPadding(new Object[]{adoVar6, aebVar, Boolean.FALSE}, 1209042707, -1209042704, System.identityHashCode(adoVar6));
                int i69 = f52516u0;
                int i70 = (i69 & 75) + (i69 | 75);
                v0 = i70 % 128;
                int i71 = i70 % 2;
                return null;
            default:
                adv advVar11 = (adv) objArr[0];
                int i72 = v0;
                int i73 = i72 & 29;
                int i74 = (i72 ^ 29) | i73;
                int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                f52516u0 = i75 % 128;
                int i76 = i75 % 2;
                ado adoVar7 = advVar11.f52517t0;
                adoVar7.e();
                if (adoVar7 == advVar11.f52517t0) {
                    int i77 = v0;
                    int i78 = i77 & 19;
                    int i79 = (i78 - (~(-(-((i77 ^ 19) | i78))))) - 1;
                    int i80 = i79 % 128;
                    f52516u0 = i80;
                    if (i79 % 2 != 0) {
                        int i81 = 33 / 0;
                    }
                    int i82 = i80 & 107;
                    int i83 = (i82 - (~(-(-((i80 ^ 107) | i82))))) - 1;
                    v0 = i83 % 128;
                    int i84 = i83 % 2;
                    objValueOf = advVar11;
                } else {
                    advVar = new adv(adoVar7);
                    int i85 = v0;
                    int i86 = (((i85 ^ 67) | (i85 & 67)) << 1) - (((~i85) & 67) | (i85 & (-68)));
                    f52516u0 = i86 % 128;
                    if (i86 % 2 != 0) {
                        objValueOf = advVar;
                        throw null;
                    }
                }
                break;
        }
        objValueOf = advVar;
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setDividerPadding(new Object[]{this}, 1929949690, -1929949686, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1768367118, -1768367113, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -855839611, 855839619, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, 1032313466, -1032313465, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setDividerPadding(new Object[]{this}, 1272826472, -1272826472, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -88164153, 88164159, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1381324462, -1381324459, System.identityHashCode(this))).booleanValue();
    }

    public final ado setDividerPadding() {
        return (ado) setDividerPadding(new Object[]{this}, -463731482, 463731484, System.identityHashCode(this));
    }
}
