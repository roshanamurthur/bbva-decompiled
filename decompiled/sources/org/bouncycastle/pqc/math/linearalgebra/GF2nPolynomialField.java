package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes13.dex */
public class GF2nPolynomialField extends GF2nField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GF2Polynomial[] f91605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f91606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f91609e;

    public GF2nPolynomialField(int i10, SecureRandom secureRandom) {
        super(secureRandom);
        this.f91606b = false;
        this.f91607c = false;
        this.f91609e = new int[3];
        if (i10 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i10;
        computeFieldPolynomial();
        a();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public final void a() {
        int i10 = this.mDegree;
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i10 - 1];
        this.f91605a = new GF2Polynomial[i10];
        int i11 = 0;
        while (true) {
            GF2Polynomial[] gF2PolynomialArr2 = this.f91605a;
            if (i11 >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i11] = new GF2Polynomial(this.mDegree, "ZERO");
            i11++;
        }
        for (int i12 = 0; i12 < this.mDegree - 1; i12++) {
            gF2PolynomialArr[i12] = new GF2Polynomial(1, "ONE").shiftLeft(this.mDegree + i12).remainder(this.fieldPolynomial);
        }
        for (int i13 = 1; i13 <= Math.abs(this.mDegree >> 1); i13++) {
            int i14 = 1;
            while (true) {
                int i15 = this.mDegree;
                if (i14 <= i15) {
                    if (gF2PolynomialArr[i15 - (i13 << 1)].testBit(i15 - i14)) {
                        this.f91605a[i14 - 1].setBit(this.mDegree - i13);
                    }
                    i14++;
                }
            }
        }
        int iAbs = Math.abs(this.mDegree >> 1) + 1;
        while (true) {
            int i16 = this.mDegree;
            if (iAbs > i16) {
                return;
            }
            this.f91605a[((iAbs << 1) - i16) - 1].setBit(i16 - iAbs);
            iAbs++;
        }
    }

    public final boolean b() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean zIsIrreducible = false;
        int i10 = 1;
        while (i10 <= this.mDegree - 3 && !zIsIrreducible) {
            this.fieldPolynomial.setBit(i10);
            int i11 = i10 + 1;
            int i12 = i11;
            while (i12 <= this.mDegree - 2 && !zIsIrreducible) {
                this.fieldPolynomial.setBit(i12);
                int i13 = i12 + 1;
                for (int i14 = i13; i14 <= this.mDegree - 1 && !zIsIrreducible; i14++) {
                    this.fieldPolynomial.setBit(i14);
                    if (((((this.mDegree & 1) != 0) | ((i10 & 1) != 0) | ((i12 & 1) != 0)) || ((i14 & 1) != 0)) && (zIsIrreducible = this.fieldPolynomial.isIrreducible())) {
                        this.f91607c = true;
                        int[] iArr = this.f91609e;
                        iArr[0] = i10;
                        iArr[1] = i12;
                        iArr[2] = i14;
                        return zIsIrreducible;
                    }
                    this.fieldPolynomial.resetBit(i14);
                }
                this.fieldPolynomial.resetBit(i12);
                i12 = i13;
            }
            this.fieldPolynomial.resetBit(i10);
            i10 = i11;
        }
        return zIsIrreducible;
    }

    public final void c() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        GF2nElement[] gF2nElementArr;
        int i10 = this.mDegree;
        if (i10 != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        boolean z10 = gF2nField instanceof GF2nONBField;
        if (z10) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i10];
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            gF2PolynomialArr[i11] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        if (randomRoot instanceof GF2nONBElement) {
            int i12 = this.mDegree;
            gF2nElementArr = new GF2nONBElement[i12];
            gF2nElementArr[i12 - 1] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
        } else {
            int i13 = this.mDegree;
            gF2nElementArr = new GF2nPolynomialElement[i13];
            gF2nElementArr[i13 - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
        }
        int i14 = this.mDegree;
        gF2nElementArr[i14 - 2] = randomRoot;
        for (int i15 = i14 - 3; i15 >= 0; i15--) {
            gF2nElementArr[i15] = (GF2nElement) gF2nElementArr[i15 + 1].multiply(randomRoot);
        }
        if (z10) {
            for (int i16 = 0; i16 < this.mDegree; i16++) {
                int i17 = 0;
                while (true) {
                    int i18 = this.mDegree;
                    if (i17 < i18) {
                        if (gF2nElementArr[i16].b((i18 - i17) - 1)) {
                            int i19 = this.mDegree;
                            gF2PolynomialArr[(i19 - i17) - 1].setBit((i19 - i16) - 1);
                        }
                        i17++;
                    }
                }
            }
        } else {
            for (int i20 = 0; i20 < this.mDegree; i20++) {
                for (int i21 = 0; i21 < this.mDegree; i21++) {
                    if (gF2nElementArr[i20].b(i21)) {
                        int i22 = this.mDegree;
                        gF2PolynomialArr[(i22 - i21) - 1].setBit((i22 - i20) - 1);
                    }
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
        if (d() || b()) {
            return;
        }
        c();
    }

    public void computeFieldPolynomial2() {
        if (d() || b()) {
            return;
        }
        c();
    }

    public final boolean d() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        boolean zIsIrreducible = false;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i10 = 1; i10 < this.mDegree && !zIsIrreducible; i10++) {
            this.fieldPolynomial.setBit(i10);
            boolean zIsIrreducible2 = this.fieldPolynomial.isIrreducible();
            if (zIsIrreducible2) {
                this.f91606b = true;
                this.f91608d = i10;
                return zIsIrreducible2;
            }
            this.fieldPolynomial.resetBit(i10);
            zIsIrreducible = this.fieldPolynomial.isIrreducible();
        }
        return zIsIrreducible;
    }

    public int[] getPc() throws RuntimeException {
        if (!this.f91607c) {
            throw new RuntimeException();
        }
        int[] iArr = new int[3];
        System.arraycopy(this.f91609e, 0, iArr, 0, 3);
        return iArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
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

    public GF2Polynomial getSquaringVector(int i10) {
        return new GF2Polynomial(this.f91605a[i10]);
    }

    public int getTc() throws RuntimeException {
        if (this.f91606b) {
            return this.f91608d;
        }
        throw new RuntimeException();
    }

    public boolean isPentanomial() {
        return this.f91607c;
    }

    public boolean isTrinomial() {
        return this.f91606b;
    }

    public GF2nPolynomialField(int i10, SecureRandom secureRandom, GF2Polynomial gF2Polynomial) throws RuntimeException {
        super(secureRandom);
        this.f91606b = false;
        this.f91607c = false;
        this.f91609e = new int[3];
        if (i10 < 3) {
            throw new IllegalArgumentException("degree must be at least 3");
        }
        if (gF2Polynomial.getLength() != i10 + 1) {
            throw new RuntimeException();
        }
        if (!gF2Polynomial.isIrreducible()) {
            throw new RuntimeException();
        }
        this.mDegree = i10;
        this.fieldPolynomial = gF2Polynomial;
        a();
        int i11 = 2;
        for (int i12 = 1; i12 < this.fieldPolynomial.getLength() - 1; i12++) {
            if (this.fieldPolynomial.testBit(i12)) {
                int i13 = i11 + 1;
                if (i13 == 3) {
                    this.f91608d = i12;
                }
                if (i13 <= 5) {
                    this.f91609e[i11 - 2] = i12;
                }
                i11 = i13;
            }
        }
        if (i11 == 3) {
            this.f91606b = true;
        }
        if (i11 == 5) {
            this.f91607c = true;
        }
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i10, SecureRandom secureRandom, boolean z10) {
        super(secureRandom);
        this.f91606b = false;
        this.f91607c = false;
        this.f91609e = new int[3];
        if (i10 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i10;
        if (z10) {
            computeFieldPolynomial();
        } else {
            computeFieldPolynomial2();
        }
        a();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }
}
