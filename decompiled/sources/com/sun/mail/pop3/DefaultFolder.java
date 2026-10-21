package com.sun.mail.pop3;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import com.fasterxml.jackson.core.JsonPointer;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultFolder extends Folder {
    @Override // javax.mail.Folder
    public void appendMessages(Message[] messageArr) throws MessagingException {
        throw new MethodNotSupportedException("Append not supported");
    }

    @Override // javax.mail.Folder
    public void close(boolean z10) throws MessagingException {
        throw new MethodNotSupportedException(HearingDisabilitiesConstants.CLOSE_MODAL);
    }

    @Override // javax.mail.Folder
    public boolean create(int i10) throws MessagingException {
        return false;
    }

    @Override // javax.mail.Folder
    public boolean delete(boolean z10) throws MessagingException {
        throw new MethodNotSupportedException("delete");
    }

    @Override // javax.mail.Folder
    public boolean exists() {
        return true;
    }

    @Override // javax.mail.Folder
    public Message[] expunge() throws MessagingException {
        throw new MethodNotSupportedException("expunge");
    }

    @Override // javax.mail.Folder
    public Folder getFolder(String str) throws MessagingException {
        if (str.equalsIgnoreCase("INBOX")) {
            return getInbox();
        }
        throw new MessagingException("only INBOX supported");
    }

    @Override // javax.mail.Folder
    public String getFullName() {
        return "";
    }

    public Folder getInbox() throws MessagingException {
        return getStore().getFolder("INBOX");
    }

    @Override // javax.mail.Folder
    public Message getMessage(int i10) throws MessagingException {
        throw new MethodNotSupportedException("getMessage");
    }

    @Override // javax.mail.Folder
    public int getMessageCount() throws MessagingException {
        return 0;
    }

    @Override // javax.mail.Folder
    public String getName() {
        return "";
    }

    @Override // javax.mail.Folder
    public Folder getParent() {
        return null;
    }

    @Override // javax.mail.Folder
    public Flags getPermanentFlags() {
        return new Flags();
    }

    @Override // javax.mail.Folder
    public char getSeparator() {
        return JsonPointer.SEPARATOR;
    }

    @Override // javax.mail.Folder
    public int getType() {
        return 2;
    }

    @Override // javax.mail.Folder
    public boolean hasNewMessages() throws MessagingException {
        return false;
    }

    @Override // javax.mail.Folder
    public boolean isOpen() {
        return false;
    }

    @Override // javax.mail.Folder
    public Folder[] list(String str) throws MessagingException {
        return new Folder[]{getInbox()};
    }

    @Override // javax.mail.Folder
    public void open(int i10) throws MessagingException {
        throw new MethodNotSupportedException(TrackMessageOpenedCommand.ACTION);
    }

    @Override // javax.mail.Folder
    public boolean renameTo(Folder folder) throws MessagingException {
        throw new MethodNotSupportedException("renameTo");
    }
}
