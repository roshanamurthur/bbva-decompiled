package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setShowSoftInputOnFocus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60573a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60574b = 1;

    public static final byte setCompoundDrawableTintBlendMode(int i10) {
        return ((Byte) setY(new Object[]{Integer.valueOf(i10)}, 2139358410, -2139358410, i10)).byteValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i13 = f60573a;
        int i14 = (((i13 & (-50)) | ((~i13) & 49)) - (~(-(-((i13 & 49) << 1))))) - 1;
        f60574b = i14 % 128;
        int i15 = i14 % 2;
        byte bByteValue = ((Byte) setLogo.setY(new Object[]{Byte.valueOf((byte) iIntValue)}, 251599675, -251599664, (int) System.currentTimeMillis())).byteValue();
        int i16 = f60574b;
        int i17 = i16 ^ 45;
        int i18 = ((i16 & 45) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 & i19) + (i18 | i19);
        f60573a = i20 % 128;
        int i21 = i20 % 2;
        return Byte.valueOf(bByteValue);
    }
}
