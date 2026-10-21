package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PollRepContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer[] f86818p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer[] f86819q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PKIFreeText[] f86820r0;

    public PollRepContent(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2) {
        this(aSN1Integer, aSN1Integer2, null);
    }

    public static PollRepContent getInstance(Object obj) {
        if (obj instanceof PollRepContent) {
            return (PollRepContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PollRepContent pollRepContent = new PollRepContent();
        pollRepContent.f86818p0 = new ASN1Integer[aSN1Sequence.size()];
        pollRepContent.f86819q0 = new ASN1Integer[aSN1Sequence.size()];
        pollRepContent.f86820r0 = new PKIFreeText[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i10));
            pollRepContent.f86818p0[i10] = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0));
            pollRepContent.f86819q0[i10] = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1));
            if (aSN1Sequence2.size() > 2) {
                pollRepContent.f86820r0[i10] = PKIFreeText.getInstance(aSN1Sequence2.getObjectAt(2));
            }
        }
        return pollRepContent;
    }

    public ASN1Integer getCertReqId(int i10) {
        return this.f86818p0[i10];
    }

    public ASN1Integer getCheckAfter(int i10) {
        return this.f86819q0[i10];
    }

    public PKIFreeText getReason(int i10) {
        return this.f86820r0[i10];
    }

    public int size() {
        return this.f86818p0.length;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Integer[] aSN1IntegerArr = this.f86818p0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(aSN1IntegerArr.length);
        for (int i10 = 0; i10 != aSN1IntegerArr.length; i10++) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(aSN1IntegerArr[i10]);
            aSN1EncodableVector2.add(this.f86819q0[i10]);
            PKIFreeText pKIFreeText = this.f86820r0[i10];
            if (pKIFreeText != null) {
                aSN1EncodableVector2.add(pKIFreeText);
            }
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PollRepContent(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, PKIFreeText pKIFreeText) {
        this.f86818p0 = new ASN1Integer[]{aSN1Integer};
        this.f86819q0 = new ASN1Integer[]{aSN1Integer2};
        this.f86820r0 = new PKIFreeText[]{pKIFreeText};
    }
}
