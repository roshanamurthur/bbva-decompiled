package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awz extends awx {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f54071y0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54072t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54073u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54074w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f54075x0;

    public awz(aww awwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, awwVar);
        this.f54072t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54073u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54074w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54075x0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13;
        if (i16 == 1) {
            awz awzVar = (awz) objArr[0];
            int i17 = f54071y0;
            int i18 = i17 & 93;
            int i19 = (i17 ^ 93) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            E0 = i20 % 128;
            int i21 = i20 % 2;
            byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{awzVar.v0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i22 = E0;
            int i23 = (i22 ^ 89) + ((i22 & 89) << 1);
            f54071y0 = i23 % 128;
            if (i23 % 2 == 0) {
                return bArr;
            }
            throw null;
        }
        if (i16 == 2) {
            awz awzVar2 = (awz) objArr[0];
            int i24 = E0;
            int i25 = i24 & 81;
            int i26 = (i24 | 81) & (~i25);
            int i27 = i25 << 1;
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            f54071y0 = i28 % 128;
            int i29 = i28 % 2;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awzVar2.f54075x0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i30 = E0;
            int i31 = ((i30 | 11) << 1) - (i30 ^ 11);
            f54071y0 = i31 % 128;
            int i32 = i31 % 2;
            return bArr2;
        }
        if (i16 == 3) {
            awz awzVar3 = (awz) objArr[0];
            int i33 = f54071y0;
            int i34 = i33 ^ 87;
            int i35 = (i33 & 87) << 1;
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            E0 = i36 % 128;
            int i37 = i36 % 2;
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awzVar3.f54074w0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i38 = f54071y0;
            int i39 = ((i38 | 48) << 1) - (i38 ^ 48);
            int i40 = (i39 ^ (-1)) + (i39 << 1);
            E0 = i40 % 128;
            int i41 = i40 % 2;
            return bArr3;
        }
        if (i16 != 4) {
            awz awzVar4 = (awz) objArr[0];
            System.identityHashCode(awzVar4);
            System.identityHashCode(awzVar4);
            byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awzVar4.f54073u0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i42 = f54071y0 + 33;
            E0 = i42 % 128;
            if (i42 % 2 != 0) {
                return bArr4;
            }
            throw null;
        }
        awz awzVar5 = (awz) objArr[0];
        int i43 = E0;
        int i44 = ((i43 & 76) + (i43 | 76)) - 1;
        f54071y0 = i44 % 128;
        int i45 = i44 % 2;
        byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awzVar5.f54072t0}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i46 = f54071y0 + 65;
        E0 = i46 % 128;
        int i47 = i46 % 2;
        return bArr5;
    }

    public final byte[] getNavBarTitleString() {
        return (byte[]) setY(new Object[]{this}, -315531809, 315531813, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, 50593789, -50593787, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, -347145353, 347145354, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setY(new Object[]{this}, 824747052, -824747052, System.identityHashCode(this));
    }

    public final byte[] setOnLongClickListener() {
        return (byte[]) setY(new Object[]{this}, 1785717654, -1785717651, System.identityHashCode(this));
    }
}
