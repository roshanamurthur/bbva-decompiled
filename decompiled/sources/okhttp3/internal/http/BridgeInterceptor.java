package okhttp3.internal.http;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/CookieJar;", "cookieJar", "<init>", "(Lokhttp3/CookieJar;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CookieJar f85865a;

    public BridgeInterceptor(@NotNull CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f85865a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z10;
        ResponseBody responseBodyBody;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            MediaType f85648a = requestBodyBody.getF85648a();
            if (f85648a != null) {
                builderNewBuilder.header(DigipassManagerConstants.KEY_CONTENT_TYPE, f85648a.getF85577a());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header("Content-Length", String.valueOf(jContentLength));
                builderNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                builderNewBuilder.header("Transfer-Encoding", "chunked");
                builderNewBuilder.removeHeader("Content-Length");
            }
        }
        int i10 = 0;
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", Util.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header("Connection") == null) {
            builderNewBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            builderNewBuilder.header("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        HttpUrl httpUrlUrl = request.url();
        CookieJar cookieJar = this.f85865a;
        List<Cookie> listLoadForRequest = cookieJar.loadForRequest(httpUrlUrl);
        if (!listLoadForRequest.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : listLoadForRequest) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Cookie cookie = (Cookie) obj;
                if (i10 > 0) {
                    sb2.append("; ");
                }
                sb2.append(cookie.name());
                sb2.append('=');
                sb2.append(cookie.value());
                i10 = i11;
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            builderNewBuilder.header("Cookie", string);
        }
        if (request.header("User-Agent") == null) {
            builderNewBuilder.header("User-Agent", Util.userAgent);
        }
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        HttpHeaders.receiveHeaders(cookieJar, request.url(), responseProceed.headers());
        Response.Builder builderRequest = responseProceed.newBuilder().request(request);
        if (z10 && l.equals("gzip", Response.header$default(responseProceed, "Content-Encoding", null, 2, null), true) && HttpHeaders.promisesBody(responseProceed) && (responseBodyBody = responseProceed.body()) != null) {
            GzipSource gzipSource = new GzipSource(responseBodyBody.getF85884s0());
            builderRequest.headers(responseProceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            builderRequest.body(new RealResponseBody(Response.header$default(responseProceed, DigipassManagerConstants.KEY_CONTENT_TYPE, null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return builderRequest.build();
    }
}
