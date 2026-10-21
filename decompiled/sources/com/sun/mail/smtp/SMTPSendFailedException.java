package com.sun.mail.smtp;

import javax.mail.Address;
import javax.mail.SendFailedException;
import javax.mail.internet.InternetAddress;

/* JADX INFO: loaded from: classes9.dex */
public class SMTPSendFailedException extends SendFailedException {
    protected InternetAddress addr;
    protected String cmd;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    protected int f65489rc;

    public SMTPSendFailedException(String str, int i10, String str2, Exception exc, Address[] addressArr, Address[] addressArr2, Address[] addressArr3) {
        super(str2, exc, addressArr, addressArr2, addressArr3);
        this.cmd = str;
        this.f65489rc = i10;
    }

    public String getCommand() {
        return this.cmd;
    }

    public int getReturnCode() {
        return this.f65489rc;
    }
}
