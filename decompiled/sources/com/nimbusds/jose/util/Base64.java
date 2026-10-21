package com.nimbusds.jose.util;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import li.a;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class Base64 implements Serializable {
    private static final long serialVersionUID = 1;
    private final String value;

    public Base64(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.value = str;
    }

    public static Base64 encode(byte[] bArr) {
        return new Base64(a.c(false, bArr));
    }

    public static Base64 from(String str) {
        if (str == null) {
            return null;
        }
        return new Base64(str);
    }

    public byte[] decode() {
        char c10;
        String str = this.value;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(StandardCharset.UTF_8);
        int length = bytes.length;
        long j10 = (((long) length) * 6) >> 3;
        int i10 = (int) j10;
        if (i10 != j10) {
            throw new IllegalArgumentException(j10 + " cannot be cast to int without changing its value.");
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bytes.length) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < 4 && i11 < length) {
                int i15 = i11 + 1;
                byte b10 = bytes[i11];
                int iE = a.e(b10, 64) & a.f(b10, 91);
                int iE2 = a.e(b10, 96) & a.f(b10, 123);
                int iE3 = a.e(b10, 47) & a.f(b10, 58);
                int iD = a.d(b10, 43) | a.d(b10, 45);
                int iD2 = a.d(b10, 47) | a.d(b10, 95);
                byte[] bArr2 = bytes;
                int iG = a.g(iE2, b10 - 71, 0) | a.g(iE, b10 + ByteSourceJsonBootstrapper.UTF8_BOM_3, 0) | a.g(iE3, b10 + 4, 0) | a.g(iD, 62, 0) | a.g(iD2, 63, 0) | a.g(iE | iE2 | iE3 | iD | iD2, 0, -1);
                if (iG >= 0) {
                    i14 |= iG << (18 - (i13 * 6));
                    i13++;
                }
                i11 = i15;
                bytes = bArr2;
            }
            byte[] bArr3 = bytes;
            if (i13 >= 2) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) (i14 >> 16);
                c10 = 3;
                if (i13 >= 3) {
                    int i17 = i12 + 2;
                    bArr[i16] = (byte) (i14 >> 8);
                    if (i13 >= 4) {
                        i12 += 3;
                        bArr[i17] = (byte) i14;
                    } else {
                        i12 = i17;
                    }
                } else {
                    i12 = i16;
                }
            } else {
                c10 = 3;
            }
            bytes = bArr3;
        }
        return Arrays.copyOf(bArr, i12);
    }

    public BigInteger decodeToBigInteger() {
        return new BigInteger(1, decode());
    }

    public String decodeToString() {
        return new String(decode(), StandardCharset.UTF_8);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Base64) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toJSONString() {
        return JSONStringUtils.toJSONString(this.value);
    }

    public String toString() {
        return this.value;
    }

    public static Base64 encode(BigInteger bigInteger) {
        return encode(BigIntegerUtils.toBytesUnsigned(bigInteger));
    }

    public static Base64 encode(String str) {
        return encode(str.getBytes(StandardCharset.UTF_8));
    }
}
