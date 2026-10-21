package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;

/* JADX INFO: loaded from: classes12.dex */
public class V2AttributeCertificateInfoGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Holder f87732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AttCertIssuer f87733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlgorithmIdentifier f87734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ASN1Integer f87735e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DERBitString f87737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Extensions f87738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ASN1GeneralizedTime f87739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ASN1GeneralizedTime f87740j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1Integer f87731a = new ASN1Integer(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ASN1EncodableVector f87736f = new ASN1EncodableVector();

    public void addAttribute(String str, ASN1Encodable aSN1Encodable) {
        this.f87736f.add(new Attribute(new ASN1ObjectIdentifier(str), new DERSet(aSN1Encodable)));
    }

    public AttributeCertificateInfo generateAttributeCertificateInfo() {
        ASN1EncodableVector aSN1EncodableVector;
        if (this.f87735e == null || this.f87734d == null || this.f87733c == null || this.f87739i == null || this.f87740j == null || this.f87732b == null || (aSN1EncodableVector = this.f87736f) == null) {
            throw new IllegalStateException("not all mandatory fields set in V2 AttributeCertificateInfo generator");
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(9);
        aSN1EncodableVector2.add(this.f87731a);
        aSN1EncodableVector2.add(this.f87732b);
        aSN1EncodableVector2.add(this.f87733c);
        aSN1EncodableVector2.add(this.f87734d);
        aSN1EncodableVector2.add(this.f87735e);
        aSN1EncodableVector2.add(new AttCertValidityPeriod(this.f87739i, this.f87740j));
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        DERBitString dERBitString = this.f87737g;
        if (dERBitString != null) {
            aSN1EncodableVector2.add(dERBitString);
        }
        Extensions extensions = this.f87738h;
        if (extensions != null) {
            aSN1EncodableVector2.add(extensions);
        }
        return AttributeCertificateInfo.getInstance(new DERSequence(aSN1EncodableVector2));
    }

    public void setEndDate(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f87740j = aSN1GeneralizedTime;
    }

    public void setExtensions(Extensions extensions) {
        this.f87738h = extensions;
    }

    public void setHolder(Holder holder) {
        this.f87732b = holder;
    }

    public void setIssuer(AttCertIssuer attCertIssuer) {
        this.f87733c = attCertIssuer;
    }

    public void setIssuerUniqueID(DERBitString dERBitString) {
        this.f87737g = dERBitString;
    }

    public void setSerialNumber(ASN1Integer aSN1Integer) {
        this.f87735e = aSN1Integer;
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.f87734d = algorithmIdentifier;
    }

    public void setStartDate(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f87739i = aSN1GeneralizedTime;
    }

    public void addAttribute(Attribute attribute) {
        this.f87736f.add(attribute);
    }

    public void setExtensions(X509Extensions x509Extensions) {
        this.f87738h = Extensions.getInstance(x509Extensions.toASN1Primitive());
    }
}
