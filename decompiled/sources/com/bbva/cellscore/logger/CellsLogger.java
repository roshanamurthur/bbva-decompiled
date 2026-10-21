package com.bbva.cellscore.logger;

import androidx.camera.core.impl.utils.c;
import bk.d;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ1\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bbva/cellscore/logger/CellsLogger;", "", "Lcom/bbva/cellscore/logger/LoggerSettings;", "logSettings", "Lcom/bbva/cellscore/logger/LogPrinter;", "printer", "", "init", "Lcom/bbva/cellscore/logger/LogModule;", "module", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "level", "", "message", LogKeysKt.LOG, "method", "", "Lcom/bbva/cellscore/logger/LogParam;", "params", "logMethod", "(Lcom/bbva/cellscore/logger/LogModule;Ljava/lang/String;[Lcom/bbva/cellscore/logger/LogParam;)V", "<init>", "()V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class CellsLogger {

    @NotNull
    public static final CellsLogger INSTANCE = new CellsLogger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final LogSerializer f26996a = new LogSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static LoggerSettings f26997b = LoggerSettings.Nothing.INSTANCE;

    /* JADX INFO: compiled from: CellsLogger.kt */
    public static final class a extends Lambda implements Function1<LogParam, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f26998p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(LogParam logParam) {
            LogParam it = logParam;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.serialize(CellsLogger.f26996a);
        }
    }

    public static void a(LogModule logModule, LoggerLevel loggerLevel, String str) {
        EtherLogger.log$default(EtherLogger.INSTANCE, Intrinsics.stringPlus("com.bbva.cells.core.", logModule.name()), null, loggerLevel, new LoggableItem(q.mapOf(TuplesKt.to("module", logModule), TuplesKt.to("level", loggerLevel), TuplesKt.to("message", str))), 2, null);
    }

    public static void b(CellsLogHandler cellsLogHandler, List list, List list2) {
        Iterator it = CollectionsKt___CollectionsKt.minus((Iterable) list, (Iterable) list2).iterator();
        while (it.hasNext()) {
            EtherLogger.INSTANCE.installCustomLogger(Intrinsics.stringPlus("com.bbva.cells.core.", ((LogModule) it.next()).name()), d.listOf(cellsLogHandler));
        }
    }

    public static /* synthetic */ void init$default(CellsLogger cellsLogger, LoggerSettings loggerSettings, LogPrinter logPrinter, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logPrinter = null;
        }
        cellsLogger.init(loggerSettings, logPrinter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void init(@NotNull LoggerSettings logSettings, @Nullable LogPrinter printer) {
        CellsLogHandler cellsLogHandler;
        Intrinsics.checkNotNullParameter(logSettings, "logSettings");
        f26997b = logSettings;
        if (printer == null) {
            cellsLogHandler = new CellsLogHandler(null, 1, 0 == true ? 1 : 0);
        } else {
            cellsLogHandler = new CellsLogHandler(printer);
        }
        if (Intrinsics.areEqual(logSettings, LoggerSettings.All.INSTANCE)) {
            EtherLogger.INSTANCE.installCustomLogger("com.bbva.cells.core", d.listOf(cellsLogHandler));
        } else if (logSettings instanceof LoggerSettings.Exclude) {
            b(cellsLogHandler, ArraysKt___ArraysKt.toList(LogModule.values()), ((LoggerSettings.Exclude) logSettings).getModules());
        } else if (logSettings instanceof LoggerSettings.Include) {
            b(cellsLogHandler, ((LoggerSettings.Include) logSettings).getModules(), CollectionsKt__CollectionsKt.emptyList());
        }
    }

    public final void log(@NotNull LogModule module, @NotNull LoggerLevel level, @NotNull String message) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.areEqual(f26997b, LoggerSettings.Nothing.INSTANCE)) {
            return;
        }
        a(module, level, message);
    }

    public final void logMethod(@NotNull LogModule module, @NotNull String method, @NotNull LogParam... params) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        if (Intrinsics.areEqual(f26997b, LoggerSettings.Nothing.INSTANCE)) {
            return;
        }
        a(module, LoggerLevel.VERBOSE, c.a("Method ", method, " was called with ", ArraysKt___ArraysKt.joinToString$default(params, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f26998p0, 31, (Object) null)));
    }
}
