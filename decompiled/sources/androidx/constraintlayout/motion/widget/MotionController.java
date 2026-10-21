package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionController {
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    public KeyTrigger[] A;
    public int B;
    public int C;
    public View D;
    public int E;
    public float F;
    public Interpolator G;
    public boolean H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f19389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19390c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CurveFit[] f19397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CurveFit f19398k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f19401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f19402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f19403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f19404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f19405s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap<String, ViewTimeCycle> f19410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap<String, ViewSpline> f19411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap<String, ViewOscillator> f19412z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f19388a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19391d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19392e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f19393f = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f19394g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f19395h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f19396i = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19399l = Float.NaN;
    public float m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19400n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f19406t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList<d> f19407u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f19408v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList<Key> f19409w = new ArrayList<>();

    public MotionController(View view) {
        int i10 = Key.UNSET;
        this.B = i10;
        this.C = i10;
        this.D = null;
        this.E = i10;
        this.F = Float.NaN;
        this.G = null;
        this.H = false;
        setView(view);
    }

    public static void i(int i10, int i11, int i12, Rect rect, Rect rect2) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((rect.height() + i13) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((rect.height() + i15) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i16 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final int a(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f19397j[0].getTimePoints();
        if (iArr != null) {
            Iterator<d> it = this.f19407u.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().I0;
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < timePoints.length; i12++) {
            this.f19397j[0].getPos(timePoints[i12], this.f19402p);
            this.f19393f.c(timePoints[i12], this.f19401o, this.f19402p, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public void addKey(Key key) {
        this.f19409w.add(key);
    }

    public final void b(float[] fArr, int i10) {
        double d2;
        float f6 = 1.0f;
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, ViewSpline> map = this.f19411y;
        ViewSpline viewSpline = map == null ? null : map.get("translationX");
        HashMap<String, ViewSpline> map2 = this.f19411y;
        ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, ViewOscillator> map3 = this.f19412z;
        ViewOscillator viewOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, ViewOscillator> map4 = this.f19412z;
        ViewOscillator viewOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i11 = 0;
        while (i11 < i10) {
            float fMin = i11 * f10;
            float f11 = this.f19400n;
            float f12 = 0.0f;
            if (f11 != f6) {
                float f13 = this.m;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f11, f6);
                }
            }
            float f14 = fMin;
            double d3 = f14;
            Easing easing = this.f19393f.f19593p0;
            float f15 = Float.NaN;
            for (d dVar : this.f19407u) {
                Easing easing2 = dVar.f19593p0;
                double d7 = d3;
                if (easing2 != null) {
                    float f16 = dVar.f19595r0;
                    if (f16 < f14) {
                        f12 = f16;
                        easing = easing2;
                    } else if (Float.isNaN(f15)) {
                        f15 = dVar.f19595r0;
                    }
                }
                d3 = d7;
            }
            double d10 = d3;
            if (easing != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f17 = f15 - f12;
                d2 = (((float) easing.get((f14 - f12) / f17)) * f17) + f12;
            } else {
                d2 = d10;
            }
            this.f19397j[0].getPos(d2, this.f19402p);
            CurveFit curveFit = this.f19398k;
            if (curveFit != null) {
                double[] dArr = this.f19402p;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            int i12 = i11 * 2;
            int i13 = i11;
            this.f19393f.c(d2, this.f19401o, this.f19402p, fArr, i12);
            if (viewOscillator != null) {
                fArr[i12] = viewOscillator.get(f14) + fArr[i12];
            } else if (viewSpline != null) {
                fArr[i12] = viewSpline.get(f14) + fArr[i12];
            }
            if (viewOscillator2 != null) {
                int i14 = i12 + 1;
                fArr[i14] = viewOscillator2.get(f14) + fArr[i14];
            } else if (viewSpline2 != null) {
                int i15 = i12 + 1;
                fArr[i15] = viewSpline2.get(f14) + fArr[i15];
            }
            i11 = i13 + 1;
            f6 = 1.0f;
        }
    }

    public final float c(float f6, float[] fArr) {
        float f10 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f11 = this.f19400n;
            if (f11 != 1.0d) {
                float f12 = this.m;
                if (f6 < f12) {
                    f6 = 0.0f;
                }
                if (f6 > f12 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f12) * f11, 1.0f);
                }
            }
        }
        Easing easing = this.f19393f.f19593p0;
        float f13 = Float.NaN;
        for (d dVar : this.f19407u) {
            Easing easing2 = dVar.f19593p0;
            if (easing2 != null) {
                float f14 = dVar.f19595r0;
                if (f14 < f6) {
                    easing = easing2;
                    f10 = f14;
                } else if (Float.isNaN(f13)) {
                    f13 = dVar.f19595r0;
                }
            }
        }
        if (easing != null) {
            float f15 = (Float.isNaN(f13) ? 1.0f : f13) - f10;
            double d2 = (f6 - f10) / f15;
            f6 = (((float) easing.get(d2)) * f15) + f10;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d2);
            }
        }
        return f6;
    }

    public final void d(float f6, float f10, float f11, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f19408v;
        float fC = c(f6, fArr2);
        CurveFit[] curveFitArr = this.f19397j;
        int i10 = 0;
        if (curveFitArr == null) {
            d dVar = this.f19394g;
            float f12 = dVar.f19597t0;
            d dVar2 = this.f19393f;
            float f13 = f12 - dVar2.f19597t0;
            float f14 = dVar.f19598u0 - dVar2.f19598u0;
            float f15 = dVar.v0 - dVar2.v0;
            float f16 = (dVar.f19599w0 - dVar2.f19599w0) + f14;
            fArr[0] = ((f15 + f13) * f10) + ((1.0f - f10) * f13);
            fArr[1] = (f16 * f11) + ((1.0f - f11) * f14);
            return;
        }
        double d2 = fC;
        curveFitArr[0].getSlope(d2, this.f19403q);
        this.f19397j[0].getPos(d2, this.f19402p);
        float f17 = fArr2[0];
        while (true) {
            dArr = this.f19403q;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f17);
            i10++;
        }
        CurveFit curveFit = this.f19398k;
        if (curveFit == null) {
            d dVar3 = this.f19393f;
            int[] iArr = this.f19401o;
            double[] dArr2 = this.f19402p;
            dVar3.getClass();
            d.g(f10, f11, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f19402p;
        if (dArr3.length > 0) {
            curveFit.getPos(d2, dArr3);
            this.f19398k.getSlope(d2, this.f19403q);
            d dVar4 = this.f19393f;
            int[] iArr2 = this.f19401o;
            double[] dArr4 = this.f19403q;
            double[] dArr5 = this.f19402p;
            dVar4.getClass();
            d.g(f10, f11, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final float e(float f6, float f10, int i10) {
        d dVar = this.f19394g;
        float f11 = dVar.f19597t0;
        d dVar2 = this.f19393f;
        float f12 = dVar2.f19597t0;
        float f13 = f11 - f12;
        float f14 = dVar.f19598u0;
        float f15 = dVar2.f19598u0;
        float f16 = f14 - f15;
        float f17 = (dVar2.v0 / 2.0f) + f12;
        float f18 = (dVar2.f19599w0 / 2.0f) + f15;
        float fHypot = (float) Math.hypot(f13, f16);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f19 = f6 - f17;
        float f20 = f10 - f18;
        if (((float) Math.hypot(f19, f20)) == 0.0f) {
            return 0.0f;
        }
        float f21 = (f20 * f16) + (f19 * f13);
        if (i10 == 0) {
            return f21 / fHypot;
        }
        if (i10 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f21 * f21));
        }
        if (i10 == 2) {
            return f19 / f13;
        }
        if (i10 == 3) {
            return f20 / f13;
        }
        if (i10 == 4) {
            return f19 / f16;
        }
        if (i10 != 5) {
            return 0.0f;
        }
        return f20 / f16;
    }

    public final float f() {
        char c10;
        float[] fArr = new float[2];
        float f6 = 1.0f / 99;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i10 = 0;
        float fHypot = 0.0f;
        while (i10 < 100) {
            float f10 = i10 * f6;
            double d7 = f10;
            Easing easing = this.f19393f.f19593p0;
            float f11 = Float.NaN;
            float f12 = 0.0f;
            for (d dVar : this.f19407u) {
                Easing easing2 = dVar.f19593p0;
                if (easing2 != null) {
                    float f13 = dVar.f19595r0;
                    if (f13 < f10) {
                        easing = easing2;
                        f12 = f13;
                    } else if (Float.isNaN(f11)) {
                        f11 = dVar.f19595r0;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                float f14 = f11 - f12;
                d7 = (((float) easing.get((f10 - f12) / f14)) * f14) + f12;
            }
            this.f19397j[0].getPos(d7, this.f19402p);
            int i11 = i10;
            this.f19393f.c(d7, this.f19401o, this.f19402p, fArr, 0);
            if (i11 > 0) {
                c10 = 0;
                fHypot += (float) Math.hypot(d3 - ((double) fArr[1]), d2 - ((double) fArr[0]));
            } else {
                c10 = 0;
            }
            d2 = fArr[c10];
            i10 = i11 + 1;
            d3 = fArr[1];
        }
        return fHypot;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x032b  */
    public final boolean g(View view, float f6, long j10, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean pathRotate2;
        View view2;
        float f10;
        int i10;
        d dVar;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        float f15;
        MotionController motionController = this;
        View view3 = view;
        float fC = motionController.c(f6, null);
        int i11 = motionController.E;
        if (i11 != Key.UNSET) {
            float f16 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fC / f16)) * f16;
            float f17 = (fC % f16) / f16;
            if (!Float.isNaN(motionController.F)) {
                f17 = (f17 + motionController.F) % 1.0f;
            }
            Interpolator interpolator = motionController.G;
            fC = ((interpolator != null ? interpolator.getInterpolation(f17) : ((double) f17) > 0.5d ? 1.0f : 0.0f) * f16) + fFloor;
        }
        float f18 = fC;
        HashMap<String, ViewSpline> map = motionController.f19411y;
        if (map != null) {
            Iterator<ViewSpline> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view3, f18);
            }
        }
        HashMap<String, ViewTimeCycle> map2 = motionController.f19410x;
        if (map2 != null) {
            pathRotate = null;
            boolean property = false;
            for (ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    property |= viewTimeCycle.setProperty(view, f18, j10, keyCache);
                }
            }
            pathRotate2 = property;
        } else {
            pathRotate = null;
            pathRotate2 = false;
        }
        CurveFit[] curveFitArr = motionController.f19397j;
        d dVar2 = motionController.f19393f;
        if (curveFitArr != null) {
            double d2 = f18;
            curveFitArr[0].getPos(d2, motionController.f19402p);
            motionController.f19397j[0].getSlope(d2, motionController.f19403q);
            CurveFit curveFit = motionController.f19398k;
            if (curveFit != null) {
                double[] dArr = motionController.f19402p;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                    motionController.f19398k.getSlope(d2, motionController.f19403q);
                }
            }
            if (motionController.H) {
                d2 = d2;
                dVar = dVar2;
            } else {
                int[] iArr = motionController.f19401o;
                double[] dArr2 = motionController.f19402p;
                double[] dArr3 = motionController.f19403q;
                boolean z11 = motionController.f19391d;
                float f19 = dVar2.f19597t0;
                float f20 = dVar2.f19598u0;
                float f21 = dVar2.v0;
                float f22 = dVar2.f19599w0;
                if (iArr.length != 0) {
                    f11 = f19;
                    if (dVar2.J0.length <= iArr[iArr.length - 1]) {
                        int i12 = iArr[iArr.length - 1] + 1;
                        dVar2.J0 = new double[i12];
                        dVar2.K0 = new double[i12];
                    }
                } else {
                    f11 = f19;
                }
                Arrays.fill(dVar2.J0, Double.NaN);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    double[] dArr4 = dVar2.J0;
                    int i14 = iArr[i13];
                    dArr4[i14] = dArr2[i13];
                    dVar2.K0[i14] = dArr3[i13];
                }
                float f23 = Float.NaN;
                float f24 = f22;
                float f25 = f11;
                float f26 = 0.0f;
                int i15 = 0;
                float f27 = 0.0f;
                float f28 = 0.0f;
                float f29 = 0.0f;
                while (true) {
                    double[] dArr5 = dVar2.J0;
                    z10 = z11;
                    f12 = f28;
                    if (i15 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i15])) {
                        f15 = f25;
                        f14 = f24;
                    } else {
                        f14 = f24;
                        float f30 = (float) (Double.isNaN(dVar2.J0[i15]) ? 0.0d : dVar2.J0[i15] + 0.0d);
                        f15 = f25;
                        float f31 = (float) dVar2.K0[i15];
                        if (i15 != 1) {
                            if (i15 == 2) {
                                f24 = f14;
                                f27 = f31;
                                f20 = f30;
                            } else if (i15 == 3) {
                                f24 = f14;
                                f21 = f30;
                                f25 = f15;
                                f28 = f31;
                            } else if (i15 == 4) {
                                f29 = f31;
                                f24 = f30;
                            } else if (i15 == 5) {
                                f24 = f14;
                                f23 = f30;
                            }
                            f28 = f12;
                            f25 = f15;
                        } else {
                            f24 = f14;
                            f26 = f31;
                            f25 = f30;
                            f28 = f12;
                        }
                        i15++;
                        z11 = z10;
                    }
                    f24 = f14;
                    f28 = f12;
                    f25 = f15;
                    i15++;
                    z11 = z10;
                }
                float f32 = f25;
                float f33 = f24;
                MotionController motionController2 = dVar2.G0;
                if (motionController2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    motionController2.getCenter(d2, fArr, fArr2);
                    float f34 = fArr[0];
                    float f35 = fArr[1];
                    float f36 = fArr2[0];
                    float f37 = fArr2[1];
                    double d3 = f32;
                    double d7 = f20;
                    float fSin = (float) (((Math.sin(d7) * d3) + ((double) f34)) - ((double) (f21 / 2.0f)));
                    dVar = dVar2;
                    float fCos = (float) ((((double) f35) - (Math.cos(d7) * d3)) - ((double) (f33 / 2.0f)));
                    double d10 = f26;
                    double d11 = f27;
                    float fCos2 = (float) ((Math.cos(d7) * d3 * d11) + (Math.sin(d7) * d10) + ((double) f36));
                    float fSin2 = (float) ((Math.sin(d7) * d3 * d11) + (((double) f37) - (Math.cos(d7) * d10)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f23)) {
                        view3 = view;
                    } else {
                        view3 = view;
                        view3.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f23)));
                    }
                    f20 = fCos;
                    f13 = fSin;
                } else {
                    dVar = dVar2;
                    if (!Float.isNaN(f23)) {
                        view3.setRotation(f23 + ((float) Math.toDegrees(Math.atan2((f29 / 2.0f) + f27, (f12 / 2.0f) + f26))) + 0.0f);
                    }
                    f13 = f32;
                }
                if (view3 instanceof FloatLayout) {
                    ((FloatLayout) view3).layout(f13, f20, f13 + f21, f20 + f33);
                } else {
                    float f38 = f13 + 0.5f;
                    int i16 = (int) f38;
                    float f39 = f20 + 0.5f;
                    int i17 = (int) f39;
                    int i18 = (int) (f38 + f21);
                    int i19 = (int) (f39 + f33);
                    int i20 = i18 - i16;
                    int i21 = i19 - i17;
                    if (i20 != view.getMeasuredWidth() || i21 != view.getMeasuredHeight() || z10) {
                        view3.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
                    }
                    view3.layout(i16, i17, i18, i19);
                }
                motionController = this;
                motionController.f19391d = false;
            }
            if (motionController.C != Key.UNSET) {
                if (motionController.D == null) {
                    motionController.D = ((View) view.getParent()).findViewById(motionController.C);
                }
                View view4 = motionController.D;
                if (view4 != null) {
                    float bottom = (motionController.D.getBottom() + view4.getTop()) / 2.0f;
                    float right = (motionController.D.getRight() + motionController.D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view3.setPivotX(left);
                        view3.setPivotY(top);
                    }
                }
            }
            HashMap<String, ViewSpline> map3 = motionController.f19411y;
            if (map3 != null) {
                for (ViewSpline viewSpline : map3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr6 = motionController.f19403q;
                        if (dArr6.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view, f18, dArr6[0], dArr6[1]);
                        }
                    }
                    d2 = d2;
                }
            }
            double d12 = d2;
            if (pathRotate != 0) {
                double[] dArr7 = motionController.f19403q;
                i10 = 1;
                pathRotate2 |= pathRotate.setPathRotate(view, keyCache, f18, j10, dArr7[0], dArr7[1]);
            } else {
                i10 = 1;
            }
            int i22 = i10;
            while (true) {
                CurveFit[] curveFitArr2 = motionController.f19397j;
                if (i22 >= curveFitArr2.length) {
                    break;
                }
                CurveFit curveFit2 = curveFitArr2[i22];
                float[] fArr3 = motionController.f19406t;
                curveFit2.getPos(d12, fArr3);
                CustomSupport.setInterpolatedValue(dVar.H0.get(motionController.f19404r[i22 - 1]), view, fArr3);
                i22++;
            }
            view2 = view;
            b bVar = motionController.f19395h;
            if (bVar.f19584q0 == 0) {
                if (f18 <= 0.0f) {
                    view2.setVisibility(bVar.f19585r0);
                } else {
                    b bVar2 = motionController.f19396i;
                    if (f18 >= 1.0f) {
                        view2.setVisibility(bVar2.f19585r0);
                    } else if (bVar2.f19585r0 != bVar.f19585r0) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (motionController.A != null) {
                int i23 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = motionController.A;
                    if (i23 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i23].conditionallyFire(f18, view2);
                    i23++;
                }
            }
            f10 = f18;
        } else {
            view2 = view3;
            f10 = f18;
            i10 = 1;
            float f40 = dVar2.f19597t0;
            d dVar3 = motionController.f19394g;
            float fA = androidx.datastore.preferences.protobuf.e.a(dVar3.f19597t0, f40, f10, f40);
            float f41 = dVar2.f19598u0;
            float fA2 = androidx.datastore.preferences.protobuf.e.a(dVar3.f19598u0, f41, f10, f41);
            float f42 = dVar2.v0;
            float f43 = dVar3.v0;
            float fA3 = androidx.datastore.preferences.protobuf.e.a(f43, f42, f10, f42);
            float f44 = dVar2.f19599w0;
            float f45 = dVar3.f19599w0;
            float f46 = fA + 0.5f;
            int i24 = (int) f46;
            float f47 = fA2 + 0.5f;
            int i25 = (int) f47;
            int i26 = (int) (f46 + fA3);
            int iA = (int) (f47 + androidx.datastore.preferences.protobuf.e.a(f45, f44, f10, f44));
            int i27 = i26 - i24;
            int i28 = iA - i25;
            if (f43 != f42 || f45 != f44 || motionController.f19391d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
                motionController.f19391d = false;
            }
            view2.layout(i24, i25, i26, iA);
        }
        HashMap<String, ViewOscillator> map4 = motionController.f19412z;
        if (map4 != null) {
            for (ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr8 = motionController.f19403q;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, f10, dArr8[0], dArr8[i10]);
                } else {
                    viewOscillator.setProperty(view2, f10);
                }
            }
        }
        return pathRotate2;
    }

    public int getAnimateRelativeTo() {
        return this.f19393f.E0;
    }

    public void getCenter(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f19397j[0].getPos(d2, dArr);
        this.f19397j[0].getSlope(d2, dArr2);
        float f6 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f19401o;
        d dVar = this.f19393f;
        float f10 = dVar.f19597t0;
        float f11 = dVar.f19598u0;
        float f12 = dVar.v0;
        float f13 = dVar.f19599w0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f17 = (float) dArr[i10];
            float f18 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f10 = f17;
                f6 = f18;
            } else if (i11 == 2) {
                f11 = f17;
                f16 = f18;
            } else if (i11 == 3) {
                f12 = f17;
                f14 = f18;
            } else if (i11 == 4) {
                f13 = f17;
                f15 = f18;
            }
        }
        float f19 = 2.0f;
        float f20 = (f14 / 2.0f) + f6;
        float fSin = (f15 / 2.0f) + f16;
        MotionController motionController = dVar.G0;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d2, fArr3, fArr4);
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            double d3 = f10;
            double d7 = f11;
            float fSin2 = (float) (((Math.sin(d7) * d3) + ((double) f21)) - ((double) (f12 / 2.0f)));
            float fCos = (float) ((((double) f22) - (Math.cos(d7) * d3)) - ((double) (f13 / 2.0f)));
            double d10 = f23;
            double d11 = f6;
            double d12 = f16;
            float fCos2 = (float) ((Math.cos(d7) * d12) + (Math.sin(d7) * d11) + d10);
            fSin = (float) ((Math.sin(d7) * d12) + (((double) f24) - (Math.cos(d7) * d11)));
            f10 = fSin2;
            f11 = fCos;
            f20 = fCos2;
            f19 = 2.0f;
        }
        fArr[0] = (f12 / f19) + f10 + 0.0f;
        fArr[1] = (f13 / f19) + f11 + 0.0f;
        fArr2[0] = f20;
        fArr2[1] = fSin;
    }

    public float getCenterX() {
        return 0.0f;
    }

    public float getCenterY() {
        return 0.0f;
    }

    public int getDrawPath() {
        int iMax = this.f19393f.f19594q0;
        Iterator<d> it = this.f19407u.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f19594q0);
        }
        return Math.max(iMax, this.f19394g.f19594q0);
    }

    public float getFinalHeight() {
        return this.f19394g.f19599w0;
    }

    public float getFinalWidth() {
        return this.f19394g.v0;
    }

    public float getFinalX() {
        return this.f19394g.f19597t0;
    }

    public float getFinalY() {
        return this.f19394g.f19598u0;
    }

    public int getKeyFrameInfo(int i10, int[] iArr) {
        float[] fArr = new float[2];
        int i11 = 0;
        int i12 = 0;
        for (Key key : this.f19409w) {
            int i13 = key.mType;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i13;
                int i14 = key.f19300a;
                iArr[i12 + 2] = i14;
                double d2 = i14 / 100.0f;
                this.f19397j[0].getPos(d2, this.f19402p);
                this.f19393f.c(d2, this.f19401o, this.f19402p, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i15 = i12 + 4;
                iArr[i15] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    iArr[i12 + 5] = keyPosition.f19348o;
                    iArr[i12 + 6] = Float.floatToIntBits(keyPosition.f19345k);
                    i15 = i12 + 7;
                    iArr[i15] = Float.floatToIntBits(keyPosition.f19346l);
                }
                int i16 = i15 + 1;
                iArr[i12] = i16 - i12;
                i11++;
                i12 = i16;
            }
        }
        return i11;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        int i10 = 0;
        int i11 = 0;
        for (Key key : this.f19409w) {
            int i12 = key.f19300a;
            iArr[i10] = (key.mType * 1000) + i12;
            double d2 = i12 / 100.0f;
            this.f19397j[0].getPos(d2, this.f19402p);
            this.f19393f.c(d2, this.f19401o, this.f19402p, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }

    public float getStartHeight() {
        return this.f19393f.f19599w0;
    }

    public float getStartWidth() {
        return this.f19393f.v0;
    }

    public float getStartX() {
        return this.f19393f.f19597t0;
    }

    public float getStartY() {
        return this.f19393f.f19598u0;
    }

    public int getTransformPivotTarget() {
        return this.C;
    }

    public View getView() {
        return this.f19389b;
    }

    public final void h(d dVar) {
        dVar.f((int) this.f19389b.getX(), (int) this.f19389b.getY(), this.f19389b.getWidth(), this.f19389b.getHeight());
    }

    public void remeasure() {
        this.f19391d = true;
    }

    public void setDrawPath(int i10) {
        this.f19393f.f19594q0 = i10;
    }

    public void setPathMotionArc(int i10) {
        this.B = i10;
    }

    public void setStartState(ViewState viewState, View view, int i10, int i11, int i12) {
        d dVar = this.f19393f;
        dVar.f19595r0 = 0.0f;
        dVar.f19596s0 = 0.0f;
        Rect rect = new Rect();
        if (i10 == 1) {
            int i13 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i11 - ((viewState.height() + i13) / 2);
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.top;
        } else if (i10 == 2) {
            int i14 = viewState.left + viewState.right;
            rect.left = i12 - ((viewState.width() + (viewState.top + viewState.bottom)) / 2);
            rect.top = (i14 - viewState.height()) / 2;
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.top;
        }
        dVar.f(rect.left, rect.top, rect.width(), rect.height());
        float f6 = viewState.rotation;
        b bVar = this.f19395h;
        bVar.getClass();
        rect.width();
        rect.height();
        bVar.b(view);
        bVar.E0 = Float.NaN;
        bVar.F0 = Float.NaN;
        if (i10 == 1) {
            bVar.v0 = f6 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            bVar.v0 = f6 + 90.0f;
        }
    }

    public void setTransformPivotTarget(int i10) {
        this.C = i10;
        this.D = null;
    }

    public void setView(View view) {
        this.f19389b = view;
        this.f19390c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:196:0x05ac  */
    public void setup(int i10, int i11, float f6, long j10) {
        b bVar;
        ArrayList<Key> arrayList;
        d dVar;
        b bVar2;
        HashSet<String> hashSet;
        MotionController motionController;
        ArrayList<d> arrayList2;
        HashSet<String> hashSet2;
        HashSet<String> hashSet3;
        ArrayList arrayList3;
        String[] strArr;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleMakeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        Iterator<String> it;
        ViewSpline viewSplineMakeSpline;
        ConstraintAttribute constraintAttribute3;
        b bVar3;
        ArrayList<Key> arrayList4;
        d dVar2;
        MotionController motionController2;
        ArrayList<d> arrayList5;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        HashSet<String> hashSet6;
        HashSet<String> hashSet7;
        HashMap<String, Integer> map;
        KeyPosition keyPosition;
        float f10;
        int i12;
        float f11;
        int i13;
        int i14;
        float fMin;
        float fA;
        MotionController motionController3 = this;
        new HashSet();
        HashSet<String> hashSet8 = new HashSet<>();
        HashSet<String> hashSet9 = new HashSet<>();
        HashSet<String> hashSet10 = new HashSet<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int i15 = motionController3.B;
        int i16 = Key.UNSET;
        d dVar3 = motionController3.f19393f;
        if (i15 != i16) {
            dVar3.f19601y0 = i15;
        }
        b bVar4 = motionController3.f19395h;
        float f12 = bVar4.f19587t0;
        b bVar5 = motionController3.f19396i;
        if (b.c(f12, bVar5.f19587t0)) {
            hashSet9.add("alpha");
        }
        if (b.c(bVar4.f19588u0, bVar5.f19588u0)) {
            hashSet9.add("elevation");
        }
        int i17 = bVar4.f19585r0;
        int i18 = bVar5.f19585r0;
        if (i17 != i18 && bVar4.f19584q0 == 0 && (i17 == 0 || i18 == 0)) {
            hashSet9.add("alpha");
        }
        if (b.c(bVar4.v0, bVar5.v0)) {
            hashSet9.add(Key.ROTATION);
        }
        if (!Float.isNaN(bVar4.J0) || !Float.isNaN(bVar5.J0)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(bVar4.K0) || !Float.isNaN(bVar5.K0)) {
            hashSet9.add("progress");
        }
        if (b.c(bVar4.f19589w0, bVar5.f19589w0)) {
            hashSet9.add("rotationX");
        }
        if (b.c(bVar4.f19583p0, bVar5.f19583p0)) {
            hashSet9.add("rotationY");
        }
        if (b.c(bVar4.E0, bVar5.E0)) {
            hashSet9.add(Key.PIVOT_X);
        }
        if (b.c(bVar4.F0, bVar5.F0)) {
            hashSet9.add(Key.PIVOT_Y);
        }
        if (b.c(bVar4.f19590x0, bVar5.f19590x0)) {
            hashSet9.add("scaleX");
        }
        if (b.c(bVar4.f19591y0, bVar5.f19591y0)) {
            hashSet9.add("scaleY");
        }
        if (b.c(bVar4.G0, bVar5.G0)) {
            hashSet9.add("translationX");
        }
        if (b.c(bVar4.H0, bVar5.H0)) {
            hashSet9.add("translationY");
        }
        if (b.c(bVar4.I0, bVar5.I0)) {
            hashSet9.add("translationZ");
        }
        ArrayList<Key> arrayList6 = motionController3.f19409w;
        d dVar4 = motionController3.f19394g;
        ArrayList<d> arrayList7 = motionController3.f19407u;
        float f13 = Float.NaN;
        int i19 = 0;
        MotionController motionController4 = null;
        if (arrayList6 != null) {
            ArrayList arrayList8 = null;
            for (Key key : arrayList6) {
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition2 = (KeyPosition) key;
                    d dVar5 = new d();
                    dVar5.f19594q0 = i19;
                    dVar5.f19600x0 = f13;
                    int i20 = Key.UNSET;
                    dVar5.f19601y0 = i20;
                    dVar5.E0 = i20;
                    dVar5.F0 = f13;
                    dVar5.G0 = motionController4;
                    dVar5.H0 = new LinkedHashMap<>();
                    dVar5.I0 = 0;
                    dVar5.J0 = new double[18];
                    dVar5.K0 = new double[18];
                    if (dVar3.E0 != Key.UNSET) {
                        float f14 = keyPosition2.f19300a / 100.0f;
                        dVar5.f19595r0 = f14;
                        dVar5.f19594q0 = keyPosition2.f19342h;
                        dVar5.I0 = keyPosition2.f19348o;
                        float f15 = Float.isNaN(keyPosition2.f19343i) ? f14 : keyPosition2.f19343i;
                        float f16 = Float.isNaN(keyPosition2.f19344j) ? f14 : keyPosition2.f19344j;
                        float f17 = dVar4.v0;
                        bVar3 = bVar4;
                        float f18 = dVar3.v0;
                        arrayList4 = arrayList6;
                        float f19 = dVar4.f19599w0;
                        hashSet7 = hashSet9;
                        float f20 = dVar3.f19599w0;
                        map = map2;
                        dVar5.f19596s0 = dVar5.f19595r0;
                        dVar5.v0 = (int) (((f17 - f18) * f15) + f18);
                        dVar5.f19599w0 = (int) (((f19 - f20) * f16) + f20);
                        if (keyPosition2.f19348o != 2) {
                            float f21 = Float.isNaN(keyPosition2.f19345k) ? f14 : keyPosition2.f19345k;
                            float f22 = dVar4.f19597t0;
                            float f23 = dVar3.f19597t0;
                            dVar5.f19597t0 = androidx.datastore.preferences.protobuf.e.a(f22, f23, f21, f23);
                            if (!Float.isNaN(keyPosition2.f19346l)) {
                                f14 = keyPosition2.f19346l;
                            }
                            float f24 = dVar4.f19598u0;
                            float f25 = dVar3.f19598u0;
                            dVar5.f19598u0 = androidx.datastore.preferences.protobuf.e.a(f24, f25, f14, f25);
                        } else {
                            if (Float.isNaN(keyPosition2.f19345k)) {
                                float f26 = dVar4.f19597t0;
                                float f27 = dVar3.f19597t0;
                                fMin = androidx.datastore.preferences.protobuf.e.a(f26, f27, f14, f27);
                            } else {
                                fMin = keyPosition2.f19345k * Math.min(f16, f15);
                            }
                            dVar5.f19597t0 = fMin;
                            if (Float.isNaN(keyPosition2.f19346l)) {
                                float f28 = dVar4.f19598u0;
                                float f29 = dVar3.f19598u0;
                                fA = androidx.datastore.preferences.protobuf.e.a(f28, f29, f14, f29);
                            } else {
                                fA = keyPosition2.f19346l;
                            }
                            dVar5.f19598u0 = fA;
                        }
                        dVar5.E0 = dVar3.E0;
                        dVar5.f19593p0 = Easing.getInterpolator(keyPosition2.f19340f);
                        dVar5.f19601y0 = keyPosition2.f19341g;
                    } else {
                        hashSet7 = hashSet9;
                        map = map2;
                        bVar3 = bVar4;
                        arrayList4 = arrayList6;
                        bVar5 = bVar5;
                        int i21 = keyPosition2.f19348o;
                        if (i21 != 1) {
                            if (i21 == 2) {
                                hashSet8 = hashSet8;
                                hashSet10 = hashSet10;
                                d dVar6 = dVar3;
                                ArrayList<d> arrayList9 = arrayList7;
                                float f30 = keyPosition2.f19300a / 100.0f;
                                dVar5.f19595r0 = f30;
                                dVar5.f19594q0 = keyPosition2.f19342h;
                                float f31 = Float.isNaN(keyPosition2.f19343i) ? f30 : keyPosition2.f19343i;
                                float f32 = Float.isNaN(keyPosition2.f19344j) ? f30 : keyPosition2.f19344j;
                                float f33 = dVar4.v0;
                                float f34 = dVar6.v0;
                                float f35 = f33 - f34;
                                float f36 = dVar4.f19599w0;
                                float f37 = dVar6.f19599w0;
                                float f38 = f36 - f37;
                                dVar5.f19596s0 = dVar5.f19595r0;
                                float f39 = dVar6.f19597t0;
                                float f40 = dVar6.f19598u0;
                                float f41 = (f33 / 2.0f) + dVar4.f19597t0;
                                float f42 = (f36 / 2.0f) + dVar4.f19598u0;
                                float f43 = f35 * f31;
                                dVar5.f19597t0 = (int) ((((f41 - ((f34 / 2.0f) + f39)) * f30) + f39) - (f43 / 2.0f));
                                float f44 = f38 * f32;
                                dVar5.f19598u0 = (int) ((((f42 - ((f37 / 2.0f) + f40)) * f30) + f40) - (f44 / 2.0f));
                                dVar5.v0 = (int) (f34 + f43);
                                dVar5.f19599w0 = (int) (f37 + f44);
                                dVar5.I0 = 2;
                                if (!Float.isNaN(keyPosition2.f19345k)) {
                                    dVar5.f19597t0 = (int) (keyPosition2.f19345k * (i10 - ((int) dVar5.v0)));
                                }
                                if (!Float.isNaN(keyPosition2.f19346l)) {
                                    dVar5.f19598u0 = (int) (keyPosition2.f19346l * (i11 - ((int) dVar5.f19599w0)));
                                }
                                dVar5.E0 = dVar5.E0;
                                dVar5.f19593p0 = Easing.getInterpolator(keyPosition2.f19340f);
                                dVar5.f19601y0 = keyPosition2.f19341g;
                                keyPosition = keyPosition2;
                                arrayList5 = arrayList9;
                                dVar2 = dVar6;
                            } else if (i21 != 3) {
                                float f45 = keyPosition2.f19300a / 100.0f;
                                dVar5.f19595r0 = f45;
                                dVar5.f19594q0 = keyPosition2.f19342h;
                                float f46 = Float.isNaN(keyPosition2.f19343i) ? f45 : keyPosition2.f19343i;
                                float f47 = Float.isNaN(keyPosition2.f19344j) ? f45 : keyPosition2.f19344j;
                                float f48 = dVar4.v0;
                                float f49 = dVar3.v0;
                                float f50 = f48 - f49;
                                float f51 = dVar4.f19599w0;
                                float f52 = dVar3.f19599w0;
                                float f53 = f51 - f52;
                                dVar5.f19596s0 = dVar5.f19595r0;
                                float f54 = dVar3.f19597t0;
                                float f55 = dVar3.f19598u0;
                                float f56 = ((f48 / 2.0f) + dVar4.f19597t0) - ((f49 / 2.0f) + f54);
                                float f57 = ((f51 / 2.0f) + dVar4.f19598u0) - ((f52 / 2.0f) + f55);
                                float f58 = (f56 * f45) + f54;
                                float f59 = f50 * f46;
                                float f60 = f59 / 2.0f;
                                dVar5.f19597t0 = (int) (f58 - f60);
                                float f61 = (f57 * f45) + f55;
                                float f62 = f53 * f47;
                                float f63 = f62 / 2.0f;
                                dVar5.f19598u0 = (int) (f61 - f63);
                                dVar5.v0 = (int) (f49 + f59);
                                dVar5.f19599w0 = (int) (f52 + f62);
                                float f64 = Float.isNaN(keyPosition2.f19345k) ? f45 : keyPosition2.f19345k;
                                float f65 = Float.isNaN(keyPosition2.f19347n) ? 0.0f : keyPosition2.f19347n;
                                if (!Float.isNaN(keyPosition2.f19346l)) {
                                    f45 = keyPosition2.f19346l;
                                }
                                if (Float.isNaN(keyPosition2.m)) {
                                    i13 = 0;
                                    f11 = 0.0f;
                                } else {
                                    f11 = keyPosition2.m;
                                    i13 = 0;
                                }
                                dVar5.I0 = i13;
                                dVar5.f19597t0 = (int) (((f11 * f57) + ((f64 * f56) + dVar3.f19597t0)) - f60);
                                dVar5.f19598u0 = (int) (((f57 * f45) + ((f56 * f65) + dVar3.f19598u0)) - f63);
                                dVar5.f19593p0 = Easing.getInterpolator(keyPosition2.f19340f);
                                dVar5.f19601y0 = keyPosition2.f19341g;
                            } else {
                                float f66 = keyPosition2.f19300a / 100.0f;
                                dVar5.f19595r0 = f66;
                                dVar5.f19594q0 = keyPosition2.f19342h;
                                float f67 = Float.isNaN(keyPosition2.f19343i) ? f66 : keyPosition2.f19343i;
                                float f68 = Float.isNaN(keyPosition2.f19344j) ? f66 : keyPosition2.f19344j;
                                float f69 = dVar4.v0;
                                float f70 = dVar3.v0;
                                float f71 = f69 - f70;
                                float f72 = dVar4.f19599w0;
                                float f73 = dVar3.f19599w0;
                                float f74 = f72 - f73;
                                dVar5.f19596s0 = dVar5.f19595r0;
                                float f75 = dVar3.f19597t0;
                                float f76 = (f70 / 2.0f) + f75;
                                float f77 = dVar3.f19598u0;
                                float f78 = (f73 / 2.0f) + f77;
                                d dVar7 = dVar3;
                                float f79 = (f69 / 2.0f) + dVar4.f19597t0;
                                float f80 = (f72 / 2.0f) + dVar4.f19598u0;
                                if (f76 > f79) {
                                    f76 = f79;
                                    f79 = f76;
                                }
                                if (f78 <= f80) {
                                    f78 = f80;
                                    f80 = f78;
                                }
                                float f81 = f79 - f76;
                                float f82 = f78 - f80;
                                float f83 = f71 * f67;
                                float f84 = f83 / 2.0f;
                                dVar5.f19597t0 = (int) (((f81 * f66) + f75) - f84);
                                float f85 = f74 * f68;
                                float f86 = f85 / 2.0f;
                                dVar5.f19598u0 = (int) (((f82 * f66) + f77) - f86);
                                dVar5.v0 = (int) (f70 + f83);
                                dVar5.f19599w0 = (int) (f73 + f85);
                                float f87 = Float.isNaN(keyPosition2.f19345k) ? f66 : keyPosition2.f19345k;
                                float f88 = Float.isNaN(keyPosition2.f19347n) ? 0.0f : keyPosition2.f19347n;
                                if (!Float.isNaN(keyPosition2.f19346l)) {
                                    f66 = keyPosition2.f19346l;
                                }
                                if (Float.isNaN(keyPosition2.m)) {
                                    i12 = 0;
                                    f10 = 0.0f;
                                } else {
                                    f10 = keyPosition2.m;
                                    i12 = 0;
                                }
                                dVar5.I0 = i12;
                                dVar5.f19597t0 = (int) (((f10 * f82) + ((f87 * f81) + dVar7.f19597t0)) - f84);
                                dVar5.f19598u0 = (int) (((f82 * f66) + ((f81 * f88) + dVar7.f19598u0)) - f86);
                                dVar5.f19593p0 = Easing.getInterpolator(keyPosition2.f19340f);
                                dVar5.f19601y0 = keyPosition2.f19341g;
                                dVar2 = dVar7;
                                keyPosition = keyPosition2;
                            }
                            arrayList5.add((-Collections.binarySearch(arrayList5, dVar5)) - 1, dVar5);
                            i14 = keyPosition.f19582e;
                            if (i14 != Key.UNSET) {
                                motionController2 = this;
                                motionController2.f19392e = i14;
                            } else {
                                motionController2 = this;
                            }
                            hashSet6 = hashSet7;
                            map2 = map;
                            hashSet5 = hashSet8;
                            hashSet4 = hashSet10;
                        } else {
                            d dVar8 = dVar3;
                            float f89 = keyPosition2.f19300a / 100.0f;
                            dVar5.f19595r0 = f89;
                            dVar5.f19594q0 = keyPosition2.f19342h;
                            float f90 = Float.isNaN(keyPosition2.f19343i) ? f89 : keyPosition2.f19343i;
                            float f91 = Float.isNaN(keyPosition2.f19344j) ? f89 : keyPosition2.f19344j;
                            float f92 = dVar4.v0 - dVar8.v0;
                            float f93 = dVar4.f19599w0 - dVar8.f19599w0;
                            dVar5.f19596s0 = dVar5.f19595r0;
                            if (!Float.isNaN(keyPosition2.f19345k)) {
                                f89 = keyPosition2.f19345k;
                            }
                            float f94 = dVar8.f19597t0;
                            float f95 = dVar8.v0;
                            float f96 = dVar8.f19598u0;
                            float f97 = dVar8.f19599w0;
                            float f98 = ((dVar4.v0 / 2.0f) + dVar4.f19597t0) - ((f95 / 2.0f) + f94);
                            float f99 = ((dVar4.f19599w0 / 2.0f) + dVar4.f19598u0) - ((f97 / 2.0f) + f96);
                            float f100 = f98 * f89;
                            float f101 = f92 * f90;
                            float f102 = f101 / 2.0f;
                            dVar5.f19597t0 = (int) ((f94 + f100) - f102);
                            float f103 = f89 * f99;
                            float f104 = f93 * f91;
                            float f105 = f104 / 2.0f;
                            dVar5.f19598u0 = (int) ((f96 + f103) - f105);
                            dVar5.v0 = (int) (f95 + f101);
                            dVar5.f19599w0 = (int) (f97 + f104);
                            keyPosition = keyPosition2;
                            float f106 = Float.isNaN(keyPosition.f19346l) ? 0.0f : keyPosition.f19346l;
                            dVar5.I0 = 1;
                            dVar2 = dVar8;
                            float f107 = (int) ((dVar2.f19597t0 + f100) - f102);
                            float f108 = (int) ((dVar2.f19598u0 + f103) - f105);
                            dVar5.f19597t0 = f107 + ((-f99) * f106);
                            dVar5.f19598u0 = f108 + (f98 * f106);
                            dVar5.E0 = dVar5.E0;
                            dVar5.f19593p0 = Easing.getInterpolator(keyPosition.f19340f);
                            dVar5.f19601y0 = keyPosition.f19341g;
                        }
                        arrayList5 = arrayList7;
                        arrayList5.add((-Collections.binarySearch(arrayList5, dVar5)) - 1, dVar5);
                        i14 = keyPosition.f19582e;
                        if (i14 != Key.UNSET) {
                            motionController2 = this;
                            motionController2.f19392e = i14;
                        } else {
                            motionController2 = this;
                        }
                        hashSet6 = hashSet7;
                        map2 = map;
                        hashSet5 = hashSet8;
                        hashSet4 = hashSet10;
                    }
                    dVar2 = dVar3;
                    arrayList5 = arrayList7;
                    keyPosition = keyPosition2;
                    arrayList5.add((-Collections.binarySearch(arrayList5, dVar5)) - 1, dVar5);
                    i14 = keyPosition.f19582e;
                    if (i14 != Key.UNSET) {
                        motionController2 = this;
                        motionController2.f19392e = i14;
                    } else {
                        motionController2 = this;
                    }
                    hashSet6 = hashSet7;
                    map2 = map;
                    hashSet5 = hashSet8;
                    hashSet4 = hashSet10;
                } else {
                    HashSet<String> hashSet11 = hashSet8;
                    HashSet<String> hashSet12 = hashSet9;
                    HashSet<String> hashSet13 = hashSet10;
                    HashMap<String, Integer> map3 = map2;
                    bVar3 = bVar4;
                    arrayList4 = arrayList6;
                    dVar2 = dVar3;
                    bVar5 = bVar5;
                    motionController2 = motionController3;
                    arrayList5 = arrayList7;
                    if (key instanceof KeyCycle) {
                        hashSet4 = hashSet13;
                        key.getAttributeNames(hashSet4);
                        hashSet6 = hashSet12;
                        map2 = map3;
                        hashSet5 = hashSet11;
                    } else {
                        hashSet4 = hashSet13;
                        if (key instanceof KeyTimeCycle) {
                            hashSet5 = hashSet11;
                            key.getAttributeNames(hashSet5);
                        } else {
                            hashSet5 = hashSet11;
                            if (key instanceof KeyTrigger) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                ArrayList arrayList10 = arrayList8;
                                arrayList10.add((KeyTrigger) key);
                                arrayList8 = arrayList10;
                            } else {
                                map2 = map3;
                                key.setInterpolation(map2);
                                hashSet6 = hashSet12;
                                key.getAttributeNames(hashSet6);
                            }
                        }
                        hashSet6 = hashSet12;
                        map2 = map3;
                    }
                }
                arrayList7 = arrayList5;
                motionController3 = motionController2;
                hashSet9 = hashSet6;
                dVar3 = dVar2;
                bVar5 = bVar5;
                bVar4 = bVar3;
                arrayList6 = arrayList4;
                motionController4 = null;
                f13 = Float.NaN;
                i19 = 0;
                HashSet<String> hashSet14 = hashSet5;
                hashSet10 = hashSet4;
                hashSet8 = hashSet14;
            }
            bVar = bVar4;
            arrayList = arrayList6;
            dVar = dVar3;
            bVar2 = bVar5;
            hashSet = hashSet9;
            motionController = motionController3;
            arrayList2 = arrayList7;
            HashSet<String> hashSet15 = hashSet10;
            hashSet2 = hashSet8;
            hashSet3 = hashSet15;
            arrayList3 = arrayList8;
        } else {
            bVar = bVar4;
            arrayList = arrayList6;
            dVar = dVar3;
            bVar2 = bVar5;
            hashSet = hashSet9;
            motionController = motionController3;
            arrayList2 = arrayList7;
            hashSet2 = hashSet8;
            hashSet3 = hashSet10;
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            motionController.A = (KeyTrigger[]) arrayList3.toArray(new KeyTrigger[0]);
        }
        if (!hashSet.isEmpty()) {
            motionController.f19411y = new HashMap<>();
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next.split(",")[1];
                    for (Key key2 : arrayList) {
                        Iterator<String> it3 = it2;
                        HashMap<String, ConstraintAttribute> map4 = key2.f19303d;
                        if (map4 != null && (constraintAttribute3 = map4.get(str)) != null) {
                            sparseArray.append(key2.f19300a, constraintAttribute3);
                        }
                        it2 = it3;
                    }
                    it = it2;
                    viewSplineMakeSpline = ViewSpline.makeCustomSpline(next, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    it = it2;
                    viewSplineMakeSpline = ViewSpline.makeSpline(next);
                }
                if (viewSplineMakeSpline != null) {
                    viewSplineMakeSpline.setType(next);
                    motionController.f19411y.put(next, viewSplineMakeSpline);
                }
                it2 = it;
            }
            if (arrayList != null) {
                for (Key key3 : arrayList) {
                    if (key3 instanceof KeyAttributes) {
                        key3.addValues(motionController.f19411y);
                    }
                }
            }
            bVar.a(motionController.f19411y, 0);
            bVar2.a(motionController.f19411y, 100);
            for (String str2 : motionController.f19411y.keySet()) {
                int iIntValue = (!map2.containsKey(str2) || (num = map2.get(str2)) == null) ? 0 : num.intValue();
                ViewSpline viewSpline = motionController.f19411y.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(iIntValue);
                }
            }
        }
        if (!hashSet2.isEmpty()) {
            if (motionController.f19410x == null) {
                motionController.f19410x = new HashMap<>();
            }
            for (String str3 : hashSet2) {
                if (!motionController.f19410x.containsKey(str3)) {
                    if (str3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str4 = str3.split(",")[1];
                        for (Key key4 : arrayList) {
                            HashMap<String, ConstraintAttribute> map5 = key4.f19303d;
                            if (map5 != null && (constraintAttribute2 = map5.get(str4)) != null) {
                                sparseArray2.append(key4.f19300a, constraintAttribute2);
                            }
                        }
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeCustomSpline(str3, sparseArray2);
                    } else {
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeSpline(str3, j10);
                    }
                    if (viewTimeCycleMakeSpline != null) {
                        viewTimeCycleMakeSpline.setType(str3);
                        motionController.f19410x.put(str3, viewTimeCycleMakeSpline);
                    }
                }
            }
            if (arrayList != null) {
                for (Key key5 : arrayList) {
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).addTimeValues(motionController.f19410x);
                    }
                }
            }
            for (String str5 : motionController.f19410x.keySet()) {
                motionController.f19410x.get(str5).setup(map2.containsKey(str5) ? map2.get(str5).intValue() : 0);
            }
        }
        int size = arrayList2.size();
        int i22 = size + 2;
        d[] dVarArr = new d[i22];
        dVarArr[0] = dVar;
        dVarArr[size + 1] = dVar4;
        if (arrayList2.size() > 0 && motionController.f19392e == -1) {
            motionController.f19392e = 0;
        }
        Iterator<d> it4 = arrayList2.iterator();
        int i23 = 1;
        while (it4.hasNext()) {
            dVarArr[i23] = it4.next();
            i23++;
        }
        HashSet hashSet16 = new HashSet();
        for (String str6 : dVar4.H0.keySet()) {
            if (dVar.H0.containsKey(str6)) {
                if (!hashSet.contains("CUSTOM," + str6)) {
                    hashSet16.add(str6);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet16.toArray(new String[0]);
        motionController.f19404r = strArr2;
        motionController.f19405s = new int[strArr2.length];
        int i24 = 0;
        while (true) {
            strArr = motionController.f19404r;
            if (i24 >= strArr.length) {
                break;
            }
            String str7 = strArr[i24];
            motionController.f19405s[i24] = 0;
            for (int i25 = 0; i25 < i22; i25++) {
                if (dVarArr[i25].H0.containsKey(str7) && (constraintAttribute = dVarArr[i25].H0.get(str7)) != null) {
                    int[] iArr = motionController.f19405s;
                    iArr[i24] = constraintAttribute.numberOfInterpolatedValues() + iArr[i24];
                    break;
                }
            }
            i24++;
        }
        boolean z10 = dVarArr[0].f19601y0 != Key.UNSET;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i26 = 1; i26 < i22; i26++) {
            d dVar9 = dVarArr[i26];
            d dVar10 = dVarArr[i26 - 1];
            boolean zB = d.b(dVar9.f19597t0, dVar10.f19597t0);
            boolean zB2 = d.b(dVar9.f19598u0, dVar10.f19598u0);
            zArr[0] = d.b(dVar9.f19596s0, dVar10.f19596s0) | zArr[0];
            boolean z11 = zB | zB2 | z10;
            zArr[1] = zArr[1] | z11;
            zArr[2] = z11 | zArr[2];
            zArr[3] = zArr[3] | d.b(dVar9.v0, dVar10.v0);
            zArr[4] = d.b(dVar9.f19599w0, dVar10.f19599w0) | zArr[4];
        }
        int i27 = 0;
        for (int i28 = 1; i28 < length; i28++) {
            if (zArr[i28]) {
                i27++;
            }
        }
        motionController.f19401o = new int[i27];
        int iMax = Math.max(2, i27);
        motionController.f19402p = new double[iMax];
        motionController.f19403q = new double[iMax];
        int i29 = 0;
        for (int i30 = 1; i30 < length; i30++) {
            if (zArr[i30]) {
                motionController.f19401o[i29] = i30;
                i29++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i22, motionController.f19401o.length);
        double[] dArr2 = new double[i22];
        for (int i31 = 0; i31 < i22; i31++) {
            d dVar11 = dVarArr[i31];
            double[] dArr3 = dArr[i31];
            int[] iArr2 = motionController.f19401o;
            float[] fArr = {dVar11.f19596s0, dVar11.f19597t0, dVar11.f19598u0, dVar11.v0, dVar11.f19599w0, dVar11.f19600x0};
            int i32 = 0;
            for (int i33 : iArr2) {
                if (i33 < 6) {
                    dArr3[i32] = fArr[i33];
                    i32++;
                }
            }
            dArr2[i31] = dVarArr[i31].f19595r0;
        }
        int i34 = 0;
        while (true) {
            int[] iArr3 = motionController.f19401o;
            if (i34 >= iArr3.length) {
                break;
            }
            if (iArr3[i34] < 6) {
                String strF = ad.d.f(new StringBuilder(), d.L0[motionController.f19401o[i34]], " [");
                for (int i35 = 0; i35 < i22; i35++) {
                    StringBuilder sbD = androidx.camera.core.impl.utils.c.d(strF);
                    sbD.append(dArr[i35][i34]);
                    strF = sbD.toString();
                }
            }
            i34++;
        }
        motionController.f19397j = new CurveFit[motionController.f19404r.length + 1];
        int i36 = 0;
        while (true) {
            String[] strArr3 = motionController.f19404r;
            if (i36 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i36];
            int i37 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            for (int i38 = 0; i38 < i22; i38++) {
                if (dVarArr[i38].H0.containsKey(str8)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i22];
                        ConstraintAttribute constraintAttribute4 = dVarArr[i38].H0.get(str8);
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i22, constraintAttribute4 == null ? 0 : constraintAttribute4.numberOfInterpolatedValues());
                    }
                    d dVar12 = dVarArr[i38];
                    dArr4[i37] = dVar12.f19595r0;
                    dVar12.d(str8, dArr5[i37]);
                    i37++;
                }
            }
            i36++;
            motionController.f19397j[i36] = CurveFit.get(motionController.f19392e, Arrays.copyOf(dArr4, i37), (double[][]) Arrays.copyOf(dArr5, i37));
        }
        motionController.f19397j[0] = CurveFit.get(motionController.f19392e, dArr2, dArr);
        if (dVarArr[0].f19601y0 != Key.UNSET) {
            int[] iArr4 = new int[i22];
            double[] dArr6 = new double[i22];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i22, 2);
            for (int i39 = 0; i39 < i22; i39++) {
                d dVar13 = dVarArr[i39];
                iArr4[i39] = dVar13.f19601y0;
                dArr6[i39] = dVar13.f19595r0;
                double[] dArr8 = dArr7[i39];
                dArr8[0] = dVar13.f19597t0;
                dArr8[1] = dVar13.f19598u0;
            }
            motionController.f19398k = CurveFit.getArc(iArr4, dArr6, dArr7);
        }
        motionController.f19412z = new HashMap<>();
        if (arrayList != null) {
            float f109 = Float.NaN;
            for (String str9 : hashSet3) {
                ViewOscillator viewOscillatorMakeSpline = ViewOscillator.makeSpline(str9);
                if (viewOscillatorMakeSpline != null) {
                    if (viewOscillatorMakeSpline.variesByPath() && Float.isNaN(f109)) {
                        f109 = f();
                    }
                    viewOscillatorMakeSpline.setType(str9);
                    motionController.f19412z.put(str9, viewOscillatorMakeSpline);
                }
            }
            for (Key key6 : arrayList) {
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).addCycleValues(motionController.f19412z);
                }
            }
            Iterator<ViewOscillator> it5 = motionController.f19412z.values().iterator();
            while (it5.hasNext()) {
                it5.next().setup(f109);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.f19393f.h(motionController, motionController.f19393f);
        this.f19394g.h(motionController, motionController.f19394g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        d dVar = this.f19393f;
        sb2.append(dVar.f19597t0);
        sb2.append(" y: ");
        sb2.append(dVar.f19598u0);
        sb2.append(" end: x: ");
        d dVar2 = this.f19394g;
        sb2.append(dVar2.f19597t0);
        sb2.append(" y: ");
        sb2.append(dVar2.f19598u0);
        return sb2.toString();
    }
}
