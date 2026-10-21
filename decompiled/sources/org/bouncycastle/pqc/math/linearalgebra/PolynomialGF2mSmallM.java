package org.bouncycastle.pqc.math.linearalgebra;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes13.dex */
public class PolynomialGF2mSmallM {
    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 'I';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GF2mField f91623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f91625c;

    public PolynomialGF2mSmallM(GF2mField gF2mField) {
        this.f91623a = gF2mField;
        this.f91624b = -1;
        this.f91625c = new int[1];
    }

    public static int b(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public static int f(int[] iArr) {
        int iB = b(iArr);
        if (iB == -1) {
            return 0;
        }
        return iArr[iB];
    }

    public static int[] j(int i10, int[] iArr) {
        int iB = b(iArr);
        if (iB == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iB + i10 + 1];
        System.arraycopy(iArr, 0, iArr2, i10, iB + 1);
        return iArr2;
    }

    public static int[] l(int[] iArr) {
        int iB = b(iArr);
        if (iB == -1) {
            return new int[1];
        }
        int i10 = iB + 1;
        if (iArr.length == i10) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public final int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f91623a.add(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    public PolynomialGF2mSmallM add(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.f91623a, a(this.f91625c, polynomialGF2mSmallM.f91625c));
    }

    public PolynomialGF2mSmallM addMonomial(int i10) {
        int[] iArr = new int[i10 + 1];
        iArr[i10] = 1;
        return new PolynomialGF2mSmallM(this.f91623a, a(this.f91625c, iArr));
    }

    public void addToThis(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.f91625c = a(this.f91625c, polynomialGF2mSmallM.f91625c);
        c();
    }

    public final void c() {
        int length = this.f91625c.length;
        do {
            this.f91624b = length - 1;
            length = this.f91624b;
            if (length < 0) {
                return;
            }
        } while (this.f91625c[length] == 0);
    }

    public final int[][] d(int[] iArr, int[] iArr2) {
        int iB = b(iArr2);
        int iB2 = b(iArr) + 1;
        if (iB == -1) {
            throw new ArithmeticException("Division by zero.");
        }
        int[][] iArr3 = {new int[1], new int[iB2]};
        int iF = f(iArr2);
        GF2mField gF2mField = this.f91623a;
        int iInverse = gF2mField.inverse(iF);
        iArr3[0][0] = 0;
        int[] iArr4 = iArr3[1];
        System.arraycopy(iArr, 0, iArr4, 0, iArr4.length);
        while (iB <= b(iArr3[1])) {
            int[] iArr5 = {gF2mField.mult(f(iArr3[1]), iInverse)};
            int[] iArrI = i(iArr5[0], iArr2);
            int iB3 = b(iArr3[1]) - iB;
            int[] iArrJ = j(iB3, iArrI);
            iArr3[0] = a(j(iB3, iArr5), iArr3[0]);
            iArr3[1] = a(iArrJ, iArr3[1]);
        }
        return iArr3;
    }

    public PolynomialGF2mSmallM[] div(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[][] iArrD = d(this.f91625c, polynomialGF2mSmallM.f91625c);
        int[] iArr = iArrD[0];
        GF2mField gF2mField = this.f91623a;
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(gF2mField, iArr), new PolynomialGF2mSmallM(gF2mField, iArrD[1])};
    }

    public final int[] e(int[] iArr, int[] iArr2) {
        if (b(iArr) == -1) {
            return iArr2;
        }
        while (b(iArr2) != -1) {
            int[] iArrG = g(iArr, iArr2);
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            int length2 = iArrG.length;
            int[] iArr4 = new int[length2];
            System.arraycopy(iArrG, 0, iArr4, 0, length2);
            iArr2 = iArr4;
            iArr = iArr3;
        }
        return i(this.f91623a.inverse(f(iArr)), iArr);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PolynomialGF2mSmallM)) {
            PolynomialGF2mSmallM polynomialGF2mSmallM = (PolynomialGF2mSmallM) obj;
            if (this.f91623a.equals(polynomialGF2mSmallM.f91623a) && this.f91624b == polynomialGF2mSmallM.f91624b) {
                int[] iArr = this.f91625c;
                int[] iArr2 = polynomialGF2mSmallM.f91625c;
                int iB = b(iArr);
                if (iB == b(iArr2)) {
                    for (int i10 = 0; i10 <= iB; i10++) {
                        if (iArr[i10] == iArr2[i10]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int evaluateAt(int i10) {
        int[] iArr = this.f91625c;
        int i11 = this.f91624b;
        int iMult = iArr[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            iMult = this.f91623a.mult(iMult, i10) ^ this.f91625c[i12];
        }
        return iMult;
    }

    public final int[] g(int[] iArr, int[] iArr2) {
        int iB = b(iArr2);
        if (iB == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int length = iArr.length;
        int[] iArrA = new int[length];
        int iF = f(iArr2);
        GF2mField gF2mField = this.f91623a;
        int iInverse = gF2mField.inverse(iF);
        System.arraycopy(iArr, 0, iArrA, 0, length);
        while (iB <= b(iArrA)) {
            iArrA = a(i(gF2mField.mult(f(iArrA), iInverse), j(b(iArrA) - iB, iArr2)), iArrA);
        }
        return iArrA;
    }

    public PolynomialGF2mSmallM gcd(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.f91623a, e(this.f91625c, polynomialGF2mSmallM.f91625c));
    }

    public int getCoefficient(int i10) {
        if (i10 < 0 || i10 > this.f91624b) {
            return 0;
        }
        return this.f91625c[i10];
    }

    public int getDegree() {
        int[] iArr = this.f91625c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] getEncoded() {
        int i10 = 8;
        int i11 = 1;
        while (this.f91623a.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        byte[] bArr = new byte[this.f91625c.length * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < this.f91625c.length; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                bArr[i12] = (byte) (this.f91625c[i13] >>> i14);
                i14 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public int getHeadCoefficient() {
        int i10 = this.f91624b;
        if (i10 == -1) {
            return 0;
        }
        return this.f91625c[i10];
    }

    public final int[] h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrL = l(iArr3);
        int[] iArrG = g(iArr2, iArr3);
        int[] iArrL2 = {0};
        int[] iArrG2 = g(iArr, iArr3);
        while (b(iArrG) != -1) {
            int[][] iArrD = d(iArrL, iArrG);
            int[] iArrL3 = l(iArrG);
            int[] iArrL4 = l(iArrD[1]);
            int[] iArrA = a(iArrL2, g(k(iArrD[0], iArrG2), iArr3));
            iArrL2 = l(iArrG2);
            iArrG2 = l(iArrA);
            iArrL = iArrL3;
            iArrG = iArrL4;
        }
        return i(this.f91623a.inverse(f(iArrL)), iArrL2);
    }

    public int hashCode() {
        int iHashCode = this.f91623a.hashCode();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f91625c;
            if (i10 >= iArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + iArr[i10];
            i10++;
        }
    }

    public final int[] i(int i10, int[] iArr) {
        int iB = b(iArr);
        if (iB == -1 || i10 == 0) {
            return new int[1];
        }
        if (i10 == 1) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[iB + 1];
        while (iB >= 0) {
            iArr2[iB] = this.f91623a.mult(iArr[iB], i10);
            iB--;
        }
        return iArr2;
    }

    public final int[] k(int[] iArr, int[] iArr2) {
        if (b(iArr) < b(iArr2)) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArrL = l(iArr);
        int[] iArrL2 = l(iArr2);
        if (iArrL2.length == 1) {
            return i(iArrL2[0], iArrL);
        }
        int length = iArrL.length;
        int length2 = iArrL2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        if (length2 != length) {
            int[] iArr4 = new int[length2];
            int i10 = length - length2;
            int[] iArr5 = new int[i10];
            System.arraycopy(iArrL, 0, iArr4, 0, length2);
            System.arraycopy(iArrL, length2, iArr5, 0, i10);
            return a(k(iArr4, iArrL2), j(length2, k(iArr5, iArrL2)));
        }
        int i11 = (length + 1) >>> 1;
        int i12 = length - i11;
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i12];
        int[] iArr9 = new int[i12];
        System.arraycopy(iArrL, 0, iArr6, 0, i11);
        System.arraycopy(iArrL, i11, iArr8, 0, i12);
        System.arraycopy(iArrL2, 0, iArr7, 0, i11);
        System.arraycopy(iArrL2, i11, iArr9, 0, i12);
        int[] iArrA = a(iArr6, iArr8);
        int[] iArrA2 = a(iArr7, iArr9);
        int[] iArrK = k(iArr6, iArr7);
        int[] iArrK2 = k(iArrA, iArrA2);
        int[] iArrK3 = k(iArr8, iArr9);
        return a(j(i11, a(a(a(iArrK2, iArrK), iArrK3), j(i11, iArrK3))), iArrK);
    }

    public PolynomialGF2mSmallM mod(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.f91623a, g(this.f91625c, polynomialGF2mSmallM.f91625c));
    }

    public PolynomialGF2mSmallM modDiv(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new PolynomialGF2mSmallM(this.f91623a, h(this.f91625c, polynomialGF2mSmallM.f91625c, polynomialGF2mSmallM2.f91625c));
    }

    public PolynomialGF2mSmallM modInverse(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.f91623a, h(new int[]{1}, this.f91625c, polynomialGF2mSmallM.f91625c));
    }

    public PolynomialGF2mSmallM modMultiply(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        int[] iArr = this.f91625c;
        int[] iArr2 = polynomialGF2mSmallM.f91625c;
        return new PolynomialGF2mSmallM(this.f91623a, g(k(iArr, iArr2), polynomialGF2mSmallM2.f91625c));
    }

    public PolynomialGF2mSmallM[] modPolynomialToFracton(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int i10 = polynomialGF2mSmallM.f91624b >> 1;
        int[] iArrL = l(polynomialGF2mSmallM.f91625c);
        int[] iArrG = g(this.f91625c, polynomialGF2mSmallM.f91625c);
        int[] iArr = {0};
        int[] iArr2 = {1};
        while (b(iArrG) > i10) {
            int[][] iArrD = d(iArrL, iArrG);
            int[] iArr3 = iArrD[1];
            int[] iArrA = a(iArr, g(k(iArrD[0], iArr2), polynomialGF2mSmallM.f91625c));
            iArr = iArr2;
            iArr2 = iArrA;
            iArrL = iArrG;
            iArrG = iArr3;
        }
        GF2mField gF2mField = this.f91623a;
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(gF2mField, iArrG), new PolynomialGF2mSmallM(gF2mField, iArr2)};
    }

    public PolynomialGF2mSmallM modSquareMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        GF2mField gF2mField;
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i10 = 0;
        while (true) {
            int[] iArr3 = this.f91625c;
            int length2 = iArr3.length;
            gF2mField = this.f91623a;
            if (i10 >= length2) {
                break;
            }
            int i11 = iArr3[i10];
            iArr2[i10] = gF2mField.mult(i11, i11);
            i10++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            for (int i13 = 0; i13 < length; i13++) {
                int[] iArr4 = polynomialGF2mSmallMArr[i13].f91625c;
                if (i12 < iArr4.length) {
                    iArr[i12] = gF2mField.add(iArr[i12], gF2mField.mult(iArr4[i12], iArr2[i13]));
                }
            }
        }
        return new PolynomialGF2mSmallM(gF2mField, iArr);
    }

    public PolynomialGF2mSmallM modSquareRoot(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[] iArrClone = IntUtils.clone(this.f91625c);
        int[] iArrG = g(k(iArrClone, iArrClone), polynomialGF2mSmallM.f91625c);
        while (true) {
            int[] iArr = this.f91625c;
            int iB = b(iArrG);
            if (iB == b(iArr)) {
                for (int i10 = 0; i10 <= iB; i10++) {
                    if (iArrG[i10] == iArr[i10]) {
                    }
                }
                return new PolynomialGF2mSmallM(this.f91623a, iArrClone);
            }
            iArrClone = l(iArrG);
            iArrG = g(k(iArrClone, iArrClone), polynomialGF2mSmallM.f91625c);
        }
    }

    public PolynomialGF2mSmallM modSquareRootMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        GF2mField gF2mField;
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        while (true) {
            gF2mField = this.f91623a;
            if (i10 >= length) {
                break;
            }
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr2 = polynomialGF2mSmallMArr[i11].f91625c;
                if (i10 < iArr2.length) {
                    int[] iArr3 = this.f91625c;
                    if (i11 < iArr3.length) {
                        iArr[i10] = gF2mField.add(iArr[i10], gF2mField.mult(iArr2[i10], iArr3[i11]));
                    }
                }
            }
            i10++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = gF2mField.sqRoot(iArr[i12]);
        }
        return new PolynomialGF2mSmallM(gF2mField, iArr);
    }

    public void multThisWithElement(int i10) {
        if (!this.f91623a.isElementOfThisField(i10)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.f91625c = i(i10, this.f91625c);
        c();
    }

    public PolynomialGF2mSmallM multWithElement(int i10) {
        GF2mField gF2mField = this.f91623a;
        if (gF2mField.isElementOfThisField(i10)) {
            return new PolynomialGF2mSmallM(gF2mField, i(i10, this.f91625c));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public PolynomialGF2mSmallM multWithMonomial(int i10) {
        return new PolynomialGF2mSmallM(this.f91623a, j(i10, this.f91625c));
    }

    public PolynomialGF2mSmallM multiply(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.f91623a, k(this.f91625c, polynomialGF2mSmallM.f91625c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(" Polynomial over ");
        GF2mField gF2mField = this.f91623a;
        sb2.append(gF2mField.toString());
        sb2.append(": \n");
        String string = sb2.toString();
        for (int i10 = 0; i10 < this.f91625c.length; i10++) {
            StringBuilder sbD = c.d(string);
            sbD.append(gF2mField.elementToStr(this.f91625c[i10]));
            sbD.append("Y^");
            sbD.append(i10);
            sbD.append("+");
            string = sbD.toString();
        }
        return u.f(string, ReplenishLogic.ID_SEPARATOR);
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i10) {
        this.f91623a = gF2mField;
        this.f91624b = i10;
        int[] iArr = new int[i10 + 1];
        this.f91625c = iArr;
        iArr[i10] = 1;
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i10, char c10, SecureRandom secureRandom) {
        this.f91623a = gF2mField;
        if (c10 != 'I') {
            throw new IllegalArgumentException(" Error: type " + c10 + " is not defined for GF2smallmPolynomial");
        }
        int[] iArr = new int[i10 + 1];
        iArr[i10] = 1;
        iArr[0] = gF2mField.getRandomNonZeroElement(secureRandom);
        for (int i11 = 1; i11 < i10; i11++) {
            iArr[i11] = gF2mField.getRandomElement(secureRandom);
        }
        while (true) {
            if (iArr[0] != 0) {
                int iB = b(iArr) >> 1;
                int[] iArrL = {0, 1};
                int[] iArr2 = {0, 1};
                int degree = gF2mField.getDegree();
                int i12 = 0;
                while (true) {
                    if (i12 < iB) {
                        for (int i13 = degree - 1; i13 >= 0; i13--) {
                            iArrL = g(k(iArrL, iArrL), iArr);
                        }
                        iArrL = l(iArrL);
                        if (b(e(a(iArrL, iArr2), iArr)) != 0) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        this.f91625c = iArr;
                        c();
                        return;
                    }
                }
            }
            int iA = RandUtils.a(i10, secureRandom);
            if (iA == 0) {
                iArr[0] = gF2mField.getRandomNonZeroElement(secureRandom);
            } else {
                iArr[iA] = gF2mField.getRandomElement(secureRandom);
            }
        }
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, byte[] bArr) {
        this.f91623a = gF2mField;
        int i10 = 8;
        int i11 = 1;
        while (gF2mField.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        if (bArr.length % i11 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f91625c = new int[bArr.length / i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f91625c;
            if (i12 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                c();
                return;
            }
            int i14 = 0;
            while (i14 < i10) {
                int[] iArr2 = this.f91625c;
                iArr2[i12] = ((bArr[i13] & 255) << i14) ^ iArr2[i12];
                i14 += 8;
                i13++;
            }
            if (!this.f91623a.isElementOfThisField(this.f91625c[i12])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i12++;
        }
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int[] iArr) {
        this.f91623a = gF2mField;
        this.f91625c = l(iArr);
        c();
    }

    public PolynomialGF2mSmallM(GF2mVector gF2mVector) {
        this(gF2mVector.getField(), gF2mVector.getIntArrayForm());
    }

    public PolynomialGF2mSmallM(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.f91623a = polynomialGF2mSmallM.f91623a;
        this.f91624b = polynomialGF2mSmallM.f91624b;
        this.f91625c = IntUtils.clone(polynomialGF2mSmallM.f91625c);
    }
}
