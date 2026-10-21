package com.sun.mail.iap;

/* JADX INFO: loaded from: classes9.dex */
public class ConnectionException extends ProtocolException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final transient Protocol f65246p0;

    public ConnectionException() {
    }

    public Protocol getProtocol() {
        return this.f65246p0;
    }

    public ConnectionException(String str) {
        super(str);
    }

    public ConnectionException(Protocol protocol, Response response) {
        super(response);
        this.f65246p0 = protocol;
    }
}
