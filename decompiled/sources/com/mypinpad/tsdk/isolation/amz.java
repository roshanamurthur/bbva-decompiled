package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class amz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53278c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53279d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53281b;

    public amz(byte[] bArr, int i10) {
        this.f53280a = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f53281b = i10;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i15 = ~i12;
        if (((i10 | (~((~i11) | i15))) * 160) + (((~(i15 | i10)) | (~(i10 | i11))) * (-160)) + i14 == 1) {
            amz amzVar = (amz) objArr[0];
            int i16 = f53279d;
            int i17 = ((((i16 ^ 59) | (i16 & 59)) << 1) - (~(-(((~i16) & 59) | (i16 & (-60)))))) - 1;
            f53278c = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = amzVar.f53281b;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{amzVar.f53280a}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i19 = (~iIntValue) & i18;
                int i20 = iIntValue & (~i18);
                i13 = (i20 & i19) | (i19 ^ i20);
                int i21 = 55 / 0;
            } else {
                int i22 = amzVar.f53281b;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{amzVar.f53280a}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i23 = i22 & iIntValue2;
                i13 = ((iIntValue2 ^ i22) | i23) & (~i23);
            }
            int i24 = f53279d;
            int i25 = i24 & 81;
            int i26 = ((i24 ^ 81) | i25) << 1;
            int i27 = -((i24 | 81) & (~i25));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f53278c = i28 % 128;
            if (i28 % 2 == 0) {
                return Integer.valueOf(i13);
            }
            throw null;
        }
        amz amzVar2 = (amz) objArr[0];
        Object obj = objArr[1];
        int i29 = f53279d;
        int i30 = i29 & 69;
        int i31 = ((((i29 ^ 69) | i30) << 1) - (~(-((~i30) & (i29 | 69))))) - 1;
        int i32 = i31 % 128;
        f53278c = i32;
        if (i31 % 2 != 0) {
            boolean z10 = obj instanceof amz;
            throw null;
        }
        if (obj instanceof amz) {
            amz amzVar3 = (amz) obj;
            if (amzVar3.f53281b == amzVar2.f53281b) {
                boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{amzVar2.f53280a, amzVar3.f53280a}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                int i33 = f53278c;
                int i34 = ((i33 ^ 117) | (i33 & 117)) << 1;
                int i35 = -(((~i33) & 117) | (i33 & (-118)));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f53279d = i36 % 128;
                int i37 = i36 % 2;
                return Boolean.valueOf(zBooleanValue);
            }
            int i38 = (((i32 ^ 69) | (i32 & 69)) << 1) - ((i32 & (-70)) | ((~i32) & 69));
            int i39 = i38 % 128;
            f53279d = i39;
            int i40 = i38 % 2;
            int i41 = ((((i39 ^ 63) | (i39 & 63)) << 1) - (~(-(((~i39) & 63) | (i39 & (-64)))))) - 1;
            f53278c = i41 % 128;
            if (i41 % 2 != 0) {
                throw null;
            }
        } else {
            int i42 = i29 & 37;
            int i43 = (~i42) & (i29 | 37);
            int i44 = i42 << 1;
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            f53278c = i45 % 128;
            int i46 = i45 % 2;
        }
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -1211136342, 1211136342, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1948404671, 1948404672, System.identityHashCode(this))).intValue();
    }
}
