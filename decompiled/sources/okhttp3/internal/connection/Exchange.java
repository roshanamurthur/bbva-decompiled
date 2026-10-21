package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Exchange.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002(MB'\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00108\u001a\u000203\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J9\u0010$\u001a\u00028\u0000\"\n\b\u0000\u0010\u001e*\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010&\u001a\u00020\u0004R\u001a\u0010,\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00108\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010=\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\b;\u0010<R$\u0010@\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u001a\u0010F\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010<¨\u0006N"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Lokhttp3/Request;", "request", "", "writeRequestHeaders", "", "duplex", "Lokio/Sink;", "createRequestBody", "flushRequest", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "Lokhttp3/Response;", DigipassManagerConstants.KEY_RESPONSE, "responseHeadersEnd", "Lokhttp3/ResponseBody;", "openResponseBody", "Lokhttp3/Headers;", "trailers", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "webSocketUpgradeFailed", "noNewExchangesOnConnection", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "detachWithViolence", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "", "bytesRead", "responseDone", "requestDone", "e", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/connection/RealCall;", "a", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "b", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "eventListener", "Lokhttp3/internal/connection/ExchangeFinder;", "c", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "finder", "<set-?>", "Z", "isDuplex$okhttp", "()Z", "isDuplex", "f", "getHasFailure$okhttp", "hasFailure", "Lokhttp3/internal/connection/RealConnection;", "g", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "connection", "isCoalescedConnection$okhttp", "isCoalescedConnection", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Exchange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RealCall call;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EventListener eventListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ExchangeFinder finder;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExchangeCodec f85791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isDuplex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean hasFailure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RealConnection connection;

    /* JADX INFO: compiled from: Exchange.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/ForwardingSource;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", HearingDisabilitiesConstants.CLOSE_MODAL, "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/Source;", "delegate", "contentLength", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Source;J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class ResponseBodySource extends ForwardingSource {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f85795q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f85796r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f85797s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f85798t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f85799u0;
        public final /* synthetic */ Exchange v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(@NotNull Exchange exchange, Source delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.v0 = exchange;
            this.f85795q0 = j10;
            this.f85797s0 = true;
            if (j10 == 0) {
                complete(null);
            }
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f85799u0) {
                return;
            }
            this.f85799u0 = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e5) {
                throw complete(e5);
            }
        }

        public final <E extends IOException> E complete(E e5) {
            if (this.f85798t0) {
                return e5;
            }
            this.f85798t0 = true;
            if (e5 == null && this.f85797s0) {
                this.f85797s0 = false;
                Exchange exchange = this.v0;
                exchange.getEventListener().responseBodyStart(exchange.getCall());
            }
            return (E) this.v0.bodyComplete(this.f85796r0, true, false, e5);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            Exchange exchange = this.v0;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f85799u0)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j10 = delegate().read(sink, byteCount);
                if (this.f85797s0) {
                    this.f85797s0 = false;
                    exchange.getEventListener().responseBodyStart(exchange.getCall());
                }
                if (j10 == -1) {
                    complete(null);
                    return -1L;
                }
                long j11 = this.f85796r0 + j10;
                long j12 = this.f85795q0;
                if (j12 == -1 || j11 <= j12) {
                    this.f85796r0 = j11;
                    if (j11 == j12) {
                        complete(null);
                    }
                    return j10;
                }
                throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
            } catch (IOException e5) {
                throw complete(e5);
            }
        }
    }

    /* JADX INFO: compiled from: Exchange.kt */
    @SourceDebugExtension({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class a extends ForwardingSink {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f85800q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f85801r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f85802s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f85803t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Exchange f85804u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Exchange exchange, Sink delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f85804u0 = exchange;
            this.f85800q0 = j10;
        }

        public final <E extends IOException> E a(E e5) {
            if (this.f85801r0) {
                return e5;
            }
            this.f85801r0 = true;
            return (E) this.f85804u0.bodyComplete(this.f85802s0, false, true, e5);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f85803t0) {
                return;
            }
            this.f85803t0 = true;
            long j10 = this.f85800q0;
            if (j10 != -1 && this.f85802s0 != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e5) {
                throw a(e5);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e5) {
                throw a(e5);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public final void write(@NotNull Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f85803t0)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f85800q0;
            if (j11 == -1 || this.f85802s0 + j10 <= j11) {
                try {
                    super.write(source, j10);
                    this.f85802s0 += j10;
                    return;
                } catch (IOException e5) {
                    throw a(e5);
                }
            }
            throw new ProtocolException("expected " + j11 + " bytes but received " + (this.f85802s0 + j10));
        }
    }

    public Exchange(@NotNull RealCall call, @NotNull EventListener eventListener, @NotNull ExchangeFinder finder, @NotNull ExchangeCodec codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.f85791d = codec;
        this.connection = codec.getConnection();
    }

    public final void a(IOException iOException) {
        this.hasFailure = true;
        this.finder.trackFailure(iOException);
        this.f85791d.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E extends IOException> E bodyComplete(long bytesRead, boolean responseDone, boolean requestDone, E e5) {
        if (e5 != null) {
            a(e5);
        }
        EventListener eventListener = this.eventListener;
        RealCall realCall = this.call;
        if (requestDone) {
            if (e5 != null) {
                eventListener.requestFailed(realCall, e5);
            } else {
                eventListener.requestBodyEnd(realCall, bytesRead);
            }
        }
        if (responseDone) {
            if (e5 != null) {
                eventListener.responseFailed(realCall, e5);
            } else {
                eventListener.responseBodyEnd(realCall, bytesRead);
            }
        }
        return (E) realCall.messageDone$okhttp(this, requestDone, responseDone, e5);
    }

    public final void cancel() {
        this.f85791d.cancel();
    }

    @NotNull
    public final Sink createRequestBody(@NotNull Request request, boolean duplex) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.isDuplex = duplex;
        RequestBody requestBodyBody = request.body();
        Intrinsics.checkNotNull(requestBodyBody);
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new a(this, this.f85791d.createRequestBody(request, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.f85791d.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.f85791d.finishRequest();
        } catch (IOException e5) {
            this.eventListener.requestFailed(this.call, e5);
            a(e5);
            throw e5;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.f85791d.flushRequest();
        } catch (IOException e5) {
            this.eventListener.requestFailed(this.call, e5);
            a(e5);
            throw e5;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    @NotNull
    /* JADX INFO: renamed from: getConnection$okhttp, reason: from getter */
    public final RealConnection getConnection() {
        return this.connection;
    }

    @NotNull
    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getFinder$okhttp, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    /* JADX INFO: renamed from: getHasFailure$okhttp, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !Intrinsics.areEqual(this.finder.getAddress().url().host(), this.connection.getF85830b().address().url().host());
    }

    /* JADX INFO: renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.f85791d.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.f85791d.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    @NotNull
    public final ResponseBody openResponseBody(@NotNull Response response) throws IOException {
        ExchangeCodec exchangeCodec = this.f85791d;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strHeader$default = Response.header$default(response, DigipassManagerConstants.KEY_CONTENT_TYPE, null, 2, null);
            long jReportedContentLength = exchangeCodec.reportedContentLength(response);
            return new RealResponseBody(strHeader$default, jReportedContentLength, Okio.buffer(new ResponseBodySource(this, exchangeCodec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e5) {
            this.eventListener.responseFailed(this.call, e5);
            a(e5);
            throw e5;
        }
    }

    @Nullable
    public final Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        try {
            Response.Builder responseHeaders = this.f85791d.readResponseHeaders(expectContinue);
            if (responseHeaders != null) {
                responseHeaders.initExchange$okhttp(this);
            }
            return responseHeaders;
        } catch (IOException e5) {
            this.eventListener.responseFailed(this.call, e5);
            a(e5);
            throw e5;
        }
    }

    public final void responseHeadersEnd(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    @NotNull
    public final Headers trailers() throws IOException {
        return this.f85791d.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(@NotNull Request request) throws IOException {
        RealCall realCall = this.call;
        EventListener eventListener = this.eventListener;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            eventListener.requestHeadersStart(realCall);
            this.f85791d.writeRequestHeaders(request);
            eventListener.requestHeadersEnd(realCall, request);
        } catch (IOException e5) {
            eventListener.requestFailed(realCall, e5);
            a(e5);
            throw e5;
        }
    }
}
