package okhttp3;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.h0;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.bbva.networkplugin.command.impl.PatchCommand;
import com.bbva.networkplugin.command.impl.PostCommand;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.salesforce.marketingcloud.storage.db.k;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00014BC\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\u0016\u0010.\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0004\b2\u00103J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J%\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0006\u0010\r\u001a\u00020\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0006\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0006\u0010\u0017R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010\u001aR*\u0010.\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e¨\u00065"}, d2 = {"Lokhttp3/Request;", "", "", "name", "header", "", "headers", LogKeysKt.TAG, ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/Request$Builder;", "newBuilder", "Lokhttp3/HttpUrl;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "url", "-deprecated_method", "()Ljava/lang/String;", "method", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "-deprecated_body", "()Lokhttp3/RequestBody;", "body", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "toString", "a", "Lokhttp3/HttpUrl;", "b", "Ljava/lang/String;", "c", "Lokhttp3/Headers;", "d", "Lokhttp3/RequestBody;", "", "e", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", k.a.f65040g, "", "isHttps", "()Z", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HttpUrl url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Headers headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final RequestBody body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Class<?>, Object> tags;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CacheControl f85638f;

    /* JADX INFO: compiled from: Request.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b@\u0010AB\u0011\b\u0010\u0012\u0006\u0010B\u001a\u00020\u001d¢\u0006\u0004\b@\u0010CJ\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0014\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0016J/\u0010\u0018\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00192\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0017\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\f\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R2\u0010?\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lokhttp3/Request$Builder;", "", "Lokhttp3/HttpUrl;", "url", "", "Ljava/net/URL;", "name", "value", "header", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "Lokhttp3/CacheControl;", "cacheControl", "get", HeadCommand.ID, "Lokhttp3/RequestBody;", "body", PostCommand.ID, "delete", PutCommand.ID, PatchCommand.ID, "method", LogKeysKt.TAG, ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lokhttp3/Request;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "b", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "c", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "d", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "", "e", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", k.a.f65040g, "<init>", "()V", "request", "(Lokhttp3/Request;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public HttpUrl url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String method;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Headers.Builder headers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public RequestBody body;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Map<Class<?>, Object> tags;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        @JvmOverloads
        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @NotNull
        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        @NotNull
        /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        @NotNull
        public Builder head() {
            return method("HEAD", null);
        }

        @NotNull
        public Builder header(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        @NotNull
        public Builder method(@NotNull String method, @Nullable RequestBody body) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (body == null) {
                if (!(!HttpMethod.requiresRequestBody(method))) {
                    throw new IllegalArgumentException(h0.b("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(h0.b("method ", method, " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        @NotNull
        public Builder patch(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        @NotNull
        public Builder post(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("POST", body);
        }

        @NotNull
        public Builder put(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method(com.salesforce.marketingcloud.sfmcsdk.components.http.Request.PUT, body);
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public Builder tag(@Nullable Object tag) {
            return tag(Object.class, tag);
        }

        @NotNull
        public Builder url(@NotNull HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        @JvmOverloads
        @NotNull
        public Builder delete(@Nullable RequestBody body) {
            return method("DELETE", body);
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> type, @Nullable T tag) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T tCast = type.cast(tag);
                Intrinsics.checkNotNull(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        @NotNull
        public Builder url(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (l.startsWith(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (l.startsWith(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return url(HttpUrl.INSTANCE.get(url));
        }

        public Builder(@NotNull Request request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = q.toMutableMap(request.getTags$okhttp());
            }
            this.tags = mutableMap;
            this.headers = request.headers().newBuilder();
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return url(companion.get(string));
        }
    }

    public Request(@NotNull HttpUrl url, @NotNull String method, @NotNull Headers headers, @Nullable RequestBody requestBody, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @JvmName(name = "-deprecated_body")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @JvmName(name = "-deprecated_cacheControl")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m6175deprecated_cacheControl() {
        return cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @JvmName(name = "-deprecated_headers")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "method", imports = {}))
    @JvmName(name = "-deprecated_method")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    @JvmName(name = "body")
    @Nullable
    public final RequestBody body() {
        return this.body;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.f85638f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.f85638f = cacheControl2;
        return cacheControl2;
    }

    @NotNull
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.get(name);
    }

    @JvmName(name = "headers")
    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.getIsHttps();
    }

    @JvmName(name = "method")
    @NotNull
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return tag(Object.class);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        Headers headers = this.headers;
        if (headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strComponent1);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(strComponent2);
                i10 = i11;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        Map<Class<?>, Object> map = this.tags;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        return i.b(sb2, AbstractJsonLexerKt.END_OBJ, "StringBuilder().apply(builderAction).toString()");
    }

    @JvmName(name = "url")
    @NotNull
    public final HttpUrl url() {
        return this.url;
    }

    @NotNull
    public final List<String> headers(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.tags.get(type));
    }
}
