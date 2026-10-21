package com.bbva.component.dm.login.data.datasource;

import bk.d;
import bk.q;
import com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract;
import com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContractKt;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.dm.login.domain.model.LoginCredentials;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.model.response.body.Body;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001b\b \u0018\u0000 72\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&JJ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0004J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00102\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aR \u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R \u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u0014\u00102\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00069"}, d2 = {"Lcom/bbva/component/dm/login/data/datasource/LoginDataSource;", "Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;", "Lcom/bbva/component/dm/login/domain/model/LoginCredentials;", "credentials", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "login", "", "logout", "", "requestUrl", "requestBody", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "requestHeaders", "Lcom/bbva/network/constant/Method;", "requestMethod", "Lcom/bbva/network/model/NetworkRequest;", "createRequest", "Lorg/json/JSONObject;", "jsonObject", "fieldName", "", "parseJsonObject", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "networkRequest", "Lcom/bbva/component/dm/login/data/datasource/LoginDataSource$Mapper;", "Lcom/bbva/network/model/response/NetworkResponse;", "mapper", "executeRequest", "", "a", "Ljava/util/List;", "getInvalidCredentialsCodes", "()Ljava/util/List;", "invalidCredentialsCodes", "b", "getBlockedUserCodes", "blockedUserCodes", "c", "getExpiredPasswordCodes", "expiredPasswordCodes", "d", "getUnauthorizedAccessCodes", "unauthorizedAccessCodes", "e", "getUserNotAllowedCodes", "userNotAllowedCodes", "getFieldCode", "()Ljava/lang/String;", "fieldCode", "getFieldMessage", "fieldMessage", "<init>", "()V", "Companion", "Mapper", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public abstract class LoginDataSource implements LoginDataSourceContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> invalidCredentialsCodes = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"11", "74", "160", "161"});

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> blockedUserCodes = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"162", "164"});

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> expiredPasswordCodes = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"163", "165"});

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> unauthorizedAccessCodes = d.listOf("70");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> userNotAllowedCodes = d.listOf("27");

    /* JADX INFO: compiled from: LoginDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/login/data/datasource/LoginDataSource$Mapper;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "", "map", "input", "(Ljava/lang/Object;)Ljava/lang/Object;", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Mapper<I, O> {
        O map(I input);
    }

    /* JADX INFO: compiled from: LoginDataSource.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f27686p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f27687q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Method f27688r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f27689s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, HashMap map, Method method) {
            super(1);
            this.f27686p0 = str;
            this.f27687q0 = map;
            this.f27688r0 = method;
            this.f27689s0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setUrl(this.f27686p0);
            request.setHeaders(this.f27687q0);
            request.setMethod(this.f27688r0);
            Charset charset = Charsets.UTF_8;
            String str = this.f27689s0;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            request.setBody(new NetworkRequestBody.RequestBody(bytes, "application/json"));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRequest createRequest$default(LoginDataSource loginDataSource, String str, String str2, HashMap map, Method method, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRequest");
        }
        if ((i10 & 2) != 0) {
            str2 = new String();
        }
        if ((i10 & 4) != 0) {
            map = q.hashMapOf(TuplesKt.to("Accept", "application/json"), TuplesKt.to("Accept-Language", Locale.getDefault().getLanguage()));
        }
        if ((i10 & 8) != 0) {
            method = Method.GET;
        }
        return loginDataSource.createRequest(str, str2, map, method);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    public final LoginException a(NetworkResponse networkResponse, String str, String str2, Exception exc) {
        Body body;
        String strString;
        String string;
        String str3;
        String string2 = null;
        Integer numValueOf = networkResponse == null ? null : Integer.valueOf(networkResponse.getCode());
        JSONObject jSONObject = (networkResponse == null || (body = networkResponse.getBody()) == null || (strString = body.string()) == null) ? null : new JSONObject(strString);
        if (jSONObject == null) {
            str3 = "unknown-error-exception";
        } else {
            Object jsonObject = parseJsonObject(jSONObject, str);
            if (jsonObject instanceof String) {
                string = (String) jsonObject;
            } else {
                string = jsonObject instanceof Number ? ((Number) jsonObject).toString() : null;
            }
            if (string == null) {
                str3 = "unknown-error-exception";
            } else {
                str3 = string;
            }
        }
        if (jSONObject != null) {
            Object jsonObject2 = parseJsonObject(jSONObject, str2);
            if (jsonObject2 instanceof String) {
                string2 = (String) jsonObject2;
            } else if (jsonObject2 instanceof Number) {
                string2 = ((Number) jsonObject2).toString();
            }
        }
        return new LoginException(str3, numValueOf, exc, string2, LoginDataSourceContractKt.categoryFrom(this, str3));
    }

    @NotNull
    public final NetworkRequest createRequest(@NotNull String requestUrl, @NotNull String requestBody, @NotNull HashMap<String, String> requestHeaders, @NotNull Method requestMethod) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        return MutableNetworkRequestKt.request(new a(requestUrl, requestBody, requestHeaders, requestMethod));
    }

    @NotNull
    public final LoginResponse executeRequest(@NotNull NetworkWorker networkWorker, @NotNull NetworkRequest networkRequest, @NotNull Mapper<NetworkResponse, LoginResponse> mapper) throws Throwable {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        try {
            Result.Companion companion = Result.INSTANCE;
            NetworkResponse networkResponseExecute = networkWorker.execute(networkRequest);
            if (networkResponseExecute.getCode() == 200) {
                return mapper.map(networkResponseExecute);
            }
            throw a(networkResponseExecute, getFieldCode(), getFieldMessage(), null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
            if (thM5538exceptionOrNullimpl == null) {
                throw new KotlinNothingValueException();
            }
            if (thM5538exceptionOrNullimpl instanceof LoginException) {
                throw thM5538exceptionOrNullimpl;
            }
            if (thM5538exceptionOrNullimpl instanceof ConnectionException) {
                throw a(((ConnectionException) thM5538exceptionOrNullimpl).getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String(), getFieldCode(), getFieldMessage(), (Exception) thM5538exceptionOrNullimpl);
            }
            throw new LoginException(thM5538exceptionOrNullimpl, (String) null, (LoginException.ErrorCategory) null, 6, (DefaultConstructorMarker) null);
        }
    }

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public List<String> getBlockedUserCodes() {
        return this.blockedUserCodes;
    }

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public List<String> getExpiredPasswordCodes() {
        return this.expiredPasswordCodes;
    }

    @NotNull
    public abstract String getFieldCode();

    @NotNull
    public abstract String getFieldMessage();

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public List<String> getInvalidCredentialsCodes() {
        return this.invalidCredentialsCodes;
    }

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public List<String> getUnauthorizedAccessCodes() {
        return this.unauthorizedAccessCodes;
    }

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public List<String> getUserNotAllowedCodes() {
        return this.userNotAllowedCodes;
    }

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public abstract LoginResponse login(@NotNull LoginCredentials credentials);

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    public abstract void logout();

    @Nullable
    public Object parseJsonObject(@NotNull JSONObject jsonObject, @NotNull String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("messages");
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray == null ? null : jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return jSONObjectOptJSONObject.opt(fieldName);
    }
}
