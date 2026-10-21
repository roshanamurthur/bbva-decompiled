package androidx.constraintlayout.core.state;

import ad.e;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.m0;
import androidx.camera.core.processing.f;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.adobe.marketing.mobile.EventDataKeys;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public class Transition implements TypedValues {
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    public static final int START = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, HashMap<String, a>> f19037a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, WidgetState> f19038b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypedBundle f19039c = new TypedBundle();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19040d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Easing f19041e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19042f = 400;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19043g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f19044h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CorePixelDp f19045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19048l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19051p;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19064c;
    }

    public static class b {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String[] f19065r = {"top", Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, "bottom", "middle", EventDataKeys.Lifecycle.LIFECYCLE_START, "end"};

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final float[][] f19066s = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String[] f19067t = {"up", "down", Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "clockwise", "anticlockwise"};

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String[] f19068u = {"velocity", "spring"};

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String[] f19069v = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String[] f19070w = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final float[][] f19071x = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public StopEngine f19074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f19075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f19077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f19079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f19080i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19081j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f19082k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f19083l;
        public float m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f19084n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f19085o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19086p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f19087q;
    }

    public Transition(@NonNull CorePixelDp corePixelDp) {
        this.f19045i = corePixelDp;
    }

    public static Interpolator getInterpolator(int i10, String str) {
        switch (i10) {
            case -1:
                return new d(str);
            case 0:
                return new androidx.constraintlayout.core.state.a();
            case 1:
                return new androidx.camera.core.imagecapture.a();
            case 2:
                return new f();
            case 3:
                return new ad.d();
            case 4:
                return new e();
            case 5:
                return new androidx.camera.core.impl.utils.b();
            case 6:
                return new m0(1);
            default:
                return null;
        }
    }

    public void addCustomColor(int i10, String str, String str2, int i11) {
        getWidgetState(str, null, i10).getFrame(i10).addCustomColor(str2, i11);
    }

    public void addCustomFloat(int i10, String str, String str2, float f6) {
        getWidgetState(str, null, i10).getFrame(i10).addCustomFloat(str2, f6);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }

    public void calcStagger() {
        float fMin;
        float fMax;
        float f6 = this.f19043g;
        if (f6 == 0.0f) {
            return;
        }
        boolean z10 = ((double) f6) < 0.0d;
        float fAbs = Math.abs(f6);
        HashMap<String, WidgetState> map = this.f19038b;
        Iterator<String> it = map.keySet().iterator();
        do {
            fMin = Float.MAX_VALUE;
            fMax = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator<String> it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    Motion motion = map.get(it2.next()).f19055d;
                    float finalY = motion.getFinalY() + motion.getFinalX();
                    fMin = Math.min(fMin, finalY);
                    fMax = Math.max(fMax, finalY);
                }
                Iterator<String> it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    Motion motion2 = map.get(it3.next()).f19055d;
                    float finalY2 = motion2.getFinalY() + motion2.getFinalX();
                    float f10 = fMax - fMin;
                    float f11 = fAbs - (((finalY2 - fMin) * fAbs) / f10);
                    if (z10) {
                        f11 = fAbs - (((fMax - finalY2) / f10) * fAbs);
                    }
                    motion2.setStaggerScale(1.0f / (1.0f - fAbs));
                    motion2.setStaggerOffset(f11);
                }
                return;
            }
        } while (Float.isNaN(map.get(it.next()).f19055d.getMotionStagger()));
        Iterator<String> it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            float motionStagger = map.get(it4.next()).f19055d.getMotionStagger();
            if (!Float.isNaN(motionStagger)) {
                fMin = Math.min(fMin, motionStagger);
                fMax = Math.max(fMax, motionStagger);
            }
        }
        Iterator<String> it5 = map.keySet().iterator();
        while (it5.hasNext()) {
            Motion motion3 = map.get(it5.next()).f19055d;
            float motionStagger2 = motion3.getMotionStagger();
            if (!Float.isNaN(motionStagger2)) {
                float f12 = 1.0f / (1.0f - fAbs);
                float f13 = fMax - fMin;
                float f14 = fAbs - (((motionStagger2 - fMin) * fAbs) / f13);
                if (z10) {
                    f14 = fAbs - (((fMax - motionStagger2) / f13) * fAbs);
                }
                motion3.setStaggerScale(f12);
                motion3.setStaggerOffset(f14);
            }
        }
    }

    public void clear() {
        this.f19038b.clear();
    }

    public boolean contains(String str) {
        return this.f19038b.containsKey(str);
    }

    public float dragToProgress(float f6, int i10, int i11, float f10, float f11) {
        float fAbs;
        float f12;
        HashMap<String, WidgetState> map = this.f19038b;
        Iterator<WidgetState> it = map.values().iterator();
        WidgetState next = it.hasNext() ? it.next() : null;
        b bVar = this.f19044h;
        if (bVar == null || next == null) {
            if (next != null) {
                return (-f11) / next.f19061j;
            }
            return 1.0f;
        }
        String str = bVar.f19072a;
        float[][] fArr = b.f19071x;
        if (str == null) {
            float[] fArr2 = fArr[bVar.f19076e];
            float f13 = next.f19061j;
            float f14 = fArr2[0];
            return ((f14 != 0.0f ? Math.abs(f14) * f10 : Math.abs(fArr2[1]) * f11) / f13) * this.f19044h.f19077f;
        }
        WidgetState widgetState = map.get(str);
        b bVar2 = this.f19044h;
        float[] fArr3 = fArr[bVar2.f19076e];
        float[] fArr4 = b.f19066s[bVar2.f19073b];
        float[] fArr5 = new float[2];
        widgetState.interpolate(i10, i11, f6, this);
        widgetState.f19055d.getDpDt(f6, fArr4[0], fArr4[1], fArr5);
        float f15 = fArr3[0];
        if (f15 != 0.0f) {
            fAbs = Math.abs(f15) * f10;
            f12 = fArr5[0];
        } else {
            fAbs = Math.abs(fArr3[1]) * f11;
            f12 = fArr5[1];
        }
        return (fAbs / f12) * this.f19044h.f19077f;
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f19037a.get(Integer.valueOf(i11));
            if (map != null && (aVar = map.get(widgetFrame.widget.stringId)) != null) {
                fArr[i10] = aVar.f19063b;
                fArr2[i10] = aVar.f19064c;
                fArr3[i10] = aVar.f19062a;
                i10++;
            }
        }
    }

    public a findNextPosition(String str, int i10) {
        a aVar;
        while (i10 <= 100) {
            HashMap<String, a> map = this.f19037a.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10++;
        }
        return null;
    }

    public a findPreviousPosition(String str, int i10) {
        a aVar;
        while (i10 >= 0) {
            HashMap<String, a> map = this.f19037a.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10--;
        }
        return null;
    }

    public int getAutoTransition() {
        return 0;
    }

    public WidgetFrame getEnd(String str) {
        WidgetState widgetState = this.f19038b.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.f19053b;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        WidgetState widgetState = this.f19038b.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.f19054c;
    }

    public int getInterpolatedHeight() {
        return this.f19050o;
    }

    public int getInterpolatedWidth() {
        return this.f19049n;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f19038b.get(str).f19055d.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return getWidgetState(str, null, 0).f19055d;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f19037a.get(Integer.valueOf(i11));
            if (map != null && map.get(widgetFrame.widget.stringId) != null) {
                i10++;
            }
        }
        return i10;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        this.f19038b.get(str).f19055d.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        WidgetState widgetState = this.f19038b.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.f19052a;
    }

    public float getTouchUpProgress(long j10) {
        b bVar = this.f19044h;
        if (bVar != null) {
            return bVar.f19074c.isStopped() ? bVar.f19085o : bVar.f19074c.getInterpolation((j10 - bVar.f19087q) * 1.0E-9f);
        }
        return 0.0f;
    }

    public WidgetState getWidgetState(String str, ConstraintWidget constraintWidget, int i10) {
        HashMap<String, WidgetState> map = this.f19038b;
        WidgetState widgetState = map.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            TypedBundle typedBundle = this.f19039c;
            Motion motion = widgetState.f19055d;
            typedBundle.applyDelta(motion);
            widgetState.f19057f.updateMotion(motion);
            map.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i10);
            }
        }
        return widgetState;
    }

    public boolean hasOnSwipe() {
        return this.f19044h != null;
    }

    public boolean hasPositionKeyframes() {
        return this.f19037a.size() > 0;
    }

    public void interpolate(int i10, int i11, float f6) {
        if (this.f19051p) {
            int i12 = this.f19046j;
            this.f19049n = (int) (((this.f19048l - i12) * f6) + i12 + 0.5f);
            int i13 = this.f19047k;
            this.f19050o = (int) (((this.m - i13) * f6) + i13 + 0.5f);
        }
        Easing easing = this.f19041e;
        if (easing != null) {
            f6 = (float) easing.get(f6);
        }
        HashMap<String, WidgetState> map = this.f19038b;
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            map.get(it.next()).interpolate(i10, i11, f6, this);
        }
    }

    public boolean isEmpty() {
        return this.f19038b.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isFirstDownAccepted(float f6, float f10) {
        b bVar = this.f19044h;
        if (bVar == null) {
            return false;
        }
        String str = bVar.f19075d;
        if (str == null) {
            return true;
        }
        WidgetState widgetState = this.f19038b.get(str);
        if (widgetState == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        WidgetFrame frame = widgetState.getFrame(2);
        return f6 >= ((float) frame.left) && f6 < ((float) frame.right) && f10 >= ((float) frame.top) && f10 < ((float) frame.bottom);
    }

    public boolean isTouchNotDone(float f6) {
        StopEngine stopEngine;
        b bVar = this.f19044h;
        return (bVar.f19081j == 3 || (stopEngine = bVar.f19074c) == null || stopEngine.isStopped()) ? false : true;
    }

    public void setTouchUp(float f6, long j10, float f10, float f11) {
        SpringStopEngine springStopEngine;
        StopLogicEngine stopLogicEngine;
        StopLogicEngine.Decelerate decelerate;
        b bVar = this.f19044h;
        if (bVar != null) {
            WidgetState widgetState = this.f19038b.get(bVar.f19072a);
            float[] fArr = new float[2];
            b bVar2 = this.f19044h;
            float[] fArr2 = b.f19071x[bVar2.f19076e];
            float[] fArr3 = b.f19066s[bVar2.f19073b];
            widgetState.f19055d.getDpDt(f6, fArr3[0], fArr3[1], fArr);
            if (Math.abs((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            float fMax = 0.0f;
            float f12 = fArr2[0] != 0.0f ? f10 / fArr[0] : f11 / fArr[1];
            b bVar3 = this.f19044h;
            float fSignum = f12 * bVar3.f19077f;
            float f13 = this.f19042f * 0.001f;
            bVar3.f19087q = j10;
            float fAbs = Math.abs(fSignum);
            float f14 = bVar3.f19079h;
            if (fAbs > f14) {
                fSignum = Math.signum(fSignum) * f14;
            }
            float f15 = fSignum;
            float fAbs2 = (((Math.abs(f15) * 0.5f) * f15) / bVar3.f19080i) + f6;
            switch (bVar3.f19081j) {
                case 1:
                    if (f6 >= 1.0f) {
                        fMax = 1.0f;
                    }
                    break;
                case 2:
                    if (f6 > 0.0f) {
                        fMax = 1.0f;
                    }
                    break;
                case 3:
                    fMax = Float.NaN;
                    break;
                case 4:
                    fMax = Math.max(0.0f, Math.min(1.0f, fAbs2));
                    break;
                case 5:
                    if (fAbs2 > 0.2f && fAbs2 < 0.8f) {
                        fMax = fAbs2;
                    } else if (fAbs2 > 0.5f) {
                        fMax = 1.0f;
                    }
                    break;
                case 6:
                    fMax = 1.0f;
                    break;
                case 7:
                    break;
                default:
                    if (fAbs2 > 0.5d) {
                        fMax = 1.0f;
                    }
                    break;
            }
            bVar3.f19085o = fMax;
            if (fMax == f6) {
                bVar3.f19074c = null;
                return;
            }
            if (bVar3.f19081j == 4 && bVar3.f19078g == 0) {
                StopEngine stopEngine = bVar3.f19074c;
                if (stopEngine instanceof StopLogicEngine.Decelerate) {
                    decelerate = (StopLogicEngine.Decelerate) stopEngine;
                } else {
                    decelerate = new StopLogicEngine.Decelerate();
                    bVar3.f19074c = decelerate;
                }
                decelerate.config(f6, bVar3.f19085o, f15);
                return;
            }
            if (bVar3.f19078g == 0) {
                StopEngine stopEngine2 = bVar3.f19074c;
                if (stopEngine2 instanceof StopLogicEngine) {
                    stopLogicEngine = (StopLogicEngine) stopEngine2;
                } else {
                    stopLogicEngine = new StopLogicEngine();
                    bVar3.f19074c = stopLogicEngine;
                }
                stopLogicEngine.config(f6, bVar3.f19085o, f15, f13, bVar3.f19080i, bVar3.f19079h);
                return;
            }
            StopEngine stopEngine3 = bVar3.f19074c;
            if (stopEngine3 instanceof SpringStopEngine) {
                springStopEngine = (SpringStopEngine) stopEngine3;
            } else {
                springStopEngine = new SpringStopEngine();
                bVar3.f19074c = springStopEngine;
            }
            springStopEngine.springConfig(f6, bVar3.f19085o, f15, bVar3.f19082k, bVar3.f19083l, bVar3.m, bVar3.f19084n, bVar3.f19086p);
        }
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.f19039c);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i10) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        this.f19051p = z10;
        this.f19051p = z10 | (dimensionBehaviourArr[1] == dimensionBehaviour2);
        if (i10 == 0) {
            int width = constraintWidgetContainer.getWidth();
            this.f19046j = width;
            this.f19049n = width;
            int height = constraintWidgetContainer.getHeight();
            this.f19047k = height;
            this.f19050o = height;
        } else {
            this.f19048l = constraintWidgetContainer.getWidth();
            this.m = constraintWidgetContainer.getHeight();
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        WidgetState[] widgetStateArr = new WidgetState[size];
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = children.get(i11);
            WidgetState widgetState = getWidgetState(constraintWidget.stringId, null, i10);
            widgetStateArr[i11] = widgetState;
            widgetState.update(constraintWidget, i10);
            String animateRelativeTo = widgetState.f19055d.getAnimateRelativeTo();
            if (animateRelativeTo != null) {
                widgetState.setPathRelative(getWidgetState(animateRelativeTo, null, i10));
            }
        }
        calcStagger();
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle, CustomVariable[] customVariableArr) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle, customVariableArr);
    }

    public void addKeyPosition(String str, int i10, int i11, float f6, float f10) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, 2);
        typedBundle.add(100, i10);
        typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, f6);
        typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_Y, f10);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        a aVar = new a();
        aVar.f19062a = i10;
        aVar.f19063b = f6;
        aVar.f19064c = f10;
        HashMap<Integer, HashMap<String, a>> map = this.f19037a;
        HashMap<String, a> map2 = map.get(Integer.valueOf(i10));
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(Integer.valueOf(i10), map2);
        }
        map2.put(str, aVar);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, boolean z10) {
        return false;
    }

    public static class WidgetState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetFrame f19052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WidgetFrame f19053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WidgetFrame f19054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Motion f19055d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MotionWidget f19057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final MotionWidget f19058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final MotionWidget f19059h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19056e = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final KeyCache f19060i = new KeyCache();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19061j = -1;

        public WidgetState() {
            WidgetFrame widgetFrame = new WidgetFrame();
            this.f19052a = widgetFrame;
            WidgetFrame widgetFrame2 = new WidgetFrame();
            this.f19053b = widgetFrame2;
            WidgetFrame widgetFrame3 = new WidgetFrame();
            this.f19054c = widgetFrame3;
            MotionWidget motionWidget = new MotionWidget(widgetFrame);
            this.f19057f = motionWidget;
            MotionWidget motionWidget2 = new MotionWidget(widgetFrame2);
            this.f19058g = motionWidget2;
            this.f19059h = new MotionWidget(widgetFrame3);
            Motion motion = new Motion(motionWidget);
            this.f19055d = motion;
            motion.setStart(motionWidget);
            motion.setEnd(motionWidget2);
        }

        public WidgetFrame getFrame(int i10) {
            if (i10 == 0) {
                return this.f19052a;
            }
            return i10 == 1 ? this.f19053b : this.f19054c;
        }

        public void interpolate(int i10, int i11, float f6, Transition transition) {
            this.f19061j = i11;
            if (this.f19056e) {
                this.f19055d.setup(i10, i11, 1.0f, System.nanoTime());
                this.f19056e = false;
            }
            WidgetFrame.interpolate(i10, i11, this.f19054c, this.f19052a, this.f19053b, transition, f6);
            this.f19054c.interpolatedPos = f6;
            this.f19055d.interpolate(this.f19059h, f6, System.nanoTime(), this.f19060i);
        }

        public void setKeyAttribute(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.f19055d.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.f19055d.addKey(motionKeyCycle);
        }

        public void setKeyPosition(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.f19055d.addKey(motionKeyPosition);
        }

        public void setPathRelative(WidgetState widgetState) {
            this.f19055d.setupRelative(widgetState.f19055d);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void update(ConstraintWidget constraintWidget, int i10) {
            Motion motion = this.f19055d;
            if (i10 == 0) {
                this.f19052a.update(constraintWidget);
                MotionWidget motionWidget = this.f19057f;
                motionWidget.updateMotion(motionWidget);
                motion.setStart(motionWidget);
                this.f19056e = true;
                return;
            }
            if (i10 == 1) {
                this.f19053b.update(constraintWidget);
                motion.setEnd(this.f19058g);
                this.f19056e = true;
            }
        }

        public void setKeyAttribute(TypedBundle typedBundle, CustomVariable[] customVariableArr) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            if (customVariableArr != null) {
                for (int i10 = 0; i10 < customVariableArr.length; i10++) {
                    motionKeyAttributes.mCustom.put(customVariableArr[i10].getName(), customVariableArr[i10]);
                }
            }
            this.f19055d.addKey(motionKeyAttributes);
        }
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).f19053b;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).f19054c;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).f19052a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f6) {
        if (i10 != 706) {
            return false;
        }
        this.f19043g = f6;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 != 705) {
            return false;
        }
        this.f19040d = str;
        this.f19041e = Easing.getInterpolator(str);
        return false;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(0, this.f19040d);
    }
}
