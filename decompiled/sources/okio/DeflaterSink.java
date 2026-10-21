package okio;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0018"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "flush", "finishDeflate$okio", "()V", "finishDeflate", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/Timeout;", "timeout", "", "toString", "Lokio/BufferedSink;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
public final class DeflaterSink implements Sink {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSink f86352p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Deflater f86353q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f86354r0;

    public DeflaterSink(@NotNull BufferedSink sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f86352p0 = sink;
        this.f86353q0 = deflater;
    }

    public final void a(boolean z10) throws IOException {
        Segment segmentWritableSegment$okio;
        int iDeflate;
        BufferedSink bufferedSink = this.f86352p0;
        Buffer buffer = bufferedSink.getBuffer();
        while (true) {
            segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            Deflater deflater = this.f86353q0;
            if (z10) {
                try {
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e5) {
                    throw new IOException("Deflater already closed", e5);
                }
            } else {
                byte[] bArr2 = segmentWritableSegment$okio.data;
                int i11 = segmentWritableSegment$okio.limit;
                iDeflate = deflater.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                segmentWritableSegment$okio.limit += iDeflate;
                buffer.setSize$okio(buffer.size() + ((long) iDeflate));
                bufferedSink.emitCompleteSegments();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f86354r0) {
            return;
        }
        finishDeflate$okio();
        th = null;
        try {
            this.f86353q0.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f86352p0.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f86354r0 = true;
        if (th != null) {
            throw th;
        }
    }

    public final void finishDeflate$okio() throws IOException {
        this.f86353q0.finish();
        a(false);
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f86352p0.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.f86352p0.timeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.f86352p0 + RootService.CLOSE_BRACKET;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            Segment segment = source.head;
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            this.f86353q0.setInput(segment.data, segment.pos, iMin);
            a(false);
            long j10 = iMin;
            source.setSize$okio(source.size() - j10);
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            byteCount -= j10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(@NotNull Sink sink, @NotNull Deflater deflater) {
        this(Okio.buffer(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
