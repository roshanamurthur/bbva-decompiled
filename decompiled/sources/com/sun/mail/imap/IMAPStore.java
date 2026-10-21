package com.sun.mail.imap;

import androidx.camera.camera2.internal.compat.u;
import androidx.collection.f;
import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.CommandFailedException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.iap.ResponseHandler;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.IMAPReferralException;
import com.sun.mail.imap.protocol.ListInfo;
import com.sun.mail.imap.protocol.Namespaces;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import javax.mail.AuthenticationFailedException;
import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Quota;
import javax.mail.QuotaAwareStore;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.StoreClosedException;
import javax.mail.URLName;
import kotlin.jvm.internal.CharCompanionObject;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPStore extends Store implements QuotaAwareStore, ResponseHandler {
    public static final String ID_ADDRESS = "address";
    public static final String ID_ARGUMENTS = "arguments";
    public static final String ID_COMMAND = "command";
    public static final String ID_DATE = "date";
    public static final String ID_ENVIRONMENT = "environment";
    public static final String ID_NAME = "name";
    public static final String ID_OS = "os";
    public static final String ID_OS_VERSION = "os-version";
    public static final String ID_SUPPORT_URL = "support-url";
    public static final String ID_VENDOR = "vendor";
    public static final String ID_VERSION = "version";
    public static final int RESPONSE = 1000;
    public volatile int E0;
    public Namespaces F0;
    public final boolean G0;
    public final boolean H0;
    public boolean I0;
    public final boolean J0;
    public final String[] K0;
    public final boolean L0;
    public final boolean M0;
    public final boolean N0;
    public final String O0;
    public final boolean P0;
    public final boolean Q0;
    public boolean R0;
    public final boolean S0;
    public final boolean T0;
    public volatile boolean U0;
    public volatile boolean V0;
    public final Object W0;
    public final boolean X0;
    public final boolean Y0;
    public final boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public volatile Constructor<?> f65351a1;
    protected String authorizationID;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public volatile Constructor<?> f65352b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final b f65353c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final a f65354d1;
    protected final int defaultPort;
    protected String host;
    protected final boolean isSSL;
    protected MailLogger logger;
    protected final String name;
    protected String password;
    protected String proxyAuthUser;
    protected String saslRealm;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f65355u0;
    protected String user;
    public final boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f65356w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f65357x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f65358y0;

    public class a implements ResponseHandler {
        public a() {
        }

        @Override // com.sun.mail.iap.ResponseHandler
        public final void handleResponse(Response response) {
            boolean zIsOK = response.isOK();
            IMAPStore iMAPStore = IMAPStore.this;
            if (zIsOK || response.isNO() || response.isBAD() || response.isBYE()) {
                iMAPStore.s(response);
            }
            if (response.isBYE()) {
                iMAPStore.logger.fine("IMAPStore non-store connection dead");
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Vector<IMAPFolder> f65361b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f65364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f65365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f65366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f65367h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f65368i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final MailLogger f65369j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public IMAPProtocol f65371l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Vector<IMAPProtocol> f65360a = new Vector<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f65362c = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f65370k = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f65363d = System.currentTimeMillis();

        public b(String str, MailLogger mailLogger, Session session) {
            Properties properties = session.getProperties();
            MailLogger subLogger = mailLogger.getSubLogger("connectionpool", "DEBUG IMAP CP", f.d("mail.", str, ".connectionpool.debug", properties, false));
            this.f65369j = subLogger;
            int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".connectionpoolsize", -1);
            if (intProperty > 0) {
                this.f65367h = intProperty;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.connectionpoolsize: " + intProperty);
                }
            } else {
                this.f65367h = 1;
            }
            int intProperty2 = PropUtil.getIntProperty(properties, "mail." + str + ".connectionpooltimeout", -1);
            if (intProperty2 > 0) {
                long j10 = intProperty2;
                this.f65365f = j10;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.connectionpooltimeout: " + j10);
                }
            } else {
                this.f65365f = 45000L;
            }
            int intProperty3 = PropUtil.getIntProperty(properties, "mail." + str + ".servertimeout", -1);
            if (intProperty3 > 0) {
                long j11 = intProperty3;
                this.f65366g = j11;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.servertimeout: " + j11);
                }
            } else {
                this.f65366g = 1800000L;
            }
            int intProperty4 = PropUtil.getIntProperty(properties, "mail." + str + ".pruninginterval", -1);
            if (intProperty4 > 0) {
                long j12 = intProperty4;
                this.f65368i = j12;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.pruninginterval: " + j12);
                }
            } else {
                this.f65368i = 60000L;
            }
            boolean zD = f.d("mail.", str, ".separatestoreconnection", properties, false);
            this.f65364e = zD;
            if (zD) {
                subLogger.config("dedicate a store connection");
            }
        }
    }

    public IMAPStore(Session session, URLName uRLName) {
        this(session, uRLName, "imap", false);
    }

    public final void A(IMAPProtocol iMAPProtocol) {
        boolean z10;
        if (iMAPProtocol == null) {
            l();
            return;
        }
        synchronized (this.W0) {
            z10 = this.U0;
            this.U0 = false;
        }
        synchronized (this.f65353c1) {
            b bVar = this.f65353c1;
            bVar.f65362c = false;
            bVar.notifyAll();
            this.f65353c1.f65369j.fine("releaseStoreProtocol()");
            B();
        }
        if (z10) {
            l();
        }
    }

    public final void B() {
        synchronized (this.f65353c1) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                b bVar = this.f65353c1;
                if (jCurrentTimeMillis - bVar.f65363d > bVar.f65368i && bVar.f65360a.size() > 1) {
                    if (this.f65353c1.f65369j.isLoggable(Level.FINE)) {
                        this.f65353c1.f65369j.fine("checking for connections to prune: " + (System.currentTimeMillis() - this.f65353c1.f65363d));
                        this.f65353c1.f65369j.fine("clientTimeoutInterval: " + this.f65353c1.f65365f);
                    }
                    for (int size = this.f65353c1.f65360a.size() - 1; size > 0; size--) {
                        IMAPProtocol iMAPProtocolElementAt = this.f65353c1.f65360a.elementAt(size);
                        if (this.f65353c1.f65369j.isLoggable(Level.FINE)) {
                            this.f65353c1.f65369j.fine("protocol last used: " + (System.currentTimeMillis() - iMAPProtocolElementAt.getTimestamp()));
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - iMAPProtocolElementAt.getTimestamp();
                        b bVar2 = this.f65353c1;
                        if (jCurrentTimeMillis2 > bVar2.f65365f) {
                            bVar2.f65369j.fine("authenticated connection timed out, logging out the connection");
                            iMAPProtocolElementAt.removeResponseHandler(this);
                            this.f65353c1.f65360a.removeElementAt(size);
                            try {
                                iMAPProtocolElementAt.logout();
                            } catch (ProtocolException unused) {
                            }
                        }
                    }
                    this.f65353c1.f65363d = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        return PropUtil.getBooleanProperty(this.session.getProperties(), "mail." + this.name + ".allowreadonlyselect", false);
    }

    @Override // javax.mail.Service, java.lang.AutoCloseable
    public synchronized void close() throws MessagingException {
        l();
        m(false);
        n(false);
    }

    public final void e() {
        if (!super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    @Override // javax.mail.Service
    public void finalize() throws Throwable {
        if (!this.T0) {
            synchronized (this.W0) {
                this.U0 = true;
                this.V0 = true;
            }
            this.R0 = true;
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // javax.mail.Store
    public synchronized Folder getDefaultFolder() throws MessagingException {
        e();
        return new DefaultFolder(this);
    }

    @Override // javax.mail.Store
    public synchronized Folder getFolder(String str) throws MessagingException {
        e();
        return newIMAPFolder(str, CharCompanionObject.MAX_VALUE);
    }

    @Override // javax.mail.Store
    public Folder[] getPersonalNamespaces() throws MessagingException {
        Namespaces.Namespace[] namespaceArr;
        Namespaces namespacesO = o();
        return (namespacesO == null || (namespaceArr = namespacesO.personal) == null) ? super.getPersonalNamespaces() : w(namespaceArr, null);
    }

    public String getProxyAuthUser() {
        return this.proxyAuthUser;
    }

    @Override // javax.mail.QuotaAwareStore
    public synchronized Quota[] getQuota(String str) throws MessagingException {
        Quota[] quotaRoot;
        e();
        IMAPProtocol iMAPProtocolR = null;
        try {
            try {
                try {
                    iMAPProtocolR = r();
                    quotaRoot = iMAPProtocolR.getQuotaRoot(str);
                    A(iMAPProtocolR);
                } catch (ProtocolException e5) {
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (BadCommandException e7) {
                throw new MessagingException("QUOTA not supported", e7);
            } catch (ConnectionException e10) {
                throw new StoreClosedException(this, e10.getMessage());
            }
        } catch (Throwable th2) {
            A(iMAPProtocolR);
            throw th2;
        }
        return quotaRoot;
    }

    @Override // javax.mail.Store
    public Folder[] getSharedNamespaces() throws MessagingException {
        Namespaces.Namespace[] namespaceArr;
        Namespaces namespacesO = o();
        return (namespacesO == null || (namespaceArr = namespacesO.shared) == null) ? super.getSharedNamespaces() : w(namespaceArr, null);
    }

    @Override // javax.mail.Store
    public Folder[] getUserNamespaces(String str) throws MessagingException {
        Namespaces.Namespace[] namespaceArr;
        Namespaces namespacesO = o();
        return (namespacesO == null || (namespaceArr = namespacesO.otherUsers) == null) ? super.getUserNamespaces(str) : w(namespaceArr, str);
    }

    @Override // com.sun.mail.iap.ResponseHandler
    public void handleResponse(Response response) {
        if (response.isOK() || response.isNO() || response.isBAD() || response.isBYE()) {
            s(response);
        }
        if (response.isBYE()) {
            this.logger.fine("IMAPStore connection dead");
            synchronized (this.W0) {
                try {
                    this.U0 = true;
                    if (response.isSynthetic()) {
                        this.V0 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public synchronized boolean hasCapability(String str) throws MessagingException {
        boolean zHasCapability;
        IMAPProtocol iMAPProtocolR = null;
        try {
            try {
                iMAPProtocolR = r();
                zHasCapability = iMAPProtocolR.hasCapability(str);
                A(iMAPProtocolR);
            } catch (ProtocolException e5) {
                throw new MessagingException(e5.getMessage(), e5);
            }
        } catch (Throwable th2) {
            A(iMAPProtocolR);
            throw th2;
        }
        return zHasCapability;
    }

    public synchronized Map<String, String> id(Map<String, String> map) throws MessagingException {
        Map<String, String> mapId;
        e();
        IMAPProtocol iMAPProtocolR = null;
        try {
            try {
                try {
                    iMAPProtocolR = r();
                    mapId = iMAPProtocolR.id(map);
                    A(iMAPProtocolR);
                } catch (ProtocolException e5) {
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (BadCommandException e7) {
                throw new MessagingException("ID not supported", e7);
            } catch (ConnectionException e10) {
                throw new StoreClosedException(this, e10.getMessage());
            }
        } catch (Throwable th2) {
            A(iMAPProtocolR);
            throw th2;
        }
        return mapId;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b6 */
    /* JADX WARN: Code duplicated, block: B:100:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:119:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r8.N0 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        if (r2.isUnTagged() == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        notifyStoreListeners(1000, r2.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void idle() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPStore.idle():void");
    }

    @Override // javax.mail.Service
    public synchronized boolean isConnected() {
        try {
            if (!super.isConnected()) {
                return false;
            }
            IMAPProtocol iMAPProtocolR = null;
            try {
                iMAPProtocolR = r();
                iMAPProtocolR.noop();
            } catch (ProtocolException unused) {
            } finally {
                A(iMAPProtocolR);
            }
            return super.isConnected();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isSSL() {
        return this.I0;
    }

    public final synchronized void l() {
        boolean z10;
        if (!super.isConnected()) {
            this.logger.fine("IMAPStore cleanup, not connected");
            return;
        }
        synchronized (this.W0) {
            z10 = this.V0;
            this.V0 = false;
            this.U0 = false;
        }
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("IMAPStore cleanup, force " + z10);
        }
        if (!z10 || this.R0) {
            m(z10);
        }
        n(z10);
        try {
            super.close();
        } catch (MessagingException unused) {
        }
        this.logger.fine("IMAPStore cleanup done");
    }

    public final void m(boolean z10) {
        boolean z11;
        Vector<IMAPFolder> vector = null;
        while (true) {
            synchronized (this.f65353c1) {
                b bVar = this.f65353c1;
                Vector<IMAPFolder> vector2 = bVar.f65361b;
                if (vector2 != null) {
                    bVar.f65361b = null;
                    vector = vector2;
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            if (z11) {
                return;
            }
            int size = vector.size();
            for (int i10 = 0; i10 < size; i10++) {
                IMAPFolder iMAPFolder = vector.get(i10);
                if (z10) {
                    try {
                        this.logger.fine("force folder to close");
                        iMAPFolder.forceClose();
                    } catch (IllegalStateException | MessagingException unused) {
                    }
                } else {
                    this.logger.fine("close folder");
                    iMAPFolder.close(false);
                }
            }
        }
    }

    public final void n(boolean z10) {
        synchronized (this.f65353c1) {
            try {
                for (int size = this.f65353c1.f65360a.size() - 1; size >= 0; size--) {
                    try {
                        IMAPProtocol iMAPProtocolElementAt = this.f65353c1.f65360a.elementAt(size);
                        iMAPProtocolElementAt.removeResponseHandler(this);
                        if (z10) {
                            iMAPProtocolElementAt.disconnect();
                        } else {
                            iMAPProtocolElementAt.logout();
                        }
                    } catch (ProtocolException unused) {
                    }
                }
                this.f65353c1.f65360a.removeAllElements();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f65353c1.f65369j.fine("removed all authenticated connections from pool");
    }

    public IMAPFolder newIMAPFolder(String str, char c10, Boolean bool) {
        IMAPFolder iMAPFolder;
        if (this.f65351a1 != null) {
            try {
                iMAPFolder = (IMAPFolder) this.f65351a1.newInstance(str, Character.valueOf(c10), this, bool);
            } catch (Exception e5) {
                this.logger.log(Level.FINE, "exception creating IMAPFolder class", (Throwable) e5);
                iMAPFolder = null;
            }
        } else {
            iMAPFolder = null;
        }
        return iMAPFolder == null ? new IMAPFolder(str, c10, this, bool) : iMAPFolder;
    }

    public IMAPProtocol newIMAPProtocol(String str, int i10) throws ProtocolException, IOException {
        return new IMAPProtocol(this.name, str, i10, this.session.getProperties(), this.isSSL, this.logger);
    }

    public final synchronized Namespaces o() throws MessagingException {
        e();
        if (this.F0 == null) {
            IMAPProtocol iMAPProtocolR = null;
            try {
                try {
                    iMAPProtocolR = r();
                    this.F0 = iMAPProtocolR.namespace();
                } catch (BadCommandException unused) {
                } catch (ConnectionException e5) {
                    throw new StoreClosedException(this, e5.getMessage());
                } catch (ProtocolException e7) {
                    throw new MessagingException(e7.getMessage(), e7);
                }
                A(iMAPProtocolR);
            } catch (Throwable th2) {
                A(iMAPProtocolR);
                throw th2;
            }
        }
        return this.F0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #3 {all -> 0x0028, blocks: (B:7:0x0007, B:9:0x0011, B:11:0x001c, B:13:0x0022, B:18:0x002b, B:20:0x0035, B:21:0x0053, B:24:0x0075, B:29:0x0094, B:31:0x0098, B:33:0x00a2, B:35:0x00aa, B:37:0x00c5, B:38:0x00cd, B:40:0x00d0, B:51:0x0104, B:53:0x0109, B:55:0x010f, B:56:0x0116, B:57:0x011d, B:26:0x0089, B:27:0x0091, B:41:0x00d4, B:42:0x00db, B:44:0x00df, B:45:0x00e2, B:59:0x0120, B:60:0x0127, B:48:0x00fe), top: B:72:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00df A[Catch: all -> 0x0028, Exception -> 0x00fc, TryCatch #1 {Exception -> 0x00fc, blocks: (B:42:0x00db, B:44:0x00df, B:45:0x00e2), top: B:69:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0120 A[SYNTHETIC] */
    public final IMAPProtocol p(IMAPFolder iMAPFolder) throws MessagingException {
        while (true) {
            IMAPProtocol iMAPProtocolNewIMAPProtocol = null;
            while (iMAPProtocolNewIMAPProtocol == null) {
                synchronized (this.f65353c1) {
                    try {
                        if (this.f65353c1.f65360a.isEmpty()) {
                            this.logger.fine("no connections in the pool, creating a new one");
                            try {
                                if (this.L0) {
                                    x();
                                }
                                iMAPProtocolNewIMAPProtocol = newIMAPProtocol(this.host, this.E0);
                                iMAPProtocolNewIMAPProtocol.addResponseHandler(this.f65354d1);
                                v(iMAPProtocolNewIMAPProtocol, this.user, this.password);
                                iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.f65354d1);
                            } catch (Exception unused) {
                                if (iMAPProtocolNewIMAPProtocol != null) {
                                    try {
                                        iMAPProtocolNewIMAPProtocol.disconnect();
                                    } catch (Exception unused2) {
                                    }
                                }
                                iMAPProtocolNewIMAPProtocol = null;
                            }
                            if (iMAPProtocolNewIMAPProtocol == null) {
                                throw new MessagingException("connection failure");
                            }
                        } else {
                            if (this.f65353c1.f65360a.size() == 1) {
                                b bVar = this.f65353c1;
                                if (bVar.f65364e || bVar.f65362c) {
                                    this.logger.fine("no connections in the pool, creating a new one");
                                    if (this.L0) {
                                        x();
                                    }
                                    iMAPProtocolNewIMAPProtocol = newIMAPProtocol(this.host, this.E0);
                                    iMAPProtocolNewIMAPProtocol.addResponseHandler(this.f65354d1);
                                    v(iMAPProtocolNewIMAPProtocol, this.user, this.password);
                                    iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.f65354d1);
                                    if (iMAPProtocolNewIMAPProtocol == null) {
                                        throw new MessagingException("connection failure");
                                    }
                                }
                            }
                            if (this.logger.isLoggable(Level.FINE)) {
                                this.logger.fine("connection available -- size: " + this.f65353c1.f65360a.size());
                            }
                            iMAPProtocolNewIMAPProtocol = this.f65353c1.f65360a.lastElement();
                            this.f65353c1.f65360a.removeElement(iMAPProtocolNewIMAPProtocol);
                            if (System.currentTimeMillis() - iMAPProtocolNewIMAPProtocol.getTimestamp() > this.f65353c1.f65366g) {
                                try {
                                    try {
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this.f65354d1);
                                        iMAPProtocolNewIMAPProtocol.noop();
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.f65354d1);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this);
                                    } catch (ProtocolException unused3) {
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.f65354d1);
                                        iMAPProtocolNewIMAPProtocol.disconnect();
                                    }
                                } catch (RuntimeException unused4) {
                                }
                            }
                            String str = this.proxyAuthUser;
                            if (str != null && !str.equals(iMAPProtocolNewIMAPProtocol.getProxyAuthUser()) && iMAPProtocolNewIMAPProtocol.hasCapability("X-UNAUTHENTICATE")) {
                                try {
                                    try {
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this.f65354d1);
                                        iMAPProtocolNewIMAPProtocol.unauthenticate();
                                        v(iMAPProtocolNewIMAPProtocol, this.user, this.password);
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.f65354d1);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this);
                                    } catch (RuntimeException unused5) {
                                    }
                                } catch (ProtocolException unused6) {
                                    iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.f65354d1);
                                    iMAPProtocolNewIMAPProtocol.disconnect();
                                }
                            }
                            iMAPProtocolNewIMAPProtocol.removeResponseHandler(this);
                        }
                        B();
                        if (iMAPFolder != null) {
                            b bVar2 = this.f65353c1;
                            if (bVar2.f65361b == null) {
                                bVar2.f65361b = new Vector<>();
                            }
                            this.f65353c1.f65361b.addElement(iMAPFolder);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return iMAPProtocolNewIMAPProtocol;
        }
    }

    @Override // javax.mail.Service
    public synchronized boolean protocolConnect(String str, int i10, String str2, String str3) throws MessagingException {
        boolean zIsEmpty;
        try {
            if (str == null || str3 == null || str2 == null) {
                if (this.logger.isLoggable(Level.FINE)) {
                    MailLogger mailLogger = this.logger;
                    StringBuilder sb2 = new StringBuilder("protocolConnect returning false, host=");
                    sb2.append(str);
                    sb2.append(", user=");
                    if (!this.X0) {
                        str2 = "<user name suppressed>";
                    }
                    sb2.append(str2);
                    sb2.append(", password=");
                    if (!this.Y0) {
                        str3 = str3 == null ? "<null>" : "<non-null>";
                    }
                    sb2.append(str3);
                    mailLogger.fine(sb2.toString());
                }
                return false;
            }
            if (i10 != -1) {
                this.E0 = i10;
            } else {
                this.E0 = PropUtil.getIntProperty(this.session.getProperties(), "mail." + this.name + ".port", this.E0);
            }
            if (this.E0 == -1) {
                this.E0 = this.defaultPort;
            }
            Protocol protocol = null;
            try {
                try {
                    try {
                        try {
                            synchronized (this.f65353c1) {
                                zIsEmpty = this.f65353c1.f65360a.isEmpty();
                            }
                            if (zIsEmpty) {
                                MailLogger mailLogger2 = this.logger;
                                Level level = Level.FINE;
                                if (mailLogger2.isLoggable(level)) {
                                    this.logger.fine("trying to connect to host \"" + str + "\", port " + this.E0 + ", isSSL " + this.isSSL);
                                }
                                IMAPProtocol iMAPProtocolNewIMAPProtocol = newIMAPProtocol(str, this.E0);
                                if (this.logger.isLoggable(level)) {
                                    MailLogger mailLogger3 = this.logger;
                                    StringBuilder sb3 = new StringBuilder("protocolConnect login, host=");
                                    sb3.append(str);
                                    sb3.append(", user=");
                                    sb3.append(this.X0 ? str2 : "<user name suppressed>");
                                    sb3.append(", password=");
                                    sb3.append(this.Y0 ? str3 : "<non-null>");
                                    mailLogger3.fine(sb3.toString());
                                }
                                iMAPProtocolNewIMAPProtocol.addResponseHandler(this.f65354d1);
                                v(iMAPProtocolNewIMAPProtocol, str2, str3);
                                iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.f65354d1);
                                iMAPProtocolNewIMAPProtocol.addResponseHandler(this);
                                this.I0 = iMAPProtocolNewIMAPProtocol.isSSL();
                                this.host = str;
                                this.user = str2;
                                this.password = str3;
                                synchronized (this.f65353c1) {
                                    this.f65353c1.f65360a.addElement(iMAPProtocolNewIMAPProtocol);
                                }
                            }
                            return true;
                        } catch (IOException e5) {
                            throw new MessagingException(e5.getMessage(), e5);
                        }
                    } catch (SocketConnectException e7) {
                        throw new MailConnectException(e7);
                    }
                } catch (IMAPReferralException e10) {
                    if (0 != 0) {
                        protocol.disconnect();
                    }
                    throw new ReferralException(e10.getUrl(), e10.getMessage());
                }
            } catch (CommandFailedException e11) {
                if (0 != 0) {
                    protocol.disconnect();
                }
                Response response = e11.getResponse();
                throw new AuthenticationFailedException(response != null ? response.getRest() : e11.getMessage());
            } catch (ProtocolException e12) {
                if (0 != 0) {
                    protocol.disconnect();
                }
                throw new MessagingException(e12.getMessage(), e12);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Session q() {
        return this.session;
    }

    public final IMAPProtocol r() throws ProtocolException {
        b bVar;
        IMAPProtocol iMAPProtocolFirstElement = null;
        while (iMAPProtocolFirstElement == null) {
            synchronized (this.f65353c1) {
                while (true) {
                    try {
                        bVar = this.f65353c1;
                        int i10 = bVar.f65370k;
                        if (i10 == 0) {
                            break;
                        }
                        if (i10 == 1) {
                            bVar.f65371l.idleAbort();
                            bVar.f65370k = 2;
                        }
                        try {
                            bVar.wait();
                        } catch (InterruptedException e5) {
                            throw new ProtocolException("Interrupted waitIfIdle", e5);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                if (bVar.f65360a.isEmpty()) {
                    this.f65353c1.f65369j.fine("getStoreProtocol() - no connections in the pool, creating a new one");
                    try {
                        if (this.L0) {
                            x();
                        }
                        iMAPProtocolFirstElement = newIMAPProtocol(this.host, this.E0);
                        v(iMAPProtocolFirstElement, this.user, this.password);
                    } catch (Exception unused) {
                        if (iMAPProtocolFirstElement != null) {
                            try {
                                iMAPProtocolFirstElement.logout();
                            } catch (Exception unused2) {
                            }
                        }
                        iMAPProtocolFirstElement = null;
                    }
                    if (iMAPProtocolFirstElement == null) {
                        throw new ConnectionException("failed to create new store connection");
                    }
                    iMAPProtocolFirstElement.addResponseHandler(this);
                    this.f65353c1.f65360a.addElement(iMAPProtocolFirstElement);
                } else {
                    if (this.f65353c1.f65369j.isLoggable(Level.FINE)) {
                        this.f65353c1.f65369j.fine("getStoreProtocol() - connection available -- size: " + this.f65353c1.f65360a.size());
                    }
                    iMAPProtocolFirstElement = this.f65353c1.f65360a.firstElement();
                    String str = this.proxyAuthUser;
                    if (str != null && !str.equals(iMAPProtocolFirstElement.getProxyAuthUser()) && iMAPProtocolFirstElement.hasCapability("X-UNAUTHENTICATE")) {
                        iMAPProtocolFirstElement.unauthenticate();
                        v(iMAPProtocolFirstElement, this.user, this.password);
                    }
                }
                b bVar2 = this.f65353c1;
                if (bVar2.f65362c) {
                    try {
                        bVar2.wait();
                        iMAPProtocolFirstElement = null;
                    } catch (InterruptedException e7) {
                        Thread.currentThread().interrupt();
                        throw new ProtocolException("Interrupted getStoreProtocol", e7);
                    }
                } else {
                    bVar2.f65362c = true;
                    bVar2.f65369j.fine("getStoreProtocol() -- storeConnectionInUse");
                }
                B();
            }
        }
        return iMAPProtocolFirstElement;
    }

    public final void s(Response response) {
        if (this.M0) {
            notifyStoreListeners(1000, response.toString());
        }
        String rest = response.getRest();
        boolean z10 = false;
        if (rest.startsWith(Constant.BRACKET_OPEN)) {
            int iIndexOf = rest.indexOf(93);
            if (iIndexOf > 0 && rest.substring(0, iIndexOf + 1).equalsIgnoreCase("[ALERT]")) {
                z10 = true;
            }
            rest = rest.substring(iIndexOf + 1).trim();
        }
        if (z10) {
            notifyStoreListeners(1, rest);
        } else {
            if (!response.isUnTagged() || rest.length() <= 0) {
                return;
            }
            notifyStoreListeners(2, rest);
        }
    }

    public synchronized void setPassword(String str) {
        this.password = str;
    }

    public void setProxyAuthUser(String str) {
        this.proxyAuthUser = str;
    }

    @Override // javax.mail.QuotaAwareStore
    public synchronized void setQuota(Quota quota) throws MessagingException {
        e();
        IMAPProtocol iMAPProtocolR = null;
        try {
            try {
                try {
                    iMAPProtocolR = r();
                    iMAPProtocolR.setQuota(quota);
                    A(iMAPProtocolR);
                } catch (ProtocolException e5) {
                    throw new MessagingException(e5.getMessage(), e5);
                }
            } catch (BadCommandException e7) {
                throw new MessagingException("QUOTA not supported", e7);
            } catch (ConnectionException e10) {
                throw new StoreClosedException(this, e10.getMessage());
            }
        } catch (Throwable th2) {
            A(iMAPProtocolR);
            throw th2;
        }
    }

    public synchronized void setUsername(String str) {
        this.user = str;
    }

    public final boolean u() {
        boolean z10;
        synchronized (this.f65353c1) {
            try {
                if (this.f65353c1.f65369j.isLoggable(Level.FINE)) {
                    this.f65353c1.f65369j.fine("connection pool current size: " + this.f65353c1.f65360a.size() + "   pool size: " + this.f65353c1.f65367h);
                }
                z10 = this.f65353c1.f65360a.size() >= this.f65353c1.f65367h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final void v(IMAPProtocol iMAPProtocol, String str, String str2) throws ProtocolException {
        boolean z10 = this.G0;
        boolean z11 = this.H0;
        if ((z10 || z11) && !iMAPProtocol.isSSL()) {
            if (iMAPProtocol.hasCapability("STARTTLS")) {
                iMAPProtocol.startTLS();
                iMAPProtocol.capability();
            } else if (z11) {
                this.logger.fine("STARTTLS required but not supported by server");
                throw new ProtocolException("STARTTLS required but not supported by server");
            }
        }
        if (iMAPProtocol.isAuthenticated()) {
            return;
        }
        preLogin(iMAPProtocol);
        String str3 = this.O0;
        if (str3 != null) {
            HashMap map = new HashMap();
            map.put("GUID", str3);
            iMAPProtocol.id(map);
        }
        iMAPProtocol.getCapabilities().put("__PRELOGIN__", "");
        String str4 = this.authorizationID;
        if (str4 == null && (str4 = this.proxyAuthUser) == null) {
            str4 = null;
        }
        if (this.J0) {
            try {
                iMAPProtocol.sasllogin(this.K0, this.saslRealm, str4, str, str2);
                if (!iMAPProtocol.isAuthenticated()) {
                    throw new CommandFailedException("SASL authentication failed");
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (!iMAPProtocol.isAuthenticated()) {
            String property = this.session.getProperty("mail." + this.name + ".auth.mechanisms");
            if (property == null) {
                property = "PLAIN LOGIN NTLM XOAUTH2";
            }
            StringTokenizer stringTokenizer = new StringTokenizer(property);
            while (true) {
                if (!stringTokenizer.hasMoreTokens()) {
                    if (!iMAPProtocol.hasCapability("LOGINDISABLED")) {
                        iMAPProtocol.login(str, str2);
                        break;
                    }
                    throw new ProtocolException("No login methods supported!");
                }
                String strNextToken = stringTokenizer.nextToken();
                Locale locale = Locale.ENGLISH;
                String upperCase = strNextToken.toUpperCase(locale);
                if (property == "PLAIN LOGIN NTLM XOAUTH2") {
                    String str5 = "mail." + this.name + ".auth." + upperCase.toLowerCase(locale) + ".disable";
                    if (PropUtil.getBooleanProperty(this.session.getProperties(), str5, upperCase.equals("XOAUTH2"))) {
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("mechanism " + upperCase + " disabled by property: " + str5);
                        }
                    }
                }
                if (!iMAPProtocol.hasCapability("AUTH=" + upperCase) && (!upperCase.equals("LOGIN") || !iMAPProtocol.hasCapability("AUTH-LOGIN"))) {
                    this.logger.log(Level.FINE, "mechanism {0} not supported by server", upperCase);
                } else {
                    if (upperCase.equals("PLAIN")) {
                        iMAPProtocol.authplain(str4, str, str2);
                        break;
                    }
                    if (upperCase.equals("LOGIN")) {
                        iMAPProtocol.authlogin(str, str2);
                        break;
                    } else if (upperCase.equals("NTLM")) {
                        iMAPProtocol.authntlm(str4, str, str2);
                        break;
                    } else {
                        if (upperCase.equals("XOAUTH2")) {
                            iMAPProtocol.authoauth2(str, str2);
                            break;
                        }
                        this.logger.log(Level.FINE, "no authenticator for mechanism {0}", upperCase);
                    }
                }
            }
        }
        String str6 = this.proxyAuthUser;
        if (str6 != null) {
            iMAPProtocol.proxyauth(str6);
        }
        if (iMAPProtocol.hasCapability("__PRELOGIN__")) {
            try {
                iMAPProtocol.capability();
            } catch (ConnectionException e5) {
                throw e5;
            } catch (ProtocolException unused2) {
            }
        }
        if (this.S0 && iMAPProtocol.hasCapability("COMPRESS=DEFLATE")) {
            iMAPProtocol.compress();
        }
        if (iMAPProtocol.hasCapability("UTF8=ACCEPT") || iMAPProtocol.hasCapability("UTF8=ONLY")) {
            iMAPProtocol.enable("UTF8=ACCEPT");
        }
    }

    public final Folder[] w(Namespaces.Namespace[] namespaceArr, String str) {
        int length = namespaceArr.length;
        Folder[] folderArr = new Folder[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strF = namespaceArr[i10].prefix;
            if (str == null) {
                int length2 = strF.length();
                if (length2 > 0) {
                    int i11 = length2 - 1;
                    if (strF.charAt(i11) == namespaceArr[i10].delimiter) {
                        strF = strF.substring(0, i11);
                    }
                }
            } else {
                strF = u.f(strF, str);
            }
            folderArr[i10] = newIMAPFolder(strF, namespaceArr[i10].delimiter, Boolean.valueOf(str == null));
        }
        return folderArr;
    }

    public final void x() {
        InetAddress byName;
        if (this.logger.isLoggable(Level.FINE)) {
            MailLogger mailLogger = this.logger;
            StringBuilder sb2 = new StringBuilder("refresh password, user: ");
            String str = this.user;
            if (!this.X0) {
                str = "<user name suppressed>";
            }
            sb2.append(str);
            mailLogger.fine(sb2.toString());
        }
        try {
            byName = InetAddress.getByName(this.host);
        } catch (UnknownHostException unused) {
            byName = null;
        }
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = this.session.requestPasswordAuthentication(byName, this.E0, this.name, null, this.user);
        if (passwordAuthenticationRequestPasswordAuthentication != null) {
            this.user = passwordAuthenticationRequestPasswordAuthentication.getUserName();
            this.password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
        }
    }

    public final void y(IMAPProtocol iMAPProtocol) {
        if (iMAPProtocol == null) {
            return;
        }
        iMAPProtocol.removeResponseHandler(this.f65354d1);
        iMAPProtocol.addResponseHandler(this);
        synchronized (this.f65353c1) {
            b bVar = this.f65353c1;
            bVar.f65362c = false;
            bVar.notifyAll();
            this.f65353c1.f65369j.fine("releaseFolderStoreProtocol()");
            B();
        }
    }

    public final void z(IMAPFolder iMAPFolder, IMAPProtocol iMAPProtocol) {
        synchronized (this.f65353c1) {
            if (iMAPProtocol != null) {
                try {
                    if (u()) {
                        this.logger.fine("pool is full, not adding an Authenticated connection");
                        try {
                            iMAPProtocol.logout();
                        } catch (ProtocolException unused) {
                        }
                    } else {
                        iMAPProtocol.addResponseHandler(this);
                        this.f65353c1.f65360a.addElement(iMAPProtocol);
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("added an Authenticated connection -- size: " + this.f65353c1.f65360a.size());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Vector<IMAPFolder> vector = this.f65353c1.f65361b;
            if (vector != null) {
                vector.removeElement(iMAPFolder);
            }
            B();
        }
    }

    public IMAPStore(Session session, URLName uRLName, String str, boolean z10) {
        Class<?> cls;
        super(session, uRLName);
        this.E0 = -1;
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.J0 = false;
        this.L0 = false;
        this.M0 = false;
        this.N0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = true;
        this.S0 = false;
        this.T0 = false;
        this.U0 = false;
        this.V0 = false;
        this.W0 = new Object();
        this.f65351a1 = null;
        this.f65352b1 = null;
        this.f65354d1 = new a();
        Properties properties = session.getProperties();
        str = uRLName != null ? uRLName.getProtocol() : str;
        this.name = str;
        z10 = z10 ? z10 : f.d("mail.", str, ".ssl.enable", properties, false);
        if (z10) {
            this.defaultPort = 993;
        } else {
            this.defaultPort = 143;
        }
        this.isSSL = z10;
        this.debug = session.getDebug();
        this.X0 = PropUtil.getBooleanProperty(properties, "mail.debug.auth.username", true);
        this.Y0 = PropUtil.getBooleanProperty(properties, "mail.debug.auth.password", false);
        this.logger = new MailLogger(getClass(), "DEBUG " + str.toUpperCase(Locale.ENGLISH), session.getDebug(), session.getDebugOut());
        if (f.d("mail.", str, ".partialfetch", properties, true)) {
            int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".fetchsize", 16384);
            this.f65355u0 = intProperty;
            if (this.logger.isLoggable(Level.CONFIG)) {
                this.logger.config("mail.imap.fetchsize: " + intProperty);
            }
        } else {
            this.f65355u0 = -1;
            this.logger.config("mail.imap.partialfetch: false");
        }
        boolean zD = f.d("mail.", str, ".ignorebodystructuresize", properties, false);
        this.v0 = zD;
        MailLogger mailLogger = this.logger;
        Level level = Level.CONFIG;
        if (mailLogger.isLoggable(level)) {
            this.logger.config("mail.imap.ignorebodystructuresize: " + zD);
        }
        int intProperty2 = PropUtil.getIntProperty(properties, "mail." + str + ".statuscachetimeout", 1000);
        this.f65356w0 = intProperty2;
        if (this.logger.isLoggable(level)) {
            this.logger.config("mail.imap.statuscachetimeout: " + intProperty2);
        }
        int intProperty3 = PropUtil.getIntProperty(properties, "mail." + str + ".appendbuffersize", -1);
        this.f65357x0 = intProperty3;
        if (this.logger.isLoggable(level)) {
            this.logger.config("mail.imap.appendbuffersize: " + intProperty3);
        }
        int intProperty4 = PropUtil.getIntProperty(properties, "mail." + str + ".minidletime", 10);
        this.f65358y0 = intProperty4;
        if (this.logger.isLoggable(level)) {
            this.logger.config("mail.imap.minidletime: " + intProperty4);
        }
        String property = session.getProperty("mail." + str + ".proxyauth.user");
        if (property != null) {
            this.proxyAuthUser = property;
            if (this.logger.isLoggable(level)) {
                this.logger.config("mail.imap.proxyauth.user: " + this.proxyAuthUser);
            }
        }
        boolean zD2 = f.d("mail.", str, ".starttls.enable", properties, false);
        this.G0 = zD2;
        if (zD2) {
            this.logger.config("enable STARTTLS");
        }
        boolean zD3 = f.d("mail.", str, ".starttls.required", properties, false);
        this.H0 = zD3;
        if (zD3) {
            this.logger.config("require STARTTLS");
        }
        boolean zD4 = f.d("mail.", str, ".sasl.enable", properties, false);
        this.J0 = zD4;
        if (zD4) {
            this.logger.config("enable SASL");
        }
        if (zD4) {
            String property2 = session.getProperty("mail." + str + ".sasl.mechanisms");
            if (property2 != null && property2.length() > 0) {
                if (this.logger.isLoggable(level)) {
                    this.logger.config("SASL mechanisms allowed: ".concat(property2));
                }
                ArrayList arrayList = new ArrayList(5);
                StringTokenizer stringTokenizer = new StringTokenizer(property2, " ,");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.length() > 0) {
                        arrayList.add(strNextToken);
                    }
                }
                String[] strArr = new String[arrayList.size()];
                this.K0 = strArr;
                arrayList.toArray(strArr);
            }
        }
        String property3 = session.getProperty("mail." + str + ".sasl.authorizationid");
        if (property3 != null) {
            this.authorizationID = property3;
            this.logger.log(Level.CONFIG, "mail.imap.sasl.authorizationid: {0}", property3);
        }
        String property4 = session.getProperty("mail." + str + ".sasl.realm");
        if (property4 != null) {
            this.saslRealm = property4;
            this.logger.log(Level.CONFIG, "mail.imap.sasl.realm: {0}", property4);
        }
        boolean zD5 = f.d("mail.", str, ".forcepasswordrefresh", properties, false);
        this.L0 = zD5;
        if (zD5) {
            this.logger.config("enable forcePasswordRefresh");
        }
        boolean zD6 = f.d("mail.", str, ".enableresponseevents", properties, false);
        this.M0 = zD6;
        if (zD6) {
            this.logger.config("enable IMAP response events");
        }
        boolean zD7 = f.d("mail.", str, ".enableimapevents", properties, false);
        this.N0 = zD7;
        if (zD7) {
            this.logger.config("enable IMAP IDLE events");
        }
        this.Z0 = f.d("mail.", str, ".messagecache.debug", properties, false);
        String property5 = session.getProperty("mail." + str + ".yahoo.guid");
        this.O0 = property5;
        if (property5 != null) {
            this.logger.log(Level.CONFIG, "mail.imap.yahoo.guid: {0}", property5);
        }
        boolean zD8 = f.d("mail.", str, ".throwsearchexception", properties, false);
        this.P0 = zD8;
        if (zD8) {
            this.logger.config("throw SearchException");
        }
        boolean zD9 = f.d("mail.", str, ".peek", properties, false);
        this.Q0 = zD9;
        if (zD9) {
            this.logger.config("peek");
        }
        boolean zD10 = f.d("mail.", str, ".closefoldersonstorefailure", properties, true);
        this.R0 = zD10;
        if (zD10) {
            this.logger.config("closeFoldersOnStoreFailure");
        }
        boolean zD11 = f.d("mail.", str, ".compress.enable", properties, false);
        this.S0 = zD11;
        if (zD11) {
            this.logger.config("enable COMPRESS");
        }
        boolean zD12 = f.d("mail.", str, ".finalizecleanclose", properties, false);
        this.T0 = zD12;
        if (zD12) {
            this.logger.config("close connection cleanly in finalize");
        }
        String property6 = session.getProperty("mail." + str + ".folder.class");
        if (property6 != null) {
            this.logger.log(Level.CONFIG, "IMAP: folder class: {0}", property6);
            try {
                try {
                    cls = Class.forName(property6, false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName(property6);
                }
                this.f65351a1 = cls.getConstructor(String.class, Character.TYPE, IMAPStore.class, Boolean.class);
                this.f65352b1 = cls.getConstructor(ListInfo.class, IMAPStore.class);
            } catch (Exception e5) {
                this.logger.log(Level.CONFIG, "IMAP: failed to load folder class", (Throwable) e5);
            }
        }
        this.f65353c1 = new b(str, this.logger, session);
    }

    @Override // javax.mail.Store
    public synchronized Folder getFolder(URLName uRLName) throws MessagingException {
        e();
        return newIMAPFolder(uRLName.getFile(), CharCompanionObject.MAX_VALUE);
    }

    public IMAPFolder newIMAPFolder(String str, char c10) {
        return newIMAPFolder(str, c10, null);
    }

    public IMAPFolder newIMAPFolder(ListInfo listInfo) {
        IMAPFolder iMAPFolder;
        if (this.f65352b1 != null) {
            try {
                iMAPFolder = (IMAPFolder) this.f65352b1.newInstance(listInfo, this);
            } catch (Exception e5) {
                this.logger.log(Level.FINE, "exception creating IMAPFolder class LI", (Throwable) e5);
                iMAPFolder = null;
            }
        } else {
            iMAPFolder = null;
        }
        return iMAPFolder == null ? new IMAPFolder(listInfo, this) : iMAPFolder;
    }

    public void preLogin(IMAPProtocol iMAPProtocol) throws ProtocolException {
    }
}
