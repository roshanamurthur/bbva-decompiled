package org.bouncycastle.asn1.ua;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DSTU4145PointEncoder {
    public static ECFieldElement a(ECFieldElement eCFieldElement) {
        ECFieldElement eCFieldElementAdd = eCFieldElement;
        for (int i10 = 1; i10 < eCFieldElement.getFieldSize(); i10++) {
            eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElement);
        }
        return eCFieldElementAdd;
    }

    public static ECPoint decodePoint(ECCurve eCCurve, byte[] bArr) {
        ECFieldElement eCFieldElementMultiply;
        ECFieldElement eCFieldElementFromBigInteger = eCCurve.fromBigInteger(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        ECFieldElement eCFieldElementFromBigInteger2 = eCCurve.fromBigInteger(new BigInteger(1, bArr));
        if (!a(eCFieldElementFromBigInteger2).equals(eCCurve.getA())) {
            eCFieldElementFromBigInteger2 = eCFieldElementFromBigInteger2.addOne();
        }
        if (eCFieldElementFromBigInteger2.isZero()) {
            eCFieldElementMultiply = eCCurve.getB().sqrt();
        } else {
            ECFieldElement eCFieldElementAdd = eCFieldElementFromBigInteger2.square().invert().multiply(eCCurve.getB()).add(eCCurve.getA()).add(eCFieldElementFromBigInteger2);
            if (!eCFieldElementAdd.isZero()) {
                ECFieldElement eCFieldElementFromBigInteger3 = eCCurve.fromBigInteger(ECConstants.ZERO);
                Random random = new Random();
                int fieldSize = eCFieldElementAdd.getFieldSize();
                while (true) {
                    ECFieldElement eCFieldElementFromBigInteger4 = eCCurve.fromBigInteger(new BigInteger(fieldSize, random));
                    ECFieldElement eCFieldElementAdd2 = eCFieldElementAdd;
                    ECFieldElement eCFieldElementAdd3 = eCFieldElementFromBigInteger3;
                    for (int i10 = 1; i10 <= fieldSize - 1; i10++) {
                        ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
                        eCFieldElementAdd3 = eCFieldElementAdd3.square().add(eCFieldElementSquare.multiply(eCFieldElementFromBigInteger4));
                        eCFieldElementAdd2 = eCFieldElementSquare.add(eCFieldElementAdd);
                    }
                    if (!eCFieldElementAdd2.isZero()) {
                        eCFieldElementAdd = null;
                        break;
                    }
                    if (!eCFieldElementAdd3.square().add(eCFieldElementAdd3).isZero()) {
                        eCFieldElementAdd = eCFieldElementAdd3;
                        break;
                    }
                }
            }
            if (eCFieldElementAdd != null) {
                if (!a(eCFieldElementAdd).equals(eCFieldElementFromBigInteger)) {
                    eCFieldElementAdd = eCFieldElementAdd.addOne();
                }
                eCFieldElementMultiply = eCFieldElementFromBigInteger2.multiply(eCFieldElementAdd);
            } else {
                eCFieldElementMultiply = null;
            }
        }
        if (eCFieldElementMultiply != null) {
            return eCCurve.validatePoint(eCFieldElementFromBigInteger2.toBigInteger(), eCFieldElementMultiply.toBigInteger());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static byte[] encodePoint(ECPoint eCPoint) {
        ECPoint eCPointNormalize = eCPoint.normalize();
        ECFieldElement affineXCoord = eCPointNormalize.getAffineXCoord();
        byte[] encoded = affineXCoord.getEncoded();
        if (!affineXCoord.isZero()) {
            if (a(eCPointNormalize.getAffineYCoord().divide(affineXCoord)).isOne()) {
                int length = encoded.length - 1;
                encoded[length] = (byte) (encoded[length] | 1);
            } else {
                int length2 = encoded.length - 1;
                encoded[length2] = (byte) (encoded[length2] & 254);
            }
        }
        return encoded;
    }
}
