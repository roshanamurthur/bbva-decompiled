package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class amt implements akk {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53262t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f53263u0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f53265q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ann f53266r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f53267s0 = 128;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f53264p0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{null}, -150521869, 150521882, (int) System.currentTimeMillis());

    public amt(ann annVar, byte[] bArr) {
        this.f53266r0 = annVar;
        this.f53265q0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-712)) + (i10 * 714);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = (~(i14 | i11)) | (~(i14 | i15));
        int i17 = ~i11;
        int i18 = ~(i10 | i17 | i12);
        int i19 = ((~(i17 | i15)) * 713) + (i18 * 1426) + ((i16 | i18) * (-713)) + i13;
        if (i19 == 1) {
            amt amtVar = (amt) objArr[0];
            int i20 = f53263u0;
            int i21 = (i20 & (-106)) | ((~i20) & 105);
            int i22 = -(-((i20 & 105) << 1));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            int i24 = i23 % 128;
            f53262t0 = i24;
            int i25 = i23 % 2;
            ann annVar = amtVar.f53266r0;
            int i26 = i24 + 81;
            f53263u0 = i26 % 128;
            int i27 = i26 % 2;
            return annVar;
        }
        if (i19 == 2) {
            amt amtVar2 = (amt) objArr[0];
            int i28 = f53262t0;
            int i29 = i28 + 73;
            f53263u0 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = amtVar2.f53267s0;
            int i32 = (((i28 ^ 43) | (i28 & 43)) << 1) - (((~i28) & 43) | (i28 & (-44)));
            f53263u0 = i32 % 128;
            if (i32 % 2 != 0) {
                return Integer.valueOf(i31);
            }
            throw null;
        }
        if (i19 != 3) {
            amt amtVar3 = (amt) objArr[0];
            int i33 = f53262t0;
            int i34 = i33 ^ 5;
            int i35 = (i33 & 5) << 1;
            int i36 = (i34 & i35) + (i35 | i34);
            f53263u0 = i36 % 128;
            int i37 = i36 % 2;
            byte[] bArr = amtVar3.f53265q0;
            Object[] objArr2 = new Object[1];
            if (i37 != 0) {
                objArr2[0] = bArr;
                return (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            objArr2[0] = bArr;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            int i38 = 51 / 0;
            return bArr2;
        }
        amt amtVar4 = (amt) objArr[0];
        int i39 = f53262t0;
        int i40 = (i39 | 111) << 1;
        int i41 = -(i39 ^ 111);
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        f53263u0 = i42 % 128;
        int i43 = i42 % 2;
        byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{amtVar4.f53264p0}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i44 = f53263u0;
        int i45 = i44 & 67;
        int i46 = i44 | 67;
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        f53262t0 = i47 % 128;
        if (i47 % 2 == 0) {
            return bArr3;
        }
        int i48 = 35 / 0;
        return bArr3;
    }

    public final ann setCompoundDrawableTintBlendMode() {
        return (ann) setDividerPadding(new Object[]{this}, -137294833, 137294834, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1668788111, 1668788113, System.identityHashCode(this))).intValue();
    }

    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1384627484, -1384627484, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 484662606, -484662603, System.identityHashCode(this));
    }
}
