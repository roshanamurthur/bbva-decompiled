package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2PrivateKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f90894p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f90895q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f90896r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f90897s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f90898t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public AlgorithmIdentifier f90899u0;

    public McElieceCCA2PrivateKey(int i10, int i11, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, AlgorithmIdentifier algorithmIdentifier) {
        this.f90894p0 = i10;
        this.f90895q0 = i11;
        this.f90896r0 = gF2mField.getEncoded();
        this.f90897s0 = polynomialGF2mSmallM.getEncoded();
        this.f90898t0 = permutation.getEncoded();
        this.f90899u0 = algorithmIdentifier;
    }

    public static McElieceCCA2PrivateKey getInstance(Object obj) {
        if (obj instanceof McElieceCCA2PrivateKey) {
            return (McElieceCCA2PrivateKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        McElieceCCA2PrivateKey mcElieceCCA2PrivateKey = new McElieceCCA2PrivateKey();
        mcElieceCCA2PrivateKey.f90894p0 = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        mcElieceCCA2PrivateKey.f90895q0 = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        mcElieceCCA2PrivateKey.f90896r0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets();
        mcElieceCCA2PrivateKey.f90897s0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets();
        mcElieceCCA2PrivateKey.f90898t0 = ((ASN1OctetString) aSN1Sequence.getObjectAt(4)).getOctets();
        mcElieceCCA2PrivateKey.f90899u0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(5));
        return mcElieceCCA2PrivateKey;
    }

    public AlgorithmIdentifier getDigest() {
        return this.f90899u0;
    }

    public GF2mField getField() {
        return new GF2mField(this.f90896r0);
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return new PolynomialGF2mSmallM(getField(), this.f90897s0);
    }

    public int getK() {
        return this.f90895q0;
    }

    public int getN() {
        return this.f90894p0;
    }

    public Permutation getP() {
        return new Permutation(this.f90898t0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f90894p0));
        aSN1EncodableVector.add(new ASN1Integer(this.f90895q0));
        aSN1EncodableVector.add(new DEROctetString(this.f90896r0));
        aSN1EncodableVector.add(new DEROctetString(this.f90897s0));
        aSN1EncodableVector.add(new DEROctetString(this.f90898t0));
        aSN1EncodableVector.add(this.f90899u0);
        return new DERSequence(aSN1EncodableVector);
    }
}
