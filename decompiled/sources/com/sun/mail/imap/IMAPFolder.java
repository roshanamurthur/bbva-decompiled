package com.sun.mail.imap;

import androidx.appcompat.widget.o1;
import com.fasterxml.jackson.core.JsonPointer;
import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.CommandFailedException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.iap.ResponseHandler;
import com.sun.mail.imap.protocol.FLAGS;
import com.sun.mail.imap.protocol.FetchItem;
import com.sun.mail.imap.protocol.FetchResponse;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.IMAPResponse;
import com.sun.mail.imap.protocol.Item;
import com.sun.mail.imap.protocol.ListInfo;
import com.sun.mail.imap.protocol.MODSEQ;
import com.sun.mail.imap.protocol.MailboxInfo;
import com.sun.mail.imap.protocol.MessageSet;
import com.sun.mail.imap.protocol.Status;
import com.sun.mail.imap.protocol.UID;
import com.sun.mail.imap.protocol.UIDSet;
import com.sun.mail.util.MailLogger;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.FolderNotFoundException;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Quota;
import javax.mail.ReadOnlyFolderException;
import javax.mail.Store;
import javax.mail.StoreClosedException;
import javax.mail.UIDFolder;
import javax.mail.event.MailEvent;
import javax.mail.event.MessageChangedEvent;
import javax.mail.event.MessageCountListener;
import javax.mail.internet.MimeMessage;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchException;
import javax.mail.search.SearchTerm;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPFolder extends Folder implements UIDFolder, ResponseHandler {
    protected static final char UNKNOWN_SEPARATOR = 65535;
    public volatile int E0;
    public int F0;
    public long G0;
    public long H0;
    public boolean I0;
    public volatile long J0;
    public boolean K0;
    public Status L0;
    public long M0;
    public boolean N0;
    public final MailLogger O0;
    protected volatile String[] attributes;
    protected Flags availableFlags;
    protected volatile boolean exists;
    protected volatile String fullName;
    protected boolean isNamespace;
    protected MailLogger logger;
    protected MessageCache messageCache;
    protected final Object messageCacheLock;
    protected String name;
    protected Flags permanentFlags;
    protected volatile IMAPProtocol protocol;
    protected char separator;
    protected int type;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile boolean f65275u0;
    protected Hashtable<Long, IMAPMessage> uidTable;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f65276w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public IdleManager f65277x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile int f65278y0;

    public static class FetchProfileItem extends FetchProfile.Item {
        public static final FetchProfileItem HEADERS = new FetchProfileItem("HEADERS");

        @Deprecated
        public static final FetchProfileItem SIZE = new FetchProfileItem("SIZE");
        public static final FetchProfileItem MESSAGE = new FetchProfileItem("MESSAGE");
        public static final FetchProfileItem INTERNALDATE = new FetchProfileItem("INTERNALDATE");

        public FetchProfileItem(String str) {
            super(str);
        }
    }

    public interface ProtocolCommand {
        Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException;
    }

    public class a implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flags f65279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Date f65280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sun.mail.imap.c f65281c;

        public a(Flags flags, Date date, com.sun.mail.imap.c cVar) {
            this.f65279a = flags;
            this.f65280b = date;
            this.f65281c = cVar;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            iMAPProtocol.append(IMAPFolder.this.fullName, this.f65279a, this.f65280b, this.f65281c);
            return null;
        }
    }

    public class b implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flags f65283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Date f65284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sun.mail.imap.c f65285c;

        public b(Flags flags, Date date, com.sun.mail.imap.c cVar) {
            this.f65283a = flags;
            this.f65284b = date;
            this.f65285c = cVar;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.appenduid(IMAPFolder.this.fullName, this.f65283a, this.f65284b, this.f65285c);
        }
    }

    public class c implements ProtocolCommand {
        public c() {
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.getQuotaRoot(IMAPFolder.this.fullName);
        }
    }

    public class d implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Quota f65288a;

        public d(Quota quota) {
            this.f65288a = quota;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            iMAPProtocol.setQuota(this.f65288a);
            return null;
        }
    }

    public class e implements ProtocolCommand {
        public e() {
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.getACL(IMAPFolder.this.fullName);
        }
    }

    public class f implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65291a;

        public f(String str) {
            this.f65291a = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            iMAPProtocol.deleteACL(IMAPFolder.this.fullName, this.f65291a);
            return null;
        }
    }

    public class g implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65293a;

        public g(String str) {
            this.f65293a = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.listRights(IMAPFolder.this.fullName, this.f65293a);
        }
    }

    public class h implements ProtocolCommand {
        public h() {
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.myRights(IMAPFolder.this.fullName);
        }
    }

    public class i implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IdleManager f65296a;

        public i(IdleManager idleManager) {
            this.f65296a = idleManager;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            IMAPFolder iMAPFolder = IMAPFolder.this;
            int i10 = iMAPFolder.f65276w0;
            IdleManager idleManager = this.f65296a;
            if (i10 == 1 && idleManager != null && idleManager == iMAPFolder.f65277x0) {
                return Boolean.TRUE;
            }
            if (i10 != 0) {
                try {
                    iMAPFolder.messageCacheLock.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                return Boolean.FALSE;
            }
            iMAPProtocol.idleStart();
            iMAPFolder.logger.finest("startIdle: set to IDLE");
            iMAPFolder.f65276w0 = 1;
            iMAPFolder.f65277x0 = idleManager;
            return Boolean.TRUE;
        }
    }

    public class j implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65298a;

        public j(String str) {
            this.f65298a = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.list("", this.f65298a);
        }
    }

    public class k implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f65300a;

        public k(Map map) {
            this.f65300a = map;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.id(this.f65300a);
        }
    }

    public class l implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f65302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ char f65303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f65304c;

        public l(boolean z10, char c10, String str) {
            this.f65302a = z10;
            this.f65303b = c10;
            this.f65304c = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            if (this.f65302a) {
                return iMAPProtocol.lsub("", IMAPFolder.this.fullName + this.f65303b + this.f65304c);
            }
            return iMAPProtocol.list("", IMAPFolder.this.fullName + this.f65303b + this.f65304c);
        }
    }

    public class m implements ProtocolCommand {
        public m() {
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.isREV1() ? iMAPProtocol.list(IMAPFolder.this.fullName, "") : iMAPProtocol.list("", IMAPFolder.this.fullName);
        }
    }

    public class n implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65307a;

        public n(String str) {
            this.f65307a = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.lsub("", this.f65307a);
        }
    }

    public class o implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f65309a;

        public o(boolean z10) {
            this.f65309a = z10;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            if (this.f65309a) {
                iMAPProtocol.subscribe(IMAPFolder.this.fullName);
                return null;
            }
            iMAPProtocol.unsubscribe(IMAPFolder.this.fullName);
            return null;
        }
    }

    public class p implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f65311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ char f65312b;

        public p(int i10, char c10) {
            this.f65311a = i10;
            this.f65312b = c10;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            ListInfo[] list;
            if ((this.f65311a & 1) == 0) {
                iMAPProtocol.create(IMAPFolder.this.fullName + this.f65312b);
            } else {
                iMAPProtocol.create(IMAPFolder.this.fullName);
                if ((this.f65311a & 2) != 0 && (list = iMAPProtocol.list("", IMAPFolder.this.fullName)) != null && !list[0].hasInferiors) {
                    iMAPProtocol.delete(IMAPFolder.this.fullName);
                    throw new ProtocolException("Unsupported type");
                }
            }
            return Boolean.TRUE;
        }
    }

    public class q implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65314a;

        public q(String str) {
            this.f65314a = str;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            return iMAPProtocol.list("", this.f65314a);
        }
    }

    public class r implements ProtocolCommand {
        public r() {
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            iMAPProtocol.delete(IMAPFolder.this.fullName);
            return Boolean.TRUE;
        }
    }

    public class s implements ProtocolCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Folder f65317a;

        public s(Folder folder) {
            this.f65317a = folder;
        }

        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
        public final Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
            iMAPProtocol.rename(IMAPFolder.this.fullName, this.f65317a.getFullName());
            return Boolean.TRUE;
        }
    }

    public IMAPFolder(String str, char c10, IMAPStore iMAPStore, Boolean bool) {
        int iIndexOf;
        super(iMAPStore);
        this.isNamespace = false;
        this.messageCacheLock = new Object();
        this.f65275u0 = false;
        this.v0 = true;
        this.f65276w0 = 0;
        this.f65278y0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1L;
        this.H0 = -1L;
        this.I0 = false;
        this.J0 = -1L;
        this.K0 = true;
        this.L0 = null;
        this.M0 = 0L;
        this.N0 = false;
        if (str == null) {
            throw new NullPointerException("Folder name is null");
        }
        this.fullName = str;
        this.separator = c10;
        this.logger = new MailLogger(getClass(), "DEBUG IMAP", iMAPStore.q().getDebug(), iMAPStore.q().getDebugOut());
        this.O0 = iMAPStore.f65353c1.f65369j;
        this.isNamespace = false;
        if (c10 != 65535 && c10 != 0 && (iIndexOf = this.fullName.indexOf(c10)) > 0 && iIndexOf == this.fullName.length() - 1) {
            this.fullName = this.fullName.substring(0, iIndexOf);
            this.isNamespace = true;
        }
        if (bool != null) {
            this.isNamespace = bool.booleanValue();
        }
    }

    public static void b(MessagingException messagingException, Throwable th2) {
        if ((th2 instanceof Exception) || (th2 instanceof LinkageError)) {
            messagingException.addSuppressed(th2);
            return;
        }
        th2.addSuppressed(messagingException);
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        if (!(th2 instanceof RuntimeException)) {
            throw new RuntimeException("unexpected exception", th2);
        }
        throw ((RuntimeException) th2);
    }

    public static String g(boolean z10, String[] strArr) {
        StringBuilder sb2 = z10 ? new StringBuilder("BODY.PEEK[HEADER.FIELDS (") : new StringBuilder("RFC822.HEADER.LINES (");
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(" ");
            }
            sb2.append(strArr[i10]);
        }
        if (z10) {
            sb2.append(")]");
        } else {
            sb2.append(")");
        }
        return sb2.toString();
    }

    public static int i(ListInfo[] listInfoArr, String str) {
        int i10 = 0;
        while (i10 < listInfoArr.length && !listInfoArr[i10].name.equals(str)) {
            i10++;
        }
        if (i10 >= listInfoArr.length) {
            return 0;
        }
        return i10;
    }

    public void addACL(ACL acl) throws MessagingException {
        doOptionalCommand("ACL not supported", new com.sun.mail.imap.a(this, (char) 0, acl));
    }

    @Override // javax.mail.Folder
    public synchronized void addMessageCountListener(MessageCountListener messageCountListener) {
        super.addMessageCountListener(messageCountListener);
        this.N0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Message[] addMessages(Message[] messageArr) throws MessagingException {
        MimeMessage[] mimeMessageArr;
        checkOpened();
        mimeMessageArr = new MimeMessage[messageArr.length];
        AppendUID[] appendUIDArrAppendUIDMessages = appendUIDMessages(messageArr);
        for (int i10 = 0; i10 < appendUIDArrAppendUIDMessages.length; i10++) {
            AppendUID appendUID = appendUIDArrAppendUIDMessages[i10];
            if (appendUID != null && appendUID.uidvalidity == this.G0) {
                try {
                    mimeMessageArr[i10] = getMessageByUID(appendUID.uid);
                } catch (MessagingException unused) {
                }
            }
        }
        return mimeMessageArr;
    }

    public void addRights(ACL acl) throws MessagingException {
        doOptionalCommand("ACL not supported", new com.sun.mail.imap.a(this, '+', acl));
    }

    @Override // javax.mail.Folder
    public synchronized void appendMessages(Message[] messageArr) throws MessagingException {
        try {
            checkExists();
            int i10 = ((IMAPStore) this.store).f65357x0;
            for (Message message : messageArr) {
                Date receivedDate = message.getReceivedDate();
                if (receivedDate == null) {
                    receivedDate = message.getSentDate();
                }
                try {
                    doCommand(new a(message.getFlags(), receivedDate, new com.sun.mail.imap.c(message.getSize() > i10 ? 0 : i10, message)));
                } catch (IOException e5) {
                    throw new MessagingException("IOException while appending messages", e5);
                } catch (MessageRemovedException unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized AppendUID[] appendUIDMessages(Message[] messageArr) throws MessagingException {
        AppendUID[] appendUIDArr;
        try {
            checkExists();
            int i10 = ((IMAPStore) this.store).f65357x0;
            appendUIDArr = new AppendUID[messageArr.length];
            for (int i11 = 0; i11 < messageArr.length; i11++) {
                Message message = messageArr[i11];
                try {
                    com.sun.mail.imap.c cVar = new com.sun.mail.imap.c(message.getSize() > i10 ? 0 : i10, message);
                    Date receivedDate = message.getReceivedDate();
                    if (receivedDate == null) {
                        receivedDate = message.getSentDate();
                    }
                    appendUIDArr[i11] = (AppendUID) doCommand(new b(message.getFlags(), receivedDate, cVar));
                } catch (IOException e5) {
                    throw new MessagingException("IOException while appending messages", e5);
                } catch (MessageRemovedException unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return appendUIDArr;
    }

    public final void c(boolean z10) {
        releaseProtocol(z10);
        this.messageCache = null;
        this.uidTable = null;
        this.exists = false;
        this.attributes = null;
        this.f65275u0 = false;
        this.f65276w0 = 0;
        this.messageCacheLock.notifyAll();
        notifyConnectionListeners(3);
    }

    public void checkClosed() {
        if (this.f65275u0) {
            throw new IllegalStateException("This operation is not allowed on an open folder");
        }
    }

    public void checkExists() throws MessagingException {
        if (!this.exists && !exists()) {
            throw new FolderNotFoundException(this, ad.d.f(new StringBuilder(), this.fullName, " not found"));
        }
    }

    public void checkOpened() throws FolderClosedException {
        if (this.f65275u0) {
            return;
        }
        if (!this.v0) {
            throw new FolderClosedException(this, "Lost folder connection to server");
        }
        throw new IllegalStateException("This operation is not allowed on a closed folder");
    }

    public void checkRange(int i10) throws MessagingException {
        if (i10 < 1) {
            throw new IndexOutOfBoundsException("message number < 1");
        }
        if (i10 <= this.f65278y0) {
            return;
        }
        synchronized (this.messageCacheLock) {
            try {
                try {
                    keepConnectionAlive(false);
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this, e5.getMessage());
                }
            } catch (ProtocolException e7) {
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
        if (i10 <= this.f65278y0) {
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " > " + this.f65278y0);
    }

    @Override // javax.mail.Folder
    public synchronized void close(boolean z10) throws MessagingException {
        d(z10, false);
    }

    @Override // javax.mail.Folder
    public synchronized void copyMessages(Message[] messageArr, Folder folder) throws MessagingException {
        e(messageArr, folder, false);
    }

    public synchronized AppendUID[] copyUIDMessages(Message[] messageArr, Folder folder) throws MessagingException {
        return f(messageArr, folder, false);
    }

    @Override // javax.mail.Folder
    public synchronized boolean create(int i10) throws MessagingException {
        char separator;
        if ((i10 & 1) == 0) {
            try {
                separator = getSeparator();
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            separator = 0;
        }
        if (doCommandIgnoreFailure(new p(i10, separator)) == null) {
            return false;
        }
        boolean zExists = exists();
        if (zExists) {
            notifyFolderListeners(1);
        }
        return zExists;
    }

    public final void d(boolean z10, boolean z11) throws MessagingException {
        synchronized (this.messageCacheLock) {
            try {
                if (!this.f65275u0 && this.v0) {
                    throw new IllegalStateException("This operation is not allowed on a closed folder");
                }
                boolean z12 = true;
                this.v0 = true;
                try {
                    if (this.f65275u0) {
                        try {
                            r();
                            if (z11) {
                                this.logger.log(Level.FINE, "forcing folder {0} to close", this.fullName);
                                if (this.protocol != null) {
                                    this.protocol.disconnect();
                                }
                            } else if (((IMAPStore) this.store).u()) {
                                this.logger.fine("pool is full, not adding an Authenticated connection");
                                if (z10 && this.protocol != null) {
                                    this.protocol.close();
                                }
                                if (this.protocol != null) {
                                    this.protocol.logout();
                                }
                            } else if (!z10 && this.mode == 2) {
                                try {
                                    if (this.protocol != null && this.protocol.hasCapability("UNSELECT")) {
                                        this.protocol.unselect();
                                    } else if (this.protocol != null) {
                                        try {
                                            this.protocol.examine(this.fullName);
                                            if (this.protocol != null) {
                                                this.protocol.close();
                                            }
                                        } catch (CommandFailedException unused) {
                                        }
                                    }
                                } catch (ProtocolException unused2) {
                                    z12 = false;
                                }
                            } else if (this.protocol != null) {
                                this.protocol.close();
                            }
                            if (this.f65275u0) {
                                c(z12);
                            }
                        } catch (ProtocolException e5) {
                            throw new MessagingException(e5.getMessage(), e5);
                        }
                    }
                } catch (Throwable th2) {
                    if (this.f65275u0) {
                        c(true);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // javax.mail.Folder
    public synchronized boolean delete(boolean z10) throws MessagingException {
        try {
            checkClosed();
            if (z10) {
                for (Folder folder : list()) {
                    folder.delete(z10);
                }
            }
            if (doCommandIgnoreFailure(new r()) == null) {
                return false;
            }
            this.exists = false;
            this.attributes = null;
            notifyFolderListeners(2);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Object doCommand(ProtocolCommand protocolCommand) throws MessagingException {
        try {
            return doProtocolCommand(protocolCommand);
        } catch (ConnectionException e5) {
            throwClosedException(e5);
            return null;
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        }
    }

    public Object doCommandIgnoreFailure(ProtocolCommand protocolCommand) throws MessagingException {
        try {
            return doProtocolCommand(protocolCommand);
        } catch (CommandFailedException unused) {
            return null;
        } catch (ConnectionException e5) {
            throwClosedException(e5);
            return null;
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        }
    }

    public Object doOptionalCommand(String str, ProtocolCommand protocolCommand) throws MessagingException {
        try {
            return doProtocolCommand(protocolCommand);
        } catch (BadCommandException e5) {
            throw new MessagingException(str, e5);
        } catch (ConnectionException e7) {
            throwClosedException(e7);
            return null;
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
    }

    public synchronized Object doProtocolCommand(ProtocolCommand protocolCommand) throws ProtocolException {
        IMAPProtocol storeProtocol;
        Object objDoCommand;
        if (this.protocol != null) {
            synchronized (this.messageCacheLock) {
                objDoCommand = protocolCommand.doCommand(getProtocol());
            }
            return objDoCommand;
        }
        try {
            storeProtocol = getStoreProtocol();
            try {
                Object objDoCommand2 = protocolCommand.doCommand(storeProtocol);
                releaseStoreProtocol(storeProtocol);
                return objDoCommand2;
            } catch (Throwable th2) {
                th = th2;
                releaseStoreProtocol(storeProtocol);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            storeProtocol = null;
        }
    }

    public final synchronized void e(Message[] messageArr, Folder folder, boolean z10) throws MessagingException {
        try {
            checkOpened();
            if (messageArr.length == 0) {
                return;
            }
            if (folder.getStore() == this.store) {
                synchronized (this.messageCacheLock) {
                    try {
                        try {
                            try {
                                IMAPProtocol protocol = getProtocol();
                                MessageSet[] messageSet = Utility.toMessageSet(messageArr, null);
                                if (messageSet == null) {
                                    throw new MessageRemovedException("Messages have been removed");
                                }
                                if (z10) {
                                    protocol.move(messageSet, folder.getFullName());
                                } else {
                                    protocol.copy(messageSet, folder.getFullName());
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (CommandFailedException e5) {
                            if (e5.getMessage().indexOf("TRYCREATE") == -1) {
                                throw new MessagingException(e5.getMessage(), e5);
                            }
                            throw new FolderNotFoundException(folder, folder.getFullName() + " does not exist");
                        }
                    } catch (ConnectionException e7) {
                        throw new FolderClosedException(this, e7.getMessage());
                    } catch (ProtocolException e10) {
                        throw new MessagingException(e10.getMessage(), e10);
                    }
                }
            } else {
                if (z10) {
                    throw new MessagingException("Move between stores not supported");
                }
                super.copyMessages(messageArr, folder);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // javax.mail.Folder
    public synchronized boolean exists() throws MessagingException {
        String str;
        try {
            if (!this.isNamespace || this.separator == 0) {
                str = this.fullName;
            } else {
                str = this.fullName + this.separator;
            }
            ListInfo[] listInfoArr = (ListInfo[]) doCommand(new j(str));
            if (listInfoArr != null) {
                int i10 = i(listInfoArr, str);
                this.fullName = listInfoArr[i10].name;
                this.separator = listInfoArr[i10].separator;
                int length = this.fullName.length();
                if (this.separator != 0 && length > 0) {
                    int i11 = length - 1;
                    if (this.fullName.charAt(i11) == this.separator) {
                        this.fullName = this.fullName.substring(0, i11);
                    }
                }
                this.type = 0;
                ListInfo listInfo = listInfoArr[i10];
                if (listInfo.hasInferiors) {
                    this.type = 2;
                }
                if (listInfo.canOpen) {
                    this.type |= 1;
                }
                this.exists = true;
                this.attributes = listInfoArr[i10].attrs;
            } else {
                this.exists = this.f65275u0;
                this.attributes = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.exists;
    }

    @Override // javax.mail.Folder
    public synchronized Message[] expunge() throws MessagingException {
        return expunge(null);
    }

    public final synchronized AppendUID[] f(Message[] messageArr, Folder folder, boolean z10) throws MessagingException {
        AppendUID[] appendUIDArr;
        try {
            checkOpened();
            if (messageArr.length == 0) {
                return null;
            }
            if (folder.getStore() != this.store) {
                throw new MessagingException(z10 ? "can't moveUIDMessages to a different store" : "can't copyUIDMessages to a different store");
            }
            FetchProfile fetchProfile = new FetchProfile();
            fetchProfile.add(UIDFolder.FetchProfileItem.UID);
            fetch(messageArr, fetchProfile);
            synchronized (this.messageCacheLock) {
                try {
                    try {
                        try {
                            IMAPProtocol protocol = getProtocol();
                            MessageSet[] messageSet = Utility.toMessageSet(messageArr, null);
                            if (messageSet == null) {
                                throw new MessageRemovedException("Messages have been removed");
                            }
                            CopyUID copyUIDMoveuid = z10 ? protocol.moveuid(messageSet, folder.getFullName()) : protocol.copyuid(messageSet, folder.getFullName());
                            long[] array = UIDSet.toArray(copyUIDMoveuid.src);
                            long[] array2 = UIDSet.toArray(copyUIDMoveuid.dst);
                            Message[] messagesByUID = getMessagesByUID(array);
                            appendUIDArr = new AppendUID[messageArr.length];
                            for (int i10 = 0; i10 < messageArr.length; i10++) {
                                int i11 = i10;
                                do {
                                    if (messageArr[i10] == messagesByUID[i11]) {
                                        appendUIDArr[i10] = new AppendUID(copyUIDMoveuid.uidvalidity, array2[i11]);
                                        break;
                                    }
                                    i11++;
                                    if (i11 >= messagesByUID.length) {
                                        i11 = 0;
                                    }
                                } while (i11 != i10);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (ConnectionException e5) {
                        throw new FolderClosedException(this, e5.getMessage());
                    }
                } catch (CommandFailedException e7) {
                    if (e7.getMessage().indexOf("TRYCREATE") == -1) {
                        throw new MessagingException(e7.getMessage(), e7);
                    }
                    throw new FolderNotFoundException(folder, folder.getFullName() + " does not exist");
                } catch (ProtocolException e10) {
                    throw new MessagingException(e10.getMessage(), e10);
                }
            }
            return appendUIDArr;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // javax.mail.Folder
    public synchronized void fetch(Message[] messageArr, FetchProfile fetchProfile) throws MessagingException {
        boolean zIsREV1;
        FetchItem[] fetchItems;
        boolean z10;
        boolean z11;
        String[] headerNames;
        try {
            synchronized (this.messageCacheLock) {
                checkOpened();
                zIsREV1 = this.protocol.isREV1();
                fetchItems = this.protocol.getFetchItems();
            }
            StringBuilder sb2 = new StringBuilder();
            if (fetchProfile.contains(FetchProfile.Item.ENVELOPE)) {
                sb2.append(getEnvelopeCommand());
                z10 = false;
            } else {
                z10 = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.FLAGS)) {
                sb2.append(z10 ? "FLAGS" : " FLAGS");
                z10 = false;
            }
            if (fetchProfile.contains(FetchProfile.Item.CONTENT_INFO)) {
                sb2.append(z10 ? "BODYSTRUCTURE" : " BODYSTRUCTURE");
                z10 = false;
            }
            if (fetchProfile.contains(UIDFolder.FetchProfileItem.UID)) {
                sb2.append(z10 ? "UID" : " UID");
                z10 = false;
            }
            if (fetchProfile.contains(FetchProfileItem.HEADERS)) {
                if (zIsREV1) {
                    sb2.append(z10 ? "BODY.PEEK[HEADER]" : " BODY.PEEK[HEADER]");
                } else {
                    sb2.append(z10 ? "RFC822.HEADER" : " RFC822.HEADER");
                }
                z10 = false;
                z11 = true;
            } else {
                z11 = false;
            }
            if (fetchProfile.contains(FetchProfileItem.MESSAGE)) {
                if (zIsREV1) {
                    sb2.append(z10 ? "BODY.PEEK[]" : " BODY.PEEK[]");
                } else {
                    sb2.append(z10 ? "RFC822" : " RFC822");
                }
                z10 = false;
                z11 = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.SIZE) || fetchProfile.contains(FetchProfileItem.SIZE)) {
                sb2.append(z10 ? "RFC822.SIZE" : " RFC822.SIZE");
                z10 = false;
            }
            if (fetchProfile.contains(FetchProfileItem.INTERNALDATE)) {
                sb2.append(z10 ? "INTERNALDATE" : " INTERNALDATE");
                z10 = false;
            }
            Response[] responseArrFetch = null;
            if (z11) {
                headerNames = null;
            } else {
                headerNames = fetchProfile.getHeaderNames();
                if (headerNames.length > 0) {
                    if (!z10) {
                        sb2.append(" ");
                    }
                    sb2.append(g(zIsREV1, headerNames));
                }
            }
            for (int i10 = 0; i10 < fetchItems.length; i10++) {
                if (fetchProfile.contains(fetchItems[i10].getFetchProfileItem())) {
                    if (sb2.length() != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(fetchItems[i10].getName());
                }
            }
            IMAPMessage.FetchProfileCondition fetchProfileCondition = new IMAPMessage.FetchProfileCondition(fetchProfile, fetchItems);
            synchronized (this.messageCacheLock) {
                checkOpened();
                MessageSet[] messageSetSorted = Utility.toMessageSetSorted(messageArr, fetchProfileCondition);
                if (messageSetSorted == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        responseArrFetch = getProtocol().fetch(messageSetSorted, sb2.toString());
                    } catch (ConnectionException e5) {
                        throw new FolderClosedException(this, e5.getMessage());
                    }
                } catch (CommandFailedException unused) {
                } catch (ProtocolException e7) {
                    throw new MessagingException(e7.getMessage(), e7);
                }
                if (responseArrFetch == null) {
                    return;
                }
                for (Response response : responseArrFetch) {
                    if (response != null) {
                        if (response instanceof FetchResponse) {
                            FetchResponse fetchResponse = (FetchResponse) response;
                            IMAPMessage messageBySeqNumber = getMessageBySeqNumber(fetchResponse.getNumber());
                            int itemCount = fetchResponse.getItemCount();
                            boolean z12 = false;
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                Item item = fetchResponse.getItem(i11);
                                if ((item instanceof Flags) && (!fetchProfile.contains(FetchProfile.Item.FLAGS) || messageBySeqNumber == null)) {
                                    z12 = true;
                                } else if (messageBySeqNumber != null) {
                                    messageBySeqNumber.handleFetchItem(item, headerNames, z11);
                                }
                            }
                            if (messageBySeqNumber != null) {
                                messageBySeqNumber.handleExtensionFetchItems(fetchResponse.getExtensionItems());
                            }
                            if (z12) {
                                arrayList.add(fetchResponse);
                            }
                        } else {
                            arrayList.add(response);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    Response[] responseArr = new Response[size];
                    arrayList.toArray(responseArr);
                    for (int i12 = 0; i12 < size; i12++) {
                        Response response2 = responseArr[i12];
                        if (response2 != null) {
                            handleResponse(response2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void forceClose() throws MessagingException {
        d(false, true);
    }

    public ACL[] getACL() throws MessagingException {
        return (ACL[]) doOptionalCommand("ACL not supported", new e());
    }

    public synchronized String[] getAttributes() throws MessagingException {
        try {
            checkExists();
            if (this.attributes == null) {
                exists();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.attributes == null ? new String[0] : (String[]) this.attributes.clone();
    }

    @Override // javax.mail.Folder
    public synchronized int getDeletedMessageCount() throws MessagingException {
        int length;
        if (!this.f65275u0) {
            checkExists();
            return -1;
        }
        Flags flags = new Flags();
        flags.add(Flags.Flag.DELETED);
        try {
            synchronized (this.messageCacheLock) {
                length = getProtocol().search(new FlagTerm(flags, true)).length;
            }
            return length;
        } catch (ConnectionException e5) {
            throw new FolderClosedException(this, e5.getMessage());
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        }
    }

    public String getEnvelopeCommand() {
        return "ENVELOPE INTERNALDATE RFC822.SIZE";
    }

    @Override // javax.mail.Folder
    public synchronized Folder getFolder(String str) throws MessagingException {
        char separator;
        try {
            if (this.attributes != null && (this.type & 2) == 0) {
                throw new MessagingException("Cannot contain subfolders");
            }
            separator = getSeparator();
        } catch (Throwable th2) {
            throw th2;
        }
        return ((IMAPStore) this.store).newIMAPFolder(this.fullName + separator + str, separator);
    }

    @Override // javax.mail.Folder
    public String getFullName() {
        return this.fullName;
    }

    public synchronized long getHighestModSeq() throws MessagingException {
        Throwable th2;
        ProtocolException e5;
        IMAPProtocol storeProtocol;
        BadCommandException e7;
        if (this.f65275u0) {
            return this.J0;
        }
        Status status = null;
        try {
            try {
                storeProtocol = getStoreProtocol();
                try {
                    if (!storeProtocol.hasCapability("CONDSTORE")) {
                        throw new BadCommandException("CONDSTORE not supported");
                    }
                    status = storeProtocol.status(this.fullName, new String[]{"HIGHESTMODSEQ"});
                    releaseStoreProtocol(storeProtocol);
                    if (status == null) {
                        throw new MessagingException("Cannot obtain HIGHESTMODSEQ");
                    }
                    return status.highestmodseq;
                } catch (BadCommandException e10) {
                    e7 = e10;
                    throw new MessagingException("Cannot obtain HIGHESTMODSEQ", e7);
                } catch (ConnectionException e11) {
                    e = e11;
                    throwClosedException(e);
                } catch (ProtocolException e12) {
                    e5 = e12;
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (Throwable th3) {
                th2 = th3;
                releaseStoreProtocol(null);
                throw th2;
            }
        } catch (BadCommandException e13) {
            e7 = e13;
        } catch (ConnectionException e14) {
            e = e14;
            storeProtocol = null;
        } catch (ProtocolException e15) {
            e5 = e15;
        } catch (Throwable th4) {
            th2 = th4;
            releaseStoreProtocol(null);
            throw th2;
        }
    }

    @Override // javax.mail.Folder
    public synchronized Message getMessage(int i10) throws MessagingException {
        checkOpened();
        checkRange(i10);
        return this.messageCache.getMessage(i10);
    }

    public IMAPMessage getMessageBySeqNumber(int i10) {
        if (i10 <= this.messageCache.size()) {
            return this.messageCache.getMessageBySeqnum(i10);
        }
        if (!this.logger.isLoggable(Level.FINE)) {
            return null;
        }
        MailLogger mailLogger = this.logger;
        StringBuilder sbC = o1.c("ignoring message number ", i10, " outside range ");
        sbC.append(this.messageCache.size());
        mailLogger.fine(sbC.toString());
        return null;
    }

    @Override // javax.mail.UIDFolder
    public synchronized Message getMessageByUID(long j10) throws MessagingException {
        IMAPMessage iMAPMessage;
        checkOpened();
        try {
            try {
                synchronized (this.messageCacheLock) {
                    Long lValueOf = Long.valueOf(j10);
                    Hashtable<Long, IMAPMessage> hashtable = this.uidTable;
                    if (hashtable != null) {
                        iMAPMessage = hashtable.get(lValueOf);
                        if (iMAPMessage != null) {
                            return iMAPMessage;
                        }
                    } else {
                        this.uidTable = new Hashtable<>();
                        iMAPMessage = null;
                    }
                    getProtocol().fetchSequenceNumber(j10);
                    Hashtable<Long, IMAPMessage> hashtable2 = this.uidTable;
                    return (hashtable2 == null || (iMAPMessage = hashtable2.get(lValueOf)) == null) ? iMAPMessage : iMAPMessage;
                }
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this, e5.getMessage());
            }
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        }
    }

    @Override // javax.mail.Folder
    public synchronized int getMessageCount() throws MessagingException {
        synchronized (this.messageCacheLock) {
            if (this.f65275u0) {
                try {
                    try {
                        keepConnectionAlive(true);
                        return this.f65278y0;
                    } catch (ConnectionException e5) {
                        throw new FolderClosedException(this, e5.getMessage());
                    }
                } catch (ProtocolException e7) {
                    throw new MessagingException(e7.getMessage(), e7);
                }
            }
            checkExists();
            try {
                try {
                    return l().total;
                } catch (BadCommandException unused) {
                    IMAPProtocol storeProtocol = null;
                    try {
                        try {
                            storeProtocol = getStoreProtocol();
                            MailboxInfo mailboxInfoExamine = storeProtocol.examine(this.fullName);
                            storeProtocol.close();
                            int i10 = mailboxInfoExamine.total;
                            releaseStoreProtocol(storeProtocol);
                            return i10;
                        } catch (ProtocolException e10) {
                            throw new MessagingException(e10.getMessage(), e10);
                        }
                    } catch (Throwable th2) {
                        releaseStoreProtocol(storeProtocol);
                        throw th2;
                    }
                }
            } catch (ConnectionException e11) {
                throw new StoreClosedException(this.store, e11.getMessage());
            } catch (ProtocolException e12) {
                throw new MessagingException(e12.getMessage(), e12);
            }
            throw th;
        }
    }

    @Override // javax.mail.Folder
    public synchronized Message[] getMessages() throws MessagingException {
        Message[] messageArr;
        checkOpened();
        int messageCount = getMessageCount();
        messageArr = new Message[messageCount];
        for (int i10 = 1; i10 <= messageCount; i10++) {
            messageArr[i10 - 1] = this.messageCache.getMessage(i10);
        }
        return messageArr;
    }

    public IMAPMessage[] getMessagesBySeqNumbers(int[] iArr) {
        int length = iArr.length;
        IMAPMessage[] iMAPMessageArr = new IMAPMessage[length];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            IMAPMessage messageBySeqNumber = getMessageBySeqNumber(iArr[i11]);
            iMAPMessageArr[i11] = messageBySeqNumber;
            if (messageBySeqNumber == null) {
                i10++;
            }
        }
        if (i10 <= 0) {
            return iMAPMessageArr;
        }
        IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[iArr.length - i10];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            IMAPMessage iMAPMessage = iMAPMessageArr[i13];
            if (iMAPMessage != null) {
                iMAPMessageArr2[i12] = iMAPMessage;
                i12++;
            }
        }
        return iMAPMessageArr2;
    }

    @Override // javax.mail.UIDFolder
    public synchronized Message[] getMessagesByUID(long j10, long j11) throws MessagingException {
        Message[] messageArr;
        checkOpened();
        try {
            synchronized (this.messageCacheLock) {
                try {
                    if (this.uidTable == null) {
                        this.uidTable = new Hashtable<>();
                    }
                    long[] jArrFetchSequenceNumbers = getProtocol().fetchSequenceNumbers(j10, j11);
                    ArrayList arrayList = new ArrayList();
                    for (long j12 : jArrFetchSequenceNumbers) {
                        IMAPMessage iMAPMessage = this.uidTable.get(Long.valueOf(j12));
                        if (iMAPMessage != null) {
                            arrayList.add(iMAPMessage);
                        }
                    }
                    messageArr = (Message[]) arrayList.toArray(new Message[arrayList.size()]);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (ConnectionException e5) {
            throw new FolderClosedException(this, e5.getMessage());
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        }
        return messageArr;
    }

    public synchronized Message[] getMessagesByUIDChangedSince(long j10, long j11, long j12) throws MessagingException {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        try {
            synchronized (this.messageCacheLock) {
                IMAPProtocol protocol = getProtocol();
                if (!protocol.hasCapability("CONDSTORE")) {
                    throw new BadCommandException("CONDSTORE not supported");
                }
                messagesBySeqNumbers = getMessagesBySeqNumbers(protocol.uidfetchChangedSince(j10, j11, j12));
            }
        } catch (ConnectionException e5) {
            throw new FolderClosedException(this, e5.getMessage());
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        }
        return messagesBySeqNumbers;
    }

    @Override // javax.mail.Folder
    public synchronized String getName() {
        if (this.name == null) {
            try {
                this.name = this.fullName.substring(this.fullName.lastIndexOf(getSeparator()) + 1);
            } catch (MessagingException unused) {
            }
        }
        return this.name;
    }

    @Override // javax.mail.Folder
    public synchronized int getNewMessageCount() throws MessagingException {
        synchronized (this.messageCacheLock) {
            if (this.f65275u0) {
                try {
                    try {
                        keepConnectionAlive(true);
                        return this.E0;
                    } catch (ConnectionException e5) {
                        throw new FolderClosedException(this, e5.getMessage());
                    }
                } catch (ProtocolException e7) {
                    throw new MessagingException(e7.getMessage(), e7);
                }
            }
            checkExists();
            try {
                try {
                    return l().recent;
                } catch (BadCommandException unused) {
                    IMAPProtocol storeProtocol = null;
                    try {
                        try {
                            storeProtocol = getStoreProtocol();
                            MailboxInfo mailboxInfoExamine = storeProtocol.examine(this.fullName);
                            storeProtocol.close();
                            int i10 = mailboxInfoExamine.recent;
                            releaseStoreProtocol(storeProtocol);
                            return i10;
                        } catch (ProtocolException e10) {
                            throw new MessagingException(e10.getMessage(), e10);
                        }
                    } catch (Throwable th2) {
                        releaseStoreProtocol(storeProtocol);
                        throw th2;
                    }
                }
            } catch (ConnectionException e11) {
                throw new StoreClosedException(this.store, e11.getMessage());
            } catch (ProtocolException e12) {
                throw new MessagingException(e12.getMessage(), e12);
            }
            throw th;
        }
    }

    @Override // javax.mail.Folder
    public synchronized Folder getParent() throws MessagingException {
        char separator = getSeparator();
        int iLastIndexOf = this.fullName.lastIndexOf(separator);
        if (iLastIndexOf != -1) {
            return ((IMAPStore) this.store).newIMAPFolder(this.fullName.substring(0, iLastIndexOf), separator);
        }
        return new DefaultFolder((IMAPStore) this.store);
    }

    @Override // javax.mail.Folder
    public synchronized Flags getPermanentFlags() {
        Flags flags = this.permanentFlags;
        if (flags == null) {
            return null;
        }
        return (Flags) flags.clone();
    }

    public IMAPProtocol getProtocol() throws ProtocolException {
        r();
        if (this.protocol != null) {
            return this.protocol;
        }
        throw new ConnectionException("Connection closed");
    }

    public Quota[] getQuota() throws MessagingException {
        return (Quota[]) doOptionalCommand("QUOTA not supported", new c());
    }

    @Override // javax.mail.Folder
    public synchronized char getSeparator() throws MessagingException {
        try {
            if (this.separator == 65535) {
                ListInfo[] listInfoArr = (ListInfo[]) doCommand(new m());
                if (listInfoArr != null) {
                    this.separator = listInfoArr[0].separator;
                } else {
                    this.separator = JsonPointer.SEPARATOR;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.separator;
    }

    public synchronized Message[] getSortedMessages(SortTerm[] sortTermArr) throws MessagingException {
        return getSortedMessages(sortTermArr, null);
    }

    public synchronized long getStatusItem(String str) throws MessagingException {
        if (this.f65275u0) {
            return -1L;
        }
        checkExists();
        IMAPProtocol storeProtocol = null;
        try {
            try {
                try {
                    storeProtocol = getStoreProtocol();
                    Status status = storeProtocol.status(this.fullName, new String[]{str});
                    long item = status != null ? status.getItem(str) : -1L;
                    releaseStoreProtocol(storeProtocol);
                    return item;
                } catch (ProtocolException e5) {
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (BadCommandException unused) {
                releaseStoreProtocol(storeProtocol);
                return -1L;
            } catch (ConnectionException e7) {
                throw new StoreClosedException(this.store, e7.getMessage());
            }
        } catch (Throwable th2) {
            releaseStoreProtocol(storeProtocol);
            throw th2;
        }
    }

    public synchronized IMAPProtocol getStoreProtocol() throws ProtocolException {
        IMAPProtocol iMAPProtocolR;
        this.O0.fine("getStoreProtocol() borrowing a connection");
        IMAPStore iMAPStore = (IMAPStore) this.store;
        iMAPProtocolR = iMAPStore.r();
        iMAPProtocolR.removeResponseHandler(iMAPStore);
        iMAPProtocolR.addResponseHandler(iMAPStore.f65354d1);
        return iMAPProtocolR;
    }

    @Override // javax.mail.Folder
    public synchronized int getType() throws MessagingException {
        try {
            if (!this.f65275u0) {
                checkExists();
            } else if (this.attributes == null) {
                exists();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.type;
    }

    @Override // javax.mail.UIDFolder
    public synchronized long getUID(Message message) throws MessagingException {
        try {
            if (message.getFolder() != this) {
                throw new NoSuchElementException("Message does not belong to this folder");
            }
            checkOpened();
            if (!(message instanceof IMAPMessage)) {
                throw new MessagingException("message is not an IMAPMessage");
            }
            IMAPMessage iMAPMessage = (IMAPMessage) message;
            long uid = iMAPMessage.getUID();
            if (uid != -1) {
                return uid;
            }
            synchronized (this.messageCacheLock) {
                try {
                    try {
                        try {
                            IMAPProtocol protocol = getProtocol();
                            iMAPMessage.checkExpunged();
                            UID uidFetchUID = protocol.fetchUID(iMAPMessage.getSequenceNumber());
                            if (uidFetchUID != null) {
                                uid = uidFetchUID.uid;
                                iMAPMessage.setUID(uid);
                                if (this.uidTable == null) {
                                    this.uidTable = new Hashtable<>();
                                }
                                this.uidTable.put(Long.valueOf(uid), iMAPMessage);
                            }
                        } catch (ConnectionException e5) {
                            throw new FolderClosedException(this, e5.getMessage());
                        }
                    } catch (ProtocolException e7) {
                        throw new MessagingException(e7.getMessage(), e7);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return uid;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // javax.mail.UIDFolder
    public synchronized long getUIDNext() throws MessagingException {
        Throwable th2;
        ProtocolException e5;
        IMAPProtocol storeProtocol;
        BadCommandException e7;
        if (this.f65275u0) {
            return this.H0;
        }
        Status status = null;
        try {
            try {
                storeProtocol = getStoreProtocol();
                try {
                    status = storeProtocol.status(this.fullName, new String[]{"UIDNEXT"});
                } catch (BadCommandException e10) {
                    e7 = e10;
                    throw new MessagingException("Cannot obtain UIDNext", e7);
                } catch (ConnectionException e11) {
                    e = e11;
                    throwClosedException(e);
                } catch (ProtocolException e12) {
                    e5 = e12;
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (Throwable th3) {
                th2 = th3;
                releaseStoreProtocol(null);
                throw th2;
            }
        } catch (BadCommandException e13) {
            e7 = e13;
        } catch (ConnectionException e14) {
            e = e14;
            storeProtocol = null;
        } catch (ProtocolException e15) {
            e5 = e15;
        } catch (Throwable th4) {
            th2 = th4;
            releaseStoreProtocol(null);
            throw th2;
        }
        releaseStoreProtocol(storeProtocol);
        if (status == null) {
            throw new MessagingException("Cannot obtain UIDNext");
        }
        return status.uidnext;
    }

    public synchronized boolean getUIDNotSticky() throws MessagingException {
        checkOpened();
        return this.I0;
    }

    @Override // javax.mail.UIDFolder
    public synchronized long getUIDValidity() throws MessagingException {
        Throwable th2;
        ProtocolException e5;
        IMAPProtocol storeProtocol;
        BadCommandException e7;
        if (this.f65275u0) {
            return this.G0;
        }
        Status status = null;
        try {
            try {
                storeProtocol = getStoreProtocol();
                try {
                    status = storeProtocol.status(this.fullName, new String[]{"UIDVALIDITY"});
                } catch (BadCommandException e10) {
                    e7 = e10;
                    throw new MessagingException("Cannot obtain UIDValidity", e7);
                } catch (ConnectionException e11) {
                    e = e11;
                    throwClosedException(e);
                } catch (ProtocolException e12) {
                    e5 = e12;
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (Throwable th3) {
                th2 = th3;
                releaseStoreProtocol(null);
                throw th2;
            }
        } catch (BadCommandException e13) {
            e7 = e13;
        } catch (ConnectionException e14) {
            e = e14;
            storeProtocol = null;
        } catch (ProtocolException e15) {
            e5 = e15;
        } catch (Throwable th4) {
            th2 = th4;
            releaseStoreProtocol(null);
            throw th2;
        }
        releaseStoreProtocol(storeProtocol);
        if (status == null) {
            throw new MessagingException("Cannot obtain UIDValidity");
        }
        return status.uidvalidity;
    }

    @Override // javax.mail.Folder
    public synchronized int getUnreadMessageCount() throws MessagingException {
        int length;
        if (!this.f65275u0) {
            checkExists();
            try {
                try {
                    return l().unseen;
                } catch (ProtocolException e5) {
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (BadCommandException unused) {
                return -1;
            } catch (ConnectionException e7) {
                throw new StoreClosedException(this.store, e7.getMessage());
            }
        }
        Flags flags = new Flags();
        flags.add(Flags.Flag.SEEN);
        try {
            try {
                synchronized (this.messageCacheLock) {
                    length = getProtocol().search(new FlagTerm(flags, false)).length;
                }
                return length;
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this, e10.getMessage());
            }
        } catch (ProtocolException e11) {
            throw new MessagingException(e11.getMessage(), e11);
        }
        throw th;
    }

    public final synchronized Folder[] h(String str, boolean z10) throws MessagingException {
        checkExists();
        int i10 = 0;
        if (this.attributes != null && (this.type & 2) == 0) {
            return new Folder[0];
        }
        char separator = getSeparator();
        ListInfo[] listInfoArr = (ListInfo[]) doCommandIgnoreFailure(new l(z10, separator, str));
        if (listInfoArr == null) {
            return new Folder[0];
        }
        if (listInfoArr.length > 0) {
            if (listInfoArr[0].name.equals(this.fullName + separator)) {
                i10 = 1;
            }
        }
        IMAPFolder[] iMAPFolderArr = new IMAPFolder[listInfoArr.length - i10];
        IMAPStore iMAPStore = (IMAPStore) this.store;
        for (int i11 = i10; i11 < listInfoArr.length; i11++) {
            iMAPFolderArr[i11 - i10] = iMAPStore.newIMAPFolder(listInfoArr[i11]);
        }
        return iMAPFolderArr;
    }

    @Override // com.sun.mail.iap.ResponseHandler
    public void handleResponse(Response response) {
        if (response.isOK() || response.isNO() || response.isBAD() || response.isBYE()) {
            ((IMAPStore) this.store).s(response);
        }
        int i10 = 0;
        if (response.isBYE()) {
            if (this.f65275u0) {
                c(false);
                return;
            }
            return;
        }
        if (response.isOK()) {
            response.skipSpaces();
            if (response.readByte() == 91 && response.readAtom().equalsIgnoreCase("HIGHESTMODSEQ")) {
                this.J0 = response.readLong();
            }
            response.reset();
            return;
        }
        if (response.isUnTagged()) {
            if (!(response instanceof IMAPResponse)) {
                this.logger.fine("UNEXPECTED RESPONSE : " + response.toString());
                return;
            }
            IMAPResponse iMAPResponse = (IMAPResponse) response;
            if (iMAPResponse.keyEquals("EXISTS")) {
                int number = iMAPResponse.getNumber();
                int i11 = this.F0;
                if (number <= i11) {
                    return;
                }
                int i12 = number - i11;
                Message[] messageArr = new Message[i12];
                this.messageCache.addMessages(i12, i11 + 1);
                int i13 = this.f65278y0;
                this.F0 += i12;
                this.f65278y0 += i12;
                if (this.N0) {
                    while (i10 < i12) {
                        i13++;
                        messageArr[i10] = this.messageCache.getMessage(i13);
                        i10++;
                    }
                    notifyMessageAddedListeners(messageArr);
                    return;
                }
                return;
            }
            Message[] messageArr2 = null;
            if (iMAPResponse.keyEquals("EXPUNGE")) {
                int number2 = iMAPResponse.getNumber();
                if (number2 > this.F0) {
                    return;
                }
                if (this.K0 && this.N0) {
                    Message messageBySeqNumber = getMessageBySeqNumber(number2);
                    Message[] messageArr3 = {messageBySeqNumber};
                    if (messageBySeqNumber != null) {
                        messageArr2 = messageArr3;
                    }
                }
                this.messageCache.expungeMessage(number2);
                this.F0--;
                if (messageArr2 != null) {
                    notifyMessageRemovedListeners(false, messageArr2);
                    return;
                }
                return;
            }
            if (!iMAPResponse.keyEquals("VANISHED")) {
                if (!iMAPResponse.keyEquals("FETCH")) {
                    if (iMAPResponse.keyEquals("RECENT")) {
                        this.E0 = iMAPResponse.getNumber();
                        return;
                    }
                    return;
                } else {
                    IMAPMessage iMAPMessageP = p((FetchResponse) iMAPResponse);
                    if (iMAPMessageP != null) {
                        notifyMessageChangedListeners(1, iMAPMessageP);
                        return;
                    }
                    return;
                }
            }
            if (iMAPResponse.readAtomStringList() == null) {
                UIDSet[] uIDSets = UIDSet.parseUIDSets(iMAPResponse.readAtom());
                this.F0 = (int) (((long) this.F0) - UIDSet.size(uIDSets));
                long[] array = UIDSet.toArray(uIDSets);
                int length = array.length;
                Message[] messageArr4 = new IMAPMessage[length];
                for (int i14 = 0; i14 < array.length; i14 += 2) {
                    Hashtable<Long, IMAPMessage> hashtable = this.uidTable;
                    IMAPMessage iMAPMessageNewIMAPMessage = hashtable != null ? hashtable.get(Long.valueOf(array[i14])) : null;
                    if (iMAPMessageNewIMAPMessage == null) {
                        iMAPMessageNewIMAPMessage = newIMAPMessage(-1);
                        iMAPMessageNewIMAPMessage.setUID(array[i14]);
                        iMAPMessageNewIMAPMessage.setExpunged(true);
                    }
                    messageArr4[i14] = iMAPMessageNewIMAPMessage;
                }
                while (i10 < length) {
                    Message message = messageArr4[i10];
                    if (message.getMessageNumber() > 0) {
                        this.messageCache.expungeMessage(message.getMessageNumber());
                    }
                    i10++;
                }
                if (this.K0 && this.N0) {
                    notifyMessageRemovedListeners(true, messageArr4);
                }
            }
        }
    }

    @Override // javax.mail.Folder
    public synchronized boolean hasNewMessages() throws MessagingException {
        String str;
        try {
            synchronized (this.messageCacheLock) {
                if (this.f65275u0) {
                    try {
                        keepConnectionAlive(true);
                        return this.E0 > 0;
                    } catch (ConnectionException e5) {
                        throw new FolderClosedException(this, e5.getMessage());
                    } catch (ProtocolException e7) {
                        throw new MessagingException(e7.getMessage(), e7);
                    }
                }
                if (!this.isNamespace || this.separator == 0) {
                    str = this.fullName;
                } else {
                    str = this.fullName + this.separator;
                }
                ListInfo[] listInfoArr = (ListInfo[]) doCommandIgnoreFailure(new q(str));
                if (listInfoArr == null) {
                    throw new FolderNotFoundException(this, this.fullName + " not found");
                }
                int i10 = listInfoArr[i(listInfoArr, str)].changeState;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                try {
                    return l().recent > 0;
                } catch (BadCommandException unused) {
                    return false;
                } catch (ConnectionException e10) {
                    throw new StoreClosedException(this.store, e10.getMessage());
                } catch (ProtocolException e11) {
                    throw new MessagingException(e11.getMessage(), e11);
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Map<String, String> id(Map<String, String> map) throws MessagingException {
        checkOpened();
        return (Map) doOptionalCommand("ID not supported", new k(map));
    }

    public void idle() throws MessagingException {
        idle(false);
    }

    @Override // javax.mail.Folder
    public synchronized boolean isOpen() {
        synchronized (this.messageCacheLock) {
            if (this.f65275u0) {
                try {
                    keepConnectionAlive(false);
                } catch (ProtocolException unused) {
                }
            }
        }
        return this.f65275u0;
    }

    @Override // javax.mail.Folder
    public synchronized boolean isSubscribed() {
        String str;
        ListInfo[] listInfoArr;
        try {
            if (!this.isNamespace || this.separator == 0) {
                str = this.fullName;
            } else {
                str = this.fullName + this.separator;
            }
            try {
                listInfoArr = (ListInfo[]) doProtocolCommand(new n(str));
            } catch (ProtocolException unused) {
                listInfoArr = null;
            }
            if (listInfoArr == null) {
                return false;
            }
            return listInfoArr[i(listInfoArr, str)].canOpen;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void keepConnectionAlive(boolean z10) throws Throwable {
        if (this.protocol == null) {
            return;
        }
        if (System.currentTimeMillis() - this.protocol.getTimestamp() > 1000) {
            r();
            if (this.protocol != null) {
                this.protocol.noop();
            }
        }
        if (!z10) {
            return;
        }
        Store store = this.store;
        if (!((IMAPStore) store).f65353c1.f65364e) {
            return;
        }
        IMAPProtocol iMAPProtocol = null;
        try {
            IMAPStore iMAPStore = (IMAPStore) store;
            IMAPProtocol iMAPProtocolR = iMAPStore.r();
            iMAPProtocolR.removeResponseHandler(iMAPStore);
            iMAPProtocolR.addResponseHandler(iMAPStore.f65354d1);
            try {
                if (System.currentTimeMillis() - iMAPProtocolR.getTimestamp() > 1000) {
                    iMAPProtocolR.noop();
                }
                ((IMAPStore) this.store).y(iMAPProtocolR);
            } catch (Throwable th2) {
                th = th2;
                iMAPProtocol = iMAPProtocolR;
                ((IMAPStore) this.store).y(iMAPProtocol);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Status l() throws Throwable {
        int i10 = ((IMAPStore) this.store).f65356w0;
        if (i10 > 0 && this.L0 != null && System.currentTimeMillis() - this.M0 < i10) {
            return this.L0;
        }
        IMAPProtocol iMAPProtocol = null;
        try {
            IMAPProtocol storeProtocol = getStoreProtocol();
            try {
                Status status = storeProtocol.status(this.fullName, null);
                if (i10 > 0) {
                    this.L0 = status;
                    this.M0 = System.currentTimeMillis();
                }
                releaseStoreProtocol(storeProtocol);
                return status;
            } catch (Throwable th2) {
                th = th2;
                iMAPProtocol = storeProtocol;
                releaseStoreProtocol(iMAPProtocol);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // javax.mail.Folder
    public Folder[] list(String str) throws MessagingException {
        return h(str, false);
    }

    public Rights[] listRights(String str) throws MessagingException {
        return (Rights[]) doOptionalCommand("ACL not supported", new g(str));
    }

    @Override // javax.mail.Folder
    public Folder[] listSubscribed(String str) throws MessagingException {
        return h(str, true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    public final boolean m(boolean z10) throws MessagingException {
        while (true) {
            Response idleResponse = this.protocol.readIdleResponse();
            try {
                synchronized (this.messageCacheLock) {
                    try {
                        if (idleResponse.isBYE() && idleResponse.isSynthetic() && this.f65276w0 == 1) {
                            Exception exception = idleResponse.getException();
                            if (!(exception instanceof InterruptedIOException) || ((InterruptedIOException) exception).bytesTransferred != 0) {
                                if (this.protocol == null) {
                                    break;
                                }
                                break;
                                break;
                            }
                            if (exception instanceof SocketTimeoutException) {
                                this.logger.finest("handleIdle: ignoring socket timeout");
                                idleResponse = null;
                            } else {
                                this.logger.finest("handleIdle: interrupting IDLE");
                                IdleManager idleManager = this.f65277x0;
                                if (idleManager != null) {
                                    this.logger.finest("handleIdle: request IdleManager to abort");
                                    idleManager.f65378g.add(this);
                                    idleManager.f65373b.wakeup();
                                } else {
                                    this.logger.finest("handleIdle: abort IDLE");
                                    this.protocol.idleAbort();
                                    this.f65276w0 = 2;
                                }
                            }
                        } else {
                            try {
                                if (this.protocol == null || !this.protocol.processIdleResponse(idleResponse)) {
                                    break;
                                }
                                if (z10 && this.f65276w0 == 1) {
                                    try {
                                        this.protocol.idleAbort();
                                    } catch (Exception unused) {
                                    }
                                    this.f65276w0 = 2;
                                }
                            } catch (Throwable th2) {
                                this.logger.finest("handleIdle: set to RUNNING");
                                this.f65276w0 = 0;
                                this.f65277x0 = null;
                                this.messageCacheLock.notifyAll();
                                throw th2;
                            }
                        }
                        if (idleResponse != null && !this.protocol.hasResponse()) {
                            return true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this, e5.getMessage());
            } catch (ProtocolException e7) {
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
        this.logger.finest("handleIdle: set to RUNNING");
        this.f65276w0 = 0;
        this.f65277x0 = null;
        this.messageCacheLock.notifyAll();
        return false;
    }

    public synchronized void moveMessages(Message[] messageArr, Folder folder) throws MessagingException {
        e(messageArr, folder, true);
    }

    public synchronized AppendUID[] moveUIDMessages(Message[] messageArr, Folder folder) throws MessagingException {
        return f(messageArr, folder, true);
    }

    public Rights myRights() throws MessagingException {
        return (Rights) doOptionalCommand("ACL not supported", new h());
    }

    public IMAPMessage newIMAPMessage(int i10) {
        return new IMAPMessage(this, i10);
    }

    public final void o() {
        synchronized (this.messageCacheLock) {
            if (this.f65276w0 == 1 && this.protocol != null) {
                this.protocol.idleAbort();
                this.f65276w0 = 2;
                do {
                    try {
                    } catch (Exception e5) {
                        this.logger.log(Level.FINEST, "Exception in idleAbortWait", (Throwable) e5);
                    }
                } while (m(false));
                this.logger.finest("IDLE aborted");
            }
        }
    }

    @Override // javax.mail.Folder
    public synchronized void open(int i10) throws MessagingException {
        open(i10, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    public final IMAPMessage p(FetchResponse fetchResponse) {
        boolean z10;
        IMAPMessage messageBySeqNumber = getMessageBySeqNumber(fetchResponse.getNumber());
        if (messageBySeqNumber == null) {
            return messageBySeqNumber;
        }
        UID uid = (UID) fetchResponse.getItem(UID.class);
        boolean z11 = true;
        if (uid != null) {
            long uid2 = messageBySeqNumber.getUID();
            long j10 = uid.uid;
            if (uid2 != j10) {
                messageBySeqNumber.setUID(j10);
                if (this.uidTable == null) {
                    this.uidTable = new Hashtable<>();
                }
                this.uidTable.put(Long.valueOf(uid.uid), messageBySeqNumber);
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        MODSEQ modseq = (MODSEQ) fetchResponse.getItem(MODSEQ.class);
        if (modseq != null) {
            long j11 = messageBySeqNumber.f65333i;
            long j12 = modseq.modseq;
            if (j11 != j12) {
                messageBySeqNumber.f65333i = j12;
                z10 = true;
            }
        }
        FLAGS flags = (FLAGS) fetchResponse.getItem(FLAGS.class);
        if (flags != null) {
            messageBySeqNumber.g(flags);
        } else {
            z11 = z10;
        }
        messageBySeqNumber.handleExtensionFetchItems(fetchResponse.getExtensionItems());
        if (z11) {
            return messageBySeqNumber;
        }
        return null;
    }

    public final boolean q(IdleManager idleManager) throws MessagingException {
        boolean zBooleanValue;
        IdleManager idleManager2;
        synchronized (this) {
            try {
                checkOpened();
                if (idleManager != null && (idleManager2 = this.f65277x0) != null && idleManager != idleManager2) {
                    throw new MessagingException("Folder already being watched by another IdleManager");
                }
                Boolean bool = (Boolean) doOptionalCommand("IDLE not supported", new i(idleManager));
                this.logger.log(Level.FINEST, "startIdle: return {0}", bool);
                zBooleanValue = bool.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final void r() throws ProtocolException {
        while (true) {
            int i10 = this.f65276w0;
            if (i10 == 0) {
                return;
            }
            if (i10 == 1) {
                IdleManager idleManager = this.f65277x0;
                if (idleManager != null) {
                    this.logger.finest("waitIfIdle: request IdleManager to abort");
                    idleManager.f65378g.add(this);
                    idleManager.f65373b.wakeup();
                } else {
                    this.logger.finest("waitIfIdle: abort IDLE");
                    this.protocol.idleAbort();
                    this.f65276w0 = 2;
                }
            } else {
                this.logger.log(Level.FINEST, "waitIfIdle: idleState {0}", Integer.valueOf(i10));
            }
            try {
                MailLogger mailLogger = this.logger;
                Level level = Level.FINEST;
                if (mailLogger.isLoggable(level)) {
                    this.logger.finest("waitIfIdle: wait to be not idle: " + Thread.currentThread());
                }
                this.messageCacheLock.wait();
                if (this.logger.isLoggable(level)) {
                    this.logger.finest("waitIfIdle: wait done, idleState " + this.f65276w0 + ": " + Thread.currentThread());
                }
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                throw new ProtocolException("Interrupted waitIfIdle", e5);
            }
        }
    }

    public void releaseProtocol(boolean z10) {
        if (this.protocol != null) {
            this.protocol.removeResponseHandler(this);
            if (z10) {
                ((IMAPStore) this.store).z(this, this.protocol);
            } else {
                this.protocol.disconnect();
                ((IMAPStore) this.store).z(this, null);
            }
            this.protocol = null;
        }
    }

    public synchronized void releaseStoreProtocol(IMAPProtocol iMAPProtocol) {
        try {
            if (iMAPProtocol != this.protocol) {
                ((IMAPStore) this.store).y(iMAPProtocol);
            } else {
                this.logger.fine("releasing our protocol as store protocol?");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void removeACL(String str) throws MessagingException {
        doOptionalCommand("ACL not supported", new f(str));
    }

    public void removeRights(ACL acl) throws MessagingException {
        doOptionalCommand("ACL not supported", new com.sun.mail.imap.a(this, '-', acl));
    }

    @Override // javax.mail.Folder
    public synchronized boolean renameTo(Folder folder) throws MessagingException {
        checkClosed();
        checkExists();
        if (folder.getStore() != this.store) {
            throw new MessagingException("Can't rename across Stores");
        }
        if (doCommandIgnoreFailure(new s(folder)) == null) {
            return false;
        }
        this.exists = false;
        this.attributes = null;
        notifyFolderRenamedListeners(folder);
        return true;
    }

    @Override // javax.mail.Folder
    public synchronized Message[] search(SearchTerm searchTerm) throws MessagingException {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        try {
            try {
                synchronized (this.messageCacheLock) {
                    try {
                        int[] iArrSearch = getProtocol().search(searchTerm);
                        messagesBySeqNumbers = iArrSearch != null ? getMessagesBySeqNumbers(iArrSearch) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (CommandFailedException unused) {
                return super.search(searchTerm);
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this, e5.getMessage());
            }
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        } catch (SearchException e10) {
            if (((IMAPStore) this.store).P0) {
                throw e10;
            }
            return super.search(searchTerm);
        }
        return messagesBySeqNumbers;
    }

    @Override // javax.mail.Folder
    public synchronized void setFlags(Message[] messageArr, Flags flags, boolean z10) throws MessagingException {
        try {
            checkOpened();
            if (this.mode != 2) {
                throw new IllegalStateException("Cannot change flags on READ_ONLY folder: " + this.fullName);
            }
            if (messageArr.length == 0) {
                return;
            }
            synchronized (this.messageCacheLock) {
                try {
                    IMAPProtocol protocol = getProtocol();
                    MessageSet[] messageSetSorted = Utility.toMessageSetSorted(messageArr, null);
                    if (messageSetSorted == null) {
                        throw new MessageRemovedException("Messages have been removed");
                    }
                    protocol.storeFlags(messageSetSorted, flags, z10);
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this, e5.getMessage());
                } catch (ProtocolException e7) {
                    throw new MessagingException(e7.getMessage(), e7);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setQuota(Quota quota) throws MessagingException {
        doOptionalCommand("QUOTA not supported", new d(quota));
    }

    @Override // javax.mail.Folder
    public synchronized void setSubscribed(boolean z10) throws MessagingException {
        doCommandIgnoreFailure(new o(z10));
    }

    public synchronized void throwClosedException(ConnectionException connectionException) throws StoreClosedException, FolderClosedException {
        try {
            if (this.protocol == null || connectionException.getProtocol() != this.protocol) {
                if (this.protocol != null || this.v0) {
                    throw new StoreClosedException(this.store, connectionException.getMessage());
                }
            }
            throw new FolderClosedException(this, connectionException.getMessage());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Message[] expunge(Message[] messageArr) throws MessagingException {
        IMAPMessage[] iMAPMessageArrRemoveExpungedMessages;
        try {
            checkOpened();
            if (messageArr != null) {
                FetchProfile fetchProfile = new FetchProfile();
                fetchProfile.add(UIDFolder.FetchProfileItem.UID);
                fetch(messageArr, fetchProfile);
            }
            synchronized (this.messageCacheLock) {
                try {
                    this.K0 = false;
                    try {
                        try {
                            IMAPProtocol protocol = getProtocol();
                            if (messageArr != null) {
                                protocol.uidexpunge(Utility.toUIDSet(messageArr));
                            } else {
                                protocol.expunge();
                            }
                            this.K0 = true;
                            iMAPMessageArrRemoveExpungedMessages = messageArr != null ? this.messageCache.removeExpungedMessages(messageArr) : this.messageCache.removeExpungedMessages();
                            if (this.uidTable != null) {
                                for (IMAPMessage iMAPMessage : iMAPMessageArrRemoveExpungedMessages) {
                                    long uid = iMAPMessage.getUID();
                                    if (uid != -1) {
                                        this.uidTable.remove(Long.valueOf(uid));
                                    }
                                }
                            }
                            this.f65278y0 = this.messageCache.size();
                        } catch (CommandFailedException e5) {
                            if (this.mode == 2) {
                                throw new MessagingException(e5.getMessage(), e5);
                            }
                            throw new IllegalStateException("Cannot expunge READ_ONLY folder: " + this.fullName);
                        } catch (ConnectionException e7) {
                            throw new FolderClosedException(this, e7.getMessage());
                        } catch (ProtocolException e10) {
                            throw new MessagingException(e10.getMessage(), e10);
                        }
                    } catch (Throwable th2) {
                        this.K0 = true;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (iMAPMessageArrRemoveExpungedMessages.length > 0) {
                notifyMessageRemovedListeners(true, iMAPMessageArrRemoveExpungedMessages);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return iMAPMessageArrRemoveExpungedMessages;
    }

    public synchronized Message[] getSortedMessages(SortTerm[] sortTermArr, SearchTerm searchTerm) throws MessagingException {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        try {
            try {
                synchronized (this.messageCacheLock) {
                    try {
                        int[] iArrSort = getProtocol().sort(sortTermArr, searchTerm);
                        messagesBySeqNumbers = iArrSort != null ? getMessagesBySeqNumbers(iArrSort) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (CommandFailedException e5) {
                throw new MessagingException(e5.getMessage(), e5);
            } catch (ConnectionException e7) {
                throw new FolderClosedException(this, e7.getMessage());
            }
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        } catch (SearchException e11) {
            throw new MessagingException(e11.getMessage(), e11);
        }
        return messagesBySeqNumbers;
    }

    public void idle(boolean z10) throws MessagingException {
        synchronized (this) {
            try {
                if (this.protocol != null && this.protocol.getChannel() != null) {
                    throw new MessagingException("idle method not supported with SocketChannels");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (q(null)) {
            while (m(z10)) {
            }
            int i10 = ((IMAPStore) this.store).f65358y0;
            if (i10 > 0) {
                try {
                    Thread.sleep(i10);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[Catch: all -> 0x0045, ProtocolException -> 0x0048, CommandFailedException -> 0x004b, TryCatch #11 {CommandFailedException -> 0x004b, ProtocolException -> 0x0048, blocks: (B:8:0x001b, B:10:0x001f, B:12:0x0029, B:14:0x0033, B:16:0x003d, B:23:0x004e, B:24:0x0056, B:26:0x0060, B:28:0x0069, B:29:0x0072), top: B:123:0x001b, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: all -> 0x0045, ProtocolException -> 0x0048, CommandFailedException -> 0x004b, TRY_LEAVE, TryCatch #11 {CommandFailedException -> 0x004b, ProtocolException -> 0x0048, blocks: (B:8:0x001b, B:10:0x001f, B:12:0x0029, B:14:0x0033, B:16:0x003d, B:23:0x004e, B:24:0x0056, B:26:0x0060, B:28:0x0069, B:29:0x0072), top: B:123:0x001b, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[Catch: all -> 0x0045, TryCatch #4 {all -> 0x0045, blocks: (B:5:0x0011, B:8:0x001b, B:10:0x001f, B:12:0x0029, B:14:0x0033, B:16:0x003d, B:23:0x004e, B:24:0x0056, B:26:0x0060, B:28:0x0069, B:30:0x007a, B:35:0x0083, B:38:0x008e, B:55:0x00c3, B:54:0x00c0, B:56:0x00c4, B:58:0x00ff, B:59:0x010a, B:61:0x0110, B:63:0x011e, B:65:0x0124, B:67:0x0127, B:70:0x0132, B:72:0x0142, B:74:0x0145, B:75:0x014e, B:77:0x0156, B:79:0x015e, B:81:0x0168, B:29:0x0072, B:94:0x018b, B:95:0x018e, B:104:0x01ab, B:105:0x01b4, B:87:0x0176, B:92:0x0189, B:91:0x0186, B:39:0x0095, B:50:0x00b7, B:52:0x00bc, B:53:0x00bf, B:96:0x018f, B:98:0x0197, B:99:0x019e, B:102:0x01a1, B:103:0x01aa), top: B:115:0x0011, outer: #2, inners: #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0110 A[Catch: all -> 0x0045, TryCatch #4 {all -> 0x0045, blocks: (B:5:0x0011, B:8:0x001b, B:10:0x001f, B:12:0x0029, B:14:0x0033, B:16:0x003d, B:23:0x004e, B:24:0x0056, B:26:0x0060, B:28:0x0069, B:30:0x007a, B:35:0x0083, B:38:0x008e, B:55:0x00c3, B:54:0x00c0, B:56:0x00c4, B:58:0x00ff, B:59:0x010a, B:61:0x0110, B:63:0x011e, B:65:0x0124, B:67:0x0127, B:70:0x0132, B:72:0x0142, B:74:0x0145, B:75:0x014e, B:77:0x0156, B:79:0x015e, B:81:0x0168, B:29:0x0072, B:94:0x018b, B:95:0x018e, B:104:0x01ab, B:105:0x01b4, B:87:0x0176, B:92:0x0189, B:91:0x0186, B:39:0x0095, B:50:0x00b7, B:52:0x00bc, B:53:0x00bf, B:96:0x018f, B:98:0x0197, B:99:0x019e, B:102:0x01a1, B:103:0x01aa), top: B:115:0x0011, outer: #2, inners: #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0167  */
    public synchronized List<MailEvent> open(int i10, ResyncData resyncData) throws MessagingException {
        MailboxInfo mailboxInfoSelect;
        int i11;
        ArrayList arrayList;
        String[] atomStringList;
        long[] array;
        IMAPMessage iMAPMessageP;
        ReadOnlyFolderException readOnlyFolderException;
        checkClosed();
        this.protocol = ((IMAPStore) this.store).p(this);
        synchronized (this.messageCacheLock) {
            try {
                this.protocol.addResponseHandler(this);
                if (resyncData != null) {
                    try {
                        if (resyncData == ResyncData.CONDSTORE) {
                            if (!this.protocol.isEnabled("CONDSTORE") && !this.protocol.isEnabled("QRESYNC")) {
                                if (this.protocol.hasCapability("CONDSTORE")) {
                                    this.protocol.enable("CONDSTORE");
                                } else {
                                    this.protocol.enable("QRESYNC");
                                }
                            }
                        } else if (!this.protocol.isEnabled("QRESYNC")) {
                            this.protocol.enable("QRESYNC");
                        }
                        if (i10 == 1) {
                            mailboxInfoSelect = this.protocol.examine(this.fullName, resyncData);
                        } else {
                            mailboxInfoSelect = this.protocol.select(this.fullName, resyncData);
                        }
                        i11 = mailboxInfoSelect.mode;
                        if (i11 != i10 && (i10 != 2 || i11 != 1 || !((IMAPStore) this.store).b())) {
                            readOnlyFolderException = new ReadOnlyFolderException(this, "Cannot open in desired mode");
                            try {
                                try {
                                    this.protocol.close();
                                    releaseProtocol(true);
                                    throw readOnlyFolderException;
                                } catch (ProtocolException e5) {
                                    try {
                                        MessagingException messagingException = new MessagingException(e5.getMessage(), e5);
                                        try {
                                            this.protocol.logout();
                                        } catch (Throwable th2) {
                                            b(messagingException, th2);
                                        }
                                        b(readOnlyFolderException, messagingException);
                                        releaseProtocol(false);
                                        throw readOnlyFolderException;
                                    } catch (Throwable th3) {
                                        releaseProtocol(false);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                b(readOnlyFolderException, th4);
                                throw readOnlyFolderException;
                            }
                        }
                        this.f65275u0 = true;
                        this.v0 = false;
                        this.mode = mailboxInfoSelect.mode;
                        this.availableFlags = mailboxInfoSelect.availableFlags;
                        this.permanentFlags = mailboxInfoSelect.permanentFlags;
                        int i12 = mailboxInfoSelect.total;
                        this.F0 = i12;
                        this.f65278y0 = i12;
                        this.E0 = mailboxInfoSelect.recent;
                        this.G0 = mailboxInfoSelect.uidvalidity;
                        this.H0 = mailboxInfoSelect.uidnext;
                        this.I0 = mailboxInfoSelect.uidNotSticky;
                        this.J0 = mailboxInfoSelect.highestmodseq;
                        this.messageCache = new MessageCache(this, (IMAPStore) this.store, this.f65278y0);
                        if (mailboxInfoSelect.responses != null) {
                            arrayList = new ArrayList();
                            for (IMAPResponse iMAPResponse : mailboxInfoSelect.responses) {
                                if (iMAPResponse.keyEquals("VANISHED")) {
                                    atomStringList = iMAPResponse.readAtomStringList();
                                    if (atomStringList != null && atomStringList.length == 1 && atomStringList[0].equalsIgnoreCase("EARLIER") && (array = UIDSet.toArray(UIDSet.parseUIDSets(iMAPResponse.readAtom()), this.H0)) != null && array.length > 0) {
                                        arrayList.add(new MessageVanishedEvent(this, array));
                                    }
                                } else if (!iMAPResponse.keyEquals("FETCH") && (iMAPMessageP = p((FetchResponse) iMAPResponse)) != null) {
                                    arrayList.add(new MessageChangedEvent(this, 1, iMAPMessageP));
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } catch (CommandFailedException e7) {
                        try {
                            checkExists();
                            if ((this.type & 1) == 0) {
                                throw new MessagingException("folder cannot contain messages");
                            }
                            throw new MessagingException(e7.getMessage(), e7);
                        } catch (Throwable th5) {
                            this.exists = false;
                            this.attributes = null;
                            this.type = 0;
                            releaseProtocol(true);
                            throw th5;
                        }
                    } catch (ProtocolException e10) {
                        try {
                            MessagingException messagingException2 = new MessagingException(e10.getMessage(), e10);
                            try {
                                this.protocol.logout();
                                throw messagingException2;
                            } catch (Throwable th6) {
                                b(messagingException2, th6);
                                throw messagingException2;
                            }
                        } catch (Throwable th7) {
                            releaseProtocol(false);
                            throw th7;
                        }
                    }
                } else {
                    if (i10 == 1) {
                        mailboxInfoSelect = this.protocol.examine(this.fullName, resyncData);
                    } else {
                        mailboxInfoSelect = this.protocol.select(this.fullName, resyncData);
                    }
                    i11 = mailboxInfoSelect.mode;
                    if (i11 != i10) {
                        readOnlyFolderException = new ReadOnlyFolderException(this, "Cannot open in desired mode");
                        this.protocol.close();
                        releaseProtocol(true);
                        throw readOnlyFolderException;
                    }
                    this.f65275u0 = true;
                    this.v0 = false;
                    this.mode = mailboxInfoSelect.mode;
                    this.availableFlags = mailboxInfoSelect.availableFlags;
                    this.permanentFlags = mailboxInfoSelect.permanentFlags;
                    int i13 = mailboxInfoSelect.total;
                    this.F0 = i13;
                    this.f65278y0 = i13;
                    this.E0 = mailboxInfoSelect.recent;
                    this.G0 = mailboxInfoSelect.uidvalidity;
                    this.H0 = mailboxInfoSelect.uidnext;
                    this.I0 = mailboxInfoSelect.uidNotSticky;
                    this.J0 = mailboxInfoSelect.highestmodseq;
                    this.messageCache = new MessageCache(this, (IMAPStore) this.store, this.f65278y0);
                    if (mailboxInfoSelect.responses != null) {
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            if (iMAPResponse.keyEquals("VANISHED")) {
                                atomStringList = iMAPResponse.readAtomStringList();
                                if (atomStringList != null) {
                                    arrayList.add(new MessageVanishedEvent(this, array));
                                }
                            } else if (!iMAPResponse.keyEquals("FETCH")) {
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
            } catch (Throwable th8) {
                throw th8;
            }
            throw th;
        }
        this.exists = true;
        this.attributes = null;
        this.type = 1;
        notifyConnectionListeners(1);
        return arrayList;
    }

    @Override // javax.mail.Folder
    public synchronized Message[] search(SearchTerm searchTerm, Message[] messageArr) throws MessagingException {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        if (messageArr.length == 0) {
            return messageArr;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this.messageCacheLock) {
                            try {
                                IMAPProtocol protocol = getProtocol();
                                MessageSet[] messageSetSorted = Utility.toMessageSetSorted(messageArr, null);
                                if (messageSetSorted != null) {
                                    int[] iArrSearch = protocol.search(messageSetSorted, searchTerm);
                                    messagesBySeqNumbers = iArrSearch != null ? getMessagesBySeqNumbers(iArrSearch) : null;
                                } else {
                                    throw new MessageRemovedException("Messages have been removed");
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return messagesBySeqNumbers;
                    } catch (ConnectionException e5) {
                        throw new FolderClosedException(this, e5.getMessage());
                    }
                } catch (SearchException unused) {
                    return super.search(searchTerm, messageArr);
                }
            } catch (ProtocolException e7) {
                throw new MessagingException(e7.getMessage(), e7);
            }
        } catch (CommandFailedException unused2) {
            return super.search(searchTerm, messageArr);
        }
    }

    @Override // javax.mail.UIDFolder
    public synchronized Message[] getMessagesByUID(long[] jArr) throws MessagingException {
        long[] jArr2;
        Message[] messageArr;
        checkOpened();
        try {
            synchronized (this.messageCacheLock) {
                try {
                    if (this.uidTable != null) {
                        ArrayList arrayList = new ArrayList();
                        for (long j10 : jArr) {
                            if (!this.uidTable.containsKey(Long.valueOf(j10))) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                        int size = arrayList.size();
                        jArr2 = new long[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            jArr2[i10] = ((Long) arrayList.get(i10)).longValue();
                        }
                    } else {
                        this.uidTable = new Hashtable<>();
                        jArr2 = jArr;
                    }
                    if (jArr2.length > 0) {
                        getProtocol().fetchSequenceNumbers(jArr2);
                    }
                    messageArr = new Message[jArr.length];
                    for (int i11 = 0; i11 < jArr.length; i11++) {
                        messageArr[i11] = this.uidTable.get(Long.valueOf(jArr[i11]));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (ConnectionException e5) {
            throw new FolderClosedException(this, e5.getMessage());
        } catch (ProtocolException e7) {
            throw new MessagingException(e7.getMessage(), e7);
        }
        return messageArr;
    }

    @Override // javax.mail.Folder
    public synchronized void setFlags(int i10, int i11, Flags flags, boolean z10) throws MessagingException {
        try {
            checkOpened();
            Message[] messageArr = new Message[(i11 - i10) + 1];
            int i12 = 0;
            while (i10 <= i11) {
                messageArr[i12] = getMessage(i10);
                i10++;
                i12++;
            }
            setFlags(messageArr, flags, z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // javax.mail.Folder
    public synchronized void setFlags(int[] iArr, Flags flags, boolean z10) throws MessagingException {
        try {
            checkOpened();
            Message[] messageArr = new Message[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                messageArr[i10] = getMessage(iArr[i10]);
            }
            setFlags(messageArr, flags, z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public IMAPFolder(ListInfo listInfo, IMAPStore iMAPStore) {
        this(listInfo.name, listInfo.separator, iMAPStore, null);
        if (listInfo.hasInferiors) {
            this.type |= 2;
        }
        if (listInfo.canOpen) {
            this.type |= 1;
        }
        this.exists = true;
        this.attributes = listInfo.attrs;
    }
}
