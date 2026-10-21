package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class DataMatrixWriter implements Writer {
    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11) {
        return encode(str, barcodeFormat, i10, i11, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) {
        Dimension dimension;
        BitMatrix bitMatrix;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        Dimension dimension2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            Dimension dimension3 = (Dimension) map.get(EncodeHintType.MIN_SIZE);
            if (dimension3 == null) {
                dimension3 = null;
            }
            dimension = (Dimension) map.get(EncodeHintType.MAX_SIZE);
            if (dimension == null) {
                dimension = null;
            }
            dimension2 = dimension3;
        } else {
            dimension = null;
        }
        String strEncodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint, dimension2, dimension);
        SymbolInfo symbolInfoLookup = SymbolInfo.lookup(strEncodeHighLevel.length(), symbolShapeHint, dimension2, dimension, true);
        DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.encodeECC200(strEncodeHighLevel, symbolInfoLookup), symbolInfoLookup.getSymbolDataWidth(), symbolInfoLookup.getSymbolDataHeight());
        defaultPlacement.place();
        int symbolDataWidth = symbolInfoLookup.getSymbolDataWidth();
        int symbolDataHeight = symbolInfoLookup.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfoLookup.getSymbolWidth(), symbolInfoLookup.getSymbolHeight());
        int i12 = 0;
        for (int i13 = 0; i13 < symbolDataHeight; i13++) {
            if (i13 % symbolInfoLookup.matrixHeight == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < symbolInfoLookup.getSymbolWidth(); i15++) {
                    byteMatrix.set(i14, i12, i15 % 2 == 0);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < symbolDataWidth; i17++) {
                if (i17 % symbolInfoLookup.matrixWidth == 0) {
                    byteMatrix.set(i16, i12, true);
                    i16++;
                }
                byteMatrix.set(i16, i12, defaultPlacement.getBit(i17, i13));
                int i18 = i16 + 1;
                int i19 = symbolInfoLookup.matrixWidth;
                if (i17 % i19 == i19 - 1) {
                    byteMatrix.set(i18, i12, i13 % 2 == 0);
                    i16 += 2;
                } else {
                    i16 = i18;
                }
            }
            int i20 = i12 + 1;
            int i21 = symbolInfoLookup.matrixHeight;
            if (i13 % i21 == i21 - 1) {
                int i22 = 0;
                for (int i23 = 0; i23 < symbolInfoLookup.getSymbolWidth(); i23++) {
                    byteMatrix.set(i22, i20, true);
                    i22++;
                }
                i12 += 2;
            } else {
                i12 = i20;
            }
        }
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int iMax = Math.max(i10, width);
        int iMax2 = Math.max(i11, height);
        int iMin = Math.min(iMax / width, iMax2 / height);
        int i24 = (iMax - (width * iMin)) / 2;
        int i25 = (iMax2 - (height * iMin)) / 2;
        if (i11 < height || i10 < width) {
            bitMatrix = new BitMatrix(width, height);
            i24 = 0;
            i25 = 0;
        } else {
            bitMatrix = new BitMatrix(i10, i11);
        }
        bitMatrix.clear();
        int i26 = 0;
        while (i26 < height) {
            int i27 = i24;
            int i28 = 0;
            while (i28 < width) {
                if (byteMatrix.get(i28, i26) == 1) {
                    bitMatrix.setRegion(i27, i25, iMin, iMin);
                }
                i28++;
                i27 += iMin;
            }
            i26++;
            i25 += iMin;
        }
        return bitMatrix;
    }
}
