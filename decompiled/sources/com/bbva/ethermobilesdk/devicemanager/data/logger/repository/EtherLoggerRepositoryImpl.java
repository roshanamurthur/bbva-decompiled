package com.bbva.ethermobilesdk.devicemanager.data.logger.repository;

import androidx.exifinterface.media.ExifInterface;
import bk.p;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobile.elogger.model.ErrorPayload;
import com.bbva.ethermobilesdk.devicemanager.BuildConfig;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherLoggerRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepository;", "", "message", "", LogKeysKt.LOG, ExifInterface.GPS_DIRECTION_TRUE, "", "ex", "Ljava/lang/Class;", "origin", "logError", "<init>", "()V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class EtherLoggerRepositoryImpl implements EtherLoggerRepository {

    @Deprecated
    @NotNull
    public static final String PARAM_EXCEPTION_CAUSED = "exception_caused";

    @Deprecated
    @NotNull
    public static final String PARAM_EXCEPTION_STACKTRACE = "exception_stacktrace";

    @Deprecated
    @NotNull
    public static final String PARAM_MESSAGE = "message";

    @Override // com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepository
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger.log$default(EtherLogger.INSTANCE, BuildConfig.LIBRARY_PACKAGE_NAME, null, LoggerLevel.VERBOSE, new LoggableItem(p.mapOf(new Pair("message", message))), 2, null);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepository
    public <T> void logError(@NotNull Throwable ex, @NotNull Class<T> origin) {
        String strJoinToString$default;
        StackTraceElement[] stackTrace;
        Intrinsics.checkNotNullParameter(ex, "ex");
        Intrinsics.checkNotNullParameter(origin, "origin");
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        String simpleName = origin.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        String message = ex.getMessage();
        if (message == null) {
            message = "<no_message>";
        }
        String str = message;
        Pair[] pairArr = new Pair[2];
        Throwable cause = ex.getCause();
        if (cause == null || (stackTrace = cause.getStackTrace()) == null || (strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(stackTrace, "/n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) == null) {
            strJoinToString$default = "<no_stacktrace_cause>";
        }
        pairArr[0] = new Pair(PARAM_EXCEPTION_CAUSED, strJoinToString$default);
        StackTraceElement[] stackTrace2 = ex.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
        pairArr[1] = new Pair(PARAM_EXCEPTION_STACKTRACE, ArraysKt___ArraysKt.joinToString$default(stackTrace2, "/n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        etherLogger.logError(BuildConfig.LIBRARY_PACKAGE_NAME, new ErrorPayload(10100, "1.1.0", ex, simpleName, str, q.mapOf(pairArr)));
    }
}
