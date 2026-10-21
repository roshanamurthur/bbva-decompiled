package org.bouncycastle.asn1.x509;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class CertificatePair extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Certificate f87602p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Certificate f87603q0;

    public CertificatePair(Certificate certificate, Certificate certificate2) {
        this.f87602p0 = certificate;
        this.f87603q0 = certificate2;
    }

    public static CertificatePair getInstance(Object obj) {
        if (obj == null || (obj instanceof CertificatePair)) {
            return (CertificatePair) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        CertificatePair certificatePair = new CertificatePair();
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                certificatePair.f87602p0 = Certificate.getInstance(aSN1TaggedObject, true);
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
                }
                certificatePair.f87603q0 = Certificate.getInstance(aSN1TaggedObject, true);
            }
        }
        return certificatePair;
    }

    public Certificate getForward() {
        return this.f87602p0;
    }

    public Certificate getReverse() {
        return this.f87603q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        Certificate certificate = this.f87602p0;
        if (certificate != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, certificate));
        }
        Certificate certificate2 = this.f87603q0;
        if (certificate2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(1, certificate2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
