package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpringEstimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b\u001a6\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b¨\u0006\f"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "estimateAnimationDurationMillis", "", "springConstant", "dampingCoefficient", "mass", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 3 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,329:1\n328#1:362\n328#1:363\n324#1:364\n328#1:365\n328#1:366\n324#1:367\n103#2:330\n107#2:336\n103#2:340\n103#2:346\n107#2:352\n103#2:356\n35#3,2:331\n54#3,3:333\n66#3,3:337\n35#3,2:341\n54#3,3:343\n35#3,2:347\n54#3,3:349\n66#3,3:353\n35#3,2:357\n54#3,3:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n149#1:362\n150#1:363\n188#1:364\n221#1:365\n222#1:366\n266#1:367\n59#1:330\n60#1:336\n60#1:340\n90#1:346\n91#1:352\n91#1:356\n59#1:331,2\n59#1:333,3\n60#1:337,3\n60#1:341,2\n60#1:343,3\n90#1:347,2\n90#1:349,3\n91#1:353,3\n91#1:357,2\n91#1:359,3\n*E\n"})
public final class SpringEstimationKt {
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    public static final long a(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d2, double d3, double d7, double d10) {
        boolean z10;
        boolean z11;
        double dLog;
        boolean z12;
        boolean z13;
        double d11;
        double d12 = d3;
        double d13 = d10;
        if (d7 == 0.0d && d12 == 0.0d) {
            return 0L;
        }
        if (d7 < 0.0d) {
            d12 = -d12;
        }
        double dAbs = Math.abs(d7);
        if (d2 > 1.0d) {
            double f2909a = complexDouble.getF2909a();
            double f2909a2 = complexDouble2.getF2909a();
            double d14 = (f2909a * dAbs) - d12;
            double d15 = f2909a - f2909a2;
            double d16 = d14 / d15;
            double d17 = dAbs - d16;
            double dLog2 = Math.log(Math.abs(d13 / d17)) / f2909a;
            double dLog3 = Math.log(Math.abs(d13 / d16)) / f2909a2;
            if (Double.isInfinite(dLog2) || Double.isNaN(dLog2)) {
                z12 = false;
                z13 = true;
            } else {
                z13 = true;
                z12 = true;
            }
            if (z12 ^ z13) {
                dLog2 = dLog3;
            } else if (!(z13 ^ ((Double.isInfinite(dLog3) || Double.isNaN(dLog3)) ? false : z13))) {
                dLog2 = Math.max(dLog2, dLog3);
            }
            double d18 = d17 * f2909a;
            double d19 = dLog2;
            double dLog4 = Math.log(d18 / ((-d16) * f2909a2)) / (f2909a2 - f2909a);
            if (Double.isNaN(dLog4) || dLog4 <= 0.0d) {
                d11 = -d13;
                dLog = d19;
            } else if (dLog4 <= 0.0d) {
                dLog = Math.log((-((d16 * f2909a2) * f2909a2)) / (d18 * f2909a)) / d15;
                d11 = d13;
            } else if ((-((Math.exp(dLog4 * f2909a2) * d16) + (Math.exp(f2909a * dLog4) * d17))) < d13) {
                dLog = (d16 <= 0.0d || d17 >= 0.0d) ? d19 : 0.0d;
                d11 = -d13;
            } else {
                dLog = Math.log((-((d16 * f2909a2) * f2909a2)) / (d18 * f2909a)) / d15;
                d11 = d13;
            }
            double d20 = d16 * f2909a2;
            if (Math.abs((Math.exp(f2909a2 * dLog) * d20) + (Math.exp(f2909a * dLog) * d18)) >= 1.0E-4d) {
                int i10 = 0;
                double dAbs2 = Double.MAX_VALUE;
                double d21 = 0.001d;
                while (dAbs2 > d21 && i10 < 100) {
                    i10++;
                    double d22 = f2909a * dLog;
                    double d23 = f2909a2 * dLog;
                    double dExp = dLog - ((((Math.exp(d23) * d16) + (Math.exp(d22) * d17)) + d11) / ((Math.exp(d23) * d20) + (Math.exp(d22) * d18)));
                    d21 = 0.001d;
                    dAbs2 = Math.abs(dLog - dExp);
                    dLog = dExp;
                }
            }
        } else if (d2 < 1.0d) {
            double f2909a3 = complexDouble.getF2909a();
            double f2910b = (d12 - (f2909a3 * dAbs)) / complexDouble.getF2910b();
            dLog = Math.log(d13 / Math.sqrt((f2910b * f2910b) + (dAbs * dAbs))) / f2909a3;
        } else {
            double f2909a4 = complexDouble.getF2909a();
            double d24 = f2909a4 * dAbs;
            double d25 = d12 - d24;
            double dLog5 = Math.log(Math.abs(d13 / dAbs)) / f2909a4;
            double dLog6 = Math.log(Math.abs(d13 / d25));
            double dLog7 = dLog6;
            for (int i11 = 0; i11 < 6; i11++) {
                dLog7 = dLog6 - Math.log(Math.abs(dLog7 / f2909a4));
            }
            double d26 = dLog7 / f2909a4;
            if (Double.isInfinite(dLog5) || Double.isNaN(dLog5)) {
                z10 = false;
                z11 = true;
            } else {
                z11 = true;
                z10 = true;
            }
            if (z10 ^ z11) {
                dLog5 = d26;
            } else if (!(((Double.isInfinite(d26) || Double.isNaN(d26)) ? false : z11) ^ z11)) {
                dLog5 = Math.max(dLog5, d26);
            }
            double d27 = (-(d24 + d25)) / (f2909a4 * d25);
            double d28 = f2909a4 * d27;
            double dExp2 = (Math.exp(d28) * d25 * d27) + (Math.exp(d28) * dAbs);
            if (Double.isNaN(d27) || d27 <= 0.0d) {
                d13 = -d13;
            } else if (d27 <= 0.0d || (-dExp2) >= d13) {
                dLog5 = (-(2.0d / f2909a4)) - (dAbs / d25);
            } else {
                if (d25 < 0.0d && dAbs > 0.0d) {
                    dLog5 = 0.0d;
                }
                d13 = -d13;
            }
            int i12 = 0;
            double dAbs3 = Double.MAX_VALUE;
            while (dAbs3 > 0.001d && i12 < 100) {
                i12++;
                double d29 = f2909a4 * dLog5;
                double d30 = d13;
                double dExp3 = dLog5 - (((Math.exp(d29) * ((d25 * dLog5) + dAbs)) + d13) / (Math.exp(d29) * (((d29 + ((double) 1)) * d25) + d24)));
                dAbs3 = Math.abs(dLog5 - dExp3);
                dLog5 = dExp3;
                d13 = d30;
            }
            dLog = dLog5;
        }
        return (long) (dLog * 1000.0d);
    }

    public static final long estimateAnimationDurationMillis(float f6, float f10, float f11, float f12, float f13) {
        return estimateAnimationDurationMillis(f6, f10, f11, f12, f13);
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d7, double d10, double d11) {
        double dSqrt = Math.sqrt(d2) * 2.0d * d3;
        double d12 = (dSqrt * dSqrt) - (4.0d * d2);
        double d13 = -dSqrt;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d12);
        complexDoubleComplexSqrt.f2909a += d13;
        complexDoubleComplexSqrt.f2909a *= 0.5d;
        complexDoubleComplexSqrt.f2910b *= 0.5d;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d12);
        double d14 = -1;
        complexDoubleComplexSqrt2.f2909a *= d14;
        complexDoubleComplexSqrt2.f2910b *= d14;
        complexDoubleComplexSqrt2.f2909a += d13;
        complexDoubleComplexSqrt2.f2909a *= 0.5d;
        complexDoubleComplexSqrt2.f2910b *= 0.5d;
        return a(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, d3, d7, d10, d11);
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d7, double d10, double d11, double d12) {
        double dSqrt = d3 / (Math.sqrt(d2 * d7) * 2.0d);
        double d13 = (d3 * d3) - ((4.0d * d7) * d2);
        double d14 = 1.0d / (2.0d * d7);
        double d15 = -d3;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d13);
        complexDoubleComplexSqrt.f2909a += d15;
        complexDoubleComplexSqrt.f2909a *= d14;
        complexDoubleComplexSqrt.f2910b *= d14;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d13);
        double d16 = -1;
        complexDoubleComplexSqrt2.f2909a *= d16;
        complexDoubleComplexSqrt2.f2910b *= d16;
        complexDoubleComplexSqrt2.f2909a += d15;
        complexDoubleComplexSqrt2.f2909a *= d14;
        complexDoubleComplexSqrt2.f2910b *= d14;
        return a(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, dSqrt, d10, d11, d12);
    }
}
