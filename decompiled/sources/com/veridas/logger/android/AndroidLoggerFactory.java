package com.veridas.logger.android;

import com.veridas.logger.Logger;
import com.veridas.logger.LoggerFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidLoggerFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/veridas/logger/android/AndroidLoggerFactory;", "Lcom/veridas/logger/LoggerFactory;", "()V", "create", "Lcom/veridas/logger/Logger;", "common-logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidLoggerFactory implements LoggerFactory {
    @Override // com.veridas.logger.LoggerFactory
    @NotNull
    public Logger create() {
        return new AndroidLogger();
    }
}
