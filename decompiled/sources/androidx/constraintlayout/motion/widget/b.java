package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19585r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f19583p0 = 0.0f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f19584q0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f19586s0 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f19587t0 = 1.0f;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f19588u0 = 0.0f;
    public float v0 = 0.0f;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f19589w0 = 0.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f19590x0 = 1.0f;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f19591y0 = 1.0f;
    public float E0 = Float.NaN;
    public float F0 = Float.NaN;
    public float G0 = 0.0f;
    public float H0 = 0.0f;
    public float I0 = 0.0f;
    public float J0 = Float.NaN;
    public float K0 = Float.NaN;

    public static boolean c(float f6, float f10) {
        if (Float.isNaN(f6) || Float.isNaN(f10)) {
            return Float.isNaN(f6) != Float.isNaN(f10);
        }
        return Math.abs(f6 - f10) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap<String, ViewSpline> map, int i10) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = map.get(str);
            if (viewSpline != null) {
                str.getClass();
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b10 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b10 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b10 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b10 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b10 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b10 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b10 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b10 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals(Key.PIVOT_X)) {
                            b10 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals(Key.PIVOT_Y)) {
                            b10 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals(Key.ROTATION)) {
                            b10 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b10 = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b10 = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b10 = 13;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        viewSpline.setPoint(i10, Float.isNaN(this.f19589w0) ? 0.0f : this.f19589w0);
                        break;
                    case 1:
                        viewSpline.setPoint(i10, Float.isNaN(this.f19583p0) ? 0.0f : this.f19583p0);
                        break;
                    case 2:
                        viewSpline.setPoint(i10, Float.isNaN(this.G0) ? 0.0f : this.G0);
                        break;
                    case 3:
                        viewSpline.setPoint(i10, Float.isNaN(this.H0) ? 0.0f : this.H0);
                        break;
                    case 4:
                        viewSpline.setPoint(i10, Float.isNaN(this.I0) ? 0.0f : this.I0);
                        break;
                    case 5:
                        viewSpline.setPoint(i10, Float.isNaN(this.K0) ? 0.0f : this.K0);
                        break;
                    case 6:
                        viewSpline.setPoint(i10, Float.isNaN(this.f19590x0) ? 1.0f : this.f19590x0);
                        break;
                    case 7:
                        viewSpline.setPoint(i10, Float.isNaN(this.f19591y0) ? 1.0f : this.f19591y0);
                        break;
                    case 8:
                        viewSpline.setPoint(i10, Float.isNaN(this.E0) ? 0.0f : this.E0);
                        break;
                    case 9:
                        viewSpline.setPoint(i10, Float.isNaN(this.F0) ? 0.0f : this.F0);
                        break;
                    case 10:
                        viewSpline.setPoint(i10, Float.isNaN(this.v0) ? 0.0f : this.v0);
                        break;
                    case 11:
                        viewSpline.setPoint(i10, Float.isNaN(this.f19588u0) ? 0.0f : this.f19588u0);
                        break;
                    case 12:
                        viewSpline.setPoint(i10, Float.isNaN(this.J0) ? 0.0f : this.J0);
                        break;
                    case 13:
                        viewSpline.setPoint(i10, Float.isNaN(this.f19587t0) ? 1.0f : this.f19587t0);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.f19586s0;
                            if (linkedHashMap.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).setPoint(i10, constraintAttribute);
                                } else {
                                    constraintAttribute.getValueToInterpolate();
                                    viewSpline.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public final void b(View view) {
        this.f19585r0 = view.getVisibility();
        this.f19587t0 = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f19588u0 = view.getElevation();
        this.v0 = view.getRotation();
        this.f19589w0 = view.getRotationX();
        this.f19583p0 = view.getRotationY();
        this.f19590x0 = view.getScaleX();
        this.f19591y0 = view.getScaleY();
        this.E0 = view.getPivotX();
        this.F0 = view.getPivotY();
        this.G0 = view.getTranslationX();
        this.H0 = view.getTranslationY();
        this.I0 = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        bVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, ConstraintSet constraintSet, int i10, int i11) {
        rect.width();
        rect.height();
        ConstraintSet.Constraint parameters = constraintSet.getParameters(i11);
        ConstraintSet.PropertySet propertySet = parameters.propertySet;
        int i12 = propertySet.mVisibilityMode;
        this.f19584q0 = i12;
        int i13 = propertySet.visibility;
        this.f19585r0 = i13;
        this.f19587t0 = (i13 == 0 || i12 != 0) ? propertySet.alpha : 0.0f;
        ConstraintSet.Transform transform = parameters.transform;
        boolean z10 = transform.applyElevation;
        this.f19588u0 = transform.elevation;
        this.v0 = transform.rotation;
        this.f19589w0 = transform.rotationX;
        this.f19583p0 = transform.rotationY;
        this.f19590x0 = transform.scaleX;
        this.f19591y0 = transform.scaleY;
        this.E0 = transform.transformPivotX;
        this.F0 = transform.transformPivotY;
        this.G0 = transform.translationX;
        this.H0 = transform.translationY;
        this.I0 = transform.translationZ;
        Easing.getInterpolator(parameters.motion.mTransitionEasing);
        this.J0 = parameters.motion.mPathRotate;
        this.K0 = parameters.propertySet.mProgress;
        for (String str : parameters.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = parameters.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.f19586s0.put(str, constraintAttribute);
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f6 = this.v0 + 90.0f;
            this.v0 = f6;
            if (f6 > 180.0f) {
                this.v0 = f6 - 360.0f;
                return;
            }
            return;
        }
        this.v0 -= 90.0f;
    }
}
