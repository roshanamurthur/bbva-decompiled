package com.sun.mail.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ASCIIUtility {
    public static byte[] getBytes(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) charArray[i10];
        }
        return bArr;
    }

    public static int parseInt(byte[] bArr, int i10, int i11, int i12) throws NumberFormatException {
        int i13;
        int i14;
        boolean z10;
        if (bArr == null) {
            throw new NumberFormatException(AbstractJsonLexerKt.NULL);
        }
        if (i11 <= i10) {
            throw new NumberFormatException("illegal number");
        }
        int i15 = 0;
        if (bArr[i10] == 45) {
            i14 = i10 + 1;
            i13 = Integer.MIN_VALUE;
            z10 = true;
        } else {
            i13 = -2147483647;
            i14 = i10;
            z10 = false;
        }
        int i16 = i13 / i12;
        if (i14 < i11) {
            int i17 = i14 + 1;
            int iDigit = Character.digit((char) bArr[i14], i12);
            if (iDigit < 0) {
                throw new NumberFormatException("illegal number: " + toString(bArr, i10, i11));
            }
            i15 = -iDigit;
            i14 = i17;
        }
        while (i14 < i11) {
            int i18 = i14 + 1;
            int iDigit2 = Character.digit((char) bArr[i14], i12);
            if (iDigit2 < 0) {
                throw new NumberFormatException("illegal number");
            }
            if (i15 < i16) {
                throw new NumberFormatException("illegal number");
            }
            int i19 = i15 * i12;
            if (i19 < i13 + iDigit2) {
                throw new NumberFormatException("illegal number");
            }
            i15 = i19 - iDigit2;
            i14 = i18;
        }
        if (!z10) {
            return -i15;
        }
        if (i14 > i10 + 1) {
            return i15;
        }
        throw new NumberFormatException("illegal number");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0068 -> B:15:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static long parseLong(byte[] r18, int r19, int r20, int r21) throws java.lang.NumberFormatException {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            if (r18 == 0) goto L94
            java.lang.String r3 = "illegal number"
            if (r1 <= r0) goto L8e
            r4 = r18[r0]
            r5 = 45
            r6 = 1
            if (r4 != r5) goto L19
            int r4 = r0 + 1
            r7 = -9223372036854775808
            r5 = r6
            goto L21
        L19:
            r4 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r4
            r4 = r0
        L21:
            long r9 = (long) r2
            long r11 = r7 / r9
            if (r4 >= r1) goto L4d
            int r13 = r4 + 1
            r4 = r18[r4]
            char r4 = (char) r4
            int r4 = java.lang.Character.digit(r4, r2)
            if (r4 < 0) goto L35
            int r4 = -r4
            long r14 = (long) r4
        L33:
            r4 = r13
            goto L4f
        L35:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "illegal number: "
            r3.<init>(r4)
            java.lang.String r0 = toString(r18, r19, r20)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L4d:
            r14 = 0
        L4f:
            if (r4 >= r1) goto L80
            int r13 = r4 + 1
            r4 = r18[r4]
            char r4 = (char) r4
            int r4 = java.lang.Character.digit(r4, r2)
            if (r4 < 0) goto L7a
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L74
            long r14 = r14 * r9
            long r1 = (long) r4
            long r16 = r7 + r1
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 < 0) goto L6e
            long r14 = r14 - r1
            r1 = r20
            r2 = r21
            goto L33
        L6e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L7a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L80:
            if (r5 == 0) goto L8c
            int r0 = r0 + r6
            if (r4 <= r0) goto L86
            return r14
        L86:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L8c:
            long r0 = -r14
            return r0
        L8e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L94:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.ASCIIUtility.parseLong(byte[], int, int, int):long");
    }

    public static String toString(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        char[] cArr = new char[i12];
        int i13 = 0;
        while (i13 < i12) {
            cArr[i13] = (char) (bArr[i10] & 255);
            i13++;
            i10++;
        }
        return new String(cArr);
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, 0, bArr.length);
    }

    public static byte[] getBytes(InputStream inputStream) throws IOException {
        if (inputStream instanceof ByteArrayInputStream) {
            int iAvailable = inputStream.available();
            byte[] bArr = new byte[iAvailable];
            inputStream.read(bArr, 0, iAvailable);
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr2, 0, 1024);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String toString(ByteArrayInputStream byteArrayInputStream) {
        int iAvailable = byteArrayInputStream.available();
        char[] cArr = new char[iAvailable];
        byte[] bArr = new byte[iAvailable];
        byteArrayInputStream.read(bArr, 0, iAvailable);
        for (int i10 = 0; i10 < iAvailable; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return new String(cArr);
    }

    public static int parseInt(byte[] bArr, int i10, int i11) throws NumberFormatException {
        return parseInt(bArr, i10, i11, 10);
    }

    public static long parseLong(byte[] bArr, int i10, int i11) throws NumberFormatException {
        return parseLong(bArr, i10, i11, 10);
    }
}
