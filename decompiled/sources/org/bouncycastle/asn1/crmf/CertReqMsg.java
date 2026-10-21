package org.bouncycastle.asn1.crmf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CertReqMsg extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CertRequest f87004p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ProofOfPossession f87005q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87006r0;

    public CertReqMsg(CertRequest certRequest, ProofOfPossession proofOfPossession, AttributeTypeAndValue[] attributeTypeAndValueArr) {
        if (certRequest == null) {
            throw new IllegalArgumentException("'certReq' cannot be null");
        }
        this.f87004p0 = certRequest;
        this.f87005q0 = proofOfPossession;
        if (attributeTypeAndValueArr != null) {
            this.f87006r0 = new DERSequence(attributeTypeAndValueArr);
        }
    }

    public static CertReqMsg getInstance(Object obj) {
        if (obj instanceof CertReqMsg) {
            return (CertReqMsg) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertReqMsg certReqMsg = new CertReqMsg();
        Enumeration objects = aSN1Sequence.getObjects();
        certReqMsg.f87004p0 = CertRequest.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            Object objNextElement = objects.nextElement();
            if ((objNextElement instanceof ASN1TaggedObject) || (objNextElement instanceof ProofOfPossession)) {
                certReqMsg.f87005q0 = ProofOfPossession.getInstance(objNextElement);
            } else {
                certReqMsg.f87006r0 = ASN1Sequence.getInstance(objNextElement);
            }
        }
        return certReqMsg;
    }

    public CertRequest getCertReq() {
        return this.f87004p0;
    }

    public ProofOfPossession getPop() {
        return this.f87005q0;
    }

    public ProofOfPossession getPopo() {
        return this.f87005q0;
    }

    public AttributeTypeAndValue[] getRegInfo() {
        ASN1Sequence aSN1Sequence = this.f87006r0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[size];
        for (int i10 = 0; i10 != size; i10++) {
            attributeTypeAndValueArr[i10] = AttributeTypeAndValue.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return attributeTypeAndValueArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87004p0);
        ProofOfPossession proofOfPossession = this.f87005q0;
        if (proofOfPossession != null) {
            aSN1EncodableVector.add(proofOfPossession);
        }
        ASN1Sequence aSN1Sequence = this.f87006r0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static CertReqMsg getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
