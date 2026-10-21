package com.bbva.ethermobilesdk.securesharing.extension;

import ak.b;
import androidx.camera.core.processing.f;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0000\"\u001a\u0010\b\u001a\u00020\u00008\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "message", "", LogKeysKt.LOG, "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "logError", "SecureSharingOrigin", "Ljava/lang/String;", "getSecureSharingOrigin", "()Ljava/lang/String;", "securesharing_release"}, k = 2, mv = {1, 5, 1})
public final class LoggerKt {
    @NotNull
    public static final String getSecureSharingOrigin() {
        return "com.bbva.ethermobilesdk.secure.sharing";
    }

    public static final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        LoggerLevel loggerLevel = LoggerLevel.VERBOSE;
        EtherLogger.log$default(etherLogger, "com.bbva.ethermobilesdk.secure.sharing", null, loggerLevel, new LoggableItem(q.mapOf(TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal())), TuplesKt.to("message", message))), 2, null);
    }

    public static final void logError(@NotNull String message, @Nullable Exception exc) {
        String strStackTraceToString;
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        LoggerLevel loggerLevel = LoggerLevel.ERROR;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("level", Integer.valueOf(loggerLevel.ordinal()));
        StringBuilder sbE = f.e(message, " [");
        sbE.append((Object) (exc == null ? null : exc.getMessage()));
        sbE.append(AbstractJsonLexerKt.END_LIST);
        pairArr[1] = TuplesKt.to("message", sbE.toString());
        String str = "";
        if (exc != null && (strStackTraceToString = b.stackTraceToString(exc)) != null) {
            str = strStackTraceToString;
        }
        pairArr[2] = TuplesKt.to(LogKeysKt.STACKTRACE, str);
        EtherLogger.log$default(etherLogger, "com.bbva.ethermobilesdk.secure.sharing", null, loggerLevel, new LoggableItem(q.mapOf(pairArr)), 2, null);
    }

    public static /* synthetic */ void logError$default(String str, Exception exc, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            exc = null;
        }
        logError(str, exc);
    }
}
