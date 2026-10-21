package okhttp3.internal.ws;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebSocketWriter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "Lokio/ByteString;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "writePing", "writePong", "", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/BufferedSink;", "q0", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "sink", "Ljava/util/Random;", "r0", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "random", "", "isClient", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class WebSocketWriter implements Closeable {

    @Nullable
    public final byte[] E0;

    @Nullable
    public final Buffer.UnsafeCursor F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f86145p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BufferedSink sink;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Random random;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f86148s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f86149t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f86150u0;

    @NotNull
    public final Buffer v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Buffer f86151w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f86152x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public MessageDeflater f86153y0;

    public WebSocketWriter(boolean z10, @NotNull BufferedSink sink, @NotNull Random random, boolean z11, boolean z12, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f86145p0 = z10;
        this.sink = sink;
        this.random = random;
        this.f86148s0 = z11;
        this.f86149t0 = z12;
        this.f86150u0 = j10;
        this.v0 = new Buffer();
        this.f86151w0 = sink.getBuffer();
        this.E0 = z10 ? new byte[4] : null;
        this.F0 = z10 ? new Buffer.UnsafeCursor() : null;
    }

    public final void a(int i10, ByteString byteString) throws IOException {
        if (this.f86152x0) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        Buffer buffer = this.f86151w0;
        buffer.writeByte(i10 | 128);
        if (this.f86145p0) {
            buffer.writeByte(size | 128);
            byte[] bArr = this.E0;
            Intrinsics.checkNotNull(bArr);
            this.random.nextBytes(bArr);
            buffer.write(bArr);
            if (size > 0) {
                long size2 = buffer.size();
                buffer.write(byteString);
                Buffer.UnsafeCursor unsafeCursor = this.F0;
                Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                unsafeCursor.seek(size2);
                WebSocketProtocol.INSTANCE.toggleMask(unsafeCursor, bArr);
                unsafeCursor.close();
            }
        } else {
            buffer.writeByte(size);
            buffer.write(byteString);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.f86153y0;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @NotNull
    public final Random getRandom() {
        return this.random;
    }

    @NotNull
    public final BufferedSink getSink() {
        return this.sink;
    }

    public final void writeClose(int code, @Nullable ByteString reason) throws IOException {
        ByteString byteString = ByteString.EMPTY;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(code);
            if (reason != null) {
                buffer.write(reason);
            }
            byteString = buffer.readByteString();
        }
        try {
            a(8, byteString);
        } finally {
            this.f86152x0 = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, @NotNull ByteString data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f86152x0) {
            throw new IOException("closed");
        }
        Buffer buffer = this.v0;
        buffer.write(data);
        int i10 = formatOpcode | 128;
        if (this.f86148s0 && data.size() >= this.f86150u0) {
            MessageDeflater messageDeflater = this.f86153y0;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.f86149t0);
                this.f86153y0 = messageDeflater;
            }
            messageDeflater.deflate(buffer);
            i10 = formatOpcode | 192;
        }
        long size = buffer.size();
        Buffer buffer2 = this.f86151w0;
        buffer2.writeByte(i10);
        boolean z10 = this.f86145p0;
        int i11 = z10 ? 128 : 0;
        if (size <= 125) {
            buffer2.writeByte(i11 | ((int) size));
        } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            buffer2.writeByte(i11 | 126);
            buffer2.writeShort((int) size);
        } else {
            buffer2.writeByte(i11 | 127);
            buffer2.writeLong(size);
        }
        if (z10) {
            byte[] bArr = this.E0;
            Intrinsics.checkNotNull(bArr);
            this.random.nextBytes(bArr);
            buffer2.write(bArr);
            if (size > 0) {
                Buffer.UnsafeCursor unsafeCursor = this.F0;
                Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                unsafeCursor.seek(0L);
                WebSocketProtocol.INSTANCE.toggleMask(unsafeCursor, bArr);
                unsafeCursor.close();
            }
        }
        buffer2.write(buffer, size);
        this.sink.emit();
    }

    public final void writePing(@NotNull ByteString payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        a(9, payload);
    }

    public final void writePong(@NotNull ByteString payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        a(10, payload);
    }
}
