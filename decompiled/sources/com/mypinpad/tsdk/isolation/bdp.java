package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bdp extends amw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54579t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54580u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f54581r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54582s0;

    public bdp(int i10, byte[] bArr) {
        super(false);
        if (bArr.length != ((Integer) bdu.setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, 159704769, -159704769, i10)).intValue()) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f54581r0 = i10;
        this.f54582s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) != 1) {
            bdp bdpVar = (bdp) objArr[0];
            int i17 = f54579t0;
            int i18 = i17 & 113;
            int i19 = -(-((i17 ^ 113) | i18));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f54580u0 = i20 % 128;
            int i21 = i20 % 2;
            byte[] bArr = bdpVar.f54582s0;
            Object[] objArr2 = new Object[1];
            if (i21 != 0) {
                objArr2[0] = bArr;
                return (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            objArr2[0] = bArr;
            throw null;
        }
        bdp bdpVar2 = (bdp) objArr[0];
        int i22 = f54580u0 + 39;
        int i23 = i22 % 128;
        f54579t0 = i23;
        int i24 = i22 % 2;
        int i25 = bdpVar2.f54581r0;
        if (i24 != 0) {
            int i26 = 22 / 0;
        }
        int i27 = i23 & 43;
        int i28 = (~i27) & (i23 | 43);
        int i29 = -(-(i27 << 1));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        f54580u0 = i30 % 128;
        int i31 = i30 % 2;
        return Integer.valueOf(i25);
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 162192044, -162192044, System.identityHashCode(this));
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 107451473, -107451472, System.identityHashCode(this))).intValue();
    }
}
