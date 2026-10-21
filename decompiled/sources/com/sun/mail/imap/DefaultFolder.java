package com.sun.mail.imap;

import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.ListInfo;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultFolder extends IMAPFolder {

    public class a implements IMAPFolder.ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65265a;

        public a(String str) {
            this.f65265a = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.list("", this.f65265a);
        }
    }

    public class b implements IMAPFolder.ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65267a;

        public b(String str) {
            this.f65267a = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.lsub("", this.f65267a);
        }
    }

    public DefaultFolder(IMAPStore iMAPStore) {
        super("", CharCompanionObject.MAX_VALUE, iMAPStore, null);
        this.exists = true;
        this.type = 2;
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public void appendMessages(Message[] messageArr) throws MessagingException {
        throw new MethodNotSupportedException("Cannot append to Default Folder");
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public boolean delete(boolean z10) throws MessagingException {
        throw new MethodNotSupportedException("Cannot delete Default Folder");
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public Message[] expunge() throws MessagingException {
        throw new MethodNotSupportedException("Cannot expunge Default Folder");
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public Folder getFolder(String str) throws MessagingException {
        return ((IMAPStore) this.store).newIMAPFolder(str, CharCompanionObject.MAX_VALUE);
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public synchronized String getName() {
        return this.fullName;
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public Folder getParent() {
        return null;
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public boolean hasNewMessages() throws MessagingException {
        return false;
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public synchronized Folder[] list(String str) throws MessagingException {
        ListInfo[] listInfoArr = (ListInfo[]) doCommand(new a(str));
        if (listInfoArr == null) {
            return new Folder[0];
        }
        int length = listInfoArr.length;
        IMAPFolder[] iMAPFolderArr = new IMAPFolder[length];
        for (int i10 = 0; i10 < length; i10++) {
            iMAPFolderArr[i10] = ((IMAPStore) this.store).newIMAPFolder(listInfoArr[i10]);
        }
        return iMAPFolderArr;
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public synchronized Folder[] listSubscribed(String str) throws MessagingException {
        ListInfo[] listInfoArr = (ListInfo[]) doCommand(new b(str));
        if (listInfoArr == null) {
            return new Folder[0];
        }
        int length = listInfoArr.length;
        IMAPFolder[] iMAPFolderArr = new IMAPFolder[length];
        for (int i10 = 0; i10 < length; i10++) {
            iMAPFolderArr[i10] = ((IMAPStore) this.store).newIMAPFolder(listInfoArr[i10]);
        }
        return iMAPFolderArr;
    }

    @Override // com.sun.mail.imap.IMAPFolder, javax.mail.Folder
    public boolean renameTo(Folder folder) throws MessagingException {
        throw new MethodNotSupportedException("Cannot rename Default Folder");
    }
}
