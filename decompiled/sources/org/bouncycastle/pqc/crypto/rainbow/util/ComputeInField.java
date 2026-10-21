package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes13.dex */
public class ComputeInField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[][] f91252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short[] f91253b;

    public final void a() throws RuntimeException {
        for (int length = this.f91252a.length - 1; length > 0; length--) {
            for (int i10 = length - 1; i10 >= 0; i10--) {
                short[][] sArr = this.f91252a;
                short s4 = sArr[i10][length];
                short sInvElem = GF2Field.invElem(sArr[length][length]);
                if (sInvElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i11 = length;
                while (true) {
                    short[][] sArr2 = this.f91252a;
                    if (i11 < sArr2.length * 2) {
                        short sMultElem = GF2Field.multElem(s4, GF2Field.multElem(sArr2[length][i11], sInvElem));
                        short[] sArr3 = this.f91252a[i10];
                        sArr3[i11] = GF2Field.addElem(sArr3[i11], sMultElem);
                        i11++;
                    }
                }
            }
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.addElem(sArr[i10][i11], sArr2[i10][i11]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr3[i10] = GF2Field.addElem(sArr[i10], sArr2[i10]);
        }
        return sArr3;
    }

    public final void b(boolean z10) throws RuntimeException {
        int length = z10 ? this.f91252a.length * 2 : this.f91252a.length + 1;
        int i10 = 0;
        while (i10 < this.f91252a.length - 1) {
            int i11 = i10 + 1;
            int i12 = i11;
            while (true) {
                short[][] sArr = this.f91252a;
                if (i12 < sArr.length) {
                    short s4 = sArr[i12][i10];
                    short sInvElem = GF2Field.invElem(sArr[i10][i10]);
                    if (sInvElem == 0) {
                        throw new IllegalStateException("Matrix not invertible! We have to choose another one!");
                    }
                    for (int i13 = i10; i13 < length; i13++) {
                        short sMultElem = GF2Field.multElem(s4, GF2Field.multElem(this.f91252a[i10][i13], sInvElem));
                        short[] sArr2 = this.f91252a[i12];
                        sArr2[i13] = GF2Field.addElem(sArr2[i13], sMultElem);
                    }
                    i12++;
                }
            }
            i10 = i11;
        }
    }

    public final void c() throws IllegalStateException {
        short[][] sArr = this.f91252a;
        short sInvElem = GF2Field.invElem(sArr[sArr.length - 1][sArr.length - 1]);
        if (sInvElem == 0) {
            throw new IllegalStateException("The equation system is not solvable");
        }
        short[] sArr2 = this.f91253b;
        short[][] sArr3 = this.f91252a;
        sArr2[sArr3.length - 1] = GF2Field.multElem(sArr3[sArr3.length - 1][sArr3.length], sInvElem);
        for (int length = this.f91252a.length - 2; length >= 0; length--) {
            short[][] sArr4 = this.f91252a;
            short sAddElem = sArr4[length][sArr4.length];
            for (int length2 = sArr4.length - 1; length2 > length; length2--) {
                sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(this.f91252a[length][length2], this.f91253b[length2]));
            }
            short sInvElem2 = GF2Field.invElem(this.f91252a[length][length]);
            if (sInvElem2 == 0) {
                throw new IllegalStateException("Not solvable equation system");
            }
            this.f91253b[length] = GF2Field.multElem(sAddElem, sInvElem2);
        }
    }

    public short[][] inverse(short[][] sArr) {
        try {
            this.f91252a = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length * 2);
            int i10 = 0;
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr.length; i12++) {
                    this.f91252a[i11][i12] = sArr[i11][i12];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.f91252a[i11][length] = 0;
                }
                short[][] sArr2 = this.f91252a;
                sArr2[i11][sArr2.length + i11] = 1;
            }
            b(true);
            int i13 = 0;
            while (true) {
                short[][] sArr3 = this.f91252a;
                if (i13 >= sArr3.length) {
                    break;
                }
                short sInvElem = GF2Field.invElem(sArr3[i13][i13]);
                int i14 = i13;
                while (true) {
                    short[][] sArr4 = this.f91252a;
                    if (i14 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i13];
                        sArr5[i14] = GF2Field.multElem(sArr5[i14], sInvElem);
                        i14++;
                    }
                }
                i13++;
            }
            a();
            short[][] sArr6 = this.f91252a;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.f91252a;
                if (i10 >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.f91252a;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i10][length2 - sArr9.length] = sArr9[i10][length2];
                        length2++;
                    }
                }
                i10++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s4, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                sArr2[i10][i11] = GF2Field.multElem(s4, sArr[i10][i11]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s4, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr2[i10] = GF2Field.multElem(s4, sArr[i10]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.multElem(sArr[i10], sArr2[i11]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10] = GF2Field.addElem(sArr3[i10], GF2Field.multElem(sArr[i10][i11], sArr2[i11]));
            }
        }
        return sArr3;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.f91252a = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f91253b = new short[sArr.length];
            for (int i10 = 0; i10 < sArr.length; i10++) {
                for (int i11 = 0; i11 < sArr[0].length; i11++) {
                    this.f91252a[i10][i11] = sArr[i10][i11];
                }
            }
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                short[] sArr3 = this.f91252a[i12];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i12], sArr3[sArr2.length]);
            }
            b(false);
            c();
            return this.f91253b;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        this.f91252a = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                for (int i12 = 0; i12 < sArr2[0].length; i12++) {
                    short sMultElem = GF2Field.multElem(sArr[i10][i11], sArr2[i11][i12]);
                    short[] sArr3 = this.f91252a[i10];
                    sArr3[i12] = GF2Field.addElem(sArr3[i12], sMultElem);
                }
            }
        }
        return this.f91252a;
    }
}
