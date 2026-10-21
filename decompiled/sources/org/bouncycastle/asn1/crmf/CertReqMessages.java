package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CertReqMessages extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87003p0;

    public CertReqMessages(CertReqMsg certReqMsg) {
        this.f87003p0 = new DERSequence(certReqMsg);
    }

    public static CertReqMessages getInstance(Object obj) {
        if (obj instanceof CertReqMessages) {
            return (CertReqMessages) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertReqMessages certReqMessages = new CertReqMessages();
        certReqMessages.f87003p0 = aSN1Sequence;
        return certReqMessages;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87003p0;
    }

    public CertReqMsg[] toCertReqMsgArray() {
        ASN1Sequence aSN1Sequence = this.f87003p0;
        int size = aSN1Sequence.size();
        CertReqMsg[] certReqMsgArr = new CertReqMsg[size];
        for (int i10 = 0; i10 != size; i10++) {
            certReqMsgArr[i10] = CertReqMsg.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certReqMsgArr;
    }

    public CertReqMessages(CertReqMsg[] certReqMsgArr) {
        this.f87003p0 = new DERSequence(certReqMsgArr);
    }
}
