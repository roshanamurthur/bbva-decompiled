package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ayp extends ayj {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54163w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f54164x0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54165s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54166t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54167u0;
    public final byte[] v0;

    public ayp(ayn aynVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, aynVar);
        this.f54165s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54166t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54167u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = (((~(i10 | i11 | i12)) | (~((~i10) | i13)) | (~(i13 | i15))) * 676) + ((i14 | (~(i15 | i10))) * 676) + ((i10 | i12 | i13) * (-676)) + (i11 * (-675)) + (i10 * 677);
        if (i16 == 1) {
            ayp aypVar = (ayp) objArr[0];
            int i17 = f54164x0 + 6;
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            f54163w0 = i18 % 128;
            int i19 = i18 % 2;
            byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{aypVar.f54165s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i20 = f54164x0;
            int i21 = (((i20 | 24) << 1) - (i20 ^ 24)) - 1;
            f54163w0 = i21 % 128;
            if (i21 % 2 == 0) {
                return bArr;
            }
            int i22 = 79 / 0;
            return bArr;
        }
        if (i16 == 2) {
            ayp aypVar2 = (ayp) objArr[0];
            int i23 = f54163w0;
            int i24 = i23 & 89;
            int i25 = i23 | 89;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f54164x0 = i26 % 128;
            int i27 = i26 % 2;
            byte[] bArr2 = aypVar2.f54166t0;
            Object[] objArr2 = new Object[1];
            if (i27 == 0) {
                objArr2[0] = bArr2;
                throw null;
            }
            objArr2[0] = bArr2;
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            int i28 = f54164x0;
            int i29 = ((i28 | 3) << 1) - (i28 ^ 3);
            f54163w0 = i29 % 128;
            int i30 = i29 % 2;
            return bArr3;
        }
        if (i16 != 3) {
            ayp aypVar3 = (ayp) objArr[0];
            int i31 = f54164x0;
            int i32 = (((i31 ^ 21) | (i31 & 21)) << 1) - (((~i31) & 21) | (i31 & (-22)));
            f54163w0 = i32 % 128;
            int i33 = i32 % 2;
            byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{aypVar3.v0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i34 = f54164x0;
            int i35 = ((i34 ^ 22) + ((i34 & 22) << 1)) - 1;
            f54163w0 = i35 % 128;
            int i36 = i35 % 2;
            return bArr4;
        }
        ayp aypVar4 = (ayp) objArr[0];
        int i37 = f54163w0 + 103;
        f54164x0 = i37 % 128;
        int i38 = i37 % 2;
        byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{aypVar4.f54167u0}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i39 = f54163w0;
        int i40 = (i39 ^ 75) + ((i39 & 75) << 1);
        f54164x0 = i40 % 128;
        if (i40 % 2 != 0) {
            return bArr5;
        }
        int i41 = 80 / 0;
        return bArr5;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1397943596, 1397943599, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1157083780, 1157083781, System.identityHashCode(this));
    }

    public final byte[] setOnLongClickListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 793326055, -793326055, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1200872459, 1200872461, System.identityHashCode(this));
    }
}
