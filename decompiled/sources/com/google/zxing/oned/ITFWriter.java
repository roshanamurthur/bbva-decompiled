package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ITFWriter extends OneDimensionalCodeWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f49935a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f49936b = {3, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f49937c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.encode(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length <= 80) {
            boolean[] zArr = new boolean[(length * 9) + 9];
            int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, f49935a, true);
            for (int i10 = 0; i10 < length; i10 += 2) {
                int iDigit = Character.digit(str.charAt(i10), 10);
                int iDigit2 = Character.digit(str.charAt(i10 + 1), 10);
                int[] iArr = new int[10];
                for (int i11 = 0; i11 < 5; i11++) {
                    int i12 = i11 * 2;
                    int[][] iArr2 = f49937c;
                    iArr[i12] = iArr2[iDigit][i11];
                    iArr[i12 + 1] = iArr2[iDigit2][i11];
                }
                iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr, true);
            }
            OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, f49936b, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
