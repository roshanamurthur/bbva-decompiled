package com.bbva.cellscore.web.mapper.configuration;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfigurationMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\u0003"}, d2 = {"valueOrEmpty", "", "value", "cells-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class AppConfigurationMapperKt {
    @NotNull
    public static final String valueOrEmpty(@Nullable String str) {
        return str == null ? "" : str;
    }
}
