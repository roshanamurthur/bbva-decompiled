package com.salesforce.marketingcloud.sfmcsdk.components.logging;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b&\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u00020\u00112\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0016J*\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0016J\u001e\u0010 \u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0016J*\u0010 \u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J7\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0000¢\u0006\u0002\b'J\u001e\u0010(\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0016J*\u0010(\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/Logger;", "", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener;", "getListener", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener;", "setListener", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener;)V", "logLevel", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogLevel;", "getLogLevel", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogLevel;", "setLogLevel", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogLevel;)V", "redactedValues", "", "", "getRedactedValues", "()Ljava/util/List;", "setRedactedValues", "(Ljava/util/List;)V", "createTag", LogKeysKt.TAG, "clazz", "Lkotlin/reflect/KClass;", "d", "", "lazyMsg", "Lkotlin/Function0;", "throwable", "", "e", "formatMsg", NotificationCompat.CATEGORY_MESSAGE, "formatTag", LogKeysKt.LOG, "lvl", "t", "log$sfmcsdk_release", "w", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Logger {
    private static final int MAX_TAG_LENGTH = 23;

    @NotNull
    private static final String REDACTED_VALUE_REPLACEMENT_TEXT = "[REDACTED]";

    @Nullable
    private LogListener listener;

    @NotNull
    private List<String> redactedValues = CollectionsKt__CollectionsKt.emptyList();

    @NotNull
    private LogLevel logLevel = LogLevel.ERROR;

    public static /* synthetic */ void d$default(Logger logger, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logger.d(str, th2, function0);
    }

    public static /* synthetic */ void e$default(Logger logger, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logger.e(str, th2, function0);
    }

    private final String formatMsg(String msg) {
        if (TextUtils.getTrimmedLength(msg) == 0) {
            return "FORMATTED LOG MESSAGE WAS EMPTY";
        }
        for (String str : getRedactedValues()) {
            if (!Intrinsics.areEqual(REDACTED_VALUE_REPLACEMENT_TEXT, str)) {
                msg = l.replace(msg, str, REDACTED_VALUE_REPLACEMENT_TEXT, true);
            }
        }
        return msg;
    }

    private final String formatTag(String tag) {
        return tag.length() <= 23 ? tag : tag.subSequence(0, 23).toString();
    }

    public static /* synthetic */ void log$sfmcsdk_release$default(Logger logger, LogLevel logLevel, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        logger.log$sfmcsdk_release(logLevel, str, th2, function0);
    }

    public static /* synthetic */ void w$default(Logger logger, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logger.w(str, th2, function0);
    }

    @NotNull
    public final String createTag(@NotNull KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String simpleName = JvmClassMappingKt.getJavaClass((KClass) clazz).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "clazz.java.simpleName");
        return createTag(simpleName);
    }

    public void d(@NotNull String tag, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        d(tag, null, lazyMsg);
    }

    public void e(@NotNull String tag, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        e(tag, null, lazyMsg);
    }

    @Nullable
    public LogListener getListener() {
        return this.listener;
    }

    @NotNull
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public List<String> getRedactedValues() {
        return this.redactedValues;
    }

    public final void log$sfmcsdk_release(@NotNull LogLevel lvl, @NotNull String tag, @Nullable Throwable t10, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        LogListener listener = getListener();
        if (listener == null || lvl.compareTo(getLogLevel()) < 0) {
            return;
        }
        try {
            listener.out(lvl, formatTag(tag), formatMsg(lazyMsg.invoke()), t10);
        } catch (Exception unused) {
        }
    }

    public void setListener(@Nullable LogListener logListener) {
        this.listener = logListener;
    }

    public void setLogLevel(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "<set-?>");
        this.logLevel = logLevel;
    }

    public void setRedactedValues(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.redactedValues = list;
    }

    public void w(@NotNull String tag, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        w(tag, null, lazyMsg);
    }

    @NotNull
    public final String createTag(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return formatTag(tag);
    }

    public void d(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        log$sfmcsdk_release(LogLevel.DEBUG, tag, throwable, lazyMsg);
    }

    public void e(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        log$sfmcsdk_release(LogLevel.ERROR, tag, throwable, lazyMsg);
    }

    public void w(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        log$sfmcsdk_release(LogLevel.WARN, tag, throwable, lazyMsg);
    }
}
