package com.bbva.network.model.response;

import bk.q;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.body.Body;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MutableNetworkResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0016\u0012\u0006\u0010%\u001a\u00020\u001e\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u00100\u001a\u00020\b\u0012\u001a\b\u0002\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0016\u0012\u0006\u00103\u001a\u00020\b¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R*\u00107\u001a\u00020\f2\u0006\u00104\u001a\u00020\f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00108R4\u0010E\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0Aj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b`B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/bbva/network/model/response/MutableNetworkResponse;", "Lcom/bbva/network/model/response/NetworkResponse;", "Lcom/bbva/network/model/response/NetworkHandshake;", "handshake", "Lcom/bbva/network/model/NetworkRequest;", "request", "", "discardAndReplay", "", "name", "", "multiHeader", "", "isMultiHeader", "Lcom/bbva/network/model/response/body/Body;", "a", "Lcom/bbva/network/model/response/body/Body;", "getBody", "()Lcom/bbva/network/model/response/body/Body;", "setBody", "(Lcom/bbva/network/model/response/body/Body;)V", "body", "", "b", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "headers", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "setCode", "(I)V", "code", "d", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "setRequest", "(Lcom/bbva/network/model/NetworkRequest;)V", "e", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "g", "getUrl", "url", "<set-?>", "h", "Z", "isDiscarded", "()Z", "setDiscarded", "(Z)V", "Lcom/bbva/network/model/response/NetworkHandshake;", "getHandshake", "()Lcom/bbva/network/model/response/NetworkHandshake;", "setHandshake", "(Lcom/bbva/network/model/response/NetworkHandshake;)V", "isSuccessful", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getHeader", "()Ljava/util/HashMap;", "header", "multiMapHeaders", "<init>", "(Lcom/bbva/network/model/response/body/Body;Ljava/util/Map;ILcom/bbva/network/model/NetworkRequest;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final class MutableNetworkResponse implements NetworkResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Body body;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, String> headers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int code;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public NetworkRequest request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<String, List<String>> f35160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isDiscarded;
    public NetworkHandshake handshake;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableNetworkResponse(@NotNull Body body, @NotNull Map<String, String> headers, int i10, @NotNull NetworkRequest request, @NotNull String message, @NotNull Map<String, ? extends List<String>> multiMapHeaders, @NotNull String url) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(multiMapHeaders, "multiMapHeaders");
        Intrinsics.checkNotNullParameter(url, "url");
        this.body = body;
        this.headers = headers;
        this.code = i10;
        this.request = request;
        this.message = message;
        this.f35160f = multiMapHeaders;
        this.url = url;
    }

    public final void discardAndReplay(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.isDiscarded = true;
        setRequest(request);
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public Body getBody() {
        return this.body;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    public int getCode() {
        return this.code;
    }

    @NotNull
    public final NetworkHandshake getHandshake() {
        NetworkHandshake networkHandshake = this.handshake;
        if (networkHandshake != null) {
            return networkHandshake;
        }
        Intrinsics.throwUninitializedPropertyAccessException("handshake");
        return null;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public HashMap<String, String> getHeader() {
        return new HashMap<>(getHeaders());
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public NetworkRequest getRequest() {
        return this.request;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public String getUrl() {
        return this.url;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public NetworkHandshake handshake() {
        return getHandshake();
    }

    /* JADX INFO: renamed from: isDiscarded, reason: from getter */
    public final boolean getIsDiscarded() {
        return this.isDiscarded;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    public boolean isMultiHeader(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f35160f.get(name) != null;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    public boolean isSuccessful() {
        int code = getCode();
        return 200 <= code && code < 300;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @Nullable
    public List<String> multiHeader(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f35160f.get(name);
    }

    public void setBody(@NotNull Body body) {
        Intrinsics.checkNotNullParameter(body, "<set-?>");
        this.body = body;
    }

    public void setCode(int i10) {
        this.code = i10;
    }

    public final void setDiscarded(boolean z10) {
        this.isDiscarded = z10;
    }

    public final void setHandshake(@NotNull NetworkHandshake networkHandshake) {
        Intrinsics.checkNotNullParameter(networkHandshake, "<set-?>");
        this.handshake = networkHandshake;
    }

    public void setHeaders(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.headers = map;
    }

    public void setRequest(@NotNull NetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(networkRequest, "<set-?>");
        this.request = networkRequest;
    }

    public /* synthetic */ MutableNetworkResponse(Body body, Map map, int i10, NetworkRequest networkRequest, String str, Map map2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(body, map, i10, networkRequest, (i11 & 16) != 0 ? "" : str, (i11 & 32) != 0 ? q.emptyMap() : map2, str2);
    }
}
