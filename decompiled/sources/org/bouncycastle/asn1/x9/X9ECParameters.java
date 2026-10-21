package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class X9ECParameters extends ASN1Object implements X9ObjectIdentifiers {
    public static final BigInteger v0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final X9FieldID f87835p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ECCurve f87836q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public X9ECPoint f87837r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BigInteger f87838s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public BigInteger f87839t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f87840u0;

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger) {
        this(eCCurve, x9ECPoint, bigInteger, null, null);
    }

    public static X9ECParameters getInstance(Object obj) {
        if (obj instanceof X9ECParameters) {
            return (X9ECParameters) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        X9ECParameters x9ECParameters = new X9ECParameters();
        if (!(aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) || !((ASN1Integer) aSN1Sequence.getObjectAt(0)).hasValue(v0)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        BigInteger value = ((ASN1Integer) aSN1Sequence.getObjectAt(4)).getValue();
        x9ECParameters.f87838s0 = value;
        if (aSN1Sequence.size() == 6) {
            x9ECParameters.f87839t0 = ((ASN1Integer) aSN1Sequence.getObjectAt(5)).getValue();
        }
        X9Curve x9Curve = new X9Curve(X9FieldID.getInstance(aSN1Sequence.getObjectAt(1)), value, x9ECParameters.f87839t0, ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2)));
        ECCurve curve = x9Curve.getCurve();
        x9ECParameters.f87836q0 = curve;
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(3);
        if (objectAt instanceof X9ECPoint) {
            x9ECParameters.f87837r0 = (X9ECPoint) objectAt;
        } else {
            x9ECParameters.f87837r0 = new X9ECPoint(curve, (ASN1OctetString) objectAt);
        }
        x9ECParameters.f87840u0 = x9Curve.getSeed();
        return x9ECParameters;
    }

    public X9ECPoint getBaseEntry() {
        return this.f87837r0;
    }

    public ECCurve getCurve() {
        return this.f87836q0;
    }

    public X9Curve getCurveEntry() {
        return new X9Curve(this.f87836q0, this.f87840u0);
    }

    public X9FieldID getFieldIDEntry() {
        return this.f87835p0;
    }

    public ECPoint getG() {
        return this.f87837r0.getPoint();
    }

    public BigInteger getH() {
        return this.f87839t0;
    }

    public BigInteger getN() {
        return this.f87838s0;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f87840u0);
    }

    public boolean hasSeed() {
        return this.f87840u0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(new ASN1Integer(v0));
        aSN1EncodableVector.add(this.f87835p0);
        aSN1EncodableVector.add(new X9Curve(this.f87836q0, this.f87840u0));
        aSN1EncodableVector.add(this.f87837r0);
        aSN1EncodableVector.add(new ASN1Integer(this.f87838s0));
        BigInteger bigInteger = this.f87839t0;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, x9ECPoint, bigInteger, bigInteger2, null);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        X9FieldID x9FieldID;
        this.f87836q0 = eCCurve;
        this.f87837r0 = x9ECPoint;
        this.f87838s0 = bigInteger;
        this.f87839t0 = bigInteger2;
        this.f87840u0 = Arrays.clone(bArr);
        if (ECAlgorithms.isFpCurve(eCCurve)) {
            x9FieldID = new X9FieldID(eCCurve.getField().getCharacteristic());
        } else {
            if (!ECAlgorithms.isF2mCurve(eCCurve)) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] exponentsPresent = ((PolynomialExtensionField) eCCurve.getField()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                x9FieldID = new X9FieldID(exponentsPresent[2], exponentsPresent[1]);
            } else {
                if (exponentsPresent.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                x9FieldID = new X9FieldID(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            }
        }
        this.f87835p0 = x9FieldID;
    }
}
