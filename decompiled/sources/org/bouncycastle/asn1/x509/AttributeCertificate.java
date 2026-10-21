package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AttributeCertificate extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AttributeCertificateInfo f87570p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f87571q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DERBitString f87572r0;

    public AttributeCertificate(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        this.f87570p0 = AttributeCertificateInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.f87571q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f87572r0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static AttributeCertificate getInstance(Object obj) {
        if (obj instanceof AttributeCertificate) {
            return (AttributeCertificate) obj;
        }
        if (obj != null) {
            return new AttributeCertificate(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AttributeCertificateInfo getAcinfo() {
        return this.f87570p0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f87571q0;
    }

    public DERBitString getSignatureValue() {
        return this.f87572r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87570p0);
        aSN1EncodableVector.add(this.f87571q0);
        aSN1EncodableVector.add(this.f87572r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public AttributeCertificate(AttributeCertificateInfo attributeCertificateInfo, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
        this.f87570p0 = attributeCertificateInfo;
        this.f87571q0 = algorithmIdentifier;
        this.f87572r0 = dERBitString;
    }
}
