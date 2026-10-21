package com.bbva.bridge.core;

import com.bbva.cellscore.app.AppLifecycle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppLifecycleProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/bridge/core/AppLifecycleProvider;", "", "appLifecycle", "Lcom/bbva/cellscore/app/AppLifecycle;", "getAppLifecycle", "()Lcom/bbva/cellscore/app/AppLifecycle;", "cells-bridge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AppLifecycleProvider {
    @NotNull
    AppLifecycle getAppLifecycle();
}
