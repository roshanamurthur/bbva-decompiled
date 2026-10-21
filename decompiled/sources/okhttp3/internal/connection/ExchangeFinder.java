package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "find", "Ljava/io/IOException;", "e", "", "trackFailure", "", "retryAfterFailure", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "Lokhttp3/Address;", "b", "Lokhttp3/Address;", "getAddress$okhttp", "()Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "eventListener", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class ExchangeFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RealConnectionPool f85805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Address address;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RealCall f85807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EventListener f85808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RouteSelector.Selection f85809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RouteSelector f85810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Route f85814j;

    public ExchangeFinder(@NotNull RealConnectionPool connectionPool, @NotNull Address address, @NotNull RealCall call, @NotNull EventListener eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f85805a = connectionPool;
        this.address = address;
        this.f85807c = call;
        this.f85808d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:86:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a1 A[SYNTHETIC] */
    public final RealConnection a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        Route next;
        RouteSelector.Selection selection;
        RouteSelector routeSelector;
        RouteSelector.Selection next2;
        List<Route> routes;
        RealConnection realConnection;
        RouteSelector.Selection selection2;
        RouteSelector routeSelector2;
        Socket socketReleaseConnectionNoEvents$okhttp;
        while (!this.f85807c.getJ0()) {
            RealConnection connection = this.f85807c.getConnection();
            if (connection != null) {
                synchronized (connection) {
                    try {
                        socketReleaseConnectionNoEvents$okhttp = (connection.getNoNewExchanges() || !sameHostAndPort(connection.getF85830b().address().url())) ? this.f85807c.releaseConnectionNoEvents$okhttp() : null;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f85807c.getConnection() == null) {
                    if (socketReleaseConnectionNoEvents$okhttp != null) {
                        Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                    }
                    this.f85808d.connectionReleased(this.f85807c, connection);
                    this.f85811g = 0;
                    this.f85812h = 0;
                    this.f85813i = 0;
                    if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, null, false)) {
                        connection = this.f85807c.getConnection();
                        Intrinsics.checkNotNull(connection);
                        this.f85808d.connectionAcquired(this.f85807c, connection);
                    } else {
                        next = this.f85814j;
                        try {
                            if (next != null) {
                                Intrinsics.checkNotNull(next);
                                this.f85814j = null;
                            } else {
                                selection = this.f85809e;
                                if (selection != null) {
                                    Intrinsics.checkNotNull(selection);
                                    if (selection.hasNext()) {
                                        RouteSelector.Selection selection3 = this.f85809e;
                                        Intrinsics.checkNotNull(selection3);
                                        next = selection3.next();
                                    }
                                }
                                routeSelector = this.f85810f;
                                if (routeSelector == null) {
                                    routeSelector = new RouteSelector(this.address, this.f85807c.getClient().getRouteDatabase(), this.f85807c, this.f85808d);
                                    this.f85810f = routeSelector;
                                }
                                next2 = routeSelector.next();
                                this.f85809e = next2;
                                routes = next2.getRoutes();
                                if (!this.f85807c.getJ0()) {
                                    throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                                }
                                if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, routes, false)) {
                                    connection = this.f85807c.getConnection();
                                    Intrinsics.checkNotNull(connection);
                                    this.f85808d.connectionAcquired(this.f85807c, connection);
                                } else {
                                    next = next2.next();
                                    realConnection = new RealConnection(this.f85805a, next);
                                    this.f85807c.setConnectionToCancel(realConnection);
                                    realConnection.connect(i10, i11, i12, i13, z10, this.f85807c, this.f85808d);
                                    this.f85807c.setConnectionToCancel(null);
                                    this.f85807c.getClient().getRouteDatabase().connected(realConnection.getF85830b());
                                    if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, routes, true)) {
                                        RealConnection connection2 = this.f85807c.getConnection();
                                        Intrinsics.checkNotNull(connection2);
                                        this.f85814j = next;
                                        Util.closeQuietly(realConnection.socket());
                                        this.f85808d.connectionAcquired(this.f85807c, connection2);
                                        connection = connection2;
                                    } else {
                                        synchronized (realConnection) {
                                            this.f85805a.put(realConnection);
                                            this.f85807c.acquireConnectionNoEvents(realConnection);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        this.f85808d.connectionAcquired(this.f85807c, realConnection);
                                        connection = realConnection;
                                    }
                                }
                            }
                            realConnection.connect(i10, i11, i12, i13, z10, this.f85807c, this.f85808d);
                            this.f85807c.setConnectionToCancel(null);
                            this.f85807c.getClient().getRouteDatabase().connected(realConnection.getF85830b());
                            if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, routes, true)) {
                                RealConnection connection3 = this.f85807c.getConnection();
                                Intrinsics.checkNotNull(connection3);
                                this.f85814j = next;
                                Util.closeQuietly(realConnection.socket());
                                this.f85808d.connectionAcquired(this.f85807c, connection3);
                                connection = connection3;
                            } else {
                                synchronized (realConnection) {
                                    this.f85805a.put(realConnection);
                                    this.f85807c.acquireConnectionNoEvents(realConnection);
                                    Unit unit3 = Unit.INSTANCE;
                                    this.f85808d.connectionAcquired(this.f85807c, realConnection);
                                    connection = realConnection;
                                }
                            }
                        } catch (Throwable th3) {
                            this.f85807c.setConnectionToCancel(null);
                            throw th3;
                        }
                        routes = null;
                        realConnection = new RealConnection(this.f85805a, next);
                        this.f85807c.setConnectionToCancel(realConnection);
                    }
                } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.f85811g = 0;
                this.f85812h = 0;
                this.f85813i = 0;
                if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, null, false)) {
                    connection = this.f85807c.getConnection();
                    Intrinsics.checkNotNull(connection);
                    this.f85808d.connectionAcquired(this.f85807c, connection);
                } else {
                    next = this.f85814j;
                    if (next != null) {
                        Intrinsics.checkNotNull(next);
                        this.f85814j = null;
                    } else {
                        selection = this.f85809e;
                        if (selection != null) {
                            Intrinsics.checkNotNull(selection);
                            if (selection.hasNext()) {
                                RouteSelector.Selection selection4 = this.f85809e;
                                Intrinsics.checkNotNull(selection4);
                                next = selection4.next();
                            }
                        }
                        routeSelector = this.f85810f;
                        if (routeSelector == null) {
                            routeSelector = new RouteSelector(this.address, this.f85807c.getClient().getRouteDatabase(), this.f85807c, this.f85808d);
                            this.f85810f = routeSelector;
                        }
                        next2 = routeSelector.next();
                        this.f85809e = next2;
                        routes = next2.getRoutes();
                        if (!this.f85807c.getJ0()) {
                            throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                        }
                        if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, routes, false)) {
                            connection = this.f85807c.getConnection();
                            Intrinsics.checkNotNull(connection);
                            this.f85808d.connectionAcquired(this.f85807c, connection);
                        } else {
                            next = next2.next();
                            realConnection = new RealConnection(this.f85805a, next);
                            this.f85807c.setConnectionToCancel(realConnection);
                            realConnection.connect(i10, i11, i12, i13, z10, this.f85807c, this.f85808d);
                            this.f85807c.setConnectionToCancel(null);
                            this.f85807c.getClient().getRouteDatabase().connected(realConnection.getF85830b());
                            if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, routes, true)) {
                                RealConnection connection4 = this.f85807c.getConnection();
                                Intrinsics.checkNotNull(connection4);
                                this.f85814j = next;
                                Util.closeQuietly(realConnection.socket());
                                this.f85808d.connectionAcquired(this.f85807c, connection4);
                                connection = connection4;
                            } else {
                                synchronized (realConnection) {
                                    this.f85805a.put(realConnection);
                                    this.f85807c.acquireConnectionNoEvents(realConnection);
                                    Unit unit4 = Unit.INSTANCE;
                                    this.f85808d.connectionAcquired(this.f85807c, realConnection);
                                    connection = realConnection;
                                }
                            }
                        }
                    }
                    routes = null;
                    realConnection = new RealConnection(this.f85805a, next);
                    this.f85807c.setConnectionToCancel(realConnection);
                    realConnection.connect(i10, i11, i12, i13, z10, this.f85807c, this.f85808d);
                    this.f85807c.setConnectionToCancel(null);
                    this.f85807c.getClient().getRouteDatabase().connected(realConnection.getF85830b());
                    if (this.f85805a.callAcquirePooledConnection(this.address, this.f85807c, routes, true)) {
                        RealConnection connection5 = this.f85807c.getConnection();
                        Intrinsics.checkNotNull(connection5);
                        this.f85814j = next;
                        Util.closeQuietly(realConnection.socket());
                        this.f85808d.connectionAcquired(this.f85807c, connection5);
                        connection = connection5;
                    } else {
                        synchronized (realConnection) {
                            this.f85805a.put(realConnection);
                            this.f85807c.acquireConnectionNoEvents(realConnection);
                            Unit unit5 = Unit.INSTANCE;
                            this.f85808d.connectionAcquired(this.f85807c, realConnection);
                            connection = realConnection;
                        }
                    }
                }
            }
            if (connection.isHealthy(z11)) {
                return connection;
            }
            connection.noNewExchanges$okhttp();
            if (this.f85814j == null && (selection2 = this.f85809e) != null && !selection2.hasNext() && (routeSelector2 = this.f85810f) != null && !routeSelector2.hasNext()) {
                throw new IOException("exhausted all routes");
            }
        }
        throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
    }

    @NotNull
    public final ExchangeCodec find(@NotNull OkHttpClient client, @NotNull RealInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            return a(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), chain.getWriteTimeoutMillis(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !Intrinsics.areEqual(chain.getRequest().method(), "GET")).newCodec$okhttp(client, chain);
        } catch (IOException e5) {
            trackFailure(e5);
            throw new RouteException(e5);
        } catch (RouteException e7) {
            trackFailure(e7.getLastConnectException());
            throw e7;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getAddress$okhttp, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        RealConnection connection;
        int i10 = this.f85811g;
        if (i10 == 0 && this.f85812h == 0 && this.f85813i == 0) {
            return false;
        }
        if (this.f85814j != null) {
            return true;
        }
        Route f85830b = null;
        if (i10 <= 1 && this.f85812h <= 1 && this.f85813i <= 0 && (connection = this.f85807c.getConnection()) != null) {
            synchronized (connection) {
                if (connection.getRouteFailureCount() == 0 && Util.canReuseConnectionFor(connection.getF85830b().address().url(), this.address.url())) {
                    f85830b = connection.getF85830b();
                }
            }
        }
        if (f85830b != null) {
            this.f85814j = f85830b;
            return true;
        }
        RouteSelector.Selection selection = this.f85809e;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.f85810f) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    public final boolean sameHostAndPort(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpUrl httpUrlUrl = this.address.url();
        return url.port() == httpUrlUrl.port() && Intrinsics.areEqual(url.host(), httpUrlUrl.host());
    }

    public final void trackFailure(@NotNull IOException e5) {
        Intrinsics.checkNotNullParameter(e5, "e");
        this.f85814j = null;
        if ((e5 instanceof StreamResetException) && ((StreamResetException) e5).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f85811g++;
        } else if (e5 instanceof ConnectionShutdownException) {
            this.f85812h++;
        } else {
            this.f85813i++;
        }
    }
}
