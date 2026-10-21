package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes12.dex */
public class CRLAnnContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86745p0;

    public CRLAnnContent(CertificateList certificateList) {
        this.f86745p0 = new DERSequence(certificateList);
    }

    public static CRLAnnContent getInstance(Object obj) {
        if (obj instanceof CRLAnnContent) {
            return (CRLAnnContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CRLAnnContent cRLAnnContent = new CRLAnnContent();
        cRLAnnContent.f86745p0 = aSN1Sequence;
        return cRLAnnContent;
    }

    public CertificateList[] getCertificateLists() {
        ASN1Sequence aSN1Sequence = this.f86745p0;
        int size = aSN1Sequence.size();
        CertificateList[] certificateListArr = new CertificateList[size];
        for (int i10 = 0; i10 != size; i10++) {
            certificateListArr[i10] = CertificateList.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certificateListArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86745p0;
    }
}
