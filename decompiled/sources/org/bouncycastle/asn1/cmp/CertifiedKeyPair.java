package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.crmf.PKIPublicationInfo;

/* JADX INFO: loaded from: classes12.dex */
public class CertifiedKeyPair extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CertOrEncCert f86758p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public EncryptedValue f86759q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PKIPublicationInfo f86760r0;

    public CertifiedKeyPair(CertOrEncCert certOrEncCert) {
        this(certOrEncCert, null, null);
    }

    public static CertifiedKeyPair getInstance(Object obj) {
        ASN1Primitive object;
        if (obj instanceof CertifiedKeyPair) {
            return (CertifiedKeyPair) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertifiedKeyPair certifiedKeyPair = new CertifiedKeyPair();
        certifiedKeyPair.f86758p0 = CertOrEncCert.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() >= 2) {
            if (aSN1Sequence.size() == 2) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
                int tagNo = aSN1TaggedObject.getTagNo();
                object = aSN1TaggedObject.getObject();
                if (tagNo == 0) {
                    certifiedKeyPair.f86759q0 = EncryptedValue.getInstance(object);
                }
            } else {
                certifiedKeyPair.f86759q0 = EncryptedValue.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject());
                object = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)).getObject();
            }
            certifiedKeyPair.f86760r0 = PKIPublicationInfo.getInstance(object);
        }
        return certifiedKeyPair;
    }

    public CertOrEncCert getCertOrEncCert() {
        return this.f86758p0;
    }

    public EncryptedValue getPrivateKey() {
        return this.f86759q0;
    }

    public PKIPublicationInfo getPublicationInfo() {
        return this.f86760r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86758p0);
        EncryptedValue encryptedValue = this.f86759q0;
        if (encryptedValue != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, encryptedValue));
        }
        PKIPublicationInfo pKIPublicationInfo = this.f86760r0;
        if (pKIPublicationInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, pKIPublicationInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertifiedKeyPair(CertOrEncCert certOrEncCert, EncryptedValue encryptedValue, PKIPublicationInfo pKIPublicationInfo) {
        if (certOrEncCert == null) {
            throw new IllegalArgumentException("'certOrEncCert' cannot be null");
        }
        this.f86758p0 = certOrEncCert;
        this.f86759q0 = encryptedValue;
        this.f86760r0 = pKIPublicationInfo;
    }
}
