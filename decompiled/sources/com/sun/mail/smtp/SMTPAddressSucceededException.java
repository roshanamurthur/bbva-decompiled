package com.sun.mail.smtp;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;

/* JADX INFO: loaded from: classes9.dex */
public class SMTPAddressSucceededException extends MessagingException {
    protected InternetAddress addr;
    protected String cmd;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    protected int f65480rc;

    public SMTPAddressSucceededException(InternetAddress internetAddress, String str, int i10, String str2) {
        super(str2);
        this.addr = internetAddress;
        this.cmd = str;
        this.f65480rc = i10;
    }

    public InternetAddress getAddress() {
        return this.addr;
    }

    public String getCommand() {
        return this.cmd;
    }

    public int getReturnCode() {
        return this.f65480rc;
    }
}
