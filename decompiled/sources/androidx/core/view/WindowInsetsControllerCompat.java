package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f20349a;

    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(@NonNull WindowInsetsControllerCompat windowInsetsControllerCompat, int i10);
    }

    @RequiresApi(23)
    public static class b extends a {
        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final boolean f() {
            return (this.f20350a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void i(boolean z10) {
            if (!z10) {
                m(8192);
                return;
            }
            Window window = this.f20350a;
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.addFlags(Integer.MIN_VALUE);
            l(8192);
        }
    }

    @RequiresApi(26)
    public static class c extends b {
        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final boolean e() {
            return (this.f20350a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void h(boolean z10) {
            if (!z10) {
                m(16);
                return;
            }
            Window window = this.f20350a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            l(16);
        }
    }

    @RequiresApi(30)
    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsControllerCompat f20352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f20353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SoftwareKeyboardControllerCompat f20354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SimpleArrayMap<OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> f20355d = new SimpleArrayMap<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Window f20356e;

        public class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public WindowInsetsAnimationControllerCompat f20357p0 = null;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsAnimationControlListenerCompat f20358q0;

            public a(WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
                this.f20358q0 = windowInsetsAnimationControlListenerCompat;
            }

            public final void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f20358q0.onCancelled(windowInsetsAnimationController == null ? null : this.f20357p0);
            }

            public final void onFinished(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f20358q0.onFinished(this.f20357p0);
            }

            public final void onReady(@NonNull WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
                WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                this.f20357p0 = windowInsetsAnimationControllerCompat;
                this.f20358q0.onReady(windowInsetsAnimationControllerCompat, i10);
            }
        }

        public d(@NonNull WindowInsetsController windowInsetsController, @NonNull WindowInsetsControllerCompat windowInsetsControllerCompat, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f20353b = windowInsetsController;
            this.f20352a = windowInsetsControllerCompat;
            this.f20354c = softwareKeyboardControllerCompat;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.view.k1, java.lang.Object] */
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
        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void a(@NonNull final OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            SimpleArrayMap<OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> simpleArrayMap = this.f20355d;
            if (simpleArrayMap.containsKey(onControllableInsetsChangedListener)) {
                return;
            }
            ?? r1 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.k1
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
                    WindowInsetsControllerCompat.d dVar = this.f20404a;
                    WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener2 = onControllableInsetsChangedListener;
                    if (dVar.f20353b == windowInsetsController) {
                        onControllableInsetsChangedListener2.onControllableInsetsChanged(dVar.f20352a, i10);
                    }
                }
            };
            simpleArrayMap.put(onControllableInsetsChangedListener, r1);
            this.f20353b.addOnControllableInsetsChangedListener(r1);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void b(int i10, long j10, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            this.f20353b.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new a(windowInsetsAnimationControlListenerCompat));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        @SuppressLint({"WrongConstant"})
        public final int c() {
            return this.f20353b.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void d(int i10) {
            if ((i10 & 8) != 0) {
                this.f20354c.hide();
            }
            this.f20353b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final boolean e() {
            return (this.f20353b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final boolean f() {
            return (this.f20353b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void g(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerB = j1.b(this.f20355d.remove(onControllableInsetsChangedListener));
            if (onControllableInsetsChangedListenerB != null) {
                this.f20353b.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerB);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void h(boolean z10) {
            Window window = this.f20356e;
            WindowInsetsController windowInsetsController = this.f20353b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void i(boolean z10) {
            Window window = this.f20356e;
            WindowInsetsController windowInsetsController = this.f20353b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void j(int i10) {
            this.f20353b.setSystemBarsBehavior(i10);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void k(int i10) {
            if ((i10 & 8) != 0) {
                this.f20354c.show();
            }
            this.f20353b.show(i10 & (-9));
        }
    }

    @RequiresApi(30)
    @Deprecated
    private WindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        this.f20349a = new d(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
    }

    @NonNull
    @RequiresApi(30)
    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f20349a.a(onControllableInsetsChangedListener);
    }

    public void controlWindowInsetsAnimation(int i10, long j10, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        this.f20349a.b(i10, j10, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
    }

    @SuppressLint({"WrongConstant"})
    public int getSystemBarsBehavior() {
        return this.f20349a.c();
    }

    public void hide(int i10) {
        this.f20349a.d(i10);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.f20349a.e();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.f20349a.f();
    }

    public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f20349a.g(onControllableInsetsChangedListener);
    }

    public void setAppearanceLightNavigationBars(boolean z10) {
        this.f20349a.h(z10);
    }

    public void setAppearanceLightStatusBars(boolean z10) {
        this.f20349a.i(z10);
    }

    public void setSystemBarsBehavior(int i10) {
        this.f20349a.j(i10);
    }

    public void show(int i10) {
        this.f20349a.k(i10);
    }

    public WindowInsetsControllerCompat(@NonNull Window window, @NonNull View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d dVar = new d(window.getInsetsController(), this, softwareKeyboardControllerCompat);
            dVar.f20356e = window;
            this.f20349a = dVar;
        } else if (i10 >= 26) {
            this.f20349a = new c(window, softwareKeyboardControllerCompat);
        } else {
            this.f20349a = new b(window, softwareKeyboardControllerCompat);
        }
    }

    @RequiresApi(20)
    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Window f20350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final SoftwareKeyboardControllerCompat f20351b;

        public a(@NonNull Window window, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f20350a = window;
            this.f20351b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final int c() {
            return 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void d(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    if (i11 == 1) {
                        l(4);
                    } else if (i11 == 2) {
                        l(2);
                    } else if (i11 == 8) {
                        this.f20351b.hide();
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void j(int i10) {
            if (i10 == 0) {
                m(6144);
                return;
            }
            if (i10 == 1) {
                m(4096);
                l(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                m(2048);
                l(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void k(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    if (i11 == 1) {
                        m(4);
                        this.f20350a.clearFlags(1024);
                    } else if (i11 == 2) {
                        m(2);
                    } else if (i11 == 8) {
                        this.f20351b.show();
                    }
                }
            }
        }

        public final void l(int i10) {
            View decorView = this.f20350a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public final void m(int i10) {
            View decorView = this.f20350a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void a(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void g(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.e
        public final void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }
    }

    public static class e {
        public void a(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            throw null;
        }

        public void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            throw null;
        }

        public int c() {
            throw null;
        }

        public void d(int i10) {
            throw null;
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            throw null;
        }

        public void g(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            throw null;
        }

        public void i(boolean z10) {
            throw null;
        }

        public void j(int i10) {
            throw null;
        }

        public void k(int i10) {
            throw null;
        }

        public void h(boolean z10) {
        }
    }
}
