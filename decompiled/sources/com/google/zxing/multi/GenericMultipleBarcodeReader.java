package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f49902a;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.f49902a = reader;
    }

    public final void a(BinaryBitmap binaryBitmap, Map map, ArrayList arrayList, int i10, int i11, int i12) {
        Result result;
        float f6;
        int i13;
        if (i12 > 4) {
            return;
        }
        try {
            Result resultDecode = this.f49902a.decode(binaryBitmap, map);
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    ResultPoint[] resultPoints = resultDecode.getResultPoints();
                    if (resultPoints == null) {
                        result = resultDecode;
                    } else {
                        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
                        for (int i14 = 0; i14 < resultPoints.length; i14++) {
                            ResultPoint resultPoint = resultPoints[i14];
                            if (resultPoint != null) {
                                resultPointArr[i14] = new ResultPoint(resultPoint.getX() + i10, resultPoint.getY() + i11);
                            }
                        }
                        result = new Result(resultDecode.getText(), resultDecode.getRawBytes(), resultDecode.getNumBits(), resultPointArr, resultDecode.getBarcodeFormat(), resultDecode.getTimestamp());
                        result.putAllMetadata(resultDecode.getResultMetadata());
                    }
                    arrayList.add(result);
                    break;
                }
            } while (!((Result) it.next()).getText().equals(resultDecode.getText()));
            ResultPoint[] resultPoints2 = resultDecode.getResultPoints();
            if (resultPoints2 == null || resultPoints2.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f10 = width;
            float f11 = 0.0f;
            float f12 = height;
            float f13 = 0.0f;
            for (ResultPoint resultPoint2 : resultPoints2) {
                if (resultPoint2 != null) {
                    float x4 = resultPoint2.getX();
                    float y7 = resultPoint2.getY();
                    if (x4 < f10) {
                        f10 = x4;
                    }
                    if (y7 < f12) {
                        f12 = y7;
                    }
                    if (x4 > f11) {
                        f11 = x4;
                    }
                    if (y7 > f13) {
                        f13 = y7;
                    }
                }
            }
            if (f10 > 100.0f) {
                f6 = f13;
                a(binaryBitmap.crop(0, 0, (int) f10, height), map, arrayList, i10, i11, i12 + 1);
            } else {
                f6 = f13;
            }
            if (f12 > 100.0f) {
                a(binaryBitmap.crop(0, 0, width, (int) f12), map, arrayList, i10, i11, i12 + 1);
            }
            float f14 = f11;
            if (f14 < width - 100) {
                int i15 = (int) f14;
                i13 = height;
                a(binaryBitmap.crop(i15, 0, width - i15, i13), map, arrayList, i10 + i15, i11, i12 + 1);
            } else {
                i13 = height;
            }
            float f15 = f6;
            if (f15 < i13 - 100) {
                int i16 = (int) f15;
                a(binaryBitmap.crop(0, i16, width, i13 - i16), map, arrayList, i10, i11 + i16, i12 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        a(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }
}
