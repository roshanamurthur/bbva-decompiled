package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements androidx.dynamicanimation.animation.a.b {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f21197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FloatPropertyCompat f21201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f21203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f21204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f21206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<OnAnimationEndListener> f21207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<OnAnimationUpdateListener> f21208l;
    public static final ViewProperty TRANSLATION_X = new g("translationX");
    public static final ViewProperty TRANSLATION_Y = new h("translationY");
    public static final ViewProperty TRANSLATION_Z = new i("translationZ");
    public static final ViewProperty SCALE_X = new j("scaleX");
    public static final ViewProperty SCALE_Y = new k("scaleY");
    public static final ViewProperty ROTATION = new l(Key.ROTATION);
    public static final ViewProperty ROTATION_X = new m("rotationX");
    public static final ViewProperty ROTATION_Y = new n("rotationY");
    public static final ViewProperty X = new o("x");
    public static final ViewProperty Y = new a("y");
    public static final ViewProperty Z = new b("z");
    public static final ViewProperty ALPHA = new c("alpha");
    public static final ViewProperty SCROLL_X = new d("scrollX");
    public static final ViewProperty SCROLL_Y = new e("scrollY");

    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z10, float f6, float f10);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f6, float f10);
    }

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
    }

    public static class a extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setY(f6);
        }
    }

    public static class b extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return ViewCompat.getZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            ViewCompat.setZ(view, f6);
        }
    }

    public static class c extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setAlpha(f6);
        }
    }

    public static class d extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setScrollX((int) f6);
        }
    }

    public static class e extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setScrollY((int) f6);
        }
    }

    public class f extends FloatPropertyCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FloatValueHolder f21209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FloatValueHolder floatValueHolder) {
            super("FloatValueHolder");
            this.f21209a = floatValueHolder;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return this.f21209a.getValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f6) {
            this.f21209a.setValue(f6);
        }
    }

    public static class g extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setTranslationX(f6);
        }
    }

    public static class h extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setTranslationY(f6);
        }
    }

    public static class i extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return ViewCompat.getTranslationZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            ViewCompat.setTranslationZ(view, f6);
        }
    }

    public static class j extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setScaleX(f6);
        }
    }

    public static class k extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setScaleY(f6);
        }
    }

    public static class l extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setRotation(f6);
        }
    }

    public static class m extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setRotationX(f6);
        }
    }

    public static class n extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setRotationY(f6);
        }
    }

    public static class o extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(View view, float f6) {
            view.setX(f6);
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f21210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f21211b;
    }

    public DynamicAnimation(FloatValueHolder floatValueHolder) {
        this.f21197a = 0.0f;
        this.f21198b = Float.MAX_VALUE;
        this.f21199c = false;
        this.f21202f = false;
        this.f21203g = Float.MAX_VALUE;
        this.f21204h = -3.4028235E38f;
        this.f21205i = 0L;
        this.f21207k = new ArrayList<>();
        this.f21208l = new ArrayList<>();
        this.f21200d = null;
        this.f21201e = new f(floatValueHolder);
        this.f21206j = 1.0f;
    }

    public final void a(boolean z10) {
        ArrayList<OnAnimationEndListener> arrayList;
        int i10 = 0;
        this.f21202f = false;
        ThreadLocal<androidx.dynamicanimation.animation.a> threadLocal = androidx.dynamicanimation.animation.a.f21229f;
        if (threadLocal.get() == null) {
            threadLocal.set(new androidx.dynamicanimation.animation.a());
        }
        androidx.dynamicanimation.animation.a aVar = threadLocal.get();
        aVar.f21230a.remove(this);
        ArrayList<androidx.dynamicanimation.animation.a.b> arrayList2 = aVar.f21231b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            aVar.f21234e = true;
        }
        this.f21205i = 0L;
        this.f21199c = false;
        while (true) {
            arrayList = this.f21207k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                arrayList.get(i10).onAnimationEnd(this, z10, this.f21198b, this.f21197a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
        ArrayList<OnAnimationEndListener> arrayList = this.f21207k;
        if (!arrayList.contains(onAnimationEndListener)) {
            arrayList.add(onAnimationEndListener);
        }
        return this;
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (isRunning()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList<OnAnimationUpdateListener> arrayList = this.f21208l;
        if (!arrayList.contains(onAnimationUpdateListener)) {
            arrayList.add(onAnimationUpdateListener);
        }
        return this;
    }

    public final void b(float f6) {
        ArrayList<OnAnimationUpdateListener> arrayList;
        this.f21201e.setValue(this.f21200d, f6);
        int i10 = 0;
        while (true) {
            arrayList = this.f21208l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                arrayList.get(i10).onAnimationUpdate(this, this.f21198b, this.f21197a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public abstract void c(float f6);

    public void cancel() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f21202f) {
            a(true);
        }
    }

    public abstract boolean d(long j10);

    @Override // androidx.dynamicanimation.animation.a.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean doAnimationFrame(long j10) {
        long j11 = this.f21205i;
        if (j11 == 0) {
            this.f21205i = j10;
            b(this.f21198b);
            return false;
        }
        this.f21205i = j10;
        boolean zD = d(j10 - j11);
        float fMin = Math.min(this.f21198b, this.f21203g);
        this.f21198b = fMin;
        float fMax = Math.max(fMin, this.f21204h);
        this.f21198b = fMax;
        b(fMax);
        if (zD) {
            a(false);
        }
        return zD;
    }

    public float getMinimumVisibleChange() {
        return this.f21206j;
    }

    public boolean isRunning() {
        return this.f21202f;
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
        ArrayList<OnAnimationEndListener> arrayList = this.f21207k;
        int iIndexOf = arrayList.indexOf(onAnimationEndListener);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        ArrayList<OnAnimationUpdateListener> arrayList = this.f21208l;
        int iIndexOf = arrayList.indexOf(onAnimationUpdateListener);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public T setMaxValue(float f6) {
        this.f21203g = f6;
        return this;
    }

    public T setMinValue(float f6) {
        this.f21204h = f6;
        return this;
    }

    public T setMinimumVisibleChange(@FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f21206j = f6;
        c(f6 * 0.75f);
        return this;
    }

    public T setStartValue(float f6) {
        this.f21198b = f6;
        this.f21199c = true;
        return this;
    }

    public T setStartVelocity(float f6) {
        this.f21197a = f6;
        return this;
    }

    public void start() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z10 = this.f21202f;
        if (z10 || z10) {
            return;
        }
        this.f21202f = true;
        if (!this.f21199c) {
            this.f21198b = this.f21201e.getValue(this.f21200d);
        }
        float f6 = this.f21198b;
        if (f6 > this.f21203g || f6 < this.f21204h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal<androidx.dynamicanimation.animation.a> threadLocal = androidx.dynamicanimation.animation.a.f21229f;
        if (threadLocal.get() == null) {
            threadLocal.set(new androidx.dynamicanimation.animation.a());
        }
        androidx.dynamicanimation.animation.a aVar = threadLocal.get();
        ArrayList<androidx.dynamicanimation.animation.a.b> arrayList = aVar.f21231b;
        if (arrayList.size() == 0) {
            if (aVar.f21233d == null) {
                aVar.f21233d = new androidx.dynamicanimation.animation.a.d(aVar.f21232c);
            }
            androidx.dynamicanimation.animation.a.d dVar = aVar.f21233d;
            dVar.f21237b.postFrameCallback(dVar.f21238c);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public <K> DynamicAnimation(K k10, FloatPropertyCompat<K> floatPropertyCompat) {
        this.f21197a = 0.0f;
        this.f21198b = Float.MAX_VALUE;
        this.f21199c = false;
        this.f21202f = false;
        this.f21203g = Float.MAX_VALUE;
        this.f21204h = -Float.MAX_VALUE;
        this.f21205i = 0L;
        this.f21207k = new ArrayList<>();
        this.f21208l = new ArrayList<>();
        this.f21200d = k10;
        this.f21201e = floatPropertyCompat;
        if (floatPropertyCompat != ROTATION && floatPropertyCompat != ROTATION_X && floatPropertyCompat != ROTATION_Y) {
            if (floatPropertyCompat == ALPHA) {
                this.f21206j = 0.00390625f;
                return;
            } else if (floatPropertyCompat != SCALE_X && floatPropertyCompat != SCALE_Y) {
                this.f21206j = 1.0f;
                return;
            } else {
                this.f21206j = 0.00390625f;
                return;
            }
        }
        this.f21206j = 0.1f;
    }
}
