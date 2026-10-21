package com.salesforce.marketingcloud.sfmcsdk.components.http;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.noknok.android.client.utils.UIConfigTags;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0003 !\"BS\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006#"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Request;", "", "method", "", "requestBody", "connectionTimeout", "", "url", "headers", "", "name", "rateLimit", "", LogKeysKt.TAG, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;)V", "getConnectionTimeout", "()I", "getHeaders", "()Ljava/util/List;", "getMethod", "()Ljava/lang/String;", "getName", "getRateLimit", "()J", "getRequestBody", "getTag", "setTag", "(Ljava/lang/String;)V", "getUrl", "toBuilder", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Request$Builder;", "toBuilder$sfmcsdk_release", "Builder", "Companion", "Method", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Request {
    private static final int DEFAULT_CONNECTION_TIMEOUT = 30000;

    @NotNull
    public static final String GET = "GET";

    @NotNull
    public static final String PATCH = "PATCH";

    @NotNull
    public static final String POST = "POST";

    @NotNull
    public static final String PUT = "PUT";
    public static final int RESPONSE_REQUEST_FAILED = -100;
    private final int connectionTimeout;

    @NotNull
    private final List<String> headers;

    @NotNull
    private final String method;

    @NotNull
    private final String name;
    private final long rateLimit;

    @Nullable
    private final String requestBody;

    @Nullable
    private String tag;

    @NotNull
    private final String url;

    /* JADX INFO: compiled from: Request.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Request$Builder;", "", "()V", "connectionTimeout", "", "headers", "", "", "headersMap", "", "method", "name", "rateLimit", "", "requestBody", LogKeysKt.TAG, "url", "addOrReplaceHeader", "key", "value", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Request;", UIConfigTags.TAG_SECONDS, "baseUrl", "path", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private List<String> headers;

        @Nullable
        private String method;

        @Nullable
        private String name;
        private long rateLimit;

        @Nullable
        private String requestBody;

        @Nullable
        private String tag;

        @Nullable
        private String url;
        private int connectionTimeout = 30000;

        @NotNull
        private Map<String, String> headersMap = new LinkedHashMap();

        @NotNull
        public final Builder addOrReplaceHeader(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headersMap.put(key, StringsKt__StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        @NotNull
        public final Request build() {
            List arrayList;
            List<String> list = this.headers;
            if (list == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) list)) == null) {
                arrayList = new ArrayList();
            }
            for (Map.Entry<String, String> entry : this.headersMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                arrayList.add(key);
                arrayList.add(value);
            }
            String str = this.method;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            String str2 = this.url;
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            int i10 = this.connectionTimeout;
            String str3 = this.requestBody;
            List list2 = CollectionsKt___CollectionsKt.toList(arrayList);
            if (list2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            String str4 = this.name;
            if (str4 != null) {
                return new Request(str, str3, i10, str2, list2, str4, this.rateLimit, this.tag);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @NotNull
        public final Builder connectionTimeout(int connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        @NotNull
        public final Builder headers(@NotNull List<String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers;
            return this;
        }

        @NotNull
        public final Builder method(@NotNull String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            return this;
        }

        @NotNull
        public final Builder rateLimit(long seconds) {
            this.rateLimit = TimeUnit.SECONDS.toMillis(seconds);
            return this;
        }

        @NotNull
        public final Builder requestBody(@Nullable String requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        @NotNull
        public final Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }

        @NotNull
        public final Builder url(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        @NotNull
        public final Builder url(@NotNull String baseUrl, @NotNull String path) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(path, "path");
            if (l.endsWith$default(baseUrl, "/", false, 2, null)) {
                baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
                Intrinsics.checkNotNullExpressionValue(baseUrl, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            this.url = new URL(u.f(baseUrl, path)).toString();
            return this;
        }
    }

    /* JADX INFO: compiled from: Request.kt */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Request$Method;", "", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Method {
    }

    public Request(@NotNull String method, @Nullable String str, int i10, @NotNull String url, @NotNull List<String> headers, @NotNull String name, long j10, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(name, "name");
        this.method = method;
        this.requestBody = str;
        this.connectionTimeout = i10;
        this.url = url;
        this.headers = headers;
        this.name = name;
        this.rateLimit = j10;
        this.tag = str2;
    }

    public final int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    @NotNull
    public final List<String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getRateLimit() {
        return this.rateLimit;
    }

    @Nullable
    public final String getRequestBody() {
        return this.requestBody;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    @NotNull
    public final Builder toBuilder$sfmcsdk_release() {
        Builder builderHeaders = new Builder().method(this.method).url(this.url).connectionTimeout(this.connectionTimeout).name(this.name).headers(this.headers);
        String str = this.requestBody;
        if (str != null) {
            builderHeaders.requestBody(str);
        }
        return builderHeaders;
    }

    public /* synthetic */ Request(String str, String str2, int i10, String str3, List list, String str4, long j10, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, list, str4, j10, (i11 & 128) != 0 ? null : str5);
    }
}
