package com.sun.mail.iap;

/* JADX INFO: loaded from: classes9.dex */
public class CommandFailedException extends ProtocolException {
    public CommandFailedException() {
    }

    public CommandFailedException(String str) {
        super(str);
    }

    public CommandFailedException(Response response) {
        super(response);
    }
}
