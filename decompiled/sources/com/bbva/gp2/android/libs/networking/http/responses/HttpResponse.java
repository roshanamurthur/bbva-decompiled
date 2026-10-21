package com.bbva.gp2.android.libs.networking.http.responses;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/responses/HttpResponse;", "", "body", "Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBody;", "getBody", "()Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBody;", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "status", "", "getStatus", "()I", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface HttpResponse {
    @Nullable
    ResponseBody getBody();

    @Nullable
    Map<String, String> getHeaders();

    int getStatus();
}
