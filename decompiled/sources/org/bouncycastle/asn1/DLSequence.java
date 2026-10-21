package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DLSequence extends ASN1Sequence {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f86586q0;

    public DLSequence() {
        this.f86586q0 = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        if (z10) {
            aSN1OutputStream.c(48);
        }
        ASN1OutputStream aSN1OutputStreamB = aSN1OutputStream.b();
        int length = this.f86524p0.length;
        int i10 = 0;
        if (this.f86586q0 >= 0 || length > 16) {
            aSN1OutputStream.i(f());
            while (i10 < length) {
                aSN1OutputStreamB.j(this.f86524p0[i10].toASN1Primitive(), true);
                i10++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iB = 0;
        for (int i11 = 0; i11 < length; i11++) {
            ASN1Primitive aSN1PrimitiveD = this.f86524p0[i11].toASN1Primitive().d();
            aSN1PrimitiveArr[i11] = aSN1PrimitiveD;
            iB += aSN1PrimitiveD.b();
        }
        this.f86586q0 = iB;
        aSN1OutputStream.i(iB);
        while (i10 < length) {
            aSN1OutputStreamB.j(aSN1PrimitiveArr[i10], true);
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int iF = f();
        return j.a(iF) + 1 + iF;
    }

    public final int f() throws IOException {
        if (this.f86586q0 < 0) {
            int length = this.f86524p0.length;
            int iB = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iB += this.f86524p0[i10].toASN1Primitive().d().b();
            }
            this.f86586q0 = iB;
        }
        return this.f86586q0;
    }

    public DLSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.f86586q0 = -1;
    }

    public DLSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.f86586q0 = -1;
    }

    public DLSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
        this.f86586q0 = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
