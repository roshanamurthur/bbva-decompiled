package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class PbkdMacIntegrityCheck extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86625p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final KeyDerivationFunc f86626q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1OctetString f86627r0;

    public PbkdMacIntegrityCheck(ASN1Sequence aSN1Sequence) {
        this.f86625p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86626q0 = KeyDerivationFunc.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86627r0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static PbkdMacIntegrityCheck getInstance(Object obj) {
        if (obj instanceof PbkdMacIntegrityCheck) {
            return (PbkdMacIntegrityCheck) obj;
        }
        if (obj != null) {
            return new PbkdMacIntegrityCheck(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getMac() {
        return Arrays.clone(this.f86627r0.getOctets());
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.f86625p0;
    }

    public KeyDerivationFunc getPbkdAlgorithm() {
        return this.f86626q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86625p0);
        aSN1EncodableVector.add(this.f86626q0);
        aSN1EncodableVector.add(this.f86627r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public PbkdMacIntegrityCheck(AlgorithmIdentifier algorithmIdentifier, KeyDerivationFunc keyDerivationFunc, byte[] bArr) {
        this.f86625p0 = algorithmIdentifier;
        this.f86626q0 = keyDerivationFunc;
        this.f86627r0 = new DEROctetString(Arrays.clone(bArr));
    }
}
