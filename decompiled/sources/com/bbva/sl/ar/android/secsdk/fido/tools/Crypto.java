package com.bbva.sl.ar.android.secsdk.fido.tools;

import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes8.dex */
public class Crypto {
    private static String bytesToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    @Nullable
    public static String stringToHexSha256(String str) {
        try {
            return bytesToHex(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception unused) {
            return null;
        }
    }
}
