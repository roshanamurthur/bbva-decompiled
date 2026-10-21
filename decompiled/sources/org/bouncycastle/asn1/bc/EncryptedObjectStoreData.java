package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedObjectStoreData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86598p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1OctetString f86599q0;

    public EncryptedObjectStoreData(ASN1Sequence aSN1Sequence) {
        this.f86598p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86599q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static EncryptedObjectStoreData getInstance(Object obj) {
        if (obj instanceof EncryptedObjectStoreData) {
            return (EncryptedObjectStoreData) obj;
        }
        if (obj != null) {
            return new EncryptedObjectStoreData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getEncryptedContent() {
        return this.f86599q0;
    }

    public AlgorithmIdentifier getEncryptionAlgorithm() {
        return this.f86598p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86598p0);
        aSN1EncodableVector.add(this.f86599q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public EncryptedObjectStoreData(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f86598p0 = algorithmIdentifier;
        this.f86599q0 = new DEROctetString(bArr);
    }
}
