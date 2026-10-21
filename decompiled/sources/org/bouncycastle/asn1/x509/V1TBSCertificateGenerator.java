package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class V1TBSCertificateGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ASN1Integer f87724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlgorithmIdentifier f87725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X500Name f87726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Time f87727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Time f87728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X500Name f87729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SubjectPublicKeyInfo f87730g;

    public V1TBSCertificateGenerator() {
        new DERTaggedObject(true, 0, new ASN1Integer(0L));
    }

    public TBSCertificate generateTBSCertificate() {
        if (this.f87724a == null || this.f87725b == null || this.f87726c == null || this.f87727d == null || this.f87728e == null || this.f87729f == null || this.f87730g == null) {
            throw new IllegalStateException("not all mandatory fields set in V1 TBScertificate generator");
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f87724a);
        aSN1EncodableVector.add(this.f87725b);
        aSN1EncodableVector.add(this.f87726c);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
        aSN1EncodableVector2.add(this.f87727d);
        aSN1EncodableVector2.add(this.f87728e);
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(this.f87729f);
        aSN1EncodableVector.add(this.f87730g);
        return TBSCertificate.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public void setEndDate(ASN1UTCTime aSN1UTCTime) {
        this.f87728e = new Time(aSN1UTCTime);
    }

    public void setIssuer(X500Name x500Name) {
        this.f87726c = x500Name;
    }

    public void setSerialNumber(ASN1Integer aSN1Integer) {
        this.f87724a = aSN1Integer;
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.f87725b = algorithmIdentifier;
    }

    public void setStartDate(ASN1UTCTime aSN1UTCTime) {
        this.f87727d = new Time(aSN1UTCTime);
    }

    public void setSubject(X500Name x500Name) {
        this.f87729f = x500Name;
    }

    public void setSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.f87730g = subjectPublicKeyInfo;
    }

    public void setEndDate(Time time) {
        this.f87728e = time;
    }

    public void setIssuer(X509Name x509Name) {
        this.f87726c = X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setStartDate(Time time) {
        this.f87727d = time;
    }

    public void setSubject(X509Name x509Name) {
        this.f87729f = X500Name.getInstance(x509Name.toASN1Primitive());
    }
}
