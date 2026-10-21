package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class CrlOcspRef extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CrlListID f87204p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OcspListID f87205q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OtherRevRefs f87206r0;

    public CrlOcspRef(CrlListID crlListID, OcspListID ocspListID, OtherRevRefs otherRevRefs) {
        this.f87204p0 = crlListID;
        this.f87205q0 = ocspListID;
        this.f87206r0 = otherRevRefs;
    }

    public static CrlOcspRef getInstance(Object obj) {
        if (obj instanceof CrlOcspRef) {
            return (CrlOcspRef) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CrlOcspRef crlOcspRef = new CrlOcspRef();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                crlOcspRef.f87204p0 = CrlListID.getInstance(aSN1TaggedObject.getObject());
            } else if (tagNo == 1) {
                crlOcspRef.f87205q0 = OcspListID.getInstance(aSN1TaggedObject.getObject());
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException("illegal tag");
                }
                crlOcspRef.f87206r0 = OtherRevRefs.getInstance(aSN1TaggedObject.getObject());
            }
        }
        return crlOcspRef;
    }

    public CrlListID getCrlids() {
        return this.f87204p0;
    }

    public OcspListID getOcspids() {
        return this.f87205q0;
    }

    public OtherRevRefs getOtherRev() {
        return this.f87206r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        CrlListID crlListID = this.f87204p0;
        if (crlListID != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, crlListID.toASN1Primitive()));
        }
        OcspListID ocspListID = this.f87205q0;
        if (ocspListID != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, ocspListID.toASN1Primitive()));
        }
        OtherRevRefs otherRevRefs = this.f87206r0;
        if (otherRevRefs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, otherRevRefs.toASN1Primitive()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
