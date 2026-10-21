package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1lSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends IOException {
    private final AFc1lSDK AFKeystoreWrapper;

    public HttpException(@NonNull Throwable th2, @NonNull AFc1lSDK aFc1lSDK) {
        super(th2.getMessage(), th2);
        this.AFKeystoreWrapper = aFc1lSDK;
    }

    @NonNull
    public AFc1lSDK getMetrics() {
        return this.AFKeystoreWrapper;
    }
}
