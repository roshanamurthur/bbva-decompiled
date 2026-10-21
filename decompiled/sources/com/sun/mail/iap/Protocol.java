package com.sun.mail.iap;

import androidx.exifinterface.media.ExifInterface;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.SSLSocket;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class Protocol {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicInteger f65247k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f65248l = {13, 10};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Socket f65249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TraceInputStream f65250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ResponseInputStream f65251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TraceOutputStream f65252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile DataOutputStream f65253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f65256h;
    protected String host;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f65257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f65258j;
    protected MailLogger logger;
    protected String prefix;
    protected Properties props;
    protected boolean quote;
    protected MailLogger traceLogger;

    public Protocol(String str, int i10, Properties properties, String str2, boolean z10, MailLogger mailLogger) throws ProtocolException, IOException {
        this.f65254f = 0;
        this.f65257i = new CopyOnWriteArrayList();
        this.f65255g = a(properties, str2);
        try {
            this.host = str;
            this.props = properties;
            this.prefix = str2;
            this.logger = mailLogger;
            this.traceLogger = mailLogger.getSubLogger("protocol", null);
            this.f65249a = SocketFetcher.getSocket(str, i10, properties, str2, z10);
            this.quote = PropUtil.getBooleanProperty(properties, "mail.debug.quote", false);
            b();
            processGreeting(readResponse());
            this.f65258j = System.currentTimeMillis();
        } catch (Throwable th2) {
            disconnect();
            throw th2;
        }
    }

    public static String a(Properties properties, String str) {
        String str2;
        if (PropUtil.getBooleanProperty(properties, str + ".reusetagprefix", false)) {
            return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        }
        int andIncrement = f65247k.getAndIncrement() % 18278;
        if (andIncrement < 26) {
            return new String(new char[]{(char) (andIncrement + 65)});
        }
        if (andIncrement < 702) {
            int i10 = andIncrement - 26;
            str2 = new String(new char[]{(char) ((i10 / 26) + 65), (char) ((i10 % 26) + 65)});
        } else {
            int i11 = andIncrement - 702;
            str2 = new String(new char[]{(char) ((i11 / 676) + 65), (char) (((i11 % 676) / 26) + 65), (char) ((i11 % 26) + 65)});
        }
        return str2;
    }

    public void addResponseHandler(ResponseHandler responseHandler) {
        this.f65257i.add(responseHandler);
    }

    public final void b() throws IOException {
        TraceInputStream traceInputStream = new TraceInputStream(this.f65249a.getInputStream(), this.traceLogger);
        this.f65250b = traceInputStream;
        traceInputStream.setQuote(this.quote);
        this.f65251c = new ResponseInputStream(this.f65250b);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.f65249a.getOutputStream(), this.traceLogger);
        this.f65252d = traceOutputStream;
        traceOutputStream.setQuote(this.quote);
        this.f65253e = new DataOutputStream(new BufferedOutputStream(this.f65252d));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005a A[Catch: all -> 0x000e, TryCatch #4 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0008, B:17:0x0026, B:18:0x002a, B:21:0x0032, B:23:0x003b, B:32:0x005a, B:33:0x005d, B:27:0x0047, B:30:0x0054, B:10:0x0011, B:14:0x001c), top: B:38:0x0001, inners: #5, #4 }] */
    public synchronized Response[] command(String str, Argument argument) {
        String strWriteCommand;
        boolean z10;
        try {
            ArrayList arrayList = new ArrayList();
            Response responseByeResponse = null;
            try {
                strWriteCommand = writeCommand(str, argument);
                z10 = false;
            } catch (LiteralException e5) {
                arrayList.add(e5.getResponse());
                strWriteCommand = null;
                z10 = true;
            } catch (Exception e7) {
                arrayList.add(Response.byeResponse(e7));
                strWriteCommand = null;
                z10 = true;
            }
            while (!z10) {
                try {
                    Response response = readResponse();
                    if (response.isBYE()) {
                        responseByeResponse = response;
                    } else {
                        arrayList.add(response);
                        if (response.isTagged() && response.getTag().equals(strWriteCommand)) {
                            z10 = true;
                        }
                    }
                } catch (ProtocolException e10) {
                    this.logger.log(Level.FINE, "ignoring bad response", (Throwable) e10);
                } catch (IOException e11) {
                    if (responseByeResponse == null) {
                        responseByeResponse = Response.byeResponse(e11);
                    }
                    if (responseByeResponse != null) {
                        arrayList.add(responseByeResponse);
                    }
                    Response[] responseArr = new Response[arrayList.size()];
                    arrayList.toArray(responseArr);
                    this.f65258j = System.currentTimeMillis();
                    return responseArr;
                }
            }
            if (responseByeResponse != null) {
                arrayList.add(responseByeResponse);
            }
            Response[] responseArr2 = new Response[arrayList.size()];
            arrayList.toArray(responseArr2);
            this.f65258j = System.currentTimeMillis();
        } catch (Throwable th2) {
            throw th2;
        }
        return responseArr2;
    }

    public synchronized void disconnect() {
        Socket socket = this.f65249a;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            this.f65249a = null;
        }
    }

    public void finalize() throws Throwable {
        try {
            disconnect();
        } finally {
            super.finalize();
        }
    }

    public SocketChannel getChannel() {
        SocketChannel channel = this.f65249a.getChannel();
        if (channel != null) {
            return channel;
        }
        Socket socket = this.f65249a;
        if (!(socket instanceof SSLSocket)) {
            return channel;
        }
        try {
            Field declaredField = socket.getClass().getDeclaredField("socket");
            declaredField.setAccessible(true);
            return ((Socket) declaredField.get(this.f65249a)).getChannel();
        } catch (Exception unused) {
            return channel;
        }
    }

    public InetAddress getInetAddress() {
        return this.f65249a.getInetAddress();
    }

    public ResponseInputStream getInputStream() {
        return this.f65251c;
    }

    public synchronized String getLocalHost() {
        Socket socket;
        try {
            String str = this.f65256h;
            if (str == null || str.length() <= 0) {
                this.f65256h = this.props.getProperty(this.prefix + ".localhost");
            }
            String str2 = this.f65256h;
            if (str2 == null || str2.length() <= 0) {
                this.f65256h = this.props.getProperty(this.prefix + ".localaddress");
            }
            try {
                String str3 = this.f65256h;
                if (str3 == null || str3.length() <= 0) {
                    InetAddress localHost = InetAddress.getLocalHost();
                    String canonicalHostName = localHost.getCanonicalHostName();
                    this.f65256h = canonicalHostName;
                    if (canonicalHostName == null) {
                        this.f65256h = Constant.BRACKET_OPEN + localHost.getHostAddress() + Constant.BRACKET_CLOSE;
                    }
                }
            } catch (UnknownHostException unused) {
            }
            String str4 = this.f65256h;
            if ((str4 == null || str4.length() <= 0) && (socket = this.f65249a) != null && socket.isBound()) {
                InetAddress localAddress = this.f65249a.getLocalAddress();
                String canonicalHostName2 = localAddress.getCanonicalHostName();
                this.f65256h = canonicalHostName2;
                if (canonicalHostName2 == null) {
                    this.f65256h = Constant.BRACKET_OPEN + localAddress.getHostAddress() + Constant.BRACKET_CLOSE;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f65256h;
    }

    public OutputStream getOutputStream() {
        return this.f65253e;
    }

    public ByteArray getResponseBuffer() {
        return null;
    }

    public long getTimestamp() {
        return this.f65258j;
    }

    public void handleResult(Response response) throws ProtocolException {
        if (response.isOK()) {
            return;
        }
        if (response.isNO()) {
            throw new CommandFailedException(response);
        }
        if (response.isBAD()) {
            throw new BadCommandException(response);
        }
        if (response.isBYE()) {
            disconnect();
            throw new ConnectionException(this, response);
        }
    }

    public boolean hasResponse() {
        try {
            return this.f65251c.available() > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean isSSL() {
        return this.f65249a instanceof SSLSocket;
    }

    public boolean isTracing() {
        return this.traceLogger.isLoggable(Level.FINEST);
    }

    public void notifyResponseHandlers(Response[] responseArr) {
        CopyOnWriteArrayList<ResponseHandler> copyOnWriteArrayList = this.f65257i;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (Response response : responseArr) {
            if (response != null) {
                for (ResponseHandler responseHandler : copyOnWriteArrayList) {
                    if (responseHandler != null) {
                        responseHandler.handleResponse(response);
                    }
                }
            }
        }
    }

    public void processGreeting(Response response) throws ProtocolException {
        if (response.isBYE()) {
            throw new ConnectionException(this, response);
        }
    }

    public Response readResponse() throws ProtocolException, IOException {
        return new Response(this);
    }

    public void removeResponseHandler(ResponseHandler responseHandler) {
        this.f65257i.remove(responseHandler);
    }

    public void resumeTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.f65250b.setTrace(true);
            this.f65252d.setTrace(true);
        }
    }

    public void simpleCommand(String str, Argument argument) throws ProtocolException {
        Response[] responseArrCommand = command(str, argument);
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
    }

    public synchronized void startCompression(String str) throws ProtocolException, IOException {
        try {
            simpleCommand(str, null);
            TraceInputStream traceInputStream = new TraceInputStream(new InflaterInputStream(this.f65249a.getInputStream(), new Inflater(true)), this.traceLogger);
            this.f65250b = traceInputStream;
            traceInputStream.setQuote(this.quote);
            this.f65251c = new ResponseInputStream(this.f65250b);
            int intProperty = PropUtil.getIntProperty(this.props, this.prefix + ".compress.level", -1);
            int intProperty2 = PropUtil.getIntProperty(this.props, this.prefix + ".compress.strategy", 0);
            MailLogger mailLogger = this.logger;
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                this.logger.log(level, "Creating Deflater with compression level {0} and strategy {1}", Integer.valueOf(intProperty), Integer.valueOf(intProperty2));
            }
            Deflater deflater = new Deflater(-1, true);
            try {
                deflater.setLevel(intProperty);
            } catch (IllegalArgumentException e5) {
                this.logger.log(Level.FINE, "Ignoring bad compression level", (Throwable) e5);
            }
            try {
                deflater.setStrategy(intProperty2);
            } catch (IllegalArgumentException e7) {
                this.logger.log(Level.FINE, "Ignoring bad compression strategy", (Throwable) e7);
            }
            TraceOutputStream traceOutputStream = new TraceOutputStream(new DeflaterOutputStream(this.f65249a.getOutputStream(), deflater, true), this.traceLogger);
            this.f65252d = traceOutputStream;
            traceOutputStream.setQuote(this.quote);
            this.f65253e = new DataOutputStream(new BufferedOutputStream(this.f65252d));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void startTLS(String str) throws ProtocolException, IOException {
        if (this.f65249a instanceof SSLSocket) {
            return;
        }
        simpleCommand(str, null);
        this.f65249a = SocketFetcher.startTLS(this.f65249a, this.host, this.props, this.prefix);
        b();
    }

    public synchronized boolean supportsNonSyncLiterals() {
        return false;
    }

    public boolean supportsUtf8() {
        return false;
    }

    public void suspendTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.f65250b.setTrace(false);
            this.f65252d.setTrace(false);
        }
    }

    public String writeCommand(String str, Argument argument) throws ProtocolException, IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f65255g);
        int i10 = this.f65254f;
        this.f65254f = i10 + 1;
        sb2.append(Integer.toString(i10));
        String string = sb2.toString();
        this.f65253e.writeBytes(string + " " + str);
        if (argument != null) {
            this.f65253e.write(32);
            argument.write(this);
        }
        this.f65253e.write(f65248l);
        this.f65253e.flush();
        return string;
    }

    public Protocol(InputStream inputStream, PrintStream printStream, Properties properties, boolean z10) throws IOException {
        this.f65254f = 0;
        this.f65257i = new CopyOnWriteArrayList();
        this.host = "localhost";
        this.props = properties;
        this.quote = false;
        this.f65255g = a(properties, "mail.imap");
        MailLogger mailLogger = new MailLogger(getClass(), "DEBUG", z10, System.out);
        this.logger = mailLogger;
        this.traceLogger = mailLogger.getSubLogger("protocol", null);
        TraceInputStream traceInputStream = new TraceInputStream(inputStream, this.traceLogger);
        this.f65250b = traceInputStream;
        traceInputStream.setQuote(this.quote);
        this.f65251c = new ResponseInputStream(this.f65250b);
        TraceOutputStream traceOutputStream = new TraceOutputStream(printStream, this.traceLogger);
        this.f65252d = traceOutputStream;
        traceOutputStream.setQuote(this.quote);
        this.f65253e = new DataOutputStream(new BufferedOutputStream(this.f65252d));
        this.f65258j = System.currentTimeMillis();
    }
}
