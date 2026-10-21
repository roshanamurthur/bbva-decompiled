package com.bbva.glomo.router;

import android.app.Activity;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.ViewValue;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.extensions.MobileServicesExtensionsKt;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomoutils.AnyExtensionsKt;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HybridRouter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J,\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0004J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomo/router/HybridRouter;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/base/router/Route;", "route", "", "webNavigation", "", "clearHistory", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "nativeNavigation", "openDialer", "openExternalApp", "openMarket", "openExternalLink", "Lkotlinx/coroutines/flow/Flow;", "Ljava/lang/Exception;", "getNavigationErrorFlow", "()Lkotlinx/coroutines/flow/Flow;", "navigationErrorFlow", "Lcom/bbva/actionlauncher/ActionLauncher;", "launcher", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "<init>", "(Lcom/bbva/actionlauncher/ActionLauncher;Lcom/bbva/glomoutils/mobileservices/MobileServices;)V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class HybridRouter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActionLauncher f30694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MobileServices f30695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f30696c;

    /* JADX INFO: compiled from: HybridRouter.kt */
    public static final class a extends Lambda implements Function0<Router> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f30697p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Router invoke() {
            return (Router) ComponentManager.get(Router.ID);
        }
    }

    public HybridRouter(@NotNull ActionLauncher launcher, @NotNull MobileServices mobileServices) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        this.f30694a = launcher;
        this.f30695b = mobileServices;
        this.f30696c = LazyKt__LazyJVMKt.lazy(a.f30697p0);
    }

    public static /* synthetic */ void nativeNavigation$default(HybridRouter hybridRouter, Activity activity, Route route, boolean z10, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nativeNavigation");
        }
        if ((i10 & 8) != 0) {
            obj = null;
        }
        hybridRouter.nativeNavigation(activity, route, z10, obj);
    }

    @NotNull
    public final Flow<Exception> getNavigationErrorFlow() {
        Object value = this.f30696c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return ((Router) value).getNAVIGATION_ERROR_FLOW();
    }

    public final void nativeNavigation(@NotNull Activity activity, @NotNull Route route, boolean clearHistory, @Nullable Object payload) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(route, "route");
        Object value = this.f30696c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Router) value).navigate(activity, route.getRoute(), route.getAnimation(), AnyExtensionsKt.toBundle(payload), route.getParcel(), clearHistory);
    }

    public final void openDialer(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f30694a.launchDialer(route.getRoute());
    }

    public final void openExternalApp(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        String route2 = route.getRoute();
        ActionLauncher actionLauncher = this.f30694a;
        if (actionLauncher.launchApp(route2)) {
            return;
        }
        actionLauncher.launchMarket(route2, MobileServicesExtensionsKt.getPlatformType(this.f30695b));
    }

    public final void openExternalLink(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f30694a.launchView(new ViewValue.Url(route.getRoute()));
    }

    public final void openMarket(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f30694a.launchMarket(route.getRoute(), MobileServicesExtensionsKt.getPlatformType(this.f30695b));
    }

    public final void webNavigation(@NotNull Activity activity, @NotNull Route route) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(route, "route");
        nativeNavigation$default(this, activity, Route.copy$default(route, "cellsweb", null, null, 6, null), false, null, 8, null);
    }
}
