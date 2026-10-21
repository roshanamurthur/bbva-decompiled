package okhttp3.internal.ws;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebSocketReader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "processNextFrame", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/BufferedSource;", "q0", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "", "isClient", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLokio/BufferedSource;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class WebSocketReader implements Closeable {
    public boolean E0;

    @NotNull
    public final Buffer F0;

    @NotNull
    public final Buffer G0;

    @Nullable
    public MessageInflater H0;

    @Nullable
    public final byte[] I0;

    @Nullable
    public final Buffer.UnsafeCursor J0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f86136p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BufferedSource source;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final FrameCallback f86138r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f86139s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f86140t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f86141u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f86142w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f86143x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f86144y0;

    /* JADX INFO: compiled from: WebSocketReader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "onReadClose", "", "code", "", "reason", "", "onReadMessage", "text", "bytes", "Lokio/ByteString;", "onReadPing", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "onReadPong", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FrameCallback {
        void onReadClose(int code, @NotNull String reason);

        void onReadMessage(@NotNull String text) throws IOException;

        void onReadMessage(@NotNull ByteString bytes) throws IOException;

        void onReadPing(@NotNull ByteString payload);

        void onReadPong(@NotNull ByteString payload);
    }

    public WebSocketReader(boolean z10, @NotNull BufferedSource source, @NotNull FrameCallback frameCallback, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f86136p0 = z10;
        this.source = source;
        this.f86138r0 = frameCallback;
        this.f86139s0 = z11;
        this.f86140t0 = z12;
        this.F0 = new Buffer();
        this.G0 = new Buffer();
        this.I0 = z10 ? null : new byte[4];
        this.J0 = z10 ? null : new Buffer.UnsafeCursor();
    }

    public final void b() throws IOException {
        short s4;
        String utf8;
        long j10 = this.f86142w0;
        Buffer buffer = this.F0;
        if (j10 > 0) {
            this.source.readFully(buffer, j10);
            if (!this.f86136p0) {
                Buffer.UnsafeCursor unsafeCursor = this.J0;
                Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                unsafeCursor.seek(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                byte[] bArr = this.I0;
                Intrinsics.checkNotNull(bArr);
                webSocketProtocol.toggleMask(unsafeCursor, bArr);
                unsafeCursor.close();
            }
        }
        int i10 = this.v0;
        FrameCallback frameCallback = this.f86138r0;
        switch (i10) {
            case 8:
                long size = buffer.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s4 = buffer.readShort();
                    utf8 = buffer.readUtf8();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s4);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s4 = 1005;
                    utf8 = "";
                }
                frameCallback.onReadClose(s4, utf8);
                this.f86141u0 = true;
                return;
            case 9:
                frameCallback.onReadPing(buffer.readByteString());
                return;
            case 10:
                frameCallback.onReadPong(buffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.v0));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.H0;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final void e() throws IOException {
        boolean z10;
        if (this.f86141u0) {
            throw new IOException("closed");
        }
        BufferedSource bufferedSource = this.source;
        long f86440c = bufferedSource.getF85757p0().getF86440c();
        bufferedSource.getF85757p0().clearTimeout();
        try {
            int iAnd = Util.and(bufferedSource.readByte(), 255);
            bufferedSource.getF85757p0().timeout(f86440c, TimeUnit.NANOSECONDS);
            int i10 = iAnd & 15;
            this.v0 = i10;
            boolean z11 = (iAnd & 128) != 0;
            this.f86143x0 = z11;
            boolean z12 = (iAnd & 8) != 0;
            this.f86144y0 = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iAnd & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f86139s0) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.E0 = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(bufferedSource.readByte(), 255);
            boolean z14 = (iAnd2 & 128) != 0;
            boolean z15 = this.f86136p0;
            if (z14 == z15) {
                throw new ProtocolException(z15 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iAnd2 & 127;
            this.f86142w0 = j10;
            if (j10 == 126) {
                this.f86142w0 = Util.and(bufferedSource.readShort(), 65535);
            } else if (j10 == 127) {
                long j11 = bufferedSource.readLong();
                this.f86142w0 = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.f86142w0) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f86144y0 && this.f86142w0 > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                byte[] bArr = this.I0;
                Intrinsics.checkNotNull(bArr);
                bufferedSource.readFully(bArr);
            }
        } catch (Throwable th2) {
            bufferedSource.getF85757p0().timeout(f86440c, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    @NotNull
    public final BufferedSource getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        e();
        if (this.f86144y0) {
            b();
            return;
        }
        int i10 = this.v0;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i10));
        }
        while (!this.f86141u0) {
            long j10 = this.f86142w0;
            Buffer buffer = this.G0;
            if (j10 > 0) {
                this.source.readFully(buffer, j10);
                if (!this.f86136p0) {
                    Buffer.UnsafeCursor unsafeCursor = this.J0;
                    Intrinsics.checkNotNull(unsafeCursor);
                    buffer.readAndWriteUnsafe(unsafeCursor);
                    unsafeCursor.seek(buffer.size() - this.f86142w0);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    byte[] bArr = this.I0;
                    Intrinsics.checkNotNull(bArr);
                    webSocketProtocol.toggleMask(unsafeCursor, bArr);
                    unsafeCursor.close();
                }
            }
            if (this.f86143x0) {
                if (this.E0) {
                    MessageInflater messageInflater = this.H0;
                    if (messageInflater == null) {
                        messageInflater = new MessageInflater(this.f86140t0);
                        this.H0 = messageInflater;
                    }
                    messageInflater.inflate(buffer);
                }
                FrameCallback frameCallback = this.f86138r0;
                if (i10 == 1) {
                    frameCallback.onReadMessage(buffer.readUtf8());
                    return;
                } else {
                    frameCallback.onReadMessage(buffer.readByteString());
                    return;
                }
            }
            while (!this.f86141u0) {
                e();
                if (!this.f86144y0) {
                    break;
                } else {
                    b();
                }
            }
            if (this.v0 != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.v0));
            }
        }
        throw new IOException("closed");
    }
}
