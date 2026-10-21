package com.huawei.hms.feature.model;

/* JADX INFO: loaded from: classes10.dex */
public class CommonInstallException extends RuntimeException {
    public CommonInstallException() {
        super("Failed to bind service.");
    }

    public CommonInstallException(String str) {
        super(str);
    }

    public CommonInstallException(String str, Throwable th2) {
        super(str, th2);
    }
}
