package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;
import jh.a;

/* JADX INFO: loaded from: classes10.dex */
public final class ErrorCorrection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulusGF f49997a = ModulusGF.PDF417_GF;

    public int decode(int[] iArr, int i10, int[] iArr2) throws ChecksumException {
        a aVar;
        a aVar2;
        int i11 = i10;
        ModulusGF modulusGF = this.f49997a;
        a aVar3 = new a(modulusGF, iArr);
        int[] iArr3 = new int[i11];
        int i12 = 0;
        boolean z10 = false;
        for (int i13 = i11; i13 > 0; i13--) {
            int iF = aVar3.f(modulusGF.f49998a[i13]);
            iArr3[i11 - i13] = iF;
            if (iF != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        a aVarK = modulusGF.f50001d;
        int i14 = modulusGF.f50002e;
        if (iArr2 != null) {
            for (int i15 : iArr2) {
                aVarK = aVarK.k(new a(modulusGF, new int[]{(i14 - modulusGF.f49998a[(iArr.length - 1) - i15]) % i14, 1}));
            }
        }
        a aVar4 = new a(modulusGF, iArr3);
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        int[] iArr4 = new int[i11 + 1];
        iArr4[0] = 1;
        a aVar5 = new a(modulusGF, iArr4);
        if (aVar5.h() >= aVar4.h()) {
            aVar5 = aVar4;
            aVar4 = aVar5;
        }
        a aVar6 = modulusGF.f50000c;
        a aVar7 = modulusGF.f50001d;
        a aVar8 = aVar6;
        while (true) {
            a aVar9 = aVar5;
            aVar5 = aVar4;
            aVar4 = aVar9;
            if (aVar4.h() < i11 / 2) {
                int i16 = i12;
                int iG = aVar7.g(i16);
                if (iG == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iA = modulusGF.a(iG);
                a aVarJ = aVar7.j(iA);
                a aVarJ2 = aVar4.j(iA);
                int iH = aVarJ.h();
                int[] iArr5 = new int[iH];
                int i17 = i16;
                for (int i18 = 1; i18 < i14 && i17 < iH; i18++) {
                    if (aVarJ.f(i18) == 0) {
                        iArr5[i17] = modulusGF.a(i18);
                        i17++;
                    }
                }
                if (i17 != iH) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iH2 = aVarJ.h();
                int[] iArr6 = new int[iH2];
                for (int i19 = 1; i19 <= iH2; i19++) {
                    iArr6[iH2 - i19] = modulusGF.b(i19, aVarJ.g(i19));
                }
                a aVar10 = new a(modulusGF, iArr6);
                int[] iArr7 = new int[iH];
                for (int i20 = i16; i20 < iH; i20++) {
                    int iA2 = modulusGF.a(iArr5[i20]);
                    iArr7[i20] = modulusGF.b((i14 - aVarJ2.f(iA2)) % i14, modulusGF.a(aVar10.f(iA2)));
                }
                while (i16 < iH) {
                    int length = iArr.length - 1;
                    int i21 = iArr5[i16];
                    if (i21 == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i22 = length - modulusGF.f49999b[i21];
                    if (i22 < 0) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    iArr[i22] = androidx.activity.a.a(i14, iArr[i22], iArr7[i16], i14);
                    i16++;
                }
                return iH;
            }
            if (aVar4.i()) {
                throw ChecksumException.getChecksumInstance();
            }
            int iA3 = modulusGF.a(aVar4.g(aVar4.h()));
            a aVarE = aVar6;
            while (aVar5.h() >= aVar4.h() && !aVar5.i()) {
                int iH3 = aVar5.h() - aVar4.h();
                int iB = modulusGF.b(aVar5.g(aVar5.h()), iA3);
                if (iH3 < 0) {
                    throw new IllegalArgumentException();
                }
                if (iB == 0) {
                    aVar = aVar6;
                } else {
                    int[] iArr8 = new int[iH3 + 1];
                    iArr8[i12] = iB;
                    aVar = new a(modulusGF, iArr8);
                }
                aVarE = aVarE.e(aVar);
                if (iH3 < 0) {
                    throw new IllegalArgumentException();
                }
                Object obj = aVar4.f79091b;
                if (iB == 0) {
                    aVar2 = ((ModulusGF) obj).f50000c;
                } else {
                    int[] iArr9 = (int[]) aVar4.f79092c;
                    int length2 = iArr9.length;
                    int[] iArr10 = new int[iH3 + length2];
                    int i23 = 0;
                    while (i23 < length2) {
                        iArr10[i23] = ((ModulusGF) obj).b(iArr9[i23], iB);
                        i23++;
                        length2 = length2;
                    }
                    aVar2 = new a((ModulusGF) obj, iArr10);
                }
                aVar5 = aVar5.m(aVar2);
                aVar6 = aVar6;
                i12 = 0;
            }
            a aVarL = aVarE.k(aVar7).m(aVar8).l();
            aVar6 = aVar6;
            aVar8 = aVar7;
            i12 = 0;
            aVar7 = aVarL;
            i11 = i10;
        }
    }
}
