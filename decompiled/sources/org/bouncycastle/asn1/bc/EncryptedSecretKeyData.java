package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedSecretKeyData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86602p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1OctetString f86603q0;

    public EncryptedSecretKeyData(ASN1Sequence aSN1Sequence) {
        this.f86602p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86603q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static EncryptedSecretKeyData getInstance(Object obj) {
        if (obj instanceof EncryptedSecretKeyData) {
            return (EncryptedSecretKeyData) obj;
        }
        if (obj != null) {
            return new EncryptedSecretKeyData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getEncryptedKeyData() {
        return Arrays.clone(this.f86603q0.getOctets());
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.f86602p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86602p0);
        aSN1EncodableVector.add(this.f86603q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public EncryptedSecretKeyData(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f86602p0 = algorithmIdentifier;
        this.f86603q0 = new DEROctetString(Arrays.clone(bArr));
    }
}
