package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.ranges.c;

/* JADX INFO: loaded from: classes10.dex */
public final class getPinPadType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55950a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55951b = 1;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i15 = ~i11;
        if (((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14 != 1) {
            byte[] bArr = (byte[]) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i16 = f55950a;
            int i17 = i16 & 103;
            int i18 = i17 + ((i16 ^ 103) | i17);
            f55951b = i18 % 128;
            int i19 = i18 % 2;
            byte[] bArr2 = (byte[]) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue)}, 1488134425, -1488134424, iIntValue);
            int i20 = f55951b;
            int i21 = ((i20 & (-20)) | ((~i20) & 19)) + ((i20 & 19) << 1);
            f55950a = i21 % 128;
            if (i21 % 2 == 0) {
                return bArr2;
            }
            int i22 = 46 / 0;
            return bArr2;
        }
        byte[] bArr3 = (byte[]) objArr[0];
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i23 = f55950a;
        int i24 = i23 + 23;
        f55951b = i24 % 128;
        if (i24 % 2 == 0) {
            int length = bArr3.length;
            throw null;
        }
        if (bArr3.length <= iIntValue2) {
            int i25 = i23 + 87;
            f55951b = i25 % 128;
            int i26 = i25 % 2;
            return bArr3;
        }
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr3, c.until(0, iIntValue2));
        int i27 = f55951b;
        int i28 = (i27 & (-64)) | ((~i27) & 63);
        int i29 = -(-((i27 & 63) << 1));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f55950a = i30 % 128;
        if (i30 % 2 == 0) {
            return bArrSliceArray;
        }
        int i31 = 51 / 0;
        return bArrSliceArray;
    }

    public static final /* synthetic */ byte[] setOnFocusChangeListener(byte[] bArr, int i10) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10)}, -68354525, 68354525, i10);
    }
}
