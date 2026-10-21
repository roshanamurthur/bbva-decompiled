package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes12.dex */
public class POPODecKeyChallContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86816p0;

    public static POPODecKeyChallContent getInstance(Object obj) {
        if (obj instanceof POPODecKeyChallContent) {
            return (POPODecKeyChallContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        POPODecKeyChallContent pOPODecKeyChallContent = new POPODecKeyChallContent();
        pOPODecKeyChallContent.f86816p0 = aSN1Sequence;
        return pOPODecKeyChallContent;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86816p0;
    }

    public Challenge[] toChallengeArray() {
        ASN1Sequence aSN1Sequence = this.f86816p0;
        int size = aSN1Sequence.size();
        Challenge[] challengeArr = new Challenge[size];
        for (int i10 = 0; i10 != size; i10++) {
            challengeArr[i10] = Challenge.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return challengeArr;
    }
}
