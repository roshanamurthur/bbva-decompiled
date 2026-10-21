package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes13.dex */
public class McEliecePrivateKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f90904p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f90905q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f90906r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f90907s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f90908t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f90909u0;
    public byte[] v0;

    public McEliecePrivateKey(int i10, int i11, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix) {
        this.f90904p0 = i10;
        this.f90905q0 = i11;
        this.f90906r0 = gF2mField.getEncoded();
        this.f90907s0 = polynomialGF2mSmallM.getEncoded();
        this.f90908t0 = gF2Matrix.getEncoded();
        this.f90909u0 = permutation.getEncoded();
        this.v0 = permutation2.getEncoded();
    }

    public static McEliecePrivateKey getInstance(Object obj) {
        if (obj instanceof McEliecePrivateKey) {
            return (McEliecePrivateKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        McEliecePrivateKey mcEliecePrivateKey = new McEliecePrivateKey();
        mcEliecePrivateKey.f90904p0 = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        mcEliecePrivateKey.f90905q0 = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        mcEliecePrivateKey.f90906r0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets();
        mcEliecePrivateKey.f90907s0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets();
        mcEliecePrivateKey.f90909u0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(4)).getOctets();
        mcEliecePrivateKey.v0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(5)).getOctets();
        mcEliecePrivateKey.f90908t0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(6)).getOctets();
        return mcEliecePrivateKey;
    }

    public GF2mField getField() {
        return new GF2mField(this.f90906r0);
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return new PolynomialGF2mSmallM(getField(), this.f90907s0);
    }

    public int getK() {
        return this.f90905q0;
    }

    public int getN() {
        return this.f90904p0;
    }

    public Permutation getP1() {
        return new Permutation(this.f90909u0);
    }

    public Permutation getP2() {
        return new Permutation(this.v0);
    }

    public GF2Matrix getSInv() {
        return new GF2Matrix(this.f90908t0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f90904p0));
        aSN1EncodableVector.add(new ASN1Integer(this.f90905q0));
        aSN1EncodableVector.add(new DEROctetString(this.f90906r0));
        aSN1EncodableVector.add(new DEROctetString(this.f90907s0));
        aSN1EncodableVector.add(new DEROctetString(this.f90909u0));
        aSN1EncodableVector.add(new DEROctetString(this.v0));
        aSN1EncodableVector.add(new DEROctetString(this.f90908t0));
        return new DERSequence(aSN1EncodableVector);
    }
}
