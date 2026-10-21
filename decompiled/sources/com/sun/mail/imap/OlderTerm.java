package com.sun.mail.imap;

import java.util.Date;
import javax.mail.Message;
import javax.mail.search.SearchTerm;

/* JADX INFO: loaded from: classes9.dex */
public final class OlderTerm extends SearchTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f65389p0;

    public OlderTerm(int i10) {
        this.f65389p0 = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OlderTerm) {
            return this.f65389p0 == ((OlderTerm) obj).f65389p0;
        }
        return false;
    }

    public int getInterval() {
        return this.f65389p0;
    }

    public int hashCode() {
        return this.f65389p0;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            Date receivedDate = message.getReceivedDate();
            return receivedDate != null && receivedDate.getTime() <= System.currentTimeMillis() - (((long) this.f65389p0) * 1000);
        } catch (Exception unused) {
            return false;
        }
    }
}
