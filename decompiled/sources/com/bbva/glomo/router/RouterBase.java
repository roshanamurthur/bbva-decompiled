package com.bbva.glomo.router;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.router.IntentExtra;
import com.bbva.glomohybrid.base.router.Router;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RouterBase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b&\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0004J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\"\u0010\u001d\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/bbva/glomo/router/RouterBase;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/os/Bundle;", "bundle", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "parcel", "", "finalizeCurrentActivity", "", "continueNavigation", "(Landroid/app/Activity;Landroid/os/Bundle;Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFromLegacyApp", "setUserComesFromLegacyApp", "getUserComesFromLegacyApp", "navigateToWebViewNotAvailableActivity", "clearStack", "navigateToAccessScreen", "navigateToCells", "navigateToWelcome", "navigateToExternalWeb", "navigateToWebApp", "p0", "Z", "isUserFromLegacyApp$gl_router_mexicoRelease", "()Z", "setUserFromLegacyApp$gl_router_mexicoRelease", "(Z)V", "isUserFromLegacyApp", "<init>", "()V", "Companion", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class RouterBase {

    @NotNull
    public static final String PARAM_IS_LEGACY_USER = "is_legacy_user";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public boolean isUserFromLegacyApp;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final NavigationToAcessScreenHandler f30702q0 = new NavigationToAcessScreenHandler();

    public static /* synthetic */ Object continueNavigation$default(RouterBase routerBase, Activity activity, Bundle EMPTY, IntentExtra.Parcel parcel, boolean z10, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: continueNavigation");
        }
        if ((i10 & 2) != 0) {
            EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        Bundle bundle = EMPTY;
        if ((i10 & 4) != 0) {
            parcel = null;
        }
        IntentExtra.Parcel parcel2 = parcel;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return routerBase.continueNavigation(activity, bundle, parcel2, z10, continuation);
    }

    public static /* synthetic */ void navigateToAccessScreen$default(RouterBase routerBase, Activity activity, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToAccessScreen");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        routerBase.navigateToAccessScreen(activity, z10);
    }

    public static /* synthetic */ void navigateToExternalWeb$default(RouterBase routerBase, Activity activity, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToExternalWeb");
        }
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        routerBase.navigateToExternalWeb(activity, bundle);
    }

    public static /* synthetic */ void navigateToWebApp$default(RouterBase routerBase, Activity activity, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToWebApp");
        }
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        routerBase.navigateToWebApp(activity, bundle);
    }

    @Nullable
    public abstract Object continueNavigation(@NotNull Activity activity, @NotNull Bundle bundle, @Nullable IntentExtra.Parcel parcel, boolean z10, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: getUserComesFromLegacyApp, reason: from getter */
    public final boolean getIsUserFromLegacyApp() {
        return this.isUserFromLegacyApp;
    }

    public final boolean isUserFromLegacyApp$gl_router_mexicoRelease() {
        return this.isUserFromLegacyApp;
    }

    public final void navigateToAccessScreen(@NotNull Activity activity, boolean clearStack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f30702q0.navigateToAccessScreen(activity, clearStack);
    }

    public final void navigateToCells(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Router.navigate$default(Router.INSTANCE, activity, RouteActivity.CellsRouteActivity.INSTANCE.getRoute(), null, null, null, false, 60, null);
    }

    public final void navigateToExternalWeb(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Router router = Router.INSTANCE;
        RouteActivity.WebViewRouteActivity webViewRouteActivity = RouteActivity.WebViewRouteActivity.INSTANCE;
        Router.navigate$default(router, activity, webViewRouteActivity.getRoute(), webViewRouteActivity.getAnimation(), bundle, null, false, 48, null);
    }

    public final void navigateToWebApp(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Router router = Router.INSTANCE;
        RouteActivity.WebAppRouteActivity webAppRouteActivity = RouteActivity.WebAppRouteActivity.INSTANCE;
        Router.navigate$default(router, activity, webAppRouteActivity.getRoute(), webAppRouteActivity.getAnimation(), bundle, null, false, 48, null);
    }

    public final void navigateToWebViewNotAvailableActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Router router = Router.INSTANCE;
        RouteActivity.WebViewErrorRouteActivity webViewErrorRouteActivity = RouteActivity.WebViewErrorRouteActivity.INSTANCE;
        Router.navigate$default(router, activity, webViewErrorRouteActivity.getRoute(), webViewErrorRouteActivity.getAnimation(), null, null, false, 56, null);
    }

    public void navigateToWelcome(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Router router = Router.INSTANCE;
        RouteActivity.WelcomeRouteActivity welcomeRouteActivity = RouteActivity.WelcomeRouteActivity.INSTANCE;
        Router.navigate$default(router, activity, welcomeRouteActivity.getRoute(), welcomeRouteActivity.getAnimation(), null, null, false, 56, null);
    }

    public final void setUserComesFromLegacyApp(boolean isFromLegacyApp) {
        this.isUserFromLegacyApp = isFromLegacyApp;
    }

    public final void setUserFromLegacyApp$gl_router_mexicoRelease(boolean z10) {
        this.isUserFromLegacyApp = z10;
    }
}
