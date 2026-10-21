package a2;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionPaths;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f167q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f166p0 = 1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f168r0 = 0.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f169s0 = 0.0f;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f170t0 = 0.0f;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f171u0 = 1.0f;
    public float v0 = 1.0f;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f172w0 = Float.NaN;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f173x0 = Float.NaN;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f174y0 = 0.0f;
    public float E0 = 0.0f;
    public float F0 = 0.0f;
    public final float G0 = Float.NaN;
    public final float H0 = Float.NaN;
    public final LinkedHashMap<String, CustomVariable> I0 = new LinkedHashMap<>();

    public static boolean c(float f6, float f10) {
        if (Float.isNaN(f6) || Float.isNaN(f10)) {
            return Float.isNaN(f6) != Float.isNaN(f10);
        }
        return Math.abs(f6 - f10) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap<String, SplineSet> map, int i10) {
        for (String str : map.keySet()) {
            SplineSet splineSet = map.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b10 = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b10 = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b10 = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b10 = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b10 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b10 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = 11;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b10 = 12;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    splineSet.setPoint(i10, Float.isNaN(this.f169s0) ? 0.0f : this.f169s0);
                    break;
                case 1:
                    splineSet.setPoint(i10, Float.isNaN(this.f170t0) ? 0.0f : this.f170t0);
                    break;
                case 2:
                    splineSet.setPoint(i10, Float.isNaN(this.f168r0) ? 0.0f : this.f168r0);
                    break;
                case 3:
                    splineSet.setPoint(i10, Float.isNaN(this.f174y0) ? 0.0f : this.f174y0);
                    break;
                case 4:
                    splineSet.setPoint(i10, Float.isNaN(this.E0) ? 0.0f : this.E0);
                    break;
                case 5:
                    splineSet.setPoint(i10, Float.isNaN(this.F0) ? 0.0f : this.F0);
                    break;
                case 6:
                    float f6 = this.H0;
                    splineSet.setPoint(i10, Float.isNaN(f6) ? 0.0f : f6);
                    break;
                case 7:
                    splineSet.setPoint(i10, Float.isNaN(this.f172w0) ? 0.0f : this.f172w0);
                    break;
                case 8:
                    splineSet.setPoint(i10, Float.isNaN(this.f173x0) ? 0.0f : this.f173x0);
                    break;
                case 9:
                    splineSet.setPoint(i10, Float.isNaN(this.f171u0) ? 1.0f : this.f171u0);
                    break;
                case 10:
                    splineSet.setPoint(i10, Float.isNaN(this.v0) ? 1.0f : this.v0);
                    break;
                case 11:
                    splineSet.setPoint(i10, Float.isNaN(this.f166p0) ? 1.0f : this.f166p0);
                    break;
                case 12:
                    float f10 = this.G0;
                    splineSet.setPoint(i10, Float.isNaN(f10) ? 0.0f : f10);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, CustomVariable> linkedHashMap = this.I0;
                        if (linkedHashMap.containsKey(str2)) {
                            CustomVariable customVariable = linkedHashMap.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).setPoint(i10, customVariable);
                            } else {
                                Utils.loge(MotionPaths.TAG, str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + customVariable.getValueToInterpolate() + splineSet);
                            }
                        }
                    } else {
                        Utils.loge(MotionPaths.TAG, "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    public final void b(MotionWidget motionWidget) {
        this.f167q0 = motionWidget.getVisibility();
        this.f166p0 = motionWidget.getVisibility() != 4 ? 0.0f : motionWidget.getAlpha();
        this.f168r0 = motionWidget.getRotationZ();
        this.f169s0 = motionWidget.getRotationX();
        this.f170t0 = motionWidget.getRotationY();
        this.f171u0 = motionWidget.getScaleX();
        this.v0 = motionWidget.getScaleY();
        this.f172w0 = motionWidget.getPivotX();
        this.f173x0 = motionWidget.getPivotY();
        this.f174y0 = motionWidget.getTranslationX();
        this.E0 = motionWidget.getTranslationY();
        this.F0 = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.I0.put(str, customAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        bVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
