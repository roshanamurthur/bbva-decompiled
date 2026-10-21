package com.bbva.cellscore.logger;

import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LogPrinter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/cellscore/logger/CellsLogHandler;", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "loggableItem", "", "isAbleToSend", "", LogKeysKt.LOG, "", "getHandlerID", "()Ljava/lang/String;", "handlerID", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLoggerLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggerLevel", "Lcom/bbva/cellscore/logger/LogPrinter;", "printer", "<init>", "(Lcom/bbva/cellscore/logger/LogPrinter;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class CellsLogHandler extends LoggerHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LogPrinter f26995a;

    /* JADX WARN: Multi-variable type inference failed */
    public CellsLogHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public String getHandlerID() {
        return "Cells.printer";
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public LoggerLevel getLoggerLevel() {
        return LoggerLevel.VERBOSE;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public boolean isAbleToSend(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        return true;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public void log(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        this.f26995a.print(LogPrinterKt.access$toTrace(loggableItem));
    }

    public CellsLogHandler(@NotNull LogPrinter printer) {
        Intrinsics.checkNotNullParameter(printer, "printer");
        this.f26995a = printer;
    }

    public /* synthetic */ CellsLogHandler(LogPrinter logPrinter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new PlatformPrinter() : logPrinter);
    }
}
