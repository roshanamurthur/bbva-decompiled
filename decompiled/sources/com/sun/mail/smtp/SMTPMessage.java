package com.sun.mail.smtp;

import java.io.InputStream;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

/* JADX INFO: loaded from: classes9.dex */
public class SMTPMessage extends MimeMessage {
    public static final int NOTIFY_DELAY = 4;
    public static final int NOTIFY_FAILURE = 2;
    public static final int NOTIFY_NEVER = -1;
    public static final int NOTIFY_SUCCESS = 1;
    public static final int RETURN_FULL = 1;
    public static final int RETURN_HDRS = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f65481l = {null, "FULL", "HDRS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f65482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f65485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f65486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f65487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f65488k;

    public SMTPMessage(Session session) {
        super(session);
        this.f65483f = 0;
        this.f65484g = 0;
        this.f65485h = false;
        this.f65486i = false;
        this.f65487j = null;
        this.f65488k = null;
    }

    public boolean getAllow8bitMIME() {
        return this.f65486i;
    }

    public String getEnvelopeFrom() {
        return this.f65482e;
    }

    public String getMailExtension() {
        return this.f65488k;
    }

    public int getNotifyOptions() {
        return this.f65483f;
    }

    public int getReturnOption() {
        return this.f65484g;
    }

    public boolean getSendPartial() {
        return this.f65485h;
    }

    public String getSubmitter() {
        return this.f65487j;
    }

    public void setAllow8bitMIME(boolean z10) {
        this.f65486i = z10;
    }

    public void setEnvelopeFrom(String str) {
        this.f65482e = str;
    }

    public void setMailExtension(String str) {
        this.f65488k = str;
    }

    public void setNotifyOptions(int i10) {
        if (i10 < -1 || i10 >= 8) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.f65483f = i10;
    }

    public void setReturnOption(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.f65484g = i10;
    }

    public void setSendPartial(boolean z10) {
        this.f65485h = z10;
    }

    public void setSubmitter(String str) {
        this.f65487j = str;
    }

    public SMTPMessage(Session session, InputStream inputStream) throws MessagingException {
        super(session, inputStream);
        this.f65483f = 0;
        this.f65484g = 0;
        this.f65485h = false;
        this.f65486i = false;
        this.f65487j = null;
        this.f65488k = null;
    }

    public SMTPMessage(MimeMessage mimeMessage) throws MessagingException {
        super(mimeMessage);
        this.f65483f = 0;
        this.f65484g = 0;
        this.f65485h = false;
        this.f65486i = false;
        this.f65487j = null;
        this.f65488k = null;
    }
}
