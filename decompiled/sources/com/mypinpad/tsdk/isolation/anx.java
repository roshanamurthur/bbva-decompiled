package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class anx extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53360s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53361t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f53362r0;

    public anx(byte[] bArr, byte b10) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f53362r0 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        int i22 = ((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19;
        if (i22 == 1) {
            byte[] bArr = (byte[]) objArr[0];
            int i23 = f53361t0;
            int i24 = i23 & 31;
            int i25 = (i23 | 31) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            int i28 = i27 % 128;
            f53360s0 = i28;
            if (i27 % 2 == 0 ? bArr.length != 32 : bArr.length != 27) {
                throw new IllegalArgumentException("'buf' must have length 32");
            }
            int i29 = ((i28 & 15) - (~(-(-(i28 | 15))))) - 1;
            f53361t0 = i29 % 128;
            int i30 = i29 % 2;
            return bArr;
        }
        if (i22 != 2) {
            anx anxVar = (anx) objArr[0];
            int i31 = f53361t0;
            int i32 = (i31 & 73) + (i31 | 73);
            f53360s0 = i32 % 128;
            int i33 = i32 % 2;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{anxVar.f53362r0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i34 = f53360s0;
            int i35 = (((i34 & (-44)) | ((~i34) & 43)) - (~((i34 & 43) << 1))) - 1;
            f53361t0 = i35 % 128;
            int i36 = i35 % 2;
            return bArr2;
        }
        anx anxVar2 = (anx) objArr[0];
        byte[] bArr3 = (byte[]) objArr[1];
        int i37 = f53360s0;
        int i38 = i37 & 61;
        int i39 = -(-(i37 | 61));
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        f53361t0 = i40 % 128;
        if (i40 % 2 == 0) {
            System.arraycopy(anxVar2.f53362r0, 0, bArr3, 1, 21);
        } else {
            System.arraycopy(anxVar2.f53362r0, 0, bArr3, 0, 32);
        }
        int i41 = f53361t0;
        int i42 = i41 & 15;
        int i43 = (i42 - (~((i41 ^ 15) | i42))) - 1;
        f53360s0 = i43 % 128;
        if (i43 % 2 != 0) {
            int i44 = 2 / 0;
        }
        return null;
    }

    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, 325583696, -325583696, System.identityHashCode(this));
    }

    public anx(byte[] bArr) {
        this((byte[]) setDividerPadding(new Object[]{bArr}, 1306504408, -1306504407, (int) System.currentTimeMillis()), (byte) 0);
    }

    public final void setDividerPadding(byte[] bArr) {
        setDividerPadding(new Object[]{this, bArr}, 489342121, -489342119, System.identityHashCode(this));
    }
}
