package com.bbva.ethermobilesdk.deviceuid.utils;

import android.util.Log;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepositoryImpl;
import com.bbva.ethermobilesdk.deviceuid.BuildConfig;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Log.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"", "method", "", "throwable", "", "logError", "deviceuid_release"}, k = 2, mv = {1, 8, 0})
public final class LogKt {
    public static final void logError(@NotNull String method, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        EtherLogger.log$default(EtherLogger.INSTANCE, BuildConfig.LIBRARY_PACKAGE_NAME, null, LoggerLevel.ERROR, new LoggableItem(q.mutableMapOf(TuplesKt.to("method", method), TuplesKt.to(EtherLoggerRepositoryImpl.PARAM_EXCEPTION_STACKTRACE, Log.getStackTraceString(throwable)))), 2, null);
    }
}
