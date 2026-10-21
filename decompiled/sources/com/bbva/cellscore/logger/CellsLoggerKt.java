package com.bbva.cellscore.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\b"}, d2 = {"jsonParamOf", "Lcom/bbva/cellscore/logger/LogJsonParam;", "name", "", "value", "", "paramOf", "Lcom/bbva/cellscore/logger/LogPlainParam;", "cells-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class CellsLoggerKt {
    @NotNull
    public static final LogJsonParam jsonParamOf(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LogJsonParam(name, obj);
    }

    @NotNull
    public static final LogPlainParam paramOf(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LogPlainParam(name, obj);
    }
}
