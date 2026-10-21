package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class OriginatorPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86936p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DERBitString f86937q0;

    public OriginatorPublicKey(ASN1Sequence aSN1Sequence) {
        this.f86936p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86937q0 = (DERBitString) aSN1Sequence.getObjectAt(1);
    }

    public static OriginatorPublicKey getInstance(Object obj) {
        if (obj instanceof OriginatorPublicKey) {
            return (OriginatorPublicKey) obj;
        }
        if (obj != null) {
            return new OriginatorPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getAlgorithm() {
        return this.f86936p0;
    }

    public DERBitString getPublicKey() {
        return this.f86937q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86936p0);
        aSN1EncodableVector.add(this.f86937q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public OriginatorPublicKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f86936p0 = algorithmIdentifier;
        this.f86937q0 = new DERBitString(bArr);
    }

    public static OriginatorPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
