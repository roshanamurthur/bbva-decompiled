package okhttp3.internal.authenticator;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", DigipassManagerConstants.KEY_RESPONSE, "Lokhttp3/Request;", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "Lokhttp3/Dns;", "defaultDns", "<init>", "(Lokhttp3/Dns;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class JavaNetAuthenticator implements Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Dns f85686a;

    /* JADX INFO: compiled from: JavaNetAuthenticator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static InetAddress a(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return (InetAddress) CollectionsKt___CollectionsKt.first((List) dns.lookup(httpUrl.host()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // okhttp3.Authenticator
    @Nullable
    public Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException {
        Proxy proxy;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Address address;
        Dns dns;
        Intrinsics.checkNotNullParameter(response, "response");
        List<Challenge> listChallenges = response.challenges();
        Request request = response.request();
        HttpUrl httpUrlUrl = request.url();
        boolean z10 = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : listChallenges) {
            if (l.equals("Basic", challenge.scheme(), true)) {
                Dns dns2 = (route == null || (address = route.address()) == null || (dns = address.dns()) == null) ? this.f85686a : dns;
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, a(proxy, httpUrlUrl, dns2), inetSocketAddress.getPort(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    String strHost = httpUrlUrl.host();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strHost, a(proxy, httpUrlUrl, dns2), httpUrlUrl.port(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return request.newBuilder().header(str, Credentials.basic(userName, new String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(@NotNull Dns defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f85686a = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
