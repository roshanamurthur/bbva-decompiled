package okhttp3.logging;

import androidx.core.app.NotificationCompat;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoggingEventListener.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0016¨\u0006>"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "", "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", DigipassManagerConstants.KEY_RESPONSE, "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "Factory", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
public final class LoggingEventListener extends EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HttpLoggingInterceptor.Logger f86158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f86159b;

    /* JADX INFO: compiled from: LoggingEventListener.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "create", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
    public static class Factory implements EventListener.Factory {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final HttpLoggingInterceptor.Logger f86160p0;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // okhttp3.EventListener.Factory
        @NotNull
        public EventListener create(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "call");
            return new LoggingEventListener(this.f86160p0, null);
        }

        @JvmOverloads
        public Factory(@NotNull HttpLoggingInterceptor.Logger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.f86160p0 = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public LoggingEventListener(HttpLoggingInterceptor.Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this.f86158a = logger;
    }

    public final void a(String str) {
        this.f86158a.log(Constant.BRACKET_OPEN + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f86159b) + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@NotNull Call call, @NotNull Response cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        a("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        a("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        a("callFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f86159b = System.nanoTime();
        a("callStart: " + call.request());
    }

    @Override // okhttp3.EventListener
    public void canceled(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        a("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        a("connectFailed: " + protocol + ' ' + ioe);
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        a("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        a("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        a("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        a("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        a("dnsStart: " + domainName);
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl url, @NotNull List<? extends Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        a("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        a("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("requestBodyEnd: byteCount=" + byteCount);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        a("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        a("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("responseBodyEnd: byteCount=" + byteCount);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        a("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        a("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        a("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a("secureConnectStart");
    }
}
