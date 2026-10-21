package com.bbva.slidemenuview.data;

import bk.q;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuBuilder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/bbva/slidemenuview/data/MenuItemStatesBuilder;", "", "", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/slidemenuview/data/MenuState;", "a", "Lcom/bbva/slidemenuview/data/MenuState;", "getNoUser", "()Lcom/bbva/slidemenuview/data/MenuState;", "setNoUser", "(Lcom/bbva/slidemenuview/data/MenuState;)V", "noUser", "b", "getCachedUser", "setCachedUser", "cachedUser", "c", "getLoggedUser", "setLoggedUser", "loggedUser", "<init>", "()V", "Companion", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuItemStatesBuilder {

    @NotNull
    public static final String USER_CACHED = "cached-user";

    @NotNull
    public static final String USER_LOGGED = "logged-user";

    @NotNull
    public static final String USER_NO = "no-user";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MenuState noUser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MenuState cachedUser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MenuState loggedUser;

    public MenuItemStatesBuilder() {
        MenuState menuState = MenuState.DISABLED;
        this.noUser = menuState;
        this.cachedUser = menuState;
        this.loggedUser = menuState;
    }

    @NotNull
    public final Map<String, String> build() {
        return q.mapOf(TuplesKt.to(USER_NO, this.noUser.getState()), TuplesKt.to(USER_CACHED, this.cachedUser.getState()), TuplesKt.to(USER_LOGGED, this.loggedUser.getState()));
    }

    @NotNull
    public final MenuState getCachedUser() {
        return this.cachedUser;
    }

    @NotNull
    public final MenuState getLoggedUser() {
        return this.loggedUser;
    }

    @NotNull
    public final MenuState getNoUser() {
        return this.noUser;
    }

    public final void setCachedUser(@NotNull MenuState menuState) {
        Intrinsics.checkNotNullParameter(menuState, "<set-?>");
        this.cachedUser = menuState;
    }

    public final void setLoggedUser(@NotNull MenuState menuState) {
        Intrinsics.checkNotNullParameter(menuState, "<set-?>");
        this.loggedUser = menuState;
    }

    public final void setNoUser(@NotNull MenuState menuState) {
        Intrinsics.checkNotNullParameter(menuState, "<set-?>");
        this.noUser = menuState;
    }
}
