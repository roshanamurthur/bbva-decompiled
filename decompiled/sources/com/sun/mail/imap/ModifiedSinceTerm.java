package com.sun.mail.imap;

import javax.mail.Message;
import javax.mail.search.SearchTerm;

/* JADX INFO: loaded from: classes9.dex */
public final class ModifiedSinceTerm extends SearchTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f65388p0;

    public ModifiedSinceTerm(long j10) {
        this.f65388p0 = j10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ModifiedSinceTerm) {
            return this.f65388p0 == ((ModifiedSinceTerm) obj).f65388p0;
        }
        return false;
    }

    public long getModSeq() {
        return this.f65388p0;
    }

    public int hashCode() {
        return (int) this.f65388p0;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            return (message instanceof IMAPMessage) && ((IMAPMessage) message).getModSeq() >= this.f65388p0;
        } catch (Exception unused) {
            return false;
        }
    }
}
