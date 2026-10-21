package org.bouncycastle.pqc.math.linearalgebra;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes13.dex */
public class GF2nPolynomialElement extends GF2nElement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f91603b = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 134217728, 268435456, PKIFailureInfo.duplicateCertReq, 1073741824, Integer.MIN_VALUE, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GF2Polynomial f91604a;

    public GF2nPolynomialElement(GF2nPolynomialElement gF2nPolynomialElement) {
        this.mField = gF2nPolynomialElement.mField;
        this.mDegree = gF2nPolynomialElement.mDegree;
        this.f91604a = new GF2Polynomial(gF2nPolynomialElement.f91604a);
    }

    public static GF2nPolynomialElement ONE(GF2nPolynomialField gF2nPolynomialField) {
        return new GF2nPolynomialElement(gF2nPolynomialField, new GF2Polynomial(gF2nPolynomialField.getDegree(), new int[]{1}));
    }

    public static GF2nPolynomialElement ZERO(GF2nPolynomialField gF2nPolynomialField) {
        return new GF2nPolynomialElement(gF2nPolynomialField, new GF2Polynomial(gF2nPolynomialField.getDegree()));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public final void a() {
        this.f91604a.assignZero();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.addToThis(gFElement);
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nPolynomialElement)) {
            throw new RuntimeException();
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) gFElement;
        if (!this.mField.equals(gF2nPolynomialElement.mField)) {
            throw new RuntimeException();
        }
        this.f91604a.addToThis(gF2nPolynomialElement.f91604a);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public final boolean b(int i10) {
        return this.f91604a.testBit(i10);
    }

    public final void c() {
        if (this.f91604a.getLength() <= this.mDegree) {
            int length = this.f91604a.getLength();
            int i10 = this.mDegree;
            if (length < i10) {
                this.f91604a.expandN(i10);
                return;
            }
            return;
        }
        long j10 = 4294967295L;
        if (((GF2nPolynomialField) this.mField).isTrinomial()) {
            try {
                int tc2 = ((GF2nPolynomialField) this.mField).getTc();
                if (this.mDegree - tc2 > 32) {
                    int length2 = this.f91604a.getLength();
                    int i11 = this.mDegree;
                    if (length2 <= (i11 << 1)) {
                        GF2Polynomial gF2Polynomial = this.f91604a;
                        int i12 = i11 >>> 5;
                        int i13 = i11 & 31;
                        int i14 = 32 - i13;
                        int i15 = i11 - tc2;
                        int i16 = i15 >>> 5;
                        int i17 = 32 - (i15 & 31);
                        int i18 = ((i11 << 1) - 2) >>> 5;
                        while (i18 > i12) {
                            int[] iArr = gF2Polynomial.f91585c;
                            long j11 = ((long) iArr[i18]) & j10;
                            int i19 = i18 - i12;
                            int i20 = i19 - 1;
                            iArr[i20] = iArr[i20] ^ ((int) (j11 << i14));
                            iArr[i19] = (int) (((long) iArr[i19]) ^ (j11 >>> (32 - i14)));
                            int i21 = i18 - i16;
                            int i22 = i21 - 1;
                            int i23 = i18;
                            iArr[i22] = ((int) (j11 << i17)) ^ iArr[i22];
                            iArr[i21] = (int) (((long) iArr[i21]) ^ (j11 >>> (32 - i17)));
                            iArr[i23] = 0;
                            i18 = i23 - 1;
                            j10 = 4294967295L;
                        }
                        int[] iArr2 = gF2Polynomial.f91585c;
                        long j12 = ((long) iArr2[i12]) & 4294967295L & (4294967295 << i13);
                        iArr2[0] = (int) (((long) iArr2[0]) ^ (j12 >>> (32 - i14)));
                        int i24 = i12 - i16;
                        int i25 = i24 - 1;
                        if (i25 >= 0) {
                            iArr2[i25] = iArr2[i25] ^ ((int) (j12 << i17));
                        }
                        iArr2[i24] = (int) ((j12 >>> (32 - i17)) ^ ((long) iArr2[i24]));
                        iArr2[i12] = iArr2[i12] & GF2Polynomial.f91582h[i13];
                        gF2Polynomial.f91584b = ((i11 - 1) >>> 5) + 1;
                        gF2Polynomial.f91583a = i11;
                        return;
                    }
                }
                int i26 = this.mDegree - tc2;
                for (int length3 = this.f91604a.getLength() - 1; length3 >= this.mDegree; length3--) {
                    if (this.f91604a.testBit(length3)) {
                        this.f91604a.xorBit(length3);
                        this.f91604a.xorBit(length3 - i26);
                        this.f91604a.xorBit(length3 - this.mDegree);
                    }
                }
                this.f91604a.reduceN();
                this.f91604a.expandN(this.mDegree);
                return;
            } catch (RuntimeException unused) {
                throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a trinomial");
            }
        }
        if (!((GF2nPolynomialField) this.mField).isPentanomial()) {
            GF2Polynomial gF2PolynomialRemainder = this.f91604a.remainder(this.mField.getFieldPolynomial());
            this.f91604a = gF2PolynomialRemainder;
            gF2PolynomialRemainder.expandN(this.mDegree);
            return;
        }
        try {
            int[] pc2 = ((GF2nPolynomialField) this.mField).getPc();
            if (this.mDegree - pc2[2] > 32) {
                int length4 = this.f91604a.getLength();
                int i27 = this.mDegree;
                if (length4 <= (i27 << 1)) {
                    GF2Polynomial gF2Polynomial2 = this.f91604a;
                    gF2Polynomial2.getClass();
                    int i28 = i27 >>> 5;
                    int i29 = i27 & 31;
                    int i30 = 32 - i29;
                    int i31 = i27 - pc2[0];
                    int i32 = i31 >>> 5;
                    int i33 = 32 - (i31 & 31);
                    int i34 = i27 - pc2[1];
                    int i35 = i34 >>> 5;
                    int i36 = 32 - (i34 & 31);
                    int i37 = i27 - pc2[2];
                    int i38 = i37 >>> 5;
                    int i39 = 32 - (i37 & 31);
                    int i40 = ((i27 << 1) - 2) >>> 5;
                    while (i40 > i28) {
                        int[] iArr3 = gF2Polynomial2.f91585c;
                        long j13 = ((long) iArr3[i40]) & 4294967295L;
                        int i41 = i40 - i28;
                        int i42 = i41 - 1;
                        int i43 = i27;
                        int i44 = i28;
                        iArr3[i42] = iArr3[i42] ^ ((int) (j13 << i30));
                        iArr3[i41] = (int) (((long) iArr3[i41]) ^ (j13 >>> (32 - i30)));
                        int i45 = i40 - i32;
                        int i46 = i45 - 1;
                        iArr3[i46] = iArr3[i46] ^ ((int) (j13 << i33));
                        iArr3[i45] = (int) (((long) iArr3[i45]) ^ (j13 >>> (32 - i33)));
                        int i47 = i40 - i35;
                        int i48 = i47 - 1;
                        iArr3[i48] = iArr3[i48] ^ ((int) (j13 << i36));
                        iArr3[i47] = (int) (((long) iArr3[i47]) ^ (j13 >>> (32 - i36)));
                        int i49 = i40 - i38;
                        int i50 = i49 - 1;
                        iArr3[i50] = iArr3[i50] ^ ((int) (j13 << i39));
                        iArr3[i49] = (int) (((long) iArr3[i49]) ^ (j13 >>> (32 - i39)));
                        iArr3[i40] = 0;
                        i40--;
                        i33 = i33;
                        i29 = i29;
                        i30 = i30;
                        i27 = i43;
                        i28 = i44;
                    }
                    int i51 = i27;
                    int i52 = i28;
                    int i53 = i29;
                    int i54 = i33;
                    int[] iArr4 = gF2Polynomial2.f91585c;
                    long j14 = ((long) iArr4[i52]) & 4294967295L & (4294967295 << i53);
                    iArr4[0] = (int) (((long) iArr4[0]) ^ (j14 >>> (32 - i30)));
                    int i55 = i52 - i32;
                    int i56 = i55 - 1;
                    if (i56 >= 0) {
                        iArr4[i56] = iArr4[i56] ^ ((int) (j14 << i54));
                    }
                    iArr4[i55] = (int) (((long) iArr4[i55]) ^ (j14 >>> (32 - i54)));
                    int i57 = i52 - i35;
                    int i58 = i57 - 1;
                    if (i58 >= 0) {
                        iArr4[i58] = iArr4[i58] ^ ((int) (j14 << i36));
                    }
                    iArr4[i57] = (int) (((long) iArr4[i57]) ^ (j14 >>> (32 - i36)));
                    int i59 = i52 - i38;
                    int i60 = i59 - 1;
                    if (i60 >= 0) {
                        iArr4[i60] = iArr4[i60] ^ ((int) (j14 << i39));
                    }
                    iArr4[i59] = (int) ((j14 >>> (32 - i39)) ^ ((long) iArr4[i59]));
                    iArr4[i52] = iArr4[i52] & GF2Polynomial.f91582h[i53];
                    gF2Polynomial2.f91584b = ((i51 - 1) >>> 5) + 1;
                    gF2Polynomial2.f91583a = i51;
                    return;
                }
            }
            int i61 = this.mDegree;
            int i62 = i61 - pc2[2];
            int i63 = i61 - pc2[1];
            int i64 = i61 - pc2[0];
            for (int length5 = this.f91604a.getLength() - 1; length5 >= this.mDegree; length5--) {
                if (this.f91604a.testBit(length5)) {
                    this.f91604a.xorBit(length5);
                    this.f91604a.xorBit(length5 - i62);
                    this.f91604a.xorBit(length5 - i63);
                    this.f91604a.xorBit(length5 - i64);
                    this.f91604a.xorBit(length5 - this.mDegree);
                }
            }
            this.f91604a.reduceN();
            this.f91604a.expandN(this.mDegree);
        } catch (RuntimeException unused2) {
            throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a pentanomial");
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nPolynomialElement(this);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nPolynomialElement)) {
            return false;
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) obj;
        GF2nField gF2nField = this.mField;
        if (gF2nField == gF2nPolynomialElement.mField || gF2nField.getFieldPolynomial().equals(gF2nPolynomialElement.mField.getFieldPolynomial())) {
            return this.f91604a.equals(gF2nPolynomialElement.f91604a);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return this.f91604a.hashCode() + this.mField.hashCode();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.increaseThis();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        this.f91604a.increaseThis();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() throws ArithmeticException {
        return invertMAIA();
    }

    public GF2nPolynomialElement invertEEA() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 32, "ONE");
        gF2Polynomial.reduceN();
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 32);
        gF2Polynomial2.reduceN();
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this.f91604a);
        GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        gF2Polynomial3.reduceN();
        while (!gF2Polynomial3.isOne()) {
            gF2Polynomial3.reduceN();
            fieldPolynomial.reduceN();
            int length = gF2Polynomial3.getLength() - fieldPolynomial.getLength();
            if (length < 0) {
                length = -length;
                gF2Polynomial.reduceN();
                GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                gF2Polynomial2 = gF2Polynomial;
                gF2Polynomial = gF2Polynomial4;
                GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                fieldPolynomial = gF2Polynomial3;
                gF2Polynomial3 = gF2Polynomial5;
            }
            gF2Polynomial3.shiftLeftAddThis(fieldPolynomial, length);
            gF2Polynomial.shiftLeftAddThis(gF2Polynomial2, length);
        }
        gF2Polynomial.reduceN();
        return new GF2nPolynomialElement((GF2nPolynomialField) this.mField, gF2Polynomial);
    }

    public GF2nPolynomialElement invertMAIA() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, "ONE");
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this.f91604a);
        GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        while (true) {
            if (!gF2Polynomial3.testBit(0)) {
                gF2Polynomial3.shiftRightThis();
                if (gF2Polynomial.testBit(0)) {
                    gF2Polynomial.addToThis(this.mField.getFieldPolynomial());
                }
                gF2Polynomial.shiftRightThis();
            } else {
                if (gF2Polynomial3.isOne()) {
                    return new GF2nPolynomialElement((GF2nPolynomialField) this.mField, gF2Polynomial);
                }
                gF2Polynomial3.reduceN();
                fieldPolynomial.reduceN();
                if (gF2Polynomial3.getLength() < fieldPolynomial.getLength()) {
                    GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                    gF2Polynomial2 = gF2Polynomial;
                    gF2Polynomial = gF2Polynomial4;
                    GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                    fieldPolynomial = gF2Polynomial3;
                    gF2Polynomial3 = gF2Polynomial5;
                }
                gF2Polynomial3.addToThis(fieldPolynomial);
                gF2Polynomial.addToThis(gF2Polynomial2);
            }
        }
    }

    public GF2nPolynomialElement invertSquare() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int degree = this.mField.getDegree() - 1;
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.f91604a.expandN((this.mDegree << 1) + 32);
        gF2nPolynomialElement.f91604a.reduceN();
        int i10 = 1;
        for (int iFloorLog = IntegerFunctions.floorLog(degree) - 1; iFloorLog >= 0; iFloorLog--) {
            GF2nPolynomialElement gF2nPolynomialElement2 = new GF2nPolynomialElement(gF2nPolynomialElement);
            for (int i11 = 1; i11 <= i10; i11++) {
                gF2nPolynomialElement2.squareThisPreCalc();
            }
            gF2nPolynomialElement.multiplyThisBy(gF2nPolynomialElement2);
            i10 <<= 1;
            if ((f91603b[iFloorLog] & degree) != 0) {
                gF2nPolynomialElement.squareThisPreCalc();
                gF2nPolynomialElement.multiplyThisBy(this);
                i10++;
            }
        }
        gF2nPolynomialElement.squareThisPreCalc();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        return this.f91604a.isOne();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        return this.f91604a.isZero();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.multiplyThisBy(gFElement);
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nPolynomialElement)) {
            throw new RuntimeException();
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) gFElement;
        if (!this.mField.equals(gF2nPolynomialElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
        } else {
            this.f91604a = this.f91604a.multiply(gF2nPolynomialElement.f91604a);
            c();
        }
    }

    public GF2nPolynomialElement power(int i10) {
        if (i10 == 1) {
            return new GF2nPolynomialElement(this);
        }
        GF2nPolynomialElement gF2nPolynomialElementONE = ONE((GF2nPolynomialField) this.mField);
        if (i10 == 0) {
            return gF2nPolynomialElementONE;
        }
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.f91604a.expandN((gF2nPolynomialElement.mDegree << 1) + 32);
        gF2nPolynomialElement.f91604a.reduceN();
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            if (((1 << i11) & i10) != 0) {
                gF2nPolynomialElementONE.multiplyThisBy(gF2nPolynomialElement);
            }
            gF2nPolynomialElement.square();
        }
        return gF2nPolynomialElementONE;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        GF2nPolynomialElement gF2nPolynomialElementZERO;
        GF2nPolynomialElement gF2nPolynomialElement;
        if (isZero()) {
            return ZERO((GF2nPolynomialField) this.mField);
        }
        int i10 = this.mDegree;
        if ((i10 & 1) == 1) {
            if ((i10 & 1) == 0) {
                throw new RuntimeException();
            }
            GF2nPolynomialElement gF2nPolynomialElement2 = new GF2nPolynomialElement(this);
            for (int i11 = 1; i11 <= ((this.mDegree - 1) >> 1); i11++) {
                gF2nPolynomialElement2.squareThis();
                gF2nPolynomialElement2.squareThis();
                gF2nPolynomialElement2.addToThis(this);
            }
            return gF2nPolynomialElement2;
        }
        do {
            GF2nPolynomialElement gF2nPolynomialElement3 = new GF2nPolynomialElement((GF2nPolynomialField) this.mField, new Random());
            gF2nPolynomialElementZERO = ZERO((GF2nPolynomialField) this.mField);
            gF2nPolynomialElement = (GF2nPolynomialElement) gF2nPolynomialElement3.clone();
            for (int i12 = 1; i12 < this.mDegree; i12++) {
                gF2nPolynomialElementZERO.squareThis();
                gF2nPolynomialElement.squareThis();
                gF2nPolynomialElementZERO.addToThis(gF2nPolynomialElement.multiply(this));
                gF2nPolynomialElement.addToThis(gF2nPolynomialElement3);
            }
        } while (gF2nPolynomialElement.isZero());
        if (equals(gF2nPolynomialElementZERO.square().add(gF2nPolynomialElementZERO))) {
            return gF2nPolynomialElementZERO;
        }
        throw new RuntimeException();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        return squarePreCalc();
    }

    public GF2nPolynomialElement squareBitwise() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisBitwise();
        gF2nPolynomialElement.c();
        return gF2nPolynomialElement;
    }

    public GF2nPolynomialElement squareMatrix() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisMatrix();
        gF2nPolynomialElement.c();
        return gF2nPolynomialElement;
    }

    public GF2nPolynomialElement squarePreCalc() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisPreCalc();
        gF2nPolynomialElement.c();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareRootThis();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        this.f91604a.expandN((this.mDegree << 1) + 32);
        this.f91604a.reduceN();
        for (int i10 = 0; i10 < this.mField.getDegree() - 1; i10++) {
            squareThis();
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        squareThisPreCalc();
    }

    public void squareThisBitwise() {
        this.f91604a.squareThisBitwise();
        c();
    }

    public void squareThisMatrix() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree);
        int i10 = 0;
        while (true) {
            int i11 = this.mDegree;
            if (i10 >= i11) {
                this.f91604a = gF2Polynomial;
                return;
            } else {
                if (this.f91604a.vectorMult(((GF2nPolynomialField) this.mField).f91605a[(i11 - i10) - 1])) {
                    gF2Polynomial.setBit(i10);
                }
                i10++;
            }
        }
    }

    public void squareThisPreCalc() {
        this.f91604a.squareThisPreCalc();
        c();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return this.f91604a.testBit(0);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        return this.f91604a.toByteArray();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return this.f91604a.toFlexiBigInt();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return this.f91604a.toString(16);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        for (int i10 = 1; i10 < this.mDegree; i10++) {
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.addToThis(this);
        }
        return gF2nPolynomialElement.isOne() ? 1 : 0;
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, Random random) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree);
        this.f91604a = gF2Polynomial;
        gF2Polynomial.expandN(this.mDegree);
        this.f91604a.randomize(random);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i10) {
        return this.f91604a.toString(i10);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, GF2Polynomial gF2Polynomial) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
        this.f91604a = gF2Polynomial2;
        gF2Polynomial2.expandN(this.mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, byte[] bArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, bArr);
        this.f91604a = gF2Polynomial;
        gF2Polynomial.expandN(this.mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, int[] iArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, iArr);
        this.f91604a = gF2Polynomial;
        gF2Polynomial.expandN(gF2nPolynomialField.mDegree);
    }
}
