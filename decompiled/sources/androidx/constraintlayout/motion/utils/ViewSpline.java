package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewSpline extends SplineSet {

    public static class CustomSet extends ViewSpline {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<ConstraintAttribute> f19285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f19286d;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f19285c = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i10, float f6) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f6) {
            this.mCurveFit.getPos(f6, this.f19286d);
            CustomSupport.setInterpolatedValue(this.f19285c.valueAt(0), view, this.f19286d);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i10) {
            SparseArray<ConstraintAttribute> sparseArray = this.f19285c;
            int size = sparseArray.size();
            int iNumberOfInterpolatedValues = sparseArray.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f19286d = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.f19286d);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f19286d;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, ConstraintAttribute constraintAttribute) {
            this.f19285c.append(i10, constraintAttribute);
        }
    }

    public static class a extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setAlpha(get(f6));
        }
    }

    public static class b extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setElevation(get(f6));
        }
    }

    public static class c extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setPivotX(get(f6));
        }
    }

    public static class d extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setPivotY(get(f6));
        }
    }

    public static class e extends ViewSpline {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19287c = false;

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f6));
                return;
            }
            if (this.f19287c) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f19287c = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f6)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    public static class f extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setRotation(get(f6));
        }
    }

    public static class g extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setRotationX(get(f6));
        }
    }

    public static class h extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setRotationY(get(f6));
        }
    }

    public static class i extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setScaleX(get(f6));
        }
    }

    public static class j extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setScaleY(get(f6));
        }
    }

    public static class k extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setTranslationX(get(f6));
        }
    }

    public static class l extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setTranslationY(get(f6));
        }
    }

    public static class m extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void setProperty(View view, float f6) {
            view.setTranslationZ(get(f6));
        }
    }

    public static ViewSpline makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ViewSpline makeSpline(String str) {
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
            case -797520672:
                if (str.equals(Key.WAVE_VARIES_BY)) {
                    b10 = 8;
                }
                break;
            case -760884510:
                if (str.equals(Key.PIVOT_X)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (str.equals(Key.PIVOT_Y)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    b10 = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 12;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = 15;
                }
                break;
        }
        switch (b10) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case 8:
                return new a();
            case 9:
                return new c();
            case 10:
                return new d();
            case 11:
                return new f();
            case 12:
                return new b();
            case 13:
                return new PathRotate();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f6);

    public static class PathRotate extends ViewSpline {
        public void setPathRotate(View view, float f6, double d2, double d3) {
            view.setRotation(get(f6) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f6) {
        }
    }
}
