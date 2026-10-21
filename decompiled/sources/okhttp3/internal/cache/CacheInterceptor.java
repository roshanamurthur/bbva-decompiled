package okhttp3.internal.cache;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/Cache;", "a", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "cache", "<init>", "(Lokhttp3/Cache;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Cache cache;

    /* JADX INFO: compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static boolean a(String str) {
            return (l.equals("Connection", str, true) || l.equals("Keep-Alive", str, true) || l.equals("Proxy-Authenticate", str, true) || l.equals("Proxy-Authorization", str, true) || l.equals("TE", str, true) || l.equals("Trailers", str, true) || l.equals("Transfer-Encoding", str, true) || l.equals("Upgrade", str, true)) ? false : true;
        }

        public static final Headers access$combine(Companion companion, Headers headers, Headers headers2) {
            companion.getClass();
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = headers.name(i10);
                String strValue = headers.value(i10);
                if ((!l.equals("Warning", strName, true) || !l.startsWith$default(strValue, "1", false, 2, null)) && (l.equals("Content-Length", strName, true) || l.equals("Content-Encoding", strName, true) || l.equals(DigipassManagerConstants.KEY_CONTENT_TYPE, strName, true) || !a(strName) || headers2.get(strName) == null)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = headers2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strName2 = headers2.name(i11);
                if (!l.equals("Content-Length", strName2, true) && !l.equals("Content-Encoding", strName2, true) && !l.equals(DigipassManagerConstants.KEY_CONTENT_TYPE, strName2, true) && a(strName2)) {
                    builder.addLenient$okhttp(strName2, headers2.value(i11));
                }
            }
            return builder.build();
        }

        public static final Response access$stripBody(Companion companion, Response response) {
            companion.getClass();
            return (response != null ? response.body() : null) != null ? response.newBuilder().body(null).build() : response;
        }
    }

    public CacheInterceptor(@Nullable Cache cache) {
        this.cache = cache;
    }

    @Nullable
    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        EventListener eventListener;
        ResponseBody responseBodyBody;
        ResponseBody responseBodyBody2;
        ResponseBody responseBodyBody3;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        Response response = cache != null ? cache.get$okhttp(chain.request()) : null;
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        if (cache != null) {
            cache.trackResponse$okhttp(cacheStrategyCompute);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (responseBodyBody3 = response.body()) != null) {
            Util.closeQuietly(responseBodyBody3);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseBuild = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            Intrinsics.checkNotNull(cacheResponse);
            Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(Companion.access$stripBody(INSTANCE, cacheResponse)).build();
            eventListener.cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(call, cacheResponse);
        } else if (cache != null) {
            eventListener.cacheMiss(call);
        }
        try {
            Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && response != null && (responseBodyBody2 = response.body()) != null) {
                Util.closeQuietly(responseBodyBody2);
            }
            if (cacheResponse != null) {
                if (responseProceed != null && responseProceed.code() == 304) {
                    Response.Builder builderNewBuilder = cacheResponse.newBuilder();
                    Companion companion = INSTANCE;
                    Response responseBuild3 = builderNewBuilder.headers(Companion.access$combine(companion, cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(Companion.access$stripBody(companion, cacheResponse)).networkResponse(Companion.access$stripBody(companion, responseProceed)).build();
                    ResponseBody responseBodyBody4 = responseProceed.body();
                    Intrinsics.checkNotNull(responseBodyBody4);
                    responseBodyBody4.close();
                    Intrinsics.checkNotNull(cache);
                    cache.trackConditionalCacheHit$okhttp();
                    cache.update$okhttp(cacheResponse, responseBuild3);
                    eventListener.cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                ResponseBody responseBodyBody5 = cacheResponse.body();
                if (responseBodyBody5 != null) {
                    Util.closeQuietly(responseBodyBody5);
                }
            }
            Intrinsics.checkNotNull(responseProceed);
            Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
            Companion companion2 = INSTANCE;
            Response responseBuild4 = builderNewBuilder2.cacheResponse(Companion.access$stripBody(companion2, cacheResponse)).networkResponse(Companion.access$stripBody(companion2, responseProceed)).build();
            if (cache != null) {
                if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.INSTANCE.isCacheable(responseBuild4, networkRequest)) {
                    final CacheRequest cacheRequestPut$okhttp = cache.put$okhttp(responseBuild4);
                    if (cacheRequestPut$okhttp != null) {
                        Sink sinkBody = cacheRequestPut$okhttp.body();
                        ResponseBody responseBodyBody6 = responseBuild4.body();
                        Intrinsics.checkNotNull(responseBodyBody6);
                        final BufferedSource f85884s0 = responseBodyBody6.getF85884s0();
                        final BufferedSink bufferedSinkBuffer = Okio.buffer(sinkBody);
                        responseBuild4 = responseBuild4.newBuilder().body(new RealResponseBody(Response.header$default(responseBuild4, DigipassManagerConstants.KEY_CONTENT_TYPE, null, 2, null), responseBuild4.body().getF85883r0(), Okio.buffer(new Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1

                            /* JADX INFO: renamed from: p0, reason: collision with root package name */
                            public boolean f85688p0;

                            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                            public void close() throws IOException {
                                if (!this.f85688p0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                                    this.f85688p0 = true;
                                    cacheRequestPut$okhttp.abort();
                                }
                                f85884s0.close();
                            }

                            @Override // okio.Source
                            public long read(@NotNull Buffer sink, long byteCount) throws IOException {
                                Intrinsics.checkNotNullParameter(sink, "sink");
                                try {
                                    long j10 = f85884s0.read(sink, byteCount);
                                    BufferedSink bufferedSink = bufferedSinkBuffer;
                                    if (j10 != -1) {
                                        sink.copyTo(bufferedSink.getBuffer(), sink.size() - j10, j10);
                                        bufferedSink.emitCompleteSegments();
                                        return j10;
                                    }
                                    if (!this.f85688p0) {
                                        this.f85688p0 = true;
                                        bufferedSink.close();
                                    }
                                    return -1L;
                                } catch (IOException e5) {
                                    if (!this.f85688p0) {
                                        this.f85688p0 = true;
                                        cacheRequestPut$okhttp.abort();
                                    }
                                    throw e5;
                                }
                            }

                            @Override // okio.Source
                            @NotNull
                            /* JADX INFO: renamed from: timeout */
                            public Timeout getF85757p0() {
                                return f85884s0.getF85757p0();
                            }
                        }))).build();
                    }
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(call);
                    }
                    return responseBuild4;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } catch (Throwable th2) {
            if (response != null && (responseBodyBody = response.body()) != null) {
                Util.closeQuietly(responseBodyBody);
            }
            throw th2;
        }
    }
}
