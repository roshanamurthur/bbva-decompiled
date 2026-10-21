package com.sun.mail.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class SocketConnectException extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f65580p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f65581q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f65582r0;

    public SocketConnectException(String str, Exception exc, String str2, int i10, int i11) {
        super(str);
        initCause(exc);
        this.f65580p0 = str2;
        this.f65581q0 = i10;
        this.f65582r0 = i11;
    }

    public int getConnectionTimeout() {
        return this.f65582r0;
    }

    public Exception getException() {
        return (Exception) getCause();
    }

    public String getHost() {
        return this.f65580p0;
    }

    public int getPort() {
        return this.f65581q0;
    }
}
