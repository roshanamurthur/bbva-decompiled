package okhttp3.internal.http;

import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OkHttpClient f85885a;

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f85885a = client;
    }

    public static int c(Response response, int i10) {
        String strHeader$default = Response.header$default(response, "Retry-After", null, 2, null);
        if (strHeader$default == null) {
            return i10;
        }
        if (!new Regex("\\d+").matches(strHeader$default)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    public final Request a(Response response, Exchange exchange) throws IOException {
        String strHeader$default;
        HttpUrl httpUrlResolve;
        RealConnection connection;
        Route f85830b = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getF85830b();
        int iCode = response.code();
        String strMethod = response.request().method();
        OkHttpClient okHttpClient = this.f85885a;
        if (iCode != 307 && iCode != 308) {
            if (iCode == 401) {
                return okHttpClient.authenticator().authenticate(f85830b, response);
            }
            if (iCode == 421) {
                RequestBody requestBodyBody = response.request().body();
                if ((requestBodyBody != null && requestBodyBody.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection().noCoalescedConnections$okhttp();
                return response.request();
            }
            if (iCode == 503) {
                Response responsePriorResponse = response.priorResponse();
                if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && c(response, Integer.MAX_VALUE) == 0) {
                    return response.request();
                }
                return null;
            }
            if (iCode == 407) {
                Intrinsics.checkNotNull(f85830b);
                if (f85830b.proxy().type() == Proxy.Type.HTTP) {
                    return okHttpClient.proxyAuthenticator().authenticate(f85830b, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iCode == 408) {
                if (!okHttpClient.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody requestBodyBody2 = response.request().body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    return null;
                }
                Response responsePriorResponse2 = response.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && c(response, 0) <= 0) {
                    return response.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!okHttpClient.followRedirects() || (strHeader$default = Response.header$default(response, "Location", null, 2, null)) == null || (httpUrlResolve = response.request().url().resolve(strHeader$default)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(httpUrlResolve.scheme(), response.request().url().scheme()) && !okHttpClient.followSslRedirects()) {
            return null;
        }
        Request.Builder builderNewBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(strMethod)) {
            int iCode2 = response.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean z10 = httpMethod.redirectsWithBody(strMethod) || iCode2 == 308 || iCode2 == 307;
            if (!httpMethod.redirectsToGet(strMethod) || iCode2 == 308 || iCode2 == 307) {
                builderNewBuilder.method(strMethod, z10 ? response.request().body() : null);
            } else {
                builderNewBuilder.method("GET", null);
            }
            if (!z10) {
                builderNewBuilder.removeHeader("Transfer-Encoding");
                builderNewBuilder.removeHeader("Content-Length");
                builderNewBuilder.removeHeader(DigipassManagerConstants.KEY_CONTENT_TYPE);
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), httpUrlResolve)) {
            builderNewBuilder.removeHeader("Authorization");
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    public final boolean b(IOException iOException, RealCall realCall, Request request, boolean z10) {
        RequestBody requestBodyBody;
        if (this.f85885a.retryOnConnectionFailure()) {
            return (!z10 || (((requestBodyBody = request.body()) == null || !requestBodyBody.isOneShot()) && !(iOException instanceof FileNotFoundException))) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z10)) && realCall.retryAfterFailure();
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Response responseProceed;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.getRequest();
        RealCall realCall = realInterceptorChain.getAndroidx.core.app.NotificationCompat.CATEGORY_CALL java.lang.String();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        int i10 = 0;
        Response response = null;
        while (true) {
            boolean z10 = true;
            while (true) {
                realCall.enterNetworkInterceptorExchange(request, z10);
                try {
                    if (realCall.getJ0()) {
                        throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                    }
                    try {
                        responseProceed = realInterceptorChain.proceed(request);
                    } catch (IOException e5) {
                        if (!b(e5, realCall, request, !(e5 instanceof ConnectionShutdownException))) {
                            throw Util.withSuppressed(e5, listEmptyList);
                        }
                        listEmptyList = CollectionsKt___CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e5);
                        realCall.exitNetworkInterceptorExchange$okhttp(true);
                        z10 = false;
                    } catch (RouteException e7) {
                        if (!b(e7.getLastConnectException(), realCall, request, false)) {
                            throw Util.withSuppressed(e7.getFirstConnectException(), listEmptyList);
                        }
                        listEmptyList = CollectionsKt___CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e7.getFirstConnectException());
                        realCall.exitNetworkInterceptorExchange$okhttp(true);
                        z10 = false;
                    }
                    realCall.exitNetworkInterceptorExchange$okhttp(true);
                    z10 = false;
                } catch (Throwable th2) {
                    realCall.exitNetworkInterceptorExchange$okhttp(true);
                    throw th2;
                }
            }
            if (response != null) {
                responseProceed = responseProceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
            }
            response = responseProceed;
            Exchange interceptorScopedExchange = realCall.getInterceptorScopedExchange();
            Request requestA = a(response, interceptorScopedExchange);
            if (requestA == null) {
                if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                    realCall.timeoutEarlyExit();
                }
                realCall.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            RequestBody requestBodyBody = requestA.body();
            if (requestBodyBody != null && requestBodyBody.isOneShot()) {
                realCall.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                Util.closeQuietly(responseBodyBody);
            }
            i10++;
            if (i10 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i10);
            }
            realCall.exitNetworkInterceptorExchange$okhttp(true);
            request = requestA;
        }
    }
}
