package com.bbva.glomohybrid.logs;

import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.extensions.EtherLoggerExtensionsKt;
import com.bbva.glomohybrid.logs.extensions.TraceExtensionsKt;
import com.bbva.glomohybrid.logs.model.Trace;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\u001e\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a\u001e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a,\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a,\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\"\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobile/elogger/LoggerLevel;", "level", "Lkotlin/Function0;", "Lcom/bbva/glomohybrid/logs/model/Trace;", LogKeysKt.TRACE, "", "", "message", "", "Lcom/bbva/glomohybrid/logs/LogHandlers;", "handlers", "logVerbose", "logDebug", "logWarning", "logInfo", "", "ex", "logError", "logCritical", "glomoOrigin", "Ljava/lang/String;", "glomo-logs_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/bbva/glomohybrid/logs/LoggerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
public final class LoggerKt {

    @NotNull
    public static final String glomoOrigin = "com.bbva.glomohybrid";

    public static final Map<String, Object> a(LoggerLevel loggerLevel, String str) {
        return q.mapOf(TuplesKt.to("type", LogKeysKt.LOG), TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal())), TuplesKt.to("message", str));
    }

    public static final void b(LoggerLevel loggerLevel, Map<String, ? extends Object> map, List<? extends LogHandlers> list) {
        EtherLoggerExtensionsKt.log(EtherLogger.INSTANCE, glomoOrigin, LogHandlers.INSTANCE.handlerIds(list), loggerLevel, new LoggableItem(map));
    }

    public static final void logCritical(@NotNull String message, @Nullable Throwable th2, @NotNull List<? extends LogHandlers> handlers) {
        Map<String, Object> mapPlus;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        LoggerLevel loggerLevel = LoggerLevel.WTF;
        Map<String, Object> mapA = a(loggerLevel, message);
        if (th2 != null && (mapPlus = q.plus(mapA, TuplesKt.to(LogKeysKt.STACKTRACE, th2))) != null) {
            mapA = mapPlus;
        }
        b(loggerLevel, mapA, handlers);
    }

    public static /* synthetic */ void logCritical$default(String str, Throwable th2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        logCritical(str, th2, list);
    }

    public static final void logDebug(@NotNull String message, @NotNull List<? extends LogHandlers> handlers) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        LoggerLevel loggerLevel = LoggerLevel.DEBUG;
        b(loggerLevel, a(loggerLevel, message), handlers);
    }

    public static /* synthetic */ void logDebug$default(String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        logDebug(str, list);
    }

    public static final void logError(@NotNull String message, @Nullable Throwable th2, @NotNull List<? extends LogHandlers> handlers) {
        Map<String, Object> mapPlus;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        LoggerLevel loggerLevel = LoggerLevel.ERROR;
        Map<String, Object> mapA = a(loggerLevel, message);
        if (th2 != null && (mapPlus = q.plus(mapA, TuplesKt.to(LogKeysKt.STACKTRACE, th2))) != null) {
            mapA = mapPlus;
        }
        b(loggerLevel, mapA, handlers);
    }

    public static /* synthetic */ void logError$default(String str, Throwable th2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        logError(str, th2, list);
    }

    public static final void logInfo(@NotNull String message, @NotNull List<? extends LogHandlers> handlers) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        LoggerLevel loggerLevel = LoggerLevel.INFO;
        b(loggerLevel, a(loggerLevel, message), handlers);
    }

    public static /* synthetic */ void logInfo$default(String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        logInfo(str, list);
    }

    public static final void logVerbose(@NotNull String message, @NotNull List<? extends LogHandlers> handlers) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        LoggerLevel loggerLevel = LoggerLevel.VERBOSE;
        b(loggerLevel, a(loggerLevel, message), handlers);
    }

    public static /* synthetic */ void logVerbose$default(String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        logVerbose(str, list);
    }

    public static final void logWarning(@NotNull String message, @NotNull List<? extends LogHandlers> handlers) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        LoggerLevel loggerLevel = LoggerLevel.WARNING;
        b(loggerLevel, a(loggerLevel, message), handlers);
    }

    public static /* synthetic */ void logWarning$default(String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        logWarning(str, list);
    }

    public static final void trace(@NotNull LoggerLevel level, @NotNull Function0<Trace> trace) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(trace, "trace");
        EtherLogger.log$default(EtherLogger.INSTANCE, glomoOrigin, null, level, new LoggableItem(TraceExtensionsKt.plus(q.mapOf(TuplesKt.to("type", LogKeysKt.TRACE), TuplesKt.to("level", Integer.valueOf(level.ordinal()))), trace.invoke())), 2, null);
    }

    public static /* synthetic */ void trace$default(LoggerLevel loggerLevel, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loggerLevel = LoggerLevel.VERBOSE;
        }
        trace(loggerLevel, function0);
    }
}
