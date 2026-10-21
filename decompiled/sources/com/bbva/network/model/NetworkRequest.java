package com.bbva.network.model;

import com.bbva.network.constant.Method;
import com.bbva.network.model.multipart.NetworkMultiPartBody;
import com.bbva.network.model.multipart.Part;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.NetworkRequestBody;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0001 R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/bbva/network/model/NetworkRequest;", "", "body", "Lcom/bbva/network/model/request/NetworkRequestBody;", "getBody", "()Lcom/bbva/network/model/request/NetworkRequestBody;", "setBody", "(Lcom/bbva/network/model/request/NetworkRequestBody;)V", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "method", "Lcom/bbva/network/constant/Method;", "getMethod", "()Lcom/bbva/network/constant/Method;", "setMethod", "(Lcom/bbva/network/constant/Method;)V", "timeout", "", "getTimeout", "()Ljava/lang/Integer;", "setTimeout", "(Ljava/lang/Integer;)V", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "Builder", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkRequest {

    /* JADX INFO: compiled from: NetworkRequest.kt */
    @Deprecated(level = DeprecationLevel.WARNING, message = "we are going to replace with request DSL method", replaceWith = @ReplaceWith(expression = "request{ }", imports = {"import com.bbva.network.model.request.request"}))
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0015"}, d2 = {"Lcom/bbva/network/model/NetworkRequest$Builder;", "", "Lcom/bbva/network/constant/Method;", "method", "", "url", "Ljava/util/HashMap;", "headers", "", "body", "charset", "contentType", "Lcom/bbva/network/model/multipart/NetworkMultiPartBody;", "multiPartBody", "setMultiPartBody", "", "timeout", "Lcom/bbva/network/model/NetworkRequest;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "network_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableNetworkRequest f35121a = new MutableNetworkRequest();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public byte[] f35122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f35123c;

        /* JADX INFO: compiled from: NetworkRequest.kt */
        @SourceDebugExtension({"SMAP\nNetworkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkRequest.kt\ncom/bbva/network/model/NetworkRequest$Builder$setMultiPartBody$1\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,84:1\n32#2,2:85\n*S KotlinDebug\n*F\n+ 1 NetworkRequest.kt\ncom/bbva/network/model/NetworkRequest$Builder$setMultiPartBody$1\n*L\n64#1:85,2\n*E\n"})
        public static final class a extends Lambda implements Function1<NetworkRequestBody.MultipartBody, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ NetworkMultiPartBody f35124p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NetworkMultiPartBody networkMultiPartBody) {
                super(1);
                this.f35124p0 = networkMultiPartBody;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(NetworkRequestBody.MultipartBody multipartBody) {
                NetworkRequestBody.MultipartBody body = multipartBody;
                Intrinsics.checkNotNullParameter(body, "$this$body");
                Iterator<Part> it = this.f35124p0.getParts().iterator();
                while (it.hasNext()) {
                    body.addPart(it.next());
                }
                return Unit.INSTANCE;
            }
        }

        @NotNull
        public final Builder body(@Nullable byte[] body) {
            this.f35122b = body;
            return this;
        }

        @NotNull
        public final NetworkRequest build() {
            byte[] bArr = this.f35122b;
            MutableNetworkRequest mutableNetworkRequest = this.f35121a;
            if (bArr != null) {
                mutableNetworkRequest.body(bArr, this.f35123c);
            }
            return mutableNetworkRequest;
        }

        @NotNull
        public final Builder contentType(@NotNull String contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.f35123c = contentType;
            return this;
        }

        @NotNull
        public final Builder headers(@NotNull HashMap<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f35121a.setHeaders(headers);
            return this;
        }

        @NotNull
        public final Builder method(@NotNull Method method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.f35121a.setMethod(method);
            return this;
        }

        @NotNull
        public final Builder setMultiPartBody(@NotNull NetworkMultiPartBody multiPartBody) {
            Intrinsics.checkNotNullParameter(multiPartBody, "multiPartBody");
            this.f35121a.body(multiPartBody.getType(), new a(multiPartBody));
            return this;
        }

        @NotNull
        public final Builder timeout(int timeout) {
            this.f35121a.setTimeout(Integer.valueOf(timeout));
            return this;
        }

        @NotNull
        public final Builder url(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f35121a.setUrl(url);
            return this;
        }

        @NotNull
        public final Builder body(@NotNull String body, @NotNull String charset) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(charset, "charset");
            Charset charsetForName = Charset.forName(charset);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = body.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            this.f35122b = bytes;
            return this;
        }
    }

    @NotNull
    NetworkRequestBody getBody();

    @NotNull
    Map<String, String> getHeaders();

    @NotNull
    Method getMethod();

    @Nullable
    Integer getTimeout();

    @NotNull
    String getUrl();

    void setBody(@NotNull NetworkRequestBody networkRequestBody);

    void setHeaders(@NotNull Map<String, String> map);

    void setMethod(@NotNull Method method);

    void setTimeout(@Nullable Integer num);

    void setUrl(@NotNull String str);
}
