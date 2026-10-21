package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class OCSPRequest extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TBSRequest f87339p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Signature f87340q0;

    public OCSPRequest(TBSRequest tBSRequest, Signature signature) {
        this.f87339p0 = tBSRequest;
        this.f87340q0 = signature;
    }

    public static OCSPRequest getInstance(Object obj) {
        if (obj instanceof OCSPRequest) {
            return (OCSPRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OCSPRequest oCSPRequest = new OCSPRequest();
        oCSPRequest.f87339p0 = TBSRequest.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            oCSPRequest.f87340q0 = Signature.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
        return oCSPRequest;
    }

    public Signature getOptionalSignature() {
        return this.f87340q0;
    }

    public TBSRequest getTbsRequest() {
        return this.f87339p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87339p0);
        Signature signature = this.f87340q0;
        if (signature != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, signature));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static OCSPRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
