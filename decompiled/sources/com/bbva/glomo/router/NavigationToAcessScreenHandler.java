package com.bbva.glomo.router;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.router.Router;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NavigationToAcessScreenHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomo/router/NavigationToAcessScreenHandler;", "", "()V", "navigateToAccessScreen", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "clearStack", "", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NavigationToAcessScreenHandler {
    public static /* synthetic */ void navigateToAccessScreen$default(NavigationToAcessScreenHandler navigationToAcessScreenHandler, Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        navigationToAcessScreenHandler.navigateToAccessScreen(activity, z10);
    }

    public final void navigateToAccessScreen(@NotNull Activity activity, boolean clearStack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Router router = Router.INSTANCE;
        RouteActivity.LandingRouteActivity landingRouteActivity = RouteActivity.LandingRouteActivity.INSTANCE;
        Router.navigate$default(router, activity, landingRouteActivity.getRoute(), landingRouteActivity.getAnimation(), null, null, clearStack, 24, null);
    }
}
