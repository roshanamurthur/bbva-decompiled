package com.bbva.cellscore.web.reader;

import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppConfigurationReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/cellscore/web/reader/Reader;", "", "read", "Ljava/io/InputStream;", "path", "", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Reader {
    @NotNull
    InputStream read(@NotNull String path);
}
