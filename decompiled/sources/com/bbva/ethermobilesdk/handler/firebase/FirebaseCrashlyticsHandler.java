package com.bbva.ethermobilesdk.handler.firebase;

import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FirebaseCrashlyticsHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/handler/firebase/FirebaseCrashlyticsHandler;", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "()V", "handlerID", "", "getHandlerID", "()Ljava/lang/String;", "loggerLevel", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLoggerLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "isAbleToSend", "", "loggableItem", "Lcom/bbva/ethermobile/elogger/LoggableItem;", LogKeysKt.LOG, "", "handler-firebase_release"}, k = 1, mv = {1, 4, 2})
public final class FirebaseCrashlyticsHandler extends LoggerHandler {
    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public String getHandlerID() {
        return "firebase.crashlytics.handler";
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public LoggerLevel getLoggerLevel() {
        return LoggerLevel.ERROR;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public boolean isAbleToSend(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        return true;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public void log(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "FirebaseCrashlytics.getInstance()");
        firebaseCrashlytics.recordException(new Exception(e.trimIndent("\n            Message: " + loggableItem.getPayload().get("message") + ",\n            Stacktrace: " + loggableItem.getPayload().get(LogKeysKt.STACKTRACE) + "\n        ")));
    }
}
