package com.sun.mail.imap;

import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.ENVELOPE;
import com.sun.mail.imap.protocol.IMAPProtocol;
import javax.mail.Flags;
import javax.mail.FolderClosedException;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPNestedMessage extends IMAPMessage {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final IMAPMessage f65350q;

    public IMAPNestedMessage(IMAPMessage iMAPMessage, BODYSTRUCTURE bodystructure, ENVELOPE envelope, String str) {
        super(iMAPMessage.session);
        this.f65350q = iMAPMessage;
        this.bs = bodystructure;
        this.envelope = envelope;
        this.sectionId = str;
        setPeek(iMAPMessage.getPeek());
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public void checkExpunged() throws MessageRemovedException {
        this.f65350q.checkExpunged();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public int getFetchBlockSize() {
        return this.f65350q.getFetchBlockSize();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public Object getMessageCacheLock() {
        return this.f65350q.getMessageCacheLock();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public IMAPProtocol getProtocol() throws ProtocolException, FolderClosedException {
        return this.f65350q.getProtocol();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public int getSequenceNumber() {
        return this.f65350q.getSequenceNumber();
    }

    @Override // com.sun.mail.imap.IMAPMessage, javax.mail.internet.MimeMessage, javax.mail.Part
    public int getSize() throws MessagingException {
        return this.bs.size;
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public boolean ignoreBodyStructureSize() {
        return this.f65350q.ignoreBodyStructureSize();
    }

    @Override // javax.mail.Message
    public boolean isExpunged() {
        return this.f65350q.isExpunged();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public boolean isREV1() throws FolderClosedException {
        return this.f65350q.isREV1();
    }

    @Override // com.sun.mail.imap.IMAPMessage, javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized void setFlags(Flags flags, boolean z10) throws MessagingException {
        throw new MethodNotSupportedException("Cannot set flags on this nested message");
    }
}
