package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ayw extends ayo {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f54176y0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54177t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54178u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54179w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f54180x0;

    public ayw(ayr ayrVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, ayrVar);
        this.f54177t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54178u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54179w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54180x0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = (((~((~i12) | i14)) | i13 | i15) * 398) + ((i10 | i11) * (-1194)) + ((i13 | i15 | (~(i14 | i12))) * 398) + (i11 * 399) + (i10 * 399);
        if (i16 == 1) {
            ayw aywVar = (ayw) objArr[0];
            int i17 = f54176y0;
            int i18 = ((i17 & 17) - (~(-(-(i17 | 17))))) - 1;
            E0 = i18 % 128;
            int i19 = i18 % 2;
            byte[] bArr2 = aywVar.f54178u0;
            if (i19 == 0) {
                throw null;
            }
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i20 = f54176y0;
            int i21 = ((i20 | 111) << 1) - (i20 ^ 111);
            E0 = i21 % 128;
            int i22 = i21 % 2;
            return bArr3;
        }
        if (i16 == 2) {
            ayw aywVar2 = (ayw) objArr[0];
            int i23 = E0;
            int i24 = i23 & 101;
            int i25 = ((((i23 ^ 101) | i24) << 1) - (~(-((i23 | 101) & (~i24))))) - 1;
            f54176y0 = i25 % 128;
            int i26 = i25 % 2;
            byte[] bArr4 = aywVar2.f54179w0;
            Object[] objArr2 = new Object[1];
            if (i26 != 0) {
                objArr2[0] = bArr4;
                bArr = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                int i27 = 80 / 0;
            } else {
                objArr2[0] = bArr4;
                bArr = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            int i28 = f54176y0;
            int i29 = i28 & 33;
            int i30 = -(-((i28 ^ 33) | i29));
            int i31 = (i29 & i30) + (i30 | i29);
            E0 = i31 % 128;
            int i32 = i31 % 2;
            return bArr;
        }
        if (i16 == 3) {
            ayw aywVar3 = (ayw) objArr[0];
            int i33 = E0;
            int i34 = i33 & 95;
            int i35 = ((i33 ^ 95) | i34) << 1;
            int i36 = -((i33 | 95) & (~i34));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            f54176y0 = i37 % 128;
            int i38 = i37 % 2;
            byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{aywVar3.f54180x0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i39 = E0;
            int i40 = (i39 ^ 51) + ((i39 & 51) << 1);
            f54176y0 = i40 % 128;
            if (i40 % 2 == 0) {
                return bArr5;
            }
            throw null;
        }
        if (i16 == 4) {
            ayw aywVar4 = (ayw) objArr[0];
            int i41 = f54176y0 + 25;
            E0 = i41 % 128;
            int i42 = i41 % 2;
            byte[] bArr6 = (byte[]) bek.setOnFocusChangeListener(new Object[]{aywVar4.v0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i43 = f54176y0;
            int i44 = ((i43 | 73) << 1) - (i43 ^ 73);
            E0 = i44 % 128;
            if (i44 % 2 != 0) {
                return bArr6;
            }
            int i45 = 70 / 0;
            return bArr6;
        }
        ayw aywVar5 = (ayw) objArr[0];
        int i46 = f54176y0;
        int i47 = (((i46 ^ 29) | (i46 & 29)) << 1) - (((~i46) & 29) | (i46 & (-30)));
        E0 = i47 % 128;
        int i48 = i47 % 2;
        byte[] bArr7 = aywVar5.f54177t0;
        Object[] objArr3 = new Object[1];
        if (i48 != 0) {
            objArr3[0] = bArr7;
            return (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
        }
        objArr3[0] = bArr7;
        byte[] bArr8 = (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
        int i49 = 49 / 0;
        return bArr8;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 2019837567, -2019837563, System.identityHashCode(this));
    }

    public final byte[] setLayoutAnimation() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1788803735, -1788803732, System.identityHashCode(this));
    }

    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1881669751, -1881669749, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -921823355, 921823356, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1881081668, 1881081668, System.identityHashCode(this));
    }
}
