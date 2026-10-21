package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: AlignmentPatternFinder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f50057a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f50062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f50063g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ResultPointCallback f50065i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f50058b = new ArrayList(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f50064h = new int[3];

    public a(BitMatrix bitMatrix, int i10, int i11, int i12, int i13, float f6, ResultPointCallback resultPointCallback) {
        this.f50057a = bitMatrix;
        this.f50059c = i10;
        this.f50060d = i11;
        this.f50061e = i12;
        this.f50062f = i13;
        this.f50063g = f6;
        this.f50065i = resultPointCallback;
    }

    public final boolean a(int[] iArr) {
        float f6 = this.f50063g;
        float f10 = f6 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f6 - iArr[i10]) >= f10) {
                return false;
            }
        }
        return true;
    }

    public final AlignmentPattern b(int i10, int i11, int[] iArr) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = i12 + i13 + i14;
        float f6 = (i11 - i14) - (i13 / 2.0f);
        int i16 = (int) f6;
        int i17 = i13 * 2;
        BitMatrix bitMatrix = this.f50057a;
        int height = bitMatrix.getHeight();
        int[] iArr2 = this.f50064h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i18 = i10;
        while (i18 >= 0 && bitMatrix.get(i16, i18)) {
            int i19 = iArr2[1];
            if (i19 > i17) {
                break;
            }
            iArr2[1] = i19 + 1;
            i18--;
        }
        float f10 = Float.NaN;
        if (i18 >= 0 && iArr2[1] <= i17) {
            while (i18 >= 0 && !bitMatrix.get(i16, i18)) {
                int i20 = iArr2[0];
                if (i20 > i17) {
                    break;
                }
                iArr2[0] = i20 + 1;
                i18--;
            }
            if (iArr2[0] <= i17) {
                int i21 = i10 + 1;
                while (i21 < height && bitMatrix.get(i16, i21)) {
                    int i22 = iArr2[1];
                    if (i22 > i17) {
                        break;
                    }
                    iArr2[1] = i22 + 1;
                    i21++;
                }
                if (i21 != height && iArr2[1] <= i17) {
                    while (i21 < height && !bitMatrix.get(i16, i21)) {
                        int i23 = iArr2[2];
                        if (i23 > i17) {
                            break;
                        }
                        iArr2[2] = i23 + 1;
                        i21++;
                    }
                    int i24 = iArr2[2];
                    if (i24 <= i17 && Math.abs(((iArr2[0] + iArr2[1]) + i24) - i15) * 5 < i15 * 2 && a(iArr2)) {
                        f10 = (i21 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f10)) {
            return null;
        }
        float f11 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList<AlignmentPattern> arrayList = this.f50058b;
        for (AlignmentPattern alignmentPattern : arrayList) {
            if (Math.abs(f10 - alignmentPattern.getY()) <= f11 && Math.abs(f6 - alignmentPattern.getX()) <= f11) {
                float f12 = alignmentPattern.f50042c;
                float fAbs = Math.abs(f11 - f12);
                if (fAbs <= 1.0f || fAbs <= f12) {
                    return new AlignmentPattern((alignmentPattern.getX() + f6) / 2.0f, (alignmentPattern.getY() + f10) / 2.0f, (f12 + f11) / 2.0f);
                }
            }
        }
        AlignmentPattern alignmentPattern2 = new AlignmentPattern(f6, f10, f11);
        arrayList.add(alignmentPattern2);
        ResultPointCallback resultPointCallback = this.f50065i;
        if (resultPointCallback == null) {
            return null;
        }
        resultPointCallback.foundPossibleResultPoint(alignmentPattern2);
        return null;
    }
}
