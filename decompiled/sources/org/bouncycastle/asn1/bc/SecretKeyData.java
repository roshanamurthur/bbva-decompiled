package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class SecretKeyData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86628p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1OctetString f86629q0;

    public SecretKeyData(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.f86628p0 = aSN1ObjectIdentifier;
        this.f86629q0 = new DEROctetString(Arrays.clone(bArr));
    }

    public static SecretKeyData getInstance(Object obj) {
        if (obj instanceof SecretKeyData) {
            return (SecretKeyData) obj;
        }
        if (obj != null) {
            return new SecretKeyData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getKeyAlgorithm() {
        return this.f86628p0;
    }

    public byte[] getKeyBytes() {
        return Arrays.clone(this.f86629q0.getOctets());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86628p0);
        aSN1EncodableVector.add(this.f86629q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public SecretKeyData(ASN1Sequence aSN1Sequence) {
        this.f86628p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86629q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
