package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CAKeyUpdAnnContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CMPCertificate f86739p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CMPCertificate f86740q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CMPCertificate f86741r0;

    public CAKeyUpdAnnContent(CMPCertificate cMPCertificate, CMPCertificate cMPCertificate2, CMPCertificate cMPCertificate3) {
        this.f86739p0 = cMPCertificate;
        this.f86740q0 = cMPCertificate2;
        this.f86741r0 = cMPCertificate3;
    }

    public static CAKeyUpdAnnContent getInstance(Object obj) {
        if (obj instanceof CAKeyUpdAnnContent) {
            return (CAKeyUpdAnnContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CAKeyUpdAnnContent cAKeyUpdAnnContent = new CAKeyUpdAnnContent();
        cAKeyUpdAnnContent.f86739p0 = CMPCertificate.getInstance(aSN1Sequence.getObjectAt(0));
        cAKeyUpdAnnContent.f86740q0 = CMPCertificate.getInstance(aSN1Sequence.getObjectAt(1));
        cAKeyUpdAnnContent.f86741r0 = CMPCertificate.getInstance(aSN1Sequence.getObjectAt(2));
        return cAKeyUpdAnnContent;
    }

    public CMPCertificate getNewWithNew() {
        return this.f86741r0;
    }

    public CMPCertificate getNewWithOld() {
        return this.f86740q0;
    }

    public CMPCertificate getOldWithNew() {
        return this.f86739p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86739p0);
        aSN1EncodableVector.add(this.f86740q0);
        aSN1EncodableVector.add(this.f86741r0);
        return new DERSequence(aSN1EncodableVector);
    }
}
