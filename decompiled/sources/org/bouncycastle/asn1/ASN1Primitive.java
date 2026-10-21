package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1Primitive extends ASN1Object {
    public static ASN1Primitive fromByteArray(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (aSN1InputStream.available() == 0) {
                return object;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException;

    public abstract boolean asn1Equals(ASN1Primitive aSN1Primitive);

    public abstract int b() throws IOException;

    @Override // org.bouncycastle.asn1.ASN1Object
    public void encodeTo(OutputStream outputStream) throws IOException {
        ASN1OutputStream.create(outputStream).writeObject(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ASN1Encodable) && asn1Equals(((ASN1Encodable) obj).toASN1Primitive());
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public abstract int hashCode();

    public abstract boolean isConstructed();

    @Override // org.bouncycastle.asn1.ASN1Object
    public void encodeTo(OutputStream outputStream, String str) throws IOException {
        ASN1OutputStream.create(outputStream, str).writeObject(this);
    }

    public final boolean equals(ASN1Encodable aSN1Encodable) {
        return this == aSN1Encodable || (aSN1Encodable != null && asn1Equals(aSN1Encodable.toASN1Primitive()));
    }

    public final boolean equals(ASN1Primitive aSN1Primitive) {
        return this == aSN1Primitive || asn1Equals(aSN1Primitive);
    }

    public ASN1Primitive c() {
        return this;
    }

    public ASN1Primitive d() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive toASN1Primitive() {
        return this;
    }
}
