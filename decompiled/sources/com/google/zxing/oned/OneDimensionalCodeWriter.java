package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    public static int appendPattern(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11) throws WriterException {
        return encode(str, barcodeFormat, i10, i11, null);
    }

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
        return 10;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        int defaultMargin = getDefaultMargin();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                defaultMargin = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        boolean[] zArrEncode = encode(str);
        int length = zArrEncode.length;
        int i12 = defaultMargin + length;
        int iMax = Math.max(i10, i12);
        int iMax2 = Math.max(1, i11);
        int i13 = iMax / i12;
        int i14 = (iMax - (length * i13)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i15 = 0;
        while (i15 < length) {
            if (zArrEncode[i15]) {
                bitMatrix.setRegion(i14, 0, i13, iMax2);
            }
            i15++;
            i14 += i13;
        }
        return bitMatrix;
    }
}
