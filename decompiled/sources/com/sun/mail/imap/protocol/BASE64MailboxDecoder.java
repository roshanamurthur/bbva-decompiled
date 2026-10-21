package com.sun.mail.imap.protocol;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class BASE64MailboxDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f65409a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', AbstractJsonLexerKt.COMMA};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f65410b = new byte[256];

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 255; i11++) {
            f65410b[i11] = -1;
        }
        while (true) {
            char[] cArr = f65409a;
            if (i10 >= cArr.length) {
                return;
            }
            f65410b[cArr[i10]] = (byte) i10;
            i10++;
        }
    }

    public static int base64decode(char[] cArr, int i10, CharacterIterator characterIterator) {
        boolean z10 = true;
        int i11 = -1;
        while (true) {
            byte next = (byte) characterIterator.next();
            if (next == -1) {
                return i10;
            }
            if (next == 45) {
                if (!z10) {
                    return i10;
                }
                int i12 = i10 + 1;
                cArr[i10] = Typography.amp;
                return i12;
            }
            byte next2 = (byte) characterIterator.next();
            if (next2 == -1 || next2 == 45) {
                return i10;
            }
            byte[] bArr = f65410b;
            byte b10 = bArr[next & 255];
            byte b11 = bArr[next2 & 255];
            byte b12 = (byte) (((b10 << 2) & 252) | ((b11 >>> 4) & 3));
            if (i11 != -1) {
                cArr[i10] = (char) ((i11 << 8) | (b12 & 255));
                i11 = -1;
                i10++;
            } else {
                i11 = b12 & 255;
            }
            byte next3 = (byte) characterIterator.next();
            if (next3 != 61) {
                if (next3 == -1 || next3 == 45) {
                    return i10;
                }
                byte b13 = bArr[next3 & 255];
                byte b14 = (byte) (((b11 << 4) & 240) | ((b13 >>> 2) & 15));
                if (i11 != -1) {
                    cArr[i10] = (char) ((b14 & 255) | (i11 << 8));
                    i11 = -1;
                    i10++;
                } else {
                    i11 = b14 & 255;
                }
                byte next4 = (byte) characterIterator.next();
                if (next4 == 61) {
                    continue;
                } else {
                    if (next4 == -1 || next4 == 45) {
                        return i10;
                    }
                    byte b15 = (byte) ((bArr[next4 & 255] & 63) | ((b13 << 6) & 192));
                    if (i11 != -1) {
                        cArr[i10] = (char) ((b15 & 255) | (i11 << 8));
                        i11 = -1;
                        i10++;
                    } else {
                        i11 = b15 & 255;
                    }
                }
            }
            z10 = false;
        }
    }

    public static String decode(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] cArr = new char[str.length()];
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        boolean z10 = false;
        int iBase64decode = 0;
        for (char cFirst = stringCharacterIterator.first(); cFirst != 65535; cFirst = stringCharacterIterator.next()) {
            if (cFirst == '&') {
                z10 = true;
                iBase64decode = base64decode(cArr, iBase64decode, stringCharacterIterator);
            } else {
                cArr[iBase64decode] = cFirst;
                iBase64decode++;
            }
        }
        return z10 ? new String(cArr, 0, iBase64decode) : str;
    }
}
