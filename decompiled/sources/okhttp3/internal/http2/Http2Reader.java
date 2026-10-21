package okhttp3.internal.http2;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.b;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import net.ipsoft.amelia.sdk.internal.c.c;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "readConnectionPreface", "", "requireSettings", "nextFrame", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/BufferedSource;", "source", "client", "<init>", "(Lokio/BufferedSource;Z)V", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Logger f85983t0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSource f85984p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f85985q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ContinuationSource f85986r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Hpack.Reader f85987s0;

    /* JADX INFO: compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return Http2Reader.f85983t0;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException(n1.e("PROTOCOL_ERROR padding ", padding, " > remaining length ", length));
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH&J.\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J(\u0010#\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0011H&J&\u0010'\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000eH&¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "ackSettings", "", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", "port", "maxAge", "", "data", "inFinished", "", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "ping", c.f84801f, "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "windowUpdate", "windowSizeIncrement", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Handler {
        void ackSettings();

        void alternateService(int streamId, @NotNull String origin, @NotNull ByteString protocol, @NotNull String host, int port, long maxAge);

        void data(boolean inFinished, int streamId, @NotNull BufferedSource source, int length) throws IOException;

        void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull ByteString debugData);

        void headers(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<Header> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) throws IOException;

        void rstStream(int streamId, @NotNull ErrorCode errorCode);

        void settings(boolean clearPrevious, @NotNull Settings settings);

        void windowUpdate(int streamId, long windowSizeIncrement);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f85983t0 = logger;
    }

    public Http2Reader(@NotNull BufferedSource source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f85984p0 = source;
        this.f85985q0 = z10;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f85986r0 = continuationSource;
        this.f85987s0 = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    public final List<Header> a(int i10, int i11, int i12, int i13) throws IOException {
        ContinuationSource continuationSource = this.f85986r0;
        continuationSource.setLeft(i10);
        continuationSource.setLength(continuationSource.getLeft());
        continuationSource.setPadding(i11);
        continuationSource.setFlags(i12);
        continuationSource.setStreamId(i13);
        Hpack.Reader reader = this.f85987s0;
        reader.readHeaders();
        return reader.getAndResetHeaderList();
    }

    public final void b(Handler handler, int i10) throws IOException {
        BufferedSource bufferedSource = this.f85984p0;
        int i11 = bufferedSource.readInt();
        handler.priority(i10, i11 & Integer.MAX_VALUE, Util.and(bufferedSource.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85984p0.close();
    }

    public final boolean nextFrame(boolean requireSettings, @NotNull Handler handler) throws IOException {
        BufferedSource bufferedSource = this.f85984p0;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            bufferedSource.require(9L);
            int medium = Util.readMedium(bufferedSource);
            if (medium > 16384) {
                throw new IOException(g0.c("FRAME_SIZE_ERROR: ", medium));
            }
            int iAnd = Util.and(bufferedSource.readByte(), 255);
            int iAnd2 = Util.and(bufferedSource.readByte(), 255);
            int i10 = bufferedSource.readInt() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f85983t0;
            if (logger.isLoggable(level)) {
                logger.fine(Http2.INSTANCE.frameLog(true, i10, medium, iAnd, iAnd2));
            }
            if (requireSettings && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z10 = (iAnd2 & 1) != 0;
                    if ((iAnd2 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int iAnd3 = (iAnd2 & 8) != 0 ? Util.and(bufferedSource.readByte(), 255) : 0;
                    handler.data(z10, i10, bufferedSource, INSTANCE.lengthWithoutPadding(medium, iAnd2, iAnd3));
                    bufferedSource.skip(iAnd3);
                    return true;
                case 1:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z11 = (iAnd2 & 1) != 0;
                    int iAnd4 = (iAnd2 & 8) != 0 ? Util.and(bufferedSource.readByte(), 255) : 0;
                    if ((iAnd2 & 32) != 0) {
                        b(handler, i10);
                        medium -= 5;
                    }
                    handler.headers(z11, i10, -1, a(INSTANCE.lengthWithoutPadding(medium, iAnd2, iAnd4), iAnd4, iAnd2, i10));
                    return true;
                case 2:
                    if (medium != 5) {
                        throw new IOException(b.a("TYPE_PRIORITY length: ", medium, " != 5"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    b(handler, i10);
                    return true;
                case 3:
                    if (medium != 4) {
                        throw new IOException(b.a("TYPE_RST_STREAM length: ", medium, " != 4"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i11 = bufferedSource.readInt();
                    ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(i11);
                    if (errorCodeFromHttp2 == null) {
                        throw new IOException(g0.c("TYPE_RST_STREAM unexpected error code: ", i11));
                    }
                    handler.rstStream(i10, errorCodeFromHttp2);
                    return true;
                case 4:
                    if (i10 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((iAnd2 & 1) != 0) {
                        if (medium != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        handler.ackSettings();
                    } else {
                        if (medium % 6 != 0) {
                            throw new IOException(g0.c("TYPE_SETTINGS length % 6 != 0: ", medium));
                        }
                        Settings settings = new Settings();
                        IntProgression intProgressionStep = kotlin.ranges.c.step(kotlin.ranges.c.until(0, medium), 6);
                        int first = intProgressionStep.getFirst();
                        int last = intProgressionStep.getLast();
                        int step = intProgressionStep.getStep();
                        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                            while (true) {
                                int iAnd5 = Util.and(bufferedSource.readShort(), 65535);
                                int i12 = bufferedSource.readInt();
                                if (iAnd5 != 2) {
                                    if (iAnd5 == 3) {
                                        iAnd5 = 4;
                                    } else if (iAnd5 != 4) {
                                        if (iAnd5 == 5 && (i12 < 16384 || i12 > 16777215)) {
                                            throw new IOException(g0.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", i12));
                                        }
                                    } else {
                                        if (i12 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        iAnd5 = 7;
                                    }
                                } else if (i12 != 0 && i12 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                settings.set(iAnd5, i12);
                                if (first != last) {
                                    first += step;
                                }
                            }
                        }
                        handler.settings(false, settings);
                    }
                    return true;
                case 5:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int iAnd6 = (iAnd2 & 8) != 0 ? Util.and(bufferedSource.readByte(), 255) : 0;
                    handler.pushPromise(i10, bufferedSource.readInt() & Integer.MAX_VALUE, a(INSTANCE.lengthWithoutPadding(medium - 4, iAnd2, iAnd6), iAnd6, iAnd2, i10));
                    return true;
                case 6:
                    if (medium != 8) {
                        throw new IOException(g0.c("TYPE_PING length != 8: ", medium));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    handler.ping((iAnd2 & 1) != 0, bufferedSource.readInt(), bufferedSource.readInt());
                    return true;
                case 7:
                    if (medium < 8) {
                        throw new IOException(g0.c("TYPE_GOAWAY length < 8: ", medium));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i13 = bufferedSource.readInt();
                    int i14 = bufferedSource.readInt();
                    int i15 = medium - 8;
                    ErrorCode errorCodeFromHttp3 = ErrorCode.INSTANCE.fromHttp2(i14);
                    if (errorCodeFromHttp3 == null) {
                        throw new IOException(g0.c("TYPE_GOAWAY unexpected error code: ", i14));
                    }
                    ByteString byteString = ByteString.EMPTY;
                    if (i15 > 0) {
                        byteString = bufferedSource.readByteString(i15);
                    }
                    handler.goAway(i13, errorCodeFromHttp3, byteString);
                    return true;
                case 8:
                    if (medium != 4) {
                        throw new IOException(g0.c("TYPE_WINDOW_UPDATE length !=4: ", medium));
                    }
                    long jAnd = Util.and(bufferedSource.readInt(), 2147483647L);
                    if (jAnd == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    handler.windowUpdate(i10, jAnd);
                    return true;
                default:
                    bufferedSource.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(@NotNull Handler handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f85985q0) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString byteString2 = this.f85984p0.readByteString(byteString.size());
        Level level = Level.FINE;
        Logger logger = f85983t0;
        if (logger.isLoggable(level)) {
            logger.fine(Util.format("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (Intrinsics.areEqual(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006'"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", HearingDisabilitiesConstants.CLOSE_MODAL, "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLength", "()I", "setLength", "(I)V", "length", "r0", "getFlags", "setFlags", "flags", "s0", "getStreamId", "setStreamId", "streamId", "t0", "getLeft", "setLeft", Parameters.DIRECTION.LEFT, "u0", "getPadding", "setPadding", "padding", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class ContinuationSource implements Source {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final BufferedSource f85988p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        public int flags;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        public int streamId;

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        public int left;

        /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
        public int padding;

        public ContinuationSource(@NotNull BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f85988p0 = source;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            int i10;
            int i11;
            Intrinsics.checkNotNullParameter(sink, "sink");
            do {
                int i12 = this.left;
                BufferedSource bufferedSource = this.f85988p0;
                if (i12 != 0) {
                    long j10 = bufferedSource.read(sink, Math.min(byteCount, i12));
                    if (j10 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j10;
                    return j10;
                }
                bufferedSource.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                i10 = this.streamId;
                int medium = Util.readMedium(bufferedSource);
                this.left = medium;
                this.length = medium;
                int iAnd = Util.and(bufferedSource.readByte(), 255);
                this.flags = Util.and(bufferedSource.readByte(), 255);
                Companion companion = Http2Reader.INSTANCE;
                if (companion.getLogger().isLoggable(Level.FINE)) {
                    companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
                }
                i11 = bufferedSource.readInt() & Integer.MAX_VALUE;
                this.streamId = i11;
                if (iAnd != 9) {
                    throw new IOException(iAnd + " != TYPE_CONTINUATION");
                }
            } while (i11 == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public final void setFlags(int i10) {
            this.flags = i10;
        }

        public final void setLeft(int i10) {
            this.left = i10;
        }

        public final void setLength(int i10) {
            this.length = i10;
        }

        public final void setPadding(int i10) {
            this.padding = i10;
        }

        public final void setStreamId(int i10) {
            this.streamId = i10;
        }

        @Override // okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public Timeout getF85757p0() {
            return this.f85988p0.getF85757p0();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
