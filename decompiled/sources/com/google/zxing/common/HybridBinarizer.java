package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitMatrix f49831e;

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        HybridBinarizer hybridBinarizer;
        BitMatrix bitMatrix = this.f49831e;
        if (bitMatrix != null) {
            return bitMatrix;
        }
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        if (width < 40 || height < 40) {
            hybridBinarizer = this;
            hybridBinarizer.f49831e = super.getBlackMatrix();
        } else {
            byte[] matrix = luminanceSource.getMatrix();
            int i10 = width >> 3;
            if ((width & 7) != 0) {
                i10++;
            }
            int i11 = height >> 3;
            if ((height & 7) != 0) {
                i11++;
            }
            int i12 = height - 8;
            int i13 = width - 8;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i10);
            int i14 = 0;
            while (true) {
                int i15 = 8;
                if (i14 >= i11) {
                    break;
                }
                int i16 = i14 << 3;
                if (i16 > i12) {
                    i16 = i12;
                }
                int i17 = 0;
                while (i17 < i10) {
                    int i18 = i17 << 3;
                    if (i18 > i13) {
                        i18 = i13;
                    }
                    int i19 = (i16 * width) + i18;
                    int i20 = 0;
                    int i21 = 255;
                    int i22 = 0;
                    int i23 = 0;
                    while (i20 < i15) {
                        int i24 = i16;
                        int i25 = i23;
                        int i26 = 0;
                        while (i26 < i15) {
                            int i27 = matrix[i19 + i26] & 255;
                            i22 += i27;
                            if (i27 < i21) {
                                i21 = i27;
                            }
                            if (i27 > i25) {
                                i25 = i27;
                            }
                            i26++;
                            i15 = 8;
                        }
                        if (i25 - i21 > 24) {
                            while (true) {
                                i20++;
                                i19 += width;
                                if (i20 < 8) {
                                    int i28 = 0;
                                    for (int i29 = 8; i28 < i29; i29 = 8) {
                                        i22 += matrix[i19 + i28] & 255;
                                        i28++;
                                    }
                                }
                            }
                        }
                        i20++;
                        i19 += width;
                        i15 = 8;
                        i23 = i25;
                        i16 = i24;
                    }
                    int i30 = i16;
                    int i31 = i22 >> 6;
                    if (i23 - i21 <= 24) {
                        i31 = i21 / 2;
                        if (i14 > 0 && i17 > 0) {
                            int[] iArr2 = iArr[i14 - 1];
                            int i32 = i17 - 1;
                            int i33 = (((iArr[i14][i32] * 2) + iArr2[i17]) + iArr2[i32]) / 4;
                            if (i21 < i33) {
                                i31 = i33;
                            }
                        }
                    }
                    iArr[i14][i17] = i31;
                    i17++;
                    i15 = 8;
                    i16 = i30;
                }
                i14++;
            }
            BitMatrix bitMatrix2 = new BitMatrix(width, height);
            int i34 = 0;
            while (i34 < i11) {
                int i35 = i34 << 3;
                if (i35 > i12) {
                    i35 = i12;
                }
                int i36 = i11 - 3;
                int i37 = i34 < 2 ? 2 : i34 > i36 ? i36 : i34;
                for (int i38 = 0; i38 < i10; i38++) {
                    int i39 = i38 << 3;
                    if (i39 > i13) {
                        i39 = i13;
                    }
                    int i40 = i10 - 3;
                    if (i38 < 2) {
                        i40 = 2;
                    } else if (i38 <= i40) {
                        i40 = i38;
                    }
                    int i41 = -2;
                    int i42 = 0;
                    for (int i43 = 2; i41 <= i43; i43 = 2) {
                        int[] iArr3 = iArr[i37 + i41];
                        i42 = iArr3[i40 - 2] + iArr3[i40 - 1] + iArr3[i40] + iArr3[i40 + 1] + iArr3[i40 + 2] + i42;
                        i41++;
                    }
                    int i44 = i42 / 25;
                    int i45 = (i35 * width) + i39;
                    int i46 = 8;
                    int i47 = 0;
                    while (i47 < i46) {
                        int i48 = i10;
                        int i49 = 0;
                        while (i49 < i46) {
                            byte[] bArr = matrix;
                            if ((matrix[i45 + i49] & 255) <= i44) {
                                bitMatrix2.set(i39 + i49, i35 + i47);
                            }
                            i49++;
                            matrix = bArr;
                            i46 = 8;
                        }
                        i47++;
                        i45 += width;
                        i10 = i48;
                        i46 = 8;
                    }
                }
                i34++;
            }
            hybridBinarizer = this;
            hybridBinarizer.f49831e = bitMatrix2;
        }
        return hybridBinarizer.f49831e;
    }
}
