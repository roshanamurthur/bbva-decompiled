package com.bbva.sl.ar.android.sslpinning.exception;

import com.bbva.sl.ar.android.sslpinning.result.CheckResult;

/* JADX INFO: loaded from: classes8.dex */
public class CheckResultException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CheckResult f36595a;

    public CheckResultException(CheckResult checkResult) {
        super(checkResult.getDescription());
        this.f36595a = checkResult;
    }
}
