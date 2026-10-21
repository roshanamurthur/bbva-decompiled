package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.datamatrix.decoder.Decoder;
import com.google.zxing.datamatrix.detector.Detector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class DataMatrixReader implements Reader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResultPoint[] f49861b = new ResultPoint[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Decoder f49862a = new Decoder();

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        ResultPoint[] points;
        DecoderResult decoderResultDecode;
        Decoder decoder = this.f49862a;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            DetectorResult detectorResultDetect = new Detector(binaryBitmap.getBlackMatrix()).detect();
            DecoderResult decoderResultDecode2 = decoder.decode(detectorResultDetect.getBits());
            points = detectorResultDetect.getPoints();
            decoderResultDecode = decoderResultDecode2;
        } else {
            BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
            int[] topLeftOnBit = blackMatrix.getTopLeftOnBit();
            int[] bottomRightOnBit = blackMatrix.getBottomRightOnBit();
            if (topLeftOnBit == null || bottomRightOnBit == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            int width = blackMatrix.getWidth();
            int i10 = topLeftOnBit[0];
            int i11 = topLeftOnBit[1];
            while (i10 < width && blackMatrix.get(i10, i11)) {
                i10++;
            }
            if (i10 == width) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i12 = topLeftOnBit[0];
            int i13 = i10 - i12;
            if (i13 == 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i14 = topLeftOnBit[1];
            int i15 = bottomRightOnBit[1];
            int i16 = ((bottomRightOnBit[0] - i12) + 1) / i13;
            int i17 = ((i15 - i14) + 1) / i13;
            if (i16 <= 0 || i17 <= 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i18 = i13 / 2;
            int i19 = i14 + i18;
            int i20 = i12 + i18;
            BitMatrix bitMatrix = new BitMatrix(i16, i17);
            for (int i21 = 0; i21 < i17; i21++) {
                int i22 = (i21 * i13) + i19;
                for (int i23 = 0; i23 < i16; i23++) {
                    if (blackMatrix.get((i23 * i13) + i20, i22)) {
                        bitMatrix.set(i23, i21);
                    }
                }
            }
            decoderResultDecode = decoder.decode(bitMatrix);
            points = f49861b;
        }
        Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), points, BarcodeFormat.DATA_MATRIX);
        List<byte[]> byteSegments = decoderResultDecode.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        String eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return result;
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }
}
