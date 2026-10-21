package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes10.dex */
public final class EAN8Reader extends UPCEANReader {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f49929i = new int[4];

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[][] iArr2;
        int[] iArr3 = this.f49929i;
        iArr3[0] = 0;
        iArr3[1] = 0;
        iArr3[2] = 0;
        iArr3[3] = 0;
        int size = bitArray.getSize();
        int i10 = iArr[1];
        int i11 = 0;
        while (true) {
            iArr2 = UPCEANReader.f49945g;
            if (i11 >= 4 || i10 >= size) {
                break;
            }
            sb2.append((char) (UPCEANReader.c(bitArray, iArr3, i10, iArr2) + 48));
            for (int i12 : iArr3) {
                i10 += i12;
            }
            i11++;
        }
        int i13 = UPCEANReader.d(bitArray, i10, true, UPCEANReader.f49943e, new int[5])[1];
        for (int i14 = 0; i14 < 4 && i13 < size; i14++) {
            sb2.append((char) (UPCEANReader.c(bitArray, iArr3, i13, iArr2) + 48));
            for (int i15 : iArr3) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat f() {
        return BarcodeFormat.EAN_8;
    }
}
