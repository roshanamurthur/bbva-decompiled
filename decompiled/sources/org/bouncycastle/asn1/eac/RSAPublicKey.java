package org.bouncycastle.asn1.eac;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class RSAPublicKey extends PublicKeyDataObject {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87189p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f87190q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f87191r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f87192s0 = 0;

    public RSAPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f87189p0 = aSN1ObjectIdentifier;
        this.f87190q0 = bigInteger;
        this.f87191r0 = bigInteger2;
    }

    public BigInteger getModulus() {
        return this.f87190q0;
    }

    public BigInteger getPublicExponent() {
        return this.f87191r0;
    }

    @Override // org.bouncycastle.asn1.eac.PublicKeyDataObject
    public ASN1ObjectIdentifier getUsage() {
        return this.f87189p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87189p0);
        aSN1EncodableVector.add(new UnsignedInteger(1, getModulus()));
        aSN1EncodableVector.add(new UnsignedInteger(2, getPublicExponent()));
        return new DERSequence(aSN1EncodableVector);
    }
}
