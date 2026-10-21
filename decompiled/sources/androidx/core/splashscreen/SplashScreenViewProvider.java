package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import androidx.annotation.RequiresApi;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.time.Duration;
import java.time.Instant;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SplashScreenViewProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider;", "", "", RemoveCommand.ID, "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "getIconView", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "Landroid/app/Activity;", "ctx", "<init>", "(Landroid/app/Activity;)V", "Landroid/window/SplashScreenView;", "platformView", "(Landroid/window/SplashScreenView;Landroid/app/Activity;)V", "a", "b", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"ViewConstructor"})
public final class SplashScreenViewProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f20098a;

    /* JADX INFO: compiled from: SplashScreenViewProvider.kt */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Activity f20099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Lazy f20100b;

        /* JADX INFO: renamed from: androidx.core.splashscreen.SplashScreenViewProvider$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SplashScreenViewProvider.kt */
        public static final class C0072a extends Lambda implements Function0<ViewGroup> {
            public C0072a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewGroup invoke() {
                View viewInflate = View.inflate(a.this.f20099a, R.layout.splash_screen_view, null);
                if (viewInflate != null) {
                    return (ViewGroup) viewInflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }

        public a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f20099a = activity;
            this.f20100b = LazyKt__LazyJVMKt.lazy(new C0072a());
        }

        public void a() {
            View rootView = ((ViewGroup) this.f20099a.findViewById(android.R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView((ViewGroup) this.f20100b.getValue());
            }
        }

        public long b() {
            return 0L;
        }

        public long c() {
            return 0L;
        }

        @NotNull
        public View d() {
            View viewFindViewById = e().findViewById(R.id.splashscreen_icon_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "splashScreenView.findVie…d.splashscreen_icon_view)");
            return viewFindViewById;
        }

        @NotNull
        public ViewGroup e() {
            return (ViewGroup) this.f20100b.getValue();
        }

        public void f() {
            ViewParent parent = e().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(e());
            }
        }
    }

    public SplashScreenViewProvider(@NotNull Activity activity) {
        a aVar;
        Intrinsics.checkNotNullParameter(activity, "ctx");
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            aVar = new b(activity);
        } else {
            aVar = new a(activity);
        }
        aVar.a();
        this.f20098a = aVar;
    }

    public final long getIconAnimationDurationMillis() {
        return this.f20098a.b();
    }

    public final long getIconAnimationStartMillis() {
        return this.f20098a.c();
    }

    @NotNull
    public final View getIconView() {
        return this.f20098a.d();
    }

    @NotNull
    public final View getView() {
        return this.f20098a.e();
    }

    public final void remove() {
        this.f20098a.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(31)
    public SplashScreenViewProvider(@NotNull SplashScreenView platformView, @NotNull Activity ctx) {
        this(ctx);
        Intrinsics.checkNotNullParameter(platformView, "platformView");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        b bVar = (b) this.f20098a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(platformView, "<set-?>");
        bVar.f20102c = platformView;
    }

    /* JADX INFO: compiled from: SplashScreenViewProvider.kt */
    @RequiresApi(31)
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SplashScreenView f20102c;

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.a
        public final long b() {
            Duration iconAnimationDuration = g().getIconAnimationDuration();
            if (iconAnimationDuration != null) {
                return iconAnimationDuration.toMillis();
            }
            return 0L;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.a
        public final long c() {
            Instant iconAnimationStart = g().getIconAnimationStart();
            if (iconAnimationStart != null) {
                return iconAnimationStart.toEpochMilli();
            }
            return 0L;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.a
        @NotNull
        public final View d() {
            View iconView = g().getIconView();
            Intrinsics.checkNotNull(iconView);
            return iconView;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.a
        public final ViewGroup e() {
            return g();
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.a
        public final void f() {
            g().remove();
            Activity activity = this.f20099a;
            Resources.Theme theme = activity.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
            View decorView = activity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
            ThemeUtils.Api31.applyThemesSystemBarAppearance$default(theme, decorView, null, 4, null);
        }

        @NotNull
        public final SplashScreenView g() {
            SplashScreenView splashScreenView = this.f20102c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("platformView");
            return null;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.a
        public final void a() {
        }
    }
}
