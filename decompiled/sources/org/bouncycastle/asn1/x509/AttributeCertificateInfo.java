package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AttributeCertificateInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87573p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Holder f87574q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AttCertIssuer f87575r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AlgorithmIdentifier f87576s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1Integer f87577t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public AttCertValidityPeriod f87578u0;
    public ASN1Sequence v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public DERBitString f87579w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Extensions f87580x0;

    public static AttributeCertificateInfo getInstance(Object obj) {
        if (obj instanceof AttributeCertificateInfo) {
            return (AttributeCertificateInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AttributeCertificateInfo attributeCertificateInfo = new AttributeCertificateInfo();
        if (aSN1Sequence.size() < 6 || aSN1Sequence.size() > 9) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        int i10 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            attributeCertificateInfo.f87573p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            i10 = 1;
        } else {
            attributeCertificateInfo.f87573p0 = new ASN1Integer(0L);
        }
        attributeCertificateInfo.f87574q0 = Holder.getInstance(aSN1Sequence.getObjectAt(i10));
        attributeCertificateInfo.f87575r0 = AttCertIssuer.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        attributeCertificateInfo.f87576s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10 + 2));
        attributeCertificateInfo.f87577t0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10 + 3));
        attributeCertificateInfo.f87578u0 = AttCertValidityPeriod.getInstance(aSN1Sequence.getObjectAt(i10 + 4));
        attributeCertificateInfo.v0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i10 + 5));
        for (int i11 = i10 + 6; i11 < aSN1Sequence.size(); i11++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i11);
            if (objectAt instanceof DERBitString) {
                attributeCertificateInfo.f87579w0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(i11));
            } else if ((objectAt instanceof ASN1Sequence) || (objectAt instanceof Extensions)) {
                attributeCertificateInfo.f87580x0 = Extensions.getInstance(aSN1Sequence.getObjectAt(i11));
            }
        }
        return attributeCertificateInfo;
    }

    public AttCertValidityPeriod getAttrCertValidityPeriod() {
        return this.f87578u0;
    }

    public ASN1Sequence getAttributes() {
        return this.v0;
    }

    public Extensions getExtensions() {
        return this.f87580x0;
    }

    public Holder getHolder() {
        return this.f87574q0;
    }

    public AttCertIssuer getIssuer() {
        return this.f87575r0;
    }

    public DERBitString getIssuerUniqueID() {
        return this.f87579w0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87577t0;
    }

    public AlgorithmIdentifier getSignature() {
        return this.f87576s0;
    }

    public ASN1Integer getVersion() {
        return this.f87573p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(9);
        ASN1Integer aSN1Integer = this.f87573p0;
        if (aSN1Integer.intValueExact() != 0) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        aSN1EncodableVector.add(this.f87574q0);
        aSN1EncodableVector.add(this.f87575r0);
        aSN1EncodableVector.add(this.f87576s0);
        aSN1EncodableVector.add(this.f87577t0);
        aSN1EncodableVector.add(this.f87578u0);
        aSN1EncodableVector.add(this.v0);
        DERBitString dERBitString = this.f87579w0;
        if (dERBitString != null) {
            aSN1EncodableVector.add(dERBitString);
        }
        Extensions extensions = this.f87580x0;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static AttributeCertificateInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
