package org.bouncycastle.asn1.cms;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class OriginatorIdentifierOrKey extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Object f86933p0;

    public OriginatorIdentifierOrKey(ASN1OctetString aSN1OctetString) {
        this(new SubjectKeyIdentifier(aSN1OctetString.getOctets()));
    }

    public static OriginatorIdentifierOrKey getInstance(Object obj) {
        if (obj == null || (obj instanceof OriginatorIdentifierOrKey)) {
            return (OriginatorIdentifierOrKey) obj;
        }
        if ((obj instanceof IssuerAndSerialNumber) || (obj instanceof ASN1Sequence)) {
            return new OriginatorIdentifierOrKey(IssuerAndSerialNumber.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
            if (aSN1TaggedObject.getTagNo() == 0) {
                return new OriginatorIdentifierOrKey(SubjectKeyIdentifier.getInstance(aSN1TaggedObject, false));
            }
            if (aSN1TaggedObject.getTagNo() == 1) {
                return new OriginatorIdentifierOrKey(OriginatorPublicKey.getInstance(aSN1TaggedObject, false));
            }
        }
        throw new IllegalArgumentException(a.c(obj, "Invalid OriginatorIdentifierOrKey: "));
    }

    public ASN1Encodable getId() {
        return this.f86933p0;
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        ASN1Object aSN1Object = this.f86933p0;
        if (aSN1Object instanceof IssuerAndSerialNumber) {
            return (IssuerAndSerialNumber) aSN1Object;
        }
        return null;
    }

    public OriginatorPublicKey getOriginatorKey() {
        ASN1Object aSN1Object = this.f86933p0;
        if (!(aSN1Object instanceof ASN1TaggedObject)) {
            return null;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Object;
        if (aSN1TaggedObject.getTagNo() == 1) {
            return OriginatorPublicKey.getInstance(aSN1TaggedObject, false);
        }
        return null;
    }

    public SubjectKeyIdentifier getSubjectKeyIdentifier() {
        ASN1Object aSN1Object = this.f86933p0;
        if (!(aSN1Object instanceof ASN1TaggedObject)) {
            return null;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Object;
        if (aSN1TaggedObject.getTagNo() == 0) {
            return SubjectKeyIdentifier.getInstance(aSN1TaggedObject, false);
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86933p0.toASN1Primitive();
    }

    public OriginatorIdentifierOrKey(ASN1Primitive aSN1Primitive) {
        this.f86933p0 = aSN1Primitive;
    }

    public OriginatorIdentifierOrKey(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f86933p0 = issuerAndSerialNumber;
    }

    public OriginatorIdentifierOrKey(OriginatorPublicKey originatorPublicKey) {
        this.f86933p0 = new DERTaggedObject(false, 1, originatorPublicKey);
    }

    public OriginatorIdentifierOrKey(SubjectKeyIdentifier subjectKeyIdentifier) {
        this.f86933p0 = new DERTaggedObject(false, 0, subjectKeyIdentifier);
    }

    public static OriginatorIdentifierOrKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (z10) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new IllegalArgumentException("Can't implicitly tag OriginatorIdentifierOrKey");
    }
}
