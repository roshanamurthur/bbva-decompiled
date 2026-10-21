package androidx.constraintlayout.motion.widget;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionPaths.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable<d> {
    public static final String[] L0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public int E0;
    public float F0;
    public MotionController G0;
    public LinkedHashMap<String, ConstraintAttribute> H0;
    public int I0;
    public double[] J0;
    public double[] K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Easing f19593p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f19595r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f19596s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f19597t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f19598u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f19599w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f19601y0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f19594q0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f19600x0 = Float.NaN;

    public d() {
        int i10 = Key.UNSET;
        this.f19601y0 = i10;
        this.E0 = i10;
        this.F0 = Float.NaN;
        this.G0 = null;
        this.H0 = new LinkedHashMap<>();
        this.I0 = 0;
        this.J0 = new double[18];
        this.K0 = new double[18];
    }

    public static boolean b(float f6, float f10) {
        if (Float.isNaN(f6) || Float.isNaN(f10)) {
            return Float.isNaN(f6) != Float.isNaN(f10);
        }
        return Math.abs(f6 - f10) > 1.0E-6f;
    }

    public static void g(float f6, float f10, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f15 = (float) dArr[i10];
            double d2 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f15;
            } else if (i11 == 2) {
                f13 = f15;
            } else if (i11 == 3) {
                f12 = f15;
            } else if (i11 == 4) {
                f14 = f15;
            }
        }
        float f16 = f11 - ((0.0f * f12) / 2.0f);
        float f17 = f13 - ((0.0f * f14) / 2.0f);
        fArr[0] = (((f12 * 1.0f) + f16) * f6) + ((1.0f - f6) * f16) + 0.0f;
        fArr[1] = (((f14 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
    }

    public final void a(ConstraintSet.Constraint constraint) {
        this.f19593p0 = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.f19601y0 = motion.mPathMotionArc;
        this.E0 = motion.mAnimateRelativeTo;
        this.f19600x0 = motion.mPathRotate;
        this.f19594q0 = motion.mDrawPath;
        int i10 = motion.mAnimateCircleAngleTo;
        float f6 = constraint.propertySet.mProgress;
        this.F0 = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.H0.put(str, constraintAttribute);
            }
        }
    }

    public final void c(double d2, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f19597t0;
        float fCos = this.f19598u0;
        float f6 = this.v0;
        float f10 = this.f19599w0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f11 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f11;
            } else if (i12 == 2) {
                fCos = f11;
            } else if (i12 == 3) {
                f6 = f11;
            } else if (i12 == 4) {
                f10 = f11;
            }
        }
        MotionController motionController = this.G0;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d2, fArr2, new float[2]);
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            double d3 = f12;
            double d7 = fSin;
            double d10 = fCos;
            fSin = (float) (((Math.sin(d10) * d7) + d3) - ((double) (f6 / 2.0f)));
            fCos = (float) ((((double) f13) - (Math.cos(d10) * d7)) - ((double) (f10 / 2.0f)));
        }
        fArr[i10] = (f6 / 2.0f) + fSin + 0.0f;
        fArr[i10 + 1] = (f10 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull d dVar) {
        return Float.compare(this.f19596s0, dVar.f19596s0);
    }

    public final void d(String str, double[] dArr) {
        ConstraintAttribute constraintAttribute = this.H0.get(str);
        if (constraintAttribute == null) {
            return;
        }
        int i10 = 0;
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[0] = constraintAttribute.getValueToInterpolate();
            return;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i11 = 0;
        while (i10 < iNumberOfInterpolatedValues) {
            dArr[i11] = fArr[i10];
            i10++;
            i11++;
        }
    }

    public final void e(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f6 = this.f19597t0;
        float fCos = this.f19598u0;
        float f10 = this.v0;
        float f11 = this.f19599w0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f6 = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        MotionController motionController = this.G0;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.G0.getCenterY();
            double d2 = f6;
            double d3 = fCos;
            float fSin = (float) (((Math.sin(d3) * d2) + ((double) centerX)) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) centerY) - (Math.cos(d3) * d2)) - ((double) (f11 / 2.0f)));
            f6 = fSin;
        }
        float f13 = f10 + f6;
        float f14 = f11 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i10] = f6 + 0.0f;
        fArr[i10 + 1] = fCos + 0.0f;
        fArr[i10 + 2] = f13 + 0.0f;
        fArr[i10 + 3] = fCos + 0.0f;
        fArr[i10 + 4] = f13 + 0.0f;
        fArr[i10 + 5] = f14 + 0.0f;
        fArr[i10 + 6] = f6 + 0.0f;
        fArr[i10 + 7] = f14 + 0.0f;
    }

    public final void f(float f6, float f10, float f11, float f12) {
        this.f19597t0 = f6;
        this.f19598u0 = f10;
        this.v0 = f11;
        this.f19599w0 = f12;
    }

    public final void h(MotionController motionController, d dVar) {
        double d2 = (((this.v0 / 2.0f) + this.f19597t0) - dVar.f19597t0) - (dVar.v0 / 2.0f);
        double d3 = (((this.f19599w0 / 2.0f) + this.f19598u0) - dVar.f19598u0) - (dVar.f19599w0 / 2.0f);
        this.G0 = motionController;
        this.f19597t0 = (float) Math.hypot(d3, d2);
        if (Float.isNaN(this.F0)) {
            this.f19598u0 = (float) (Math.atan2(d3, d2) + 1.5707963267948966d);
        } else {
            this.f19598u0 = (float) Math.toRadians(this.F0);
        }
    }
}
