package okhttp3.internal.http1;

import androidx.camera.core.impl.v;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0007.\u001e/-012B)\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00063"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "writeRequestHeaders", "Lokhttp3/Response;", DigipassManagerConstants.KEY_RESPONSE, "reportedContentLength", "Lokio/Source;", "openResponseBodySource", "Lokhttp3/Headers;", "trailers", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "skipConnectBody", "Lokhttp3/internal/connection/RealConnection;", "b", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "connection", "isClosed", "()Z", "Lokhttp3/OkHttpClient;", "client", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokio/BufferedSource;Lokio/BufferedSink;)V", "Companion", "a", "c", "d", "e", "f", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final OkHttpClient f85888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RealConnection connection;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BufferedSource f85890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BufferedSink f85891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HeadersReader f85893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Headers f85894g;

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public abstract class a implements Source {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final ForwardingTimeout f85895p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f85896q0;

        public a() {
            this.f85895p0 = new ForwardingTimeout(Http1ExchangeCodec.this.f85890c.getF85757p0());
        }

        public final void b() {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            if (http1ExchangeCodec.f85892e == 6) {
                return;
            }
            if (http1ExchangeCodec.f85892e == 5) {
                Http1ExchangeCodec.access$detachTimeout(http1ExchangeCodec, this.f85895p0);
                http1ExchangeCodec.f85892e = 6;
            } else {
                throw new IllegalStateException("state: " + http1ExchangeCodec.f85892e);
            }
        }

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long j10) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return http1ExchangeCodec.f85890c.read(sink, j10);
            } catch (IOException e5) {
                http1ExchangeCodec.getConnection().noNewExchanges$okhttp();
                b();
                throw e5;
            }
        }

        @Override // okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public final Timeout getF85757p0() {
            return this.f85895p0;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class b implements Sink {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final ForwardingTimeout f85898p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f85899q0;

        public b() {
            this.f85898p0 = new ForwardingTimeout(Http1ExchangeCodec.this.f85891d.getF86418p0());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f85899q0) {
                return;
            }
            this.f85899q0 = true;
            Http1ExchangeCodec.this.f85891d.writeUtf8("0\r\n\r\n");
            Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.f85898p0);
            Http1ExchangeCodec.this.f85892e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public final synchronized void flush() {
            if (this.f85899q0) {
                return;
            }
            Http1ExchangeCodec.this.f85891d.flush();
        }

        @Override // okio.Sink
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public final Timeout getF86418p0() {
            return this.f85898p0;
        }

        @Override // okio.Sink
        public final void write(@NotNull Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f85899q0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            http1ExchangeCodec.f85891d.writeHexadecimalUnsignedLong(j10);
            http1ExchangeCodec.f85891d.writeUtf8("\r\n");
            http1ExchangeCodec.f85891d.write(source, j10);
            http1ExchangeCodec.f85891d.writeUtf8("\r\n");
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class c extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public final HttpUrl f85901s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f85902t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f85903u0;
        public final /* synthetic */ Http1ExchangeCodec v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.v0 = http1ExchangeCodec;
            this.f85901s0 = url;
            this.f85902t0 = -1L;
            this.f85903u0 = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f85896q0) {
                return;
            }
            if (this.f85903u0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.v0.getConnection().noNewExchanges$okhttp();
                b();
            }
            this.f85896q0 = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.a, okio.Source
        public final long read(@NotNull Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
            }
            if (!(!this.f85896q0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f85903u0) {
                return -1L;
            }
            long j11 = this.f85902t0;
            Http1ExchangeCodec http1ExchangeCodec = this.v0;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    http1ExchangeCodec.f85890c.readUtf8LineStrict();
                }
                try {
                    this.f85902t0 = http1ExchangeCodec.f85890c.readHexadecimalUnsignedLong();
                    String string = StringsKt__StringsKt.trim((CharSequence) http1ExchangeCodec.f85890c.readUtf8LineStrict()).toString();
                    if (this.f85902t0 < 0 || (string.length() > 0 && !l.startsWith$default(string, ReplenishLogic.ID_SEPARATOR, false, 2, null))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f85902t0 + string + '\"');
                    }
                    if (this.f85902t0 == 0) {
                        this.f85903u0 = false;
                        http1ExchangeCodec.f85894g = http1ExchangeCodec.f85893f.readHeaders();
                        OkHttpClient okHttpClient = http1ExchangeCodec.f85888a;
                        Intrinsics.checkNotNull(okHttpClient);
                        CookieJar cookieJar = okHttpClient.cookieJar();
                        Headers headers = http1ExchangeCodec.f85894g;
                        Intrinsics.checkNotNull(headers);
                        HttpHeaders.receiveHeaders(cookieJar, this.f85901s0, headers);
                        b();
                    }
                    if (!this.f85903u0) {
                        return -1L;
                    }
                } catch (NumberFormatException e5) {
                    throw new ProtocolException(e5.getMessage());
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f85902t0));
            if (j12 != -1) {
                this.f85902t0 -= j12;
                return j12;
            }
            http1ExchangeCodec.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class d extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f85904s0;

        public d(long j10) {
            super();
            this.f85904s0 = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f85896q0) {
                return;
            }
            if (this.f85904s0 != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                b();
            }
            this.f85896q0 = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.a, okio.Source
        public final long read(@NotNull Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
            }
            if (!(!this.f85896q0)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f85904s0;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j13 = this.f85904s0 - j12;
            this.f85904s0 = j13;
            if (j13 == 0) {
                b();
            }
            return j12;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class e implements Sink {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final ForwardingTimeout f85906p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f85907q0;

        public e() {
            this.f85906p0 = new ForwardingTimeout(Http1ExchangeCodec.this.f85891d.getF86418p0());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f85907q0) {
                return;
            }
            this.f85907q0 = true;
            ForwardingTimeout forwardingTimeout = this.f85906p0;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            Http1ExchangeCodec.access$detachTimeout(http1ExchangeCodec, forwardingTimeout);
            http1ExchangeCodec.f85892e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f85907q0) {
                return;
            }
            Http1ExchangeCodec.this.f85891d.flush();
        }

        @Override // okio.Sink
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public final Timeout getF86418p0() {
            return this.f85906p0;
        }

        @Override // okio.Sink
        public final void write(@NotNull Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f85907q0)) {
                throw new IllegalStateException("closed".toString());
            }
            Util.checkOffsetAndCount(source.size(), 0L, j10);
            Http1ExchangeCodec.this.f85891d.write(source, j10);
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class f extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f85909s0;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f85896q0) {
                return;
            }
            if (!this.f85909s0) {
                b();
            }
            this.f85896q0 = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.a, okio.Source
        public final long read(@NotNull Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
            }
            if (!(!this.f85896q0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f85909s0) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f85909s0 = true;
            b();
            return -1L;
        }
    }

    public Http1ExchangeCodec(@Nullable OkHttpClient okHttpClient, @NotNull RealConnection connection, @NotNull BufferedSource source, @NotNull BufferedSink sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f85888a = okHttpClient;
        this.connection = connection;
        this.f85890c = source;
        this.f85891d = sink;
        this.f85893f = new HeadersReader(source);
    }

    public static final void access$detachTimeout(Http1ExchangeCodec http1ExchangeCodec, ForwardingTimeout forwardingTimeout) {
        http1ExchangeCodec.getClass();
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    public final d a(long j10) {
        if (this.f85892e == 4) {
            this.f85892e = 5;
            return new d(j10);
        }
        throw new IllegalStateException(("state: " + this.f85892e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Sink createRequestBody(@NotNull Request request, long contentLength) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (l.equals("chunked", request.header("Transfer-Encoding"), true)) {
            if (this.f85892e == 1) {
                this.f85892e = 2;
                return new b();
            }
            throw new IllegalStateException(("state: " + this.f85892e).toString());
        }
        if (contentLength == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f85892e == 1) {
            this.f85892e = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + this.f85892e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.f85891d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.f85891d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.f85892e == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Source openResponseBodySource(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return a(0L);
        }
        if (l.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) {
            HttpUrl httpUrlUrl = response.request().url();
            if (this.f85892e == 4) {
                this.f85892e = 5;
                return new c(this, httpUrlUrl);
            }
            throw new IllegalStateException(("state: " + this.f85892e).toString());
        }
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength != -1) {
            return a(jHeadersContentLength);
        }
        if (this.f85892e == 4) {
            this.f85892e = 5;
            getConnection().noNewExchanges$okhttp();
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f85892e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @Nullable
    public Response.Builder readResponseHeaders(boolean expectContinue) {
        HeadersReader headersReader = this.f85893f;
        int i10 = this.f85892e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f85892e).toString());
        }
        try {
            StatusLine statusLine = StatusLine.INSTANCE.parse(headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(headersReader.readHeaders());
            if (expectContinue && statusLine.code == 100) {
                return null;
            }
            int i11 = statusLine.code;
            if (i11 == 100) {
                this.f85892e = 3;
                return builderHeaders;
            }
            if (102 > i11 || i11 >= 200) {
                this.f85892e = 4;
                return builderHeaders;
            }
            this.f85892e = 3;
            return builderHeaders;
        } catch (EOFException e5) {
            throw new IOException(androidx.camera.core.processing.f.d("unexpected end of stream on ", getConnection().getF85830b().address().url().redact()), e5);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (l.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == -1) {
            return;
        }
        d dVarA = a(jHeadersContentLength);
        Util.skipAll(dVarA, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        dVarA.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Headers trailers() {
        if (this.f85892e != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        Headers headers = this.f85894g;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(@NotNull Headers headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f85892e != 0) {
            throw new IllegalStateException(("state: " + this.f85892e).toString());
        }
        BufferedSink bufferedSink = this.f85891d;
        bufferedSink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            bufferedSink.writeUtf8(headers.name(i10)).writeUtf8(": ").writeUtf8(headers.value(i10)).writeUtf8("\r\n");
        }
        bufferedSink.writeUtf8("\r\n");
        this.f85892e = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().getF85830b().proxy().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }
}
