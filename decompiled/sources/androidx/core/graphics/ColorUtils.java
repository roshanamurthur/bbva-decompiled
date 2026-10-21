package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.collection.ScatterMapKt;
import androidx.core.content.res.CamColor;
import androidx.core.view.ViewCompat;
import com.mastercard.sonic.BuildConfig;
import java.util.Objects;
import kotlin.jvm.internal.DoubleCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<double[]> f19876a = new ThreadLocal<>();

    @RequiresApi(26)
    public static class a {
        @DoNotInline
        public static Color a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = (1.0f - fAlpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            float f6 = fAlpha + fAlpha2;
            components2[componentCount] = f6;
            if (f6 > 0.0f) {
                fAlpha /= f6;
                fAlpha2 /= f6;
            }
            for (int i10 = 0; i10 < componentCount; i10++) {
                components2[i10] = (components2[i10] * fAlpha2) + (components[i10] * fAlpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    @ColorInt
    public static int HSLToColor(@NonNull float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3 = 0;
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float fAbs = (1.0f - Math.abs((f11 * 2.0f) - 1.0f)) * f10;
        float f12 = f11 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f6 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f6) / 60) {
            case 0:
                iRound3 = Math.round((fAbs + f12) * 255.0f);
                iRound = Math.round((fAbs2 + f12) * 255.0f);
                iRound2 = Math.round(f12 * 255.0f);
                break;
            case 1:
                iRound3 = Math.round((fAbs2 + f12) * 255.0f);
                iRound = Math.round((fAbs + f12) * 255.0f);
                iRound2 = Math.round(f12 * 255.0f);
                break;
            case 2:
                iRound3 = Math.round(f12 * 255.0f);
                iRound = Math.round((fAbs + f12) * 255.0f);
                iRound2 = Math.round((fAbs2 + f12) * 255.0f);
                break;
            case 3:
                iRound3 = Math.round(f12 * 255.0f);
                iRound = Math.round((fAbs2 + f12) * 255.0f);
                iRound2 = Math.round((fAbs + f12) * 255.0f);
                break;
            case 4:
                iRound3 = Math.round((fAbs2 + f12) * 255.0f);
                iRound = Math.round(f12 * 255.0f);
                iRound2 = Math.round((fAbs + f12) * 255.0f);
                break;
            case 5:
            case 6:
                iRound3 = Math.round((fAbs + f12) * 255.0f);
                iRound = Math.round(f12 * 255.0f);
                iRound2 = Math.round((fAbs2 + f12) * 255.0f);
                break;
            default:
                iRound2 = 0;
                iRound = 0;
                break;
        }
        return Color.rgb(b(iRound3), b(iRound), b(iRound2));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, to = 100.0d) double d2, @FloatRange(from = -128.0d, to = 127.0d) double d3, @FloatRange(from = -128.0d, to = 127.0d) double d7) {
        ThreadLocal<double[]> threadLocal = f19876a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        LABToXYZ(d2, d3, d7, dArr);
        return XYZToColor(dArr[0], dArr[1], dArr[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, to = 100.0d) double d2, @FloatRange(from = -128.0d, to = 127.0d) double d3, @FloatRange(from = -128.0d, to = 127.0d) double d7, @NonNull double[] dArr) {
        double d10 = (d2 + 16.0d) / 116.0d;
        double d11 = (d3 / 500.0d) + d10;
        double d12 = d10 - (d7 / 200.0d);
        double dPow = Math.pow(d11, 3.0d);
        if (dPow <= 0.008856d) {
            dPow = ((d11 * 116.0d) - 16.0d) / 903.3d;
        }
        double dPow2 = d2 > 7.9996247999999985d ? Math.pow(d10, 3.0d) : d2 / 903.3d;
        double dPow3 = Math.pow(d12, 3.0d);
        if (dPow3 <= 0.008856d) {
            dPow3 = ((d12 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = dPow * 95.047d;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * 108.883d;
    }

    @ColorInt
    public static int M3HCTToColor(@FloatRange(from = 0.0d, to = 360.0d, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f10, @FloatRange(from = 0.0d, to = 100.0d) float f11) {
        return CamColor.toColor(f6, f10, f11);
    }

    public static void RGBToHSL(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i12, @NonNull float[] fArr) {
        float f6;
        float fAbs;
        float f10 = i10 / 255.0f;
        float f11 = i11 / 255.0f;
        float f12 = i12 / 255.0f;
        float fMax = Math.max(f10, Math.max(f11, f12));
        float fMin = Math.min(f10, Math.min(f11, f12));
        float f13 = fMax - fMin;
        float f14 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f6 = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f10) {
                f6 = ((f11 - f12) / f13) % 6.0f;
            } else {
                f6 = fMax == f11 ? ((f12 - f10) / f13) + 2.0f : 4.0f + ((f10 - f11) / f13);
            }
            fAbs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (f6 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = f15 < 0.0f ? 0.0f : Math.min(f15, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f14 >= 0.0f ? Math.min(f14, 1.0f) : 0.0f;
    }

    public static void RGBToLAB(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i12, @NonNull double[] dArr) {
        RGBToXYZ(i10, i11, i12, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i12, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = ((double) i10) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i11) / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d7 = ((double) i12) / 255.0d;
        double dPow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, to = 95.047d) double d2, @FloatRange(from = 0.0d, to = 100.0d) double d3, @FloatRange(from = 0.0d, to = 108.883d) double d7) {
        double d10 = (((-0.4986d) * d7) + (((-1.5372d) * d3) + (3.2406d * d2))) / 100.0d;
        double d11 = ((0.0415d * d7) + ((1.8758d * d3) + ((-0.9689d) * d2))) / 100.0d;
        double d12 = ((1.057d * d7) + (((-0.204d) * d3) + (0.0557d * d2))) / 100.0d;
        return Color.rgb(b((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d)), b((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d)), b((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d)));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, to = 95.047d) double d2, @FloatRange(from = 0.0d, to = 100.0d) double d3, @FloatRange(from = 0.0d, to = 108.883d) double d7, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dC = c(d2 / 95.047d);
        double dC2 = c(d3 / 100.0d);
        double dC3 = c(d7 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * dC2) - 16.0d);
        dArr[1] = (dC - dC2) * 500.0d;
        dArr[2] = (dC2 - dC3) * 200.0d;
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    public static int b(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 255);
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        float f10 = 1.0f - f6;
        return Color.argb((int) ((Color.alpha(i11) * f6) + (Color.alpha(i10) * f10)), (int) ((Color.red(i11) * f6) + (Color.red(i10) * f10)), (int) ((Color.green(i11) * f6) + (Color.green(i10) * f10)), (int) ((Color.blue(i11) * f6) + (Color.blue(i10) * f10)));
    }

    public static void blendHSL(@NonNull float[] fArr, @NonNull float[] fArr2, @FloatRange(from = 0.0d, to = 1.0d) float f6, @NonNull float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f10 = 1.0f - f6;
        float f11 = fArr[0];
        float f12 = fArr2[0];
        if (Math.abs(f12 - f11) > 180.0f) {
            if (f12 > f11) {
                f11 += 360.0f;
            } else {
                f12 += 360.0f;
            }
        }
        fArr3[0] = (((f12 - f11) * f6) + f11) % 360.0f;
        fArr3[1] = (fArr2[1] * f6) + (fArr[1] * f10);
        fArr3[2] = (fArr2[2] * f6) + (fArr[2] * f10);
    }

    public static void blendLAB(@NonNull double[] dArr, @NonNull double[] dArr2, @FloatRange(from = 0.0d, to = 1.0d) double d2, @NonNull double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d3 = 1.0d - d2;
        dArr3[0] = (dArr2[0] * d2) + (dArr[0] * d3);
        dArr3[1] = (dArr2[1] * d2) + (dArr[1] * d3);
        dArr3[2] = (dArr2[2] * d2) + (dArr[2] * d3);
    }

    public static double c(double d2) {
        return d2 > 0.008856d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.3d) + 16.0d) / 116.0d;
    }

    public static double calculateContrast(@ColorInt int i10, @ColorInt int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        if (Color.alpha(i10) < 255) {
            i10 = compositeColors(i10, i11);
        }
        double dCalculateLuminance = calculateLuminance(i10) + 0.05d;
        double dCalculateLuminance2 = calculateLuminance(i11) + 0.05d;
        return Math.max(dCalculateLuminance, dCalculateLuminance2) / Math.min(dCalculateLuminance, dCalculateLuminance2);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double calculateLuminance(@ColorInt int i10) {
        ThreadLocal<double[]> threadLocal = f19876a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        colorToXYZ(i10, dArr);
        return dArr[1] / 100.0d;
    }

    public static int calculateMinimumAlpha(@ColorInt int i10, @ColorInt int i11, float f6) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        double d2 = f6;
        if (calculateContrast(setAlphaComponent(i10, 255), i11) < d2) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (calculateContrast(setAlphaComponent(i10, i15), i11) < d2) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    public static void colorToHSL(@ColorInt int i10, @NonNull float[] fArr) {
        RGBToHSL(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void colorToLAB(@ColorInt int i10, @NonNull double[] dArr) {
        RGBToLAB(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static void colorToM3HCT(@ColorInt int i10, @NonNull @Size(BuildConfig.VERSION_CODE) float[] fArr) {
        CamColor.getM3HCTfromColor(i10, fArr);
    }

    public static void colorToXYZ(@ColorInt int i10, @NonNull double[] dArr) {
        RGBToXYZ(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static int compositeColors(@ColorInt int i10, @ColorInt int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i12, a(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, i12), a(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, i12), a(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, i12));
    }

    public static double distanceEuclidean(@NonNull double[] dArr, @NonNull double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }

    @NonNull
    @RequiresApi(26)
    public static Color compositeColors(@NonNull Color color, @NonNull Color color2) {
        return a.a(color, color2);
    }
}
