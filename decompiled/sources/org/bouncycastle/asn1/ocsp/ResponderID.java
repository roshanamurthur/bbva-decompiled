package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class ResponderID extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Object f87346p0;

    public ResponderID(ASN1OctetString aSN1OctetString) {
        this.f87346p0 = aSN1OctetString;
    }

    public static ResponderID getInstance(Object obj) {
        if (obj instanceof ResponderID) {
            return (ResponderID) obj;
        }
        if (obj instanceof DEROctetString) {
            return new ResponderID((DEROctetString) obj);
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            return new ResponderID(X500Name.getInstance(obj));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        return aSN1TaggedObject.getTagNo() == 1 ? new ResponderID(X500Name.getInstance(aSN1TaggedObject, true)) : new ResponderID(ASN1OctetString.getInstance(aSN1TaggedObject, true));
    }

    public byte[] getKeyHash() {
        ASN1Object aSN1Object = this.f87346p0;
        if (aSN1Object instanceof ASN1OctetString) {
            return ((ASN1OctetString) aSN1Object).getOctets();
        }
        return null;
    }

    public X500Name getName() {
        ASN1Object aSN1Object = this.f87346p0;
        if (aSN1Object instanceof ASN1OctetString) {
            return null;
        }
        return X500Name.getInstance(aSN1Object);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Object aSN1Object = this.f87346p0;
        return aSN1Object instanceof ASN1OctetString ? new DERTaggedObject(true, 2, aSN1Object) : new DERTaggedObject(true, 1, aSN1Object);
    }

    public ResponderID(X500Name x500Name) {
        this.f87346p0 = x500Name;
    }

    public static ResponderID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
