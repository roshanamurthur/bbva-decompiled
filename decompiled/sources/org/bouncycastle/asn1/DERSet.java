package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DERSet extends ASN1Set {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f86577p0;

    public DERSet() {
        this.f86577p0 = -1;
    }

    public static DERSet convert(ASN1Set aSN1Set) {
        return (DERSet) aSN1Set.c();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        if (z10) {
            aSN1OutputStream.c(49);
        }
        DEROutputStream dEROutputStreamA = aSN1OutputStream.a();
        int length = this.elements.length;
        int i10 = 0;
        if (this.f86577p0 >= 0 || length > 16) {
            aSN1OutputStream.i(h());
            while (i10 < length) {
                this.elements[i10].toASN1Primitive().c().a(dEROutputStreamA, true);
                i10++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iB = 0;
        for (int i11 = 0; i11 < length; i11++) {
            ASN1Primitive aSN1PrimitiveC = this.elements[i11].toASN1Primitive().c();
            aSN1PrimitiveArr[i11] = aSN1PrimitiveC;
            iB += aSN1PrimitiveC.b();
        }
        this.f86577p0 = iB;
        aSN1OutputStream.i(iB);
        while (i10 < length) {
            aSN1PrimitiveArr[i10].a(dEROutputStreamA, true);
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int iH = h();
        return j.a(iH) + 1 + iH;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive c() {
        return this.isSorted ? this : super.c();
    }

    public final int h() throws IOException {
        if (this.f86577p0 < 0) {
            int length = this.elements.length;
            int iB = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iB += this.elements[i10].toASN1Primitive().c().b();
            }
            this.f86577p0 = iB;
        }
        return this.f86577p0;
    }

    public DERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.f86577p0 = -1;
    }

    public DERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, true);
        this.f86577p0 = -1;
    }

    public DERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, true);
        this.f86577p0 = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
