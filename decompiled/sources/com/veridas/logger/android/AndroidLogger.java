package com.veridas.logger.android;

import android.content.Context;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.veridas.logger.AbstractLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidLogger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/veridas/logger/android/AndroidLogger;", "Lcom/veridas/logger/AbstractLogger;", "Landroid/content/Context;", "context", "", "startSession", "", LogKeysKt.TAG, "message", LogKeysKt.LOG, "", "isSuccessful", "endSession", "<init>", "()V", "common-logger_release"}, k = 1, mv = {1, 9, 0})
public final class AndroidLogger extends AbstractLogger {
    @Override // com.veridas.logger.Logger
    public void endSession(boolean isSuccessful) {
        synchronized (getLock()) {
            setSessionStarted(false);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        synchronized (getLock()) {
            getIsSessionStarted();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.veridas.logger.Logger
    public void startSession(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (getLock()) {
            setSessionStarted(true);
            Unit unit = Unit.INSTANCE;
        }
    }
}
