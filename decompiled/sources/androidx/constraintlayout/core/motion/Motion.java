package androidx.constraintlayout.core.motion;

import a2.a;
import a2.b;
import ad.d;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.ViewState;
import androidx.datastore.preferences.protobuf.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Motion implements TypedValues {
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
    public MotionWidget A;
    public int B;
    public float C;
    public a D;
    public Motion E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionWidget f18722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MotionPaths f18724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MotionPaths f18725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f18726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f18727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CurveFit[] f18728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CurveFit f18729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f18733l;
    public double[] m;
    public String mId;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double[] f18734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f18735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f18736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f18737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<MotionPaths> f18738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f18739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList<MotionKey> f18740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HashMap<String, TimeCycleSplineSet> f18741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashMap<String, SplineSet> f18742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap<String, KeyCycleOscillator> f18743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MotionKeyTrigger[] f18744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18746z;

    public Motion(MotionWidget motionWidget) {
        new Rect();
        this.f18723b = 0;
        this.f18724c = new MotionPaths();
        this.f18725d = new MotionPaths();
        this.f18726e = new b();
        this.f18727f = new b();
        this.f18730i = Float.NaN;
        this.f18731j = 0.0f;
        this.f18732k = 1.0f;
        this.f18737q = new float[4];
        this.f18738r = new ArrayList<>();
        this.f18739s = new float[1];
        this.f18740t = new ArrayList<>();
        this.f18745y = -1;
        this.f18746z = -1;
        this.A = null;
        this.B = -1;
        this.C = Float.NaN;
        this.D = null;
        setView(motionWidget);
    }

    public final float a(float f6, float[] fArr) {
        float f10 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f11 = this.f18732k;
            if (f11 != 1.0d) {
                float f12 = this.f18731j;
                if (f6 < f12) {
                    f6 = 0.0f;
                }
                if (f6 > f12 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f12) * f11, 1.0f);
                }
            }
        }
        Easing easing = this.f18724c.f18747p0;
        float f13 = Float.NaN;
        for (MotionPaths motionPaths : this.f18738r) {
            Easing easing2 = motionPaths.f18747p0;
            if (easing2 != null) {
                float f14 = motionPaths.f18749r0;
                if (f14 < f6) {
                    easing = easing2;
                    f10 = f14;
                } else if (Float.isNaN(f13)) {
                    f13 = motionPaths.f18749r0;
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

    public void addKey(MotionKey motionKey) {
        this.f18740t.add(motionKey);
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f18728g[0].getTimePoints();
        ArrayList<MotionPaths> arrayList = this.f18738r;
        if (iArr != null) {
            Iterator<MotionPaths> it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().J0;
                i10++;
            }
        }
        if (iArr2 != null) {
            Iterator<MotionPaths> it2 = arrayList.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                iArr2[i11] = (int) (it2.next().f18750s0 * 100.0f);
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < timePoints.length; i13++) {
            this.f18728g[0].getPos(timePoints[i13], this.m);
            this.f18724c.b(timePoints[i13], this.f18733l, this.m, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void buildPath(float[] fArr, int i10) {
        double d2;
        float f6 = 1.0f;
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, SplineSet> map = this.f18742v;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.f18742v;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, KeyCycleOscillator> map3 = this.f18743w;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, KeyCycleOscillator> map4 = this.f18743w;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i11 = 0;
        while (i11 < i10) {
            float fMin = i11 * f10;
            float f11 = this.f18732k;
            float f12 = 0.0f;
            if (f11 != f6) {
                float f13 = this.f18731j;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f11, f6);
                }
            }
            float f14 = fMin;
            double d3 = f14;
            Easing easing = this.f18724c.f18747p0;
            float f15 = Float.NaN;
            for (MotionPaths motionPaths : this.f18738r) {
                Easing easing2 = motionPaths.f18747p0;
                double d7 = d3;
                if (easing2 != null) {
                    float f16 = motionPaths.f18749r0;
                    if (f16 < f14) {
                        f12 = f16;
                        easing = easing2;
                    } else if (Float.isNaN(f15)) {
                        f15 = motionPaths.f18749r0;
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
            this.f18728g[0].getPos(d2, this.m);
            CurveFit curveFit = this.f18729h;
            if (curveFit != null) {
                double[] dArr = this.m;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            int i12 = i11 * 2;
            int i13 = i11;
            this.f18724c.b(d2, this.f18733l, this.m, fArr, i12);
            if (keyCycleOscillator != null) {
                fArr[i12] = keyCycleOscillator.get(f14) + fArr[i12];
            } else if (splineSet != null) {
                fArr[i12] = splineSet.get(f14) + fArr[i12];
            }
            if (keyCycleOscillator2 != null) {
                int i14 = i12 + 1;
                fArr[i14] = keyCycleOscillator2.get(f14) + fArr[i14];
            } else if (splineSet2 != null) {
                int i15 = i12 + 1;
                fArr[i15] = splineSet2.get(f14) + fArr[i15];
            }
            i11 = i13 + 1;
            f6 = 1.0f;
        }
    }

    public void buildRect(float f6, float[] fArr, int i10) {
        this.f18728g[0].getPos(a(f6, null), this.m);
        int[] iArr = this.f18733l;
        double[] dArr = this.m;
        MotionPaths motionPaths = this.f18724c;
        float f10 = motionPaths.f18751t0;
        float fCos = motionPaths.f18752u0;
        float f11 = motionPaths.v0;
        float f12 = motionPaths.f18753w0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        Motion motion = motionPaths.H0;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = motionPaths.H0.getCenterY();
            double d2 = f10;
            double d3 = fCos;
            float fSin = (float) (((Math.sin(d3) * d2) + ((double) centerX)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) centerY) - (Math.cos(d3) * d2)) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f16 = f10 + 0.0f;
        float f17 = fCos + 0.0f;
        float f18 = f14 + 0.0f;
        float f19 = f15 + 0.0f;
        fArr[i10] = f16;
        fArr[i10 + 1] = f17;
        fArr[i10 + 2] = f18;
        fArr[i10 + 3] = f17;
        fArr[i10 + 4] = f18;
        fArr[i10 + 5] = f19;
        fArr[i10 + 6] = f16;
        fArr[i10 + 7] = f19;
    }

    public String getAnimateRelativeTo() {
        return this.f18724c.F0;
    }

    public void getCenter(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f18728g[0].getPos(d2, dArr);
        this.f18728g[0].getSlope(d2, dArr2);
        float f6 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f18733l;
        MotionPaths motionPaths = this.f18724c;
        float f10 = motionPaths.f18751t0;
        float f11 = motionPaths.f18752u0;
        float f12 = motionPaths.v0;
        float f13 = motionPaths.f18753w0;
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
        Motion motion = motionPaths.H0;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d2, fArr3, fArr4);
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

    public void getDpDt(float f6, float f10, float f11, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f18739s;
        float fA = a(f6, fArr2);
        CurveFit[] curveFitArr = this.f18728g;
        int i10 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.f18725d;
            float f12 = motionPaths.f18751t0;
            MotionPaths motionPaths2 = this.f18724c;
            float f13 = f12 - motionPaths2.f18751t0;
            float f14 = motionPaths.f18752u0 - motionPaths2.f18752u0;
            float f15 = motionPaths.v0 - motionPaths2.v0;
            float f16 = (motionPaths.f18753w0 - motionPaths2.f18753w0) + f14;
            fArr[0] = ((f15 + f13) * f10) + ((1.0f - f10) * f13);
            fArr[1] = (f16 * f11) + ((1.0f - f11) * f14);
            return;
        }
        double d2 = fA;
        curveFitArr[0].getSlope(d2, this.f18734n);
        this.f18728g[0].getPos(d2, this.m);
        float f17 = fArr2[0];
        while (true) {
            dArr = this.f18734n;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f17);
            i10++;
        }
        CurveFit curveFit = this.f18729h;
        if (curveFit == null) {
            MotionPaths motionPaths3 = this.f18724c;
            int[] iArr = this.f18733l;
            motionPaths3.getClass();
            MotionPaths.c(f10, f11, fArr, iArr, dArr);
            return;
        }
        double[] dArr2 = this.m;
        if (dArr2.length > 0) {
            curveFit.getPos(d2, dArr2);
            this.f18729h.getSlope(d2, this.f18734n);
            MotionPaths motionPaths4 = this.f18724c;
            int[] iArr2 = this.f18733l;
            double[] dArr3 = this.f18734n;
            motionPaths4.getClass();
            MotionPaths.c(f10, f11, fArr, iArr2, dArr3);
        }
    }

    public int getDrawPath() {
        int iMax = this.f18724c.f18748q0;
        Iterator<MotionPaths> it = this.f18738r.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f18748q0);
        }
        return Math.max(iMax, this.f18725d.f18748q0);
    }

    public float getFinalHeight() {
        return this.f18725d.f18753w0;
    }

    public float getFinalWidth() {
        return this.f18725d.v0;
    }

    public float getFinalX() {
        return this.f18725d.f18751t0;
    }

    public float getFinalY() {
        return this.f18725d.f18752u0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i10) {
        return this.f18738r.get(i10);
    }

    public int getKeyFrameInfo(int i10, int[] iArr) {
        float[] fArr = new float[2];
        int i11 = 0;
        int i12 = 0;
        for (MotionKey motionKey : this.f18740t) {
            int i13 = motionKey.mType;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i13;
                int i14 = motionKey.mFramePosition;
                iArr[i12 + 2] = i14;
                double d2 = i14 / 100.0f;
                this.f18728g[0].getPos(d2, this.m);
                this.f18724c.b(d2, this.f18733l, this.m, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i15 = i12 + 4;
                iArr[i15] = Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    iArr[i12 + 5] = motionKeyPosition.mPositionType;
                    iArr[i12 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i15 = i12 + 7;
                    iArr[i15] = Float.floatToIntBits(motionKeyPosition.mPercentY);
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
        for (MotionKey motionKey : this.f18740t) {
            int i12 = motionKey.mFramePosition;
            iArr[i10] = (motionKey.mType * 1000) + i12;
            double d2 = i12 / 100.0f;
            this.f18728g[0].getPos(d2, this.m);
            this.f18724c.b(d2, this.f18733l, this.m, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }

    public float getMotionStagger() {
        return this.f18730i;
    }

    public float getStartHeight() {
        return this.f18724c.f18753w0;
    }

    public float getStartWidth() {
        return this.f18724c.v0;
    }

    public float getStartX() {
        return this.f18724c.f18751t0;
    }

    public float getStartY() {
        return this.f18724c.f18752u0;
    }

    public int getTransformPivotTarget() {
        return this.f18746z;
    }

    public MotionWidget getView() {
        return this.f18722a;
    }

    public boolean interpolate(MotionWidget motionWidget, float f6, long j10, KeyCache keyCache) {
        float f10;
        float f11;
        float f12;
        float f13;
        double d2;
        MotionPaths motionPaths;
        float f14;
        Motion motion = this;
        MotionWidget motionWidget2 = motionWidget;
        float fA = motion.a(f6, null);
        int i10 = motion.B;
        if (i10 != -1) {
            float f15 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fA / f15)) * f15;
            float f16 = (fA % f15) / f15;
            if (!Float.isNaN(motion.C)) {
                f16 = (f16 + motion.C) % 1.0f;
            }
            a aVar = motion.D;
            fA = ((aVar != null ? aVar.getInterpolation(f16) : ((double) f16) > 0.5d ? 1.0f : 0.0f) * f15) + fFloor;
        }
        float f17 = fA;
        HashMap<String, SplineSet> map = motion.f18742v;
        if (map != null) {
            Iterator<SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget2, f17);
            }
        }
        CurveFit[] curveFitArr = motion.f18728g;
        MotionPaths motionPaths2 = motion.f18724c;
        if (curveFitArr != null) {
            double d3 = f17;
            curveFitArr[0].getPos(d3, motion.m);
            motion.f18728g[0].getSlope(d3, motion.f18734n);
            CurveFit curveFit = motion.f18729h;
            if (curveFit != null) {
                double[] dArr = motion.m;
                if (dArr.length > 0) {
                    curveFit.getPos(d3, dArr);
                    motion.f18729h.getSlope(d3, motion.f18734n);
                }
            }
            int[] iArr = motion.f18733l;
            double[] dArr2 = motion.m;
            double[] dArr3 = motion.f18734n;
            float f18 = motionPaths2.f18751t0;
            float f19 = motionPaths2.f18752u0;
            float f20 = motionPaths2.v0;
            float f21 = motionPaths2.f18753w0;
            if (iArr.length != 0 && motionPaths2.K0.length <= iArr[iArr.length - 1]) {
                int i11 = iArr[iArr.length - 1] + 1;
                motionPaths2.K0 = new double[i11];
                motionPaths2.L0 = new double[i11];
            }
            Arrays.fill(motionPaths2.K0, Double.NaN);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                double[] dArr4 = motionPaths2.K0;
                int i13 = iArr[i12];
                dArr4[i13] = dArr2[i12];
                motionPaths2.L0[i13] = dArr3[i12];
            }
            float f22 = f19;
            float f23 = f20;
            float f24 = f21;
            float f25 = 0.0f;
            float f26 = 0.0f;
            float f27 = 0.0f;
            int i14 = 0;
            float f28 = Float.NaN;
            float f29 = 0.0f;
            while (true) {
                double[] dArr5 = motionPaths2.K0;
                f10 = f27;
                f11 = f26;
                if (i14 >= dArr5.length) {
                    break;
                }
                if (Double.isNaN(dArr5[i14])) {
                    f14 = f29;
                } else {
                    float f30 = (float) (Double.isNaN(motionPaths2.K0[i14]) ? 0.0d : motionPaths2.K0[i14] + 0.0d);
                    f14 = f29;
                    float f31 = (float) motionPaths2.L0[i14];
                    if (i14 == 1) {
                        f29 = f31;
                        f18 = f30;
                        f27 = f10;
                        f26 = f11;
                    } else if (i14 == 2) {
                        f25 = f31;
                        f22 = f30;
                    } else if (i14 != 3) {
                        if (i14 == 4) {
                            f27 = f31;
                            f24 = f30;
                        } else if (i14 == 5) {
                            f28 = f30;
                        }
                        f26 = f11;
                        f29 = f14;
                    } else {
                        f23 = f30;
                        f27 = f10;
                        f29 = f14;
                        f26 = f31;
                    }
                    i14++;
                }
                f27 = f10;
                f26 = f11;
                f29 = f14;
                i14++;
            }
            float f32 = f29;
            Motion motion2 = motionPaths2.H0;
            if (motion2 != null) {
                float[] fArr = new float[2];
                float[] fArr2 = new float[2];
                motion2.getCenter(d3, fArr, fArr2);
                float f33 = fArr[0];
                float f34 = fArr[1];
                float f35 = fArr2[0];
                float f36 = fArr2[1];
                d2 = d3;
                double d7 = f33;
                double d10 = f18;
                float f37 = f28;
                double d11 = f22;
                float fSin = (float) (((Math.sin(d11) * d10) + d7) - ((double) (f23 / 2.0f)));
                double dCos = ((double) f34) - (Math.cos(d11) * d10);
                float f38 = f23;
                f13 = f24;
                float f39 = (float) (dCos - ((double) (f24 / 2.0f)));
                double d12 = f35;
                double d13 = f32;
                motionPaths = motionPaths2;
                double d14 = f25;
                float fCos = (float) ((Math.cos(d11) * d10 * d14) + (Math.sin(d11) * d13) + d12);
                f12 = f38;
                float fSin2 = (float) ((Math.sin(d11) * d10 * d14) + (((double) f36) - (Math.cos(d11) * d13)));
                if (dArr3.length >= 2) {
                    dArr3[0] = fCos;
                    dArr3[1] = fSin2;
                }
                if (Float.isNaN(f37)) {
                    motionWidget2 = motionWidget;
                } else {
                    motionWidget2 = motionWidget;
                    motionWidget2.setRotationZ((float) (Math.toDegrees(Math.atan2(fSin2, fCos)) + ((double) f37)));
                }
                f22 = f39;
                f18 = fSin;
            } else {
                float f40 = f28;
                f12 = f23;
                f13 = f24;
                d2 = d3;
                motionPaths = motionPaths2;
                if (!Float.isNaN(f40)) {
                    motionWidget2.setRotationZ(((float) (Math.toDegrees(Math.atan2((f10 / 2.0f) + f25, (f11 / 2.0f) + f32)) + ((double) f40))) + 0.0f);
                }
            }
            float f41 = f18 + 0.5f;
            float f42 = f22 + 0.5f;
            motionWidget2.layout((int) f41, (int) f42, (int) (f41 + f12), (int) (f42 + f13));
            motion = this;
            if (motion.f18746z != -1) {
                if (motion.A == null) {
                    motion.A = motionWidget.getParent().findViewById(motion.f18746z);
                }
                MotionWidget motionWidget3 = motion.A;
                if (motionWidget3 != null) {
                    float bottom = (motion.A.getBottom() + motionWidget3.getTop()) / 2.0f;
                    float right = (motion.A.getRight() + motion.A.getLeft()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        float left = right - motionWidget.getLeft();
                        float top = bottom - motionWidget.getTop();
                        motionWidget2.setPivotX(left);
                        motionWidget2.setPivotY(top);
                    }
                }
            }
            int i15 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = motion.f18728g;
                if (i15 >= curveFitArr2.length) {
                    break;
                }
                CurveFit curveFit2 = curveFitArr2[i15];
                float[] fArr3 = motion.f18737q;
                curveFit2.getPos(d2, fArr3);
                motionPaths.I0.get(motion.f18735o[i15 - 1]).setInterpolatedValue(motionWidget2, fArr3);
                i15++;
            }
            b bVar = motion.f18726e;
            bVar.getClass();
            if (f17 <= 0.0f) {
                motionWidget2.setVisibility(bVar.f167q0);
            } else {
                b bVar2 = motion.f18727f;
                if (f17 >= 1.0f) {
                    motionWidget2.setVisibility(bVar2.f167q0);
                } else if (bVar2.f167q0 != bVar.f167q0) {
                    motionWidget2.setVisibility(4);
                }
            }
            if (motion.f18744x != null) {
                int i16 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = motion.f18744x;
                    if (i16 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i16].conditionallyFire(f17, motionWidget2);
                    i16++;
                }
            }
            f17 = f17;
        } else {
            float f43 = motionPaths2.f18751t0;
            MotionPaths motionPaths3 = motion.f18725d;
            float fA2 = e.a(motionPaths3.f18751t0, f43, f17, f43);
            float f44 = motionPaths2.f18752u0;
            float fA3 = e.a(motionPaths3.f18752u0, f44, f17, f44);
            float f45 = motionPaths2.v0;
            float fA4 = e.a(motionPaths3.v0, f45, f17, f45);
            float f46 = motionPaths2.f18753w0;
            float f47 = fA2 + 0.5f;
            float f48 = fA3 + 0.5f;
            motionWidget2.layout((int) f47, (int) f48, (int) (f47 + fA4), (int) (f48 + e.a(motionPaths3.f18753w0, f46, f17, f46)));
        }
        HashMap<String, KeyCycleOscillator> map2 = motion.f18743w;
        if (map2 == null) {
            return false;
        }
        for (KeyCycleOscillator keyCycleOscillator : map2.values()) {
            if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                double[] dArr6 = motion.f18734n;
                ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget, f17, dArr6[0], dArr6[1]);
            } else {
                keyCycleOscillator.setProperty(motionWidget2, f17);
            }
        }
        return false;
    }

    public void setDrawPath(int i10) {
        this.f18724c.f18748q0 = i10;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.f18725d;
        motionPaths.f18749r0 = 1.0f;
        motionPaths.f18750s0 = 1.0f;
        float x4 = this.f18722a.getX();
        float y7 = this.f18722a.getY();
        float width = this.f18722a.getWidth();
        float height = this.f18722a.getHeight();
        motionPaths.f18751t0 = x4;
        motionPaths.f18752u0 = y7;
        motionPaths.v0 = width;
        motionPaths.f18753w0 = height;
        float left = motionWidget.getLeft();
        float top = motionWidget.getTop();
        float width2 = motionWidget.getWidth();
        float height2 = motionWidget.getHeight();
        motionPaths.f18751t0 = left;
        motionPaths.f18752u0 = top;
        motionPaths.v0 = width2;
        motionPaths.f18753w0 = height2;
        motionPaths.applyParameters(motionWidget);
        b bVar = this.f18727f;
        bVar.getClass();
        motionWidget.getX();
        motionWidget.getY();
        motionWidget.getWidth();
        motionWidget.getHeight();
        bVar.b(motionWidget);
    }

    public void setIdString(String str) {
        this.mId = str;
        this.f18724c.mId = str;
    }

    public void setPathMotionArc(int i10) {
        this.f18745y = i10;
    }

    public void setStaggerOffset(float f6) {
        this.f18731j = f6;
    }

    public void setStaggerScale(float f6) {
        this.f18732k = f6;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.f18724c;
        motionPaths.f18749r0 = 0.0f;
        motionPaths.f18750s0 = 0.0f;
        float x4 = motionWidget.getX();
        float y7 = motionWidget.getY();
        float width = motionWidget.getWidth();
        float height = motionWidget.getHeight();
        motionPaths.f18751t0 = x4;
        motionPaths.f18752u0 = y7;
        motionPaths.v0 = width;
        motionPaths.f18753w0 = height;
        motionPaths.applyParameters(motionWidget);
        b bVar = this.f18726e;
        bVar.getClass();
        motionWidget.getX();
        motionWidget.getY();
        motionWidget.getWidth();
        motionWidget.getHeight();
        bVar.b(motionWidget);
        TypedBundle motionProperties = motionWidget.getWidgetFrame().getMotionProperties();
        if (motionProperties != null) {
            motionProperties.applyDelta(this);
        }
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i10, int i11, int i12) {
        MotionPaths motionPaths = this.f18724c;
        motionPaths.f18749r0 = 0.0f;
        motionPaths.f18750s0 = 0.0f;
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
        float f6 = rect.left;
        float f10 = rect.top;
        float fWidth = rect.width();
        float fHeight = rect.height();
        motionPaths.f18751t0 = f6;
        motionPaths.f18752u0 = f10;
        motionPaths.v0 = fWidth;
        motionPaths.f18753w0 = fHeight;
        float f11 = viewState.rotation;
        b bVar = this.f18726e;
        bVar.getClass();
        rect.width();
        rect.height();
        bVar.b(motionWidget);
        bVar.f172w0 = Float.NaN;
        bVar.f173x0 = Float.NaN;
        if (i10 == 1) {
            bVar.f168r0 = f11 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            bVar.f168r0 = f11 + 90.0f;
        }
    }

    public void setTransformPivotTarget(int i10) {
        this.f18746z = i10;
        this.A = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, boolean z10) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.f18722a = motionWidget;
    }

    public void setup(int i10, int i11, float f6, long j10) {
        MotionPaths motionPaths;
        MotionPaths motionPaths2;
        b bVar;
        ArrayList arrayList;
        HashSet<String> hashSet;
        String[] strArr;
        Iterator<String> it;
        MotionPaths motionPaths3;
        double d2;
        char c10;
        String str;
        CustomVariable customVariable;
        SplineSet splineSetMakeSpline;
        CustomVariable customVariable2;
        Integer num;
        HashSet<String> hashSet2;
        Iterator<String> it2;
        SplineSet splineSetMakeSpline2;
        CustomVariable customVariable3;
        MotionPaths motionPaths4;
        MotionPaths motionPaths5;
        b bVar2;
        new HashSet();
        HashSet<String> hashSet3 = new HashSet<>();
        HashSet<String> hashSet4 = new HashSet<>();
        HashSet<String> hashSet5 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        Motion motion = this.E;
        MotionPaths motionPaths6 = this.f18725d;
        MotionPaths motionPaths7 = this.f18724c;
        if (motion != null) {
            motionPaths7.setupRelative(motion, motion.f18724c);
            Motion motion2 = this.E;
            motionPaths6.setupRelative(motion2, motion2.f18725d);
        }
        int i12 = this.f18745y;
        if (i12 != -1 && motionPaths7.E0 == -1) {
            motionPaths7.E0 = i12;
        }
        b bVar3 = this.f18726e;
        float f10 = bVar3.f166p0;
        b bVar4 = this.f18727f;
        if (b.c(f10, bVar4.f166p0)) {
            hashSet4.add("alpha");
        }
        if (b.c(0.0f, 0.0f)) {
            hashSet4.add("translationZ");
        }
        int i13 = bVar3.f167q0;
        int i14 = bVar4.f167q0;
        if (i13 != i14 && (i13 == 4 || i14 == 4)) {
            hashSet4.add("alpha");
        }
        if (b.c(bVar3.f168r0, bVar4.f168r0)) {
            hashSet4.add("rotationZ");
        }
        if (!Float.isNaN(bVar3.G0) || !Float.isNaN(bVar4.G0)) {
            hashSet4.add("pathRotate");
        }
        if (!Float.isNaN(bVar3.H0) || !Float.isNaN(bVar4.H0)) {
            hashSet4.add("progress");
        }
        if (b.c(bVar3.f169s0, bVar4.f169s0)) {
            hashSet4.add("rotationX");
        }
        if (b.c(bVar3.f170t0, bVar4.f170t0)) {
            hashSet4.add("rotationY");
        }
        if (b.c(bVar3.f172w0, bVar4.f172w0)) {
            hashSet4.add("pivotX");
        }
        if (b.c(bVar3.f173x0, bVar4.f173x0)) {
            hashSet4.add("pivotY");
        }
        if (b.c(bVar3.f171u0, bVar4.f171u0)) {
            hashSet4.add("scaleX");
        }
        if (b.c(bVar3.v0, bVar4.v0)) {
            hashSet4.add("scaleY");
        }
        if (b.c(bVar3.f174y0, bVar4.f174y0)) {
            hashSet4.add("translationX");
        }
        if (b.c(bVar3.E0, bVar4.E0)) {
            hashSet4.add("translationY");
        }
        if (b.c(bVar3.F0, bVar4.F0)) {
            hashSet4.add("translationZ");
        }
        if (b.c(0.0f, 0.0f)) {
            hashSet4.add("elevation");
        }
        ArrayList<MotionKey> arrayList2 = this.f18740t;
        ArrayList<MotionPaths> arrayList3 = this.f18738r;
        if (arrayList2 != null) {
            ArrayList arrayList4 = null;
            for (MotionKey motionKey : arrayList2) {
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    motionPaths4 = motionPaths6;
                    MotionPaths motionPaths8 = new MotionPaths(i10, i11, motionKeyPosition, this.f18724c, this.f18725d);
                    Iterator<MotionPaths> it3 = arrayList3.iterator();
                    MotionPaths motionPaths9 = null;
                    while (it3.hasNext()) {
                        Iterator<MotionPaths> it4 = it3;
                        MotionPaths next = it3.next();
                        MotionPaths motionPaths10 = motionPaths7;
                        b bVar5 = bVar4;
                        if (motionPaths8.f18750s0 == next.f18750s0) {
                            motionPaths9 = next;
                        }
                        motionPaths7 = motionPaths10;
                        it3 = it4;
                        bVar4 = bVar5;
                    }
                    motionPaths5 = motionPaths7;
                    bVar2 = bVar4;
                    if (motionPaths9 != null) {
                        arrayList3.remove(motionPaths9);
                    }
                    int iBinarySearch = Collections.binarySearch(arrayList3, motionPaths8);
                    if (iBinarySearch == 0) {
                        Utils.loge("MotionController", " KeyPath position \"" + motionPaths8.f18750s0 + "\" outside of range");
                    }
                    arrayList3.add((-iBinarySearch) - 1, motionPaths8);
                    int i15 = motionKeyPosition.mCurveFit;
                    if (i15 != -1) {
                        this.f18723b = i15;
                    }
                } else {
                    motionPaths4 = motionPaths6;
                    motionPaths5 = motionPaths7;
                    bVar2 = bVar4;
                    if (motionKey instanceof MotionKeyCycle) {
                        motionKey.getAttributeNames(hashSet5);
                    } else if (motionKey instanceof MotionKeyTimeCycle) {
                        motionKey.getAttributeNames(hashSet3);
                    } else if (motionKey instanceof MotionKeyTrigger) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        ArrayList arrayList5 = arrayList4;
                        arrayList5.add((MotionKeyTrigger) motionKey);
                        arrayList4 = arrayList5;
                    } else {
                        motionKey.setInterpolation(map);
                        motionKey.getAttributeNames(hashSet4);
                    }
                }
                motionPaths7 = motionPaths5;
                bVar4 = bVar2;
                motionPaths6 = motionPaths4;
            }
            motionPaths = motionPaths6;
            motionPaths2 = motionPaths7;
            bVar = bVar4;
            arrayList = arrayList4;
        } else {
            motionPaths = motionPaths6;
            motionPaths2 = motionPaths7;
            bVar = bVar4;
            arrayList = null;
        }
        if (arrayList != null) {
            this.f18744x = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        if (hashSet4.isEmpty()) {
            hashSet = hashSet5;
        } else {
            this.f18742v = new HashMap<>();
            Iterator<String> it5 = hashSet4.iterator();
            while (it5.hasNext()) {
                String next2 = it5.next();
                if (next2.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str2 = next2.split(",")[1];
                    for (MotionKey motionKey2 : arrayList2) {
                        Iterator<String> it6 = it5;
                        HashSet<String> hashSet6 = hashSet5;
                        HashMap<String, CustomVariable> map2 = motionKey2.mCustom;
                        if (map2 != null && (customVariable3 = map2.get(str2)) != null) {
                            customVar.append(motionKey2.mFramePosition, customVariable3);
                        }
                        hashSet5 = hashSet6;
                        it5 = it6;
                    }
                    hashSet2 = hashSet5;
                    it2 = it5;
                    splineSetMakeSpline2 = SplineSet.makeCustomSplineSet(next2, customVar);
                } else {
                    hashSet2 = hashSet5;
                    it2 = it5;
                    splineSetMakeSpline2 = SplineSet.makeSpline(next2, j10);
                }
                if (splineSetMakeSpline2 != null) {
                    splineSetMakeSpline2.setType(next2);
                    this.f18742v.put(next2, splineSetMakeSpline2);
                }
                hashSet5 = hashSet2;
                it5 = it2;
            }
            hashSet = hashSet5;
            if (arrayList2 != null) {
                for (MotionKey motionKey3 : arrayList2) {
                    if (motionKey3 instanceof MotionKeyAttributes) {
                        motionKey3.addValues(this.f18742v);
                    }
                }
            }
            bVar3.a(this.f18742v, 0);
            bVar.a(this.f18742v, 100);
            for (String str3 : this.f18742v.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                SplineSet splineSet = this.f18742v.get(str3);
                if (splineSet != null) {
                    splineSet.setup(iIntValue);
                }
            }
        }
        if (!hashSet3.isEmpty()) {
            if (this.f18741u == null) {
                this.f18741u = new HashMap<>();
            }
            for (String str4 : hashSet3) {
                if (!this.f18741u.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str5 = str4.split(",")[1];
                        for (MotionKey motionKey4 : arrayList2) {
                            HashMap<String, CustomVariable> map3 = motionKey4.mCustom;
                            if (map3 != null && (customVariable2 = map3.get(str5)) != null) {
                                customVar2.append(motionKey4.mFramePosition, customVariable2);
                            }
                        }
                        splineSetMakeSpline = SplineSet.makeCustomSplineSet(str4, customVar2);
                    } else {
                        splineSetMakeSpline = SplineSet.makeSpline(str4, j10);
                    }
                    if (splineSetMakeSpline != null) {
                        splineSetMakeSpline.setType(str4);
                    }
                }
            }
            if (arrayList2 != null) {
                for (MotionKey motionKey5 : arrayList2) {
                    if (motionKey5 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey5).addTimeValues(this.f18741u);
                    }
                }
            }
            for (String str6 : this.f18741u.keySet()) {
                this.f18741u.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = arrayList3.size();
        int i16 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i16];
        motionPathsArr[0] = motionPaths2;
        motionPathsArr[size + 1] = motionPaths;
        if (arrayList3.size() > 0 && this.f18723b == MotionKey.UNSET) {
            this.f18723b = 0;
        }
        Iterator<MotionPaths> it7 = arrayList3.iterator();
        int i17 = 1;
        while (it7.hasNext()) {
            motionPathsArr[i17] = it7.next();
            i17++;
        }
        HashSet hashSet7 = new HashSet();
        for (String str7 : motionPaths.I0.keySet()) {
            MotionPaths motionPaths11 = motionPaths2;
            if (motionPaths11.I0.containsKey(str7)) {
                if (!hashSet4.contains("CUSTOM," + str7)) {
                    hashSet7.add(str7);
                }
            }
            motionPaths2 = motionPaths11;
        }
        MotionPaths motionPaths12 = motionPaths2;
        String[] strArr2 = (String[]) hashSet7.toArray(new String[0]);
        this.f18735o = strArr2;
        this.f18736p = new int[strArr2.length];
        int i18 = 0;
        while (true) {
            strArr = this.f18735o;
            if (i18 >= strArr.length) {
                break;
            }
            String str8 = strArr[i18];
            this.f18736p[i18] = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                if (motionPathsArr[i19].I0.containsKey(str8) && (customVariable = motionPathsArr[i19].I0.get(str8)) != null) {
                    int[] iArr = this.f18736p;
                    iArr[i18] = customVariable.numberOfInterpolatedValues() + iArr[i18];
                    break;
                }
            }
            i18++;
        }
        boolean z10 = motionPathsArr[0].E0 != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i20 = 1; i20 < i16; i20++) {
            MotionPaths motionPaths13 = motionPathsArr[i20];
            MotionPaths motionPaths14 = motionPathsArr[i20 - 1];
            boolean zA = MotionPaths.a(motionPaths13.f18751t0, motionPaths14.f18751t0);
            boolean zA2 = MotionPaths.a(motionPaths13.f18752u0, motionPaths14.f18752u0);
            zArr[0] = zArr[0] | MotionPaths.a(motionPaths13.f18750s0, motionPaths14.f18750s0);
            zArr[1] = zArr[1] | (zA || zA2 || z10);
            zArr[2] = (zA || zA2 || z10) | zArr[2];
            zArr[3] = zArr[3] | MotionPaths.a(motionPaths13.v0, motionPaths14.v0);
            zArr[4] = zArr[4] | MotionPaths.a(motionPaths13.f18753w0, motionPaths14.f18753w0);
        }
        int i21 = 0;
        for (int i22 = 1; i22 < length; i22++) {
            if (zArr[i22]) {
                i21++;
            }
        }
        this.f18733l = new int[i21];
        int iMax = Math.max(2, i21);
        this.m = new double[iMax];
        this.f18734n = new double[iMax];
        int i23 = 0;
        for (int i24 = 1; i24 < length; i24++) {
            if (zArr[i24]) {
                this.f18733l[i23] = i24;
                i23++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, this.f18733l.length);
        double[] dArr2 = new double[i16];
        int i25 = 0;
        while (true) {
            int i26 = 6;
            if (i25 >= i16) {
                break;
            }
            MotionPaths motionPaths15 = motionPathsArr[i25];
            double[] dArr3 = dArr[i25];
            int[] iArr2 = this.f18733l;
            float[] fArr = {motionPaths15.f18750s0, motionPaths15.f18751t0, motionPaths15.f18752u0, motionPaths15.v0, motionPaths15.f18753w0, motionPaths15.f18754x0};
            int i27 = 0;
            int i28 = 0;
            while (i27 < iArr2.length) {
                int i29 = iArr2[i27];
                if (i29 < i26) {
                    dArr3[i28] = fArr[i29];
                    i28++;
                }
                i27++;
                motionPaths12 = motionPaths12;
                i26 = 6;
            }
            dArr2[i25] = motionPathsArr[i25].f18749r0;
            i25++;
            motionPaths12 = motionPaths12;
        }
        MotionPaths motionPaths16 = motionPaths12;
        int i30 = 0;
        while (true) {
            int[] iArr3 = this.f18733l;
            if (i30 >= iArr3.length) {
                break;
            }
            if (iArr3[i30] < 6) {
                String strF = d.f(new StringBuilder(), MotionPaths.M0[this.f18733l[i30]], " [");
                for (int i31 = 0; i31 < i16; i31++) {
                    StringBuilder sbD = c.d(strF);
                    sbD.append(dArr[i31][i30]);
                    strF = sbD.toString();
                }
            }
            i30++;
        }
        this.f18728g = new CurveFit[this.f18735o.length + 1];
        int i32 = 0;
        while (true) {
            String[] strArr3 = this.f18735o;
            if (i32 >= strArr3.length) {
                break;
            }
            String str9 = strArr3[i32];
            double[] dArr4 = null;
            double[][] dArr5 = null;
            int i33 = 0;
            int i34 = 0;
            while (i33 < i16) {
                if (motionPathsArr[i33].I0.containsKey(str9)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i16];
                        CustomVariable customVariable4 = motionPathsArr[i33].I0.get(str9);
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, customVariable4 == null ? 0 : customVariable4.numberOfInterpolatedValues());
                    }
                    MotionPaths motionPaths17 = motionPathsArr[i33];
                    dArr4[i34] = motionPaths17.f18749r0;
                    double[] dArr6 = dArr5[i34];
                    CustomVariable customVariable5 = motionPaths17.I0.get(str9);
                    if (customVariable5 != null) {
                        if (customVariable5.numberOfInterpolatedValues() == 1) {
                            dArr6[0] = customVariable5.getValueToInterpolate();
                        } else {
                            int iNumberOfInterpolatedValues = customVariable5.numberOfInterpolatedValues();
                            float[] fArr2 = new float[iNumberOfInterpolatedValues];
                            customVariable5.getValuesToInterpolate(fArr2);
                            int i35 = 0;
                            int i36 = 0;
                            while (i35 < iNumberOfInterpolatedValues) {
                                dArr6[i36] = fArr2[i35];
                                i35++;
                                str9 = str9;
                                i36++;
                                dArr4 = dArr4;
                                dArr5 = dArr5;
                            }
                        }
                    }
                    str = str9;
                    i34++;
                    dArr4 = dArr4;
                    dArr5 = dArr5;
                } else {
                    str = str9;
                }
                i33++;
                str9 = str;
                arrayList3 = arrayList3;
            }
            i32++;
            this.f18728g[i32] = CurveFit.get(this.f18723b, Arrays.copyOf(dArr4, i34), (double[][]) Arrays.copyOf(dArr5, i34));
        }
        ArrayList<MotionPaths> arrayList6 = arrayList3;
        this.f18728g[0] = CurveFit.get(this.f18723b, dArr2, dArr);
        if (motionPathsArr[0].E0 != -1) {
            int[] iArr4 = new int[i16];
            double[] dArr7 = new double[i16];
            double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, 2);
            for (int i37 = 0; i37 < i16; i37++) {
                MotionPaths motionPaths18 = motionPathsArr[i37];
                iArr4[i37] = motionPaths18.E0;
                dArr7[i37] = motionPaths18.f18749r0;
                double[] dArr9 = dArr8[i37];
                dArr9[0] = motionPaths18.f18751t0;
                dArr9[1] = motionPaths18.f18752u0;
            }
            this.f18729h = CurveFit.getArc(iArr4, dArr7, dArr8);
        }
        this.f18743w = new HashMap<>();
        if (arrayList2 != null) {
            Iterator<String> it8 = hashSet.iterator();
            float f11 = Float.NaN;
            while (it8.hasNext()) {
                String next3 = it8.next();
                KeyCycleOscillator keyCycleOscillatorMakeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next3);
                if (keyCycleOscillatorMakeWidgetCycle != null) {
                    if (keyCycleOscillatorMakeWidgetCycle.variesByPath() && Float.isNaN(f11)) {
                        float[] fArr3 = new float[2];
                        float f12 = 1.0f / 99;
                        double d3 = 0.0d;
                        float fHypot = 0.0f;
                        double d7 = 0.0d;
                        int i38 = 0;
                        for (int i39 = 100; i38 < i39; i39 = 100) {
                            float f13 = i38 * f12;
                            float f14 = f12;
                            double d10 = f13;
                            MotionPaths motionPaths19 = motionPaths16;
                            Easing easing = motionPaths19.f18747p0;
                            float f15 = Float.NaN;
                            float f16 = 0.0f;
                            for (MotionPaths motionPaths20 : arrayList6) {
                                Iterator<String> it9 = it8;
                                double d11 = d10;
                                Easing easing2 = motionPaths20.f18747p0;
                                if (easing2 != null) {
                                    float f17 = motionPaths20.f18749r0;
                                    if (f17 < f13) {
                                        easing = easing2;
                                        f16 = f17;
                                    } else if (Float.isNaN(f15)) {
                                        f15 = motionPaths20.f18749r0;
                                    }
                                }
                                it8 = it9;
                                d10 = d11;
                            }
                            Iterator<String> it10 = it8;
                            double d12 = d10;
                            if (easing != null) {
                                if (Float.isNaN(f15)) {
                                    f15 = 1.0f;
                                }
                                float f18 = f15 - f16;
                                d2 = (((float) easing.get((f13 - f16) / f18)) * f18) + f16;
                            } else {
                                d2 = d12;
                            }
                            this.f18728g[0].getPos(d2, this.m);
                            this.f18724c.b(d2, this.f18733l, this.m, fArr3, 0);
                            if (i38 > 0) {
                                c10 = 0;
                                fHypot += (float) Math.hypot(d3 - ((double) fArr3[1]), d7 - ((double) fArr3[0]));
                            } else {
                                c10 = 0;
                            }
                            d7 = fArr3[c10];
                            d3 = fArr3[1];
                            i38++;
                            f12 = f14;
                            motionPaths16 = motionPaths19;
                            it8 = it10;
                        }
                        it = it8;
                        motionPaths3 = motionPaths16;
                        f11 = fHypot;
                    } else {
                        it = it8;
                        motionPaths3 = motionPaths16;
                    }
                    keyCycleOscillatorMakeWidgetCycle.setType(next3);
                    this.f18743w.put(next3, keyCycleOscillatorMakeWidgetCycle);
                    motionPaths16 = motionPaths3;
                    it8 = it;
                }
            }
            for (MotionKey motionKey6 : arrayList2) {
                if (motionKey6 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) motionKey6).addCycleValues(this.f18743w);
                }
            }
            Iterator<KeyCycleOscillator> it11 = this.f18743w.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(f11);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.E = motion;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        MotionPaths motionPaths = this.f18724c;
        sb2.append(motionPaths.f18751t0);
        sb2.append(" y: ");
        sb2.append(motionPaths.f18752u0);
        sb2.append(" end: x: ");
        MotionPaths motionPaths2 = this.f18725d;
        sb2.append(motionPaths2.f18751t0);
        sb2.append(" y: ");
        sb2.append(motionPaths2.f18752u0);
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 == 509) {
            setPathMotionArc(i11);
            return true;
        }
        if (i10 != 610) {
            return i10 == 704;
        }
        this.B = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f6) {
        if (602 == i10) {
            this.C = f6;
            return true;
        }
        if (600 != i10) {
            return false;
        }
        this.f18730i = f6;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (705 == i10 || 611 == i10) {
            this.D = new a(Easing.getInterpolator(str));
            return true;
        }
        if (605 != i10) {
            return false;
        }
        this.f18724c.F0 = str;
        return true;
    }
}
