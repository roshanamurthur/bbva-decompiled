package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class amf implements akg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53197b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53198c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f53199a;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = (((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        if (i14 == 1) {
            amf amfVar = (amf) objArr[0];
            int i15 = f53197b;
            int i16 = i15 | 95;
            int i17 = ((i16 << 1) - (~(-((~(i15 & 95)) & i16)))) - 1;
            f53198c = i17 % 128;
            int i18 = i17 % 2;
            z0 z0Var = amfVar.f53199a;
            int iIntValue = ((Integer) z0.c(new Object[]{z0Var}, -2125679086, 2125679088, System.identityHashCode(z0Var))).intValue();
            int i19 = f53198c + 55;
            f53197b = i19 % 128;
            int i20 = i19 % 2;
            return Integer.valueOf(iIntValue);
        }
        if (i14 == 2) {
            amf amfVar2 = (amf) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int i21 = f53197b;
            int i22 = i21 & 89;
            int i23 = (i22 - (~(-(-((i21 ^ 89) | i22))))) - 1;
            f53198c = i23 % 128;
            if (i23 % 2 == 0) {
                z0 z0Var2 = amfVar2.f53199a;
                throw null;
            }
            z0 z0Var3 = amfVar2.f53199a;
            if (z0Var3 == null) {
                throw new IllegalStateException("RSA engine not initialised");
            }
            byte[] bArr2 = (byte[]) z0.c(new Object[]{z0Var3, (BigInteger) z0.c(new Object[]{z0Var3, (BigInteger) z0.c(new Object[]{z0Var3, bArr, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, 1969164581, -1969164580, iIntValue2)}, -569198834, 569198838, System.identityHashCode(z0Var3))}, -1917286509, 1917286515, System.identityHashCode(z0Var3));
            int i24 = f53197b;
            int i25 = (i24 & 43) + (i24 | 43);
            f53198c = i25 % 128;
            int i26 = i25 % 2;
            return bArr2;
        }
        if (i14 != 3) {
            amf amfVar3 = (amf) objArr[0];
            int i27 = f53198c + 71;
            f53197b = i27 % 128;
            int i28 = i27 % 2;
            z0 z0Var4 = amfVar3.f53199a;
            int iIntValue4 = ((Integer) z0.c(new Object[]{z0Var4}, 1747311238, -1747311238, System.identityHashCode(z0Var4))).intValue();
            int i29 = f53197b;
            int i30 = i29 & 71;
            int i31 = (i30 - (~((i29 ^ 71) | i30))) - 1;
            f53198c = i31 % 128;
            int i32 = i31 % 2;
            return Integer.valueOf(iIntValue4);
        }
        amf amfVar4 = (amf) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        akk akkVar = (akk) objArr[2];
        int i33 = f53197b + 31;
        f53198c = i33 % 128;
        int i34 = i33 % 2;
        if (amfVar4.f53199a == null) {
            amfVar4.f53199a = new z0();
            int i35 = f53198c + 56;
            int i36 = (i35 ^ (-1)) + (i35 << 1);
            f53197b = i36 % 128;
            int i37 = i36 % 2;
        }
        z0 z0Var5 = amfVar4.f53199a;
        z0.c(new Object[]{z0Var5, Boolean.valueOf(zBooleanValue), akkVar}, -1093978766, 1093978771, System.identityHashCode(z0Var5));
        int i38 = f53197b;
        int i39 = (i38 & 90) + (i38 | 90);
        int i40 = (i39 ^ (-1)) + (i39 << 1);
        f53198c = i40 % 128;
        if (i40 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final byte[] setOnFocusChangeListener(byte[] bArr, int i10, int i11) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1768380742, 1768380744, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final void setX(boolean z10, akk akkVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10), akkVar}, -968902982, 968902985, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -504188291, 504188291, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 531864761, -531864760, System.identityHashCode(this))).intValue();
    }
}
