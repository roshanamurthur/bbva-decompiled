package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class QRCodeWriter implements Writer {
    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11) throws WriterException {
        return encode(str, barcodeFormat, i10, i11, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        int i12 = 4;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i12 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
        }
        ByteMatrix matrix = Encoder.encode(str, errorCorrectionLevelValueOf, map).getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int i13 = i12 << 1;
        int i14 = width + i13;
        int i15 = i13 + height;
        int iMax = Math.max(i10, i14);
        int iMax2 = Math.max(i11, i15);
        int iMin = Math.min(iMax / i14, iMax2 / i15);
        int i16 = (iMax - (width * iMin)) / 2;
        int i17 = (iMax2 - (height * iMin)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i18 = 0;
        while (i18 < height) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < width) {
                if (matrix.get(i19, i18) == 1) {
                    bitMatrix.setRegion(i20, i17, iMin, iMin);
                }
                i19++;
                i20 += iMin;
            }
            i18++;
            i17 += iMin;
        }
        return bitMatrix;
    }
}
