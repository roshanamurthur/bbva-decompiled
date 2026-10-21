package b4;

import java.io.UnsupportedEncodingException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static int a(String str) {
        if (str == null || str.trim().equalsIgnoreCase("")) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            try {
                char cCharAt = str.charAt(i11);
                if (cCharAt < 128) {
                    i10 += cCharAt;
                }
            } catch (Exception unused) {
                return -2;
            }
        }
        return i10;
    }

    public static String b(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            StringBuffer stringBuffer = new StringBuffer(bytes.length);
            for (byte b10 : bytes) {
                if (b10 < 33 || b10 > 126 || b10 == 34 || b10 == 37 || b10 == 39 || b10 == 44 || b10 == 92) {
                    stringBuffer.append('%');
                    char cForDigit = Character.forDigit((b10 >> 4) & 15, 16);
                    if (Character.isLetter(cForDigit)) {
                        cForDigit = (char) (cForDigit - ' ');
                    }
                    stringBuffer.append(cForDigit);
                    char cForDigit2 = Character.forDigit(b10 & 15, 16);
                    if (Character.isLetter(cForDigit2)) {
                        cForDigit2 = (char) (cForDigit2 - ' ');
                    }
                    stringBuffer.append(cForDigit2);
                } else {
                    stringBuffer.append((char) b10);
                }
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException unused) {
            return "utf8-encode-err";
        }
    }

    public static byte[] c(Digest digest) {
        int digestSize = digest instanceof Xof ? digest.getDigestSize() * 2 : digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        if (digest instanceof Xof) {
            ((Xof) digest).doFinal(bArr, 0, digestSize);
        } else {
            digest.doFinal(bArr, 0);
        }
        return bArr;
    }
}
