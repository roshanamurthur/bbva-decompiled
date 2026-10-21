package com.bbva.glomo.router;

import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.Animation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RouteActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity;", "", "", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "route", "Lcom/bbva/glomohybrid/base/Animation;", "b", "Lcom/bbva/glomohybrid/base/Animation;", "getAnimation", "()Lcom/bbva/glomohybrid/base/Animation;", "animation", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/base/Animation;)V", "CellsRouteActivity", "LandingRouteActivity", "WebAppRouteActivity", "WebViewErrorRouteActivity", "WebViewForceUpdateRouteActivity", "WebViewRouteActivity", "WelcomeRouteActivity", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class RouteActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Animation animation;

    /* JADX INFO: compiled from: RouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity$CellsRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CellsRouteActivity extends RouteActivity {

        @NotNull
        public static final CellsRouteActivity INSTANCE = new CellsRouteActivity();

        public CellsRouteActivity() {
            super("cellsweb", Animation.None.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: RouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity$LandingRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LandingRouteActivity extends RouteActivity {

        @NotNull
        public static final LandingRouteActivity INSTANCE = new LandingRouteActivity();

        public LandingRouteActivity() {
            super("landing", Animation.Fade.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: RouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity$WebAppRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WebAppRouteActivity extends RouteActivity {

        @NotNull
        public static final WebAppRouteActivity INSTANCE = new WebAppRouteActivity();

        public WebAppRouteActivity() {
            super(RouteConstants.WEBAPP, Animation.None.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: RouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity$WebViewErrorRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WebViewErrorRouteActivity extends RouteActivity {

        @NotNull
        public static final WebViewErrorRouteActivity INSTANCE = new WebViewErrorRouteActivity();

        public WebViewErrorRouteActivity() {
            super("webview-error", Animation.Fade.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: RouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity$WebViewForceUpdateRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WebViewForceUpdateRouteActivity extends RouteActivity {

        @NotNull
        public static final WebViewForceUpdateRouteActivity INSTANCE = new WebViewForceUpdateRouteActivity();

        public WebViewForceUpdateRouteActivity() {
            super("webview-force-update", Animation.Fade.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: RouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity$WebViewRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WebViewRouteActivity extends RouteActivity {

        @NotNull
        public static final WebViewRouteActivity INSTANCE = new WebViewRouteActivity();

        public WebViewRouteActivity() {
            super("webview", Animation.None.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: RouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/RouteActivity$WelcomeRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WelcomeRouteActivity extends RouteActivity {

        @NotNull
        public static final WelcomeRouteActivity INSTANCE = new WelcomeRouteActivity();

        public WelcomeRouteActivity() {
            super("welcome", Animation.Fade.INSTANCE);
        }
    }

    public RouteActivity(@NotNull String route, @NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.route = route;
        this.animation = animation;
    }

    @NotNull
    public Animation getAnimation() {
        return this.animation;
    }

    @NotNull
    public String getRoute() {
        return this.route;
    }
}
