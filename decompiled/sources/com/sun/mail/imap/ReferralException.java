package com.sun.mail.imap;

import javax.mail.AuthenticationFailedException;

/* JADX INFO: loaded from: classes9.dex */
public class ReferralException extends AuthenticationFailedException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f65390q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f65391r0;

    public ReferralException(String str, String str2) {
        super(androidx.camera.core.impl.utils.c.a("[REFERRAL ", str, "] ", str2));
        this.f65390q0 = str;
        this.f65391r0 = str2;
    }

    public String getText() {
        return this.f65391r0;
    }

    public String getUrl() {
        return this.f65390q0;
    }
}
