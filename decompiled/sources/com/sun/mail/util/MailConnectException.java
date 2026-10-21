package com.sun.mail.util;

import javax.mail.MessagingException;

/* JADX INFO: loaded from: classes9.dex */
public class MailConnectException extends MessagingException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f65557q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f65558r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f65559s0;

    public MailConnectException(SocketConnectException socketConnectException) {
        String str;
        StringBuilder sb2 = new StringBuilder("Couldn't connect to host, port: ");
        sb2.append(socketConnectException.getHost());
        sb2.append(", ");
        sb2.append(socketConnectException.getPort());
        sb2.append("; timeout ");
        sb2.append(socketConnectException.getConnectionTimeout());
        if (socketConnectException.getMessage() != null) {
            str = "; " + socketConnectException.getMessage();
        } else {
            str = "";
        }
        sb2.append(str);
        super(sb2.toString());
        this.f65557q0 = socketConnectException.getHost();
        this.f65558r0 = socketConnectException.getPort();
        this.f65559s0 = socketConnectException.getConnectionTimeout();
        setNextException(socketConnectException.getException());
    }

    public int getConnectionTimeout() {
        return this.f65559s0;
    }

    public String getHost() {
        return this.f65557q0;
    }

    public int getPort() {
        return this.f65558r0;
    }
}
