package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes10.dex */
public final class UPCEReader extends UPCEANReader {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f49950j = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[][] f49951k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f49952i = new int[4];

    public static String convertUPCEtoUPCA(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public boolean checkChecksum(String str) throws FormatException {
        return UPCEANReader.b(convertUPCEtoUPCA(str));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int[] decodeEnd(BitArray bitArray, int i10) throws NotFoundException {
        return UPCEANReader.d(bitArray, i10, true, f49950j, new int[6]);
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f49952i;
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
        for (int i14 = 0; i14 <= 1; i14++) {
            for (int i15 = 0; i15 < 10; i15++) {
                if (i11 == f49951k[i14][i15]) {
                    sb2.insert(0, (char) (i14 + 48));
                    sb2.append((char) (i15 + 48));
                    return i10;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat f() {
        return BarcodeFormat.UPC_E;
    }
}
