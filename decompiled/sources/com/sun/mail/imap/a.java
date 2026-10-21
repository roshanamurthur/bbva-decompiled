package com.sun.mail.imap;

import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.IMAPProtocol;

/* JADX INFO: compiled from: IMAPFolder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements IMAPFolder.ProtocolCommand {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ char f65400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ACL f65401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IMAPFolder f65402c;

    public a(IMAPFolder iMAPFolder, char c10, ACL acl) {
        this.f65402c = iMAPFolder;
        this.f65400a = c10;
        this.f65401b = acl;
    }

    @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
    public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
        iMAPProtocol.setACL(this.f65402c.fullName, this.f65400a, this.f65401b);
        return null;
    }
}
