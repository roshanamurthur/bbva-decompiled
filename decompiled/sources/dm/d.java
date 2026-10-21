package dm;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
public final class d implements Sink {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final OutputStream f68205p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Timeout f68206q0;

    public d(@NotNull OutputStream out, @NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f68205p0 = out;
        this.f68206q0 = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f68205p0.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        this.f68205p0.flush();
    }

    @Override // okio.Sink
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF86331p0() {
        return this.f68206q0;
    }

    @NotNull
    public final String toString() {
        return "sink(" + this.f68205p0 + RootService.CLOSE_BRACKET;
    }

    @Override // okio.Sink
    public final void write(@NotNull Buffer source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f68206q0.throwIfReached();
            Segment segment = source.head;
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.f68205p0.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.setSize$okio(source.size() - j11);
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
