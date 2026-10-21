package com.sun.mail.pop3;

import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.FolderNotFoundException;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;
import javax.mail.UIDFolder;
import si.b;
import si.d;
import si.e;

/* JADX INFO: loaded from: classes9.dex */
public class POP3Folder extends Folder {
    public final boolean E0;
    public volatile boolean F0;
    public POP3Message[] G0;
    public boolean H0;
    public volatile e I0;
    public boolean J0;
    public final MailLogger K0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f65461u0;
    public final POP3Store v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile b f65462w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f65463x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f65464y0;

    public POP3Folder(POP3Store pOP3Store, String str) {
        super(pOP3Store);
        this.E0 = false;
        this.F0 = false;
        this.H0 = false;
        this.I0 = null;
        this.f65461u0 = str;
        this.v0 = pOP3Store;
        if (str.equalsIgnoreCase("INBOX")) {
            this.E0 = true;
        }
        this.K0 = new MailLogger(getClass(), "DEBUG POP3", pOP3Store.l().getDebug(), pOP3Store.l().getDebugOut());
    }

    @Override // javax.mail.Folder
    public void appendMessages(Message[] messageArr) throws MessagingException {
        throw new MethodNotSupportedException("Append not supported");
    }

    public final void b() throws IllegalStateException {
        if (!this.F0) {
            throw new IllegalStateException("Folder is not Open");
        }
    }

    @Override // javax.mail.Folder
    public synchronized void close(boolean z10) throws MessagingException {
        try {
            b();
            try {
                try {
                    if (this.v0.O0 && !this.J0) {
                        this.f65462w0.w();
                    }
                    if (z10 && this.mode == 2 && !this.J0) {
                        int i10 = 0;
                        while (true) {
                            POP3Message[] pOP3MessageArr = this.G0;
                            if (i10 >= pOP3MessageArr.length) {
                                break;
                            }
                            POP3Message pOP3Message = pOP3MessageArr[i10];
                            if (pOP3Message != null && pOP3Message.isSet(Flags.Flag.DELETED)) {
                                try {
                                    this.f65462w0.d(i10 + 1);
                                } catch (IOException e5) {
                                    throw new MessagingException("Exception deleting messages during close", e5);
                                }
                            }
                            i10++;
                        }
                    }
                    int i11 = 0;
                    while (true) {
                        POP3Message[] pOP3MessageArr2 = this.G0;
                        if (i11 >= pOP3MessageArr2.length) {
                            break;
                        }
                        POP3Message pOP3Message2 = pOP3MessageArr2[i11];
                        if (pOP3Message2 != null) {
                            pOP3Message2.invalidate(true);
                        }
                        i11++;
                    }
                    if (this.J0) {
                        this.f65462w0.c();
                    } else {
                        this.f65462w0.q();
                    }
                    this.f65462w0 = null;
                    this.v0.c(this);
                    this.G0 = null;
                    this.F0 = false;
                    notifyConnectionListeners(3);
                    if (this.I0 != null) {
                        this.I0.a();
                        this.I0 = null;
                    }
                } catch (Throwable th2) {
                    this.f65462w0 = null;
                    this.v0.c(this);
                    this.G0 = null;
                    this.F0 = false;
                    notifyConnectionListeners(3);
                    if (this.I0 != null) {
                        this.I0.a();
                        this.I0 = null;
                    }
                    throw th2;
                }
            } catch (IOException unused) {
                this.f65462w0 = null;
                this.v0.c(this);
                this.G0 = null;
                this.F0 = false;
                notifyConnectionListeners(3);
                if (this.I0 != null) {
                    this.I0.a();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // javax.mail.Folder
    public boolean create(int i10) throws MessagingException {
        return false;
    }

    public POP3Message createMessage(Folder folder, int i10) throws MessagingException {
        POP3Message pOP3Message;
        Constructor<?> constructor = this.v0.N0;
        if (constructor != null) {
            try {
                pOP3Message = (POP3Message) constructor.newInstance(this, Integer.valueOf(i10));
            } catch (Exception unused) {
                pOP3Message = null;
            }
        } else {
            pOP3Message = null;
        }
        return pOP3Message == null ? new POP3Message(this, i10) : pOP3Message;
    }

    @Override // javax.mail.Folder
    public boolean delete(boolean z10) throws MessagingException {
        throw new MethodNotSupportedException("delete");
    }

    @Override // javax.mail.Folder
    public boolean exists() {
        return this.E0;
    }

    @Override // javax.mail.Folder
    public Message[] expunge() throws MessagingException {
        throw new MethodNotSupportedException("Expunge not supported");
    }

    @Override // javax.mail.Folder
    public synchronized void fetch(Message[] messageArr, FetchProfile fetchProfile) throws MessagingException {
        int i10;
        try {
            if (!this.F0 || ((i10 = this.mode) != 1 && i10 != 2)) {
                throw new IllegalStateException("Folder is not Readable");
            }
            if (!this.H0 && this.v0.R0 && fetchProfile.contains(UIDFolder.FetchProfileItem.UID)) {
                int length = this.G0.length;
                String[] strArr = new String[length];
                try {
                    if (!this.f65462w0.D(strArr)) {
                        return;
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        if (strArr[i11] != null) {
                            ((POP3Message) getMessage(i11 + 1)).f65468h = strArr[i11];
                        }
                    }
                    this.H0 = true;
                } catch (EOFException e5) {
                    close(false);
                    throw new FolderClosedException(this, e5.toString());
                } catch (IOException e7) {
                    throw new MessagingException("error getting UIDL", e7);
                }
            }
            if (fetchProfile.contains(FetchProfile.Item.ENVELOPE)) {
                for (Message message : messageArr) {
                    try {
                        POP3Message pOP3Message = (POP3Message) message;
                        pOP3Message.getHeader("");
                        pOP3Message.getSize();
                    } catch (MessageRemovedException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // javax.mail.Folder
    public void finalize() throws Throwable {
        this.J0 = !this.v0.W0;
        try {
            if (this.F0) {
                close(false);
            }
        } finally {
            super.finalize();
            this.J0 = false;
        }
    }

    @Override // javax.mail.Folder
    public Folder getFolder(String str) throws MessagingException {
        throw new MessagingException("not a directory");
    }

    @Override // javax.mail.Folder
    public String getFullName() {
        return this.f65461u0;
    }

    @Override // javax.mail.Folder
    public synchronized Message getMessage(int i10) throws MessagingException {
        POP3Message pOP3MessageCreateMessage;
        b();
        int i11 = i10 - 1;
        pOP3MessageCreateMessage = this.G0[i11];
        if (pOP3MessageCreateMessage == null) {
            pOP3MessageCreateMessage = createMessage(this, i10);
            this.G0[i11] = pOP3MessageCreateMessage;
        }
        return pOP3MessageCreateMessage;
    }

    @Override // javax.mail.Folder
    public synchronized int getMessageCount() throws MessagingException {
        int i10;
        if (!this.F0) {
            return -1;
        }
        if (this.F0 && ((i10 = this.mode) == 1 || i10 == 2)) {
            return this.f65463x0;
        }
        throw new IllegalStateException("Folder is not Readable");
    }

    @Override // javax.mail.Folder
    public String getName() {
        return this.f65461u0;
    }

    @Override // javax.mail.Folder
    public Folder getParent() {
        return new DefaultFolder(this.v0);
    }

    @Override // javax.mail.Folder
    public Flags getPermanentFlags() {
        return new Flags();
    }

    @Override // javax.mail.Folder
    public char getSeparator() {
        return (char) 0;
    }

    public synchronized int getSize() throws MessagingException {
        b();
        return this.f65464y0;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0047 A[EXC_TOP_SPLITTER, PHI: r2
      0x0047: PHI (r2v4 java.io.InputStream) = (r2v3 java.io.InputStream), (r2v6 java.io.InputStream) binds: [B:37:0x0062, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public synchronized int[] getSizes() throws MessagingException {
        int[] iArr;
        InputStream inputStreamM;
        b();
        iArr = new int[this.f65463x0];
        LineInputStream lineInputStream = null;
        try {
            inputStreamM = this.f65462w0.m();
            try {
                LineInputStream lineInputStream2 = new LineInputStream(inputStreamM);
                while (true) {
                    try {
                        String line = lineInputStream2.readLine();
                        if (line != null) {
                            try {
                                StringTokenizer stringTokenizer = new StringTokenizer(line);
                                int i10 = Integer.parseInt(stringTokenizer.nextToken());
                                int i11 = Integer.parseInt(stringTokenizer.nextToken());
                                if (i10 > 0 && i10 <= this.f65463x0) {
                                    iArr[i10 - 1] = i11;
                                }
                            } catch (RuntimeException unused) {
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (IOException unused3) {
                        lineInputStream = lineInputStream2;
                        if (lineInputStream != null) {
                            try {
                                lineInputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (inputStreamM != null) {
                            try {
                                inputStreamM.close();
                            } catch (IOException unused5) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        lineInputStream = lineInputStream2;
                        if (lineInputStream != null) {
                            try {
                                lineInputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        if (inputStreamM == null) {
                            throw th;
                        }
                        try {
                            inputStreamM.close();
                            throw th;
                        } catch (IOException unused7) {
                            throw th;
                        }
                    }
                }
                lineInputStream2.close();
                if (inputStreamM != null) {
                    inputStreamM.close();
                }
            } catch (IOException unused8) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused9) {
            inputStreamM = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamM = null;
        }
        return iArr;
    }

    @Override // javax.mail.Folder
    public int getType() {
        return 1;
    }

    public synchronized String getUID(Message message) throws MessagingException {
        try {
            b();
            if (!(message instanceof POP3Message)) {
                throw new MessagingException("message is not a POP3Message");
            }
            POP3Message pOP3Message = (POP3Message) message;
            try {
                if (!this.v0.R0) {
                    return null;
                }
                if (pOP3Message.f65468h == "UNKNOWN") {
                    pOP3Message.f65468h = this.f65462w0.C(pOP3Message.getMessageNumber());
                }
                return pOP3Message.f65468h;
            } catch (EOFException e5) {
                close(false);
                throw new FolderClosedException(this, e5.toString());
            } catch (IOException e7) {
                throw new MessagingException("error getting UIDL", e7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // javax.mail.Folder
    public boolean hasNewMessages() throws MessagingException {
        return false;
    }

    @Override // javax.mail.Folder
    public synchronized boolean isOpen() {
        if (!this.F0) {
            return false;
        }
        try {
            try {
                if (this.f65462w0.p()) {
                    return true;
                }
                throw new IOException("NOOP failed");
            } catch (MessagingException unused) {
            }
        } catch (IOException unused2) {
            close(false);
            return false;
        }
        return false;
    }

    @Override // javax.mail.Folder
    public Folder[] list(String str) throws MessagingException {
        throw new MessagingException("not a directory");
    }

    public synchronized InputStream listCommand() throws MessagingException, IOException {
        b();
        return this.f65462w0.m();
    }

    @Override // javax.mail.Folder
    public void notifyMessageChangedListeners(int i10, Message message) {
        super.notifyMessageChangedListeners(i10, message);
    }

    @Override // javax.mail.Folder
    public synchronized void open(int i10) throws MessagingException {
        POP3Store pOP3Store;
        if (this.F0) {
            throw new IllegalStateException("Folder is Open");
        }
        if (!this.E0) {
            throw new FolderNotFoundException(this, "folder is not INBOX");
        }
        try {
            this.f65462w0 = this.v0.e(this);
            d dVarZ = this.f65462w0.z();
            this.f65463x0 = dVarZ.f93218a;
            this.f65464y0 = dVarZ.f93219b;
            this.mode = i10;
            if (this.v0.T0) {
                try {
                    this.I0 = new e(this.v0.U0);
                } catch (IOException e5) {
                    this.K0.log(Level.FINE, "failed to create file cache", (Throwable) e5);
                    throw e5;
                }
            }
            this.F0 = true;
            this.G0 = new POP3Message[this.f65463x0];
            this.H0 = false;
            notifyConnectionListeners(1);
        } catch (IOException e7) {
            try {
                try {
                    if (this.f65462w0 != null) {
                        this.f65462w0.q();
                    }
                    this.f65462w0 = null;
                    pOP3Store = this.v0;
                } catch (IOException unused) {
                    this.f65462w0 = null;
                    pOP3Store = this.v0;
                }
                pOP3Store.c(this);
                throw new MessagingException("Open failed", e7);
            } catch (Throwable th2) {
                this.f65462w0 = null;
                this.v0.c(this);
                throw th2;
            }
        }
    }

    @Override // javax.mail.Folder
    public boolean renameTo(Folder folder) throws MessagingException {
        throw new MethodNotSupportedException("renameTo");
    }
}
