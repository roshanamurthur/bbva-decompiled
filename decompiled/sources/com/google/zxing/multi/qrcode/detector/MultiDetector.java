package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.qrcode.detector.Detector;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import dh.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class MultiDetector extends Detector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DetectorResult[] f49905c = new DetectorResult[0];

    public MultiDetector(BitMatrix bitMatrix) {
        super(bitMatrix);
    }

    public DetectorResult[] detectMulti(Map<DecodeHintType, ?> map) throws NotFoundException {
        FinderPattern[][] finderPatternArr;
        char c10;
        char c11;
        a aVar = new a(getImage(), map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK));
        char c12 = 0;
        boolean z10 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        BitMatrix image = aVar.getImage();
        int height = image.getHeight();
        int width = image.getWidth();
        int i10 = (height * 3) / 388;
        int i11 = 3;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        for (int i12 = i10 - 1; i12 < height; i12 += i10) {
            aVar.clearCounts(iArr);
            int i13 = 0;
            for (int i14 = 0; i14 < width; i14++) {
                if (image.get(i14, i12)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (FinderPatternFinder.foundPatternCross(iArr) && aVar.handlePossibleCenter(iArr, i12, i14)) {
                    aVar.clearCounts(iArr);
                    i13 = 0;
                } else {
                    aVar.shiftCounts2(iArr);
                    i13 = 3;
                }
            }
            if (FinderPatternFinder.foundPatternCross(iArr)) {
                aVar.handlePossibleCenter(iArr, i12, width);
            }
        }
        List<FinderPattern> possibleCenters = aVar.getPossibleCenters();
        int size = possibleCenters.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        char c13 = 2;
        if (size == 3) {
            finderPatternArr = new FinderPattern[][]{new FinderPattern[]{possibleCenters.get(0), possibleCenters.get(1), possibleCenters.get(2)}};
        } else {
            Collections.sort(possibleCenters, new a.C0281a());
            ArrayList arrayList = new ArrayList();
            int i15 = 0;
            while (i15 < size - 2) {
                FinderPattern finderPattern = possibleCenters.get(i15);
                if (finderPattern != null) {
                    int i16 = i15 + 1;
                    while (i16 < size - 1) {
                        FinderPattern finderPattern2 = possibleCenters.get(i16);
                        if (finderPattern2 == null) {
                            c10 = c13;
                            break;
                            break;
                        }
                        float estimatedModuleSize = (finderPattern.getEstimatedModuleSize() - finderPattern2.getEstimatedModuleSize()) / Math.min(finderPattern.getEstimatedModuleSize(), finderPattern2.getEstimatedModuleSize());
                        float f6 = 0.5f;
                        float f10 = 0.05f;
                        if (Math.abs(finderPattern.getEstimatedModuleSize() - finderPattern2.getEstimatedModuleSize()) > 0.5f && estimatedModuleSize >= 0.05f) {
                            break;
                        }
                        int i17 = i16 + 1;
                        while (true) {
                            if (i17 >= size) {
                                c10 = c13;
                                break;
                            }
                            FinderPattern finderPattern3 = possibleCenters.get(i17);
                            if (finderPattern3 != null) {
                                float estimatedModuleSize2 = (finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) / Math.min(finderPattern2.getEstimatedModuleSize(), finderPattern3.getEstimatedModuleSize());
                                if (Math.abs(finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) > f6 && estimatedModuleSize2 >= f10) {
                                    c10 = 2;
                                    break;
                                }
                                FinderPattern[] finderPatternArr2 = new FinderPattern[i11];
                                finderPatternArr2[c12] = finderPattern;
                                finderPatternArr2[1] = finderPattern2;
                                c11 = 2;
                                finderPatternArr2[2] = finderPattern3;
                                ResultPoint.orderBestPatterns(finderPatternArr2);
                                FinderPatternInfo finderPatternInfo = new FinderPatternInfo(finderPatternArr2);
                                float fDistance = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getBottomLeft());
                                float fDistance2 = ResultPoint.distance(finderPatternInfo.getTopRight(), finderPatternInfo.getBottomLeft());
                                float fDistance3 = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getTopRight());
                                float estimatedModuleSize3 = (fDistance + fDistance3) / (finderPattern.getEstimatedModuleSize() * 2.0f);
                                if (estimatedModuleSize3 <= 180.0f && estimatedModuleSize3 >= 9.0f && Math.abs((fDistance - fDistance3) / Math.min(fDistance, fDistance3)) < 0.1f) {
                                    float fSqrt = (float) Math.sqrt((fDistance3 * fDistance3) + (fDistance * fDistance));
                                    if (Math.abs((fDistance2 - fSqrt) / Math.min(fDistance2, fSqrt)) < 0.1f) {
                                        arrayList.add(finderPatternArr2);
                                    }
                                }
                            } else {
                                c11 = c13;
                            }
                            i17++;
                            c13 = c11;
                            c12 = 0;
                            i11 = 3;
                            f6 = 0.5f;
                            f10 = 0.05f;
                        }
                        i16++;
                        c13 = c10;
                        c12 = 0;
                        i11 = 3;
                    }
                }
                i15++;
                c13 = c13;
                c12 = 0;
                i11 = 3;
            }
            if (arrayList.isEmpty()) {
                throw NotFoundException.getNotFoundInstance();
            }
            finderPatternArr = (FinderPattern[][]) arrayList.toArray(new FinderPattern[arrayList.size()][]);
        }
        ArrayList arrayList2 = new ArrayList();
        for (FinderPattern[] finderPatternArr3 : finderPatternArr) {
            ResultPoint.orderBestPatterns(finderPatternArr3);
            arrayList2.add(new FinderPatternInfo(finderPatternArr3));
        }
        FinderPatternInfo[] finderPatternInfoArr = arrayList2.isEmpty() ? a.f68181f : (FinderPatternInfo[]) arrayList2.toArray(new FinderPatternInfo[arrayList2.size()]);
        if (finderPatternInfoArr.length == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        ArrayList arrayList3 = new ArrayList();
        for (FinderPatternInfo finderPatternInfo2 : finderPatternInfoArr) {
            try {
                arrayList3.add(processFinderPatternInfo(finderPatternInfo2));
            } catch (ReaderException unused) {
            }
        }
        return arrayList3.isEmpty() ? f49905c : (DetectorResult[]) arrayList3.toArray(new DetectorResult[arrayList3.size()]);
    }
}
