package org.bouncycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes13.dex */
public class GF2nPolynomial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GF2nElement[] f91601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91602b;

    public GF2nPolynomial(int i10) {
        this.f91602b = i10;
        this.f91601a = new GF2nElement[i10];
    }

    public final GF2nPolynomial add(GF2nPolynomial gF2nPolynomial) {
        GF2nPolynomial gF2nPolynomial2;
        int i10 = 0;
        if (size() >= gF2nPolynomial.size()) {
            gF2nPolynomial2 = new GF2nPolynomial(size());
            while (i10 < gF2nPolynomial.size()) {
                gF2nPolynomial2.f91601a[i10] = (GF2nElement) this.f91601a[i10].add(gF2nPolynomial.f91601a[i10]);
                i10++;
            }
            while (i10 < size()) {
                gF2nPolynomial2.f91601a[i10] = this.f91601a[i10];
                i10++;
            }
        } else {
            gF2nPolynomial2 = new GF2nPolynomial(gF2nPolynomial.size());
            while (i10 < size()) {
                gF2nPolynomial2.f91601a[i10] = (GF2nElement) this.f91601a[i10].add(gF2nPolynomial.f91601a[i10]);
                i10++;
            }
            while (i10 < gF2nPolynomial.size()) {
                gF2nPolynomial2.f91601a[i10] = gF2nPolynomial.f91601a[i10];
                i10++;
            }
        }
        return gF2nPolynomial2;
    }

    public final void assignZeroToElements() {
        for (int i10 = 0; i10 < this.f91602b; i10++) {
            this.f91601a[i10].a();
        }
    }

    public final GF2nElement at(int i10) {
        return this.f91601a[i10];
    }

    public final GF2nPolynomial[] divide(GF2nPolynomial gF2nPolynomial) {
        GF2nPolynomial gF2nPolynomial2;
        GF2nPolynomial[] gF2nPolynomialArr = new GF2nPolynomial[2];
        GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(this);
        gF2nPolynomial3.shrink();
        int degree = gF2nPolynomial.getDegree();
        GF2nElement gF2nElement = (GF2nElement) gF2nPolynomial.f91601a[degree].invert();
        if (gF2nPolynomial3.getDegree() < degree) {
            GF2nPolynomial gF2nPolynomial4 = new GF2nPolynomial(this);
            gF2nPolynomialArr[0] = gF2nPolynomial4;
            gF2nPolynomial4.assignZeroToElements();
            gF2nPolynomialArr[0].shrink();
            gF2nPolynomial2 = new GF2nPolynomial(this);
            gF2nPolynomialArr[1] = gF2nPolynomial2;
        } else {
            GF2nPolynomial gF2nPolynomial5 = new GF2nPolynomial(this);
            gF2nPolynomialArr[0] = gF2nPolynomial5;
            gF2nPolynomial5.assignZeroToElements();
            while (true) {
                int degree2 = gF2nPolynomial3.getDegree() - degree;
                if (degree2 < 0) {
                    break;
                }
                GF2nElement gF2nElement2 = (GF2nElement) gF2nPolynomial3.f91601a[gF2nPolynomial3.getDegree()].multiply(gF2nElement);
                GF2nPolynomial gF2nPolynomialScalarMultiply = gF2nPolynomial.scalarMultiply(gF2nElement2);
                gF2nPolynomialScalarMultiply.shiftThisLeft(degree2);
                gF2nPolynomial3 = gF2nPolynomial3.add(gF2nPolynomialScalarMultiply);
                gF2nPolynomial3.shrink();
                gF2nPolynomialArr[0].f91601a[degree2] = (GF2nElement) gF2nElement2.clone();
            }
            gF2nPolynomialArr[1] = gF2nPolynomial3;
            gF2nPolynomial2 = gF2nPolynomialArr[0];
        }
        gF2nPolynomial2.shrink();
        return gF2nPolynomialArr;
    }

    public final void enlarge(int i10) {
        int i11 = this.f91602b;
        if (i10 <= i11) {
            return;
        }
        GF2nElement[] gF2nElementArr = new GF2nElement[i10];
        System.arraycopy(this.f91601a, 0, gF2nElementArr, 0, i11);
        GF2nField field = this.f91601a[0].getField();
        GF2nElement gF2nElement = this.f91601a[0];
        if (gF2nElement instanceof GF2nPolynomialElement) {
            for (int i12 = this.f91602b; i12 < i10; i12++) {
                gF2nElementArr[i12] = GF2nPolynomialElement.ZERO((GF2nPolynomialField) field);
            }
        } else if (gF2nElement instanceof GF2nONBElement) {
            for (int i13 = this.f91602b; i13 < i10; i13++) {
                gF2nElementArr[i13] = GF2nONBElement.ZERO((GF2nONBField) field);
            }
        }
        this.f91602b = i10;
        this.f91601a = gF2nElementArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nPolynomial)) {
            return false;
        }
        GF2nPolynomial gF2nPolynomial = (GF2nPolynomial) obj;
        if (getDegree() != gF2nPolynomial.getDegree()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f91602b; i10++) {
            if (!this.f91601a[i10].equals(gF2nPolynomial.f91601a[i10])) {
                return false;
            }
        }
        return true;
    }

    public final GF2nPolynomial gcd(GF2nPolynomial gF2nPolynomial) {
        GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(this);
        GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial);
        gF2nPolynomial2.shrink();
        gF2nPolynomial3.shrink();
        GF2nPolynomial gF2nPolynomial4 = gF2nPolynomial2;
        GF2nPolynomial gF2nPolynomialRemainder = gF2nPolynomial3;
        while (!gF2nPolynomialRemainder.isZero()) {
            GF2nPolynomial gF2nPolynomial5 = gF2nPolynomialRemainder;
            gF2nPolynomialRemainder = gF2nPolynomial4.remainder(gF2nPolynomialRemainder);
            gF2nPolynomial4 = gF2nPolynomial5;
        }
        return gF2nPolynomial4.scalarMultiply((GF2nElement) gF2nPolynomial4.f91601a[gF2nPolynomial4.getDegree()].invert());
    }

    public final int getDegree() {
        for (int i10 = this.f91602b - 1; i10 >= 0; i10--) {
            if (!this.f91601a[i10].isZero()) {
                return i10;
            }
        }
        return -1;
    }

    public int hashCode() {
        return getDegree() + this.f91601a.hashCode();
    }

    public final boolean isZero() {
        for (int i10 = 0; i10 < this.f91602b; i10++) {
            GF2nElement gF2nElement = this.f91601a[i10];
            if (gF2nElement != null && !gF2nElement.isZero()) {
                return false;
            }
        }
        return true;
    }

    public final GF2nPolynomial multiply(GF2nPolynomial gF2nPolynomial) {
        int size = size();
        if (size != gF2nPolynomial.size()) {
            throw new IllegalArgumentException("PolynomialGF2n.multiply: this and b must have the same size!");
        }
        GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial((size << 1) - 1);
        for (int i10 = 0; i10 < size(); i10++) {
            for (int i11 = 0; i11 < gF2nPolynomial.size(); i11++) {
                GF2nElement[] gF2nElementArr = gF2nPolynomial2.f91601a;
                int i12 = i10 + i11;
                GF2nElement gF2nElement = gF2nElementArr[i12];
                if (gF2nElement == null) {
                    gF2nElementArr[i12] = (GF2nElement) this.f91601a[i10].multiply(gF2nPolynomial.f91601a[i11]);
                } else {
                    gF2nElementArr[i12] = (GF2nElement) gF2nElement.add(this.f91601a[i10].multiply(gF2nPolynomial.f91601a[i11]));
                }
            }
        }
        return gF2nPolynomial2;
    }

    public final GF2nPolynomial multiplyAndReduce(GF2nPolynomial gF2nPolynomial, GF2nPolynomial gF2nPolynomial2) {
        return multiply(gF2nPolynomial).reduce(gF2nPolynomial2);
    }

    public final GF2nPolynomial quotient(GF2nPolynomial gF2nPolynomial) throws RuntimeException {
        return divide(gF2nPolynomial)[0];
    }

    public final GF2nPolynomial reduce(GF2nPolynomial gF2nPolynomial) throws RuntimeException {
        return remainder(gF2nPolynomial);
    }

    public final GF2nPolynomial remainder(GF2nPolynomial gF2nPolynomial) throws RuntimeException {
        return divide(gF2nPolynomial)[1];
    }

    public final GF2nPolynomial scalarMultiply(GF2nElement gF2nElement) {
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(size());
        for (int i10 = 0; i10 < size(); i10++) {
            gF2nPolynomial.f91601a[i10] = (GF2nElement) this.f91601a[i10].multiply(gF2nElement);
        }
        return gF2nPolynomial;
    }

    public final void set(int i10, GF2nElement gF2nElement) {
        if (!(gF2nElement instanceof GF2nPolynomialElement) && !(gF2nElement instanceof GF2nONBElement)) {
            throw new IllegalArgumentException("PolynomialGF2n.set f must be an instance of either GF2nPolynomialElement or GF2nONBElement!");
        }
        this.f91601a[i10] = (GF2nElement) gF2nElement.clone();
    }

    public final GF2nPolynomial shiftLeft(int i10) {
        if (i10 <= 0) {
            return new GF2nPolynomial(this);
        }
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(this.f91602b + i10, this.f91601a[0]);
        gF2nPolynomial.assignZeroToElements();
        for (int i11 = 0; i11 < this.f91602b; i11++) {
            gF2nPolynomial.f91601a[i11 + i10] = this.f91601a[i11];
        }
        return gF2nPolynomial;
    }

    public final void shiftThisLeft(int i10) {
        if (i10 > 0) {
            int i11 = this.f91602b;
            GF2nField field = this.f91601a[0].getField();
            enlarge(this.f91602b + i10);
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                GF2nElement[] gF2nElementArr = this.f91601a;
                gF2nElementArr[i12 + i10] = gF2nElementArr[i12];
            }
            GF2nElement gF2nElement = this.f91601a[0];
            if (gF2nElement instanceof GF2nPolynomialElement) {
                for (int i13 = i10 - 1; i13 >= 0; i13--) {
                    this.f91601a[i13] = GF2nPolynomialElement.ZERO((GF2nPolynomialField) field);
                }
                return;
            }
            if (gF2nElement instanceof GF2nONBElement) {
                for (int i14 = i10 - 1; i14 >= 0; i14--) {
                    this.f91601a[i14] = GF2nONBElement.ZERO((GF2nONBField) field);
                }
            }
        }
    }

    public final void shrink() {
        int i10 = this.f91602b;
        do {
            i10--;
            if (!this.f91601a[i10].isZero()) {
                break;
            }
        } while (i10 > 0);
        int i11 = i10 + 1;
        if (i11 < this.f91602b) {
            GF2nElement[] gF2nElementArr = new GF2nElement[i11];
            System.arraycopy(this.f91601a, 0, gF2nElementArr, 0, i11);
            this.f91601a = gF2nElementArr;
            this.f91602b = i11;
        }
    }

    public final int size() {
        return this.f91602b;
    }

    public GF2nPolynomial(int i10, GF2nElement gF2nElement) {
        this.f91602b = i10;
        this.f91601a = new GF2nElement[i10];
        for (int i11 = 0; i11 < this.f91602b; i11++) {
            this.f91601a[i11] = (GF2nElement) gF2nElement.clone();
        }
    }

    public GF2nPolynomial(GF2Polynomial gF2Polynomial, GF2nField gF2nField) {
        int degree = gF2nField.getDegree() + 1;
        this.f91602b = degree;
        this.f91601a = new GF2nElement[degree];
        int i10 = 0;
        if (gF2nField instanceof GF2nONBField) {
            while (i10 < this.f91602b) {
                if (gF2Polynomial.testBit(i10)) {
                    this.f91601a[i10] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
                } else {
                    this.f91601a[i10] = GF2nONBElement.ZERO((GF2nONBField) gF2nField);
                }
                i10++;
            }
            return;
        }
        if (!(gF2nField instanceof GF2nPolynomialField)) {
            throw new IllegalArgumentException("PolynomialGF2n(Bitstring, GF2nField): B1 must be an instance of GF2nONBField or GF2nPolynomialField!");
        }
        while (i10 < this.f91602b) {
            if (gF2Polynomial.testBit(i10)) {
                this.f91601a[i10] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
            } else {
                this.f91601a[i10] = GF2nPolynomialElement.ZERO((GF2nPolynomialField) gF2nField);
            }
            i10++;
        }
    }

    public GF2nPolynomial(GF2nPolynomial gF2nPolynomial) {
        int i10 = gF2nPolynomial.f91602b;
        this.f91601a = new GF2nElement[i10];
        this.f91602b = i10;
        for (int i11 = 0; i11 < this.f91602b; i11++) {
            this.f91601a[i11] = (GF2nElement) gF2nPolynomial.f91601a[i11].clone();
        }
    }
}
