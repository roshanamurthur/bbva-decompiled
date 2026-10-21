package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class BERSequence extends ASN1Sequence {
    public BERSequence() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.h(z10, 48, this.f86524p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int length = this.f86524p0.length;
        int iB = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iB += this.f86524p0[i10].toASN1Primitive().b();
        }
        return iB + 4;
    }

    public BERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
    }

    public BERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
    }
}
