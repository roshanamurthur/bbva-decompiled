package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes12.dex */
public class POPODecKeyRespContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86817p0;

    public static POPODecKeyRespContent getInstance(Object obj) {
        if (obj instanceof POPODecKeyRespContent) {
            return (POPODecKeyRespContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        POPODecKeyRespContent pOPODecKeyRespContent = new POPODecKeyRespContent();
        pOPODecKeyRespContent.f86817p0 = aSN1Sequence;
        return pOPODecKeyRespContent;
    }

    public ASN1Integer[] toASN1IntegerArray() {
        ASN1Sequence aSN1Sequence = this.f86817p0;
        int size = aSN1Sequence.size();
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[size];
        for (int i10 = 0; i10 != size; i10++) {
            aSN1IntegerArr[i10] = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return aSN1IntegerArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86817p0;
    }
}
