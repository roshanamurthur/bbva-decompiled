package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes12.dex */
public class RevRepContentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1EncodableVector f86834a = new ASN1EncodableVector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ASN1EncodableVector f86835b = new ASN1EncodableVector();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ASN1EncodableVector f86836c = new ASN1EncodableVector();

    public RevRepContentBuilder add(PKIStatusInfo pKIStatusInfo) {
        this.f86834a.add(pKIStatusInfo);
        return this;
    }

    public RevRepContentBuilder addCrl(CertificateList certificateList) {
        this.f86836c.add(certificateList);
        return this;
    }

    public RevRepContent build() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(new DERSequence(this.f86834a));
        ASN1EncodableVector aSN1EncodableVector2 = this.f86835b;
        if (aSN1EncodableVector2.size() != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new DERSequence(aSN1EncodableVector2)));
        }
        ASN1EncodableVector aSN1EncodableVector3 = this.f86836c;
        if (aSN1EncodableVector3.size() != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, new DERSequence(aSN1EncodableVector3)));
        }
        return RevRepContent.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public RevRepContentBuilder add(PKIStatusInfo pKIStatusInfo, CertId certId) {
        ASN1EncodableVector aSN1EncodableVector = this.f86834a;
        int size = aSN1EncodableVector.size();
        ASN1EncodableVector aSN1EncodableVector2 = this.f86835b;
        if (size != aSN1EncodableVector2.size()) {
            throw new IllegalStateException("status and revCerts sequence must be in common order");
        }
        aSN1EncodableVector.add(pKIStatusInfo);
        aSN1EncodableVector2.add(certId);
        return this;
    }
}
