package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class Signature extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87359p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DERBitString f87360q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87361r0;

    public Signature(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
        this.f87359p0 = algorithmIdentifier;
        this.f87360q0 = dERBitString;
    }

    public static Signature getInstance(Object obj) {
        if (obj instanceof Signature) {
            return (Signature) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Signature signature = new Signature();
        signature.f87359p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        signature.f87360q0 = (DERBitString) aSN1Sequence.getObjectAt(1);
        if (aSN1Sequence.size() == 3) {
            signature.f87361r0 = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(2), true);
        }
        return signature;
    }

    public ASN1Sequence getCerts() {
        return this.f87361r0;
    }

    public DERBitString getSignature() {
        return this.f87360q0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f87359p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87359p0);
        aSN1EncodableVector.add(this.f87360q0);
        ASN1Sequence aSN1Sequence = this.f87361r0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Sequence));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Signature(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString, ASN1Sequence aSN1Sequence) {
        this.f87359p0 = algorithmIdentifier;
        this.f87360q0 = dERBitString;
        this.f87361r0 = aSN1Sequence;
    }

    public static Signature getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
