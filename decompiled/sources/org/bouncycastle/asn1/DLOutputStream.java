package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class DLOutputStream extends ASN1OutputStream {
    public DLOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public final void j(ASN1Primitive aSN1Primitive, boolean z10) throws IOException {
        aSN1Primitive.d().a(this, z10);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public final ASN1OutputStream b() {
        return this;
    }
}
