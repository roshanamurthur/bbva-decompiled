package com.bbva.ethermobilesdk.tokencompat.extension;

import ak.b;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TokenCompatOrigin", "", LogKeysKt.LOG, "", "message", "logError", "ex", "", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LoggerKt {

    @NotNull
    public static final String TokenCompatOrigin = "com.bbva.ethermobilesdk.tokencompat";

    public static final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        LoggerLevel loggerLevel = LoggerLevel.VERBOSE;
        EtherLogger.log$default(etherLogger, "com.bbva.ethermobilesdk.tokencompat", null, loggerLevel, new LoggableItem(q.mapOf(TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal())), TuplesKt.to("message", message))), 2, null);
    }

    public static final void logError(@NotNull String message, @Nullable Throwable th2) {
        String strStackTraceToString;
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        LoggerLevel loggerLevel = LoggerLevel.ERROR;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal()));
        pairArr[1] = TuplesKt.to("message", message + " [" + (th2 != null ? th2.getMessage() : null) + Constant.BRACKET_CLOSE);
        if (th2 == null || (strStackTraceToString = b.stackTraceToString(th2)) == null) {
            strStackTraceToString = "";
        }
        pairArr[2] = TuplesKt.to(LogKeysKt.STACKTRACE, strStackTraceToString);
        EtherLogger.log$default(etherLogger, "com.bbva.ethermobilesdk.tokencompat", null, loggerLevel, new LoggableItem(q.mapOf(pairArr)), 2, null);
    }

    public static /* synthetic */ void logError$default(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logError(str, th2);
    }
}
