package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes12.dex */
public class RevRepContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86831p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f86832q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f86833r0;

    public static RevRepContent getInstance(Object obj) {
        if (obj instanceof RevRepContent) {
            return (RevRepContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RevRepContent revRepContent = new RevRepContent();
        Enumeration objects = aSN1Sequence.getObjects();
        revRepContent.f86831p0 = ASN1Sequence.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            if (tagNo == 0) {
                revRepContent.f86832q0 = aSN1Sequence2;
            } else {
                revRepContent.f86833r0 = aSN1Sequence2;
            }
        }
        return revRepContent;
    }

    public CertificateList[] getCrls() {
        ASN1Sequence aSN1Sequence = this.f86833r0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CertificateList[] certificateListArr = new CertificateList[size];
        for (int i10 = 0; i10 != size; i10++) {
            certificateListArr[i10] = CertificateList.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certificateListArr;
    }

    public CertId[] getRevCerts() {
        ASN1Sequence aSN1Sequence = this.f86832q0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CertId[] certIdArr = new CertId[size];
        for (int i10 = 0; i10 != size; i10++) {
            certIdArr[i10] = CertId.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certIdArr;
    }

    public PKIStatusInfo[] getStatus() {
        ASN1Sequence aSN1Sequence = this.f86831p0;
        int size = aSN1Sequence.size();
        PKIStatusInfo[] pKIStatusInfoArr = new PKIStatusInfo[size];
        for (int i10 = 0; i10 != size; i10++) {
            pKIStatusInfoArr[i10] = PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return pKIStatusInfoArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86831p0);
        ASN1Sequence aSN1Sequence = this.f86832q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Sequence));
        }
        ASN1Sequence aSN1Sequence2 = this.f86833r0;
        if (aSN1Sequence2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, aSN1Sequence2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
