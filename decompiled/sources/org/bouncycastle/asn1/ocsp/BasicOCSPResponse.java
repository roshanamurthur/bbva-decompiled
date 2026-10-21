package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class BasicOCSPResponse extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ResponseData f87326p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f87327q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERBitString f87328r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Sequence f87329s0;

    public BasicOCSPResponse(ResponseData responseData, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString, ASN1Sequence aSN1Sequence) {
        this.f87326p0 = responseData;
        this.f87327q0 = algorithmIdentifier;
        this.f87328r0 = dERBitString;
        this.f87329s0 = aSN1Sequence;
    }

    public static BasicOCSPResponse getInstance(Object obj) {
        if (obj instanceof BasicOCSPResponse) {
            return (BasicOCSPResponse) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        BasicOCSPResponse basicOCSPResponse = new BasicOCSPResponse();
        basicOCSPResponse.f87326p0 = ResponseData.getInstance(aSN1Sequence.getObjectAt(0));
        basicOCSPResponse.f87327q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        basicOCSPResponse.f87328r0 = (DERBitString) aSN1Sequence.getObjectAt(2);
        if (aSN1Sequence.size() > 3) {
            basicOCSPResponse.f87329s0 = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(3), true);
        }
        return basicOCSPResponse;
    }

    public ASN1Sequence getCerts() {
        return this.f87329s0;
    }

    public DERBitString getSignature() {
        return this.f87328r0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f87327q0;
    }

    public ResponseData getTbsResponseData() {
        return this.f87326p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f87326p0);
        aSN1EncodableVector.add(this.f87327q0);
        aSN1EncodableVector.add(this.f87328r0);
        ASN1Sequence aSN1Sequence = this.f87329s0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Sequence));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static BasicOCSPResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
