package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ado extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52485u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52486t0;

    public static class a extends j0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52487f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f52488g = 1;

        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            Object[] objArr = {this, aftVar};
            System.identityHashCode(this);
            aft aftVar2 = (aft) objArr[1];
            int i10 = f52487f;
            int i11 = i10 | 57;
            int i12 = i11 << 1;
            int i13 = -((~(i10 & 57)) & i11);
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            f52488g = i14 % 128;
            int i15 = i14 % 2;
            ado adoVar = (ado) ado.setDividerPadding(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar2}, -952512304, 952512305, System.identityHashCode(aftVar2))}, 1819217987, -1819217981, (int) System.currentTimeMillis());
            int i16 = f52488g + 9;
            f52487f = i16 % 128;
            int i17 = i16 % 2;
            return adoVar;
        }
    }

    static {
        new a(ado.class, 25);
        int i10 = v0;
        int i11 = ((i10 | 73) << 1) - (i10 ^ 73);
        f52485u0 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fc  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        Boolean boolValueOf;
        boolean zBooleanValue;
        int i13;
        int i14 = ~i11;
        int i15 = ~i12;
        switch ((((~(i10 | i11)) | (~(i12 | i14))) * 49) + (((~((~i10) | i15)) | i14 | (~(i10 | i12))) * (-49)) + (((~(i14 | i15)) | (~(i14 | i10))) * 98) + (i11 * (-97)) + (i10 * 50)) {
            case 1:
                ado adoVar = (ado) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i16 = f52485u0 + 51;
                v0 = i16 % 128;
                int i17 = i16 % 2;
                byte[] bArr = adoVar.f52486t0;
                if (i17 == 0) {
                    int length = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                    int i18 = 67 / 0;
                } else {
                    int length2 = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                }
                int i19 = v0;
                int i20 = i19 & 55;
                int i21 = -(-((i19 ^ 55) | i20));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f52485u0 = i22 % 128;
                int i23 = i22 % 2;
                return Integer.valueOf(iIntValue);
            case 2:
                int i24 = f52485u0;
                int i25 = ((((i24 ^ 103) | (i24 & 103)) << 1) - (~(-((i24 & (-104)) | ((~i24) & 103))))) - 1;
                v0 = i25 % 128;
                int i26 = i25 % 2;
                int i27 = i24 & 61;
                int i28 = -(-((i24 ^ 61) | i27));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                v0 = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 96 / 0;
                }
                boolValueOf = Boolean.FALSE;
                break;
            case 3:
                ado adoVar2 = (ado) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                int i31 = v0 + 37;
                f52485u0 = i31 % 128;
                int i32 = i31 % 2;
                byte[] bArr2 = adoVar2.f52486t0;
                if (i32 != 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue3), 74, bArr2}, 478760665, -478760661, 74);
                    return null;
                }
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue3), 25, bArr2}, 478760665, -478760661, 25);
                return null;
            case 4:
                ado adoVar3 = (ado) objArr[0];
                int i33 = f52485u0 + 69;
                v0 = i33 % 128;
                int i34 = i33 % 2;
                byte[] bArr3 = adoVar3.f52486t0;
                if (i34 == 0) {
                    throw null;
                }
                String str = (String) bez.setX(new Object[]{bArr3}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                int i35 = f52485u0 + 111;
                v0 = i35 % 128;
                int i36 = i35 % 2;
                return str;
            case 5:
                ado adoVar4 = (ado) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i37 = f52485u0;
                int i38 = i37 & 85;
                int i39 = (((i37 ^ 85) | i38) << 1) - ((~i38) & (i37 | 85));
                v0 = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = 29 / 0;
                    if (!(adyVar instanceof ado)) {
                        int i41 = i37 + 93;
                        v0 = i41 % 128;
                        int i42 = i41 % 2;
                        boolValueOf = Boolean.FALSE;
                    } else {
                        zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adoVar4.f52486t0, ((ado) adyVar).f52486t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                        i13 = v0 + 59;
                        f52485u0 = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        boolValueOf = Boolean.valueOf(zBooleanValue);
                    }
                } else if (!(adyVar instanceof ado)) {
                    int i43 = i37 + 93;
                    v0 = i43 % 128;
                    int i44 = i43 % 2;
                    boolValueOf = Boolean.FALSE;
                } else {
                    zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adoVar4.f52486t0, ((ado) adyVar).f52486t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    i13 = v0 + 59;
                    f52485u0 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(zBooleanValue);
                }
                break;
            case 6:
                byte[] bArr4 = (byte[]) objArr[0];
                afl aflVar = new afl();
                if (bArr4 == null) {
                    throw new NullPointerException("'contents' cannot be null");
                }
                aflVar.f52486t0 = bArr4;
                int i45 = f52485u0;
                int i46 = i45 & 53;
                int i47 = (i46 - (~((i45 ^ 53) | i46))) - 1;
                v0 = i47 % 128;
                if (i47 % 2 != 0) {
                    return aflVar;
                }
                throw null;
            default:
                ado adoVar5 = (ado) objArr[0];
                int i48 = v0;
                int i49 = (i48 & 1) + (i48 | 1);
                f52485u0 = i49 % 128;
                int i50 = i49 % 2;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{adoVar5.f52486t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i51 = v0;
                int i52 = ((i51 ^ 97) | (i51 & 97)) << 1;
                int i53 = -(((~i51) & 97) | (i51 & (-98)));
                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                f52485u0 = i54 % 128;
                int i55 = i54 % 2;
                return Integer.valueOf(iIntValue2);
        }
        return boolValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1019432356, -1019432355, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1209042707, -1209042704, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, -1267727625, 1267727630, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -828690354, 828690354, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setDividerPadding(new Object[]{this}, 136450461, -136450457, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1896406273, -1896406271, System.identityHashCode(this))).booleanValue();
    }
}
