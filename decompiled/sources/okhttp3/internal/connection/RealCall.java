package okhttp3.internal.connection;

import ak.b;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import bk.g;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0002`aB\u001f\u0012\u0006\u0010>\u001a\u000209\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\u0006\u0010H\u001a\u00020\t¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0000H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\tJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cJ;\u0010'\u001a\u00028\u0000\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u0004\u0018\u00010\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b(\u0010)J\u0011\u0010.\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010/\u001a\u00020\u0007J\u0017\u00103\u001a\u00020\u00072\u0006\u00100\u001a\u00020\tH\u0000¢\u0006\u0004\b1\u00102J\u0006\u00104\u001a\u00020\tJ\u000f\u00108\u001a\u000205H\u0000¢\u0006\u0004\b6\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010H\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010N\u001a\u00020I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR(\u0010X\u001a\u0004\u0018\u00010\u00182\b\u0010O\u001a\u0004\u0018\u00010\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR$\u0010]\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Q\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010\\¨\u0006b"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "Lokio/AsyncTimeout;", "timeout", "clone", "Lokhttp3/Request;", "request", "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "", "isCanceled", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", "enqueue", "isExecuted", "getResponseWithInterceptorChain$okhttp", "()Lokhttp3/Response;", "getResponseWithInterceptorChain", "newExchangeFinder", "enterNetworkInterceptorExchange", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", "connection", "acquireConnectionNoEvents", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "exchange", "requestDone", "responseDone", "e", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "(Ljava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "Lokhttp3/OkHttpClient;", "p0", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client", "q0", "Lokhttp3/Request;", "getOriginalRequest", "()Lokhttp3/Request;", "originalRequest", "r0", "Z", "getForWebSocket", "()Z", "forWebSocket", "Lokhttp3/EventListener;", "t0", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "eventListener", "<set-?>", "y0", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "F0", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "interceptorScopedExchange", "L0", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "connectionToCancel", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class RealCall implements Call {
    public boolean E0;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @Nullable
    public Exchange interceptorScopedExchange;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public volatile boolean J0;

    @Nullable
    public volatile Exchange K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @Nullable
    public volatile RealConnection connectionToCancel;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OkHttpClient client;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Request originalRequest;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final boolean forWebSocket;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final RealConnectionPool f85818s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EventListener eventListener;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final AnonymousClass1 f85820u0;

    @NotNull
    public final AtomicBoolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public Object f85821w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public ExchangeFinder f85822x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RealConnection connection;

    /* JADX INFO: compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/RealCall;", "other", "", "reuseCallsPerHostFrom", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "q0", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class AsyncCall implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Callback f85824p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public volatile AtomicInteger callsPerHost;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RealCall f85826r0;

        public AsyncCall(@NotNull RealCall realCall, Callback responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f85826r0 = realCall;
            this.f85824p0 = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            RealCall realCall = this.f85826r0;
            Dispatcher dispatcher = realCall.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e5) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e5);
                    realCall.noMoreExchanges$okhttp(interruptedIOException);
                    this.f85824p0.onFailure(realCall, interruptedIOException);
                    realCall.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th2) {
                realCall.getClient().dispatcher().finished$okhttp(this);
                throw th2;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: getCall, reason: from getter */
        public final RealCall getF85826r0() {
            return this.f85826r0;
        }

        @NotNull
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @NotNull
        public final String getHost() {
            return this.f85826r0.getOriginalRequest().url().host();
        }

        @NotNull
        public final Request getRequest() {
            return this.f85826r0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@NotNull AsyncCall other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dispatcher dispatcher;
            Callback callback = this.f85824p0;
            StringBuilder sb2 = new StringBuilder("OkHttp ");
            RealCall realCall = this.f85826r0;
            sb2.append(realCall.redactedUrl$okhttp());
            String string = sb2.toString();
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                realCall.f85820u0.enter();
                boolean z10 = false;
                try {
                    try {
                        try {
                            callback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            dispatcher = realCall.getClient().dispatcher();
                        } catch (IOException e5) {
                            e = e5;
                            z10 = true;
                            if (z10) {
                                Platform.INSTANCE.get().log("Callback failure for " + RealCall.access$toLoggableString(realCall), 4, e);
                            } else {
                                callback.onFailure(realCall, e);
                            }
                            dispatcher = realCall.getClient().dispatcher();
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            realCall.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                b.addSuppressed(iOException, th);
                                callback.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th3;
                    }
                } catch (IOException e7) {
                    e = e7;
                } catch (Throwable th4) {
                    th = th4;
                }
                dispatcher.finished$okhttp(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "", "a", "Ljava/lang/Object;", "getCallStackTrace", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class CallReference extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(@NotNull RealCall referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.callStackTrace = obj;
        }

        @Nullable
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
    public RealCall(@NotNull OkHttpClient client, @NotNull Request originalRequest, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z10;
        this.f85818s0 = client.connectionPool().getDelegate();
        this.eventListener = client.eventListenerFactory().create(this);
        ?? r4 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            @Override // okio.AsyncTimeout
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r4.timeout(client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f85820u0 = r4;
        this.v0 = new AtomicBoolean();
        this.I0 = true;
    }

    public static final String access$toLoggableString(RealCall realCall) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(realCall.getJ0() ? "canceled " : "");
        sb2.append(realCall.forWebSocket ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(realCall.redactedUrl$okhttp());
        return sb2.toString();
    }

    public final <E extends IOException> E a(E e5) {
        E interruptedIOException;
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z10 = Util.assertionsEnabled;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z10 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.E0 && exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e5 != null) {
                interruptedIOException.initCause(e5);
            }
        } else {
            interruptedIOException = e5;
        }
        if (e5 != null) {
            EventListener eventListener = this.eventListener;
            Intrinsics.checkNotNull(interruptedIOException);
            eventListener.callFailed(this, interruptedIOException);
        } else {
            this.eventListener.callEnd(this);
        }
        return interruptedIOException;
    }

    public final void acquireConnectionNoEvents(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.f85821w0));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        Exchange exchange = this.K0;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public void enqueue(@NotNull Callback responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.v0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f85821w0 = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
    }

    public final void enterNetworkInterceptorExchange(@NotNull Request request, boolean newExchangeFinder) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.H0)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.G0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (newExchangeFinder) {
            RealConnectionPool realConnectionPool = this.f85818s0;
            HttpUrl httpUrlUrl = request.url();
            boolean isHttps = httpUrlUrl.getIsHttps();
            OkHttpClient okHttpClient = this.client;
            if (isHttps) {
                sslSocketFactory = okHttpClient.sslSocketFactory();
                hostnameVerifier = okHttpClient.hostnameVerifier();
                certificatePinner = okHttpClient.certificatePinner();
            } else {
                sslSocketFactory = null;
                hostnameVerifier = null;
                certificatePinner = null;
            }
            this.f85822x0 = new ExchangeFinder(realConnectionPool, new Address(httpUrlUrl.host(), httpUrlUrl.port(), okHttpClient.dns(), okHttpClient.socketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.proxyAuthenticator(), okHttpClient.proxy(), okHttpClient.protocols(), okHttpClient.connectionSpecs(), okHttpClient.proxySelector()), this, this.eventListener);
        }
    }

    @Override // okhttp3.Call
    @NotNull
    public Response execute() {
        OkHttpClient okHttpClient = this.client;
        if (!this.v0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        enter();
        this.f85821w0 = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
        try {
            okHttpClient.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            okHttpClient.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        Exchange exchange;
        synchronized (this) {
            if (!this.I0) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (closeExchange && (exchange = this.K0) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    @NotNull
    public final OkHttpClient getClient() {
        return this.client;
    }

    @Nullable
    public final RealConnection getConnection() {
        return this.connection;
    }

    @Nullable
    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    @NotNull
    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @Nullable
    /* JADX INFO: renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    @NotNull
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    @NotNull
    public final Response getResponseWithInterceptorChain$okhttp() throws Throwable {
        ArrayList arrayList = new ArrayList();
        OkHttpClient okHttpClient = this.client;
        g.addAll(arrayList, okHttpClient.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(okHttpClient));
        arrayList.add(new BridgeInterceptor(okHttpClient.cookieJar()));
        arrayList.add(new CacheInterceptor(okHttpClient.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        boolean z10 = this.forWebSocket;
        if (!z10) {
            g.addAll(arrayList, okHttpClient.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(z10));
        boolean z11 = false;
        try {
            Response responseProceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis()).proceed(this.originalRequest);
            if (getJ0()) {
                Util.closeQuietly(responseProceed);
                throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
            }
            noMoreExchanges$okhttp(null);
            return responseProceed;
        } catch (IOException e5) {
            try {
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e5);
                Intrinsics.checkNotNull(iOExceptionNoMoreExchanges$okhttp, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionNoMoreExchanges$okhttp;
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                if (!z11) {
                    noMoreExchanges$okhttp(null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (!z11) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    @NotNull
    public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.I0) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.H0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.G0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        ExchangeFinder exchangeFinder = this.f85822x0;
        Intrinsics.checkNotNull(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.K0 = exchange;
        synchronized (this) {
            this.G0 = true;
            this.H0 = true;
        }
        if (this.J0) {
            throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
        }
        return exchange;
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: isCanceled, reason: from getter */
    public boolean getJ0() {
        return this.J0;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.v0.get();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E messageDone$okhttp(@NotNull Exchange exchange, boolean requestDone, boolean responseDone, E e5) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.areEqual(exchange, this.K0)) {
            return e5;
        }
        synchronized (this) {
            z10 = false;
            if (requestDone) {
                try {
                    if (this.G0) {
                        if (requestDone) {
                            this.G0 = false;
                        }
                        if (responseDone) {
                            this.H0 = false;
                        }
                        z12 = this.G0;
                        if (z12) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (!z12) {
                            z10 = true;
                        }
                        z11 = z10;
                        z10 = z13;
                    } else if (responseDone || !this.H0) {
                        z11 = false;
                    } else {
                        if (requestDone) {
                            this.G0 = false;
                        }
                        if (responseDone) {
                            this.H0 = false;
                        }
                        z12 = this.G0;
                        if (z12 || this.H0) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (!z12 && !this.H0 && !this.I0) {
                            z10 = true;
                        }
                        z11 = z10;
                        z10 = z13;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (responseDone) {
                }
                z11 = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z10) {
            this.K0 = null;
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                realConnection.incrementSuccessCount$okhttp();
            }
        }
        return z11 ? (E) a(e5) : e5;
    }

    @Nullable
    public final IOException noMoreExchanges$okhttp(@Nullable IOException e5) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.I0) {
                    this.I0 = false;
                    if (!this.G0 && !this.H0) {
                        z10 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? a(e5) : e5;
    }

    @NotNull
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    @Nullable
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        Intrinsics.checkNotNull(realConnection);
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        calls.remove(i10);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs$okhttp(System.nanoTime());
            if (this.f85818s0.connectionBecameIdle(realConnection)) {
                return realConnection.socket();
            }
        }
        return null;
    }

    @Override // okhttp3.Call
    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.f85822x0;
        Intrinsics.checkNotNull(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(@Nullable RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public final void timeoutEarlyExit() {
        if (!(!this.E0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.E0 = true;
        exit();
    }

    @Override // okhttp3.Call
    @NotNull
    public AsyncTimeout timeout() {
        return this.f85820u0;
    }

    @Override // okhttp3.Call
    @NotNull
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
