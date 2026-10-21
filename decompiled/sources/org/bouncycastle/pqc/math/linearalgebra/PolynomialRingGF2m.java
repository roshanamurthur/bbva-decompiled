package org.bouncycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes13.dex */
public class PolynomialRingGF2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GF2mField f91626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PolynomialGF2mSmallM f91627b;
    protected PolynomialGF2mSmallM[] sqMatrix;
    protected PolynomialGF2mSmallM[] sqRootMatrix;

    public PolynomialRingGF2m(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int i10;
        GF2mField gF2mField2;
        GF2mField gF2mField3;
        int coefficient;
        this.f91626a = gF2mField;
        this.f91627b = polynomialGF2mSmallM;
        int degree = polynomialGF2mSmallM.getDegree();
        this.sqMatrix = new PolynomialGF2mSmallM[degree];
        int i11 = 0;
        while (true) {
            i10 = degree >> 1;
            gF2mField2 = this.f91626a;
            if (i11 >= i10) {
                break;
            }
            int i12 = i11 << 1;
            int[] iArr = new int[i12 + 1];
            iArr[i12] = 1;
            this.sqMatrix[i11] = new PolynomialGF2mSmallM(gF2mField2, iArr);
            i11++;
        }
        while (i10 < degree) {
            int i13 = i10 << 1;
            int[] iArr2 = new int[i13 + 1];
            iArr2[i13] = 1;
            this.sqMatrix[i10] = new PolynomialGF2mSmallM(gF2mField2, iArr2).mod(polynomialGF2mSmallM);
            i10++;
        }
        int degree2 = this.f91627b.getDegree();
        PolynomialGF2mSmallM[] polynomialGF2mSmallMArr = new PolynomialGF2mSmallM[degree2];
        int i14 = degree2 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            polynomialGF2mSmallMArr[i15] = new PolynomialGF2mSmallM(this.sqMatrix[i15]);
        }
        this.sqRootMatrix = new PolynomialGF2mSmallM[degree2];
        while (true) {
            gF2mField3 = this.f91626a;
            if (i14 < 0) {
                break;
            }
            this.sqRootMatrix[i14] = new PolynomialGF2mSmallM(gF2mField3, i14);
            i14--;
        }
        for (int i16 = 0; i16 < degree2; i16++) {
            if (polynomialGF2mSmallMArr[i16].getCoefficient(i16) == 0) {
                int i17 = i16 + 1;
                boolean z10 = false;
                while (i17 < degree2) {
                    if (polynomialGF2mSmallMArr[i17].getCoefficient(i16) != 0) {
                        PolynomialGF2mSmallM polynomialGF2mSmallM2 = polynomialGF2mSmallMArr[i16];
                        polynomialGF2mSmallMArr[i16] = polynomialGF2mSmallMArr[i17];
                        polynomialGF2mSmallMArr[i17] = polynomialGF2mSmallM2;
                        PolynomialGF2mSmallM[] polynomialGF2mSmallMArr2 = this.sqRootMatrix;
                        PolynomialGF2mSmallM polynomialGF2mSmallM3 = polynomialGF2mSmallMArr2[i16];
                        polynomialGF2mSmallMArr2[i16] = polynomialGF2mSmallMArr2[i17];
                        polynomialGF2mSmallMArr2[i17] = polynomialGF2mSmallM3;
                        i17 = degree2;
                        z10 = true;
                    }
                    i17++;
                }
                if (!z10) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iInverse = gF2mField3.inverse(polynomialGF2mSmallMArr[i16].getCoefficient(i16));
            polynomialGF2mSmallMArr[i16].multThisWithElement(iInverse);
            this.sqRootMatrix[i16].multThisWithElement(iInverse);
            for (int i18 = 0; i18 < degree2; i18++) {
                if (i18 != i16 && (coefficient = polynomialGF2mSmallMArr[i18].getCoefficient(i16)) != 0) {
                    PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement = polynomialGF2mSmallMArr[i16].multWithElement(coefficient);
                    PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement2 = this.sqRootMatrix[i16].multWithElement(coefficient);
                    polynomialGF2mSmallMArr[i18].addToThis(polynomialGF2mSmallMMultWithElement);
                    this.sqRootMatrix[i18].addToThis(polynomialGF2mSmallMMultWithElement2);
                }
            }
        }
    }

    public PolynomialGF2mSmallM[] getSquareRootMatrix() {
        return this.sqRootMatrix;
    }

    public PolynomialGF2mSmallM[] getSquaringMatrix() {
        return this.sqMatrix;
    }
}
