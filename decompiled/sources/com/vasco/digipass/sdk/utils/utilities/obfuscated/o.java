package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o implements g {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return toASN1Primitive().equals(((g) obj).toASN1Primitive());
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new s(byteArrayOutputStream).a(this);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    public u toASN1Object() {
        return toASN1Primitive();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public abstract u toASN1Primitive();

    public byte[] getEncoded(String str) throws IOException {
        if (str.equals(ASN1Encoding.DER)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new g1(byteArrayOutputStream).a(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (str.equals(ASN1Encoding.DL)) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new a2(byteArrayOutputStream2).a(this);
            return byteArrayOutputStream2.toByteArray();
        }
        return getEncoded();
    }
}
