package com.bbva.cellscore.logger;

import android.util.Log;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LogPrinter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/cellscore/logger/PlatformPrinter;", "Lcom/bbva/cellscore/logger/LogPrinter;", "()V", Constants.PRINT, "", LogKeysKt.TRACE, "Lcom/bbva/cellscore/logger/Trace;", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PlatformPrinter implements LogPrinter {

    /* JADX INFO: compiled from: LogPrinter.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerLevel.values().length];
            iArr[LoggerLevel.VERBOSE.ordinal()] = 1;
            iArr[LoggerLevel.DEBUG.ordinal()] = 2;
            iArr[LoggerLevel.INFO.ordinal()] = 3;
            iArr[LoggerLevel.WARNING.ordinal()] = 4;
            iArr[LoggerLevel.WTF.ordinal()] = 5;
            iArr[LoggerLevel.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.bbva.cellscore.logger.LogPrinter
    public void print(@NotNull Trace trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        switch (WhenMappings.$EnumSwitchMapping$0[trace.getLevel().ordinal()]) {
            case 1:
                trace.getModule().name();
                trace.getMessage();
                break;
            case 2:
                trace.getModule().name();
                trace.getMessage();
                break;
            case 3:
                trace.getModule().name();
                trace.getMessage();
                break;
            case 4:
                Log.w(trace.getModule().name(), trace.getMessage());
                break;
            case 5:
                Log.wtf(trace.getModule().name(), trace.getMessage());
                break;
            case 6:
                trace.getModule().name();
                trace.getMessage();
                break;
        }
    }
}
