package com.sun.mail.util.logging;

import androidx.collection.g;
import androidx.core.app.NotificationCompat;
import androidx.webkit.internal.AssetHelper;
import com.bbva.ethermobilesdk.sharedstorage.ConstantsKt;
import com.mypinpad.tsdk.isolation.y2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;
import java.util.logging.SimpleFormatter;
import javax.activation.DataHandler;
import javax.activation.FileTypeMap;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessageContext;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimePart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class MailHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f65637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Properties f65639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Authenticator f65640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Session f65641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f65642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LogRecord[] f65643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f65644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f65645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Comparator<? super LogRecord> f65646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Formatter f65647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Level f65648l;
    public Filter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Filter f65649n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile Filter[] f65651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f65652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Formatter f65653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Formatter[] f65654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Formatter[] f65655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FileTypeMap f65656u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Filter[] f65633w = new Filter[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Formatter[] f65634x = new Formatter[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f65635y = Level.OFF.intValue();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f65636z = new b(MailHandler.class);
    public static final ThreadLocal<Integer> A = new ThreadLocal<>();
    public static final Integer B = -2;
    public static final Integer C = -4;
    public static final Integer D = -8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Level f65650o = Level.ALL;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile ErrorManager f65657v = n();

    public static final class a extends Authenticator {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f65658f;

        public a(String str) {
            this.f65658f = str;
        }

        @Override // javax.mail.Authenticator
        public final PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(getDefaultUserName(), this.f65658f);
        }
    }

    public static final class b implements PrivilegedAction<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f65659a;

        public b(Object obj) {
            this.f65659a = obj;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            ClassLoader contextClassLoader;
            Thread threadCurrentThread = Thread.currentThread();
            ClassLoader contextClassLoader2 = threadCurrentThread.getContextClassLoader();
            Object obj = this.f65659a;
            if (obj == null) {
                contextClassLoader = null;
            } else if (obj instanceof ClassLoader) {
                contextClassLoader = (ClassLoader) obj;
            } else if (obj instanceof Class) {
                contextClassLoader = ((Class) obj).getClassLoader();
            } else {
                contextClassLoader = obj instanceof Thread ? ((Thread) obj).getContextClassLoader() : obj.getClass().getClassLoader();
            }
            if (contextClassLoader2 == contextClassLoader) {
                return b.class;
            }
            threadCurrentThread.setContextClassLoader(contextClassLoader);
            return contextClassLoader2;
        }
    }

    public static final class c extends Formatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65660a;

        public c(String str) {
            this.f65660a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f65660a.equals(((c) obj).f65660a);
        }

        @Override // java.util.logging.Formatter
        public final String format(LogRecord logRecord) {
            return "";
        }

        @Override // java.util.logging.Formatter
        public final String getTail(Handler handler) {
            return this.f65660a;
        }

        public final int hashCode() {
            return this.f65660a.hashCode() + c.class.hashCode();
        }

        public final String toString() {
            return this.f65660a;
        }
    }

    public MailHandler() {
        x(null);
        this.f65637a = true;
        h();
    }

    public static boolean J(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [javax.mail.MessagingException] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static boolean K(MimeMessage mimeMessage, MessagingException messagingException) {
        Object objS = s(f65636z);
        try {
            try {
                try {
                    mimeMessage.writeTo(new ByteArrayOutputStream(1024));
                } catch (Exception e5) {
                    String message = e5.getMessage();
                    if (!J(message)) {
                        int i10 = 0;
                        while (messagingException != 0) {
                            if (e5.getClass() == messagingException.getClass() && message.equals(messagingException.getMessage())) {
                                s(objS);
                                return true;
                            }
                            Throwable cause = messagingException.getCause();
                            messagingException = (cause == null && (messagingException instanceof MessagingException)) ? ((MessagingException) messagingException).getNextException() : cause;
                            i10++;
                            if (i10 == 65536) {
                                break;
                            }
                        }
                    }
                }
                s(objS);
                return false;
            } catch (RuntimeException e7) {
                throw e7;
            }
        } catch (Throwable th2) {
            s(objS);
            throw th2;
        }
    }

    public static void N() {
        A.remove();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r4.set(r0);
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(int r4, java.lang.Throwable r5) {
        /*
            java.lang.ThreadLocal<java.lang.Integer> r4 = com.sun.mail.util.logging.MailHandler.A
            java.lang.Object r0 = r4.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Integer r1 = com.sun.mail.util.logging.MailHandler.D
            if (r0 == 0) goto L16
            int r2 = r0.intValue()
            int r3 = r1.intValue()
            if (r2 <= r3) goto L40
        L16:
            r4.set(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L3d
            java.lang.Thread$UncaughtExceptionHandler r1 = r1.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L3d
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L3d
            r1.uncaughtException(r2, r5)     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L3d
            if (r0 == 0) goto L2e
        L2a:
            r4.set(r0)
            goto L40
        L2e:
            r4.remove()
            goto L40
        L32:
            r5 = move-exception
            if (r0 == 0) goto L39
            r4.set(r0)
            goto L3c
        L39:
            r4.remove()
        L3c:
            throw r5
        L3d:
            if (r0 == 0) goto L2e
            goto L2a
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.P(int, java.lang.Throwable):void");
    }

    public static String e0(MimeMessage mimeMessage) throws MessagingException, IOException {
        Object objS = s(f65636z);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(mimeMessage.getSize() + 1024, 1024));
            mimeMessage.writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toString("UTF-8");
        } finally {
            s(objS);
        }
    }

    public static String f(int i10) {
        return g.a("At index: ", i10, '.');
    }

    public static void f0(Address[] addressArr) throws AddressException {
        if (addressArr != null) {
            for (Address address : addressArr) {
                if (address instanceof InternetAddress) {
                    ((InternetAddress) address).validate();
                }
            }
        }
    }

    public static IndexOutOfBoundsException g(int i10, int i11) {
        return new IndexOutOfBoundsException(g.b("Attachments mismatched, expected ", i10, " but given ", i11, '.'));
    }

    public static void g0(String str) throws IOException {
        if ((J(str) ? InetAddress.getLocalHost() : InetAddress.getByName(str)).getCanonicalHostName().length() == 0) {
            throw new UnknownHostException();
        }
    }

    public static void h0(Session session, String str) {
        session.getProperty("mail.from");
        session.getProperty("mail." + str + ".from");
        session.getProperty("mail.dsn.ret");
        session.getProperty("mail." + str + ".dsn.ret");
        session.getProperty("mail.dsn.notify");
        session.getProperty("mail." + str + ".dsn.notify");
        session.getProperty("mail." + str + ".port");
        session.getProperty("mail.user");
        session.getProperty("mail." + str + ".user");
        session.getProperty("mail." + str + ".localport");
    }

    public static Formatter m() {
        return (Formatter) Formatter.class.cast(new SimpleFormatter());
    }

    public static String o(Comparator comparator, Level level, Filter filter) {
        StringBuilder sb2 = new StringBuilder("Sorted using ");
        sb2.append(comparator == null ? "no comparator" : comparator.getClass().getName());
        sb2.append(", pushed when ");
        sb2.append(level.getName());
        sb2.append(", and ");
        return y2.b(sb2, filter == null ? "no push filter" : filter.getClass().getName(), '.');
    }

    public static String p(Formatter formatter, Filter filter, Formatter formatter2) {
        StringBuilder sb2 = new StringBuilder("Formatted using ");
        sb2.append(t(formatter));
        sb2.append(", filtered with ");
        sb2.append(filter == null ? "no filter" : filter.getClass().getName());
        sb2.append(", and named by ");
        sb2.append(t(formatter2));
        sb2.append('.');
        return sb2.toString();
    }

    public static Object s(Object obj) {
        if (obj != b.class) {
            try {
                return AccessController.doPrivileged(obj instanceof PrivilegedAction ? (PrivilegedAction) obj : new b(obj));
            } catch (SecurityException unused) {
            }
        }
        return b.class;
    }

    public static String t(Formatter formatter) {
        return formatter instanceof c ? String.class.getName() : formatter.getClass().getName();
    }

    public static Session u(MimeMessage mimeMessage) {
        return new MessageContext(mimeMessage).getSession();
    }

    public static boolean v(String str) {
        return (J(str) || AbstractJsonLexerKt.NULL.equalsIgnoreCase(str)) ? false : true;
    }

    public final void A(String str) {
        String strB = ti.b.b(str.concat(".attachment.names"));
        if (J(strB)) {
            this.f65655t = f65634x;
            b();
            return;
        }
        String[] strArrSplit = strB.split(",");
        int length = strArrSplit.length;
        Formatter[] formatterArr = new Formatter[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(strTrim)) {
                reportError("Attachment names.", new NullPointerException(f(i10)), 4);
            } else {
                try {
                    try {
                        formatterArr[i10] = (Formatter) ti.b.f(Formatter.class, strArrSplit[i10]);
                    } catch (ClassCastException | ClassNotFoundException unused) {
                        formatterArr[i10] = new c(strArrSplit[i10]);
                    }
                } catch (SecurityException e5) {
                    throw e5;
                } catch (Exception e7) {
                    reportError(e7.getMessage(), e7, 4);
                }
            }
        }
        this.f65655t = formatterArr;
        if (b()) {
            reportError("Attachment names.", new IndexOutOfBoundsException("Length mismatch."), 4);
        }
    }

    public final void B(String str) {
        String strB = ti.b.b(str.concat(".authenticator"));
        if (strB == null || AbstractJsonLexerKt.NULL.equalsIgnoreCase(strB)) {
            return;
        }
        if (strB.length() == 0) {
            this.f65640d = new a(strB);
            return;
        }
        try {
            this.f65640d = (Authenticator) ti.b.f(Authenticator.class, strB);
        } catch (ClassCastException | ClassNotFoundException unused) {
            this.f65640d = new a(strB);
        } catch (SecurityException e5) {
            throw e5;
        } catch (Exception e7) {
            reportError(e7.getMessage(), e7, 4);
        }
    }

    public final void C(String str) {
        try {
            String strB = ti.b.b(str.concat(".capacity"));
            if (strB != null) {
                V(Integer.parseInt(strB));
            } else {
                V(1000);
            }
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e7) {
            reportError(e7.getMessage(), e7, 4);
        }
        if (this.f65645i <= 0) {
            this.f65645i = 1000;
        }
        this.f65643g = new LogRecord[1];
        this.f65642f = new int[1];
    }

    public final void D(String str) {
        try {
            String strB = ti.b.b(str.concat(".comparator"));
            String strB2 = ti.b.b(str.concat(".comparator.reverse"));
            if (!v(strB)) {
                if (!J(strB2)) {
                    throw new IllegalArgumentException("No comparator to reverse.");
                }
            } else {
                this.f65646j = (Comparator) ti.b.f(Comparator.class, strB);
                if (Boolean.parseBoolean(strB2)) {
                    this.f65646j = ti.b.j(this.f65646j);
                }
            }
        } catch (SecurityException e5) {
            throw e5;
        } catch (Exception e7) {
            reportError(e7.getMessage(), e7, 4);
        }
    }

    public final void E(String str) {
        try {
            String strB = ti.b.b(str.concat(".formatter"));
            if (v(strB)) {
                Formatter formatter = (Formatter) ti.b.f(Formatter.class, strB);
                if (formatter instanceof c) {
                    this.f65653r = m();
                } else {
                    this.f65653r = formatter;
                }
            } else {
                this.f65653r = m();
            }
        } catch (SecurityException e5) {
            throw e5;
        } catch (Exception e7) {
            reportError(e7.getMessage(), e7, 4);
            this.f65653r = m();
        }
    }

    public final Session F() {
        Session session = Session.getInstance(new ti.b(this.f65639c, getClass().getName()), this.f65640d);
        this.f65641e = session;
        return session;
    }

    public final void G(String str) {
        String strB = ti.b.b(str.concat(".subject"));
        if (strB == null) {
            strB = "com.sun.mail.util.logging.CollectorFormatter";
        }
        if (!v(strB)) {
            this.f65647k = new c(strB);
            return;
        }
        try {
            this.f65647k = (Formatter) ti.b.f(Formatter.class, strB);
        } catch (ClassCastException | ClassNotFoundException unused) {
            this.f65647k = new c(strB);
        } catch (SecurityException e5) {
            throw e5;
        } catch (Exception e7) {
            this.f65647k = new c(strB);
            reportError(e7.getMessage(), e7, 4);
        }
    }

    public final Object H(Object obj, HashMap map) throws Exception {
        if (obj == null) {
            return null;
        }
        Object objNewInstance = obj.getClass().getName().equals(c.class.getName()) ? obj : obj.getClass().getConstructor(new Class[0]).newInstance(new Object[0]);
        if (objNewInstance.getClass() != obj.getClass()) {
            return obj;
        }
        Object obj2 = map.get(objNewInstance);
        if (obj2 != null) {
            if (obj.getClass() == obj2.getClass()) {
                return obj2;
            }
            Q(obj, obj2);
            return obj;
        }
        boolean zEquals = objNewInstance.equals(obj);
        boolean zEquals2 = obj.equals(objNewInstance);
        if (!zEquals || !zEquals2) {
            if (zEquals == zEquals2) {
                return obj;
            }
            reportError("Non symmetric equals implementation.", new IllegalArgumentException(obj.getClass().getName() + " is not equal to " + objNewInstance.getClass().getName()), 4);
            return obj;
        }
        Object objPut = map.put(obj, obj);
        if (objPut == null) {
            return obj;
        }
        Q(objNewInstance, objPut);
        Object objRemove = map.remove(objNewInstance);
        if (objRemove == obj) {
            return obj;
        }
        Q(objNewInstance, objRemove);
        map.clear();
        return obj;
    }

    public final void I() {
        int i10;
        try {
            HashMap map = new HashMap();
            try {
                H(this.f65657v, map);
            } catch (SecurityException e5) {
                reportError(e5.getMessage(), e5, 4);
            }
            try {
                Filter filter = this.f65649n;
                Object objH = H(filter, map);
                if (objH != filter && (objH instanceof Filter)) {
                    this.f65649n = (Filter) objH;
                }
                Formatter formatter = this.f65653r;
                Object objH2 = H(formatter, map);
                if (objH2 != formatter && (objH2 instanceof Formatter)) {
                    this.f65653r = (Formatter) objH2;
                }
                while (true) {
                    Formatter[] formatterArr = this.f65654s;
                    if (i10 >= formatterArr.length) {
                        return;
                    }
                    Formatter formatter2 = formatterArr[i10];
                    Object objH3 = H(formatter2, map);
                    if (objH3 != formatter2 && (objH3 instanceof Formatter)) {
                        this.f65654s[i10] = (Formatter) objH3;
                    }
                    Filter filter2 = this.f65651p[i10];
                    Object objH4 = H(filter2, map);
                    if (objH4 != filter2 && (objH4 instanceof Filter)) {
                        this.f65651p[i10] = (Filter) objH4;
                    }
                    Formatter formatter3 = this.f65655t[i10];
                    Object objH5 = H(formatter3, map);
                    if (objH5 != formatter3 && (objH5 instanceof Formatter)) {
                        this.f65655t[i10] = (Formatter) objH5;
                    }
                    i10++;
                }
            } catch (SecurityException e7) {
                reportError(e7.getMessage(), e7, 4);
            }
            Formatter formatter4 = this.f65647k;
            Object objH6 = H(formatter4, map);
            if (objH6 != formatter4 && (objH6 instanceof Formatter)) {
                this.f65647k = (Formatter) objH6;
            }
            Filter filter3 = this.m;
            Object objH7 = H(filter3, map);
            if (objH7 != filter3 && (objH7 instanceof Filter)) {
                this.m = (Filter) objH7;
            }
            i10 = 0;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, 4);
        } catch (LinkageError e11) {
            reportError(e11.getMessage(), new InvocationTargetException(e11), 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public final void L(LogRecord logRecord) {
        MimeMessage mimeMessageK0;
        boolean zIsLoggable;
        int i10;
        synchronized (this) {
            try {
                int i11 = this.f65644h;
                LogRecord[] logRecordArr = this.f65643g;
                if (i11 == logRecordArr.length && i11 < (i10 = this.f65645i)) {
                    int length = logRecordArr.length;
                    int i12 = (length >> 1) + length + 1;
                    if (i12 <= i10 && i12 >= length) {
                        i10 = i12;
                    }
                    this.f65643g = (LogRecord[]) Arrays.copyOf(logRecordArr, i10, LogRecord[].class);
                    this.f65642f = Arrays.copyOf(this.f65642f, i10);
                }
                int i13 = this.f65644h;
                mimeMessageK0 = null;
                zIsLoggable = false;
                if (i13 < this.f65643g.length) {
                    int[] iArr = this.f65642f;
                    ThreadLocal<Integer> threadLocal = A;
                    Integer num = threadLocal.get();
                    if (num == null || num.intValue() >= this.f65651p.length) {
                        num = B;
                    }
                    iArr[i13] = num.intValue();
                    LogRecord[] logRecordArr2 = this.f65643g;
                    int i14 = this.f65644h;
                    logRecordArr2[i14] = logRecord;
                    this.f65644h = i14 + 1;
                    int iIntValue = getPushLevel().intValue();
                    if (iIntValue != f65635y && logRecord.getLevel().intValue() >= iIntValue) {
                        Filter pushFilter = getPushFilter();
                        if (pushFilter != null) {
                            Integer num2 = threadLocal.get();
                            if (num2 == null || num2.intValue() >= this.f65651p.length) {
                                num2 = B;
                            }
                            int iIntValue2 = num2.intValue();
                            if (!(iIntValue2 == -1 && getFilter() == pushFilter) && (iIntValue2 < 0 || this.f65651p[iIntValue2] != pushFilter)) {
                                zIsLoggable = pushFilter.isLoggable(logRecord);
                            } else {
                                zIsLoggable = true;
                            }
                        } else {
                            zIsLoggable = true;
                        }
                    }
                    if (zIsLoggable || this.f65644h >= this.f65645i) {
                        mimeMessageK0 = k0(1);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mimeMessageK0 != null) {
            S(mimeMessageK0, zIsLoggable, 1);
        }
    }

    public final void M(int i10, boolean z10) {
        ThreadLocal<Integer> threadLocal = A;
        if (threadLocal.get() != null) {
            R(null);
            return;
        }
        threadLocal.set(B);
        try {
            try {
                MimeMessage mimeMessageK0 = k0(i10);
                if (mimeMessageK0 != null) {
                    S(mimeMessageK0, z10, i10);
                }
            } catch (LinkageError e5) {
                P(i10, e5);
            }
        } finally {
            N();
        }
    }

    public final void O(MimeMessage mimeMessage, Exception exc, int i10) {
        try {
            try {
                this.f65657v.error(e0(mimeMessage), exc, i10);
            } catch (RuntimeException e5) {
                reportError(d0(e5), exc, i10);
            } catch (Exception e7) {
                reportError(d0(e7), exc, i10);
            }
        } catch (LinkageError e10) {
            P(i10, e10);
        }
    }

    public final void Q(Object obj, Object obj2) {
        reportError("Non discriminating equals implementation.", new IllegalArgumentException(obj.getClass().getName() + " should not be equal to " + obj2.getClass().getName()), 4);
    }

    public final void R(LogRecord logRecord) {
        String str;
        ThreadLocal<Integer> threadLocal = A;
        Integer num = threadLocal.get();
        Integer num2 = C;
        if (num == null || num.intValue() > num2.intValue()) {
            threadLocal.set(num2);
            if (logRecord != null) {
                try {
                    Formatter formatterM = m();
                    str = "Log record " + logRecord.getSequenceNumber() + " was not published. " + w(formatterM) + r(formatterM, logRecord) + c0(formatterM, "");
                } finally {
                    if (num != null) {
                        threadLocal.set(num);
                    } else {
                        threadLocal.remove();
                    }
                }
            } else {
                str = null;
            }
            reportError(str, new IllegalStateException("Recursive publish detected by thread " + Thread.currentThread()), 1);
        }
    }

    public final void S(MimeMessage mimeMessage, boolean z10, int i10) {
        try {
            q(mimeMessage, z10);
            Object objS = s(f65636z);
            try {
                Transport.send(mimeMessage);
            } finally {
                s(objS);
            }
        } catch (RuntimeException e5) {
            O(mimeMessage, e5, i10);
        } catch (Exception e7) {
            O(mimeMessage, e7, i10);
        }
    }

    public final void T(MimePart mimePart) {
        try {
            String strK = ti.b.k(Locale.getDefault());
            if (strK.length() != 0) {
                mimePart.setHeader("Accept-Language", strK);
            }
        } catch (MessagingException e5) {
            reportError(e5.getMessage(), e5, 5);
        }
    }

    public final void U(Authenticator authenticator) throws Exception {
        Session sessionF;
        h();
        synchronized (this) {
            if (this.f65638b) {
                throw new IllegalStateException();
            }
            this.f65640d = authenticator;
            if (this.f65639c.getProperty("verify") != null) {
                sessionF = F();
            } else {
                sessionF = null;
                this.f65641e = null;
            }
        }
        i0(sessionF);
    }

    public final synchronized void V(int i10) {
        try {
            h();
            if (i10 <= 0) {
                throw new IllegalArgumentException("Capacity must be greater than zero.");
            }
            if (this.f65638b) {
                throw new IllegalStateException();
            }
            if (this.f65645i < 0) {
                this.f65645i = -i10;
            } else {
                this.f65645i = i10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void W(MimePart mimePart, CharSequence charSequence, String str) throws MessagingException {
        String encoding = getEncoding();
        if (encoding == null) {
            encoding = MimeUtility.getDefaultJavaCharset();
        }
        if (str == null || AssetHelper.DEFAULT_MIME_TYPE.equalsIgnoreCase(str)) {
            mimePart.setText(charSequence.toString(), MimeUtility.mimeCharset(encoding));
            return;
        }
        try {
            ContentType contentType = new ContentType(str);
            contentType.setParameter("charset", MimeUtility.mimeCharset(encoding));
            String string = contentType.toString();
            if (!J(string)) {
                str = string;
            }
        } catch (MessagingException e5) {
            reportError(str, e5, 5);
        }
        try {
            mimePart.setDataHandler(new DataHandler(new ByteArrayDataSource(charSequence.toString(), str)));
        } catch (IOException e7) {
            reportError(e7.getMessage(), e7, 5);
            mimePart.setText(charSequence.toString(), encoding);
        }
    }

    public final void X(String str) throws UnsupportedEncodingException {
        if (str != null) {
            try {
                if (!Charset.isSupported(str)) {
                    throw new UnsupportedEncodingException(str);
                }
            } catch (IllegalCharsetNameException unused) {
                throw new UnsupportedEncodingException(str);
            }
        }
        synchronized (this) {
            this.f65652q = str;
        }
    }

    public final void Y(MimeMessage mimeMessage, String str, Exception exc) {
        MimeBodyPart mimeBodyPartK;
        String strO;
        String strT;
        try {
            synchronized (this) {
                mimeBodyPartK = k();
                strO = o(this.f65646j, this.f65648l, this.m);
                strT = t(this.f65647k);
            }
            mimeBodyPartK.setDescription("Formatted using " + exc.getClass().getName() + ", filtered with " + str + ", and named by " + strT + '.');
            W(mimeBodyPartK, d0(exc), AssetHelper.DEFAULT_MIME_TYPE);
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPartK);
            mimeMessage.setContent(mimeMultipart);
            mimeMessage.setDescription(strO);
            T(mimeMessage);
            mimeMessage.saveChanges();
        } catch (RuntimeException | MessagingException e5) {
            reportError("Unable to create body.", e5, 4);
        }
    }

    public final void Z(ErrorManager errorManager) {
        errorManager.getClass();
        try {
            synchronized (this) {
                try {
                    this.f65657v = errorManager;
                    super.setErrorManager(errorManager);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (LinkageError | RuntimeException unused) {
        }
    }

    public final boolean a() {
        int length = this.f65654s.length;
        int length2 = this.f65651p.length;
        boolean z10 = false;
        if (length2 != length) {
            this.f65651p = (Filter[]) Arrays.copyOf(this.f65651p, length, Filter[].class);
            i(length2);
            z10 = length2 != 0;
            Filter filter = this.f65649n;
            if (filter != null) {
                while (length2 < length) {
                    this.f65651p[length2] = filter;
                    length2++;
                }
            }
        }
        if (length == 0) {
            this.f65651p = f65633w;
        }
        return z10;
    }

    public final void a0(Properties properties) throws Exception {
        Session sessionF;
        h();
        Properties properties2 = (Properties) properties.clone();
        synchronized (this) {
            if (this.f65638b) {
                throw new IllegalStateException();
            }
            this.f65639c = properties2;
            if (properties2.getProperty("verify") != null) {
                sessionF = F();
            } else {
                sessionF = null;
                this.f65641e = null;
            }
        }
        i0(sessionF);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final boolean b() {
        boolean z10;
        int length = this.f65654s.length;
        Formatter[] formatterArr = this.f65655t;
        int length2 = formatterArr.length;
        if (length2 != length) {
            this.f65655t = (Formatter[]) Arrays.copyOf(formatterArr, length, Formatter[].class);
            if (length2 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (length == 0) {
            this.f65655t = f65634x;
        } else {
            for (int i10 = 0; i10 < length; i10++) {
                Formatter[] formatterArr2 = this.f65655t;
                if (formatterArr2[i10] == null) {
                    Formatter formatter = this.f65654s[i10];
                    String string = formatter.toString();
                    if (J(string)) {
                        string = t(formatter);
                    }
                    formatterArr2[i10] = new c(string);
                }
            }
        }
        return z10;
    }

    public final boolean b0(MimeMessage mimeMessage, String str, Message.RecipientType recipientType) {
        String property = u(mimeMessage).getProperty(str);
        boolean z10 = property != null;
        if (!J(property)) {
            try {
                InternetAddress[] internetAddressArr = InternetAddress.parse(property, false);
                if (internetAddressArr.length > 0) {
                    mimeMessage.setRecipients(recipientType, internetAddressArr);
                }
            } catch (MessagingException e5) {
                reportError(e5.getMessage(), e5, 5);
            }
        }
        return z10;
    }

    public final void c(MimePart mimePart, Locale locale) {
        try {
            String strK = ti.b.k(locale);
            if (strK.length() != 0) {
                String header = mimePart.getHeader("Content-Language", null);
                if (J(header)) {
                    mimePart.setHeader("Content-Language", strK);
                    return;
                }
                if (header.equalsIgnoreCase(strK)) {
                    return;
                }
                String strConcat = ",".concat(strK);
                int iIndexOf = 0;
                do {
                    iIndexOf = header.indexOf(strConcat, iIndexOf);
                    if (iIndexOf <= -1 || (iIndexOf = iIndexOf + strConcat.length()) == header.length()) {
                        break;
                    }
                } while (header.charAt(iIndexOf) != ',');
                if (iIndexOf < 0) {
                    int iLastIndexOf = header.lastIndexOf("\r\n\t");
                    mimePart.setHeader("Content-Language", (iLastIndexOf < 0 ? header.length() + 20 : (header.length() - iLastIndexOf) + 8) + strConcat.length() > 76 ? header.concat("\r\n\t".concat(strConcat)) : header.concat(strConcat));
                }
            }
        } catch (MessagingException e5) {
            reportError(e5.getMessage(), e5, 5);
        }
    }

    public final String c0(Formatter formatter, String str) {
        try {
            return formatter.getTail(this);
        } catch (RuntimeException e5) {
            reportError(e5.getMessage(), e5, 5);
            return str;
        }
    }

    @Override // java.util.logging.Handler
    public void close() {
        MimeMessage mimeMessageK0;
        try {
            h();
            synchronized (this) {
                try {
                    try {
                        mimeMessageK0 = k0(3);
                        this.f65650o = Level.OFF;
                        int i10 = this.f65645i;
                        if (i10 > 0) {
                            this.f65645i = -i10;
                        }
                        if (this.f65644h == 0 && this.f65643g.length != 1) {
                            this.f65643g = new LogRecord[1];
                            this.f65642f = new int[1];
                        }
                    } catch (Throwable th2) {
                        this.f65650o = Level.OFF;
                        if (this.f65645i > 0) {
                            this.f65645i = -this.f65645i;
                        }
                        if (this.f65644h == 0 && this.f65643g.length != 1) {
                            this.f65643g = new LogRecord[1];
                            this.f65642f = new int[1];
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (mimeMessageK0 != null) {
                S(mimeMessageK0, false, 3);
            }
        } catch (LinkageError e5) {
            P(3, e5);
        }
    }

    public final void d(MimeBodyPart mimeBodyPart, String str) {
        if (str == null) {
            reportError(AbstractJsonLexerKt.NULL, new NullPointerException(), 5);
            return;
        }
        if (str.length() > 0) {
            try {
                String strReplaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
                String fileName = mimeBodyPart.getFileName();
                if (fileName != null) {
                    strReplaceAll = fileName.concat(strReplaceAll);
                }
                mimeBodyPart.setFileName(strReplaceAll);
            } catch (MessagingException e5) {
                reportError(e5.getMessage(), e5, 5);
            }
        }
    }

    public final String d0(Exception exc) {
        String encoding = getEncoding();
        if (encoding == null) {
            encoding = MimeUtility.getDefaultJavaCharset();
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, encoding);
            try {
                PrintWriter printWriter = new PrintWriter(outputStreamWriter);
                try {
                    printWriter.println(exc.getMessage());
                    exc.printStackTrace(printWriter);
                    printWriter.flush();
                    printWriter.close();
                    outputStreamWriter.close();
                    return byteArrayOutputStream.toString(encoding);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            printWriter.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable th7) {
                        th5.addSuppressed(th7);
                    }
                    throw th6;
                }
            }
        } catch (RuntimeException e5) {
            return exc.toString() + ' ' + e5.toString();
        } catch (Exception e7) {
            return exc.toString() + ' ' + e7.toString();
        }
    }

    public final void e(MimeMessage mimeMessage, String str) {
        if (str == null) {
            reportError(AbstractJsonLexerKt.NULL, new NullPointerException(), 5);
            return;
        }
        if (str.length() > 0) {
            try {
                String strReplaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
                String encoding = getEncoding();
                if (encoding == null) {
                    encoding = MimeUtility.getDefaultJavaCharset();
                }
                String subject = mimeMessage.getSubject();
                if (subject != null) {
                    strReplaceAll = subject.concat(strReplaceAll);
                }
                mimeMessage.setSubject(strReplaceAll, MimeUtility.mimeCharset(encoding));
            } catch (MessagingException e5) {
                reportError(e5.getMessage(), e5, 5);
            }
        }
    }

    @Override // java.util.logging.Handler
    public void flush() {
        M(2, false);
    }

    public final Filter[] getAttachmentFilters() {
        return (Filter[]) this.f65651p.clone();
    }

    public final Formatter[] getAttachmentFormatters() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.f65654s;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final Formatter[] getAttachmentNames() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.f65655t;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final synchronized Authenticator getAuthenticator() {
        h();
        return this.f65640d;
    }

    public final synchronized int getCapacity() {
        return Math.abs(this.f65645i);
    }

    public final synchronized Comparator<? super LogRecord> getComparator() {
        return this.f65646j;
    }

    @Override // java.util.logging.Handler
    public synchronized String getEncoding() {
        return this.f65652q;
    }

    @Override // java.util.logging.Handler
    public ErrorManager getErrorManager() {
        h();
        return this.f65657v;
    }

    @Override // java.util.logging.Handler
    public Filter getFilter() {
        return this.f65649n;
    }

    @Override // java.util.logging.Handler
    public synchronized Formatter getFormatter() {
        return this.f65653r;
    }

    @Override // java.util.logging.Handler
    public Level getLevel() {
        return this.f65650o;
    }

    public final Properties getMailProperties() {
        Properties properties;
        h();
        synchronized (this) {
            properties = this.f65639c;
        }
        return (Properties) properties.clone();
    }

    public final synchronized Filter getPushFilter() {
        return this.m;
    }

    public final synchronized Level getPushLevel() {
        return this.f65648l;
    }

    public final synchronized Formatter getSubject() {
        return this.f65647k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002c A[Catch: NullPointerException -> 0x0030, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x0030, blocks: (B:20:0x0024, B:22:0x002c), top: B:31:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0036  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public final void h() {
        boolean z10;
        Logger logger;
        SecurityManager securityManager;
        if (this.f65637a) {
            Object obj = ti.b.f93616u0;
            if (obj != null) {
                try {
                    if (obj instanceof LogManager) {
                        z10 = true;
                        try {
                            ((LogManager) obj).checkAccess();
                            return;
                        } catch (LinkageError | RuntimeException unused) {
                            return;
                        } catch (SecurityException e5) {
                            e = e5;
                            if (z10) {
                                throw e;
                            }
                            if (z10) {
                                return;
                            }
                            logger = Logger.getLogger(ConstantsKt.SCOPE_DEFAULT);
                            if (Logger.class == logger.getClass()) {
                                logger.removeHandler(null);
                                return;
                            }
                            securityManager = System.getSecurityManager();
                            if (securityManager != null) {
                                securityManager.checkPermission(new LoggingPermission("control", null));
                            }
                        }
                    }
                } catch (LinkageError | RuntimeException unused2) {
                } catch (SecurityException e7) {
                    e = e7;
                    z10 = false;
                }
            }
            logger = Logger.getLogger(ConstantsKt.SCOPE_DEFAULT);
            try {
                if (Logger.class == logger.getClass()) {
                    logger.removeHandler(null);
                    return;
                }
            } catch (NullPointerException unused3) {
            }
            securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new LoggingPermission("control", null));
            }
        }
    }

    public final void i(int i10) {
        for (int i11 = 0; i11 < this.f65644h; i11++) {
            int[] iArr = this.f65642f;
            if (iArr[i11] >= i10) {
                iArr[i11] = B.intValue();
            }
        }
    }

    public final void i0(Session session) throws Exception {
        if (session != null) {
            try {
                Object objPut = session.getProperties().put("verify", "");
                if (objPut instanceof String) {
                    String str = (String) objPut;
                    if (v(str)) {
                        j0(session, str);
                    }
                } else if (objPut != null) {
                    j0(session, objPut.getClass().toString());
                }
            } catch (LinkageError e5) {
                P(4, e5);
            }
        }
    }

    @Override // java.util.logging.Handler
    public boolean isLoggable(LogRecord logRecord) {
        int iIntValue = getLevel().intValue();
        if (logRecord.getLevel().intValue() < iIntValue || iIntValue == f65635y) {
            return false;
        }
        Filter filter = getFilter();
        if (filter == null || filter.isLoggable(logRecord)) {
            ThreadLocal<Integer> threadLocal = A;
            if (B.equals(threadLocal.get())) {
                threadLocal.set(-1);
            }
            return true;
        }
        Filter[] filterArr = this.f65651p;
        for (int i10 = 0; i10 < filterArr.length; i10++) {
            Filter filter2 = filterArr[i10];
            if (filter2 == null || filter2.isLoggable(logRecord)) {
                ThreadLocal<Integer> threadLocal2 = A;
                if (B.equals(threadLocal2.get())) {
                    threadLocal2.set(Integer.valueOf(i10));
                }
                return true;
            }
        }
        return false;
    }

    public final String j(Formatter formatter) {
        String name;
        String lowerCase;
        int iIndexOf;
        if (formatter != null) {
            String contentType = this.f65656u.getContentType(formatter.getClass().getName());
            if (com.bbva.network.constant.ConstantsKt.DEFAULT_MEDIATYPE.equalsIgnoreCase(contentType)) {
                contentType = null;
            }
            if (contentType != null) {
                return contentType;
            }
            for (Class<?> superclass = formatter.getClass(); superclass != Formatter.class; superclass = superclass.getSuperclass()) {
                try {
                    name = superclass.getSimpleName();
                    while (true) {
                        int iIndexOf2 = lowerCase.indexOf("ml", iIndexOf);
                        if (iIndexOf2 > -1) {
                            if (iIndexOf2 > 0) {
                                int i10 = iIndexOf2 - 1;
                                if (lowerCase.charAt(i10) == 'x') {
                                    return "application/xml";
                                }
                                if (iIndexOf2 > 1 && lowerCase.charAt(iIndexOf2 - 2) == 'h' && lowerCase.charAt(i10) == 't') {
                                    return "text/html";
                                }
                            }
                            iIndexOf = iIndexOf2 + 2;
                        }
                    }
                } catch (InternalError unused) {
                    name = superclass.getName();
                }
                lowerCase = name.toLowerCase(Locale.ENGLISH);
                iIndexOf = lowerCase.indexOf(36) + 1;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:311:? A[Catch: RuntimeException | MessagingException -> 0x00ef, RuntimeException -> 0x00f2, SYNTHETIC, TRY_LEAVE, TryCatch #34 {RuntimeException | MessagingException -> 0x00ef, blocks: (B:41:0x00eb, B:58:0x010f, B:59:0x0112), top: B:287:0x00eb, inners: #32 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010f A[Catch: RuntimeException | MessagingException -> 0x00ef, RuntimeException -> 0x00f2, TRY_ENTER, TryCatch #34 {RuntimeException | MessagingException -> 0x00ef, blocks: (B:41:0x00eb, B:58:0x010f, B:59:0x0112), top: B:287:0x00eb, inners: #32 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Exception, java.lang.Throwable, javax.mail.MessagingException] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Exception, java.lang.Throwable, javax.mail.MessagingException] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.sun.mail.util.logging.MailHandler] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void j0(Session session, String str) throws Exception {
        String str2;
        int length;
        String[] strArr;
        MessagingException messagingException;
        Throwable th2;
        RuntimeException runtimeException;
        Transport transport;
        String str3;
        ?? property;
        Throwable th3;
        Object obj;
        String strJ;
        MimeBodyPart mimeBodyPartK;
        int i10 = 4;
        if (!"local".equals(str) && !"remote".equals(str) && !"limited".equals(str) && !"resolve".equals(str) && !"login".equals(str)) {
            reportError("Verify must be 'limited', local', 'resolve', 'login', or 'remote'.", new IllegalArgumentException(str), 4);
            return;
        }
        MimeMessage mimeMessage = new MimeMessage(session);
        ?? C2 = 5;
        C2 = 5;
        if ("limited".equals(str)) {
            str2 = "Skipping local address check.";
        } else {
            str2 = "Local address is " + InternetAddress.getLocalAddress(session) + '.';
            try {
                String encoding = getEncoding();
                if (encoding == null) {
                    encoding = MimeUtility.getDefaultJavaCharset();
                }
                Charset.forName(encoding);
            } catch (RuntimeException e5) {
                UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(e5.toString());
                unsupportedEncodingException.initCause(e5);
                reportError(str2, unsupportedEncodingException, 5);
            }
        }
        synchronized (this) {
            try {
                e(mimeMessage, w(this.f65647k));
                e(mimeMessage, c0(this.f65647k, ""));
                length = this.f65655t.length;
                strArr = new String[length];
                messagingException = null;
                for (int i11 = 0; i11 < length; i11++) {
                    String strW = w(this.f65655t[i11]);
                    strArr[i11] = strW;
                    if (strW.length() == 0) {
                        strArr[i11] = c0(this.f65655t[i11], "");
                    } else {
                        str3 = "";
                        strArr[i11] = strArr[i11].concat(c0(this.f65655t[i11], ""));
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        try {
            mimeMessage.setHeader("Incomplete-Copy", "");
        } catch (MessagingException e7) {
            reportError(e7.getMessage(), e7, 5);
        }
        q(mimeMessage, true);
        try {
            try {
                mimeMessage.saveChanges();
            } catch (NullPointerException e10) {
                try {
                    if (mimeMessage.getHeader("Content-Transfer-Encoding") != null) {
                        throw e10;
                    }
                    mimeMessage.setHeader("Content-Transfer-Encoding", "base64");
                    mimeMessage.saveChanges();
                } catch (RuntimeException e11) {
                    e = e11;
                    th2 = e;
                    if (th2 != e10) {
                        throw th2;
                    }
                    th2.addSuppressed(e10);
                    throw th2;
                } catch (MessagingException e12) {
                    e = e12;
                    th2 = e;
                    if (th2 != e10) {
                        throw th2;
                    }
                    th2.addSuppressed(e10);
                    throw th2;
                }
            }
        } catch (RuntimeException | MessagingException e13) {
            reportError(str2, e13, 5);
        }
        try {
            try {
                Address[] allRecipients = mimeMessage.getAllRecipients();
                if (allRecipients == null) {
                    allRecipients = new InternetAddress[0];
                }
                try {
                    try {
                        Address[] from = allRecipients.length != 0 ? allRecipients : mimeMessage.getFrom();
                        if (from == null || from.length == 0) {
                            MessagingException messagingException2 = new MessagingException("No recipient or from address.");
                            reportError(str2, messagingException2, 4);
                            throw messagingException2;
                        }
                        Transport transport2 = session.getTransport(from[0]);
                        session.getProperty("mail.transport.protocol");
                        transport = transport2;
                        if ("remote".equals(str) || "login".equals(str)) {
                            try {
                                transport.connect();
                                try {
                                    try {
                                        C2 = ti.b.c(transport);
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                        obj = null;
                                        try {
                                            transport.close();
                                            throw th3;
                                        } catch (MessagingException e14) {
                                            throw th3;
                                        }
                                    }
                                } catch (Exception e15) {
                                    reportError(transport.toString(), e15, 4);
                                    C2 = 0;
                                } catch (LinkageError | NoSuchMethodException | SecurityException unused) {
                                    C2 = 0;
                                }
                                try {
                                    if ("remote".equals(str)) {
                                        try {
                                            transport.sendMessage(mimeMessage, allRecipients);
                                        } catch (Throwable th6) {
                                            th3 = th6;
                                            obj = null;
                                            transport.close();
                                            throw th3;
                                        }
                                    }
                                    try {
                                        transport.close();
                                        messagingException = null;
                                    } catch (MessagingException e16) {
                                        messagingException = e16;
                                    }
                                    try {
                                        if ("remote".equals(str)) {
                                            str3 = null;
                                            MessagingException messagingException3 = new MessagingException("An empty message was sent.", null);
                                            Y(mimeMessage, str, messagingException3);
                                            O(mimeMessage, messagingException3, 4);
                                            property = C2;
                                        } else {
                                            str3 = null;
                                            h0(session, transport.getURLName().getProtocol());
                                        }
                                    } catch (SendFailedException e17) {
                                        e = e17;
                                        str3 = null;
                                        SendFailedException sendFailedException = e;
                                        Address[] invalidAddresses = sendFailedException.getInvalidAddresses();
                                        if (invalidAddresses != null && invalidAddresses.length != 0) {
                                            Y(mimeMessage, str, sendFailedException);
                                            O(mimeMessage, sendFailedException, 4);
                                        }
                                        Address[] validSentAddresses = sendFailedException.getValidSentAddresses();
                                        property = C2;
                                        if (validSentAddresses != null && validSentAddresses.length != 0) {
                                            property = C2;
                                            MessagingException messagingException4 = new MessagingException("An empty message was sent.", sendFailedException);
                                            Y(mimeMessage, str, messagingException4);
                                            O(mimeMessage, messagingException4, 4);
                                            property = C2;
                                        }
                                    } catch (MessagingException e18) {
                                        e = e18;
                                        str3 = null;
                                        MessagingException messagingException5 = e;
                                        property = C2;
                                        if (!K(mimeMessage, messagingException5)) {
                                            Y(mimeMessage, str, messagingException5);
                                            O(mimeMessage, messagingException5, 4);
                                            property = C2;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    obj = null;
                                    th3 = th7;
                                    transport.close();
                                    throw th3;
                                }
                            } catch (SendFailedException e19) {
                                e = e19;
                            } catch (MessagingException e20) {
                                e = e20;
                            }
                            if (messagingException != null) {
                                property = C2;
                                Y(mimeMessage, str, messagingException);
                                O(mimeMessage, messagingException, 3);
                            }
                        } else {
                            String protocol = transport.getURLName().getProtocol();
                            h0(session, protocol);
                            String property2 = session.getProperty("mail." + protocol + ".host");
                            if (J(property2)) {
                                property2 = session.getProperty("mail.host");
                            } else {
                                session.getProperty("mail.host");
                            }
                            String property3 = session.getProperty("mail." + protocol + ".localhost");
                            if (J(property3)) {
                                property = session.getProperty("mail." + protocol + ".localaddress");
                            } else {
                                session.getProperty("mail." + protocol + ".localaddress");
                                property = property3;
                            }
                            if ("resolve".equals(str)) {
                                try {
                                    String host = transport.getURLName().getHost();
                                    if (J(host)) {
                                        g0(property2);
                                    } else {
                                        g0(host);
                                        if (!host.equalsIgnoreCase(property2)) {
                                            g0(property2);
                                        }
                                    }
                                } catch (IOException e21) {
                                    e = e21;
                                    MessagingException messagingException6 = new MessagingException(str2, e);
                                    Y(mimeMessage, str, messagingException6);
                                    O(mimeMessage, messagingException6, 4);
                                } catch (RuntimeException e22) {
                                    e = e22;
                                    MessagingException messagingException7 = new MessagingException(str2, e);
                                    Y(mimeMessage, str, messagingException7);
                                    O(mimeMessage, messagingException7, 4);
                                }
                            }
                            str3 = null;
                        }
                        property = C2;
                        if (!"limited".equals(str)) {
                            try {
                                ?? C3 = property;
                                if (!"remote".equals(str) && !"login".equals(str)) {
                                    try {
                                        C3 = property;
                                        C3 = ti.b.c(transport);
                                    } catch (Exception e23) {
                                        reportError(transport.toString(), e23, 4);
                                        C3 = str3;
                                    } catch (LinkageError | NoSuchMethodException | SecurityException unused2) {
                                        C3 = str3;
                                    }
                                }
                                C3 = property;
                                g0(C3);
                            } catch (IOException e24) {
                                e = e24;
                                MessagingException messagingException8 = new MessagingException(str2, e);
                                Y(mimeMessage, str, messagingException8);
                                O(mimeMessage, messagingException8, 4);
                            } catch (RuntimeException e25) {
                                e = e25;
                                MessagingException messagingException9 = new MessagingException(str2, e);
                                Y(mimeMessage, str, messagingException9);
                                O(mimeMessage, messagingException9, 4);
                            }
                            try {
                                Object objS = s(f65636z);
                                try {
                                    Multipart mimeMultipart = new MimeMultipart();
                                    MimeBodyPart[] mimeBodyPartArr = new MimeBodyPart[length];
                                    synchronized (this) {
                                        try {
                                            strJ = j(getFormatter());
                                            mimeBodyPartK = k();
                                            for (int i12 = 0; i12 < length; i12++) {
                                                MimeBodyPart mimeBodyPartL = l(i12);
                                                mimeBodyPartArr[i12] = mimeBodyPartL;
                                                mimeBodyPartL.setFileName(strArr[i12]);
                                                String contentType = this.f65656u.getContentType(strArr[i12]);
                                                if (com.bbva.network.constant.ConstantsKt.DEFAULT_MEDIATYPE.equalsIgnoreCase(contentType)) {
                                                    contentType = null;
                                                }
                                                strArr[i12] = contentType;
                                            }
                                        } catch (Throwable th8) {
                                            throw th8;
                                        }
                                    }
                                    mimeBodyPartK.setDescription(str);
                                    W(mimeBodyPartK, "", strJ);
                                    mimeMultipart.addBodyPart(mimeBodyPartK);
                                    for (int i13 = 0; i13 < length; i13++) {
                                        mimeBodyPartArr[i13].setDescription(str);
                                        W(mimeBodyPartArr[i13], "", strArr[i13]);
                                    }
                                    mimeMessage.setContent(mimeMultipart);
                                    mimeMessage.saveChanges();
                                    mimeMessage.writeTo(new ByteArrayOutputStream(1024));
                                    s(objS);
                                } catch (Throwable th9) {
                                    s(objS);
                                    throw th9;
                                }
                            } catch (IOException e26) {
                                MessagingException messagingException10 = new MessagingException(str2, e26);
                                Y(mimeMessage, str, messagingException10);
                                O(mimeMessage, messagingException10, 5);
                            }
                        }
                        if (allRecipients.length == 0) {
                            throw new MessagingException("No recipient addresses.");
                        }
                        f0(allRecipients);
                        Address[] from2 = mimeMessage.getFrom();
                        Address sender = mimeMessage.getSender();
                        if (sender instanceof InternetAddress) {
                            ((InternetAddress) sender).validate();
                        }
                        if (mimeMessage.getHeader("From", ",") != null && from2.length != 0) {
                            f0(from2);
                            for (Address address : from2) {
                                if (address.equals(sender)) {
                                    throw new MessagingException(str2, new MessagingException("Sender address '" + sender + "' equals from address."));
                                }
                            }
                        } else if (sender == null) {
                            throw new MessagingException(str2, new MessagingException("No from or sender address."));
                        }
                        f0(mimeMessage.getReplyTo());
                    } catch (RuntimeException e27) {
                        runtimeException = e27;
                        i10 = 4;
                        Y(mimeMessage, str, runtimeException);
                        O(mimeMessage, runtimeException, i10);
                    }
                } catch (MessagingException e28) {
                    Object objS2 = s(f65636z);
                    try {
                        try {
                            Transport transport3 = session.getTransport();
                            s(objS2);
                            transport = transport3;
                        } catch (Throwable th10) {
                            s(objS2);
                            throw th10;
                        }
                    } catch (MessagingException e29) {
                        if (e28.setNextException(e29)) {
                            throw e28;
                        }
                        if (e29.setNextException(e28)) {
                            throw e29;
                        }
                        if (e29 == e28) {
                            throw e28;
                        }
                        e28.addSuppressed(e29);
                    }
                }
            } catch (Exception e30) {
                Y(mimeMessage, str, e30);
                O(mimeMessage, e30, 4);
            }
        } catch (RuntimeException e31) {
            runtimeException = e31;
        }
    }

    public final MimeBodyPart k() throws MessagingException {
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setDisposition(Part.INLINE);
        mimeBodyPart.setDescription(p(getFormatter(), getFilter(), this.f65647k));
        T(mimeBodyPart);
        return mimeBodyPart;
    }

    public final MimeMessage k0(int i10) {
        try {
            synchronized (this) {
                try {
                    if (this.f65644h > 0 && !this.f65638b) {
                        this.f65638b = true;
                        try {
                            MimeMessage mimeMessageL0 = l0();
                            this.f65638b = false;
                            int i11 = this.f65644h;
                            if (i11 > 0) {
                                LogRecord[] logRecordArr = this.f65643g;
                                if (i11 < logRecordArr.length) {
                                    Arrays.fill(logRecordArr, 0, i11, (Object) null);
                                } else {
                                    Arrays.fill(logRecordArr, (Object) null);
                                }
                                this.f65644h = 0;
                            }
                            return mimeMessageL0;
                        } catch (Throwable th2) {
                            this.f65638b = false;
                            if (this.f65644h > 0) {
                                int i12 = this.f65644h;
                                LogRecord[] logRecordArr2 = this.f65643g;
                                if (i12 < logRecordArr2.length) {
                                    Arrays.fill(logRecordArr2, 0, i12, (Object) null);
                                } else {
                                    Arrays.fill(logRecordArr2, (Object) null);
                                }
                                this.f65644h = 0;
                            }
                            throw th2;
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (RuntimeException e5) {
            reportError(e5.getMessage(), e5, i10);
        } catch (Exception e7) {
            reportError(e7.getMessage(), e7, i10);
        }
    }

    public final MimeBodyPart l(int i10) throws MessagingException {
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setDisposition(Part.ATTACHMENT);
        mimeBodyPart.setDescription(p(this.f65654s[i10], this.f65651p[i10], this.f65655t[i10]));
        T(mimeBodyPart);
        return mimeBodyPart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MimeMessage l0() throws Exception {
        MimePart mimePartK;
        Formatter formatter;
        int i10;
        String strGuessContentTypeFromStream;
        StringBuilder sb2;
        Locale locale;
        Filter filter;
        boolean z10;
        Locale locale2;
        Comparator<? super LogRecord> comparator = this.f65646j;
        int i11 = 0;
        if (comparator != null) {
            try {
                int i12 = this.f65644h;
                if (i12 != 1) {
                    Arrays.sort(this.f65643g, 0, i12, comparator);
                } else {
                    LogRecord logRecord = this.f65643g[0];
                    if (comparator.compare(logRecord, logRecord) != 0) {
                        throw new IllegalArgumentException(this.f65646j.getClass().getName());
                    }
                }
            } catch (RuntimeException e5) {
                reportError(e5.getMessage(), e5, 5);
            }
        }
        if (this.f65641e == null) {
            F();
        }
        MimeMessage mimeMessage = new MimeMessage(this.f65641e);
        int length = this.f65654s.length;
        MimeBodyPart[] mimeBodyPartArr = new MimeBodyPart[length];
        StringBuilder[] sbArr = new StringBuilder[length];
        if (length == 0) {
            mimeMessage.setDescription(p(getFormatter(), getFilter(), this.f65647k));
            mimePartK = mimeMessage;
        } else {
            mimeMessage.setDescription(o(this.f65646j, this.f65648l, this.m));
            mimePartK = k();
        }
        e(mimeMessage, w(this.f65647k));
        Formatter formatter2 = getFormatter();
        Filter filter2 = getFilter();
        LogRecord logRecord2 = null;
        int i13 = 0;
        StringBuilder sb3 = null;
        Object obj = null;
        while (i13 < this.f65644h) {
            int i14 = this.f65642f[i13];
            LogRecord[] logRecordArr = this.f65643g;
            LogRecord logRecord3 = logRecordArr[i13];
            logRecordArr[i13] = logRecord2;
            ResourceBundle resourceBundle = logRecord3.getResourceBundle();
            if (resourceBundle != null) {
                locale2 = resourceBundle.getLocale();
                if (locale2 == null || J(locale2.getLanguage())) {
                    locale = locale2;
                    locale = Locale.getDefault();
                }
            } else {
                locale = logRecord2;
            }
            locale = locale2;
            e(mimeMessage, r(this.f65647k, logRecord3));
            if (filter2 == null || i14 == -1 || length == 0 || (i14 < -1 && filter2.isLoggable(logRecord3))) {
                if (sb3 == null) {
                    sb3 = new StringBuilder();
                    sb3.append(w(formatter2));
                }
                sb3.append(r(formatter2, logRecord3));
                if (locale != 0 && !locale.equals(obj)) {
                    c(mimePartK, locale);
                }
                filter = filter2;
                z10 = true;
            } else {
                z10 = false;
                filter = null;
            }
            StringBuilder sb4 = sb3;
            Filter filter3 = filter;
            Filter filter4 = filter2;
            int i15 = 0;
            while (i15 < length) {
                Formatter formatter3 = formatter2;
                Filter filter5 = this.f65651p[i15];
                if (filter5 == null || filter3 == filter5 || i14 == i15 || (i14 < i15 && filter5.isLoggable(logRecord3))) {
                    if (filter3 == null && filter5 != null) {
                        filter3 = filter5;
                    }
                    if (mimeBodyPartArr[i15] == null) {
                        mimeBodyPartArr[i15] = l(i15);
                        StringBuilder sb5 = new StringBuilder();
                        sbArr[i15] = sb5;
                        sb5.append(w(this.f65654s[i15]));
                        d(mimeBodyPartArr[i15], w(this.f65655t[i15]));
                    }
                    d(mimeBodyPartArr[i15], r(this.f65655t[i15], logRecord3));
                    sbArr[i15].append(r(this.f65654s[i15], logRecord3));
                    if (locale != 0 && !locale.equals(obj)) {
                        c(mimeBodyPartArr[i15], locale);
                    }
                    z10 = true;
                }
                i15++;
                formatter2 = formatter3;
            }
            Formatter formatter4 = formatter2;
            if (!z10) {
                Formatter formatterM = m();
                reportError("Log record " + logRecord3.getSequenceNumber() + " was filtered from all message parts.  " + w(formatterM) + r(formatterM, logRecord3) + c0(formatterM, ""), new IllegalArgumentException(getFilter() + ", " + Arrays.asList(this.f65651p)), 5);
            } else if (mimePartK != mimeMessage && locale != 0 && !locale.equals(obj)) {
                c(mimeMessage, locale);
            }
            i13++;
            obj = locale;
            filter2 = filter4;
            sb3 = sb4;
            formatter2 = formatter4;
            i11 = 0;
            logRecord2 = null;
        }
        Formatter formatter5 = formatter2;
        this.f65644h = i11;
        for (int i16 = length - 1; i16 >= 0; i16--) {
            MimeBodyPart mimeBodyPart = mimeBodyPartArr[i16];
            if (mimeBodyPart != null) {
                d(mimeBodyPart, c0(this.f65655t[i16], NotificationCompat.CATEGORY_ERROR));
                sbArr[i16].append(c0(this.f65654s[i16], ""));
                if (sbArr[i16].length() > 0) {
                    String fileName = mimeBodyPartArr[i16].getFileName();
                    if (J(fileName)) {
                        Formatter formatter6 = this.f65654s[i16];
                        String string = formatter6.toString();
                        fileName = !J(string) ? string : t(formatter6);
                        mimeBodyPartArr[i16].setFileName(fileName);
                    }
                    MimeBodyPart mimeBodyPart2 = mimeBodyPartArr[i16];
                    StringBuilder sb6 = sbArr[i16];
                    String contentType = this.f65656u.getContentType(fileName);
                    if (com.bbva.network.constant.ConstantsKt.DEFAULT_MEDIATYPE.equalsIgnoreCase(contentType)) {
                        contentType = null;
                    }
                    W(mimeBodyPart2, sb6, contentType);
                    sb2 = null;
                } else {
                    try {
                        mimeMessage.setHeader("Incomplete-Copy", "");
                    } catch (MessagingException e7) {
                        reportError(e7.getMessage(), e7, 5);
                    }
                    sb2 = null;
                    mimeBodyPartArr[i16] = null;
                }
                sbArr[i16] = sb2;
            }
        }
        if (sb3 != null) {
            formatter = formatter5;
            sb3.append(c0(formatter, ""));
            i10 = 0;
        } else {
            formatter = formatter5;
            i10 = 0;
            sb3 = new StringBuilder(0);
        }
        e(mimeMessage, c0(this.f65647k, ""));
        if (J(sb3)) {
            strGuessContentTypeFromStream = null;
        } else {
            CharSequence charSequenceSubSequence = sb3.length() > 25 ? sb3.subSequence(i10, 25) : sb3;
            try {
                String encoding = getEncoding();
                if (encoding == null) {
                    encoding = MimeUtility.getDefaultJavaCharset();
                }
                strGuessContentTypeFromStream = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(charSequenceSubSequence.toString().getBytes(encoding)));
            } catch (IOException e10) {
                reportError(e10.getMessage(), e10, 5);
                strGuessContentTypeFromStream = null;
            }
        }
        String strJ = j(formatter);
        if (strJ != null) {
            strGuessContentTypeFromStream = strJ;
        }
        W(mimePartK, sb3, strGuessContentTypeFromStream);
        if (mimePartK != mimeMessage) {
            Multipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart((BodyPart) mimePartK);
            for (int i17 = i10; i17 < length; i17++) {
                MimeBodyPart mimeBodyPart3 = mimeBodyPartArr[i17];
                if (mimeBodyPart3 != null) {
                    mimeMultipart.addBodyPart(mimeBodyPart3);
                }
            }
            mimeMessage.setContent(mimeMultipart);
        }
        return mimeMessage;
    }

    public final ErrorManager n() {
        ErrorManager errorManager;
        try {
            errorManager = super.getErrorManager();
        } catch (LinkageError | RuntimeException unused) {
            errorManager = null;
        }
        return errorManager == null ? new ErrorManager() : errorManager;
    }

    public void preDestroy() {
        M(3, false);
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        ThreadLocal<Integer> threadLocal = A;
        if (threadLocal.get() != null) {
            R(logRecord);
            return;
        }
        threadLocal.set(B);
        try {
            try {
                if (isLoggable(logRecord)) {
                    logRecord.getSourceMethodName();
                    L(logRecord);
                }
            } catch (LinkageError e5) {
                P(1, e5);
            }
        } finally {
            N();
        }
    }

    public void push() {
        M(2, true);
    }

    public final void q(MimeMessage mimeMessage, boolean z10) {
        String strReplaceAll;
        String strFold;
        T(mimeMessage);
        String property = u(mimeMessage).getProperty("mail.from");
        if (property != null) {
            try {
                InternetAddress[] internetAddressArr = InternetAddress.parse(property, false);
                if (internetAddressArr.length > 0) {
                    if (internetAddressArr.length == 1) {
                        mimeMessage.setFrom(internetAddressArr[0]);
                    } else {
                        mimeMessage.addFrom(internetAddressArr);
                    }
                }
            } catch (MessagingException e5) {
                reportError(e5.getMessage(), e5, 5);
                try {
                    mimeMessage.setFrom();
                } catch (MessagingException e7) {
                    reportError(e7.getMessage(), e7, 5);
                }
            }
        } else {
            try {
                mimeMessage.setFrom();
            } catch (MessagingException e10) {
                reportError(e10.getMessage(), e10, 5);
            }
        }
        Message.RecipientType recipientType = Message.RecipientType.TO;
        if (!b0(mimeMessage, "mail.to", recipientType)) {
            try {
                InternetAddress localAddress = InternetAddress.getLocalAddress(u(mimeMessage));
                if (localAddress != null) {
                    mimeMessage.setRecipient(recipientType, localAddress);
                } else {
                    MimeMessage mimeMessage2 = new MimeMessage(u(mimeMessage));
                    mimeMessage2.setFrom();
                    Address[] from = mimeMessage2.getFrom();
                    if (from.length <= 0) {
                        throw new MessagingException("No local address.");
                    }
                    mimeMessage.setRecipients(recipientType, from);
                }
            } catch (RuntimeException e11) {
                e = e11;
                reportError("Unable to compute a default recipient.", e, 5);
            } catch (MessagingException e12) {
                e = e12;
                reportError("Unable to compute a default recipient.", e, 5);
            }
        }
        b0(mimeMessage, "mail.cc", Message.RecipientType.CC);
        b0(mimeMessage, "mail.bcc", Message.RecipientType.BCC);
        String property2 = u(mimeMessage).getProperty("mail.reply.to");
        if (!J(property2)) {
            try {
                InternetAddress[] internetAddressArr2 = InternetAddress.parse(property2, false);
                if (internetAddressArr2.length > 0) {
                    mimeMessage.setReplyTo(internetAddressArr2);
                }
            } catch (MessagingException e13) {
                reportError(e13.getMessage(), e13, 5);
            }
        }
        String property3 = u(mimeMessage).getProperty("mail.sender");
        if (!J(property3)) {
            try {
                InternetAddress[] internetAddressArr3 = InternetAddress.parse(property3, false);
                if (internetAddressArr3.length > 0) {
                    mimeMessage.setSender(internetAddressArr3[0]);
                    if (internetAddressArr3.length > 1) {
                        reportError("Ignoring other senders.", new AddressException(Arrays.asList(internetAddressArr3).subList(1, internetAddressArr3.length).toString()), 5);
                    }
                }
            } catch (MessagingException e14) {
                reportError(e14.getMessage(), e14, 5);
            }
        }
        try {
            Class<?> cls = getClass();
            if (cls == MailHandler.class) {
                strFold = MailHandler.class.getName();
            } else {
                try {
                    strReplaceAll = MimeUtility.encodeText(cls.getName());
                } catch (UnsupportedEncodingException e15) {
                    reportError(e15.getMessage(), e15, 5);
                    strReplaceAll = cls.getName().replaceAll("[^\\x00-\\x7F]", "\u001a");
                }
                strFold = MimeUtility.fold(10, MailHandler.class.getName() + " using the " + strReplaceAll + " extension.");
            }
            mimeMessage.setHeader("X-Mailer", strFold);
        } catch (MessagingException e16) {
            reportError(e16.getMessage(), e16, 5);
        }
        Object obj = ti.b.f93616u0;
        if (obj != null && !(obj instanceof Properties)) {
            try {
                mimeMessage.setHeader("auto-submitted", "auto-generated");
            } catch (MessagingException e17) {
                reportError(e17.getMessage(), e17, 5);
            }
        }
        if (z10) {
            try {
                mimeMessage.setHeader("Importance", "High");
                mimeMessage.setHeader("Priority", "urgent");
                mimeMessage.setHeader("X-Priority", "2");
            } catch (MessagingException e18) {
                reportError(e18.getMessage(), e18, 5);
            }
        }
        try {
            mimeMessage.setSentDate(new Date());
        } catch (MessagingException e19) {
            reportError(e19.getMessage(), e19, 5);
        }
    }

    public final String r(Formatter formatter, LogRecord logRecord) {
        try {
            return formatter.format(logRecord);
        } catch (RuntimeException e5) {
            reportError(e5.getMessage(), e5, 5);
            return "";
        }
    }

    @Override // java.util.logging.Handler
    public void reportError(String str, Exception exc, int i10) {
        try {
            if (str != null) {
                this.f65657v.error(Level.SEVERE.getName().concat(": ").concat(str), exc, i10);
            } else {
                this.f65657v.error(null, exc, i10);
            }
        } catch (LinkageError e5) {
            e = e5;
            P(i10, e);
        } catch (RuntimeException e7) {
            e = e7;
            P(i10, e);
        }
    }

    public final void setAttachmentFilters(Filter... filterArr) {
        h();
        Filter[] filterArr2 = filterArr.length == 0 ? f65633w : (Filter[]) Arrays.copyOf(filterArr, filterArr.length, Filter[].class);
        synchronized (this) {
            try {
                Formatter[] formatterArr = this.f65654s;
                if (formatterArr.length != filterArr2.length) {
                    throw g(formatterArr.length, filterArr2.length);
                }
                if (this.f65638b) {
                    throw new IllegalStateException();
                }
                if (this.f65644h != 0) {
                    for (int i10 = 0; i10 < filterArr2.length; i10++) {
                        if (filterArr2[i10] != this.f65651p[i10]) {
                            i(i10);
                            break;
                        }
                    }
                }
                this.f65651p = filterArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAttachmentFormatters(Formatter... formatterArr) {
        Formatter[] formatterArr2;
        h();
        if (formatterArr.length == 0) {
            formatterArr2 = f65634x;
        } else {
            formatterArr2 = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
            for (int i10 = 0; i10 < formatterArr2.length; i10++) {
                if (formatterArr2[i10] == null) {
                    throw new NullPointerException(f(i10));
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f65638b) {
                    throw new IllegalStateException();
                }
                this.f65654s = formatterArr2;
                a();
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAttachmentNames(String... strArr) {
        h();
        Formatter[] formatterArr = strArr.length == 0 ? f65634x : new Formatter[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str == null) {
                throw new NullPointerException(f(i10));
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException(f(i10));
            }
            formatterArr[i10] = new c(str);
        }
        synchronized (this) {
            try {
                Formatter[] formatterArr2 = this.f65654s;
                if (formatterArr2.length != strArr.length) {
                    throw g(formatterArr2.length, strArr.length);
                }
                if (this.f65638b) {
                    throw new IllegalStateException();
                }
                this.f65655t = formatterArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAuthenticator(Authenticator authenticator) throws Exception {
        U(authenticator);
    }

    public final synchronized void setComparator(Comparator<? super LogRecord> comparator) {
        h();
        if (this.f65638b) {
            throw new IllegalStateException();
        }
        this.f65646j = comparator;
    }

    @Override // java.util.logging.Handler
    public void setEncoding(String str) throws UnsupportedEncodingException {
        h();
        X(str);
    }

    @Override // java.util.logging.Handler
    public void setErrorManager(ErrorManager errorManager) {
        h();
        Z(errorManager);
    }

    @Override // java.util.logging.Handler
    public void setFilter(Filter filter) {
        h();
        synchronized (this) {
            try {
                if (filter != this.f65649n) {
                    i(-1);
                }
                this.f65649n = filter;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.logging.Handler
    public synchronized void setFormatter(Formatter formatter) throws SecurityException {
        h();
        if (formatter == null) {
            throw new NullPointerException();
        }
        this.f65653r = formatter;
    }

    @Override // java.util.logging.Handler
    public void setLevel(Level level) {
        level.getClass();
        h();
        synchronized (this) {
            try {
                if (this.f65645i > 0) {
                    this.f65650o = level;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setMailProperties(Properties properties) throws Exception {
        a0(properties);
    }

    public final synchronized void setPushFilter(Filter filter) {
        h();
        if (this.f65638b) {
            throw new IllegalStateException();
        }
        this.m = filter;
    }

    public final synchronized void setPushLevel(Level level) {
        h();
        if (level == null) {
            throw new NullPointerException();
        }
        if (this.f65638b) {
            throw new IllegalStateException();
        }
        this.f65648l = level;
    }

    public final void setSubject(Formatter formatter) {
        h();
        formatter.getClass();
        synchronized (this) {
            try {
                if (this.f65638b) {
                    throw new IllegalStateException();
                }
                this.f65647k = formatter;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String w(Formatter formatter) {
        try {
            return formatter.getHead(this);
        } catch (RuntimeException e5) {
            reportError(e5.getMessage(), e5, 5);
            return "";
        }
    }

    public final synchronized void x(Properties properties) {
        try {
            String name = getClass().getName();
            this.f65639c = new Properties();
            Object objS = s(f65636z);
            try {
                this.f65656u = FileTypeMap.getDefaultFileTypeMap();
                s(objS);
                try {
                    String strB = ti.b.b(name.concat(".errorManager"));
                    if (strB != null) {
                        Z((ErrorManager) ti.b.f(ErrorManager.class, strB));
                    }
                } catch (SecurityException e5) {
                    throw e5;
                } catch (Exception e7) {
                    reportError(e7.getMessage(), e7, 4);
                }
                try {
                    String strB2 = ti.b.b(name.concat(".level"));
                    if (strB2 != null) {
                        this.f65650o = Level.parse(strB2);
                    } else {
                        this.f65650o = Level.WARNING;
                    }
                } catch (SecurityException e10) {
                    throw e10;
                } catch (RuntimeException e11) {
                    reportError(e11.getMessage(), e11, 4);
                    this.f65650o = Level.WARNING;
                }
                try {
                    try {
                        String strB3 = ti.b.b(name.concat(".filter"));
                        if (v(strB3)) {
                            this.f65649n = (Filter) ti.b.f(Filter.class, strB3);
                        }
                    } catch (SecurityException e12) {
                        throw e12;
                    }
                } catch (Exception e13) {
                    reportError(e13.getMessage(), e13, 4);
                }
                C(name);
                B(name);
                try {
                    String strB4 = ti.b.b(name.concat(".encoding"));
                    if (strB4 != null) {
                        X(strB4);
                    }
                } catch (UnsupportedEncodingException e14) {
                    e = e14;
                    reportError(e.getMessage(), e, 4);
                } catch (SecurityException e15) {
                    throw e15;
                } catch (RuntimeException e16) {
                    e = e16;
                    reportError(e.getMessage(), e, 4);
                }
                E(name);
                D(name);
                try {
                    String strB5 = ti.b.b(name.concat(".pushLevel"));
                    if (strB5 != null) {
                        this.f65648l = Level.parse(strB5);
                    }
                } catch (RuntimeException e17) {
                    reportError(e17.getMessage(), e17, 4);
                }
                if (this.f65648l == null) {
                    this.f65648l = Level.OFF;
                }
                try {
                    try {
                        String strB6 = ti.b.b(name.concat(".pushFilter"));
                        if (v(strB6)) {
                            this.m = (Filter) ti.b.f(Filter.class, strB6);
                        }
                    } catch (SecurityException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    reportError(e19.getMessage(), e19, 4);
                }
                G(name);
                z(name);
                y(name);
                A(name);
                if (properties == null && ti.b.b(name.concat(".verify")) != null) {
                    i0(F());
                }
                I();
            } catch (Throwable th2) {
                s(objS);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void y(String str) {
        String strB = ti.b.b(str.concat(".attachment.filters"));
        if (J(strB)) {
            this.f65651p = f65633w;
            a();
            return;
        }
        String[] strArrSplit = strB.split(",");
        int length = strArrSplit.length;
        Filter[] filterArr = new Filter[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if (!AbstractJsonLexerKt.NULL.equalsIgnoreCase(strTrim)) {
                try {
                    filterArr[i10] = (Filter) ti.b.f(Filter.class, strArrSplit[i10]);
                } catch (SecurityException e5) {
                    throw e5;
                } catch (Exception e7) {
                    reportError(e7.getMessage(), e7, 4);
                }
            }
        }
        this.f65651p = filterArr;
        if (a()) {
            reportError("Attachment filters.", new IndexOutOfBoundsException("Length mismatch."), 4);
        }
    }

    public final void z(String str) {
        String strB = ti.b.b(str.concat(".attachment.formatters"));
        boolean zJ = J(strB);
        Formatter[] formatterArr = f65634x;
        if (zJ) {
            this.f65654s = formatterArr;
            return;
        }
        String[] strArrSplit = strB.split(",");
        if (strArrSplit.length != 0) {
            formatterArr = new Formatter[strArrSplit.length];
        }
        for (int i10 = 0; i10 < formatterArr.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(strTrim)) {
                reportError("Attachment formatter.", new NullPointerException(f(i10)), 4);
                formatterArr[i10] = m();
            } else {
                try {
                    Formatter formatter = (Formatter) ti.b.f(Formatter.class, strArrSplit[i10]);
                    formatterArr[i10] = formatter;
                    if (formatter instanceof c) {
                        reportError("Attachment formatter.", new ClassNotFoundException(formatterArr[i10].toString()), 4);
                        formatterArr[i10] = m();
                    }
                } catch (SecurityException e5) {
                    throw e5;
                } catch (Exception e7) {
                    reportError(e7.getMessage(), e7, 4);
                    formatterArr[i10] = m();
                }
            }
        }
        this.f65654s = formatterArr;
    }

    public final void setAuthenticator(char... cArr) throws Exception {
        if (cArr == null) {
            U(null);
        } else {
            U(new a(new String(cArr)));
        }
    }

    public MailHandler(int i10) {
        x(null);
        this.f65637a = true;
        V(i10);
    }

    public final void setSubject(String str) {
        if (str != null) {
            setSubject(new c(str));
        } else {
            h();
            throw null;
        }
    }

    public MailHandler(Properties properties) throws Exception {
        properties.getClass();
        x(properties);
        this.f65637a = true;
        a0(properties);
    }

    public void postConstruct() {
    }

    public final void setAttachmentNames(Formatter... formatterArr) {
        Formatter[] formatterArr2;
        h();
        if (formatterArr.length == 0) {
            formatterArr2 = f65634x;
        } else {
            formatterArr2 = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
        }
        for (int i10 = 0; i10 < formatterArr2.length; i10++) {
            if (formatterArr2[i10] == null) {
                throw new NullPointerException(f(i10));
            }
        }
        synchronized (this) {
            try {
                Formatter[] formatterArr3 = this.f65654s;
                if (formatterArr3.length == formatterArr2.length) {
                    if (!this.f65638b) {
                        this.f65655t = formatterArr2;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw g(formatterArr3.length, formatterArr2.length);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
