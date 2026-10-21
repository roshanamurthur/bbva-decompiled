package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.EnvelopedData;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedKey extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final EnvelopedData f87034p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final EncryptedValue f87035q0;

    public EncryptedKey(EnvelopedData envelopedData) {
        this.f87034p0 = envelopedData;
    }

    public static EncryptedKey getInstance(Object obj) {
        if (obj instanceof EncryptedKey) {
            return (EncryptedKey) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new EncryptedKey(EnvelopedData.getInstance((ASN1TaggedObject) obj, false));
        }
        return obj instanceof EncryptedValue ? new EncryptedKey((EncryptedValue) obj) : new EncryptedKey(EncryptedValue.getInstance(obj));
    }

    public ASN1Encodable getValue() {
        EncryptedValue encryptedValue = this.f87035q0;
        return encryptedValue != null ? encryptedValue : this.f87034p0;
    }

    public boolean isEncryptedValue() {
        return this.f87035q0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        EncryptedValue encryptedValue = this.f87035q0;
        return encryptedValue != null ? encryptedValue.toASN1Primitive() : new DERTaggedObject(false, 0, this.f87034p0);
    }

    public EncryptedKey(EncryptedValue encryptedValue) {
        this.f87035q0 = encryptedValue;
    }
}
