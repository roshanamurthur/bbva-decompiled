package com.bbva.bridge.navigate;

import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigateDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u000b"}, d2 = {"Lcom/bbva/bridge/navigate/NavigateDispatcher;", "", "navigate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/bridge/navigate/WebNavigationState;", "route", "", "awaitPageLoaded", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Companion", "cells-bridge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NavigateDispatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f26615a;

    @NotNull
    public static final String ID = "web-navigate-dispatcher";

    /* JADX INFO: compiled from: NavigateDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/bridge/navigate/NavigateDispatcher$Companion;", "", "()V", "ID", "", "cells-bridge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String ID = "web-navigate-dispatcher";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f26615a = new Companion();
    }

    /* JADX INFO: compiled from: NavigateDispatcher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow navigate$default(NavigateDispatcher navigateDispatcher, String str, boolean z10, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                obj = null;
            }
            return navigateDispatcher.navigate(str, z10, obj);
        }
    }

    @NotNull
    Flow<WebNavigationState> navigate(@NotNull String route, boolean awaitPageLoaded, @Nullable Object payload);
}
