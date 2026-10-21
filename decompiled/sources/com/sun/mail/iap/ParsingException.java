package com.sun.mail.iap;

/* JADX INFO: loaded from: classes9.dex */
public class ParsingException extends ProtocolException {
    public ParsingException() {
    }

    public ParsingException(String str) {
        super(str);
    }

    public ParsingException(Response response) {
        super(response);
    }
}
