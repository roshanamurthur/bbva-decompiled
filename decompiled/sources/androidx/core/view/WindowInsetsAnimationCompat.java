package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInsetsAnimationCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f20285a;

    @RequiresApi(21)
    public static class a extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final PathInterpolator f20290f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FastOutLinearInInterpolator f20291g = new FastOutLinearInInterpolator();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final DecelerateInterpolator f20292h = new DecelerateInterpolator();

        /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a, reason: collision with other inner class name */
        @RequiresApi(21)
        public static class ViewOnApplyWindowInsetsListenerC0073a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Callback f20293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public WindowInsetsCompat f20294b;

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a$a, reason: collision with other inner class name */
            public class C0074a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f20295a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f20296b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f20297c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f20298d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f20299e;

                public C0074a(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i10, View view) {
                    this.f20295a = windowInsetsAnimationCompat;
                    this.f20296b = windowInsetsCompat;
                    this.f20297c = windowInsetsCompat2;
                    this.f20298d = i10;
                    this.f20299e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f20295a;
                    windowInsetsAnimationCompat.setFraction(animatedFraction);
                    float interpolatedFraction = windowInsetsAnimationCompat.getInterpolatedFraction();
                    PathInterpolator pathInterpolator = a.f20290f;
                    WindowInsetsCompat windowInsetsCompat = this.f20296b;
                    WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
                    for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                        if ((this.f20298d & i10) == 0) {
                            builder.setInsets(i10, windowInsetsCompat.getInsets(i10));
                        } else {
                            Insets insets = windowInsetsCompat.getInsets(i10);
                            Insets insets2 = this.f20297c.getInsets(i10);
                            float f6 = 1.0f - interpolatedFraction;
                            builder.setInsets(i10, WindowInsetsCompat.b(insets, (int) (((double) ((insets.left - insets2.left) * f6)) + 0.5d), (int) (((double) ((insets.top - insets2.top) * f6)) + 0.5d), (int) (((double) ((insets.right - insets2.right) * f6)) + 0.5d), (int) (((double) ((insets.bottom - insets2.bottom) * f6)) + 0.5d)));
                        }
                    }
                    a.i(this.f20299e, builder.build(), Collections.singletonList(windowInsetsAnimationCompat));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a$b */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f20300a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f20301b;

                public b(WindowInsetsAnimationCompat windowInsetsAnimationCompat, View view) {
                    this.f20300a = windowInsetsAnimationCompat;
                    this.f20301b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f20300a;
                    windowInsetsAnimationCompat.setFraction(1.0f);
                    a.g(this.f20301b, windowInsetsAnimationCompat);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a$c */
            public class c implements Runnable {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ View f20302p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f20303q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ BoundsCompat f20304r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f20305s0;

                public c(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat, ValueAnimator valueAnimator) {
                    this.f20302p0 = view;
                    this.f20303q0 = windowInsetsAnimationCompat;
                    this.f20304r0 = boundsCompat;
                    this.f20305s0 = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.j(this.f20302p0, this.f20303q0, this.f20304r0);
                    this.f20305s0.start();
                }
            }

            public ViewOnApplyWindowInsetsListenerC0073a(@NonNull View view, @NonNull Callback callback) {
                this.f20293a = callback;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                this.f20294b = rootWindowInsets != null ? new WindowInsetsCompat.Builder(rootWindowInsets).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f20294b = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return a.k(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.f20294b == null) {
                    this.f20294b = ViewCompat.getRootWindowInsets(view);
                }
                if (this.f20294b == null) {
                    this.f20294b = windowInsetsCompat;
                    return a.k(view, windowInsets);
                }
                Callback callbackL = a.l(view);
                if (callbackL != null && Objects.equals(callbackL.f20288p0, windowInsets)) {
                    return a.k(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f20294b;
                int i10 = 0;
                for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                    if (!windowInsetsCompat.getInsets(i11).equals(windowInsetsCompat2.getInsets(i11))) {
                        i10 |= i11;
                    }
                }
                if (i10 == 0) {
                    return a.k(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat3 = this.f20294b;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i10, (i10 & 8) != 0 ? windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > windowInsetsCompat3.getInsets(WindowInsetsCompat.Type.ime()).bottom ? a.f20290f : a.f20291g : a.f20292h, 160L);
                windowInsetsAnimationCompat.setFraction(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.getDurationMillis());
                Insets insets = windowInsetsCompat.getInsets(i10);
                Insets insets2 = windowInsetsCompat3.getInsets(i10);
                BoundsCompat boundsCompat = new BoundsCompat(Insets.of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
                a.h(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new C0074a(windowInsetsAnimationCompat, windowInsetsCompat, windowInsetsCompat3, i10, view));
                duration.addListener(new b(windowInsetsAnimationCompat, view));
                OneShotPreDrawListener.add(view, new c(view, windowInsetsAnimationCompat, boundsCompat, duration));
                this.f20294b = windowInsetsCompat;
                return a.k(view, windowInsets);
            }
        }

        public static void g(@NonNull View view, @NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackL = l(view);
            if (callbackL != null) {
                callbackL.onEnd(windowInsetsAnimationCompat);
                if (callbackL.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    g(viewGroup.getChildAt(i10), windowInsetsAnimationCompat);
                }
            }
        }

        public static void h(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z10) {
            Callback callbackL = l(view);
            if (callbackL != null) {
                callbackL.f20288p0 = windowInsets;
                if (!z10) {
                    callbackL.onPrepare(windowInsetsAnimationCompat);
                    z10 = callbackL.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    h(viewGroup.getChildAt(i10), windowInsetsAnimationCompat, windowInsets, z10);
                }
            }
        }

        public static void i(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
            Callback callbackL = l(view);
            if (callbackL != null) {
                windowInsetsCompat = callbackL.onProgress(windowInsetsCompat, list);
                if (callbackL.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), windowInsetsCompat, list);
                }
            }
        }

        public static void j(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callbackL = l(view);
            if (callbackL != null) {
                callbackL.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (callbackL.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        @NonNull
        public static WindowInsets k(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @Nullable
        public static Callback l(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof ViewOnApplyWindowInsetsListenerC0073a) {
                return ((ViewOnApplyWindowInsetsListenerC0073a) tag).f20293a;
            }
            return null;
        }
    }

    @RequiresApi(30)
    public static class b extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public final WindowInsetsAnimation f20306f;

        @RequiresApi(30)
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Callback f20307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List<WindowInsetsAnimationCompat> f20308b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ArrayList<WindowInsetsAnimationCompat> f20309c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> f20310d;

            public a(@NonNull Callback callback) {
                super(callback.getDispatchMode());
                this.f20310d = new HashMap<>();
                this.f20307a = callback;
            }

            @NonNull
            public final WindowInsetsAnimationCompat a(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f20310d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        windowInsetsAnimationCompat.f20285a = new b(windowInsetsAnimation);
                    }
                    this.f20310d.put(windowInsetsAnimation, windowInsetsAnimationCompat);
                }
                return windowInsetsAnimationCompat;
            }

            public final void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f20307a.onEnd(a(windowInsetsAnimation));
                this.f20310d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f20307a.onPrepare(a(windowInsetsAnimation));
            }

            @NonNull
            public final WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.f20309c;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.f20309c = arrayList2;
                    this.f20308b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationB = o0.b(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatA = a(windowInsetsAnimationB);
                    windowInsetsAnimationCompatA.setFraction(windowInsetsAnimationB.getFraction());
                    this.f20309c.add(windowInsetsAnimationCompatA);
                }
                return this.f20307a.onProgress(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.f20308b).toWindowInsets();
            }

            @NonNull
            public final WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                return this.f20307a.onStart(a(windowInsetsAnimation), BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }
        }

        public b(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f20306f = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.c
        public final long a() {
            return this.f20306f.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.c
        public final float b() {
            return this.f20306f.getFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.c
        public final float c() {
            return this.f20306f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.c
        @Nullable
        public final Interpolator d() {
            return this.f20306f.getInterpolator();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.c
        public final int e() {
            return this.f20306f.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.c
        public final void f(float f6) {
            this.f20306f.setFraction(f6);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f20312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Interpolator f20313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f20314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f20315e;

        public c(int i10, @Nullable Interpolator interpolator, long j10) {
            this.f20311a = i10;
            this.f20313c = interpolator;
            this.f20314d = j10;
        }

        public long a() {
            return this.f20314d;
        }

        public float b() {
            return this.f20312b;
        }

        public float c() {
            Interpolator interpolator = this.f20313c;
            return interpolator != null ? interpolator.getInterpolation(this.f20312b) : this.f20312b;
        }

        @Nullable
        public Interpolator d() {
            return this.f20313c;
        }

        public int e() {
            return this.f20311a;
        }

        public void f(float f6) {
            this.f20312b = f6;
        }
    }

    public WindowInsetsAnimationCompat(int i10, @Nullable Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20285a = new b(n0.b(i10, interpolator, j10));
        } else {
            this.f20285a = new a(i10, interpolator, j10);
        }
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAlpha() {
        return this.f20285a.f20315e;
    }

    public long getDurationMillis() {
        return this.f20285a.a();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getFraction() {
        return this.f20285a.b();
    }

    public float getInterpolatedFraction() {
        return this.f20285a.c();
    }

    @Nullable
    public Interpolator getInterpolator() {
        return this.f20285a.d();
    }

    public int getTypeMask() {
        return this.f20285a.e();
    }

    public void setAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f20285a.f20315e = f6;
    }

    public void setFraction(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f20285a.f(f6);
    }

    public static final class BoundsCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Insets f20286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Insets f20287b;

        public BoundsCompat(@NonNull Insets insets, @NonNull Insets insets2) {
            this.f20286a = insets;
            this.f20287b = insets2;
        }

        @NonNull
        @RequiresApi(30)
        public static BoundsCompat toBoundsCompat(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }

        @NonNull
        public Insets getLowerBound() {
            return this.f20286a;
        }

        @NonNull
        public Insets getUpperBound() {
            return this.f20287b;
        }

        @NonNull
        public BoundsCompat inset(@NonNull Insets insets) {
            return new BoundsCompat(WindowInsetsCompat.b(this.f20286a, insets.left, insets.top, insets.right, insets.bottom), WindowInsetsCompat.b(this.f20287b, insets.left, insets.top, insets.right, insets.bottom));
        }

        @NonNull
        @RequiresApi(30)
        public WindowInsetsAnimation.Bounds toBounds() {
            f0.e();
            return e0.c(getLowerBound().toPlatformInsets(), getUpperBound().toPlatformInsets());
        }

        public String toString() {
            return "Bounds{lower=" + this.f20286a + " upper=" + this.f20287b + "}";
        }

        @RequiresApi(30)
        public BoundsCompat(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.f20286a = Insets.toCompatInsets(bounds.getLowerBound());
            this.f20287b = Insets.toCompatInsets(bounds.getUpperBound());
        }
    }

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        WindowInsets f20288p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        private final int f20289q0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DispatchMode {
        }

        public Callback(int i10) {
            this.f20289q0 = i10;
        }

        public final int getDispatchMode() {
            return this.f20289q0;
        }

        @NonNull
        public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list);

        public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        @NonNull
        public BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }
}
