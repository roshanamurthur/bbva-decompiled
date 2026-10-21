package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class Detector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f50043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ResultPointCallback f50044b;

    public Detector(BitMatrix bitMatrix) {
        this.f50043a = bitMatrix;
    }

    public final float a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float fC = c((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float fC2 = c((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        if (Float.isNaN(fC)) {
            return fC2 / 7.0f;
        }
        return Float.isNaN(fC2) ? fC / 7.0f : (fC + fC2) / 14.0f;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[RETURN] */
    public final float b(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int iAbs = Math.abs(i16 - i14);
        int iAbs2 = Math.abs(i17 - i15);
        int i20 = 2;
        int i21 = (-iAbs) / 2;
        int i22 = i14 < i16 ? 1 : -1;
        int i23 = i15 < i17 ? 1 : -1;
        int i24 = i16 + i22;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if ((i27 == i19 ? i19 : 0) == this.f50043a.get(z10 ? i26 : i25, z10 ? i25 : i26)) {
                if (i27 == 2) {
                    return MathUtils.distance(i25, i26, i14, i15);
                }
                i27++;
            }
            i21 += iAbs2;
            if (i21 > 0) {
                if (i26 == i17) {
                    i18 = 2;
                    if (i27 == i18) {
                        return MathUtils.distance(i24, i17, i14, i15);
                    }
                    return Float.NaN;
                }
                i26 += i23;
                i21 -= iAbs;
            }
            i25 += i22;
            i24 = i24;
            z10 = z10;
            i19 = 1;
            i20 = 2;
        }
        i24 = i24;
        i18 = i20;
        if (i27 == i18) {
            return MathUtils.distance(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    public final float c(int i10, int i11, int i12, int i13) {
        float width;
        float height;
        float fB = b(i10, i11, i12, i13);
        int width2 = i10 - (i12 - i10);
        int height2 = 0;
        BitMatrix bitMatrix = this.f50043a;
        if (width2 < 0) {
            width = i10 / (i10 - width2);
            width2 = 0;
        } else if (width2 >= bitMatrix.getWidth()) {
            width = ((bitMatrix.getWidth() - 1) - i10) / (width2 - i10);
            width2 = bitMatrix.getWidth() - 1;
        } else {
            width = 1.0f;
        }
        float f6 = i11;
        int i14 = (int) (f6 - ((i13 - i11) * width));
        if (i14 < 0) {
            height = f6 / (i11 - i14);
        } else if (i14 >= bitMatrix.getHeight()) {
            height = ((bitMatrix.getHeight() - 1) - i11) / (i14 - i11);
            height2 = bitMatrix.getHeight() - 1;
        } else {
            height2 = i14;
            height = 1.0f;
        }
        return (b(i10, i11, (int) (((width2 - i10) * height) + i10), height2) + fB) - 1.0f;
    }

    public final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (a(resultPoint, resultPoint3) + a(resultPoint, resultPoint2)) / 2.0f;
    }

    public DetectorResult detect() throws NotFoundException, FormatException {
        return detect(null);
    }

    public final AlignmentPattern findAlignmentInRegion(float f6, int i10, int i11, float f10) throws NotFoundException {
        BitMatrix bitMatrix;
        AlignmentPattern alignmentPatternB;
        AlignmentPattern alignmentPatternB2;
        int i12 = (int) (f10 * f6);
        int iMax = Math.max(0, i10 - i12);
        BitMatrix bitMatrix2 = this.f50043a;
        int iMin = Math.min(bitMatrix2.getWidth() - 1, i10 + i12) - iMax;
        float f11 = 3.0f * f6;
        if (iMin < f11) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(bitMatrix2.getHeight() - 1, i11 + i12) - iMax2;
        if (iMin2 < f11) {
            throw NotFoundException.getNotFoundInstance();
        }
        a aVar = new a(this.f50043a, iMax, iMax2, iMin, iMin2, f6, this.f50044b);
        int i13 = aVar.f50061e;
        int i14 = aVar.f50059c;
        int i15 = i13 + i14;
        int i16 = aVar.f50062f;
        int i17 = (i16 / 2) + aVar.f50060d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (true) {
                bitMatrix = aVar.f50057a;
                if (i20 >= i15 || bitMatrix.get(i20, i19)) {
                    break;
                }
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bitMatrix.get(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (aVar.a(iArr) && (alignmentPatternB2 = aVar.b(i19, i20, iArr)) != null) {
                        return alignmentPatternB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (aVar.a(iArr) && (alignmentPatternB = aVar.b(i19, i15, iArr)) != null) {
                return alignmentPatternB;
            }
        }
        ArrayList arrayList = aVar.f50058b;
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (AlignmentPattern) arrayList.get(0);
    }

    public final BitMatrix getImage() {
        return this.f50043a;
    }

    public final ResultPointCallback getResultPointCallback() {
        return this.f50044b;
    }

    public final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) throws NotFoundException, FormatException {
        AlignmentPattern alignmentPatternFindAlignmentInRegion;
        float x4;
        float y7;
        float f6;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float fCalculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (fCalculateModuleSize < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iRound = (MathUtils.round(ResultPoint.distance(topLeft, bottomLeft) / fCalculateModuleSize) + MathUtils.round(ResultPoint.distance(topLeft, topRight) / fCalculateModuleSize)) / 2;
        int i10 = iRound + 7;
        int i11 = i10 & 3;
        if (i11 == 0) {
            i10 = iRound + 8;
        } else if (i11 == 2) {
            i10 = iRound + 6;
        } else if (i11 == 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(i10);
        int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
        if (provisionalVersionForDimension.getAlignmentPatternCenters().length <= 0) {
            alignmentPatternFindAlignmentInRegion = null;
            break;
        }
        float x6 = bottomLeft.getX() + (topRight.getX() - topLeft.getX());
        float y10 = bottomLeft.getY() + (topRight.getY() - topLeft.getY());
        float f10 = 1.0f - (3.0f / dimensionForVersion);
        int x7 = (int) (((x6 - topLeft.getX()) * f10) + topLeft.getX());
        int y11 = (int) (((y10 - topLeft.getY()) * f10) + topLeft.getY());
        int i12 = 4;
        while (true) {
            if (i12 > 16) {
                alignmentPatternFindAlignmentInRegion = null;
                break;
            }
            try {
                alignmentPatternFindAlignmentInRegion = findAlignmentInRegion(fCalculateModuleSize, x7, y11, i12);
                break;
            } catch (NotFoundException unused) {
                i12 <<= 1;
            }
        }
        float f11 = i10 - 3.5f;
        if (alignmentPatternFindAlignmentInRegion != null) {
            x4 = alignmentPatternFindAlignmentInRegion.getX();
            y7 = alignmentPatternFindAlignmentInRegion.getY();
            f6 = f11 - 3.0f;
        } else {
            x4 = bottomLeft.getX() + (topRight.getX() - topLeft.getX());
            y7 = bottomLeft.getY() + (topRight.getY() - topLeft.getY());
            f6 = f11;
        }
        return new DetectorResult(GridSampler.getInstance().sampleGrid(this.f50043a, i10, i10, PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f11, 3.5f, f6, f6, 3.5f, f11, topLeft.getX(), topLeft.getY(), topRight.getX(), topRight.getY(), x4, y7, bottomLeft.getX(), bottomLeft.getY())), alignmentPatternFindAlignmentInRegion == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPatternFindAlignmentInRegion});
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ArrayList arrayList;
        int iAbs;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f50044b = resultPointCallback;
        FinderPatternFinder finderPatternFinder = new FinderPatternFinder(this.f50043a, resultPointCallback);
        boolean z10 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        BitMatrix bitMatrix = finderPatternFinder.f50047a;
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        int i10 = (height * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean zB = false;
        while (true) {
            arrayList = finderPatternFinder.f50048b;
            if (i11 >= height || zB) {
                break;
            }
            finderPatternFinder.clearCounts(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i13 < width) {
                if (bitMatrix.get(i13, i11)) {
                    if ((i12 & 1) == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if ((i12 & 1) != 0) {
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 != 4) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else if (FinderPatternFinder.foundPatternCross(iArr) && finderPatternFinder.handlePossibleCenter(iArr, i11, i13)) {
                    if (finderPatternFinder.f50049c) {
                        zB = finderPatternFinder.b();
                    } else {
                        if (arrayList.size() > 1) {
                            Iterator it = arrayList.iterator();
                            FinderPattern finderPattern = null;
                            while (true) {
                                if (!it.hasNext()) {
                                    iAbs = 0;
                                    break;
                                }
                                FinderPattern finderPattern2 = (FinderPattern) it.next();
                                if (finderPattern2.f50046d >= 2) {
                                    if (finderPattern != null) {
                                        finderPatternFinder.f50049c = true;
                                        iAbs = ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                                        break;
                                    }
                                    finderPattern = finderPattern2;
                                }
                            }
                        } else {
                            iAbs = 0;
                            break;
                        }
                        int i14 = iArr[2];
                        if (iAbs > i14) {
                            i11 += (iAbs - i14) - 2;
                            i13 = width - 1;
                        }
                    }
                    finderPatternFinder.clearCounts(iArr);
                    i10 = 2;
                    i12 = 0;
                } else {
                    finderPatternFinder.shiftCounts2(iArr);
                    i12 = 3;
                }
                i13++;
            }
            if (FinderPatternFinder.foundPatternCross(iArr) && finderPatternFinder.handlePossibleCenter(iArr, i11, width)) {
                int i15 = iArr[0];
                if (finderPatternFinder.f50049c) {
                    zB = finderPatternFinder.b();
                }
                i10 = i15;
            }
            i11 += i10;
        }
        int size = arrayList.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float estimatedModuleSize = 0.0f;
        if (size > 3) {
            Iterator it2 = arrayList.iterator();
            float f6 = 0.0f;
            float f10 = 0.0f;
            while (it2.hasNext()) {
                float estimatedModuleSize2 = ((FinderPattern) it2.next()).getEstimatedModuleSize();
                f6 += estimatedModuleSize2;
                f10 += estimatedModuleSize2 * estimatedModuleSize2;
            }
            float f11 = size;
            float f12 = f6 / f11;
            float fSqrt = (float) Math.sqrt((f10 / f11) - (f12 * f12));
            Collections.sort(arrayList, new FinderPatternFinder.b(f12));
            float fMax = Math.max(0.2f * f12, fSqrt);
            int i16 = 0;
            while (i16 < arrayList.size() && arrayList.size() > 3) {
                if (Math.abs(((FinderPattern) arrayList.get(i16)).getEstimatedModuleSize() - f12) > fMax) {
                    arrayList.remove(i16);
                    i16--;
                }
                i16++;
            }
        }
        int i17 = 3;
        if (arrayList.size() > 3) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                estimatedModuleSize += ((FinderPattern) it3.next()).getEstimatedModuleSize();
            }
            Collections.sort(arrayList, new FinderPatternFinder.a(estimatedModuleSize / arrayList.size()));
            i17 = 3;
            arrayList.subList(3, arrayList.size()).clear();
        }
        FinderPattern[] finderPatternArr = new FinderPattern[i17];
        finderPatternArr[0] = (FinderPattern) arrayList.get(0);
        finderPatternArr[1] = (FinderPattern) arrayList.get(1);
        finderPatternArr[2] = (FinderPattern) arrayList.get(2);
        ResultPoint.orderBestPatterns(finderPatternArr);
        return processFinderPatternInfo(new FinderPatternInfo(finderPatternArr));
    }
}
