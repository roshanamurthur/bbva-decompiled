package com.bbva.bridge.webcontroller;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.AppLifecycle;
import com.bbva.cellscore.app.Reactor;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.glomohybrid.base.webview.WebActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebControllerExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/bbva/cellscore/app/AppLifecycle;", "Lcom/bbva/cellscore/app/WebViewBuilder;", "builder", "", "switchWebConfiguration", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "a", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getACTION_SWITCH_WEB", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_SWITCH_WEB", "cells-bridge_release"}, k = 2, mv = {1, 9, 0})
public final class WebControllerExtensionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Unit> f26658a = new ActionSpec<>("action-switch-web");

    @NotNull
    public static final ActionSpec<Unit> getACTION_SWITCH_WEB() {
        return f26658a;
    }

    public static final void switchWebConfiguration(@NotNull AppLifecycle appLifecycle, @NotNull WebViewBuilder builder) {
        Intrinsics.checkNotNullParameter(appLifecycle, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        appLifecycle.reloadWebViewConfiguration(builder);
        Reactor.in(WebActions.ID).doAction(f26658a).fire();
    }
}
