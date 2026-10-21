package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes12.dex */
public class CertConfirmContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86746p0;

    public static CertConfirmContent getInstance(Object obj) {
        if (obj instanceof CertConfirmContent) {
            return (CertConfirmContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertConfirmContent certConfirmContent = new CertConfirmContent();
        certConfirmContent.f86746p0 = aSN1Sequence;
        return certConfirmContent;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86746p0;
    }

    public CertStatus[] toCertStatusArray() {
        ASN1Sequence aSN1Sequence = this.f86746p0;
        int size = aSN1Sequence.size();
        CertStatus[] certStatusArr = new CertStatus[size];
        for (int i10 = 0; i10 != size; i10++) {
            certStatusArr[i10] = CertStatus.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certStatusArr;
    }
}
