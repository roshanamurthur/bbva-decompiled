package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class SCVPReqRes extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ContentInfo f86957p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ContentInfo f86958q0;

    public SCVPReqRes(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.f86957p0 = ContentInfo.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(0)), true);
            objectAt = aSN1Sequence.getObjectAt(1);
        } else {
            this.f86957p0 = null;
            objectAt = aSN1Sequence.getObjectAt(0);
        }
        this.f86958q0 = ContentInfo.getInstance(objectAt);
    }

    public static SCVPReqRes getInstance(Object obj) {
        if (obj instanceof SCVPReqRes) {
            return (SCVPReqRes) obj;
        }
        if (obj != null) {
            return new SCVPReqRes(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ContentInfo getRequest() {
        return this.f86957p0;
    }

    public ContentInfo getResponse() {
        return this.f86958q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ContentInfo contentInfo = this.f86957p0;
        if (contentInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, contentInfo));
        }
        aSN1EncodableVector.add(this.f86958q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public SCVPReqRes(ContentInfo contentInfo) {
        this.f86957p0 = null;
        this.f86958q0 = contentInfo;
    }

    public SCVPReqRes(ContentInfo contentInfo, ContentInfo contentInfo2) {
        this.f86957p0 = contentInfo;
        this.f86958q0 = contentInfo2;
    }
}
