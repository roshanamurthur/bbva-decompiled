package com.bbva.glomohybrid.logs;

import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.notifications.NotificationConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoggerHandlerGroup.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/logs/LoggerHandlerGroup;", "", "", "a", "Ljava/lang/String;", "getOriginId", "()Ljava/lang/String;", NotificationConstants.SALESFORCE_ORIGIN_ID, "", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "b", "Ljava/util/List;", "getLoggerHandlers", "()Ljava/util/List;", "loggerHandlers", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "glomo-logs_release"}, k = 1, mv = {1, 9, 0})
public final class LoggerHandlerGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String originId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<LoggerHandler> loggerHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public LoggerHandlerGroup(@NotNull String originId, @NotNull List<? extends LoggerHandler> loggerHandlers) {
        Intrinsics.checkNotNullParameter(originId, "originId");
        Intrinsics.checkNotNullParameter(loggerHandlers, "loggerHandlers");
        this.originId = originId;
        this.loggerHandlers = loggerHandlers;
    }

    @NotNull
    public final List<LoggerHandler> getLoggerHandlers() {
        return this.loggerHandlers;
    }

    @NotNull
    public final String getOriginId() {
        return this.originId;
    }
}
