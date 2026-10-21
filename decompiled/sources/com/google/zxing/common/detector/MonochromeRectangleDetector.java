package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class MonochromeRectangleDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f49843a;

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.f49843a = bitMatrix;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x002f A[EDGE_INSN: B:65:0x002f->B:21:0x002f BREAK  A[LOOP:1: B:13:0x001c->B:70:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x002f A[EDGE_INSN: B:66:0x002f->B:21:0x002f BREAK  A[LOOP:1: B:13:0x001c->B:70:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x002f A[EDGE_INSN: B:68:0x002f->B:21:0x002f BREAK  A[LOOP:1: B:13:0x001c->B:70:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0062 A[EDGE_INSN: B:83:0x0062->B:44:0x0062 BREAK  A[LOOP:3: B:36:0x004f->B:88:0x004f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0062 A[EDGE_INSN: B:85:0x0062->B:44:0x0062 BREAK  A[LOOP:3: B:36:0x004f->B:88:0x004f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0062 A[EDGE_INSN: B:87:0x0062->B:44:0x0062 BREAK  A[LOOP:3: B:36:0x004f->B:88:0x004f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[SYNTHETIC] */
    public final int[] a(int i10, int i11, int i12, int i13, boolean z10) {
        BitMatrix bitMatrix;
        int i14;
        int i15;
        int i16 = (i12 + i13) / 2;
        int i17 = i16;
        while (true) {
            bitMatrix = this.f49843a;
            if (i17 >= i12) {
                if (!z10) {
                    if (!bitMatrix.get(i10, i17)) {
                        i15 = i17;
                        while (true) {
                            i15--;
                            if (i15 < i12) {
                                break;
                                break;
                            }
                            if (z10) {
                                if (bitMatrix.get(i15, i10)) {
                                    break;
                                    break;
                                }
                            } else if (bitMatrix.get(i10, i15)) {
                                break;
                                break;
                            }
                        }
                        int i18 = i17 - i15;
                        if (i15 < i12) {
                            break;
                        }
                        break;
                        break;
                    }
                    i17--;
                } else if (bitMatrix.get(i17, i10)) {
                    i17--;
                } else {
                    i15 = i17;
                    while (true) {
                        i15--;
                        if (i15 < i12) {
                            break;
                        }
                        if (z10) {
                            if (bitMatrix.get(i15, i10)) {
                                break;
                            }
                        } else if (bitMatrix.get(i10, i15)) {
                            break;
                        }
                    }
                    int i19 = i17 - i15;
                    if (i15 < i12 || i19 > i11) {
                        break;
                    }
                    i17 = i15;
                }
            } else {
                break;
            }
        }
        int i20 = i17 + 1;
        while (i16 < i13) {
            if (!z10) {
                if (!bitMatrix.get(i10, i16)) {
                    i14 = i16;
                    while (true) {
                        i14++;
                        if (i14 >= i13) {
                            break;
                            break;
                        }
                        if (z10) {
                            if (bitMatrix.get(i14, i10)) {
                                break;
                                break;
                            }
                        } else if (bitMatrix.get(i10, i14)) {
                            break;
                            break;
                        }
                    }
                    int i21 = i14 - i16;
                    if (i14 >= i13) {
                        break;
                    }
                    break;
                    break;
                }
                i16++;
            } else if (bitMatrix.get(i16, i10)) {
                i16++;
            } else {
                i14 = i16;
                while (true) {
                    i14++;
                    if (i14 >= i13) {
                        break;
                    }
                    if (z10) {
                        if (bitMatrix.get(i14, i10)) {
                            break;
                        }
                    } else if (bitMatrix.get(i10, i14)) {
                        break;
                    }
                }
                int i22 = i14 - i16;
                if (i14 >= i13 || i22 > i11) {
                    break;
                }
                i16 = i14;
            }
        }
        int i23 = i16 - 1;
        if (i23 > i20) {
            return new int[]{i20, i23};
        }
        return null;
    }

    public final ResultPoint b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) throws NotFoundException {
        int[] iArr = null;
        int i19 = i10;
        int i20 = i14;
        while (i20 < i17 && i20 >= i16 && i19 < i13 && i19 >= i12) {
            int[] iArrA = i11 == 0 ? a(i20, i18, i12, i13, true) : a(i19, i18, i16, i17, false);
            if (iArrA == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i11 == 0) {
                    int i21 = i20 - i15;
                    int i22 = iArr[0];
                    if (i22 >= i10) {
                        return new ResultPoint(iArr[1], i21);
                    }
                    if (iArr[1] > i10) {
                        return new ResultPoint(iArr[i15 <= 0 ? (char) 1 : (char) 0], i21);
                    }
                    return new ResultPoint(i22, i21);
                }
                int i23 = i19 - i11;
                int i24 = iArr[0];
                if (i24 >= i14) {
                    return new ResultPoint(i23, iArr[1]);
                }
                if (iArr[1] > i14) {
                    return new ResultPoint(i23, iArr[i11 >= 0 ? (char) 1 : (char) 0]);
                }
                return new ResultPoint(i23, i24);
            }
            i20 += i15;
            i19 += i11;
            iArr = iArrA;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() throws NotFoundException {
        BitMatrix bitMatrix = this.f49843a;
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        int i10 = height / 2;
        int i11 = width / 2;
        int iMax = Math.max(1, height / 256);
        int iMax2 = Math.max(1, width / 256);
        int i12 = -iMax;
        int i13 = i11 / 2;
        int y7 = ((int) b(i11, 0, 0, width, i10, i12, 0, height, i13).getY()) - 1;
        int i14 = i10 / 2;
        ResultPoint resultPointB = b(i11, -iMax2, 0, width, i10, 0, y7, height, i14);
        int x4 = ((int) resultPointB.getX()) - 1;
        ResultPoint resultPointB2 = b(i11, iMax2, x4, width, i10, 0, y7, height, i14);
        int x6 = ((int) resultPointB2.getX()) + 1;
        ResultPoint resultPointB3 = b(i11, 0, x4, x6, i10, iMax, y7, height, i13);
        return new ResultPoint[]{b(i11, 0, x4, x6, i10, i12, y7, ((int) resultPointB3.getY()) + 1, i11 / 4), resultPointB, resultPointB2, resultPointB3};
    }
}
