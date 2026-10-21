package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertTemplate;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class RevDetails extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CertTemplate f86829p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Extensions f86830q0;

    public RevDetails(CertTemplate certTemplate) {
        this.f86829p0 = certTemplate;
    }

    public static RevDetails getInstance(Object obj) {
        if (obj instanceof RevDetails) {
            return (RevDetails) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RevDetails revDetails = new RevDetails();
        revDetails.f86829p0 = CertTemplate.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            revDetails.f86830q0 = Extensions.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return revDetails;
    }

    public CertTemplate getCertDetails() {
        return this.f86829p0;
    }

    public Extensions getCrlEntryDetails() {
        return this.f86830q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86829p0);
        Extensions extensions = this.f86830q0;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public RevDetails(CertTemplate certTemplate, Extensions extensions) {
        this.f86829p0 = certTemplate;
        this.f86830q0 = extensions;
    }

    public RevDetails(CertTemplate certTemplate, X509Extensions x509Extensions) {
        this.f86829p0 = certTemplate;
        this.f86830q0 = Extensions.getInstance(x509Extensions.toASN1Primitive());
    }
}
