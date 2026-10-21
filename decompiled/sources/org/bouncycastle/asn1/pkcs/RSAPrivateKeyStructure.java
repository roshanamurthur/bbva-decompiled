package org.bouncycastle.asn1.pkcs;

import androidx.emoji2.text.flatbuffer.a;
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
public class RSAPrivateKeyStructure extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f87436p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f87437q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f87438r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f87439s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BigInteger f87440t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final BigInteger f87441u0;
    public final BigInteger v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final BigInteger f87442w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final BigInteger f87443x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ASN1Sequence f87444y0;

    public RSAPrivateKeyStructure(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.f87444y0 = null;
        this.f87436p0 = 0;
        this.f87437q0 = bigInteger;
        this.f87438r0 = bigInteger2;
        this.f87439s0 = bigInteger3;
        this.f87440t0 = bigInteger4;
        this.f87441u0 = bigInteger5;
        this.v0 = bigInteger6;
        this.f87442w0 = bigInteger7;
        this.f87443x0 = bigInteger8;
    }

    public static RSAPrivateKeyStructure getInstance(Object obj) {
        if (obj instanceof RSAPrivateKeyStructure) {
            return (RSAPrivateKeyStructure) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RSAPrivateKeyStructure((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "unknown object in factory: "));
    }

    public BigInteger getCoefficient() {
        return this.f87443x0;
    }

    public BigInteger getExponent1() {
        return this.v0;
    }

    public BigInteger getExponent2() {
        return this.f87442w0;
    }

    public BigInteger getModulus() {
        return this.f87437q0;
    }

    public BigInteger getPrime1() {
        return this.f87440t0;
    }

    public BigInteger getPrime2() {
        return this.f87441u0;
    }

    public BigInteger getPrivateExponent() {
        return this.f87439s0;
    }

    public BigInteger getPublicExponent() {
        return this.f87438r0;
    }

    public int getVersion() {
        return this.f87436p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        aSN1EncodableVector.add(new ASN1Integer(this.f87436p0));
        aSN1EncodableVector.add(new ASN1Integer(getModulus()));
        aSN1EncodableVector.add(new ASN1Integer(getPublicExponent()));
        aSN1EncodableVector.add(new ASN1Integer(getPrivateExponent()));
        aSN1EncodableVector.add(new ASN1Integer(getPrime1()));
        aSN1EncodableVector.add(new ASN1Integer(getPrime2()));
        aSN1EncodableVector.add(new ASN1Integer(getExponent1()));
        aSN1EncodableVector.add(new ASN1Integer(getExponent2()));
        aSN1EncodableVector.add(new ASN1Integer(getCoefficient()));
        ASN1Sequence aSN1Sequence = this.f87444y0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public RSAPrivateKeyStructure(ASN1Sequence aSN1Sequence) {
        this.f87444y0 = null;
        Enumeration objects = aSN1Sequence.getObjects();
        int iIntValueExact = ((ASN1Integer) objects.nextElement()).intValueExact();
        if (iIntValueExact < 0 || iIntValueExact > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f87436p0 = iIntValueExact;
        this.f87437q0 = ((ASN1Integer) objects.nextElement()).getValue();
        this.f87438r0 = ((ASN1Integer) objects.nextElement()).getValue();
        this.f87439s0 = ((ASN1Integer) objects.nextElement()).getValue();
        this.f87440t0 = ((ASN1Integer) objects.nextElement()).getValue();
        this.f87441u0 = ((ASN1Integer) objects.nextElement()).getValue();
        this.v0 = ((ASN1Integer) objects.nextElement()).getValue();
        this.f87442w0 = ((ASN1Integer) objects.nextElement()).getValue();
        this.f87443x0 = ((ASN1Integer) objects.nextElement()).getValue();
        if (objects.hasMoreElements()) {
            this.f87444y0 = (ASN1Sequence) objects.nextElement();
        }
    }

    public static RSAPrivateKeyStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
