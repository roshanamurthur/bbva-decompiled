package com.bbva.qr.extension;

import ak.b;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u001e\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"LOG_ORIGIN", "", "logError", "", "message", "cause", "", "qr_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LoggerKt {

    @NotNull
    public static final String LOG_ORIGIN = "com.bbva.qr";

    public static final void logError(@Nullable String str, @Nullable Throwable th2) {
        String strStackTraceToString;
        Pair[] pairArr = new Pair[3];
        LoggerLevel loggerLevel = LoggerLevel.ERROR;
        pairArr[0] = TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal()));
        if (str == null) {
            str = th2 != null ? th2.getMessage() : null;
            if (str == null) {
                str = "<empty message>";
            }
        }
        pairArr[1] = TuplesKt.to("message", str);
        if (th2 == null || (strStackTraceToString = b.stackTraceToString(th2)) == null) {
            strStackTraceToString = "";
        }
        pairArr[2] = TuplesKt.to(LogKeysKt.STACKTRACE, strStackTraceToString);
        EtherLogger.log$default(EtherLogger.INSTANCE, "com.bbva.qr", null, loggerLevel, new LoggableItem(q.mutableMapOf(pairArr)), 2, null);
    }

    public static /* synthetic */ void logError$default(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logError(str, th2);
    }
}
