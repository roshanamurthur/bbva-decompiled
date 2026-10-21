package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DLSet extends ASN1Set {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f86587p0;

    public DLSet() {
        this.f86587p0 = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        if (z10) {
            aSN1OutputStream.c(49);
        }
        ASN1OutputStream aSN1OutputStreamB = aSN1OutputStream.b();
        int length = this.elements.length;
        int i10 = 0;
        if (this.f86587p0 >= 0 || length > 16) {
            aSN1OutputStream.i(h());
            while (i10 < length) {
                aSN1OutputStreamB.j(this.elements[i10].toASN1Primitive(), true);
                i10++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iB = 0;
        for (int i11 = 0; i11 < length; i11++) {
            ASN1Primitive aSN1PrimitiveD = this.elements[i11].toASN1Primitive().d();
            aSN1PrimitiveArr[i11] = aSN1PrimitiveD;
            iB += aSN1PrimitiveD.b();
        }
        this.f86587p0 = iB;
        aSN1OutputStream.i(iB);
        while (i10 < length) {
            aSN1OutputStreamB.j(aSN1PrimitiveArr[i10], true);
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int iH = h();
        return j.a(iH) + 1 + iH;
    }

    public final int h() throws IOException {
        if (this.f86587p0 < 0) {
            int length = this.elements.length;
            int iB = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iB += this.elements[i10].toASN1Primitive().d().b();
            }
            this.f86587p0 = iB;
        }
        return this.f86587p0;
    }

    public DLSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.f86587p0 = -1;
    }

    public DLSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
        this.f86587p0 = -1;
    }

    public DLSet(boolean z10, ASN1Encodable[] aSN1EncodableArr) {
        super(z10, aSN1EncodableArr);
        this.f86587p0 = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
        this.f86587p0 = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
