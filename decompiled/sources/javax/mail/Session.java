package javax.mail;

import androidx.camera.camera2.internal.compat.u;
import androidx.core.app.NotificationCompat;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.StringTokenizer;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Session {
    public static Session m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f78908n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Properties f78909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Authenticator f78910b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PrintStream f78913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MailLogger f78914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f78915g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final javax.mail.a f78920l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hashtable<URLName, PasswordAuthentication> f78911c = new Hashtable<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f78916h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f78917i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Properties f78918j = new Properties();

    public static class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        public final String run() {
            String property = System.getProperty("java.home");
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(property);
            String str = File.separator;
            String strF = ad.d.f(sbD, str, "conf");
            if (new File(strF).exists()) {
                return u.f(strF, str);
            }
            return property + str + "lib" + str;
        }
    }

    public class b implements f {
        public b() {
        }

        @Override // javax.mail.f
        public final void a(InputStream inputStream) throws IOException {
            Session session = Session.m;
            Session session2 = Session.this;
            session2.getClass();
            LineInputStream lineInputStream = new LineInputStream(inputStream);
            while (true) {
                String line = lineInputStream.readLine();
                if (line == null) {
                    return;
                }
                if (!line.startsWith("#") && line.trim().length() != 0) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, ReplenishLogic.ID_SEPARATOR);
                    Provider.Type type = null;
                    String strSubstring = null;
                    String strSubstring2 = null;
                    String strSubstring3 = null;
                    String strSubstring4 = null;
                    while (stringTokenizer.hasMoreTokens()) {
                        String strTrim = stringTokenizer.nextToken().trim();
                        int iIndexOf = strTrim.indexOf("=");
                        if (strTrim.startsWith("protocol=")) {
                            strSubstring = strTrim.substring(iIndexOf + 1);
                        } else if (strTrim.startsWith("type=")) {
                            String strSubstring5 = strTrim.substring(iIndexOf + 1);
                            if (strSubstring5.equalsIgnoreCase("store")) {
                                type = Provider.Type.STORE;
                            } else if (strSubstring5.equalsIgnoreCase(NotificationCompat.CATEGORY_TRANSPORT)) {
                                type = Provider.Type.TRANSPORT;
                            }
                        } else if (strTrim.startsWith("class=")) {
                            strSubstring2 = strTrim.substring(iIndexOf + 1);
                        } else if (strTrim.startsWith("vendor=")) {
                            strSubstring3 = strTrim.substring(iIndexOf + 1);
                        } else if (strTrim.startsWith("version=")) {
                            strSubstring4 = strTrim.substring(iIndexOf + 1);
                        }
                    }
                    if (type == null || strSubstring == null || strSubstring2 == null || strSubstring.length() <= 0 || strSubstring2.length() <= 0) {
                        session2.f78914f.log(Level.CONFIG, "Bad provider entry: {0}", line);
                    } else {
                        session2.addProvider(new Provider(type, strSubstring, strSubstring2, strSubstring3, strSubstring4));
                    }
                }
            }
        }
    }

    public static class c implements PrivilegedExceptionAction<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f78922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f78923b;

        public c(Class cls, String str) {
            this.f78922a = cls;
            this.f78923b = str;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final InputStream run() throws Exception {
            try {
                return this.f78922a.getResourceAsStream(this.f78923b);
            } catch (RuntimeException e5) {
                IOException iOException = new IOException("ClassLoader.getResourceAsStream failed");
                iOException.initCause(e5);
                throw iOException;
            }
        }
    }

    public static class d implements PrivilegedExceptionAction<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ URL f78924a;

        public d(URL url) {
            this.f78924a = url;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final InputStream run() throws Exception {
            return this.f78924a.openStream();
        }
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new a());
        } catch (Exception unused) {
            str = null;
        }
        f78908n = str;
    }

    public Session(Properties properties, Authenticator authenticator) throws Throwable {
        this.f78912d = false;
        this.f78909a = properties;
        this.f78910b = authenticator;
        if (Boolean.valueOf(properties.getProperty("mail.debug")).booleanValue()) {
            this.f78912d = true;
        }
        e();
        this.f78914f.log(Level.CONFIG, "JavaMail version {0}", "1.6.2");
        Class<?> cls = authenticator != null ? authenticator.getClass() : Session.class;
        javax.mail.b bVar = new javax.mail.b(this);
        i("/META-INF/javamail.default.address.map", cls, bVar, true);
        f("META-INF/javamail.address.map", cls, bVar);
        try {
            String str = f78908n;
            if (str != null) {
                g(str.concat("javamail.address.map"), bVar);
            }
        } catch (SecurityException unused) {
        }
        Properties properties2 = this.f78918j;
        if (properties2.isEmpty()) {
            this.f78914f.config("failed to load address map, using defaults");
            properties2.put("rfc822", "smtp");
        }
        this.f78920l = new javax.mail.a((Executor) properties.get("mail.event.executor"));
    }

    public static InputStream c(Class<?> cls, String str) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new c(cls, str));
        } catch (PrivilegedActionException e5) {
            throw ((IOException) e5.getException());
        }
    }

    public static synchronized Session getDefaultInstance(Properties properties, Authenticator authenticator) {
        try {
            Session session = m;
            if (session == null) {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    securityManager.checkSetFactory();
                }
                m = new Session(properties, authenticator);
            } else {
                Authenticator authenticator2 = session.f78910b;
                if (authenticator2 != authenticator && (authenticator2 == null || authenticator == null || authenticator2.getClass().getClassLoader() != authenticator.getClass().getClassLoader())) {
                    throw new SecurityException("Access to default session denied");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m;
    }

    public static Session getInstance(Properties properties, Authenticator authenticator) {
        return new Session(properties, authenticator);
    }

    public static InputStream j(URL url) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new d(url));
        } catch (PrivilegedActionException e5) {
            throw ((IOException) e5.getException());
        }
    }

    public final Provider a(String str) throws Throwable {
        HashMap map = this.f78917i;
        Provider provider = (Provider) map.get(str);
        if (provider != null) {
            return provider;
        }
        for (Provider provider2 : ServiceLoader.load(Provider.class)) {
            if (str.equals(provider2.getClassName())) {
                return provider2;
            }
        }
        if (this.f78919k) {
            return provider;
        }
        h(true);
        return (Provider) map.get(str);
    }

    public synchronized void addProvider(Provider provider) {
        try {
            if (this.f78915g == null) {
                this.f78915g = new ArrayList();
            }
            this.f78915g.add(provider);
            this.f78917i.put(provider.getClassName(), provider);
            if (!this.f78916h.containsKey(provider.getProtocol())) {
                this.f78916h.put(provider.getProtocol(), provider);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Provider b(String str) throws Throwable {
        HashMap map = this.f78916h;
        Provider provider = (Provider) map.get(str);
        if (provider != null) {
            return provider;
        }
        for (Provider provider2 : ServiceLoader.load(Provider.class)) {
            if (str.equals(provider2.getProtocol())) {
                return provider2;
            }
        }
        if (this.f78919k) {
            return provider;
        }
        h(true);
        return (Provider) map.get(str);
    }

    public final <T extends Service> T d(Provider provider, URLName uRLName, Class<T> cls) throws NoSuchProviderException {
        Class<?> cls2;
        if (provider == null) {
            throw new NoSuchProviderException(AbstractJsonLexerKt.NULL);
        }
        if (uRLName == null) {
            uRLName = new URLName(provider.getProtocol(), null, -1, null, null, null);
        }
        Authenticator authenticator = this.f78910b;
        ClassLoader classLoader = authenticator != null ? authenticator.getClass().getClassLoader() : Session.class.getClassLoader();
        try {
            try {
                ClassLoader classLoader2 = (ClassLoader) AccessController.doPrivileged(new javax.mail.c());
                if (classLoader2 != null) {
                    try {
                        cls2 = Class.forName(provider.getClassName(), false, classLoader2);
                    } catch (ClassNotFoundException unused) {
                        cls2 = null;
                    }
                } else {
                    cls2 = null;
                }
                if (cls2 == null || !cls.isAssignableFrom(cls2)) {
                    cls2 = Class.forName(provider.getClassName(), false, classLoader);
                }
                if (!cls.isAssignableFrom(cls2)) {
                    throw new ClassCastException(cls.getName() + " " + cls2.getName());
                }
            } catch (Exception unused2) {
                cls2 = Class.forName(provider.getClassName());
                if (!cls.isAssignableFrom(cls2)) {
                    throw new ClassCastException(cls.getName() + " " + cls2.getName());
                }
            }
            try {
                return cls.cast(cls2.getConstructor(Session.class, URLName.class).newInstance(this, uRLName));
            } catch (Exception e5) {
                this.f78914f.log(Level.FINE, "Exception loading provider", (Throwable) e5);
                throw new NoSuchProviderException(provider.getProtocol());
            }
        } catch (Exception e7) {
            this.f78914f.log(Level.FINE, "Exception loading provider", (Throwable) e7);
            throw new NoSuchProviderException(provider.getProtocol());
        }
    }

    public final synchronized void e() {
        this.f78914f = new MailLogger((Class<?>) Session.class, "DEBUG", this.f78912d, getDebugOut());
    }

    public final void f(String str, Class<?> cls, f fVar) {
        boolean z10;
        try {
            ClassLoader classLoader = (ClassLoader) AccessController.doPrivileged(new javax.mail.c());
            if (classLoader == null) {
                classLoader = cls.getClassLoader();
            }
            URL[] urlArr = classLoader != null ? (URL[]) AccessController.doPrivileged(new javax.mail.d(classLoader, str)) : (URL[]) AccessController.doPrivileged(new e(str));
            if (urlArr != null) {
                z10 = false;
                for (URL url : urlArr) {
                    try {
                        MailLogger mailLogger = this.f78914f;
                        Level level = Level.CONFIG;
                        mailLogger.log(level, "URL {0}", url);
                        InputStream inputStreamJ = null;
                        try {
                            try {
                                try {
                                    inputStreamJ = j(url);
                                    if (inputStreamJ != null) {
                                        fVar.a(inputStreamJ);
                                        z10 = true;
                                        this.f78914f.log(level, "successfully loaded resource: {0}", url);
                                    } else {
                                        this.f78914f.log(level, "not loading resource: {0}", url);
                                    }
                                    if (inputStreamJ != null) {
                                        try {
                                            inputStreamJ.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (IOException e5) {
                                    this.f78914f.log(Level.CONFIG, "Exception loading resource", (Throwable) e5);
                                    if (inputStreamJ != null) {
                                    }
                                }
                            } catch (Throwable th2) {
                                if (inputStreamJ != null) {
                                    try {
                                        inputStreamJ.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th2;
                            }
                        } catch (FileNotFoundException unused3) {
                            if (inputStreamJ != null) {
                            }
                        } catch (SecurityException e7) {
                            this.f78914f.log(Level.CONFIG, "Exception loading resource", (Throwable) e7);
                            if (inputStreamJ != null) {
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        this.f78914f.log(Level.CONFIG, "Exception loading resource", (Throwable) e);
                    }
                }
                if (z10) {
                    return;
                }
            }
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        }
        i("/".concat(str), cls, fVar, false);
    }

    public final void g(String str, f fVar) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
                    try {
                        fVar.a(bufferedInputStream2);
                        this.f78914f.log(Level.CONFIG, "successfully loaded file: {0}", str);
                        bufferedInputStream2.close();
                    } catch (FileNotFoundException unused) {
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream == null) {
                            return;
                        }
                        bufferedInputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        bufferedInputStream = bufferedInputStream2;
                        MailLogger mailLogger = this.f78914f;
                        Level level = Level.CONFIG;
                        if (mailLogger.isLoggable(level)) {
                            this.f78914f.log(level, "not loading file: " + str, (Throwable) e);
                        }
                        if (bufferedInputStream == null) {
                            return;
                        }
                        bufferedInputStream.close();
                    } catch (SecurityException e7) {
                        e = e7;
                        bufferedInputStream = bufferedInputStream2;
                        MailLogger mailLogger2 = this.f78914f;
                        Level level2 = Level.CONFIG;
                        if (mailLogger2.isLoggable(level2)) {
                            this.f78914f.log(level2, "not loading file: " + str, (Throwable) e);
                        }
                        if (bufferedInputStream == null) {
                            return;
                        }
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (FileNotFoundException unused4) {
            } catch (IOException e10) {
                e = e10;
            } catch (SecurityException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public synchronized boolean getDebug() {
        return this.f78912d;
    }

    public synchronized PrintStream getDebugOut() {
        PrintStream printStream = this.f78913e;
        if (printStream != null) {
            return printStream;
        }
        return System.out;
    }

    public Folder getFolder(URLName uRLName) throws MessagingException {
        Store store = getStore(uRLName);
        store.connect();
        return store.getFolder(uRLName);
    }

    public PasswordAuthentication getPasswordAuthentication(URLName uRLName) {
        return this.f78911c.get(uRLName);
    }

    public Properties getProperties() {
        return this.f78909a;
    }

    public String getProperty(String str) {
        return this.f78909a.getProperty(str);
    }

    public synchronized Provider getProvider(String str) throws NoSuchProviderException {
        Provider providerB;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    String property = this.f78909a.getProperty("mail." + str + ".class");
                    if (property != null) {
                        if (this.f78914f.isLoggable(Level.FINE)) {
                            this.f78914f.fine("mail." + str + ".class property exists and points to " + property);
                        }
                        providerB = a(property);
                    } else {
                        providerB = null;
                    }
                    if (providerB == null) {
                        providerB = b(str);
                    }
                    if (providerB == null) {
                        throw new NoSuchProviderException("No provider for ".concat(str));
                    }
                    if (this.f78914f.isLoggable(Level.FINE)) {
                        this.f78914f.fine("getProvider() returning " + providerB.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        throw new NoSuchProviderException("Invalid protocol: null");
        return providerB;
    }

    public synchronized Provider[] getProviders() {
        Provider[] providerArr;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ServiceLoader.load(Provider.class).iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                arrayList.add((Provider) it.next());
                z10 = false;
            }
            if (!this.f78919k) {
                h(z10);
            }
            ArrayList arrayList2 = this.f78915g;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            providerArr = new Provider[arrayList.size()];
            arrayList.toArray(providerArr);
        } catch (Throwable th2) {
            throw th2;
        }
        return providerArr;
    }

    public Store getStore() throws NoSuchProviderException {
        return getStore(getProperty("mail.store.protocol"));
    }

    public Transport getTransport() throws NoSuchProviderException {
        String property = getProperty("mail.transport.protocol");
        if (property != null) {
            return getTransport(property);
        }
        String str = (String) this.f78918j.get("rfc822");
        return str != null ? getTransport(str) : getTransport("smtp");
    }

    public final void h(boolean z10) throws Throwable {
        b bVar = new b();
        try {
            String str = f78908n;
            if (str != null) {
                g(str.concat("javamail.providers"), bVar);
            }
        } catch (SecurityException unused) {
        }
        Authenticator authenticator = this.f78910b;
        Class<?> cls = authenticator != null ? authenticator.getClass() : Session.class;
        f("META-INF/javamail.providers", cls, bVar);
        i("/META-INF/javamail.default.providers", cls, bVar, false);
        ArrayList arrayList = this.f78915g;
        if ((arrayList == null || arrayList.size() == 0) && z10) {
            this.f78914f.config("failed to load any providers, using defaults");
            Provider.Type type = Provider.Type.STORE;
            addProvider(new Provider(type, "imap", "com.sun.mail.imap.IMAPStore", "Oracle", "1.6.2"));
            addProvider(new Provider(type, "imaps", "com.sun.mail.imap.IMAPSSLStore", "Oracle", "1.6.2"));
            addProvider(new Provider(type, "pop3", "com.sun.mail.pop3.POP3Store", "Oracle", "1.6.2"));
            addProvider(new Provider(type, "pop3s", "com.sun.mail.pop3.POP3SSLStore", "Oracle", "1.6.2"));
            Provider.Type type2 = Provider.Type.TRANSPORT;
            addProvider(new Provider(type2, "smtp", "com.sun.mail.smtp.SMTPTransport", "Oracle", "1.6.2"));
            addProvider(new Provider(type2, "smtps", "com.sun.mail.smtp.SMTPSSLTransport", "Oracle", "1.6.2"));
        }
        if (this.f78914f.isLoggable(Level.CONFIG)) {
            this.f78914f.config("Tables of loaded providers from javamail.providers");
            this.f78914f.config("Providers Listed By Class Name: " + this.f78917i.toString());
            this.f78914f.config("Providers Listed By Protocol: " + this.f78916h.toString());
        }
        this.f78919k = true;
    }

    public final void i(String str, Class<?> cls, f fVar, boolean z10) {
        InputStream inputStreamC = null;
        try {
            inputStreamC = c(cls, str);
            if (inputStreamC != null) {
                fVar.a(inputStreamC);
                this.f78914f.log(Level.CONFIG, "successfully loaded resource: {0}", str);
            } else if (z10) {
                this.f78914f.log(Level.WARNING, "expected resource not found: {0}", str);
            }
        } catch (IOException e5) {
            this.f78914f.log(Level.CONFIG, "Exception loading resource", (Throwable) e5);
        } catch (SecurityException e7) {
            this.f78914f.log(Level.CONFIG, "Exception loading resource", (Throwable) e7);
        } finally {
            if (0 != 0) {
                try {
                    inputStreamC.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public PasswordAuthentication requestPasswordAuthentication(InetAddress inetAddress, int i10, String str, String str2, String str3) {
        PasswordAuthentication passwordAuthentication;
        Authenticator authenticator = this.f78910b;
        if (authenticator == null) {
            return null;
        }
        synchronized (authenticator) {
            authenticator.f78876a = inetAddress;
            authenticator.f78877b = i10;
            authenticator.f78878c = str;
            authenticator.f78879d = str2;
            authenticator.f78880e = str3;
            passwordAuthentication = authenticator.getPasswordAuthentication();
        }
        return passwordAuthentication;
    }

    public synchronized void setDebug(boolean z10) {
        this.f78912d = z10;
        e();
        this.f78914f.log(Level.CONFIG, "setDebug: JavaMail version {0}", "1.6.2");
    }

    public synchronized void setDebugOut(PrintStream printStream) {
        this.f78913e = printStream;
        e();
    }

    public void setPasswordAuthentication(URLName uRLName, PasswordAuthentication passwordAuthentication) {
        Hashtable<URLName, PasswordAuthentication> hashtable = this.f78911c;
        if (passwordAuthentication == null) {
            hashtable.remove(uRLName);
        } else {
            hashtable.put(uRLName, passwordAuthentication);
        }
    }

    public synchronized void setProtocolForAddress(String str, String str2) {
        try {
            if (str2 == null) {
                this.f78918j.remove(str);
            } else {
                this.f78918j.put(str, str2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setProvider(Provider provider) throws NoSuchProviderException {
        try {
            if (provider == null) {
                throw new NoSuchProviderException("Can't set null provider");
            }
            this.f78916h.put(provider.getProtocol(), provider);
            this.f78917i.put(provider.getClassName(), provider);
            this.f78909a.put("mail." + provider.getProtocol() + ".class", provider.getClassName());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static Session getInstance(Properties properties) {
        return new Session(properties, null);
    }

    public Store getStore(String str) throws NoSuchProviderException {
        return getStore(new URLName(str, null, -1, null, null, null));
    }

    public Store getStore(URLName uRLName) throws NoSuchProviderException {
        Provider provider = getProvider(uRLName.getProtocol());
        if (provider != null && provider.getType() == Provider.Type.STORE) {
            return (Store) d(provider, uRLName, Store.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }

    public Transport getTransport(String str) throws NoSuchProviderException {
        return getTransport(new URLName(str, null, -1, null, null, null));
    }

    public Transport getTransport(URLName uRLName) throws NoSuchProviderException {
        Provider provider = getProvider(uRLName.getProtocol());
        if (provider != null && provider.getType() == Provider.Type.TRANSPORT) {
            return (Transport) d(provider, uRLName, Transport.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }

    public Store getStore(Provider provider) throws NoSuchProviderException {
        if (provider != null && provider.getType() == Provider.Type.STORE) {
            return (Store) d(provider, null, Store.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }

    public static Session getDefaultInstance(Properties properties) {
        return getDefaultInstance(properties, null);
    }

    public Transport getTransport(Address address) throws NoSuchProviderException {
        String property = getProperty("mail.transport.protocol." + address.getType());
        if (property != null) {
            return getTransport(property);
        }
        String str = (String) this.f78918j.get(address.getType());
        if (str != null) {
            return getTransport(str);
        }
        throw new NoSuchProviderException("No provider for Address type: " + address.getType());
    }

    public Transport getTransport(Provider provider) throws NoSuchProviderException {
        if (provider != null && provider.getType() == Provider.Type.TRANSPORT) {
            return (Transport) d(provider, null, Transport.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }
}
