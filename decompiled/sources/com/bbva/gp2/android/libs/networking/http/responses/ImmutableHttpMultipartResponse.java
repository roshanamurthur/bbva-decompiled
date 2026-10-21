package com.bbva.gp2.android.libs.networking.http.responses;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpMultipartResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/responses/ImmutableHttpMultipartResponse;", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpMultipartResponse;", "status", "", "body", "", "Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBodyPart;", "headers", "", "", "(ILjava/util/List;Ljava/util/Map;)V", "getBody", "()Ljava/util/List;", "getHeaders", "()Ljava/util/Map;", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ImmutableHttpMultipartResponse implements HttpMultipartResponse {

    @NotNull
    private final List<ResponseBodyPart> body;

    @NotNull
    private final Map<String, String> headers;
    private final int status;

    public ImmutableHttpMultipartResponse(int i10, @NotNull List<ResponseBodyPart> body, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.status = i10;
        this.body = body;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImmutableHttpMultipartResponse copy$default(ImmutableHttpMultipartResponse immutableHttpMultipartResponse, int i10, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = immutableHttpMultipartResponse.getStatus();
        }
        if ((i11 & 2) != 0) {
            list = immutableHttpMultipartResponse.getBody();
        }
        if ((i11 & 4) != 0) {
            map = immutableHttpMultipartResponse.getHeaders();
        }
        return immutableHttpMultipartResponse.copy(i10, list, map);
    }

    public final int component1() {
        return getStatus();
    }

    @NotNull
    public final List<ResponseBodyPart> component2() {
        return getBody();
    }

    @NotNull
    public final Map<String, String> component3() {
        return getHeaders();
    }

    @NotNull
    public final ImmutableHttpMultipartResponse copy(int status, @NotNull List<ResponseBodyPart> body, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new ImmutableHttpMultipartResponse(status, body, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImmutableHttpMultipartResponse)) {
            return false;
        }
        ImmutableHttpMultipartResponse immutableHttpMultipartResponse = (ImmutableHttpMultipartResponse) other;
        return getStatus() == immutableHttpMultipartResponse.getStatus() && Intrinsics.areEqual(getBody(), immutableHttpMultipartResponse.getBody()) && Intrinsics.areEqual(getHeaders(), immutableHttpMultipartResponse.getHeaders());
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.HttpMultipartResponse
    @NotNull
    public List<ResponseBodyPart> getBody() {
        return this.body;
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.HttpMultipartResponse
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.HttpMultipartResponse
    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return getHeaders().hashCode() + ((getBody().hashCode() + (getStatus() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ImmutableHttpMultipartResponse(status=" + getStatus() + ", body=" + getBody() + ", headers=" + getHeaders() + RootService.CLOSE_BRACKET;
    }
}
