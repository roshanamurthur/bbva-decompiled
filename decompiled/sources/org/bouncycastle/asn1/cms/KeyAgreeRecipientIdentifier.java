package org.bouncycastle.asn1.cms;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class KeyAgreeRecipientIdentifier extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final IssuerAndSerialNumber f86918p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final RecipientKeyIdentifier f86919q0;

    public KeyAgreeRecipientIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f86918p0 = issuerAndSerialNumber;
        this.f86919q0 = null;
    }

    public static KeyAgreeRecipientIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof KeyAgreeRecipientIdentifier)) {
            return (KeyAgreeRecipientIdentifier) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new KeyAgreeRecipientIdentifier(IssuerAndSerialNumber.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
            if (aSN1TaggedObject.getTagNo() == 0) {
                return new KeyAgreeRecipientIdentifier(RecipientKeyIdentifier.getInstance(aSN1TaggedObject, false));
            }
        }
        throw new IllegalArgumentException(a.c(obj, "Invalid KeyAgreeRecipientIdentifier: "));
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return this.f86918p0;
    }

    public RecipientKeyIdentifier getRKeyID() {
        return this.f86919q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        IssuerAndSerialNumber issuerAndSerialNumber = this.f86918p0;
        return issuerAndSerialNumber != null ? issuerAndSerialNumber.toASN1Primitive() : new DERTaggedObject(false, 0, this.f86919q0);
    }

    public KeyAgreeRecipientIdentifier(RecipientKeyIdentifier recipientKeyIdentifier) {
        this.f86918p0 = null;
        this.f86919q0 = recipientKeyIdentifier;
    }

    public static KeyAgreeRecipientIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
