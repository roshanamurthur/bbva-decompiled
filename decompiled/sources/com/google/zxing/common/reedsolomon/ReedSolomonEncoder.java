package com.google.zxing.common.reedsolomon;

import androidx.appcompat.view.menu.b;
import java.util.ArrayList;
import zg.a;

/* JADX INFO: loaded from: classes10.dex */
public final class ReedSolomonEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericGF f49859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f49860b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f49859a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.f49860b = arrayList;
        arrayList.add(new a(genericGF, new int[]{1}));
    }

    public void encode(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f49860b;
        int size = arrayList.size();
        GenericGF genericGF = this.f49859a;
        if (i10 >= size) {
            a aVarG = (a) b.b(arrayList, 1);
            for (int size2 = arrayList.size(); size2 <= i10; size2++) {
                aVarG = aVarG.g(new a(genericGF, new int[]{1, genericGF.f49851a[genericGF.getGeneratorBase() + (size2 - 1)]}));
                arrayList.add(aVarG);
            }
        }
        a aVar = (a) arrayList.get(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        if (length == 0) {
            throw new IllegalArgumentException();
        }
        if (length > 1 && iArr2[0] == 0) {
            int i11 = 1;
            while (i11 < length && iArr2[i11] == 0) {
                i11++;
            }
            if (i11 == length) {
                iArr2 = new int[]{0};
            } else {
                int i12 = length - i11;
                int[] iArr3 = new int[i12];
                System.arraycopy(iArr2, i11, iArr3, 0, i12);
                iArr2 = iArr3;
            }
        }
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2 + i10];
        for (int i13 = 0; i13 < length2; i13++) {
            iArr4[i13] = genericGF.c(iArr2[i13], 1);
        }
        a aVar2 = new a(genericGF, iArr4);
        if (!genericGF.equals(aVar.f95067a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (aVar.e()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int iB = genericGF.b(aVar.c(aVar.d()));
        a aVarA = genericGF.f49853c;
        while (aVar2.d() >= aVar.d() && !aVar2.e()) {
            int iD = aVar2.d() - aVar.d();
            int iC = genericGF.c(aVar2.c(aVar2.d()), iB);
            a aVarH = aVar.h(iD, iC);
            aVarA = aVarA.a(genericGF.a(iD, iC));
            aVar2 = aVar2.a(aVarH);
        }
        int[] iArr5 = aVar2.f95068b;
        int length3 = i10 - iArr5.length;
        for (int i14 = 0; i14 < length3; i14++) {
            iArr[length + i14] = 0;
        }
        System.arraycopy(iArr5, 0, iArr, length + length3, iArr5.length);
    }
}
