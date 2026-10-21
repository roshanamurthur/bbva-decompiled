package com.google.zxing.common.reedsolomon;

import zg.a;

/* JADX INFO: loaded from: classes10.dex */
public final class ReedSolomonDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericGF f49858a;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.f49858a = genericGF;
    }

    public void decode(int[] iArr, int i10) throws ReedSolomonException {
        int[] iArr2;
        GenericGF genericGF;
        int[] iArr3;
        int i11;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i12 = 1;
            while (i12 < length && iArr[i12] == 0) {
                i12++;
            }
            if (i12 == length) {
                iArr2 = new int[]{0};
            } else {
                int i13 = length - i12;
                int[] iArr4 = new int[i13];
                System.arraycopy(iArr, i12, iArr4, 0, i13);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        int i14 = 0;
        while (true) {
            genericGF = this.f49858a;
            if (i14 >= i10) {
                break;
            }
            int i15 = genericGF.f49851a[genericGF.getGeneratorBase() + i14];
            if (i15 == 0) {
                i11 = iArr2[iArr2.length - 1];
            } else if (i15 == 1) {
                int i16 = 0;
                for (int i17 : iArr2) {
                    GenericGF genericGF2 = GenericGF.AZTEC_DATA_12;
                    i16 ^= i17;
                }
                i11 = i16;
            } else {
                int iC = iArr2[0];
                int length2 = iArr2.length;
                for (int i18 = 1; i18 < length2; i18++) {
                    iC = genericGF.c(i15, iC) ^ iArr2[i18];
                }
                i11 = iC;
            }
            iArr5[(i10 - 1) - i14] = i11;
            if (i11 != 0) {
                z10 = false;
            }
            i14++;
        }
        if (z10) {
            return;
        }
        a aVar = new a(genericGF, iArr5);
        a aVarA = genericGF.a(i10, 1);
        if (aVarA.d() >= aVar.d()) {
            aVarA = aVar;
            aVar = aVarA;
        }
        a aVar2 = genericGF.f49853c;
        a aVar3 = genericGF.f49854d;
        a aVar4 = aVar2;
        a aVar5 = aVarA;
        a aVarA2 = aVar;
        a aVar6 = aVar5;
        while (aVar6.d() >= i10 / 2) {
            if (aVar6.e()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            int iB = genericGF.b(aVar6.c(aVar6.d()));
            a aVarA3 = aVar2;
            while (aVarA2.d() >= aVar6.d() && !aVarA2.e()) {
                int iD = aVarA2.d() - aVar6.d();
                int iC2 = genericGF.c(aVarA2.c(aVarA2.d()), iB);
                aVarA3 = aVarA3.a(genericGF.a(iD, iC2));
                aVarA2 = aVarA2.a(aVar6.h(iD, iC2));
            }
            a aVarA4 = aVarA3.g(aVar3).a(aVar4);
            if (aVarA2.d() >= aVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            a aVar7 = aVarA2;
            aVarA2 = aVar6;
            aVar6 = aVar7;
            aVar4 = aVar3;
            aVar3 = aVarA4;
        }
        int iC3 = aVar3.c(0);
        if (iC3 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int iB2 = genericGF.b(iC3);
        a aVarF = aVar3.f(iB2);
        a aVarF2 = aVar6.f(iB2);
        int iD2 = aVarF.d();
        if (iD2 == 1) {
            iArr3 = new int[]{aVarF.c(1)};
        } else {
            int[] iArr6 = new int[iD2];
            int i19 = 0;
            for (int i20 = 1; i20 < genericGF.getSize() && i19 < iD2; i20++) {
                if (aVarF.b(i20) == 0) {
                    iArr6[i19] = genericGF.b(i20);
                    i19++;
                }
            }
            if (i19 != iD2) {
                throw new ReedSolomonException("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int iB3 = genericGF.b(iArr3[i21]);
            int iC4 = 1;
            for (int i22 = 0; i22 < length3; i22++) {
                if (i21 != i22) {
                    int iC5 = genericGF.c(iArr3[i22], iB3);
                    iC4 = genericGF.c(iC4, (iC5 & 1) == 0 ? iC5 | 1 : iC5 & (-2));
                }
            }
            iArr7[i21] = genericGF.c(aVarF2.b(iB3), genericGF.b(iC4));
            if (genericGF.getGeneratorBase() != 0) {
                iArr7[i21] = genericGF.c(iArr7[i21], iB3);
            }
        }
        for (int i23 = 0; i23 < iArr3.length; i23++) {
            int length4 = iArr.length - 1;
            int i24 = iArr3[i23];
            if (i24 == 0) {
                throw new IllegalArgumentException();
            }
            int i25 = length4 - genericGF.f49852b[i24];
            if (i25 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[i25] = iArr[i25] ^ iArr7[i23];
        }
    }
}
