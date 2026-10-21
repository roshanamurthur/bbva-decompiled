package cz.muni.fi.xklinex.whiteboxAES.generator;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.IntUtils;
import org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.Vector;

/* JADX INFO: loaded from: classes7.dex */
public class GF2MatrixEx extends Matrix implements Serializable {
    public static final int BLOCKEXP = 5;
    public static final int INTMASK = 31;
    public static final int INTSIZE = 32;
    private static final long serialVersionUID = 2691400975418627511L;
    private int length;
    private int[][] matrix;

    public GF2MatrixEx() {
    }

    public static void addToRow(int[] iArr, int[] iArr2, int i10) {
        for (int length = iArr2.length - 1; length >= i10; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    public static int get(int[] iArr, int i10) {
        int i11 = iArr[i10 >>> 5];
        int i12 = i10 & 31;
        return (i11 & (1 << i12)) >> i12;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.numRows = objectInputStream.readInt();
        this.numColumns = objectInputStream.readInt();
        objectInputStream.defaultReadObject();
    }

    public static void set(int[] iArr, int i10, int i11) {
        if (i11 == 0) {
            int i12 = i10 >>> 5;
            iArr[i12] = (~(1 << (i10 & 31))) & iArr[i12];
        } else {
            int i13 = i10 >>> 5;
            iArr[i13] = (1 << (i10 & 31)) | iArr[i13];
        }
    }

    public static void swapRows(int[][] iArr, int i10, int i11) {
        int[] iArr2 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = iArr2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.numRows);
        objectOutputStream.writeInt(this.numColumns);
        objectOutputStream.defaultWriteObject();
    }

    public void assignZeroMatrix(int i10, int i11) {
        this.numRows = i10;
        this.numColumns = i11;
        int i12 = (i11 + 31) >>> 5;
        this.length = i12;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i12);
        for (int i13 = 0; i13 < this.numRows; i13++) {
            for (int i14 = 0; i14 < this.length; i14++) {
                this.matrix[i13][i14] = 0;
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i10 = this.numRows;
        if (i10 != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, this.length);
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            iArr[i11] = IntUtils.clone(this.matrix[i11]);
        }
        int i12 = this.numRows;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i12, this.length);
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            iArr2[i13][i13 >> 5] = 1 << (i13 & 31);
        }
        for (int i14 = 0; i14 < this.numRows; i14++) {
            int i15 = i14 >> 5;
            int i16 = 1 << (i14 & 31);
            if ((iArr[i14][i15] & i16) == 0) {
                int i17 = i14 + 1;
                boolean z10 = false;
                while (i17 < this.numRows) {
                    if ((iArr[i17][i15] & i16) != 0) {
                        swapRows(iArr, i14, i17);
                        swapRows(iArr2, i14, i17);
                        i17 = this.numRows;
                        z10 = true;
                    }
                    i17++;
                }
                if (!z10) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int i18 = this.numRows - 1; i18 >= 0; i18--) {
                if (i18 != i14) {
                    int[] iArr3 = iArr[i18];
                    if ((iArr3[i15] & i16) != 0) {
                        addToRow(iArr[i14], iArr3, i15);
                        addToRow(iArr2[i14], iArr2[i18], 0);
                    }
                }
            }
        }
        return new GF2MatrixEx(this.numColumns, iArr2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GF2MatrixEx)) {
            return false;
        }
        GF2MatrixEx gF2MatrixEx = (GF2MatrixEx) obj;
        if (this.numRows != gF2MatrixEx.numRows || this.numColumns != gF2MatrixEx.numColumns || this.length != gF2MatrixEx.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.numRows; i10++) {
            if (!IntUtils.equals(this.matrix[i10], gF2MatrixEx.matrix[i10])) {
                return false;
            }
        }
        return true;
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
                LittleEndianConversions.I2OSP(this.matrix[i16][i17], bArr, i12);
                i17++;
                i12 += 4;
            }
            int i18 = 0;
            while (i18 < i15) {
                bArr[i12] = (byte) ((this.matrix[i16][i14] >>> i18) & 255);
                i18 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int iHashCode = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i10 = 0; i10 < this.numRows; i10++) {
            iHashCode = (iHashCode * 31) + Arrays.hashCode(this.matrix[i10]);
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.length; i11++) {
                if (this.matrix[i10][i11] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.getLength() != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[this.length];
        int i10 = this.numRows;
        int i11 = i10 >> 5;
        int i12 = 1 << (i10 & 31);
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = 1;
            do {
                if ((vecArray[i14] & i15) != 0) {
                    for (int i16 = 0; i16 < this.length; i16++) {
                        iArr[i16] = iArr[i16] ^ this.matrix[i13][i16];
                    }
                }
                i13++;
                i15 <<= 1;
            } while (i15 != 0);
        }
        for (int i17 = 1; i17 != i12; i17 <<= 1) {
            if ((vecArray[i11] & i17) != 0) {
                for (int i18 = 0; i18 < this.length; i18++) {
                    iArr[i18] = iArr[i18] ^ this.matrix[i13][i18];
                }
            }
            i13++;
        }
        return new GF2Vector(this.numColumns, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        if (!(matrix instanceof GF2MatrixEx)) {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        }
        if (matrix.getNumRows() != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        GF2MatrixEx gF2MatrixEx = (GF2MatrixEx) matrix;
        GF2MatrixEx gF2MatrixEx2 = new GF2MatrixEx(this.numRows, matrix.getNumColumns());
        int i10 = this.numColumns & 31;
        int i11 = i10 == 0 ? this.length : this.length - 1;
        for (int i12 = 0; i12 < this.numRows; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = this.matrix[i12][i14];
                for (int i16 = 0; i16 < 32; i16++) {
                    if (((1 << i16) & i15) != 0) {
                        for (int i17 = 0; i17 < gF2MatrixEx.length; i17++) {
                            int[] iArr = gF2MatrixEx2.matrix[i12];
                            iArr[i17] = iArr[i17] ^ gF2MatrixEx.matrix[i13][i17];
                        }
                    }
                    i13++;
                }
            }
            int i18 = this.matrix[i12][this.length - 1];
            for (int i19 = 0; i19 < i10; i19++) {
                if (((1 << i19) & i18) != 0) {
                    for (int i20 = 0; i20 < gF2MatrixEx.length; i20++) {
                        int[] iArr2 = gF2MatrixEx2.matrix[i12];
                        iArr2[i20] = iArr2[i20] ^ gF2MatrixEx.matrix[i13][i20];
                    }
                }
                i13++;
            }
        }
        return gF2MatrixEx2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        int i10 = this.numColumns & 31;
        int i11 = i10 == 0 ? this.length : this.length - 1;
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < this.numRows; i12++) {
            sb2.append(i12);
            sb2.append(": ");
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.matrix[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    if (((i14 >>> i15) & 1) == 0) {
                        sb2.append('0');
                    } else {
                        sb2.append('1');
                    }
                }
                sb2.append(' ');
            }
            int i16 = this.matrix[i12][this.length - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                if (((i16 >>> i17) & 1) == 0) {
                    sb2.append('0');
                } else {
                    sb2.append('1');
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public GF2MatrixEx(int i10, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i10 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i10;
        this.numRows = iArr.length;
        this.length = iArr2.length;
        int i11 = i10 & 31;
        int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int[] iArr3 = iArr[i13];
            int i14 = this.length - 1;
            iArr3[i14] = iArr3[i14] & i12;
        }
        this.matrix = iArr;
    }

    public static int get(int[][] iArr, int i10, int i11) {
        return get(iArr[i10], i11);
    }

    public static void set(int[][] iArr, int i10, int i11, int i12) {
        set(iArr[i10], i11, i12);
    }

    public int get(int i10, int i11) {
        return get(this.matrix, i10, i11);
    }

    public void set(int i10, int i11, int i12) {
        set(this.matrix, i10, i11, i12);
    }

    public GF2MatrixEx(int i10, int i11) {
        if (i11 > 0 && i10 > 0) {
            assignZeroMatrix(i10, i11);
            return;
        }
        throw new ArithmeticException("size of matrix is non-positive");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i10 = this.numColumns;
        if (length == i10) {
            GF2MatrixEx gF2MatrixEx = new GF2MatrixEx(this.numRows, i10);
            for (int i11 = this.numColumns - 1; i11 >= 0; i11--) {
                int i12 = i11 >>> 5;
                int i13 = i11 & 31;
                int i14 = vector[i11];
                int i15 = i14 >>> 5;
                int i16 = i14 & 31;
                for (int i17 = this.numRows - 1; i17 >= 0; i17--) {
                    int[] iArr = gF2MatrixEx.matrix[i17];
                    iArr[i12] = iArr[i12] | (((this.matrix[i17][i15] >>> i16) & 1) << i13);
                }
            }
            return gF2MatrixEx;
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        if (vector instanceof GF2Vector) {
            if (vector.getLength() == this.numColumns) {
                int[] vecArray = ((GF2Vector) vector).getVecArray();
                int[] iArr = new int[(this.numRows + 31) >>> 5];
                int i10 = 0;
                while (true) {
                    int i11 = this.numRows;
                    if (i10 < i11) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < this.length; i13++) {
                            i12 ^= this.matrix[i10][i13] & vecArray[i13];
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
                    } else {
                        return new GF2Vector(i11, iArr);
                    }
                }
            } else {
                throw new ArithmeticException("length mismatch");
            }
        } else {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
    }
}
