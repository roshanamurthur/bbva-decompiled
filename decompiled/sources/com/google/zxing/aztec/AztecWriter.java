package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AztecWriter implements Writer {
    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11) {
        return encode(str, barcodeFormat, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[PHI: r0 r1
      0x0044: PHI (r0v1 java.nio.charset.Charset) = (r0v0 java.nio.charset.Charset), (r0v5 java.nio.charset.Charset) binds: [B:3:0x0005, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r1v1 int) = (r1v0 int), (r1v7 int) binds: [B:3:0x0005, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) {
        int i12;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i13 = 33;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charsetForName = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            i13 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i12 = Integer.parseInt(map.get(encodeHintType3).toString());
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        BitMatrix matrix = Encoder.encode(str.getBytes(charsetForName), i13, i12).getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int iMax = Math.max(i10, width);
        int iMax2 = Math.max(i11, height);
        int iMin = Math.min(iMax / width, iMax2 / height);
        int i14 = (iMax - (width * iMin)) / 2;
        int i15 = (iMax2 - (height * iMin)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i16 = 0;
        while (i16 < height) {
            int i17 = i14;
            int i18 = 0;
            while (i18 < width) {
                if (matrix.get(i18, i16)) {
                    bitMatrix.setRegion(i17, i15, iMin, iMin);
                }
                i18++;
                i17 += iMin;
            }
            i16++;
            i15 += iMin;
        }
        return bitMatrix;
    }
}
