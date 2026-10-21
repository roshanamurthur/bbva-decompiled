package okhttp3.internal.ws;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.InflaterSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageInflater.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "Lokio/Buffer;", "buffer", "", "inflate", HearingDisabilitiesConstants.CLOSE_MODAL, "", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class MessageInflater implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f86093p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Buffer f86094q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Inflater f86095r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final InflaterSource f86096s0;

    public MessageInflater(boolean z10) {
        this.f86093p0 = z10;
        Buffer buffer = new Buffer();
        this.f86094q0 = buffer;
        Inflater inflater = new Inflater(true);
        this.f86095r0 = inflater;
        this.f86096s0 = new InflaterSource((Source) buffer, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f86096s0.close();
    }

    public final void inflate(@NotNull Buffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Buffer buffer2 = this.f86094q0;
        if (buffer2.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z10 = this.f86093p0;
        Inflater inflater = this.f86095r0;
        if (z10) {
            inflater.reset();
        }
        buffer2.writeAll(buffer);
        buffer2.writeInt(65535);
        long size = buffer2.size() + inflater.getBytesRead();
        do {
            this.f86096s0.readOrInflate(buffer, Long.MAX_VALUE);
        } while (inflater.getBytesRead() < size);
    }
}
