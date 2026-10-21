package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class KeyDerivationFunc extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87399p0;

    public KeyDerivationFunc(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87399p0 = new AlgorithmIdentifier(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public static KeyDerivationFunc getInstance(Object obj) {
        if (obj instanceof KeyDerivationFunc) {
            return (KeyDerivationFunc) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        KeyDerivationFunc keyDerivationFunc = new KeyDerivationFunc();
        keyDerivationFunc.f87399p0 = AlgorithmIdentifier.getInstance(aSN1Sequence);
        return keyDerivationFunc;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.f87399p0.getAlgorithm();
    }

    public ASN1Encodable getParameters() {
        return this.f87399p0.getParameters();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87399p0.toASN1Primitive();
    }
}
