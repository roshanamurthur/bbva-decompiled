package org.bouncycastle.asn1.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class RsaKemParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86955p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f86956q0;

    public RsaKemParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
        }
        this.f86955p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86956q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
    }

    public static RsaKemParameters getInstance(Object obj) {
        if (obj instanceof RsaKemParameters) {
            return (RsaKemParameters) obj;
        }
        if (obj != null) {
            return new RsaKemParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getKeyDerivationFunction() {
        return this.f86955p0;
    }

    public BigInteger getKeyLength() {
        return this.f86956q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86955p0);
        aSN1EncodableVector.add(new ASN1Integer(this.f86956q0));
        return new DERSequence(aSN1EncodableVector);
    }

    public RsaKemParameters(AlgorithmIdentifier algorithmIdentifier, int i10) {
        this.f86955p0 = algorithmIdentifier;
        this.f86956q0 = BigInteger.valueOf(i10);
    }
}
