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
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2PublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f90900p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f90901q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final GF2Matrix f90902r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AlgorithmIdentifier f90903s0;

    public McElieceCCA2PublicKey(int i10, int i11, GF2Matrix gF2Matrix, AlgorithmIdentifier algorithmIdentifier) {
        this.f90900p0 = i10;
        this.f90901q0 = i11;
        this.f90902r0 = new GF2Matrix(gF2Matrix.getEncoded());
        this.f90903s0 = algorithmIdentifier;
    }

    public static McElieceCCA2PublicKey getInstance(Object obj) {
        if (obj instanceof McElieceCCA2PublicKey) {
            return (McElieceCCA2PublicKey) obj;
        }
        if (obj != null) {
            return new McElieceCCA2PublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getDigest() {
        return this.f90903s0;
    }

    public GF2Matrix getG() {
        return this.f90902r0;
    }

    public int getN() {
        return this.f90900p0;
    }

    public int getT() {
        return this.f90901q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f90900p0));
        aSN1EncodableVector.add(new ASN1Integer(this.f90901q0));
        aSN1EncodableVector.add(new DEROctetString(this.f90902r0.getEncoded()));
        aSN1EncodableVector.add(this.f90903s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public McElieceCCA2PublicKey(ASN1Sequence aSN1Sequence) {
        this.f90900p0 = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f90901q0 = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f90902r0 = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
        this.f90903s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
    }
}
