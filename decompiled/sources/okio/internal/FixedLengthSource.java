package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FixedLengthSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Source;", "delegate", "size", "", "truncate", "<init>", "(Lokio/Source;JZ)V", "okio"}, k = 1, mv = {1, 9, 0})
public final class FixedLengthSource extends ForwardingSource {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f86470q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f86471r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f86472s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(@NotNull Source delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f86470q0 = j10;
        this.f86471r0 = z10;
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.f86472s0;
        long j11 = this.f86470q0;
        if (j10 > j11) {
            byteCount = 0;
        } else if (this.f86471r0) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j12);
        }
        long j13 = super.read(sink, byteCount);
        if (j13 != -1) {
            this.f86472s0 += j13;
        }
        long j14 = this.f86472s0;
        if ((j14 >= j11 || j13 != -1) && j14 <= j11) {
            return j13;
        }
        if (j13 > 0 && j14 > j11) {
            long size = sink.size() - (this.f86472s0 - j11);
            Buffer buffer = new Buffer();
            buffer.writeAll(sink);
            sink.write(buffer, size);
            buffer.clear();
        }
        throw new IOException("expected " + j11 + " bytes but got " + this.f86472s0);
    }
}
