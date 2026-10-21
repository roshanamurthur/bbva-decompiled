package org.bouncycastle.asn1.cms;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class OriginatorInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Set f86934p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Set f86935q0;

    public OriginatorInfo(ASN1Set aSN1Set, ASN1Set aSN1Set2) {
        this.f86934p0 = aSN1Set;
        this.f86935q0 = aSN1Set2;
    }

    public static OriginatorInfo getInstance(Object obj) {
        ASN1TaggedObject aSN1TaggedObject;
        if (obj instanceof OriginatorInfo) {
            return (OriginatorInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OriginatorInfo originatorInfo = new OriginatorInfo();
        int size = aSN1Sequence.size();
        if (size != 0) {
            if (size == 1) {
                aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    originatorInfo.f86934p0 = ASN1Set.getInstance(aSN1TaggedObject, false);
                } else if (tagNo != 1) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag in OriginatorInfo: ")));
                }
            } else {
                if (size != 2) {
                    throw new IllegalArgumentException("OriginatorInfo too big");
                }
                originatorInfo.f86934p0 = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), false);
                aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(1);
            }
            originatorInfo.f86935q0 = ASN1Set.getInstance(aSN1TaggedObject, false);
        }
        return originatorInfo;
    }

    public ASN1Set getCRLs() {
        return this.f86935q0;
    }

    public ASN1Set getCertificates() {
        return this.f86934p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Set aSN1Set = this.f86934p0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1Set));
        }
        ASN1Set aSN1Set2 = this.f86935q0;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1Set2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static OriginatorInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
