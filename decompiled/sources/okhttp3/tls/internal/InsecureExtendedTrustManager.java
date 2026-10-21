package okhttp3.tls.internal;

import com.bbva.component.dm.naturalauth.Constants;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InsecureExtendedTrustManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J'\u0010\f\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0012J)\u0010\u0013\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J1\u0010\u0013\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0013\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0015¨\u0006\u001b"}, d2 = {"Lokhttp3/tls/internal/InsecureExtendedTrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "", "Ljava/security/cert/X509Certificate;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "chain", "", Constants.authType, "Ljava/net/Socket;", "socket", "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "engine", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)Ljava/lang/Void;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)Ljava/lang/Void;", "delegate", "", "insecureHosts", "<init>", "(Ljavax/net/ssl/X509ExtendedTrustManager;Ljava/util/List;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
@IgnoreJRERequirement
public final class InsecureExtendedTrustManager extends X509ExtendedTrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509ExtendedTrustManager f86184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f86185b;

    public InsecureExtendedTrustManager(@NotNull X509ExtendedTrustManager delegate, @NotNull List<String> insecureHosts) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(insecureHosts, "insecureHosts");
        this.f86184a = delegate;
        this.f86185b = insecureHosts;
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f86184a.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "delegate.acceptedIssuers");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull Socket socket) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (this.f86185b.contains(Util.peerName(socket))) {
            return;
        }
        this.f86184a.checkServerTrusted(chain, authType, socket);
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public Void checkClientTrusted(@NotNull X509Certificate[] chain, @Nullable String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull SSLEngine engine) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(engine, "engine");
        if (this.f86185b.contains(engine.getPeerHost())) {
            return;
        }
        this.f86184a.checkServerTrusted(chain, authType, engine);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    @NotNull
    public Void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @Nullable SSLEngine engine) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    @NotNull
    public Void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @Nullable Socket socket) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public Void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }
}
