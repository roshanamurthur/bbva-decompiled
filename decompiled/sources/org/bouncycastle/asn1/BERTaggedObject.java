package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes12.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i10) {
        super(false, i10, new BERSequence());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        Enumeration objects;
        aSN1OutputStream.k(160, this.f86538p0, z10);
        aSN1OutputStream.c(128);
        boolean z11 = this.f86539q0;
        ASN1Encodable aSN1Encodable = this.f86540r0;
        if (z11) {
            aSN1OutputStream.j(aSN1Encodable.toASN1Primitive(), true);
        } else {
            if (aSN1Encodable instanceof ASN1OctetString) {
                objects = aSN1Encodable instanceof BEROctetString ? ((BEROctetString) aSN1Encodable).getObjects() : new BEROctetString(((ASN1OctetString) aSN1Encodable).getOctets()).getObjects();
            } else if (aSN1Encodable instanceof ASN1Sequence) {
                objects = ((ASN1Sequence) aSN1Encodable).getObjects();
            } else {
                if (!(aSN1Encodable instanceof ASN1Set)) {
                    throw new ASN1Exception("not implemented: ".concat(aSN1Encodable.getClass().getName()));
                }
                objects = ((ASN1Set) aSN1Encodable).getObjects();
            }
            aSN1OutputStream.e(objects);
        }
        aSN1OutputStream.c(0);
        aSN1OutputStream.c(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int iB = this.f86540r0.toASN1Primitive().b();
        boolean z10 = this.f86539q0;
        int i10 = this.f86538p0;
        if (z10) {
            return j.a(iB) + j.b(i10) + iB;
        }
        return j.b(i10) + (iB - 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return this.f86539q0 || this.f86540r0.toASN1Primitive().isConstructed();
    }

    public BERTaggedObject(int i10, ASN1Encodable aSN1Encodable) {
        super(true, i10, aSN1Encodable);
    }

    public BERTaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        super(z10, i10, aSN1Encodable);
    }
}
