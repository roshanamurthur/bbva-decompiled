package okhttp3.internal.http;

import ak.b;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.BufferedSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "forWebSocket", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85866a;

    public CallServerInterceptor(boolean z10) {
        this.f85866a = z10;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b A[Catch: IOException -> 0x006c, TRY_LEAVE, TryCatch #2 {IOException -> 0x006c, blocks: (B:17:0x0057, B:19:0x005d, B:30:0x0095, B:32:0x009b, B:22:0x006e, B:23:0x007d, B:25:0x008a), top: B:91:0x002e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v4, types: [okhttp3.Response$Builder] */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z10;
        ?? r10;
        ?? responseHeaders;
        Response.Builder builder;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            exchange.writeRequestHeaders(request);
            ?? PermitsRequestBody = HttpMethod.permitsRequestBody(request.method());
            try {
                if (PermitsRequestBody == 0 || requestBodyBody == null) {
                    exchange.noRequestBody();
                    z10 = true;
                    PermitsRequestBody = 0;
                } else {
                    if (l.equals("100-continue", request.header("Expect"), true)) {
                        exchange.flushRequest();
                        Response.Builder responseHeaders2 = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z10 = false;
                            builder = responseHeaders2;
                        } catch (IOException e5) {
                            e = e5;
                            z10 = true;
                            r10 = responseHeaders2;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                responseHeaders = r10;
                                throw e;
                            }
                        }
                    } else {
                        z10 = true;
                        builder = null;
                    }
                    if (builder != null) {
                        exchange.noRequestBody();
                        if (!exchange.getConnection().isMultiplexed$okhttp()) {
                            PermitsRequestBody = builder;
                            exchange.noNewExchangesOnConnection();
                            PermitsRequestBody = builder;
                        }
                    } else if (requestBodyBody.isDuplex()) {
                        exchange.flushRequest();
                        requestBodyBody.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
                    } else {
                        BufferedSink bufferedSinkBuffer = Okio.buffer(exchange.createRequestBody(request, false));
                        requestBodyBody.writeTo(bufferedSinkBuffer);
                        bufferedSinkBuffer.close();
                    }
                }
                if (requestBodyBody != null) {
                    PermitsRequestBody = builder;
                    if (!requestBodyBody.isDuplex()) {
                        PermitsRequestBody = builder;
                        PermitsRequestBody = builder;
                        PermitsRequestBody = builder;
                        exchange.finishRequest();
                    }
                } else {
                    PermitsRequestBody = builder;
                    PermitsRequestBody = builder;
                    PermitsRequestBody = builder;
                    exchange.finishRequest();
                }
                PermitsRequestBody = builder;
                e = null;
                responseHeaders = PermitsRequestBody;
            } catch (IOException e7) {
                e = e7;
                r10 = PermitsRequestBody;
            }
        } catch (IOException e10) {
            e = e10;
            z10 = true;
            r10 = 0;
        }
        if (responseHeaders == 0) {
            try {
                responseHeaders = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(responseHeaders);
                if (z10) {
                    exchange.responseHeadersStart();
                    z10 = false;
                }
            } catch (IOException e11) {
                if (e == null) {
                    throw e11;
                }
                b.addSuppressed(e, e11);
                throw e;
            }
        }
        Response responseBuild = responseHeaders.request(request).handshake(exchange.getConnection().getF85833e()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = responseBuild.code();
        if (iCode == 100 || (102 <= iCode && iCode < 200)) {
            Response.Builder responseHeaders3 = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders3);
            if (z10) {
                exchange.responseHeadersStart();
            }
            responseBuild = responseHeaders3.request(request).handshake(exchange.getConnection().getF85833e()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange.responseHeadersEnd(responseBuild);
        Response responseBuild2 = (this.f85866a && iCode == 101) ? responseBuild.newBuilder().body(Util.EMPTY_RESPONSE).build() : responseBuild.newBuilder().body(exchange.openResponseBody(responseBuild)).build();
        if (l.equals(HearingDisabilitiesConstants.CLOSE_MODAL, responseBuild2.request().header("Connection"), true) || l.equals(HearingDisabilitiesConstants.CLOSE_MODAL, Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (iCode == 204 || iCode == 205) {
            ResponseBody responseBodyBody = responseBuild2.body();
            if ((responseBodyBody != null ? responseBodyBody.getF85883r0() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder("HTTP ");
                sb2.append(iCode);
                sb2.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild2.body();
                sb2.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.getF85883r0()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return responseBuild2;
    }
}
