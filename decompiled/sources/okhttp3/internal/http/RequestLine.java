package okhttp3.internal.http;

import ad.d;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\r"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "get", "Lokhttp3/HttpUrl;", "url", "requestPath", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class RequestLine {

    @NotNull
    public static final RequestLine INSTANCE = new RequestLine();

    @NotNull
    public final String get(@NotNull Request request, @NotNull Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.method());
        sb2.append(' ');
        RequestLine requestLine = INSTANCE;
        requestLine.getClass();
        if (request.isHttps() || proxyType != Proxy.Type.HTTP) {
            sb2.append(requestLine.requestPath(request.url()));
        } else {
            sb2.append(request.url());
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String requestPath(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strEncodedPath = url.encodedPath();
        String strEncodedQuery = url.encodedQuery();
        return strEncodedQuery != null ? d.e(strEncodedPath, '?', strEncodedQuery) : strEncodedPath;
    }
}
