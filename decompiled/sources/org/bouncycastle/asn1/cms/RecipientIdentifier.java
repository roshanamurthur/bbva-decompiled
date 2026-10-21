package org.bouncycastle.asn1.cms;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class RecipientIdentifier extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Object f86950p0;

    public RecipientIdentifier(ASN1OctetString aSN1OctetString) {
        this.f86950p0 = new DERTaggedObject(false, 0, aSN1OctetString);
    }

    public static RecipientIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof RecipientIdentifier)) {
            return (RecipientIdentifier) obj;
        }
        if (obj instanceof IssuerAndSerialNumber) {
            return new RecipientIdentifier((IssuerAndSerialNumber) obj);
        }
        if (obj instanceof ASN1OctetString) {
            return new RecipientIdentifier((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Primitive) {
            return new RecipientIdentifier((ASN1Primitive) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "Illegal object in RecipientIdentifier: "));
    }

    public ASN1Encodable getId() {
        ASN1Object aSN1Object = this.f86950p0;
        return aSN1Object instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Object, false) : IssuerAndSerialNumber.getInstance(aSN1Object);
    }

    public boolean isTagged() {
        return this.f86950p0 instanceof ASN1TaggedObject;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86950p0.toASN1Primitive();
    }

    public RecipientIdentifier(ASN1Primitive aSN1Primitive) {
        this.f86950p0 = aSN1Primitive;
    }

    public RecipientIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f86950p0 = issuerAndSerialNumber;
    }
}
