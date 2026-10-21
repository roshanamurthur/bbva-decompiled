package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GF2Matrix extends Matrix {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int[][] f91576p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f91577q0;

    public GF2Matrix(int i10, char c10) {
        this(i10, c10, new SecureRandom());
    }

    public static GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i10, SecureRandom secureRandom) {
        GF2Matrix[] gF2MatrixArr = new GF2Matrix[2];
        int i11 = (i10 + 31) >> 5;
        GF2Matrix gF2Matrix = new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom);
        GF2Matrix gF2Matrix2 = new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom);
        GF2Matrix gF2Matrix3 = (GF2Matrix) gF2Matrix.rightMultiply(gF2Matrix2);
        Permutation permutation = new Permutation(i10, secureRandom);
        int[] vector = permutation.getVector();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i11);
        for (int i12 = 0; i12 < i10; i12++) {
            System.arraycopy(gF2Matrix3.f91576p0[vector[i12]], 0, iArr[i12], 0, i11);
        }
        gF2MatrixArr[0] = new GF2Matrix(i10, iArr);
        GF2Matrix gF2Matrix4 = new GF2Matrix(i10, 'I');
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i13 >>> 5;
            int i15 = 1 << (i13 & 31);
            int i16 = i13 + 1;
            for (int i17 = i16; i17 < i10; i17++) {
                if ((gF2Matrix.f91576p0[i17][i14] & i15) != 0) {
                    for (int i18 = 0; i18 <= i14; i18++) {
                        int[][] iArr2 = gF2Matrix4.f91576p0;
                        int[] iArr3 = iArr2[i17];
                        iArr3[i18] = iArr3[i18] ^ iArr2[i13][i18];
                    }
                }
            }
            i13 = i16;
        }
        GF2Matrix gF2Matrix5 = new GF2Matrix(i10, 'I');
        for (int i19 = i10 - 1; i19 >= 0; i19--) {
            int i20 = i19 >>> 5;
            int i21 = 1 << (i19 & 31);
            for (int i22 = i19 - 1; i22 >= 0; i22--) {
                if ((gF2Matrix2.f91576p0[i22][i20] & i21) != 0) {
                    for (int i23 = i20; i23 < i11; i23++) {
                        int[][] iArr4 = gF2Matrix5.f91576p0;
                        int[] iArr5 = iArr4[i22];
                        iArr5[i23] = iArr4[i19][i23] ^ iArr5[i23];
                    }
                }
            }
        }
        gF2MatrixArr[1] = (GF2Matrix) gF2Matrix5.rightMultiply(gF2Matrix4.rightMultiply(permutation));
        return gF2MatrixArr;
    }

    public final void a(int i10, int i11) {
        this.numRows = i10;
        this.numColumns = i11;
        int i12 = (i11 + 31) >>> 5;
        this.f91577q0 = i12;
        this.f91576p0 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i12);
        for (int i13 = 0; i13 < this.numRows; i13++) {
            for (int i14 = 0; i14 < this.f91577q0; i14++) {
                this.f91576p0[i13][i14] = 0;
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i10 = this.numRows;
        if (i10 != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, this.f91577q0);
        for (int i11 = this.numRows - 1; i11 >= 0; i11--) {
            iArr[i11] = IntUtils.clone(this.f91576p0[i11]);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.f91577q0);
        for (int i12 = this.numRows - 1; i12 >= 0; i12--) {
            iArr2[i12][i12 >> 5] = 1 << (i12 & 31);
        }
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int i14 = i13 >> 5;
            int i15 = 1 << (i13 & 31);
            if ((iArr[i13][i14] & i15) == 0) {
                int i16 = i13 + 1;
                boolean z10 = false;
                while (true) {
                    int i17 = this.numRows;
                    if (i16 >= i17) {
                        break;
                    }
                    int[] iArr3 = iArr[i16];
                    if ((iArr3[i14] & i15) != 0) {
                        int[] iArr4 = iArr[i13];
                        iArr[i13] = iArr3;
                        iArr[i16] = iArr4;
                        int[] iArr5 = iArr2[i13];
                        iArr2[i13] = iArr2[i16];
                        iArr2[i16] = iArr5;
                        z10 = true;
                        i16 = i17;
                    }
                    i16++;
                }
                if (!z10) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int i18 = this.numRows - 1; i18 >= 0; i18--) {
                if (i18 != i13) {
                    int[] iArr6 = iArr[i18];
                    if ((iArr6[i14] & i15) != 0) {
                        int[] iArr7 = iArr[i13];
                        for (int length = iArr6.length - 1; length >= i14; length--) {
                            iArr6[length] = iArr7[length] ^ iArr6[length];
                        }
                        int[] iArr8 = iArr2[i13];
                        int[] iArr9 = iArr2[i18];
                        for (int length2 = iArr9.length - 1; length2 >= 0; length2--) {
                            iArr9[length2] = iArr8[length2] ^ iArr9[length2];
                        }
                    }
                }
            }
        }
        return new GF2Matrix(this.numColumns, iArr2);
    }

    public Matrix computeTranspose() {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numColumns, (this.numRows + 31) >>> 5);
        int i10 = 0;
        while (true) {
            int i11 = this.numRows;
            if (i10 >= i11) {
                return new GF2Matrix(i11, iArr);
            }
            for (int i12 = 0; i12 < this.numColumns; i12++) {
                int i13 = i10 >>> 5;
                int i14 = i10 & 31;
                if (((this.f91576p0[i10][i12 >>> 5] >>> (i12 & 31)) & 1) == 1) {
                    int[] iArr2 = iArr[i12];
                    iArr2[i13] = (1 << i14) | iArr2[i13];
                }
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Matrix)) {
            return false;
        }
        GF2Matrix gF2Matrix = (GF2Matrix) obj;
        if (this.numRows != gF2Matrix.numRows || this.numColumns != gF2Matrix.numColumns || this.f91577q0 != gF2Matrix.f91577q0) {
            return false;
        }
        for (int i10 = 0; i10 < this.numRows; i10++) {
            if (!IntUtils.equals(this.f91576p0[i10], gF2Matrix.f91576p0[i10])) {
                return false;
            }
        }
        return true;
    }

    public GF2Matrix extendLeftCompactForm() {
        int i10 = this.numColumns;
        int i11 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i11, i10 + i11);
        int i12 = this.numRows;
        int i13 = (i12 - 1) + this.numColumns;
        int i14 = i12 - 1;
        while (i14 >= 0) {
            System.arraycopy(this.f91576p0[i14], 0, gF2Matrix.f91576p0[i14], 0, this.f91577q0);
            int[] iArr = gF2Matrix.f91576p0[i14];
            int i15 = i13 >> 5;
            iArr[i15] = iArr[i15] | (1 << (i13 & 31));
            i14--;
            i13--;
        }
        return gF2Matrix;
    }

    public GF2Matrix extendRightCompactForm() {
        int i10;
        int i11 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i11, this.numColumns + i11);
        int i12 = this.numRows;
        int i13 = i12 >> 5;
        int i14 = i12 & 31;
        for (int i15 = i12 - 1; i15 >= 0; i15--) {
            int[] iArr = gF2Matrix.f91576p0[i15];
            int i16 = i15 >> 5;
            iArr[i16] = iArr[i16] | (1 << (i15 & 31));
            int i17 = 0;
            if (i14 != 0) {
                int i18 = i13;
                while (true) {
                    i10 = this.f91577q0;
                    if (i17 >= i10 - 1) {
                        break;
                    }
                    int i19 = this.f91576p0[i15][i17];
                    int[] iArr2 = gF2Matrix.f91576p0[i15];
                    int i20 = i18 + 1;
                    iArr2[i18] = iArr2[i18] | (i19 << i14);
                    iArr2[i20] = iArr2[i20] | (i19 >>> (32 - i14));
                    i17++;
                    i18 = i20;
                }
                int i21 = this.f91576p0[i15][i10 - 1];
                int[] iArr3 = gF2Matrix.f91576p0[i15];
                int i22 = i18 + 1;
                iArr3[i18] = iArr3[i18] | (i21 << i14);
                if (i22 < gF2Matrix.f91577q0) {
                    iArr3[i22] = iArr3[i22] | (i21 >>> (32 - i14));
                }
            } else {
                System.arraycopy(this.f91576p0[i15], 0, iArr, i13, this.f91577q0);
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i10 = (this.numColumns + 7) >>> 3;
        int i11 = this.numRows;
        int i12 = 8;
        byte[] bArr = new byte[(i10 * i11) + 8];
        LittleEndianConversions.I2OSP(i11, bArr, 0);
        LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i13 = this.numColumns;
        int i14 = i13 >>> 5;
        int i15 = i13 & 31;
        for (int i16 = 0; i16 < this.numRows; i16++) {
            int i17 = 0;
            while (i17 < i14) {
                LittleEndianConversions.I2OSP(this.f91576p0[i16][i17], bArr, i12);
                i17++;
                i12 += 4;
            }
            int i18 = 0;
            while (i18 < i15) {
                bArr[i12] = (byte) ((this.f91576p0[i16][i14] >>> i18) & 255);
                i18 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public double getHammingWeight() {
        int i10 = this.numColumns & 31;
        int i11 = this.f91577q0;
        if (i10 != 0) {
            i11--;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (int i12 = 0; i12 < this.numRows; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f91576p0[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    d2 += (double) ((i14 >>> i15) & 1);
                    d3 += 1.0d;
                }
            }
            int i16 = this.f91576p0[i12][this.f91577q0 - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                d2 += (double) ((i16 >>> i17) & 1);
                d3 += 1.0d;
            }
        }
        return d2 / d3;
    }

    public int[][] getIntArray() {
        return this.f91576p0;
    }

    public GF2Matrix getLeftSubMatrix() {
        int i10 = this.numColumns;
        int i11 = this.numRows;
        if (i10 <= i11) {
            throw new ArithmeticException("empty submatrix");
        }
        int i12 = (i11 + 31) >> 5;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i12);
        int i13 = this.numRows;
        int i14 = (1 << (i13 & 31)) - 1;
        if (i14 == 0) {
            i14 = -1;
        }
        for (int i15 = i13 - 1; i15 >= 0; i15--) {
            System.arraycopy(this.f91576p0[i15], 0, iArr[i15], 0, i12);
            int[] iArr2 = iArr[i15];
            int i16 = i12 - 1;
            iArr2[i16] = iArr2[i16] & i14;
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public int getLength() {
        return this.f91577q0;
    }

    public GF2Matrix getRightSubMatrix() {
        int i10;
        int i11 = this.numColumns;
        int i12 = this.numRows;
        if (i11 <= i12) {
            throw new ArithmeticException("empty submatrix");
        }
        int i13 = i12 >> 5;
        int i14 = i12 & 31;
        GF2Matrix gF2Matrix = new GF2Matrix(i12, i11 - i12);
        for (int i15 = this.numRows - 1; i15 >= 0; i15--) {
            int i16 = 0;
            if (i14 != 0) {
                int i17 = i13;
                while (true) {
                    i10 = gF2Matrix.f91577q0;
                    if (i16 >= i10 - 1) {
                        break;
                    }
                    int[] iArr = gF2Matrix.f91576p0[i15];
                    int[] iArr2 = this.f91576p0[i15];
                    int i18 = i17 + 1;
                    iArr[i16] = (iArr2[i17] >>> i14) | (iArr2[i18] << (32 - i14));
                    i16++;
                    i17 = i18;
                }
                int[] iArr3 = gF2Matrix.f91576p0[i15];
                int[] iArr4 = this.f91576p0[i15];
                int i19 = i17 + 1;
                iArr3[i10 - 1] = iArr4[i17] >>> i14;
                if (i19 < this.f91577q0) {
                    int i20 = i10 - 1;
                    iArr3[i20] = iArr3[i20] | (iArr4[i19] << (32 - i14));
                }
            } else {
                System.arraycopy(this.f91576p0[i15], i13, gF2Matrix.f91576p0[i15], 0, gF2Matrix.f91577q0);
            }
        }
        return gF2Matrix;
    }

    public int[] getRow(int i10) {
        return this.f91576p0[i10];
    }

    public int hashCode() {
        int iHashCode = (((this.numRows * 31) + this.numColumns) * 31) + this.f91577q0;
        for (int i10 = 0; i10 < this.numRows; i10++) {
            iHashCode = (iHashCode * 31) + Arrays.hashCode(this.f91576p0[i10]);
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.f91577q0; i11++) {
                if (this.f91576p0[i10][i11] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matrix leftMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i10 = this.numRows;
        if (length != i10) {
            throw new ArithmeticException("length mismatch");
        }
        int[][] iArr = new int[i10][];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            iArr[i11] = IntUtils.clone(this.f91576p0[vector[i11]]);
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public Vector leftMultiplyLeftCompactForm(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i10 = this.numRows;
        int[] iArr = new int[((this.numColumns + i10) + 31) >>> 5];
        int i11 = i10 >>> 5;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 1;
            do {
                if ((vecArray[i13] & i14) != 0) {
                    for (int i15 = 0; i15 < this.f91577q0; i15++) {
                        iArr[i15] = iArr[i15] ^ this.f91576p0[i12][i15];
                    }
                    int i16 = this.numColumns;
                    int i17 = (i16 + i12) >>> 5;
                    iArr[i17] = (1 << ((i16 + i12) & 31)) | iArr[i17];
                }
                i12++;
                i14 <<= 1;
            } while (i14 != 0);
        }
        int i18 = 1 << (this.numRows & 31);
        for (int i19 = 1; i19 != i18; i19 <<= 1) {
            if ((vecArray[i11] & i19) != 0) {
                for (int i20 = 0; i20 < this.f91577q0; i20++) {
                    iArr[i20] = iArr[i20] ^ this.f91576p0[i12][i20];
                }
                int i21 = this.numColumns;
                int i22 = (i21 + i12) >>> 5;
                iArr[i22] = (1 << ((i21 + i12) & 31)) | iArr[i22];
            }
            i12++;
        }
        return new GF2Vector(iArr, this.numRows + this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        if (!(matrix instanceof GF2Matrix)) {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        }
        if (matrix.numRows != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = (GF2Matrix) matrix;
        GF2Matrix gF2Matrix2 = new GF2Matrix(this.numRows, matrix.numColumns);
        int i10 = this.numColumns & 31;
        int i11 = this.f91577q0;
        if (i10 != 0) {
            i11--;
        }
        for (int i12 = 0; i12 < this.numRows; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = this.f91576p0[i12][i14];
                for (int i16 = 0; i16 < 32; i16++) {
                    if (((1 << i16) & i15) != 0) {
                        for (int i17 = 0; i17 < gF2Matrix.f91577q0; i17++) {
                            int[] iArr = gF2Matrix2.f91576p0[i12];
                            iArr[i17] = iArr[i17] ^ gF2Matrix.f91576p0[i13][i17];
                        }
                    }
                    i13++;
                }
            }
            int i18 = this.f91576p0[i12][this.f91577q0 - 1];
            for (int i19 = 0; i19 < i10; i19++) {
                if (((1 << i19) & i18) != 0) {
                    for (int i20 = 0; i20 < gF2Matrix.f91577q0; i20++) {
                        int[] iArr2 = gF2Matrix2.f91576p0[i12];
                        iArr2[i20] = iArr2[i20] ^ gF2Matrix.f91576p0[i13][i20];
                    }
                }
                i13++;
            }
        }
        return gF2Matrix2;
    }

    public Vector rightMultiplyRightCompactForm(Vector vector) {
        int i10;
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns + this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i11 = this.numRows;
        int[] iArr = new int[(i11 + 31) >>> 5];
        int i12 = i11 >> 5;
        int i13 = i11 & 31;
        int i14 = 0;
        while (true) {
            int i15 = this.numRows;
            if (i14 >= i15) {
                return new GF2Vector(iArr, i15);
            }
            int i16 = i14 >> 5;
            int i17 = i14 & 31;
            int i18 = (vecArray[i16] >>> i17) & 1;
            int i19 = i12;
            int i20 = 0;
            if (i13 != 0) {
                while (true) {
                    i10 = this.f91577q0;
                    if (i20 >= i10 - 1) {
                        break;
                    }
                    int i21 = i19 + 1;
                    i18 ^= ((vecArray[i19] >>> i13) | (vecArray[i21] << (32 - i13))) & this.f91576p0[i14][i20];
                    i20++;
                    i19 = i21;
                }
                int i22 = i19 + 1;
                int i23 = vecArray[i19] >>> i13;
                if (i22 < vecArray.length) {
                    i23 |= vecArray[i22] << (32 - i13);
                }
                i18 ^= this.f91576p0[i14][i10 - 1] & i23;
            } else {
                while (i20 < this.f91577q0) {
                    i18 ^= vecArray[i19] & this.f91576p0[i14][i20];
                    i20++;
                    i19++;
                }
            }
            int i24 = 0;
            for (int i25 = 0; i25 < 32; i25++) {
                i24 ^= i18 & 1;
                i18 >>>= 1;
            }
            if (i24 == 1) {
                iArr[i16] = iArr[i16] | (1 << i17);
            }
            i14++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        int i10 = this.numColumns & 31;
        int i11 = this.f91577q0;
        if (i10 != 0) {
            i11--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < this.numRows; i12++) {
            stringBuffer.append(i12 + ": ");
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f91576p0[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    if (((i14 >>> i15) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i16 = this.f91576p0[i12][this.f91577q0 - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                if (((i16 >>> i17) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public GF2Matrix(int i10, char c10, SecureRandom secureRandom) {
        int i11;
        if (i10 <= 0) {
            throw new ArithmeticException("Size of matrix is non-positive.");
        }
        if (c10 == 'I') {
            this.numRows = i10;
            this.numColumns = i10;
            int i12 = (i10 + 31) >>> 5;
            this.f91577q0 = i12;
            this.f91576p0 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i12);
            for (int i13 = 0; i13 < this.numRows; i13++) {
                for (int i14 = 0; i14 < this.f91577q0; i14++) {
                    this.f91576p0[i13][i14] = 0;
                }
            }
            for (int i15 = 0; i15 < this.numRows; i15++) {
                this.f91576p0[i15][i15 >>> 5] = 1 << (i15 & 31);
            }
            return;
        }
        if (c10 == 'L') {
            this.numRows = i10;
            this.numColumns = i10;
            int i16 = (i10 + 31) >>> 5;
            this.f91577q0 = i16;
            this.f91576p0 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i16);
            for (int i17 = 0; i17 < this.numRows; i17++) {
                int i18 = i17 >>> 5;
                int i19 = i17 & 31;
                int i20 = 31 - i19;
                int i21 = 1 << i19;
                for (int i22 = 0; i22 < i18; i22++) {
                    this.f91576p0[i17][i22] = secureRandom.nextInt();
                }
                this.f91576p0[i17][i18] = i21 | (secureRandom.nextInt() >>> i20);
                while (true) {
                    i18++;
                    if (i18 < this.f91577q0) {
                        this.f91576p0[i17][i18] = 0;
                    }
                }
            }
            return;
        }
        if (c10 == 'R') {
            this.numRows = i10;
            this.numColumns = i10;
            int i23 = (i10 + 31) >>> 5;
            this.f91577q0 = i23;
            this.f91576p0 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i23);
            GF2Matrix gF2Matrix = (GF2Matrix) new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom).rightMultiply(new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom));
            int[] vector = new Permutation(i10, secureRandom).getVector();
            for (int i24 = 0; i24 < i10; i24++) {
                System.arraycopy(gF2Matrix.f91576p0[i24], 0, this.f91576p0[vector[i24]], 0, this.f91577q0);
            }
            return;
        }
        if (c10 != 'U') {
            if (c10 != 'Z') {
                throw new ArithmeticException("Unknown matrix type.");
            }
            a(i10, i10);
            return;
        }
        this.numRows = i10;
        this.numColumns = i10;
        int i25 = (i10 + 31) >>> 5;
        this.f91577q0 = i25;
        this.f91576p0 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i25);
        int i26 = i10 & 31;
        int i27 = i26 == 0 ? -1 : (1 << i26) - 1;
        for (int i28 = 0; i28 < this.numRows; i28++) {
            int i29 = i28 >>> 5;
            int i30 = i28 & 31;
            int i31 = 1 << i30;
            for (int i32 = 0; i32 < i29; i32++) {
                this.f91576p0[i28][i32] = 0;
            }
            this.f91576p0[i28][i29] = (secureRandom.nextInt() << i30) | i31;
            while (true) {
                i29++;
                i11 = this.f91577q0;
                if (i29 < i11) {
                    this.f91576p0[i28][i29] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.f91576p0[i28];
            int i33 = i11 - 1;
            iArr[i33] = iArr[i33] & i27;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[this.f91577q0];
        int i10 = this.numRows;
        int i11 = i10 >> 5;
        int i12 = 1 << (i10 & 31);
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = 1;
            do {
                if ((vecArray[i14] & i15) != 0) {
                    for (int i16 = 0; i16 < this.f91577q0; i16++) {
                        iArr[i16] = iArr[i16] ^ this.f91576p0[i13][i16];
                    }
                }
                i13++;
                i15 <<= 1;
            } while (i15 != 0);
        }
        for (int i17 = 1; i17 != i12; i17 <<= 1) {
            if ((vecArray[i11] & i17) != 0) {
                for (int i18 = 0; i18 < this.f91577q0; i18++) {
                    iArr[i18] = iArr[i18] ^ this.f91576p0[i13][i18];
                }
            }
            i13++;
        }
        return new GF2Vector(iArr, this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i10 = this.numColumns;
        if (length != i10) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, i10);
        for (int i11 = this.numColumns - 1; i11 >= 0; i11--) {
            int i12 = i11 >>> 5;
            int i13 = i11 & 31;
            int i14 = vector[i11];
            int i15 = i14 >>> 5;
            int i16 = i14 & 31;
            for (int i17 = this.numRows - 1; i17 >= 0; i17--) {
                int[] iArr = gF2Matrix.f91576p0[i17];
                iArr[i12] = iArr[i12] | (((this.f91576p0[i17][i15] >>> i16) & 1) << i13);
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        int i10 = 0;
        while (true) {
            int i11 = this.numRows;
            if (i10 >= i11) {
                return new GF2Vector(iArr, i11);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f91577q0; i13++) {
                i12 ^= this.f91576p0[i10][i13] & vecArray[i13];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < 32; i15++) {
                i14 ^= (i12 >>> i15) & 1;
            }
            if (i14 == 1) {
                int i16 = i10 >>> 5;
                iArr[i16] = iArr[i16] | (1 << (i10 & 31));
            }
            i10++;
        }
    }

    public GF2Matrix(int i10, int i11) {
        if (i11 <= 0 || i10 <= 0) {
            throw new ArithmeticException("size of matrix is non-positive");
        }
        a(i10, i11);
    }

    public GF2Matrix(int i10, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i10 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i10;
        this.numRows = iArr.length;
        this.f91577q0 = iArr2.length;
        int i11 = i10 & 31;
        int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int[] iArr3 = iArr[i13];
            int i14 = this.f91577q0 - 1;
            iArr3[i14] = iArr3[i14] & i12;
        }
        this.f91576p0 = iArr;
    }

    public GF2Matrix(GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.f91577q0 = gF2Matrix.f91577q0;
        this.f91576p0 = new int[gF2Matrix.f91576p0.length][];
        int i10 = 0;
        while (true) {
            int[][] iArr = this.f91576p0;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = IntUtils.clone(gF2Matrix.f91576p0[i10]);
            i10++;
        }
    }

    public GF2Matrix(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.numRows = LittleEndianConversions.OS2IP(bArr, 0);
        int iOS2IP = LittleEndianConversions.OS2IP(bArr, 4);
        this.numColumns = iOS2IP;
        int i10 = this.numRows;
        int i11 = ((iOS2IP + 7) >>> 3) * i10;
        if (i10 > 0) {
            int i12 = 8;
            if (i11 == bArr.length - 8) {
                int i13 = (iOS2IP + 31) >>> 5;
                this.f91577q0 = i13;
                this.f91576p0 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i13);
                int i14 = this.numColumns;
                int i15 = i14 >> 5;
                int i16 = i14 & 31;
                for (int i17 = 0; i17 < this.numRows; i17++) {
                    int i18 = 0;
                    while (i18 < i15) {
                        this.f91576p0[i17][i18] = LittleEndianConversions.OS2IP(bArr, i12);
                        i18++;
                        i12 += 4;
                    }
                    int i19 = 0;
                    while (i19 < i16) {
                        int[] iArr = this.f91576p0[i17];
                        iArr[i15] = ((bArr[i12] & 255) << i19) ^ iArr[i15];
                        i19 += 8;
                        i12++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
