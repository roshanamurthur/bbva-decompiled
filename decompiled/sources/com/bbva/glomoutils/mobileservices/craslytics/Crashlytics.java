package com.bbva.glomoutils.mobileservices.craslytics;

import com.bbva.cellscore.app.AppLifecycleBuilder;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Crashlytics.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", "", "addTracker", "", "appLifecycle", "Lcom/bbva/cellscore/app/AppLifecycleBuilder;", "enabled", "", LogKeysKt.LOG, "message", "", "recordException", "throwable", "", "setCustomKey", "key", "value", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Crashlytics {
    void addTracker(@NotNull AppLifecycleBuilder appLifecycle, boolean enabled);

    void log(@NotNull String message);

    void recordException(@NotNull Throwable throwable);

    void setCustomKey(@NotNull String key, @NotNull String value);

    void setCustomKey(@NotNull String key, boolean value);
}
