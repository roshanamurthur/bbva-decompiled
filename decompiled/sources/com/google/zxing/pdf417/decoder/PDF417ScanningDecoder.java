package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import ih.a;
import ih.b;
import ih.c;
import ih.d;
import ih.f;
import ih.g;
import ih.h;
import ih.i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* JADX INFO: loaded from: classes10.dex */
public final class PDF417ScanningDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ErrorCorrection f49996a = new ErrorCorrection();

    public static c a(h hVar) throws NotFoundException {
        int i10;
        int[] iArr;
        int i11;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPoint4;
        if (hVar == null) {
            return null;
        }
        a aVarC = hVar.c();
        d[] dVarArr = hVar.f69709b;
        boolean z10 = hVar.f69710c;
        c cVar = hVar.f69708a;
        if (aVarC == null) {
            iArr = null;
        } else {
            ResultPoint resultPoint5 = z10 ? cVar.f69687b : cVar.f69689d;
            ResultPoint resultPoint6 = z10 ? cVar.f69688c : cVar.f69690e;
            int iB = hVar.b((int) resultPoint5.getY());
            int iB2 = hVar.b((int) resultPoint6.getY());
            int i12 = 0;
            int iMax = 1;
            int i13 = -1;
            while (true) {
                i10 = aVarC.f69684e;
                if (iB >= iB2) {
                    break;
                }
                d dVar = dVarArr[iB];
                if (dVar != null) {
                    dVar.b();
                    int i14 = dVar.f69699e;
                    int i15 = i14 - i13;
                    if (i15 == 0) {
                        i12++;
                    } else if (i15 == 1) {
                        iMax = Math.max(iMax, i12);
                        i13 = dVar.f69699e;
                        i12 = 1;
                    } else if (i14 >= i10) {
                        dVarArr[iB] = null;
                    } else {
                        i12 = 1;
                        i13 = i14;
                    }
                }
                iB++;
            }
            iArr = new int[i10];
            for (d dVar2 : dVarArr) {
                if (dVar2 != null && (i11 = dVar2.f69699e) < i10) {
                    iArr[i11] = iArr[i11] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        int iMax2 = -1;
        for (int i16 : iArr) {
            iMax2 = Math.max(iMax2, i16);
        }
        int i17 = 0;
        for (int i18 : iArr) {
            i17 += iMax2 - i18;
            if (i18 > 0) {
                break;
            }
        }
        for (int i19 = 0; i17 > 0 && dVarArr[i19] == null; i19++) {
            i17--;
        }
        int i20 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i21 = iArr[length];
            i20 += iMax2 - i21;
            if (i21 > 0) {
                break;
            }
        }
        for (int length2 = dVarArr.length - 1; i20 > 0 && dVarArr[length2] == null; length2--) {
            i20--;
        }
        ResultPoint resultPoint7 = cVar.f69687b;
        ResultPoint resultPoint8 = cVar.f69689d;
        if (i17 > 0) {
            ResultPoint resultPoint9 = z10 ? resultPoint7 : resultPoint8;
            int y7 = ((int) resultPoint9.getY()) - i17;
            ResultPoint resultPoint10 = new ResultPoint(resultPoint9.getX(), y7 >= 0 ? y7 : 0);
            if (z10) {
                resultPoint2 = resultPoint8;
                resultPoint = resultPoint10;
            } else {
                resultPoint = resultPoint7;
                resultPoint2 = resultPoint10;
            }
        } else {
            resultPoint = resultPoint7;
            resultPoint2 = resultPoint8;
        }
        ResultPoint resultPoint11 = cVar.f69688c;
        ResultPoint resultPoint12 = cVar.f69690e;
        if (i20 > 0) {
            ResultPoint resultPoint13 = z10 ? resultPoint11 : resultPoint12;
            int y10 = ((int) resultPoint13.getY()) + i20;
            BitMatrix bitMatrix = cVar.f69686a;
            if (y10 >= bitMatrix.getHeight()) {
                y10 = bitMatrix.getHeight() - 1;
            }
            ResultPoint resultPoint14 = new ResultPoint(resultPoint13.getX(), y10);
            if (z10) {
                resultPoint4 = resultPoint12;
                resultPoint3 = resultPoint14;
            } else {
                resultPoint3 = resultPoint11;
                resultPoint4 = resultPoint14;
            }
        } else {
            resultPoint3 = resultPoint11;
            resultPoint4 = resultPoint12;
        }
        return new c(cVar.f69686a, resultPoint, resultPoint3, resultPoint2, resultPoint4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x029a A[LOOP:7: B:122:0x0298->B:123:0x029a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x020b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static com.google.zxing.common.DecoderResult b(int r25, int[] r26, int[] r27) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.b(int, int[], int[]):com.google.zxing.common.DecoderResult");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0032 A[EDGE_INSN: B:114:0x0032->B:19:0x0032 BREAK  A[LOOP:1: B:9:0x0018->B:18:0x0030], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0060 A[EDGE_INSN: B:117:0x0060->B:34:0x0060 BREAK  A[LOOP:2: B:25:0x0045->B:120:0x0045], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[LOOP:1: B:9:0x0018->B:18:0x0030, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    public static d c(BitMatrix bitMatrix, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int i17 = i10;
        int i18 = z10 ? -1 : 1;
        boolean z11 = z10;
        int i19 = i12;
        loop0: for (int i20 = 0; i20 < 2; i20++) {
            while (true) {
                if (!z11) {
                    if (i19 >= i11) {
                        break;
                    }
                    if (z11 == bitMatrix.get(i19, i13)) {
                        break;
                        break;
                    }
                    if (Math.abs(i12 - i19) > 2) {
                        i19 = i12;
                        break loop0;
                    }
                    i19 += i18;
                } else {
                    if (i19 < i17) {
                        break;
                    }
                    if (z11 == bitMatrix.get(i19, i13)) {
                        break;
                    }
                    if (Math.abs(i12 - i19) > 2) {
                        i19 = i12;
                        break loop0;
                    }
                    i19 += i18;
                }
            }
            i18 = -i18;
            z11 = !z11;
        }
        int[] iArr = new int[8];
        int i21 = z10 ? 1 : -1;
        boolean z12 = z10;
        int i22 = 0;
        int i23 = i19;
        while (true) {
            if (!z10) {
                if (i23 < i17) {
                    break;
                }
                if (i22 < 8) {
                    break;
                    break;
                }
                if (bitMatrix.get(i23, i13) == z12) {
                    iArr[i22] = iArr[i22] + 1;
                    i23 += i21;
                } else {
                    i22++;
                    z12 = !z12;
                }
            } else {
                if (i23 >= i11) {
                    break;
                }
                if (i22 < 8) {
                    break;
                }
                if (bitMatrix.get(i23, i13) == z12) {
                    iArr[i22] = iArr[i22] + 1;
                    i23 += i21;
                } else {
                    i22++;
                    z12 = !z12;
                }
            }
        }
        if (i22 != 8) {
            if (z10) {
                i17 = i11;
            }
            if (i23 != i17 || i22 != 7) {
                iArr = null;
            }
        }
        if (iArr == null) {
            return null;
        }
        int iSum = MathUtils.sum(iArr);
        if (z10) {
            i16 = i19 + iSum;
        } else {
            for (int i24 = 0; i24 < iArr.length / 2; i24++) {
                int i25 = iArr[i24];
                iArr[i24] = iArr[(iArr.length - 1) - i24];
                iArr[(iArr.length - 1) - i24] = i25;
            }
            int i26 = i19;
            i19 -= iSum;
            i16 = i26;
        }
        if (i14 - 2 > iSum || iSum > i15 + 2) {
            return null;
        }
        float[][] fArr = i.f69711a;
        float fSum = MathUtils.sum(iArr);
        int[] iArr2 = new int[8];
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < 17; i29++) {
            float f6 = ((i29 * fSum) / 17.0f) + (fSum / 34.0f);
            int i30 = iArr[i28] + i27;
            if (i30 <= f6) {
                i28++;
                i27 = i30;
            }
            iArr2[i28] = iArr2[i28] + 1;
        }
        long j10 = 0;
        for (int i31 = 0; i31 < 8; i31++) {
            for (int i32 = 0; i32 < iArr2[i31]; i32++) {
                j10 = (j10 << 1) | ((long) (i31 % 2 == 0 ? 1 : 0));
            }
        }
        int i33 = (int) j10;
        if (PDF417Common.getCodeword(i33) == -1) {
            i33 = -1;
        }
        if (i33 == -1) {
            int iSum2 = MathUtils.sum(iArr);
            float[] fArr2 = new float[8];
            if (iSum2 > 1) {
                for (int i34 = 0; i34 < 8; i34++) {
                    fArr2[i34] = iArr[i34] / iSum2;
                }
            }
            float f10 = Float.MAX_VALUE;
            i33 = -1;
            int i35 = 0;
            while (true) {
                float[][] fArr3 = i.f69711a;
                if (i35 >= fArr3.length) {
                    break;
                }
                float[] fArr4 = fArr3[i35];
                float f11 = 0.0f;
                for (int i36 = 0; i36 < 8; i36++) {
                    float f12 = fArr4[i36] - fArr2[i36];
                    f11 += f12 * f12;
                    if (f11 >= f10) {
                        break;
                    }
                }
                if (f11 < f10) {
                    i33 = PDF417Common.SYMBOL_TABLE[i35];
                    f10 = f11;
                }
                i35++;
            }
        }
        int codeword = PDF417Common.getCodeword(i33);
        if (codeword == -1) {
            return null;
        }
        int[] iArr3 = new int[8];
        int i37 = 0;
        int i38 = 7;
        while (true) {
            int i39 = i33 & 1;
            if (i39 != i37) {
                i38--;
                if (i38 < 0) {
                    return new d(i19, i16, ((((iArr3[0] - iArr3[2]) + iArr3[4]) - iArr3[6]) + 9) % 9, codeword);
                }
                i37 = i39;
            }
            iArr3[i38] = iArr3[i38] + 1;
            i33 >>= 1;
        }
    }

    public static h d(BitMatrix bitMatrix, c cVar, ResultPoint resultPoint, boolean z10, int i10, int i11) {
        h hVar = new h(cVar, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int x4 = (int) resultPoint.getX();
            for (int y7 = (int) resultPoint.getY(); y7 <= cVar.f69694i && y7 >= cVar.f69693h; y7 += i13) {
                d dVarC = c(bitMatrix, 0, bitMatrix.getWidth(), z10, x4, y7, i10, i11);
                if (dVarC != null) {
                    hVar.f69709b[hVar.b(y7)] = dVarC;
                    x4 = z10 ? dVarC.f69695a : dVarC.f69696b;
                }
            }
            i12++;
        }
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX WARN: Code duplicated, block: B:102:0x0153  */
    /* JADX WARN: Code duplicated, block: B:103:0x0156  */
    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:121:0x0193 A[EDGE_INSN: B:121:0x0193->B:123:0x019c BREAK  A[LOOP:3: B:104:0x0158->B:118:0x0188]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0198 A[EDGE_INSN: B:122:0x0198->B:123:0x019c BREAK  A[LOOP:3: B:104:0x0158->B:118:0x0188]] */
    /* JADX WARN: Code duplicated, block: B:124:0x019e  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:165:0x026c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:344:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0130  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i10, int i11) throws NotFoundException, ChecksumException, FormatException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        g gVar;
        d dVar;
        int i18;
        d dVar2;
        d dVarA;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        d dVarC;
        a aVarC;
        a aVarC2;
        c cVar;
        c cVar2 = new c(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        boolean z10 = false;
        int i25 = 0;
        h hVarD = null;
        h hVarD2 = null;
        f fVar = null;
        while (true) {
            i12 = cVar2.f69694i;
            i13 = cVar2.f69693h;
            if (i25 >= 2) {
                break;
            }
            if (resultPoint != null) {
                hVarD = d(bitMatrix, cVar2, resultPoint, true, i10, i11);
            }
            if (resultPoint3 != null) {
                hVarD2 = d(bitMatrix, cVar2, resultPoint3, false, i10, i11);
            }
            if (hVarD == null && hVarD2 == null) {
                fVar = null;
            } else {
                if (hVarD == null || (aVarC = hVarD.c()) == null) {
                    if (hVarD2 == null) {
                        aVarC = null;
                    } else {
                        aVarC = hVarD2.c();
                    }
                } else if (hVarD2 != null && (aVarC2 = hVarD2.c()) != null && aVarC.f69680a != aVarC2.f69680a && aVarC.f69681b != aVarC2.f69681b && aVarC.f69684e != aVarC2.f69684e) {
                    aVarC = null;
                }
                if (aVarC == null) {
                    fVar = null;
                } else {
                    c cVarA = a(hVarD);
                    c cVarA2 = a(hVarD2);
                    if (cVarA == null) {
                        cVarA = cVarA2;
                    } else if (cVarA2 != null) {
                        cVarA = new c(cVarA.f69686a, cVarA.f69687b, cVarA.f69688c, cVarA2.f69689d, cVarA2.f69690e);
                    }
                    fVar = new f(aVarC, cVarA);
                }
            }
            if (fVar == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i25 != 0 || (cVar = fVar.f69706c) == null || (cVar.f69693h >= i13 && cVar.f69694i <= i12)) {
                fVar.f69706c = cVar2;
                break;
            }
            i25++;
            cVar2 = cVar;
        }
        int i26 = fVar.f69707d + 1;
        g[] gVarArr = fVar.f69705b;
        gVarArr[0] = hVarD;
        gVarArr[i26] = hVarD2;
        boolean z11 = hVarD != null;
        int iMin = i10;
        int iMax = i11;
        int i27 = 1;
        while (true) {
            i14 = fVar.f69707d;
            if (i27 > i26) {
                break;
            }
            int i28 = z11 ? i27 : i26 - i27;
            if (gVarArr[i28] == null) {
                g hVar = (i28 == 0 || i28 == i26) ? new h(cVar2, i28 == 0 ? true : z10) : new g(cVar2);
                gVarArr[i28] = hVar;
                int i29 = i13;
                int i30 = -1;
                while (i29 <= i12) {
                    int i31 = z11 ? 1 : -1;
                    int i32 = i28 - i31;
                    if (i32 >= 0) {
                        i18 = i26;
                        if (i32 <= i14 + 1) {
                            g gVar2 = gVarArr[i32];
                            dVar2 = gVar2.f69709b[gVar2.b(i29)];
                        }
                        if (dVar2 != null) {
                            dVarA = gVarArr[i28].a(i29);
                            if (dVarA != null) {
                                if (i32 >= 0 && i32 <= i14 + 1) {
                                    dVarA = gVarArr[i32].a(i29);
                                }
                                if (dVarA != null) {
                                    i19 = i28;
                                    i20 = 0;
                                    while (true) {
                                        i21 = i19 - i31;
                                        if (i21 >= 0 || i21 > i14 + 1) {
                                            i22 = i28;
                                            if (z11) {
                                                i23 = fVar.f69706c.f69692g;
                                                break;
                                            }
                                            i23 = fVar.f69706c.f69691f;
                                            break;
                                        }
                                        d[] dVarArr = gVarArr[i21].f69709b;
                                        i22 = i28;
                                        int length = dVarArr.length;
                                        int i33 = 0;
                                        while (i33 < length) {
                                            int i34 = length;
                                            d dVar3 = dVarArr[i33];
                                            if (dVar3 != null) {
                                                int i35 = dVar3.f69695a;
                                                int i36 = dVar3.f69696b;
                                                i23 = ((i36 - i35) * i31 * i20) + (z11 ? i36 : i35);
                                                break;
                                            }
                                            i33++;
                                            length = i34;
                                        }
                                        i20++;
                                        i28 = i22;
                                        i19 = i21;
                                    }
                                } else if (z11) {
                                    i23 = dVarA.f69696b;
                                } else {
                                    i23 = dVarA.f69695a;
                                }
                                if (i23 >= 0 || i23 > cVar2.f69692g) {
                                    if (i30 != -1) {
                                        i24 = i30;
                                    }
                                    i29++;
                                    i28 = i22;
                                    i26 = i18;
                                    i12 = i12;
                                } else {
                                    i24 = i23;
                                }
                                dVarC = c(bitMatrix, cVar2.f69691f, cVar2.f69692g, z11, i24, i29, iMin, iMax);
                                if (dVarC != null) {
                                    hVar.f69709b[hVar.b(i29)] = dVarC;
                                    int i37 = dVarC.f69696b;
                                    int i38 = dVarC.f69695a;
                                    iMin = Math.min(iMin, i37 - i38);
                                    iMax = Math.max(iMax, i37 - i38);
                                    i30 = i24;
                                }
                                i29++;
                                i28 = i22;
                                i26 = i18;
                                i12 = i12;
                            } else if (z11) {
                                i23 = dVarA.f69695a;
                            } else {
                                i23 = dVarA.f69696b;
                            }
                        } else if (z11) {
                            i23 = dVar2.f69696b;
                        } else {
                            i23 = dVar2.f69695a;
                        }
                        i22 = i28;
                        if (i23 >= 0) {
                            if (i30 != -1) {
                                i24 = i30;
                                dVarC = c(bitMatrix, cVar2.f69691f, cVar2.f69692g, z11, i24, i29, iMin, iMax);
                                if (dVarC != null) {
                                    hVar.f69709b[hVar.b(i29)] = dVarC;
                                    int i39 = dVarC.f69696b;
                                    int i310 = dVarC.f69695a;
                                    iMin = Math.min(iMin, i39 - i310);
                                    iMax = Math.max(iMax, i39 - i310);
                                    i30 = i24;
                                }
                            }
                        } else if (i30 != -1) {
                            i24 = i30;
                            dVarC = c(bitMatrix, cVar2.f69691f, cVar2.f69692g, z11, i24, i29, iMin, iMax);
                            if (dVarC != null) {
                                hVar.f69709b[hVar.b(i29)] = dVarC;
                                int i311 = dVarC.f69696b;
                                int i312 = dVarC.f69695a;
                                iMin = Math.min(iMin, i311 - i312);
                                iMax = Math.max(iMax, i311 - i312);
                                i30 = i24;
                            }
                        }
                        i29++;
                        i28 = i22;
                        i26 = i18;
                        i12 = i12;
                    } else {
                        i18 = i26;
                    }
                    dVar2 = null;
                    if (dVar2 != null) {
                        dVarA = gVarArr[i28].a(i29);
                        if (dVarA != null) {
                            if (i32 >= 0) {
                                dVarA = gVarArr[i32].a(i29);
                            }
                            if (dVarA != null) {
                                i19 = i28;
                                i20 = 0;
                                while (true) {
                                    i21 = i19 - i31;
                                    if (i21 >= 0) {
                                    }
                                    i22 = i28;
                                    if (z11) {
                                        i23 = fVar.f69706c.f69692g;
                                        break;
                                    }
                                    i23 = fVar.f69706c.f69691f;
                                    break;
                                    i20++;
                                    i28 = i22;
                                    i19 = i21;
                                }
                            } else if (z11) {
                                i23 = dVarA.f69696b;
                            } else {
                                i23 = dVarA.f69695a;
                            }
                            if (i23 >= 0) {
                                if (i30 != -1) {
                                    i24 = i30;
                                    dVarC = c(bitMatrix, cVar2.f69691f, cVar2.f69692g, z11, i24, i29, iMin, iMax);
                                    if (dVarC != null) {
                                        hVar.f69709b[hVar.b(i29)] = dVarC;
                                        int i313 = dVarC.f69696b;
                                        int i314 = dVarC.f69695a;
                                        iMin = Math.min(iMin, i313 - i314);
                                        iMax = Math.max(iMax, i313 - i314);
                                        i30 = i24;
                                    }
                                }
                            } else if (i30 != -1) {
                                i24 = i30;
                                dVarC = c(bitMatrix, cVar2.f69691f, cVar2.f69692g, z11, i24, i29, iMin, iMax);
                                if (dVarC != null) {
                                    hVar.f69709b[hVar.b(i29)] = dVarC;
                                    int i315 = dVarC.f69696b;
                                    int i316 = dVarC.f69695a;
                                    iMin = Math.min(iMin, i315 - i316);
                                    iMax = Math.max(iMax, i315 - i316);
                                    i30 = i24;
                                }
                            }
                            i29++;
                            i28 = i22;
                            i26 = i18;
                            i12 = i12;
                        } else if (z11) {
                            i23 = dVarA.f69695a;
                        } else {
                            i23 = dVarA.f69696b;
                        }
                    } else if (z11) {
                        i23 = dVar2.f69696b;
                    } else {
                        i23 = dVar2.f69695a;
                    }
                    i22 = i28;
                    if (i23 >= 0) {
                        if (i30 != -1) {
                            i24 = i30;
                            dVarC = c(bitMatrix, cVar2.f69691f, cVar2.f69692g, z11, i24, i29, iMin, iMax);
                            if (dVarC != null) {
                                hVar.f69709b[hVar.b(i29)] = dVarC;
                                int i317 = dVarC.f69696b;
                                int i318 = dVarC.f69695a;
                                iMin = Math.min(iMin, i317 - i318);
                                iMax = Math.max(iMax, i317 - i318);
                                i30 = i24;
                            }
                        }
                    } else if (i30 != -1) {
                        i24 = i30;
                        dVarC = c(bitMatrix, cVar2.f69691f, cVar2.f69692g, z11, i24, i29, iMin, iMax);
                        if (dVarC != null) {
                            hVar.f69709b[hVar.b(i29)] = dVarC;
                            int i319 = dVarC.f69696b;
                            int i3110 = dVarC.f69695a;
                            iMin = Math.min(iMin, i319 - i3110);
                            iMax = Math.max(iMax, i319 - i3110);
                            i30 = i24;
                        }
                    }
                    i29++;
                    i28 = i22;
                    i26 = i18;
                    i12 = i12;
                }
            }
            i27++;
            i26 = i26;
            i12 = i12;
            z10 = false;
        }
        a aVar = fVar.f69704a;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, aVar.f69684e, i14 + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i40 = 0;
            while (true) {
                if (i40 < bVarArr2.length) {
                    bVarArr2[i40] = new b();
                    i40++;
                }
            }
        }
        char c10 = 0;
        fVar.a(gVarArr[0]);
        int i41 = i14 + 1;
        fVar.a(gVarArr[i41]);
        int i42 = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            g gVar3 = gVarArr[c10];
            if (gVar3 != null && (gVar = gVarArr[i41]) != null) {
                int i43 = 0;
                while (true) {
                    d[] dVarArr2 = gVar3.f69709b;
                    if (i43 >= dVarArr2.length) {
                        break;
                    }
                    d dVar4 = dVarArr2[i43];
                    if (dVar4 != null && (dVar = gVar.f69709b[i43]) != null && dVar4.f69699e == dVar.f69699e) {
                        for (int i44 = 1; i44 <= i14; i44++) {
                            d dVar5 = gVarArr[i44].f69709b[i43];
                            if (dVar5 != null) {
                                int i45 = dVarArr2[i43].f69699e;
                                dVar5.f69699e = i45;
                                if (!dVar5.a(i45)) {
                                    gVarArr[i44].f69709b[i43] = null;
                                }
                            }
                        }
                    }
                    i43++;
                }
            }
            g gVar4 = gVarArr[0];
            if (gVar4 != null) {
                int i46 = 0;
                i15 = 0;
                while (true) {
                    d[] dVarArr3 = gVar4.f69709b;
                    if (i46 >= dVarArr3.length) {
                        break;
                    }
                    d dVar6 = dVarArr3[i46];
                    if (dVar6 != null) {
                        int i47 = dVar6.f69699e;
                        int i48 = i15;
                        int i49 = 0;
                        for (int i50 = 1; i50 < i41 && i49 < 2; i50++) {
                            d dVar7 = gVarArr[i50].f69709b[i46];
                            if (dVar7 != null) {
                                if (!dVar7.a(dVar7.f69699e)) {
                                    if (dVar7.a(i47)) {
                                        dVar7.f69699e = i47;
                                        i49 = 0;
                                    } else {
                                        i49++;
                                    }
                                }
                                if (!dVar7.a(dVar7.f69699e)) {
                                    i48++;
                                }
                            }
                        }
                        i15 = i48;
                    }
                    i46++;
                }
            } else {
                i15 = 0;
            }
            g gVar5 = gVarArr[i41];
            if (gVar5 != null) {
                int i51 = 0;
                i16 = 0;
                while (true) {
                    d[] dVarArr4 = gVar5.f69709b;
                    if (i51 >= dVarArr4.length) {
                        break;
                    }
                    d dVar8 = dVarArr4[i51];
                    if (dVar8 != null) {
                        int i52 = dVar8.f69699e;
                        int i53 = 0;
                        for (int i54 = i41; i54 > 0 && i53 < 2; i54--) {
                            d dVar9 = gVarArr[i54].f69709b[i51];
                            if (dVar9 != null) {
                                if (!dVar9.a(dVar9.f69699e)) {
                                    if (dVar9.a(i52)) {
                                        dVar9.f69699e = i52;
                                        i53 = 0;
                                    } else {
                                        i53++;
                                    }
                                }
                                if (!dVar9.a(dVar9.f69699e)) {
                                    i16++;
                                }
                            }
                        }
                    }
                    i51++;
                }
            } else {
                i16 = 0;
            }
            int i55 = i15 + i16;
            if (i55 == 0) {
                i55 = 0;
            } else {
                for (int i56 = 1; i56 < i41; i56++) {
                    d[] dVarArr5 = gVarArr[i56].f69709b;
                    for (int i57 = 0; i57 < dVarArr5.length; i57++) {
                        d dVar10 = dVarArr5[i57];
                        if (dVar10 != null && !dVar10.a(dVar10.f69699e)) {
                            d dVar11 = dVarArr5[i57];
                            d[] dVarArr6 = gVarArr[i56 - 1].f69709b;
                            g gVar6 = gVarArr[i56 + 1];
                            d[] dVarArr7 = gVar6 != null ? gVar6.f69709b : dVarArr6;
                            d[] dVarArr8 = new d[14];
                            dVarArr8[2] = dVarArr6[i57];
                            dVarArr8[3] = dVarArr7[i57];
                            if (i57 > 0) {
                                int i58 = i57 - 1;
                                dVarArr8[0] = dVarArr5[i58];
                                dVarArr8[4] = dVarArr6[i58];
                                dVarArr8[5] = dVarArr7[i58];
                            }
                            if (i57 > 1) {
                                int i59 = i57 - 2;
                                dVarArr8[8] = dVarArr5[i59];
                                dVarArr8[10] = dVarArr6[i59];
                                dVarArr8[11] = dVarArr7[i59];
                            }
                            if (i57 < dVarArr5.length - 1) {
                                int i60 = i57 + 1;
                                dVarArr8[1] = dVarArr5[i60];
                                dVarArr8[6] = dVarArr6[i60];
                                dVarArr8[7] = dVarArr7[i60];
                            }
                            if (i57 < dVarArr5.length - 2) {
                                int i61 = i57 + 2;
                                dVarArr8[9] = dVarArr5[i61];
                                dVarArr8[12] = dVarArr6[i61];
                                dVarArr8[13] = dVarArr7[i61];
                            }
                            int i62 = 0;
                            for (int i63 = 14; i62 < i63; i63 = 14) {
                                d dVar12 = dVarArr8[i62];
                                if (dVar12 != null && dVar12.a(dVar12.f69699e)) {
                                    if (dVar12.f69697c == dVar11.f69697c) {
                                        dVar11.f69699e = dVar12.f69699e;
                                        break;
                                    }
                                }
                                i62++;
                            }
                        }
                    }
                }
            }
            if (i55 <= 0 || i55 >= i42) {
                break;
            }
            i42 = i55;
            c10 = 0;
        }
        int i64 = 0;
        for (g gVar7 : gVarArr) {
            if (gVar7 != null) {
                for (d dVar13 : gVar7.f69709b) {
                    if (dVar13 != null && (i17 = dVar13.f69699e) >= 0 && i17 < bVarArr.length) {
                        bVarArr[i17][i64].b(dVar13.f69698d);
                    }
                }
            }
            i64++;
        }
        b bVar = bVarArr[0][1];
        int[] iArrA = bVar.a();
        int i65 = aVar.f69684e;
        int i66 = aVar.f69681b;
        int i67 = (i14 * i65) - (2 << i66);
        if (iArrA.length == 0) {
            if (i67 <= 0 || i67 > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            bVar.b(i67);
        } else if (iArrA[0] != i67) {
            bVar.b(i67);
        }
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[i65 * i14];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i68 = 0; i68 < i65; i68++) {
            int i69 = 0;
            while (i69 < i14) {
                int i70 = i69 + 1;
                int[] iArrA2 = bVarArr[i68][i70].a();
                int i71 = (i68 * i14) + i69;
                if (iArrA2.length == 0) {
                    arrayList.add(Integer.valueOf(i71));
                } else if (iArrA2.length == 1) {
                    iArr[i71] = iArrA2[0];
                } else {
                    arrayList3.add(Integer.valueOf(i71));
                    arrayList2.add(iArrA2);
                }
                i69 = i70;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i72 = 0; i72 < size; i72++) {
            iArr2[i72] = (int[]) arrayList2.get(i72);
        }
        int[] intArray = PDF417Common.toIntArray(arrayList);
        int[] intArray2 = PDF417Common.toIntArray(arrayList3);
        int length2 = intArray2.length;
        int[] iArr3 = new int[length2];
        int i73 = 100;
        while (true) {
            int i74 = i73 - 1;
            if (i73 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i75 = 0; i75 < length2; i75++) {
                iArr[intArray2[i75]] = iArr2[i75][iArr3[i75]];
            }
            try {
                return b(i66, iArr, intArray);
            } catch (ChecksumException unused) {
                if (length2 == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                for (int i76 = 0; i76 < length2; i76++) {
                    int i77 = iArr3[i76];
                    if (i77 < iArr2[i76].length - 1) {
                        iArr3[i76] = i77 + 1;
                        break;
                    }
                    iArr3[i76] = 0;
                    if (i76 == length2 - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
                i73 = i74;
            }
        }
    }

    public static String toString(b[][] bVarArr) {
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i10));
                int i11 = 0;
                while (true) {
                    b[] bVarArr2 = bVarArr[i10];
                    if (i11 < bVarArr2.length) {
                        b bVar = bVarArr2[i11];
                        if (bVar.a().length == 0) {
                            formatter.format("        ", null);
                        } else {
                            formatter.format("%4d(%2d)", Integer.valueOf(bVar.a()[0]), (Integer) bVar.f69685a.get(Integer.valueOf(bVar.a()[0])));
                        }
                        i11++;
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
