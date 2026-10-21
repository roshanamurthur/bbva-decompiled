package org.bouncycastle.pqc.math.linearalgebra;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GF2mVector extends Vector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GF2mField f91589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f91590b;

    public GF2mVector(GF2mField gF2mField, byte[] bArr) {
        this.f91589a = new GF2mField(gF2mField);
        int i10 = 8;
        int i11 = 1;
        while (gF2mField.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        if (bArr.length % i11 != 0) {
            throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
        }
        int length = bArr.length / i11;
        this.length = length;
        this.f91590b = new int[length];
        int i12 = 0;
        for (int i13 = 0; i13 < this.f91590b.length; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                int[] iArr = this.f91590b;
                iArr[i13] = ((bArr[i12] & 255) << i14) | iArr[i13];
                i14 += 8;
                i12++;
            }
            if (!gF2mField.isElementOfThisField(this.f91590b[i13])) {
                throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        throw new RuntimeException("not implemented");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2mVector)) {
            return false;
        }
        GF2mVector gF2mVector = (GF2mVector) obj;
        if (this.f91589a.equals(gF2mVector.f91589a)) {
            return IntUtils.equals(this.f91590b, gF2mVector.f91590b);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        int i10 = 8;
        int i11 = 1;
        while (this.f91589a.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        int[] iArr = this.f91590b;
        byte[] bArr = new byte[iArr.length * i11];
        int i12 = 0;
        for (int i13 : iArr) {
            int i14 = 0;
            while (i14 < i10) {
                bArr[i12] = (byte) (i13 >>> i14);
                i14 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public GF2mField getField() {
        return this.f91589a;
    }

    public int[] getIntArrayForm() {
        return IntUtils.clone(this.f91590b);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.f91590b) + (this.f91589a.hashCode() * 31);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        int[] iArr = this.f91590b;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (iArr[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int i10 = this.length;
        if (i10 != vector.length) {
            throw new ArithmeticException("permutation size and vector size mismatch");
        }
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < vector.length; i11++) {
            iArr[i11] = this.f91590b[vector[i11]];
        }
        return new GF2mVector(this.f91589a, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f91590b;
            if (i10 >= iArr.length) {
                return stringBuffer.toString();
            }
            for (int i11 = 0; i11 < this.f91589a.getDegree(); i11++) {
                stringBuffer.append(((1 << (i11 & 31)) & iArr[i10]) != 0 ? '1' : '0');
            }
            stringBuffer.append(' ');
            i10++;
        }
    }

    public GF2mVector(GF2mField gF2mField, int[] iArr) {
        this.f91589a = gF2mField;
        this.length = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!gF2mField.isElementOfThisField(iArr[length])) {
                throw new ArithmeticException("Element array is not specified over the given finite field.");
            }
        }
        this.f91590b = IntUtils.clone(iArr);
    }

    public GF2mVector(GF2mVector gF2mVector) {
        this.f91589a = new GF2mField(gF2mVector.f91589a);
        this.length = gF2mVector.length;
        this.f91590b = IntUtils.clone(gF2mVector.f91590b);
    }
}
