package com.bbva.component.ic.security.extensions;

import bk.q;
import com.bbva.component.ic.security.model.Response;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkResponseExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"createResponse", "Lcom/bbva/component/ic/security/model/Response;", "Lcom/bbva/network/model/response/MutableNetworkResponse;", "component-ic-security_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NetworkResponseExtensionsKt {
    @NotNull
    public static final Response createResponse(@NotNull MutableNetworkResponse mutableNetworkResponse) throws IOException {
        Intrinsics.checkNotNullParameter(mutableNetworkResponse, "<this>");
        Map mutableMap = q.toMutableMap(mutableNetworkResponse.getHeaders());
        int code = mutableNetworkResponse.getCode();
        String strString = mutableNetworkResponse.getBody().string();
        if (strString == null) {
            strString = "";
        }
        return new Response(mutableMap, code, strString, mutableNetworkResponse.getRequest());
    }
}
