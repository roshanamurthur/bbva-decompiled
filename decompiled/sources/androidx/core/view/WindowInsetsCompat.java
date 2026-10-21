package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class WindowInsetsCompat {

    @NonNull
    public static final WindowInsetsCompat CONSUMED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f20318a;

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface InsetsType {
        }

        public static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("type needs to be >= FIRST and <= LAST, type=", i10));
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int ime() {
            return 8;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return 7;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int tappableElement() {
            return 64;
        }
    }

    @RequiresApi(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f20320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Field f20321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f20322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final boolean f20323d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f20320a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f20321b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f20322c = declaredField3;
                declaredField3.setAccessible(true);
                f20323d = true;
            } catch (ReflectiveOperationException e5) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e5.getMessage(), e5);
            }
        }
    }

    @RequiresApi(30)
    public static class d extends c {
        public d() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void d(int i10, @NonNull Insets insets) {
            this.f20330c.setInsets(l.a(i10), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void e(int i10, @NonNull Insets insets) {
            this.f20330c.setInsetsIgnoringVisibility(l.a(i10), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void k(int i10, boolean z10) {
            this.f20330c.setVisible(l.a(i10), z10);
        }

        public d(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f20331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Insets[] f20332b;

        public e() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void a() {
            Insets[] insetsArr = this.f20332b;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.a(1)];
                Insets insets2 = this.f20332b[Type.a(2)];
                WindowInsetsCompat windowInsetsCompat = this.f20331a;
                if (insets2 == null) {
                    insets2 = windowInsetsCompat.getInsets(2);
                }
                if (insets == null) {
                    insets = windowInsetsCompat.getInsets(1);
                }
                i(Insets.max(insets, insets2));
                Insets insets3 = this.f20332b[Type.a(16)];
                if (insets3 != null) {
                    h(insets3);
                }
                Insets insets4 = this.f20332b[Type.a(32)];
                if (insets4 != null) {
                    f(insets4);
                }
                Insets insets5 = this.f20332b[Type.a(64)];
                if (insets5 != null) {
                    j(insets5);
                }
            }
        }

        @NonNull
        public WindowInsetsCompat b() {
            throw null;
        }

        public void d(int i10, @NonNull Insets insets) {
            if (this.f20332b == null) {
                this.f20332b = new Insets[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f20332b[Type.a(i11)] = insets;
                }
            }
        }

        public void e(int i10, @NonNull Insets insets) {
            if (i10 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void g(@NonNull Insets insets) {
            throw null;
        }

        public void i(@NonNull Insets insets) {
            throw null;
        }

        public e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f20331a = windowInsetsCompat;
        }

        public void c(@Nullable DisplayCutoutCompat displayCutoutCompat) {
        }

        public void f(@NonNull Insets insets) {
        }

        public void h(@NonNull Insets insets) {
        }

        public void j(@NonNull Insets insets) {
        }

        public void k(int i10, boolean z10) {
        }
    }

    @RequiresApi(28)
    public static class h extends g {
        public h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat a() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.f20338c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f20338c, hVar.f20338c) && Objects.equals(this.f20342g, hVar.f20342g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @Nullable
        public DisplayCutoutCompat f() {
            DisplayCutout displayCutout = this.f20338c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public int hashCode() {
            return this.f20338c.hashCode();
        }

        public h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull h hVar) {
            super(windowInsetsCompat, hVar);
        }
    }

    @RequiresApi(30)
    public static class j extends i {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public static final WindowInsetsCompat f20346q = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);

        public j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public Insets g(int i10) {
            return Insets.toCompatInsets(this.f20338c.getInsets(l.a(i10)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public Insets h(int i10) {
            return Insets.toCompatInsets(this.f20338c.getInsetsIgnoringVisibility(l.a(i10)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        public boolean q(int i10) {
            return this.f20338c.isVisible(l.a(i10));
        }

        public j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull j jVar) {
            super(windowInsetsCompat, jVar);
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        public final void d(@NonNull View view) {
        }
    }

    @RequiresApi(30)
    public static final class l {
        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            CONSUMED = j.f20346q;
        } else {
            CONSUMED = k.f20347b;
        }
    }

    @RequiresApi(20)
    private WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f20318a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f20318a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f20318a = new h(this, windowInsets);
        } else {
            this.f20318a = new g(this, windowInsets);
        }
    }

    public static Insets b(@NonNull Insets insets, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, insets.left - i10);
        int iMax2 = Math.max(0, insets.top - i11);
        int iMax3 = Math.max(0, insets.right - i12);
        int iMax4 = Math.max(0, insets.bottom - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? insets : Insets.of(iMax, iMax2, iMax3, iMax4);
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    public void a(@NonNull View view) {
        this.f20318a.d(view);
    }

    public void c(Insets[] insetsArr) {
        this.f20318a.r(insetsArr);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.f20318a.a();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        return this.f20318a.b();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.f20318a.c();
    }

    public void d(@NonNull Insets insets) {
        this.f20318a.s(insets);
    }

    public void e(@Nullable WindowInsetsCompat windowInsetsCompat) {
        this.f20318a.t(windowInsetsCompat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return ObjectsCompat.equals(this.f20318a, ((WindowInsetsCompat) obj).f20318a);
        }
        return false;
    }

    public void f(@Nullable Insets insets) {
        this.f20318a.u(insets);
    }

    @Nullable
    public DisplayCutoutCompat getDisplayCutout() {
        return this.f20318a.f();
    }

    @NonNull
    public Insets getInsets(int i10) {
        return this.f20318a.g(i10);
    }

    @NonNull
    public Insets getInsetsIgnoringVisibility(int i10) {
        return this.f20318a.h(i10);
    }

    @NonNull
    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        return this.f20318a.i();
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.f20318a.j().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.f20318a.j().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.f20318a.j().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.f20318a.j().top;
    }

    @NonNull
    @Deprecated
    public Insets getStableInsets() {
        return this.f20318a.j();
    }

    @NonNull
    @Deprecated
    public Insets getSystemGestureInsets() {
        return this.f20318a.k();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.f20318a.l().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.f20318a.l().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.f20318a.l().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.f20318a.l().top;
    }

    @NonNull
    @Deprecated
    public Insets getSystemWindowInsets() {
        return this.f20318a.l();
    }

    @NonNull
    @Deprecated
    public Insets getTappableElementInsets() {
        return this.f20318a.m();
    }

    public boolean hasInsets() {
        Insets insets = getInsets(-1);
        Insets insets2 = Insets.NONE;
        return (insets.equals(insets2) && getInsetsIgnoringVisibility((-1) ^ Type.ime()).equals(insets2) && getDisplayCutout() == null) ? false : true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.f20318a.j().equals(Insets.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.f20318a.l().equals(Insets.NONE);
    }

    public int hashCode() {
        k kVar = this.f20318a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    @NonNull
    public WindowInsetsCompat inset(@NonNull Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean isConsumed() {
        return this.f20318a.o();
    }

    public boolean isRound() {
        return this.f20318a.p();
    }

    public boolean isVisible(int i10) {
        return this.f20318a.q(i10);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int i10, int i11, int i12, int i13) {
        return new Builder(this).setSystemWindowInsets(Insets.of(i10, i11, i12, i13)).build();
    }

    @Nullable
    @RequiresApi(20)
    public WindowInsets toWindowInsets() {
        k kVar = this.f20318a;
        if (kVar instanceof f) {
            return ((f) kVar).f20338c;
        }
        return null;
    }

    @RequiresApi(api = 20)
    public static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f20324e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f20325f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f20326g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f20327h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f20328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Insets f20329d;

        public b() {
            this.f20328c = l();
        }

        @Nullable
        private static WindowInsets l() {
            if (!f20325f) {
                try {
                    f20324e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f20325f = true;
            }
            Field field = f20324e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f20327h) {
                try {
                    f20326g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f20327h = true;
            }
            Constructor<WindowInsets> constructor = f20326g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        @NonNull
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.f20328c);
            windowInsetsCompat.c(this.f20332b);
            windowInsetsCompat.f(this.f20329d);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void g(@Nullable Insets insets) {
            this.f20329d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void i(@NonNull Insets insets) {
            WindowInsets windowInsets = this.f20328c;
            if (windowInsets != null) {
                this.f20328c = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        public b(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f20328c = windowInsetsCompat.toWindowInsets();
        }
    }

    @RequiresApi(api = 29)
    public static class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f20330c;

        public c() {
            this.f20330c = androidx.appcompat.widget.o0.f();
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        @NonNull
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.f20330c.build());
            windowInsetsCompat.c(this.f20332b);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void c(@Nullable DisplayCutoutCompat displayCutoutCompat) {
            this.f20330c.setDisplayCutout(displayCutoutCompat != null ? displayCutoutCompat.f20190a : null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void f(@NonNull Insets insets) {
            this.f20330c.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void g(@NonNull Insets insets) {
            this.f20330c.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void h(@NonNull Insets insets) {
            this.f20330c.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void i(@NonNull Insets insets) {
            this.f20330c.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void j(@NonNull Insets insets) {
            this.f20330c.setTappableElementInsets(insets.toPlatformInsets());
        }

        public c(@NonNull WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderF;
            super(windowInsetsCompat);
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                builderF = androidx.appcompat.widget.c1.e(windowInsets);
            } else {
                builderF = androidx.appcompat.widget.o0.f();
            }
            this.f20330c = builderF;
        }
    }

    @RequiresApi(21)
    public static class g extends f {
        public Insets m;

        public g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat b() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.f20338c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat c() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.f20338c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public final Insets j() {
            if (this.m == null) {
                WindowInsets windowInsets = this.f20338c;
                this.m = Insets.of(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public boolean o() {
            return this.f20338c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void u(@Nullable Insets insets) {
            this.m = insets;
        }

        public g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull g gVar) {
            super(windowInsetsCompat, gVar);
            this.m = null;
            this.m = gVar.m;
        }
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets, @Nullable View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) Preconditions.checkNotNull(windowInsets));
        if (view != null && ViewCompat.isAttachedToWindow(view)) {
            windowInsetsCompat.e(ViewCompat.getRootWindowInsets(view));
            windowInsetsCompat.a(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @NonNull
    public WindowInsetsCompat inset(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @IntRange(from = 0) int i13) {
        return this.f20318a.n(i10, i11, i12, i13);
    }

    @RequiresApi(20)
    public static class f extends k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f20333h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f20334i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Class<?> f20335j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f20336k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f20337l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final WindowInsets f20338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Insets[] f20339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Insets f20340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WindowInsetsCompat f20341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Insets f20342g;

        public f(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f20340e = null;
            this.f20338c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f20334i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f20335j = cls;
                f20336k = cls.getDeclaredField("mVisibleInsets");
                f20337l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f20336k.setAccessible(true);
                f20337l.setAccessible(true);
            } catch (ReflectiveOperationException e5) {
                e5.getMessage();
            }
            f20333h = true;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private Insets v(int i10, boolean z10) {
            Insets insetsMax = Insets.NONE;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    insetsMax = Insets.max(insetsMax, w(i11, z10));
                }
            }
            return insetsMax;
        }

        private Insets x() {
            WindowInsetsCompat windowInsetsCompat = this.f20341f;
            return windowInsetsCompat != null ? windowInsetsCompat.getStableInsets() : Insets.NONE;
        }

        @Nullable
        private Insets y(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f20333h) {
                A();
            }
            Method method = f20334i;
            if (method != null && f20335j != null && f20336k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f20336k.get(f20337l.get(objInvoke));
                    if (rect != null) {
                        return Insets.of(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e5) {
                    e5.getMessage();
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void d(@NonNull View view) {
            Insets insetsY = y(view);
            if (insetsY == null) {
                insetsY = Insets.NONE;
            }
            s(insetsY);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.e(this.f20341f);
            windowInsetsCompat.d(this.f20342g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f20342g, ((f) obj).f20342g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public Insets g(int i10) {
            return v(i10, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public Insets h(int i10) {
            return v(i10, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public final Insets l() {
            if (this.f20340e == null) {
                WindowInsets windowInsets = this.f20338c;
                this.f20340e = Insets.of(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f20340e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat n(int i10, int i11, int i12, int i13) {
            Builder builder = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.f20338c));
            builder.setSystemWindowInsets(WindowInsetsCompat.b(l(), i10, i11, i12, i13));
            builder.setStableInsets(WindowInsetsCompat.b(j(), i10, i11, i12, i13));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public boolean p() {
            return this.f20338c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @SuppressLint({"WrongConstant"})
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void r(Insets[] insetsArr) {
            this.f20339d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void s(@NonNull Insets insets) {
            this.f20342g = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void t(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f20341f = windowInsetsCompat;
        }

        @NonNull
        public Insets w(int i10, boolean z10) {
            Insets stableInsets;
            int i11;
            if (i10 == 1) {
                return z10 ? Insets.of(0, Math.max(x().top, l().top), 0, 0) : Insets.of(0, l().top, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    Insets insetsX = x();
                    Insets insetsJ = j();
                    return Insets.of(Math.max(insetsX.left, insetsJ.left), 0, Math.max(insetsX.right, insetsJ.right), Math.max(insetsX.bottom, insetsJ.bottom));
                }
                Insets insetsL = l();
                WindowInsetsCompat windowInsetsCompat = this.f20341f;
                stableInsets = windowInsetsCompat != null ? windowInsetsCompat.getStableInsets() : null;
                int iMin = insetsL.bottom;
                if (stableInsets != null) {
                    iMin = Math.min(iMin, stableInsets.bottom);
                }
                return Insets.of(insetsL.left, 0, insetsL.right, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return Insets.NONE;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f20341f;
                DisplayCutoutCompat displayCutout = windowInsetsCompat2 != null ? windowInsetsCompat2.getDisplayCutout() : f();
                return displayCutout != null ? Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()) : Insets.NONE;
            }
            Insets[] insetsArr = this.f20339d;
            stableInsets = insetsArr != null ? insetsArr[Type.a(8)] : null;
            if (stableInsets != null) {
                return stableInsets;
            }
            Insets insetsL2 = l();
            Insets insetsX2 = x();
            int i12 = insetsL2.bottom;
            if (i12 > insetsX2.bottom) {
                return Insets.of(0, 0, 0, i12);
            }
            Insets insets = this.f20342g;
            return (insets == null || insets.equals(Insets.NONE) || (i11 = this.f20342g.bottom) <= insetsX2.bottom) ? Insets.NONE : Insets.of(0, 0, 0, i11);
        }

        public boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(Insets.NONE);
        }

        public f(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull f fVar) {
            this(windowInsetsCompat, new WindowInsets(fVar.f20338c));
        }
    }

    @RequiresApi(29)
    public static class i extends h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Insets f20343n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Insets f20344o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Insets f20345p;

        public i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f20343n = null;
            this.f20344o = null;
            this.f20345p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public Insets i() {
            if (this.f20344o == null) {
                this.f20344o = Insets.toCompatInsets(this.f20338c.getMandatorySystemGestureInsets());
            }
            return this.f20344o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public Insets k() {
            if (this.f20343n == null) {
                this.f20343n = Insets.toCompatInsets(this.f20338c.getSystemGestureInsets());
            }
            return this.f20343n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public Insets m() {
            if (this.f20345p == null) {
                this.f20345p = Insets.toCompatInsets(this.f20338c.getTappableElementInsets());
            }
            return this.f20345p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat n(int i10, int i11, int i12, int i13) {
            return WindowInsetsCompat.toWindowInsetsCompat(this.f20338c.inset(i10, i11, i12, i13));
        }

        public i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull i iVar) {
            super(windowInsetsCompat, iVar);
            this.f20343n = null;
            this.f20344o = null;
            this.f20345p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.k
        public void u(@Nullable Insets insets) {
        }
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(@NonNull Rect rect) {
        return new Builder(this).setSystemWindowInsets(Insets.of(rect)).build();
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f20319a;

        public Builder() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f20319a = new d();
            } else if (i10 >= 29) {
                this.f20319a = new c();
            } else {
                this.f20319a = new b();
            }
        }

        @NonNull
        public WindowInsetsCompat build() {
            return this.f20319a.b();
        }

        @NonNull
        public Builder setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
            this.f20319a.c(displayCutoutCompat);
            return this;
        }

        @NonNull
        public Builder setInsets(int i10, @NonNull Insets insets) {
            this.f20319a.d(i10, insets);
            return this;
        }

        @NonNull
        public Builder setInsetsIgnoringVisibility(int i10, @NonNull Insets insets) {
            this.f20319a.e(i10, insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setMandatorySystemGestureInsets(@NonNull Insets insets) {
            this.f20319a.f(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setStableInsets(@NonNull Insets insets) {
            this.f20319a.g(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemGestureInsets(@NonNull Insets insets) {
            this.f20319a.h(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemWindowInsets(@NonNull Insets insets) {
            this.f20319a.i(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTappableElementInsets(@NonNull Insets insets) {
            this.f20319a.j(insets);
            return this;
        }

        @NonNull
        public Builder setVisible(int i10, boolean z10) {
            this.f20319a.k(i10, z10);
            return this;
        }

        public Builder(@NonNull WindowInsetsCompat windowInsetsCompat) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f20319a = new d(windowInsetsCompat);
            } else if (i10 >= 29) {
                this.f20319a = new c(windowInsetsCompat);
            } else {
                this.f20319a = new b(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            k kVar = windowInsetsCompat.f20318a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (kVar instanceof j)) {
                this.f20318a = new j(this, (j) kVar);
            } else if (i10 >= 29 && (kVar instanceof i)) {
                this.f20318a = new i(this, (i) kVar);
            } else if (i10 >= 28 && (kVar instanceof h)) {
                this.f20318a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f20318a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f20318a = new f(this, (f) kVar);
            } else {
                this.f20318a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f20318a = new k(this);
    }

    public static class k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final WindowInsetsCompat f20347b = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f20348a;

        public k(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f20348a = windowInsetsCompat;
        }

        @NonNull
        public WindowInsetsCompat a() {
            return this.f20348a;
        }

        @NonNull
        public WindowInsetsCompat b() {
            return this.f20348a;
        }

        @NonNull
        public WindowInsetsCompat c() {
            return this.f20348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && ObjectsCompat.equals(l(), kVar.l()) && ObjectsCompat.equals(j(), kVar.j()) && ObjectsCompat.equals(f(), kVar.f());
        }

        @Nullable
        public DisplayCutoutCompat f() {
            return null;
        }

        @NonNull
        public Insets g(int i10) {
            return Insets.NONE;
        }

        @NonNull
        public Insets h(int i10) {
            if ((i10 & 8) == 0) {
                return Insets.NONE;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return ObjectsCompat.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @NonNull
        public Insets i() {
            return l();
        }

        @NonNull
        public Insets j() {
            return Insets.NONE;
        }

        @NonNull
        public Insets k() {
            return l();
        }

        @NonNull
        public Insets l() {
            return Insets.NONE;
        }

        @NonNull
        public Insets m() {
            return l();
        }

        @NonNull
        public WindowInsetsCompat n(int i10, int i11, int i12, int i13) {
            return f20347b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i10) {
            return true;
        }

        public void d(@NonNull View view) {
        }

        public void e(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        public void r(Insets[] insetsArr) {
        }

        public void s(@NonNull Insets insets) {
        }

        public void t(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void u(Insets insets) {
        }
    }
}
