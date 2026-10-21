package okhttp3;

import androidx.camera.core.impl.v;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http1.HeadersReader;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultipartReader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lokhttp3/MultipartReader$Part;", "nextPart", "", HearingDisabilitiesConstants.CLOSE_MODAL, "", "q0", "Ljava/lang/String;", "boundary", "()Ljava/lang/String;", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", DigipassManagerConstants.KEY_RESPONSE, "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final Options f85594x0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSource f85595p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String boundary;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ByteString f85597r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ByteString f85598s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f85599t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f85600u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public a f85601w0;

    /* JADX INFO: compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "()V", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Options getAfterBoundaryOptions() {
            return MultipartReader.f85594x0;
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokhttp3/Headers;", "p0", "Lokhttp3/Headers;", "headers", "()Lokhttp3/Headers;", "Lokio/BufferedSource;", "q0", "Lokio/BufferedSource;", "body", "()Lokio/BufferedSource;", "<init>", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Part implements Closeable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Headers headers;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final BufferedSource body;

        public Part(@NotNull Headers headers, @NotNull BufferedSource body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @JvmName(name = "body")
        @NotNull
        /* JADX INFO: renamed from: body, reason: from getter */
        public final BufferedSource getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        @JvmName(name = "headers")
        @NotNull
        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    public final class a implements Source {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Timeout f85604p0 = new Timeout();

        public a() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            MultipartReader multipartReader = MultipartReader.this;
            if (Intrinsics.areEqual(multipartReader.f85601w0, this)) {
                multipartReader.f85601w0 = null;
            }
        }

        @Override // okio.Source
        public final long read(@NotNull Buffer sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
            }
            MultipartReader multipartReader = MultipartReader.this;
            if (!Intrinsics.areEqual(multipartReader.f85601w0, this)) {
                throw new IllegalStateException("closed".toString());
            }
            Timeout f85757p0 = multipartReader.f85595p0.getF85757p0();
            Timeout timeout = this.f85604p0;
            long f86440c = f85757p0.getF86440c();
            f85757p0.timeout(Timeout.INSTANCE.minTimeout(timeout.getF86440c(), f85757p0.getF86440c()), TimeUnit.NANOSECONDS);
            if (!f85757p0.getF86438a()) {
                if (timeout.getF86438a()) {
                    f85757p0.deadlineNanoTime(timeout.deadlineNanoTime());
                }
                try {
                    long jD = multipartReader.d(j10);
                    return jD == 0 ? -1L : multipartReader.f85595p0.read(sink, jD);
                } finally {
                    f85757p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                    if (timeout.getF86438a()) {
                        f85757p0.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = f85757p0.deadlineNanoTime();
            if (timeout.getF86438a()) {
                f85757p0.deadlineNanoTime(Math.min(f85757p0.deadlineNanoTime(), timeout.deadlineNanoTime()));
            }
            try {
                long jD2 = multipartReader.d(j10);
                return jD2 == 0 ? -1L : multipartReader.f85595p0.read(sink, jD2);
            } finally {
                f85757p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                if (timeout.getF86438a()) {
                    f85757p0.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public final Timeout getF85757p0() {
            return this.f85604p0;
        }
    }

    static {
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f85594x0 = companion.of(companion2.encodeUtf8("\r\n"), companion2.encodeUtf8("--"), companion2.encodeUtf8(" "), companion2.encodeUtf8("\t"));
    }

    public MultipartReader(@NotNull BufferedSource source, @NotNull String boundary) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.f85595p0 = source;
        this.boundary = boundary;
        this.f85597r0 = new Buffer().writeUtf8("--").writeUtf8(boundary).readByteString();
        this.f85598s0 = new Buffer().writeUtf8("\r\n--").writeUtf8(boundary).readByteString();
    }

    @JvmName(name = "boundary")
    @NotNull
    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f85600u0) {
            return;
        }
        this.f85600u0 = true;
        this.f85601w0 = null;
        this.f85595p0.close();
    }

    public final long d(long j10) throws IOException {
        ByteString byteString = this.f85598s0;
        long size = byteString.size();
        BufferedSource bufferedSource = this.f85595p0;
        bufferedSource.require(size);
        long jIndexOf = bufferedSource.getBuffer().indexOf(byteString);
        return jIndexOf == -1 ? Math.min(j10, (bufferedSource.getBuffer().size() - ((long) byteString.size())) + 1) : Math.min(j10, jIndexOf);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[LOOP:1: B:12:0x0025->B:14:0x002f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0033 A[EDGE_INSN: B:50:0x0033->B:15:0x0033 BREAK  A[LOOP:1: B:12:0x0025->B:14:0x002f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[SYNTHETIC] */
    @Nullable
    public final Part nextPart() throws IOException {
        long jD;
        if (!(!this.f85600u0)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.v0) {
            return null;
        }
        int i10 = this.f85599t0;
        BufferedSource bufferedSource = this.f85595p0;
        if (i10 == 0) {
            ByteString byteString = this.f85597r0;
            if (bufferedSource.rangeEquals(0L, byteString)) {
                bufferedSource.skip(byteString.size());
            } else {
                while (true) {
                    jD = d(SvgConstantsKt.SPECIFIED_FONT_FAMILY);
                    if (jD != 0) {
                        break;
                    }
                    bufferedSource.skip(jD);
                }
                bufferedSource.skip(this.f85598s0.size());
            }
        } else {
            while (true) {
                jD = d(SvgConstantsKt.SPECIFIED_FONT_FAMILY);
                if (jD != 0) {
                    break;
                    break;
                }
                bufferedSource.skip(jD);
            }
            bufferedSource.skip(this.f85598s0.size());
        }
        boolean z10 = false;
        while (true) {
            int iSelect = bufferedSource.select(f85594x0);
            if (iSelect == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iSelect == 0) {
                this.f85599t0++;
                Headers headers = new HeadersReader(bufferedSource).readHeaders();
                a aVar = new a();
                this.f85601w0 = aVar;
                return new Part(headers, Okio.buffer(aVar));
            }
            if (iSelect == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.f85599t0 == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.v0 = true;
                return null;
            }
            if (iSelect == 2 || iSelect == 3) {
                z10 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(@NotNull ResponseBody response) throws IOException {
        String strParameter;
        Intrinsics.checkNotNullParameter(response, "response");
        BufferedSource f85884s0 = response.getF85884s0();
        MediaType f85678q0 = response.getF85678q0();
        if (f85678q0 != null && (strParameter = f85678q0.parameter("boundary")) != null) {
            this(f85884s0, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
