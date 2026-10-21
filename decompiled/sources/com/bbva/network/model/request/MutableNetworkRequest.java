package com.bbva.network.model.request;

import bk.q;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.multipart.MultiPartType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MutableNetworkRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b(J\u001c\u0010\u0003\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000bJ\u001c\u0010\u0003\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010,\u001a\u00020\"2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/bbva/network/model/request/MutableNetworkRequest;", "Lcom/bbva/network/model/NetworkRequest;", "()V", "body", "Lcom/bbva/network/model/request/NetworkRequestBody;", "getBody", "()Lcom/bbva/network/model/request/NetworkRequestBody;", "setBody", "(Lcom/bbva/network/model/request/NetworkRequestBody;)V", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "method", "Lcom/bbva/network/constant/Method;", "getMethod", "()Lcom/bbva/network/constant/Method;", "setMethod", "(Lcom/bbva/network/constant/Method;)V", "timeout", "", "getTimeout", "()Ljava/lang/Integer;", "setTimeout", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "", "type", "Lcom/bbva/network/model/multipart/MultiPartType;", "block", "Lkotlin/Function1;", "Lcom/bbva/network/model/request/NetworkRequestBody$MultipartBody;", "Lkotlin/ExtensionFunctionType;", "content", "", "contentType", "formBody", "values", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableNetworkRequest implements NetworkRequest {

    @Nullable
    private Integer timeout;

    @NotNull
    private Method method = Method.POST;

    @NotNull
    private String url = "";

    @NotNull
    private NetworkRequestBody body = new NetworkRequestBody.RequestBody(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    @NotNull
    private Map<String, String> headers = q.emptyMap();

    public static /* synthetic */ void body$default(MutableNetworkRequest mutableNetworkRequest, byte[] bArr, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        mutableNetworkRequest.body(bArr, str);
    }

    public final void body(@Nullable byte[] content, @Nullable String contentType) {
        setBody(new NetworkRequestBody.RequestBody(content, contentType));
    }

    public final void formBody(@NotNull Map<String, String> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        setBody(new NetworkRequestBody.FormBody(values));
    }

    @Override // com.bbva.network.model.NetworkRequest
    @NotNull
    public NetworkRequestBody getBody() {
        return this.body;
    }

    @Override // com.bbva.network.model.NetworkRequest
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.bbva.network.model.NetworkRequest
    @NotNull
    public Method getMethod() {
        return this.method;
    }

    @Override // com.bbva.network.model.NetworkRequest
    @Nullable
    public Integer getTimeout() {
        return this.timeout;
    }

    @Override // com.bbva.network.model.NetworkRequest
    @NotNull
    public String getUrl() {
        return this.url;
    }

    @Override // com.bbva.network.model.NetworkRequest
    public void setBody(@NotNull NetworkRequestBody networkRequestBody) {
        Intrinsics.checkNotNullParameter(networkRequestBody, "<set-?>");
        this.body = networkRequestBody;
    }

    @Override // com.bbva.network.model.NetworkRequest
    public void setHeaders(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.headers = map;
    }

    @Override // com.bbva.network.model.NetworkRequest
    public void setMethod(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "<set-?>");
        this.method = method;
    }

    @Override // com.bbva.network.model.NetworkRequest
    public void setTimeout(@Nullable Integer num) {
        this.timeout = num;
    }

    @Override // com.bbva.network.model.NetworkRequest
    public void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public static /* synthetic */ void body$default(MutableNetworkRequest mutableNetworkRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        mutableNetworkRequest.body(str, str2);
    }

    public final void body(@Nullable String content, @Nullable String contentType) {
        byte[] bytes;
        if (content != null) {
            bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        } else {
            bytes = null;
        }
        setBody(new NetworkRequestBody.RequestBody(bytes, contentType));
    }

    public final void body(@NotNull MultiPartType type, @NotNull Function1<? super NetworkRequestBody.MultipartBody, Unit> block) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(block, "block");
        NetworkRequestBody.MultipartBody multipartBody = new NetworkRequestBody.MultipartBody(type);
        block.invoke(multipartBody);
        setBody(multipartBody);
    }
}
