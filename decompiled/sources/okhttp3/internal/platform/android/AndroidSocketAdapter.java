package okhttp3.internal.platform.android;

import androidx.datastore.preferences.protobuf.q;
import com.mypinpad.tsdk.isolation.y2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.l;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "", "isSupported", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "getSelectedProtocol", "Ljava/lang/Class;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final DeferredSocketAdapter.Factory f86063f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<? super SSLSocket> f86064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Method f86065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f86066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f86067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f86068e;

    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "", "packageName", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "factory", "playProviderFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getPlayProviderFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final AndroidSocketAdapter access$build(Companion companion, Class cls) {
            companion.getClass();
            Class superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(q.c("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new AndroidSocketAdapter(superclass);
        }

        @NotNull
        public final DeferredSocketAdapter.Factory factory(@NotNull final String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                @NotNull
                public SocketAdapter create(@NotNull SSLSocket sslSocket) {
                    Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                    return AndroidSocketAdapter.Companion.access$build(AndroidSocketAdapter.INSTANCE, sslSocket.getClass());
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean matchesSocket(@NotNull SSLSocket sslSocket) {
                    Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                    String name = sslSocket.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                    return l.startsWith$default(name, y2.b(new StringBuilder(), packageName, '.'), false, 2, null);
                }
            };
        }

        @NotNull
        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.f86063f;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f86063f = companion.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f86064a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f86065b = declaredMethod;
        this.f86066c = sslSocketClass.getMethod("setHostname", String.class);
        this.f86067d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f86068e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.f86065b.invoke(sslSocket, Boolean.TRUE);
                if (hostname != null) {
                    this.f86066c.invoke(sslSocket, hostname);
                }
                this.f86068e.invoke(sslSocket, Platform.INSTANCE.concatLengthPrefixed(protocols));
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f86067d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e7);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.INSTANCE.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f86064a.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
