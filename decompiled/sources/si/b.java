package si;

import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SharedByteArrayOutputStream;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.SocketException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: Protocol.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char[] f93201o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Socket f93202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Properties f93204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BufferedReader f93206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PrintWriter f93207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TraceInputStream f93208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TraceOutputStream f93209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MailLogger f93210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MailLogger f93211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f93212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f93213l = null;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f93214n;

    public b(String str, int i10, Properties properties, String str2, boolean z10, MailLogger mailLogger) throws IOException {
        String str3;
        this.f93212k = null;
        boolean z11 = true;
        this.f93214n = true;
        this.f93203b = str;
        this.f93204c = properties;
        this.f93205d = str2;
        this.f93210i = mailLogger;
        this.f93211j = mailLogger.getSubLogger("protocol", null);
        this.f93214n = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        boolean zE = e(properties, str2 + ".apop.enable");
        boolean zE2 = e(properties, str2 + ".disablecapa");
        i10 = i10 == -1 ? 110 : i10;
        try {
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                mailLogger.fine("connecting to host \"" + str + "\", port " + i10 + ", isSSL " + z10);
            }
            this.f93202a = SocketFetcher.getSocket(str, i10, properties, str2, z10);
            i();
            c cVarY = y(null);
            if (!cVarY.f93215a) {
                Socket socket = this.f93202a;
                IOException iOException = new IOException("Connect failed");
                b(socket, iOException);
                throw iOException;
            }
            if (zE && (str3 = cVarY.f93216b) != null) {
                int iIndexOf = str3.indexOf(60);
                int iIndexOf2 = cVarY.f93216b.indexOf(62, iIndexOf);
                if (iIndexOf != -1 && iIndexOf2 != -1) {
                    this.f93212k = cVarY.f93216b.substring(iIndexOf, iIndexOf2 + 1);
                }
                mailLogger.log(level, "APOP challenge: {0}", this.f93212k);
            }
            if (!zE2) {
                x(a());
            }
            if (!h("PIPELINING")) {
                if (!PropUtil.getBooleanProperty(properties, str2 + ".pipelining", false)) {
                    z11 = false;
                }
            }
            this.m = z11;
            if (z11) {
                mailLogger.config("PIPELINING enabled");
            }
        } catch (IOException e5) {
            b(this.f93202a, e5);
            throw e5;
        }
    }

    public static void b(Socket socket, IOException iOException) {
        try {
            socket.close();
        } catch (Throwable th2) {
            if ((th2 instanceof Exception) || (th2 instanceof LinkageError)) {
                iOException.addSuppressed(th2);
                return;
            }
            th2.addSuppressed(iOException);
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (!(th2 instanceof RuntimeException)) {
                throw new RuntimeException("unexpected exception", th2);
            }
            throw ((RuntimeException) th2);
        }
    }

    public final synchronized boolean A() throws IOException {
        if (this.f93202a instanceof SSLSocket) {
            return true;
        }
        c cVarY = y("STLS");
        if (cVarY.f93215a) {
            try {
                this.f93202a = SocketFetcher.startTLS(this.f93202a, this.f93203b, this.f93204c, this.f93205d);
                i();
            } catch (IOException e5) {
                try {
                    this.f93202a.close();
                    this.f93202a = null;
                    this.f93206e = null;
                    this.f93207f = null;
                    IOException iOException = new IOException("Could not convert socket to TLS");
                    iOException.initCause(e5);
                    throw iOException;
                } catch (Throwable th2) {
                    this.f93202a = null;
                    this.f93206e = null;
                    this.f93207f = null;
                    throw th2;
                }
            }
        }
        return cVarY.f93215a;
    }

    public final synchronized InputStream B(int i10, int i11) throws IOException {
        return o(0, "TOP " + i10 + " " + i11).f93217c;
    }

    public final synchronized String C(int i10) throws IOException {
        c cVarY = y("UIDL " + i10);
        if (!cVarY.f93215a) {
            return null;
        }
        int iIndexOf = cVarY.f93216b.indexOf(32);
        if (iIndexOf <= 0) {
            return null;
        }
        return cVarY.f93216b.substring(iIndexOf + 1);
    }

    public final synchronized boolean D(String[] strArr) throws IOException {
        int i10;
        c cVarO = o(strArr.length * 15, "UIDL");
        if (!cVarO.f93215a) {
            return false;
        }
        LineInputStream lineInputStream = new LineInputStream(cVarO.f93217c);
        while (true) {
            String line = lineInputStream.readLine();
            if (line != null) {
                int iIndexOf = line.indexOf(32);
                if (iIndexOf >= 1 && iIndexOf < line.length() && (i10 = Integer.parseInt(line.substring(0, iIndexOf))) > 0 && i10 <= strArr.length) {
                    strArr[i10 - 1] = line.substring(iIndexOf + 1);
                }
            } else {
                try {
                    break;
                } catch (IOException unused) {
                }
            }
        }
        cVarO.f93217c.close();
        return true;
    }

    public final synchronized InputStream a() throws IOException {
        c cVarO = o(128, "CAPA");
        if (!cVarO.f93215a) {
            return null;
        }
        return cVarO.f93217c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        try {
            this.f93202a.close();
        } catch (IOException unused) {
        } finally {
            this.f93202a = null;
            this.f93206e = null;
            this.f93207f = null;
        }
    }

    public final synchronized void d(int i10) throws IOException {
        y("DELE " + i10);
    }

    public final synchronized boolean e(Properties properties, String str) {
        boolean booleanProperty;
        booleanProperty = PropUtil.getBooleanProperty(properties, str, false);
        if (this.f93210i.isLoggable(Level.CONFIG)) {
            this.f93210i.config(str + ": " + booleanProperty);
        }
        return booleanProperty;
    }

    public final synchronized Map<String, String> f() {
        return this.f93213l;
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f93202a != null) {
                q();
            }
        } finally {
            super.finalize();
        }
    }

    public final String g(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(ad.d.f(new StringBuilder(), this.f93212k, str).getBytes("iso-8859-1"));
            char[] cArr = new char[bArrDigest.length * 2];
            int i10 = 0;
            for (byte b10 : bArrDigest) {
                int i11 = i10 + 1;
                char[] cArr2 = f93201o;
                cArr[i10] = cArr2[(b10 & 255) >> 4];
                i10 += 2;
                cArr[i11] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final synchronized boolean h(String str) {
        HashMap map;
        map = this.f93213l;
        return map != null && map.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    public final void i() throws IOException {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.f93204c, "mail.debug.quote", false);
        InputStream inputStream = this.f93202a.getInputStream();
        MailLogger mailLogger = this.f93211j;
        TraceInputStream traceInputStream = new TraceInputStream(inputStream, mailLogger);
        this.f93208g = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.f93202a.getOutputStream(), mailLogger);
        this.f93209h = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.f93206e = new BufferedReader(new InputStreamReader(this.f93208g, "iso-8859-1"));
        this.f93207f = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.f93209h, "iso-8859-1")));
    }

    public final synchronized boolean j() {
        return this.f93202a instanceof SSLSocket;
    }

    public final void k(String str) throws IOException {
        if (this.f93202a == null) {
            throw new IOException("Folder is closed");
        }
        if (str != null) {
            this.f93207f.print(str.concat("\r\n"));
            this.f93207f.flush();
        }
    }

    public final synchronized int l(int i10) throws IOException {
        int i11;
        c cVarY = y("LIST " + i10);
        if (!cVarY.f93215a || cVarY.f93216b == null) {
            i11 = -1;
        } else {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(cVarY.f93216b);
                stringTokenizer.nextToken();
                i11 = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
                i11 = -1;
            }
        }
        return i11;
    }

    public final synchronized InputStream m() throws IOException {
        return o(128, "LIST").f93217c;
    }

    public final synchronized String n(String str, String str2) throws IOException {
        c cVarY;
        boolean z10 = this.m && (this.f93202a instanceof SSLSocket);
        try {
            if (this.f93214n) {
                MailLogger mailLogger = this.f93211j;
                Level level = Level.FINEST;
                if (mailLogger.isLoggable(level)) {
                    this.f93210i.fine("authentication command trace suppressed");
                    if (this.f93211j.isLoggable(level)) {
                        this.f93208g.setTrace(false);
                        this.f93209h.setTrace(false);
                    }
                }
            }
            String strG = this.f93212k != null ? g(str2) : null;
            if (this.f93212k != null && strG != null) {
                cVarY = y("APOP " + str + " " + strG);
            } else if (z10) {
                k("USER " + str);
                k("PASS " + str2);
                c cVarS = s();
                if (!cVarS.f93215a) {
                    String str3 = cVarS.f93216b;
                    if (str3 == null) {
                        str3 = "USER command failed";
                    }
                    s();
                    t();
                    return str3;
                }
                cVarY = s();
            } else {
                c cVarY2 = y("USER " + str);
                if (!cVarY2.f93215a) {
                    String str4 = cVarY2.f93216b;
                    if (str4 == null) {
                        str4 = "USER command failed";
                    }
                    t();
                    return str4;
                }
                cVarY = y("PASS " + str2);
            }
            if (this.f93214n && this.f93211j.isLoggable(Level.FINEST)) {
                this.f93210i.log(Level.FINE, "authentication command {0}", cVarY.f93215a ? "succeeded" : "failed");
            }
            if (cVarY.f93215a) {
                t();
                return null;
            }
            String str5 = cVarY.f93216b;
            if (str5 == null) {
                str5 = "login failed";
            }
            t();
            return str5;
        } catch (Throwable th2) {
            t();
            throw th2;
        }
    }

    public final c o(int i10, String str) throws IOException {
        k(str);
        c cVarS = s();
        if (!cVarS.f93215a) {
            return cVarS;
        }
        cVarS.f93217c = r(i10);
        return cVarS;
    }

    public final synchronized boolean p() throws IOException {
        return y("NOOP").f93215a;
    }

    public final synchronized void q() throws IOException {
        try {
            y("QUIT");
            c();
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final InputStream r(int i10) throws IOException {
        int i11;
        SharedByteArrayOutputStream sharedByteArrayOutputStream = new SharedByteArrayOutputStream(i10);
        int i12 = 10;
        while (true) {
            try {
                i11 = this.f93206e.read();
                if (i11 < 0) {
                    break;
                }
                if (i12 == 10 && i11 == 46) {
                    i12 = this.f93206e.read();
                    if (i12 == 13) {
                        i11 = this.f93206e.read();
                        break;
                    }
                } else {
                    i12 = i11;
                }
                sharedByteArrayOutputStream.write(i12);
            } catch (InterruptedIOException e5) {
                try {
                    this.f93202a.close();
                } catch (IOException unused) {
                }
                throw e5;
            }
        }
        if (i11 >= 0) {
            return sharedByteArrayOutputStream.toStream();
        }
        throw new EOFException("EOF on socket");
    }

    public final c s() throws IOException {
        try {
            String line = this.f93206e.readLine();
            if (line == null) {
                this.f93211j.finest("<EOF>");
                throw new EOFException("EOF on socket");
            }
            c cVar = new c();
            cVar.f93215a = false;
            cVar.f93216b = null;
            cVar.f93217c = null;
            if (line.startsWith("+OK")) {
                cVar.f93215a = true;
            } else {
                if (!line.startsWith("-ERR")) {
                    throw new IOException("Unexpected response: ".concat(line));
                }
                cVar.f93215a = false;
            }
            int iIndexOf = line.indexOf(32);
            if (iIndexOf >= 0) {
                cVar.f93216b = line.substring(iIndexOf + 1);
            }
            return cVar;
        } catch (InterruptedIOException e5) {
            try {
                this.f93202a.close();
            } catch (IOException unused) {
            }
            throw new EOFException(e5.getMessage());
        } catch (SocketException e7) {
            try {
                this.f93202a.close();
            } catch (IOException unused2) {
            }
            throw new EOFException(e7.getMessage());
        }
    }

    public final void t() {
        if (this.f93211j.isLoggable(Level.FINEST)) {
            this.f93208g.setTrace(true);
            this.f93209h.setTrace(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x003c, B:12:0x0040, B:16:0x0057, B:18:0x0061, B:24:0x007a, B:26:0x0082, B:47:0x00f0, B:50:0x00f6, B:52:0x0100, B:53:0x0117, B:27:0x008b, B:33:0x00a7, B:35:0x00ab, B:37:0x00c2, B:41:0x00cb, B:43:0x00d5, B:46:0x00ea), top: B:60:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[Catch: all -> 0x0073, RuntimeException -> 0x00ea, TryCatch #0 {, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x003c, B:12:0x0040, B:16:0x0057, B:18:0x0061, B:24:0x007a, B:26:0x0082, B:47:0x00f0, B:50:0x00f6, B:52:0x0100, B:53:0x0117, B:27:0x008b, B:33:0x00a7, B:35:0x00ab, B:37:0x00c2, B:41:0x00cb, B:43:0x00d5, B:46:0x00ea), top: B:60:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x008b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00a2, please report this as an issue */
    public final synchronized InputStream u(int i10, int i11) throws IOException {
        c cVarS;
        StringTokenizer stringTokenizer;
        String strNextToken;
        if (i11 != 0) {
            k("RETR " + i10);
            cVarS = s();
            if (!cVarS.f93215a) {
                return null;
            }
            if (i11 <= 0) {
                stringTokenizer = new StringTokenizer(cVarS.f93216b);
                strNextToken = stringTokenizer.nextToken();
                if (stringTokenizer.nextToken().equals("octets")) {
                    i11 = Integer.parseInt(strNextToken);
                    if (i11 <= 1073741824) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                }
            }
            cVarS.f93217c = r(i11);
            if (cVarS.f93215a) {
                this.f93210i.fine("got message size " + cVarS.f93217c.available());
            }
            return cVarS.f93217c;
        }
        if (this.m) {
            k("LIST " + i10);
            k("RETR " + i10);
            c cVarS2 = s();
            if (cVarS2.f93215a && cVarS2.f93216b != null) {
                try {
                    StringTokenizer stringTokenizer2 = new StringTokenizer(cVarS2.f93216b);
                    stringTokenizer2.nextToken();
                    i11 = Integer.parseInt(stringTokenizer2.nextToken());
                    if (i11 > 1073741824 || i11 < 0) {
                        i11 = 0;
                    } else {
                        if (this.f93210i.isLoggable(Level.FINE)) {
                            this.f93210i.fine("pipeline message size " + i11);
                        }
                        i11 += 128;
                    }
                } catch (RuntimeException unused) {
                }
            }
            cVarS = s();
            if (cVarS.f93215a) {
                cVarS.f93217c = r(i11 + 128);
            }
        } else {
            k("RETR " + i10);
            cVarS = s();
            if (!cVarS.f93215a) {
                return null;
            }
            if (i11 <= 0 && cVarS.f93216b != null) {
                try {
                    stringTokenizer = new StringTokenizer(cVarS.f93216b);
                    strNextToken = stringTokenizer.nextToken();
                    if (stringTokenizer.nextToken().equals("octets")) {
                        i11 = Integer.parseInt(strNextToken);
                        if (i11 <= 1073741824 || i11 < 0) {
                            i11 = 0;
                        } else {
                            if (this.f93210i.isLoggable(Level.FINE)) {
                                this.f93210i.fine("guessing message size: " + i11);
                            }
                            i11 += 128;
                        }
                    }
                } catch (RuntimeException unused2) {
                }
            }
            cVarS.f93217c = r(i11);
        }
        if (cVarS.f93215a && i11 > 0 && this.f93210i.isLoggable(Level.FINE)) {
            this.f93210i.fine("got message size " + cVarS.f93217c.available());
        }
        return cVarS.f93217c;
        throw th;
    }

    public final synchronized boolean v(OutputStream outputStream, int i10) throws IOException {
        int i11;
        k("RETR " + i10);
        if (!s().f93215a) {
            return false;
        }
        Throwable e5 = null;
        int i12 = 10;
        while (true) {
            try {
                i11 = this.f93206e.read();
                if (i11 < 0) {
                    break;
                }
                if (i12 == 10 && i11 == 46) {
                    i12 = this.f93206e.read();
                    if (i12 == 13) {
                        i11 = this.f93206e.read();
                        break;
                    }
                } else {
                    i12 = i11;
                }
                if (e5 == null) {
                    try {
                        outputStream.write(i12);
                    } catch (IOException e7) {
                        e5 = e7;
                        this.f93210i.log(Level.FINE, "exception while streaming", e5);
                    } catch (RuntimeException e10) {
                        e5 = e10;
                        this.f93210i.log(Level.FINE, "exception while streaming", e5);
                    }
                }
            } catch (InterruptedIOException e11) {
                try {
                    this.f93202a.close();
                } catch (IOException unused) {
                }
                throw e11;
            }
        }
        if (i11 < 0) {
            throw new EOFException("EOF on socket");
        }
        if (e5 != null) {
            if (e5 instanceof IOException) {
                throw ((IOException) e5);
            }
            if (e5 instanceof RuntimeException) {
                throw ((RuntimeException) e5);
            }
        }
        return true;
    }

    public final synchronized void w() throws IOException {
        y("RSET");
    }

    public final synchronized void x(InputStream inputStream) {
        BufferedReader bufferedReader = null;
        if (inputStream == null) {
            this.f93213l = null;
            return;
        }
        this.f93213l = new HashMap(10);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "us-ascii"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    int iIndexOf = line.indexOf(32);
                    this.f93213l.put((iIndexOf > 0 ? line.substring(0, iIndexOf) : line).toUpperCase(Locale.ENGLISH), line);
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            }
        } catch (UnsupportedEncodingException unused3) {
        }
        inputStream.close();
        try {
            inputStream.close();
        } catch (IOException unused4) {
        }
    }

    public final c y(String str) throws IOException {
        k(str);
        return s();
    }

    public final synchronized d z() throws IOException {
        d dVar;
        c cVarY = y("STAT");
        dVar = new d();
        dVar.f93218a = 0;
        dVar.f93219b = 0;
        if (!cVarY.f93215a) {
            throw new IOException("STAT command failed: " + cVarY.f93216b);
        }
        if (cVarY.f93216b != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(cVarY.f93216b);
                dVar.f93218a = Integer.parseInt(stringTokenizer.nextToken());
                dVar.f93219b = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
            }
        }
        return dVar;
    }
}
