package androidx.collection;

import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: compiled from: ArraySetJvmUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static void a(byte[] bArr, short[] sArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i10 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i11 = 0; i11 < 256; i11 += 2) {
                int i12 = (bArr2[i11] & 255) | ((bArr2[i11 + 1] & 255) << 8);
                if (i12 < 61445) {
                    int i13 = i10 + 1;
                    sArr[i10] = (short) i12;
                    if (i13 == 1024) {
                        return;
                    } else {
                        i10 = i13;
                    }
                }
            }
        }
    }

    public static boolean b(String str) {
        return str.equals("iss") || str.equals("sub") || str.equals("aud") || str.equals("exp") || str.equals("nbf") || str.equals("iat") || str.equals("jti");
    }

    public static void c(byte[] bArr) {
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        sHA3Digest.update(bArr, 0, 32);
        sHA3Digest.doFinal(bArr, 0);
    }

    public static void d(String str) {
        if (b(str)) {
            throw new IllegalArgumentException(String.format("claim '%s' is invalid because it's a registered name; use the corresponding setter method.", str));
        }
    }
}
