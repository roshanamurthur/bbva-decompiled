package com.bbva.library.digipassmanager.datasources;

import android.content.Context;
import bk.p;
import bk.q;
import com.bbva.library.digipassmanager.callbacks.OnResponseOperation;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.library.digipassmanager.helpers.DataSourceHelper;
import com.bbva.library.digipassmanager.models.CreateTokenResponse;
import com.bbva.library.digipassmanager.models.ValidateTokenResponse;
import com.bbva.network.RequestCallback;
import com.bbva.network.constant.Method;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.impl.OkHttpNetworkWorker;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.pinning.PinningCatalog;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.model.response.body.Body;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ServiceDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0017"}, d2 = {"Lcom/bbva/library/digipassmanager/datasources/ServiceDataSource;", "", "Lcom/bbva/network/model/pinning/PinningCatalog;", "pinningCatalog", "", "setPinningCatalog$digipassmanager_library_release", "(Lcom/bbva/network/model/pinning/PinningCatalog;)V", "setPinningCatalog", "", "operationCode", "Lcom/bbva/network/constant/Method;", "requestMethod", "requestUrl", "", "requestBody", "requestHeaders", "Lcom/bbva/library/digipassmanager/callbacks/OnResponseOperation;", "callback", "executeRequest", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final class ServiceDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f34931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OkHttpNetworkWorker f34932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f34933c;

    /* JADX INFO: compiled from: ServiceDataSource.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Method f34934p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f34935q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f34936r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f34937s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ServiceDataSource f34938t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method method, String str, Map<String, ? extends Object> map, Map<String, String> map2, ServiceDataSource serviceDataSource) {
            super(1);
            this.f34934p0 = method;
            this.f34935q0 = str;
            this.f34936r0 = map;
            this.f34937s0 = map2;
            this.f34938t0 = serviceDataSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setMethod(this.f34934p0);
            request.setUrl(this.f34935q0);
            request.setBody(DataSourceHelper.INSTANCE.getInstance().getRequestBody(this.f34936r0));
            request.setHeaders(q.plus(this.f34937s0, this.f34938t0.f34933c));
            return Unit.INSTANCE;
        }
    }

    public ServiceDataSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34931a = context;
        this.f34933c = p.mapOf(TuplesKt.to(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json"));
    }

    public static final CreateTokenResponse access$toCreateTokenResponse(ServiceDataSource serviceDataSource, JSONObject jSONObject) throws JSONException {
        serviceDataSource.getClass();
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String tokenAuthCode = jSONObject2.getString(DigipassManagerConstants.TOKEN_AUTH_CODE);
        String tokenChallenge = jSONObject2.getString(DigipassManagerConstants.TOKEN_CHALLENGE);
        Intrinsics.checkNotNullExpressionValue(tokenAuthCode, "tokenAuthCode");
        Intrinsics.checkNotNullExpressionValue(tokenChallenge, "tokenChallenge");
        return new CreateTokenResponse(tokenAuthCode, tokenChallenge);
    }

    public static final ValidateTokenResponse access$toValidateTokenResponse(ServiceDataSource serviceDataSource, JSONObject jSONObject) {
        serviceDataSource.getClass();
        try {
            String tokenAuthCode = jSONObject.getJSONObject("data").getString(DigipassManagerConstants.TOKEN_AUTH_CODE);
            Intrinsics.checkNotNullExpressionValue(tokenAuthCode, "tokenAuthCode");
            return new ValidateTokenResponse(tokenAuthCode);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void executeRequest(@NotNull final String operationCode, @NotNull Method requestMethod, @NotNull String requestUrl, @NotNull Map<String, ? extends Object> requestBody, @NotNull Map<String, String> requestHeaders, @NotNull final OnResponseOperation callback) {
        Intrinsics.checkNotNullParameter(operationCode, "operationCode");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NetworkRequest networkRequestRequest = MutableNetworkRequestKt.request(new a(requestMethod, requestUrl, requestBody, requestHeaders, this));
        OkHttpNetworkWorker okHttpNetworkWorker = this.f34932b;
        if (okHttpNetworkWorker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("worker");
            okHttpNetworkWorker = null;
        }
        okHttpNetworkWorker.enqueue(networkRequestRequest, new RequestCallback() { // from class: com.bbva.library.digipassmanager.datasources.ServiceDataSource.executeRequest.1
            @Override // com.bbva.network.RequestCallback
            public void onComplete(@NotNull NetworkResponse response) throws JSONException {
                JSONObject json;
                JSONObject json2;
                Unit unit;
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject = new JSONObject();
                String str = operationCode;
                int iHashCode = str.hashCode();
                OnResponseOperation onResponseOperation = callback;
                if (iHashCode == 62578974) {
                    if (str.equals(DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN) && Intrinsics.areEqual(response.getHeaders().get(DigipassManagerConstants.RESPONSE_WARNING_DESCRIPTION), DigipassManagerConstants.CONSULTA_CORRECTA)) {
                        jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN);
                        onResponseOperation.onResponseSuccess(jSONObject);
                        return;
                    }
                    return;
                }
                ServiceDataSource serviceDataSource = this;
                if (iHashCode == 64426017) {
                    if (!str.equals(DigipassManagerConstants.OPERATION_CODE_CREATE_TOKEN) || (json = DataSourceHelper.INSTANCE.getInstance().toJSON(response.getBody(), String.valueOf(response.getRequest().getHeaders().get(DigipassManagerConstants.KEY_CONTENT_TYPE)))) == null) {
                        return;
                    }
                    jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_CREATE_TOKEN);
                    jSONObject.put(DigipassManagerConstants.KEY_RESPONSE, ServiceDataSource.access$toCreateTokenResponse(serviceDataSource, json));
                    onResponseOperation.onResponseSuccess(jSONObject);
                    return;
                }
                if (iHashCode == 81972915 && str.equals(DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN) && (json2 = DataSourceHelper.INSTANCE.getInstance().toJSON(response.getBody(), String.valueOf(response.getRequest().getHeaders().get(DigipassManagerConstants.KEY_CONTENT_TYPE)))) != null) {
                    ValidateTokenResponse validateTokenResponseAccess$toValidateTokenResponse = ServiceDataSource.access$toValidateTokenResponse(serviceDataSource, json2);
                    if (validateTokenResponseAccess$toValidateTokenResponse != null) {
                        jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN);
                        jSONObject.put(DigipassManagerConstants.KEY_RESPONSE, validateTokenResponseAccess$toValidateTokenResponse);
                        onResponseOperation.onResponseSuccess(jSONObject);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        onError(new ConnectionException(null, null, null, 7, null));
                    }
                }
            }

            @Override // com.bbva.network.RequestCallback
            public void onError(@NotNull ConnectionException exception) throws JSONException {
                Body body;
                Intrinsics.checkNotNullParameter(exception, "exception");
                JSONObject jSONObject = new JSONObject();
                NetworkResponse networkResponse = exception.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
                String strString = (networkResponse == null || (body = networkResponse.getBody()) == null) ? null : body.string();
                if (strString == null || !StringsKt__StringsKt.contains((CharSequence) strString, (CharSequence) DigipassManagerConstants.CRONTO_ZERO_ACTIVATIONS, true)) {
                    jSONObject.put(DigipassManagerConstants.KEY_INFO_ERROR, DigipassManagerConstants.ERROR_TECHNICAL);
                } else {
                    jSONObject.put(DigipassManagerConstants.KEY_INFO_ERROR, DigipassManagerConstants.LIMIT_REACHED_ERROR);
                }
                String str = operationCode;
                int iHashCode = str.hashCode();
                OnResponseOperation onResponseOperation = callback;
                if (iHashCode == 62578974) {
                    if (str.equals(DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN)) {
                        jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN);
                        onResponseOperation.onResponseFailure(jSONObject);
                        return;
                    }
                    return;
                }
                if (iHashCode == 64426017) {
                    if (str.equals(DigipassManagerConstants.OPERATION_CODE_CREATE_TOKEN)) {
                        jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_CREATE_TOKEN);
                        onResponseOperation.onResponseFailure(jSONObject);
                        return;
                    }
                    return;
                }
                if (iHashCode == 81972915 && str.equals(DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN)) {
                    jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN);
                    onResponseOperation.onResponseFailure(jSONObject);
                }
            }
        });
    }

    public final void setPinningCatalog$digipassmanager_library_release(@Nullable PinningCatalog pinningCatalog) {
        if (pinningCatalog == null) {
            this.f34932b = new OkHttpNetworkWorker(this.f34931a, new OkHttpClient(), null, null, null, null, 60, null);
        } else {
            this.f34932b = new OkHttpNetworkWorker(this.f34931a, new OkHttpClient(), pinningCatalog, null, null, null, 56, null);
        }
    }
}
