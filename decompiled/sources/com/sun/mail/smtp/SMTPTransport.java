package com.sun.mail.smtp;

import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.sun.mail.auth.Ntlm;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.mail.Address;
import javax.mail.AuthenticationFailedException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Service;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimePart;
import javax.mail.internet.ParseException;
import javax.net.ssl.SSLSocket;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class SMTPTransport extends Transport {
    public static final String[] r1 = {"Bcc", "Content-Length"};

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final byte[] f65491s1 = {13, 10};

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String[] f65492t1 = new String[0];

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final char[] f65493u1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public Address[] E0;
    public Address[] F0;
    public Address[] G0;
    public boolean H0;
    public MessagingException I0;
    public SMTPOutputStream J0;
    public Hashtable<String, String> K0;
    public final HashMap L0;
    public final String M0;
    public final boolean N0;
    public String O0;
    public String P0;
    public boolean Q0;
    public boolean R0;
    public String[] S0;
    public String T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public final MailLogger Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final MailLogger f65494a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f65495b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f65496c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f65497d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f65498e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public SaslAuthenticator f65499f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final boolean f65500g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final boolean f65501h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final boolean f65502i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final boolean f65503j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final int f65504k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public BufferedInputStream f65505l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public LineInputStream f65506m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public BufferedOutputStream f65507n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Socket f65508o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public TraceInputStream f65509p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public TraceOutputStream f65510q1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f65511t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f65512u0;
    public final boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f65513w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public MimeMessage f65514x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Address[] f65515y0;

    public abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f65516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65518c;

        public a(String str, boolean z10) {
            this.f65517b = str.toUpperCase(Locale.ENGLISH);
            this.f65518c = z10;
        }

        public abstract void a(String str, String str2, String str3) throws MessagingException, IOException;

        public String b(String str, String str2, String str3) throws MessagingException, IOException {
            return null;
        }
    }

    public class b extends SMTPOutputStream {
        public b(OutputStream outputStream, int i10) {
            super(SMTPTransport.this.new c(outputStream, i10));
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            ((FilterOutputStream) this).out.close();
        }
    }

    public class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DigestMD5 f65525e;

        public d() {
            super("DIGEST-MD5", true);
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final void a(String str, String str2, String str3) throws MessagingException, IOException {
            DigestMD5 digestMD5;
            synchronized (this) {
                try {
                    if (this.f65525e == null) {
                        this.f65525e = new DigestMD5(SMTPTransport.this.Z0);
                    }
                    digestMD5 = this.f65525e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iSimpleCommand = SMTPTransport.this.simpleCommand(digestMD5.authClient(str, str2, str3, SMTPTransport.this.getSASLRealm(), SMTPTransport.this.getLastServerResponse()));
            this.f65516a = iSimpleCommand;
            if (iSimpleCommand == 334) {
                if (digestMD5.authServer(SMTPTransport.this.getLastServerResponse())) {
                    this.f65516a = SMTPTransport.this.simpleCommand(new byte[0]);
                } else {
                    this.f65516a = -1;
                }
            }
        }
    }

    public class e extends a {
        public e() {
            super("LOGIN", true);
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final void a(String str, String str2, String str3) throws MessagingException, IOException {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArrEncode = BASE64EncoderStream.encode(str2.getBytes(charset));
            SMTPTransport sMTPTransport = SMTPTransport.this;
            int iSimpleCommand = sMTPTransport.simpleCommand(bArrEncode);
            this.f65516a = iSimpleCommand;
            if (iSimpleCommand == 334) {
                this.f65516a = sMTPTransport.simpleCommand(BASE64EncoderStream.encode(str3.getBytes(charset)));
            }
        }
    }

    public class f extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Ntlm f65528e;

        public f() {
            super("NTLM", true);
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final void a(String str, String str2, String str3) throws MessagingException, IOException {
            Ntlm ntlm = this.f65528e;
            SMTPTransport sMTPTransport = SMTPTransport.this;
            this.f65516a = sMTPTransport.simpleCommand(ntlm.generateType3Msg(sMTPTransport.getLastServerResponse().substring(4).trim()));
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final String b(String str, String str2, String str3) throws MessagingException, IOException {
            SMTPTransport sMTPTransport = SMTPTransport.this;
            this.f65528e = new Ntlm(sMTPTransport.getNTLMDomain(), sMTPTransport.getLocalHost(), str2, str3, sMTPTransport.Z0);
            return this.f65528e.generateType1Msg(PropUtil.getIntProperty(((Service) sMTPTransport).session.getProperties(), "mail." + sMTPTransport.f65511t0 + ".auth.ntlm.flags", 0));
        }
    }

    public class g extends a {
        public g() {
            super("XOAUTH2", false);
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final void a(String str, String str2, String str3) throws MessagingException, IOException {
            throw new AuthenticationFailedException("OAUTH2 asked for more");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final String b(String str, String str2, String str3) throws MessagingException, IOException {
            return ASCIIUtility.toString(BASE64EncoderStream.encode(u.g("user=", str2, "\u0001auth=Bearer ", str3, "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
        }
    }

    public class h extends a {
        public h() {
            super("PLAIN", true);
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final void a(String str, String str2, String str3) throws MessagingException, IOException {
            throw new AuthenticationFailedException("PLAIN asked for more");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.a
        public final String b(String str, String str2, String str3) throws MessagingException, IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
            if (str != null) {
                bASE64EncoderStream.write(str.getBytes(StandardCharsets.UTF_8));
            }
            bASE64EncoderStream.write(0);
            Charset charset = StandardCharsets.UTF_8;
            bASE64EncoderStream.write(str2.getBytes(charset));
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str3.getBytes(charset));
            bASE64EncoderStream.flush();
            return ASCIIUtility.toString(byteArrayOutputStream.toByteArray());
        }
    }

    public SMTPTransport(Session session, URLName uRLName) {
        this(session, uRLName, "smtp", false);
    }

    public static String s(String str) {
        return (str.startsWith("<") || str.endsWith(">")) ? str : h0.b("<", str, ">");
    }

    public static String xtext(String str) {
        return xtext(str, false);
    }

    public OutputStream bdat() throws MessagingException {
        b bVar = new b(this.f65507n1, this.f65504k1);
        this.J0 = bVar;
        return bVar;
    }

    public void checkConnected() {
        if (!super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    @Override // javax.mail.Service, java.lang.AutoCloseable
    public synchronized void close() throws MessagingException {
        int serverResponse;
        if (super.isConnected()) {
            try {
                if (this.f65508o1 != null) {
                    sendCommand("QUIT");
                    if (this.N0 && (serverResponse = readServerResponse()) != 221 && serverResponse != -1 && this.Z0.isLoggable(Level.FINE)) {
                        this.Z0.fine("QUIT failed with " + serverResponse);
                    }
                }
                l();
            } catch (Throwable th2) {
                l();
                throw th2;
            }
        }
    }

    public synchronized void connect(Socket socket) throws MessagingException {
        this.f65508o1 = socket;
        super.connect();
    }

    public OutputStream data() throws MessagingException {
        r(ResultCode.ERROR_CONN_SSL_PROTOCOL, "DATA");
        SMTPOutputStream sMTPOutputStream = new SMTPOutputStream(this.f65507n1);
        this.J0 = sMTPOutputStream;
        return sMTPOutputStream;
    }

    public final void e() {
        Address[] addressArr = this.E0;
        if (addressArr != null) {
            Address[] addressArr2 = this.F0;
            if (addressArr2 == null) {
                this.F0 = addressArr;
                this.E0 = null;
                return;
            }
            Address[] addressArr3 = new Address[addressArr.length + addressArr2.length];
            System.arraycopy(addressArr, 0, addressArr3, 0, addressArr.length);
            Address[] addressArr4 = this.F0;
            System.arraycopy(addressArr4, 0, addressArr3, this.E0.length, addressArr4.length);
            this.E0 = null;
            this.F0 = addressArr3;
        }
    }

    public boolean ehlo(String str) throws MessagingException {
        MailLogger mailLogger = this.Z0;
        sendCommand(str != null ? "EHLO ".concat(str) : "EHLO");
        int serverResponse = readServerResponse();
        if (serverResponse == 250) {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(this.f65496c1));
            this.K0 = new Hashtable<>();
            boolean z10 = true;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (z10) {
                        z10 = false;
                    } else if (line.length() >= 5) {
                        String strSubstring = line.substring(4);
                        int iIndexOf = strSubstring.indexOf(32);
                        String strSubstring2 = "";
                        if (iIndexOf > 0) {
                            strSubstring2 = strSubstring.substring(iIndexOf + 1);
                            strSubstring = strSubstring.substring(0, iIndexOf);
                        }
                        if (mailLogger.isLoggable(Level.FINE)) {
                            mailLogger.fine("Found extension \"" + strSubstring + "\", arg \"" + strSubstring2 + "\"");
                        }
                        this.K0.put(strSubstring.toUpperCase(Locale.ENGLISH), strSubstring2);
                    }
                } catch (IOException unused) {
                }
            }
        }
        return serverResponse == 250;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0101 A[EDGE_INSN: B:151:0x0101->B:44:0x0101 BREAK  A[LOOP:0: B:30:0x0087->B:154:0x0087], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0101 A[EDGE_INSN: B:152:0x0101->B:44:0x0101 BREAK  A[LOOP:0: B:30:0x0087->B:154:0x0087], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x0149 A[Catch: all -> 0x0155, IOException -> 0x0158, TryCatch #5 {IOException -> 0x0158, all -> 0x0155, blocks: (B:45:0x011b, B:48:0x0125, B:50:0x012b, B:52:0x0149, B:58:0x015d, B:62:0x0172, B:64:0x0192, B:66:0x0198, B:68:0x019d, B:69:0x01b6, B:70:0x01c8, B:72:0x01ce, B:63:0x0180), top: B:143:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x015d A[Catch: all -> 0x0155, IOException -> 0x0158, TryCatch #5 {IOException -> 0x0158, all -> 0x0155, blocks: (B:45:0x011b, B:48:0x0125, B:50:0x012b, B:52:0x0149, B:58:0x015d, B:62:0x0172, B:64:0x0192, B:66:0x0198, B:68:0x019d, B:69:0x01b6, B:70:0x01c8, B:72:0x01ce, B:63:0x0180), top: B:143:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180 A[Catch: all -> 0x0155, IOException -> 0x0158, TryCatch #5 {IOException -> 0x0158, all -> 0x0155, blocks: (B:45:0x011b, B:48:0x0125, B:50:0x012b, B:52:0x0149, B:58:0x015d, B:62:0x0172, B:64:0x0192, B:66:0x0198, B:68:0x019d, B:69:0x01b6, B:70:0x01c8, B:72:0x01ce, B:63:0x0180), top: B:143:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0198 A[Catch: all -> 0x0155, IOException -> 0x0158, TryCatch #5 {IOException -> 0x0158, all -> 0x0155, blocks: (B:45:0x011b, B:48:0x0125, B:50:0x012b, B:52:0x0149, B:58:0x015d, B:62:0x0172, B:64:0x0192, B:66:0x0198, B:68:0x019d, B:69:0x01b6, B:70:0x01c8, B:72:0x01ce, B:63:0x0180), top: B:143:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019d A[Catch: all -> 0x0155, IOException -> 0x0158, TryCatch #5 {IOException -> 0x0158, all -> 0x0155, blocks: (B:45:0x011b, B:48:0x0125, B:50:0x012b, B:52:0x0149, B:58:0x015d, B:62:0x0172, B:64:0x0192, B:66:0x0198, B:68:0x019d, B:69:0x01b6, B:70:0x01c8, B:72:0x01ce, B:63:0x0180), top: B:143:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b6 A[Catch: all -> 0x0155, IOException -> 0x0158, TryCatch #5 {IOException -> 0x0158, all -> 0x0155, blocks: (B:45:0x011b, B:48:0x0125, B:50:0x012b, B:52:0x0149, B:58:0x015d, B:62:0x0172, B:64:0x0192, B:66:0x0198, B:68:0x019d, B:69:0x01b6, B:70:0x01c8, B:72:0x01ce, B:63:0x0180), top: B:143:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce A[Catch: all -> 0x0155, IOException -> 0x0158, TRY_LEAVE, TryCatch #5 {IOException -> 0x0158, all -> 0x0155, blocks: (B:45:0x011b, B:48:0x0125, B:50:0x012b, B:52:0x0149, B:58:0x015d, B:62:0x0172, B:64:0x0192, B:66:0x0198, B:68:0x019d, B:69:0x01b6, B:70:0x01c8, B:72:0x01ce, B:63:0x0180), top: B:143:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0071, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0180, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x019d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x01b6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final boolean f(String str, String str2) throws MessagingException {
        boolean z10;
        StringTokenizer stringTokenizer;
        Locale locale;
        String upperCase;
        a aVar;
        String str3;
        ?? r3;
        ?? r10;
        ?? r11;
        SMTPTransport sMTPTransport;
        ?? r4;
        ?? r12;
        ?? r13;
        String strB;
        boolean z11;
        MailLogger mailLogger;
        ?? r14;
        String str4;
        String string;
        Session session = this.session;
        StringBuilder sb2 = new StringBuilder("mail.");
        String str5 = this.f65511t0;
        sb2.append(str5);
        sb2.append(".auth.mechanisms");
        String property = session.getProperty(sb2.toString());
        String str6 = this.M0;
        String str7 = property == null ? str6 : property;
        String authorizationId = getAuthorizationId();
        String str8 = authorizationId == null ? str : authorizationId;
        boolean z12 = this.Q0;
        MailLogger mailLogger2 = this.Z0;
        if (z12) {
            mailLogger2.fine("Authenticate with SASL");
            try {
                z10 = false;
                try {
                    if (x(getSASLRealm(), str8, str, getSASLMechanisms(), str2)) {
                        return true;
                    }
                    mailLogger2.fine("SASL authentication failed");
                    return false;
                } catch (UnsupportedOperationException e5) {
                    e = e5;
                    mailLogger2.log(Level.FINE, "SASL support failed", (Throwable) e);
                    if (mailLogger2.isLoggable(Level.FINE)) {
                        mailLogger2.fine("Attempt to authenticate using mechanisms: " + str7);
                    }
                    stringTokenizer = new StringTokenizer(str7);
                    while (true) {
                        if (stringTokenizer.hasMoreTokens()) {
                            throw new AuthenticationFailedException("No authentication mechanisms supported by both server and client");
                        }
                        String strNextToken = stringTokenizer.nextToken();
                        locale = Locale.ENGLISH;
                        upperCase = strNextToken.toUpperCase(locale);
                        aVar = (a) this.L0.get(upperCase);
                        if (aVar == null) {
                            if (supportsAuthentication(upperCase)) {
                                mailLogger2.log(Level.FINE, "mechanism {0} not supported by server", upperCase);
                            } else {
                                if (str7 == str6) {
                                    break;
                                }
                                StringBuilder sbD = ci.a.d("mail.", str5, ".auth.");
                                sbD.append(upperCase.toLowerCase(locale));
                                sbD.append(".disable");
                                string = sbD.toString();
                                if (PropUtil.getBooleanProperty(this.session.getProperties(), string, !aVar.f65518c)) {
                                    break;
                                }
                                if (mailLogger2.isLoggable(Level.FINE)) {
                                    mailLogger2.fine("mechanism " + upperCase + " disabled by property: " + string);
                                }
                            }
                        } else {
                            mailLogger2.log(Level.FINE, "no authenticator for mechanism {0}", upperCase);
                        }
                    }
                    mailLogger2.log(Level.FINE, "Using mechanism {0}", upperCase);
                    str3 = this.f65513w0;
                    r3 = "failed";
                    r10 = " ";
                    r11 = aVar.f65517b;
                    sMTPTransport = SMTPTransport.this;
                    try {
                        strB = aVar.b(str8, str, str2);
                        z11 = sMTPTransport.f65500g1;
                        mailLogger = sMTPTransport.Z0;
                        if (z11) {
                            mailLogger.fine("AUTH " + r11 + " command trace suppressed");
                            if (sMTPTransport.f65494a1.isLoggable(Level.FINEST)) {
                                sMTPTransport.f65509p1.setTrace(false);
                                sMTPTransport.f65510q1.setTrace(false);
                            }
                        }
                        if (strB != null) {
                            ?? sb3 = new StringBuilder("AUTH ");
                            sb3.append(r11);
                            sb3.append(" ");
                            if (strB.length() == 0) {
                                str4 = "=";
                            } else {
                                str4 = strB;
                            }
                            sb3.append(str4);
                            aVar.f65516a = sMTPTransport.simpleCommand(sb3.toString());
                        } else {
                            aVar.f65516a = sMTPTransport.simpleCommand("AUTH " + r11);
                        }
                        if (aVar.f65516a == 530) {
                            sMTPTransport.startTLS();
                            if (strB != null) {
                                aVar.f65516a = sMTPTransport.simpleCommand("AUTH " + r11 + " " + strB);
                            } else {
                                aVar.f65516a = sMTPTransport.simpleCommand("AUTH " + r11);
                            }
                        }
                        if (aVar.f65516a == 334) {
                            aVar.a(str3, str, str2);
                        }
                        if (sMTPTransport.f65500g1) {
                            ?? D = ci.a.d("AUTH ", r11, " ");
                            if (aVar.f65516a == 235) {
                                r14 = r3;
                                r14 = "succeeded";
                            }
                            r14 = r3;
                            D.append(r14);
                            mailLogger.fine(D.toString());
                        }
                        sMTPTransport.w();
                        if (aVar.f65516a != 235) {
                            sMTPTransport.l();
                            throw new AuthenticationFailedException(sMTPTransport.getLastServerResponse());
                        }
                        return true;
                    } catch (Throwable th2) {
                        if (sMTPTransport.f65500g1 && sMTPTransport.q()) {
                            ?? D2 = ci.a.d("AUTH ", r11, r10);
                            if (aVar.f65516a == 235) {
                                r13 = r3;
                                r13 = "succeeded";
                            }
                            r13 = r3;
                            D2.append(r13);
                            sMTPTransport.Z0.fine(D2.toString());
                        }
                        sMTPTransport.w();
                        if (aVar.f65516a == 235) {
                            throw th2;
                        }
                        sMTPTransport.l();
                        throw new AuthenticationFailedException(sMTPTransport.getLastServerResponse());
                    }
                }
            } catch (UnsupportedOperationException e7) {
                e = e7;
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (mailLogger2.isLoggable(Level.FINE)) {
            mailLogger2.fine("Attempt to authenticate using mechanisms: " + str7);
        }
        stringTokenizer = new StringTokenizer(str7);
        while (true) {
            if (stringTokenizer.hasMoreTokens()) {
                throw new AuthenticationFailedException("No authentication mechanisms supported by both server and client");
            }
            String strNextToken2 = stringTokenizer.nextToken();
            locale = Locale.ENGLISH;
            upperCase = strNextToken2.toUpperCase(locale);
            aVar = (a) this.L0.get(upperCase);
            if (aVar == null) {
                if (supportsAuthentication(upperCase)) {
                    if (str7 == str6) {
                        break;
                        break;
                    }
                    StringBuilder sbD2 = ci.a.d("mail.", str5, ".auth.");
                    sbD2.append(upperCase.toLowerCase(locale));
                    sbD2.append(".disable");
                    string = sbD2.toString();
                    if (PropUtil.getBooleanProperty(this.session.getProperties(), string, !aVar.f65518c)) {
                        break;
                        break;
                    }
                    if (mailLogger2.isLoggable(Level.FINE)) {
                        mailLogger2.fine("mechanism " + upperCase + " disabled by property: " + string);
                    }
                } else {
                    mailLogger2.log(Level.FINE, "mechanism {0} not supported by server", upperCase);
                }
            } else {
                mailLogger2.log(Level.FINE, "no authenticator for mechanism {0}", upperCase);
            }
        }
        mailLogger2.log(Level.FINE, "Using mechanism {0}", upperCase);
        str3 = this.f65513w0;
        r3 = "failed";
        r10 = " ";
        r11 = aVar.f65517b;
        sMTPTransport = SMTPTransport.this;
        try {
            strB = aVar.b(str8, str, str2);
            z11 = sMTPTransport.f65500g1;
            mailLogger = sMTPTransport.Z0;
            if (z11 && sMTPTransport.q()) {
                mailLogger.fine("AUTH " + r11 + " command trace suppressed");
                if (sMTPTransport.f65494a1.isLoggable(Level.FINEST)) {
                    sMTPTransport.f65509p1.setTrace(false);
                    sMTPTransport.f65510q1.setTrace(false);
                }
            }
            if (strB != null) {
                ?? sb4 = new StringBuilder("AUTH ");
                sb4.append(r11);
                sb4.append(" ");
                if (strB.length() == 0) {
                    str4 = "=";
                } else {
                    str4 = strB;
                }
                sb4.append(str4);
                aVar.f65516a = sMTPTransport.simpleCommand(sb4.toString());
            } else {
                aVar.f65516a = sMTPTransport.simpleCommand("AUTH " + r11);
            }
            if (aVar.f65516a == 530) {
                sMTPTransport.startTLS();
                if (strB != null) {
                    aVar.f65516a = sMTPTransport.simpleCommand("AUTH " + r11 + " " + strB);
                } else {
                    aVar.f65516a = sMTPTransport.simpleCommand("AUTH " + r11);
                }
            }
            if (aVar.f65516a == 334) {
                aVar.a(str3, str, str2);
            }
            if (sMTPTransport.f65500g1 && sMTPTransport.q()) {
                ?? D3 = ci.a.d("AUTH ", r11, " ");
                if (aVar.f65516a == 235) {
                    r14 = r3;
                    r14 = "succeeded";
                }
                r14 = r3;
                D3.append(r14);
                mailLogger.fine(D3.toString());
            }
            sMTPTransport.w();
            if (aVar.f65516a != 235) {
                sMTPTransport.l();
                throw new AuthenticationFailedException(sMTPTransport.getLastServerResponse());
            }
        } catch (IOException e10) {
            sMTPTransport.Z0.log(Level.FINE, "AUTH " + r11 + " failed", (Throwable) e10);
            ?? r15 = r3;
            ?? r16 = r10;
            if (sMTPTransport.f65500g1 && sMTPTransport.q()) {
                ?? D4 = ci.a.d("AUTH ", r11, " ");
                r16 = 235;
                if (aVar.f65516a == 235) {
                    r15 = r3;
                    r16 = r10;
                    r12 = r3;
                    r12 = "succeeded";
                }
                r15 = r3;
                r16 = r10;
                r12 = r3;
                D4.append(r12);
                sMTPTransport.Z0.fine(D4.toString());
                r15 = r12;
            }
            r15 = r3;
            r16 = r10;
            sMTPTransport.w();
            r3 = r15;
            r10 = r16;
            r11 = r11;
            if (aVar.f65516a != 235) {
                sMTPTransport.l();
                throw new AuthenticationFailedException(sMTPTransport.getLastServerResponse());
            }
        } catch (Throwable th3) {
            sMTPTransport.Z0.log(Level.FINE, "AUTH " + r11 + " failed", th3);
            ?? r17 = r10;
            ?? r18 = r11;
            if (sMTPTransport.f65500g1 && sMTPTransport.q()) {
                ?? D5 = ci.a.d("AUTH ", r11, " ");
                int i10 = aVar.f65516a;
                r18 = 235;
                if (i10 == 235) {
                    r17 = r10;
                    r18 = r11;
                    r4 = r3;
                    r4 = "succeeded";
                }
                r17 = r10;
                r18 = r11;
                r4 = r3;
                D5.append(r4);
                sMTPTransport.Z0.fine(D5.toString());
                r17 = i10;
            }
            r17 = r10;
            r18 = r11;
            sMTPTransport.w();
            r3 = 235;
            r10 = r17;
            r11 = r18;
            if (aVar.f65516a != 235) {
                sMTPTransport.l();
                if (th3 instanceof Error) {
                    throw ((Error) th3);
                }
                if (th3 instanceof Exception) {
                    throw new AuthenticationFailedException(sMTPTransport.getLastServerResponse(), (Exception) th3);
                }
                throw new AuthenticationFailedException(sMTPTransport.getLastServerResponse());
            }
        }
        return true;
    }

    @Override // javax.mail.Service
    public void finalize() throws Throwable {
        try {
            l();
        } catch (MessagingException unused) {
        } finally {
            super.finalize();
        }
    }

    public void finishBdat() throws MessagingException, IOException {
        this.J0.ensureAtBOL();
        this.J0.close();
    }

    public void finishData() throws MessagingException, IOException {
        this.J0.ensureAtBOL();
        r(250, Constant.DOT_STRING);
    }

    public synchronized String getAuthorizationId() {
        try {
            if (this.P0 == "UNKNOWN") {
                this.P0 = this.session.getProperty("mail." + this.f65511t0 + ".sasl.authorizationid");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.P0;
    }

    public String getExtensionParameter(String str) {
        Hashtable<String, String> hashtable = this.K0;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str.toUpperCase(Locale.ENGLISH));
    }

    public synchronized int getLastReturnCode() {
        return this.f65497d1;
    }

    public synchronized String getLastServerResponse() {
        return this.f65496c1;
    }

    public synchronized String getLocalHost() {
        Socket socket;
        try {
            String str = this.f65495b1;
            if (str == null || str.length() <= 0) {
                this.f65495b1 = this.session.getProperty("mail." + this.f65511t0 + ".localhost");
            }
            String str2 = this.f65495b1;
            if (str2 == null || str2.length() <= 0) {
                this.f65495b1 = this.session.getProperty("mail." + this.f65511t0 + ".localaddress");
            }
            try {
                String str3 = this.f65495b1;
                if (str3 == null || str3.length() <= 0) {
                    InetAddress localHost = InetAddress.getLocalHost();
                    String canonicalHostName = localHost.getCanonicalHostName();
                    this.f65495b1 = canonicalHostName;
                    if (canonicalHostName == null) {
                        this.f65495b1 = Constant.BRACKET_OPEN + localHost.getHostAddress() + Constant.BRACKET_CLOSE;
                    }
                }
            } catch (UnknownHostException unused) {
            }
            String str4 = this.f65495b1;
            if ((str4 == null || str4.length() <= 0) && (socket = this.f65508o1) != null && socket.isBound()) {
                InetAddress localAddress = this.f65508o1.getLocalAddress();
                String canonicalHostName2 = localAddress.getCanonicalHostName();
                this.f65495b1 = canonicalHostName2;
                if (canonicalHostName2 == null) {
                    this.f65495b1 = Constant.BRACKET_OPEN + localAddress.getHostAddress() + Constant.BRACKET_CLOSE;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f65495b1;
    }

    public synchronized String getNTLMDomain() {
        try {
            if (this.T0 == "UNKNOWN") {
                this.T0 = this.session.getProperty("mail." + this.f65511t0 + ".auth.ntlm.domain");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.T0;
    }

    public synchronized boolean getNoopStrict() {
        return this.Y0;
    }

    public synchronized boolean getReportSuccess() {
        return this.U0;
    }

    public synchronized boolean getRequireStartTLS() {
        return this.W0;
    }

    public synchronized boolean getSASLEnabled() {
        return this.Q0;
    }

    public synchronized String[] getSASLMechanisms() {
        try {
            if (this.S0 == f65492t1) {
                ArrayList arrayList = new ArrayList(5);
                String property = this.session.getProperty("mail." + this.f65511t0 + ".sasl.mechanisms");
                if (property != null && property.length() > 0) {
                    if (this.Z0.isLoggable(Level.FINE)) {
                        this.Z0.fine("SASL mechanisms allowed: ".concat(property));
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(property, " ,");
                    while (stringTokenizer.hasMoreTokens()) {
                        String strNextToken = stringTokenizer.nextToken();
                        if (strNextToken.length() > 0) {
                            arrayList.add(strNextToken);
                        }
                    }
                }
                String[] strArr = new String[arrayList.size()];
                this.S0 = strArr;
                arrayList.toArray(strArr);
            }
            String[] strArr2 = this.S0;
            if (strArr2 == null) {
                return null;
            }
            return (String[]) strArr2.clone();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String getSASLRealm() {
        try {
            if (this.O0 == "UNKNOWN") {
                String property = this.session.getProperty("mail." + this.f65511t0 + ".sasl.realm");
                this.O0 = property;
                if (property == null) {
                    this.O0 = this.session.getProperty("mail." + this.f65511t0 + ".saslrealm");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.O0;
    }

    public synchronized boolean getStartTLS() {
        return this.V0;
    }

    public synchronized boolean getUseCanonicalHostName() {
        return this.R0;
    }

    public synchronized boolean getUseRset() {
        return this.X0;
    }

    public void helo(String str) throws MessagingException {
        if (str != null) {
            issueCommand("HELO ".concat(str), 250);
        } else {
            issueCommand("HELO", 250);
        }
    }

    @Override // javax.mail.Service
    public synchronized boolean isConnected() {
        try {
            if (!super.isConnected()) {
                return false;
            }
            try {
                try {
                    if (this.X0) {
                        sendCommand("RSET");
                    } else {
                        sendCommand("NOOP");
                    }
                    int serverResponse = readServerResponse();
                    if (serverResponse >= 0 && (!this.Y0 ? serverResponse == 421 : serverResponse != 250)) {
                        return true;
                    }
                    try {
                        l();
                    } catch (MessagingException unused) {
                    }
                    return false;
                } catch (MessagingException unused2) {
                }
            } catch (Exception unused3) {
                l();
                return false;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isSSL() {
        return this.f65508o1 instanceof SSLSocket;
    }

    public synchronized void issueCommand(String str, int i10) throws MessagingException {
        sendCommand(str);
        int serverResponse = readServerResponse();
        if (i10 != -1 && serverResponse != i10) {
            throw new MessagingException(this.f65496c1);
        }
    }

    public final void l() throws MessagingException {
        try {
            try {
                Socket socket = this.f65508o1;
                if (socket != null) {
                    socket.close();
                }
                this.f65508o1 = null;
                this.f65507n1 = null;
                this.f65505l1 = null;
                this.f65506m1 = null;
                if (super.isConnected()) {
                    super.close();
                }
            } catch (IOException e5) {
                throw new MessagingException("Server Close Failed", e5);
            }
        } catch (Throwable th2) {
            this.f65508o1 = null;
            this.f65507n1 = null;
            this.f65505l1 = null;
            this.f65506m1 = null;
            if (super.isConnected()) {
                super.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(MimePart mimePart) {
        InputStream inputStream;
        z = false;
        z = false;
        z = false;
        boolean z10 = false;
        try {
            if (!mimePart.isMimeType("text/*")) {
                if (!mimePart.isMimeType("multipart/*")) {
                    return false;
                }
                MimeMultipart mimeMultipart = (MimeMultipart) mimePart.getContent();
                int count = mimeMultipart.getCount();
                boolean z11 = false;
                for (int i10 = 0; i10 < count; i10++) {
                    try {
                        if (m((MimePart) mimeMultipart.getBodyPart(i10))) {
                            z11 = true;
                        }
                    } catch (IOException | MessagingException unused) {
                    }
                }
                return z11;
            }
            String encoding = mimePart.getEncoding();
            if (encoding == null) {
                return false;
            }
            if (!encoding.equalsIgnoreCase("quoted-printable") && !encoding.equalsIgnoreCase("base64")) {
                return false;
            }
            try {
                inputStream = mimePart.getInputStream();
                Object[] objArr = false;
                int i11 = 0;
                while (true) {
                    try {
                        try {
                            int i12 = inputStream.read();
                            if (i12 < 0) {
                                if (objArr != false) {
                                    this.Z0.fine("found an 8bit part");
                                }
                                if (objArr != true) {
                                    break;
                                }
                                mimePart.setContent(mimePart.getContent(), mimePart.getContentType());
                                mimePart.setHeader("Content-Transfer-Encoding", "8bit");
                                z10 = true;
                                break;
                            }
                            int i13 = i12 & 255;
                            if (i13 != 13 && i13 != 10) {
                                if (i13 == 0 || (i11 = i11 + 1) > 998) {
                                    break;
                                }
                            } else {
                                i11 = 0;
                            }
                            if (i13 > 127) {
                                objArr = true;
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                if (inputStream == null) {
                    return z10;
                }
                inputStream.close();
                return z10;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (IOException | MessagingException unused4) {
            return false;
        }
    }

    public void mailFrom() throws MessagingException {
        Address[] from;
        MimeMessage mimeMessage = this.f65514x0;
        String envelopeFrom = mimeMessage instanceof SMTPMessage ? ((SMTPMessage) mimeMessage).getEnvelopeFrom() : null;
        String str = this.f65511t0;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            envelopeFrom = this.session.getProperty("mail." + str + ".from");
        }
        boolean z10 = false;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            MimeMessage mimeMessage2 = this.f65514x0;
            Address localAddress = (mimeMessage2 == null || (from = mimeMessage2.getFrom()) == null || from.length <= 0) ? InternetAddress.getLocalAddress(this.session) : from[0];
            if (localAddress == null) {
                throw new MessagingException("can't determine local email address");
            }
            envelopeFrom = ((InternetAddress) localAddress).getAddress();
        }
        String strB = "MAIL FROM:" + s(envelopeFrom);
        boolean z11 = this.f65503j1;
        if (z11 && supportsExtension("SMTPUTF8")) {
            strB = u.f(strB, " SMTPUTF8");
        }
        if (supportsExtension("DSN")) {
            MimeMessage mimeMessage3 = this.f65514x0;
            String property = mimeMessage3 instanceof SMTPMessage ? SMTPMessage.f65481l[((SMTPMessage) mimeMessage3).f65484g] : null;
            if (property == null) {
                property = this.session.getProperty("mail." + str + ".dsn.ret");
            }
            if (property != null) {
                strB = androidx.camera.core.impl.utils.a.b(strB, " RET=", property);
            }
        }
        if (supportsExtension("AUTH")) {
            MimeMessage mimeMessage4 = this.f65514x0;
            String submitter = mimeMessage4 instanceof SMTPMessage ? ((SMTPMessage) mimeMessage4).getSubmitter() : null;
            if (submitter == null) {
                submitter = this.session.getProperty("mail." + str + ".submitter");
            }
            if (submitter != null) {
                if (z11) {
                    try {
                        if (supportsExtension("SMTPUTF8")) {
                            z10 = true;
                        }
                    } catch (IllegalArgumentException e5) {
                        Level level = Level.FINE;
                        MailLogger mailLogger = this.Z0;
                        if (mailLogger.isLoggable(level)) {
                            mailLogger.log(level, "ignoring invalid submitter: ".concat(submitter), (Throwable) e5);
                        }
                    }
                }
                strB = strB + " AUTH=" + xtext(submitter, z10);
            }
        }
        MimeMessage mimeMessage5 = this.f65514x0;
        String mailExtension = mimeMessage5 instanceof SMTPMessage ? ((SMTPMessage) mimeMessage5).getMailExtension() : null;
        if (mailExtension == null) {
            mailExtension = this.session.getProperty("mail." + str + ".mailextension");
        }
        if (mailExtension != null && mailExtension.length() > 0) {
            strB = androidx.camera.core.impl.utils.a.b(strB, " ", mailExtension);
        }
        try {
            r(250, strB);
        } catch (SMTPSendFailedException e7) {
            int returnCode = e7.getReturnCode();
            if (returnCode == 501 || returnCode == 503 || returnCode == 553 || returnCode == 550 || returnCode == 551) {
                try {
                    e7.setNextException(new SMTPSenderFailedException(new InternetAddress(envelopeFrom), strB, returnCode, e7.getMessage()));
                } catch (AddressException unused) {
                }
            }
            throw e7;
        }
    }

    @Override // javax.mail.Transport
    public void notifyTransportListeners(int i10, Address[] addressArr, Address[] addressArr2, Address[] addressArr3, Message message) {
        if (this.f65498e1) {
            return;
        }
        super.notifyTransportListeners(i10, addressArr, addressArr2, addressArr3, message);
        this.f65498e1 = true;
    }

    public final void o() {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            Address[] addressArr = this.f65515y0;
            if (i10 >= addressArr.length) {
                break;
            }
            InternetAddress internetAddress = (InternetAddress) addressArr[i10];
            if (internetAddress.isGroup()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < i10; i11++) {
                        arrayList.add(this.f65515y0[i11]);
                    }
                }
                try {
                    InternetAddress[] group = internetAddress.getGroup(true);
                    if (group != null) {
                        for (InternetAddress internetAddress2 : group) {
                            arrayList.add(internetAddress2);
                        }
                    } else {
                        arrayList.add(internetAddress);
                    }
                } catch (ParseException unused) {
                    arrayList.add(internetAddress);
                }
            } else if (arrayList != null) {
                arrayList.add(internetAddress);
            }
            i10++;
        }
        if (arrayList != null) {
            InternetAddress[] internetAddressArr = new InternetAddress[arrayList.size()];
            arrayList.toArray(internetAddressArr);
            this.f65515y0 = internetAddressArr;
        }
    }

    public final void p() throws IOException {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.session.getProperties(), "mail.debug.quote", false);
        InputStream inputStream = this.f65508o1.getInputStream();
        MailLogger mailLogger = this.f65494a1;
        TraceInputStream traceInputStream = new TraceInputStream(inputStream, mailLogger);
        this.f65509p1 = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.f65508o1.getOutputStream(), mailLogger);
        this.f65510q1 = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.f65507n1 = new BufferedOutputStream(this.f65510q1);
        this.f65505l1 = new BufferedInputStream(this.f65509p1);
        this.f65506m1 = new LineInputStream(this.f65505l1);
    }

    @Override // javax.mail.Service
    public synchronized boolean protocolConnect(String str, int i10, String str2, String str3) throws MessagingException {
        String str4;
        Properties properties = this.session.getProperties();
        boolean booleanProperty = PropUtil.getBooleanProperty(properties, "mail." + this.f65511t0 + ".auth", false);
        if (booleanProperty && (str2 == null || str3 == null)) {
            if (this.Z0.isLoggable(Level.FINE)) {
                this.Z0.fine("need username and password for authentication");
                MailLogger mailLogger = this.Z0;
                StringBuilder sb2 = new StringBuilder("protocolConnect returning false, host=");
                sb2.append(str);
                sb2.append(", user=");
                if (!this.f65501h1) {
                    str2 = "<user name suppressed>";
                }
                sb2.append(str2);
                sb2.append(", password=");
                if (!this.f65502i1) {
                    str3 = str3 == null ? "<null>" : "<non-null>";
                }
                sb2.append(str3);
                mailLogger.fine(sb2.toString());
            }
            return false;
        }
        boolean booleanProperty2 = PropUtil.getBooleanProperty(properties, "mail." + this.f65511t0 + ".ehlo", true);
        MailLogger mailLogger2 = this.Z0;
        Level level = Level.FINE;
        if (mailLogger2.isLoggable(level)) {
            this.Z0.fine("useEhlo " + booleanProperty2 + ", useAuth " + booleanProperty);
        }
        if (i10 == -1) {
            i10 = PropUtil.getIntProperty(properties, "mail." + this.f65511t0 + ".port", -1);
        }
        if (i10 == -1) {
            i10 = this.f65512u0;
        }
        if (str == null || str.length() == 0) {
            str = "localhost";
        }
        try {
            if (this.f65508o1 != null) {
                u();
            } else {
                v(i10, str);
            }
            if (!booleanProperty2 || !ehlo(getLocalHost())) {
                helo(getLocalHost());
            }
            if (this.V0 || this.W0) {
                if (this.f65508o1 instanceof SSLSocket) {
                    this.Z0.fine("STARTTLS requested but already using SSL");
                } else if (supportsExtension("STARTTLS")) {
                    startTLS();
                    ehlo(getLocalHost());
                } else if (this.W0) {
                    this.Z0.fine("STARTTLS required but not supported");
                    throw new MessagingException("STARTTLS is required but host does not support STARTTLS");
                }
            }
            if (this.f65503j1 && !supportsExtension("SMTPUTF8")) {
                this.Z0.log(Level.INFO, "mail.mime.allowutf8 set but server doesn't advertise SMTPUTF8 support");
            }
            if ((!booleanProperty && (str2 == null || str3 == null)) || (!supportsExtension("AUTH") && !supportsExtension("AUTH=LOGIN"))) {
                return true;
            }
            if (this.Z0.isLoggable(level)) {
                MailLogger mailLogger3 = this.Z0;
                StringBuilder sb3 = new StringBuilder("protocolConnect login, host=");
                sb3.append(str);
                sb3.append(", user=");
                sb3.append(this.f65501h1 ? str2 : "<user name suppressed>");
                sb3.append(", password=");
                if (this.f65502i1) {
                    str4 = str3;
                } else {
                    str4 = str3 == null ? "<null>" : "<non-null>";
                }
                sb3.append(str4);
                mailLogger3.fine(sb3.toString());
            }
            boolean zF = f(str2, str3);
            if (!zF) {
                try {
                    l();
                } catch (MessagingException unused) {
                }
            }
            return zF;
        } catch (Throwable th2) {
            try {
                l();
            } catch (MessagingException unused2) {
            }
            throw th2;
        }
    }

    public final boolean q() {
        return this.f65494a1.isLoggable(Level.FINEST);
    }

    public final void r(int i10, String str) throws MessagingException {
        sendCommand(str);
        int serverResponse = readServerResponse();
        if (serverResponse != i10) {
            Address[] addressArr = this.E0;
            int length = addressArr == null ? 0 : addressArr.length;
            Address[] addressArr2 = this.F0;
            int length2 = addressArr2 == null ? 0 : addressArr2.length;
            Address[] addressArr3 = new Address[length + length2];
            if (length > 0) {
                System.arraycopy(addressArr, 0, addressArr3, 0, length);
            }
            if (length2 > 0) {
                System.arraycopy(this.F0, 0, addressArr3, length, length2);
            }
            this.E0 = null;
            this.F0 = addressArr3;
            Level level = Level.FINE;
            MailLogger mailLogger = this.Z0;
            if (mailLogger.isLoggable(level)) {
                StringBuilder sbC = o1.c("got response code ", serverResponse, ", with response: ");
                sbC.append(this.f65496c1);
                mailLogger.fine(sbC.toString());
            }
            String str2 = this.f65496c1;
            int i11 = this.f65497d1;
            if (this.f65508o1 != null) {
                issueCommand("RSET", -1);
            }
            this.f65496c1 = str2;
            this.f65497d1 = i11;
            throw new SMTPSendFailedException(str, serverResponse, this.f65496c1, this.I0, this.E0, this.F0, this.G0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019e  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d3 A[LOOP:1: B:110:0x01cd->B:112:0x01d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ea A[LOOP:2: B:114:0x01e4->B:116:0x01ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x020c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0240  */
    /* JADX WARN: Code duplicated, block: B:136:0x0254 A[LOOP:3: B:134:0x024f->B:136:0x0254, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x027c A[LOOP:4: B:142:0x0277->B:144:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x02a4 A[LOOP:5: B:150:0x029f->B:152:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d7 A[Catch: all -> 0x02dc, MessagingException -> 0x02e3, TRY_LEAVE, TryCatch #0 {MessagingException -> 0x02e3, blocks: (B:155:0x02d3, B:157:0x02d7), top: B:173:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x030b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:180:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a A[PHI: r8 r11
      0x012a: PHI (r8v6 boolean) = (r8v2 boolean), (r8v7 boolean), (r8v9 boolean), (r8v11 boolean) binds: [B:100:0x019b, B:93:0x0185, B:87:0x0171, B:73:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r11v5 java.lang.Exception) = (r11v3 java.lang.Exception), (r11v6 java.lang.Exception), (r11v7 java.lang.Exception), (r11v8 java.lang.Exception) binds: [B:100:0x019b, B:93:0x0185, B:87:0x0171, B:73:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x017a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0194  */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x0254, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x027c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:152:0x02a4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00c8, please report this as an issue */
    public void rcptTo() throws MessagingException {
        String property;
        boolean z10;
        MessagingException messagingException;
        int i10;
        boolean z11;
        Address[] addressArr;
        Address[] addressArr2;
        Address[] addressArr3;
        Address[] addressArr4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        InternetAddress internetAddress;
        String strB;
        int serverResponse;
        Exception sMTPAddressSucceededException;
        SMTPMessage sMTPMessage;
        int i17;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.G0 = null;
        this.F0 = null;
        this.E0 = null;
        MimeMessage mimeMessage = this.f65514x0;
        boolean sendPartial = mimeMessage instanceof SMTPMessage ? ((SMTPMessage) mimeMessage).getSendPartial() : false;
        String str = this.f65511t0;
        if (!sendPartial) {
            sendPartial = androidx.collection.f.d("mail.", str, ".sendpartial", this.session.getProperties(), false);
        }
        MailLogger mailLogger = this.Z0;
        if (sendPartial) {
            mailLogger.fine("sendPartial set");
        }
        if (supportsExtension("DSN")) {
            MimeMessage mimeMessage2 = this.f65514x0;
            if (!(mimeMessage2 instanceof SMTPMessage) || (i17 = (sMTPMessage = (SMTPMessage) mimeMessage2).f65483f) == 0) {
                property = null;
            } else if (i17 == -1) {
                property = "NEVER";
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((sMTPMessage.f65483f & 1) != 0) {
                    sb2.append(NotifyProvisionResult.SUCCESS_RESULT);
                }
                if ((sMTPMessage.f65483f & 2) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb2.append("FAILURE");
                }
                if ((sMTPMessage.f65483f & 4) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb2.append("DELAY");
                }
                property = sb2.toString();
            }
            if (property == null) {
                property = this.session.getProperty("mail." + str + ".dsn.notify");
            }
            z10 = property != null;
            messagingException = null;
            i10 = 0;
            z11 = false;
            while (true) {
                addressArr = this.f65515y0;
                if (i10 < addressArr.length) {
                    if (sendPartial && arrayList.size() == 0) {
                        z11 = true;
                    }
                    if (z11) {
                        Address[] addressArr5 = new Address[arrayList3.size()];
                        this.G0 = addressArr5;
                        arrayList3.toArray(addressArr5);
                        this.F0 = new Address[arrayList2.size() + arrayList.size()];
                        i14 = 0;
                        i15 = 0;
                        while (i14 < arrayList.size()) {
                            this.F0[i15] = (Address) arrayList.get(i14);
                            i14++;
                            i15++;
                        }
                        i16 = 0;
                        while (i16 < arrayList2.size()) {
                            this.F0[i15] = (Address) arrayList2.get(i16);
                            i16++;
                            i15++;
                        }
                    } else if (!this.U0 || (sendPartial && (arrayList3.size() > 0 || arrayList2.size() > 0))) {
                        this.H0 = true;
                        this.I0 = messagingException;
                        Address[] addressArr6 = new Address[arrayList3.size()];
                        this.G0 = addressArr6;
                        arrayList3.toArray(addressArr6);
                        Address[] addressArr7 = new Address[arrayList2.size()];
                        this.F0 = addressArr7;
                        arrayList2.toArray(addressArr7);
                        Address[] addressArr8 = new Address[arrayList.size()];
                        this.E0 = addressArr8;
                        arrayList.toArray(addressArr8);
                    } else {
                        this.E0 = this.f65515y0;
                    }
                    if (mailLogger.isLoggable(Level.FINE)) {
                        addressArr2 = this.E0;
                        if (addressArr2 != null && addressArr2.length > 0) {
                            mailLogger.fine("Verified Addresses");
                            for (i13 = 0; i13 < this.E0.length; i13++) {
                                mailLogger.fine("  " + this.E0[i13]);
                            }
                        }
                        addressArr3 = this.F0;
                        if (addressArr3 != null && addressArr3.length > 0) {
                            mailLogger.fine("Valid Unsent Addresses");
                            for (i12 = 0; i12 < this.F0.length; i12++) {
                                mailLogger.fine("  " + this.F0[i12]);
                            }
                        }
                        addressArr4 = this.G0;
                        if (addressArr4 != null && addressArr4.length > 0) {
                            mailLogger.fine("Invalid Addresses");
                            for (i11 = 0; i11 < this.G0.length; i11++) {
                                mailLogger.fine("  " + this.G0[i11]);
                            }
                        }
                    }
                    if (z11) {
                        mailLogger.fine("Sending failed because of invalid destination addresses");
                        notifyTransportListeners(2, this.E0, this.F0, this.G0, this.f65514x0);
                        String str2 = this.f65496c1;
                        int i18 = this.f65497d1;
                        try {
                            try {
                                try {
                                    if (this.f65508o1 != null) {
                                        issueCommand("RSET", -1);
                                    }
                                } catch (MessagingException unused) {
                                    close();
                                }
                            } catch (MessagingException e5) {
                                mailLogger.log(Level.FINE, "close failed", (Throwable) e5);
                            }
                            throw new SendFailedException("Invalid Addresses", messagingException, this.E0, this.F0, this.G0);
                        } finally {
                            this.f65496c1 = str2;
                            this.f65497d1 = i18;
                        }
                    }
                    return;
                }
                internetAddress = (InternetAddress) addressArr[i10];
                strB = "RCPT TO:" + s(internetAddress.getAddress());
                if (z10) {
                    strB = androidx.camera.core.impl.utils.a.b(strB, " NOTIFY=", property);
                }
                sendCommand(strB);
                serverResponse = readServerResponse();
                if (serverResponse != 250 || serverResponse == 251) {
                    arrayList.add(internetAddress);
                    if (this.U0) {
                        sMTPAddressSucceededException = new SMTPAddressSucceededException(internetAddress, strB, serverResponse, this.f65496c1);
                        if (messagingException == null) {
                            messagingException = sMTPAddressSucceededException;
                        } else {
                            messagingException.setNextException(sMTPAddressSucceededException);
                        }
                    }
                } else if (serverResponse != 501 && serverResponse != 503) {
                    switch (serverResponse) {
                        default:
                            switch (serverResponse) {
                                case 550:
                                case 551:
                                case 553:
                                    if (!sendPartial) {
                                        z11 = true;
                                    }
                                    arrayList3.add(internetAddress);
                                    sMTPAddressSucceededException = new SMTPAddressFailedException(internetAddress, strB, serverResponse, this.f65496c1);
                                    if (messagingException == null) {
                                        messagingException = sMTPAddressSucceededException;
                                    } else {
                                        messagingException.setNextException(sMTPAddressSucceededException);
                                    }
                                    break;
                                case 552:
                                    break;
                                default:
                                    if (serverResponse >= 400 && serverResponse <= 499) {
                                        arrayList2.add(internetAddress);
                                    } else {
                                        if (serverResponse < 500 || serverResponse > 599) {
                                            if (mailLogger.isLoggable(Level.FINE)) {
                                                StringBuilder sbC = o1.c("got response code ", serverResponse, ", with response: ");
                                                sbC.append(this.f65496c1);
                                                mailLogger.fine(sbC.toString());
                                            }
                                            String str3 = this.f65496c1;
                                            int i19 = this.f65497d1;
                                            if (this.f65508o1 != null) {
                                                issueCommand("RSET", -1);
                                            }
                                            this.f65496c1 = str3;
                                            this.f65497d1 = i19;
                                            throw new SMTPAddressFailedException(internetAddress, strB, serverResponse, str3);
                                        }
                                        arrayList3.add(internetAddress);
                                    }
                                    if (!sendPartial) {
                                        z11 = true;
                                    }
                                    sMTPAddressSucceededException = new SMTPAddressFailedException(internetAddress, strB, serverResponse, this.f65496c1);
                                    if (messagingException == null) {
                                        messagingException = sMTPAddressSucceededException;
                                    } else {
                                        messagingException.setNextException(sMTPAddressSucceededException);
                                    }
                                    break;
                            }
                        case 450:
                        case 451:
                        case 452:
                            if (!sendPartial) {
                                z11 = true;
                            }
                            arrayList2.add(internetAddress);
                            sMTPAddressSucceededException = new SMTPAddressFailedException(internetAddress, strB, serverResponse, this.f65496c1);
                            if (messagingException == null) {
                                messagingException = sMTPAddressSucceededException;
                            } else {
                                messagingException.setNextException(sMTPAddressSucceededException);
                            }
                            break;
                    }
                } else {
                    if (!sendPartial) {
                        z11 = true;
                    }
                    arrayList3.add(internetAddress);
                    sMTPAddressSucceededException = new SMTPAddressFailedException(internetAddress, strB, serverResponse, this.f65496c1);
                    if (messagingException == null) {
                        messagingException = sMTPAddressSucceededException;
                    } else {
                        messagingException.setNextException(sMTPAddressSucceededException);
                    }
                }
                i10++;
            }
        } else {
            property = null;
        }
        messagingException = null;
        i10 = 0;
        z11 = false;
        while (true) {
            addressArr = this.f65515y0;
            if (i10 < addressArr.length) {
                if (sendPartial) {
                    z11 = true;
                }
                if (z11) {
                    Address[] addressArr9 = new Address[arrayList3.size()];
                    this.G0 = addressArr9;
                    arrayList3.toArray(addressArr9);
                    this.F0 = new Address[arrayList2.size() + arrayList.size()];
                    i14 = 0;
                    i15 = 0;
                    while (i14 < arrayList.size()) {
                        this.F0[i15] = (Address) arrayList.get(i14);
                        i14++;
                        i15++;
                    }
                    i16 = 0;
                    while (i16 < arrayList2.size()) {
                        this.F0[i15] = (Address) arrayList2.get(i16);
                        i16++;
                        i15++;
                    }
                } else if (this.U0) {
                    this.H0 = true;
                    this.I0 = messagingException;
                    Address[] addressArr10 = new Address[arrayList3.size()];
                    this.G0 = addressArr10;
                    arrayList3.toArray(addressArr10);
                    Address[] addressArr11 = new Address[arrayList2.size()];
                    this.F0 = addressArr11;
                    arrayList2.toArray(addressArr11);
                    Address[] addressArr12 = new Address[arrayList.size()];
                    this.E0 = addressArr12;
                    arrayList.toArray(addressArr12);
                } else {
                    this.H0 = true;
                    this.I0 = messagingException;
                    Address[] addressArr13 = new Address[arrayList3.size()];
                    this.G0 = addressArr13;
                    arrayList3.toArray(addressArr13);
                    Address[] addressArr14 = new Address[arrayList2.size()];
                    this.F0 = addressArr14;
                    arrayList2.toArray(addressArr14);
                    Address[] addressArr15 = new Address[arrayList.size()];
                    this.E0 = addressArr15;
                    arrayList.toArray(addressArr15);
                }
                if (mailLogger.isLoggable(Level.FINE)) {
                    addressArr2 = this.E0;
                    if (addressArr2 != null) {
                        mailLogger.fine("Verified Addresses");
                        while (i13 < this.E0.length) {
                            mailLogger.fine("  " + this.E0[i13]);
                        }
                    }
                    addressArr3 = this.F0;
                    if (addressArr3 != null) {
                        mailLogger.fine("Valid Unsent Addresses");
                        while (i12 < this.F0.length) {
                            mailLogger.fine("  " + this.F0[i12]);
                        }
                    }
                    addressArr4 = this.G0;
                    if (addressArr4 != null) {
                        mailLogger.fine("Invalid Addresses");
                        while (i11 < this.G0.length) {
                            mailLogger.fine("  " + this.G0[i11]);
                        }
                    }
                }
                if (z11) {
                    mailLogger.fine("Sending failed because of invalid destination addresses");
                    notifyTransportListeners(2, this.E0, this.F0, this.G0, this.f65514x0);
                    String str4 = this.f65496c1;
                    int i110 = this.f65497d1;
                    if (this.f65508o1 != null) {
                        issueCommand("RSET", -1);
                    }
                    throw new SendFailedException("Invalid Addresses", messagingException, this.E0, this.F0, this.G0);
                }
                return;
            }
            internetAddress = (InternetAddress) addressArr[i10];
            strB = "RCPT TO:" + s(internetAddress.getAddress());
            if (z10) {
                strB = androidx.camera.core.impl.utils.a.b(strB, " NOTIFY=", property);
            }
            sendCommand(strB);
            serverResponse = readServerResponse();
            if (serverResponse != 250) {
                arrayList.add(internetAddress);
                if (this.U0) {
                    sMTPAddressSucceededException = new SMTPAddressSucceededException(internetAddress, strB, serverResponse, this.f65496c1);
                    if (messagingException == null) {
                        messagingException = sMTPAddressSucceededException;
                    } else {
                        messagingException.setNextException(sMTPAddressSucceededException);
                    }
                }
            } else {
                arrayList.add(internetAddress);
                if (this.U0) {
                    sMTPAddressSucceededException = new SMTPAddressSucceededException(internetAddress, strB, serverResponse, this.f65496c1);
                    if (messagingException == null) {
                        messagingException = sMTPAddressSucceededException;
                    } else {
                        messagingException.setNextException(sMTPAddressSucceededException);
                    }
                }
            }
            i10++;
        }
        if (mailLogger.isLoggable(Level.FINE)) {
            StringBuilder sbC2 = o1.c("got response code ", serverResponse, ", with response: ");
            sbC2.append(this.f65496c1);
            mailLogger.fine(sbC2.toString());
        }
        String str5 = this.f65496c1;
        int i111 = this.f65497d1;
        if (this.f65508o1 != null) {
            issueCommand("RSET", -1);
        }
        this.f65496c1 = str5;
        this.f65497d1 = i111;
        throw new SMTPAddressFailedException(internetAddress, strB, serverResponse, str5);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    public int readServerResponse() throws MessagingException {
        String line;
        int i10;
        MailLogger mailLogger = this.Z0;
        StringBuilder sb2 = new StringBuilder(100);
        do {
            try {
                line = this.f65506m1.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append(RootService.LINE_BREAK);
                    if (line.length() < 4) {
                        break;
                    }
                } else {
                    String string = sb2.toString();
                    if (string.length() == 0) {
                        string = "[EOF]";
                    }
                    this.f65496c1 = string;
                    this.f65497d1 = -1;
                    mailLogger.log(Level.FINE, "EOF: {0}", string);
                    return -1;
                }
            } catch (IOException e5) {
                mailLogger.log(Level.FINE, "exception reading response", (Throwable) e5);
                this.f65496c1 = "";
                this.f65497d1 = 0;
                throw new MessagingException("Exception reading response", e5);
            }
        } while (line.charAt(3) == '-');
        String string2 = sb2.toString();
        if (string2.length() >= 3) {
            try {
                try {
                    try {
                        i10 = Integer.parseInt(string2.substring(0, 3));
                    } catch (MessagingException e7) {
                        mailLogger.log(Level.FINE, "close failed", (Throwable) e7);
                        i10 = -1;
                    }
                } catch (MessagingException e10) {
                    mailLogger.log(Level.FINE, "close failed", (Throwable) e10);
                    i10 = -1;
                }
            } catch (NumberFormatException unused) {
                close();
                i10 = -1;
                if (i10 == -1) {
                    mailLogger.log(Level.FINE, "bad server response: {0}", string2);
                }
                this.f65496c1 = string2;
                this.f65497d1 = i10;
                return i10;
            } catch (StringIndexOutOfBoundsException unused2) {
                close();
                i10 = -1;
                if (i10 == -1) {
                    mailLogger.log(Level.FINE, "bad server response: {0}", string2);
                }
                this.f65496c1 = string2;
                this.f65497d1 = i10;
                return i10;
            }
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            mailLogger.log(Level.FINE, "bad server response: {0}", string2);
        }
        this.f65496c1 = string2;
        this.f65497d1 = i10;
        return i10;
    }

    public void sendCommand(String str) throws MessagingException {
        y(this.f65503j1 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str));
    }

    @Override // javax.mail.Transport
    public synchronized void sendMessage(Message message, Address[] addressArr) throws MessagingException {
        if (message != null) {
            try {
                message.getSubject();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        checkConnected();
        if (!(message instanceof MimeMessage)) {
            this.Z0.fine("Can only send RFC822 msgs");
            throw new MessagingException("SMTP can only send RFC822 messages");
        }
        for (int i10 = 0; i10 < addressArr.length; i10++) {
            if (!(addressArr[i10] instanceof InternetAddress)) {
                throw new MessagingException(addressArr[i10] + " is not an InternetAddress");
            }
        }
        if (addressArr.length == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        this.f65514x0 = (MimeMessage) message;
        this.f65515y0 = addressArr;
        this.F0 = addressArr;
        o();
        boolean allow8bitMIME = message instanceof SMTPMessage ? ((SMTPMessage) message).getAllow8bitMIME() : false;
        if (!allow8bitMIME) {
            allow8bitMIME = PropUtil.getBooleanProperty(this.session.getProperties(), "mail." + this.f65511t0 + ".allow8bitmime", false);
        }
        if (this.Z0.isLoggable(Level.FINE)) {
            this.Z0.fine("use8bit " + allow8bitMIME);
        }
        if (allow8bitMIME && supportsExtension("8BITMIME") && m(this.f65514x0)) {
            try {
                this.f65514x0.saveChanges();
            } catch (MessagingException unused) {
            }
        }
        try {
            try {
                mailFrom();
                rcptTo();
                if (this.f65504k1 <= 0 || !supportsExtension("CHUNKING")) {
                    this.f65514x0.writeTo(data(), r1);
                    finishData();
                } else {
                    this.f65514x0.writeTo(bdat(), r1);
                    finishBdat();
                }
                if (this.H0) {
                    this.Z0.fine("Sending partially failed because of invalid destination addresses");
                    notifyTransportListeners(3, this.E0, this.F0, this.G0, this.f65514x0);
                    throw new SMTPSendFailedException(Constant.DOT_STRING, this.f65497d1, this.f65496c1, this.I0, this.E0, this.F0, this.G0);
                }
                this.Z0.fine("message successfully delivered to mail server");
                notifyTransportListeners(1, this.E0, this.F0, this.G0, this.f65514x0);
                this.G0 = null;
                this.F0 = null;
                this.E0 = null;
                this.f65515y0 = null;
                this.f65514x0 = null;
                this.I0 = null;
                this.H0 = false;
                this.f65498e1 = false;
            } catch (Throwable th3) {
                this.G0 = null;
                this.F0 = null;
                this.E0 = null;
                this.f65515y0 = null;
                this.f65514x0 = null;
                this.I0 = null;
                this.H0 = false;
                this.f65498e1 = false;
                throw th3;
            }
        } catch (IOException e5) {
            this.Z0.log(Level.FINE, "IOException while sending, closing", (Throwable) e5);
            try {
                l();
            } catch (MessagingException unused2) {
            }
            e();
            notifyTransportListeners(2, this.E0, this.F0, this.G0, this.f65514x0);
            throw new MessagingException("IOException while sending message", e5);
        } catch (MessagingException e7) {
            this.Z0.log(Level.FINE, "MessagingException while sending", (Throwable) e7);
            if (e7.getNextException() instanceof IOException) {
                this.Z0.fine("nested IOException, closing");
                try {
                    l();
                } catch (MessagingException unused3) {
                }
            }
            e();
            notifyTransportListeners(2, this.E0, this.F0, this.G0, this.f65514x0);
            throw e7;
        }
    }

    public synchronized void setAuthorizationID(String str) {
        this.P0 = str;
    }

    public synchronized void setLocalHost(String str) {
        this.f65495b1 = str;
    }

    public synchronized void setNTLMDomain(String str) {
        this.T0 = str;
    }

    public synchronized void setNoopStrict(boolean z10) {
        this.Y0 = z10;
    }

    public synchronized void setReportSuccess(boolean z10) {
        this.U0 = z10;
    }

    public synchronized void setRequireStartTLS(boolean z10) {
        this.W0 = z10;
    }

    public synchronized void setSASLEnabled(boolean z10) {
        this.Q0 = z10;
    }

    public synchronized void setSASLMechanisms(String[] strArr) {
        if (strArr != null) {
            try {
                strArr = (String[]) strArr.clone();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.S0 = strArr;
    }

    public synchronized void setSASLRealm(String str) {
        this.O0 = str;
    }

    public synchronized void setStartTLS(boolean z10) {
        this.V0 = z10;
    }

    public synchronized void setUseCanonicalHostName(boolean z10) {
        this.R0 = z10;
    }

    public synchronized void setUseRset(boolean z10) {
        this.X0 = z10;
    }

    public synchronized int simpleCommand(String str) throws MessagingException {
        sendCommand(str);
        return readServerResponse();
    }

    public void startTLS() throws MessagingException {
        issueCommand("STARTTLS", 220);
        try {
            this.f65508o1 = SocketFetcher.startTLS(this.f65508o1, this.f65513w0, this.session.getProperties(), "mail." + this.f65511t0);
            p();
        } catch (IOException e5) {
            l();
            throw new MessagingException("Could not convert socket to TLS", e5);
        }
    }

    public boolean supportsAuthentication(String str) {
        String str2;
        Hashtable<String, String> hashtable = this.K0;
        if (hashtable == null || (str2 = hashtable.get("AUTH")) == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (!str.equalsIgnoreCase("LOGIN") || !supportsExtension("AUTH=LOGIN")) {
            return false;
        }
        this.Z0.fine("use AUTH=LOGIN hack");
        return true;
    }

    public boolean supportsExtension(String str) {
        Hashtable<String, String> hashtable = this.K0;
        return (hashtable == null || hashtable.get(str.toUpperCase(Locale.ENGLISH)) == null) ? false : true;
    }

    public final void u() throws MessagingException {
        MailLogger mailLogger = this.Z0;
        this.f65513w0 = "UNKNOWN";
        try {
            int port = this.f65508o1.getPort();
            this.f65513w0 = this.f65508o1.getInetAddress().getHostName();
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                mailLogger.fine("starting protocol to host \"" + this.f65513w0 + "\", port " + port);
            }
            p();
            int serverResponse = readServerResponse();
            if (serverResponse == 220) {
                if (mailLogger.isLoggable(level)) {
                    mailLogger.fine("protocol started to host \"" + this.f65513w0 + "\", port: " + port);
                    return;
                }
                return;
            }
            this.f65508o1.close();
            this.f65508o1 = null;
            this.f65507n1 = null;
            this.f65505l1 = null;
            this.f65506m1 = null;
            if (mailLogger.isLoggable(level)) {
                mailLogger.fine("got bad greeting from host \"" + this.f65513w0 + "\", port: " + port + ", response: " + serverResponse);
            }
            throw new MessagingException("Got bad greeting from SMTP host: " + this.f65513w0 + ", port: " + port + ", response: " + serverResponse);
        } catch (IOException e5) {
            throw new MessagingException("Could not start protocol to SMTP host: " + this.f65513w0 + ", port: -1", e5);
        }
    }

    public final void v(int i10, String str) throws MessagingException {
        Level level = Level.FINE;
        MailLogger mailLogger = this.Z0;
        boolean zIsLoggable = mailLogger.isLoggable(level);
        boolean z10 = this.v0;
        if (zIsLoggable) {
            mailLogger.fine("trying to connect to host \"" + str + "\", port " + i10 + ", isSSL " + z10);
        }
        try {
            Socket socket = SocketFetcher.getSocket(str, i10, this.session.getProperties(), "mail." + this.f65511t0, z10);
            this.f65508o1 = socket;
            int port = socket.getPort();
            this.f65513w0 = str;
            p();
            int serverResponse = readServerResponse();
            if (serverResponse == 220) {
                if (mailLogger.isLoggable(level)) {
                    mailLogger.fine("connected to host \"" + str + "\", port: " + port);
                    return;
                }
                return;
            }
            this.f65508o1.close();
            this.f65508o1 = null;
            this.f65507n1 = null;
            this.f65505l1 = null;
            this.f65506m1 = null;
            if (mailLogger.isLoggable(level)) {
                mailLogger.fine("could not connect to host \"" + str + "\", port: " + port + ", response: " + serverResponse);
            }
            throw new MessagingException("Could not connect to SMTP host: " + str + ", port: " + port + ", response: " + serverResponse);
        } catch (SocketConnectException e5) {
            throw new MailConnectException(e5);
        } catch (UnknownHostException e7) {
            throw new MessagingException("Unknown SMTP host: ".concat(str), e7);
        } catch (IOException e10) {
            throw new MessagingException("Could not connect to SMTP host: " + str + ", port: " + i10, e10);
        }
    }

    public final void w() {
        if (this.f65494a1.isLoggable(Level.FINEST)) {
            this.f65509p1.setTrace(true);
            this.f65510q1.setTrace(true);
        }
    }

    public final boolean x(String str, String str2, String str3, String[] strArr, String str4) throws MessagingException {
        ArrayList arrayList;
        String str5;
        String canonicalHostName = this.R0 ? this.f65508o1.getInetAddress().getCanonicalHostName() : this.f65513w0;
        SaslAuthenticator saslAuthenticator = this.f65499f1;
        MailLogger mailLogger = this.Z0;
        if (saslAuthenticator == null) {
            try {
                this.f65499f1 = (SaslAuthenticator) Class.forName("com.sun.mail.smtp.SMTPSaslAuthenticator").getConstructor(SMTPTransport.class, String.class, Properties.class, MailLogger.class, String.class).newInstance(this, this.f65511t0, this.session.getProperties(), mailLogger, canonicalHostName);
            } catch (Exception e5) {
                mailLogger.log(Level.FINE, "Can't load SASL authenticator", (Throwable) e5);
                return false;
            }
        }
        if (strArr == null || strArr.length <= 0) {
            arrayList = new ArrayList();
            Hashtable<String, String> hashtable = this.K0;
            if (hashtable != null && (str5 = hashtable.get("AUTH")) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str5);
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(stringTokenizer.nextToken());
                }
            }
        } else {
            arrayList = new ArrayList(strArr.length);
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (supportsAuthentication(strArr[i10])) {
                    arrayList.add(strArr[i10]);
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        try {
            if (this.f65500g1 && q()) {
                mailLogger.fine("SASL AUTH command trace suppressed");
                if (this.f65494a1.isLoggable(Level.FINEST)) {
                    this.f65509p1.setTrace(false);
                    this.f65510q1.setTrace(false);
                }
            }
            return this.f65499f1.authenticate(strArr2, str, str2, str3, str4);
        } finally {
            w();
        }
    }

    public final void y(byte[] bArr) throws MessagingException {
        try {
            this.f65507n1.write(bArr);
            this.f65507n1.write(f65491s1);
            this.f65507n1.flush();
        } catch (IOException e5) {
            throw new MessagingException("Can't send command to SMTP host", e5);
        }
    }

    public SMTPTransport(Session session, URLName uRLName, String str, boolean z10) {
        super(session, uRLName);
        this.f65511t0 = "smtp";
        this.f65512u0 = 25;
        this.v0 = false;
        this.H0 = false;
        this.L0 = new HashMap();
        this.N0 = false;
        this.O0 = "UNKNOWN";
        this.P0 = "UNKNOWN";
        this.Q0 = false;
        this.R0 = false;
        this.S0 = f65492t1;
        this.T0 = "UNKNOWN";
        this.Y0 = true;
        this.f65500g1 = true;
        Properties properties = session.getProperties();
        MailLogger mailLogger = new MailLogger(getClass(), "DEBUG SMTP", session.getDebug(), session.getDebugOut());
        this.Z0 = mailLogger;
        this.f65494a1 = mailLogger.getSubLogger("protocol", null);
        this.f65500g1 = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        this.f65501h1 = PropUtil.getBooleanProperty(properties, "mail.debug.auth.username", true);
        this.f65502i1 = PropUtil.getBooleanProperty(properties, "mail.debug.auth.password", false);
        str = uRLName != null ? uRLName.getProtocol() : str;
        this.f65511t0 = str;
        z10 = z10 ? z10 : androidx.collection.f.d("mail.", str, ".ssl.enable", properties, false);
        if (z10) {
            this.f65512u0 = 465;
        } else {
            this.f65512u0 = 25;
        }
        this.v0 = z10;
        this.N0 = androidx.collection.f.d("mail.", str, ".quitwait", properties, true);
        this.U0 = androidx.collection.f.d("mail.", str, ".reportsuccess", properties, false);
        this.V0 = androidx.collection.f.d("mail.", str, ".starttls.enable", properties, false);
        this.W0 = androidx.collection.f.d("mail.", str, ".starttls.required", properties, false);
        this.X0 = androidx.collection.f.d("mail.", str, ".userset", properties, false);
        this.Y0 = androidx.collection.f.d("mail.", str, ".noop.strict", properties, true);
        boolean zD = androidx.collection.f.d("mail.", str, ".sasl.enable", properties, false);
        this.Q0 = zD;
        if (zD) {
            mailLogger.config("enable SASL");
        }
        boolean zD2 = androidx.collection.f.d("mail.", str, ".sasl.usecanonicalhostname", properties, false);
        this.R0 = zD2;
        if (zD2) {
            mailLogger.config("use canonical host name");
        }
        boolean booleanProperty = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        this.f65503j1 = booleanProperty;
        if (booleanProperty) {
            mailLogger.config("allow UTF-8");
        }
        int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".chunksize", -1);
        this.f65504k1 = intProperty;
        if (intProperty > 0 && mailLogger.isLoggable(Level.CONFIG)) {
            mailLogger.config("chunk size " + intProperty);
        }
        a[] aVarArr = {new e(), new h(), new d(), new f(), new g()};
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            HashMap map = this.L0;
            a aVar = aVarArr[i10];
            map.put(aVar.f65517b, aVar);
            sb2.append(aVarArr[i10].f65517b);
            sb2.append(' ');
        }
        this.M0 = sb2.toString();
    }

    public static String xtext(String str, boolean z10) {
        byte[] bytes = z10 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str);
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < bytes.length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (!z10 && c10 >= 128) {
                throw new IllegalArgumentException(androidx.camera.core.processing.f.d("Non-ASCII character in SMTP submitter: ", str));
            }
            if (c10 < '!' || c10 > '~' || c10 == '+' || c10 == '=') {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length() + 4);
                    sb2.append(str.substring(0, i10));
                }
                sb2.append('+');
                char[] cArr = f65493u1;
                sb2.append(cArr[(c10 & 240) >> 4]);
                sb2.append(cArr[c10 & 15]);
            } else if (sb2 != null) {
                sb2.append(c10);
            }
        }
        return sb2 != null ? sb2.toString() : str;
    }

    public class c extends OutputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final OutputStream f65521p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final byte[] f65522q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f65523r0 = 0;

        public c(OutputStream outputStream, int i10) {
            this.f65521p0 = outputStream;
            this.f65522q0 = new byte[i10];
        }

        public final void a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
            OutputStream outputStream = this.f65521p0;
            if (i11 > 0 || z10) {
                SMTPTransport sMTPTransport = SMTPTransport.this;
                try {
                    if (z10) {
                        sMTPTransport.sendCommand("BDAT " + i11 + " LAST");
                    } else {
                        sMTPTransport.sendCommand("BDAT " + i11);
                    }
                    outputStream.write(bArr, i10, i11);
                    outputStream.flush();
                    if (sMTPTransport.readServerResponse() == 250) {
                    } else {
                        throw new IOException(sMTPTransport.f65496c1);
                    }
                } catch (MessagingException e5) {
                    throw new IOException("BDAT write exception", e5);
                }
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            a(this.f65522q0, 0, this.f65523r0, true);
            this.f65523r0 = 0;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            a(this.f65522q0, 0, this.f65523r0, false);
            this.f65523r0 = 0;
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            int i11 = this.f65523r0;
            int i12 = i11 + 1;
            this.f65523r0 = i12;
            byte[] bArr = this.f65522q0;
            bArr[i11] = (byte) i10;
            if (i12 >= bArr.length) {
                flush();
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            while (i11 > 0) {
                byte[] bArr2 = this.f65522q0;
                int iMin = Math.min(bArr2.length - this.f65523r0, i11);
                if (iMin == bArr2.length) {
                    a(bArr, i10, iMin, false);
                } else {
                    System.arraycopy(bArr, i10, bArr2, this.f65523r0, iMin);
                    this.f65523r0 += iMin;
                }
                i10 += iMin;
                i11 -= iMin;
                if (this.f65523r0 >= bArr2.length) {
                    flush();
                }
            }
        }
    }

    public int simpleCommand(byte[] bArr) throws MessagingException {
        y(bArr);
        return readServerResponse();
    }
}
