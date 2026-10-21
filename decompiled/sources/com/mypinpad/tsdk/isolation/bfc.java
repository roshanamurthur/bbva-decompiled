package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54682a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54683b = 1;

    static {
        int i10 = 123 << 1;
        int i11 = -((~0) & 123);
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        f54683b = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i12)) | (~((~i10) | i15)) | (~(i11 | i12))) * 831) + ((~(i14 | i10 | i12)) * (-1662)) + (((~(i14 | i15)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830));
        if (i16 == 1) {
            InputStream inputStream = (InputStream) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i17 = f54683b;
            int i18 = i17 ^ 87;
            int i19 = ((i17 & 87) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            int i22 = i21 % 128;
            f54682a = i22;
            int i23 = (i21 % 2 == 0 ? 1 : 0) ^ 1;
            int i24 = ((i22 | 113) << 1) - (((~i22) & 113) | (i22 & (-114)));
            while (true) {
                f54683b = i24 % 128;
                int i25 = i24 % 2;
                if (i23 >= iIntValue) {
                    break;
                }
                int i26 = f54683b;
                int i27 = i26 & 39;
                int i28 = (i27 - (~((i26 ^ 39) | i27))) - 1;
                f54682a = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = -(~(-i23));
                    i13 = inputStream.read(bArr, i23, ((iIntValue & i29) + (i29 | iIntValue)) - 1);
                    if (i13 < 0) {
                        break;
                    }
                    i23 = (((i23 ^ i13) | (i23 & i13)) << 1) - (((~i23) & i13) | ((~i13) & i23));
                    int i30 = f54682a;
                    i24 = (i30 ^ 65) + ((i30 & 65) << 1);
                } else {
                    i13 = inputStream.read(bArr, i23, iIntValue / i23);
                    if (i13 < 0) {
                        break;
                    }
                    i23 = (((i23 ^ i13) | (i23 & i13)) << 1) - (((~i23) & i13) | ((~i13) & i23));
                    int i31 = f54682a;
                    i24 = (i31 ^ 65) + ((i31 & 65) << 1);
                }
            }
            int i32 = f54682a + 43;
            f54683b = i32 % 128;
            int i33 = i32 % 2;
            return Integer.valueOf(i23);
        }
        if (i16 == 2) {
            InputStream inputStream2 = (InputStream) objArr[0];
            OutputStream outputStream = (OutputStream) objArr[1];
            int i34 = f54682a;
            int i35 = i34 & 103;
            int i36 = (i35 - (~(-(-((i34 ^ 103) | i35))))) - 1;
            f54683b = i36 % 128;
            Object[] objArr2 = new Object[3];
            if (i36 % 2 == 0) {
                objArr2[0] = inputStream2;
                objArr2[1] = outputStream;
                objArr2[2] = 4096;
                setOnFocusChangeListener(objArr2, 619459144, -619459144, 4096);
                int i37 = 67 / 0;
            } else {
                objArr2[0] = inputStream2;
                objArr2[1] = outputStream;
                objArr2[2] = 4096;
                setOnFocusChangeListener(objArr2, 619459144, -619459144, 4096);
            }
            int i38 = f54683b + 13;
            f54682a = i38 % 128;
            if (i38 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i16 == 3) {
            InputStream inputStream3 = (InputStream) objArr[0];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            setOnFocusChangeListener(new Object[]{inputStream3, byteArrayOutputStream}, -1515054259, 1515054261, (int) System.currentTimeMillis());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i39 = f54683b;
            int i40 = (i39 ^ 55) + ((i39 & 55) << 1);
            f54682a = i40 % 128;
            int i41 = i40 % 2;
            return byteArray;
        }
        InputStream inputStream4 = (InputStream) objArr[0];
        OutputStream outputStream2 = (OutputStream) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i42 = f54682a;
        int i43 = i42 & 71;
        int i44 = i43 + ((i42 ^ 71) | i43);
        int i45 = i44 % 128;
        f54683b = i45;
        int i46 = i44 % 2;
        byte[] bArr2 = new byte[iIntValue2];
        int i47 = i45 & 83;
        int i48 = (i45 ^ 83) | i47;
        int i49 = (i47 & i48) + (i48 | i47);
        f54682a = i49 % 128;
        while (true) {
            int i50 = i49 % 2;
            int i51 = inputStream4.read(bArr2, 0, iIntValue2);
            if (i51 < 0) {
                break;
            }
            int i52 = f54682a;
            int i53 = i52 & 77;
            int i54 = (i52 | 77) & (~i53);
            int i55 = i53 << 1;
            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
            f54683b = i56 % 128;
            int i57 = i56 % 2;
            outputStream2.write(bArr2, 0, i51);
            int i58 = f54682a;
            int i59 = i58 & 73;
            int i60 = (i58 ^ 73) | i59;
            i49 = (i59 & i60) + (i60 | i59);
            f54683b = i49 % 128;
        }
        int i61 = f54682a;
        int i62 = ((i61 ^ 41) - (~(-(-((i61 & 41) << 1))))) - 1;
        f54683b = i62 % 128;
        if (i62 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static byte[] setX(InputStream inputStream) throws IOException {
        return (byte[]) setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis());
    }

    public static int setOnFocusChangeListener(InputStream inputStream, byte[] bArr, int i10) throws IOException {
        return ((Integer) setOnFocusChangeListener(new Object[]{inputStream, bArr, Integer.valueOf(i10)}, -396467491, 396467492, i10)).intValue();
    }
}
