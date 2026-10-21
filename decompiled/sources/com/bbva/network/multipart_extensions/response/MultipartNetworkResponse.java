package com.bbva.network.multipart_extensions.response;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.NetworkHandshake;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.model.response.body.Body;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultipartNetworkResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020\u0001¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R4\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0018j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00198\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010$¨\u0006/"}, d2 = {"Lcom/bbva/network/multipart_extensions/response/MultipartNetworkResponse;", "Lcom/bbva/network/model/response/NetworkResponse;", "Lcom/bbva/network/model/response/NetworkHandshake;", "handshake", "", "name", "", "isMultiHeader", "", "multiHeader", "Lcom/bbva/network/multipart_extensions/response/MultipartBody;", "b", "Lcom/bbva/network/multipart_extensions/response/MultipartBody;", "getMultipartBody", "()Lcom/bbva/network/multipart_extensions/response/MultipartBody;", "multipartBody", "Lcom/bbva/network/model/response/body/Body;", "getBody", "()Lcom/bbva/network/model/response/body/Body;", "body", "", "getCode", "()I", "code", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getHeader", "()Ljava/util/HashMap;", "header", "", "getHeaders", "()Ljava/util/Map;", "headers", "isSuccessful", "()Z", "getMessage", "()Ljava/lang/String;", "message", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "request", "getUrl", "url", DigipassManagerConstants.KEY_RESPONSE, "<init>", "(Lcom/bbva/network/model/response/NetworkResponse;)V", "network-multipart-extensions_release"}, k = 1, mv = {1, 8, 0})
public final class MultipartNetworkResponse implements NetworkResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetworkResponse f35165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MultipartBody multipartBody;

    public MultipartNetworkResponse(@NotNull NetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f35165a = response;
        this.multipartBody = new MultipartBody(response.getBody().inputStream());
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public Body getBody() {
        return this.f35165a.getBody();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    public int getCode() {
        return this.f35165a.getCode();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public HashMap<String, String> getHeader() {
        return this.f35165a.getHeader();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public Map<String, String> getHeaders() {
        return this.f35165a.getHeaders();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public String getMessage() {
        return this.f35165a.getMessage();
    }

    @NotNull
    public final MultipartBody getMultipartBody() {
        return this.multipartBody;
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public NetworkRequest getRequest() {
        return this.f35165a.getRequest();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public String getUrl() {
        return this.f35165a.getUrl();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @NotNull
    public NetworkHandshake handshake() {
        return this.f35165a.handshake();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    public boolean isMultiHeader(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f35165a.isMultiHeader(name);
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    public boolean isSuccessful() {
        return this.f35165a.isSuccessful();
    }

    @Override // com.bbva.network.model.response.NetworkResponse
    @Nullable
    public List<String> multiHeader(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f35165a.multiHeader(name);
    }
}
