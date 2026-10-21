package com.bbva.bridge.navigate;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigateDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/bridge/navigate/WebNavigationState;", "", "()V", "Loaded", "Loading", "Lcom/bbva/bridge/navigate/WebNavigationState$Loaded;", "Lcom/bbva/bridge/navigate/WebNavigationState$Loading;", "cells-bridge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class WebNavigationState {

    /* JADX INFO: compiled from: NavigateDispatcher.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/bridge/navigate/WebNavigationState$Loaded;", "Lcom/bbva/bridge/navigate/WebNavigationState;", "", "component1", "route", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "cells-bridge_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Loaded extends WebNavigationState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(@NotNull String route) {
            super(null);
            Intrinsics.checkNotNullParameter(route, "route");
            this.route = route;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = loaded.route;
            }
            return loaded.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        @NotNull
        public final Loaded copy(@NotNull String route) {
            Intrinsics.checkNotNullParameter(route, "route");
            return new Loaded(route);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.route, ((Loaded) other).route);
        }

        @NotNull
        public final String getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Loaded(route="), this.route, ")");
        }
    }

    /* JADX INFO: compiled from: NavigateDispatcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/bridge/navigate/WebNavigationState$Loading;", "Lcom/bbva/bridge/navigate/WebNavigationState;", "()V", "cells-bridge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends WebNavigationState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        public Loading() {
            super(null);
        }
    }

    public WebNavigationState() {
    }

    public /* synthetic */ WebNavigationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
