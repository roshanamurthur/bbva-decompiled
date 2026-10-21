package com.bbva.component.ic.security.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.network.model.NetworkRequest;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J?\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/bbva/component/ic/security/model/Response;", "", "", "", "component1", "", "component2", "component3", "Lcom/bbva/network/model/NetworkRequest;", "component4", "headers", "code", "body", "request", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "c", "Ljava/lang/String;", "getBody", "()Ljava/lang/String;", "d", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "<init>", "(Ljava/util/Map;ILjava/lang/String;Lcom/bbva/network/model/NetworkRequest;)V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    public Response(@NotNull Map<String, String> headers, int i10, @NotNull String body, @NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(request, "request");
        this.headers = headers;
        this.code = i10;
        this.body = body;
        this.request = request;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, Map map, int i10, String str, NetworkRequest networkRequest, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = response.headers;
        }
        if ((i11 & 2) != 0) {
            i10 = response.code;
        }
        if ((i11 & 4) != 0) {
            str = response.body;
        }
        if ((i11 & 8) != 0) {
            networkRequest = response.request;
        }
        return response.copy(map, i10, str, networkRequest);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NetworkRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final Response copy(@NotNull Map<String, String> headers, int code, @NotNull String body, @NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(request, "request");
        return new Response(headers, code, body, request);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return Intrinsics.areEqual(this.headers, response.headers) && this.code == response.code && Intrinsics.areEqual(this.body, response.body) && Intrinsics.areEqual(this.request, response.request);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final NetworkRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return this.request.hashCode() + n1.c(this.body, ((this.headers.hashCode() * 31) + this.code) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "Response(headers=" + this.headers + ", code=" + this.code + ", body=" + this.body + ", request=" + this.request + ")";
    }
}
