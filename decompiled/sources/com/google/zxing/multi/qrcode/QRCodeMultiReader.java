package com.google.zxing.multi.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.multi.qrcode.detector.MultiDetector;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class QRCodeMultiReader extends QRCodeReader implements MultipleBarcodeReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Result[] f49903c = new Result[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ResultPoint[] f49904d = new ResultPoint[0];

    public static final class a implements Serializable, Comparator<Result> {
        @Override // java.util.Comparator
        public final int compare(Result result, Result result2) {
            Map<ResultMetadataType, Object> resultMetadata = result.getResultMetadata();
            ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) resultMetadata.get(resultMetadataType)).intValue(), ((Integer) result2.getResultMetadata().get(resultMetadataType)).intValue());
        }
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList<Result> arrayList = new ArrayList();
        for (DetectorResult detectorResult : new MultiDetector(binaryBitmap.getBlackMatrix()).detectMulti(map)) {
            try {
                DecoderResult decoderResultDecode = getDecoder().decode(detectorResult.getBits(), map);
                ResultPoint[] points = detectorResult.getPoints();
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
                arrayList.add(result);
            } catch (ReaderException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return f49903c;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Result) it.next()).getResultMetadata().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<Result> arrayList3 = new ArrayList();
                for (Result result2 : arrayList) {
                    arrayList2.add(result2);
                    if (result2.getResultMetadata().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                        arrayList3.add(result2);
                    }
                }
                Collections.sort(arrayList3, new a());
                StringBuilder sb2 = new StringBuilder();
                int length = 0;
                int length2 = 0;
                for (Result result3 : arrayList3) {
                    sb2.append(result3.getText());
                    length += result3.getRawBytes().length;
                    Map<ResultMetadataType, Object> resultMetadata = result3.getResultMetadata();
                    ResultMetadataType resultMetadataType = ResultMetadataType.BYTE_SEGMENTS;
                    if (resultMetadata.containsKey(resultMetadataType)) {
                        Iterator it2 = ((Iterable) result3.getResultMetadata().get(resultMetadataType)).iterator();
                        while (it2.hasNext()) {
                            length2 += ((byte[]) it2.next()).length;
                        }
                    }
                }
                byte[] bArr = new byte[length];
                byte[] bArr2 = new byte[length2];
                int length3 = 0;
                int length4 = 0;
                for (Result result4 : arrayList3) {
                    System.arraycopy(result4.getRawBytes(), 0, bArr, length3, result4.getRawBytes().length);
                    length3 += result4.getRawBytes().length;
                    Map<ResultMetadataType, Object> resultMetadata2 = result4.getResultMetadata();
                    ResultMetadataType resultMetadataType2 = ResultMetadataType.BYTE_SEGMENTS;
                    if (resultMetadata2.containsKey(resultMetadataType2)) {
                        for (byte[] bArr3 : (Iterable) result4.getResultMetadata().get(resultMetadataType2)) {
                            System.arraycopy(bArr3, 0, bArr2, length4, bArr3.length);
                            length4 += bArr3.length;
                        }
                    }
                }
                Result result5 = new Result(sb2.toString(), bArr, f49904d, BarcodeFormat.QR_CODE);
                if (length2 > 0) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(bArr2);
                    result5.putMetadata(ResultMetadataType.BYTE_SEGMENTS, arrayList4);
                }
                arrayList2.add(result5);
                arrayList = arrayList2;
                break;
            }
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }
}
