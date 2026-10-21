package com.google.zxing.oned.rss.expanded;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import gh.a;
import gh.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class RSSExpandedReader extends AbstractRSSReader {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f49972k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f49973l = {4, 20, 52, 104, 204};
    public static final int[] m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[][] f49974n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f49975o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, ErrorCodes.ERR_CRY_BAD_PROTO, 205}, new int[]{Opcodes.INSTANCEOF, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, Opcodes.MULTIANEWARRAY, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, ErrorCodes.ERR_CRY_IO_PROPERTIES, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 202, 184, 130, 179, 115}, new int[]{134, Opcodes.ATHROW, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, Opcodes.IFNULL, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, Opcodes.IFNONNULL, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, Opcodes.MONITORENTER, 160, 58, 174, 100, 89}};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[][] f49976p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f49977g = new ArrayList(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f49978h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f49979i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f49980j;

    public static Result e(List<a> list) throws NotFoundException, FormatException {
        int size = list.size() << 1;
        int i10 = size - 1;
        if (((a) androidx.emoji2.text.flatbuffer.a.b(list, 1)).f68613b == null) {
            i10 = size - 2;
        }
        BitArray bitArray = new BitArray(i10 * 12);
        int value = list.get(0).f68613b.getValue();
        int i11 = 0;
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & value) != 0) {
                bitArray.set(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            a aVar = list.get(i13);
            int value2 = aVar.f68612a.getValue();
            for (int i14 = 11; i14 >= 0; i14--) {
                if (((1 << i14) & value2) != 0) {
                    bitArray.set(i11);
                }
                i11++;
            }
            DataCharacter dataCharacter = aVar.f68613b;
            if (dataCharacter != null) {
                int value3 = dataCharacter.getValue();
                for (int i15 = 11; i15 >= 0; i15--) {
                    if (((1 << i15) & value3) != 0) {
                        bitArray.set(i11);
                    }
                    i11++;
                }
            }
        }
        String information = AbstractExpandedDecoder.createDecoder(bitArray).parseInformation();
        ResultPoint[] resultPoints = list.get(0).f68614c.getResultPoints();
        ResultPoint[] resultPoints2 = ((a) androidx.emoji2.text.flatbuffer.a.b(list, 1)).f68614c.getResultPoints();
        return new Result(information, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    public final boolean b() {
        ArrayList arrayList = this.f49977g;
        a aVar = (a) arrayList.get(0);
        DataCharacter dataCharacter = aVar.f68612a;
        DataCharacter dataCharacter2 = aVar.f68613b;
        if (dataCharacter2 == null) {
            return false;
        }
        int checksumPortion = dataCharacter2.getChecksumPortion();
        int i10 = 2;
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            a aVar2 = (a) arrayList.get(i11);
            int checksumPortion2 = aVar2.f68612a.getChecksumPortion() + checksumPortion;
            int i12 = i10 + 1;
            DataCharacter dataCharacter3 = aVar2.f68613b;
            if (dataCharacter3 != null) {
                checksumPortion = dataCharacter3.getChecksumPortion() + checksumPortion2;
                i10 += 2;
            } else {
                i10 = i12;
                checksumPortion = checksumPortion2;
            }
        }
        return ((i10 + (-4)) * 211) + (checksumPortion % 211) == dataCharacter.getValue();
    }

    public final List c(int i10, ArrayList arrayList) throws NotFoundException {
        while (true) {
            ArrayList arrayList2 = this.f49978h;
            if (i10 >= arrayList2.size()) {
                throw NotFoundException.getNotFoundInstance();
            }
            b bVar = (b) arrayList2.get(i10);
            ArrayList arrayList3 = this.f49977g;
            arrayList3.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(((b) it.next()).f68615a);
            }
            arrayList3.addAll(bVar.f68615a);
            int[][] iArr = f49976p;
            for (int i11 = 0; i11 < 10; i11++) {
                int[] iArr2 = iArr[i11];
                if (arrayList3.size() <= iArr2.length) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList3.size()) {
                            if (!b()) {
                                ArrayList arrayList4 = new ArrayList(arrayList);
                                arrayList4.add(bVar);
                                try {
                                    return c(i10 + 1, arrayList4);
                                } catch (NotFoundException unused) {
                                    break;
                                }
                            }
                            return arrayList3;
                        }
                        if (((a) arrayList3.get(i12)).f68614c.getValue() != iArr2[i12]) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            i10++;
        }
    }

    public final List<a> d(boolean z10) {
        ArrayList arrayList = this.f49978h;
        List<a> listC = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f49977g.clear();
        if (z10) {
            Collections.reverse(arrayList);
        }
        try {
            listC = c(0, new ArrayList());
        } catch (NotFoundException unused) {
        }
        if (z10) {
            Collections.reverse(arrayList);
        }
        return listC;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ArrayList arrayList = this.f49977g;
        arrayList.clear();
        this.f49980j = false;
        try {
            return e(g(i10, bitArray));
        } catch (NotFoundException unused) {
            arrayList.clear();
            this.f49980j = true;
            return e(g(i10, bitArray));
        }
    }

    public final DataCharacter f(BitArray bitArray, FinderPattern finderPattern, boolean z10, boolean z11) throws NotFoundException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int[][] iArr;
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i10 = 0; i10 < dataCharacterCounters.length; i10++) {
            dataCharacterCounters[i10] = 0;
        }
        if (z11) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i11 = 0;
            for (int length = dataCharacterCounters.length - 1; i11 < length; length--) {
                int i12 = dataCharacterCounters[i11];
                dataCharacterCounters[i11] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i12;
                i11++;
            }
        }
        float fSum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f6 = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(fSum - f6) / f6 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i13 = 0; i13 < dataCharacterCounters.length; i13++) {
            float f10 = (dataCharacterCounters[i13] * 1.0f) / fSum;
            int i14 = (int) (0.5f + f10);
            if (i14 <= 0) {
                if (f10 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i14 = 1;
            } else if (i14 > 8) {
                if (f10 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                oddCounts[i15] = i14;
                oddRoundingErrors[i15] = f10 - i14;
            } else {
                evenCounts[i15] = i14;
                evenRoundingErrors[i15] = f10 - i14;
            }
        }
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        if (iSum > 13) {
            z12 = false;
            z13 = true;
        } else if (iSum < 4) {
            z13 = false;
            z12 = true;
        } else {
            z12 = false;
            z13 = false;
        }
        if (iSum2 > 13) {
            z14 = false;
            z15 = true;
        } else if (iSum2 < 4) {
            z15 = false;
            z14 = true;
        } else {
            z14 = false;
            z15 = false;
        }
        int i16 = (iSum + iSum2) - 17;
        boolean z20 = (iSum & 1) == 1;
        boolean z21 = (iSum2 & 1) == 0;
        if (i16 == 1) {
            if (z20) {
                if (z21) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z16 = true;
            } else {
                if (!z21) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z19 = true;
            }
        } else if (i16 != -1) {
            if (i16 != 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z20) {
                if (!z21) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (iSum < iSum2) {
                    z18 = true;
                    z19 = true;
                } else {
                    z16 = true;
                    z17 = true;
                }
            } else if (z21) {
                throw NotFoundException.getNotFoundInstance();
            }
        } else if (z20) {
            if (z21) {
                throw NotFoundException.getNotFoundInstance();
            }
            z18 = true;
        } else {
            if (!z21) {
                throw NotFoundException.getNotFoundInstance();
            }
            z17 = true;
        }
        if (z18) {
            if (z16) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z16) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z17) {
            if (z19) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z19) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
        int value = (((finderPattern.getValue() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int length2 = oddCounts.length - 1;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            iArr = f49975o;
            if (length2 < 0) {
                break;
            }
            if (finderPattern.getValue() != 0 || !z10 || !z11) {
                i17 += oddCounts[length2] * iArr[value][length2 * 2];
            }
            i18 += oddCounts[length2];
            length2--;
        }
        int i19 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (finderPattern.getValue() != 0 || !z10 || !z11) {
                i19 += evenCounts[length3] * iArr[value][(length3 * 2) + 1];
            }
        }
        int i20 = i17 + i19;
        if ((i18 & 1) != 0 || i18 > 13 || i18 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i21 = (13 - i18) / 2;
        int i22 = f49972k[i21];
        return new DataCharacter(u.b(RSSUtils.getRSSvalue(oddCounts, i22, true), f49973l[i21], RSSUtils.getRSSvalue(evenCounts, 9 - i22, false), m[i21]), i20);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[RETURN] */
    public final List<a> g(int i10, BitArray bitArray) throws NotFoundException {
        List<a> listD;
        List<a> listD2;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f49977g;
            if (z10) {
                if (b()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.f49978h;
                boolean z11 = !arrayList2.isEmpty();
                int i11 = 0;
                boolean zEquals = false;
                while (true) {
                    if (i11 < arrayList2.size()) {
                        b bVar = (b) arrayList2.get(i11);
                        int i12 = bVar.f68616b;
                        ArrayList arrayList3 = bVar.f68615a;
                        if (i12 > i10) {
                            if (!arrayList3.equals(arrayList)) {
                            }
                            if (z11) {
                                listD = d(false);
                                if (listD != null) {
                                    return listD;
                                }
                                listD2 = d(true);
                                if (listD2 != null) {
                                    return listD2;
                                }
                            }
                            throw NotFoundException.getNotFoundInstance();
                        }
                        zEquals = arrayList3.equals(arrayList);
                        i11++;
                    }
                    if (!zEquals) {
                        Iterator it = arrayList2.iterator();
                        loop2: while (true) {
                            if (!it.hasNext()) {
                                arrayList2.add(i11, new b(i10, arrayList));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    b bVar2 = (b) it2.next();
                                    if (bVar2.f68615a.size() != arrayList.size()) {
                                        Iterator it3 = bVar2.f68615a.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                it2.remove();
                                                break;
                                            }
                                            a aVar = (a) it3.next();
                                            Iterator it4 = arrayList.iterator();
                                            do {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                            } while (!aVar.equals((a) it4.next()));
                                        }
                                    }
                                }
                                break;
                            }
                            b bVar3 = (b) it.next();
                            Iterator it5 = arrayList.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break loop2;
                                }
                                a aVar2 = (a) it5.next();
                                Iterator it6 = bVar3.f68615a.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (aVar2.equals((a) it6.next())) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (z11) {
                        listD = d(false);
                        if (listD != null) {
                            return listD;
                        }
                        listD2 = d(true);
                        if (listD2 != null) {
                            return listD2;
                        }
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            try {
                arrayList.add(h(bitArray, arrayList, i10));
            } catch (NotFoundException e5) {
                if (arrayList.isEmpty()) {
                    throw e5;
                }
                z10 = true;
            }
        }
    }

    public final a h(BitArray bitArray, ArrayList arrayList, int i10) throws NotFoundException {
        int i11;
        int i12;
        int nextUnset;
        int i13;
        FinderPattern finderPattern;
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        boolean z10 = arrayList.size() % 2 == 0;
        if (this.f49980j) {
            z10 = !z10;
        }
        int nextSet = -1;
        boolean z11 = true;
        while (true) {
            int[] decodeFinderCounters = getDecodeFinderCounters();
            decodeFinderCounters[i15] = i15;
            decodeFinderCounters[i16] = i15;
            decodeFinderCounters[i14] = i15;
            int i17 = 3;
            decodeFinderCounters[3] = i15;
            int size = bitArray.getSize();
            int i18 = nextSet >= 0 ? nextSet : arrayList.isEmpty() ? i15 : ((a) androidx.appcompat.view.menu.b.b(arrayList, i16)).f68614c.getStartEnd()[i16];
            int i19 = arrayList.size() % i14 != 0 ? i16 : i15;
            if (this.f49980j) {
                i19 ^= 1;
            }
            int i20 = i15;
            while (i18 < size) {
                i20 = bitArray.get(i18) ^ i16;
                if (i20 == 0) {
                    break;
                }
                i18++;
            }
            int i21 = i15;
            int i22 = i20;
            int i23 = i18;
            while (true) {
                if (i18 >= size) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (bitArray.get(i18) != i22) {
                    decodeFinderCounters[i21] = decodeFinderCounters[i21] + i16;
                    i11 = i16;
                } else {
                    if (i21 == i17) {
                        if (i19 != 0) {
                            int length = decodeFinderCounters.length;
                            for (int i24 = 0; i24 < length / 2; i24++) {
                                int i25 = decodeFinderCounters[i24];
                                int i26 = (length - i24) - 1;
                                decodeFinderCounters[i24] = decodeFinderCounters[i26];
                                decodeFinderCounters[i26] = i25;
                            }
                        }
                        if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                            break;
                        }
                        if (i19 != 0) {
                            int length2 = decodeFinderCounters.length;
                            for (int i27 = 0; i27 < length2 / 2; i27++) {
                                int i28 = decodeFinderCounters[i27];
                                int i29 = (length2 - i27) - 1;
                                decodeFinderCounters[i27] = decodeFinderCounters[i29];
                                decodeFinderCounters[i29] = i28;
                            }
                        }
                        i11 = 1;
                        i23 += decodeFinderCounters[0] + decodeFinderCounters[1];
                        decodeFinderCounters[0] = decodeFinderCounters[2];
                        i17 = 3;
                        decodeFinderCounters[1] = decodeFinderCounters[3];
                        decodeFinderCounters[2] = 0;
                        decodeFinderCounters[3] = 0;
                        i21--;
                    } else {
                        i11 = i16;
                        i21++;
                    }
                    decodeFinderCounters[i21] = i11;
                    i22 ^= 1;
                }
                i18++;
                i16 = i11;
            }
            int[] iArr = this.f49979i;
            iArr[0] = i23;
            iArr[1] = i18;
            if (z10) {
                int i30 = i23 - 1;
                while (i30 >= 0 && !bitArray.get(i30)) {
                    i30--;
                }
                i23 = i30 + 1;
                i13 = iArr[0] - i23;
                i12 = 1;
                nextUnset = iArr[1];
            } else {
                i12 = 1;
                nextUnset = bitArray.getNextUnset(i18 + 1);
                i13 = nextUnset - iArr[1];
            }
            int i31 = nextUnset;
            int i32 = i23;
            int[] decodeFinderCounters2 = getDecodeFinderCounters();
            System.arraycopy(decodeFinderCounters2, 0, decodeFinderCounters2, i12, decodeFinderCounters2.length - i12);
            decodeFinderCounters2[0] = i13;
            DataCharacter dataCharacterF = null;
            try {
                finderPattern = new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters2, f49974n), new int[]{i32, i31}, i32, i31, i10);
            } catch (NotFoundException unused) {
                finderPattern = null;
            }
            if (finderPattern == null) {
                int i33 = iArr[0];
                nextSet = bitArray.get(i33) ? bitArray.getNextSet(bitArray.getNextUnset(i33)) : bitArray.getNextUnset(bitArray.getNextSet(i33));
            } else {
                z11 = false;
            }
            if (!z11) {
                DataCharacter dataCharacterF2 = f(bitArray, finderPattern, z10, true);
                if (!arrayList.isEmpty() && ((a) androidx.appcompat.view.menu.b.b(arrayList, 1)).f68613b == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                try {
                    dataCharacterF = f(bitArray, finderPattern, z10, false);
                } catch (NotFoundException unused2) {
                }
                return new a(dataCharacterF2, dataCharacterF, finderPattern);
            }
            i14 = 2;
            i15 = 0;
            i16 = 1;
        }
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.f49977g.clear();
        this.f49978h.clear();
    }
}
