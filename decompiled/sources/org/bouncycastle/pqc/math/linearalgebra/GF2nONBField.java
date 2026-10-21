package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public class GF2nONBField extends GF2nField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[][] f91600d;

    public GF2nONBField(int i10, SecureRandom secureRandom) throws RuntimeException {
        int i11;
        int iOrder;
        int i12;
        int i13;
        super(secureRandom);
        if (i10 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i10;
        int i14 = i10 / 64;
        this.f91597a = i14;
        int i15 = i10 & 63;
        this.f91598b = i15;
        if (i15 == 0) {
            this.f91598b = 64;
        } else {
            this.f91597a = i14 + 1;
        }
        if ((i10 & 7) == 0) {
            throw new RuntimeException("The extension degree is divisible by 8!");
        }
        this.f91599c = 1;
        int iGcd = 0;
        while (iGcd != 1) {
            int i16 = (this.f91599c * this.mDegree) + 1;
            if (IntegerFunctions.isPrime(i16)) {
                int iOrder2 = IntegerFunctions.order(2, i16);
                int i17 = this.f91599c;
                int i18 = this.mDegree;
                iGcd = IntegerFunctions.gcd((i17 * i18) / iOrder2, i18);
            }
            this.f91599c++;
        }
        int i19 = this.f91599c - 1;
        this.f91599c = i19;
        if (i19 == 1) {
            int i20 = (this.mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(i20)) {
                int iOrder3 = IntegerFunctions.order(2, i20);
                int i21 = this.mDegree;
                if (IntegerFunctions.gcd((i21 << 1) / iOrder3, i21) == 1) {
                    this.f91599c++;
                }
            }
        }
        if (this.f91599c >= 3) {
            throw new RuntimeException("\nThe type of this field is " + this.f91599c);
        }
        this.f91600d = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mDegree, 2);
        int i22 = 0;
        while (true) {
            i11 = this.mDegree;
            if (i22 >= i11) {
                break;
            }
            int[] iArr = this.f91600d[i22];
            iArr[0] = -1;
            iArr[1] = -1;
            i22++;
        }
        int i23 = this.f91599c;
        if ((i23 & 7) == 0) {
            throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
        int i24 = i11 * i23;
        int i25 = i24 + 1;
        int[] iArr2 = new int[i25];
        if (i23 == 1) {
            i12 = 1;
        } else if (i23 == 2) {
            i12 = i24;
        } else {
            Random random = new Random();
            int iNextInt = 0;
            while (iNextInt == 0) {
                iNextInt = random.nextInt() % i24;
                if (iNextInt < 0) {
                    iNextInt += i24;
                }
            }
            while (true) {
                iOrder = IntegerFunctions.order(iNextInt, i25);
                if (iOrder % i23 == 0 && iOrder != 0) {
                    break;
                }
                while (iNextInt == 0) {
                    iNextInt = random.nextInt() % i24;
                    if (iNextInt < 0) {
                        iNextInt += i24;
                    }
                }
            }
            int i26 = i23 / iOrder;
            i12 = iNextInt;
            for (int i27 = 2; i27 <= i26; i27++) {
                i12 *= iNextInt;
            }
        }
        int i28 = 0;
        int i29 = 1;
        while (true) {
            i13 = this.f91599c;
            if (i28 >= i13) {
                break;
            }
            int i30 = i29;
            for (int i31 = 0; i31 < this.mDegree; i31++) {
                iArr2[i30] = i31;
                i30 = (i30 << 1) % i25;
                if (i30 < 0) {
                    i30 += i25;
                }
            }
            i29 = (i29 * i12) % i25;
            if (i29 < 0) {
                i29 += i25;
            }
            i28++;
        }
        int[][] iArr3 = this.f91600d;
        if (i13 == 1) {
            int i32 = 1;
            while (i32 < i24) {
                int i33 = i32 + 1;
                int[] iArr4 = iArr3[iArr2[i33]];
                int i34 = i25 - i32;
                if (iArr4[0] == -1) {
                    iArr4[0] = iArr2[i34];
                } else {
                    iArr4[1] = iArr2[i34];
                }
                i32 = i33;
            }
            int i35 = this.mDegree >> 1;
            for (int i36 = 1; i36 <= i35; i36++) {
                int i37 = i36 - 1;
                int[] iArr5 = iArr3[i37];
                if (iArr5[0] == -1) {
                    iArr5[0] = (i35 + i36) - 1;
                } else {
                    iArr5[1] = (i35 + i36) - 1;
                }
                int[] iArr6 = iArr3[(i35 + i36) - 1];
                if (iArr6[0] == -1) {
                    iArr6[0] = i37;
                } else {
                    iArr6[1] = i37;
                }
            }
        } else {
            if (i13 != 2) {
                throw new RuntimeException("only type 1 or type 2 implemented");
            }
            int i38 = 1;
            while (i38 < i24) {
                int i39 = i38 + 1;
                int[] iArr7 = iArr3[iArr2[i39]];
                int i40 = i25 - i38;
                if (iArr7[0] == -1) {
                    iArr7[0] = iArr2[i40];
                } else {
                    iArr7[1] = iArr2[i40];
                }
                i38 = i39;
            }
        }
        computeFieldPolynomial();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        int i10 = this.mDegree;
        if (i10 != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i10];
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            gF2PolynomialArr[i11] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        GF2nPolynomialElement[] gF2nPolynomialElementArr = new GF2nPolynomialElement[this.mDegree];
        gF2nPolynomialElementArr[0] = (GF2nElement) randomRoot.clone();
        for (int i12 = 1; i12 < this.mDegree; i12++) {
            gF2nPolynomialElementArr[i12] = gF2nPolynomialElementArr[i12 - 1].square();
        }
        for (int i13 = 0; i13 < this.mDegree; i13++) {
            for (int i14 = 0; i14 < this.mDegree; i14++) {
                if (gF2nPolynomialElementArr[i13].f91604a.testBit(i14)) {
                    int i15 = this.mDegree;
                    gF2PolynomialArr[(i15 - i14) - 1].setBit((i15 - i13) - 1);
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public void computeFieldPolynomial() {
        GF2Polynomial gF2Polynomial;
        int i10 = this.f91599c;
        if (i10 == 1) {
            gF2Polynomial = new GF2Polynomial(this.mDegree + 1, "ALL");
        } else {
            if (i10 != 2) {
                return;
            }
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, "ONE");
            GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this.mDegree + 1, "X");
            gF2Polynomial3.addToThis(gF2Polynomial2);
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            gF2Polynomial = gF2Polynomial3;
            int i11 = 1;
            while (i11 < this.mDegree) {
                GF2Polynomial gF2PolynomialShiftLeft = gF2Polynomial.shiftLeft();
                gF2PolynomialShiftLeft.addToThis(gF2Polynomial4);
                i11++;
                gF2Polynomial4 = gF2Polynomial;
                gF2Polynomial = gF2PolynomialShiftLeft;
            }
        }
        this.fieldPolynomial = gF2Polynomial;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i10 = 1; i10 <= this.mDegree - 1; i10++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gF2nPolynomialGcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gF2nPolynomialGcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gF2nPolynomialGcd) : new GF2nPolynomial(gF2nPolynomialGcd);
        }
        return gF2nPolynomial.at(0);
    }
}
