package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1InputStream f87264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1Primitive f87265b = a();

    public g(byte[] bArr) {
        this.f87264a = new ASN1InputStream(bArr, true);
    }

    public final ASN1Primitive a() {
        try {
            return this.f87264a.readObject();
        } catch (IOException e5) {
            throw new ASN1ParsingException(ad.e.d("malformed DER construction: ", e5), e5);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f87265b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        ASN1Primitive aSN1Primitive = this.f87265b;
        this.f87265b = a();
        return aSN1Primitive;
    }
}
