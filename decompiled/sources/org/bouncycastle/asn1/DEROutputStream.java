package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class DEROutputStream extends ASN1OutputStream {
    public DEROutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public final void j(ASN1Primitive aSN1Primitive, boolean z10) throws IOException {
        aSN1Primitive.c().a(this, z10);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public final DEROutputStream a() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public final ASN1OutputStream b() {
        return this;
    }
}
