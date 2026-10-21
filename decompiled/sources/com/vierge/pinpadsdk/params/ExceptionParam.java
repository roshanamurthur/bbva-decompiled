package com.vierge.pinpadsdk.params;

import com.vierge.pinpadsdk.error.ERROR_CODE;

/* JADX INFO: loaded from: classes6.dex */
public class ExceptionParam extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ERROR_CODE f67566p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Param f67567q0;

    public ExceptionParam(ERROR_CODE error_code, Param param) {
        this.f67566p0 = error_code;
        this.f67567q0 = param;
    }

    public ERROR_CODE getError_code() {
        return this.f67566p0;
    }

    public Param getParam() {
        return this.f67567q0;
    }
}
