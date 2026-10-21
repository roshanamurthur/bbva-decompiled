package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FinderPatternFinder {
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f50047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f50048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f50050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ResultPointCallback f50051e;

    public static final class a implements Serializable, Comparator<FinderPattern> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final float f50052p0;

        public a(float f6) {
            this.f50052p0 = f6;
        }

        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            FinderPattern finderPattern3 = finderPattern;
            FinderPattern finderPattern4 = finderPattern2;
            int iCompare = Integer.compare(finderPattern4.f50046d, finderPattern3.f50046d);
            if (iCompare != 0) {
                return iCompare;
            }
            float estimatedModuleSize = finderPattern3.getEstimatedModuleSize();
            float f6 = this.f50052p0;
            return Float.compare(Math.abs(estimatedModuleSize - f6), Math.abs(finderPattern4.getEstimatedModuleSize() - f6));
        }
    }

    public static final class b implements Serializable, Comparator<FinderPattern> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final float f50053p0;

        public b(float f6) {
            this.f50053p0 = f6;
        }

        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            float estimatedModuleSize = finderPattern2.getEstimatedModuleSize();
            float f6 = this.f50053p0;
            return Float.compare(Math.abs(estimatedModuleSize - f6), Math.abs(finderPattern.getEstimatedModuleSize() - f6));
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    public static float a(int i10, int[] iArr) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean foundPatternCross(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f6 = i10 / 7.0f;
        float f10 = f6 / 2.0f;
        return Math.abs(f6 - ((float) iArr[0])) < f10 && Math.abs(f6 - ((float) iArr[1])) < f10 && Math.abs((f6 * 3.0f) - ((float) iArr[2])) < 3.0f * f10 && Math.abs(f6 - ((float) iArr[3])) < f10 && Math.abs(f6 - ((float) iArr[4])) < f10;
    }

    public static boolean foundPatternDiagonal(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f6 = i10 / 7.0f;
        float f10 = f6 / 1.333f;
        return Math.abs(f6 - ((float) iArr[0])) < f10 && Math.abs(f6 - ((float) iArr[1])) < f10 && Math.abs((f6 * 3.0f) - ((float) iArr[2])) < 3.0f * f10 && Math.abs(f6 - ((float) iArr[3])) < f10 && Math.abs(f6 - ((float) iArr[4])) < f10;
    }

    public final boolean b() {
        ArrayList<FinderPattern> arrayList = this.f50048b;
        int size = arrayList.size();
        float fAbs = 0.0f;
        int i10 = 0;
        float estimatedModuleSize = 0.0f;
        for (FinderPattern finderPattern : arrayList) {
            if (finderPattern.f50046d >= 2) {
                i10++;
                estimatedModuleSize += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f6 = estimatedModuleSize / size;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(((FinderPattern) it.next()).getEstimatedModuleSize() - f6);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    public final void clearCounts(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = 0;
        }
    }

    public final BitMatrix getImage() {
        return this.f50047a;
    }

    public final List<FinderPattern> getPossibleCenters() {
        return this.f50048b;
    }

    @Deprecated
    public final boolean handlePossibleCenter(int[] iArr, int i10, int i11, boolean z10) {
        return handlePossibleCenter(iArr, i10, i11);
    }

    public final void shiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.f50047a = bitMatrix;
        this.f50048b = new ArrayList();
        this.f50050d = new int[5];
        this.f50051e = resultPointCallback;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    public final boolean handlePossibleCenter(int[] iArr, int i10, int i11) {
        float fA;
        float fA2;
        int i12;
        int i13;
        int i14;
        int i15 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(i11, iArr);
        int i16 = iArr[2];
        BitMatrix bitMatrix = this.f50047a;
        int height = bitMatrix.getHeight();
        int[] iArr2 = this.f50050d;
        clearCounts(iArr2);
        int i17 = i10;
        while (i17 >= 0 && bitMatrix.get(iA, i17)) {
            iArr2[2] = iArr2[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            fA = Float.NaN;
        } else {
            while (i17 >= 0 && !bitMatrix.get(iA, i17)) {
                int i18 = iArr2[1];
                if (i18 > i16) {
                    break;
                }
                iArr2[1] = i18 + 1;
                i17--;
            }
            if (i17 < 0 || iArr2[1] > i16) {
                fA = Float.NaN;
            } else {
                while (i17 >= 0 && bitMatrix.get(iA, i17)) {
                    int i19 = iArr2[0];
                    if (i19 > i16) {
                        break;
                    }
                    iArr2[0] = i19 + 1;
                    i17--;
                }
                if (iArr2[0] > i16) {
                    fA = Float.NaN;
                } else {
                    int i20 = i10 + 1;
                    while (i20 < height && bitMatrix.get(iA, i20)) {
                        iArr2[2] = iArr2[2] + 1;
                        i20++;
                    }
                    if (i20 == height) {
                        fA = Float.NaN;
                    } else {
                        while (i20 < height && !bitMatrix.get(iA, i20)) {
                            int i21 = iArr2[3];
                            if (i21 >= i16) {
                                break;
                            }
                            iArr2[3] = i21 + 1;
                            i20++;
                        }
                        if (i20 == height || iArr2[3] >= i16) {
                            fA = Float.NaN;
                        } else {
                            while (i20 < height && bitMatrix.get(iA, i20)) {
                                int i22 = iArr2[4];
                                if (i22 >= i16) {
                                    break;
                                }
                                iArr2[4] = i22 + 1;
                                i20++;
                            }
                            int i23 = iArr2[4];
                            if (i23 < i16 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[2]) + iArr2[3]) + i23) - i15) * 5 < i15 * 2 && foundPatternCross(iArr2)) {
                                fA = a(i20, iArr2);
                            } else {
                                fA = Float.NaN;
                            }
                        }
                    }
                }
            }
        }
        if (!Float.isNaN(fA)) {
            int i24 = (int) fA;
            int i25 = iArr[2];
            int width = bitMatrix.getWidth();
            clearCounts(iArr2);
            int i26 = iA;
            while (i26 >= 0 && bitMatrix.get(i26, i24)) {
                iArr2[2] = iArr2[2] + 1;
                i26--;
            }
            if (i26 < 0) {
                fA2 = Float.NaN;
            } else {
                while (i26 >= 0 && !bitMatrix.get(i26, i24)) {
                    int i27 = iArr2[1];
                    if (i27 > i25) {
                        break;
                    }
                    iArr2[1] = i27 + 1;
                    i26--;
                }
                if (i26 < 0 || iArr2[1] > i25) {
                    fA2 = Float.NaN;
                } else {
                    while (i26 >= 0 && bitMatrix.get(i26, i24)) {
                        int i28 = iArr2[0];
                        if (i28 > i25) {
                            break;
                        }
                        iArr2[0] = i28 + 1;
                        i26--;
                    }
                    if (iArr2[0] > i25) {
                        fA2 = Float.NaN;
                    } else {
                        int i29 = iA + 1;
                        while (i29 < width && bitMatrix.get(i29, i24)) {
                            iArr2[2] = iArr2[2] + 1;
                            i29++;
                        }
                        if (i29 == width) {
                            fA2 = Float.NaN;
                        } else {
                            while (i29 < width && !bitMatrix.get(i29, i24)) {
                                int i30 = iArr2[3];
                                if (i30 >= i25) {
                                    break;
                                }
                                iArr2[3] = i30 + 1;
                                i29++;
                            }
                            if (i29 == width || iArr2[3] >= i25) {
                                fA2 = Float.NaN;
                            } else {
                                while (i29 < width && bitMatrix.get(i29, i24)) {
                                    int i31 = iArr2[4];
                                    if (i31 >= i25) {
                                        break;
                                    }
                                    iArr2[4] = i31 + 1;
                                    i29++;
                                }
                                int i32 = iArr2[4];
                                if (i32 < i25 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[2]) + iArr2[3]) + i32) - i15) * 5 < i15 && foundPatternCross(iArr2)) {
                                    fA2 = a(i29, iArr2);
                                } else {
                                    fA2 = Float.NaN;
                                }
                            }
                        }
                    }
                }
            }
            if (!Float.isNaN(fA2)) {
                int i33 = (int) fA2;
                clearCounts(iArr2);
                int i34 = 0;
                while (i24 >= i34 && i33 >= i34 && bitMatrix.get(i33 - i34, i24 - i34)) {
                    iArr2[2] = iArr2[2] + 1;
                    i34++;
                }
                if (iArr2[2] != 0) {
                    while (i24 >= i34 && i33 >= i34 && !bitMatrix.get(i33 - i34, i24 - i34)) {
                        iArr2[1] = iArr2[1] + 1;
                        i34++;
                    }
                    if (iArr2[1] != 0) {
                        while (i24 >= i34 && i33 >= i34 && bitMatrix.get(i33 - i34, i24 - i34)) {
                            iArr2[0] = iArr2[0] + 1;
                            i34++;
                        }
                        if (iArr2[0] != 0) {
                            int height2 = bitMatrix.getHeight();
                            int width2 = bitMatrix.getWidth();
                            int i35 = 1;
                            while (true) {
                                int i36 = i24 + i35;
                                if (i36 >= height2 || (i14 = i33 + i35) >= width2 || !bitMatrix.get(i14, i36)) {
                                    break;
                                }
                                iArr2[2] = iArr2[2] + 1;
                                i35++;
                            }
                            while (true) {
                                int i37 = i24 + i35;
                                if (i37 >= height2 || (i13 = i33 + i35) >= width2 || bitMatrix.get(i13, i37)) {
                                    break;
                                }
                                iArr2[3] = iArr2[3] + 1;
                                i35++;
                            }
                            if (iArr2[3] != 0) {
                                while (true) {
                                    int i38 = i24 + i35;
                                    if (i38 >= height2 || (i12 = i33 + i35) >= width2 || !bitMatrix.get(i12, i38)) {
                                        break;
                                    }
                                    iArr2[4] = iArr2[4] + 1;
                                    i35++;
                                }
                                if (iArr2[4] != 0 && foundPatternDiagonal(iArr2)) {
                                    float f6 = i15 / 7.0f;
                                    int i39 = 0;
                                    while (true) {
                                        ArrayList arrayList = this.f50048b;
                                        if (i39 >= arrayList.size()) {
                                            FinderPattern finderPattern = new FinderPattern(fA2, fA, f6, 1);
                                            arrayList.add(finderPattern);
                                            ResultPointCallback resultPointCallback = this.f50051e;
                                            if (resultPointCallback == null) {
                                                break;
                                            }
                                            resultPointCallback.foundPossibleResultPoint(finderPattern);
                                            break;
                                        }
                                        FinderPattern finderPattern2 = (FinderPattern) arrayList.get(i39);
                                        if (Math.abs(fA - finderPattern2.getY()) <= f6 && Math.abs(fA2 - finderPattern2.getX()) <= f6) {
                                            float f10 = finderPattern2.f50045c;
                                            float fAbs = Math.abs(f6 - f10);
                                            if (fAbs <= 1.0f || fAbs <= f10) {
                                                int i40 = finderPattern2.f50046d;
                                                int i41 = i40 + 1;
                                                float f11 = i40;
                                                float f12 = i41;
                                                arrayList.set(i39, new FinderPattern(((finderPattern2.getX() * f11) + fA2) / f12, ((finderPattern2.getY() * f11) + fA) / f12, ((f11 * f10) + f6) / f12, i41));
                                                break;
                                            }
                                        }
                                        i39++;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
}
