package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ProtocolException;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPReferralException extends ProtocolException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f65444p0;

    public IMAPReferralException(String str, String str2) {
        super(str);
        this.f65444p0 = str2;
    }

    public String getUrl() {
        return this.f65444p0;
    }
}
