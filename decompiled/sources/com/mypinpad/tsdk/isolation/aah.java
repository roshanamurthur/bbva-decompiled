package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\b²\u0001³\u0001´\u0001µ\u0001B\u0015\b\u0000\u0012\b\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J)\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013J&\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J\u001c\u0010\u001c\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u000fJ/\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0015H\u0000¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020\u0015H\u0000¢\u0006\u0004\b&\u0010'J%\u0010+\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010.J$\u00100\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u0015J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00109\u001a\u00020\u0002H\u0000¢\u0006\u0004\b7\u00108J\u000e\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:J\u000e\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0005J\u001c\u0010B\u001a\u00020\u00022\b\b\u0002\u0010?\u001a\u00020\u00152\b\b\u0002\u0010A\u001a\u00020@H\u0007J\u0017\u0010F\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0013H\u0000¢\u0006\u0004\bD\u0010EJ(\u0010J\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u00152\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010!\u001a\u00020\u0013J-\u0010N\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u00152\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\bL\u0010MJ\u0006\u0010O\u001a\u00020\u0002J\u001e\u0010O\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000fJ\u0006\u0010S\u001a\u00020\u0002J\u001f\u0010U\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u0005H\u0000¢\u0006\u0004\bT\u0010.J\u001f\u0010W\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\bV\u0010.J\u001f\u0010[\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\u0013H\u0000¢\u0006\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u001a\u0010_\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010d\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000f0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010]R\u0016\u0010l\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010]R\u0016\u0010m\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010]R\u0016\u0010n\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010]R\u0016\u0010o\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010]R\u0016\u0010p\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010`R\"\u0010q\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010x\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\"\u0010|\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010r\u001a\u0004\b}\u0010t\"\u0004\b~\u0010vR\u001a\u0010\u007f\u001a\u00020:8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0083\u0001\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0080\u0001\u001a\u0006\b\u0084\u0001\u0010\u0082\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010\u008e\u0001\u001a\u00020\u00132\u0007\u0010\u008d\u0001\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010]\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R)\u0010\u0091\u0001\u001a\u00020\u00132\u0007\u0010\u008d\u0001\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010]\u001a\u0006\b\u0092\u0001\u0010\u0090\u0001R!\u0010\u0094\u0001\u001a\u00070\u0093\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008c\u0001R \u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R,\u0010\u009f\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u009e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010£\u0001R)\u0010¤\u0001\u001a\u00020\u00132\u0007\u0010\u008d\u0001\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¤\u0001\u0010]\u001a\u0006\b¥\u0001\u0010\u0090\u0001R)\u0010¦\u0001\u001a\u00020\u00132\u0007\u0010\u008d\u0001\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¦\u0001\u0010]\u001a\u0006\b§\u0001\u0010\u0090\u0001R\u001d\u0010©\u0001\u001a\u00030¨\u00018\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u008c\u0001¨\u0006¶\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "awaitPong", "Lokhttp3/internal/http2/ErrorCode;", "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "e", "failConnection", "flush", "", "id", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "", "nowNs", "", "isHealthy", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "out", "newStream", "openStreamCount", "streamId", "Lokio/BufferedSource;", "source", "byteCount", "inFinished", "pushDataLater$okhttp", "(ILokio/BufferedSource;IZ)V", "pushDataLater", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "errorCode", "pushResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "pushResetLater", "pushStream", "pushedStream$okhttp", "(I)Z", "pushedStream", "removeStream$okhttp", "(I)Lokhttp3/internal/http2/Http2Stream;", "removeStream", "sendDegradedPingLater$okhttp", "()V", "sendDegradedPingLater", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "statusCode", "shutdown", "sendConnectionPreface", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", EventDataKeys.Lifecycle.LIFECYCLE_START, "read", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "outFinished", "Lokio/Buffer;", "buffer", "writeData", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "writePing", "reply", "payload1", "payload2", "writePingAndAwaitPong", "writeSynReset$okhttp", "writeSynReset", "writeSynResetLater$okhttp", "writeSynResetLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "awaitPingsSent", "J", "awaitPongsReceived", "client", "Z", "getClient$okhttp", "()Z", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "", "currentPushRequests", "Ljava/util/Set;", "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "<set-?>", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 6, 0})
public final class aah implements Closeable {

    @NotNull
    public static final aam W0;
    public static int X0 = 0;
    public static int Y0 = 1;

    @NotNull
    public static final setY setX = new setY(null);

    @NotNull
    public final ze E0;

    @NotNull
    public final aan F0;
    public long G0;
    public long H0;
    public long I0;
    public long J0;
    public long K0;
    public long L0;

    @NotNull
    public final aam M0;

    @NotNull
    public aam N0;
    public long O0;
    public long P0;
    public long Q0;
    public long R0;

    @NotNull
    public final Socket S0;

    @NotNull
    public final aag T0;

    @NotNull
    public final setDividerPadding U0;

    @NotNull
    public final LinkedHashSet V0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f52051p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final setCompoundDrawableTintBlendMode f52052q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f52053r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final String f52054s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f52055t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f52056u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final zd f52057w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final ze f52058x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final ze f52059y0;

    public static final class getNavBarTitleString extends zb {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52060g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public getNavBarTitleString(String str, aah aahVar) {
            super(str, true);
            this.f52060g = aahVar;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            aah.setX(new Object[]{((getNavBarTitleString) objArr[0]).f52060g, Boolean.FALSE, 2, 0}, 764065165, -764065159, 2);
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setX(new Object[]{this}, 925967230, -925967230, System.identityHashCode(this))).longValue();
        }
    }

    public static final class setAlwaysDrawnWithCacheEnabled extends zb {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f52061j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f52062k = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f52064h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f52065i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setAlwaysDrawnWithCacheEnabled(String str, aah aahVar, int i10, long j10) {
            super(str, true);
            this.f52063g = aahVar;
            this.f52064h = i10;
            this.f52065i = j10;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = (setAlwaysDrawnWithCacheEnabled) objArr[0];
            int i13 = f52062k;
            int i14 = (i13 & (-116)) | ((~i13) & 115);
            int i15 = (i13 & 115) << 1;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f52061j = i16 % 128;
            int i17 = i16 % 2;
            try {
                aah aahVar = setalwaysdrawnwithcacheenabled.f52063g;
                ((aag) aah.setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar))).setOnFocusChangeListener(setalwaysdrawnwithcacheenabled.f52064h, setalwaysdrawnwithcacheenabled.f52065i);
                int i18 = f52062k;
                int i19 = (i18 & 93) + (i18 | 93);
                f52061j = i19 % 128;
                int i20 = i19 % 2;
            } catch (IOException e5) {
                aah.setX(new Object[]{setalwaysdrawnwithcacheenabled.f52063g, e5}, 788207988, -788207941, (int) System.currentTimeMillis());
            }
            int i21 = f52061j;
            int i22 = (i21 & 43) + (i21 | 43);
            f52062k = i22 % 128;
            int i23 = i22 % 2;
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, -1145857146, 1145857146, System.identityHashCode(this))).longValue();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/aah$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/aah;", "p0", "Lcom/mypinpad/tsdk/i/aam;", "p1", "", "setX", "(Lcom/mypinpad/tsdk/i/aah;Lcom/mypinpad/tsdk/i/aam;)V", "Lcom/mypinpad/tsdk/i/aak;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/aak;)V", "<init>", "()V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class setCompoundDrawableTintBlendMode {

        @JvmField
        @NotNull
        public static final setCompoundDrawableTintBlendMode setDividerPadding = new setY();

        public static final class setY extends setCompoundDrawableTintBlendMode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f52066a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f52067b = 1;

            public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
                aak aakVar = (aak) objArr[1];
                int i13 = f52066a;
                int i14 = ((i13 | 85) << 1) - (i13 ^ 85);
                f52067b = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.checkNotNullParameter(aakVar, "");
                aak.setOnFocusChangeListener(new Object[]{aakVar, aac.REFUSED_STREAM, null}, 1944285140, -1944285130, System.identityHashCode(aakVar));
                int i16 = f52067b;
                int i17 = i16 & 15;
                int i18 = -(-(i16 | 15));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f52066a = i19 % 128;
                if (i19 % 2 == 0) {
                    return null;
                }
                throw null;
            }

            @Override // com.mypinpad.tsdk.i.aah.setCompoundDrawableTintBlendMode
            public final void setDividerPadding(@NotNull aak aakVar) throws IOException {
                setY(new Object[]{this, aakVar}, 282399028, -282399028, System.identityHashCode(this));
            }
        }

        static {
            int i10 = (1 & 9) + (1 | 9);
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }

        public abstract void setDividerPadding(@NotNull aak p4) throws IOException;

        public void setX(@NotNull aah p4, @NotNull aam p10) {
            Intrinsics.checkNotNullParameter(p4, "");
            Intrinsics.checkNotNullParameter(p10, "");
        }
    }

    public final class setDividerPadding implements aai.setDividerPadding, Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f52068r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f52069s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final aai f52070p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ aah f52071q0;

        public static final class setCompoundDrawableTintBlendMode extends zb {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ aah f52072g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ aak f52073h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public setCompoundDrawableTintBlendMode(String str, aah aahVar, aak aakVar) {
                super(str, true);
                this.f52072g = aahVar;
                this.f52073h = aakVar;
            }

            public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                try {
                    aah aahVar = setcompounddrawabletintblendmode.f52072g;
                    ((setCompoundDrawableTintBlendMode) aah.setX(new Object[]{aahVar}, 219087885, -219087855, System.identityHashCode(aahVar))).setDividerPadding(setcompounddrawabletintblendmode.f52073h);
                } catch (IOException e5) {
                    aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                    aah aahVar2 = setcompounddrawabletintblendmode.f52072g;
                    aaw.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus("Http2Connection.Listener failure for ", (String) aah.setX(new Object[]{aahVar2}, -715938544, 715938587, System.identityHashCode(aahVar2))), 4, e5}, 1271727973, -1271727970, 4);
                    try {
                        aak aakVar = setcompounddrawabletintblendmode.f52073h;
                        aak.setOnFocusChangeListener(new Object[]{aakVar, aac.PROTOCOL_ERROR, e5}, 1944285140, -1944285130, System.identityHashCode(aakVar));
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            }

            @Override // com.mypinpad.tsdk.isolation.zb
            public final long setY() {
                return ((Long) setX(new Object[]{this}, 1889314361, -1889314361, System.identityHashCode(this))).longValue();
            }
        }

        public setDividerPadding(@NotNull aah aahVar, aai aaiVar) {
            Intrinsics.checkNotNullParameter(aahVar, "");
            Intrinsics.checkNotNullParameter(aaiVar, "");
            this.f52071q0 = aahVar;
            this.f52070p0 = aaiVar;
        }

        public static /* synthetic */ void a(Object[] objArr) {
            Object[] array;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            aac aacVar = (aac) objArr[2];
            abw abwVar = (abw) objArr[3];
            Intrinsics.checkNotNullParameter(aacVar, "");
            Intrinsics.checkNotNullParameter(abwVar, "");
            ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
            aah aahVar = setdividerpadding.f52071q0;
            synchronized (aahVar) {
                array = ((Map) aah.setX(new Object[]{aahVar}, -643248191, 643248193, System.identityHashCode(aahVar))).values().toArray(new aak[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                aah.setX(new Object[]{aahVar}, -1795715648, 1795715661, (int) System.currentTimeMillis());
                Unit unit = Unit.INSTANCE;
            }
            aak[] aakVarArr = (aak[]) array;
            int length = aakVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                aak aakVar = aakVarArr[i10];
                int i11 = i10 & 1;
                i10 = ((i10 ^ 1) | i11) + i11;
                if (((Integer) aak.setOnFocusChangeListener(new Object[]{aakVar}, 2012833449, -2012833441, System.identityHashCode(aakVar))).intValue() > iIntValue && ((Boolean) aak.setOnFocusChangeListener(new Object[]{aakVar}, 348660389, -348660362, System.identityHashCode(aakVar))).booleanValue()) {
                    aakVar.setDividerPadding(aac.REFUSED_STREAM);
                    setdividerpadding.f52071q0.setDividerPadding(((Integer) aak.setOnFocusChangeListener(new Object[]{aakVar}, 2012833449, -2012833441, System.identityHashCode(aakVar))).intValue());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(Object[] objArr) {
            T t10;
            long jIntValue;
            aak[] aakVarArr;
            aak[] aakVarArr2;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            aam aamVar = (aam) objArr[2];
            Intrinsics.checkNotNullParameter(aamVar, "");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            aah aahVar = setdividerpadding.f52071q0;
            aag aagVar = (aag) aah.setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar));
            aah aahVar2 = setdividerpadding.f52071q0;
            synchronized (aagVar) {
                synchronized (aahVar2) {
                    try {
                        aam aamVar2 = (aam) aah.setX(new Object[]{aahVar2}, -2003530648, 2003530669, System.identityHashCode(aahVar2));
                        if (zBooleanValue) {
                            t10 = aamVar;
                        } else {
                            aam aamVar3 = new aam();
                            aam.setOnFocusChangeListener(new Object[]{aamVar3, aamVar2}, 1941022715, -1941022715, System.identityHashCode(aamVar3));
                            aam.setOnFocusChangeListener(new Object[]{aamVar3, aamVar}, 1941022715, -1941022715, System.identityHashCode(aamVar3));
                            t10 = aamVar3;
                        }
                        objectRef.element = t10;
                        jIntValue = ((long) ((Integer) aam.setOnFocusChangeListener(new Object[]{t10}, -1082853585, 1082853592, System.identityHashCode(t10))).intValue()) - ((long) ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar2}, -1082853585, 1082853592, System.identityHashCode(aamVar2))).intValue());
                        if (jIntValue == 0 || ((Map) aah.setX(new Object[]{aahVar2}, -643248191, 643248193, System.identityHashCode(aahVar2))).isEmpty()) {
                            aakVarArr = null;
                        } else {
                            Object[] array = ((Map) aah.setX(new Object[]{aahVar2}, -643248191, 643248193, System.identityHashCode(aahVar2))).values().toArray(new aak[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            aakVarArr = (aak[]) array;
                        }
                        aakVarArr2 = aakVarArr;
                        aah.setX(new Object[]{aahVar2, (aam) objectRef.element}, 2071261074, -2071261025, System.identityHashCode(aahVar2));
                        ze zeVar = (ze) aah.setX(new Object[]{aahVar2}, -233660903, 233660944, (int) System.currentTimeMillis());
                        ze.setY(new Object[]{zeVar, new setY(Intrinsics.stringPlus((String) aah.setX(new Object[]{aahVar2}, -715938544, 715938587, System.identityHashCode(aahVar2)), " onSettings"), aahVar2, objectRef), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    ((aag) aah.setX(new Object[]{aahVar2}, -1210245302, 1210245319, System.identityHashCode(aahVar2))).setX((aam) objectRef.element);
                } catch (IOException e5) {
                    aah.setX(new Object[]{aahVar2, e5}, 788207988, -788207941, (int) System.currentTimeMillis());
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (aakVarArr2 != null) {
                int length = aakVarArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    aak aakVar = aakVarArr2[i10];
                    int i11 = i10 & (-104);
                    int i12 = (i10 | (-104)) & (~i11);
                    int i13 = -(-(i11 << 1));
                    int i14 = (i12 & i13) + (i12 | i13);
                    int i15 = (i14 & 106) + (i14 | 106);
                    i10 = (i15 << 1) + (i15 ^ (-1));
                    synchronized (aakVar) {
                        aak.setOnFocusChangeListener(new Object[]{aakVar, Long.valueOf(jIntValue)}, -1720803552, 1720803567, System.identityHashCode(aakVar));
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        public static /* synthetic */ void c(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int iIntValue = ((Number) objArr[2]).intValue();
            List list = (List) objArr[3];
            Intrinsics.checkNotNullParameter(list, "");
            aah aahVar = setdividerpadding.f52071q0;
            if (((Boolean) aah.setX(new Object[]{Integer.valueOf(iIntValue)}, 2139219617, -2139219571, iIntValue)).booleanValue()) {
                aah.setX(new Object[]{setdividerpadding.f52071q0, Integer.valueOf(iIntValue), list, Boolean.valueOf(zBooleanValue)}, 821106256, -821106221, iIntValue);
                return;
            }
            aah aahVar2 = setdividerpadding.f52071q0;
            synchronized (aahVar2) {
                aak onFocusChangeListener = aahVar2.setOnFocusChangeListener(iIntValue);
                if (onFocusChangeListener != null) {
                    Unit unit = Unit.INSTANCE;
                    aak.setOnFocusChangeListener(new Object[]{onFocusChangeListener, yt.setY((List<aab>) list), Boolean.valueOf(zBooleanValue)}, -830450716, 830450741, System.identityHashCode(onFocusChangeListener));
                    return;
                }
                if (((Boolean) aah.setX(new Object[]{aahVar2}, 711436613, -711436606, (int) System.currentTimeMillis())).booleanValue()) {
                    return;
                }
                if (iIntValue <= ((Integer) aah.setX(new Object[]{aahVar2}, 2027801255, -2027801254, System.identityHashCode(aahVar2))).intValue()) {
                    return;
                }
                if (iIntValue % 2 == ((Integer) aah.setX(new Object[]{aahVar2}, 617040195, -617040190, System.identityHashCode(aahVar2))).intValue() % 2) {
                    return;
                }
                aak aakVar = new aak(iIntValue, aahVar2, false, zBooleanValue, yt.setY((List<aab>) list));
                aah.setX(new Object[]{aahVar2, Integer.valueOf(iIntValue)}, 153833985, -153833981, iIntValue);
                ((Map) aah.setX(new Object[]{aahVar2}, -643248191, 643248193, System.identityHashCode(aahVar2))).put(Integer.valueOf(iIntValue), aakVar);
                zd zdVar = (zd) aah.setX(new Object[]{aahVar2}, 1105619221, -1105619212, (int) System.currentTimeMillis());
                ze zeVar = (ze) zd.setOnFocusChangeListener(new Object[]{zdVar}, -1673899270, 1673899275, System.identityHashCode(zdVar));
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) aah.setX(new Object[]{aahVar2}, -715938544, 715938587, System.identityHashCode(aahVar2)));
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(iIntValue);
                sb2.append("] onStream");
                ze.setY(new Object[]{zeVar, new setCompoundDrawableTintBlendMode(sb2.toString(), aahVar2, aakVar), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
            }
        }

        public static /* synthetic */ void d(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            if (!zBooleanValue) {
                ze zeVar = (ze) aah.setX(new Object[]{setdividerpadding.f52071q0}, -1278050775, 1278050815, (int) System.currentTimeMillis());
                aah aahVar = setdividerpadding.f52071q0;
                ze.setY(new Object[]{zeVar, new setX(Intrinsics.stringPlus((String) aah.setX(new Object[]{aahVar}, -715938544, 715938587, System.identityHashCode(aahVar)), " ping"), setdividerpadding.f52071q0, iIntValue, iIntValue2), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
                return;
            }
            aah aahVar2 = setdividerpadding.f52071q0;
            synchronized (aahVar2) {
                try {
                    if (iIntValue == 1) {
                        aah.setX(new Object[]{aahVar2, Long.valueOf(((Long) aah.setX(new Object[]{aahVar2}, 350957869, -350957819, (int) System.currentTimeMillis())).longValue() + 1)}, 566644913, -566644902, (int) System.currentTimeMillis());
                    } else if (iIntValue != 2) {
                        if (iIntValue == 3) {
                            aah.setX(new Object[]{aahVar2, Long.valueOf(((Long) aah.setX(new Object[]{aahVar2}, 1802984067, -1802984045, (int) System.currentTimeMillis())).longValue() + 1)}, -1913591265, 1913591268, (int) System.currentTimeMillis());
                            aahVar2.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        aah.setX(new Object[]{aahVar2, Long.valueOf(((Long) aah.setX(new Object[]{aahVar2}, 2024990435, -2024990403, (int) System.currentTimeMillis())).longValue() + 1)}, -580221109, 580221117, (int) System.currentTimeMillis());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            IOException iOException;
            aac aacVar;
            Object obj;
            IOException iOException2;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~(i13 | i14);
            int i16 = ~i12;
            int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
            int i18 = i10 | i11;
            int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
            int i20 = i10 | (~(i12 | i14));
            int i21 = ~(i11 | i16);
            switch (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19) {
                case 1:
                    setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                    int i22 = f52068r0;
                    int i23 = (i22 ^ 57) + ((i22 & 57) << 1);
                    f52069s0 = i23 % 128;
                    int i24 = i23 % 2;
                    aac aacVar2 = aac.INTERNAL_ERROR;
                    try {
                        aai aaiVar = setdividerpadding.f52070p0;
                        aai.setY(new Object[]{aaiVar, setdividerpadding}, -1546084773, 1546084787, System.identityHashCode(aaiVar));
                        int i25 = f52069s0;
                        int i26 = i25 & 31;
                        int i27 = (i26 - (~((i25 ^ 31) | i26))) - 1;
                        f52068r0 = i27 % 128;
                        int i28 = i27 % 2;
                        do {
                        } while (!(!((Boolean) aai.setY(new Object[]{aaiVar, Boolean.FALSE, setdividerpadding}, -1001910009, 1001910019, System.identityHashCode(aaiVar))).booleanValue()));
                        int i29 = f52068r0;
                        int i30 = i29 ^ 73;
                        int i31 = -(-((i29 & 73) << 1));
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        f52069s0 = i32 % 128;
                        int i33 = i32 % 2;
                        aacVar = aac.NO_ERROR;
                        try {
                            aac aacVar3 = aac.CANCEL;
                            aah aahVar = setdividerpadding.f52071q0;
                            obj = null;
                            aah.setX(new Object[]{aahVar, aacVar, aacVar3, null}, 1340779826, -1340779774, System.identityHashCode(aahVar));
                            yt.setDividerPadding(aaiVar);
                            int i34 = f52068r0;
                            int i35 = i34 & 91;
                            int i36 = i35 + ((i34 ^ 91) | i35);
                            f52069s0 = i36 % 128;
                            int i37 = i36 % 2;
                        } catch (IOException e5) {
                            obj = null;
                            iOException2 = e5;
                            try {
                                aac aacVar4 = aac.PROTOCOL_ERROR;
                                aah aahVar2 = setdividerpadding.f52071q0;
                                aah.setX(new Object[]{aahVar2, aacVar4, aacVar4, iOException2}, 1340779826, -1340779774, System.identityHashCode(aahVar2));
                                yt.setDividerPadding(setdividerpadding.f52070p0);
                            } catch (Throwable th2) {
                                th = th2;
                                aah aahVar3 = setdividerpadding.f52071q0;
                                aah.setX(new Object[]{aahVar3, aacVar, aacVar2, iOException2}, 1340779826, -1340779774, System.identityHashCode(aahVar3));
                                yt.setDividerPadding(setdividerpadding.f52070p0);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            iOException = null;
                            iOException2 = iOException;
                            aah aahVar4 = setdividerpadding.f52071q0;
                            aah.setX(new Object[]{aahVar4, aacVar, aacVar2, iOException2}, 1340779826, -1340779774, System.identityHashCode(aahVar4));
                            yt.setDividerPadding(setdividerpadding.f52070p0);
                            throw th;
                        }
                    } catch (IOException e7) {
                        obj = null;
                        iOException2 = e7;
                        aacVar = aacVar2;
                    } catch (Throwable th4) {
                        th = th4;
                        iOException = null;
                        aacVar = aacVar2;
                    }
                    return obj;
                case 2:
                    setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    aac aacVar5 = (aac) objArr[2];
                    int i38 = f52068r0 + 107;
                    f52069s0 = i38 % 128;
                    if (i38 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(aacVar5, "");
                        aah aahVar5 = setdividerpadding2.f52071q0;
                        ((Boolean) aah.setX(new Object[]{Integer.valueOf(iIntValue)}, 2139219617, -2139219571, iIntValue)).booleanValue();
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(aacVar5, "");
                    aah aahVar6 = setdividerpadding2.f52071q0;
                    if (((Boolean) aah.setX(new Object[]{Integer.valueOf(iIntValue)}, 2139219617, -2139219571, iIntValue)).booleanValue()) {
                        int i39 = f52069s0;
                        int i40 = ((i39 ^ 40) + ((i39 & 40) << 1)) - 1;
                        f52068r0 = i40 % 128;
                        if (i40 % 2 != 0) {
                            aah.setX(new Object[]{setdividerpadding2.f52071q0, Integer.valueOf(iIntValue), aacVar5}, -1991491085, 1991491100, iIntValue);
                            throw null;
                        }
                        aah.setX(new Object[]{setdividerpadding2.f52071q0, Integer.valueOf(iIntValue), aacVar5}, -1991491085, 1991491100, iIntValue);
                    } else {
                        aak dividerPadding = setdividerpadding2.f52071q0.setDividerPadding(iIntValue);
                        if (dividerPadding == null) {
                            int i41 = f52069s0 + 93;
                            int i42 = i41 % 128;
                            f52068r0 = i42;
                            if (i41 % 2 != 0) {
                                throw null;
                            }
                            int i43 = ((i42 ^ 103) | (i42 & 103)) << 1;
                            int i44 = -(((~i42) & 103) | (i42 & (-104)));
                            int i45 = (i43 & i44) + (i43 | i44);
                            f52069s0 = i45 % 128;
                            int i46 = i45 % 2;
                        } else {
                            dividerPadding.setDividerPadding(aacVar5);
                            int i47 = f52069s0;
                            int i48 = i47 & 71;
                            int i49 = -(-((i47 ^ 71) | i48));
                            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                            f52068r0 = i50 % 128;
                            int i51 = i50 % 2;
                        }
                    }
                    return null;
                case 3:
                    d(objArr);
                    return null;
                case 4:
                    a(objArr);
                    return null;
                case 5:
                    c(objArr);
                    return null;
                case 6:
                    setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    List list = (List) objArr[2];
                    int i52 = f52068r0;
                    int i53 = ((i52 ^ 10) + ((i52 & 10) << 1)) - 1;
                    f52069s0 = i53 % 128;
                    if (i53 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(list, "");
                        aah.setX(new Object[]{setdividerpadding3.f52071q0, Integer.valueOf(iIntValue2), list}, 1141064144, -1141064130, iIntValue2);
                        int i54 = 50 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(list, "");
                        aah.setX(new Object[]{setdividerpadding3.f52071q0, Integer.valueOf(iIntValue2), list}, 1141064144, -1141064130, iIntValue2);
                    }
                    int i55 = f52069s0;
                    int i56 = ((i55 | 41) << 1) - (i55 ^ 41);
                    f52068r0 = i56 % 128;
                    int i57 = i56 % 2;
                    return null;
                case 7:
                    setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[0];
                    boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                    int iIntValue3 = ((Number) objArr[2]).intValue();
                    aby abyVar = (aby) objArr[3];
                    int iIntValue4 = ((Number) objArr[4]).intValue();
                    int i58 = f52068r0;
                    int i59 = i58 & 93;
                    int i60 = (((i58 ^ 93) | i59) << 1) - ((~i59) & (i58 | 93));
                    f52069s0 = i60 % 128;
                    if (i60 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(abyVar, "");
                        aah aahVar7 = setdividerpadding4.f52071q0;
                        ((Boolean) aah.setX(new Object[]{Integer.valueOf(iIntValue3)}, 2139219617, -2139219571, iIntValue3)).booleanValue();
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(abyVar, "");
                    aah aahVar8 = setdividerpadding4.f52071q0;
                    if (!((Boolean) aah.setX(new Object[]{Integer.valueOf(iIntValue3)}, 2139219617, -2139219571, iIntValue3)).booleanValue()) {
                        aak onFocusChangeListener = setdividerpadding4.f52071q0.setOnFocusChangeListener(iIntValue3);
                        if (onFocusChangeListener == null) {
                            int i61 = f52068r0;
                            int i62 = (i61 & 59) + (i61 | 59);
                            f52069s0 = i62 % 128;
                            int i63 = i62 % 2;
                            aah aahVar9 = setdividerpadding4.f52071q0;
                            if (i63 == 0) {
                                aah.setX(new Object[]{aahVar9, Integer.valueOf(iIntValue3), aac.PROTOCOL_ERROR}, -1642947737, 1642947747, iIntValue3);
                                long j10 = iIntValue4;
                                aahVar9.setDividerPadding(j10);
                                abyVar.setNavigationOnClickListener(j10);
                                throw null;
                            }
                            aah.setX(new Object[]{aahVar9, Integer.valueOf(iIntValue3), aac.PROTOCOL_ERROR}, -1642947737, 1642947747, iIntValue3);
                            long j11 = iIntValue4;
                            aahVar9.setDividerPadding(j11);
                            abyVar.setNavigationOnClickListener(j11);
                        } else {
                            aak.setOnFocusChangeListener(new Object[]{onFocusChangeListener, abyVar, Integer.valueOf(iIntValue4)}, -40019943, 40019967, iIntValue4);
                            if (zBooleanValue) {
                                int i64 = ~iIntValue3;
                                int i65 = 804012941 & i64;
                                int i66 = ((-804012942) & iIntValue3) | i65;
                                int i67 = 804012941 & iIntValue3;
                                int i68 = ~((i66 & i67) | (i66 ^ i67));
                                int i69 = (-1509485269) & i68;
                                int i70 = -(-((((i68 | (-1509485269)) & (~i69)) | i69) * (-964)));
                                int i71 = (((-418776454) | i70) << 1) - (i70 ^ (-418776454));
                                int i72 = (804012941 | i64) & (~i65);
                                int i73 = ~i64;
                                int i74 = ((~((i72 & i65) | (i72 ^ i65))) | (-2147281886)) * (-964);
                                int i75 = i71 & i74;
                                int i76 = -(-(i74 | i71));
                                int i77 = (i75 & i76) + (i76 | i75);
                                int i78 = ~(((-1164355369) ^ i64) | ((-1164355369) & i64));
                                int i79 = (i78 & 1076266504) | ((-1076266505) & i78) | ((~i78) & 1076266504);
                                int i80 = i64 & (-792752497);
                                int i81 = (i64 & 792752496) | (792752496 & i73) | i80;
                                int i82 = ~i81;
                                int i83 = (i81 | i82) & i82;
                                int i84 = ((~i83) & i79) | ((~i79) & i83);
                                int i85 = i83 & i79;
                                int i86 = ((i85 & i84) | (i84 ^ i85)) * 464;
                                int i87 = 1332067096 & i86;
                                int i88 = (i86 | 1332067096) & (~i87);
                                int i89 = -(-(i87 << 1));
                                int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
                                int i91 = iIntValue3 & 792752496;
                                int i92 = i91 | i80;
                                int i93 = iIntValue3 & (-792752497);
                                int i94 = (i92 & i93) | (i92 ^ i93);
                                int i95 = (1164355368 & i94) | ((~i94) & (-1164355369));
                                int i96 = (-1164355369) & i94;
                                int i97 = ((i96 & i95) | (i95 ^ i96)) * (-464);
                                int i98 = i90 & i97;
                                int i99 = i98 + ((i97 ^ i90) | i98);
                                int i100 = ~(i91 | (792752496 ^ iIntValue3));
                                int i101 = 1076266504 & i100;
                                int i102 = (i100 | 1076266504) & (~i101);
                                int i103 = ((i102 & i101) | (i102 ^ i101)) * 464;
                                int i104 = i99 & i103;
                                if (i77 > ((i103 | i99) & (~i104)) + (i104 << 1)) {
                                    aak.setOnFocusChangeListener(new Object[]{onFocusChangeListener, yt.setY, Boolean.FALSE}, -830450716, 830450741, System.identityHashCode(onFocusChangeListener));
                                } else {
                                    aak.setOnFocusChangeListener(new Object[]{onFocusChangeListener, yt.setY, Boolean.TRUE}, -830450716, 830450741, System.identityHashCode(onFocusChangeListener));
                                }
                            }
                            int i105 = f52069s0;
                            int i106 = ((i105 & 80) + (i105 | 80)) - 1;
                            f52068r0 = i106 % 128;
                            if (i106 % 2 != 0) {
                                int i107 = 84 / 0;
                            }
                        }
                    } else {
                        int i108 = f52068r0;
                        int i109 = ((((i108 ^ 83) | (i108 & 83)) << 1) - (~(-(((~i108) & 83) | (i108 & (-84)))))) - 1;
                        f52069s0 = i109 % 128;
                        int i110 = i109 % 2;
                        aah.setX(new Object[]{setdividerpadding4.f52071q0, Integer.valueOf(iIntValue3), abyVar, Integer.valueOf(iIntValue4), Boolean.valueOf(zBooleanValue)}, -9305076, 9305094, iIntValue3);
                        int i111 = f52069s0 + 53;
                        f52068r0 = i111 % 128;
                        if (i111 % 2 != 0) {
                            throw null;
                        }
                    }
                    return null;
                case 8:
                    setDividerPadding setdividerpadding5 = (setDividerPadding) objArr[0];
                    int i112 = f52068r0;
                    int i113 = (((i112 | 77) << 1) - (~(-(((~i112) & 77) | (i112 & (-78)))))) - 1;
                    f52069s0 = i113 % 128;
                    int i114 = i113 % 2;
                    setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding5}, 60467702, -60467701, System.identityHashCode(setdividerpadding5));
                    Unit unit = Unit.INSTANCE;
                    int i115 = f52068r0;
                    int i116 = i115 & 5;
                    int i117 = -(-((i115 ^ 5) | i116));
                    int i118 = (i116 & i117) + (i117 | i116);
                    f52069s0 = i118 % 128;
                    if (i118 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                case 9:
                    b(objArr);
                    return null;
                case 10:
                    setDividerPadding setdividerpadding6 = (setDividerPadding) objArr[0];
                    aam aamVar = (aam) objArr[1];
                    Intrinsics.checkNotNullParameter(aamVar, "");
                    ze zeVar = (ze) aah.setX(new Object[]{setdividerpadding6.f52071q0}, -1278050775, 1278050815, (int) System.currentTimeMillis());
                    aah aahVar10 = setdividerpadding6.f52071q0;
                    ze.setY(new Object[]{zeVar, new setOnFocusChangeListener(Intrinsics.stringPlus((String) aah.setX(new Object[]{aahVar10}, -715938544, 715938587, System.identityHashCode(aahVar10)), " applyAndAckSettings"), setdividerpadding6, false, aamVar), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
                    int i119 = f52069s0;
                    int i120 = i119 & 47;
                    int i121 = (i119 ^ 47) | i120;
                    int i122 = ((i120 | i121) << 1) - (i121 ^ i120);
                    f52068r0 = i122 % 128;
                    int i123 = i122 % 2;
                    return null;
                default:
                    setDividerPadding setdividerpadding7 = (setDividerPadding) objArr[0];
                    int iIntValue5 = ((Number) objArr[1]).intValue();
                    long jLongValue = ((Number) objArr[2]).longValue();
                    if (iIntValue5 == 0) {
                        aah aahVar11 = setdividerpadding7.f52071q0;
                        synchronized (aahVar11) {
                            aah.setX(new Object[]{aahVar11, Long.valueOf(((Long) aah.setX(new Object[]{aahVar11}, 374167882, -374167857, System.identityHashCode(aahVar11))).longValue() + jLongValue)}, -1403824511, 1403824550, (int) System.currentTimeMillis());
                            aahVar11.notifyAll();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        return null;
                    }
                    aak onFocusChangeListener2 = setdividerpadding7.f52071q0.setOnFocusChangeListener(iIntValue5);
                    if (onFocusChangeListener2 == null) {
                        return null;
                    }
                    synchronized (onFocusChangeListener2) {
                        aak.setOnFocusChangeListener(new Object[]{onFocusChangeListener2, Long.valueOf(jLongValue)}, -1720803552, 1720803567, System.identityHashCode(onFocusChangeListener2));
                        Unit unit3 = Unit.INSTANCE;
                    }
                    return null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return setCompoundDrawableTintBlendMode(new Object[]{this}, -1457077679, 1457077687, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setDividerPadding(int i10, @NotNull List<aab> list) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10), list}, -367841826, 367841832, i10);
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setOnFocusChangeListener(boolean z10, int i10, int i11) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10), Integer.valueOf(i10), Integer.valueOf(i11)}, -603446665, 603446668, i10);
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setX(int i10, long j10) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10), Long.valueOf(j10)}, 262328647, -262328647, i10);
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setY(boolean z10, int i10, @NotNull aby abyVar, int i11) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10), Integer.valueOf(i10), abyVar, Integer.valueOf(i11)}, -43320703, 43320710, i10);
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setDividerPadding(int i10, @NotNull aac aacVar, @NotNull abw abwVar) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10), aacVar, abwVar}, -922455566, 922455570, i10);
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setOnFocusChangeListener(int i10, @NotNull aac aacVar) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10), aacVar}, -1729683740, 1729683742, i10);
        }

        public static final class setY extends zb {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ aah f52083g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f52084h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public setY(String str, aah aahVar, Ref.ObjectRef objectRef) {
                super(str, true);
                this.f52083g = aahVar;
                this.f52084h = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
                setY sety = (setY) objArr[0];
                aah aahVar = sety.f52083g;
                ((setCompoundDrawableTintBlendMode) aah.setX(new Object[]{aahVar}, 219087885, -219087855, System.identityHashCode(aahVar))).setX(sety.f52083g, (aam) sety.f52084h.element);
                return -1L;
            }

            @Override // com.mypinpad.tsdk.isolation.zb
            public final long setY() {
                return ((Long) setY(new Object[]{this}, -310230142, 310230142, System.identityHashCode(this))).longValue();
            }
        }

        public final void setDividerPadding(boolean z10, @NotNull aam aamVar) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10), aamVar}, -839268053, 839268062, System.identityHashCode(this));
        }

        public static final class setOnFocusChangeListener extends zb {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static int f52074i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static int f52075j = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ setDividerPadding f52076g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ aam f52077h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public setOnFocusChangeListener(String str, setDividerPadding setdividerpadding, boolean z10, aam aamVar) {
                super(str, true);
                this.f52076g = setdividerpadding;
                this.f52077h = aamVar;
            }

            public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                int i13 = f52075j;
                int i14 = (((i13 ^ 73) | (i13 & 73)) << 1) - (((~i13) & 73) | (i13 & (-74)));
                f52074i = i14 % 128;
                int i15 = i14 % 2;
                setDividerPadding setdividerpadding = setonfocuschangelistener.f52076g;
                setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, Boolean.FALSE, setonfocuschangelistener.f52077h}, -839268053, 839268062, System.identityHashCode(setdividerpadding));
                int i16 = f52074i + 43;
                f52075j = i16 % 128;
                int i17 = i16 % 2;
                return -1L;
            }

            @Override // com.mypinpad.tsdk.isolation.zb
            public final long setY() {
                return ((Long) setY(new Object[]{this}, 1419355791, -1419355791, System.identityHashCode(this))).longValue();
            }
        }

        public static final class setX extends zb {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static int f52078j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f52079k = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ aah f52080g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ int f52081h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ int f52082i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public setX(String str, aah aahVar, int i10, int i11) {
                super(str, true);
                this.f52080g = aahVar;
                this.f52081h = i10;
                this.f52082i = i11;
            }

            public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
                setX setx = (setX) objArr[0];
                int i13 = f52078j;
                int i14 = (-2) - (((i13 & 116) + (i13 | 116)) ^ (-1));
                f52079k = i14 % 128;
                int i15 = i14 % 2;
                int i16 = setx.f52081h;
                aah.setX(new Object[]{setx.f52080g, Boolean.TRUE, Integer.valueOf(i16), Integer.valueOf(setx.f52082i)}, 764065165, -764065159, i16);
                int i17 = f52079k;
                int i18 = (i17 & (-122)) | ((~i17) & 121);
                int i19 = (i17 & 121) << 1;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f52078j = i20 % 128;
                if (i20 % 2 == 0) {
                    return -1L;
                }
                throw null;
            }

            @Override // com.mypinpad.tsdk.isolation.zb
            public final long setY() {
                return ((Long) setY(new Object[]{this}, -243511686, 243511686, System.identityHashCode(this))).longValue();
            }
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setDividerPadding(@NotNull aam aamVar) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, aamVar}, 627030508, -627030498, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.aai.setDividerPadding
        public final void setDividerPadding(boolean z10, int i10, @NotNull List<aab> list) throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10), Integer.valueOf(i10), list}, -1418581805, 1418581810, i10);
        }
    }

    public static final class setLayoutAnimation extends zb {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f52086h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setLayoutAnimation(String str, aah aahVar, long j10) {
            super(str, false, 2, null);
            this.f52085g = aahVar;
            this.f52086h = j10;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            boolean z10;
            setLayoutAnimation setlayoutanimation = (setLayoutAnimation) objArr[0];
            synchronized (setlayoutanimation.f52085g) {
                if (((Long) aah.setX(new Object[]{setlayoutanimation.f52085g}, 350957869, -350957819, (int) System.currentTimeMillis())).longValue() < ((Long) aah.setX(new Object[]{setlayoutanimation.f52085g}, -159433616, 159433660, (int) System.currentTimeMillis())).longValue()) {
                    z10 = true;
                } else {
                    aah.setX(new Object[]{setlayoutanimation.f52085g, Long.valueOf(((Long) aah.setX(new Object[]{setlayoutanimation.f52085g}, -159433616, 159433660, (int) System.currentTimeMillis())).longValue() + 1)}, 244400175, -244400138, (int) System.currentTimeMillis());
                    z10 = false;
                }
            }
            if (z10) {
                aah.setX(new Object[]{setlayoutanimation.f52085g, null}, 788207988, -788207941, (int) System.currentTimeMillis());
                return -1L;
            }
            aah.setX(new Object[]{setlayoutanimation.f52085g, Boolean.FALSE, 1, 0}, 764065165, -764065159, 1);
            return Long.valueOf(setlayoutanimation.f52086h);
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, -2128538362, 2128538362, System.identityHashCode(this))).longValue();
        }
    }

    public static final class setNavigationOnClickListener extends zb {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52087g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f52088h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f52089i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setNavigationOnClickListener(String str, aah aahVar, int i10, List list, boolean z10) {
            super(str, true);
            this.f52087g = aahVar;
            this.f52088h = i10;
            this.f52089i = list;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) objArr[0];
            ((aan) aah.setX(new Object[]{setnavigationonclicklistener.f52087g}, -1813093563, 1813093586, (int) System.currentTimeMillis())).setY(setnavigationonclicklistener.f52089i);
            try {
                aah aahVar = setnavigationonclicklistener.f52087g;
                ((aag) aah.setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar))).setY(setnavigationonclicklistener.f52088h, aac.CANCEL);
                synchronized (setnavigationonclicklistener.f52087g) {
                    ((Set) aah.setX(new Object[]{setnavigationonclicklistener.f52087g}, -1476138883, 1476138917, (int) System.currentTimeMillis())).remove(Integer.valueOf(setnavigationonclicklistener.f52088h));
                }
            } catch (IOException unused) {
            }
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, 1049258056, -1049258056, System.identityHashCode(this))).longValue();
        }
    }

    public static final class setOnDragListener extends zb {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f52091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ aac f52092i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setOnDragListener(String str, aah aahVar, int i10, aac aacVar) {
            super(str, true);
            this.f52090g = aahVar;
            this.f52091h = i10;
            this.f52092i = aacVar;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setOnDragListener setondraglistener = (setOnDragListener) objArr[0];
            ((aan) aah.setX(new Object[]{setondraglistener.f52090g}, -1813093563, 1813093586, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode(setondraglistener.f52092i);
            synchronized (setondraglistener.f52090g) {
                ((Set) aah.setX(new Object[]{setondraglistener.f52090g}, -1476138883, 1476138917, (int) System.currentTimeMillis())).remove(Integer.valueOf(setondraglistener.f52091h));
                Unit unit = Unit.INSTANCE;
            }
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, 289111334, -289111334, System.identityHashCode(this))).longValue();
        }
    }

    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f52093j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f52094k = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final zd f52096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f52097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f52098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public aby f52099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public abv f52100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public setCompoundDrawableTintBlendMode f52101g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final aan f52102h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f52103i;

        public setOnFocusChangeListener(@NotNull zd zdVar) {
            Intrinsics.checkNotNullParameter(zdVar, "");
            this.f52095a = true;
            this.f52096b = zdVar;
            this.f52101g = setCompoundDrawableTintBlendMode.setDividerPadding;
            this.f52102h = aan.setY;
        }

        public static /* synthetic */ setOnFocusChangeListener a(Object[] objArr) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i10 = f52094k + 1;
            f52093j = i10 % 128;
            int i11 = i10 % 2;
            setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(iIntValue)}, 1895916196, -1895916180, iIntValue);
            int i12 = f52094k;
            int i13 = (i12 | 23) << 1;
            int i14 = -(i12 ^ 23);
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            f52093j = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 65 / 0;
            }
            return setonfocuschangelistener;
        }

        public static /* synthetic */ aan b(Object[] objArr) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int i10 = f52093j;
            int i11 = (((i10 | 122) << 1) - (i10 ^ 122)) - 1;
            int i12 = i11 % 128;
            f52094k = i12;
            int i13 = i11 % 2;
            aan aanVar = setonfocuschangelistener.f52102h;
            int i14 = i12 & 111;
            int i15 = ((((i12 ^ 111) | i14) << 1) - (~(-((i12 | 111) & (~i14))))) - 1;
            f52093j = i15 % 128;
            if (i15 % 2 == 0) {
                return aanVar;
            }
            throw null;
        }

        public static /* synthetic */ setOnFocusChangeListener c(Object[] objArr) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[1];
            int i10 = f52094k;
            int i11 = (i10 & (-30)) | ((~i10) & 29);
            int i12 = -(-((i10 & 29) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f52093j = i13 % 128;
            if (i13 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
                setOnFocusChangeListener(new Object[]{setonfocuschangelistener, setcompounddrawabletintblendmode}, -1027351547, 1027351549, System.identityHashCode(setonfocuschangelistener));
                int i14 = 66 / 0;
            } else {
                Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
                setOnFocusChangeListener(new Object[]{setonfocuschangelistener, setcompounddrawabletintblendmode}, -1027351547, 1027351549, System.identityHashCode(setonfocuschangelistener));
            }
            return setonfocuschangelistener;
        }

        public static /* synthetic */ void d(Object[] objArr) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            Socket socket = (Socket) objArr[1];
            int i10 = f52094k + 99;
            f52093j = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(socket, "");
            setonfocuschangelistener.f52097c = socket;
            int i12 = f52093j + 7;
            f52094k = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ aby e(Object[] objArr) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int i10 = f52094k;
            int i11 = (i10 ^ 45) + ((i10 & 45) << 1);
            int i12 = i11 % 128;
            f52093j = i12;
            int i13 = i11 % 2;
            aby abyVar = setonfocuschangelistener.f52099e;
            if (abyVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i14 = f52093j + 101;
                f52094k = i14 % 128;
                int i15 = i14 % 2;
                return null;
            }
            int i16 = (i12 & (-62)) | ((~i12) & 61);
            int i17 = (i12 & 61) << 1;
            int i18 = (i16 & i17) + (i17 | i16);
            f52094k = i18 % 128;
            if (i18 % 2 != 0) {
                return abyVar;
            }
            throw null;
        }

        public static /* synthetic */ void f(Object[] objArr) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[1];
            int iIdentityHashCode = System.identityHashCode(setonfocuschangelistener);
            int i10 = ~iIdentityHashCode;
            int i11 = (i10 | iIdentityHashCode) & i10;
            int i12 = 644960741 ^ i11;
            int i13 = i11 & 644960741;
            int i14 = ~((i13 & i12) | (i12 ^ i13));
            int i15 = ((~i14) & (-788264422)) | (i14 & 788264421);
            int i16 = i14 & (-788264422);
            int i17 = -(-(((i16 & i15) | (i15 ^ i16)) * 168));
            int i18 = (((-731390899) | i17) << 1) - (i17 ^ (-731390899));
            int i19 = (788264421 & i10) | (iIdentityHashCode & (-788264422));
            int i20 = 788264421 & iIdentityHashCode;
            int i21 = (i19 & i20) | (i19 ^ i20);
            int i22 = ~i21;
            int i23 = ((i21 | i22) & i22) * 168;
            int i24 = i18 & i23;
            int i25 = -(-((i23 ^ i18) | i24));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            int i27 = 713733124 & i10;
            int i28 = (i10 | 713733124) & (~i27);
            int i29 = ~((i28 & i27) | (i28 ^ i27));
            int i30 = ((-74531298) & i29) | ((~i29) & 74531297);
            int i31 = i29 & 74531297;
            int i32 = (i31 & i30) | (i30 ^ i31);
            int i33 = ~((iIdentityHashCode & (-143303681)) | ((-143303681) ^ iIdentityHashCode));
            int i34 = i32 & i33;
            int i35 = (((i33 | i32) & (~i34)) | i34) * 168;
            int i36 = i26 & i35;
            int i37 = i35 | i26;
            int i38 = (i36 & i37) + (i37 | i36);
            int iIdentityHashCode2 = System.identityHashCode(setonfocuschangelistener);
            int i39 = ~iIdentityHashCode2;
            int i40 = ~((-1089434101) | i39);
            int i41 = ~(((-394086655) ^ iIdentityHashCode2) | ((-394086655) & iIdentityHashCode2));
            int i42 = i40 ^ i41;
            int i43 = i40 & i41;
            int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * (-370)));
            int i45 = 630385846 & i44;
            int i46 = (i44 | 630385846) & (~i45);
            int i47 = i45 << 1;
            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
            int i49 = (i39 | iIdentityHashCode2) & i39;
            int i50 = (-394086655) ^ i49;
            int i51 = i49 & (-394086655);
            int i52 = ~((i51 & i50) | (i50 ^ i51));
            int i53 = (i39 & (-1089434101)) | (1089434100 & iIdentityHashCode2);
            int i54 = iIdentityHashCode2 & (-1089434101);
            int i55 = ~((i54 & i53) | (i53 ^ i54));
            int i56 = i52 & i55;
            int i57 = ((i55 | i52) & (~i56)) | i56;
            int i58 = ((i57 & (-1476360703)) | (1476360702 & i57) | ((~i57) & (-1476360703))) * (-370);
            int i59 = i48 ^ i58;
            int i60 = ((((i58 & i48) | i59) << 1) - (~(-i59))) - 1;
            if (i38 > (((i60 | (-792613517)) << 1) - (i60 ^ (-792613517))) - 1) {
                Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
                setonfocuschangelistener.f52101g = setcompounddrawabletintblendmode;
                throw null;
            }
            Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
            setonfocuschangelistener.f52101g = setcompounddrawabletintblendmode;
            int i61 = f52093j;
            int i62 = (i61 ^ 69) + ((i61 & 69) << 1);
            f52094k = i62 % 128;
            int i63 = i62 % 2;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            String strStringPlus;
            int i13;
            Object obj;
            switch ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628)) {
                case 1:
                    return b(objArr);
                case 2:
                    f(objArr);
                    return null;
                case 3:
                    setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                    Socket socket = (Socket) objArr[1];
                    String str = (String) objArr[2];
                    aby abyVar = (aby) objArr[3];
                    abv abvVar = (abv) objArr[4];
                    int i14 = f52093j;
                    int i15 = (i14 ^ 85) + ((i14 & 85) << 1);
                    f52094k = i15 % 128;
                    int i16 = i15 % 2;
                    Intrinsics.checkNotNullParameter(socket, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(abyVar, "");
                    Intrinsics.checkNotNullParameter(abvVar, "");
                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener, socket}, 642471726, -642471720, System.identityHashCode(setonfocuschangelistener));
                    if (((Boolean) setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1119620135, 1119620147, System.identityHashCode(setonfocuschangelistener))).booleanValue()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(yt.setOnDragListener);
                        sb2.append(' ');
                        sb2.append(str);
                        strStringPlus = sb2.toString();
                        int i17 = f52094k;
                        int i18 = i17 & 5;
                        i13 = i18 + ((i17 ^ 5) | i18);
                        f52093j = i13 % 128;
                    } else {
                        strStringPlus = Intrinsics.stringPlus("MockWebServer ", str);
                        int i19 = f52093j;
                        i13 = (((i19 & (-84)) | ((~i19) & 83)) - (~(-(-((i19 & 83) << 1))))) - 1;
                        f52094k = i13 % 128;
                    }
                    int i20 = i13 % 2;
                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener, strStringPlus}, 1351434717, -1351434703, System.identityHashCode(setonfocuschangelistener));
                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener, abyVar}, 737022245, -737022234, System.identityHashCode(setonfocuschangelistener));
                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener, abvVar}, 742852184, -742852169, System.identityHashCode(setonfocuschangelistener));
                    int i21 = f52093j;
                    int i22 = i21 ^ 115;
                    int i23 = (i21 & 115) << 1;
                    int i24 = (i22 & i23) + (i23 | i22);
                    f52094k = i24 % 128;
                    int i25 = i24 % 2;
                    return setonfocuschangelistener;
                case 4:
                    return a(objArr);
                case 5:
                    return e(objArr);
                case 6:
                    d(objArr);
                    return null;
                case 7:
                    return c(objArr);
                case 8:
                    setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                    int i26 = f52093j;
                    int i27 = i26 & 71;
                    int i28 = (((i26 ^ 71) | i27) << 1) - ((i26 | 71) & (~i27));
                    int i29 = i28 % 128;
                    f52094k = i29;
                    int i30 = i28 % 2;
                    obj = setonfocuschangelistener2.f52097c;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i31 = f52093j;
                        int i32 = (((i31 | 124) << 1) - (i31 ^ 124)) - 1;
                        f52094k = i32 % 128;
                        int i33 = i32 % 2;
                        return null;
                    }
                    int i34 = i29 & 123;
                    int i35 = (i29 | 123) & (~i34);
                    int i36 = -(-(i34 << 1));
                    int i37 = (i35 & i36) + (i35 | i36);
                    int i38 = i37 % 128;
                    f52093j = i38;
                    int i39 = i37 % 2;
                    int i40 = i38 & 55;
                    int i41 = -(-((i38 ^ 55) | i40));
                    int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                    f52094k = i42 % 128;
                    int i43 = i42 % 2;
                    break;
                    break;
                case 9:
                    setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                    int i44 = f52093j;
                    int i45 = (i44 | 99) << 1;
                    int i46 = -(((~i44) & 99) | (i44 & (-100)));
                    int i47 = (i45 & i46) + (i46 | i45);
                    f52094k = i47 % 128;
                    if (i47 % 2 != 0) {
                        return setonfocuschangelistener3.f52101g;
                    }
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = setonfocuschangelistener3.f52101g;
                    throw null;
                case 10:
                    setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                    int i48 = f52093j;
                    int i49 = ((i48 & 53) - (~(i48 | 53))) - 1;
                    f52094k = i49 % 128;
                    int i50 = i49 % 2;
                    obj = setonfocuschangelistener4.f52100f;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i51 = f52093j;
                        int i52 = ((i51 | 104) << 1) - (i51 ^ 104);
                        int i53 = (i52 ^ (-1)) + (i52 << 1);
                        f52094k = i53 % 128;
                        int i54 = i53 % 2;
                        return null;
                    }
                    int i55 = i48 & 25;
                    int i56 = i48 | 25;
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    f52094k = i57 % 128;
                    if (i57 % 2 == 0) {
                        int i58 = 95 / 0;
                    }
                    break;
                    break;
                case 11:
                    setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                    aby abyVar2 = (aby) objArr[1];
                    int i59 = f52093j;
                    int i60 = (i59 & (-98)) | ((~i59) & 97);
                    int i61 = -(-((i59 & 97) << 1));
                    int i62 = (i60 & i61) + (i61 | i60);
                    f52094k = i62 % 128;
                    int i63 = i62 % 2;
                    Intrinsics.checkNotNullParameter(abyVar2, "");
                    setonfocuschangelistener5.f52099e = abyVar2;
                    int i64 = f52094k;
                    int i65 = i64 & 107;
                    int i66 = -(-((i64 ^ 107) | i65));
                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                    f52093j = i67 % 128;
                    if (i67 % 2 == 0) {
                        return null;
                    }
                    throw null;
                case 12:
                    setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                    int i68 = f52094k;
                    int i69 = i68 & 55;
                    int i70 = i69 + ((i68 ^ 55) | i69);
                    f52093j = i70 % 128;
                    int i71 = i70 % 2;
                    boolean z10 = setonfocuschangelistener6.f52095a;
                    System.identityHashCode(setonfocuschangelistener6);
                    System.identityHashCode(setonfocuschangelistener6);
                    return Boolean.valueOf(z10);
                case 13:
                    setOnFocusChangeListener setonfocuschangelistener7 = (setOnFocusChangeListener) objArr[0];
                    int i72 = f52093j;
                    int i73 = ((i72 | 49) << 1) - (i72 ^ 49);
                    f52094k = i73 % 128;
                    if (i73 % 2 != 0) {
                        return setonfocuschangelistener7.f52096b;
                    }
                    zd zdVar = setonfocuschangelistener7.f52096b;
                    throw null;
                case 14:
                    setOnFocusChangeListener setonfocuschangelistener8 = (setOnFocusChangeListener) objArr[0];
                    String str2 = (String) objArr[1];
                    int i74 = f52094k;
                    int i75 = ((i74 ^ 101) - (~(-(-((i74 & 101) << 1))))) - 1;
                    f52093j = i75 % 128;
                    int i76 = i75 % 2;
                    Intrinsics.checkNotNullParameter(str2, "");
                    setonfocuschangelistener8.f52098d = str2;
                    int i77 = (-2) - ((f52093j + 86) ^ (-1));
                    f52094k = i77 % 128;
                    int i78 = i77 % 2;
                    return null;
                case 15:
                    setOnFocusChangeListener setonfocuschangelistener9 = (setOnFocusChangeListener) objArr[0];
                    abv abvVar2 = (abv) objArr[1];
                    int i79 = f52094k;
                    int i80 = ((i79 ^ 69) | (i79 & 69)) << 1;
                    int i81 = -(((~i79) & 69) | (i79 & (-70)));
                    int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                    f52093j = i82 % 128;
                    int i83 = i82 % 2;
                    Intrinsics.checkNotNullParameter(abvVar2, "");
                    setonfocuschangelistener9.f52100f = abvVar2;
                    int i84 = f52094k;
                    int i85 = (i84 ^ 107) + ((i84 & 107) << 1);
                    f52093j = i85 % 128;
                    if (i85 % 2 == 0) {
                        return null;
                    }
                    throw null;
                case 16:
                    setOnFocusChangeListener setonfocuschangelistener10 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i86 = f52094k;
                    int i87 = ((i86 & 102) + (i86 | 102)) - 1;
                    f52093j = i87 % 128;
                    int i88 = i87 % 2;
                    setonfocuschangelistener10.f52103i = iIntValue;
                    int i89 = i86 + 35;
                    f52093j = i89 % 128;
                    if (i89 % 2 == 0) {
                        return null;
                    }
                    throw null;
                case 17:
                    aah aahVar = new aah((setOnFocusChangeListener) objArr[0]);
                    int i90 = f52093j;
                    int i91 = i90 & 73;
                    int i92 = (i90 | 73) & (~i91);
                    int i93 = -(-(i91 << 1));
                    int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                    f52094k = i94 % 128;
                    if (i94 % 2 != 0) {
                        return aahVar;
                    }
                    throw null;
                case 18:
                    setOnFocusChangeListener setonfocuschangelistener11 = (setOnFocusChangeListener) objArr[0];
                    int i95 = f52093j;
                    int i96 = i95 & 85;
                    int i97 = (i96 - (~((i95 ^ 85) | i96))) - 1;
                    f52094k = i97 % 128;
                    int i98 = i97 % 2;
                    int i99 = setonfocuschangelistener11.f52103i;
                    if (i98 != 0) {
                        return Integer.valueOf(i99);
                    }
                    throw null;
                default:
                    setOnFocusChangeListener setonfocuschangelistener12 = (setOnFocusChangeListener) objArr[0];
                    int i100 = f52093j;
                    int i101 = (i100 & 35) + (i100 | 35);
                    int i102 = i101 % 128;
                    f52094k = i102;
                    int i103 = i101 % 2;
                    obj = setonfocuschangelistener12.f52098d;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i104 = f52093j;
                        int i105 = ((i104 | 114) << 1) - (i104 ^ 114);
                        int i106 = (i105 ^ (-1)) + (i105 << 1);
                        f52094k = i106 % 128;
                        if (i106 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    int i107 = (-2) - ((i102 + 88) ^ (-1));
                    f52093j = i107 % 128;
                    if (i107 % 2 != 0) {
                        throw null;
                    }
                    int i108 = ((i102 | 119) << 1) - (((~i102) & 119) | (i102 & (-120)));
                    f52093j = i108 % 128;
                    if (i108 % 2 != 0) {
                        throw null;
                    }
                    break;
            }
            return obj;
        }

        public final int getNavBarTitleString() {
            return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1364939414, 1364939432, System.identityHashCode(this))).intValue();
        }

        @JvmOverloads
        @NotNull
        public final setOnFocusChangeListener setCompoundDrawableTintBlendMode(@NotNull Socket socket, @NotNull String str, @NotNull aby abyVar, @NotNull abv abvVar) throws IOException {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, socket, str, abyVar, abvVar}, -2143266549, 2143266552, System.identityHashCode(this));
        }

        @NotNull
        public final setOnFocusChangeListener setDividerPadding(@NotNull setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, setcompounddrawabletintblendmode}, 1187807895, -1187807888, System.identityHashCode(this));
        }

        @NotNull
        public final aah setLayoutAnimation() {
            return (aah) setOnFocusChangeListener(new Object[]{this}, -127846421, 127846438, System.identityHashCode(this));
        }

        @NotNull
        public final abv setNavigationOnClickListener() {
            return (abv) setOnFocusChangeListener(new Object[]{this}, -1995547382, 1995547392, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setOnDragListener() {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this}, 367744567, -367744558, System.identityHashCode(this));
        }

        @NotNull
        public final aan setOnLongClickListener() {
            return (aan) setOnFocusChangeListener(new Object[]{this}, 1115634772, -1115634771, System.identityHashCode(this));
        }

        public final boolean setX() {
            return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1119620135, 1119620147, System.identityHashCode(this))).booleanValue();
        }

        @NotNull
        public final String setY() {
            return (String) setOnFocusChangeListener(new Object[]{this}, -709629364, 709629364, System.identityHashCode(this));
        }

        @NotNull
        public final Socket setCompoundDrawableTintBlendMode() {
            return (Socket) setOnFocusChangeListener(new Object[]{this}, 1278317626, -1278317618, System.identityHashCode(this));
        }

        @NotNull
        public final aby setDividerPadding() {
            return (aby) setOnFocusChangeListener(new Object[]{this}, -605342308, 605342313, System.identityHashCode(this));
        }

        @NotNull
        public final setOnFocusChangeListener setOnFocusChangeListener(int i10) {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1320113601, 1320113605, i10);
        }

        @NotNull
        public final zd setOnFocusChangeListener() {
            return (zd) setOnFocusChangeListener(new Object[]{this}, -477717136, 477717149, System.identityHashCode(this));
        }
    }

    public static final class setOnLongClickListener extends zb {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f52105h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f52106i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setOnLongClickListener(String str, aah aahVar, int i10, List list) {
            super(str, true);
            this.f52104g = aahVar;
            this.f52105h = i10;
            this.f52106i = list;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setOnLongClickListener setonlongclicklistener = (setOnLongClickListener) objArr[0];
            ((aan) aah.setX(new Object[]{setonlongclicklistener.f52104g}, -1813093563, 1813093586, (int) System.currentTimeMillis())).setX(setonlongclicklistener.f52106i);
            try {
                aah aahVar = setonlongclicklistener.f52104g;
                ((aag) aah.setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar))).setY(setonlongclicklistener.f52105h, aac.CANCEL);
                synchronized (setonlongclicklistener.f52104g) {
                    ((Set) aah.setX(new Object[]{setonlongclicklistener.f52104g}, -1476138883, 1476138917, (int) System.currentTimeMillis())).remove(Integer.valueOf(setonlongclicklistener.f52105h));
                }
            } catch (IOException unused) {
            }
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, 1985036389, -1985036389, System.identityHashCode(this))).longValue();
        }
    }

    public static final class setX extends zb {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f52108h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ abx f52109i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f52110j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(String str, aah aahVar, int i10, abx abxVar, int i11, boolean z10) {
            super(str, true);
            this.f52107g = aahVar;
            this.f52108h = i10;
            this.f52109i = abxVar;
            this.f52110j = i11;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setX setx = (setX) objArr[0];
            try {
                ((aan) aah.setX(new Object[]{setx.f52107g}, -1813093563, 1813093586, (int) System.currentTimeMillis())).setDividerPadding(setx.f52109i, setx.f52110j);
                aah aahVar = setx.f52107g;
                ((aag) aah.setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar))).setY(setx.f52108h, aac.CANCEL);
                synchronized (setx.f52107g) {
                    ((Set) aah.setX(new Object[]{setx.f52107g}, -1476138883, 1476138917, (int) System.currentTimeMillis())).remove(Integer.valueOf(setx.f52108h));
                }
            } catch (IOException unused) {
            }
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, -1380868065, 1380868065, System.identityHashCode(this))).longValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/aah$setY;", "", "Lcom/mypinpad/tsdk/i/aam;", "setTextSelectHandleRight", "Lcom/mypinpad/tsdk/i/aam;", "setY", "()Lcom/mypinpad/tsdk/i/aam;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52111a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52112b = 1;

        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            aam aamVar;
            int i13 = f52111a;
            int i14 = (i13 & 63) + (i13 | 63);
            f52112b = i14 % 128;
            if (i14 % 2 == 0) {
                aamVar = (aam) aah.setX(new Object[0], 85248939, -85248927, (int) System.currentTimeMillis());
                int i15 = 79 / 0;
            } else {
                aamVar = (aam) aah.setX(new Object[0], 85248939, -85248927, (int) System.currentTimeMillis());
            }
            int i16 = f52112b;
            int i17 = i16 | 11;
            int i18 = i17 << 1;
            int i19 = -((~(i16 & 11)) & i17);
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f52111a = i20 % 128;
            int i21 = i20 % 2;
            return aamVar;
        }

        @JvmName(name = "setY")
        @NotNull
        public static aam setY() {
            return (aam) setDividerPadding(new Object[0], 791613011, -791613011, (int) System.currentTimeMillis());
        }
    }

    public static final class setZ extends zb {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f52113j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f52114k = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ aah f52115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f52116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ aac f52117i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setZ(String str, aah aahVar, int i10, aac aacVar) {
            super(str, true);
            this.f52115g = aahVar;
            this.f52116h = i10;
            this.f52117i = aacVar;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setZ setz = (setZ) objArr[0];
            int i13 = f52113j;
            int i14 = i13 & 25;
            int i15 = i13 | 25;
            int i16 = (i14 & i15) + (i15 | i14);
            f52114k = i16 % 128;
            int i17 = i16 % 2;
            try {
                aah aahVar = setz.f52115g;
                int i18 = setz.f52116h;
                aah.setX(new Object[]{aahVar, Integer.valueOf(i18), setz.f52117i}, -1687800830, 1687800858, i18);
                int i19 = f52113j;
                int i20 = ((i19 | 65) << 1) - (i19 ^ 65);
                f52114k = i20 % 128;
                int i21 = i20 % 2;
            } catch (IOException e5) {
                aah.setX(new Object[]{setz.f52115g, e5}, 788207988, -788207941, (int) System.currentTimeMillis());
            }
            int i22 = f52114k;
            int i23 = ((i22 ^ 113) | (i22 & 113)) << 1;
            int i24 = -(((~i22) & 113) | (i22 & (-114)));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f52113j = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 9 / 0;
            }
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, -123960225, 123960225, System.identityHashCode(this))).longValue();
        }
    }

    static {
        aam aamVar = new aam();
        W0 = aamVar;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = (-138219538) ^ iCurrentTimeMillis;
        int i11 = (-138219538) & iCurrentTimeMillis;
        int i12 = (i11 & i10) | (i10 ^ i11);
        int i13 = (i12 | (~i12)) & (~i12);
        int i14 = 813842944 & i13;
        int i15 = (i13 | 813842944) & (~i14);
        int i16 = -(~(((i15 & i14) | (i15 ^ i14)) * 449));
        int i17 = (((-568594288) | i16) << 1) - (i16 ^ (-568594288));
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        int i19 = ((i18 ^ (-1029785088)) | (i18 & (-1029785088))) << 1;
        int i20 = -(((~i18) & (-1029785088)) | (1029785087 & i18));
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = ~iCurrentTimeMillis;
        int i23 = (-171775290) & i22;
        int i24 = (i22 | (-171775290)) & (~i23);
        int i25 = (i24 & i23) | (i24 ^ i23);
        int i26 = i25 & 847398696;
        int i27 = (i25 | 847398696) & (~i26);
        int i28 = ~((i27 & i26) | (i27 ^ i26));
        int i29 = ((i28 & 813842944) | ((~i28) & 813842944) | ((-813842945) & i28)) * 449;
        int i30 = i21 & i29;
        int i31 = i30 + ((i29 ^ i21) | i30);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i32 = 385313447 & iCurrentTimeMillis2;
        int i33 = (385313447 ^ iCurrentTimeMillis2) | i32;
        int i34 = (i33 | (~i33)) & (~i33);
        int i35 = ((~i34) & (-2146958264)) | (2146958263 & i34);
        int i36 = i34 & (-2146958264);
        int i37 = -(~(((i36 & i35) | (i35 ^ i36)) * (-814)));
        int i38 = ((((-1613945915) | i37) << 1) - (i37 ^ (-1613945915))) - 1;
        int i39 = ~iCurrentTimeMillis2;
        int i40 = ((~i39) & 1804720915) | (i39 & (-1804720916));
        int i41 = 1804720915 & i39;
        int i42 = ~((i40 & i41) | (i40 ^ i41));
        int i43 = (i42 & 43076099) | (i42 ^ 43076099);
        int i44 = (385313447 & i39) | (iCurrentTimeMillis2 & (-385313448));
        int i45 = ~((i32 & i44) | (i44 ^ i32));
        int i46 = ((i45 & i43) | (i43 ^ i45)) * 407;
        int i47 = (i38 | i46) << 1;
        int i48 = -(i46 ^ i38);
        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
        int i50 = (385313447 & iCurrentTimeMillis2) | (i39 & (-385313448));
        int i51 = (-385313448) & iCurrentTimeMillis2;
        int i52 = (i50 & i51) | (i50 ^ i51);
        int i53 = ((i52 | (~i52)) & (~i52)) | 43076099;
        int i54 = (-1804720916) & iCurrentTimeMillis2;
        int i55 = (iCurrentTimeMillis2 | (-1804720916)) & (~i54);
        int i56 = ~((i55 & i54) | (i55 ^ i54));
        int i57 = -(-(((i56 & i53) | ((~i56) & i53) | ((~i53) & i56)) * 407));
        if (i31 <= (i49 & i57) + (i57 | i49)) {
            int i58 = 75 / 0;
        }
    }

    public aah(@NotNull setOnFocusChangeListener setonfocuschangelistener) {
        Intrinsics.checkNotNullParameter(setonfocuschangelistener, "");
        boolean zBooleanValue = ((Boolean) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1119620135, 1119620147, System.identityHashCode(setonfocuschangelistener))).booleanValue();
        this.f52051p0 = zBooleanValue;
        this.f52052q0 = (setCompoundDrawableTintBlendMode) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 367744567, -367744558, System.identityHashCode(setonfocuschangelistener));
        this.f52053r0 = new LinkedHashMap();
        String str = (String) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -709629364, 709629364, System.identityHashCode(setonfocuschangelistener));
        this.f52054s0 = str;
        this.f52056u0 = ((Boolean) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1119620135, 1119620147, System.identityHashCode(setonfocuschangelistener))).booleanValue() ? 3 : 2;
        zd zdVar = (zd) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -477717136, 477717149, System.identityHashCode(setonfocuschangelistener));
        this.f52057w0 = zdVar;
        ze zeVar = (ze) zd.setOnFocusChangeListener(new Object[]{zdVar}, -1673899270, 1673899275, System.identityHashCode(zdVar));
        this.f52058x0 = zeVar;
        this.f52059y0 = (ze) zd.setOnFocusChangeListener(new Object[]{zdVar}, -1673899270, 1673899275, System.identityHashCode(zdVar));
        this.E0 = (ze) zd.setOnFocusChangeListener(new Object[]{zdVar}, -1673899270, 1673899275, System.identityHashCode(zdVar));
        this.F0 = (aan) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 1115634772, -1115634771, System.identityHashCode(setonfocuschangelistener));
        aam aamVar = new aam();
        if (((Boolean) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1119620135, 1119620147, System.identityHashCode(setonfocuschangelistener))).booleanValue()) {
        }
        this.M0 = aamVar;
        aam aamVar2 = W0;
        this.N0 = aamVar2;
        this.R0 = ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar2}, -1082853585, 1082853592, System.identityHashCode(aamVar2))).intValue();
        this.S0 = (Socket) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 1278317626, -1278317618, System.identityHashCode(setonfocuschangelistener));
        this.T0 = new aag((abv) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1995547382, 1995547392, System.identityHashCode(setonfocuschangelistener)), zBooleanValue);
        this.U0 = new setDividerPadding(this, new aai((aby) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -605342308, 605342313, System.identityHashCode(setonfocuschangelistener)), zBooleanValue));
        this.V0 = new LinkedHashSet();
        if (((Integer) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1364939414, 1364939432, System.identityHashCode(setonfocuschangelistener))).intValue() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(((Integer) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1364939414, 1364939432, System.identityHashCode(setonfocuschangelistener))).intValue());
            ze.setY(new Object[]{zeVar, new setLayoutAnimation(Intrinsics.stringPlus(str, " ping"), this, nanos), Long.valueOf(nanos)}, 1565144845, -1565144837, System.identityHashCode(zeVar));
        }
    }

    public static /* synthetic */ void A(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = Y0;
        int i11 = i10 ^ 7;
        int i12 = (i10 & 7) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        X0 = i13 % 128;
        int i14 = i13 % 2;
        aahVar.J0 = jLongValue;
        if (i14 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ ze B(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = i10 & 101;
        int i12 = -(-((i10 ^ 101) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        Y0 = i14;
        int i15 = i13 % 2;
        ze zeVar = aahVar.E0;
        if (i15 == 0) {
            int i16 = 59 / 0;
        }
        int i17 = i14 ^ 123;
        int i18 = ((i14 & 123) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        X0 = i20 % 128;
        int i21 = i20 % 2;
        return zeVar;
    }

    public static /* synthetic */ void C(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = Y0;
        int i11 = i10 & 39;
        int i12 = (i11 - (~(-(-((i10 ^ 39) | i11))))) - 1;
        X0 = i12 % 128;
        int i13 = i12 % 2;
        aahVar.G0 = jLongValue;
        int i14 = (i10 ^ 5) + ((i10 & 5) << 1);
        X0 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 89 / 0;
        }
    }

    public static /* synthetic */ aag D(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = i10 + 85;
        Y0 = i11 % 128;
        int i12 = i11 % 2;
        aag aagVar = aahVar.T0;
        int i13 = i10 ^ 33;
        int i14 = ((i10 & 33) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 & i15) + (i14 | i15);
        Y0 = i16 % 128;
        if (i16 % 2 != 0) {
            return aagVar;
        }
        throw null;
    }

    public static /* synthetic */ void E(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = Y0;
        int i11 = ((i10 ^ 7) | (i10 & 7)) << 1;
        int i12 = -((i10 & (-8)) | ((~i10) & 7));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        X0 = i13 % 128;
        int i14 = i13 % 2;
        aahVar.f52056u0 = iIntValue;
        int i15 = (-2) - (((i10 ^ 46) + ((i10 & 46) << 1)) ^ (-1));
        X0 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void F(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = i10 ^ 79;
        int i12 = (i10 & 79) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        Y0 = i13 % 128;
        if (i13 % 2 != 0) {
            setX(new Object[]{aahVar, aac.NO_ERROR, aac.CANCEL, null}, 1340779826, -1340779774, System.identityHashCode(aahVar));
        } else {
            setX(new Object[]{aahVar, aac.NO_ERROR, aac.CANCEL, null}, 1340779826, -1340779774, System.identityHashCode(aahVar));
            throw null;
        }
    }

    public static /* synthetic */ void G(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = i10 & 61;
        int i12 = (i11 - (~(-(-((i10 ^ 61) | i11))))) - 1;
        Y0 = i12 % 128;
        if (i12 % 2 == 0) {
            setX(new Object[]{aahVar, Boolean.FALSE, zd.setY}, 814360318, -814360318, System.identityHashCode(aahVar));
        } else {
            setX(new Object[]{aahVar, Boolean.TRUE, zd.setY}, 814360318, -814360318, System.identityHashCode(aahVar));
        }
        int i13 = X0 + 125;
        Y0 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void H(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = Y0;
        int i11 = (((i10 & (-24)) | ((~i10) & 23)) - (~(-(-((i10 & 23) << 1))))) - 1;
        int i12 = i11 % 128;
        X0 = i12;
        int i13 = i11 % 2;
        aahVar.f52055t0 = iIntValue;
        int i14 = i12 | 7;
        int i15 = ((i14 << 1) - (~(-(i14 & (~(i12 & 7)))))) - 1;
        Y0 = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 20 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.mypinpad.tsdk.i.aah] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    public static /* synthetic */ void I(Object[] objArr) {
        int i10 = 0;
        ?? r1 = (aah) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i11 = Y0;
        int i12 = ((i11 & (-64)) | ((~i11) & 63)) + ((i11 & 63) << 1);
        X0 = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                r1.T0.setCompoundDrawableTintBlendMode(zBooleanValue, iIntValue, iIntValue2);
                int i13 = 99 / 0;
            } else {
                r1.T0.setCompoundDrawableTintBlendMode(zBooleanValue, iIntValue, iIntValue2);
            }
            int i14 = Y0;
            int i15 = i14 & 125;
            i10 = ((i14 ^ 125) | i15) << 1;
            int i16 = -((i14 | 125) & (~i15));
            int i17 = (i10 & i16) + (i16 | i10);
            X0 = i17 % 128;
            r1 = i17 % 2;
        } catch (IOException e5) {
            ?? r3 = new Object[2];
            r3[i10] = r1;
            r3[1] = e5;
            setX(r3, -1546249966, 1546250011, System.identityHashCode(r1));
        }
    }

    public static /* synthetic */ aak J(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = X0;
        int i11 = (i10 & (-50)) | ((~i10) & 49);
        int i12 = (i10 & 49) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        Y0 = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        aak aakVar = (aak) setX(new Object[]{aahVar, list, Boolean.valueOf(zBooleanValue)}, -1583780599, 1583780628, System.identityHashCode(aahVar));
        int i14 = Y0;
        int i15 = (i14 & 65) + (i14 | 65);
        X0 = i15 % 128;
        if (i15 % 2 == 0) {
            return aakVar;
        }
        throw null;
    }

    public static final /* synthetic */ Set UiMessageCallbackKtWhenMappings(aah aahVar) {
        return (Set) setX(new Object[]{aahVar}, -1476138883, 1476138917, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ LinkedHashSet a(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = i10 + 85;
        Y0 = i11 % 128;
        int i12 = i11 % 2;
        LinkedHashSet linkedHashSet = aahVar.V0;
        int i13 = i10 ^ 73;
        int i14 = (i10 & 73) << 1;
        int i15 = (i13 & i14) + (i14 | i13);
        Y0 = i15 % 128;
        if (i15 % 2 != 0) {
            return linkedHashSet;
        }
        throw null;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        aac aacVar = (aac) objArr[2];
        Intrinsics.checkNotNullParameter(aacVar, "");
        ze zeVar = aahVar.f52059y0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aahVar.f52054s0);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(iIntValue);
        sb2.append("] onReset");
        ze.setY(new Object[]{zeVar, new setOnDragListener(sb2.toString(), aahVar, iIntValue, aacVar), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
        int i10 = X0;
        int i11 = ((i10 & 16) + (i10 | 16)) - 1;
        Y0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Long c(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0 + 125;
        X0 = i10 % 128;
        if (i10 % 2 == 0) {
            return Long.valueOf(aahVar.K0);
        }
        long j10 = aahVar.K0;
        throw null;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = X0;
        int i11 = (((i10 | 110) << 1) - (i10 ^ 110)) - 1;
        Y0 = i11 % 128;
        int i12 = i11 % 2;
        aahVar.H0 = jLongValue;
        if (i12 == 0) {
            throw null;
        }
        int i13 = (i10 ^ 61) + ((i10 & 61) << 1);
        Y0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Long e(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0;
        int i11 = i10 & 35;
        int i12 = ((((i10 ^ 35) | i11) << 1) - (~(-((i10 | 35) & (~i11))))) - 1;
        int i13 = i12 % 128;
        X0 = i13;
        if (i12 % 2 != 0) {
            long j10 = aahVar.G0;
            throw null;
        }
        long j11 = aahVar.G0;
        int i14 = (i13 ^ 55) + ((i13 & 55) << 1);
        Y0 = i14 % 128;
        if (i14 % 2 != 0) {
            return Long.valueOf(j11);
        }
        int i15 = 39 / 0;
        return Long.valueOf(j11);
    }

    public static /* synthetic */ void f(Object[] objArr) throws IOException {
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        aac aacVar = (aac) objArr[2];
        int i10 = X0;
        int i11 = ((i10 | 89) << 1) - (i10 ^ 89);
        Y0 = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aacVar, "");
            aahVar.T0.setY(iIntValue, aacVar);
            int i12 = 25 / 0;
        } else {
            Intrinsics.checkNotNullParameter(aacVar, "");
            aahVar.T0.setY(iIntValue, aacVar);
        }
        int i13 = X0;
        int i14 = ((i13 | 105) << 1) - (i13 ^ 105);
        Y0 = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Long g(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0 + 93;
        X0 = i10 % 128;
        if (i10 % 2 == 0) {
            return Long.valueOf(aahVar.J0);
        }
        long j10 = aahVar.J0;
        throw null;
    }

    public static /* synthetic */ void h(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        synchronized (aahVar) {
            long j10 = aahVar.J0;
            long j11 = aahVar.I0;
            if (j10 < j11) {
                return;
            }
            aahVar.I0 = j11 + 1;
            aahVar.L0 = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            ze zeVar = aahVar.f52058x0;
            ze.setY(new Object[]{zeVar, new getNavBarTitleString(Intrinsics.stringPlus(aahVar.f52054s0, " ping"), aahVar), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0;
        int i11 = ((i10 ^ 95) | (i10 & 95)) << 1;
        int i12 = -(((~i10) & 95) | (i10 & (-96)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        X0 = i14;
        int i15 = i13 % 2;
        aahVar.v0 = true;
        int i16 = (i14 & 75) + (i14 | 75);
        Y0 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ ze j(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = ((i10 | 19) << 1) - (i10 ^ 19);
        Y0 = i11 % 128;
        int i12 = i11 % 2;
        ze zeVar = aahVar.f52058x0;
        int i13 = i10 + 33;
        Y0 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 42 / 0;
        }
        return zeVar;
    }

    public static /* synthetic */ void k(Object[] objArr) throws IOException {
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        aby abyVar = (aby) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Intrinsics.checkNotNullParameter(abyVar, "");
        abx abxVar = new abx();
        long j10 = iIntValue2;
        abyVar.setCompoundDrawableTintBlendMode(j10);
        abyVar.setY(abxVar, j10);
        ze zeVar = aahVar.f52059y0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aahVar.f52054s0);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(iIntValue);
        sb2.append("] onData");
        ze.setY(new Object[]{zeVar, new setX(sb2.toString(), aahVar, iIntValue, abxVar, iIntValue2, zBooleanValue), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
        int i10 = Y0;
        int i11 = i10 & 119;
        int i12 = (i10 | 119) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        X0 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        aac aacVar = (aac) objArr[1];
        Intrinsics.checkNotNullParameter(aacVar, "");
        synchronized (aahVar.T0) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (aahVar) {
                if (aahVar.v0) {
                    return;
                }
                aahVar.v0 = true;
                intRef.element = ((Integer) setX(new Object[]{aahVar}, 2027801255, -2027801254, System.identityHashCode(aahVar))).intValue();
                Unit unit = Unit.INSTANCE;
                ((aag) setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar))).setX(intRef.element, aacVar, yt.setX);
            }
        }
    }

    public static /* synthetic */ Integer m(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = (i10 & 73) + (i10 | 73);
        int i12 = i11 % 128;
        Y0 = i12;
        int i13 = i11 % 2;
        int i14 = aahVar.f52056u0;
        int i15 = i12 & 95;
        int i16 = (i12 ^ 95) | i15;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        X0 = i17 % 128;
        if (i17 % 2 == 0) {
            return Integer.valueOf(i14);
        }
        int i18 = 43 / 0;
        return Integer.valueOf(i14);
    }

    public static /* synthetic */ void n(Object[] objArr) throws IOException {
        int iMin;
        long j10;
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        abx abxVar = (abx) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        if (jLongValue == 0) {
            aahVar.T0.setX(zBooleanValue, iIntValue, abxVar, 0);
            return;
        }
        for (long j11 = 0; jLongValue > j11; j11 = 0) {
            synchronized (aahVar) {
                while (((Long) setX(new Object[]{aahVar}, -1588280519, 1588280546, System.identityHashCode(aahVar))).longValue() >= ((Long) setX(new Object[]{aahVar}, 374167882, -374167857, System.identityHashCode(aahVar))).longValue()) {
                    try {
                        try {
                            if (!((Map) setX(new Object[]{aahVar}, -643248191, 643248193, System.identityHashCode(aahVar))).containsKey(Integer.valueOf(iIntValue))) {
                                throw new IOException("stream closed");
                            }
                            aahVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                int iMin2 = (int) Math.min(jLongValue, ((Long) setX(new Object[]{aahVar}, 374167882, -374167857, System.identityHashCode(aahVar))).longValue() - ((Long) setX(new Object[]{aahVar}, -1588280519, 1588280546, System.identityHashCode(aahVar))).longValue());
                aag aagVar = (aag) setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar));
                iMin = Math.min(iMin2, ((Integer) aag.setY(new Object[]{aagVar}, -232905700, 232905702, System.identityHashCode(aagVar))).intValue());
                j10 = iMin;
                aahVar.Q0 = ((Long) setX(new Object[]{aahVar}, -1588280519, 1588280546, System.identityHashCode(aahVar))).longValue() + j10;
                Unit unit = Unit.INSTANCE;
            }
            jLongValue -= j10;
            aahVar.T0.setX(zBooleanValue && jLongValue == 0, iIntValue, abxVar, iMin);
        }
    }

    public static /* synthetic */ void o(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = X0 + 31;
        Y0 = i10 % 128;
        int i11 = i10 % 2;
        aahVar.R0 = jLongValue;
        if (i11 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ aam p(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0;
        int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
        X0 = i11 % 128;
        int i12 = i11 % 2;
        aam aamVar = aahVar.M0;
        if (i12 == 0) {
            return aamVar;
        }
        throw null;
    }

    public static /* synthetic */ String q(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0;
        int i11 = (i10 & (-24)) | ((~i10) & 23);
        int i12 = (i10 & 23) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        X0 = i13 % 128;
        int i14 = i13 % 2;
        String str = aahVar.f52054s0;
        if (i14 != 0) {
            int i15 = 65 / 0;
        }
        return str;
    }

    public static /* synthetic */ void r(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        List list = (List) objArr[2];
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (aahVar) {
            if (aahVar.V0.contains(Integer.valueOf(iIntValue))) {
                setX(new Object[]{aahVar, Integer.valueOf(iIntValue), aac.PROTOCOL_ERROR}, -1642947737, 1642947747, iIntValue);
                return;
            }
            aahVar.V0.add(Integer.valueOf(iIntValue));
            ze zeVar = aahVar.f52059y0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aahVar.f52054s0);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(iIntValue);
            sb2.append("] onRequest");
            ze.setY(new Object[]{zeVar, new setOnLongClickListener(sb2.toString(), aahVar, iIntValue, list), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
        }
    }

    public static /* synthetic */ zd s(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0 + 77;
        int i11 = i10 % 128;
        X0 = i11;
        int i12 = i10 % 2;
        zd zdVar = aahVar.f52057w0;
        int i13 = ((i11 ^ 80) + ((i11 & 80) << 1)) - 1;
        Y0 = i13 % 128;
        if (i13 % 2 != 0) {
            return zdVar;
        }
        throw null;
    }

    public static final /* synthetic */ aam setIncludeFontPadding() {
        return (aam) setX(new Object[0], 85248939, -85248927, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        Object[] array;
        aag aagVar;
        int i13;
        int i14 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
        int i15 = ~i10;
        int i16 = ~i12;
        switch (((~(i11 | i16)) * 301) + (((~(i10 | i16 | i11)) | (~(i12 | i15)) | (~((~i11) | i15))) * (-301)) + (((~(i15 | i16)) | i11) * (-602)) + i14) {
            case 1:
                aah aahVar = (aah) objArr[0];
                int i17 = Y0;
                int i18 = i17 & 43;
                int i19 = (i18 - (~((i17 ^ 43) | i18))) - 1;
                int i20 = i19 % 128;
                X0 = i20;
                int i21 = i19 % 2;
                int i22 = aahVar.f52055t0;
                int i23 = i20 & 123;
                int i24 = ((i20 ^ 123) | i23) << 1;
                int i25 = -((i20 | 123) & (~i23));
                int i26 = (i24 & i25) + (i25 | i24);
                Y0 = i26 % 128;
                int i27 = i26 % 2;
                return Integer.valueOf(i22);
            case 2:
                return z(objArr);
            case 3:
                aah aahVar2 = (aah) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i28 = X0;
                int i29 = (-2) - ((((i28 | 34) << 1) - (i28 ^ 34)) ^ (-1));
                int i30 = i29 % 128;
                Y0 = i30;
                int i31 = i29 % 2;
                aahVar2.K0 = jLongValue;
                int i32 = i30 & 79;
                int i33 = (((i30 ^ 79) | i32) << 1) - ((~i32) & (i30 | 79));
                X0 = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 4:
                H(objArr);
                return null;
            case 5:
                return m(objArr);
            case 6:
                I(objArr);
                return null;
            case 7:
                aah aahVar3 = (aah) objArr[0];
                int i35 = Y0;
                int i36 = (i35 ^ 71) + ((i35 & 71) << 1);
                int i37 = i36 % 128;
                X0 = i37;
                int i38 = i36 % 2;
                boolean z10 = aahVar3.v0;
                int i39 = i37 + 109;
                Y0 = i39 % 128;
                int i40 = i39 % 2;
                return Boolean.valueOf(z10);
            case 8:
                A(objArr);
                return null;
            case 9:
                return s(objArr);
            case 10:
                x(objArr);
                return null;
            case 11:
                d(objArr);
                return null;
            case 12:
                return w();
            case 13:
                i(objArr);
                return null;
            case 14:
                r(objArr);
                return null;
            case 15:
                b(objArr);
                return null;
            case 16:
                return J(objArr);
            case 17:
                return D(objArr);
            case 18:
                k(objArr);
                return null;
            case 19:
                E(objArr);
                return null;
            case 20:
                l(objArr);
                return null;
            case 21:
                aah aahVar4 = (aah) objArr[0];
                int i41 = Y0;
                int i42 = (((i41 & (-60)) | ((~i41) & 59)) - (~(-(-((i41 & 59) << 1))))) - 1;
                int i43 = i42 % 128;
                X0 = i43;
                int i44 = i42 % 2;
                aam aamVar = aahVar4.N0;
                int i45 = i43 & 11;
                int i46 = ((((i43 ^ 11) | i45) << 1) - (~(-((i43 | 11) & (~i45))))) - 1;
                Y0 = i46 % 128;
                int i47 = i46 % 2;
                return aamVar;
            case 22:
                return c(objArr);
            case 23:
                return y(objArr);
            case 24:
                aah aahVar5 = (aah) objArr[0];
                int i48 = Y0;
                int i49 = ((((i48 ^ 115) | (i48 & 115)) << 1) - (~(-(((~i48) & 115) | (i48 & (-116)))))) - 1;
                int i50 = i49 % 128;
                X0 = i50;
                int i51 = i49 % 2;
                boolean z11 = aahVar5.f52051p0;
                int i52 = i50 | 53;
                int i53 = (i52 << 1) - ((~(i50 & 53)) & i52);
                Y0 = i53 % 128;
                int i54 = i53 % 2;
                return Boolean.valueOf(z11);
            case 25:
                return t(objArr);
            case 26:
                return p(objArr);
            case 27:
                aah aahVar6 = (aah) objArr[0];
                int i55 = X0;
                int i56 = ((i55 | 11) << 1) - (i55 ^ 11);
                Y0 = i56 % 128;
                int i57 = i56 % 2;
                long j10 = aahVar6.Q0;
                int i58 = i55 & 59;
                int i59 = (i55 ^ 59) | i58;
                int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                Y0 = i60 % 128;
                int i61 = i60 % 2;
                return Long.valueOf(j10);
            case 28:
                f(objArr);
                return null;
            case 29:
                return u(objArr);
            case 30:
                return v(objArr);
            case 31:
                G(objArr);
                return null;
            case 32:
                return g(objArr);
            case 33:
                n(objArr);
                return null;
            case 34:
                return a(objArr);
            case 35:
                aah aahVar7 = (aah) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                List list = (List) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                Intrinsics.checkNotNullParameter(list, "");
                ze zeVar = aahVar7.f52059y0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aahVar7.f52054s0);
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(iIntValue);
                sb2.append("] onHeaders");
                ze.setY(new Object[]{zeVar, new setNavigationOnClickListener(sb2.toString(), aahVar7, iIntValue, list, zBooleanValue), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
                int i62 = Y0;
                int i63 = i62 & 29;
                int i64 = (i62 ^ 29) | i63;
                int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                X0 = i65 % 128;
                int i66 = i65 % 2;
                return null;
            case 36:
                F(objArr);
                return null;
            case 37:
                C(objArr);
                return null;
            case 38:
                h(objArr);
                return null;
            case 39:
                o(objArr);
                return null;
            case 40:
                return j(objArr);
            case 41:
                return B(objArr);
            case 42:
                aah aahVar8 = (aah) objArr[0];
                int i67 = Y0;
                int i68 = i67 & 107;
                int i69 = (((i67 | 107) & (~i68)) - (~(-(-(i68 << 1))))) - 1;
                int i70 = i69 % 128;
                X0 = i70;
                int i71 = i69 % 2;
                Socket socket = aahVar8.S0;
                int i72 = ((i70 ^ 17) | (i70 & 17)) << 1;
                int i73 = -((i70 & (-18)) | ((~i70) & 17));
                int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
                Y0 = i74 % 128;
                int i75 = i74 % 2;
                return socket;
            case 43:
                return q(objArr);
            case 44:
                return e(objArr);
            case 45:
                aah aahVar9 = (aah) objArr[0];
                IOException iOException = (IOException) objArr[1];
                int i76 = X0;
                int i77 = i76 | 77;
                int i78 = (i77 << 1) - ((~(i76 & 77)) & i77);
                Y0 = i78 % 128;
                int i79 = i78 % 2;
                aac aacVar = aac.PROTOCOL_ERROR;
                setX(new Object[]{aahVar9, aacVar, aacVar, iOException}, 1340779826, -1340779774, System.identityHashCode(aahVar9));
                int i80 = X0;
                int i81 = ((i80 ^ 11) | (i80 & 11)) << 1;
                int i82 = -(((~i80) & 11) | (i80 & (-12)));
                int i83 = (i81 & i82) + (i82 | i81);
                Y0 = i83 % 128;
                if (i83 % 2 != 0) {
                    return null;
                }
                int i84 = 94 / 0;
                return null;
            case 46:
                int iIntValue2 = ((Number) objArr[0]).intValue();
                int i85 = X0;
                int i86 = ((i85 | 3) << 1) - (i85 ^ 3);
                Y0 = i86 % 128;
                if (i86 % 2 == 0) {
                    throw null;
                }
                if (iIntValue2 == 0 || (iIntValue2 & 1) != 0) {
                    int i87 = ((i85 ^ 31) | (i85 & 31)) << 1;
                    int i88 = -(((~i85) & 31) | (i85 & (-32)));
                    int i89 = (i87 ^ i88) + ((i87 & i88) << 1);
                    Y0 = i89 % 128;
                    int i90 = i89 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i91 = (i85 & 59) + (i85 | 59);
                    Y0 = i91 % 128;
                    int i92 = i91 % 2;
                    int i93 = i85 & 119;
                    int i94 = -(-((i85 ^ 119) | i93));
                    int i95 = (i93 & i94) + (i93 | i94);
                    Y0 = i95 % 128;
                    int i96 = i95 % 2;
                    objValueOf = Boolean.TRUE;
                }
                break;
                break;
            case 47:
                aah aahVar10 = (aah) objArr[0];
                IOException iOException2 = (IOException) objArr[1];
                int i97 = X0;
                int i98 = i97 & 117;
                int i99 = i98 + ((i97 ^ 117) | i98);
                Y0 = i99 % 128;
                int i100 = i99 % 2;
                setX(new Object[]{aahVar10, iOException2}, -1546249966, 1546250011, System.identityHashCode(aahVar10));
                int i101 = Y0 + 57;
                X0 = i101 % 128;
                int i102 = i101 % 2;
                return null;
            case 48:
                aah aahVar11 = (aah) objArr[0];
                int i103 = Y0 + 93;
                X0 = i103 % 128;
                if (i103 % 2 != 0) {
                    aahVar11.T0.setY();
                    int i104 = 24 / 0;
                } else {
                    aahVar11.T0.setY();
                }
                int i105 = X0;
                int i106 = i105 & 109;
                int i107 = i106 + ((i105 ^ 109) | i106);
                Y0 = i107 % 128;
                if (i107 % 2 != 0) {
                    return null;
                }
                int i108 = 24 / 0;
                return null;
            case 49:
                aah aahVar12 = (aah) objArr[0];
                aam aamVar2 = (aam) objArr[1];
                int i109 = Y0;
                int i110 = i109 & 33;
                int i111 = (i109 | 33) & (~i110);
                int i112 = i110 << 1;
                int i113 = (i111 & i112) + (i111 | i112);
                X0 = i113 % 128;
                int i114 = i113 % 2;
                Intrinsics.checkNotNullParameter(aamVar2, "");
                aahVar12.N0 = aamVar2;
                int i115 = Y0 + 7;
                X0 = i115 % 128;
                int i116 = i115 % 2;
                return null;
            case 50:
                aah aahVar13 = (aah) objArr[0];
                int i117 = Y0;
                int i118 = i117 ^ 65;
                int i119 = -(-((i117 & 65) << 1));
                int i120 = (i118 & i119) + (i119 | i118);
                X0 = i120 % 128;
                int i121 = i120 % 2;
                long j11 = aahVar13.H0;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i122 = ~(1257370498 | iCurrentTimeMillis);
                int i123 = (-2014095776) ^ i122;
                int i124 = i122 & (-2014095776);
                int i125 = ((i124 & i123) | (i123 ^ i124)) * (-668);
                int i126 = (1665479629 ^ i125) + ((i125 & 1665479629) << 1);
                int i127 = (-2014095776) & iCurrentTimeMillis;
                int i128 = (~i127) & ((-2014095776) | iCurrentTimeMillis);
                int i129 = ~iCurrentTimeMillis;
                int i130 = ~((i127 & i128) | (i128 ^ i127));
                int i131 = ((~i130) & 1257370498) | (i130 & (-1257370499));
                int i132 = i130 & 1257370498;
                int i133 = (i126 - (~(-(~(((i132 & i131) | (i131 ^ i132)) * 1336))))) - 2;
                int i134 = (1257370498 & i129) | (iCurrentTimeMillis & (-1257370499));
                int i135 = iCurrentTimeMillis & 1257370498;
                int i136 = (i135 & i134) | (i134 ^ i135);
                int i137 = -(-(((i136 & (-2014095776)) | (2014095775 & i136) | ((~i136) & (-2014095776))) * 668));
                int i138 = ((((i133 ^ i137) | (i133 & i137)) << 1) - (~(-((i137 & (~i133)) | ((~i137) & i133))))) - 1;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i139 = ~iCurrentTimeMillis2;
                int i140 = ~((iCurrentTimeMillis2 & 1772878558) | (1772878558 & i139) | ((-1772878559) & iCurrentTimeMillis2));
                int i141 = 1084281552 ^ i140;
                int i142 = i140 & 1084281552;
                int i143 = ((i142 & i141) | (i141 ^ i142)) * 501;
                int i144 = 1036179004 & i143;
                int i145 = (i144 + ((i143 ^ 1036179004) | i144)) - (-772372260);
                int i146 = 1219162836 ^ i139;
                int i147 = 1219162836 & i139;
                int i148 = (i147 & i146) | (i146 ^ i147);
                int i149 = i148 & 1637997274;
                int i150 = (~(((i148 | 1637997274) & (~i149)) | i149)) * 501;
                int i151 = ((i145 ^ i150) | (i145 & i150)) << 1;
                int i152 = -((i150 & (~i145)) | ((~i150) & i145));
                if (i138 > (i151 & i152) + (i152 | i151)) {
                    int i153 = 94 / 0;
                }
                objValueOf = Long.valueOf(j11);
                break;
            case 51:
                aah aahVar14 = (aah) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                long jLongValue2 = ((Number) objArr[2]).longValue();
                ze zeVar2 = aahVar14.f52058x0;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(aahVar14.f52054s0);
                sb3.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb3.append(iIntValue3);
                sb3.append("] windowUpdate");
                ze.setY(new Object[]{zeVar2, new setAlwaysDrawnWithCacheEnabled(sb3.toString(), aahVar14, iIntValue3, jLongValue2), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar2));
                int i154 = Y0;
                int i155 = (i154 & (-104)) | ((~i154) & 103);
                int i156 = -(-((i154 & 103) << 1));
                int i157 = (i155 & i156) + (i156 | i155);
                X0 = i157 % 128;
                int i158 = i157 % 2;
                return null;
            case 52:
                aah aahVar15 = (aah) objArr[0];
                aac aacVar2 = (aac) objArr[1];
                aac aacVar3 = (aac) objArr[2];
                IOException iOException3 = (IOException) objArr[3];
                Intrinsics.checkNotNullParameter(aacVar2, "");
                Intrinsics.checkNotNullParameter(aacVar3, "");
                if (yt.setOnFocusChangeListener && Thread.holdsLock(aahVar15)) {
                    StringBuilder sb4 = new StringBuilder("Thread ");
                    sb4.append((Object) Thread.currentThread().getName());
                    sb4.append(" MUST NOT hold lock on ");
                    sb4.append(aahVar15);
                    throw new AssertionError(sb4.toString());
                }
                try {
                    setX(new Object[]{aahVar15, aacVar2}, 1993021213, -1993021193, System.identityHashCode(aahVar15));
                    break;
                } catch (IOException unused) {
                }
                synchronized (aahVar15) {
                    try {
                        if (!((Map) setX(new Object[]{aahVar15}, -643248191, 643248193, System.identityHashCode(aahVar15))).isEmpty()) {
                            array = ((Map) setX(new Object[]{aahVar15}, -643248191, 643248193, System.identityHashCode(aahVar15))).values().toArray(new aak[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            ((Map) setX(new Object[]{aahVar15}, -643248191, 643248193, System.identityHashCode(aahVar15))).clear();
                        } else {
                            array = null;
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                aak[] aakVarArr = (aak[]) array;
                if (aakVarArr != null) {
                    for (aak aakVar : aakVarArr) {
                        try {
                            aak.setOnFocusChangeListener(new Object[]{aakVar, aacVar3, iOException3}, 1944285140, -1944285130, System.identityHashCode(aakVar));
                        } catch (IOException unused2) {
                        }
                    }
                }
                try {
                    ((aag) setX(new Object[]{aahVar15}, -1210245302, 1210245319, System.identityHashCode(aahVar15))).close();
                    break;
                } catch (IOException unused3) {
                }
                try {
                    ((Socket) setX(new Object[]{aahVar15}, -477782667, 477782709, System.identityHashCode(aahVar15))).close();
                    break;
                } catch (IOException unused4) {
                }
                ze zeVar3 = aahVar15.f52058x0;
                ze.setY(new Object[]{zeVar3}, -596759090, 596759102, System.identityHashCode(zeVar3));
                ze zeVar4 = aahVar15.f52059y0;
                ze.setY(new Object[]{zeVar4}, -596759090, 596759102, System.identityHashCode(zeVar4));
                ze zeVar5 = aahVar15.E0;
                ze.setY(new Object[]{zeVar5}, -596759090, 596759102, System.identityHashCode(zeVar5));
                return null;
            default:
                aah aahVar16 = (aah) objArr[0];
                ((Boolean) objArr[1]).booleanValue();
                zd zdVar = (zd) objArr[2];
                int i159 = X0;
                int i160 = i159 ^ 105;
                int i161 = -(-((i159 & 105) << 1));
                int i162 = (i160 ^ i161) + ((i161 & i160) << 1);
                Y0 = i162 % 128;
                if (i162 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(zdVar, "");
                    aahVar16.T0.setOnFocusChangeListener();
                    aag aagVar2 = aahVar16.T0;
                    aam aamVar3 = aahVar16.M0;
                    aagVar2.setCompoundDrawableTintBlendMode(aamVar3);
                    ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar3}, -1082853585, 1082853592, System.identityHashCode(aamVar3))).intValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(zdVar, "");
                aahVar16.T0.setOnFocusChangeListener();
                aag aagVar3 = aahVar16.T0;
                aam aamVar4 = aahVar16.M0;
                aagVar3.setCompoundDrawableTintBlendMode(aamVar4);
                int iIntValue4 = ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar4}, -1082853585, 1082853592, System.identityHashCode(aamVar4))).intValue();
                if (iIntValue4 != 65535) {
                    int i163 = Y0;
                    int i164 = ((i163 & (-94)) | ((~i163) & 93)) + ((i163 & 93) << 1);
                    X0 = i164 % 128;
                    if (i164 % 2 != 0) {
                        aagVar = aahVar16.T0;
                        i13 = iIntValue4 >>> 65535;
                    } else {
                        aagVar = aahVar16.T0;
                        i13 = iIntValue4 - 65535;
                    }
                    aagVar.setOnFocusChangeListener(0, i13);
                }
                ze zeVar6 = (ze) zd.setOnFocusChangeListener(new Object[]{zdVar}, -1673899270, 1673899275, System.identityHashCode(zdVar));
                ze.setY(new Object[]{zeVar6, new ze.setOnFocusChangeListener(aahVar16.f52054s0, aahVar16.U0), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar6));
                int i165 = Y0 + 29;
                X0 = i165 % 128;
                if (i165 % 2 == 0) {
                    return null;
                }
                throw null;
        }
        return objValueOf;
    }

    public static final /* synthetic */ aan setZ(aah aahVar) {
        return (aan) setX(new Object[]{aahVar}, -1813093563, 1813093586, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Long t(Object[] objArr) {
        long j10;
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = i10 & 111;
        int i12 = (i11 - (~((i10 ^ 111) | i11))) - 1;
        Y0 = i12 % 128;
        if (i12 % 2 == 0) {
            j10 = aahVar.R0;
            int i13 = 49 / 0;
        } else {
            j10 = aahVar.R0;
        }
        return Long.valueOf(j10);
    }

    public static /* synthetic */ aak u(Object[] objArr) throws IOException {
        int iIntValue;
        aak aakVar;
        boolean z10;
        aah aahVar = (aah) objArr[0];
        List<aab> list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean z11 = !zBooleanValue;
        synchronized (aahVar.T0) {
            synchronized (aahVar) {
                try {
                    if (((Integer) setX(new Object[]{aahVar}, 617040195, -617040190, System.identityHashCode(aahVar))).intValue() > 1073741823) {
                        setX(new Object[]{aahVar, aac.REFUSED_STREAM}, 1993021213, -1993021193, System.identityHashCode(aahVar));
                    }
                    if (aahVar.v0) {
                        throw new aad();
                    }
                    iIntValue = ((Integer) setX(new Object[]{aahVar}, 617040195, -617040190, System.identityHashCode(aahVar))).intValue();
                    int iIntValue2 = ((Integer) setX(new Object[]{aahVar}, 617040195, -617040190, System.identityHashCode(aahVar))).intValue() + 2;
                    setX(new Object[]{aahVar, Integer.valueOf(iIntValue2)}, 15488506, -15488487, iIntValue2);
                    aakVar = new aak(iIntValue, aahVar, z11, false, null);
                    z10 = !zBooleanValue || ((Long) setX(new Object[]{aahVar}, -1588280519, 1588280546, System.identityHashCode(aahVar))).longValue() >= ((Long) setX(new Object[]{aahVar}, 374167882, -374167857, System.identityHashCode(aahVar))).longValue() || ((Long) aak.setOnFocusChangeListener(new Object[]{aakVar}, 269929162, -269929144, System.identityHashCode(aakVar))).longValue() >= ((Long) aak.setOnFocusChangeListener(new Object[]{aakVar}, -910961715, 910961735, System.identityHashCode(aakVar))).longValue();
                    if (aakVar.setTextAlignment()) {
                        ((Map) setX(new Object[]{aahVar}, -643248191, 643248193, System.identityHashCode(aahVar))).put(Integer.valueOf(iIntValue), aakVar);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ((aag) setX(new Object[]{aahVar}, -1210245302, 1210245319, System.identityHashCode(aahVar))).setCompoundDrawableTintBlendMode(z11, iIntValue, list);
        }
        if (z10) {
            aahVar.T0.setY();
        }
        return aakVar;
    }

    public static /* synthetic */ setCompoundDrawableTintBlendMode v(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0;
        int i11 = (i10 & 87) + (i10 | 87);
        X0 = i11 % 128;
        int i12 = i11 % 2;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = aahVar.f52052q0;
        if (i12 == 0) {
            return setcompounddrawabletintblendmode;
        }
        throw null;
    }

    public static /* synthetic */ aam w() {
        int i10 = Y0;
        int i11 = i10 ^ 57;
        int i12 = ((((i10 & 57) | i11) << 1) - (~(-i11))) - 1;
        X0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        int i13 = i10 & 17;
        int i14 = ((i10 ^ 17) | i13) << 1;
        int i15 = -((i10 | 17) & (~i13));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        X0 = i16 % 128;
        int i17 = i16 % 2;
        return W0;
    }

    public static /* synthetic */ void x(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        aac aacVar = (aac) objArr[2];
        Intrinsics.checkNotNullParameter(aacVar, "");
        ze zeVar = aahVar.f52058x0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aahVar.f52054s0);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(iIntValue);
        sb2.append("] writeSynReset");
        ze.setY(new Object[]{zeVar, new setZ(sb2.toString(), aahVar, iIntValue, aacVar), 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar));
        int i10 = X0;
        int i11 = i10 & 99;
        int i12 = (i10 ^ 99) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        Y0 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 99 / 0;
        }
    }

    public static /* synthetic */ aan y(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = X0;
        int i11 = i10 & 67;
        int i12 = ((i10 ^ 67) | i11) << 1;
        int i13 = -((i10 | 67) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        Y0 = i15;
        int i16 = i14 % 2;
        aan aanVar = aahVar.F0;
        if (i16 == 0) {
            int i17 = 30 / 0;
        }
        int i18 = i15 ^ 125;
        int i19 = ((i15 & 125) | i18) << 1;
        int i20 = -i18;
        int i21 = (i19 & i20) + (i20 | i19);
        X0 = i21 % 128;
        int i22 = i21 % 2;
        return aanVar;
    }

    public static /* synthetic */ LinkedHashMap z(Object[] objArr) {
        aah aahVar = (aah) objArr[0];
        int i10 = Y0;
        int i11 = (i10 & 69) + (i10 | 69);
        X0 = i11 % 128;
        int i12 = i11 % 2;
        LinkedHashMap linkedHashMap = aahVar.f52053r0;
        if (i12 != 0) {
            int i13 = 76 / 0;
        }
        int iIdentityHashCode = System.identityHashCode(aahVar);
        int i14 = ~iIdentityHashCode;
        int i15 = 1537079103 & i14;
        int i16 = (1537079103 | i14) & (~i15);
        int i17 = -(-(((i16 & i15) | (i16 ^ i15)) * (-369)));
        int i18 = (1803381888 & i17) + (i17 | 1803381888);
        int i19 = (-276878144) ^ i14;
        int i20 = (-276878144) & i14;
        int i21 = (i19 & i20) | (i19 ^ i20);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = ((i23 & 1260254465) | ((~i23) & 1260254465) | ((-1260254466) & i23)) * (-369);
        int i25 = ((i18 ^ i24) | (i18 & i24)) << 1;
        int i26 = -((i24 & (~i18)) | ((~i24) & i18));
        int i27 = (i25 & i26) + (i26 | i25);
        int i28 = (276878143 & i14) | (iIdentityHashCode & (-276878144));
        int i29 = 276878143 & iIdentityHashCode;
        int i30 = ~((i28 & i29) | (i28 ^ i29));
        int i31 = (i30 & 1260200960) | ((~i30) & 1260200960) | ((-1260200961) & i30);
        int i32 = (iIdentityHashCode | i14) & i14;
        int i33 = ((~i32) & (-276878144)) | (276878143 & i32);
        int i34 = i32 & (-276878144);
        int i35 = (i34 & i33) | (i33 ^ i34);
        int i36 = i35 ^ 1260254465;
        int i37 = i35 & 1260254465;
        int i38 = ~((i37 & i36) | (i36 ^ i37));
        int i39 = i31 ^ i38;
        int i40 = i38 & i31;
        int i41 = -(-(((i40 & i39) | (i39 ^ i40)) * 369));
        int i42 = i27 ^ i41;
        int i43 = ((i41 & i27) | i42) << 1;
        int i44 = -i42;
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        int iIdentityHashCode2 = System.identityHashCode(aahVar);
        int i46 = ~iIdentityHashCode2;
        int i47 = (iIdentityHashCode2 | i46) & i46;
        int i48 = -(-((((-472384515) & i47) | ((-472384515) ^ i47)) * 494));
        int i49 = (-1534041420) & i48;
        int i50 = (i48 | (-1534041420)) & (~i49);
        int i51 = i49 << 1;
        int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
        int i53 = (1584943082 & i47) | ((~i47) & (-1584943083));
        int i54 = i47 & (-1584943083);
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = ~i55;
        int i57 = (i55 | i56) & i56;
        int i58 = (-1601826811) & i57;
        int i59 = (i57 | (-1601826811)) & (~i58);
        int i60 = (i59 & i58) | (i59 ^ i58);
        int i61 = i60 & 1112558568;
        int i62 = (i60 | 1112558568) & (~i61);
        int i63 = -(-(((i62 & i61) | (i62 ^ i61)) * 494));
        if (i45 <= (((i52 ^ i63) | (i52 & i63)) << 1) - ((i63 & (~i52)) | ((~i63) & i52))) {
            return linkedHashMap;
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setX(new Object[]{this}, 778241519, -778241483, System.identityHashCode(this));
    }

    @Nullable
    public final synchronized aak setDividerPadding(int i10) {
        aak aakVar;
        try {
            int i11 = X0;
            int i12 = ((i11 ^ 81) | (i11 & 81)) << 1;
            int i13 = -(((~i11) & 81) | (i11 & (-82)));
            int i14 = (i12 & i13) + (i13 | i12);
            Y0 = i14 % 128;
            if (i14 % 2 == 0) {
                aakVar = (aak) this.f52053r0.remove(Integer.valueOf(i10));
                notifyAll();
                int i15 = 81 / 0;
            } else {
                aakVar = (aak) this.f52053r0.remove(Integer.valueOf(i10));
                notifyAll();
            }
            int i16 = Y0;
            int i17 = i16 & 91;
            int i18 = (i16 | 91) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            X0 = i20 % 128;
            if (i20 % 2 == 0) {
                return aakVar;
            }
            int i21 = 85 / 0;
            return aakVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final synchronized aak setOnFocusChangeListener(int i10) {
        aak aakVar;
        int i11 = X0;
        int i12 = i11 & 49;
        int i13 = i12 + ((i11 ^ 49) | i12);
        Y0 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        aakVar = (aak) this.f52053r0.get(Integer.valueOf(i10));
        int i14 = Y0;
        int i15 = ((i14 ^ 9) | (i14 & 9)) << 1;
        int i16 = -(((~i14) & 9) | (i14 & (-10)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        X0 = i17 % 128;
        int i18 = i17 % 2;
        return aakVar;
    }

    public final void setTextAlignment() throws IOException {
        setX(new Object[]{this}, 1706538080, -1706538032, System.identityHashCode(this));
    }

    public final synchronized boolean setY(long j10) {
        int i10 = Y0;
        int i11 = i10 & 57;
        int i12 = -(-(i10 | 57));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        X0 = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (this.v0) {
            int i15 = i14 + 21;
            Y0 = i15 % 128;
            boolean z10 = i15 % 2 == 0;
            int i16 = i14 + 6;
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            Y0 = i17 % 128;
            int i18 = i17 % 2;
            return z10;
        }
        if (this.J0 < this.I0) {
            int i19 = i14 & 53;
            int i20 = i14 | 53;
            int i21 = (i19 & i20) + (i20 | i19);
            int i22 = i21 % 128;
            Y0 = i22;
            if (i21 % 2 == 0) {
                throw null;
            }
            if (j10 >= this.L0) {
                int i23 = i22 & 3;
                int i24 = (i22 ^ 3) | i23;
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                X0 = i25 % 128;
                int i26 = i25 % 2;
                return false;
            }
        }
        int i27 = Y0;
        int i28 = i27 & 7;
        int i29 = ((i27 ^ 7) | i28) << 1;
        int i30 = -((i27 | 7) & (~i28));
        int i31 = (i29 & i30) + (i30 | i29);
        X0 = i31 % 128;
        int i32 = i31 % 2;
        return true;
        throw th;
    }

    public static final /* synthetic */ ze setCompoundDrawableTintBlendMode(aah aahVar) {
        return (ze) setX(new Object[]{aahVar}, -233660903, 233660944, (int) System.currentTimeMillis());
    }

    @JvmName(name = "getWriter")
    @NotNull
    public final aag getNavBarTitleString() {
        return (aag) setX(new Object[]{this}, -1210245302, 1210245319, System.identityHashCode(this));
    }

    @JvmName(name = "getOkHttpSettings")
    @NotNull
    public final aam setLayoutAnimation() {
        return (aam) setX(new Object[]{this}, 579610465, -579610439, System.identityHashCode(this));
    }

    @JvmName(name = "getWriteBytesMaximum")
    public final long setNavigationOnClickListener() {
        return ((Long) setX(new Object[]{this}, 374167882, -374167857, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "getNextStreamId$okhttp")
    public final int setOnDragListener() {
        return ((Integer) setX(new Object[]{this}, 617040195, -617040190, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "getPeerSettings")
    @NotNull
    public final aam setOnLongClickListener() {
        return (aam) setX(new Object[]{this}, -2003530648, 2003530669, System.identityHashCode(this));
    }

    public final void setZ() {
        setX(new Object[]{this}, 1465015964, -1465015926, System.identityHashCode(this));
    }

    public static boolean setCompoundDrawableTintBlendMode(int i10) {
        return ((Boolean) setX(new Object[]{Integer.valueOf(i10)}, 2139219617, -2139219571, i10)).booleanValue();
    }

    public static final /* synthetic */ zd setOnFocusChangeListener(aah aahVar) {
        return (zd) setX(new Object[]{aahVar}, 1105619221, -1105619212, (int) System.currentTimeMillis());
    }

    public final void setCompoundDrawableTintBlendMode(int i10, boolean z10, @Nullable abx abxVar, long j10) throws IOException {
        setX(new Object[]{this, Integer.valueOf(i10), Boolean.valueOf(z10), abxVar, Long.valueOf(j10)}, 1454261949, -1454261916, i10);
    }

    public final void setOnFocusChangeListener(int i10, @NotNull List<aab> list) {
        setX(new Object[]{this, Integer.valueOf(i10), list}, 1141064144, -1141064130, i10);
    }

    @JvmName(name = "getClient$okhttp")
    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setX(new Object[]{this}, -979470142, 979470166, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final aak setOnFocusChangeListener(@NotNull List<aab> list, boolean z10) throws IOException {
        return (aak) setX(new Object[]{this, list, Boolean.valueOf(z10)}, -1090144113, 1090144129, System.identityHashCode(this));
    }

    @JvmName(name = "getLastGoodStreamId$okhttp")
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, 2027801255, -2027801254, System.identityHashCode(this))).intValue();
    }

    public final synchronized void setDividerPadding(long j10) {
        long j11;
        try {
            int i10 = Y0;
            int i11 = i10 & 97;
            int i12 = (i10 | 97) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            X0 = i14 % 128;
            if (i14 % 2 != 0) {
                long j12 = this.O0 + j10;
                this.O0 = j12;
                j11 = j12 * this.P0;
                aam aamVar = this.M0;
                if (j11 >= ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar}, -1082853585, 1082853592, System.identityHashCode(aamVar))).intValue() * 3) {
                    setX(new Object[]{this, 0, Long.valueOf(j11)}, -933000425, 933000476, 0);
                    this.P0 += j11;
                    int i15 = X0 + 99;
                    Y0 = i15 % 128;
                    int i16 = i15 % 2;
                }
                throw th;
            }
            long j13 = this.O0 + j10;
            this.O0 = j13;
            j11 = j13 - this.P0;
            aam aamVar2 = this.M0;
            if (j11 >= ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar2}, -1082853585, 1082853592, System.identityHashCode(aamVar2))).intValue() / 2) {
                setX(new Object[]{this, 0, Long.valueOf(j11)}, -933000425, 933000476, 0);
                this.P0 += j11;
                int i17 = X0 + 99;
                Y0 = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = X0;
            int i20 = i19 & 115;
            int i21 = ((i19 | 115) & (~i20)) + (i20 << 1);
            Y0 = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final /* synthetic */ ze setY(aah aahVar) {
        return (ze) setX(new Object[]{aahVar}, -1278050775, 1278050815, (int) System.currentTimeMillis());
    }

    public final void setY(int i10, @NotNull List<aab> list, boolean z10) {
        setX(new Object[]{this, Integer.valueOf(i10), list, Boolean.valueOf(z10)}, 821106256, -821106221, i10);
    }

    public final void setY(int i10, long j10) {
        setX(new Object[]{this, Integer.valueOf(i10), Long.valueOf(j10)}, -933000425, 933000476, i10);
    }

    public final void setY(int i10, @NotNull aac aacVar) {
        setX(new Object[]{this, Integer.valueOf(i10), aacVar}, -1642947737, 1642947747, i10);
    }

    @JvmName(name = "setPeerSettings")
    public final void setY(@NotNull aam aamVar) {
        setX(new Object[]{this, aamVar}, 2071261074, -2071261025, System.identityHashCode(this));
    }

    @JvmName(name = "setLastGoodStreamId$okhttp")
    public final void setY(int i10) {
        setX(new Object[]{this, Integer.valueOf(i10)}, 153833985, -153833981, i10);
    }

    @JvmName(name = "getListener$okhttp")
    @NotNull
    public final setCompoundDrawableTintBlendMode setY() {
        return (setCompoundDrawableTintBlendMode) setX(new Object[]{this}, 219087885, -219087855, System.identityHashCode(this));
    }

    public final void setDividerPadding(int i10, @NotNull aby abyVar, int i11, boolean z10) throws IOException {
        setX(new Object[]{this, Integer.valueOf(i10), abyVar, Integer.valueOf(i11), Boolean.valueOf(z10)}, -9305076, 9305094, i10);
    }

    public final void setDividerPadding(int i10, @NotNull aac aacVar) throws IOException {
        setX(new Object[]{this, Integer.valueOf(i10), aacVar}, -1687800830, 1687800858, i10);
    }

    @JvmName(name = "getStreams$okhttp")
    @NotNull
    public final Map<Integer, aak> setDividerPadding() {
        return (Map) setX(new Object[]{this}, -643248191, 643248193, System.identityHashCode(this));
    }

    public final void setX(int i10, @NotNull aac aacVar) {
        setX(new Object[]{this, Integer.valueOf(i10), aacVar}, -1991491085, 1991491100, i10);
    }

    public final void setX(@NotNull aac aacVar, @NotNull aac aacVar2, @Nullable IOException iOException) {
        setX(new Object[]{this, aacVar, aacVar2, iOException}, 1340779826, -1340779774, System.identityHashCode(this));
    }

    public final void setX(boolean z10, int i10, int i11) {
        setX(new Object[]{this, Boolean.valueOf(z10), Integer.valueOf(i10), Integer.valueOf(i11)}, 764065165, -764065159, i10);
    }

    @JvmName(name = "getConnectionName$okhttp")
    @NotNull
    public final String setX() {
        return (String) setX(new Object[]{this}, -715938544, 715938587, System.identityHashCode(this));
    }
}
