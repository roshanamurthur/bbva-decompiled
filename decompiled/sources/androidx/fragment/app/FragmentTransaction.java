package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.camera.camera2.internal.h0;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE = 8197;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN = 4100;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentFactory f21623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f21624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<a> f21625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f21633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21634l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f21636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f21637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<String> f21638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Runnable> f21640s;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f21642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f21643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Lifecycle.State f21648h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Lifecycle.State f21649i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f21641a = i10;
            this.f21642b = fragment;
            this.f21643c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f21648h = state;
            this.f21649i = state;
        }

        public a(int i10, Fragment fragment, int i11) {
            this.f21641a = i10;
            this.f21642b = fragment;
            this.f21643c = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f21648h = state;
            this.f21649i = state;
        }
    }

    @Deprecated
    public FragmentTransaction() {
        this.f21625c = new ArrayList<>();
        this.f21632j = true;
        this.f21639r = false;
        this.f21623a = null;
        this.f21624b = null;
    }

    @NonNull
    public final FragmentTransaction add(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(c(bundle, cls), str);
    }

    @NonNull
    public FragmentTransaction addSharedElement(@NonNull View view, @NonNull String str) {
        if (w.f21780a != null || w.f21781b != null) {
            String transitionName = ViewCompat.getTransitionName(view);
            if (transitionName == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f21637p == null) {
                this.f21637p = new ArrayList<>();
                this.f21638q = new ArrayList<>();
            } else {
                if (this.f21638q.contains(str)) {
                    throw new IllegalArgumentException(h0.b("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                if (this.f21637p.contains(transitionName)) {
                    throw new IllegalArgumentException(h0.b("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
                }
            }
            this.f21637p.add(transitionName);
            this.f21638q.add(str);
        }
        return this;
    }

    @NonNull
    public FragmentTransaction addToBackStack(@Nullable String str) {
        if (!this.f21632j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f21631i = true;
        this.f21633k = str;
        return this;
    }

    @NonNull
    public FragmentTransaction attach(@NonNull Fragment fragment) {
        b(new a(7, fragment));
        return this;
    }

    public final void b(a aVar) {
        this.f21625c.add(aVar);
        aVar.f21644d = this.f21626d;
        aVar.f21645e = this.f21627e;
        aVar.f21646f = this.f21628f;
        aVar.f21647g = this.f21629g;
    }

    @NonNull
    public final Fragment c(@Nullable Bundle bundle, @NonNull Class cls) {
        FragmentFactory fragmentFactory = this.f21623a;
        if (fragmentFactory == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f21624b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    public void d(int i10, Fragment fragment, @Nullable String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(androidx.collection.f.c(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        b(new a(i11, fragment));
    }

    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        b(new a(6, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction disallowAddToBackStack() {
        if (this.f21631i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f21632j = false;
        return this;
    }

    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        b(new a(4, fragment));
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.f21632j;
    }

    public boolean isEmpty() {
        return this.f21625c.isEmpty();
    }

    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment) {
        b(new a(3, fragment));
        return this;
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return replace(i10, cls, bundle, null);
    }

    @NonNull
    public FragmentTransaction runOnCommit(@NonNull Runnable runnable) {
        disallowAddToBackStack();
        if (this.f21640s == null) {
            this.f21640s = new ArrayList<>();
        }
        this.f21640s.add(runnable);
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setAllowOptimization(boolean z10) {
        return setReorderingAllowed(z10);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@StringRes int i10) {
        this.f21635n = i10;
        this.f21636o = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@StringRes int i10) {
        this.f21634l = i10;
        this.m = null;
        return this;
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11) {
        return setCustomAnimations(i10, i11, 0, 0);
    }

    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        a aVar = new a();
        aVar.f21641a = 10;
        aVar.f21642b = fragment;
        aVar.f21643c = false;
        aVar.f21648h = fragment.mMaxState;
        aVar.f21649i = state;
        b(aVar);
        return this;
    }

    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        b(new a(8, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction setReorderingAllowed(boolean z10) {
        this.f21639r = z10;
        return this;
    }

    @NonNull
    public FragmentTransaction setTransition(int i10) {
        this.f21630h = i10;
        return this;
    }

    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        b(new a(5, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction add(@NonNull Fragment fragment, @Nullable String str) {
        d(0, fragment, str, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int i10, @NonNull Fragment fragment) {
        return replace(i10, fragment, (String) null);
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13) {
        this.f21626d = i10;
        this.f21627e = i11;
        this.f21628f = i12;
        this.f21629g = i13;
        return this;
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return add(i10, c(bundle, cls));
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return replace(i10, c(bundle, cls), str);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@Nullable CharSequence charSequence) {
        this.f21635n = 0;
        this.f21636o = charSequence;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@Nullable CharSequence charSequence) {
        this.f21634l = 0;
        this.m = charSequence;
        return this;
    }

    @NonNull
    public FragmentTransaction add(@IdRes int i10, @NonNull Fragment fragment) {
        d(i10, fragment, null, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int i10, @NonNull Fragment fragment, @Nullable String str) {
        if (i10 != 0) {
            d(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(i10, c(bundle, cls), str);
    }

    @NonNull
    public FragmentTransaction add(@IdRes int i10, @NonNull Fragment fragment, @Nullable String str) {
        d(i10, fragment, str, 1);
        return this;
    }

    public FragmentTransaction(@NonNull FragmentFactory fragmentFactory, @Nullable ClassLoader classLoader) {
        this.f21625c = new ArrayList<>();
        this.f21632j = true;
        this.f21639r = false;
        this.f21623a = fragmentFactory;
        this.f21624b = classLoader;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setTransitionStyle(@StyleRes int i10) {
        return this;
    }
}
