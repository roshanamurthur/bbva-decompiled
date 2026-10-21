package javax.mail;

import com.bbva.nativesettings.common.Constants;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.EventListener;
import java.util.Vector;
import java.util.concurrent.Executor;
import javax.mail.event.ConnectionEvent;
import javax.mail.event.ConnectionListener;
import javax.mail.event.MailEvent;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Service implements AutoCloseable {
    protected boolean debug;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f78905p0 = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Vector<ConnectionListener> f78906q0 = new Vector<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final a f78907r0;
    protected Session session;
    protected volatile URLName url;

    public Service(Session session, URLName uRLName) {
        String property;
        String str;
        String file;
        String password;
        int i10;
        String property2;
        String property3 = null;
        this.url = null;
        this.debug = false;
        this.session = session;
        this.debug = session.getDebug();
        this.url = uRLName;
        if (this.url != null) {
            String protocol = this.url.getProtocol();
            String host = this.url.getHost();
            int port = this.url.getPort();
            property = this.url.getUsername();
            i10 = port;
            password = this.url.getPassword();
            file = this.url.getFile();
            str = protocol;
            property3 = host;
        } else {
            property = null;
            str = null;
            file = null;
            password = null;
            i10 = -1;
        }
        if (str != null) {
            if (property3 == null) {
                property3 = session.getProperty("mail." + str + ".host");
            }
            if (property == null) {
                property = session.getProperty("mail." + str + ".user");
            }
        }
        String property4 = property3 == null ? session.getProperty("mail.host") : property3;
        property = property == null ? session.getProperty("mail.user") : property;
        if (property == null) {
            try {
                property2 = System.getProperty("user.name");
            } catch (SecurityException unused) {
                property2 = property;
            }
        } else {
            property2 = property;
        }
        this.url = new URLName(str, property4, i10, file, property2, password);
        String property5 = session.getProperties().getProperty("mail.event.scope", "folder");
        Executor executor = (Executor) session.getProperties().get("mail.event.executor");
        if (property5.equalsIgnoreCase(Constants.APPLICATION)) {
            this.f78907r0 = a.b(executor);
        } else if (property5.equalsIgnoreCase("session")) {
            this.f78907r0 = session.f78920l;
        } else {
            this.f78907r0 = new a(executor);
        }
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        this.f78906q0.addElement(connectionListener);
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() throws MessagingException {
        setConnected(false);
        notifyConnectionListeners(3);
    }

    public void connect() throws MessagingException {
        connect(null, null, null);
    }

    public void finalize() throws Throwable {
        try {
            this.f78907r0.c();
        } finally {
            super.finalize();
        }
    }

    public URLName getURLName() {
        URLName uRLName = this.url;
        return (uRLName == null || (uRLName.getPassword() == null && uRLName.getFile() == null)) ? uRLName : new URLName(uRLName.getProtocol(), uRLName.getHost(), uRLName.getPort(), null, uRLName.getUsername(), null);
    }

    public synchronized boolean isConnected() {
        return this.f78905p0;
    }

    public void notifyConnectionListeners(int i10) {
        Vector<ConnectionListener> vector = this.f78906q0;
        if (vector.size() > 0) {
            queueEvent(new ConnectionEvent(this, i10), vector);
        }
        if (i10 == 3) {
            this.f78907r0.c();
        }
    }

    public boolean protocolConnect(String str, int i10, String str2, String str3) throws MessagingException {
        return false;
    }

    public void queueEvent(MailEvent mailEvent, Vector<? extends EventListener> vector) {
        this.f78907r0.a(mailEvent, (Vector) vector.clone());
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        this.f78906q0.removeElement(connectionListener);
    }

    public synchronized void setConnected(boolean z10) {
        this.f78905p0 = z10;
    }

    public void setURLName(URLName uRLName) {
        this.url = uRLName;
    }

    public String toString() {
        URLName uRLName = getURLName();
        return uRLName != null ? uRLName.toString() : super.toString();
    }

    public void connect(String str, String str2, String str3) throws MessagingException {
        connect(str, -1, str2, str3);
    }

    public void connect(String str, String str2) throws MessagingException {
        connect(null, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[PHI: r0
      0x0046: PHI (r0v26 java.lang.String) = (r0v0 java.lang.String), (r0v0 java.lang.String), (r0v29 java.lang.String) binds: [B:23:0x0049, B:25:0x0055, B:20:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public synchronized void connect(String str, int i10, String str2, String str3) throws MessagingException {
        String property;
        String password;
        String str4;
        String file;
        int i11;
        String userName;
        boolean z10;
        AuthenticationFailedException authenticationFailedException;
        boolean zProtocolConnect;
        String password2;
        String property2 = str2;
        synchronized (this) {
            try {
                if (!isConnected()) {
                    InetAddress byName = null;
                    if (this.url != null) {
                        String protocol = this.url.getProtocol();
                        property = str == null ? this.url.getHost() : str;
                        int port = i10 == -1 ? this.url.getPort() : i10;
                        if (property2 == null) {
                            property2 = this.url.getUsername();
                            if (str3 == null) {
                                password2 = this.url.getPassword();
                            } else {
                                password2 = str3;
                            }
                        } else if (str3 == null && property2.equals(this.url.getUsername())) {
                            password2 = this.url.getPassword();
                        } else {
                            password2 = str3;
                        }
                        str4 = protocol;
                        i11 = port;
                        password = password2;
                        file = this.url.getFile();
                    } else {
                        property = str;
                        password = str3;
                        str4 = null;
                        file = null;
                        i11 = i10;
                    }
                    if (str4 != null) {
                        if (property == null) {
                            property = this.session.getProperty("mail." + str4 + ".host");
                        }
                        if (property2 == null) {
                            property2 = this.session.getProperty("mail." + str4 + ".user");
                        }
                    }
                    String property3 = property == null ? this.session.getProperty("mail.host") : property;
                    if (property2 == null) {
                        property2 = this.session.getProperty("mail.user");
                    }
                    if (property2 == null) {
                        try {
                            property2 = System.getProperty("user.name");
                        } catch (SecurityException unused) {
                        }
                    }
                    if (password != null || this.url == null) {
                        userName = property2;
                        z10 = false;
                    } else {
                        setURLName(new URLName(str4, property3, i11, file, property2, null));
                        PasswordAuthentication passwordAuthentication = this.session.getPasswordAuthentication(getURLName());
                        if (passwordAuthentication != null) {
                            if (property2 == null) {
                                property2 = passwordAuthentication.getUserName();
                                password = passwordAuthentication.getPassword();
                            } else if (property2.equals(passwordAuthentication.getUserName())) {
                                password = passwordAuthentication.getPassword();
                            }
                            userName = property2;
                            z10 = false;
                        } else {
                            userName = property2;
                            z10 = true;
                        }
                    }
                    try {
                        zProtocolConnect = protocolConnect(property3, i11, userName, password);
                        authenticationFailedException = null;
                    } catch (AuthenticationFailedException e5) {
                        authenticationFailedException = e5;
                        zProtocolConnect = false;
                    }
                    if (!zProtocolConnect) {
                        try {
                            byName = InetAddress.getByName(property3);
                        } catch (UnknownHostException unused2) {
                        }
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = this.session.requestPasswordAuthentication(byName, i11, str4, null, userName);
                        if (passwordAuthenticationRequestPasswordAuthentication != null) {
                            userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                            password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                            zProtocolConnect = protocolConnect(property3, i11, userName, password);
                        }
                    }
                    if (!zProtocolConnect) {
                        if (authenticationFailedException != null) {
                            throw authenticationFailedException;
                        }
                        if (userName == null) {
                            throw new AuthenticationFailedException("failed to connect, no user name specified?");
                        }
                        if (password == null) {
                            throw new AuthenticationFailedException("failed to connect, no password specified?");
                        }
                        throw new AuthenticationFailedException("failed to connect");
                    }
                    setURLName(new URLName(str4, property3, i11, file, userName, password));
                    if (z10) {
                        this.session.setPasswordAuthentication(getURLName(), new PasswordAuthentication(userName, password));
                    }
                    setConnected(true);
                    notifyConnectionListeners(1);
                } else {
                    throw new IllegalStateException("already connected");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
