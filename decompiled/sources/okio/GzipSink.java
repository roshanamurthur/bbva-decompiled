package okio;

import androidx.camera.core.impl.v;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8G¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0015"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "flush", "Lokio/Timeout;", "timeout", HearingDisabilitiesConstants.CLOSE_MODAL, "Ljava/util/zip/Deflater;", "-deprecated_deflater", "()Ljava/util/zip/Deflater;", "deflater", "q0", "Ljava/util/zip/Deflater;", "sink", "<init>", "(Lokio/Sink;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
public final class GzipSink implements Sink {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final RealBufferedSink f86378p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Deflater deflater;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final DeflaterSink f86380r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f86381s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final CRC32 f86382t0;

    public GzipSink(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.f86378p0 = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.f86380r0 = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
        this.f86382t0 = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "deflater", imports = {}))
    @JvmName(name = "-deprecated_deflater")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name and from getter */
    public final Deflater getDeflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Deflater deflater = this.deflater;
        RealBufferedSink realBufferedSink = this.f86378p0;
        if (this.f86381s0) {
            return;
        }
        this.f86380r0.finishDeflate$okio();
        realBufferedSink.writeIntLe((int) this.f86382t0.getValue());
        realBufferedSink.writeIntLe((int) deflater.getBytesRead());
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            realBufferedSink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f86381s0 = true;
        if (th != null) {
            throw th;
        }
    }

    @JvmName(name = "deflater")
    @NotNull
    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.f86380r0.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.f86378p0.timeout();
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", byteCount).toString());
        }
        if (byteCount == 0) {
            return;
        }
        Segment segment = source.head;
        Intrinsics.checkNotNull(segment);
        long j10 = byteCount;
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.f86382t0.update(segment.data, segment.pos, iMin);
            j10 -= (long) iMin;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        }
        this.f86380r0.write(source, byteCount);
    }
}
