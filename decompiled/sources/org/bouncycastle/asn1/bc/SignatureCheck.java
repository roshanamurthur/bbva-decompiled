package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class SignatureCheck extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86630p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Sequence f86631q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DERBitString f86632r0;

    public SignatureCheck(ASN1Sequence aSN1Sequence) {
        this.f86630p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        int i10 = 1;
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1TaggedObject) {
            this.f86631q0 = ASN1Sequence.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject());
            i10 = 2;
        } else {
            this.f86631q0 = null;
        }
        this.f86632r0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(i10));
    }

    public static SignatureCheck getInstance(Object obj) {
        if (obj instanceof SignatureCheck) {
            return (SignatureCheck) obj;
        }
        if (obj != null) {
            return new SignatureCheck(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Certificate[] getCertificates() {
        ASN1Sequence aSN1Sequence = this.f86631q0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        Certificate[] certificateArr = new Certificate[size];
        for (int i10 = 0; i10 != size; i10++) {
            certificateArr[i10] = Certificate.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certificateArr;
    }

    public ASN1BitString getSignature() {
        DERBitString dERBitString = this.f86632r0;
        return new DERBitString(dERBitString.getBytes(), dERBitString.getPadBits());
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f86630p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86630p0);
        ASN1Sequence aSN1Sequence = this.f86631q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, aSN1Sequence));
        }
        aSN1EncodableVector.add(this.f86632r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public SignatureCheck(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f86630p0 = algorithmIdentifier;
        this.f86631q0 = null;
        this.f86632r0 = new DERBitString(Arrays.clone(bArr));
    }

    public SignatureCheck(AlgorithmIdentifier algorithmIdentifier, Certificate[] certificateArr, byte[] bArr) {
        this.f86630p0 = algorithmIdentifier;
        this.f86631q0 = new DERSequence(certificateArr);
        this.f86632r0 = new DERBitString(Arrays.clone(bArr));
    }
}
