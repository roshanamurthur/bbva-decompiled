package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class CertTemplateBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ASN1Integer f87019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1Integer f87020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlgorithmIdentifier f87021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X500Name f87022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OptionalValidity f87023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X500Name f87024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SubjectPublicKeyInfo f87025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DERBitString f87026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DERBitString f87027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Extensions f87028j;

    public static void a(ASN1EncodableVector aSN1EncodableVector, int i10, boolean z10, ASN1Object aSN1Object) {
        if (aSN1Object != null) {
            aSN1EncodableVector.add(new DERTaggedObject(z10, i10, aSN1Object));
        }
    }

    public CertTemplate build() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        a(aSN1EncodableVector, 0, false, this.f87019a);
        a(aSN1EncodableVector, 1, false, this.f87020b);
        a(aSN1EncodableVector, 2, false, this.f87021c);
        a(aSN1EncodableVector, 3, true, this.f87022d);
        a(aSN1EncodableVector, 4, false, this.f87023e);
        a(aSN1EncodableVector, 5, true, this.f87024f);
        a(aSN1EncodableVector, 6, false, this.f87025g);
        a(aSN1EncodableVector, 7, false, this.f87026h);
        a(aSN1EncodableVector, 8, false, this.f87027i);
        a(aSN1EncodableVector, 9, false, this.f87028j);
        return CertTemplate.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public CertTemplateBuilder setExtensions(Extensions extensions) {
        this.f87028j = extensions;
        return this;
    }

    public CertTemplateBuilder setIssuer(X500Name x500Name) {
        this.f87022d = x500Name;
        return this;
    }

    public CertTemplateBuilder setIssuerUID(DERBitString dERBitString) {
        this.f87026h = dERBitString;
        return this;
    }

    public CertTemplateBuilder setPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.f87025g = subjectPublicKeyInfo;
        return this;
    }

    public CertTemplateBuilder setSerialNumber(ASN1Integer aSN1Integer) {
        this.f87020b = aSN1Integer;
        return this;
    }

    public CertTemplateBuilder setSigningAlg(AlgorithmIdentifier algorithmIdentifier) {
        this.f87021c = algorithmIdentifier;
        return this;
    }

    public CertTemplateBuilder setSubject(X500Name x500Name) {
        this.f87024f = x500Name;
        return this;
    }

    public CertTemplateBuilder setSubjectUID(DERBitString dERBitString) {
        this.f87027i = dERBitString;
        return this;
    }

    public CertTemplateBuilder setValidity(OptionalValidity optionalValidity) {
        this.f87023e = optionalValidity;
        return this;
    }

    public CertTemplateBuilder setVersion(int i10) {
        this.f87019a = new ASN1Integer(i10);
        return this;
    }

    public CertTemplateBuilder setExtensions(X509Extensions x509Extensions) {
        return setExtensions(Extensions.getInstance(x509Extensions));
    }
}
