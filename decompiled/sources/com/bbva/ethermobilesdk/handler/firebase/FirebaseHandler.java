package com.bbva.ethermobilesdk.handler.firebase;

import android.os.Bundle;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FirebaseHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/handler/firebase/FirebaseHandler;", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "loggableItem", "", "isAbleToSend", "", LogKeysKt.LOG, "", "a", "Ljava/lang/String;", "getHandlerID", "()Ljava/lang/String;", "handlerID", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "b", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLoggerLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggerLevel", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "<init>", "(Ljava/lang/String;Lcom/bbva/ethermobile/elogger/LoggerLevel;Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "Companion", "handler-firebase_release"}, k = 1, mv = {1, 4, 2})
public final class FirebaseHandler extends LoggerHandler {

    @NotNull
    public static final String EVENT_KEY = "event";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String handlerID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoggerLevel loggerLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseAnalytics f29878c;

    public FirebaseHandler(@NotNull String handlerID, @NotNull LoggerLevel loggerLevel, @NotNull FirebaseAnalytics firebaseAnalytics) {
        Intrinsics.checkNotNullParameter(handlerID, "handlerID");
        Intrinsics.checkNotNullParameter(loggerLevel, "loggerLevel");
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        this.handlerID = handlerID;
        this.loggerLevel = loggerLevel;
        this.f29878c = firebaseAnalytics;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public String getHandlerID() {
        return this.handlerID;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public LoggerLevel getLoggerLevel() {
        return this.loggerLevel;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public boolean isAbleToSend(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        return loggableItem.getPayload().containsKey("event");
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public void log(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : loggableItem.getPayload().entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "event")) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                bundle.putString(key, (String) value);
            }
        }
        Object obj = loggableItem.getPayload().get("event");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f29878c.logEvent((String) obj, bundle);
    }
}
