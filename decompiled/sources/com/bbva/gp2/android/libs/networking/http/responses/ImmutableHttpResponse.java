package com.bbva.gp2.android.libs.networking.http.responses;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/responses/ImmutableHttpResponse;", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpResponse;", "status", "", "body", "Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBody;", "headers", "", "", "(ILcom/bbva/gp2/android/libs/networking/http/responses/ResponseBody;Ljava/util/Map;)V", "getBody", "()Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBody;", "getHeaders", "()Ljava/util/Map;", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ImmutableHttpResponse implements HttpResponse {

    @Nullable
    private final ResponseBody body;

    @NotNull
    private final Map<String, String> headers;
    private final int status;

    public ImmutableHttpResponse(int i10, @Nullable ResponseBody responseBody, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.status = i10;
        this.body = responseBody;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImmutableHttpResponse copy$default(ImmutableHttpResponse immutableHttpResponse, int i10, ResponseBody responseBody, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = immutableHttpResponse.getStatus();
        }
        if ((i11 & 2) != 0) {
            responseBody = immutableHttpResponse.getBody();
        }
        if ((i11 & 4) != 0) {
            map = immutableHttpResponse.getHeaders();
        }
        return immutableHttpResponse.copy(i10, responseBody, map);
    }

    public final int component1() {
        return getStatus();
    }

    @Nullable
    public final ResponseBody component2() {
        return getBody();
    }

    @NotNull
    public final Map<String, String> component3() {
        return getHeaders();
    }

    @NotNull
    public final ImmutableHttpResponse copy(int status, @Nullable ResponseBody body, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new ImmutableHttpResponse(status, body, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImmutableHttpResponse)) {
            return false;
        }
        ImmutableHttpResponse immutableHttpResponse = (ImmutableHttpResponse) other;
        return getStatus() == immutableHttpResponse.getStatus() && Intrinsics.areEqual(getBody(), immutableHttpResponse.getBody()) && Intrinsics.areEqual(getHeaders(), immutableHttpResponse.getHeaders());
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.HttpResponse
    @Nullable
    public ResponseBody getBody() {
        return this.body;
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.HttpResponse
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.HttpResponse
    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return getHeaders().hashCode() + (((getStatus() * 31) + (getBody() == null ? 0 : getBody().hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "ImmutableHttpResponse(status=" + getStatus() + ", body=" + getBody() + ", headers=" + getHeaders() + RootService.CLOSE_BRACKET;
    }
}
