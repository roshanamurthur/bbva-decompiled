package com.bbva.ethermobilesdk.pinning.logger;

import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u00020\u0005*\u00020\bH\u0002¨\u0006\u000f"}, d2 = {LogKeysKt.LOG, "", "loggerLevel", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "message", "", "logError", "cause", "", "ex", "toJSON", "throwable", "recursion", "", "toJson", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LoggerKt {
    public static final void log(@NotNull LoggerLevel loggerLevel, @NotNull String message) {
        Intrinsics.checkNotNullParameter(loggerLevel, "loggerLevel");
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger.log$default(EtherLogger.INSTANCE, "com.bbva.ethermobilesdk.pinning", null, loggerLevel, new LoggableItem(q.mapOf(TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal())), TuplesKt.to("message", message))), 2, null);
    }

    public static /* synthetic */ void log$default(LoggerLevel loggerLevel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loggerLevel = LoggerLevel.VERBOSE;
        }
        log(loggerLevel, str);
    }

    public static final void logError(@NotNull Throwable ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        logError(null, ex);
    }

    public static /* synthetic */ void logError$default(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logError(str, th2);
    }

    @NotNull
    public static final String toJSON(@NotNull Throwable throwable, int i10) throws JSONException {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Name.LABEL, throwable.getClass().getName());
        String message = throwable.getMessage();
        if (message != null) {
            jSONObject.put("message", message);
        }
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        jSONObject.put(LogKeysKt.STACKTRACE, ArraysKt___ArraysKt.joinToString$default(stackTrace, RootService.LINE_BREAK, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Throwable cause = throwable.getCause();
        if (cause != null && i10 < 4) {
            jSONObject.put("cause", toJSON(cause, i10 + 1));
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n    .apply …       }\n    }.toString()");
        return string;
    }

    public static /* synthetic */ String toJSON$default(Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return toJSON(th2, i10);
    }

    private static final String toJson(Throwable th2) {
        return toJSON$default(th2, 0, 2, null);
    }

    public static final void logError(@Nullable String str, @Nullable Throwable th2) {
        Pair[] pairArr = new Pair[2];
        LoggerLevel loggerLevel = LoggerLevel.ERROR;
        pairArr[0] = TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal()));
        if (str == null) {
            str = "<empty message>";
        }
        pairArr[1] = TuplesKt.to("message", str);
        Map mapMutableMapOf = q.mutableMapOf(pairArr);
        if (th2 != null) {
            mapMutableMapOf.put("throwable", toJson(th2));
        }
        EtherLogger.log$default(EtherLogger.INSTANCE, "com.bbva.ethermobilesdk.pinning", null, loggerLevel, new LoggableItem(mapMutableMapOf), 2, null);
    }
}
