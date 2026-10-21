package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class RevReqContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86837p0;

    public RevReqContent(RevDetails revDetails) {
        this.f86837p0 = new DERSequence(revDetails);
    }

    public static RevReqContent getInstance(Object obj) {
        if (obj instanceof RevReqContent) {
            return (RevReqContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RevReqContent revReqContent = new RevReqContent();
        revReqContent.f86837p0 = aSN1Sequence;
        return revReqContent;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86837p0;
    }

    public RevDetails[] toRevDetailsArray() {
        ASN1Sequence aSN1Sequence = this.f86837p0;
        int size = aSN1Sequence.size();
        RevDetails[] revDetailsArr = new RevDetails[size];
        for (int i10 = 0; i10 != size; i10++) {
            revDetailsArr[i10] = RevDetails.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return revDetailsArr;
    }

    public RevReqContent(RevDetails[] revDetailsArr) {
        this.f86837p0 = new DERSequence(revDetailsArr);
    }
}
