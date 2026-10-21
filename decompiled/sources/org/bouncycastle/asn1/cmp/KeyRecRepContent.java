package org.bouncycastle.asn1.cmp;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class KeyRecRepContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PKIStatusInfo f86771p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CMPCertificate f86772q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f86773r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Sequence f86774s0;

    public static KeyRecRepContent getInstance(Object obj) {
        if (obj instanceof KeyRecRepContent) {
            return (KeyRecRepContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        KeyRecRepContent keyRecRepContent = new KeyRecRepContent();
        Enumeration objects = aSN1Sequence.getObjects();
        keyRecRepContent.f86771p0 = PKIStatusInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                keyRecRepContent.f86772q0 = CMPCertificate.getInstance(aSN1TaggedObject.getObject());
            } else if (tagNo == 1) {
                keyRecRepContent.f86773r0 = ASN1Sequence.getInstance(aSN1TaggedObject.getObject());
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag number: ")));
                }
                keyRecRepContent.f86774s0 = ASN1Sequence.getInstance(aSN1TaggedObject.getObject());
            }
        }
        return keyRecRepContent;
    }

    public CMPCertificate[] getCaCerts() {
        ASN1Sequence aSN1Sequence = this.f86773r0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i10 = 0; i10 != size; i10++) {
            cMPCertificateArr[i10] = CMPCertificate.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return cMPCertificateArr;
    }

    public CertifiedKeyPair[] getKeyPairHist() {
        ASN1Sequence aSN1Sequence = this.f86774s0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CertifiedKeyPair[] certifiedKeyPairArr = new CertifiedKeyPair[size];
        for (int i10 = 0; i10 != size; i10++) {
            certifiedKeyPairArr[i10] = CertifiedKeyPair.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certifiedKeyPairArr;
    }

    public CMPCertificate getNewSigCert() {
        return this.f86772q0;
    }

    public PKIStatusInfo getStatus() {
        return this.f86771p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86771p0);
        CMPCertificate cMPCertificate = this.f86772q0;
        if (cMPCertificate != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, cMPCertificate));
        }
        ASN1Sequence aSN1Sequence = this.f86773r0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, aSN1Sequence));
        }
        ASN1Sequence aSN1Sequence2 = this.f86774s0;
        if (aSN1Sequence2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, aSN1Sequence2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
