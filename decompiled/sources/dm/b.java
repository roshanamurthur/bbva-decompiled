package dm;

import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.Okio;
import okio.Segment;
import okio.SegmentPool;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
public final class b implements Source {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final InputStream f68202p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Timeout f68203q0;

    public b(@NotNull InputStream input, @NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f68202p0 = input;
        this.f68203q0 = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f68202p0.close();
    }

    @Override // okio.Source
    public final long read(@NotNull Buffer sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
        }
        try {
            this.f68203q0.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int i10 = this.f68202p0.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit));
            if (i10 != -1) {
                segmentWritableSegment$okio.limit += i10;
                long j11 = i10;
                sink.setSize$okio(sink.size() + j11);
                return j11;
            }
            if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                return -1L;
            }
            sink.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
            return -1L;
        } catch (AssertionError e5) {
            if (Okio.isAndroidGetsocknameError(e5)) {
                throw new IOException(e5);
            }
            throw e5;
        }
    }

    @Override // okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF86420p0() {
        return this.f68203q0;
    }

    @NotNull
    public final String toString() {
        return "source(" + this.f68202p0 + RootService.CLOSE_BRACKET;
    }
}
