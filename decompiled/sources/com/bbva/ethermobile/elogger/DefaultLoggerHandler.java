package com.bbva.ethermobile.elogger;

import com.bbva.ethermobile.elogger.p000default.LogPrinter;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultLoggerHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobile/elogger/DefaultLoggerHandler;", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "loggableItem", "", "isAbleToSend", "", LogKeysKt.LOG, "", "getHandlerID", "()Ljava/lang/String;", "handlerID", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLoggerLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggerLevel", "Lcom/bbva/ethermobile/elogger/default/LogPrinter;", "printer", "<init>", "(Lcom/bbva/ethermobile/elogger/default/LogPrinter;)V", "Companion", "elogger_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultLoggerHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLoggerHandler.kt\ncom/bbva/ethermobile/elogger/DefaultLoggerHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class DefaultLoggerHandler extends LoggerHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f29243b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LogPrinter f29244a;

    /* JADX INFO: compiled from: DefaultLoggerHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobile/elogger/DefaultLoggerHandler$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "elogger_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return DefaultLoggerHandler.f29243b;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("DefaultLoggerHandler", "DefaultLoggerHandler::class.java.simpleName");
        f29243b = "DefaultLoggerHandler";
    }

    public DefaultLoggerHandler(@NotNull LogPrinter printer) {
        Intrinsics.checkNotNullParameter(printer, "printer");
        this.f29244a = printer;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public String getHandlerID() {
        return "default";
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public LoggerLevel getLoggerLevel() {
        return LoggerLevel.VERBOSE;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public boolean isAbleToSend(@NotNull LoggableItem loggableItem) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        loggableItem.getPayload().isEmpty();
        try {
            Result.Companion companion = Result.INSTANCE;
            ExtensionsKt.toLocalTracerObject(loggableItem);
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public void log(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        this.f29244a.performTrace(ExtensionsKt.toLocalTracerObject(loggableItem));
    }
}
