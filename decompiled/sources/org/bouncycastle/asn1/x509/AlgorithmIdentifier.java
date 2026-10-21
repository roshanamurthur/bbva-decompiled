package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AlgorithmIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87562p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87563q0;

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87562p0 = aSN1ObjectIdentifier;
    }

    public static AlgorithmIdentifier getInstance(Object obj) {
        if (obj instanceof AlgorithmIdentifier) {
            return (AlgorithmIdentifier) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        algorithmIdentifier.f87562p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            algorithmIdentifier.f87563q0 = aSN1Sequence.getObjectAt(1);
        } else {
            algorithmIdentifier.f87563q0 = null;
        }
        return algorithmIdentifier;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.f87562p0;
    }

    public ASN1Encodable getParameters() {
        return this.f87563q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87562p0);
        ASN1Encodable aSN1Encodable = this.f87563q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87562p0 = aSN1ObjectIdentifier;
        this.f87563q0 = aSN1Encodable;
    }

    public static AlgorithmIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
