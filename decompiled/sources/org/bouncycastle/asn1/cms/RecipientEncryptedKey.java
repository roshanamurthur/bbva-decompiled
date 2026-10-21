package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class RecipientEncryptedKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public KeyAgreeRecipientIdentifier f86948p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f86949q0;

    public RecipientEncryptedKey(KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, ASN1OctetString aSN1OctetString) {
        this.f86948p0 = keyAgreeRecipientIdentifier;
        this.f86949q0 = aSN1OctetString;
    }

    public static RecipientEncryptedKey getInstance(Object obj) {
        if (obj instanceof RecipientEncryptedKey) {
            return (RecipientEncryptedKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RecipientEncryptedKey recipientEncryptedKey = new RecipientEncryptedKey();
        recipientEncryptedKey.f86948p0 = KeyAgreeRecipientIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        recipientEncryptedKey.f86949q0 = (ASN1OctetString) aSN1Sequence.getObjectAt(1);
        return recipientEncryptedKey;
    }

    public ASN1OctetString getEncryptedKey() {
        return this.f86949q0;
    }

    public KeyAgreeRecipientIdentifier getIdentifier() {
        return this.f86948p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86948p0);
        aSN1EncodableVector.add(this.f86949q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static RecipientEncryptedKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
