package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class CertRepMessage extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86749p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f86750q0;

    public CertRepMessage(CMPCertificate[] cMPCertificateArr, CertResponse[] certResponseArr) {
        if (certResponseArr == null) {
            throw new IllegalArgumentException("'response' cannot be null");
        }
        if (cMPCertificateArr != null) {
            this.f86749p0 = new DERSequence(cMPCertificateArr);
        }
        this.f86750q0 = new DERSequence(certResponseArr);
    }

    public static CertRepMessage getInstance(Object obj) {
        if (obj instanceof CertRepMessage) {
            return (CertRepMessage) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertRepMessage certRepMessage = new CertRepMessage();
        int i10 = 0;
        if (aSN1Sequence.size() > 1) {
            certRepMessage.f86749p0 = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i10 = 1;
        }
        certRepMessage.f86750q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i10));
        return certRepMessage;
    }

    public CMPCertificate[] getCaPubs() {
        ASN1Sequence aSN1Sequence = this.f86749p0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i10 = 0; i10 != size; i10++) {
            cMPCertificateArr[i10] = CMPCertificate.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return cMPCertificateArr;
    }

    public CertResponse[] getResponse() {
        ASN1Sequence aSN1Sequence = this.f86750q0;
        int size = aSN1Sequence.size();
        CertResponse[] certResponseArr = new CertResponse[size];
        for (int i10 = 0; i10 != size; i10++) {
            certResponseArr[i10] = CertResponse.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certResponseArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Sequence aSN1Sequence = this.f86749p0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, aSN1Sequence));
        }
        aSN1EncodableVector.add(this.f86750q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
