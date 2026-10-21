package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56327a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56328b = 1;

    public static /* synthetic */ void a(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        int i17 = ~i16;
        int i18 = ~i12;
        int i19 = (((~(i10 | i15 | i12)) | (~(i11 | i14)) | (~(i14 | i18))) * 168) + ((~(i16 | i12)) * 168) + ((i17 | (~(i15 | i18))) * 168) + (i11 * (-167)) + (i10 * (-167));
        if (i19 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            aky akyVar = (aky) objArr[1];
            int i20 = f56328b;
            int i21 = (i20 ^ 55) + ((i20 & 55) << 1);
            f56327a = i21 % 128;
            if (i21 % 2 != 0) {
                akyVar.setX((byte) (iIntValue / 89));
                akyVar.setX((byte) ((iIntValue & (-122)) + (iIntValue | (-122))));
                i13 = iIntValue >> 30;
            } else {
                akyVar.setX((byte) (iIntValue >>> 24));
                akyVar.setX((byte) (iIntValue >>> 16));
                i13 = iIntValue >>> 8;
            }
            akyVar.setX((byte) i13);
            akyVar.setX((byte) iIntValue);
            int i22 = f56327a;
            int i23 = (i22 ^ 46) + ((i22 & 46) << 1);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            f56328b = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 20 / 0;
                return;
            }
            return;
        }
        if (i19 != 2) {
            short sShortValue = ((Short) objArr[0]).shortValue();
            aky akyVar2 = (aky) objArr[1];
            int i26 = f56328b;
            int i27 = ((i26 & 120) + (i26 | 120)) - 1;
            f56327a = i27 % 128;
            int i28 = i27 % 2;
            akyVar2.setX((byte) (sShortValue >>> 8));
            akyVar2.setX((byte) sShortValue);
            int i29 = f56328b;
            int i30 = ((((i29 ^ 39) | (i29 & 39)) << 1) - (~(-(((~i29) & 39) | (i29 & (-40)))))) - 1;
            f56327a = i30 % 128;
            int i31 = i30 % 2;
            return;
        }
        byte[] bArr = (byte[]) objArr[0];
        aky akyVar3 = (aky) objArr[1];
        int i32 = f56327a;
        int i33 = i32 & 117;
        int i34 = (i33 - (~((i32 ^ 117) | i33))) - 1;
        f56328b = i34 % 128;
        int i35 = i34 % 2;
        akyVar3.setCompoundDrawableTintBlendMode(bArr, 0, bArr.length);
        int i36 = f56328b;
        int i37 = i36 & 97;
        int i38 = (i36 | 97) & (~i37);
        int i39 = -(-(i37 << 1));
        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
        f56327a = i40 % 128;
        if (i40 % 2 != 0) {
            throw null;
        }
    }
}
