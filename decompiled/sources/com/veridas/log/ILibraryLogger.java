package com.veridas.log;

import androidx.annotation.Keep;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ILibraryLogger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/veridas/log/ILibraryLogger;", "", LogKeysKt.LOG, "", LogKeysKt.TAG, "", "message", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ILibraryLogger {
    void log(@NotNull String tag, @NotNull String message);
}
