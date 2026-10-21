package com.bbva.cellscore.logger;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LogSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, d2 = {"Lcom/bbva/cellscore/logger/LogSerializer;", "", "value", "", "serialize", "<init>", "()V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class LogSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Gson f27003a = new Gson();

    @NotNull
    public final String serialize(@Nullable Object value) {
        String json = this.f27003a.toJson(value);
        return json == null ? AbstractJsonLexerKt.NULL : json;
    }
}
