package com.google.zxing.oned.rss;

import androidx.camera.camera2.internal.compat.u;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import fh.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class RSS14Reader extends AbstractRSSReader {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f49964i = {1, 10, 34, 70, 126};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f49965j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f49966k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f49967l = {0, 336, 1036, 1516};
    public static final int[] m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f49968n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f49969o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f49970g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f49971h = new ArrayList();

    public static void b(ArrayList arrayList, a aVar) {
        if (aVar == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.getValue() == aVar.getValue()) {
                aVar2.f68452d++;
                return;
            }
        }
        arrayList.add(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[PHI: r11 r12
      0x00a9: PHI (r11v14 boolean) = (r11v5 boolean), (r11v17 boolean) binds: [B:48:0x00c3, B:36:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r12v10 boolean) = (r12v2 boolean), (r12v13 boolean) binds: [B:48:0x00c3, B:36:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[PHI: r11 r12
      0x00ae: PHI (r11v8 boolean) = (r11v5 boolean), (r11v17 boolean) binds: [B:50:0x00c6, B:38:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r12v5 boolean) = (r12v2 boolean), (r12v13 boolean) binds: [B:50:0x00c6, B:38:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[PHI: r11 r12
      0x00b1: PHI (r11v7 boolean) = (r11v5 boolean), (r11v17 boolean) binds: [B:50:0x00c6, B:38:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r12v4 boolean) = (r12v2 boolean), (r12v13 boolean) binds: [B:50:0x00c6, B:38:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    public final DataCharacter c(BitArray bitArray, FinderPattern finderPattern, boolean z10) throws NotFoundException {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i10 = 0; i10 < dataCharacterCounters.length; i10++) {
            dataCharacterCounters[i10] = 0;
        }
        if (z10) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i11 = 0;
            for (int length = dataCharacterCounters.length - 1; i11 < length; length--) {
                int i12 = dataCharacterCounters[i11];
                dataCharacterCounters[i11] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i12;
                i11++;
            }
        }
        int i13 = z10 ? 16 : 15;
        float fSum = MathUtils.sum(dataCharacterCounters) / i13;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i14 = 0; i14 < dataCharacterCounters.length; i14++) {
            float f6 = dataCharacterCounters[i14] / fSum;
            int i15 = (int) (0.5f + f6);
            if (i15 <= 0) {
                i15 = 1;
            } else if (i15 > 8) {
                i15 = 8;
            }
            int i16 = i14 / 2;
            if ((i14 & 1) == 0) {
                oddCounts[i16] = i15;
                oddRoundingErrors[i16] = f6 - i15;
            } else {
                evenCounts[i16] = i15;
                evenRoundingErrors[i16] = f6 - i15;
            }
        }
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        if (z10) {
            if (iSum > 12) {
                z11 = false;
                z12 = true;
            } else if (iSum < 4) {
                z12 = false;
                z11 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            if (iSum2 > 12) {
                z13 = false;
                z14 = true;
            } else if (iSum2 < 4) {
                z14 = false;
                z13 = true;
            } else {
                z13 = false;
                z14 = false;
            }
        } else {
            if (iSum > 11) {
                z11 = false;
                z12 = true;
            } else if (iSum < 5) {
                z12 = false;
                z11 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            if (iSum2 > 10) {
                z13 = false;
                z14 = true;
            } else if (iSum2 < 4) {
                z14 = false;
                z13 = true;
            } else {
                z13 = false;
                z14 = false;
            }
        }
        int i17 = (iSum + iSum2) - i13;
        boolean z15 = (iSum & 1) == z10;
        boolean z16 = (iSum2 & 1) == 1;
        if (i17 == 1) {
            if (z15) {
                if (z16) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z12 = true;
            } else {
                if (!z16) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z14 = true;
            }
        } else if (i17 != -1) {
            if (i17 != 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z15) {
                if (!z16) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (iSum < iSum2) {
                    z11 = true;
                    z14 = true;
                } else {
                    z12 = true;
                    z13 = true;
                }
            } else if (z16) {
                throw NotFoundException.getNotFoundInstance();
            }
        } else if (z15) {
            if (z16) {
                throw NotFoundException.getNotFoundInstance();
            }
            z11 = true;
        } else {
            if (!z16) {
                throw NotFoundException.getNotFoundInstance();
            }
            z13 = true;
        }
        if (z11) {
            if (z12) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z12) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z13) {
            if (z14) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z14) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
        int i18 = 0;
        int i19 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            int i20 = oddCounts[length2];
            i18 = (i18 * 9) + i20;
            i19 += i20;
        }
        int i21 = 0;
        int i22 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            int i23 = evenCounts[length3];
            i21 = (i21 * 9) + i23;
            i22 += i23;
        }
        int i24 = (i21 * 3) + i18;
        if (z10) {
            if ((i19 & 1) != 0 || i19 > 12 || i19 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i25 = (12 - i19) / 2;
            int i26 = m[i25];
            return new DataCharacter(u.b(RSSUtils.getRSSvalue(oddCounts, i26, false), f49964i[i25], RSSUtils.getRSSvalue(evenCounts, 9 - i26, true), f49966k[i25]), i24);
        }
        if ((i22 & 1) != 0 || i22 > 10 || i22 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i27 = (10 - i22) / 2;
        int i28 = f49968n[i27];
        return new DataCharacter(u.b(RSSUtils.getRSSvalue(evenCounts, 9 - i28, false), f49965j[i27], RSSUtils.getRSSvalue(oddCounts, i28, true), f49967l[i27]), i24);
    }

    public final a d(BitArray bitArray, boolean z10, int i10, Map<DecodeHintType, ?> map) {
        try {
            int[] iArrE = e(bitArray, z10);
            FinderPattern finderPatternF = f(bitArray, i10, z10, iArrE);
            ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (resultPointCallback != null) {
                float size = (iArrE[0] + iArrE[1]) / 2.0f;
                if (z10) {
                    size = (bitArray.getSize() - 1) - size;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(size, i10));
            }
            DataCharacter dataCharacterC = c(bitArray, finderPatternF, true);
            DataCharacter dataCharacterC2 = c(bitArray, finderPatternF, false);
            return new a((dataCharacterC.getValue() * 1597) + dataCharacterC2.getValue(), (dataCharacterC2.getChecksumPortion() * 4) + dataCharacterC.getChecksumPortion(), finderPatternF);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        a aVarD = d(bitArray, false, i10, map);
        ArrayList<a> arrayList = this.f49970g;
        b(arrayList, aVarD);
        bitArray.reverse();
        a aVarD2 = d(bitArray, true, i10, map);
        ArrayList<a> arrayList2 = this.f49971h;
        b(arrayList2, aVarD2);
        bitArray.reverse();
        for (a aVar : arrayList) {
            if (aVar.f68452d > 1) {
                for (a aVar2 : arrayList2) {
                    if (aVar2.f68452d > 1) {
                        int checksumPortion = ((aVar2.getChecksumPortion() * 16) + aVar.getChecksumPortion()) % 79;
                        FinderPattern finderPattern = aVar.f68451c;
                        int value = finderPattern.getValue() * 9;
                        FinderPattern finderPattern2 = aVar2.f68451c;
                        int value2 = finderPattern2.getValue() + value;
                        if (value2 > 72) {
                            value2--;
                        }
                        if (value2 > 8) {
                            value2--;
                        }
                        if (checksumPortion == value2) {
                            String strValueOf = String.valueOf((((long) aVar.getValue()) * 4537077) + ((long) aVar2.getValue()));
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(strValueOf);
                            int i11 = 0;
                            for (int i12 = 0; i12 < 13; i12++) {
                                int iCharAt = sb2.charAt(i12) - '0';
                                if ((i12 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i11 += iCharAt;
                            }
                            int i13 = 10 - (i11 % 10);
                            if (i13 == 10) {
                                i13 = 0;
                            }
                            sb2.append(i13);
                            ResultPoint[] resultPoints = finderPattern.getResultPoints();
                            ResultPoint[] resultPoints2 = finderPattern2.getResultPoints();
                            return new Result(sb2.toString(), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
                        }
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] e(BitArray bitArray, boolean z10) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < size) {
            z11 = !bitArray.get(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < size) {
            if (bitArray.get(i10) != z11) {
                decodeFinderCounters[i11] = decodeFinderCounters[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i12, i10};
                    }
                    i12 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i11--;
                }
                decodeFinderCounters[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final FinderPattern f(BitArray bitArray, int i10, boolean z10, int[] iArr) throws NotFoundException {
        int size;
        int i11;
        boolean z11 = bitArray.get(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && z11 != bitArray.get(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i14;
        int finderValue = AbstractRSSReader.parseFinderValue(decodeFinderCounters, f49969o);
        int i15 = iArr[1];
        if (z10) {
            int size2 = (bitArray.getSize() - 1) - i13;
            size = (bitArray.getSize() - 1) - i15;
            i11 = size2;
        } else {
            size = i15;
            i11 = i13;
        }
        return new FinderPattern(finderValue, new int[]{i13, iArr[1]}, i11, size, i10);
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.f49970g.clear();
        this.f49971h.clear();
    }
}
