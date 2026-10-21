package org.bouncycastle.asn1.ua;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class DSTU4145ECBinary extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f87520p0 = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DSTU4145BinaryField f87521q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87522r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1OctetString f87523s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1Integer f87524t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ASN1OctetString f87525u0;

    public DSTU4145ECBinary(ECDomainParameters eCDomainParameters) {
        DSTU4145BinaryField dSTU4145BinaryField;
        ECCurve curve = eCDomainParameters.getCurve();
        if (!ECAlgorithms.isF2mCurve(curve)) {
            throw new IllegalArgumentException("only binary domain is possible");
        }
        int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
        if (exponentsPresent.length == 3) {
            dSTU4145BinaryField = new DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
        } else {
            if (exponentsPresent.length != 5) {
                throw new IllegalArgumentException("curve must have a trinomial or pentanomial basis");
            }
            dSTU4145BinaryField = new DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
        }
        this.f87521q0 = dSTU4145BinaryField;
        this.f87522r0 = new ASN1Integer(curve.getA().toBigInteger());
        this.f87523s0 = new DEROctetString(curve.getB().getEncoded());
        this.f87524t0 = new ASN1Integer(eCDomainParameters.getN());
        this.f87525u0 = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
    }

    public static DSTU4145ECBinary getInstance(Object obj) {
        if (obj instanceof DSTU4145ECBinary) {
            return (DSTU4145ECBinary) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DSTU4145ECBinary dSTU4145ECBinary = new DSTU4145ECBinary();
        dSTU4145ECBinary.f87520p0 = BigInteger.valueOf(0L);
        int i10 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            dSTU4145ECBinary.f87520p0 = ASN1Integer.getInstance(aSN1TaggedObject.getLoadedObject()).getValue();
            i10 = 1;
        }
        dSTU4145ECBinary.f87521q0 = DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i10));
        dSTU4145ECBinary.f87522r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        dSTU4145ECBinary.f87523s0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10 + 2));
        dSTU4145ECBinary.f87524t0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10 + 3));
        dSTU4145ECBinary.f87525u0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10 + 4));
        return dSTU4145ECBinary;
    }

    public BigInteger getA() {
        return this.f87522r0.getValue();
    }

    public byte[] getB() {
        return Arrays.clone(this.f87523s0.getOctets());
    }

    public DSTU4145BinaryField getField() {
        return this.f87521q0;
    }

    public byte[] getG() {
        return Arrays.clone(this.f87525u0.getOctets());
    }

    public BigInteger getN() {
        return this.f87524t0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        BigInteger bigInteger = this.f87520p0;
        if (bigInteger.compareTo(bigIntegerValueOf) != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new ASN1Integer(bigInteger)));
        }
        aSN1EncodableVector.add(this.f87521q0);
        aSN1EncodableVector.add(this.f87522r0);
        aSN1EncodableVector.add(this.f87523s0);
        aSN1EncodableVector.add(this.f87524t0);
        aSN1EncodableVector.add(this.f87525u0);
        return new DERSequence(aSN1EncodableVector);
    }
}
