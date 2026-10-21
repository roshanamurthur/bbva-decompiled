package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class PasswordRecipientInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86944p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86945q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f86946r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1OctetString f86947s0;

    public PasswordRecipientInfo(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        this.f86944p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1TaggedObject) {
            this.f86945q0 = AlgorithmIdentifier.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), false);
            this.f86946r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
            objectAt = aSN1Sequence.getObjectAt(3);
        } else {
            this.f86946r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.f86947s0 = (ASN1OctetString) objectAt;
    }

    public static PasswordRecipientInfo getInstance(Object obj) {
        if (obj instanceof PasswordRecipientInfo) {
            return (PasswordRecipientInfo) obj;
        }
        if (obj != null) {
            return new PasswordRecipientInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getEncryptedKey() {
        return this.f86947s0;
    }

    public AlgorithmIdentifier getKeyDerivationAlgorithm() {
        return this.f86945q0;
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.f86946r0;
    }

    public ASN1Integer getVersion() {
        return this.f86944p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86944p0);
        AlgorithmIdentifier algorithmIdentifier = this.f86945q0;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, algorithmIdentifier));
        }
        aSN1EncodableVector.add(this.f86946r0);
        aSN1EncodableVector.add(this.f86947s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public PasswordRecipientInfo(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.f86944p0 = new ASN1Integer(0L);
        this.f86946r0 = algorithmIdentifier;
        this.f86947s0 = aSN1OctetString;
    }

    public static PasswordRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public PasswordRecipientInfo(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, ASN1OctetString aSN1OctetString) {
        this.f86944p0 = new ASN1Integer(0L);
        this.f86945q0 = algorithmIdentifier;
        this.f86946r0 = algorithmIdentifier2;
        this.f86947s0 = aSN1OctetString;
    }
}
