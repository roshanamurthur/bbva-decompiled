package org.bouncycastle.asn1.crmf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PKIPublicationInfo extends ASN1Object {
    public static final ASN1Integer dontPublish = new ASN1Integer(0);
    public static final ASN1Integer pleasePublish = new ASN1Integer(1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87045p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87046q0;

    public PKIPublicationInfo(BigInteger bigInteger) {
        this(new ASN1Integer(bigInteger));
    }

    public static PKIPublicationInfo getInstance(Object obj) {
        if (obj instanceof PKIPublicationInfo) {
            return (PKIPublicationInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PKIPublicationInfo pKIPublicationInfo = new PKIPublicationInfo();
        pKIPublicationInfo.f87045p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            pKIPublicationInfo.f87046q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return pKIPublicationInfo;
    }

    public ASN1Integer getAction() {
        return this.f87045p0;
    }

    public SinglePubInfo[] getPubInfos() {
        ASN1Sequence aSN1Sequence = this.f87046q0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        SinglePubInfo[] singlePubInfoArr = new SinglePubInfo[size];
        for (int i10 = 0; i10 != size; i10++) {
            singlePubInfoArr[i10] = SinglePubInfo.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return singlePubInfoArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87045p0);
        ASN1Sequence aSN1Sequence = this.f87046q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PKIPublicationInfo(ASN1Integer aSN1Integer) {
        this.f87045p0 = aSN1Integer;
    }

    public PKIPublicationInfo(SinglePubInfo singlePubInfo) {
        this(singlePubInfo != null ? new SinglePubInfo[]{singlePubInfo} : null);
    }

    public PKIPublicationInfo(SinglePubInfo[] singlePubInfoArr) {
        this.f87045p0 = pleasePublish;
        if (singlePubInfoArr != null) {
            this.f87046q0 = new DERSequence(singlePubInfoArr);
        } else {
            this.f87046q0 = null;
        }
    }
}
