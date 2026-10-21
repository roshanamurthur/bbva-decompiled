package com.google.crypto.tink.internal;

import android.os.Build;
import com.google.crypto.tink.util.Bytes;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class Util {
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    @Nullable
    public static Integer getAndroidApiLevel() {
        if (isAndroid()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean isAndroid() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int randKeyId() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    public static final Bytes toBytesFromPrintableAscii(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new TinkBugException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i10] = (byte) cCharAt;
        }
        return Bytes.copyFrom(bArr);
    }
}
