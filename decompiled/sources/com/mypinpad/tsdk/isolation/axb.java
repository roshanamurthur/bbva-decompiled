package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class axb extends axc {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54079w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f54080x0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54081s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54082t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54083u0;
    public final byte[] v0;

    public axb(axd axdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, axdVar);
        this.f54082t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54083u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54081s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (~(i14 | i15)) | (~(i15 | i12));
        int i17 = ~(i11 | (~i12) | i10);
        int i18 = (((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13;
        if (i18 == 1) {
            axb axbVar = (axb) objArr[0];
            int i19 = f54079w0;
            int i20 = i19 & 3;
            int i21 = ((((i19 ^ 3) | i20) << 1) - (~(-((i19 | 3) & (~i20))))) - 1;
            f54080x0 = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{axbVar.f54081s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i23 = f54079w0;
            int i24 = (i23 & 55) + (i23 | 55);
            f54080x0 = i24 % 128;
            int i25 = i24 % 2;
            return bArr;
        }
        if (i18 == 2) {
            axb axbVar2 = (axb) objArr[0];
            int i26 = (-2) - ((f54080x0 + 106) ^ (-1));
            f54079w0 = i26 % 128;
            int i27 = i26 % 2;
            byte[] bArr2 = axbVar2.f54082t0;
            if (i27 != 0) {
                throw null;
            }
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i28 = f54080x0;
            int i29 = i28 & 53;
            int i30 = (i28 | 53) & (~i29);
            int i31 = i29 << 1;
            int i32 = (i30 & i31) + (i30 | i31);
            f54079w0 = i32 % 128;
            if (i32 % 2 == 0) {
                return bArr3;
            }
            throw null;
        }
        if (i18 == 3) {
            axb axbVar3 = (axb) objArr[0];
            int i33 = f54080x0;
            int i34 = ((i33 ^ 39) | (i33 & 39)) << 1;
            int i35 = -(((~i33) & 39) | (i33 & (-40)));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            f54079w0 = i36 % 128;
            int i37 = i36 % 2;
            byte[] bArr4 = axbVar3.f54083u0;
            Object[] objArr2 = new Object[1];
            if (i37 == 0) {
                objArr2[0] = bArr4;
                return (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            objArr2[0] = bArr4;
            throw null;
        }
        axb axbVar4 = (axb) objArr[0];
        int i38 = f54079w0;
        int i39 = i38 & 63;
        int i40 = i38 | 63;
        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
        f54080x0 = i41 % 128;
        int i42 = i41 % 2;
        byte[] bArr5 = axbVar4.v0;
        Object[] objArr3 = new Object[1];
        if (i42 == 0) {
            objArr3[0] = bArr5;
            throw null;
        }
        objArr3[0] = bArr5;
        byte[] bArr6 = (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
        int i43 = f54079w0;
        int i44 = (i43 & 65) + (i43 | 65);
        f54080x0 = i44 % 128;
        if (i44 % 2 != 0) {
            return bArr6;
        }
        int i45 = 81 / 0;
        return bArr6;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, 1451481634, -1451481632, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 797801793, -797801792, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, -1681034560, 1681034563, System.identityHashCode(this));
    }

    public final byte[] setOnLongClickListener() {
        return (byte[]) setX(new Object[]{this}, -2027235239, 2027235239, System.identityHashCode(this));
    }
}
