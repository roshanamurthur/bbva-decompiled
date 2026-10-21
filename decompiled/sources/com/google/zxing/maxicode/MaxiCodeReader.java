package com.google.zxing.maxicode;

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
import com.google.zxing.maxicode.decoder.Decoder;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class MaxiCodeReader implements Reader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResultPoint[] f49898b = new ResultPoint[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Decoder f49899a = new Decoder();

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        int[] enclosingRectangle = blackMatrix.getEnclosingRectangle();
        if (enclosingRectangle == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i10 = enclosingRectangle[0];
        int i11 = enclosingRectangle[1];
        int i12 = enclosingRectangle[2];
        int i13 = enclosingRectangle[3];
        BitMatrix bitMatrix = new BitMatrix(30, 33);
        for (int i14 = 0; i14 < 33; i14++) {
            int i15 = (((i13 / 2) + (i14 * i13)) / 33) + i11;
            for (int i16 = 0; i16 < 30; i16++) {
                if (blackMatrix.get((((((i14 & 1) * i12) / 2) + ((i12 / 2) + (i16 * i12))) / 30) + i10, i15)) {
                    bitMatrix.set(i16, i14);
                }
            }
        }
        DecoderResult decoderResultDecode = this.f49899a.decode(bitMatrix, map);
        Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), f49898b, BarcodeFormat.MAXICODE);
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
