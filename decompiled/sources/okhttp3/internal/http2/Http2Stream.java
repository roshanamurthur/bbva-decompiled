package okhttp3.internal.http2;

import androidx.camera.core.impl.v;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 q2\u00020\u0001:\u0004qrstB3\b\u0000\u0012\u0006\u00103\u001a\u00020\u001e\u0012\u0006\u00109\u001a\u000204\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bo\u0010pJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u000f\u0010'\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010&J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(J\u000f\u0010,\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010&J\u000f\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010&R\u0017\u00103\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010A\u001a\u00020(2\u0006\u0010:\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010E\u001a\u00020(2\u0006\u0010:\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R*\u0010I\u001a\u00020(2\u0006\u0010:\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R*\u0010M\u001a\u00020(2\u0006\u0010:\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\u001e\u0010\u001d\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001e\u0010X\u001a\u00060SR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001e\u0010\u000f\u001a\u00060YR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001e\u0010\u0010\u001a\u00060YR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R$\u0010\u001a\u001a\u0004\u0018\u00010\u00158@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0011\u0010l\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0011\u0010n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bn\u0010m¨\u0006u"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/Headers;", "takeHeaders", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "", "outFinished", "flushHeaders", "", "writeHeaders", "enqueueTrailers", "Lokio/Timeout;", "readTimeout", "writeTimeout", "Lokio/Source;", "getSource", "Lokio/Sink;", "getSink", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", HearingDisabilitiesConstants.CLOSE_MODAL, "errorCode", "closeLater", "Lokio/BufferedSource;", "source", "", "length", "receiveData", "headers", "inFinished", "receiveHeaders", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "id", "Lokhttp3/internal/http2/Http2Connection;", "b", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "connection", "<set-?>", "c", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "(J)V", "readBytesTotal", "d", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "readBytesAcknowledged", "e", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesTotal", "f", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "i", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "j", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "k", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "l", "getWriteTimeout$okhttp", "m", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "n", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "()Z", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
public final class Http2Stream {
    public static final long EMIT_BUFFER_SIZE = 16384;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Http2Connection connection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long readBytesTotal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long readBytesAcknowledged;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long writeBytesTotal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long writeBytesMaximum;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Headers> f86000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FramingSource source;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FramingSink sink;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StreamTimeout readTimeout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StreamTimeout writeTimeout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ErrorCode errorCode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IOException errorException;

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016¨\u0006/"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/BufferedSource;", "source", "", "receive$okhttp", "(Lokio/BufferedSource;J)V", "receive", "Lokio/Timeout;", "timeout", HearingDisabilitiesConstants.CLOSE_MODAL, "", "q0", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "finished", "r0", "Lokio/Buffer;", "getReceiveBuffer", "()Lokio/Buffer;", "receiveBuffer", "s0", "getReadBuffer", "readBuffer", "Lokhttp3/Headers;", "t0", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "u0", "getClosed$okhttp", "setClosed$okhttp", "closed", "maxByteCount", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    public final class FramingSource implements Source {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f86012p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public boolean finished;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Buffer receiveBuffer = new Buffer();

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Buffer readBuffer = new Buffer();

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Headers trailers;

        /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public FramingSource(long j10, boolean z10) {
            this.f86012p0 = j10;
            this.finished = z10;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                Intrinsics.checkNotNull(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (size > 0) {
                d(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final void d(long j10) {
            boolean z10 = Util.assertionsEnabled;
            Http2Stream http2Stream = Http2Stream.this;
            if (!z10 || !Thread.holdsLock(http2Stream)) {
                http2Stream.getConnection().updateConnectionFlowControl$okhttp(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX INFO: renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @NotNull
        public final Buffer getReadBuffer() {
            return this.readBuffer;
        }

        @NotNull
        public final Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            IOException errorException;
            boolean z10;
            long j10;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j11 = 0;
            if (byteCount < 0) {
                throw new IllegalArgumentException(v.c("byteCount < 0: ", byteCount).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout().enter();
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = http2Stream.getErrorException();
                            if (errorException == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                Intrinsics.checkNotNull(errorCode$okhttp);
                                errorException = new StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.readBuffer.size() > j11) {
                            Buffer buffer = this.readBuffer;
                            j10 = buffer.read(sink, Math.min(byteCount, buffer.size()));
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j10);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                http2Stream.waitForIo$okhttp();
                                z10 = true;
                            }
                            j10 = -1;
                        }
                        http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                        throw th2;
                    }
                    throw th;
                }
                if (!z10) {
                    if (j10 != -1) {
                        return j10;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j11 = 0;
            }
        }

        public final void receive$okhttp(@NotNull BufferedSource source, long byteCount) throws IOException {
            boolean z10;
            boolean z11;
            Intrinsics.checkNotNullParameter(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j10 = byteCount;
            while (j10 > 0) {
                synchronized (Http2Stream.this) {
                    z10 = this.finished;
                    z11 = this.readBuffer.size() + j10 > this.f86012p0;
                    Unit unit = Unit.INSTANCE;
                }
                if (z11) {
                    source.skip(j10);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j10);
                    return;
                }
                long j11 = source.read(this.receiveBuffer, j10);
                if (j11 == -1) {
                    throw new EOFException();
                }
                j10 -= j11;
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.clear();
                        } else {
                            boolean z12 = this.readBuffer.size() == 0;
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z12) {
                                Intrinsics.checkNotNull(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                http2Stream2.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            d(byteCount);
        }

        public final void setClosed$okhttp(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished$okhttp(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public Timeout getF85757p0() {
            return Http2Stream.this.getReadTimeout();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", "", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        @NotNull
        public IOException newTimeoutException(@Nullable IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            ErrorCode errorCode = ErrorCode.CANCEL;
            Http2Stream http2Stream = Http2Stream.this;
            http2Stream.closeLater(errorCode);
            http2Stream.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i10, @NotNull Http2Connection connection, boolean z10, boolean z11, @Nullable Headers headers) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.id = i10;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f86000g = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z11);
        this.sink = new FramingSink(z10);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!isLocallyInitiated())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        }
    }

    public final boolean a(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z10;
        boolean zIsOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
                zIsOpen = isOpen();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        FramingSink framingSink = this.sink;
        if (framingSink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (framingSink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void close(@NotNull ErrorCode rstStatusCode, @Nullable IOException errorException) throws IOException {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (a(rstStatusCode, errorException)) {
            this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
        }
    }

    public final void closeLater(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (a(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final void enqueueTrailers(@NotNull Headers trailers) {
        Intrinsics.checkNotNullParameter(trailers, "trailers");
        synchronized (this) {
            if (!(!this.sink.getFinished())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(trailers);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @Nullable
    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: getErrorException$okhttp, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final Sink getSink() {
        synchronized (this) {
            try {
                if (!this.f86001h && !isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.sink;
    }

    @NotNull
    /* JADX INFO: renamed from: getSink$okhttp, reason: from getter */
    public final FramingSink getSink() {
        return this.sink;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: getSource$okhttp, reason: from getter */
    public final FramingSource getSource() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() || this.source.getClosed()) {
                if ((this.sink.getFinished() || this.sink.getClosed()) && this.f86001h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@NotNull BufferedSource source, int length) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(source, length);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void receiveHeaders(@NotNull Headers headers, boolean inFinished) {
        boolean zIsOpen;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f86001h && inFinished) {
                    this.source.setTrailers(headers);
                } else {
                    this.f86001h = true;
                    this.f86000g.add(headers);
                }
                if (inFinished) {
                    this.source.setFinished$okhttp(true);
                }
                zIsOpen = isOpen();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.id);
    }

    public final synchronized void receiveRstStream(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j10) {
        this.readBytesAcknowledged = j10;
    }

    public final void setReadBytesTotal$okhttp(long j10) {
        this.readBytesTotal = j10;
    }

    public final void setWriteBytesMaximum$okhttp(long j10) {
        this.writeBytesMaximum = j10;
    }

    public final void setWriteBytesTotal$okhttp(long j10) {
        this.writeBytesTotal = j10;
    }

    @NotNull
    public final synchronized Headers takeHeaders() throws IOException {
        Headers headersRemoveFirst;
        this.readTimeout.enter();
        while (this.f86000g.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th2) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th2;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!(!this.f86000g.isEmpty())) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
        headersRemoveFirst = this.f86000g.removeFirst();
        Intrinsics.checkNotNullExpressionValue(headersRemoveFirst, "headersQueue.removeFirst()");
        return headersRemoveFirst;
    }

    @NotNull
    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (!this.source.getFinished() || !this.source.getReceiveBuffer().exhausted() || !this.source.getReadBuffer().exhausted()) {
            if (this.errorCode == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@NotNull List<Header> responseHeaders, boolean outFinished, boolean flushHeaders) throws IOException {
        boolean z10;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                this.f86001h = true;
                if (outFinished) {
                    this.sink.setFinished(true);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!flushHeaders) {
            synchronized (this.connection) {
                z10 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            flushHeaders = z10;
        }
        this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
        if (flushHeaders) {
            this.connection.flush();
        }
    }

    @NotNull
    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006\""}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "flush", "Lokio/Timeout;", "timeout", HearingDisabilitiesConstants.CLOSE_MODAL, "", "p0", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "finished", "Lokhttp3/Headers;", "r0", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "s0", "getClosed", "setClosed", "closed", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    public final class FramingSink implements Sink {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public boolean finished;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final Buffer f86008q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Headers trailers;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public FramingSink(boolean z10) {
            this.finished = z10;
            this.f86008q0 = new Buffer();
        }

        public final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.getWriteTimeout().enter();
                    while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                        try {
                            http2Stream.waitForIo$okhttp();
                        } catch (Throwable th2) {
                            http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                            throw th2;
                        }
                    }
                    http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                    http2Stream.checkOutNotClosed$okhttp();
                    jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.f86008q0.size());
                    http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                    z11 = z10 && jMin == this.f86008q0.size();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Http2Stream.this.getWriteTimeout().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z11, this.f86008q0, jMin);
            } finally {
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                boolean z10 = http2Stream2.getErrorCode$okhttp() == null;
                Unit unit = Unit.INSTANCE;
                if (!Http2Stream.this.getSink().finished) {
                    boolean z11 = this.f86008q0.size() > 0;
                    if (this.trailers != null) {
                        while (this.f86008q0.size() > 0) {
                            a(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        Intrinsics.checkNotNull(headers);
                        connection.writeHeaders$okhttp(id, z10, Util.toHeaderList(headers));
                    } else if (z11) {
                        while (this.f86008q0.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f86008q0.size() > 0) {
                a(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Sink
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public Timeout getF86418p0() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // okio.Sink
        public void write(@NotNull Buffer source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (Util.assertionsEnabled) {
                Http2Stream http2Stream = Http2Stream.this;
                if (Thread.holdsLock(http2Stream)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
                }
            }
            Buffer buffer = this.f86008q0;
            buffer.write(source, byteCount);
            while (buffer.size() >= 16384) {
                a(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }
}
