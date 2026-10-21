package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class anp implements akq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53337d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53338e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f53340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f53341c;

    public anp(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
        this.f53339a = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        if (bArr2 == null || bArr2.length == 0) {
            this.f53340b = null;
        } else {
            this.f53340b = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        }
        if (bArr3 == null) {
            this.f53341c = new byte[0];
        } else {
            this.f53341c = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        int i18 = ((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773);
        if (i18 == 1) {
            anp anpVar = (anp) objArr[0];
            int i19 = f53338e;
            int i20 = (i19 & 29) + (i19 | 29);
            f53337d = i20 % 128;
            int i21 = i20 % 2;
            byte[] bArr = anpVar.f53341c;
            Object[] objArr2 = new Object[1];
            if (i21 != 0) {
                objArr2[0] = bArr;
                throw null;
            }
            objArr2[0] = bArr;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            int i22 = f53338e + 117;
            f53337d = i22 % 128;
            if (i22 % 2 == 0) {
                return bArr2;
            }
            int i23 = 15 / 0;
            return bArr2;
        }
        if (i18 == 2) {
            anp anpVar2 = (anp) objArr[0];
            int i24 = f53337d;
            int i25 = (i24 ^ 57) + ((i24 & 57) << 1);
            f53338e = i25 % 128;
            int i26 = i25 % 2;
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{anpVar2.f53339a}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i27 = f53337d;
            int i28 = i27 & 79;
            int i29 = (i28 - (~(-(-((i27 ^ 79) | i28))))) - 1;
            f53338e = i29 % 128;
            if (i29 % 2 != 0) {
                return bArr3;
            }
            int i30 = 19 / 0;
            return bArr3;
        }
        if (i18 != 3) {
            anp anpVar3 = (anp) objArr[0];
            int i31 = f53338e;
            int i32 = i31 & 43;
            int i33 = (i31 ^ 43) | i32;
            int i34 = (i32 & i33) + (i33 | i32);
            f53337d = i34 % 128;
            int i35 = i34 % 2;
            anpVar3.getClass();
            if (i35 != 0) {
                throw null;
            }
            int i36 = f53337d;
            int i37 = (((i36 ^ 107) | (i36 & 107)) << 1) - (((~i36) & 107) | (i36 & (-108)));
            f53338e = i37 % 128;
            int i38 = i37 % 2;
            return Boolean.FALSE;
        }
        anp anpVar4 = (anp) objArr[0];
        int i39 = f53338e;
        int i40 = i39 & 77;
        int i41 = -(-((i39 ^ 77) | i40));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        f53337d = i42 % 128;
        int i43 = i42 % 2;
        byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{anpVar4.f53340b}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i44 = f53337d;
        int i45 = i44 & 81;
        int i46 = (i44 ^ 81) | i45;
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        f53338e = i47 % 128;
        if (i47 % 2 != 0) {
            return bArr4;
        }
        throw null;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, -1663545763, 1663545766, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 903565010, -903565008, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, 1260438023, -1260438022, System.identityHashCode(this));
    }

    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, 1375727516, -1375727516, System.identityHashCode(this))).booleanValue();
    }
}
