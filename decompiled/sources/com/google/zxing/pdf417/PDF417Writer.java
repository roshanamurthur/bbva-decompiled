package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.Dimensions;
import com.google.zxing.pdf417.encoder.PDF417;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class PDF417Writer implements Writer {
    public static BitMatrix a(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        BitMatrix bitMatrix = new BitMatrix(bArr[0].length + i11, bArr.length + i11);
        bitMatrix.clear();
        int height = (bitMatrix.getHeight() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bitMatrix.set(i13 + i10, height);
                }
            }
            i12++;
            height--;
        }
        return bitMatrix;
    }

    public static byte[][] b(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        boolean z10;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        PDF417 pdf417 = new PDF417();
        int i12 = 2;
        int i13 = 30;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                pdf417.setCompact(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                pdf417.setCompaction(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                Dimensions dimensions = (Dimensions) map.get(encodeHintType3);
                pdf417.setDimensions(dimensions.getMaxCols(), dimensions.getMinCols(), dimensions.getMaxRows(), dimensions.getMinRows());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            i13 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i12 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                pdf417.setEncoding(Charset.forName(map.get(encodeHintType6).toString()));
            }
        }
        pdf417.generateBarcodeLogic(str, i12);
        byte[][] scaledMatrix = pdf417.getBarcodeMatrix().getScaledMatrix(1, 4);
        if ((i11 > i10) != (scaledMatrix[0].length < scaledMatrix.length)) {
            scaledMatrix = b(scaledMatrix);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = i10 / scaledMatrix[0].length;
        int length2 = i11 / scaledMatrix.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return a(scaledMatrix, i13);
        }
        byte[][] scaledMatrix2 = pdf417.getBarcodeMatrix().getScaledMatrix(length, length << 2);
        if (z10) {
            scaledMatrix2 = b(scaledMatrix2);
        }
        return a(scaledMatrix2, i13);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11) throws WriterException {
        return encode(str, barcodeFormat, i10, i11, null);
    }
}
