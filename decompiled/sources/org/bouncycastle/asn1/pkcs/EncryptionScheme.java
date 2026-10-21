package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptionScheme extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87396p0;

    public EncryptionScheme(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87396p0 = new AlgorithmIdentifier(aSN1ObjectIdentifier);
    }

    public static EncryptionScheme getInstance(Object obj) {
        if (obj instanceof EncryptionScheme) {
            return (EncryptionScheme) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        EncryptionScheme encryptionScheme = new EncryptionScheme();
        encryptionScheme.f87396p0 = AlgorithmIdentifier.getInstance(aSN1Sequence);
        return encryptionScheme;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.f87396p0.getAlgorithm();
    }

    public ASN1Encodable getParameters() {
        return this.f87396p0.getParameters();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87396p0.toASN1Primitive();
    }

    public EncryptionScheme(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87396p0 = new AlgorithmIdentifier(aSN1ObjectIdentifier, aSN1Encodable);
    }
}
