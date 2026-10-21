package zg;

import com.google.zxing.common.reedsolomon.GenericGF;

/* JADX INFO: compiled from: GenericGFPoly.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericGF f95067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f95068b;

    public a(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f95067a = genericGF;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f95068b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f95068b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f95068b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    public final a a(a aVar) {
        GenericGF genericGF = aVar.f95067a;
        GenericGF genericGF2 = this.f95067a;
        if (!genericGF2.equals(genericGF)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return aVar;
        }
        if (aVar.e()) {
            return this;
        }
        int[] iArr = this.f95068b;
        int length = iArr.length;
        int[] iArr2 = aVar.f95068b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i10 = length2; i10 < iArr.length; i10++) {
            iArr3[i10] = iArr2[i10 - length2] ^ iArr[i10];
        }
        return new a(genericGF2, iArr3);
    }

    public final int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        int[] iArr = this.f95068b;
        if (i10 != 1) {
            int iC = iArr[0];
            int length = iArr.length;
            for (int i11 = 1; i11 < length; i11++) {
                iC = this.f95067a.c(i10, iC) ^ iArr[i11];
            }
            return iC;
        }
        int i12 = 0;
        for (int i13 : iArr) {
            GenericGF genericGF = GenericGF.AZTEC_DATA_12;
            i12 ^= i13;
        }
        return i12;
    }

    public final int c(int i10) {
        int[] iArr = this.f95068b;
        return iArr[(iArr.length - 1) - i10];
    }

    public final int d() {
        return this.f95068b.length - 1;
    }

    public final boolean e() {
        return this.f95068b[0] == 0;
    }

    public final a f(int i10) {
        GenericGF genericGF = this.f95067a;
        if (i10 == 0) {
            return genericGF.f49853c;
        }
        if (i10 == 1) {
            return this;
        }
        int[] iArr = this.f95068b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = genericGF.c(iArr[i11], i10);
        }
        return new a(genericGF, iArr2);
    }

    public final a g(a aVar) {
        GenericGF genericGF = aVar.f95067a;
        GenericGF genericGF2 = this.f95067a;
        if (!genericGF2.equals(genericGF)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e() || aVar.e()) {
            return genericGF2.f49853c;
        }
        int[] iArr = this.f95068b;
        int length = iArr.length;
        int[] iArr2 = aVar.f95068b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = iArr3[i13] ^ genericGF2.c(i11, iArr2[i12]);
            }
        }
        return new a(genericGF2, iArr3);
    }

    public final a h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        GenericGF genericGF = this.f95067a;
        if (i11 == 0) {
            return genericGF.f49853c;
        }
        int[] iArr = this.f95068b;
        int length = iArr.length;
        int[] iArr2 = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = genericGF.c(iArr[i12], i11);
        }
        return new a(genericGF, iArr2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    sb2.append(" - ");
                    iC = -iC;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    GenericGF genericGF = this.f95067a;
                    if (iC == 0) {
                        genericGF.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i10 = genericGF.f49852b[iC];
                    if (i10 == 0) {
                        sb2.append('1');
                    } else if (i10 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i10);
                    }
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iD);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
