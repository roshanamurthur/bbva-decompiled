package com.nimbusds.jose.util;

import java.math.BigInteger;
import li.a;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class Base64URL extends Base64 {
    public Base64URL(String str) {
        super(str);
    }

    public static Base64URL encode(byte[] bArr) {
        return new Base64URL(a.c(true, bArr));
    }

    public static Base64URL from(String str) {
        if (str == null) {
            return null;
        }
        return new Base64URL(str);
    }

    @Override // com.nimbusds.jose.util.Base64
    public boolean equals(Object obj) {
        return (obj instanceof Base64URL) && toString().equals(obj.toString());
    }

    public static Base64URL encode(BigInteger bigInteger) {
        return encode(BigIntegerUtils.toBytesUnsigned(bigInteger));
    }

    public static Base64URL encode(String str) {
        return encode(str.getBytes(StandardCharset.UTF_8));
    }
}
