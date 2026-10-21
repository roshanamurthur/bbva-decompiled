package com.sun.mail.iap;

/* JADX INFO: loaded from: classes9.dex */
public class LiteralException extends ProtocolException {
    public LiteralException(Response response) {
        super(response.toString());
        this.response = response;
    }
}
