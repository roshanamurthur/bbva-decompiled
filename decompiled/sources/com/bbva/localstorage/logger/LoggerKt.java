package com.bbva.localstorage.logger;

import androidx.exifinterface.media.ExifInterface;
import bk.p;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobile.elogger.model.ErrorPayload;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.localstorage.BuildConfig;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000\u001a\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "ex", "Ljava/lang/Class;", "origin", "", "logError", "", "message", LogKeysKt.LOG, "local-storage_release"}, k = 2, mv = {1, 8, 0})
public final class LoggerKt {
    public static final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger.log$default(EtherLogger.INSTANCE, BuildConfig.LIBRARY_PACKAGE_NAME, null, LoggerLevel.INFO, new LoggableItem(p.mapOf(new Pair("message", message))), 2, null);
    }

    public static final <T> void logError(@NotNull Throwable ex, @NotNull Class<T> origin) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Intrinsics.checkNotNullParameter(origin, "origin");
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        String simpleName = origin.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "origin.simpleName");
        String message = ex.getMessage();
        if (message == null) {
            message = "<no_message>";
        }
        etherLogger.logError(BuildConfig.LIBRARY_PACKAGE_NAME, new ErrorPayload(60000, "6.0.0", ex, simpleName, message, q.emptyMap()));
    }
}
