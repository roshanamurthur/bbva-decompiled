package com.bbva.glomohybrid.base.cells.constants;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyConstants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/constants/KeyConstants;", "", "", "a", "Ljava/lang/String;", "getLOGIN_MENU_DELEGATE_KEY", "()Ljava/lang/String;", "LOGIN_MENU_DELEGATE_KEY", "b", "getLOGIN_ROUTER_KEY", "LOGIN_ROUTER_KEY", "c", "getCELLS_MENU_DELEGATE_KEY", "CELLS_MENU_DELEGATE_KEY", "d", "getCELLS_ROUTER_KEY", "CELLS_ROUTER_KEY", "e", "getWELCOME_ROUTER_KEY", "WELCOME_ROUTER_KEY", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class KeyConstants {

    @NotNull
    public static final KeyConstants INSTANCE = new KeyConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String LOGIN_MENU_DELEGATE_KEY = "loginMenuDelegate";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String LOGIN_ROUTER_KEY = "loginRouter";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String CELLS_MENU_DELEGATE_KEY = "cellsMenuDelegate";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String CELLS_ROUTER_KEY = "cellsRouter";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String WELCOME_ROUTER_KEY = "welcomeRouter";

    @NotNull
    public final String getCELLS_MENU_DELEGATE_KEY() {
        return CELLS_MENU_DELEGATE_KEY;
    }

    @NotNull
    public final String getCELLS_ROUTER_KEY() {
        return CELLS_ROUTER_KEY;
    }

    @NotNull
    public final String getLOGIN_MENU_DELEGATE_KEY() {
        return LOGIN_MENU_DELEGATE_KEY;
    }

    @NotNull
    public final String getLOGIN_ROUTER_KEY() {
        return LOGIN_ROUTER_KEY;
    }

    @NotNull
    public final String getWELCOME_ROUTER_KEY() {
        return WELCOME_ROUTER_KEY;
    }
}
