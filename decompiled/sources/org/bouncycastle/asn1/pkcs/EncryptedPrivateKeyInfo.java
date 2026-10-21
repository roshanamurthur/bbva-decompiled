package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedPrivateKeyInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87394p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87395q0;

    public EncryptedPrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f87394p0 = algorithmIdentifier;
        this.f87395q0 = new DEROctetString(bArr);
    }

    public static EncryptedPrivateKeyInfo getInstance(Object obj) {
        if (obj instanceof EncryptedPrivateKeyInfo) {
            return (EncryptedPrivateKeyInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo();
        Enumeration objects = aSN1Sequence.getObjects();
        encryptedPrivateKeyInfo.f87394p0 = AlgorithmIdentifier.getInstance(objects.nextElement());
        encryptedPrivateKeyInfo.f87395q0 = ASN1OctetString.getInstance(objects.nextElement());
        return encryptedPrivateKeyInfo;
    }

    public byte[] getEncryptedData() {
        return this.f87395q0.getOctets();
    }

    public AlgorithmIdentifier getEncryptionAlgorithm() {
        return this.f87394p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87394p0);
        aSN1EncodableVector.add(this.f87395q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
