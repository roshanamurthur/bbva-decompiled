package okhttp3.internal.http2;

import androidx.appcompat.widget.g0;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.ipsoft.amelia.sdk.internal.c.c;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u0001:\u00019B\u0017\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b7\u00108J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0007J(\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0007J(\u0010\u001b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004J\u001e\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u001e\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"J\u0016\u0010'\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%J&\u0010*\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007J\b\u0010+\u001a\u00020\u0002H\u0016J$\u0010-\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u0006:"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "", "connectionPreface", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "", "streamId", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "maxDataLength", "", "outFinished", "Lokio/Buffer;", "source", "byteCount", "data", "flags", "buffer", "dataFrame", "settings", c.f84801f, "payload1", "payload2", "ping", "lastGoodStreamId", "", "debugData", "goAway", "", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", HearingDisabilitiesConstants.CLOSE_MODAL, "headerBlock", "headers", "Lokhttp3/internal/http2/Hpack$Writer;", "u0", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokio/BufferedSink;", "sink", "client", "<init>", "(Lokio/BufferedSink;Z)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
public final class Http2Writer implements Closeable {
    public static final Logger v0 = Logger.getLogger(Http2.class.getName());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSink f86019p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f86020q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Buffer f86021r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f86022s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f86023t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Hpack.Writer hpackWriter;

    public Http2Writer(@NotNull BufferedSink sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f86019p0 = sink;
        this.f86020q0 = z10;
        Buffer buffer = new Buffer();
        this.f86021r0 = buffer;
        this.f86022s0 = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    public final void a(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long jMin = Math.min(this.f86022s0, j10);
            j10 -= jMin;
            frameHeader(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f86019p0.write(this.f86021r0, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(@NotNull Settings peerSettings) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f86023t0) {
                throw new IOException("closed");
            }
            this.f86022s0 = peerSettings.getMaxFrameSize(this.f86022s0);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.f86019p0.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f86023t0 = true;
        this.f86019p0.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        try {
            if (this.f86023t0) {
                throw new IOException("closed");
            }
            if (this.f86020q0) {
                Logger logger = v0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
                }
                this.f86019p0.write(Http2.CONNECTION_PREFACE);
                this.f86019p0.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void data(boolean outFinished, int streamId, @Nullable Buffer source, int byteCount) throws IOException {
        if (this.f86023t0) {
            throw new IOException("closed");
        }
        dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final void dataFrame(int streamId, int flags, @Nullable Buffer buffer, int byteCount) throws IOException {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            Intrinsics.checkNotNull(buffer);
            this.f86019p0.write(buffer, byteCount);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.f86023t0) {
            throw new IOException("closed");
        }
        this.f86019p0.flush();
    }

    public final void frameHeader(int streamId, int length, int type, int flags) throws IOException {
        Level level = Level.FINE;
        Logger logger = v0;
        if (logger.isLoggable(level)) {
            logger.fine(Http2.INSTANCE.frameLog(false, streamId, length, type, flags));
        }
        if (length > this.f86022s0) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f86022s0 + ": " + length).toString());
        }
        if ((Integer.MIN_VALUE & streamId) != 0) {
            throw new IllegalArgumentException(g0.c("reserved bit set: ", streamId).toString());
        }
        BufferedSink bufferedSink = this.f86019p0;
        Util.writeMedium(bufferedSink, length);
        bufferedSink.writeByte(type & 255);
        bufferedSink.writeByte(flags & 255);
        bufferedSink.writeInt(streamId & Integer.MAX_VALUE);
    }

    @NotNull
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f86023t0) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            frameHeader(0, debugData.length + 8, 7, 0);
            this.f86019p0.writeInt(lastGoodStreamId);
            this.f86019p0.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.f86019p0.write(debugData);
            }
            this.f86019p0.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void headers(boolean outFinished, int streamId, @NotNull List<Header> headerBlock) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f86023t0) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.f86021r0.size();
        long jMin = Math.min(this.f86022s0, size);
        int i10 = size == jMin ? 4 : 0;
        if (outFinished) {
            i10 |= 1;
        }
        frameHeader(streamId, (int) jMin, 1, i10);
        this.f86019p0.write(this.f86021r0, jMin);
        if (size > jMin) {
            a(streamId, size - jMin);
        }
    }

    /* JADX INFO: renamed from: maxDataLength, reason: from getter */
    public final int getF86022s0() {
        return this.f86022s0;
    }

    public final synchronized void ping(boolean ack, int payload1, int payload2) throws IOException {
        if (this.f86023t0) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, ack ? 1 : 0);
        this.f86019p0.writeInt(payload1);
        this.f86019p0.writeInt(payload2);
        this.f86019p0.flush();
    }

    public final synchronized void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f86023t0) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.f86021r0.size();
        int iMin = (int) Math.min(((long) this.f86022s0) - 4, size);
        long j10 = iMin;
        frameHeader(streamId, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f86019p0.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.f86019p0.write(this.f86021r0, j10);
        if (size > j10) {
            a(streamId, size - j10);
        }
    }

    public final synchronized void rstStream(int streamId, @NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f86023t0) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(streamId, 4, 3, 0);
        this.f86019p0.writeInt(errorCode.getHttpCode());
        this.f86019p0.flush();
    }

    public final synchronized void settings(@NotNull Settings settings) throws IOException {
        int i10;
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f86023t0) {
                throw new IOException("closed");
            }
            int i11 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i11 < 10) {
                if (settings.isSet(i11)) {
                    if (i11 != 4) {
                        i10 = i11 != 7 ? i11 : 4;
                    } else {
                        i10 = 3;
                    }
                    this.f86019p0.writeShort(i10);
                    this.f86019p0.writeInt(settings.get(i11));
                }
                i11++;
            }
            this.f86019p0.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) throws IOException {
        if (this.f86023t0) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        frameHeader(streamId, 4, 8, 0);
        this.f86019p0.writeInt((int) windowSizeIncrement);
        this.f86019p0.flush();
    }
}
