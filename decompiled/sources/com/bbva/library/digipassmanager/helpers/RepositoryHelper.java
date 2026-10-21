package com.bbva.library.digipassmanager.helpers;

import ad.d;
import android.content.Context;
import bk.p;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.library.digipassmanager.callbacks.OnActivateTokenCrontoOperation;
import com.bbva.library.digipassmanager.callbacks.OnDigipassOperation;
import com.bbva.library.digipassmanager.callbacks.OnResponseOperation;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.library.digipassmanager.models.ActivateTokenBodyModel;
import com.bbva.library.digipassmanager.models.ActivateTokenRequest;
import com.bbva.library.digipassmanager.models.CreateTokenBodyModel;
import com.bbva.library.digipassmanager.models.CreateTokenRequest;
import com.bbva.library.digipassmanager.models.CreateTokenResponse;
import com.bbva.library.digipassmanager.models.ValidateTokenBodyModel;
import com.bbva.library.digipassmanager.models.ValidateTokenRequest;
import com.bbva.library.digipassmanager.models.ValidateTokenResponse;
import com.bbva.library.digipassmanager.repositories.ServiceRepository;
import com.bbva.network.model.pinning.PinningCatalog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RepositoryHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\"\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006J\"\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¨\u0006\u001e"}, d2 = {"Lcom/bbva/library/digipassmanager/helpers/RepositoryHelper;", "Lcom/bbva/library/digipassmanager/callbacks/OnResponseOperation;", "Lcom/bbva/library/digipassmanager/callbacks/OnDigipassOperation;", "", "deviceId", "idToken", "", "headers", "Landroid/content/Context;", "currentContext", "Lcom/bbva/network/model/pinning/PinningCatalog;", "pinningCatalog", "Lcom/bbva/library/digipassmanager/callbacks/OnActivateTokenCrontoOperation;", "mainCallback", "", "initActivationTokenCronto", "Lorg/json/JSONObject;", "responseSuccess", "onResponseSuccess", "responseFailure", "onResponseFailure", "onOperationComplete", "onOperationFailure", "url", "queryParams", "formatUrlWithQueryParams", "formatUrlWithQueryParamsAndFormat", "<init>", "()V", "Companion", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepositoryHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryHelper.kt\ncom/bbva/library/digipassmanager/helpers/RepositoryHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,389:1\n1#2:390\n125#3:391\n152#3,3:392\n125#3:395\n152#3,3:396\n*S KotlinDebug\n*F\n+ 1 RepositoryHelper.kt\ncom/bbva/library/digipassmanager/helpers/RepositoryHelper\n*L\n366#1:391\n366#1:392,3\n380#1:395\n380#1:396,3\n*E\n"})
public final class RepositoryHelper implements OnResponseOperation, OnDigipassOperation {

    @NotNull
    public static final String ACTIVE_TOKEN = "activateToken";

    @NotNull
    public static final String ACTIVE_TOKEN_DEFAULT_URL = "https://t-glomo-mx.prev.grupobbva.com/SRVS_A02/security/v1/tokens/%s/activate-data-hash";

    @NotNull
    public static final String CREATE_TOKEN = "createToken";

    @NotNull
    public static final String CREATE_TOKEN_DEFAULT_URL = "https://t-glomo-mx.prev.grupobbva.com/SRVS_A02/security/v1/tokens";

    @NotNull
    public static final String VALIDATE_TOKEN = "validateToken";

    @NotNull
    public static final String VALIDATE_TOKEN_DEFAULT_URL = "https://t-glomo-mx.prev.grupobbva.com/SRVS_A02/security/v1/tokens/%s/validate-data-hash";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Context f34951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public OnActivateTokenCrontoOperation f34952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public JSONObject f34957g;

    @NotNull
    public final String formatUrlWithQueryParams(@NotNull String url, @NotNull Map<String, String> queryParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        ArrayList arrayList = new ArrayList(queryParams.size());
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            arrayList.add(entry.getKey() + '=' + entry.getValue());
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null);
        return strJoinToString$default.length() > 0 ? d.e(url, '?', strJoinToString$default) : url;
    }

    @NotNull
    public final String formatUrlWithQueryParamsAndFormat(@NotNull String url, @NotNull Map<String, String> queryParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        ArrayList arrayList = new ArrayList(queryParams.size());
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(url, Arrays.copyOf(new Object[]{entry.getValue()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            arrayList.add(str);
        }
        return ((arrayList.isEmpty() ^ true) && arrayList.size() == 1) ? (String) arrayList.get(0) : url;
    }

    public final void initActivationTokenCronto(@NotNull String deviceId, @NotNull String idToken, @NotNull Map<String, String> headers, @NotNull Context currentContext, @Nullable PinningCatalog pinningCatalog, @NotNull OnActivateTokenCrontoOperation mainCallback) {
        String text;
        String str = "";
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        Intrinsics.checkNotNullParameter(mainCallback, "mainCallback");
        Unit unit = null;
        try {
            InputStream inputStreamOpen = currentContext.getAssets().open("server_config.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(\"server_config.json\")");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            text = "";
        }
        if (text.length() > 0) {
            this.f34957g = new JSONObject(text);
        }
        String str2 = headers.get("tsec");
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        this.f34953c = str;
        this.f34954d = deviceId;
        this.f34955e = idToken;
        this.f34951a = currentContext;
        this.f34952b = mainCallback;
        ServiceRepository.Companion companion = ServiceRepository.INSTANCE;
        Intrinsics.checkNotNull(currentContext);
        companion.getInstance(currentContext).setPinningCatalog$digipassmanager_library_release(pinningCatalog);
        String str3 = this.f34953c;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tsec");
            str3 = null;
        }
        String str4 = this.f34954d;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceId");
            str4 = null;
        }
        String str5 = this.f34955e;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("idToken");
            str5 = null;
        }
        JSONObject jSONObject = this.f34957g;
        String string = CREATE_TOKEN_DEFAULT_URL;
        if (jSONObject != null) {
            if (jSONObject.has(CREATE_TOKEN)) {
                string = jSONObject.getString(CREATE_TOKEN);
                Intrinsics.checkNotNullExpressionValue(string, "json.getString(CREATE_TOKEN)");
            }
            Context context = this.f34951a;
            if (context != null) {
                companion.getInstance(context).fetchRequest(new CreateTokenRequest(null, null, string, null, p.mapOf(TuplesKt.to("tsec", str3)), new CreateTokenBodyModel(str4, DigipassManagerConstants.T7, str5).toMap(), 11, null), this);
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        String str6 = string;
        Context context2 = this.f34951a;
        if (context2 != null) {
            companion.getInstance(context2).fetchRequest(new CreateTokenRequest(null, null, str6, null, p.mapOf(TuplesKt.to("tsec", str3)), new CreateTokenBodyModel(str4, DigipassManagerConstants.T7, str5).toMap(), 11, null), this);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // com.bbva.library.digipassmanager.callbacks.OnDigipassOperation
    public void onOperationComplete(@NotNull JSONObject responseSuccess) throws JSONException {
        Intrinsics.checkNotNullParameter(responseSuccess, "responseSuccess");
        String string = responseSuccess.getString(DigipassManagerConstants.KEY_OPERATION_CODE);
        Unit unit = null;
        if (!Intrinsics.areEqual(string, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN_HASH)) {
            if (Intrinsics.areEqual(string, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN_HASH)) {
                String str = this.f34953c;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tsec");
                    str = null;
                }
                String str2 = this.f34955e;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("idToken");
                    str2 = null;
                }
                String string2 = responseSuccess.getString(DigipassManagerConstants.TOKEN_CODE);
                Intrinsics.checkNotNullExpressionValue(string2, "responseSuccess.getStrin…agerConstants.TOKEN_CODE)");
                JSONObject jSONObject = this.f34957g;
                String string3 = ACTIVE_TOKEN_DEFAULT_URL;
                if (jSONObject != null) {
                    if (jSONObject.has(ACTIVE_TOKEN)) {
                        string3 = jSONObject.getString(ACTIVE_TOKEN);
                        Intrinsics.checkNotNullExpressionValue(string3, "json.getString(ACTIVE_TOKEN)");
                    }
                    Context context = this.f34951a;
                    if (context != null) {
                        ServiceRepository.INSTANCE.getInstance(context).fetchRequest(new ActivateTokenRequest(null, null, string3, p.mapOf(TuplesKt.to(DigipassManagerConstants.SERIAL_NUMBER_TOKEN, str2)), p.mapOf(TuplesKt.to("tsec", str)), new ActivateTokenBodyModel(string2).toMap(), 3, null), this);
                        unit = Unit.INSTANCE;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                String str3 = string3;
                Context context2 = this.f34951a;
                if (context2 != null) {
                    ServiceRepository.INSTANCE.getInstance(context2).fetchRequest(new ActivateTokenRequest(null, null, str3, p.mapOf(TuplesKt.to(DigipassManagerConstants.SERIAL_NUMBER_TOKEN, str2)), p.mapOf(TuplesKt.to("tsec", str)), new ActivateTokenBodyModel(string2).toMap(), 3, null), this);
                    Unit unit2 = Unit.INSTANCE;
                    return;
                }
                return;
            }
            return;
        }
        String str4 = this.f34953c;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tsec");
            str4 = null;
        }
        String str5 = this.f34955e;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("idToken");
            str5 = null;
        }
        String str6 = this.f34956f;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DigipassManagerConstants.TOKEN_CHALLENGE);
            str6 = null;
        }
        String string4 = responseSuccess.getString(DigipassManagerConstants.KEY_DEVICE_CODE);
        Intrinsics.checkNotNullExpressionValue(string4, "responseSuccess.getStrin…onstants.KEY_DEVICE_CODE)");
        JSONObject jSONObject2 = this.f34957g;
        String string5 = VALIDATE_TOKEN_DEFAULT_URL;
        if (jSONObject2 != null) {
            if (jSONObject2.has(VALIDATE_TOKEN)) {
                string5 = jSONObject2.getString(VALIDATE_TOKEN);
                Intrinsics.checkNotNullExpressionValue(string5, "json.getString(VALIDATE_TOKEN)");
            }
            Context context3 = this.f34951a;
            if (context3 != null) {
                ServiceRepository.INSTANCE.getInstance(context3).fetchRequest(new ValidateTokenRequest(null, null, string5, p.mapOf(TuplesKt.to(DigipassManagerConstants.SERIAL_NUMBER_TOKEN, str5)), p.mapOf(TuplesKt.to("tsec", str4)), new ValidateTokenBodyModel(str6, string4).toMap(), 3, null), this);
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        String str7 = string5;
        Context context4 = this.f34951a;
        if (context4 != null) {
            ServiceRepository.INSTANCE.getInstance(context4).fetchRequest(new ValidateTokenRequest(null, null, str7, p.mapOf(TuplesKt.to(DigipassManagerConstants.SERIAL_NUMBER_TOKEN, str5)), p.mapOf(TuplesKt.to("tsec", str4)), new ValidateTokenBodyModel(str6, string4).toMap(), 3, null), this);
            Unit unit3 = Unit.INSTANCE;
        }
    }

    @Override // com.bbva.library.digipassmanager.callbacks.OnDigipassOperation
    public void onOperationFailure(@NotNull JSONObject responseFailure) throws JSONException {
        Intrinsics.checkNotNullParameter(responseFailure, "responseFailure");
        JSONObject jSONObject = new JSONObject();
        String string = responseFailure.getString(DigipassManagerConstants.KEY_OPERATION_CODE);
        if (Intrinsics.areEqual(string, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN_HASH) || Intrinsics.areEqual(string, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN_HASH)) {
            jSONObject.put(DigipassManagerConstants.KEY_INFO_ERROR, responseFailure.getString(DigipassManagerConstants.KEY_INFO_ERROR));
            OnActivateTokenCrontoOperation onActivateTokenCrontoOperation = this.f34952b;
            if (onActivateTokenCrontoOperation != null) {
                onActivateTokenCrontoOperation.onActivationFailure(jSONObject);
            }
        }
    }

    @Override // com.bbva.library.digipassmanager.callbacks.OnResponseOperation
    public void onResponseFailure(@NotNull JSONObject responseFailure) throws JSONException {
        Intrinsics.checkNotNullParameter(responseFailure, "responseFailure");
        JSONObject jSONObject = new JSONObject();
        Object obj = responseFailure.get(DigipassManagerConstants.KEY_OPERATION_CODE);
        if (Intrinsics.areEqual(obj, DigipassManagerConstants.OPERATION_CODE_CREATE_TOKEN) || Intrinsics.areEqual(obj, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN) || Intrinsics.areEqual(obj, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN)) {
            jSONObject.put(DigipassManagerConstants.KEY_INFO_ERROR, responseFailure.get(DigipassManagerConstants.KEY_INFO_ERROR));
            OnActivateTokenCrontoOperation onActivateTokenCrontoOperation = this.f34952b;
            if (onActivateTokenCrontoOperation != null) {
                onActivateTokenCrontoOperation.onActivationFailure(jSONObject);
            }
        }
    }

    @Override // com.bbva.library.digipassmanager.callbacks.OnResponseOperation
    public void onResponseSuccess(@NotNull JSONObject responseSuccess) throws JSONException {
        Context context;
        Context context2;
        Intrinsics.checkNotNullParameter(responseSuccess, "responseSuccess");
        String string = responseSuccess.getString(DigipassManagerConstants.KEY_OPERATION_CODE);
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode == 62578974) {
                if (string.equals(DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN);
                    OnActivateTokenCrontoOperation onActivateTokenCrontoOperation = this.f34952b;
                    if (onActivateTokenCrontoOperation != null) {
                        onActivateTokenCrontoOperation.onActivationComplete(jSONObject);
                        return;
                    }
                    return;
                }
                return;
            }
            String str = null;
            if (iHashCode != 64426017) {
                if (iHashCode == 81972915 && string.equals(DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN) && (context2 = this.f34951a) != null) {
                    SecureSharing secureSharing = new SecureSharing(context2);
                    Object obj = responseSuccess.get(DigipassManagerConstants.KEY_RESPONSE);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.bbva.library.digipassmanager.models.ValidateTokenResponse");
                    DigipassManagerHelper companion = DigipassManagerHelper.INSTANCE.getInstance();
                    String tokenAuthCode = ((ValidateTokenResponse) obj).getTokenAuthCode();
                    String str2 = this.f34954d;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("deviceId");
                    } else {
                        str = str2;
                    }
                    companion.activateTokenHash(secureSharing, tokenAuthCode, str, this);
                    return;
                }
                return;
            }
            if (!string.equals(DigipassManagerConstants.OPERATION_CODE_CREATE_TOKEN) || (context = this.f34951a) == null) {
                return;
            }
            SecureSharing secureSharing2 = new SecureSharing(context);
            Object obj2 = responseSuccess.get(DigipassManagerConstants.KEY_RESPONSE);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.bbva.library.digipassmanager.models.CreateTokenResponse");
            CreateTokenResponse createTokenResponse = (CreateTokenResponse) obj2;
            this.f34956f = createTokenResponse.getTokenChallenge();
            DigipassManagerHelper companion2 = DigipassManagerHelper.INSTANCE.getInstance();
            String tokenAuthCode2 = createTokenResponse.getTokenAuthCode();
            String str3 = this.f34954d;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceId");
            } else {
                str = str3;
            }
            companion2.validateTokenHash(secureSharing2, tokenAuthCode2, str, this);
        }
    }
}
