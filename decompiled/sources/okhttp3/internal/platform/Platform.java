package okhttp3.internal.platform;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objenesis.strategy.PlatformDescription;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u000fJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u001a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020+H\u0016¨\u00060"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "()V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", "address", "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getPrefix", "getSelectedProtocol", "getStackTraceForCloseable", "closer", "isCleartextTrafficPermitted", "", LogKeysKt.LOG, "message", "level", "t", "", "logCloseableLeak", "stackTrace", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "platformTrustManager", "toString", "sslSocketFactory", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final int INFO = 4;
    public static final int WARN = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static volatile Platform f86057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f86058b;

    /* JADX INFO: compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "get", k.a.f65035b, "", "resetForTests", "", "Lokhttp3/Protocol;", "protocols", "", "alpnProtocolNames", "", "concatLengthPrefixed", "", "isAndroid", "()Z", "", "INFO", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                platform = companion.a();
            }
            companion.resetForTests(platform);
        }

        public final Platform a() {
            OpenJSSEPlatform openJSSEPlatformBuildIfSupported;
            BouncyCastlePlatform bouncyCastlePlatformBuildIfSupported;
            ConscryptPlatform conscryptPlatformBuildIfSupported;
            if (isAndroid()) {
                AndroidLog.INSTANCE.enable();
                Platform platformBuildIfSupported = Android10Platform.INSTANCE.buildIfSupported();
                if (platformBuildIfSupported != null) {
                    return platformBuildIfSupported;
                }
                Platform platformBuildIfSupported2 = AndroidPlatform.Companion.buildIfSupported();
                Intrinsics.checkNotNull(platformBuildIfSupported2);
                return platformBuildIfSupported2;
            }
            if (Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName()) && (conscryptPlatformBuildIfSupported = ConscryptPlatform.INSTANCE.buildIfSupported()) != null) {
                return conscryptPlatformBuildIfSupported;
            }
            if (Intrinsics.areEqual(BouncyCastleProvider.PROVIDER_NAME, Security.getProviders()[0].getName()) && (bouncyCastlePlatformBuildIfSupported = BouncyCastlePlatform.INSTANCE.buildIfSupported()) != null) {
                return bouncyCastlePlatformBuildIfSupported;
            }
            if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName()) && (openJSSEPlatformBuildIfSupported = OpenJSSEPlatform.INSTANCE.buildIfSupported()) != null) {
                return openJSSEPlatformBuildIfSupported;
            }
            Jdk9Platform jdk9PlatformBuildIfSupported = Jdk9Platform.INSTANCE.buildIfSupported();
            if (jdk9PlatformBuildIfSupported != null) {
                return jdk9PlatformBuildIfSupported;
            }
            Platform platformBuildIfSupported3 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            return platformBuildIfSupported3 != null ? platformBuildIfSupported3 : new Platform();
        }

        @NotNull
        public final List<String> alpnProtocolNames(@NotNull List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] concatLengthPrefixed(@NotNull List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : alpnProtocolNames(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        @JvmStatic
        @NotNull
        public final Platform get() {
            return Platform.f86057a;
        }

        public final boolean isAndroid() {
            return Intrinsics.areEqual(PlatformDescription.DALVIK, System.getProperty(Sys.VM_NAME));
        }

        public final void resetForTests(@NotNull Platform platform) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Platform.f86057a = platform;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f86057a = companion.a();
        f86058b = Logger.getLogger(OkHttpClient.class.getName());
    }

    @JvmStatic
    @NotNull
    public static final Platform get() {
        return INSTANCE.get();
    }

    public static /* synthetic */ void log$default(Platform platform, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        platform.log(str, i10, th2);
    }

    public void afterHandshake(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void connectSocket(@NotNull Socket socket, @NotNull InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, connectTimeout);
    }

    @NotNull
    public final String getPrefix() {
        return "OkHttp";
    }

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Nullable
    public Object getStackTraceForCloseable(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f86058b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void log(@NotNull String message, int level, @Nullable Throwable t10) {
        Intrinsics.checkNotNullParameter(message, "message");
        f86058b.log(level == 5 ? Level.WARNING : Level.INFO, message, t10);
    }

    public void logCloseableLeak(@NotNull String message, @Nullable Object stackTrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (stackTrace == null) {
            message = u.f(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        log(message, 5, (Throwable) stackTrace);
    }

    @NotNull
    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory newSslSocketFactory(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e5) {
            throw new AssertionError("No System TLS: " + e5, e5);
        }
    }

    @NotNull
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @NotNull
    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> sslContextClass = Class.forName("sun.security.ssl.SSLContextImpl");
            Intrinsics.checkNotNullExpressionValue(sslContextClass, "sslContextClass");
            Object fieldOrNull = Util.readFieldOrNull(sslSocketFactory, sslContextClass, "context");
            if (fieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) Util.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e5) {
            if (Intrinsics.areEqual(e5.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                return null;
            }
            throw e5;
        }
    }
}
