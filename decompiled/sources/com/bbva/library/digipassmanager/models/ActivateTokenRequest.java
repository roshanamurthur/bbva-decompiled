package com.bbva.library.digipassmanager.models;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bbva/library/digipassmanager/models/ActivateTokenRequest;", "Lcom/bbva/library/digipassmanager/models/Request;", "", "f", "Ljava/lang/String;", "getOperationCode", "()Ljava/lang/String;", "operationCode", "Lcom/bbva/network/constant/Method;", "method", "url", "", "queryParams", "headers", "", "body", "<init>", "(Ljava/lang/String;Lcom/bbva/network/constant/Method;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final class ActivateTokenRequest extends Request {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operationCode;

    public /* synthetic */ ActivateTokenRequest(String str, Method method, String str2, Map map, Map map2, Map map3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN : str, (i10 & 2) != 0 ? Method.POST : method, str2, map, map2, map3);
    }

    @NotNull
    public final String getOperationCode() {
        return this.operationCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateTokenRequest(@NotNull String operationCode, @NotNull Method method, @NotNull String url, @NotNull Map<String, String> queryParams, @NotNull Map<String, String> headers, @NotNull Map<String, ? extends Object> body) {
        super(method, url, queryParams, headers, body, null);
        Intrinsics.checkNotNullParameter(operationCode, "operationCode");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.operationCode = operationCode;
    }
}
