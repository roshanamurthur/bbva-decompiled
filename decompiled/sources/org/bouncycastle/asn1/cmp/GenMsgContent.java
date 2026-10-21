package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class GenMsgContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86767p0;

    public GenMsgContent(InfoTypeAndValue infoTypeAndValue) {
        this.f86767p0 = new DERSequence(infoTypeAndValue);
    }

    public static GenMsgContent getInstance(Object obj) {
        if (obj instanceof GenMsgContent) {
            return (GenMsgContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        GenMsgContent genMsgContent = new GenMsgContent();
        genMsgContent.f86767p0 = aSN1Sequence;
        return genMsgContent;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86767p0;
    }

    public InfoTypeAndValue[] toInfoTypeAndValueArray() {
        ASN1Sequence aSN1Sequence = this.f86767p0;
        int size = aSN1Sequence.size();
        InfoTypeAndValue[] infoTypeAndValueArr = new InfoTypeAndValue[size];
        for (int i10 = 0; i10 != size; i10++) {
            infoTypeAndValueArr[i10] = InfoTypeAndValue.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return infoTypeAndValueArr;
    }

    public GenMsgContent(InfoTypeAndValue[] infoTypeAndValueArr) {
        this.f86767p0 = new DERSequence(infoTypeAndValueArr);
    }
}
