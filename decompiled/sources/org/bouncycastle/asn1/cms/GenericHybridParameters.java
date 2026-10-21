package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class GenericHybridParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86907p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86908q0;

    public GenericHybridParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
        }
        this.f86907p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86908q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static GenericHybridParameters getInstance(Object obj) {
        if (obj instanceof GenericHybridParameters) {
            return (GenericHybridParameters) obj;
        }
        if (obj != null) {
            return new GenericHybridParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getDem() {
        return this.f86908q0;
    }

    public AlgorithmIdentifier getKem() {
        return this.f86907p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86907p0);
        aSN1EncodableVector.add(this.f86908q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public GenericHybridParameters(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        this.f86907p0 = algorithmIdentifier;
        this.f86908q0 = algorithmIdentifier2;
    }
}
