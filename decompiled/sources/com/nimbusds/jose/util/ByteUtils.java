package com.nimbusds.jose.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ByteUtils {
    public static int bitLength(int i10) {
        return i10 * 8;
    }

    public static int byteLength(int i10) {
        return i10 / 8;
    }

    public static byte[] concat(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            throw new IllegalStateException(e5.getMessage(), e5);
        }
    }

    public static int safeBitLength(int i10) throws IntegerOverflowException {
        long j10 = ((long) i10) * 8;
        int i11 = (int) j10;
        if (i11 == j10) {
            return i11;
        }
        throw new IntegerOverflowException();
    }

    public static byte[] subArray(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public static int bitLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bitLength(bArr.length);
    }

    public static int safeBitLength(byte[] bArr) throws IntegerOverflowException {
        if (bArr == null) {
            return 0;
        }
        return safeBitLength(bArr.length);
    }
}
