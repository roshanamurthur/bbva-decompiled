package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ByQuadrantReader implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f49901a;

    public ByQuadrantReader(Reader reader) {
        this.f49901a = reader;
    }

    public static void a(ResultPoint[] resultPointArr, int i10, int i11) {
        if (resultPointArr != null) {
            for (int i12 = 0; i12 < resultPointArr.length; i12++) {
                ResultPoint resultPoint = resultPointArr[i12];
                resultPointArr[i12] = new ResultPoint(resultPoint.getX() + i10, resultPoint.getY() + i11);
            }
        }
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public void reset() {
        this.f49901a.reset();
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        Reader reader = this.f49901a;
        int width = binaryBitmap.getWidth() / 2;
        int height = binaryBitmap.getHeight() / 2;
        try {
            try {
                try {
                    try {
                        return reader.decode(binaryBitmap.crop(0, 0, width, height), map);
                    } catch (NotFoundException unused) {
                        int i10 = width / 2;
                        int i11 = height / 2;
                        Result resultDecode = reader.decode(binaryBitmap.crop(i10, i11, width, height), map);
                        a(resultDecode.getResultPoints(), i10, i11);
                        return resultDecode;
                    }
                } catch (NotFoundException unused2) {
                    Result resultDecode2 = reader.decode(binaryBitmap.crop(width, height, width, height), map);
                    a(resultDecode2.getResultPoints(), width, height);
                    return resultDecode2;
                }
            } catch (NotFoundException unused3) {
                Result resultDecode3 = reader.decode(binaryBitmap.crop(0, height, width, height), map);
                a(resultDecode3.getResultPoints(), 0, height);
                return resultDecode3;
            }
        } catch (NotFoundException unused4) {
            Result resultDecode4 = reader.decode(binaryBitmap.crop(width, 0, width, height), map);
            a(resultDecode4.getResultPoints(), width, 0);
            return resultDecode4;
        }
    }
}
