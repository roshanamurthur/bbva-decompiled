package com.facetec.sdk;

import android.os.Build;
import android.util.Log;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes9.dex */
class mp extends mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mv<Socket> f42607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mv<Socket> f42608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mv<Socket> f42609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mv<Socket> f42610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class<?> f42611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f42612f = c.b();

    public static final class b implements nc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f42613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f42614b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.f42614b = method;
            this.f42613a = x509TrustManager;
        }

        @Override // com.facetec.sdk.nc
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f42614b.invoke(this.f42613a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e5) {
                throw kz.b("unable to get issues and signature", e5);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f42613a.equals(bVar.f42613a) && this.f42614b.equals(bVar.f42614b);
        }

        public final int hashCode() {
            return (this.f42614b.hashCode() * 31) + this.f42613a.hashCode();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f42615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f42616c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f42617e;

        private c(Method method, Method method2, Method method3) {
            this.f42617e = method;
            this.f42616c = method2;
            this.f42615b = method3;
        }

        public static c b() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(TrackMessageOpenedCommand.ACTION, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new c(method, method3, method2);
        }

        public final boolean c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f42615b.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final Object e(String str) {
            Method method = this.f42617e;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f42616c.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public static final class e extends mz {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f42618c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f42619e;

        public e(Object obj, Method method) {
            this.f42618c = obj;
            this.f42619e = method;
        }

        @Override // com.facetec.sdk.mz
        public final List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f42619e.invoke(this.f42618c, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e7) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
                sSLPeerUnverifiedException.initCause(e7);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }
    }

    public mp(Class<?> cls, mv<Socket> mvVar, mv<Socket> mvVar2, mv<Socket> mvVar3, mv<Socket> mvVar4) {
        this.f42611e = cls;
        this.f42610d = mvVar;
        this.f42607a = mvVar2;
        this.f42609c = mvVar3;
        this.f42608b = mvVar4;
    }

    private boolean c(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return b(str, cls, obj);
        }
    }

    @Override // com.facetec.sdk.mu
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e5) {
            if (!kz.e(e5)) {
                throw e5;
            }
            throw new IOException(e5);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e7);
            throw iOException;
        } catch (SecurityException e10) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e10);
            throw iOException2;
        }
    }

    @Override // com.facetec.sdk.mu
    @Nullable
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        Object objB = mu.b(sSLSocketFactory, this.f42611e, "sslParameters");
        if (objB == null) {
            try {
                objB = mu.b(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.b(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) mu.b(objB, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) mu.b(objB, X509TrustManager.class, "trustManager");
    }

    @Override // com.facetec.sdk.mu
    @Nullable
    public String d(SSLSocket sSLSocket) {
        byte[] bArr;
        mv<Socket> mvVar = this.f42609c;
        if (mvVar == null || !mvVar.c(sSLSocket) || (bArr = (byte[]) this.f42609c.a(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, kz.f42210e);
    }

    @Override // com.facetec.sdk.mu
    public final Object e(String str) {
        return this.f42612f.e(str);
    }

    public static int e() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // com.facetec.sdk.mu
    public final SSLContext c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e5) {
            throw new IllegalStateException("No TLS provider", e5);
        }
    }

    @Override // com.facetec.sdk.mu
    public final boolean d(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return c(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.d(str);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw kz.b("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw kz.b("unable to determine cleartext support", e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw kz.b("unable to determine cleartext support", e);
        }
    }

    @Override // com.facetec.sdk.mu
    public void b(SSLSocket sSLSocket, String str, List<ko> list) throws IOException {
        if (str != null) {
            this.f42610d.c(sSLSocket, Boolean.TRUE);
            this.f42607a.c(sSLSocket, str);
        }
        mv<Socket> mvVar = this.f42608b;
        if (mvVar == null || !mvVar.c(sSLSocket)) {
            return;
        }
        this.f42608b.a(sSLSocket, mu.d(list));
    }

    private static boolean d() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.facetec.sdk.mu
    public final void a(int i10, String str, @Nullable Throwable th2) {
        int iMin;
        int i11 = i10 != 5 ? 3 : 5;
        if (th2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('\n');
            sb2.append(Log.getStackTraceString(th2));
            str = sb2.toString();
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int iIndexOf = str.indexOf(10, i12);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i12 + WearableStatusCodes.TARGET_NODE_NOT_CONNECTED);
                Log.println(i11, "OkHttp", str.substring(i12, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i12 = iMin;
                }
            }
            i12 = iMin + 1;
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.d(str);
        }
    }

    @Override // com.facetec.sdk.mu
    public final nc d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // com.facetec.sdk.mu
    public final mz b(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new e(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.facetec.sdk.mu
    public final void a(String str, Object obj) {
        if (this.f42612f.c(obj)) {
            return;
        }
        a(5, str, (Throwable) null);
    }

    public static mu b() {
        Class<?> cls;
        mv mvVar;
        mv mvVar2;
        if (!mu.g()) {
            return null;
        }
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            mv mvVar3 = new mv(null, "setUseSessionTickets", Boolean.TYPE);
            mv mvVar4 = new mv(null, "setHostname", String.class);
            if (d()) {
                mv mvVar5 = new mv(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                mvVar2 = new mv(null, "setAlpnProtocols", byte[].class);
                mvVar = mvVar5;
            } else {
                mvVar = null;
                mvVar2 = null;
            }
            return new mp(cls2, mvVar3, mvVar4, mvVar, mvVar2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }
}
