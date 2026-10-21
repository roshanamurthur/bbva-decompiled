package com.bbva.glomohybrid.logs.handler;

import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CrashlyticsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/logs/handler/CrashlyticsHandler;", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "loggableItem", "", "isAbleToSend", "", LogKeysKt.LOG, "", "generateLogMessage$glomo_logs_release", "(Lcom/bbva/ethermobile/elogger/LoggableItem;)Ljava/lang/String;", "generateLogMessage", "getHandlerID", "()Ljava/lang/String;", "handlerID", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLoggerLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggerLevel", "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", CrashlyticsHandler.ID, "<init>", "(Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;)V", "Companion", "glomo-logs_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCrashlyticsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashlyticsHandler.kt\ncom/bbva/glomohybrid/logs/handler/CrashlyticsHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class CrashlyticsHandler extends LoggerHandler {

    @NotNull
    public static final String ID = "crashlytics";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Crashlytics f33777a;

    public CrashlyticsHandler(@NotNull Crashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f33777a = crashlytics;
    }

    @NotNull
    public final String generateLogMessage$glomo_logs_release(@NotNull LoggableItem loggableItem) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        StringBuilder sb2 = new StringBuilder();
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = loggableItem.getPayload().get("level");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.bbva.ethermobile.elogger.LoggerLevel");
            objM5535constructorimpl = Result.m5535constructorimpl((LoggerLevel) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = LoggerLevel.INSTANCE.from(((LoggerLevel) objM5535constructorimpl).ordinal());
        }
        Object objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
            objM5535constructorimpl2 = null;
        }
        if (((LoggerLevel) objM5535constructorimpl2) != null) {
            LoggerLevel.Companion companion3 = LoggerLevel.INSTANCE;
            Object obj2 = loggableItem.getPayload().get("level");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.bbva.ethermobile.elogger.LoggerLevel");
            sb2.append("LEVEL[" + companion3.from(((LoggerLevel) obj2).ordinal()) + Constant.BRACKET_CLOSE);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        }
        Object obj3 = loggableItem.getPayload().get(LogKeysKt.TAG);
        if (obj3 == null) {
            obj3 = Constant.DASH_STRING;
        }
        sb2.append("TAG[" + obj3 + Constant.BRACKET_CLOSE);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        sb2.append("MESSAGE[" + loggableItem.getPayload().get("message") + Constant.BRACKET_CLOSE);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public String getHandlerID() {
        return ID;
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
        String strGenerateLogMessage$glomo_logs_release = generateLogMessage$glomo_logs_release(loggableItem);
        Crashlytics crashlytics = this.f33777a;
        crashlytics.log(strGenerateLogMessage$glomo_logs_release);
        if (loggableItem.getPayload().containsKey(LogKeysKt.STACKTRACE)) {
            Object obj = loggableItem.getPayload().get(LogKeysKt.STACKTRACE);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Throwable");
            crashlytics.recordException((Throwable) obj);
        }
    }
}
