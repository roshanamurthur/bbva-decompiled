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
public class GOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f87074p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f87075q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Integer f87076r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1Integer f87077s0;

    public GOST3410ParamSetParameters(int i10, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f87074p0 = i10;
        this.f87075q0 = new ASN1Integer(bigInteger);
        this.f87076r0 = new ASN1Integer(bigInteger2);
        this.f87077s0 = new ASN1Integer(bigInteger3);
    }

    public static GOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof GOST3410ParamSetParameters)) {
            return (GOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new GOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f87077s0.getPositiveValue();
    }

    public int getKeySize() {
        return this.f87074p0;
    }

    public int getLKeySize() {
        return this.f87074p0;
    }

    public BigInteger getP() {
        return this.f87075q0.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f87076r0.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(new ASN1Integer(this.f87074p0));
        aSN1EncodableVector.add(this.f87075q0);
        aSN1EncodableVector.add(this.f87076r0);
        aSN1EncodableVector.add(this.f87077s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f87074p0 = ((ASN1Integer) objects.nextElement()).intValueExact();
        this.f87075q0 = (ASN1Integer) objects.nextElement();
        this.f87076r0 = (ASN1Integer) objects.nextElement();
        this.f87077s0 = (ASN1Integer) objects.nextElement();
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
