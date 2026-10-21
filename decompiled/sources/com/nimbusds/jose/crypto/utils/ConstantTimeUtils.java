package com.nimbusds.jose.crypto.utils;

/* JADX INFO: loaded from: classes10.dex */
public class ConstantTimeUtils {
    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }
}
