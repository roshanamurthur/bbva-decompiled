package com.bbva.cellscore.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/cellscore/logger/LogParam;", "", "serialize", "", "serializer", "Lcom/bbva/cellscore/logger/LogSerializer;", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface LogParam {

    /* JADX INFO: compiled from: Model.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String serialize(@NotNull LogParam logParam, @NotNull LogSerializer serializer) {
            Intrinsics.checkNotNullParameter(logParam, "this");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            return logParam.toString();
        }
    }

    @NotNull
    String serialize(@NotNull LogSerializer serializer);
}
