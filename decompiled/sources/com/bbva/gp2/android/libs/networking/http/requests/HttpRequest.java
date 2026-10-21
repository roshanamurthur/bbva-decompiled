package com.bbva.gp2.android.libs.networking.http.requests;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\bH\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequest;", "", "httpRequestServerURI", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestServerURI;", "method", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpMethod;", "headers", "", "", "body", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestBody;", "(Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestServerURI;Lcom/bbva/gp2/android/libs/networking/http/requests/HttpMethod;Ljava/util/Map;Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestBody;)V", "getBody", "()Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestBody;", "getHeaders", "()Ljava/util/Map;", "getHttpRequestServerURI", "()Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestServerURI;", "getMethod", "()Lcom/bbva/gp2/android/libs/networking/http/requests/HttpMethod;", "toString", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HttpRequest {

    @Nullable
    private final HttpRequestBody body;

    @Nullable
    private final Map<String, String> headers;

    @NotNull
    private final HttpRequestServerURI httpRequestServerURI;

    @NotNull
    private final HttpMethod method;

    public HttpRequest(@NotNull HttpRequestServerURI httpRequestServerURI, @NotNull HttpMethod method, @Nullable Map<String, String> map, @Nullable HttpRequestBody httpRequestBody) {
        Intrinsics.checkNotNullParameter(httpRequestServerURI, "httpRequestServerURI");
        Intrinsics.checkNotNullParameter(method, "method");
        this.httpRequestServerURI = httpRequestServerURI;
        this.method = method;
        this.headers = map;
        this.body = httpRequestBody;
    }

    @Nullable
    public final HttpRequestBody getBody() {
        return this.body;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final HttpRequestServerURI getHttpRequestServerURI() {
        return this.httpRequestServerURI;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    @NotNull
    public String toString() {
        return "HttpRequest(serverURI='" + this.httpRequestServerURI.getServerURI() + "', method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ HttpRequest(HttpRequestServerURI httpRequestServerURI, HttpMethod httpMethod, Map map, HttpRequestBody httpRequestBody, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpRequestServerURI, httpMethod, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? null : httpRequestBody);
    }
}
