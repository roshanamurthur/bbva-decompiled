package okhttp3.tls.internal;

import com.bbva.component.dm.naturalauth.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InsecureAndroidTrustManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\n\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0015"}, d2 = {"Lokhttp3/tls/internal/InsecureAndroidTrustManager;", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", Constants.authType, "host", "", "Ljava/security/cert/Certificate;", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "delegate", "insecureHosts", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/util/List;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class InsecureAndroidTrustManager implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f86181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509TrustManager f86182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f86183c;

    public InsecureAndroidTrustManager(@NotNull X509TrustManager delegate, @NotNull List<String> insecureHosts) {
        Method method;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(insecureHosts, "insecureHosts");
        this.f86182b = delegate;
        this.f86183c = insecureHosts;
        try {
            method = delegate.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.f86181a = method;
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f86182b.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "delegate.acceptedIssuers");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public Void checkClientTrusted(@NotNull X509Certificate[] chain, @Nullable String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        throw new CertificateException("Unsupported operation");
    }

    @NotNull
    public final List<Certificate> checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull String host) throws Throwable {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(host, "host");
        if (this.f86183c.contains(host)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        try {
            Method method = this.f86181a;
            if (method == null) {
                throw new CertificateException("Failed to call checkServerTrusted");
            }
            Object objInvoke = method.invoke(this.f86182b, chain, authType, host);
            if (objInvoke != null) {
                return (List) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<java.security.cert.Certificate>");
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            Intrinsics.checkNotNullExpressionValue(targetException, "e.targetException");
            throw targetException;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public Void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }
}
