package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes13.dex */
public abstract class GF2nField {
    protected GF2Polynomial fieldPolynomial;
    protected java.util.Vector fields;
    protected int mDegree;
    protected java.util.Vector matrices;
    protected final SecureRandom random;

    public GF2nField(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public abstract void computeCOBMatrix(GF2nField gF2nField);

    public abstract void computeFieldPolynomial();

    public final GF2nElement convert(GF2nElement gF2nElement, GF2nField gF2nField) throws RuntimeException {
        if (gF2nField == this || this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return (GF2nElement) gF2nElement.clone();
        }
        if (this.mDegree != gF2nField.mDegree) {
            throw new RuntimeException("GF2nField.convert: B1 has a different degree and thus cannot be coverted to!");
        }
        int iIndexOf = this.fields.indexOf(gF2nField);
        if (iIndexOf == -1) {
            computeCOBMatrix(gF2nField);
            iIndexOf = this.fields.indexOf(gF2nField);
        }
        GF2Polynomial[] gF2PolynomialArr = (GF2Polynomial[]) this.matrices.elementAt(iIndexOf);
        GF2nElement gF2nElement2 = (GF2nElement) gF2nElement.clone();
        if (gF2nElement2 instanceof GF2nONBElement) {
            ((GF2nONBElement) gF2nElement2).d();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, gF2nElement2.toFlexiBigInt());
        gF2Polynomial.expandN(this.mDegree);
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree);
        for (int i10 = 0; i10 < this.mDegree; i10++) {
            if (gF2Polynomial.vectorMult(gF2PolynomialArr[i10])) {
                gF2Polynomial2.setBit((this.mDegree - 1) - i10);
            }
        }
        if (gF2nField instanceof GF2nPolynomialField) {
            return new GF2nPolynomialElement((GF2nPolynomialField) gF2nField, gF2Polynomial2);
        }
        if (!(gF2nField instanceof GF2nONBField)) {
            throw new RuntimeException("GF2nField.convert: B1 must be an instance of GF2nPolynomialField or GF2nONBField!");
        }
        GF2nONBElement gF2nONBElement = new GF2nONBElement((GF2nONBField) gF2nField, gF2Polynomial2.toFlexiBigInt());
        gF2nONBElement.d();
        return gF2nONBElement;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nField)) {
            return false;
        }
        GF2nField gF2nField = (GF2nField) obj;
        if (gF2nField.mDegree != this.mDegree || !this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return false;
        }
        if (!(this instanceof GF2nPolynomialField) || (gF2nField instanceof GF2nPolynomialField)) {
            return !(this instanceof GF2nONBField) || (gF2nField instanceof GF2nONBField);
        }
        return false;
    }

    public final int getDegree() {
        return this.mDegree;
    }

    public final GF2Polynomial getFieldPolynomial() {
        if (this.fieldPolynomial == null) {
            computeFieldPolynomial();
        }
        return new GF2Polynomial(this.fieldPolynomial);
    }

    public abstract GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial);

    public int hashCode() {
        return this.fieldPolynomial.hashCode() + this.mDegree;
    }

    public final GF2Polynomial[] invertMatrix(GF2Polynomial[] gF2PolynomialArr) {
        GF2Polynomial[] gF2PolynomialArr2 = new GF2Polynomial[gF2PolynomialArr.length];
        GF2Polynomial[] gF2PolynomialArr3 = new GF2Polynomial[gF2PolynomialArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            gF2PolynomialArr2[i11] = new GF2Polynomial(gF2PolynomialArr[i11]);
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree);
            gF2PolynomialArr3[i11] = gF2Polynomial;
            gF2Polynomial.setBit((this.mDegree - 1) - i11);
        }
        while (true) {
            int i12 = this.mDegree;
            if (i10 >= i12 - 1) {
                for (int i13 = i12 - 1; i13 > 0; i13--) {
                    for (int i14 = i13 - 1; i14 >= 0; i14--) {
                        if (gF2PolynomialArr2[i14].testBit((this.mDegree - 1) - i13)) {
                            gF2PolynomialArr2[i14].addToThis(gF2PolynomialArr2[i13]);
                            gF2PolynomialArr3[i14].addToThis(gF2PolynomialArr3[i13]);
                        }
                    }
                }
                return gF2PolynomialArr3;
            }
            int i15 = i10;
            while (true) {
                int i16 = this.mDegree;
                if (i15 >= i16 || gF2PolynomialArr2[i15].testBit((i16 - 1) - i10)) {
                    break;
                }
                i15++;
            }
            if (i15 >= this.mDegree) {
                throw new RuntimeException("GF2nField.invertMatrix: Matrix cannot be inverted!");
            }
            if (i10 != i15) {
                GF2Polynomial gF2Polynomial2 = gF2PolynomialArr2[i10];
                gF2PolynomialArr2[i10] = gF2PolynomialArr2[i15];
                gF2PolynomialArr2[i15] = gF2Polynomial2;
                GF2Polynomial gF2Polynomial3 = gF2PolynomialArr3[i10];
                gF2PolynomialArr3[i10] = gF2PolynomialArr3[i15];
                gF2PolynomialArr3[i15] = gF2Polynomial3;
            }
            int i17 = i10 + 1;
            int i18 = i17;
            while (true) {
                int i19 = this.mDegree;
                if (i18 < i19) {
                    if (gF2PolynomialArr2[i18].testBit((i19 - 1) - i10)) {
                        gF2PolynomialArr2[i18].addToThis(gF2PolynomialArr2[i10]);
                        gF2PolynomialArr3[i18].addToThis(gF2PolynomialArr3[i10]);
                    }
                    i18++;
                }
            }
            i10 = i17;
        }
    }
}
