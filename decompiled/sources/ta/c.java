package ta;

import bk.q;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.networkplugin.command.params.RequestParams;
import com.google.gson.JsonElement;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;

/* JADX INFO: compiled from: RequestCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends Lambda implements Function1<MutableNetworkRequest, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Method f93495p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RequestParams f93496q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f93497r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Method method, RequestParams requestParams, String str) {
        super(1);
        this.f93495p0 = method;
        this.f93496q0 = requestParams;
        this.f93497r0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
        JsonElement params;
        MutableNetworkRequest request = mutableNetworkRequest;
        Intrinsics.checkNotNullParameter(request, "$this$request");
        request.setMethod(this.f93495p0);
        RequestParams requestParams = this.f93496q0;
        request.setUrl(requestParams.getUrl());
        Map<String, String> headers = requestParams.getHeaders();
        if (headers == null) {
            headers = q.emptyMap();
        }
        request.setHeaders(headers);
        request.setTimeout(requestParams.getTimeout());
        String str = this.f93497r0;
        if (l.equals("application/x-www-form-urlencoded", str, true) && (params = requestParams.getParams()) != null && params.isJsonObject()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : requestParams.getParams().getAsJsonObject().entrySet()) {
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "mutableEntry.key");
                String asString = entry.getValue().getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "mutableEntry.value.asString");
                linkedHashMap.put(key, asString);
            }
            request.formBody(linkedHashMap);
        } else {
            request.body(String.valueOf(requestParams.getParams()), str);
        }
        return Unit.INSTANCE;
    }
}
