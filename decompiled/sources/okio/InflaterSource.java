package okio;

import androidx.camera.core.impl.v;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0015"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "readOrInflate", "", "refill", "Lokio/Timeout;", "timeout", "", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/BufferedSource;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
public final class InflaterSource implements Source {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSource f86392p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Inflater f86393q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f86394r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f86395s0;

    public InflaterSource(@NotNull BufferedSource source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f86392p0 = source;
        this.f86393q0 = inflater;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f86395s0) {
            return;
        }
        this.f86393q0.end();
        this.f86395s0 = true;
        this.f86392p0.close();
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long orInflate = readOrInflate(sink, byteCount);
            if (orInflate > 0) {
                return orInflate;
            }
            Inflater inflater = this.f86393q0;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f86392p0.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(@NotNull Buffer sink, long byteCount) throws IOException {
        Inflater inflater = this.f86393q0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", byteCount).toString());
        }
        if (!(!this.f86395s0)) {
            throw new IllegalStateException("closed".toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int iMin = (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit);
            refill();
            int iInflate = inflater.inflate(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            int i10 = this.f86394r0;
            if (i10 != 0) {
                int remaining = i10 - inflater.getRemaining();
                this.f86394r0 -= remaining;
                this.f86392p0.skip(remaining);
            }
            if (iInflate > 0) {
                segmentWritableSegment$okio.limit += iInflate;
                long j10 = iInflate;
                sink.setSize$okio(sink.size() + j10);
                return j10;
            }
            if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                sink.head = segmentWritableSegment$okio.pop();
                SegmentPool.recycle(segmentWritableSegment$okio);
            }
            return 0L;
        } catch (DataFormatException e5) {
            throw new IOException(e5);
        }
    }

    public final boolean refill() throws IOException {
        Inflater inflater = this.f86393q0;
        if (!inflater.needsInput()) {
            return false;
        }
        BufferedSource bufferedSource = this.f86392p0;
        if (bufferedSource.exhausted()) {
            return true;
        }
        Segment segment = bufferedSource.getBuffer().head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.limit;
        int i11 = segment.pos;
        int i12 = i10 - i11;
        this.f86394r0 = i12;
        inflater.setInput(segment.data, i11, i12);
        return false;
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.f86392p0.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(@NotNull Source source, @NotNull Inflater inflater) {
        this(Okio.buffer(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
