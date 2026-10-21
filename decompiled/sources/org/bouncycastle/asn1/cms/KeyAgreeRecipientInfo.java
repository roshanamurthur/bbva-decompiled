package org.bouncycastle.asn1.cms;

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
public class KeyAgreeRecipientInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86920p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final OriginatorIdentifierOrKey f86921q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1OctetString f86922r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AlgorithmIdentifier f86923s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ASN1Sequence f86924t0;

    public KeyAgreeRecipientInfo(ASN1Sequence aSN1Sequence) {
        this.f86920p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.f86921q0 = OriginatorIdentifierOrKey.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        int i10 = 2;
        if (aSN1Sequence.getObjectAt(2) instanceof ASN1TaggedObject) {
            this.f86922r0 = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(2), true);
            i10 = 3;
        }
        this.f86923s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10));
        this.f86924t0 = (ASN1Sequence) aSN1Sequence.getObjectAt(i10 + 1);
    }

    public static KeyAgreeRecipientInfo getInstance(Object obj) {
        if (obj instanceof KeyAgreeRecipientInfo) {
            return (KeyAgreeRecipientInfo) obj;
        }
        if (obj != null) {
            return new KeyAgreeRecipientInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.f86923s0;
    }

    public OriginatorIdentifierOrKey getOriginator() {
        return this.f86921q0;
    }

    public ASN1Sequence getRecipientEncryptedKeys() {
        return this.f86924t0;
    }

    public ASN1OctetString getUserKeyingMaterial() {
        return this.f86922r0;
    }

    public ASN1Integer getVersion() {
        return this.f86920p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f86920p0);
        aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.f86921q0));
        ASN1OctetString aSN1OctetString = this.f86922r0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, aSN1OctetString));
        }
        aSN1EncodableVector.add(this.f86923s0);
        aSN1EncodableVector.add(this.f86924t0);
        return new DERSequence(aSN1EncodableVector);
    }

    public KeyAgreeRecipientInfo(OriginatorIdentifierOrKey originatorIdentifierOrKey, ASN1OctetString aSN1OctetString, AlgorithmIdentifier algorithmIdentifier, ASN1Sequence aSN1Sequence) {
        this.f86920p0 = new ASN1Integer(3L);
        this.f86921q0 = originatorIdentifierOrKey;
        this.f86922r0 = aSN1OctetString;
        this.f86923s0 = algorithmIdentifier;
        this.f86924t0 = aSN1Sequence;
    }

    public static KeyAgreeRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
