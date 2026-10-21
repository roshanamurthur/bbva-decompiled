package com.sun.mail.smtp;

import javax.mail.Provider;

/* JADX INFO: loaded from: classes9.dex */
public class SMTPSSLProvider extends Provider {
    public SMTPSSLProvider() {
        super(Provider.Type.TRANSPORT, "smtps", SMTPSSLTransport.class.getName(), "Oracle", null);
    }
}
