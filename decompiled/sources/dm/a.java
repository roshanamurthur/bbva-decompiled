package dm;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements Sink {
    @Override // okio.Sink
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF86331p0() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public final void write(@NotNull Buffer source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }
}
