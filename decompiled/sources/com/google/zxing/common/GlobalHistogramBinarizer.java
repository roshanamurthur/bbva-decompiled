package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes10.dex */
public class GlobalHistogramBinarizer extends Binarizer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f49827d = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f49828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f49829c;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
        this.f49828b = f49827d;
        this.f49829c = new int[32];
    }

    public static int a(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        if (i12 - i15 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i21 = i12 - 1;
        int i22 = -1;
        int i23 = i21;
        while (i21 > i15) {
            int i24 = i21 - i15;
            int i25 = (i11 - iArr[i21]) * (i12 - i21) * i24 * i24;
            if (i25 > i22) {
                i23 = i21;
                i22 = i25;
            }
            i21--;
        }
        return i23 << 3;
    }

    @Override // com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new GlobalHistogramBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        int[] iArr;
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        if (this.f49828b.length < width) {
            this.f49828b = new byte[width];
        }
        int i10 = 0;
        while (true) {
            iArr = this.f49829c;
            if (i10 >= 32) {
                break;
            }
            iArr[i10] = 0;
            i10++;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            byte[] row = luminanceSource.getRow((height * i11) / 5, this.f49828b);
            int i12 = (width << 2) / 5;
            for (int i13 = width / 5; i13 < i12; i13++) {
                int i14 = (row[i13] & 255) >> 3;
                iArr[i14] = iArr[i14] + 1;
            }
        }
        int iA = a(iArr);
        byte[] matrix = luminanceSource.getMatrix();
        for (int i15 = 0; i15 < height; i15++) {
            int i16 = i15 * width;
            for (int i17 = 0; i17 < width; i17++) {
                if ((matrix[i16 + i17] & 255) < iA) {
                    bitMatrix.set(i17, i15);
                }
            }
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Binarizer
    public BitArray getBlackRow(int i10, BitArray bitArray) throws NotFoundException {
        int[] iArr;
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        if (bitArray == null || bitArray.getSize() < width) {
            bitArray = new BitArray(width);
        } else {
            bitArray.clear();
        }
        if (this.f49828b.length < width) {
            this.f49828b = new byte[width];
        }
        int i11 = 0;
        while (true) {
            iArr = this.f49829c;
            if (i11 >= 32) {
                break;
            }
            iArr[i11] = 0;
            i11++;
        }
        byte[] row = luminanceSource.getRow(i10, this.f49828b);
        for (int i12 = 0; i12 < width; i12++) {
            int i13 = (row[i12] & 255) >> 3;
            iArr[i13] = iArr[i13] + 1;
        }
        int iA = a(iArr);
        if (width < 3) {
            for (int i14 = 0; i14 < width; i14++) {
                if ((row[i14] & 255) < iA) {
                    bitArray.set(i14);
                }
            }
        } else {
            int i15 = 1;
            int i16 = row[0] & 255;
            int i17 = row[1] & 255;
            while (i15 < width - 1) {
                int i18 = i15 + 1;
                int i19 = row[i18] & 255;
                if ((((i17 << 2) - i16) - i19) / 2 < iA) {
                    bitArray.set(i15);
                }
                i16 = i17;
                i15 = i18;
                i17 = i19;
            }
        }
        return bitArray;
    }
}
