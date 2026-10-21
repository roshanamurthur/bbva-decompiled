package com.bbva.ethermobilesdk.cipher.logger;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.cipher.BuildConfig;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepositoryImpl;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CipherLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001aS\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobile/elogger/EtherLogger;", "", "throwable", "Ljava/lang/Class;", "origin", "", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "logCipherError", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "", "Lkotlin/Pair;", "values", "getLoggerPayload", "([Lkotlin/Pair;)Ljava/util/Map;", "cipher_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCipherLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherLogger.kt\ncom/bbva/ethermobilesdk/cipher/logger/CipherLoggerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class CipherLoggerKt {
    @NotNull
    public static final <A, B> Map<A, B> getLoggerPayload(@NotNull Pair<? extends A, ? extends B>... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q.putAll(linkedHashMap, values);
        return linkedHashMap;
    }

    public static final <T> void logCipherError(@NotNull EtherLogger etherLogger, @NotNull Throwable throwable, @NotNull Class<T> origin, @NotNull Map<String, String> payload) {
        Intrinsics.checkNotNullParameter(etherLogger, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(payload, "payload");
        payload.put("device_os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = "";
        }
        payload.put("device_manufacturer", str);
        String str2 = Build.MODEL;
        payload.put("device_model", str2 != null ? str2 : "");
        payload.put("device_timestamp", String.valueOf(Calendar.getInstance().getTimeInMillis()));
        payload.put("library_version_code", "30300");
        payload.put("library_version_name", "3.3.0");
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        payload.put(EtherLoggerRepositoryImpl.PARAM_EXCEPTION_STACKTRACE, ArraysKt___ArraysKt.joinToString$default(stackTrace, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        String simpleName = origin.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "origin.simpleName");
        payload.put("exception_origin", simpleName);
        EtherLogger.log$default(etherLogger, BuildConfig.LIBRARY_PACKAGE_NAME, null, LoggerLevel.ERROR, new LoggableItem(payload), 2, null);
    }

    public static /* synthetic */ void logCipherError$default(EtherLogger etherLogger, Throwable th2, Class cls, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        logCipherError(etherLogger, th2, cls, map);
    }
}
