package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class OtherInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public KeySpecificInfo f87823p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87824q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1OctetString f87825r0;

    public OtherInfo(KeySpecificInfo keySpecificInfo, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        this.f87823p0 = keySpecificInfo;
        this.f87824q0 = aSN1OctetString;
        this.f87825r0 = aSN1OctetString2;
    }

    public static OtherInfo getInstance(Object obj) {
        if (obj instanceof OtherInfo) {
            return (OtherInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherInfo otherInfo = new OtherInfo();
        Enumeration objects = aSN1Sequence.getObjects();
        otherInfo.f87823p0 = KeySpecificInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                otherInfo.f87824q0 = (ASN1OctetString) aSN1TaggedObject.getObject();
            } else if (aSN1TaggedObject.getTagNo() == 2) {
                otherInfo.f87825r0 = (ASN1OctetString) aSN1TaggedObject.getObject();
            }
        }
        return otherInfo;
    }

    public KeySpecificInfo getKeyInfo() {
        return this.f87823p0;
    }

    public ASN1OctetString getPartyAInfo() {
        return this.f87824q0;
    }

    public ASN1OctetString getSuppPubInfo() {
        return this.f87825r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87823p0);
        ASN1OctetString aSN1OctetString = this.f87824q0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, aSN1OctetString));
        }
        aSN1EncodableVector.add(new DERTaggedObject(2, this.f87825r0));
        return new DERSequence(aSN1EncodableVector);
    }
}
