package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class KeyTransRecipientInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86925p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final RecipientIdentifier f86926q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f86927r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1OctetString f86928s0;

    public KeyTransRecipientInfo(ASN1Sequence aSN1Sequence) {
        this.f86925p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.f86926q0 = RecipientIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86927r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        this.f86928s0 = (ASN1OctetString) aSN1Sequence.getObjectAt(3);
    }

    public static KeyTransRecipientInfo getInstance(Object obj) {
        if (obj instanceof KeyTransRecipientInfo) {
            return (KeyTransRecipientInfo) obj;
        }
        if (obj != null) {
            return new KeyTransRecipientInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getEncryptedKey() {
        return this.f86928s0;
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.f86927r0;
    }

    public RecipientIdentifier getRecipientIdentifier() {
        return this.f86926q0;
    }

    public ASN1Integer getVersion() {
        return this.f86925p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86925p0);
        aSN1EncodableVector.add(this.f86926q0);
        aSN1EncodableVector.add(this.f86927r0);
        aSN1EncodableVector.add(this.f86928s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public KeyTransRecipientInfo(RecipientIdentifier recipientIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.f86925p0 = recipientIdentifier.toASN1Primitive() instanceof ASN1TaggedObject ? new ASN1Integer(2L) : new ASN1Integer(0L);
        this.f86926q0 = recipientIdentifier;
        this.f86927r0 = algorithmIdentifier;
        this.f86928s0 = aSN1OctetString;
    }
}
