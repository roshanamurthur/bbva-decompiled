package com.google.zxing.oned;

import com.budiyev.android.codescanner.BarcodeUtils;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OneDReader implements Reader {
    public static float patternMatchVariance(int[] iArr, int[] iArr2, float f6) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = f6 * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f14 = iArr2[i13] * f11;
            float f15 = i14;
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }

    public static void recordPattern(BitArray bitArray, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i10 >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z10 = !bitArray.get(i10);
        while (i10 < size) {
            if (bitArray.get(i10) == z10) {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            } else {
                iArr[i11] = iArr[i11] + 1;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != size) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void recordPatternInReverse(BitArray bitArray, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z10 = bitArray.get(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (bitArray.get(i10) != z10) {
                length--;
                z10 = !z10;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i10 + 1, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    public final Result a(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i10;
        int i11;
        Map<DecodeHintType, ?> map3 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray = new BitArray(width);
        int i12 = 0;
        int i13 = 1;
        boolean z10 = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, height >> (z10 ? 8 : 5));
        int i14 = z10 ? height : 15;
        int i15 = height / 2;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = i16 + 1;
            int i18 = i17 / 2;
            if ((i16 & 1) != 0) {
                i18 = -i18;
            }
            int i19 = (i18 * iMax) + i15;
            if (i19 < 0 || i19 >= height) {
                break;
            }
            try {
                bitArray = binaryBitmap.getBlackRow(i19, bitArray);
                int i20 = i12;
                while (i20 < 2) {
                    if (i20 == i13) {
                        bitArray.reverse();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        Result resultDecodeRow = decodeRow(i19, bitArray, map3);
                        if (i20 == i13) {
                            try {
                                resultDecodeRow.putMetadata(ResultMetadataType.ORIENTATION, 180);
                                ResultPoint[] resultPoints = resultDecodeRow.getResultPoints();
                                if (resultPoints != null) {
                                    map2 = map3;
                                    float f6 = width;
                                    try {
                                        i10 = width;
                                        try {
                                            resultPoints[0] = new ResultPoint((f6 - resultPoints[i12].getX()) - 1.0f, resultPoints[i12].getY());
                                            i11 = 1;
                                            try {
                                                resultPoints[1] = new ResultPoint((f6 - resultPoints[1].getX()) - 1.0f, resultPoints[1].getY());
                                            } catch (ReaderException unused) {
                                                continue;
                                                i20++;
                                                i13 = i11;
                                                map3 = map2;
                                                width = i10;
                                                i12 = 0;
                                            }
                                        } catch (ReaderException unused2) {
                                            i11 = 1;
                                            i20++;
                                            i13 = i11;
                                            map3 = map2;
                                            width = i10;
                                            i12 = 0;
                                        }
                                    } catch (ReaderException unused3) {
                                        i10 = width;
                                        i11 = 1;
                                        i20++;
                                        i13 = i11;
                                        map3 = map2;
                                        width = i10;
                                        i12 = 0;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                            }
                        }
                        return resultDecodeRow;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i10 = width;
                        i11 = i13;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i16 = i17;
            i13 = i13;
            width = width;
            i12 = 0;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    public abstract Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return a(binaryBitmap, map);
        } catch (NotFoundException e5) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !binaryBitmap.isRotateSupported()) {
                throw e5;
            }
            BinaryBitmap binaryBitmapRotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result resultA = a(binaryBitmapRotateCounterClockwise, map);
            Map<ResultMetadataType, Object> resultMetadata = resultA.getResultMetadata();
            int iIntValue = BarcodeUtils.ROTATION_270;
            if (resultMetadata != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (resultMetadata.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) resultMetadata.get(resultMetadataType)).intValue() + BarcodeUtils.ROTATION_270) % 360;
                }
            }
            resultA.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            ResultPoint[] resultPoints = resultA.getResultPoints();
            if (resultPoints != null) {
                int height = binaryBitmapRotateCounterClockwise.getHeight();
                for (int i10 = 0; i10 < resultPoints.length; i10++) {
                    resultPoints[i10] = new ResultPoint((height - resultPoints[i10].getY()) - 1.0f, resultPoints[i10].getX());
                }
            }
            return resultA;
        }
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }
}
