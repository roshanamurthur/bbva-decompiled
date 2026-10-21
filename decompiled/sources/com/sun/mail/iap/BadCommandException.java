package com.sun.mail.iap;

/* JADX INFO: loaded from: classes9.dex */
public class BadCommandException extends ProtocolException {
    public BadCommandException() {
    }

    public BadCommandException(String str) {
        super(str);
    }

    public BadCommandException(Response response) {
        super(response);
    }
}
