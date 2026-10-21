package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DLTaggedObject extends ASN1TaggedObject {
    public DLTaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        super(z10, i10, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        ASN1Primitive aSN1PrimitiveD = this.f86540r0.toASN1Primitive().d();
        boolean z11 = this.f86539q0;
        aSN1OutputStream.k((z11 || aSN1PrimitiveD.isConstructed()) ? 160 : 128, this.f86538p0, z10);
        if (z11) {
            aSN1OutputStream.i(aSN1PrimitiveD.b());
        }
        aSN1OutputStream.b().j(aSN1PrimitiveD, z11);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int iB = this.f86540r0.toASN1Primitive().d().b();
        boolean z10 = this.f86539q0;
        int i10 = this.f86538p0;
        if (z10) {
            return j.a(iB) + j.b(i10) + iB;
        }
        return j.b(i10) + (iB - 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return this.f86539q0 || this.f86540r0.toASN1Primitive().d().isConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
