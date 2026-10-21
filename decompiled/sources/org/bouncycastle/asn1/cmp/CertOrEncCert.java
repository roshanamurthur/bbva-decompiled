package org.bouncycastle.asn1.cmp;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedValue;

/* JADX INFO: loaded from: classes12.dex */
public class CertOrEncCert extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CMPCertificate f86747p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public EncryptedValue f86748q0;

    public CertOrEncCert(CMPCertificate cMPCertificate) {
        if (cMPCertificate == null) {
            throw new IllegalArgumentException("'certificate' cannot be null");
        }
        this.f86747p0 = cMPCertificate;
    }

    public static CertOrEncCert getInstance(Object obj) {
        if (obj instanceof CertOrEncCert) {
            return (CertOrEncCert) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            return null;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        CertOrEncCert certOrEncCert = new CertOrEncCert();
        if (aSN1TaggedObject.getTagNo() == 0) {
            certOrEncCert.f86747p0 = CMPCertificate.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (aSN1TaggedObject.getTagNo() != 1) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag: ")));
            }
            certOrEncCert.f86748q0 = EncryptedValue.getInstance(aSN1TaggedObject.getObject());
        }
        return certOrEncCert;
    }

    public CMPCertificate getCertificate() {
        return this.f86747p0;
    }

    public EncryptedValue getEncryptedCert() {
        return this.f86748q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        CMPCertificate cMPCertificate = this.f86747p0;
        return cMPCertificate != null ? new DERTaggedObject(true, 0, cMPCertificate) : new DERTaggedObject(true, 1, this.f86748q0);
    }

    public CertOrEncCert(EncryptedValue encryptedValue) {
        if (encryptedValue == null) {
            throw new IllegalArgumentException("'encryptedCert' cannot be null");
        }
        this.f86748q0 = encryptedValue;
    }
}
