package com.bbva.cellscore.logger;

import com.bbva.ethermobile.elogger.LoggableItem;
import kotlin.Metadata;

/* JADX INFO: compiled from: LogPrinter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cells-core_release"}, k = 2, mv = {1, 5, 1})
public final class LogPrinterKt {
    public static final Trace access$toTrace(LoggableItem loggableItem) {
        return new Trace(loggableItem.getPayload());
    }
}
