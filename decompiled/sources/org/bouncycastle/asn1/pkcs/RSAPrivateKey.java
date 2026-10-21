package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class RSAPrivateKey extends ASN1Object {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f87428q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f87429r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BigInteger f87430s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public BigInteger f87431t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public BigInteger f87432u0;
    public BigInteger v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public BigInteger f87433w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public BigInteger f87434x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ASN1Sequence f87435y0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f87427p0 = BigInteger.valueOf(0);

    public RSAPrivateKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.f87428q0 = bigInteger;
        this.f87429r0 = bigInteger2;
        this.f87430s0 = bigInteger3;
        this.f87431t0 = bigInteger4;
        this.f87432u0 = bigInteger5;
        this.v0 = bigInteger6;
        this.f87433w0 = bigInteger7;
        this.f87434x0 = bigInteger8;
    }

    public static RSAPrivateKey getInstance(Object obj) {
        if (obj instanceof RSAPrivateKey) {
            return (RSAPrivateKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RSAPrivateKey rSAPrivateKey = new RSAPrivateKey();
        rSAPrivateKey.f87435y0 = null;
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Integer aSN1Integer = (ASN1Integer) objects.nextElement();
        int iIntValueExact = aSN1Integer.intValueExact();
        if (iIntValueExact < 0 || iIntValueExact > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        rSAPrivateKey.f87427p0 = aSN1Integer.getValue();
        rSAPrivateKey.f87428q0 = ((ASN1Integer) objects.nextElement()).getValue();
        rSAPrivateKey.f87429r0 = ((ASN1Integer) objects.nextElement()).getValue();
        rSAPrivateKey.f87430s0 = ((ASN1Integer) objects.nextElement()).getValue();
        rSAPrivateKey.f87431t0 = ((ASN1Integer) objects.nextElement()).getValue();
        rSAPrivateKey.f87432u0 = ((ASN1Integer) objects.nextElement()).getValue();
        rSAPrivateKey.v0 = ((ASN1Integer) objects.nextElement()).getValue();
        rSAPrivateKey.f87433w0 = ((ASN1Integer) objects.nextElement()).getValue();
        rSAPrivateKey.f87434x0 = ((ASN1Integer) objects.nextElement()).getValue();
        if (objects.hasMoreElements()) {
            rSAPrivateKey.f87435y0 = (ASN1Sequence) objects.nextElement();
        }
        return rSAPrivateKey;
    }

    public BigInteger getCoefficient() {
        return this.f87434x0;
    }

    public BigInteger getExponent1() {
        return this.v0;
    }

    public BigInteger getExponent2() {
        return this.f87433w0;
    }

    public BigInteger getModulus() {
        return this.f87428q0;
    }

    public BigInteger getPrime1() {
        return this.f87431t0;
    }

    public BigInteger getPrime2() {
        return this.f87432u0;
    }

    public BigInteger getPrivateExponent() {
        return this.f87430s0;
    }

    public BigInteger getPublicExponent() {
        return this.f87429r0;
    }

    public BigInteger getVersion() {
        return this.f87427p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        aSN1EncodableVector.add(new ASN1Integer(this.f87427p0));
        aSN1EncodableVector.add(new ASN1Integer(getModulus()));
        aSN1EncodableVector.add(new ASN1Integer(getPublicExponent()));
        aSN1EncodableVector.add(new ASN1Integer(getPrivateExponent()));
        aSN1EncodableVector.add(new ASN1Integer(getPrime1()));
        aSN1EncodableVector.add(new ASN1Integer(getPrime2()));
        aSN1EncodableVector.add(new ASN1Integer(getExponent1()));
        aSN1EncodableVector.add(new ASN1Integer(getExponent2()));
        aSN1EncodableVector.add(new ASN1Integer(getCoefficient()));
        ASN1Sequence aSN1Sequence = this.f87435y0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static RSAPrivateKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
