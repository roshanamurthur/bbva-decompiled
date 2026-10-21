package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes10.dex */
public final class EAN13Reader extends UPCEANReader {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f49927j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f49928i = new int[4];

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f49928i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < size; i12++) {
            int iC = UPCEANReader.c(bitArray, iArr2, i10, UPCEANReader.f49946h);
            sb2.append((char) ((iC % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (iC >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        for (int i14 = 0; i14 < 10; i14++) {
            if (i11 == f49927j[i14]) {
                sb2.insert(0, (char) (i14 + 48));
                int i15 = UPCEANReader.d(bitArray, i10, true, UPCEANReader.f49943e, new int[5])[1];
                for (int i16 = 0; i16 < 6 && i15 < size; i16++) {
                    sb2.append((char) (UPCEANReader.c(bitArray, iArr2, i15, UPCEANReader.f49945g) + 48));
                    for (int i17 : iArr2) {
                        i15 += i17;
                    }
                }
                return i15;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat f() {
        return BarcodeFormat.EAN_13;
    }
}
