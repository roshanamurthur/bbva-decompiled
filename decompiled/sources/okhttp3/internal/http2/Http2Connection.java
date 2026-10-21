package okhttp3.internal.http2;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.ipsoft.amelia.sdk.internal.c.c;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 «\u00012\u00020\u0001:\b¬\u0001«\u0001\u00ad\u0001®\u0001B\u0015\b\u0000\u0012\b\u0010¨\u0001\u001a\u00030§\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015J\u001c\u0010\u0018\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015J-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010!\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u000bJ\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\"H\u0000¢\u0006\u0004\b(\u0010%J\u001f\u0010-\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010,J\u001e\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002J\u0006\u00102\u001a\u00020\rJ\u0006\u00101\u001a\u00020\rJ\u0006\u00103\u001a\u00020\rJ\u0006\u00104\u001a\u00020\rJ\u000e\u00105\u001a\u00020\r2\u0006\u0010'\u001a\u00020\"J\b\u00106\u001a\u00020\rH\u0016J)\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0004\b;\u0010<J\u001c\u0010@\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u00152\b\b\u0002\u0010?\u001a\u00020>H\u0007J\u000e\u0010C\u001a\u00020\r2\u0006\u0010B\u001a\u00020AJ\u000e\u0010E\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u000bJ\u000f\u0010H\u001a\u00020\rH\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010K\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\bI\u0010JJ%\u0010N\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\bL\u0010MJ-\u0010R\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010O\u001a\u00020\u0015H\u0000¢\u0006\u0004\bP\u0010QJ/\u0010W\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010T\u001a\u00020S2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0015H\u0000¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\bX\u0010%R\u001a\u0010^\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010d\u001a\u00020_8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR&\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010p\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\"\u0010w\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bx\u0010r\u001a\u0004\by\u0010t\"\u0004\bz\u0010vR\u0018\u0010\u0080\u0001\u001a\u00020A8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR'\u0010\u0085\u0001\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010}\u001a\u0005\b\u0082\u0001\u0010\u007f\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u008b\u0001\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u008e\u0001\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0088\u0001\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R*\u0010\u0091\u0001\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0088\u0001\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001R*\u0010\u0094\u0001\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0088\u0001\u001a\u0006\b\u0093\u0001\u0010\u008a\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001d\u0010 \u0001\u001a\u00030\u009b\u00018\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¦\u0001\u001a\u00070¡\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006¯\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "", "openStreamCount", "id", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "streamId", "removeStream$okhttp", "(I)Lokhttp3/internal/http2/Http2Stream;", "removeStream", "", "read", "", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "pushStream", "newStream", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Lokio/Buffer;", "buffer", "byteCount", "writeData", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", "statusCode", "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "writePingAndAwaitPong", "awaitPong", "flush", "shutdown", HearingDisabilitiesConstants.CLOSE_MODAL, "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "nowNs", "isHealthy", "sendDegradedPingLater$okhttp", "()V", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lokio/BufferedSource;", "source", "pushDataLater$okhttp", "(ILokio/BufferedSource;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "p0", "Z", "getClient$okhttp", "()Z", "client", "Lokhttp3/internal/http2/Http2Connection$Listener;", "q0", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "r0", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "streams", "", "s0", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "connectionName", "t0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "lastGoodStreamId", "u0", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "nextStreamId", "N0", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "okHttpSettings", "O0", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "peerSettings", "<set-?>", "P0", "J", "getReadBytesTotal", "()J", "readBytesTotal", "Q0", "getReadBytesAcknowledged", "readBytesAcknowledged", "R0", "getWriteBytesTotal", "writeBytesTotal", "S0", "getWriteBytesMaximum", "writeBytesMaximum", "Ljava/net/Socket;", "T0", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lokhttp3/internal/http2/Http2Writer;", "U0", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "V0", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "Companion", "Builder", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;

    @NotNull
    public static final Settings X0;

    @NotNull
    public final TaskQueue E0;

    @NotNull
    public final PushObserver F0;
    public long G0;
    public long H0;
    public long I0;
    public long J0;
    public long K0;
    public long L0;
    public long M0;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @NotNull
    public final Settings okHttpSettings;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @NotNull
    public Settings peerSettings;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public long readBytesTotal;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public long readBytesAcknowledged;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public long writeBytesTotal;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public long writeBytesMaximum;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @NotNull
    public final Socket socket;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @NotNull
    public final Http2Writer writer;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @NotNull
    public final ReaderRunnable readerRunnable;

    @NotNull
    public final LinkedHashSet W0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Listener listener;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f85927r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String connectionName;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public int lastGoodStreamId;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public int nextStreamId;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final TaskRunner f85931w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final TaskQueue f85932x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final TaskQueue f85933y0;

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\bG\u0010HJ.\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "Lokhttp3/internal/http2/Http2Connection$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "", "pingIntervalMillis", "Lokhttp3/internal/http2/Http2Connection;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "client", "Lokhttp3/internal/concurrent/TaskRunner;", "b", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "c", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "d", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean client;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TaskRunner taskRunner;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Listener listener;
        public String connectionName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public PushObserver pushObserver;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int pingIntervalMillis;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;

        public Builder(boolean z10, @NotNull TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i10 & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i10 & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        @NotNull
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
        public final Listener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        @NotNull
        /* JADX INFO: renamed from: getPushObserver$okhttp, reason: from getter */
        public final PushObserver getPushObserver() {
            return this.pushObserver;
        }

        @NotNull
        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        @NotNull
        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        @NotNull
        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        @NotNull
        public final Builder listener(@NotNull Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }

        @NotNull
        public final Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        @NotNull
        public final Builder pushObserver(@NotNull PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.client = z10;
        }

        public final void setConnectionName$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(@NotNull Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i10) {
            this.pingIntervalMillis = i10;
        }

        public final void setPushObserver$okhttp(@NotNull PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(@NotNull BufferedSink bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(@NotNull Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(@NotNull BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName, @NotNull BufferedSource source) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName, @NotNull BufferedSource source, @NotNull BufferedSink sink) throws IOException {
            String strD;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                strD = Util.okHttpName + ' ' + peerName;
            } else {
                strD = f.d("MockWebServer ", peerName);
            }
            setConnectionName$okhttp(strD);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "AWAIT_PING", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.X0;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "()V", "onSettings", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Listener {

        @JvmField
        @NotNull
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(@NotNull Http2Stream stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(@NotNull Http2Connection connection, @NotNull Settings settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void onStream(@NotNull Http2Stream stream) throws IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00108\u001a\u000203¢\u0006\u0004\b9\u0010:J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J \u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016J(\u0010(\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0005H\u0016J&\u0010+\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J8\u00102\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\"H\u0016R\u001a\u00108\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "invoke", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "data", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "applyAndAckSettings", "ackSettings", c.f84801f, "payload1", "payload2", "ping", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "goAway", "", "windowSizeIncrement", "windowUpdate", "streamDependency", "weight", "exclusive", "priority", "promisedStreamId", "requestHeaders", "pushPromise", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "Lokhttp3/internal/http2/Http2Reader;", "p0", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Http2Reader reader;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Http2Connection f85940q0;

        public ReaderRunnable(@NotNull Http2Connection http2Connection, Http2Reader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f85940q0 = http2Connection;
            this.reader = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int streamId, @NotNull String origin, @NotNull ByteString protocol, @NotNull String host, int port, long maxAge) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(host, "host");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void applyAndAckSettings(boolean clearPrevious, @NotNull Settings settings) {
            ?? r13;
            long initialWindowSize;
            int i10;
            Http2Stream[] http2StreamArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Http2Writer writer = this.f85940q0.getWriter();
            final Http2Connection http2Connection = this.f85940q0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (clearPrevious) {
                            r13 = settings;
                        } else {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            r13 = settings2;
                        }
                        objectRef.element = r13;
                        initialWindowSize = ((long) r13.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                        http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) objectRef.element);
                        TaskQueue taskQueue = http2Connection.E0;
                        final String str = http2Connection.getConnectionName() + " onSettings";
                        final boolean z10 = true;
                        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                Http2Connection http2Connection2 = http2Connection;
                                http2Connection2.getListener().onSettings(http2Connection2, (Settings) objectRef.element);
                                return -1L;
                            }
                        }, 0L);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) objectRef.element);
                } catch (IOException e5) {
                    Http2Connection.access$failConnection(http2Connection, e5);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean inFinished, int streamId, @NotNull BufferedSource source, int length) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            Http2Connection http2Connection = this.f85940q0;
            if (http2Connection.pushedStream$okhttp(streamId)) {
                http2Connection.pushDataLater$okhttp(streamId, source, length, inFinished);
                return;
            }
            Http2Stream stream = http2Connection.getStream(streamId);
            if (stream == null) {
                http2Connection.writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                long j10 = length;
                http2Connection.updateConnectionFlowControl$okhttp(j10);
                source.skip(j10);
                return;
            }
            stream.receiveData(source, length);
            if (inFinished) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: getReader$okhttp, reason: from getter */
        public final Http2Reader getReader() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull ByteString debugData) {
            int i10;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.f85940q0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.v0 = true;
                Unit unit = Unit.INSTANCE;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.f85940q0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<Header> headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f85940q0.pushedStream$okhttp(streamId)) {
                this.f85940q0.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
                return;
            }
            final Http2Connection http2Connection = this.f85940q0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(streamId);
                if (stream != null) {
                    Unit unit = Unit.INSTANCE;
                    stream.receiveHeaders(Util.toHeaders(headerBlock), inFinished);
                    return;
                }
                if (http2Connection.v0) {
                    return;
                }
                if (streamId <= http2Connection.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(streamId, http2Connection, false, inFinished, Util.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(streamId);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(streamId), http2Stream);
                TaskQueue taskQueueNewQueue = http2Connection.f85931w0.newQueue();
                final String str = http2Connection.getConnectionName() + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onStream";
                final boolean z10 = true;
                taskQueueNewQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        Http2Stream http2Stream2 = http2Stream;
                        Http2Connection http2Connection2 = http2Connection;
                        try {
                            http2Connection2.getListener().onStream(http2Stream2);
                            return -1L;
                        } catch (IOException e5) {
                            Platform.INSTANCE.get().log("Http2Connection.Listener failure for " + http2Connection2.getConnectionName(), 4, e5);
                            try {
                                http2Stream2.close(ErrorCode.PROTOCOL_ERROR, e5);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                TaskQueue taskQueue = this.f85940q0.f85932x0;
                final String str = this.f85940q0.getConnectionName() + " ping";
                final Http2Connection http2Connection = this.f85940q0;
                final boolean z10 = true;
                taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection.writePing(true, payload1, payload2);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.f85940q0;
            synchronized (http2Connection2) {
                try {
                    if (payload1 == 1) {
                        http2Connection2.H0++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            http2Connection2.L0++;
                            Intrinsics.checkNotNull(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        http2Connection2.J0++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f85940q0.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int streamId, @NotNull ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Http2Connection http2Connection = this.f85940q0;
            if (http2Connection.pushedStream$okhttp(streamId)) {
                http2Connection.pushResetLater$okhttp(streamId, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = http2Connection.removeStream$okhttp(streamId);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean clearPrevious, @NotNull final Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Http2Connection http2Connection = this.f85940q0;
            TaskQueue taskQueue = http2Connection.f85932x0;
            final String str = http2Connection.getConnectionName() + " applyAndAckSettings";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(clearPrevious, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                Http2Connection http2Connection = this.f85940q0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    Intrinsics.checkNotNull(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            Http2Stream stream = this.f85940q0.getStream(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(windowSizeIncrement);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() throws Throwable {
            ErrorCode errorCode;
            Http2Connection http2Connection = this.f85940q0;
            Http2Reader http2Reader = this.reader;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e5 = null;
            try {
                try {
                    http2Reader.readConnectionPreface(this);
                    while (http2Reader.nextFrame(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        http2Connection.close$okhttp(errorCode, errorCode2, null);
                    } catch (IOException e7) {
                        e5 = e7;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.close$okhttp(errorCode2, errorCode2, e5);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    http2Connection.close$okhttp(errorCode, errorCode2, e5);
                    Util.closeQuietly(http2Reader);
                    throw th;
                }
            } catch (IOException e10) {
                e5 = e10;
                errorCode = errorCode2;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                http2Connection.close$okhttp(errorCode, errorCode2, e5);
                Util.closeQuietly(http2Reader);
                throw th;
            }
            Util.closeQuietly(http2Reader);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        X0 = settings;
    }

    public Http2Connection(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.f85927r0 = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.f85931w0 = taskRunner;
        TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        this.f85932x0 = taskQueueNewQueue;
        this.f85933y0 = taskRunner.newQueue();
        this.E0 = taskRunner.newQueue();
        this.F0 = builder.getPushObserver();
        Settings settings = new Settings();
        if (builder.getClient()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        Settings settings2 = X0;
        this.peerSettings = settings2;
        this.writeBytesMaximum = settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client));
        this.W0 = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            final String strF = u.f(connectionName$okhttp, " ping");
            taskQueueNewQueue.schedule(new Task(strF) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z10;
                    synchronized (this) {
                        if (this.H0 < this.G0) {
                            z10 = true;
                        } else {
                            this.G0++;
                            z10 = false;
                        }
                    }
                    if (z10) {
                        Http2Connection.access$failConnection(this, null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    public static final void access$failConnection(Http2Connection http2Connection, IOException iOException) {
        http2Connection.getClass();
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        http2Connection.close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z10, taskRunner);
    }

    public final Http2Stream a(int i10, List<Header> list, boolean z10) throws IOException {
        int i11;
        Http2Stream http2Stream;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (this.nextStreamId > 1073741823) {
                            shutdown(ErrorCode.REFUSED_STREAM);
                        }
                        if (this.v0) {
                            throw new ConnectionShutdownException();
                        }
                        i11 = this.nextStreamId;
                        this.nextStreamId = i11 + 2;
                        http2Stream = new Http2Stream(i11, this, z12, false, null);
                        z11 = !z10 || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                        if (http2Stream.isOpen()) {
                            this.f85927r0.put(Integer.valueOf(i11), http2Stream);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i10 == 0) {
                    this.writer.headers(z12, i11, list);
                } else {
                    if (!(true ^ this.client)) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                    }
                    this.writer.pushPromise(i10, i11, list);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z11) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.L0 < this.K0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@NotNull ErrorCode connectionCode, @NotNull ErrorCode streamCode, @Nullable IOException cause) {
        int i10;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.f85927r0.isEmpty()) {
                    array = this.f85927r0.values().toArray(new Http2Stream[0]);
                    this.f85927r0.clear();
                } else {
                    array = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.f85932x0.shutdown();
        this.f85933y0.shutdown();
        this.E0.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    @NotNull
    /* JADX INFO: renamed from: getConnectionName$okhttp, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* JADX INFO: renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    @NotNull
    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    @NotNull
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @NotNull
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @NotNull
    /* JADX INFO: renamed from: getSocket$okhttp, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @Nullable
    public final synchronized Http2Stream getStream(int id) {
        return (Http2Stream) this.f85927r0.get(Integer.valueOf(id));
    }

    @NotNull
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.f85927r0;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long nowNs) {
        if (this.v0) {
            return false;
        }
        return this.J0 >= this.I0 || nowNs < this.M0;
    }

    @NotNull
    public final Http2Stream newStream(@NotNull List<Header> requestHeaders, boolean out) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return a(0, requestHeaders, out);
    }

    public final synchronized int openStreamCount() {
        return this.f85927r0.size();
    }

    public final void pushDataLater$okhttp(final int streamId, @NotNull BufferedSource source, final int byteCount, final boolean inFinished) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        final Buffer buffer = new Buffer();
        long j10 = byteCount;
        source.require(j10);
        source.read(buffer, j10);
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onData";
        final boolean z10 = true;
        this.f85933y0.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.F0.onData(streamId, buffer, byteCount, inFinished);
                    if (zOnData) {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !inFinished) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.W0.remove(Integer.valueOf(streamId));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int streamId, @NotNull final List<Header> requestHeaders, final boolean inFinished) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onHeaders";
        final boolean z10 = true;
        this.f85933y0.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.F0.onHeaders(streamId, requestHeaders, inFinished);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !inFinished) {
                    return -1L;
                }
                synchronized (this) {
                    this.W0.remove(Integer.valueOf(streamId));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int streamId, @NotNull final List<Header> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.W0.contains(Integer.valueOf(streamId))) {
                writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.W0.add(Integer.valueOf(streamId));
            TaskQueue taskQueue = this.f85933y0;
            final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onRequest";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    if (!this.F0.onRequest(streamId, requestHeaders)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                        synchronized (this) {
                            this.W0.remove(Integer.valueOf(streamId));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int streamId, @NotNull final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onReset";
        final boolean z10 = true;
        this.f85933y0.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.F0.onReset(streamId, errorCode);
                synchronized (this) {
                    this.W0.remove(Integer.valueOf(streamId));
                    Unit unit = Unit.INSTANCE;
                }
                return -1L;
            }
        }, 0L);
    }

    @NotNull
    public final Http2Stream pushStream(int associatedStreamId, @NotNull List<Header> requestHeaders, boolean out) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (!this.client) {
            return a(associatedStreamId, requestHeaders, out);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    @Nullable
    public final synchronized Http2Stream removeStream$okhttp(int streamId) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f85927r0.remove(Integer.valueOf(streamId));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2Stream;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j10 = this.J0;
            long j11 = this.I0;
            if (j10 < j11) {
                return;
            }
            this.I0 = j11 + 1;
            this.M0 = System.nanoTime() + ((long) 1000000000);
            Unit unit = Unit.INSTANCE;
            TaskQueue taskQueue = this.f85932x0;
            final String strF = d.f(new StringBuilder(), this.connectionName, " ping");
            final boolean z10 = true;
            taskQueue.schedule(new Task(strF, z10) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void setNextStreamId$okhttp(int i10) {
        this.nextStreamId = i10;
    }

    public final void setPeerSettings(@NotNull Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(@NotNull Settings settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.v0) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                Unit unit = Unit.INSTANCE;
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(@NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.v0) {
                    return;
                }
                this.v0 = true;
                int i10 = this.lastGoodStreamId;
                intRef.element = i10;
                Unit unit = Unit.INSTANCE;
                this.writer.goAway(i10, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    @JvmOverloads
    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long read) {
        long j10 = this.readBytesTotal + read;
        this.readBytesTotal = j10;
        long j11 = j10 - this.readBytesAcknowledged;
        if (j11 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j11);
            this.readBytesAcknowledged += j11;
        }
    }

    public final void writeData(int streamId, boolean outFinished, @Nullable Buffer buffer, long byteCount) throws IOException {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (byteCount == 0) {
            this.writer.data(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.writeBytesTotal;
                            j11 = this.writeBytesMaximum;
                            if (j10 >= j11) {
                                if (!this.f85927r0.containsKey(Integer.valueOf(streamId))) {
                                    throw new IOException("stream closed");
                                }
                                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                iMin = Math.min((int) Math.min(byteCount, j11 - j10), this.writer.getF86022s0());
                j12 = iMin;
                this.writeBytesTotal += j12;
                Unit unit = Unit.INSTANCE;
            }
            byteCount -= j12;
            this.writer.data(outFinished && byteCount == 0, streamId, buffer, iMin);
        }
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, @NotNull List<Header> alternating) throws IOException {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.writer.headers(outFinished, streamId, alternating);
    }

    public final void writePing(boolean reply, int payload1, int payload2) {
        try {
            this.writer.ping(reply, payload1, payload2);
        } catch (IOException e5) {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            close$okhttp(errorCode, errorCode, e5);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int streamId, @NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int streamId, @NotNull final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] writeSynReset";
        final boolean z10 = true;
        this.f85932x0.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.writeSynReset$okhttp(streamId, errorCode);
                    return -1L;
                } catch (IOException e5) {
                    Http2Connection.access$failConnection(http2Connection, e5);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] windowUpdate";
        final boolean z10 = true;
        this.f85932x0.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.getWriter().windowUpdate(streamId, unacknowledgedBytesRead);
                    return -1L;
                } catch (IOException e5) {
                    Http2Connection.access$failConnection(http2Connection, e5);
                    return -1L;
                }
            }
        }, 0L);
    }

    @JvmOverloads
    public final void start(boolean z10) throws IOException {
        start$default(this, z10, null, 2, null);
    }

    @JvmOverloads
    public final void start(boolean sendConnectionPreface, @NotNull TaskRunner taskRunner) throws IOException {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (sendConnectionPreface) {
            Http2Writer http2Writer = this.writer;
            http2Writer.connectionPreface();
            Settings settings = this.okHttpSettings;
            http2Writer.settings(settings);
            int initialWindowSize = settings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                http2Writer.windowUpdate(0, initialWindowSize - 65535);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.K0++;
        }
        writePing(false, 3, 1330343787);
    }
}
