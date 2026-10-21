package com.bbva.glomoconfig.constants;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryRouteConstants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomoconfig/constants/CountryRouteConstants;", "", "()V", "COMING_SOON", "", "DEVICE_ACCESS", "DIGITAL_ACCOUNT", "DIGITAL_ACTIVATION", "ROUTE_MENU_SOFT_TOKEN", "WELCOME_SCREEN", "getMenuSoftTokenRoute", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryRouteConstants {

    @NotNull
    public static final String COMING_SOON = "comingSoon";

    @NotNull
    public static final String DEVICE_ACCESS = "deviceAccess";

    @NotNull
    public static final String DIGITAL_ACCOUNT = "openDigitalAccount";

    @NotNull
    public static final String DIGITAL_ACTIVATION = "digitalActivation";

    @NotNull
    public static final CountryRouteConstants INSTANCE = new CountryRouteConstants();

    @NotNull
    public static final String ROUTE_MENU_SOFT_TOKEN = "N/A";

    @NotNull
    public static final String WELCOME_SCREEN = "welcome-video";

    @NotNull
    public final String getMenuSoftTokenRoute() {
        return ROUTE_MENU_SOFT_TOKEN;
    }
}
