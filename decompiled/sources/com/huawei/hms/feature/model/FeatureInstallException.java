package com.huawei.hms.feature.model;

import androidx.appcompat.widget.g0;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureInstallException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50410b;

    public FeatureInstallException(int i10) {
        super(g0.c("Install Error: ", i10));
        this.f50409a = i10;
        this.f50410b = FeatureInstallErrorCode.ERROR_INFO.get(Integer.valueOf(i10));
    }

    public int getErrorCode() {
        return this.f50409a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f50410b;
    }
}
