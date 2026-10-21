package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes12.dex */
@SuppressSignatureCheck
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b$\u0010%J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006("}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "", "connectSocket", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "configureTlsExtensions", "getSelectedProtocol", "closer", "", "getStackTraceForCloseable", "message", "stackTrace", "logCloseableLeak", "", "isCleartextTrafficPermitted", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "<init>", "()V", "Companion", "CustomTrustRootIndex", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
public final class AndroidPlatform extends Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f86037e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList f86038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CloseGuard f86039d;

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean isSupported() {
            return AndroidPlatform.f86037e;
        }
    }

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "Ljava/security/cert/X509Certificate;", "cert", "findByIssuerAndSignature", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final X509TrustManager f86040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Method f86041b;

        public CustomTrustRootIndex(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f86040a = trustManager;
            this.f86041b = findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                x509TrustManager = customTrustRootIndex.f86040a;
            }
            if ((i10 & 2) != 0) {
                method = customTrustRootIndex.f86041b;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        @NotNull
        public final CustomTrustRootIndex copy(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) other;
            return Intrinsics.areEqual(this.f86040a, customTrustRootIndex.f86040a) && Intrinsics.areEqual(this.f86041b, customTrustRootIndex.f86041b);
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        @Nullable
        public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f86041b.invoke(this.f86040a, cert);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e5) {
                throw new AssertionError("unable to get issues and signature", e5);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return this.f86041b.hashCode() + (this.f86040a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f86040a + ", findByIssuerAndSignatureMethod=" + this.f86041b + RootService.CLOSE_BRACKET;
        }
    }

    static {
        boolean z10 = false;
        if (Platform.INSTANCE.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f86037e = z10;
    }

    public AndroidPlatform() {
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SocketAdapter[]{StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.INSTANCE, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.INSTANCE.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.INSTANCE.getFactory())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f86038c = arrayList;
        this.f86039d = CloseGuard.INSTANCE.get();
    }

    @Override // okhttp3.internal.platform.Platform
    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerBuildIfSupported = AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
        return androidCertificateChainCleanerBuildIfSupported != null ? androidCertificateChainCleanerBuildIfSupported : super.buildCertificateChainCleaner(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f86038c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(@NotNull Socket socket, @NotNull InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, connectTimeout);
        } catch (ClassCastException e5) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e5;
            }
            throw new IOException("Exception in connect", e5);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f86038c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public Object getStackTraceForCloseable(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.f86039d.createAndOpen(closer);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(@NotNull String message, @Nullable Object stackTrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f86039d.warnIfOpen(stackTrace)) {
            return;
        }
        Platform.log$default(this, message, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sslSocketFactory) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Iterator it = this.f86038c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocketFactory(sslSocketFactory));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sslSocketFactory);
        }
        return null;
    }
}
