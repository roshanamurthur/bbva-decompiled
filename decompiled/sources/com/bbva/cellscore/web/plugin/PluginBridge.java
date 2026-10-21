package com.bbva.cellscore.web.plugin;

import com.bbva.cells.pluginkit.web.JSBridge;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginBridge.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0016J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003¨\u0006\f"}, d2 = {"Lcom/bbva/cellscore/web/plugin/PluginBridge;", "Lcom/bbva/cells/pluginkit/web/JSBridge;", "Lkotlin/Function1;", "", "", "Lcom/bbva/pluginkit/web/MessageListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onPostMessage", "request", "send", "<init>", "()V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class PluginBridge implements JSBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f27199a;

    @Override // com.bbva.cells.pluginkit.web.JSBridge
    public void onPostMessage(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f27199a = listener;
    }

    public final void send(@NotNull String request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Function1<? super String, Unit> function1 = this.f27199a;
        if (function1 == null) {
            return;
        }
        function1.invoke(request);
    }
}
