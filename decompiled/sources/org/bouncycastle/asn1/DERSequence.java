package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DERSequence extends ASN1Sequence {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f86574q0;

    public DERSequence() {
        this.f86574q0 = -1;
    }

    public static DERSequence convert(ASN1Sequence aSN1Sequence) {
        return (DERSequence) aSN1Sequence.c();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        if (z10) {
            aSN1OutputStream.c(48);
        }
        DEROutputStream dEROutputStreamA = aSN1OutputStream.a();
        int length = this.f86524p0.length;
        int i10 = 0;
        if (this.f86574q0 >= 0 || length > 16) {
            aSN1OutputStream.i(f());
            while (i10 < length) {
                this.f86524p0[i10].toASN1Primitive().c().a(dEROutputStreamA, true);
                i10++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iB = 0;
        for (int i11 = 0; i11 < length; i11++) {
            ASN1Primitive aSN1PrimitiveC = this.f86524p0[i11].toASN1Primitive().c();
            aSN1PrimitiveArr[i11] = aSN1PrimitiveC;
            iB += aSN1PrimitiveC.b();
        }
        this.f86574q0 = iB;
        aSN1OutputStream.i(iB);
        while (i10 < length) {
            aSN1PrimitiveArr[i10].a(dEROutputStreamA, true);
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int iF = f();
        return j.a(iF) + 1 + iF;
    }

    public final int f() throws IOException {
        if (this.f86574q0 < 0) {
            int length = this.f86524p0.length;
            int iB = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iB += this.f86524p0[i10].toASN1Primitive().c().b();
            }
            this.f86574q0 = iB;
        }
        return this.f86574q0;
    }

    public DERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.f86574q0 = -1;
    }

    public DERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.f86574q0 = -1;
    }

    public DERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
        this.f86574q0 = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive c() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
