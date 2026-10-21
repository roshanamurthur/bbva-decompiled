package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class readObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58089a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58090b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        char cCharValue;
        char c10;
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~(i11 | i14))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i13 | (~(i14 | i15))) * 1324) + (i11 * (-661)) + (i10 * (-661));
        if (i16 == 1) {
            char[] cArr = (char[]) objArr[0];
            byte bByteValue = ((Byte) objArr[1]).byteValue();
            int i17 = f58090b;
            int i18 = i17 & 21;
            int i19 = i18 + ((i17 ^ 21) | i18);
            f58089a = i19 % 128;
            if (i19 % 2 != 0) {
                cCharValue = ((Character) setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(bByteValue)}, -1858292562, 1858292562, (int) System.currentTimeMillis())).charValue();
                int i20 = 0 / 0;
            } else {
                cCharValue = ((Character) setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(bByteValue)}, -1858292562, 1858292562, (int) System.currentTimeMillis())).charValue();
            }
            int i21 = f58090b;
            int i22 = (i21 & 71) + (i21 | 71);
            f58089a = i22 % 128;
            if (i22 % 2 == 0) {
                return Character.valueOf(cCharValue);
            }
            throw null;
        }
        if (i16 == 2) {
            char[] cArr2 = (char[]) objArr[0];
            byte bByteValue2 = ((Byte) objArr[1]).byteValue();
            char cCharValue2 = ((Character) objArr[2]).charValue();
            int i23 = f58090b;
            int i24 = i23 ^ 73;
            int i25 = -(-((i23 & 73) << 1));
            int i26 = (i24 & i25) + (i25 | i24);
            f58089a = i26 % 128;
            Object[] objArr2 = new Object[3];
            if (i26 % 2 == 0) {
                objArr2[0] = cArr2;
                objArr2[1] = Byte.valueOf(bByteValue2);
                objArr2[2] = Character.valueOf(cCharValue2);
                setCompoundDrawableTintBlendMode(objArr2, 1272777109, -1272777106, (int) System.currentTimeMillis());
                return null;
            }
            objArr2[0] = cArr2;
            objArr2[1] = Byte.valueOf(bByteValue2);
            objArr2[2] = Character.valueOf(cCharValue2);
            setCompoundDrawableTintBlendMode(objArr2, 1272777109, -1272777106, (int) System.currentTimeMillis());
            int i27 = 87 / 0;
            return null;
        }
        if (i16 == 3) {
            char[] cArr3 = (char[]) objArr[0];
            byte bByteValue3 = ((Byte) objArr[1]).byteValue();
            char cCharValue3 = ((Character) objArr[2]).charValue();
            int i28 = f58089a;
            int i29 = (i28 & 27) + (i28 | 27);
            f58090b = i29 % 128;
            if (i29 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cArr3, "");
                cArr3[bByteValue3] = cCharValue3;
                return null;
            }
            Intrinsics.checkNotNullParameter(cArr3, "");
            cArr3[bByteValue3] = cCharValue3;
            throw null;
        }
        char[] cArr4 = (char[]) objArr[0];
        byte bByteValue4 = ((Byte) objArr[1]).byteValue();
        int i30 = f58089a;
        int i31 = (i30 & (-104)) | ((~i30) & 103);
        int i32 = (i30 & 103) << 1;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        f58090b = i33 % 128;
        if (i33 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cArr4, "");
            c10 = cArr4[bByteValue4];
            int i34 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(cArr4, "");
            c10 = cArr4[bByteValue4];
        }
        return Character.valueOf(c10);
    }
}
