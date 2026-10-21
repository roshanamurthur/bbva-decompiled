package androidx.core.splashscreen;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreenView;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.o0;
import androidx.compose.ui.platform.w0;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.core.splashscreen.ThemeUtils;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import h2.j;
import i8.d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l2.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplashScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0005\t\n\u000b\f\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Landroidx/core/splashscreen/SplashScreen;", "", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", LandingAEMContentMapper.CONDITION, "", "setKeepOnScreenCondition", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnExitAnimationListener", "Companion", "Impl", "Impl31", "KeepOnScreenCondition", "OnExitAnimationListener", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"CustomSplashScreen"})
public final class SplashScreen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Impl f20078a;

    /* JADX INFO: compiled from: SplashScreen.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Companion;", "", "()V", "MASK_FACTOR", "", "installSplashScreen", "Landroidx/core/splashscreen/SplashScreen;", "Landroid/app/Activity;", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SplashScreen installSplashScreen(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            SplashScreen splashScreen = new SplashScreen(activity, null);
            SplashScreen.access$install(splashScreen);
            return splashScreen;
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    public static class Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Activity f20079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f20080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f20081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Drawable f20082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public KeepOnScreenCondition f20084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public OnExitAnimationListener f20085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public SplashScreenViewProvider f20086h;

        public Impl(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f20079a = activity;
            this.f20084f = new d(0);
        }

        public void a() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f20079a.getTheme();
            if (currentTheme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.f20080b = Integer.valueOf(typedValue.resourceId);
                this.f20081c = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.f20082d = currentTheme.getDrawable(typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
                this.f20083e = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
            }
            Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
            d(currentTheme, typedValue);
        }

        public void b(@NotNull KeepOnScreenCondition keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            this.f20084f = keepOnScreenCondition;
            final View viewFindViewById = this.f20079a.findViewById(android.R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    SplashScreen.Impl impl = this.f20087p0;
                    if (impl.f20084f.shouldKeepOnScreen()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    SplashScreenViewProvider splashScreenViewProvider = impl.f20086h;
                    int i10 = 1;
                    if (splashScreenViewProvider != null) {
                        Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
                        SplashScreen.OnExitAnimationListener onExitAnimationListener = impl.f20085g;
                        if (onExitAnimationListener != null) {
                            impl.f20085g = null;
                            splashScreenViewProvider.getView().postOnAnimation(new j(splashScreenViewProvider, onExitAnimationListener, i10));
                        }
                    }
                    return true;
                }
            });
        }

        public void c(@NotNull OnExitAnimationListener exitAnimationListener) {
            float dimension;
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            this.f20085g = exitAnimationListener;
            Activity activity = this.f20079a;
            final SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(activity);
            Integer num = this.f20080b;
            Integer num2 = this.f20081c;
            View view = splashScreenViewProvider.getView();
            if (num != null && num.intValue() != 0) {
                view.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                view.setBackgroundColor(num2.intValue());
            } else {
                view.setBackground(activity.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f20082d;
            if (drawable != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.splashscreen_icon_view);
                if (this.f20083e) {
                    Drawable drawable2 = imageView.getContext().getDrawable(R.drawable.icon_background);
                    dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                    if (drawable2 != null) {
                        imageView.setBackground(new MaskedDrawable(drawable2, dimension));
                    }
                } else {
                    dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
                }
                imageView.setImageDrawable(new MaskedDrawable(drawable, dimension));
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    if (view2.isAttachedToWindow()) {
                        view2.removeOnLayoutChangeListener(this);
                        SplashScreen.Impl impl = this.f20089a;
                        boolean zShouldKeepOnScreen = impl.f20084f.shouldKeepOnScreen();
                        SplashScreenViewProvider splashScreenViewProvider2 = splashScreenViewProvider;
                        if (zShouldKeepOnScreen) {
                            impl.f20086h = splashScreenViewProvider2;
                            return;
                        }
                        Intrinsics.checkNotNullParameter(splashScreenViewProvider2, "splashScreenViewProvider");
                        SplashScreen.OnExitAnimationListener onExitAnimationListener = impl.f20085g;
                        if (onExitAnimationListener == null) {
                            return;
                        }
                        impl.f20085g = null;
                        splashScreenViewProvider2.getView().postOnAnimation(new j(splashScreenViewProvider2, onExitAnimationListener, 1));
                    }
                }
            });
        }

        public final void d(@NotNull Resources.Theme currentTheme, @NotNull TypedValue typedValue) {
            int i10;
            Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
            Intrinsics.checkNotNullParameter(typedValue, "typedValue");
            if (!currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i10 = typedValue.resourceId) == 0) {
                return;
            }
            this.f20079a.setTheme(i10);
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    @RequiresApi(31)
    public static final class Impl31 extends Impl {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public SplashScreen$Impl31$setKeepOnScreenCondition$1 f20091i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f20092j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final SplashScreen$Impl31$hierarchyListener$1 f20093k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1] */
        public Impl31(@NotNull final Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f20092j = true;
            this.f20093k = new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(@Nullable View parent, @Nullable View child) {
                    if (w0.b(child)) {
                        SplashScreenView child2 = e.a(child);
                        SplashScreen.Impl31 impl31 = this.f20094p0;
                        impl31.getClass();
                        Intrinsics.checkNotNullParameter(child2, "child");
                        WindowInsets windowInsetsBuild = o0.f().build();
                        Intrinsics.checkNotNullExpressionValue(windowInsetsBuild, "Builder().build()");
                        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        impl31.f20092j = (windowInsetsBuild == child2.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
                        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(@Nullable View parent, @Nullable View child) {
                }
            };
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public final void a() {
            Activity activity = this.f20079a;
            Resources.Theme theme = activity.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
            d(theme, new TypedValue());
            ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f20093k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1] */
        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public final void b(@NotNull KeepOnScreenCondition keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "<set-?>");
            this.f20084f = keepOnScreenCondition;
            final View viewFindViewById = this.f20079a.findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.f20091i != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f20091i);
            }
            ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (this.f20096p0.f20084f.shouldKeepOnScreen()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            };
            this.f20091i = r1;
            viewTreeObserver.addOnPreDrawListener(r1);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [l2.d] */
        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public final void c(@NotNull final OnExitAnimationListener exitAnimationListener) {
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            this.f20079a.getSplashScreen().setOnExitAnimationListener(new android.window.SplashScreen.OnExitAnimationListener() { // from class: l2.d
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    SplashScreen.Impl31 this$0 = this.f83080a;
                    SplashScreen.OnExitAnimationListener exitAnimationListener2 = exitAnimationListener;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(exitAnimationListener2, "$exitAnimationListener");
                    Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
                    this$0.getClass();
                    TypedValue typedValue = new TypedValue();
                    Activity activity = this$0.f20079a;
                    Resources.Theme theme = activity.getTheme();
                    Window window = activity.getWindow();
                    if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                        window.setStatusBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                        window.setNavigationBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                        if (typedValue.data != 0) {
                            window.addFlags(Integer.MIN_VALUE);
                        } else {
                            window.clearFlags(Integer.MIN_VALUE);
                        }
                    }
                    if (theme.resolveAttribute(R.attr.enforceNavigationBarContrast, typedValue, true)) {
                        window.setNavigationBarContrastEnforced(typedValue.data != 0);
                    }
                    if (theme.resolveAttribute(R.attr.enforceStatusBarContrast, typedValue, true)) {
                        window.setStatusBarContrastEnforced(typedValue.data != 0);
                    }
                    ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                    Intrinsics.checkNotNullExpressionValue(theme, "theme");
                    ThemeUtils.Api31.applyThemesSystemBarAppearance(theme, viewGroup, typedValue);
                    viewGroup.setOnHierarchyChangeListener(null);
                    window.setDecorFitsSystemWindows(this$0.f20092j);
                    exitAnimationListener2.onSplashScreenExit(new SplashScreenViewProvider(splashScreenView, activity));
                }
            });
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "", "shouldKeepOnScreen", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface KeepOnScreenCondition {
        @MainThread
        boolean shouldKeepOnScreen();
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "", "onSplashScreenExit", "", "splashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnExitAnimationListener {
        @MainThread
        void onSplashScreenExit(@NotNull SplashScreenViewProvider splashScreenViewProvider);
    }

    public SplashScreen(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this.f20078a = Build.VERSION.SDK_INT >= 31 ? new Impl31(activity) : new Impl(activity);
    }

    public static final void access$install(SplashScreen splashScreen) {
        splashScreen.f20078a.a();
    }

    @JvmStatic
    @NotNull
    public static final SplashScreen installSplashScreen(@NotNull Activity activity) {
        return INSTANCE.installSplashScreen(activity);
    }

    public final void setKeepOnScreenCondition(@NotNull KeepOnScreenCondition condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f20078a.b(condition);
    }

    public final void setOnExitAnimationListener(@NotNull OnExitAnimationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f20078a.c(listener);
    }
}
