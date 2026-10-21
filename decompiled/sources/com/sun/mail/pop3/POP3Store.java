package com.sun.mail.pop3;

import androidx.collection.f;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import javax.mail.AuthenticationFailedException;
import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;
import mx.openpay.library.domain.util.Constant;
import si.b;

/* JADX INFO: loaded from: classes9.dex */
public class POP3Store extends Store {
    public String E0;
    public int F0;
    public String G0;
    public String H0;
    public final boolean I0;
    public final boolean J0;
    public boolean K0;
    public Map<String, String> L0;
    public final MailLogger M0;
    public volatile Constructor<?> N0;
    public volatile boolean O0;
    public volatile boolean P0;
    public volatile boolean Q0;
    public volatile boolean R0;
    public volatile boolean S0;
    public volatile boolean T0;
    public volatile File U0;
    public volatile boolean V0;
    public volatile boolean W0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f65470u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f65471w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public b f65472x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public POP3Folder f65473y0;

    public POP3Store(Session session, URLName uRLName) {
        this(session, uRLName, "pop3", false);
    }

    public static void a(b bVar, EOFException eOFException) {
        try {
            bVar.q();
        } catch (Throwable th2) {
            if ((th2 instanceof Exception) || (th2 instanceof LinkageError)) {
                eOFException.addSuppressed(th2);
                return;
            }
            th2.addSuppressed(eOFException);
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (!(th2 instanceof RuntimeException)) {
                throw new RuntimeException("unexpected exception", th2);
            }
            throw ((RuntimeException) th2);
        }
    }

    public final synchronized void b(boolean z10) throws MessagingException {
        try {
            try {
                try {
                    b bVar = this.f65472x0;
                    if (bVar != null) {
                        if (z10) {
                            bVar.c();
                        } else {
                            bVar.q();
                        }
                    }
                    this.f65472x0 = null;
                } catch (IOException unused) {
                    this.f65472x0 = null;
                }
                super.close();
            } catch (Throwable th2) {
                this.f65472x0 = null;
                super.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c(POP3Folder pOP3Folder) {
        if (this.f65473y0 == pOP3Folder) {
            this.f65472x0 = null;
            this.f65473y0 = null;
        }
    }

    public Map<String, String> capabilities() throws MessagingException {
        Map<String, String> map;
        synchronized (this) {
            map = this.L0;
        }
        return map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
    }

    @Override // javax.mail.Service, java.lang.AutoCloseable
    public synchronized void close() throws MessagingException {
        b(false);
    }

    public final synchronized boolean d(String str) {
        boolean booleanProperty;
        String str2 = "mail." + this.f65470u0 + Constant.DOT_STRING + str;
        booleanProperty = PropUtil.getBooleanProperty(this.session.getProperties(), str2, false);
        if (this.M0.isLoggable(Level.CONFIG)) {
            this.M0.config(str2 + ": " + booleanProperty);
        }
        return booleanProperty;
    }

    public final synchronized b e(POP3Folder pOP3Folder) throws IOException {
        Map<String, String> map;
        b bVar = this.f65472x0;
        if (bVar != null && this.f65473y0 == null) {
            this.f65473y0 = pOP3Folder;
            return bVar;
        }
        String str = this.E0;
        int i10 = this.F0;
        MailLogger mailLogger = this.M0;
        b bVar2 = new b(str, i10, this.session.getProperties(), "mail." + this.f65470u0, this.f65471w0, mailLogger);
        if (this.I0 || this.J0) {
            if (bVar2.h("STLS")) {
                if (bVar2.A()) {
                    bVar2.x(bVar2.a());
                } else if (this.J0) {
                    this.M0.fine("STLS required but failed");
                    EOFException eOFException = new EOFException("STLS required but failed");
                    a(bVar2, eOFException);
                    throw eOFException;
                }
            } else if (this.J0) {
                this.M0.fine("STLS required but not supported");
                EOFException eOFException2 = new EOFException("STLS required but not supported");
                a(bVar2, eOFException2);
                throw eOFException2;
            }
        }
        this.L0 = bVar2.f();
        this.K0 = bVar2.j();
        boolean z10 = true;
        if (!this.P0 && (map = this.L0) != null && !map.containsKey("TOP")) {
            this.P0 = true;
            this.M0.fine("server doesn't support TOP, disabling it");
        }
        Map<String, String> map2 = this.L0;
        if (map2 != null && !map2.containsKey("UIDL")) {
            z10 = false;
        }
        this.R0 = z10;
        String strN = bVar2.n(this.G0, this.H0);
        if (strN != null) {
            EOFException eOFException3 = new EOFException(strN);
            a(bVar2, eOFException3);
            throw eOFException3;
        }
        if (this.f65472x0 == null && pOP3Folder != null) {
            this.f65472x0 = bVar2;
            this.f65473y0 = pOP3Folder;
        }
        if (this.f65473y0 == null) {
            this.f65473y0 = pOP3Folder;
        }
        return bVar2;
    }

    @Override // javax.mail.Service
    public void finalize() throws Throwable {
        try {
            if (this.f65472x0 != null) {
                b(!this.W0);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // javax.mail.Store
    public Folder getDefaultFolder() throws MessagingException {
        if (super.isConnected()) {
            return new DefaultFolder(this);
        }
        throw new MessagingException("Not connected");
    }

    @Override // javax.mail.Store
    public Folder getFolder(String str) throws MessagingException {
        if (super.isConnected()) {
            return new POP3Folder(this, str);
        }
        throw new MessagingException("Not connected");
    }

    @Override // javax.mail.Service
    public synchronized boolean isConnected() {
        try {
            if (!super.isConnected()) {
                return false;
            }
            try {
                try {
                    b bVar = this.f65472x0;
                    if (bVar == null) {
                        this.f65472x0 = e(null);
                    } else if (!bVar.p()) {
                        throw new IOException("NOOP failed");
                    }
                    return true;
                } catch (IOException unused) {
                    super.close();
                    return false;
                }
            } catch (MessagingException unused2) {
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isSSL() {
        return this.K0;
    }

    public final synchronized Session l() {
        return this.session;
    }

    @Override // javax.mail.Service
    public synchronized boolean protocolConnect(String str, int i10, String str2, String str3) throws MessagingException {
        if (str == null || str3 == null || str2 == null) {
            return false;
        }
        if (i10 == -1) {
            try {
                i10 = PropUtil.getIntProperty(this.session.getProperties(), "mail." + this.f65470u0 + ".port", -1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 == -1) {
            i10 = this.v0;
        }
        this.E0 = str;
        this.F0 = i10;
        this.G0 = str2;
        this.H0 = str3;
        try {
            try {
                this.f65472x0 = e(null);
                return true;
            } catch (SocketConnectException e5) {
                throw new MailConnectException(e5);
            }
        } catch (EOFException e7) {
            throw new AuthenticationFailedException(e7.getMessage());
        } catch (IOException e10) {
            throw new MessagingException("Connect failed", e10);
        }
    }

    public POP3Store(Session session, URLName uRLName, String str, boolean z10) {
        Class<?> cls;
        super(session, uRLName);
        this.f65470u0 = "pop3";
        this.v0 = 110;
        this.f65471w0 = false;
        this.f65472x0 = null;
        this.f65473y0 = null;
        this.E0 = null;
        this.F0 = -1;
        this.G0 = null;
        this.H0 = null;
        this.I0 = false;
        this.J0 = false;
        this.K0 = false;
        this.N0 = null;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = true;
        this.S0 = false;
        this.T0 = false;
        this.U0 = null;
        this.V0 = false;
        this.W0 = false;
        str = uRLName != null ? uRLName.getProtocol() : str;
        this.f65470u0 = str;
        MailLogger mailLogger = new MailLogger(getClass(), "DEBUG POP3", session.getDebug(), session.getDebugOut());
        this.M0 = mailLogger;
        z10 = z10 ? z10 : f.d("mail.", str, ".ssl.enable", session.getProperties(), false);
        if (z10) {
            this.v0 = 995;
        } else {
            this.v0 = 110;
        }
        this.f65471w0 = z10;
        this.O0 = d("rsetbeforequit");
        this.P0 = d("disabletop");
        this.Q0 = d("forgettopheaders");
        this.S0 = d("cachewriteto");
        this.T0 = d("filecache.enable");
        String property = session.getProperty("mail." + str + ".filecache.dir");
        if (property != null && mailLogger.isLoggable(Level.CONFIG)) {
            mailLogger.config("mail." + str + ".filecache.dir: " + property);
        }
        if (property != null) {
            this.U0 = new File(property);
        }
        this.V0 = d("keepmessagecontent");
        this.I0 = d("starttls.enable");
        this.J0 = d("starttls.required");
        this.W0 = d("finalizecleanclose");
        String property2 = session.getProperty("mail." + str + ".message.class");
        if (property2 != null) {
            mailLogger.log(Level.CONFIG, "message class: {0}", property2);
            try {
                try {
                    cls = Class.forName(property2, false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName(property2);
                }
                this.N0 = cls.getConstructor(Folder.class, Integer.TYPE);
            } catch (Exception e5) {
                this.M0.log(Level.CONFIG, "failed to load message class", (Throwable) e5);
            }
        }
    }

    @Override // javax.mail.Store
    public Folder getFolder(URLName uRLName) throws MessagingException {
        if (super.isConnected()) {
            return new POP3Folder(this, uRLName.getFile());
        }
        throw new MessagingException("Not connected");
    }
}
