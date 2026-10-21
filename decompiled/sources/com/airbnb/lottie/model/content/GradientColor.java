package com.airbnb.lottie.model.content;

import androidx.appcompat.widget.a;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GradientColor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f25985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f25986b;

    public GradientColor(float[] fArr, int[] iArr) {
        this.f25985a = fArr;
        this.f25986b = iArr;
    }

    public final void a(GradientColor gradientColor) {
        int i10 = 0;
        while (true) {
            int[] iArr = gradientColor.f25986b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f25985a[i10] = gradientColor.f25985a[i10];
            this.f25986b[i10] = iArr[i10];
            i10++;
        }
    }

    public GradientColor copyWithPositions(float[] fArr) {
        int iEvaluate;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f6 = fArr[i10];
            float[] fArr2 = this.f25985a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f6);
            int[] iArr2 = this.f25986b;
            if (iBinarySearch >= 0) {
                iEvaluate = iArr2[iBinarySearch];
            } else {
                int i11 = -(iBinarySearch + 1);
                if (i11 == 0) {
                    iEvaluate = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    iEvaluate = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f10 = fArr2[i12];
                    iEvaluate = GammaEvaluator.evaluate((f6 - f10) / (fArr2[i11] - f10), iArr2[i12], iArr2[i11]);
                }
            }
            iArr[i10] = iEvaluate;
        }
        return new GradientColor(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GradientColor gradientColor = (GradientColor) obj;
        return Arrays.equals(this.f25985a, gradientColor.f25985a) && Arrays.equals(this.f25986b, gradientColor.f25986b);
    }

    public int[] getColors() {
        return this.f25986b;
    }

    public float[] getPositions() {
        return this.f25985a;
    }

    public int getSize() {
        return this.f25986b.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25986b) + (Arrays.hashCode(this.f25985a) * 31);
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f6) {
        int[] iArr;
        float[] fArr;
        if (gradientColor.equals(gradientColor2)) {
            a(gradientColor);
            return;
        }
        if (f6 <= 0.0f) {
            a(gradientColor);
            return;
        }
        if (f6 >= 1.0f) {
            a(gradientColor2);
            return;
        }
        int[] iArr2 = gradientColor.f25986b;
        int length = iArr2.length;
        int length2 = gradientColor2.f25986b.length;
        int[] iArr3 = gradientColor2.f25986b;
        if (length != length2) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(iArr2.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(a.c(sb2, iArr3.length, ")"));
        }
        int i10 = 0;
        while (true) {
            int length3 = iArr2.length;
            iArr = this.f25986b;
            fArr = this.f25985a;
            if (i10 >= length3) {
                break;
            }
            fArr[i10] = MiscUtils.lerp(gradientColor.f25985a[i10], gradientColor2.f25985a[i10], f6);
            iArr[i10] = GammaEvaluator.evaluate(f6, iArr2[i10], iArr3[i10]);
            i10++;
        }
        for (int length4 = iArr2.length; length4 < fArr.length; length4++) {
            fArr[length4] = fArr[iArr2.length - 1];
            iArr[length4] = iArr[iArr2.length - 1];
        }
    }
}
