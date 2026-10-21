package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PKIData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TaggedAttribute[] f86709p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TaggedRequest[] f86710q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TaggedContentInfo[] f86711r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final OtherMsg[] f86712s0;

    public PKIData(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException("Sequence not 4 elements.");
        }
        int i10 = 0;
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        this.f86709p0 = new TaggedAttribute[aSN1Sequence2.size()];
        int i11 = 0;
        while (true) {
            TaggedAttribute[] taggedAttributeArr = this.f86709p0;
            if (i11 >= taggedAttributeArr.length) {
                break;
            }
            taggedAttributeArr[i11] = TaggedAttribute.getInstance(aSN1Sequence2.getObjectAt(i11));
            i11++;
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        this.f86710q0 = new TaggedRequest[aSN1Sequence3.size()];
        int i12 = 0;
        while (true) {
            TaggedRequest[] taggedRequestArr = this.f86710q0;
            if (i12 >= taggedRequestArr.length) {
                break;
            }
            taggedRequestArr[i12] = TaggedRequest.getInstance(aSN1Sequence3.getObjectAt(i12));
            i12++;
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        this.f86711r0 = new TaggedContentInfo[aSN1Sequence4.size()];
        int i13 = 0;
        while (true) {
            TaggedContentInfo[] taggedContentInfoArr = this.f86711r0;
            if (i13 >= taggedContentInfoArr.length) {
                break;
            }
            taggedContentInfoArr[i13] = TaggedContentInfo.getInstance(aSN1Sequence4.getObjectAt(i13));
            i13++;
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.f86712s0 = new OtherMsg[aSN1Sequence5.size()];
        while (true) {
            OtherMsg[] otherMsgArr = this.f86712s0;
            if (i10 >= otherMsgArr.length) {
                return;
            }
            otherMsgArr[i10] = OtherMsg.getInstance(aSN1Sequence5.getObjectAt(i10));
            i10++;
        }
    }

    public static PKIData getInstance(Object obj) {
        if (obj instanceof PKIData) {
            return (PKIData) obj;
        }
        if (obj != null) {
            return new PKIData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TaggedContentInfo[] getCmsSequence() {
        TaggedContentInfo[] taggedContentInfoArr = this.f86711r0;
        int length = taggedContentInfoArr.length;
        TaggedContentInfo[] taggedContentInfoArr2 = new TaggedContentInfo[length];
        System.arraycopy(taggedContentInfoArr, 0, taggedContentInfoArr2, 0, length);
        return taggedContentInfoArr2;
    }

    public TaggedAttribute[] getControlSequence() {
        TaggedAttribute[] taggedAttributeArr = this.f86709p0;
        int length = taggedAttributeArr.length;
        TaggedAttribute[] taggedAttributeArr2 = new TaggedAttribute[length];
        System.arraycopy(taggedAttributeArr, 0, taggedAttributeArr2, 0, length);
        return taggedAttributeArr2;
    }

    public OtherMsg[] getOtherMsgSequence() {
        OtherMsg[] otherMsgArr = this.f86712s0;
        int length = otherMsgArr.length;
        OtherMsg[] otherMsgArr2 = new OtherMsg[length];
        System.arraycopy(otherMsgArr, 0, otherMsgArr2, 0, length);
        return otherMsgArr2;
    }

    public TaggedRequest[] getReqSequence() {
        TaggedRequest[] taggedRequestArr = this.f86710q0;
        int length = taggedRequestArr.length;
        TaggedRequest[] taggedRequestArr2 = new TaggedRequest[length];
        System.arraycopy(taggedRequestArr, 0, taggedRequestArr2, 0, length);
        return taggedRequestArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{new DERSequence(this.f86709p0), new DERSequence(this.f86710q0), new DERSequence(this.f86711r0), new DERSequence(this.f86712s0)});
    }

    public PKIData(TaggedAttribute[] taggedAttributeArr, TaggedRequest[] taggedRequestArr, TaggedContentInfo[] taggedContentInfoArr, OtherMsg[] otherMsgArr) {
        int length = taggedAttributeArr.length;
        TaggedAttribute[] taggedAttributeArr2 = new TaggedAttribute[length];
        System.arraycopy(taggedAttributeArr, 0, taggedAttributeArr2, 0, length);
        this.f86709p0 = taggedAttributeArr2;
        int length2 = taggedRequestArr.length;
        TaggedRequest[] taggedRequestArr2 = new TaggedRequest[length2];
        System.arraycopy(taggedRequestArr, 0, taggedRequestArr2, 0, length2);
        this.f86710q0 = taggedRequestArr2;
        int length3 = taggedContentInfoArr.length;
        TaggedContentInfo[] taggedContentInfoArr2 = new TaggedContentInfo[length3];
        System.arraycopy(taggedContentInfoArr, 0, taggedContentInfoArr2, 0, length3);
        this.f86711r0 = taggedContentInfoArr2;
        int length4 = otherMsgArr.length;
        OtherMsg[] otherMsgArr2 = new OtherMsg[length4];
        System.arraycopy(otherMsgArr, 0, otherMsgArr2, 0, length4);
        this.f86712s0 = otherMsgArr2;
    }
}
