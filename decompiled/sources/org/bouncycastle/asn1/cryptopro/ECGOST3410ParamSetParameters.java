package org.bouncycastle.asn1.cryptopro;

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
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f87064p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f87065q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Integer f87066r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1Integer f87067s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ASN1Integer f87068t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ASN1Integer f87069u0;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, BigInteger bigInteger5) {
        this.f87066r0 = new ASN1Integer(bigInteger);
        this.f87067s0 = new ASN1Integer(bigInteger2);
        this.f87064p0 = new ASN1Integer(bigInteger3);
        this.f87065q0 = new ASN1Integer(bigInteger4);
        this.f87068t0 = new ASN1Integer(i10);
        this.f87069u0 = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f87066r0.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f87064p0.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f87065q0.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f87066r0);
        aSN1EncodableVector.add(this.f87067s0);
        aSN1EncodableVector.add(this.f87064p0);
        aSN1EncodableVector.add(this.f87065q0);
        aSN1EncodableVector.add(this.f87068t0);
        aSN1EncodableVector.add(this.f87069u0);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f87066r0 = (ASN1Integer) objects.nextElement();
        this.f87067s0 = (ASN1Integer) objects.nextElement();
        this.f87064p0 = (ASN1Integer) objects.nextElement();
        this.f87065q0 = (ASN1Integer) objects.nextElement();
        this.f87068t0 = (ASN1Integer) objects.nextElement();
        this.f87069u0 = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
