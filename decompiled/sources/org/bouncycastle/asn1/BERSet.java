package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class BERSet extends ASN1Set {
    public BERSet() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.h(z10, 49, this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int length = this.elements.length;
        int iB = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iB += this.elements[i10].toASN1Primitive().b();
        }
        return iB + 4;
    }

    public BERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    public BERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
    }
}
