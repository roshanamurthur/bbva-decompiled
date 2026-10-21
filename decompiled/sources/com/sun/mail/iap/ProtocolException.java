package com.sun.mail.iap;

/* JADX INFO: loaded from: classes9.dex */
public class ProtocolException extends Exception {
    protected transient Response response;

    public ProtocolException() {
        this.response = null;
    }

    public Response getResponse() {
        return this.response;
    }

    public ProtocolException(String str) {
        super(str);
        this.response = null;
    }

    public ProtocolException(String str, Throwable th2) {
        super(str, th2);
        this.response = null;
    }

    public ProtocolException(Response response) {
        super(response.toString());
        this.response = response;
    }
}
