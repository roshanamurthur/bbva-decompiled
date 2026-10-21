package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.PermissionChecker;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.google.android.material.internal.ViewUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    public static final SimpleArrayMap<String, Integer> C1 = new SimpleArrayMap<>();
    public static final int[] D1 = {R.attr.windowBackground};
    public static final boolean E1 = !"robolectric".equals(Build.FINGERPRINT);
    public OnBackInvokedDispatcher A1;
    public OnBackInvokedCallback B1;
    public final Context E0;
    public Window F0;
    public i G0;
    public final AppCompatCallback H0;
    public ActionBar I0;
    public SupportMenuInflater J0;
    public CharSequence K0;
    public DecorContentParent L0;
    public d M0;
    public n N0;
    public ActionMode O0;
    public ActionBarContextView P0;
    public PopupWindow Q0;
    public androidx.appcompat.app.l R0;
    public boolean U0;
    public ViewGroup V0;
    public TextView W0;
    public View X0;
    public boolean Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f567a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f568b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f569c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f570d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f571e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f572f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public PanelFeatureState[] f573g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public PanelFeatureState f574h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f575i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f576j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f577k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f578l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Configuration f579m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f580n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f581o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f582p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f583q1;
    public l r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public j f584s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f585t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f586u1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f588w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public Rect f589x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Object f590y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public Rect f591y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public AppCompatViewInflater f592z1;
    public ViewPropertyAnimatorCompat S0 = null;
    public boolean T0 = true;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final a f587v1 = new a();

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m f597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f598f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public MenuBuilder f600h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ListMenuPresenter f601i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ContextThemeWrapper f602j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f603k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f604l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f605n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f606o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Bundle f607p;
        public boolean qwertyMode;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f608p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public boolean f609q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public Bundle f610r0;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i10) {
                    return new SavedState[i10];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f608p0 = parcel.readInt();
                boolean z10 = parcel.readInt() == 1;
                savedState.f609q0 = z10;
                if (z10) {
                    savedState.f610r0 = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f608p0);
                parcel.writeInt(this.f609q0 ? 1 : 0);
                if (this.f609q0) {
                    parcel.writeBundle(this.f610r0);
                }
            }
        }

        public void clearMenuPresenters() {
            MenuBuilder menuBuilder = this.f600h;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.f601i);
            }
            this.f601i = null;
        }

        public boolean hasPanelItems() {
            if (this.f598f == null) {
                return false;
            }
            return this.f599g != null || this.f601i.getAdapter().getCount() > 0;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f586u1 & 1) != 0) {
                appCompatDelegateImpl.n(0);
            }
            if ((appCompatDelegateImpl.f586u1 & 4096) != 0) {
                appCompatDelegateImpl.n(108);
            }
            appCompatDelegateImpl.f585t1 = false;
            appCompatDelegateImpl.f586u1 = 0;
        }
    }

    public class b implements ActionBarDrawerToggle.Delegate {
        public b() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.q();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Drawable getThemeUpIndicator() {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(AppCompatDelegateImpl.this.q(), (AttributeSet) null, new int[]{androidx.appcompat.R.attr.homeAsUpIndicator});
            Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(0);
            tintTypedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final boolean isNavigationVisible() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.u();
            ActionBar actionBar = appCompatDelegateImpl.I0;
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void setActionBarDescription(int i10) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.u();
            ActionBar actionBar = appCompatDelegateImpl.I0;
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void setActionBarUpIndicator(Drawable drawable, int i10) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.u();
            ActionBar actionBar = appCompatDelegateImpl.I0;
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }
    }

    public interface c {
    }

    public final class d implements MenuPresenter.Callback {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z10) {
            AppCompatDelegateImpl.this.j(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            Window.Callback callback = AppCompatDelegateImpl.this.F0.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public class e implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f614a;

        public class a extends ViewPropertyAnimatorListenerAdapter {
            public a() {
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void onAnimationEnd(View view) {
                e eVar = e.this;
                AppCompatDelegateImpl.this.P0.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.Q0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.P0.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.P0.getParent());
                }
                AppCompatDelegateImpl.this.P0.killMode();
                AppCompatDelegateImpl.this.S0.setListener(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.S0 = null;
                ViewCompat.requestApplyInsets(appCompatDelegateImpl2.V0);
            }
        }

        public e(ActionMode.Callback callback) {
            this.f614a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f614a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f614a.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f614a.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.Q0 != null) {
                appCompatDelegateImpl.F0.getDecorView().removeCallbacks(appCompatDelegateImpl.R0);
            }
            if (appCompatDelegateImpl.P0 != null) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.S0;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.cancel();
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(appCompatDelegateImpl.P0).alpha(0.0f);
                appCompatDelegateImpl.S0 = viewPropertyAnimatorCompatAlpha;
                viewPropertyAnimatorCompatAlpha.setListener(new a());
            }
            AppCompatCallback appCompatCallback = appCompatDelegateImpl.H0;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl.O0);
            }
            appCompatDelegateImpl.O0 = null;
            ViewCompat.requestApplyInsets(appCompatDelegateImpl.V0);
            appCompatDelegateImpl.B();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.V0);
            return this.f614a.onPrepareActionMode(actionMode, menu);
        }
    }

    @RequiresApi(21)
    public static class f {
        @DoNotInline
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @RequiresApi(24)
    public static class g {
        @DoNotInline
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @DoNotInline
        public static LocaleListCompat b(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }

        @DoNotInline
        public static void c(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }

        @DoNotInline
        public static void d(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }
    }

    @RequiresApi(33)
    public static class h {
        @DoNotInline
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.a0] */
        @DoNotInline
        public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            ?? r1 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.a0
                public final void onBackInvoked() {
                    appCompatDelegateImpl.w();
                }
            };
            x.b(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, r1);
            return r1;
        }

        @DoNotInline
        public static void c(Object obj, Object obj2) {
            x.b(obj).unregisterOnBackInvokedCallback(w.b(obj2));
        }
    }

    public class i extends WindowCallbackWrapper {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public c f617q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f618r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f619s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f620t0;

        public i(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f618r0 = true;
                callback.onContentChanged();
            } finally {
                this.f618r0 = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f619s0) {
                return getWrapped().dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.m(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.u();
            ActionBar actionBar = appCompatDelegateImpl.I0;
            if (actionBar != null && actionBar.onKeyShortcut(keyCode, keyEvent)) {
                return true;
            }
            PanelFeatureState panelFeatureState = appCompatDelegateImpl.f574h1;
            if (panelFeatureState != null && appCompatDelegateImpl.y(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.f574h1;
                if (panelFeatureState2 == null) {
                    return true;
                }
                panelFeatureState2.f604l = true;
                return true;
            }
            if (appCompatDelegateImpl.f574h1 == null) {
                PanelFeatureState panelFeatureStateT = appCompatDelegateImpl.t(0);
                appCompatDelegateImpl.z(panelFeatureStateT, keyEvent);
                boolean zY = appCompatDelegateImpl.y(panelFeatureStateT, keyEvent.getKeyCode(), keyEvent);
                panelFeatureStateT.f603k = false;
                if (zY) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f618r0) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            c cVar = this.f617q0;
            if (cVar != null) {
                View view = i10 == 0 ? new View(e0.this.f709a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i10);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i10 == 108) {
                appCompatDelegateImpl.u();
                ActionBar actionBar = appCompatDelegateImpl.I0;
                if (actionBar != null) {
                    actionBar.dispatchMenuVisibilityChanged(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f620t0) {
                getWrapped().onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i10 == 108) {
                appCompatDelegateImpl.u();
                ActionBar actionBar = appCompatDelegateImpl.I0;
                if (actionBar != null) {
                    actionBar.dispatchMenuVisibilityChanged(false);
                    return;
                }
                return;
            }
            if (i10 != 0) {
                appCompatDelegateImpl.getClass();
                return;
            }
            PanelFeatureState panelFeatureStateT = appCompatDelegateImpl.t(i10);
            if (panelFeatureStateT.m) {
                appCompatDelegateImpl.k(panelFeatureStateT, false);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i10 == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            c cVar = this.f617q0;
            if (cVar != null) {
                e0.e eVar = (e0.e) cVar;
                if (i10 == 0) {
                    e0 e0Var = e0.this;
                    if (!e0Var.f712d) {
                        e0Var.f709a.setMenuPrepared();
                        e0Var.f712d = true;
                    }
                }
            }
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        @RequiresApi(24)
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.t(0).f600h;
            if (menuBuilder != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        @RequiresApi(23)
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i10) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.T0 || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(appCompatDelegateImpl.E0, callback);
            ActionMode actionModeStartSupportActionMode = appCompatDelegateImpl.startSupportActionMode(callbackWrapper);
            if (actionModeStartSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(actionModeStartSupportActionMode);
            }
            return null;
        }
    }

    public class j extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f622c;

        public j(Context context) {
            super();
            this.f622c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.k
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.k
        public final int c() {
            return f.a(this.f622c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.k
        public final void d() {
            AppCompatDelegateImpl.this.f(true, true);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public abstract class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f624a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                k.this.d();
            }
        }

        public k() {
        }

        public final void a() {
            a aVar = this.f624a;
            if (aVar != null) {
                try {
                    AppCompatDelegateImpl.this.E0.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f624a = null;
            }
        }

        @Nullable
        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f624a == null) {
                this.f624a = new a();
            }
            AppCompatDelegateImpl.this.E0.registerReceiver(this.f624a, intentFilterB);
        }
    }

    public class l extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f627c;

        public l(g0 g0Var) {
            super();
            this.f627c = g0Var;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.k
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        @Override // androidx.appcompat.app.AppCompatDelegateImpl.k
        public final int c() {
            Location lastKnownLocation;
            long j10;
            boolean z10;
            g0 g0Var = this.f627c;
            g0.a aVar = g0Var.f734c;
            if (aVar.f736b <= System.currentTimeMillis()) {
                Context context = g0Var.f732a;
                int iCheckSelfPermission = PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation2 = null;
                LocationManager locationManager = g0Var.f733b;
                if (iCheckSelfPermission == 0) {
                    try {
                        if (locationManager.isProviderEnabled(DeepLinkListenerAdapter.Constants.ERROR_NETWORK)) {
                            lastKnownLocation = locationManager.getLastKnownLocation(DeepLinkListenerAdapter.Constants.ERROR_NETWORK);
                        } else {
                            lastKnownLocation = null;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    lastKnownLocation = null;
                }
                if (PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                    lastKnownLocation = lastKnownLocation2;
                }
                if (lastKnownLocation != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (f0.f725d == null) {
                        f0.f725d = new f0();
                    }
                    f0 f0Var = f0.f725d;
                    f0Var.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                    f0Var.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                    boolean z11 = f0Var.f728c == 1;
                    long j11 = f0Var.f727b;
                    long j12 = f0Var.f726a;
                    f0Var.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 86400000 + jCurrentTimeMillis);
                    long j13 = f0Var.f727b;
                    if (j11 == -1 || j12 == -1) {
                        j10 = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis <= j12) {
                            j13 = jCurrentTimeMillis > j11 ? j12 : j11;
                        }
                        j10 = j13 + 60000;
                    }
                    aVar.f735a = z11;
                    aVar.f736b = j10;
                    z10 = z11;
                } else {
                    int i10 = Calendar.getInstance().get(11);
                    if (i10 >= 6 && i10 < 22) {
                        return 1;
                    }
                }
            }
            z10 = aVar.f735a;
            return z10 ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.k
        public final void d() {
            AppCompatDelegateImpl.this.f(true, true);
        }
    }

    public class m extends ContentFrameLayout {
        public m(ContextThemeWrapper contextThemeWrapper) {
            super(contextThemeWrapper);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x4 = (int) motionEvent.getX();
                int y7 = (int) motionEvent.getY();
                if (x4 < -5 || y7 < -5 || x4 > getWidth() + 5 || y7 > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.k(appCompatDelegateImpl.t(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i10));
        }
    }

    public final class n implements MenuPresenter.Callback {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z10) {
            PanelFeatureState panelFeatureState;
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            int i10 = 0;
            boolean z11 = rootMenu != menuBuilder;
            if (z11) {
                menuBuilder = rootMenu;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.f573g1;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i10 < length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                    if (panelFeatureState != null && panelFeatureState.f600h == menuBuilder) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                if (!z11) {
                    appCompatDelegateImpl.k(panelFeatureState, z10);
                } else {
                    appCompatDelegateImpl.i(panelFeatureState.f593a, panelFeatureState, rootMenu);
                    appCompatDelegateImpl.k(panelFeatureState, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            Window.Callback callback;
            if (menuBuilder != menuBuilder.getRootMenu()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f567a1 || (callback = appCompatDelegateImpl.F0.getCallback()) == null || appCompatDelegateImpl.f578l1) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        AppCompatActivity appCompatActivity = null;
        this.f580n1 = -100;
        this.E0 = context;
        this.H0 = appCompatCallback;
        this.f590y0 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f580n1 = appCompatActivity.getDelegate().getLocalNightMode();
            }
        }
        if (this.f580n1 == -100 && (num = (simpleArrayMap = C1).get(this.f590y0.getClass().getName())) != null) {
            this.f580n1 = num.intValue();
            simpleArrayMap.remove(this.f590y0.getClass().getName());
        }
        if (window != null) {
            g(window);
        }
        AppCompatDrawableManager.preload();
    }

    @Nullable
    public static LocaleListCompat h(@NonNull Context context) {
        LocaleListCompat localeListCompat;
        LocaleListCompat emptyLocaleList;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (localeListCompat = AppCompatDelegate.f557r0) == null) {
            return null;
        }
        LocaleListCompat localeListCompatS = s(context.getApplicationContext().getResources().getConfiguration());
        int i11 = 0;
        if (i10 < 24) {
            emptyLocaleList = localeListCompat.isEmpty() ? LocaleListCompat.getEmptyLocaleList() : LocaleListCompat.forLanguageTags(f.b(localeListCompat.get(0)));
        } else if (localeListCompat.isEmpty()) {
            emptyLocaleList = LocaleListCompat.getEmptyLocaleList();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < localeListCompatS.size() + localeListCompat.size()) {
                Locale locale = i11 < localeListCompat.size() ? localeListCompat.get(i11) : localeListCompatS.get(i11 - localeListCompat.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            emptyLocaleList = LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return emptyLocaleList.isEmpty() ? localeListCompatS : emptyLocaleList;
    }

    @NonNull
    public static Configuration l(@NonNull Context context, int i10, @Nullable LocaleListCompat localeListCompat, @Nullable Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                g.d(configuration2, localeListCompat);
            } else {
                configuration2.setLocale(localeListCompat.get(0));
                configuration2.setLayoutDirection(localeListCompat.get(0));
            }
        }
        return configuration2;
    }

    public static LocaleListCompat s(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? g.b(configuration) : LocaleListCompat.forLanguageTags(f.b(configuration.locale));
    }

    public final void A() {
        if (this.U0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void B() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.A1 != null && (t(0).m || this.O0 != null)) {
                z10 = true;
            }
            if (z10 && this.B1 == null) {
                this.B1 = h.b(this.A1, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.B1) == null) {
                    return;
                }
                h.c(this.A1, onBackInvokedCallback);
                this.B1 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void a() {
        LocaleListCompat localeListCompat;
        Context context = this.E0;
        if (AppCompatDelegate.c(context) && (localeListCompat = AppCompatDelegate.f557r0) != null && !localeListCompat.equals(AppCompatDelegate.f558s0)) {
            AppCompatDelegate.f555p0.execute(new androidx.appcompat.app.f(context, 0));
        }
        f(true, true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        ((ViewGroup) this.V0.findViewById(R.id.content)).addView(view, layoutParams);
        this.G0.a(this.F0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean applyDayNight() {
        return f(true, true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @NonNull
    @CallSuper
    public final Context attachBaseContext2(@NonNull Context context) {
        this.f576j1 = true;
        int defaultNightMode = this.f580n1;
        if (defaultNightMode == -100) {
            defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        }
        int iV = v(context, defaultNightMode);
        if (AppCompatDelegate.c(context)) {
            AppCompatDelegate.e(context);
        }
        LocaleListCompat localeListCompatH = h(context);
        Configuration configuration = null;
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(l(context, iV, localeListCompatH, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(l(context, iV, localeListCompatH, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!E1) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f6 = configuration3.fontScale;
                float f10 = configuration4.fontScale;
                if (f6 != f10) {
                    configuration.fontScale = f10;
                }
                int i10 = configuration3.mcc;
                int i11 = configuration4.mcc;
                if (i10 != i11) {
                    configuration.mcc = i11;
                }
                int i12 = configuration3.mnc;
                int i13 = configuration4.mnc;
                if (i12 != i13) {
                    configuration.mnc = i13;
                }
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 24) {
                    g.a(configuration3, configuration4, configuration);
                } else if (!ObjectsCompat.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i15 = configuration3.touchscreen;
                int i16 = configuration4.touchscreen;
                if (i15 != i16) {
                    configuration.touchscreen = i16;
                }
                int i17 = configuration3.keyboard;
                int i18 = configuration4.keyboard;
                if (i17 != i18) {
                    configuration.keyboard = i18;
                }
                int i19 = configuration3.keyboardHidden;
                int i20 = configuration4.keyboardHidden;
                if (i19 != i20) {
                    configuration.keyboardHidden = i20;
                }
                int i21 = configuration3.navigation;
                int i22 = configuration4.navigation;
                if (i21 != i22) {
                    configuration.navigation = i22;
                }
                int i23 = configuration3.navigationHidden;
                int i24 = configuration4.navigationHidden;
                if (i23 != i24) {
                    configuration.navigationHidden = i24;
                }
                int i25 = configuration3.orientation;
                int i26 = configuration4.orientation;
                if (i25 != i26) {
                    configuration.orientation = i26;
                }
                int i27 = configuration3.screenLayout & 15;
                int i28 = configuration4.screenLayout & 15;
                if (i27 != i28) {
                    configuration.screenLayout |= i28;
                }
                int i29 = configuration3.screenLayout & 192;
                int i30 = configuration4.screenLayout & 192;
                if (i29 != i30) {
                    configuration.screenLayout |= i30;
                }
                int i31 = configuration3.screenLayout & 48;
                int i32 = configuration4.screenLayout & 48;
                if (i31 != i32) {
                    configuration.screenLayout |= i32;
                }
                int i33 = configuration3.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                int i34 = configuration4.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                if (i33 != i34) {
                    configuration.screenLayout |= i34;
                }
                if (i14 >= 26) {
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                }
                int i35 = configuration3.uiMode & 15;
                int i36 = configuration4.uiMode & 15;
                if (i35 != i36) {
                    configuration.uiMode |= i36;
                }
                int i37 = configuration3.uiMode & 48;
                int i38 = configuration4.uiMode & 48;
                if (i37 != i38) {
                    configuration.uiMode |= i38;
                }
                int i39 = configuration3.screenWidthDp;
                int i40 = configuration4.screenWidthDp;
                if (i39 != i40) {
                    configuration.screenWidthDp = i40;
                }
                int i41 = configuration3.screenHeightDp;
                int i42 = configuration4.screenHeightDp;
                if (i41 != i42) {
                    configuration.screenHeightDp = i42;
                }
                int i43 = configuration3.smallestScreenWidthDp;
                int i44 = configuration4.smallestScreenWidthDp;
                if (i43 != i44) {
                    configuration.smallestScreenWidthDp = i44;
                }
                int i45 = configuration3.densityDpi;
                int i46 = configuration4.densityDpi;
                if (i45 != i46) {
                    configuration.densityDpi = i46;
                }
            }
        }
        Configuration configurationL = l(context, iV, localeListCompatH, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, androidx.appcompat.R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(configurationL);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(contextThemeWrapper);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        if (this.f592z1 == null) {
            int[] iArr = androidx.appcompat.R.styleable.AppCompatTheme;
            Context context2 = this.E0;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f592z1 = new AppCompatViewInflater();
            } else {
                try {
                    this.f592z1 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.f592z1 = new AppCompatViewInflater();
                }
            }
        }
        return this.f592z1.createView(view, str, context, attributeSet, false, false, true, VectorEnabledTintResources.shouldBeUsed());
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        boolean z15;
        Object obj2;
        boolean z16;
        Object obj3;
        int i11;
        if (this.f578l1) {
            return false;
        }
        int defaultNightMode = this.f580n1;
        if (defaultNightMode == -100) {
            defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        }
        Context context = this.E0;
        int iV = v(context, defaultNightMode);
        int i12 = Build.VERSION.SDK_INT;
        LocaleListCompat localeListCompatH = i12 < 33 ? h(context) : null;
        if (!z11 && localeListCompatH != null) {
            localeListCompatH = s(context.getResources().getConfiguration());
        }
        Configuration configurationL = l(context, iV, localeListCompatH, null, false);
        boolean z17 = this.f583q1;
        Object obj4 = this.f590y0;
        if (z17 || !(obj4 instanceof Activity)) {
            this.f583q1 = true;
            i10 = this.f582p1;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                if (i12 >= 29) {
                    i11 = 269221888;
                } else {
                    i11 = i12 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i11);
                    if (activityInfo != null) {
                        this.f582p1 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f582p1 = 0;
                }
                this.f583q1 = true;
                i10 = this.f582p1;
            }
        }
        Configuration configuration = this.f579m1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i13 = configuration.uiMode & 48;
        int i14 = configurationL.uiMode & 48;
        LocaleListCompat localeListCompatS = s(configuration);
        LocaleListCompat localeListCompatS2 = localeListCompatH == null ? null : s(configurationL);
        int i15 = i13 != i14 ? 512 : 0;
        if (localeListCompatS2 != null && !localeListCompatS.equals(localeListCompatS2)) {
            i15 |= 8196;
        }
        if (((~i10) & i15) != 0 && z10 && this.f576j1 && ((E1 || this.f577k1) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (activity.isChild()) {
                z12 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i15 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationL.getLayoutDirection());
                }
                ActivityCompat.recreate(activity);
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i15 == 0) {
            z13 = z12;
        } else {
            boolean z18 = (i10 & i15) == i15;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
            if (localeListCompatS2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    g.d(configuration2, localeListCompatS2);
                } else {
                    configuration2.setLocale(localeListCompatS2.get(0));
                    configuration2.setLayoutDirection(localeListCompatS2.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 < 26 && i16 < 28) {
                if (i16 >= 24) {
                    if (!d0.f705h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            d0.f704g = declaredField;
                            z15 = true;
                            try {
                                declaredField.setAccessible(true);
                            } catch (NoSuchFieldException unused2) {
                            }
                        } catch (NoSuchFieldException unused3) {
                            z15 = true;
                        }
                        d0.f705h = z15;
                    }
                    Field field = d0.f704g;
                    if (field != null) {
                        try {
                            obj2 = field.get(resources);
                        } catch (IllegalAccessException unused4) {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!d0.f699b) {
                                try {
                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    d0.f698a = declaredField2;
                                    z16 = true;
                                    try {
                                        declaredField2.setAccessible(true);
                                    } catch (NoSuchFieldException unused5) {
                                    }
                                } catch (NoSuchFieldException unused6) {
                                    z16 = true;
                                }
                                d0.f699b = z16;
                            }
                            Field field2 = d0.f698a;
                            if (field2 != null) {
                                try {
                                    obj3 = field2.get(obj2);
                                } catch (IllegalAccessException unused7) {
                                    obj3 = null;
                                }
                            } else {
                                obj3 = null;
                            }
                            if (obj3 != null) {
                                d0.a(obj3);
                            }
                        }
                    }
                } else {
                    if (!d0.f699b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            d0.f698a = declaredField3;
                            z14 = true;
                            try {
                                declaredField3.setAccessible(true);
                            } catch (NoSuchFieldException unused8) {
                            }
                        } catch (NoSuchFieldException unused9) {
                            z14 = true;
                        }
                        d0.f699b = z14;
                    }
                    Field field3 = d0.f698a;
                    if (field3 != null) {
                        try {
                            obj = field3.get(resources);
                        } catch (IllegalAccessException unused10) {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        d0.a(obj);
                    }
                }
            }
            int i17 = this.f581o1;
            if (i17 != 0) {
                context.setTheme(i17);
                z13 = true;
                context.getTheme().applyStyle(this.f581o1, true);
            } else {
                z13 = true;
            }
            if (z18 && (obj4 instanceof Activity)) {
                Activity activity2 = (Activity) obj4;
                if (activity2 instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f577k1 && !this.f578l1) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z13 && (obj4 instanceof AppCompatActivity)) {
            if ((i15 & 512) != 0) {
                ((AppCompatActivity) obj4).onNightModeChanged(iV);
            }
            if ((i15 & 4) != 0) {
                ((AppCompatActivity) obj4).onLocalesChanged(localeListCompatH);
            }
        }
        if (localeListCompatS2 != null) {
            LocaleListCompat localeListCompatS3 = s(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                g.c(localeListCompatS3);
            } else {
                Locale.setDefault(localeListCompatS3.get(0));
            }
        }
        if (defaultNightMode == 0) {
            r(context).e();
        } else {
            l lVar = this.r1;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (defaultNightMode == 3) {
            if (this.f584s1 == null) {
                this.f584s1 = new j(context);
            }
            this.f584s1.e();
        } else {
            j jVar = this.f584s1;
            if (jVar != null) {
                jVar.a();
            }
        }
        return z13;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @Nullable
    public final <T extends View> T findViewById(@IdRes int i10) {
        o();
        return (T) this.F0.findViewById(i10);
    }

    public final void g(@NonNull Window window) {
        if (this.F0 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof i) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        i iVar = new i(callback);
        this.G0 = iVar;
        window.setCallback(iVar);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.E0, (AttributeSet) null, D1);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.F0 = window;
        if (Build.VERSION.SDK_INT < 33 || this.A1 != null) {
            return;
        }
        setOnBackInvokedDispatcher(null);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context getContextForDelegate() {
        return this.E0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new b();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int getLocalNightMode() {
        return this.f580n1;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater getMenuInflater() {
        if (this.J0 == null) {
            u();
            ActionBar actionBar = this.I0;
            this.J0 = new SupportMenuInflater(actionBar != null ? actionBar.getThemedContext() : this.E0);
        }
        return this.J0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar getSupportActionBar() {
        u();
        return this.I0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x003f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean hasWindowFeature(int i10) {
        int i11;
        boolean z10;
        if (i10 == 8) {
            i11 = 108;
        } else {
            i11 = i10 == 9 ? 109 : i10;
        }
        if (i11 == 1) {
            z10 = this.f571e1;
        } else if (i11 == 2) {
            z10 = this.Y0;
        } else if (i11 == 5) {
            z10 = this.Z0;
        } else if (i11 == 10) {
            z10 = this.f569c1;
        } else {
            if (i11 != 108) {
                if (i11 == 109) {
                    z10 = this.f568b1;
                }
                if (this.F0.hasFeature(i10)) {
                    return true;
                }
                return false;
            }
            z10 = this.f567a1;
        }
        if (z10) {
            return true;
        }
        if (this.F0.hasFeature(i10)) {
            return true;
        }
        return false;
    }

    public final void i(int i10, PanelFeatureState panelFeatureState, MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            if (panelFeatureState == null && i10 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f573g1;
                if (i10 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                }
            }
            if (panelFeatureState != null) {
                menuBuilder = panelFeatureState.f600h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.m) && !this.f578l1) {
            i iVar = this.G0;
            Window.Callback callback = this.F0.getCallback();
            iVar.getClass();
            try {
                iVar.f620t0 = true;
                callback.onPanelClosed(i10, menuBuilder);
            } finally {
                iVar.f620t0 = false;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void installViewFactory() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.E0);
        if (layoutInflaterFrom.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflaterFrom, this);
        } else {
            boolean z10 = layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void invalidateOptionsMenu() {
        if (this.I0 != null) {
            u();
            if (this.I0.invalidateOptionsMenu()) {
                return;
            }
            this.f586u1 |= 1;
            if (this.f585t1) {
                return;
            }
            ViewCompat.postOnAnimation(this.F0.getDecorView(), this.f587v1);
            this.f585t1 = true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean isHandleNativeActionModesEnabled() {
        return this.T0;
    }

    public final void j(@NonNull MenuBuilder menuBuilder) {
        if (this.f572f1) {
            return;
        }
        this.f572f1 = true;
        this.L0.dismissPopups();
        Window.Callback callback = this.F0.getCallback();
        if (callback != null && !this.f578l1) {
            callback.onPanelClosed(108, menuBuilder);
        }
        this.f572f1 = false;
    }

    public final void k(PanelFeatureState panelFeatureState, boolean z10) {
        m mVar;
        DecorContentParent decorContentParent;
        if (z10 && panelFeatureState.f593a == 0 && (decorContentParent = this.L0) != null && decorContentParent.isOverflowMenuShowing()) {
            j(panelFeatureState.f600h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.E0.getSystemService("window");
        if (windowManager != null && panelFeatureState.m && (mVar = panelFeatureState.f597e) != null) {
            windowManager.removeView(mVar);
            if (z10) {
                i(panelFeatureState.f593a, panelFeatureState, null);
            }
        }
        panelFeatureState.f603k = false;
        panelFeatureState.f604l = false;
        panelFeatureState.m = false;
        panelFeatureState.f598f = null;
        panelFeatureState.f605n = true;
        if (this.f574h1 == panelFeatureState) {
            this.f574h1 = null;
        }
        if (panelFeatureState.f593a == 0) {
            B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    public final boolean m(KeyEvent keyEvent) {
        View decorView;
        boolean zHideOverflowMenu;
        AudioManager audioManager;
        Object obj = this.f590y0;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.F0.getDecorView()) != null && KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            i iVar = this.G0;
            Window.Callback callback = this.F0.getCallback();
            iVar.getClass();
            try {
                iVar.f619s0 = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                iVar.f619s0 = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th2) {
                iVar.f619s0 = false;
                throw th2;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f575i1 = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                PanelFeatureState panelFeatureStateT = t(0);
                if (panelFeatureStateT.m) {
                    return true;
                }
                z(panelFeatureStateT, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.O0 != null) {
                    return true;
                }
                PanelFeatureState panelFeatureStateT2 = t(0);
                DecorContentParent decorContentParent = this.L0;
                Context context = this.E0;
                if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    boolean z10 = panelFeatureStateT2.m;
                    if (z10 || panelFeatureStateT2.f604l) {
                        k(panelFeatureStateT2, true);
                        zHideOverflowMenu = z10;
                    } else {
                        if (!panelFeatureStateT2.f603k) {
                            return true;
                        }
                        if (panelFeatureStateT2.f606o) {
                            panelFeatureStateT2.f603k = false;
                            if (!z(panelFeatureStateT2, keyEvent)) {
                                return true;
                            }
                        }
                        x(panelFeatureStateT2, keyEvent);
                    }
                    audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                    if (audioManager != null) {
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                    return true;
                }
                if (this.L0.isOverflowMenuShowing()) {
                    zHideOverflowMenu = this.L0.hideOverflowMenu();
                } else {
                    if (this.f578l1 || !z(panelFeatureStateT2, keyEvent)) {
                        return true;
                    }
                    zHideOverflowMenu = this.L0.showOverflowMenu();
                }
                if (!zHideOverflowMenu) {
                    return true;
                }
                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (w()) {
            return true;
        }
        return false;
    }

    public final void n(int i10) {
        PanelFeatureState panelFeatureStateT = t(i10);
        if (panelFeatureStateT.f600h != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateT.f600h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateT.f607p = bundle;
            }
            panelFeatureStateT.f600h.stopDispatchingItemsChanged();
            panelFeatureStateT.f600h.clear();
        }
        panelFeatureStateT.f606o = true;
        panelFeatureStateT.f605n = true;
        if ((i10 == 108 || i10 == 0) && this.L0 != null) {
            PanelFeatureState panelFeatureStateT2 = t(0);
            panelFeatureStateT2.f603k = false;
            z(panelFeatureStateT2, null);
        }
    }

    public final void o() {
        ViewGroup viewGroup;
        if (this.U0) {
            return;
        }
        int[] iArr = androidx.appcompat.R.styleable.AppCompatTheme;
        Context context = this.E0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i10 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            requestWindowFeature(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            requestWindowFeature(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            requestWindowFeature(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            requestWindowFeature(10);
        }
        this.f570d1 = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        p();
        this.F0.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f571e1) {
            viewGroup = this.f569c1 ? (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f570d1) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f568b1 = false;
            this.f567a1 = false;
        } else if (this.f567a1) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context).inflate(androidx.appcompat.R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(androidx.appcompat.R.id.decor_content_parent);
            this.L0 = decorContentParent;
            decorContentParent.setWindowCallback(this.F0.getCallback());
            if (this.f568b1) {
                this.L0.initFeature(109);
            }
            if (this.Y0) {
                this.L0.initFeature(2);
            }
            if (this.Z0) {
                this.L0.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f567a1);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f568b1);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f570d1);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f569c1);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(androidx.appcompat.app.i.c(sb2, this.f571e1, " }"));
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new androidx.appcompat.app.j(this));
        if (this.L0 == null) {
            this.W0 = (TextView) viewGroup.findViewById(androidx.appcompat.R.id.title);
        }
        androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.F0.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.F0.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.app.k(this));
        this.V0 = viewGroup;
        Object obj = this.f590y0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.K0;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.L0;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.I0;
                if (actionBar != null) {
                    actionBar.setWindowTitle(title);
                } else {
                    TextView textView = this.W0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.V0.findViewById(R.id.content);
        View decorView = this.F0.getDecorView();
        contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        int i11 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor;
        if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
            typedArrayObtainStyledAttributes2.getValue(i11, contentFrameLayout2.getFixedWidthMajor());
        }
        int i12 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor;
        if (typedArrayObtainStyledAttributes2.hasValue(i12)) {
            typedArrayObtainStyledAttributes2.getValue(i12, contentFrameLayout2.getFixedWidthMinor());
        }
        int i13 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor;
        if (typedArrayObtainStyledAttributes2.hasValue(i13)) {
            typedArrayObtainStyledAttributes2.getValue(i13, contentFrameLayout2.getFixedHeightMajor());
        }
        int i14 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor;
        if (typedArrayObtainStyledAttributes2.hasValue(i14)) {
            typedArrayObtainStyledAttributes2.getValue(i14, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.U0 = true;
        PanelFeatureState panelFeatureStateT = t(0);
        if (this.f578l1 || panelFeatureStateT.f600h != null) {
            return;
        }
        this.f586u1 |= 4096;
        if (this.f585t1) {
            return;
        }
        ViewCompat.postOnAnimation(this.F0.getDecorView(), this.f587v1);
        this.f585t1 = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.f567a1 && this.U0) {
            u();
            ActionBar actionBar = this.I0;
            if (actionBar != null) {
                actionBar.onConfigurationChanged(configuration);
            }
        }
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        Context context = this.E0;
        appCompatDrawableManager.onConfigurationChanged(context);
        this.f579m1 = new Configuration(context.getResources().getConfiguration());
        f(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onCreate(Bundle bundle) {
        String parentActivityName;
        this.f576j1 = true;
        f(false, true);
        p();
        Object obj = this.f590y0;
        if (obj instanceof Activity) {
            try {
                parentActivityName = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                parentActivityName = null;
            }
            if (parentActivityName != null) {
                ActionBar actionBar = this.I0;
                if (actionBar == null) {
                    this.f588w1 = true;
                } else {
                    actionBar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            synchronized (AppCompatDelegate.f561w0) {
                AppCompatDelegate.d(this);
                AppCompatDelegate.v0.add(new WeakReference<>(this));
            }
        }
        this.f579m1 = new Configuration(this.E0.getResources().getConfiguration());
        this.f577k1 = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return createView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onDestroy() {
        if (this.f590y0 instanceof Activity) {
            synchronized (AppCompatDelegate.f561w0) {
                AppCompatDelegate.d(this);
            }
        }
        if (this.f585t1) {
            this.F0.getDecorView().removeCallbacks(this.f587v1);
        }
        this.f578l1 = true;
        if (this.f580n1 != -100) {
            Object obj = this.f590y0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                C1.put(this.f590y0.getClass().getName(), Integer.valueOf(this.f580n1));
            } else {
                C1.remove(this.f590y0.getClass().getName());
            }
        } else {
            C1.remove(this.f590y0.getClass().getName());
        }
        ActionBar actionBar = this.I0;
        if (actionBar != null) {
            actionBar.a();
        }
        l lVar = this.r1;
        if (lVar != null) {
            lVar.a();
        }
        j jVar = this.f584s1;
        if (jVar != null) {
            jVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback callback = this.F0.getCallback();
        if (callback != null && !this.f578l1) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            PanelFeatureState[] panelFeatureStateArr = this.f573g1;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                panelFeatureState = panelFeatureStateArr[i10];
                if (panelFeatureState != null && panelFeatureState.f600h == rootMenu) {
                    if (panelFeatureState != null) {
                        return callback.onMenuItemSelected(panelFeatureState.f593a, menuItem);
                    }
                }
            }
            panelFeatureState = null;
            if (panelFeatureState != null) {
                return callback.onMenuItemSelected(panelFeatureState.f593a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
        DecorContentParent decorContentParent = this.L0;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.E0).hasPermanentMenuKey() && !this.L0.isOverflowMenuShowPending())) {
            PanelFeatureState panelFeatureStateT = t(0);
            panelFeatureStateT.f605n = true;
            k(panelFeatureStateT, false);
            x(panelFeatureStateT, null);
            return;
        }
        Window.Callback callback = this.F0.getCallback();
        if (this.L0.isOverflowMenuShowing()) {
            this.L0.hideOverflowMenu();
            if (this.f578l1) {
                return;
            }
            callback.onPanelClosed(108, t(0).f600h);
            return;
        }
        if (callback == null || this.f578l1) {
            return;
        }
        if (this.f585t1 && (1 & this.f586u1) != 0) {
            View decorView = this.F0.getDecorView();
            a aVar = this.f587v1;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        PanelFeatureState panelFeatureStateT2 = t(0);
        MenuBuilder menuBuilder2 = panelFeatureStateT2.f600h;
        if (menuBuilder2 == null || panelFeatureStateT2.f606o || !callback.onPreparePanel(0, panelFeatureStateT2.f599g, menuBuilder2)) {
            return;
        }
        callback.onMenuOpened(108, panelFeatureStateT2.f600h);
        this.L0.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onPostCreate(Bundle bundle) {
        o();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onPostResume() {
        u();
        ActionBar actionBar = this.I0;
        if (actionBar != null) {
            actionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onStart() {
        f(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onStop() {
        u();
        ActionBar actionBar = this.I0;
        if (actionBar != null) {
            actionBar.setShowHideAnimationEnabled(false);
        }
    }

    public final void p() {
        if (this.F0 == null) {
            Object obj = this.f590y0;
            if (obj instanceof Activity) {
                g(((Activity) obj).getWindow());
            }
        }
        if (this.F0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context q() {
        u();
        ActionBar actionBar = this.I0;
        Context themedContext = actionBar != null ? actionBar.getThemedContext() : null;
        return themedContext == null ? this.E0 : themedContext;
    }

    public final k r(@NonNull Context context) {
        if (this.r1 == null) {
            if (g0.f731d == null) {
                Context applicationContext = context.getApplicationContext();
                g0.f731d = new g0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.r1 = new l(g0.f731d);
        }
        return this.r1;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean requestWindowFeature(int i10) {
        if (i10 == 8) {
            i10 = 108;
        } else if (i10 == 9) {
            i10 = 109;
        }
        if (this.f571e1 && i10 == 108) {
            return false;
        }
        if (this.f567a1 && i10 == 1) {
            this.f567a1 = false;
        }
        if (i10 == 1) {
            A();
            this.f571e1 = true;
            return true;
        }
        if (i10 == 2) {
            A();
            this.Y0 = true;
            return true;
        }
        if (i10 == 5) {
            A();
            this.Z0 = true;
            return true;
        }
        if (i10 == 10) {
            A();
            this.f569c1 = true;
            return true;
        }
        if (i10 == 108) {
            A();
            this.f567a1 = true;
            return true;
        }
        if (i10 != 109) {
            return this.F0.requestFeature(i10);
        }
        A();
        this.f568b1 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(View view) {
        o();
        ViewGroup viewGroup = (ViewGroup) this.V0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.G0.a(this.F0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setHandleNativeActionModesEnabled(boolean z10) {
        this.T0 = z10;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setLocalNightMode(int i10) {
        if (this.f580n1 != i10) {
            this.f580n1 = i10;
            if (this.f576j1) {
                f(true, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.A1;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.B1) != null) {
            h.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.B1 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f590y0;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.A1 = onBackInvokedDispatcher;
            } else {
                this.A1 = h.a((Activity) obj);
            }
        } else {
            this.A1 = onBackInvokedDispatcher;
        }
        B();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setSupportActionBar(Toolbar toolbar) {
        Object obj = this.f590y0;
        if (obj instanceof Activity) {
            u();
            ActionBar actionBar = this.I0;
            if (actionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.J0 = null;
            if (actionBar != null) {
                actionBar.a();
            }
            this.I0 = null;
            if (toolbar != null) {
                e0 e0Var = new e0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.K0, this.G0);
                this.I0 = e0Var;
                this.G0.f617q0 = e0Var.f711c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.G0.f617q0 = null;
            }
            invalidateOptionsMenu();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTheme(@StyleRes int i10) {
        this.f581o1 = i10;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.K0 = charSequence;
        DecorContentParent decorContentParent = this.L0;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.I0;
        if (actionBar != null) {
            actionBar.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.W0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
        ActionMode actionModeOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode = this.O0;
        if (actionMode != null) {
            actionMode.finish();
        }
        e eVar = new e(callback);
        u();
        ActionBar actionBar = this.I0;
        AppCompatCallback appCompatCallback = this.H0;
        if (actionBar != null) {
            ActionMode actionModeStartActionMode = actionBar.startActionMode(eVar);
            this.O0 = actionModeStartActionMode;
            if (actionModeStartActionMode != null && appCompatCallback != null) {
                appCompatCallback.onSupportActionModeStarted(actionModeStartActionMode);
            }
        }
        if (this.O0 == null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.S0;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            ActionMode actionMode2 = this.O0;
            if (actionMode2 != null) {
                actionMode2.finish();
            }
            if (appCompatCallback == null || this.f578l1) {
                actionModeOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    actionModeOnWindowStartingSupportActionMode = appCompatCallback.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                    actionModeOnWindowStartingSupportActionMode = null;
                }
            }
            if (actionModeOnWindowStartingSupportActionMode != null) {
                this.O0 = actionModeOnWindowStartingSupportActionMode;
            } else {
                if (this.P0 == null) {
                    if (this.f570d1) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.E0;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            context = contextThemeWrapper;
                        }
                        this.P0 = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, androidx.appcompat.R.attr.actionModePopupWindowStyle);
                        this.Q0 = popupWindow;
                        PopupWindowCompat.setWindowLayoutType(popupWindow, 2);
                        this.Q0.setContentView(this.P0);
                        this.Q0.setWidth(-1);
                        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarSize, typedValue, true);
                        this.P0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.Q0.setHeight(-2);
                        this.R0 = new androidx.appcompat.app.l(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.V0.findViewById(androidx.appcompat.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(q()));
                            this.P0 = (ActionBarContextView) viewStubCompat.inflate();
                        }
                    }
                }
                if (this.P0 != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = this.S0;
                    if (viewPropertyAnimatorCompat2 != null) {
                        viewPropertyAnimatorCompat2.cancel();
                    }
                    this.P0.killMode();
                    StandaloneActionMode standaloneActionMode = new StandaloneActionMode(this.P0.getContext(), this.P0, eVar, this.Q0 == null);
                    if (eVar.f614a.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                        standaloneActionMode.invalidate();
                        this.P0.initForMode(standaloneActionMode);
                        this.O0 = standaloneActionMode;
                        if (this.U0 && (viewGroup = this.V0) != null && viewGroup.isLaidOut()) {
                            this.P0.setAlpha(0.0f);
                            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(this.P0).alpha(1.0f);
                            this.S0 = viewPropertyAnimatorCompatAlpha;
                            viewPropertyAnimatorCompatAlpha.setListener(new androidx.appcompat.app.m(this));
                        } else {
                            this.P0.setAlpha(1.0f);
                            this.P0.setVisibility(0);
                            if (this.P0.getParent() instanceof View) {
                                ViewCompat.requestApplyInsets((View) this.P0.getParent());
                            }
                        }
                        if (this.Q0 != null) {
                            this.F0.getDecorView().post(this.R0);
                        }
                    } else {
                        this.O0 = null;
                    }
                }
            }
            ActionMode actionMode3 = this.O0;
            if (actionMode3 != null && appCompatCallback != null) {
                appCompatCallback.onSupportActionModeStarted(actionMode3);
            }
            B();
            this.O0 = this.O0;
        }
        B();
        return this.O0;
    }

    public final PanelFeatureState t(int i10) {
        PanelFeatureState[] panelFeatureStateArr = this.f573g1;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i10 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f573g1 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState();
        panelFeatureState2.f593a = i10;
        panelFeatureState2.f605n = false;
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final void u() {
        o();
        if (this.f567a1 && this.I0 == null) {
            Object obj = this.f590y0;
            if (obj instanceof Activity) {
                this.I0 = new WindowDecorActionBar((Activity) obj, this.f568b1);
            } else if (obj instanceof Dialog) {
                this.I0 = new WindowDecorActionBar((Dialog) obj);
            }
            ActionBar actionBar = this.I0;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.f588w1);
            }
        }
    }

    public final int v(@NonNull Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return r(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f584s1 == null) {
                    this.f584s1 = new j(context);
                }
                return this.f584s1.c();
            }
        }
        return i10;
    }

    public final boolean w() {
        boolean z10 = this.f575i1;
        this.f575i1 = false;
        PanelFeatureState panelFeatureStateT = t(0);
        if (panelFeatureStateT.m) {
            if (!z10) {
                k(panelFeatureStateT, true);
            }
            return true;
        }
        ActionMode actionMode = this.O0;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        u();
        ActionBar actionBar = this.I0;
        return actionBar != null && actionBar.collapseActionView();
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public final void x(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.m || this.f578l1) {
            return;
        }
        int i11 = panelFeatureState.f593a;
        Context context = this.E0;
        if (i11 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.F0.getCallback();
        if (callback != null && !callback.onMenuOpened(i11, panelFeatureState.f600h)) {
            k(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && z(panelFeatureState, keyEvent)) {
            m mVar = panelFeatureState.f597e;
            if (mVar != null && !panelFeatureState.f605n) {
                View view = panelFeatureState.f599g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                panelFeatureState.f604l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.f595c;
                layoutParams2.windowAnimations = panelFeatureState.f596d;
                windowManager.addView(panelFeatureState.f597e, layoutParams2);
                panelFeatureState.m = true;
                if (i11 == 0) {
                    B();
                }
            }
            if (mVar == null) {
                Context contextQ = q();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextQ.getResources().newTheme();
                themeNewTheme.setTo(contextQ.getTheme());
                themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    themeNewTheme.applyStyle(i12, true);
                }
                themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.panelMenuListTheme, typedValue, true);
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    themeNewTheme.applyStyle(i13, true);
                } else {
                    themeNewTheme.applyStyle(androidx.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
                }
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(contextQ, 0);
                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                panelFeatureState.f602j = contextThemeWrapper;
                TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
                panelFeatureState.f594b = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
                panelFeatureState.f596d = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
                typedArrayObtainStyledAttributes.recycle();
                panelFeatureState.f597e = new m(panelFeatureState.f602j);
                panelFeatureState.f595c = 81;
            } else if (panelFeatureState.f605n && mVar.getChildCount() > 0) {
                panelFeatureState.f597e.removeAllViews();
            }
            View view2 = panelFeatureState.f599g;
            if (view2 == null) {
                if (panelFeatureState.f600h != null) {
                    if (this.N0 == null) {
                        this.N0 = new n();
                    }
                    n nVar = this.N0;
                    if (panelFeatureState.f601i == null) {
                        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(panelFeatureState.f602j, androidx.appcompat.R.layout.abc_list_menu_item_layout);
                        panelFeatureState.f601i = listMenuPresenter;
                        listMenuPresenter.setCallback(nVar);
                        panelFeatureState.f600h.addMenuPresenter(panelFeatureState.f601i);
                    }
                    View view3 = (View) panelFeatureState.f601i.getMenuView(panelFeatureState.f597e);
                    panelFeatureState.f598f = view3;
                    if (view3 != null) {
                    }
                }
                panelFeatureState.f605n = true;
                return;
            }
            panelFeatureState.f598f = view2;
            if (panelFeatureState.hasPanelItems()) {
                ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f598f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.f597e.setBackgroundResource(panelFeatureState.f594b);
                ViewParent parent = panelFeatureState.f598f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(panelFeatureState.f598f);
                }
                panelFeatureState.f597e.addView(panelFeatureState.f598f, layoutParams3);
                if (!panelFeatureState.f598f.hasFocus()) {
                    panelFeatureState.f598f.requestFocus();
                }
            }
            panelFeatureState.f605n = true;
            return;
            i10 = -2;
            panelFeatureState.f604l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f595c;
            layoutParams4.windowAnimations = panelFeatureState.f596d;
            windowManager.addView(panelFeatureState.f597e, layoutParams4);
            panelFeatureState.m = true;
            if (i11 == 0) {
                B();
            }
        }
    }

    public final boolean y(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f603k || z(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f600h) != null) {
            return menuBuilder.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean z(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        Resources.Theme themeNewTheme;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (this.f578l1) {
            return false;
        }
        if (panelFeatureState.f603k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f574h1;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            k(panelFeatureState2, false);
        }
        Window.Callback callback = this.F0.getCallback();
        int i10 = panelFeatureState.f593a;
        if (callback != null) {
            panelFeatureState.f599g = callback.onCreatePanelView(i10);
        }
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (decorContentParent4 = this.L0) != null) {
            decorContentParent4.setMenuPrepared();
        }
        if (panelFeatureState.f599g == null && (!z10 || !(this.I0 instanceof e0))) {
            MenuBuilder menuBuilder = panelFeatureState.f600h;
            if (menuBuilder == null || panelFeatureState.f606o) {
                if (menuBuilder == null) {
                    Context context = this.E0;
                    if ((i10 == 0 || i10 == 108) && this.L0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            context = contextThemeWrapper;
                        }
                    }
                    MenuBuilder menuBuilder2 = new MenuBuilder(context);
                    menuBuilder2.setCallback(this);
                    MenuBuilder menuBuilder3 = panelFeatureState.f600h;
                    if (menuBuilder2 != menuBuilder3) {
                        if (menuBuilder3 != null) {
                            menuBuilder3.removeMenuPresenter(panelFeatureState.f601i);
                        }
                        panelFeatureState.f600h = menuBuilder2;
                        ListMenuPresenter listMenuPresenter = panelFeatureState.f601i;
                        if (listMenuPresenter != null) {
                            menuBuilder2.addMenuPresenter(listMenuPresenter);
                        }
                    }
                    if (panelFeatureState.f600h == null) {
                        return false;
                    }
                }
                if (z10 && (decorContentParent2 = this.L0) != null) {
                    if (this.M0 == null) {
                        this.M0 = new d();
                    }
                    decorContentParent2.setMenu(panelFeatureState.f600h, this.M0);
                }
                panelFeatureState.f600h.stopDispatchingItemsChanged();
                if (!callback.onCreatePanelMenu(i10, panelFeatureState.f600h)) {
                    MenuBuilder menuBuilder4 = panelFeatureState.f600h;
                    if (menuBuilder4 != null) {
                        if (menuBuilder4 != null) {
                            menuBuilder4.removeMenuPresenter(panelFeatureState.f601i);
                        }
                        panelFeatureState.f600h = null;
                    }
                    if (z10 && (decorContentParent = this.L0) != null) {
                        decorContentParent.setMenu(null, this.M0);
                    }
                    return false;
                }
                panelFeatureState.f606o = false;
            }
            panelFeatureState.f600h.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f607p;
            if (bundle != null) {
                panelFeatureState.f600h.restoreActionViewStates(bundle);
                panelFeatureState.f607p = null;
            }
            if (!callback.onPreparePanel(0, panelFeatureState.f599g, panelFeatureState.f600h)) {
                if (z10 && (decorContentParent3 = this.L0) != null) {
                    decorContentParent3.setMenu(null, this.M0);
                }
                panelFeatureState.f600h.startDispatchingItemsChanged();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.qwertyMode = z11;
            panelFeatureState.f600h.setQwertyMode(z11);
            panelFeatureState.f600h.startDispatchingItemsChanged();
        }
        panelFeatureState.f603k = true;
        panelFeatureState.f604l = false;
        this.f574h1 = panelFeatureState;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(int i10) {
        o();
        ViewGroup viewGroup = (ViewGroup) this.V0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.E0).inflate(i10, viewGroup);
        this.G0.a(this.F0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        ViewGroup viewGroup = (ViewGroup) this.V0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.G0.a(this.F0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onSaveInstanceState(Bundle bundle) {
    }
}
