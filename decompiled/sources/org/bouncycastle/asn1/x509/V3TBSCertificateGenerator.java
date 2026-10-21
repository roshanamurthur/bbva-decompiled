package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class V3TBSCertificateGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DERTaggedObject f87752a = new DERTaggedObject(true, 0, new ASN1Integer(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1Integer f87753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlgorithmIdentifier f87754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X500Name f87755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Time f87756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Time f87757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X500Name f87758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SubjectPublicKeyInfo f87759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Extensions f87760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f87761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DERBitString f87762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DERBitString f87763l;

    public TBSCertificate generateTBSCertificate() {
        if (this.f87753b == null || this.f87754c == null || this.f87755d == null || this.f87756e == null || this.f87757f == null || ((this.f87758g == null && !this.f87761j) || this.f87759h == null)) {
            throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        aSN1EncodableVector.add(this.f87752a);
        aSN1EncodableVector.add(this.f87753b);
        aSN1EncodableVector.add(this.f87754c);
        aSN1EncodableVector.add(this.f87755d);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
        aSN1EncodableVector2.add(this.f87756e);
        aSN1EncodableVector2.add(this.f87757f);
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        ASN1Encodable dERSequence = this.f87758g;
        if (dERSequence == null) {
            dERSequence = new DERSequence();
        }
        aSN1EncodableVector.add(dERSequence);
        aSN1EncodableVector.add(this.f87759h);
        DERBitString dERBitString = this.f87762k;
        if (dERBitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, dERBitString));
        }
        DERBitString dERBitString2 = this.f87763l;
        if (dERBitString2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, dERBitString2));
        }
        Extensions extensions = this.f87760i;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, extensions));
        }
        return TBSCertificate.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public void setEndDate(ASN1UTCTime aSN1UTCTime) {
        this.f87757f = new Time(aSN1UTCTime);
    }

    public void setExtensions(Extensions extensions) {
        Extension extension;
        this.f87760i = extensions;
        if (extensions == null || (extension = extensions.getExtension(Extension.subjectAlternativeName)) == null || !extension.isCritical()) {
            return;
        }
        this.f87761j = true;
    }

    public void setIssuer(X500Name x500Name) {
        this.f87755d = x500Name;
    }

    public void setIssuerUniqueID(DERBitString dERBitString) {
        this.f87762k = dERBitString;
    }

    public void setSerialNumber(ASN1Integer aSN1Integer) {
        this.f87753b = aSN1Integer;
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.f87754c = algorithmIdentifier;
    }

    public void setStartDate(ASN1UTCTime aSN1UTCTime) {
        this.f87756e = new Time(aSN1UTCTime);
    }

    public void setSubject(X500Name x500Name) {
        this.f87758g = x500Name;
    }

    public void setSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.f87759h = subjectPublicKeyInfo;
    }

    public void setSubjectUniqueID(DERBitString dERBitString) {
        this.f87763l = dERBitString;
    }

    public void setEndDate(Time time) {
        this.f87757f = time;
    }

    public void setExtensions(X509Extensions x509Extensions) {
        setExtensions(Extensions.getInstance(x509Extensions));
    }

    public void setIssuer(X509Name x509Name) {
        this.f87755d = X500Name.getInstance(x509Name);
    }

    public void setStartDate(Time time) {
        this.f87756e = time;
    }

    public void setSubject(X509Name x509Name) {
        this.f87758g = X500Name.getInstance(x509Name.toASN1Primitive());
    }
}
