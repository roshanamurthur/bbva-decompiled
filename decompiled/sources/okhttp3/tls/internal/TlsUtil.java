package okhttp3.tls.internal;

import androidx.appcompat.widget.g0;
import androidx.camera.view.p;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.HandshakeCertificates;
import okhttp3.tls.HeldCertificate;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TlsUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J.\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J7\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000e\"\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/tls/internal/TlsUtil;", "", "Lokhttp3/tls/HandshakeCertificates;", "localhost", "", "keyStoreType", "", "Ljava/security/cert/X509Certificate;", "trustedCertificates", "insecureHosts", "Ljavax/net/ssl/X509TrustManager;", "newTrustManager", "Lokhttp3/tls/HeldCertificate;", "heldCertificate", "", "intermediates", "Ljavax/net/ssl/X509KeyManager;", "newKeyManager", "(Ljava/lang/String;Lokhttp3/tls/HeldCertificate;[Ljava/security/cert/X509Certificate;)Ljavax/net/ssl/X509KeyManager;", "", "a", "[C", "getPassword", "()[C", "password", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class TlsUtil {
    public static final TlsUtil INSTANCE = new TlsUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final char[] password;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f86187b;

    /* JADX INFO: compiled from: TlsUtil.kt */
    public static final class a extends Lambda implements Function0<HandshakeCertificates> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f86188p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final HandshakeCertificates invoke() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, UnknownHostException {
            HeldCertificate.Builder builderCommonName = new HeldCertificate.Builder().commonName("localhost");
            InetAddress byName = InetAddress.getByName("localhost");
            Intrinsics.checkNotNullExpressionValue(byName, "InetAddress.getByName(\"localhost\")");
            String canonicalHostName = byName.getCanonicalHostName();
            Intrinsics.checkNotNullExpressionValue(canonicalHostName, "InetAddress.getByName(\"l…lhost\").canonicalHostName");
            HeldCertificate heldCertificateBuild = builderCommonName.addSubjectAlternativeName(canonicalHostName).build();
            return new HandshakeCertificates.Builder().heldCertificate(heldCertificateBuild, new X509Certificate[0]).addTrustedCertificate(heldCertificateBuild.certificate()).build();
        }
    }

    static {
        char[] charArray = "password".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        password = charArray;
        f86187b = LazyKt__LazyJVMKt.lazy(a.f86188p0);
    }

    @JvmStatic
    @NotNull
    public static final HandshakeCertificates localhost() {
        INSTANCE.getClass();
        return (HandshakeCertificates) f86187b.getValue();
    }

    @JvmStatic
    @NotNull
    public static final X509KeyManager newKeyManager(@Nullable String keyStoreType, @Nullable HeldCertificate heldCertificate, @NotNull X509Certificate... intermediates) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        Intrinsics.checkNotNullParameter(intermediates, "intermediates");
        INSTANCE.getClass();
        if (keyStoreType == null) {
            keyStoreType = KeyStore.getDefaultType();
        }
        KeyStore keyStore = KeyStore.getInstance(keyStoreType);
        char[] cArr = password;
        keyStore.load(null, cArr);
        Intrinsics.checkNotNullExpressionValue(keyStore, "KeyStore.getInstance(key…utStream, password)\n    }");
        if (heldCertificate != null) {
            Certificate[] certificateArr = new Certificate[intermediates.length + 1];
            certificateArr[0] = heldCertificate.certificate();
            ArraysKt___ArraysJvmKt.copyInto$default(intermediates, certificateArr, 1, 0, 0, 12, (Object) null);
            keyStore.setKeyEntry("private", heldCertificate.keyPair().getPrivate(), cArr, certificateArr);
        }
        KeyManagerFactory factory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        factory.init(keyStore, cArr);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        KeyManager[] keyManagers = factory.getKeyManagers();
        Intrinsics.checkNotNull(keyManagers);
        if (keyManagers.length == 1) {
            KeyManager keyManager = keyManagers[0];
            if (keyManager instanceof X509KeyManager) {
                if (keyManager != null) {
                    return (X509KeyManager) keyManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509KeyManager");
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected key managers:");
        String string = Arrays.toString(keyManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @JvmStatic
    @IgnoreJRERequirement
    @NotNull
    public static final X509TrustManager newTrustManager(@Nullable String keyStoreType, @NotNull List<? extends X509Certificate> trustedCertificates, @NotNull List<String> insecureHosts) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        Intrinsics.checkNotNullParameter(trustedCertificates, "trustedCertificates");
        Intrinsics.checkNotNullParameter(insecureHosts, "insecureHosts");
        INSTANCE.getClass();
        if (keyStoreType == null) {
            keyStoreType = KeyStore.getDefaultType();
        }
        KeyStore keyStore = KeyStore.getInstance(keyStoreType);
        keyStore.load(null, password);
        Intrinsics.checkNotNullExpressionValue(keyStore, "KeyStore.getInstance(key…utStream, password)\n    }");
        int size = trustedCertificates.size();
        for (int i10 = 0; i10 < size; i10++) {
            keyStore.setCertificateEntry(g0.c("cert_", i10), trustedCertificates.get(i10));
        }
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init(keyStore);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                if (insecureHosts.isEmpty()) {
                    return x509TrustManager;
                }
                return Platform.INSTANCE.isAndroid() ? new InsecureAndroidTrustManager(x509TrustManager, insecureHosts) : new InsecureExtendedTrustManager(p.c(x509TrustManager), insecureHosts);
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @NotNull
    public final char[] getPassword() {
        return password;
    }
}
