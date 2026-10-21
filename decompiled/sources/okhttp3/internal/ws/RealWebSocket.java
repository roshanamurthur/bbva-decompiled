package okhttp3.internal.ws;

import androidx.core.view.PointerIconCompat;
import bk.d;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.l;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0005NMOPQBA\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020<\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010G\u001a\u00020\u0005\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\u0006\u0010J\u001a\u00020\u0005¢\u0006\u0004\bK\u0010LJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0016J\u0018\u0010-\u001a\u00020\u00072\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0013H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\u000e\u0010/\u001a\u00020\u00192\u0006\u0010(\u001a\u00020&J\u001a\u00100\u001a\u00020\u00192\u0006\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0013H\u0016J \u00100\u001a\u00020\u00192\u0006\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u00101\u001a\u00020\u0005J\u000f\u00104\u001a\u00020\u0019H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u0007H\u0000¢\u0006\u0004\b5\u00106J\u001c\u0010;\u001a\u00020\u00072\n\u0010:\u001a\u000608j\u0002`92\b\u0010\r\u001a\u0004\u0018\u00010\fR\u001a\u0010A\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006R"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/Request;", "request", "", "queueSize", "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "Lokhttp3/OkHttpClient;", "client", "connect", "Lokhttp3/Response;", DigipassManagerConstants.KEY_RESPONSE, "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "loopReader", "", "processNextFrame", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "tearDown", "", "sentPingCount", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "Lokio/ByteString;", "bytes", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "onReadPing", "onReadPong", "code", "reason", "onReadClose", "send", "pong", HearingDisabilitiesConstants.CLOSE_MODAL, "cancelAfterCloseMillis", "writeOneFrame$okhttp", "()Z", "writeOneFrame", "writePingFrame$okhttp", "()V", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "Lokhttp3/WebSocketListener;", "b", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "originalRequest", "Ljava/util/Random;", "random", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", IAppSDKPlus.EXTRA_KEY_EXTENSIONS, "minimumDeflateSize", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", "Close", "Message", "Streams", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Request f86098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WebSocketListener listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Random f86100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f86101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public WebSocketExtensions f86102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f86103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f86104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public RealCall f86105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f86106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public WebSocketReader f86107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public WebSocketWriter f86108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TaskQueue f86109l;

    @Nullable
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Streams f86110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<ByteString> f86111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Object> f86112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f86113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f86114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f86115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f86116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f86117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f86118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f86119w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f86120x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f86121y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final List<Protocol> f86097z = d.listOf(Protocol.HTTP_1_1);

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "Lokio/ByteString;", "b", "Lokio/ByteString;", "getReason", "()Lokio/ByteString;", "reason", "", "c", "J", "getCancelAfterCloseMillis", "()J", "cancelAfterCloseMillis", "<init>", "(ILokio/ByteString;J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Close {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final ByteString reason;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long cancelAfterCloseMillis;

        public Close(int i10, @Nullable ByteString byteString, long j10) {
            this.code = i10;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j10;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final ByteString getReason() {
            return this.reason;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFormatOpcode", "()I", "formatOpcode", "Lokio/ByteString;", "b", "Lokio/ByteString;", "getData", "()Lokio/ByteString;", "data", "<init>", "(ILokio/ByteString;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Message {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int formatOpcode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ByteString data;

        public Message(int i10, @NotNull ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.formatOpcode = i10;
            this.data = data;
        }

        @NotNull
        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "p0", "Z", "getClient", "()Z", "client", "Lokio/BufferedSource;", "q0", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "r0", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "sink", "<init>", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static abstract class Streams implements Closeable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final boolean client;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final BufferedSource source;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final BufferedSink sink;

        public Streams(boolean z10, @NotNull BufferedSource source, @NotNull BufferedSink sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.client = z10;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final BufferedSink getSink() {
            return this.sink;
        }

        @NotNull
        public final BufferedSource getSource() {
            return this.source;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    public final class a extends Task {
        public a() {
            super(RealWebSocket.this.m + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long runOnce() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                return realWebSocket.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e5) {
                realWebSocket.failWebSocket(e5, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request originalRequest, @NotNull WebSocketListener listener, @NotNull Random random, long j10, @Nullable WebSocketExtensions webSocketExtensions, long j11) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f86098a = originalRequest;
        this.listener = listener;
        this.f86100c = random;
        this.f86101d = j10;
        this.f86102e = webSocketExtensions;
        this.f86103f = j11;
        this.f86109l = taskRunner.newQueue();
        this.f86111o = new ArrayDeque<>();
        this.f86112p = new ArrayDeque<>();
        this.f86115s = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.f86104g = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
    }

    public static final boolean access$isValid(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        realWebSocket.getClass();
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new IntRange(8, 15).contains(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    public final void a() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            a aVar = this.f86106i;
            if (aVar != null) {
                TaskQueue.schedule$default(this.f86109l, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void awaitTermination(long timeout, @NotNull TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f86109l.idleLatch().await(timeout, timeUnit);
    }

    public final synchronized boolean b(int i10, ByteString byteString) {
        if (!this.f86117u && !this.f86114r) {
            if (this.f86113q + ((long) byteString.size()) > SvgConstantsKt.SPECIFIED_DISPLAY) {
                close(1001, null);
                return false;
            }
            this.f86113q += (long) byteString.size();
            this.f86112p.add(new Message(i10, byteString));
            a();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        RealCall realCall = this.f86105h;
        Intrinsics.checkNotNull(realCall);
        realCall.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@NotNull Response response, @Nullable Exchange exchange) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!l.equals("Upgrade", strHeader$default, true)) {
            throw new ProtocolException(androidx.camera.core.impl.utils.a.a("Expected 'Connection' header value 'Upgrade' but was '", strHeader$default, '\''));
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!l.equals("websocket", strHeader$default2, true)) {
            throw new ProtocolException(androidx.camera.core.impl.utils.a.a("Expected 'Upgrade' header value 'websocket' but was '", strHeader$default2, '\''));
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        String strBase64 = ByteString.INSTANCE.encodeUtf8(this.f86104g + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (Intrinsics.areEqual(strBase64, strHeader$default3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strHeader$default3 + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int code, @Nullable String reason) {
        return close(code, reason, 60000L);
    }

    public final void connect(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Request request = this.f86098a;
        if (request.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(f86097z).build();
        final Request requestBuild = request.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f86104g).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.f86105h = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(@NotNull Call call, @NotNull IOException e5) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e5, "e");
                RealWebSocket.this.failWebSocket(e5, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                Exchange exchange = response.getExchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    Intrinsics.checkNotNull(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.f86102e = webSocketExtensions;
                    if (!RealWebSocket.access$isValid(RealWebSocket.this, webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.f86112p.clear();
                            realWebSocket.close(PointerIconCompat.TYPE_ALIAS, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e5) {
                        RealWebSocket.this.failWebSocket(e5, null);
                    }
                } catch (IOException e7) {
                    RealWebSocket.this.failWebSocket(e7, response);
                    Util.closeQuietly(response);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }
        });
    }

    public final void failWebSocket(@NotNull Exception e5, @Nullable Response response) {
        Intrinsics.checkNotNullParameter(e5, "e");
        synchronized (this) {
            if (this.f86117u) {
                return;
            }
            this.f86117u = true;
            Streams streams = this.f86110n;
            this.f86110n = null;
            WebSocketReader webSocketReader = this.f86107j;
            this.f86107j = null;
            WebSocketWriter webSocketWriter = this.f86108k;
            this.f86108k = null;
            this.f86109l.shutdown();
            Unit unit = Unit.INSTANCE;
            try {
                this.listener.onFailure(this, e5, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(@NotNull String name, @NotNull Streams streams) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.f86102e;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            try {
                this.m = name;
                this.f86110n = streams;
                this.f86108k = new WebSocketWriter(streams.getClient(), streams.getSink(), this.f86100c, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.f86103f);
                this.f86106i = new a();
                long j10 = this.f86101d;
                if (j10 != 0) {
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    final String str = name + " ping";
                    this.f86109l.schedule(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            this.writePingFrame$okhttp();
                            return nanos;
                        }
                    }, nanos);
                }
                if (!this.f86112p.isEmpty()) {
                    a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f86107j = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.f86115s == -1) {
            WebSocketReader webSocketReader = this.f86107j;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, @NotNull String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (code == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            try {
                if (this.f86115s != -1) {
                    throw new IllegalStateException("already closed".toString());
                }
                this.f86115s = code;
                this.f86116t = reason;
                streams = null;
                if (this.f86114r && this.f86112p.isEmpty()) {
                    Streams streams2 = this.f86110n;
                    this.f86110n = null;
                    webSocketReader = this.f86107j;
                    this.f86107j = null;
                    webSocketWriter = this.f86108k;
                    this.f86108k = null;
                    this.f86109l.shutdown();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.listener.onClosing(this, code, reason);
            if (streams != null) {
                this.listener.onClosed(this, code, reason);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@NotNull ByteString payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f86117u && (!this.f86114r || !this.f86112p.isEmpty())) {
                this.f86111o.add(payload);
                a();
                this.f86119w++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f86120x++;
        this.f86121y = false;
    }

    public final synchronized boolean pong(@NotNull ByteString payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f86117u && (!this.f86114r || !this.f86112p.isEmpty())) {
                this.f86111o.add(payload);
                a();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.f86107j;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.f86115s == -1;
        } catch (Exception e5) {
            failWebSocket(e5, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.f86113q;
    }

    public final synchronized int receivedPingCount() {
        return this.f86119w;
    }

    public final synchronized int receivedPongCount() {
        return this.f86120x;
    }

    @Override // okhttp3.WebSocket
    @NotNull
    /* JADX INFO: renamed from: request, reason: from getter */
    public Request getF86098a() {
        return this.f86098a;
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return b(1, ByteString.INSTANCE.encodeUtf8(text));
    }

    public final synchronized int sentPingCount() {
        return this.f86118v;
    }

    public final void tearDown() throws InterruptedException {
        TaskQueue taskQueue = this.f86109l;
        taskQueue.shutdown();
        taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i10;
        Streams streams;
        synchronized (this) {
            try {
                if (this.f86117u) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.f86108k;
                ByteString byteStringPoll = this.f86111o.poll();
                final boolean z10 = true;
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f86112p.poll();
                    if (objPoll instanceof Close) {
                        i10 = this.f86115s;
                        str = this.f86116t;
                        if (i10 != -1) {
                            streams = this.f86110n;
                            this.f86110n = null;
                            webSocketReader = this.f86107j;
                            this.f86107j = null;
                            webSocketWriter = this.f86108k;
                            this.f86108k = null;
                            this.f86109l.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                            TaskQueue taskQueue = this.f86109l;
                            final String str2 = this.m + " cancel";
                            taskQueue.schedule(new Task(str2, z10) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.cancel();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i10 = -1;
                        streams = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i10 = -1;
                    streams = null;
                }
                Unit unit = Unit.INSTANCE;
                try {
                    if (byteStringPoll != null) {
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writePong(byteStringPoll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                        synchronized (this) {
                            this.f86113q -= (long) message.getData().size();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writeClose(close.getCode(), close.getReason());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.listener;
                            Intrinsics.checkNotNull(str);
                            webSocketListener.onClosed(this, i10, str);
                        }
                    }
                    if (streams != null) {
                        Util.closeQuietly(streams);
                    }
                    if (webSocketReader != null) {
                        Util.closeQuietly(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.closeQuietly(webSocketWriter);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (streams != null) {
                        Util.closeQuietly(streams);
                    }
                    if (webSocketReader != null) {
                        Util.closeQuietly(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.closeQuietly(webSocketWriter);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.f86117u) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.f86108k;
                if (webSocketWriter == null) {
                    return;
                }
                int i10 = this.f86121y ? this.f86118v : -1;
                this.f86118v++;
                this.f86121y = true;
                Unit unit = Unit.INSTANCE;
                if (i10 != -1) {
                    StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                    sb2.append(this.f86101d);
                    sb2.append("ms (after ");
                    failWebSocket(new SocketTimeoutException(androidx.appcompat.widget.a.c(sb2, i10 - 1, " successful ping/pongs)")), null);
                    return;
                }
                try {
                    webSocketWriter.writePing(ByteString.EMPTY);
                } catch (IOException e5) {
                    failWebSocket(e5, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean close(int code, @Nullable String reason, long cancelAfterCloseMillis) {
        ByteString byteStringEncodeUtf8;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(code);
            if (reason != null) {
                byteStringEncodeUtf8 = ByteString.INSTANCE.encodeUtf8(reason);
                if (byteStringEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(reason).toString());
                }
            } else {
                byteStringEncodeUtf8 = null;
            }
            if (!this.f86117u && !this.f86114r) {
                this.f86114r = true;
                this.f86112p.add(new Close(code, byteStringEncodeUtf8, cancelAfterCloseMillis));
                a();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return b(2, bytes);
    }
}
