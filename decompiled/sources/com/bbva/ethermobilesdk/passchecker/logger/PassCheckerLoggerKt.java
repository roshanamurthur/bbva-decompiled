package com.bbva.ethermobilesdk.passchecker.logger;

import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepositoryImpl;
import com.bbva.ethermobilesdk.passchecker.BuildConfig;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PassCheckerLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¨\u0006\b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobile/elogger/EtherLogger;", "", "ex", "Ljava/lang/Class;", "origin", "", "logPassCheckerError", "passchecker_release"}, k = 2, mv = {1, 8, 0})
public final class PassCheckerLoggerKt {
    public static final <T> void logPassCheckerError(@NotNull EtherLogger etherLogger, @NotNull Throwable ex, @NotNull Class<T> origin) {
        String strJoinToString$default;
        StackTraceElement[] stackTrace;
        Intrinsics.checkNotNullParameter(etherLogger, "<this>");
        Intrinsics.checkNotNullParameter(ex, "ex");
        Intrinsics.checkNotNullParameter(origin, "origin");
        LoggerLevel loggerLevel = LoggerLevel.ERROR;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("exception_origin", origin.getSimpleName());
        String message = ex.getMessage();
        if (message == null) {
            message = "<no_message>";
        }
        pairArr[1] = new Pair("exception_message", message);
        Throwable cause = ex.getCause();
        if (cause == null || (stackTrace = cause.getStackTrace()) == null || (strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(stackTrace, "/n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) == null) {
            strJoinToString$default = "<no_stacktrace_cause>";
        }
        pairArr[2] = new Pair(EtherLoggerRepositoryImpl.PARAM_EXCEPTION_CAUSED, strJoinToString$default);
        StackTraceElement[] stackTrace2 = ex.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "ex.stackTrace");
        pairArr[3] = new Pair(EtherLoggerRepositoryImpl.PARAM_EXCEPTION_STACKTRACE, ArraysKt___ArraysKt.joinToString$default(stackTrace2, "/n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        EtherLogger.log$default(etherLogger, BuildConfig.LIBRARY_PACKAGE_NAME, null, loggerLevel, new LoggableItem(q.mapOf(pairArr)), 2, null);
    }
}
