package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awv extends awp {
    public static int E0 = 0;
    public static int F0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54058s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54059t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54060u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54061w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f54062x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final byte[] f54063y0;

    public awv(awu awuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, awuVar);
        this.f54058s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54059t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54060u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54061w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54062x0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr6}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54063y0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr7}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        switch (((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13) {
            case 1:
                awv awvVar = (awv) objArr[0];
                awy awyVar = new awy(awvVar.setCompoundDrawableTintBlendMode(), awvVar.f54058s0, awvVar.f54063y0);
                int i17 = F0;
                int i18 = (i17 & 27) + (i17 | 27);
                E0 = i18 % 128;
                int i19 = i18 % 2;
                return awyVar;
            case 2:
                awv awvVar2 = (awv) objArr[0];
                int i20 = E0 + 19;
                F0 = i20 % 128;
                int i21 = i20 % 2;
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{awvVar2.f54058s0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i22 = E0;
                int i23 = i22 & 11;
                int i24 = (i22 | 11) & (~i23);
                int i25 = -(-(i23 << 1));
                int i26 = (i24 & i25) + (i24 | i25);
                F0 = i26 % 128;
                int i27 = i26 % 2;
                return bArr;
            case 3:
                awv awvVar3 = (awv) objArr[0];
                int i28 = E0 + 71;
                F0 = i28 % 128;
                int i29 = i28 % 2;
                byte[] bArr2 = awvVar3.f54060u0;
                if (i29 != 0) {
                    return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                int i30 = 76 / 0;
                return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            case 4:
                awv awvVar4 = (awv) objArr[0];
                int i31 = F0;
                int i32 = i31 & 1;
                int i33 = (i32 - (~((i31 ^ 1) | i32))) - 1;
                E0 = i33 % 128;
                int i34 = i33 % 2;
                byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awvVar4.f54062x0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i35 = F0;
                int i36 = i35 & 113;
                int i37 = i36 + ((i35 ^ 113) | i36);
                E0 = i37 % 128;
                int i38 = i37 % 2;
                return bArr3;
            case 5:
                awv awvVar5 = (awv) objArr[0];
                int i39 = F0;
                int i40 = i39 & 41;
                int i41 = (i39 | 41) & (~i40);
                int i42 = -(-(i40 << 1));
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                E0 = i43 % 128;
                int i44 = i43 % 2;
                byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awvVar5.f54059t0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i45 = E0;
                int i46 = i45 & 65;
                int i47 = (((i45 | 65) & (~i46)) - (~(-(-(i46 << 1))))) - 1;
                F0 = i47 % 128;
                int i48 = i47 % 2;
                return bArr4;
            case 6:
                awv awvVar6 = (awv) objArr[0];
                int i49 = (-2) - ((F0 + 108) ^ (-1));
                E0 = i49 % 128;
                int i50 = i49 % 2;
                byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awvVar6.v0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i51 = F0;
                int i52 = i51 & 65;
                int i53 = (((i51 ^ 65) | i52) << 1) - ((i51 | 65) & (~i52));
                E0 = i53 % 128;
                if (i53 % 2 == 0) {
                    return bArr5;
                }
                throw null;
            default:
                awv awvVar7 = (awv) objArr[0];
                int i54 = F0;
                int i55 = ((i54 ^ 107) | (i54 & 107)) << 1;
                int i56 = -(((~i54) & 107) | (i54 & (-108)));
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                E0 = i57 % 128;
                int i58 = i57 % 2;
                byte[] bArr6 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awvVar7.f54061w0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i59 = E0;
                int i60 = i59 & 91;
                int i61 = -(-(i59 | 91));
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                F0 = i62 % 128;
                if (i62 % 2 != 0) {
                    return bArr6;
                }
                throw null;
        }
    }

    public final byte[] getNavBarTitleString() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1515442923, 1515442929, System.identityHashCode(this));
    }

    public final awy setDividerPadding() {
        return (awy) setCompoundDrawableTintBlendMode(new Object[]{this}, 116775842, -116775841, System.identityHashCode(this));
    }

    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 454503529, -454503526, System.identityHashCode(this));
    }

    public final byte[] setOnDragListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 640609124, -640609124, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -67166402, 67166407, System.identityHashCode(this));
    }

    public final byte[] setOnLongClickListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1186763212, -1186763208, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -665882143, 665882145, System.identityHashCode(this));
    }
}
