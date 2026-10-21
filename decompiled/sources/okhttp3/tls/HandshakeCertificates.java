package okhttp3.tls;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.internal.TlsUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HandshakeCertificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lokhttp3/tls/HandshakeCertificates;", "", "Ljavax/net/ssl/X509KeyManager;", "-deprecated_keyManager", "()Ljavax/net/ssl/X509KeyManager;", "keyManager", "Ljavax/net/ssl/X509TrustManager;", "-deprecated_trustManager", "()Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLContext;", "sslContext", "a", "Ljavax/net/ssl/X509KeyManager;", "b", "Ljavax/net/ssl/X509TrustManager;", "Builder", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class HandshakeCertificates {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final X509KeyManager keyManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final X509TrustManager trustManager;

    /* JADX INFO: compiled from: HandshakeCertificates.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0012"}, d2 = {"Lokhttp3/tls/HandshakeCertificates$Builder;", "", "Lokhttp3/tls/HeldCertificate;", "heldCertificate", "", "Ljava/security/cert/X509Certificate;", "intermediates", "(Lokhttp3/tls/HeldCertificate;[Ljava/security/cert/X509Certificate;)Lokhttp3/tls/HandshakeCertificates$Builder;", "certificate", "addTrustedCertificate", "addPlatformTrustedCertificates", "", "hostname", "addInsecureHost", "Lokhttp3/tls/HandshakeCertificates;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HeldCertificate f86163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public X509Certificate[] f86164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f86165c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f86166d = new ArrayList();

        @NotNull
        public final Builder addInsecureHost(@NotNull String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            this.f86166d.add(hostname);
            return this;
        }

        @NotNull
        public final Builder addPlatformTrustedCertificates() {
            X509TrustManager x509TrustManagerPlatformTrustManager = Platform.INSTANCE.get().platformTrustManager();
            ArrayList arrayList = this.f86165c;
            X509Certificate[] acceptedIssuers = x509TrustManagerPlatformTrustManager.getAcceptedIssuers();
            Collections.addAll(arrayList, (X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
            return this;
        }

        @NotNull
        public final Builder addTrustedCertificate(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            this.f86165c.add(certificate);
            return this;
        }

        @NotNull
        public final HandshakeCertificates build() {
            List immutableList = Util.toImmutableList(this.f86166d);
            HeldCertificate heldCertificate = this.f86163a;
            X509Certificate[] x509CertificateArr = this.f86164b;
            if (x509CertificateArr == null) {
                x509CertificateArr = new X509Certificate[0];
            }
            return new HandshakeCertificates(TlsUtil.newKeyManager(null, heldCertificate, (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)), TlsUtil.newTrustManager(null, this.f86165c, immutableList), null);
        }

        @NotNull
        public final Builder heldCertificate(@NotNull HeldCertificate heldCertificate, @NotNull X509Certificate... intermediates) {
            Intrinsics.checkNotNullParameter(heldCertificate, "heldCertificate");
            Intrinsics.checkNotNullParameter(intermediates, "intermediates");
            this.f86163a = heldCertificate;
            this.f86164b = (X509Certificate[]) Arrays.copyOf(intermediates, intermediates.length);
            return this;
        }
    }

    public HandshakeCertificates(X509KeyManager x509KeyManager, X509TrustManager x509TrustManager, DefaultConstructorMarker defaultConstructorMarker) {
        this.keyManager = x509KeyManager;
        this.trustManager = x509TrustManager;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "keyManager", imports = {}))
    @JvmName(name = "-deprecated_keyManager")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_keyManager, reason: not valid java name and from getter */
    public final X509KeyManager getKeyManager() {
        return this.keyManager;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "trustManager", imports = {}))
    @JvmName(name = "-deprecated_trustManager")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_trustManager, reason: not valid java name and from getter */
    public final X509TrustManager getTrustManager() {
        return this.trustManager;
    }

    @JvmName(name = "keyManager")
    @NotNull
    public final X509KeyManager keyManager() {
        return this.keyManager;
    }

    @NotNull
    public final SSLContext sslContext() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextNewSSLContext = Platform.INSTANCE.get().newSSLContext();
        sSLContextNewSSLContext.init(new KeyManager[]{this.keyManager}, new TrustManager[]{this.trustManager}, new SecureRandom());
        return sSLContextNewSSLContext;
    }

    @NotNull
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory socketFactory = sslContext().getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "sslContext().socketFactory");
        return socketFactory;
    }

    @JvmName(name = "trustManager")
    @NotNull
    public final X509TrustManager trustManager() {
        return this.trustManager;
    }
}
