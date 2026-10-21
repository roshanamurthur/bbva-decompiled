package com.noknok.android.client.asm.sdk;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticatorException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StatusCode f63297a;

    public enum StatusCode {
        FAILURE,
        AUTHENTICATOR_UNAVAILABLE
    }

    public AuthenticatorException() {
        this.f63297a = StatusCode.FAILURE;
    }

    public StatusCode getStatusCode() {
        return this.f63297a;
    }

    public AuthenticatorException(StatusCode statusCode) {
        super(statusCode.toString());
        StatusCode statusCode2 = StatusCode.FAILURE;
        this.f63297a = statusCode;
    }

    public AuthenticatorException(String str) {
        super(str);
        this.f63297a = StatusCode.FAILURE;
    }

    public AuthenticatorException(String str, Throwable th2) {
        super(str, th2);
        this.f63297a = StatusCode.FAILURE;
    }

    public AuthenticatorException(Throwable th2) {
        super(th2);
        this.f63297a = StatusCode.FAILURE;
    }
}
