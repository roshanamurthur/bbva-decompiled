package com.sun.mail.util;

import androidx.camera.core.processing.f;
import androidx.webkit.ProxyConfig;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.core.response.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class SocketFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MailLogger f65583a = new MailLogger(SocketFetcher.class, "socket", "DEBUG SocketFetcher", PropUtil.getBooleanSystemProperty("mail.socket.debug", false), System.out);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        if (d(r9, (java.security.cert.X509Certificate) r11) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.net.Socket r8, java.lang.String r9, java.util.Properties r10, java.lang.String r11, javax.net.SocketFactory r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.SocketFetcher.a(java.net.Socket, java.lang.String, java.util.Properties, java.lang.String, javax.net.SocketFactory):void");
    }

    public static Socket b(InetAddress inetAddress, int i10, String str, int i11, int i12, int i13, Properties properties, String str2, SocketFactory socketFactory, boolean z10) throws Throwable {
        String str3;
        String str4;
        int intProperty;
        String str5;
        String str6;
        Socket socketCreateSocket;
        String str7;
        int i14;
        SSLSocketFactory sSLSocketFactory;
        SocketFactory socketFactory2 = socketFactory;
        Level level = Level.FINEST;
        MailLogger mailLogger = f65583a;
        if (mailLogger.isLoggable(level)) {
            StringBuilder sb2 = new StringBuilder("create socket: prefix ");
            sb2.append(str2);
            sb2.append(", localaddr ");
            sb2.append(inetAddress);
            sb2.append(", localport ");
            androidx.room.a.f(sb2, i10, ", host ", str, ", port ");
            sb2.append(i11);
            sb2.append(", connection timeout ");
            sb2.append(i12);
            sb2.append(", timeout ");
            sb2.append(i13);
            sb2.append(", socket factory ");
            sb2.append(socketFactory2);
            sb2.append(", useSSL ");
            sb2.append(z10);
            mailLogger.finest(sb2.toString());
        }
        String property = properties.getProperty(str2.concat(".proxy.host"), null);
        String property2 = properties.getProperty(str2.concat(".proxy.user"), null);
        String property3 = properties.getProperty(str2.concat(".proxy.password"), null);
        int i15 = 80;
        int i16 = 1080;
        if (property != null) {
            int iIndexOf = property.indexOf(58);
            if (iIndexOf >= 0) {
                try {
                    i15 = Integer.parseInt(property.substring(iIndexOf + 1));
                } catch (NumberFormatException unused) {
                }
                property = property.substring(0, iIndexOf);
            }
            int intProperty2 = PropUtil.getIntProperty(properties, str2.concat(".proxy.port"), i15);
            String str8 = "Using web proxy host, port: " + property + ", " + intProperty2;
            if (mailLogger.isLoggable(Level.FINER)) {
                mailLogger.finer("web proxy host " + property + ", port " + intProperty2);
                if (property2 != null) {
                    StringBuilder sbD = ci.a.d("web proxy user ", property2, ", password ");
                    sbD.append(property3 == null ? "<null>" : "<non-null>");
                    mailLogger.finer(sbD.toString());
                }
            }
            str3 = property;
            i15 = intProperty2;
            intProperty = 1080;
            str4 = null;
            str5 = str8;
        } else {
            String property4 = properties.getProperty(str2.concat(".socks.host"), null);
            if (property4 != null) {
                int iIndexOf2 = property4.indexOf(58);
                if (iIndexOf2 >= 0) {
                    try {
                        i16 = Integer.parseInt(property4.substring(iIndexOf2 + 1));
                    } catch (NumberFormatException unused2) {
                    }
                    property4 = property4.substring(0, iIndexOf2);
                }
                intProperty = PropUtil.getIntProperty(properties, str2.concat(".socks.port"), i16);
                str3 = property;
                String str9 = "Using SOCKS host, port: " + property4 + ", " + intProperty;
                if (mailLogger.isLoggable(Level.FINER)) {
                    mailLogger.finer("socks host " + property4 + ", port " + intProperty);
                }
                String str10 = property4;
                str5 = str9;
                str4 = str10;
            } else {
                str3 = property;
                str4 = property4;
                intProperty = 1080;
                str5 = null;
            }
        }
        Socket socketCreateSocket2 = (socketFactory2 == null || (socketFactory2 instanceof SSLSocketFactory)) ? null : socketFactory.createSocket();
        if (socketCreateSocket2 != null) {
            str6 = str5;
        } else if (str4 != null) {
            str6 = str5;
            socketCreateSocket2 = new Socket(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(str4, intProperty)));
        } else {
            str6 = str5;
            if (PropUtil.getBooleanProperty(properties, str2.concat(".usesocketchannels"), false)) {
                mailLogger.finer("using SocketChannels");
                socketCreateSocket2 = SocketChannel.open().socket();
            } else {
                socketCreateSocket2 = new Socket();
            }
        }
        if (i13 >= 0) {
            if (mailLogger.isLoggable(Level.FINEST)) {
                mailLogger.finest("set socket read timeout " + i13);
            }
            socketCreateSocket2.setSoTimeout(i13);
        }
        int intProperty3 = PropUtil.getIntProperty(properties, str2.concat(".writetimeout"), -1);
        if (intProperty3 != -1) {
            if (mailLogger.isLoggable(Level.FINEST)) {
                mailLogger.finest("set socket write timeout " + intProperty3);
            }
            socketCreateSocket = new WriteTimeoutSocket(socketCreateSocket2, intProperty3);
        } else {
            socketCreateSocket = socketCreateSocket2;
        }
        if (inetAddress != null) {
            socketCreateSocket.bind(new InetSocketAddress(inetAddress, i10));
        }
        try {
            mailLogger.finest("connecting...");
            try {
                if (str3 != null) {
                    f(socketCreateSocket, str3, i15, property2, property3, str, i11, i12);
                    str7 = str;
                    i14 = i11;
                } else if (i12 >= 0) {
                    str7 = str;
                    i14 = i11;
                    socketCreateSocket.connect(new InetSocketAddress(str7, i14), i12);
                } else {
                    str7 = str;
                    i14 = i11;
                    socketCreateSocket.connect(new InetSocketAddress(str7, i14));
                }
                mailLogger.finest("success!");
                if ((z10 || (socketFactory2 instanceof SSLSocketFactory)) && !(socketCreateSocket instanceof SSLSocket)) {
                    String property5 = properties.getProperty(str2.concat(".ssl.trust"));
                    if (property5 != null) {
                        try {
                            MailSSLSocketFactory mailSSLSocketFactory = new MailSSLSocketFactory();
                            if (property5.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                                mailSSLSocketFactory.setTrustAllHosts(true);
                            } else {
                                mailSSLSocketFactory.setTrustedHosts(property5.split("\\s+"));
                            }
                            sSLSocketFactory = mailSSLSocketFactory;
                        } catch (GeneralSecurityException e5) {
                            IOException iOException = new IOException("Can't create MailSSLSocketFactory");
                            iOException.initCause(e5);
                            throw iOException;
                        }
                    } else {
                        sSLSocketFactory = socketFactory2 instanceof SSLSocketFactory ? (SSLSocketFactory) socketFactory2 : (SSLSocketFactory) SSLSocketFactory.getDefault();
                    }
                    socketCreateSocket = sSLSocketFactory.createSocket(socketCreateSocket, str7, i14, true);
                    socketFactory2 = sSLSocketFactory;
                }
                a(socketCreateSocket, str7, properties, str2, socketFactory2);
                return socketCreateSocket;
            } catch (IOException e7) {
                e = e7;
                IOException iOException2 = e;
                mailLogger.log(Level.FINEST, "connection failed", (Throwable) iOException2);
                throw new SocketConnectException(str6, iOException2, str, i11, i12);
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public static SocketFactory c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        ClassLoader classLoader = (ClassLoader) AccessController.doPrivileged(new a());
        if (classLoader != null) {
            try {
                cls = Class.forName(str, false, classLoader);
            } catch (ClassNotFoundException unused) {
            }
        }
        if (cls == null) {
            cls = Class.forName(str);
        }
        return (SocketFactory) cls.getMethod("getDefault", new Class[0]).invoke(new Object(), new Object[0]);
    }

    public static boolean d(String str, X509Certificate x509Certificate) {
        Level level = Level.FINER;
        MailLogger mailLogger = f65583a;
        if (mailLogger.isLoggable(level)) {
            mailLogger.finer("matchCert server " + str + ", cert " + x509Certificate);
        }
        try {
            Class<?> cls = Class.forName("sun.security.util.HostnameChecker");
            Object objInvoke = cls.getMethod("getInstance", Byte.TYPE).invoke(new Object(), (byte) 2);
            if (mailLogger.isLoggable(level)) {
                mailLogger.finer("using sun.security.util.HostnameChecker");
            }
            try {
                cls.getMethod("match", String.class, X509Certificate.class).invoke(objInvoke, str, x509Certificate);
                return true;
            } catch (InvocationTargetException e5) {
                mailLogger.log(Level.FINER, "HostnameChecker FAIL", (Throwable) e5);
                return false;
            }
        } catch (Exception e7) {
            mailLogger.log(Level.FINER, "NO sun.security.util.HostnameChecker", (Throwable) e7);
            try {
                Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                if (subjectAlternativeNames != null) {
                    boolean z10 = false;
                    for (List<?> list : subjectAlternativeNames) {
                        if (((Integer) list.get(0)).intValue() == 2) {
                            String str2 = (String) list.get(1);
                            if (mailLogger.isLoggable(Level.FINER)) {
                                mailLogger.finer("found name: " + str2);
                            }
                            if (e(str, str2)) {
                                return true;
                            }
                            z10 = true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                }
            } catch (CertificateParsingException unused) {
            }
            Matcher matcher = Pattern.compile("CN=([^,]*)").matcher(x509Certificate.getSubjectX500Principal().getName());
            return matcher.find() && e(str, matcher.group(1).trim());
        }
    }

    public static boolean e(String str, String str2) {
        int length;
        Level level = Level.FINER;
        MailLogger mailLogger = f65583a;
        if (mailLogger.isLoggable(level)) {
            mailLogger.finer("match server " + str + " with " + str2);
        }
        if (!str2.startsWith("*.")) {
            return str.equalsIgnoreCase(str2);
        }
        String strSubstring = str2.substring(2);
        return strSubstring.length() != 0 && (length = str.length() - strSubstring.length()) >= 1 && str.charAt(length + (-1)) == '.' && str.regionMatches(true, length, strSubstring, 0, strSubstring.length());
    }

    public static void f(Socket socket, String str, int i10, String str2, String str3, String str4, int i11, int i12) throws IOException {
        Level level = Level.FINE;
        MailLogger mailLogger = f65583a;
        if (mailLogger.isLoggable(level)) {
            mailLogger.fine("connecting through proxy " + str + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + i10 + " to " + str4 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + i11);
        }
        if (i12 >= 0) {
            socket.connect(new InetSocketAddress(str, i10), i12);
        } else {
            socket.connect(new InetSocketAddress(str, i10));
        }
        OutputStream outputStream = socket.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        PrintStream printStream = new PrintStream(outputStream, false, charset.name());
        StringBuilder sb2 = new StringBuilder("CONNECT ");
        sb2.append(str4);
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(i11);
        sb2.append(" HTTP/1.1\r\nHost: ");
        sb2.append(str4);
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(i11);
        sb2.append("\r\n");
        if (str2 != null && str3 != null) {
            String str5 = new String(BASE64EncoderStream.encode((str2 + AbstractJsonLexerKt.COLON + str3).getBytes(charset)), StandardCharsets.US_ASCII);
            sb2.append("Proxy-Authorization: Basic ");
            sb2.append(str5);
            sb2.append("\r\n");
        }
        sb2.append("Proxy-Connection: keep-alive\r\n\r\n");
        printStream.print(sb2.toString());
        printStream.flush();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
        boolean z10 = true;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.length() == 0) {
                return;
            }
            mailLogger.finest(line);
            if (z10) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                stringTokenizer.nextToken();
                if (!stringTokenizer.nextToken().equals(Result.OK_RESPONSE_CODE)) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                    ConnectException connectException = new ConnectException("connection through proxy " + str + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + i10 + " to " + str4 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + i11 + " failed: " + line);
                    mailLogger.log(Level.FINE, "connect failed", (Throwable) connectException);
                    throw connectException;
                }
                z10 = false;
            }
        }
    }

    public static String[] g(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182  */
    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x018b  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01c4, please report this as an issue */
    public static Socket getSocket(String str, int i10, Properties properties, String str2, boolean z10) throws IOException {
        int i11;
        SocketFactory socketFactoryC;
        String str3;
        Socket socketB;
        Socket socket;
        int i12;
        Exception e5;
        Exception exc;
        Throwable targetException;
        String str4 = str2;
        Level level = Level.FINER;
        MailLogger mailLogger = f65583a;
        if (mailLogger.isLoggable(level)) {
            StringBuilder sb2 = new StringBuilder("getSocket, host ");
            sb2.append(str);
            sb2.append(", port ");
            i11 = i10;
            sb2.append(i11);
            sb2.append(", prefix ");
            sb2.append(str4);
            sb2.append(", useSSL ");
            sb2.append(z10);
            mailLogger.finer(sb2.toString());
        } else {
            i11 = i10;
        }
        if (str4 == null) {
            str4 = "socket";
        }
        String str5 = str4;
        Properties properties2 = properties == null ? new Properties() : properties;
        int intProperty = PropUtil.getIntProperty(properties2, str5.concat(".connectiontimeout"), -1);
        String property = properties2.getProperty(str5.concat(".localaddress"), null);
        InetAddress byName = property != null ? InetAddress.getByName(property) : null;
        int intProperty2 = PropUtil.getIntProperty(properties2, str5.concat(".localport"), 0);
        boolean booleanProperty = PropUtil.getBooleanProperty(properties2, str5.concat(".socketFactory.fallback"), true);
        int intProperty3 = PropUtil.getIntProperty(properties2, str5.concat(".timeout"), -1);
        String str6 = "unknown socket factory";
        if (z10) {
            try {
                try {
                    Object obj = properties2.get(str5.concat(".ssl.socketFactory"));
                    if (obj instanceof SocketFactory) {
                        socketFactoryC = (SocketFactory) obj;
                        str6 = "SSL socket factory instance " + socketFactoryC;
                    } else {
                        socketFactoryC = null;
                    }
                    if (socketFactoryC == null) {
                        String property2 = properties2.getProperty(str5.concat(".ssl.socketFactory.class"));
                        str6 = "SSL socket factory class " + property2;
                        socketFactoryC = c(property2);
                    }
                    str3 = ".ssl.socketFactory.port";
                } catch (SocketTimeoutException e7) {
                    throw e7;
                }
            } catch (Exception e10) {
                e5 = e10;
                i12 = -1;
                socket = null;
                if (!booleanProperty) {
                    if (e5 instanceof InvocationTargetException) {
                        targetException = ((InvocationTargetException) e5).getTargetException();
                        if (targetException instanceof Exception) {
                            exc = (Exception) targetException;
                        } else {
                            exc = e5;
                        }
                    } else {
                        exc = e5;
                    }
                    if (exc instanceof IOException) {
                        throw ((IOException) exc);
                    }
                    throw new SocketConnectException(f.d("Using ", str6), exc, str, i12, intProperty);
                }
                socketB = socket;
                if (socketB == null) {
                    return b(byName, intProperty2, str, i10, intProperty, intProperty3, properties2, str5, null, z10);
                }
                if (intProperty3 < 0) {
                    return socketB;
                }
                if (mailLogger.isLoggable(Level.FINEST)) {
                    mailLogger.finest("set socket read timeout " + intProperty3);
                }
                socketB.setSoTimeout(intProperty3);
                return socketB;
            }
        } else {
            socketFactoryC = null;
            str3 = null;
        }
        if (socketFactoryC == null) {
            Object obj2 = properties2.get(str5.concat(".socketFactory"));
            if (obj2 instanceof SocketFactory) {
                socketFactoryC = (SocketFactory) obj2;
                str6 = "socket factory instance " + socketFactoryC;
            }
            if (socketFactoryC == null) {
                String property3 = properties2.getProperty(str5.concat(".socketFactory.class"));
                str6 = "socket factory class " + property3;
                socketFactoryC = c(property3);
            }
            str3 = ".socketFactory.port";
        }
        SocketFactory socketFactory = socketFactoryC;
        String str7 = str6;
        if (socketFactory != null) {
            try {
                i12 = -1;
                try {
                    int intProperty4 = PropUtil.getIntProperty(properties2, str5 + str3, -1);
                    int i13 = intProperty4 == -1 ? i11 : intProperty4;
                    socket = null;
                    try {
                        socketB = b(byName, intProperty2, str, i13, intProperty, intProperty3, properties2, str5, socketFactory, z10);
                    } catch (Exception e11) {
                        e5 = e11;
                        str6 = str7;
                        i12 = i13;
                        if (!booleanProperty) {
                            if (e5 instanceof InvocationTargetException) {
                                targetException = ((InvocationTargetException) e5).getTargetException();
                                if (targetException instanceof Exception) {
                                    exc = (Exception) targetException;
                                } else {
                                    exc = e5;
                                }
                            } else {
                                exc = e5;
                            }
                            if (exc instanceof IOException) {
                                throw ((IOException) exc);
                            }
                            throw new SocketConnectException(f.d("Using ", str6), exc, str, i12, intProperty);
                        }
                        socketB = socket;
                    }
                } catch (Exception e12) {
                    e5 = e12;
                    socket = null;
                    str6 = str7;
                    if (!booleanProperty) {
                        if (e5 instanceof InvocationTargetException) {
                            targetException = ((InvocationTargetException) e5).getTargetException();
                            if (targetException instanceof Exception) {
                                exc = (Exception) targetException;
                            } else {
                                exc = e5;
                            }
                        } else {
                            exc = e5;
                        }
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new SocketConnectException(f.d("Using ", str6), exc, str, i12, intProperty);
                    }
                    socketB = socket;
                    if (socketB == null) {
                        return b(byName, intProperty2, str, i10, intProperty, intProperty3, properties2, str5, null, z10);
                    }
                    if (intProperty3 < 0) {
                        return socketB;
                    }
                    if (mailLogger.isLoggable(Level.FINEST)) {
                        mailLogger.finest("set socket read timeout " + intProperty3);
                    }
                    socketB.setSoTimeout(intProperty3);
                    return socketB;
                }
            } catch (Exception e13) {
                e5 = e13;
                i12 = -1;
            }
        } else {
            socket = null;
            socketB = socket;
        }
        if (socketB == null) {
            return b(byName, intProperty2, str, i10, intProperty, intProperty3, properties2, str5, null, z10);
        }
        if (intProperty3 < 0) {
            return socketB;
        }
        if (mailLogger.isLoggable(Level.FINEST)) {
            mailLogger.finest("set socket read timeout " + intProperty3);
        }
        socketB.setSoTimeout(intProperty3);
        return socketB;
    }

    @Deprecated
    public static Socket startTLS(Socket socket) throws IOException {
        return startTLS(socket, new Properties(), "socket");
    }

    @Deprecated
    public static Socket startTLS(Socket socket, Properties properties, String str) throws IOException {
        return startTLS(socket, socket.getInetAddress().getHostName(), properties, str);
    }

    public static Socket startTLS(Socket socket, String str, Properties properties, String str2) throws Throwable {
        SocketFactory socketFactoryC;
        String str3;
        SSLSocketFactory sSLSocketFactory;
        int port = socket.getPort();
        Level level = Level.FINER;
        MailLogger mailLogger = f65583a;
        if (mailLogger.isLoggable(level)) {
            mailLogger.finer("startTLS host " + str + ", port " + port);
        }
        String str4 = "unknown socket factory";
        try {
            Object obj = properties.get(str2 + ".ssl.socketFactory");
            SSLSocketFactory sSLSocketFactory2 = null;
            sSLSocketFactory2 = null;
            if (obj instanceof SocketFactory) {
                socketFactoryC = (SocketFactory) obj;
                str4 = "SSL socket factory instance " + socketFactoryC;
            } else {
                socketFactoryC = null;
            }
            if (socketFactoryC == null) {
                String property = properties.getProperty(str2 + ".ssl.socketFactory.class");
                socketFactoryC = c(property);
                str4 = "SSL socket factory class " + property;
            }
            if (socketFactoryC != null && (socketFactoryC instanceof SSLSocketFactory)) {
                sSLSocketFactory2 = (SSLSocketFactory) socketFactoryC;
            }
            if (sSLSocketFactory2 == null) {
                Object obj2 = properties.get(str2 + ".socketFactory");
                if (obj2 instanceof SocketFactory) {
                    socketFactoryC = (SocketFactory) obj2;
                    str4 = "socket factory instance " + socketFactoryC;
                }
                if (socketFactoryC == null) {
                    String property2 = properties.getProperty(str2 + ".socketFactory.class");
                    socketFactoryC = c(property2);
                    str4 = "socket factory class " + property2;
                }
                if (socketFactoryC != null && (socketFactoryC instanceof SSLSocketFactory)) {
                    sSLSocketFactory2 = (SSLSocketFactory) socketFactoryC;
                }
            }
            SSLSocketFactory sSLSocketFactory3 = sSLSocketFactory2;
            if (sSLSocketFactory2 == null) {
                String property3 = properties.getProperty(str2 + ".ssl.trust");
                if (property3 != null) {
                    try {
                        MailSSLSocketFactory mailSSLSocketFactory = new MailSSLSocketFactory();
                        if (property3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                            mailSSLSocketFactory.setTrustAllHosts(true);
                        } else {
                            mailSSLSocketFactory.setTrustedHosts(property3.split("\\s+"));
                        }
                        str3 = "mail SSL socket factory";
                        sSLSocketFactory = mailSSLSocketFactory;
                    } catch (GeneralSecurityException e5) {
                        IOException iOException = new IOException("Can't create MailSSLSocketFactory");
                        iOException.initCause(e5);
                        throw iOException;
                    }
                } else {
                    str3 = "default SSL socket factory";
                    sSLSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                }
                sSLSocketFactory3 = sSLSocketFactory;
            }
            Socket socketCreateSocket = sSLSocketFactory3.createSocket(socket, str, port, true);
            a(socketCreateSocket, str, properties, str2, sSLSocketFactory3);
            return socketCreateSocket;
        } catch (Exception e7) {
            e = e7;
            if (e instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) e).getTargetException();
                if (targetException instanceof Exception) {
                    e = (Exception) targetException;
                }
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Exception in startTLS using ", str4, ": host, port: ", str, ", ");
            sbC.append(port);
            sbC.append("; Exception: ");
            sbC.append(e);
            IOException iOException2 = new IOException(sbC.toString());
            iOException2.initCause(e);
            throw iOException2;
        }
    }

    public static Socket getSocket(String str, int i10, Properties properties, String str2) throws IOException {
        return getSocket(str, i10, properties, str2, false);
    }
}
