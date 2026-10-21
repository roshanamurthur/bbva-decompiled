package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.datastore.preferences.protobuf.e;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    public static final String[] M0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    public int E0;
    public String F0;
    public float G0;
    public Motion H0;
    public final HashMap<String, CustomVariable> I0;
    public final int J0;
    public double[] K0;
    public double[] L0;
    public String mId;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Easing f18747p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f18748q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f18749r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f18750s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f18751t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f18752u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f18753w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f18754x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f18755y0;

    public MotionPaths() {
        this.f18748q0 = 0;
        this.f18754x0 = Float.NaN;
        this.f18755y0 = Float.NaN;
        this.E0 = -1;
        this.F0 = null;
        this.G0 = Float.NaN;
        this.H0 = null;
        this.I0 = new HashMap<>();
        this.J0 = 0;
        this.K0 = new double[18];
        this.L0 = new double[18];
    }

    public static boolean a(float f6, float f10) {
        if (Float.isNaN(f6) || Float.isNaN(f10)) {
            return Float.isNaN(f6) != Float.isNaN(f10);
        }
        return Math.abs(f6 - f10) > 1.0E-6f;
    }

    public static void c(float f6, float f10, float[] fArr, int[] iArr, double[] dArr) {
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f15 = (float) dArr[i10];
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

    public void applyParameters(MotionWidget motionWidget) {
        ConstraintWidget constraintWidget;
        this.f18747p0 = Easing.getInterpolator(motionWidget.f18757b.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.f18757b;
        this.E0 = motion.mPathMotionArc;
        this.F0 = motion.mAnimateRelativeTo;
        this.f18754x0 = motion.mPathRotate;
        this.f18748q0 = motion.mDrawPath;
        int i10 = motion.mAnimateCircleAngleTo;
        this.f18755y0 = motionWidget.f18758c.mProgress;
        WidgetFrame widgetFrame = motionWidget.f18756a;
        if (widgetFrame != null && (constraintWidget = widgetFrame.widget) != null) {
            this.G0 = constraintWidget.mCircleConstraintAngle;
        }
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.I0.put(str, customAttribute);
            }
        }
    }

    public final void b(double d2, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f18751t0;
        float fCos = this.f18752u0;
        float f6 = this.v0;
        float f10 = this.f18753w0;
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
        Motion motion = this.H0;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d2, fArr2, new float[2]);
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

    public void configureRelativeTo(Motion motion) {
        double d2 = this.f18755y0;
        motion.f18728g[0].getPos(d2, motion.m);
        CurveFit curveFit = motion.f18729h;
        if (curveFit != null) {
            double[] dArr = motion.m;
            if (dArr.length > 0) {
                curveFit.getPos(d2, dArr);
            }
        }
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d2 = (((this.v0 / 2.0f) + this.f18751t0) - motionPaths.f18751t0) - (motionPaths.v0 / 2.0f);
        double d3 = (((this.f18753w0 / 2.0f) + this.f18752u0) - motionPaths.f18752u0) - (motionPaths.f18753w0 / 2.0f);
        this.H0 = motion;
        this.f18751t0 = (float) Math.hypot(d3, d2);
        if (Float.isNaN(this.G0)) {
            this.f18752u0 = (float) (Math.atan2(d3, d2) + 1.5707963267948966d);
        } else {
            this.f18752u0 = (float) Math.toRadians(this.G0);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.f18750s0, motionPaths.f18750s0);
    }

    public MotionPaths(int i10, int i11, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f6;
        int i12;
        float fMin;
        float fA;
        this.f18748q0 = 0;
        this.f18754x0 = Float.NaN;
        this.f18755y0 = Float.NaN;
        this.E0 = -1;
        this.F0 = null;
        this.G0 = Float.NaN;
        this.H0 = null;
        this.I0 = new HashMap<>();
        this.J0 = 0;
        this.K0 = new double[18];
        this.L0 = new double[18];
        if (motionPaths.F0 != null) {
            float f10 = motionKeyPosition.mFramePosition / 100.0f;
            this.f18749r0 = f10;
            this.f18748q0 = motionKeyPosition.mDrawPath;
            this.J0 = motionKeyPosition.mPositionType;
            float f11 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f10 : motionKeyPosition.mPercentWidth;
            float f12 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f10 : motionKeyPosition.mPercentHeight;
            float f13 = motionPaths2.v0;
            float f14 = motionPaths.v0;
            float f15 = motionPaths2.f18753w0;
            float f16 = motionPaths.f18753w0;
            this.f18750s0 = this.f18749r0;
            this.v0 = (int) (((f13 - f14) * f11) + f14);
            this.f18753w0 = (int) (((f15 - f16) * f12) + f16);
            int i13 = motionKeyPosition.mPositionType;
            if (i13 == 1) {
                float f17 = Float.isNaN(motionKeyPosition.mPercentX) ? f10 : motionKeyPosition.mPercentX;
                float f18 = motionPaths2.f18751t0;
                float f19 = motionPaths.f18751t0;
                this.f18751t0 = e.a(f18, f19, f17, f19);
                f10 = Float.isNaN(motionKeyPosition.mPercentY) ? f10 : motionKeyPosition.mPercentY;
                float f20 = motionPaths2.f18752u0;
                float f21 = motionPaths.f18752u0;
                this.f18752u0 = e.a(f20, f21, f10, f21);
            } else if (i13 != 2) {
                float f22 = Float.isNaN(motionKeyPosition.mPercentX) ? f10 : motionKeyPosition.mPercentX;
                float f23 = motionPaths2.f18751t0;
                float f24 = motionPaths.f18751t0;
                this.f18751t0 = e.a(f23, f24, f22, f24);
                f10 = Float.isNaN(motionKeyPosition.mPercentY) ? f10 : motionKeyPosition.mPercentY;
                float f25 = motionPaths2.f18752u0;
                float f26 = motionPaths.f18752u0;
                this.f18752u0 = e.a(f25, f26, f10, f26);
            } else {
                if (Float.isNaN(motionKeyPosition.mPercentX)) {
                    float f27 = motionPaths2.f18751t0;
                    float f28 = motionPaths.f18751t0;
                    fMin = e.a(f27, f28, f10, f28);
                } else {
                    fMin = Math.min(f12, f11) * motionKeyPosition.mPercentX;
                }
                this.f18751t0 = fMin;
                if (Float.isNaN(motionKeyPosition.mPercentY)) {
                    float f29 = motionPaths2.f18752u0;
                    float f30 = motionPaths.f18752u0;
                    fA = e.a(f29, f30, f10, f30);
                } else {
                    fA = motionKeyPosition.mPercentY;
                }
                this.f18752u0 = fA;
            }
            this.F0 = motionPaths.F0;
            this.f18747p0 = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
            this.E0 = motionKeyPosition.mPathMotionArc;
            return;
        }
        int i14 = motionKeyPosition.mPositionType;
        if (i14 == 1) {
            float f31 = motionKeyPosition.mFramePosition / 100.0f;
            this.f18749r0 = f31;
            this.f18748q0 = motionKeyPosition.mDrawPath;
            float f32 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f31 : motionKeyPosition.mPercentWidth;
            float f33 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f31 : motionKeyPosition.mPercentHeight;
            float f34 = motionPaths2.v0 - motionPaths.v0;
            float f35 = motionPaths2.f18753w0 - motionPaths.f18753w0;
            this.f18750s0 = this.f18749r0;
            f31 = Float.isNaN(motionKeyPosition.mPercentX) ? f31 : motionKeyPosition.mPercentX;
            float f36 = motionPaths.f18751t0;
            float f37 = motionPaths.v0;
            float f38 = motionPaths.f18752u0;
            float f39 = motionPaths.f18753w0;
            float f40 = ((motionPaths2.v0 / 2.0f) + motionPaths2.f18751t0) - ((f37 / 2.0f) + f36);
            float f41 = ((motionPaths2.f18753w0 / 2.0f) + motionPaths2.f18752u0) - ((f39 / 2.0f) + f38);
            float f42 = f40 * f31;
            float f43 = f34 * f32;
            float f44 = f43 / 2.0f;
            this.f18751t0 = (int) ((f36 + f42) - f44);
            float f45 = f31 * f41;
            float f46 = f35 * f33;
            float f47 = f46 / 2.0f;
            this.f18752u0 = (int) ((f38 + f45) - f47);
            this.v0 = (int) (f37 + f43);
            this.f18753w0 = (int) (f39 + f46);
            float f48 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
            this.J0 = 1;
            float f49 = (int) ((motionPaths.f18751t0 + f42) - f44);
            float f50 = (int) ((motionPaths.f18752u0 + f45) - f47);
            this.f18751t0 = f49 + ((-f41) * f48);
            this.f18752u0 = f50 + (f40 * f48);
            this.F0 = this.F0;
            this.f18747p0 = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
            this.E0 = motionKeyPosition.mPathMotionArc;
            return;
        }
        if (i14 != 2) {
            float f51 = motionKeyPosition.mFramePosition / 100.0f;
            this.f18749r0 = f51;
            this.f18748q0 = motionKeyPosition.mDrawPath;
            float f52 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f51 : motionKeyPosition.mPercentWidth;
            float f53 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f51 : motionKeyPosition.mPercentHeight;
            float f54 = motionPaths2.v0;
            float f55 = motionPaths.v0;
            float f56 = f54 - f55;
            float f57 = motionPaths2.f18753w0;
            float f58 = motionPaths.f18753w0;
            float f59 = f57 - f58;
            this.f18750s0 = this.f18749r0;
            float f60 = motionPaths.f18751t0;
            float f61 = motionPaths.f18752u0;
            float f62 = ((f54 / 2.0f) + motionPaths2.f18751t0) - ((f55 / 2.0f) + f60);
            float f63 = ((f57 / 2.0f) + motionPaths2.f18752u0) - ((f58 / 2.0f) + f61);
            float f64 = f56 * f52;
            float f65 = f64 / 2.0f;
            this.f18751t0 = (int) (((f62 * f51) + f60) - f65);
            float f66 = (f63 * f51) + f61;
            float f67 = f59 * f53;
            float f68 = f67 / 2.0f;
            this.f18752u0 = (int) (f66 - f68);
            this.v0 = (int) (f55 + f64);
            this.f18753w0 = (int) (f58 + f67);
            float f69 = Float.isNaN(motionKeyPosition.mPercentX) ? f51 : motionKeyPosition.mPercentX;
            float f70 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
            f51 = Float.isNaN(motionKeyPosition.mPercentY) ? f51 : motionKeyPosition.mPercentY;
            if (Float.isNaN(motionKeyPosition.mAltPercentX)) {
                i12 = 0;
                f6 = 0.0f;
            } else {
                f6 = motionKeyPosition.mAltPercentX;
                i12 = 0;
            }
            this.J0 = i12;
            this.f18751t0 = (int) (((f6 * f63) + ((f69 * f62) + motionPaths.f18751t0)) - f65);
            this.f18752u0 = (int) (((f63 * f51) + ((f62 * f70) + motionPaths.f18752u0)) - f68);
            this.f18747p0 = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
            this.E0 = motionKeyPosition.mPathMotionArc;
            return;
        }
        float f71 = motionKeyPosition.mFramePosition / 100.0f;
        this.f18749r0 = f71;
        this.f18748q0 = motionKeyPosition.mDrawPath;
        float f72 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f71 : motionKeyPosition.mPercentWidth;
        float f73 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f71 : motionKeyPosition.mPercentHeight;
        float f74 = motionPaths2.v0;
        float f75 = motionPaths.v0;
        float f76 = f74 - f75;
        float f77 = motionPaths2.f18753w0;
        float f78 = motionPaths.f18753w0;
        float f79 = f77 - f78;
        this.f18750s0 = this.f18749r0;
        float f80 = motionPaths.f18751t0;
        float f81 = motionPaths.f18752u0;
        float f82 = (f74 / 2.0f) + motionPaths2.f18751t0;
        float f83 = (f77 / 2.0f) + motionPaths2.f18752u0;
        float f84 = f76 * f72;
        this.f18751t0 = (int) ((((f82 - ((f75 / 2.0f) + f80)) * f71) + f80) - (f84 / 2.0f));
        float f85 = f79 * f73;
        this.f18752u0 = (int) ((((f83 - ((f78 / 2.0f) + f81)) * f71) + f81) - (f85 / 2.0f));
        this.v0 = (int) (f75 + f84);
        this.f18753w0 = (int) (f78 + f85);
        this.J0 = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f18751t0 = (int) (motionKeyPosition.mPercentX * (i10 - ((int) this.v0)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f18752u0 = (int) (motionKeyPosition.mPercentY * (i11 - ((int) this.f18753w0)));
        }
        this.F0 = this.F0;
        this.f18747p0 = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.E0 = motionKeyPosition.mPathMotionArc;
    }
}
