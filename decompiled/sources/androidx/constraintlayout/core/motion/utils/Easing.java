package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Easing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18831a = "identity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Easing f18830b = new Easing();
    public static String[] NAMED_EASING = {"standard", "accelerate", "decelerate", "linear"};

    public static class a extends Easing {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f18832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f18833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f18834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f18835f;

        public a(String str) {
            this.f18831a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f18832c = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i10 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i10);
            this.f18833d = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
            int i11 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i11);
            this.f18834e = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
            int i12 = iIndexOf4 + 1;
            this.f18835f = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        public final double a(double d2) {
            double d3 = 1.0d - d2;
            double d7 = 3.0d * d3;
            double d10 = d3 * d7 * d2;
            double d11 = d7 * d2 * d2;
            return (this.f18834e * d11) + (this.f18832c * d10) + (d2 * d2 * d2);
        }

        public final double b(double d2) {
            double d3 = 1.0d - d2;
            double d7 = 3.0d * d3;
            double d10 = d3 * d7 * d2;
            double d11 = d7 * d2 * d2;
            return (this.f18835f * d11) + (this.f18833d * d10) + (d2 * d2 * d2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public final double get(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double d3 = 0.5d;
            double d7 = 0.5d;
            while (d3 > 0.01d) {
                d3 *= 0.5d;
                d7 = a(d7) < d2 ? d7 + d3 : d7 - d3;
            }
            double d10 = d7 - d3;
            double dA = a(d10);
            double d11 = d7 + d3;
            double dA2 = a(d11);
            double dB = b(d10);
            return (((d2 - dA) * (b(d11) - dB)) / (dA2 - dA)) + dB;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public final double getDiff(double d2) {
            double d3 = 0.5d;
            double d7 = 0.5d;
            while (d3 > 1.0E-4d) {
                d3 *= 0.5d;
                d7 = a(d7) < d2 ? d7 + d3 : d7 - d3;
            }
            double d10 = d7 - d3;
            double d11 = d7 + d3;
            return (b(d11) - b(d10)) / (a(d11) - a(d10));
        }
    }

    public static Easing getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            StepCurve stepCurve = new StepCurve();
            stepCurve.f18831a = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i10 = 0;
            while (iIndexOf2 != -1) {
                dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i10++;
            }
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i11 = 0; i11 < dArrCopyOf.length; i11++) {
                double d3 = dArrCopyOf[i11];
                int i12 = i11 + length2;
                dArr2[i12][0] = d3;
                double d7 = ((double) i11) * d2;
                dArr3[i12] = d7;
                if (i11 > 0) {
                    int i13 = (length2 * 2) + i11;
                    dArr2[i13][0] = d3 + 1.0d;
                    dArr3[i13] = d7 + 1.0d;
                    int i14 = i11 - 1;
                    dArr2[i14][0] = (d3 - 1.0d) - d2;
                    dArr3[i14] = (d7 - 1.0d) - d2;
                }
            }
            MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
            PrintStream printStream = System.out;
            printStream.println(" 0 " + monotonicCurveFit.getPos(0.0d, 0));
            printStream.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
            stepCurve.f18911c = monotonicCurveFit;
            return stepCurve;
        }
        if (str.startsWith("Schlick")) {
            Schlick schlick = new Schlick();
            schlick.f18831a = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            schlick.f18893c = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i15 = iIndexOf4 + 1;
            schlick.f18894d = Double.parseDouble(str.substring(i15, str.indexOf(44, i15)).trim());
            return schlick;
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(NAMED_EASING));
                return f18830b;
        }
    }

    public double getDiff(double d2) {
        return 1.0d;
    }

    public String toString() {
        return this.f18831a;
    }

    public double get(double d2) {
        return d2;
    }
}
