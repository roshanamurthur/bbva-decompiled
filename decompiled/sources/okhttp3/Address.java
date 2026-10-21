package okhttp3;

import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import com.mypinpad.tsdk.isolation.y2;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010N\u001a\u000207\u0012\u0006\u0010O\u001a\u000201\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010%\u001a\u0004\u0018\u00010\"\u0012\b\u0010)\u001a\u0004\u0018\u00010&\u0012\b\u0010-\u001a\u0004\u0018\u00010*\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\bP\u0010QJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010!\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010%\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b#\u0010$J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b'\u0010(J\u0011\u0010-\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b+\u0010,J\u0013\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00102\u001a\u000201H\u0016J\u0017\u00106\u001a\u00020/2\u0006\u00103\u001a\u00020\u0000H\u0000¢\u0006\u0004\b4\u00105J\b\u00108\u001a\u000207H\u0016R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\t\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b\r\u0010\fR\u0019\u0010%\u001a\u0004\u0018\u00010\"8\u0007¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b%\u0010$R\u0019\u0010)\u001a\u0004\u0018\u00010&8\u0007¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b)\u0010(R\u0019\u0010-\u001a\u0004\u0018\u00010*8\u0007¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b-\u0010,R\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0007¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b!\u0010 R\u0017\u0010\u001d\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028G¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b\u0005\u0010\u0004R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128G¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\b\u0019\u0010\u0015¨\u0006R"}, d2 = {"Lokhttp3/Address;", "", "Lokhttp3/HttpUrl;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "url", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Lokhttp3/Authenticator;", "-deprecated_proxyAuthenticator", "()Lokhttp3/Authenticator;", "proxyAuthenticator", "", "Lokhttp3/Protocol;", "-deprecated_protocols", "()Ljava/util/List;", "protocols", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "that", "equalsNonHost$okhttp", "(Lokhttp3/Address;)Z", "equalsNonHost", "", "toString", "a", "Lokhttp3/Dns;", "b", "Ljavax/net/SocketFactory;", "c", "Ljavax/net/ssl/SSLSocketFactory;", "d", "Ljavax/net/ssl/HostnameVerifier;", "e", "Lokhttp3/CertificatePinner;", "f", "Lokhttp3/Authenticator;", "g", "Ljava/net/Proxy;", "h", "Ljava/net/ProxySelector;", "i", "Lokhttp3/HttpUrl;", "j", "Ljava/util/List;", "k", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Address {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Dns dns;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SocketFactory socketFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SSLSocketFactory sslSocketFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Authenticator proxyAuthenticator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Proxy proxy;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ProxySelector proxySelector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HttpUrl url;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Protocol> protocols;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ConnectionSpec> connectionSpecs;

    public Address(@NotNull String uriHost, int i10, @NotNull Dns dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull Authenticator proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<ConnectionSpec> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : ProxyConfig.MATCH_HTTP).host(uriHost).port(i10).build();
        this.protocols = Util.toImmutableList(protocols);
        this.connectionSpecs = Util.toImmutableList(connectionSpecs);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @JvmName(name = "-deprecated_certificatePinner")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @JvmName(name = "-deprecated_connectionSpecs")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m6063deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @JvmName(name = "-deprecated_dns")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @JvmName(name = "-deprecated_hostnameVerifier")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @JvmName(name = "-deprecated_protocols")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m6066deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @JvmName(name = "-deprecated_proxy")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @JvmName(name = "-deprecated_proxyAuthenticator")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @JvmName(name = "-deprecated_proxySelector")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @JvmName(name = "-deprecated_socketFactory")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @JvmName(name = "-deprecated_sslSocketFactory")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name and from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    @JvmName(name = "certificatePinner")
    @Nullable
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @JvmName(name = "connectionSpecs")
    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @JvmName(name = "dns")
    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Address) {
            Address address = (Address) other;
            if (Intrinsics.areEqual(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(@NotNull Address that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.dns, that.dns) && Intrinsics.areEqual(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.areEqual(this.protocols, that.protocols) && Intrinsics.areEqual(this.connectionSpecs, that.connectionSpecs) && Intrinsics.areEqual(this.proxySelector, that.proxySelector) && Intrinsics.areEqual(this.proxy, that.proxy) && Intrinsics.areEqual(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.areEqual(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.areEqual(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + a.a(this.connectionSpecs, a.a(this.protocols, (this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    @JvmName(name = "hostnameVerifier")
    @Nullable
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @JvmName(name = "protocols")
    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @JvmName(name = "proxy")
    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @JvmName(name = "proxyAuthenticator")
    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @JvmName(name = "proxySelector")
    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @JvmName(name = "socketFactory")
    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @JvmName(name = "sslSocketFactory")
    @Nullable
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        HttpUrl httpUrl = this.url;
        sb2.append(httpUrl.host());
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(httpUrl.port());
        sb2.append(", ");
        Proxy proxy = this.proxy;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.proxySelector;
        }
        return y2.b(sb2, str, AbstractJsonLexerKt.END_OBJ);
    }

    @JvmName(name = "url")
    @NotNull
    public final HttpUrl url() {
        return this.url;
    }
}
