package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.x509.Certificate;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedPrivateKeyData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final EncryptedPrivateKeyInfo f86600p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Certificate[] f86601q0;

    public EncryptedPrivateKeyData(ASN1Sequence aSN1Sequence) {
        int i10 = 0;
        this.f86600p0 = EncryptedPrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86601q0 = new Certificate[aSN1Sequence2.size()];
        while (true) {
            Certificate[] certificateArr = this.f86601q0;
            if (i10 == certificateArr.length) {
                return;
            }
            certificateArr[i10] = Certificate.getInstance(aSN1Sequence2.getObjectAt(i10));
            i10++;
        }
    }

    public static EncryptedPrivateKeyData getInstance(Object obj) {
        if (obj instanceof EncryptedPrivateKeyData) {
            return (EncryptedPrivateKeyData) obj;
        }
        if (obj != null) {
            return new EncryptedPrivateKeyData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Certificate[] getCertificateChain() {
        Certificate[] certificateArr = this.f86601q0;
        Certificate[] certificateArr2 = new Certificate[certificateArr.length];
        System.arraycopy(certificateArr, 0, certificateArr2, 0, certificateArr.length);
        return certificateArr2;
    }

    public EncryptedPrivateKeyInfo getEncryptedPrivateKeyInfo() {
        return this.f86600p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86600p0);
        aSN1EncodableVector.add(new DERSequence(this.f86601q0));
        return new DERSequence(aSN1EncodableVector);
    }

    public EncryptedPrivateKeyData(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, Certificate[] certificateArr) {
        this.f86600p0 = encryptedPrivateKeyInfo;
        Certificate[] certificateArr2 = new Certificate[certificateArr.length];
        this.f86601q0 = certificateArr2;
        System.arraycopy(certificateArr, 0, certificateArr2, 0, certificateArr.length);
    }
}
