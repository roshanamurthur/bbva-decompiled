package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {

    public static class a extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setAlpha(get(f6));
        }
    }

    public static class b extends ViewOscillator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f19282g = new float[1];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ConstraintAttribute f19283h;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public final void setCustom(Object obj) {
            this.f19283h = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            float f10 = get(f6);
            float[] fArr = this.f19282g;
            fArr[0] = f10;
            CustomSupport.setInterpolatedValue(this.f19283h, view, fArr);
        }
    }

    public static class c extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setElevation(get(f6));
        }
    }

    public static class d extends ViewOscillator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f19284g = false;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f6));
                return;
            }
            if (this.f19284g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f19284g = true;
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

    public static class e extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setRotation(get(f6));
        }
    }

    public static class f extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setRotationX(get(f6));
        }
    }

    public static class g extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setRotationY(get(f6));
        }
    }

    public static class h extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setScaleX(get(f6));
        }
    }

    public static class i extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setScaleY(get(f6));
        }
    }

    public static class j extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setTranslationX(get(f6));
        }
    }

    public static class k extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setTranslationY(get(f6));
        }
    }

    public static class l extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f6) {
            view.setTranslationZ(get(f6));
        }
    }

    public static ViewOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        switch (str) {
            case "rotationX":
                return new f();
            case "rotationY":
                return new g();
            case "translationX":
                return new j();
            case "translationY":
                return new k();
            case "translationZ":
                return new l();
            case "progress":
                return new d();
            case "scaleX":
                return new h();
            case "scaleY":
                return new i();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new e();
            case "elevation":
                return new c();
            case "transitionPathRotate":
                return new PathRotateSet();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f6);

    public static class PathRotateSet extends ViewOscillator {
        public void setPathRotate(View view, float f6, double d2, double d3) {
            view.setRotation(get(f6) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f6) {
        }
    }
}
