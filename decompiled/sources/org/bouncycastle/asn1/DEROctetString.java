package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DEROctetString extends ASN1OctetString {
    public DEROctetString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 4, this.f86521p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86521p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive c() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
