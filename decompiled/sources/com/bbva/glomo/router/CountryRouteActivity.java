package com.bbva.glomo.router;

import com.bbva.glomohybrid.base.Animation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryRouteActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomo/router/CountryRouteActivity;", "", "()V", "WelcomeRouteActivity", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryRouteActivity {

    /* JADX INFO: compiled from: CountryRouteActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/CountryRouteActivity$WelcomeRouteActivity;", "Lcom/bbva/glomo/router/RouteActivity;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WelcomeRouteActivity extends RouteActivity {

        @NotNull
        public static final WelcomeRouteActivity INSTANCE = new WelcomeRouteActivity();

        public WelcomeRouteActivity() {
            super("welcome-video", Animation.Fade.INSTANCE);
        }
    }
}
