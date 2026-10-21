package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {

    public static class CustomSet extends ViewTimeCycle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<ConstraintAttribute> f19289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<float[]> f19290c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f19291d;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f19288a = str.split(",")[1];
            this.f19289b = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i10, float f6, float f10, int i11, float f11) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            this.mCurveFit.getPos(f6, this.f19291d);
            float[] fArr = this.f19291d;
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            long j11 = j10 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(view, this.f19288a, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f12 = (float) ((((j11 * 1.0E-9d) * ((double) f10)) + ((double) this.mLastCycle)) % 1.0d);
            this.mLastCycle = f12;
            this.mLastTime = j10;
            float fCalcWave = calcWave(f12);
            this.mContinue = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.mContinue;
                float f13 = this.f19291d[i10];
                this.mContinue = z10 | (((double) f13) != 0.0d);
                fArr2[i10] = (f13 * fCalcWave) + f11;
                i10++;
            }
            CustomSupport.setInterpolatedValue(this.f19289b.valueAt(0), view, this.mCache);
            if (f10 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i10) {
            SparseArray<ConstraintAttribute> sparseArray = this.f19289b;
            int size = sparseArray.size();
            int iNumberOfInterpolatedValues = sparseArray.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i11 = iNumberOfInterpolatedValues + 2;
            this.f19291d = new float[i11];
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseArray.keyAt(i12);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i12);
                float[] fArrValueAt = this.f19290c.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.f19291d);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f19291d;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, ConstraintAttribute constraintAttribute, float f6, int i11, float f10) {
            this.f19289b.append(i10, constraintAttribute);
            this.f19290c.append(i10, new float[]{f6, f10});
            this.mWaveShape = Math.max(this.mWaveShape, i11);
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f6, long j10, double d2, double d3) {
            view.setRotation(get(f6, j10, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    public static class a extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setAlpha(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class b extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setElevation(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class c extends ViewTimeCycle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19292a = false;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f6, j10, view, keyCache));
            } else {
                if (this.f19292a) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f19292a = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(get(f6, j10, view, keyCache)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.mContinue;
        }
    }

    public static class d extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setRotation(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class e extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setRotationX(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class f extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setRotationY(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class g extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setScaleX(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class h extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setScaleY(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class i extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setTranslationX(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class j extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setTranslationY(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static class k extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean setProperty(View view, float f6, long j10, KeyCache keyCache) {
            view.setTranslationZ(get(f6, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewTimeCycle makeSpline(String str, long j10) {
        ViewTimeCycle eVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                eVar = new e();
                break;
            case "rotationY":
                eVar = new f();
                break;
            case "translationX":
                eVar = new i();
                break;
            case "translationY":
                eVar = new j();
                break;
            case "translationZ":
                eVar = new k();
                break;
            case "progress":
                eVar = new c();
                break;
            case "scaleX":
                eVar = new g();
                break;
            case "scaleY":
                eVar = new h();
                break;
            case "rotation":
                eVar = new d();
                break;
            case "elevation":
                eVar = new b();
                break;
            case "transitionPathRotate":
                eVar = new PathRotate();
                break;
            case "alpha":
                eVar = new a();
                break;
            default:
                return null;
        }
        eVar.setStartTime(j10);
        return eVar;
    }

    public float get(float f6, long j10, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f6, this.mCache);
        float[] fArr = this.mCache;
        float f10 = fArr[1];
        if (f10 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.mLastCycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.mLastCycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.mLastCycle = 0.0f;
            }
        }
        float f11 = (float) (((((j10 - this.mLastTime) * 1.0E-9d) * ((double) f10)) + ((double) this.mLastCycle)) % 1.0d);
        this.mLastCycle = f11;
        keyCache.setFloatValue(view, this.mType, 0, f11);
        this.mLastTime = j10;
        float f12 = this.mCache[0];
        float fCalcWave = (calcWave(this.mLastCycle) * f12) + this.mCache[2];
        this.mContinue = (f12 == 0.0f && f10 == 0.0f) ? false : true;
        return fCalcWave;
    }

    public abstract boolean setProperty(View view, float f6, long j10, KeyCache keyCache);
}
