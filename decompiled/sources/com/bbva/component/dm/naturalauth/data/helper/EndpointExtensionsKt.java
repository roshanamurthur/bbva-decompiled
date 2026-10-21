package com.bbva.component.dm.naturalauth.data.helper;

import bk.q;
import com.bbva.component.dm.naturalauth.domain.model.Endpoint;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.response.NetworkResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndpointExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u001ae\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u00072\"\b\u0002\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u0002H\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0018\u00010\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0002\u0010\u0011\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0012"}, d2 = {"method", "Lcom/bbva/network/constant/Method;", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "getMethod", "(Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;)Lcom/bbva/network/constant/Method;", "executeRequest", "Lcom/bbva/network/model/response/NetworkResponse;", "Payload", "worker", "Lcom/bbva/network/NetworkWorker;", "bodyPayload", "bodyMapper", "Lkotlin/reflect/KFunction1;", "", "", "", "queryParams", "(Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;Lcom/bbva/network/NetworkWorker;Ljava/lang/Object;Lkotlin/reflect/KFunction;Ljava/util/Map;)Lcom/bbva/network/model/response/NetworkResponse;", "component-dm-naturalauth_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EndpointExtensionsKt {
    @NotNull
    public static final <Payload> NetworkResponse executeRequest(@NotNull Endpoint endpoint, @NotNull NetworkWorker worker, @Nullable Payload payload, @Nullable KFunction<? extends Map<String, ? extends Object>> kFunction, @NotNull Map<String, String> queryParams) {
        Intrinsics.checkNotNullParameter(endpoint, "<this>");
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        String string = (payload == null || kFunction == null) ? "" : new JSONObject((Map) ((Function1) kFunction).invoke(payload)).toString();
        Intrinsics.checkNotNull(string);
        DataSourceHelper dataSourceHelper = DataSourceHelper.INSTANCE;
        return worker.execute(DataSourceHelper.createRequest$default(dataSourceHelper, dataSourceHelper.getHttpUrl(endpoint, queryParams), string, null, getMethod(endpoint), 4, null));
    }

    public static /* synthetic */ NetworkResponse executeRequest$default(Endpoint endpoint, NetworkWorker networkWorker, Object obj, KFunction kFunction, Map map, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            kFunction = null;
        }
        if ((i10 & 8) != 0) {
            map = q.emptyMap();
        }
        return executeRequest(endpoint, networkWorker, obj, kFunction, map);
    }

    @NotNull
    public static final Method getMethod(@NotNull Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<this>");
        if (endpoint instanceof Endpoint.Post) {
            return Method.POST;
        }
        if (endpoint instanceof Endpoint.Delete) {
            return Method.DELETE;
        }
        if (endpoint instanceof Endpoint.Get) {
            return Method.GET;
        }
        throw new NoWhenBranchMatchedException();
    }
}
