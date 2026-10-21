package com.bbva.ethermobilesdk.token.logger;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepositoryImpl;
import com.bbva.ethermobilesdk.token.model.EtherTokenInternalError;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherTokenLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a(\u0010\f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobile/elogger/EtherLogger;", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggerLevel", "", "message", "", "logTime", ExifInterface.GPS_DIRECTION_TRUE, "", "ex", "Ljava/lang/Class;", "origin", "logEtherTokenError", "ethertoken_release"}, k = 2, mv = {1, 8, 0})
public final class EtherTokenLoggerKt {
    public static final void a(Map map, Throwable th2, Class cls) {
        map.put("device_os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = "";
        if (str == null) {
            str = "";
        } else {
            Intrinsics.checkNotNullExpressionValue(str, "Build.MANUFACTURER ?: \"\"");
        }
        map.put("device_manufacturer", str);
        String str3 = Build.MODEL;
        if (str3 != null) {
            Intrinsics.checkNotNullExpressionValue(str3, "Build.MODEL ?: \"\"");
            str2 = str3;
        }
        map.put("device_model", str2);
        map.put("device_timestamp", String.valueOf(Calendar.getInstance().getTimeInMillis()));
        map.put("library_version_code", "50100");
        map.put("library_version_name", "5.1.0");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        map.put(EtherLoggerRepositoryImpl.PARAM_EXCEPTION_STACKTRACE, ArraysKt___ArraysKt.joinToString$default(stackTrace, "/n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        String simpleName = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "origin.simpleName");
        map.put("exception_origin", simpleName);
    }

    public static final <T> void logEtherTokenError(@NotNull EtherLogger etherLogger, @NotNull Throwable ex, @NotNull Class<T> origin) {
        Intrinsics.checkNotNullParameter(etherLogger, "<this>");
        Intrinsics.checkNotNullParameter(ex, "ex");
        Intrinsics.checkNotNullParameter(origin, "origin");
        if (ex instanceof EtherTokenInternalError) {
            LoggerLevel loggerLevel = LoggerLevel.ERROR;
            Map<String, String> extras = ((EtherTokenInternalError) ex).getExtras();
            a(extras, ex, origin);
            EtherLogger.log$default(etherLogger, "com.bbva.ethermobilesdk.ethertoken", null, loggerLevel, new LoggableItem(extras), 2, null);
            return;
        }
        LoggerLevel loggerLevel2 = LoggerLevel.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap, ex, origin);
        EtherLogger.log$default(etherLogger, "com.bbva.ethermobilesdk.ethertoken", null, loggerLevel2, new LoggableItem(linkedHashMap), 2, null);
    }

    public static final void logTime(@NotNull EtherLogger etherLogger, @NotNull LoggerLevel loggerLevel, @NotNull String message) {
        Intrinsics.checkNotNullParameter(etherLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggerLevel, "loggerLevel");
        Intrinsics.checkNotNullParameter(message, "message");
        EtherLogger.log$default(etherLogger, "com.bbva.ethermobilesdk.ethertoken", null, loggerLevel, new LoggableItem(q.mapOf(TuplesKt.to("id", "time"), TuplesKt.to("timestamp", String.valueOf(Calendar.getInstance().getTimeInMillis())), TuplesKt.to("message", message))), 2, null);
    }

    public static /* synthetic */ void logTime$default(EtherLogger etherLogger, LoggerLevel loggerLevel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loggerLevel = LoggerLevel.INFO;
        }
        logTime(etherLogger, loggerLevel, str);
    }
}
