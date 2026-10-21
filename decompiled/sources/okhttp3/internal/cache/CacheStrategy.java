package okhttp3.internal.cache;

import com.bbva.component.dm.headers.EtagInterceptor;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u001d\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Lokhttp3/Request;", "a", "Lokhttp3/Request;", "getNetworkRequest", "()Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "b", "Lokhttp3/Response;", "getCacheResponse", "()Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class CacheStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Request networkRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Response cacheResponse;

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "()V", "isCacheable", "", DigipassManagerConstants.KEY_RESPONSE, "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean isCacheable(@NotNull Response response, @NotNull Request request) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int iCode = response.code();
            if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
                if (iCode == 307) {
                    if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().getIsPublic() && !response.cacheControl().getIsPrivate()) {
                        return false;
                    }
                } else if (iCode != 308 && iCode != 404 && iCode != 405) {
                    switch (iCode) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (Response.header$default(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "Lokhttp3/internal/cache/CacheStrategy;", "compute", "Lokhttp3/Request;", "b", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "request", "", "nowMillis", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f85694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Request request;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Response f85696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Date f85697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f85698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Date f85699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f85700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final Date f85701h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f85702i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f85703j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final String f85704k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f85705l;

        public Factory(long j10, @NotNull Request request, @Nullable Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f85694a = j10;
            this.request = request;
            this.f85696c = response;
            this.f85705l = -1;
            if (response != null) {
                this.f85702i = response.sentRequestAtMillis();
                this.f85703j = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strName = headers.name(i10);
                    String strValue = headers.value(i10);
                    if (l.equals(strName, "Date", true)) {
                        this.f85697d = DatesKt.toHttpDateOrNull(strValue);
                        this.f85698e = strValue;
                    } else if (l.equals(strName, "Expires", true)) {
                        this.f85701h = DatesKt.toHttpDateOrNull(strValue);
                    } else if (l.equals(strName, "Last-Modified", true)) {
                        this.f85699f = DatesKt.toHttpDateOrNull(strValue);
                        this.f85700g = strValue;
                    } else if (l.equals(strName, "ETag", true)) {
                        this.f85704k = strValue;
                    } else if (l.equals(strName, "Age", true)) {
                        this.f85705l = Util.toNonNegativeInt(strValue, -1);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:74:0x0180  */
        /* JADX WARN: Code duplicated, block: B:76:0x0186  */
        /* JADX WARN: Code duplicated, block: B:77:0x0189 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x018b  */
        /* JADX WARN: Code duplicated, block: B:80:0x018f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:81:0x0191  */
        /* JADX WARN: Code duplicated, block: B:83:0x01bc  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v26, types: [okhttp3.Request, okhttp3.Response] */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        @NotNull
        public final CacheStrategy compute() {
            CacheStrategy cacheStrategy;
            long jMin;
            String str;
            String str2;
            Request request = this.request;
            ?? r3 = 0;
            r3 = 0;
            r3 = 0;
            r3 = 0;
            Response response = this.f85696c;
            if (response == null) {
                cacheStrategy = new CacheStrategy(request, null);
            } else if (!(request.isHttps() && response.handshake() == null) && CacheStrategy.INSTANCE.isCacheable(response, request)) {
                CacheControl cacheControl = request.cacheControl();
                if (!cacheControl.noCache() && request.header("If-Modified-Since") == null && request.header(EtagInterceptor.HEADER_IF_NONE_MATCH) == null) {
                    CacheControl cacheControl2 = response.cacheControl();
                    long time = this.f85703j;
                    Date date = this.f85697d;
                    long jMax = date != null ? Math.max(0L, time - date.getTime()) : 0L;
                    int i10 = this.f85705l;
                    if (i10 != -1) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
                    }
                    long j10 = this.f85702i;
                    long time2 = j10;
                    long j11 = jMax + (time - j10) + (this.f85694a - time);
                    Intrinsics.checkNotNull(response);
                    CacheControl cacheControl3 = response.cacheControl();
                    int iMaxAgeSeconds = cacheControl3.maxAgeSeconds();
                    Date date2 = this.f85699f;
                    Date date3 = this.f85701h;
                    if (iMaxAgeSeconds != -1) {
                        jMin = TimeUnit.SECONDS.toMillis(cacheControl3.maxAgeSeconds());
                    } else if (date3 != null) {
                        if (date != null) {
                            time = date.getTime();
                        }
                        long time3 = date3.getTime() - time;
                        if (time3 > 0) {
                            jMin = time3;
                        } else {
                            jMin = 0;
                        }
                    } else if (date2 == null || response.request().url().query() != null) {
                        jMin = 0;
                    } else {
                        if (date != null) {
                            time2 = date.getTime();
                        }
                        Intrinsics.checkNotNull(date2);
                        long time4 = time2 - date2.getTime();
                        if (time4 > 0) {
                            jMin = time4 / ((long) 10);
                        } else {
                            jMin = 0;
                        }
                    }
                    if (cacheControl.maxAgeSeconds() != -1) {
                        jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                    }
                    long millis = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
                    long millis2 = (cacheControl2.mustRevalidate() || cacheControl.maxStaleSeconds() == -1) ? 0L : TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                    if (cacheControl2.noCache()) {
                        str = this.f85704k;
                        if (str != null) {
                            str2 = EtagInterceptor.HEADER_IF_NONE_MATCH;
                        } else {
                            if (date2 != null) {
                                str = this.f85700g;
                            } else if (date != null) {
                                str = this.f85698e;
                            } else {
                                request = request;
                                r3 = 0;
                                cacheStrategy = new CacheStrategy(request, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        Headers.Builder builderNewBuilder = request.headers().newBuilder();
                        Intrinsics.checkNotNull(str);
                        builderNewBuilder.addLenient$okhttp(str2, str);
                        cacheStrategy = new CacheStrategy(request.newBuilder().headers(builderNewBuilder.build()).build(), response);
                        request = request;
                        r3 = 0;
                    } else {
                        long j12 = millis + j11;
                        if (j12 < millis2 + jMin) {
                            Response.Builder builderNewBuilder2 = response.newBuilder();
                            if (j12 >= jMin) {
                                builderNewBuilder2.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j11 > 86400000) {
                                Intrinsics.checkNotNull(response);
                                if (response.cacheControl().maxAgeSeconds() == -1 && date3 == null) {
                                    builderNewBuilder2.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                            }
                            cacheStrategy = new CacheStrategy(null, builderNewBuilder2.build());
                            r3 = 0;
                            request = request;
                        } else {
                            str = this.f85704k;
                            if (str != null) {
                                str2 = EtagInterceptor.HEADER_IF_NONE_MATCH;
                            } else {
                                if (date2 != null) {
                                    str = this.f85700g;
                                } else if (date != null) {
                                    str = this.f85698e;
                                } else {
                                    request = request;
                                    r3 = 0;
                                    cacheStrategy = new CacheStrategy(request, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            Headers.Builder builderNewBuilder3 = request.headers().newBuilder();
                            Intrinsics.checkNotNull(str);
                            builderNewBuilder3.addLenient$okhttp(str2, str);
                            cacheStrategy = new CacheStrategy(request.newBuilder().headers(builderNewBuilder3.build()).build(), response);
                            request = request;
                            r3 = 0;
                        }
                    }
                } else {
                    cacheStrategy = new CacheStrategy(request, null);
                }
            } else {
                cacheStrategy = new CacheStrategy(request, null);
            }
            return (cacheStrategy.getNetworkRequest() == null || !request.cacheControl().onlyIfCached()) ? cacheStrategy : new CacheStrategy(r3, r3);
        }

        @NotNull
        /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }
    }

    public CacheStrategy(@Nullable Request request, @Nullable Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    @Nullable
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @Nullable
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
