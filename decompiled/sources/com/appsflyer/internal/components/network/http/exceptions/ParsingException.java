package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1gSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFc1gSDK<String> AFKeystoreWrapper;

    public ParsingException(String str, Throwable th2, @NonNull AFc1gSDK<String> aFc1gSDK) {
        super(str, th2);
        this.AFKeystoreWrapper = aFc1gSDK;
    }

    @NonNull
    public AFc1gSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }
}
