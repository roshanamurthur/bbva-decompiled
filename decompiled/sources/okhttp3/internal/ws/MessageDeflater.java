package okhttp3.internal.ws;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageDeflater.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lokio/Buffer;", "buffer", "", "deflate", HearingDisabilitiesConstants.CLOSE_MODAL, "", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class MessageDeflater implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f86088p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Buffer f86089q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Deflater f86090r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final DeflaterSink f86091s0;

    public MessageDeflater(boolean z10) {
        this.f86088p0 = z10;
        Buffer buffer = new Buffer();
        this.f86089q0 = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.f86090r0 = deflater;
        this.f86091s0 = new DeflaterSink((Sink) buffer, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f86091s0.close();
    }

    public final void deflate(@NotNull Buffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Buffer buffer2 = this.f86089q0;
        if (buffer2.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f86088p0) {
            this.f86090r0.reset();
        }
        long size = buffer.size();
        DeflaterSink deflaterSink = this.f86091s0;
        deflaterSink.write(buffer, size);
        deflaterSink.flush();
        ByteString byteString = MessageDeflaterKt.f86092a;
        if (buffer2.rangeEquals(buffer2.size() - ((long) byteString.size()), byteString)) {
            long size2 = buffer2.size() - ((long) 4);
            Buffer.UnsafeCursor andWriteUnsafe$default = Buffer.readAndWriteUnsafe$default(buffer2, null, 1, null);
            try {
                andWriteUnsafe$default.resizeBuffer(size2);
                CloseableKt.closeFinally(andWriteUnsafe$default, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(andWriteUnsafe$default, th2);
                    throw th3;
                }
            }
        } else {
            buffer2.writeByte(0);
        }
        buffer.write(buffer2, buffer2.size());
    }
}
