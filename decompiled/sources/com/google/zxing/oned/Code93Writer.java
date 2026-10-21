package com.google.zxing.oned;

import androidx.camera.core.impl.utils.c;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    public static void a(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
    }

    @Deprecated
    public static int appendPattern(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        a(zArr, i10, iArr);
        return 9;
    }

    public static int b(int i10, String str) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static void c(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.encode(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            int i10 = 9;
            int[] iArr = new int[9];
            int length2 = ((str.length() + 4) * 9) + 1;
            c(Code93Reader.f49923d[47], iArr);
            boolean[] zArr = new boolean[length2];
            a(zArr, 0, iArr);
            for (int i11 = 0; i11 < length; i11++) {
                c(Code93Reader.f49923d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i11))], iArr);
                a(zArr, i10, iArr);
                i10 += 9;
            }
            int iB = b(20, str);
            int[] iArr2 = Code93Reader.f49923d;
            c(iArr2[iB], iArr);
            a(zArr, i10, iArr);
            StringBuilder sbD = c.d(str);
            sbD.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iB));
            c(iArr2[b(15, sbD.toString())], iArr);
            a(zArr, i10 + 9, iArr);
            c(iArr2[47], iArr);
            a(zArr, i10 + 18, iArr);
            zArr[i10 + 27] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
