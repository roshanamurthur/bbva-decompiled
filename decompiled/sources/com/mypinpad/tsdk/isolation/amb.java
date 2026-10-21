package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class amb implements akg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f53172d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53173e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53174f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f53175a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public anw f53176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f53177c;

    static {
        int i10 = f53173e;
        int i11 = ((i10 & (-42)) | ((~i10) & 41)) + ((i10 & 41) << 1);
        f53174f = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0259 A[PHI: r3
      0x0259: PHI (r3v13 java.math.BigInteger) = (r3v12 java.math.BigInteger), (r3v15 java.math.BigInteger) binds: [B:52:0x0257, B:49:0x0246] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e8  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        BigInteger bigIntegerMod;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int i13;
        int iIntValue;
        int i14 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i15 = ~i10;
        int i16 = ~i12;
        int i17 = ((i15 | (~(i11 | i16))) * 783) + ((~(i15 | i16 | i11)) * (-783)) + i14;
        if (i17 == 1) {
            amb ambVar = (amb) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int i18 = f53174f;
            int i19 = (i18 | 107) << 1;
            int i20 = -(((~i18) & 107) | (i18 & (-108)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f53173e = i21 % 128;
            if (i21 % 2 != 0) {
                anw anwVar = ambVar.f53176b;
                throw null;
            }
            if (ambVar.f53176b == null) {
                throw new IllegalStateException("RSA engine not initialised");
            }
            z0 z0Var = ambVar.f53175a;
            BigInteger bigInteger3 = (BigInteger) z0.c(new Object[]{z0Var, bArr, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, 1969164581, -1969164580, iIntValue2);
            anw anwVar2 = ambVar.f53176b;
            if (anwVar2 instanceof anu) {
                int i22 = f53173e;
                int i23 = i22 ^ 107;
                int i24 = (i22 & 107) << 1;
                int i25 = (i23 & i24) + (i24 | i23);
                f53174f = i25 % 128;
                anu anuVar = (anu) anwVar2;
                if (i25 % 2 == 0) {
                    bigInteger = (BigInteger) anu.setCompoundDrawableTintBlendMode(new Object[]{anuVar}, -1732850302, 1732850305, System.identityHashCode(anuVar));
                    int i26 = 23 / 0;
                    if (bigInteger != null) {
                        bigInteger2 = (BigInteger) anw.setX(new Object[]{anuVar}, -674276868, 674276871, System.identityHashCode(anuVar));
                        BigInteger bigInteger4 = f53172d;
                        BigInteger bigInteger5 = (BigInteger) bep.setDividerPadding(new Object[]{bigInteger4, bigInteger2.subtract(bigInteger4), ambVar.f53177c}, -1670582261, 1670582264, (int) System.currentTimeMillis());
                        bigIntegerMod = ((BigInteger) z0.c(new Object[]{z0Var, bigInteger5.modPow(bigInteger, bigInteger2).multiply(bigInteger3).mod(bigInteger2)}, -569198834, 569198838, System.identityHashCode(z0Var))).multiply((BigInteger) bep.setDividerPadding(new Object[]{bigInteger2, bigInteger5}, -906767090, 906767094, (int) System.currentTimeMillis())).mod(bigInteger2);
                        if (bigInteger3.equals(bigIntegerMod.modPow(bigInteger, bigInteger2))) {
                            throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                        }
                        int i27 = f53174f;
                        i13 = (i27 & 39) + (i27 | 39);
                        f53173e = i13 % 128;
                    } else {
                        bigIntegerMod = (BigInteger) z0.c(new Object[]{z0Var, bigInteger3}, -569198834, 569198838, System.identityHashCode(z0Var));
                        int i28 = f53173e;
                        i13 = ((i28 & 52) + (i28 | 52)) - 1;
                        f53174f = i13 % 128;
                    }
                } else {
                    bigInteger = (BigInteger) anu.setCompoundDrawableTintBlendMode(new Object[]{anuVar}, -1732850302, 1732850305, System.identityHashCode(anuVar));
                    if (bigInteger != null) {
                        bigInteger2 = (BigInteger) anw.setX(new Object[]{anuVar}, -674276868, 674276871, System.identityHashCode(anuVar));
                        BigInteger bigInteger6 = f53172d;
                        BigInteger bigInteger7 = (BigInteger) bep.setDividerPadding(new Object[]{bigInteger6, bigInteger2.subtract(bigInteger6), ambVar.f53177c}, -1670582261, 1670582264, (int) System.currentTimeMillis());
                        bigIntegerMod = ((BigInteger) z0.c(new Object[]{z0Var, bigInteger7.modPow(bigInteger, bigInteger2).multiply(bigInteger3).mod(bigInteger2)}, -569198834, 569198838, System.identityHashCode(z0Var))).multiply((BigInteger) bep.setDividerPadding(new Object[]{bigInteger2, bigInteger7}, -906767090, 906767094, (int) System.currentTimeMillis())).mod(bigInteger2);
                        if (bigInteger3.equals(bigIntegerMod.modPow(bigInteger, bigInteger2))) {
                            throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                        }
                        int i29 = f53174f;
                        i13 = (i29 & 39) + (i29 | 39);
                        f53173e = i13 % 128;
                    } else {
                        bigIntegerMod = (BigInteger) z0.c(new Object[]{z0Var, bigInteger3}, -569198834, 569198838, System.identityHashCode(z0Var));
                        int i210 = f53173e;
                        i13 = ((i210 & 52) + (i210 | 52)) - 1;
                        f53174f = i13 % 128;
                    }
                }
                int i30 = i13 % 2;
            } else {
                bigIntegerMod = (BigInteger) z0.c(new Object[]{z0Var, bigInteger3}, -569198834, 569198838, System.identityHashCode(z0Var));
                int i31 = f53174f + 75;
                f53173e = i31 % 128;
                int i32 = i31 % 2;
            }
            byte[] bArr2 = (byte[]) z0.c(new Object[]{z0Var, bigIntegerMod}, -1917286509, 1917286515, System.identityHashCode(z0Var));
            int i33 = f53174f;
            int i34 = ((i33 & 36) + (i33 | 36)) - 1;
            f53173e = i34 % 128;
            if (i34 % 2 == 0) {
                return bArr2;
            }
            int i35 = 59 / 0;
            return bArr2;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                amb ambVar2 = (amb) objArr[0];
                int i36 = f53173e;
                int i37 = (i36 & 55) + (i36 | 55);
                f53174f = i37 % 128;
                int i38 = i37 % 2;
                z0 z0Var2 = ambVar2.f53175a;
                if (i38 == 0) {
                    iIntValue = ((Integer) z0.c(new Object[]{z0Var2}, -2125679086, 2125679088, System.identityHashCode(z0Var2))).intValue();
                    int i39 = 57 / 0;
                } else {
                    iIntValue = ((Integer) z0.c(new Object[]{z0Var2}, -2125679086, 2125679088, System.identityHashCode(z0Var2))).intValue();
                }
                return Integer.valueOf(iIntValue);
            }
            amb ambVar3 = (amb) objArr[0];
            int i40 = f53173e + 15;
            f53174f = i40 % 128;
            int i41 = i40 % 2;
            z0 z0Var3 = ambVar3.f53175a;
            int iIntValue4 = ((Integer) z0.c(new Object[]{z0Var3}, 1747311238, -1747311238, System.identityHashCode(z0Var3))).intValue();
            int i42 = f53174f;
            int i43 = (i42 ^ 121) + ((i42 & 121) << 1);
            f53173e = i43 % 128;
            if (i43 % 2 == 0) {
                return Integer.valueOf(iIntValue4);
            }
            throw null;
        }
        amb ambVar4 = (amb) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        akk akkVar = (akk) objArr[2];
        int i44 = f53173e;
        int i45 = ((i44 | 63) << 1) - (i44 ^ 63);
        f53174f = i45 % 128;
        int i46 = i45 % 2;
        z0 z0Var4 = ambVar4.f53175a;
        z0.c(new Object[]{z0Var4, Boolean.valueOf(zBooleanValue), akkVar}, -1093978766, 1093978771, System.identityHashCode(z0Var4));
        if (!(akkVar instanceof ant)) {
            anw anwVar3 = (anw) akkVar;
            ambVar4.f53176b = anwVar3;
            if (anwVar3 instanceof anu) {
                int i47 = f53173e + 91;
                f53174f = i47 % 128;
                int i48 = i47 % 2;
                ambVar4.f53177c = (SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis());
                int i49 = f53174f + 95;
                f53173e = i49 % 128;
                if (i49 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            ambVar4.f53177c = null;
            int i50 = f53173e;
            int i51 = i50 | 75;
            int i52 = i51 << 1;
            int i53 = -((~(i50 & 75)) & i51);
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            f53174f = i54 % 128;
            if (i54 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i55 = f53174f + 99;
        f53173e = i55 % 128;
        ant antVar = (ant) akkVar;
        if (i55 % 2 != 0) {
            anw anwVar4 = (anw) ((akk) ant.setOnFocusChangeListener(new Object[]{antVar}, -310755770, 310755770, System.identityHashCode(antVar)));
            ambVar4.f53176b = anwVar4;
            boolean z10 = anwVar4 instanceof anu;
            throw null;
        }
        anw anwVar5 = (anw) ((akk) ant.setOnFocusChangeListener(new Object[]{antVar}, -310755770, 310755770, System.identityHashCode(antVar)));
        ambVar4.f53176b = anwVar5;
        if (!(!(anwVar5 instanceof anu))) {
            ambVar4.f53177c = (SecureRandom) ant.setOnFocusChangeListener(new Object[]{antVar}, 1149346033, -1149346032, System.identityHashCode(antVar));
            int i56 = f53174f;
            int i57 = i56 & 27;
            int i58 = (i56 | 27) & (~i57);
            int i59 = i57 << 1;
            int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
            f53173e = i60 % 128;
            if (i60 % 2 == 0) {
                return null;
            }
            throw null;
        }
        ambVar4.f53177c = null;
        int i61 = f53173e;
        int i62 = i61 & 1;
        int i63 = -(-(i61 | 1));
        int i64 = (i62 & i63) + (i63 | i62);
        f53174f = i64 % 128;
        if (i64 % 2 != 0) {
            return null;
        }
        int i65 = 49 / 0;
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setX(new Object[]{this}, 736020765, -736020765, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final byte[] setOnFocusChangeListener(byte[] bArr, int i10, int i11) {
        return (byte[]) setX(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1832271069, 1832271070, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -1247782223, 1247782226, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final void setX(boolean z10, akk akkVar) {
        setX(new Object[]{this, Boolean.valueOf(z10), akkVar}, 1250905140, -1250905138, System.identityHashCode(this));
    }
}
