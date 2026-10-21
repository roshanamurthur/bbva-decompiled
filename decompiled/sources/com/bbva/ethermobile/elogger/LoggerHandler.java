package com.bbva.ethermobile.elogger;

import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoggerHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH$J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH$R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobile/elogger/LoggerHandler;", "", "()V", "handlerID", "", "getHandlerID", "()Ljava/lang/String;", "loggerLevel", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLoggerLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "executeTrace", "", "loggableItem", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "isAbleToSend", "", LogKeysKt.LOG, "elogger_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LoggerHandler {
    public final void executeTrace(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        if (isAbleToSend(loggableItem)) {
            log(loggableItem);
        }
    }

    @NotNull
    public abstract String getHandlerID();

    @NotNull
    public abstract LoggerLevel getLoggerLevel();

    public abstract boolean isAbleToSend(@NotNull LoggableItem loggableItem);

    public abstract void log(@NotNull LoggableItem loggableItem);
}
