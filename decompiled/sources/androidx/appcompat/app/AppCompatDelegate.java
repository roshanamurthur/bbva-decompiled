package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.AnyThread;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f555p0 = new c(new d());

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f556q0 = -100;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static LocaleListCompat f557r0 = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static LocaleListCompat f558s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static Boolean f559t0 = null;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static boolean f560u0 = false;
    public static final ArraySet<WeakReference<AppCompatDelegate>> v0 = new ArraySet<>();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Object f561w0 = new Object();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Object f562x0 = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NightMode {
    }

    @RequiresApi(24)
    public static class a {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @RequiresApi(33)
    public static class b {
        @DoNotInline
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Object f563p0 = new Object();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayDeque f564q0 = new ArrayDeque();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Executor f565r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Runnable f566s0;

        public c(d dVar) {
            this.f565r0 = dVar;
        }

        public final void a() {
            synchronized (this.f563p0) {
                try {
                    Runnable runnable = (Runnable) this.f564q0.poll();
                    this.f566s0 = runnable;
                    if (runnable != null) {
                        this.f565r0.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f563p0) {
                try {
                    this.f564q0.add(new h(this, runnable, 0));
                    if (this.f566s0 == null) {
                        a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    @RequiresApi(33)
    public static Object b() {
        Context contextForDelegate;
        Iterator<WeakReference<AppCompatDelegate>> it = v0.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                return contextForDelegate.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean c(Context context) {
        if (f559t0 == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.getServiceInfo(context).metaData;
                if (bundle != null) {
                    f559t0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f559t0 = Boolean.FALSE;
            }
        }
        return f559t0.booleanValue();
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Activity activity, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, null, appCompatCallback, activity);
    }

    public static void d(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f561w0) {
            try {
                Iterator<WeakReference<AppCompatDelegate>> it = v0.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = it.next().get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(Context context) {
        if (c(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f560u0) {
                    return;
                }
                f555p0.execute(new g(context, 0));
                return;
            }
            synchronized (f562x0) {
                try {
                    LocaleListCompat localeListCompat = f557r0;
                    if (localeListCompat == null) {
                        if (f558s0 == null) {
                            f558s0 = LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
                        }
                        if (f558s0.isEmpty()) {
                        } else {
                            f557r0 = f558s0;
                        }
                    } else if (!localeListCompat.equals(f558s0)) {
                        LocaleListCompat localeListCompat2 = f557r0;
                        f558s0 = localeListCompat2;
                        AppLocalesStorageHelper.persistLocales(context, localeListCompat2.toLanguageTags());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NonNull
    @AnyThread
    public static LocaleListCompat getApplicationLocales() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objB = b();
            if (objB != null) {
                return LocaleListCompat.wrap(b.a(objB));
            }
        } else {
            LocaleListCompat localeListCompat = f557r0;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return f556q0;
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    public static void setApplicationLocales(@NonNull LocaleListCompat localeListCompat) {
        Objects.requireNonNull(localeListCompat);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objB = b();
            if (objB != null) {
                b.b(objB, a.a(localeListCompat.toLanguageTags()));
                return;
            }
            return;
        }
        if (localeListCompat.equals(f557r0)) {
            return;
        }
        synchronized (f561w0) {
            f557r0 = localeListCompat;
            Iterator<WeakReference<AppCompatDelegate>> it = v0.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.a();
                }
            }
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z10) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z10);
    }

    public static void setDefaultNightMode(int i10) {
        if ((i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) && f556q0 != i10) {
            f556q0 = i10;
            synchronized (f561w0) {
                try {
                    Iterator<WeakReference<AppCompatDelegate>> it = v0.iterator();
                    while (it.hasNext()) {
                        AppCompatDelegate appCompatDelegate = it.next().get();
                        if (appCompatDelegate != null) {
                            appCompatDelegate.applyDayNight();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    @NonNull
    @CallSuper
    public Context attachBaseContext2(@NonNull Context context) {
        attachBaseContext(context);
        return context;
    }

    public abstract View createView(@Nullable View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet);

    @Nullable
    public abstract <T extends View> T findViewById(@IdRes int i10);

    @Nullable
    public Context getContextForDelegate() {
        return null;
    }

    @Nullable
    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    @Nullable
    public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i10);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i10);

    public abstract void setContentView(@LayoutRes int i10);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z10);

    public abstract void setLocalNightMode(int i10);

    public abstract void setSupportActionBar(@Nullable Toolbar toolbar);

    public abstract void setTitle(@Nullable CharSequence charSequence);

    @Nullable
    public abstract ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback);

    @NonNull
    public static AppCompatDelegate create(@NonNull Dialog dialog, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Context context, @NonNull Window window, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, window, appCompatCallback, context);
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Context context, @NonNull Activity activity, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, null, appCompatCallback, activity);
    }

    public void a() {
    }

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    @RequiresApi(33)
    @CallSuper
    public void setOnBackInvokedDispatcher(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void setTheme(@StyleRes int i10) {
    }
}
