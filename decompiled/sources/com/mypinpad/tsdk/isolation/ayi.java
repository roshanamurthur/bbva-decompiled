package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;

/* JADX INFO: loaded from: classes10.dex */
public final class ayi extends ayl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54152t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54153u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54154s0;

    public ayi(ayk aykVar, byte[] bArr) {
        super(false, aykVar);
        this.f54154s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949)) != 1) {
            ayi ayiVar = (ayi) objArr[0];
            int i15 = f54153u0;
            int i16 = ((i15 & 106) + (i15 | 106)) - 1;
            f54152t0 = i16 % 128;
            int i17 = i16 % 2;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{ayiVar.f54154s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i18 = f54152t0;
            int i19 = (i18 ^ 65) + ((i18 & 65) << 1);
            f54153u0 = i19 % 128;
            int i20 = i19 % 2;
            return bArr2;
        }
        ayi ayiVar2 = (ayi) objArr[0];
        int i21 = f54153u0;
        int i22 = i21 ^ 81;
        int i23 = ((i21 & 81) | i22) << 1;
        int i24 = -i22;
        int i25 = (i23 & i24) + (i23 | i24);
        f54152t0 = i25 % 128;
        Object[] objArr2 = new Object[1];
        if (i25 % 2 != 0) {
            objArr2[0] = ayiVar2;
            bArr = (byte[]) setX(objArr2, 322309298, -322309298, System.identityHashCode(ayiVar2));
            int i26 = 35 / 0;
        } else {
            objArr2[0] = ayiVar2;
            bArr = (byte[]) setX(objArr2, 322309298, -322309298, System.identityHashCode(ayiVar2));
        }
        int i27 = f54153u0;
        int i28 = (i27 & 23) + (i27 | 23);
        f54152t0 = i28 % 128;
        if (i28 % 2 == 0) {
            return bArr;
        }
        int i29 = 17 / 0;
        return bArr;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -1328119761, 1328119762, System.identityHashCode(this));
    }
}
