package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class OCSPResponse extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OCSPResponseStatus f87341p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ResponseBytes f87342q0;

    public OCSPResponse(OCSPResponseStatus oCSPResponseStatus, ResponseBytes responseBytes) {
        this.f87341p0 = oCSPResponseStatus;
        this.f87342q0 = responseBytes;
    }

    public static OCSPResponse getInstance(Object obj) {
        if (obj instanceof OCSPResponse) {
            return (OCSPResponse) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OCSPResponse oCSPResponse = new OCSPResponse();
        oCSPResponse.f87341p0 = OCSPResponseStatus.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            oCSPResponse.f87342q0 = ResponseBytes.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
        return oCSPResponse;
    }

    public ResponseBytes getResponseBytes() {
        return this.f87342q0;
    }

    public OCSPResponseStatus getResponseStatus() {
        return this.f87341p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87341p0);
        ResponseBytes responseBytes = this.f87342q0;
        if (responseBytes != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, responseBytes));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static OCSPResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
