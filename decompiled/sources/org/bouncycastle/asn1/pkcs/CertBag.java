package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class CertBag extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87381p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87382q0;

    public CertBag(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87381p0 = aSN1ObjectIdentifier;
        this.f87382q0 = aSN1Encodable;
    }

    public static CertBag getInstance(Object obj) {
        if (obj instanceof CertBag) {
            return (CertBag) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertBag certBag = new CertBag();
        certBag.f87381p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        certBag.f87382q0 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject();
        return certBag;
    }

    public ASN1ObjectIdentifier getCertId() {
        return this.f87381p0;
    }

    public ASN1Encodable getCertValue() {
        return this.f87382q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87381p0);
        aSN1EncodableVector.add(new DERTaggedObject(0, this.f87382q0));
        return new DERSequence(aSN1EncodableVector);
    }
}
