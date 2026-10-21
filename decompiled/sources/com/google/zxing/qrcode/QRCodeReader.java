package com.google.zxing.qrcode;

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
import com.google.zxing.qrcode.decoder.Decoder;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import com.google.zxing.qrcode.detector.Detector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class QRCodeReader implements Reader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResultPoint[] f50026b = new ResultPoint[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Decoder f50027a = new Decoder();

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, null);
    }

    public final Decoder getDecoder() {
        return this.f50027a;
    }

    @Override // com.google.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        ResultPoint[] points;
        DecoderResult decoderResultDecode;
        Decoder decoder = this.f50027a;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            DetectorResult detectorResultDetect = new Detector(binaryBitmap.getBlackMatrix()).detect(map);
            DecoderResult decoderResultDecode2 = decoder.decode(detectorResultDetect.getBits(), map);
            points = detectorResultDetect.getPoints();
            decoderResultDecode = decoderResultDecode2;
        } else {
            BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
            int[] topLeftOnBit = blackMatrix.getTopLeftOnBit();
            int[] bottomRightOnBit = blackMatrix.getBottomRightOnBit();
            if (topLeftOnBit == null || bottomRightOnBit == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            int height = blackMatrix.getHeight();
            int width = blackMatrix.getWidth();
            int i10 = topLeftOnBit[0];
            int i11 = topLeftOnBit[1];
            int i12 = 0;
            boolean z10 = true;
            while (i10 < width && i11 < height) {
                if (z10 != blackMatrix.get(i10, i11)) {
                    i12++;
                    if (i12 == 5) {
                        break;
                    }
                    z10 = !z10;
                }
                i10++;
                i11++;
            }
            if (i10 == width || i11 == height) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i13 = topLeftOnBit[0];
            float f6 = (i10 - i13) / 7.0f;
            int i14 = topLeftOnBit[1];
            int i15 = bottomRightOnBit[1];
            int i16 = bottomRightOnBit[0];
            if (i13 >= i16 || i14 >= i15) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i17 = i15 - i14;
            if (i17 != i16 - i13 && (i16 = i13 + i17) >= blackMatrix.getWidth()) {
                throw NotFoundException.getNotFoundInstance();
            }
            int iRound = Math.round(((i16 - i13) + 1) / f6);
            int iRound2 = Math.round((i17 + 1) / f6);
            if (iRound <= 0 || iRound2 <= 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iRound2 != iRound) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i18 = (int) (f6 / 2.0f);
            int i19 = i14 + i18;
            int i20 = i13 + i18;
            int i21 = (((int) ((iRound - 1) * f6)) + i20) - i16;
            if (i21 > 0) {
                if (i21 > i18) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i20 -= i21;
            }
            int i22 = (((int) ((iRound2 - 1) * f6)) + i19) - i15;
            if (i22 > 0) {
                if (i22 > i18) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i19 -= i22;
            }
            BitMatrix bitMatrix = new BitMatrix(iRound, iRound2);
            for (int i23 = 0; i23 < iRound2; i23++) {
                int i24 = ((int) (i23 * f6)) + i19;
                for (int i25 = 0; i25 < iRound; i25++) {
                    if (blackMatrix.get(((int) (i25 * f6)) + i20, i24)) {
                        bitMatrix.set(i25, i23);
                    }
                }
            }
            decoderResultDecode = decoder.decode(bitMatrix, map);
            points = f50026b;
        }
        if (decoderResultDecode.getOther() instanceof QRCodeDecoderMetaData) {
            ((QRCodeDecoderMetaData) decoderResultDecode.getOther()).applyMirroredCorrection(points);
        }
        Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), points, BarcodeFormat.QR_CODE);
        List<byte[]> byteSegments = decoderResultDecode.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        String eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        if (decoderResultDecode.hasStructuredAppend()) {
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(decoderResultDecode.getStructuredAppendSequenceNumber()));
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(decoderResultDecode.getStructuredAppendParity()));
        }
        return result;
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }
}
