package okhttp3.internal.connection;

import androidx.camera.camera2.internal.h0;
import androidx.core.app.NotificationCompat;
import bm.a;
import bm.b;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.e;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.data.util.CommandConstants;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0001rB\u0017\u0012\u0006\u0010Q\u001a\u00020L\u0012\u0006\u0010-\u001a\u00020\u001a¢\u0006\u0004\bp\u0010qJ\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0005J>\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J'\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010,\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+J\b\u0010-\u001a\u00020\u001aH\u0016J\u0006\u0010.\u001a\u00020\u0003J\b\u00100\u001a\u00020/H\u0016J\u000e\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010J\u0010\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u000203H\u0016J\u0018\u0010:\u001a\u00020\u00032\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016J\n\u0010<\u001a\u0004\u0018\u00010;H\u0016J'\u0010B\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010AJ!\u0010G\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010>H\u0000¢\u0006\u0004\bE\u0010FJ\b\u0010I\u001a\u00020HH\u0016J\b\u0010K\u001a\u00020JH\u0016R\u0017\u0010Q\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010\u0006\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010^\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R#\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0`0_8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010U¨\u0006s"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "", "noNewExchanges$okhttp", "()V", "noNewExchanges", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "eventListener", "connect", "Lokhttp3/Address;", "address", "", "Lokhttp3/Route;", "routes", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "route", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "Ljava/net/Socket;", "socket", "doExtensiveChecks", "isHealthy", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "Lokhttp3/Handshake;", "handshake", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "e", "trackFailure$okhttp", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "trackFailure", "Lokhttp3/Protocol;", "protocol", "", "toString", "Lokhttp3/internal/connection/RealConnectionPool;", "a", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "j", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "l", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "", "Ljava/lang/ref/Reference;", "p", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "calls", "", "q", "J", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "idleAtNs", "isMultiplexed$okhttp", "isMultiplexed", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RealConnectionPool connectionPool;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Route f85830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Socket f85831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Socket f85832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Handshake f85833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Protocol f85834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Http2Connection f85835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public BufferedSource f85836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public BufferedSink f85837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean noNewExchanges;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f85839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int routeFailureCount;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f85841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f85842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ArrayList f85843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public long idleAtNs;

    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "MAX_TUNNEL_ATTEMPTS", "", "NPE_THROW_WITH_NULL", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RealConnection newTestConnection(@NotNull RealConnectionPool connectionPool, @NotNull Route route, @NotNull Socket socket, long idleAtNs) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(socket, "socket");
            RealConnection realConnection = new RealConnection(connectionPool, route);
            realConnection.f85832d = socket;
            realConnection.setIdleAtNs$okhttp(idleAtNs);
            return realConnection;
        }
    }

    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealConnection(@NotNull RealConnectionPool connectionPool, @NotNull Route route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.connectionPool = connectionPool;
        this.f85830b = route;
        this.f85842o = 1;
        this.f85843p = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public final void a(int i10, int i11, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Route route = this.f85830b;
        Proxy proxy = route.proxy();
        Address address = route.address();
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = address.socketFactory().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f85831c = socketCreateSocket;
        eventListener.connectStart(call, route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(i11);
        try {
            Platform.INSTANCE.get().connectSocket(socketCreateSocket, route.socketAddress(), i10);
            try {
                this.f85836h = Okio.buffer(Okio.source(socketCreateSocket));
                this.f85837i = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e5) {
                if (Intrinsics.areEqual(e5.getMessage(), "throw with null exception")) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + route.socketAddress());
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void b(int i10, int i11, int i12, Call call, EventListener eventListener) throws IOException {
        int i13;
        char c10;
        boolean z10;
        Request.Builder builder = new Request.Builder();
        Route route = this.f85830b;
        OkHttpClient okHttpClient = null;
        boolean z11 = true;
        Request requestBuild = builder.url(route.address().url()).method(CommandConstants.CONNECT, null).header("Host", Util.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request requestAuthenticate = route.address().proxyAuthenticator().authenticate(route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (requestAuthenticate != null) {
            requestBuild = requestAuthenticate;
        }
        HttpUrl httpUrlUrl = requestBuild.url();
        int i14 = 0;
        while (i14 < 21) {
            a(i10, i11, call, eventListener);
            String str = "CONNECT " + Util.toHostHeader(httpUrlUrl, z11) + " HTTP/1.1";
            while (true) {
                BufferedSource bufferedSource = this.f85836h;
                Intrinsics.checkNotNull(bufferedSource);
                BufferedSink bufferedSink = this.f85837i;
                Intrinsics.checkNotNull(bufferedSink);
                Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, this, bufferedSource, bufferedSink);
                Timeout f86333p0 = bufferedSource.getF86420p0();
                long j10 = i11;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f86333p0.timeout(j10, timeUnit);
                i13 = i14;
                bufferedSink.getF86418p0().timeout(i12, timeUnit);
                http1ExchangeCodec.writeRequest(requestBuild.headers(), str);
                http1ExchangeCodec.finishRequest();
                Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
                Intrinsics.checkNotNull(responseHeaders);
                Response responseBuild = responseHeaders.request(requestBuild).build();
                http1ExchangeCodec.skipConnectBody(responseBuild);
                int iCode = responseBuild.code();
                if (iCode == 200) {
                    c10 = 407;
                    z10 = true;
                    if (!bufferedSource.getBuffer().exhausted() || !bufferedSink.getBuffer().exhausted()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    requestBuild = null;
                    break;
                }
                c10 = 407;
                if (iCode != 407) {
                    throw new IOException("Unexpected response code for CONNECT: " + responseBuild.code());
                }
                Request requestAuthenticate2 = route.address().proxyAuthenticator().authenticate(route, responseBuild);
                if (requestAuthenticate2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                z10 = true;
                if (l.equals(HearingDisabilitiesConstants.CLOSE_MODAL, Response.header$default(responseBuild, "Connection", null, 2, null), true)) {
                    requestBuild = requestAuthenticate2;
                    break;
                }
                i11 = i11;
                requestBuild = requestAuthenticate2;
                i14 = i13;
                okHttpClient = null;
            }
            if (requestBuild == null) {
                return;
            }
            Socket socket = this.f85831c;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            okHttpClient = null;
            this.f85831c = null;
            this.f85837i = null;
            this.f85836h = null;
            eventListener.connectEnd(call, route.socketAddress(), route.proxy(), null);
            z11 = z10;
            i14 = i13 + 1;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(ConnectionSpecSelector connectionSpecSelector, int i10, Call call, EventListener eventListener) throws Throwable {
        Route route = this.f85830b;
        if (route.address().sslSocketFactory() == null) {
            List<Protocol> listProtocols = route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!listProtocols.contains(protocol)) {
                this.f85832d = this.f85831c;
                this.f85834f = Protocol.HTTP_1_1;
                return;
            } else {
                this.f85832d = this.f85831c;
                this.f85834f = protocol;
                d(i10);
                return;
            }
        }
        eventListener.secureConnectStart(call);
        Address address = route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.checkNotNull(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.f85831c, address.url().host(), address.url().port(), true);
            Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                    Platform.INSTANCE.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                Handshake handshake = companion.get(sslSocketSession);
                HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(address.url().host(), sslSocketSession)) {
                    CertificatePinner certificatePinner = address.certificatePinner();
                    Intrinsics.checkNotNull(certificatePinner);
                    this.f85833e = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new a(certificatePinner, handshake, address));
                    certificatePinner.check$okhttp(address.url().host(), new b(this));
                    String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.INSTANCE.get().getSelectedProtocol(sSLSocket2) : null;
                    this.f85832d = sSLSocket2;
                    this.f85836h = Okio.buffer(Okio.source(sSLSocket2));
                    this.f85837i = Okio.buffer(Okio.sink(sSLSocket2));
                    this.f85834f = selectedProtocol != null ? Protocol.INSTANCE.get(selectedProtocol) : Protocol.HTTP_1_1;
                    Platform.INSTANCE.get().afterHandshake(sSLSocket2);
                    eventListener.secureConnectEnd(call, this.f85833e);
                    if (this.f85834f == Protocol.HTTP_2) {
                        d(i10);
                        return;
                    }
                    return;
                }
                List<Certificate> listPeerCertificates = handshake.peerCertificates();
                if (!(!listPeerCertificates.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                }
                Certificate certificate = listPeerCertificates.get(0);
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                throw new SSLPeerUnverifiedException(e.trimMargin$default("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.INSTANCE.pin(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.INSTANCE.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void cancel() {
        Socket socket = this.f85831c;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:64:0x0080->B:74:?, LOOP_END, SYNTHETIC] */
    public final void connect(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, @NotNull Call call, @NotNull EventListener eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f85834f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        Route route = this.f85830b;
        List<ConnectionSpec> listConnectionSpecs = route.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listConnectionSpecs);
        if (route.address().sslSocketFactory() == null) {
            if (!listConnectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strHost = route.address().url().host();
            if (!Platform.INSTANCE.get().isCleartextTrafficPermitted(strHost)) {
                throw new RouteException(new UnknownServiceException(h0.b("CLEARTEXT communication to ", strHost, " not permitted by network security policy")));
            }
        } else if (route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (route.requiresTunnel()) {
                    b(connectTimeout, readTimeout, writeTimeout, call, eventListener);
                    if (this.f85831c == null) {
                        break;
                    }
                } else {
                    try {
                        a(connectTimeout, readTimeout, call, eventListener);
                    } catch (IOException e5) {
                        e = e5;
                        socket = this.f85832d;
                        if (socket != null) {
                            Util.closeQuietly(socket);
                        }
                        socket2 = this.f85831c;
                        if (socket2 != null) {
                            Util.closeQuietly(socket2);
                        }
                        this.f85832d = null;
                        this.f85831c = null;
                        this.f85836h = null;
                        this.f85837i = null;
                        this.f85833e = null;
                        this.f85834f = null;
                        this.f85835g = null;
                        this.f85842o = 1;
                        eventListener.connectFailed(call, route.socketAddress(), route.proxy(), null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (connectionRetryEnabled) {
                            throw routeException;
                        }
                        if (connectionSpecSelector.connectionFailed(e)) {
                            throw routeException;
                        }
                    }
                }
                try {
                    c(connectionSpecSelector, pingIntervalMillis, call, eventListener);
                    eventListener.connectEnd(call, route.socketAddress(), route.proxy(), this.f85834f);
                    break;
                } catch (IOException e7) {
                    e = e7;
                    socket = this.f85832d;
                    if (socket != null) {
                        Util.closeQuietly(socket);
                    }
                    socket2 = this.f85831c;
                    if (socket2 != null) {
                        Util.closeQuietly(socket2);
                    }
                    this.f85832d = null;
                    this.f85831c = null;
                    this.f85836h = null;
                    this.f85837i = null;
                    this.f85833e = null;
                    this.f85834f = null;
                    this.f85835g = null;
                    this.f85842o = 1;
                    eventListener.connectFailed(call, route.socketAddress(), route.proxy(), null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        routeException.addConnectException(e);
                    }
                    if (connectionRetryEnabled) {
                        throw routeException;
                    }
                    if (connectionSpecSelector.connectionFailed(e)) {
                        throw routeException;
                    }
                }
            } catch (IOException e10) {
                e = e10;
            }
        }
        if (route.requiresTunnel() && this.f85831c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.idleAtNs = System.nanoTime();
    }

    public final void connectFailed$okhttp(@NotNull OkHttpClient client, @NotNull Route failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    public final void d(int i10) throws IOException {
        Socket socket = this.f85832d;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f85836h;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f85837i;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.f85830b.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(i10).build();
        this.f85835g = http2ConnectionBuild;
        this.f85842o = Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
    }

    @NotNull
    public final List<Reference<RealCall>> getCalls() {
        return this.f85843p;
    }

    @NotNull
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    /* JADX INFO: renamed from: getIdleAtNs$okhttp, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* JADX INFO: renamed from: getRouteFailureCount$okhttp, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    @Nullable
    /* JADX INFO: renamed from: handshake, reason: from getter */
    public Handshake getF85833e() {
        return this.f85833e;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.m++;
    }

    public final boolean isEligible$okhttp(@NotNull Address address, @Nullable List<Route> routes) {
        Handshake handshake;
        Intrinsics.checkNotNullParameter(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f85843p.size() < this.f85842o && !this.noNewExchanges) {
            Route route = this.f85830b;
            if (!route.address().equalsNonHost$okhttp(address)) {
                return false;
            }
            if (Intrinsics.areEqual(address.url().host(), getF85830b().address().url().host())) {
                return true;
            }
            if (this.f85835g != null && routes != null) {
                List<Route> list = routes;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Route route2 : list) {
                        Proxy.Type type = route2.proxy().type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && route.proxy().type() == type2 && Intrinsics.areEqual(route.socketAddress(), route2.socketAddress())) {
                            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
                            if (hostnameVerifier != okHostnameVerifier) {
                                return false;
                            }
                            HttpUrl httpUrlUrl = address.url();
                            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
                            }
                            HttpUrl httpUrlUrl2 = route.address().url();
                            if (httpUrlUrl.port() != httpUrlUrl2.port()) {
                                break;
                            }
                            if (!Intrinsics.areEqual(httpUrlUrl.host(), httpUrlUrl2.host())) {
                                if (!this.f85839k && (handshake = this.f85833e) != null) {
                                    Intrinsics.checkNotNull(handshake);
                                    List<Certificate> listPeerCertificates = handshake.peerCertificates();
                                    if (!(!listPeerCertificates.isEmpty())) {
                                        break;
                                    }
                                    String strHost = httpUrlUrl.host();
                                    Certificate certificate = listPeerCertificates.get(0);
                                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                    if (!okHostnameVerifier.verify(strHost, (X509Certificate) certificate)) {
                                        break;
                                    }
                                } else {
                                    break;
                                    break;
                                }
                            }
                            try {
                                CertificatePinner certificatePinner = address.certificatePinner();
                                Intrinsics.checkNotNull(certificatePinner);
                                String strHost2 = address.url().host();
                                Handshake f85833e = getF85833e();
                                Intrinsics.checkNotNull(f85833e);
                                certificatePinner.check(strHost2, f85833e.peerCertificates());
                                return true;
                            } catch (SSLPeerUnverifiedException unused) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean isHealthy(boolean doExtensiveChecks) {
        long j10;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f85831c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f85832d;
        Intrinsics.checkNotNull(socket2);
        BufferedSource bufferedSource = this.f85836h;
        Intrinsics.checkNotNull(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f85835g;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.idleAtNs;
        }
        if (j10 < IDLE_CONNECTION_HEALTHY_NS || !doExtensiveChecks) {
            return true;
        }
        return Util.isHealthy(socket2, bufferedSource);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.f85835g != null;
    }

    @NotNull
    public final ExchangeCodec newCodec$okhttp(@NotNull OkHttpClient client, @NotNull RealInterceptorChain chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f85832d;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f85836h;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f85837i;
        Intrinsics.checkNotNull(bufferedSink);
        Http2Connection http2Connection = this.f85835g;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.readTimeoutMillis());
        Timeout f86333p0 = bufferedSource.getF86420p0();
        long readTimeoutMillis$okhttp = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f86333p0.timeout(readTimeoutMillis$okhttp, timeUnit);
        bufferedSink.getF86418p0().timeout(chain.getWriteTimeoutMillis(), timeUnit);
        return new Http1ExchangeCodec(client, this, bufferedSource, bufferedSink);
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams$okhttp(@NotNull final Exchange exchange) throws SocketException {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Socket socket = this.f85832d;
        Intrinsics.checkNotNull(socket);
        final BufferedSource bufferedSource = this.f85836h;
        Intrinsics.checkNotNull(bufferedSource);
        final BufferedSink bufferedSink = this.f85837i;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(bufferedSource, bufferedSink) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.f85839k = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(@NotNull Http2Connection connection, @NotNull Settings settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f85842o = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(@NotNull Http2Stream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    @NotNull
    public Protocol protocol() {
        Protocol protocol = this.f85834f;
        Intrinsics.checkNotNull(protocol);
        return protocol;
    }

    @Override // okhttp3.Connection
    @NotNull
    /* JADX INFO: renamed from: route, reason: from getter */
    public Route getF85830b() {
        return this.f85830b;
    }

    public final void setIdleAtNs$okhttp(long j10) {
        this.idleAtNs = j10;
    }

    public final void setNoNewExchanges(boolean z10) {
        this.noNewExchanges = z10;
    }

    public final void setRouteFailureCount$okhttp(int i10) {
        this.routeFailureCount = i10;
    }

    @Override // okhttp3.Connection
    @NotNull
    public Socket socket() {
        Socket socket = this.f85832d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    @NotNull
    public String toString() {
        Object objCipherSuite;
        StringBuilder sb2 = new StringBuilder("Connection{");
        Route route = this.f85830b;
        sb2.append(route.address().url().host());
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(route.address().url().port());
        sb2.append(", proxy=");
        sb2.append(route.proxy());
        sb2.append(" hostAddress=");
        sb2.append(route.socketAddress());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f85833e;
        if (handshake == null || (objCipherSuite = handshake.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        sb2.append(objCipherSuite);
        sb2.append(" protocol=");
        sb2.append(this.f85834f);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final synchronized void trackFailure$okhttp(@NotNull RealCall call, @Nullable IOException e5) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (e5 instanceof StreamResetException) {
                if (((StreamResetException) e5).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i10 = this.f85841n + 1;
                    this.f85841n = i10;
                    if (i10 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) e5).errorCode != ErrorCode.CANCEL || !call.getJ0()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed$okhttp() || (e5 instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.m == 0) {
                    if (e5 != null) {
                        connectFailed$okhttp(call.getClient(), this.f85830b, e5);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
