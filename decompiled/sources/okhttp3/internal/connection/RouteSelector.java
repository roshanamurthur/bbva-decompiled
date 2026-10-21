package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import bk.d;
import bk.g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "", "hasNext", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "eventListener", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class RouteSelector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Address f85855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RouteDatabase f85856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Call f85857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EventListener f85858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<? extends Proxy> f85859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public List<? extends InetSocketAddress> f85861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f85862h;

    /* JADX INFO: compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSocketHost(@NotNull InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* JADX INFO: compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "", "hasNext", "Lokhttp3/Route;", "next", "", "a", "Ljava/util/List;", "getRoutes", "()Ljava/util/List;", "routes", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Selection {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Route> routes;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f85864b;

        public Selection(@NotNull List<Route> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.routes = routes;
        }

        @NotNull
        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.f85864b < this.routes.size();
        }

        @NotNull
        public final Route next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f85864b;
            this.f85864b = i10 + 1;
            return this.routes.get(i10);
        }
    }

    public RouteSelector(@NotNull Address address, @NotNull RouteDatabase routeDatabase, @NotNull Call call, @NotNull EventListener eventListener) {
        List<Proxy> listImmutableListOf;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f85855a = address;
        this.f85856b = routeDatabase;
        this.f85857c = call;
        this.f85858d = eventListener;
        this.f85859e = CollectionsKt__CollectionsKt.emptyList();
        this.f85861g = CollectionsKt__CollectionsKt.emptyList();
        this.f85862h = new ArrayList();
        HttpUrl httpUrlUrl = address.url();
        Proxy proxy = address.proxy();
        eventListener.proxySelectStart(call, httpUrlUrl);
        if (proxy != null) {
            listImmutableListOf = d.listOf(proxy);
        } else {
            URI uri = httpUrlUrl.uri();
            if (uri.getHost() == null) {
                listImmutableListOf = Util.immutableListOf(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.proxySelector().select(uri);
                List<Proxy> list = proxiesOrNull;
                if (list == null || list.isEmpty()) {
                    listImmutableListOf = Util.immutableListOf(Proxy.NO_PROXY);
                } else {
                    Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                    listImmutableListOf = Util.toImmutableList(proxiesOrNull);
                }
            }
        }
        this.f85859e = listImmutableListOf;
        this.f85860f = 0;
        eventListener.proxySelectEnd(call, httpUrlUrl, listImmutableListOf);
    }

    public final boolean hasNext() {
        return (this.f85860f < this.f85859e.size()) || (this.f85862h.isEmpty() ^ true);
    }

    @NotNull
    public final Selection next() throws IOException {
        ArrayList arrayList;
        String strHost;
        int iPort;
        List<InetAddress> listListOf;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            boolean z10 = this.f85860f < this.f85859e.size();
            arrayList = this.f85862h;
            if (!z10) {
                break;
            }
            boolean z11 = this.f85860f < this.f85859e.size();
            Address address = this.f85855a;
            if (!z11) {
                throw new SocketException("No route to " + address.url().host() + "; exhausted proxy configurations: " + this.f85859e);
            }
            List<? extends Proxy> list = this.f85859e;
            int i10 = this.f85860f;
            this.f85860f = i10 + 1;
            Proxy proxy = list.get(i10);
            ArrayList arrayList3 = new ArrayList();
            this.f85861g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strHost = address.url().host();
                iPort = address.url().port();
            } else {
                SocketAddress proxyAddress = proxy.address();
                if (!(proxyAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                }
                Companion companion = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                strHost = companion.getSocketHost(inetSocketAddress);
                iPort = inetSocketAddress.getPort();
            }
            if (1 > iPort || iPort >= 65536) {
                throw new SocketException("No route to " + strHost + AbstractJsonLexerKt.COLON + iPort + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(strHost, iPort));
            } else {
                if (Util.canParseAsIpAddress(strHost)) {
                    listListOf = d.listOf(InetAddress.getByName(strHost));
                } else {
                    EventListener eventListener = this.f85858d;
                    Call call = this.f85857c;
                    eventListener.dnsStart(call, strHost);
                    List<InetAddress> listLookup = address.dns().lookup(strHost);
                    if (listLookup.isEmpty()) {
                        throw new UnknownHostException(address.dns() + " returned no addresses for " + strHost);
                    }
                    eventListener.dnsEnd(call, strHost, listLookup);
                    listListOf = listLookup;
                }
                Iterator<InetAddress> it = listListOf.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new InetSocketAddress(it.next(), iPort));
                }
            }
            Iterator<? extends InetSocketAddress> it2 = this.f85861g.iterator();
            while (it2.hasNext()) {
                Route route = new Route(address, proxy, it2.next());
                if (this.f85856b.shouldPostpone(route)) {
                    arrayList.add(route);
                } else {
                    arrayList2.add(route);
                }
            }
        } while (!(!arrayList2.isEmpty()));
        if (arrayList2.isEmpty()) {
            g.addAll(arrayList2, arrayList);
            arrayList.clear();
        }
        return new Selection(arrayList2);
    }
}
