package com.bbva.component.dm.login.data.mapper;

import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.response.NetworkResponse;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/login/data/mapper/LoginResponseMapper;", "", "()V", "fromNetworkResponseToLoginResponseASO", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/network/model/response/NetworkResponse;", "fromNetworkResponseToLoginResponseASO$component_dm_login_release", "fromNetworkResponseToLoginResponseGlobal", "fromNetworkResponseToLoginResponseGlobal$component_dm_login_release", "fromNetworkResponseToLoginResponseJWT", "fromNetworkResponseToLoginResponseJWT$component_dm_login_release", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LoginResponseMapper {

    @NotNull
    public static final LoginResponseMapper INSTANCE = new LoginResponseMapper();

    @NotNull
    public final LoginResponse fromNetworkResponseToLoginResponseASO$component_dm_login_release(@NotNull NetworkResponse response) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        String asString;
        JsonElement jsonElement3;
        String asString2;
        JsonElement jsonElement4;
        Intrinsics.checkNotNullParameter(response, "response");
        JsonObject asJsonObject = JsonParser.parseString(response.getBody().string()).getAsJsonObject();
        JsonObject asJsonObject2 = null;
        JsonObject asJsonObject3 = (asJsonObject == null || (jsonElement = asJsonObject.get("user")) == null) ? null : jsonElement.getAsJsonObject();
        if (asJsonObject3 != null && (jsonElement4 = asJsonObject3.get("person")) != null) {
            asJsonObject2 = jsonElement4.getAsJsonObject();
        }
        return new LoginResponse((asJsonObject == null || (jsonElement3 = asJsonObject.get("authenticationState")) == null || (asString2 = jsonElement3.getAsString()) == null) ? "" : asString2, null, (asJsonObject2 == null || (jsonElement2 = asJsonObject2.get("id")) == null || (asString = jsonElement2.getAsString()) == null) ? "" : asString, null, 8, null);
    }

    @NotNull
    public final LoginResponse fromNetworkResponseToLoginResponseGlobal$component_dm_login_release(@NotNull NetworkResponse response) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        String asString;
        JsonElement jsonElement3;
        String asString2;
        JsonElement jsonElement4;
        String asString3;
        JsonElement jsonElement5;
        String asString4;
        JsonElement jsonElement6;
        Intrinsics.checkNotNullParameter(response, "response");
        JsonObject asJsonObject = JsonParser.parseString(response.getBody().string()).getAsJsonObject();
        JsonObject asJsonObject2 = null;
        JsonObject asJsonObject3 = (asJsonObject == null || (jsonElement = asJsonObject.get(Constants.authenticationResponse)) == null) ? null : jsonElement.getAsJsonObject();
        if (asJsonObject != null && (jsonElement6 = asJsonObject.get(CustomerIdInterceptor.BACKEND_USER_RESPONSE)) != null) {
            asJsonObject2 = jsonElement6.getAsJsonObject();
        }
        String str = "";
        if (asJsonObject3 == null || (jsonElement2 = asJsonObject3.get("authenticationState")) == null || (asString = jsonElement2.getAsString()) == null) {
            asString = "";
        }
        if (asJsonObject == null || (jsonElement3 = asJsonObject.get("multistepProcessId")) == null || (asString2 = jsonElement3.getAsString()) == null) {
            asString2 = "";
        }
        if (asJsonObject2 == null || (jsonElement4 = asJsonObject2.get(CustomerIdInterceptor.CLIENT_ID)) == null || (asString3 = jsonElement4.getAsString()) == null) {
            asString3 = "";
        }
        if (asJsonObject2 != null && (jsonElement5 = asJsonObject2.get("clientStatus")) != null && (asString4 = jsonElement5.getAsString()) != null) {
            str = asString4;
        }
        return new LoginResponse(asString, asString2, asString3, str);
    }

    @NotNull
    public final LoginResponse fromNetworkResponseToLoginResponseJWT$component_dm_login_release(@NotNull NetworkResponse response) {
        JsonElement jsonElement;
        String asString;
        JsonElement jsonElement2;
        Intrinsics.checkNotNullParameter(response, "response");
        JsonObject asJsonObject = JsonParser.parseString(response.getBody().string()).getAsJsonObject();
        JsonObject asJsonObject2 = null;
        if (asJsonObject != null && (jsonElement2 = asJsonObject.get("data")) != null) {
            asJsonObject2 = jsonElement2.getAsJsonObject();
        }
        return new LoginResponse(null, null, (asJsonObject2 == null || (jsonElement = asJsonObject2.get(Constants.backendRequestUserId)) == null || (asString = jsonElement.getAsString()) == null) ? "" : asString, null, 8, null);
    }
}
