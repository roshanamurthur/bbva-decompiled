package javax.mail;

import com.bbva.nativesettings.common.Constants;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Vector;
import java.util.concurrent.Executor;
import javax.mail.event.ConnectionEvent;
import javax.mail.event.ConnectionListener;
import javax.mail.event.FolderEvent;
import javax.mail.event.FolderListener;
import javax.mail.event.MailEvent;
import javax.mail.event.MessageChangedEvent;
import javax.mail.event.MessageChangedListener;
import javax.mail.event.MessageCountEvent;
import javax.mail.event.MessageCountListener;
import javax.mail.search.SearchTerm;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Folder implements AutoCloseable {
    public static final int HOLDS_FOLDERS = 2;
    public static final int HOLDS_MESSAGES = 1;
    public static final int READ_ONLY = 1;
    public static final int READ_WRITE = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final a f78887p0;
    protected Store store;
    protected int mode = -1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile Vector<ConnectionListener> f78888q0 = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public volatile Vector<FolderListener> f78889r0 = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile Vector<MessageCountListener> f78890s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile Vector<MessageChangedListener> f78891t0 = null;

    public Folder(Store store) {
        this.store = store;
        Session session = store.session;
        String property = session.getProperties().getProperty("mail.event.scope", "folder");
        Executor executor = (Executor) session.getProperties().get("mail.event.executor");
        if (property.equalsIgnoreCase(Constants.APPLICATION)) {
            this.f78887p0 = a.b(executor);
            return;
        }
        if (property.equalsIgnoreCase("session")) {
            this.f78887p0 = session.f78920l;
        } else if (property.equalsIgnoreCase("store")) {
            this.f78887p0 = store.f78907r0;
        } else {
            this.f78887p0 = new a(executor);
        }
    }

    public final void a(MailEvent mailEvent, Vector<? extends EventListener> vector) {
        this.f78887p0.a(mailEvent, (Vector) vector.clone());
    }

    public synchronized void addConnectionListener(ConnectionListener connectionListener) {
        try {
            if (this.f78888q0 == null) {
                this.f78888q0 = new Vector<>();
            }
            this.f78888q0.addElement(connectionListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addFolderListener(FolderListener folderListener) {
        try {
            if (this.f78889r0 == null) {
                this.f78889r0 = new Vector<>();
            }
            this.f78889r0.addElement(folderListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addMessageChangedListener(MessageChangedListener messageChangedListener) {
        try {
            if (this.f78891t0 == null) {
                this.f78891t0 = new Vector<>();
            }
            this.f78891t0.addElement(messageChangedListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addMessageCountListener(MessageCountListener messageCountListener) {
        try {
            if (this.f78890s0 == null) {
                this.f78890s0 = new Vector<>();
            }
            this.f78890s0.addElement(messageCountListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract void appendMessages(Message[] messageArr) throws MessagingException;

    @Override // java.lang.AutoCloseable
    public void close() throws MessagingException {
        close(true);
    }

    public abstract void close(boolean z10) throws MessagingException;

    public void copyMessages(Message[] messageArr, Folder folder) throws MessagingException {
        if (folder.exists()) {
            folder.appendMessages(messageArr);
            return;
        }
        throw new FolderNotFoundException(folder.getFullName() + " does not exist", folder);
    }

    public abstract boolean create(int i10) throws MessagingException;

    public abstract boolean delete(boolean z10) throws MessagingException;

    public abstract boolean exists() throws MessagingException;

    public abstract Message[] expunge() throws MessagingException;

    public void finalize() throws Throwable {
        try {
            this.f78887p0.c();
        } finally {
            super.finalize();
        }
    }

    public synchronized int getDeletedMessageCount() throws MessagingException {
        if (!isOpen()) {
            return -1;
        }
        int messageCount = getMessageCount();
        int i10 = 0;
        for (int i11 = 1; i11 <= messageCount; i11++) {
            try {
                if (getMessage(i11).isSet(Flags.Flag.DELETED)) {
                    i10++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i10;
    }

    public abstract Folder getFolder(String str) throws MessagingException;

    public abstract String getFullName();

    public abstract Message getMessage(int i10) throws MessagingException;

    public abstract int getMessageCount() throws MessagingException;

    public synchronized Message[] getMessages(int i10, int i11) throws MessagingException {
        Message[] messageArr;
        messageArr = new Message[(i11 - i10) + 1];
        for (int i12 = i10; i12 <= i11; i12++) {
            messageArr[i12 - i10] = getMessage(i12);
        }
        return messageArr;
    }

    public synchronized int getMode() {
        if (!isOpen()) {
            throw new IllegalStateException("Folder not open");
        }
        return this.mode;
    }

    public abstract String getName();

    public synchronized int getNewMessageCount() throws MessagingException {
        if (!isOpen()) {
            return -1;
        }
        int messageCount = getMessageCount();
        int i10 = 0;
        for (int i11 = 1; i11 <= messageCount; i11++) {
            try {
                if (getMessage(i11).isSet(Flags.Flag.RECENT)) {
                    i10++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i10;
    }

    public abstract Folder getParent() throws MessagingException;

    public abstract Flags getPermanentFlags();

    public abstract char getSeparator() throws MessagingException;

    public Store getStore() {
        return this.store;
    }

    public abstract int getType() throws MessagingException;

    public URLName getURLName() throws MessagingException {
        URLName uRLName = getStore().getURLName();
        String fullName = getFullName();
        StringBuilder sb2 = new StringBuilder();
        if (fullName != null) {
            sb2.append(fullName);
        }
        return new URLName(uRLName.getProtocol(), uRLName.getHost(), uRLName.getPort(), sb2.toString(), uRLName.getUsername(), null);
    }

    public synchronized int getUnreadMessageCount() throws MessagingException {
        if (!isOpen()) {
            return -1;
        }
        int messageCount = getMessageCount();
        int i10 = 0;
        for (int i11 = 1; i11 <= messageCount; i11++) {
            try {
                if (!getMessage(i11).isSet(Flags.Flag.SEEN)) {
                    i10++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i10;
    }

    public abstract boolean hasNewMessages() throws MessagingException;

    public abstract boolean isOpen();

    public boolean isSubscribed() {
        return true;
    }

    public Folder[] list() throws MessagingException {
        return list("%");
    }

    public abstract Folder[] list(String str) throws MessagingException;

    public Folder[] listSubscribed(String str) throws MessagingException {
        return list(str);
    }

    public void notifyConnectionListeners(int i10) {
        if (this.f78888q0 != null) {
            a(new ConnectionEvent(this, i10), this.f78888q0);
        }
        if (i10 == 3) {
            this.f78887p0.c();
        }
    }

    public void notifyFolderListeners(int i10) {
        if (this.f78889r0 != null) {
            a(new FolderEvent(this, this, i10), this.f78889r0);
        }
        this.store.notifyFolderListeners(i10, this);
    }

    public void notifyFolderRenamedListeners(Folder folder) {
        if (this.f78889r0 != null) {
            a(new FolderEvent(this, this, folder, 3), this.f78889r0);
        }
        this.store.notifyFolderRenamedListeners(this, folder);
    }

    public void notifyMessageAddedListeners(Message[] messageArr) {
        if (this.f78890s0 == null) {
            return;
        }
        a(new MessageCountEvent(this, 1, false, messageArr), this.f78890s0);
    }

    public void notifyMessageChangedListeners(int i10, Message message) {
        if (this.f78891t0 == null) {
            return;
        }
        a(new MessageChangedEvent(this, i10, message), this.f78891t0);
    }

    public void notifyMessageRemovedListeners(boolean z10, Message[] messageArr) {
        if (this.f78890s0 == null) {
            return;
        }
        a(new MessageCountEvent(this, 2, z10, messageArr), this.f78890s0);
    }

    public abstract void open(int i10) throws MessagingException;

    public synchronized void removeConnectionListener(ConnectionListener connectionListener) {
        if (this.f78888q0 != null) {
            this.f78888q0.removeElement(connectionListener);
        }
    }

    public synchronized void removeFolderListener(FolderListener folderListener) {
        if (this.f78889r0 != null) {
            this.f78889r0.removeElement(folderListener);
        }
    }

    public synchronized void removeMessageChangedListener(MessageChangedListener messageChangedListener) {
        if (this.f78891t0 != null) {
            this.f78891t0.removeElement(messageChangedListener);
        }
    }

    public synchronized void removeMessageCountListener(MessageCountListener messageCountListener) {
        if (this.f78890s0 != null) {
            this.f78890s0.removeElement(messageCountListener);
        }
    }

    public abstract boolean renameTo(Folder folder) throws MessagingException;

    public Message[] search(SearchTerm searchTerm) throws MessagingException {
        return search(searchTerm, getMessages());
    }

    public synchronized void setFlags(Message[] messageArr, Flags flags, boolean z10) throws MessagingException {
        for (Message message : messageArr) {
            try {
                message.setFlags(flags, z10);
            } catch (MessageRemovedException unused) {
            }
        }
    }

    public void setSubscribed(boolean z10) throws MessagingException {
        throw new MethodNotSupportedException();
    }

    public String toString() {
        String fullName = getFullName();
        return fullName != null ? fullName : super.toString();
    }

    public Folder[] listSubscribed() throws MessagingException {
        return listSubscribed("%");
    }

    public Message[] search(SearchTerm searchTerm, Message[] messageArr) throws MessagingException {
        ArrayList arrayList = new ArrayList();
        for (Message message : messageArr) {
            try {
                if (message.match(searchTerm)) {
                    arrayList.add(message);
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return (Message[]) arrayList.toArray(new Message[arrayList.size()]);
    }

    public synchronized Message[] getMessages(int[] iArr) throws MessagingException {
        Message[] messageArr;
        int length = iArr.length;
        messageArr = new Message[length];
        for (int i10 = 0; i10 < length; i10++) {
            messageArr[i10] = getMessage(iArr[i10]);
        }
        return messageArr;
    }

    public synchronized void setFlags(int i10, int i11, Flags flags, boolean z10) throws MessagingException {
        while (i10 <= i11) {
            try {
                getMessage(i10).setFlags(flags, z10);
            } catch (MessageRemovedException unused) {
            }
            i10++;
        }
    }

    public synchronized Message[] getMessages() throws MessagingException {
        Message[] messageArr;
        if (isOpen()) {
            int messageCount = getMessageCount();
            messageArr = new Message[messageCount];
            for (int i10 = 1; i10 <= messageCount; i10++) {
                messageArr[i10 - 1] = getMessage(i10);
            }
        } else {
            throw new IllegalStateException("Folder not open");
        }
        return messageArr;
    }

    public synchronized void setFlags(int[] iArr, Flags flags, boolean z10) throws MessagingException {
        for (int i10 : iArr) {
            try {
                getMessage(i10).setFlags(flags, z10);
            } catch (MessageRemovedException unused) {
            }
        }
    }

    public void fetch(Message[] messageArr, FetchProfile fetchProfile) throws MessagingException {
    }
}
