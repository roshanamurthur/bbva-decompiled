package com.bbva.component.dm.naturalauth.data.mapper.service.version.v1;

import com.bbva.component.dm.naturalauth.data.mapper.common.response.BaseGetAuthenticatorsResponseMapper;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAuthenticatorsV1Mapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/service/version/v1/GetAuthenticatorsV1Mapper;", "Lcom/bbva/component/dm/naturalauth/data/mapper/common/response/BaseGetAuthenticatorsResponseMapper;", "()V", "extractDeviceArray", "Lcom/google/gson/JsonArray;", DigipassManagerConstants.KEY_RESPONSE, "Lcom/google/gson/JsonObject;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetAuthenticatorsV1Mapper extends BaseGetAuthenticatorsResponseMapper {
    public GetAuthenticatorsV1Mapper() {
        super(new DeviceInfoV1Mapper(), new AuthenticatorV1Mapper());
    }

    @Override // com.bbva.component.dm.naturalauth.data.mapper.common.response.BaseGetAuthenticatorsResponseMapper
    @Nullable
    public JsonArray extractDeviceArray(@NotNull JsonObject response) {
        JsonArray asJsonArray;
        Intrinsics.checkNotNullParameter(response, "response");
        JsonElement jsonElement = response.get("data");
        if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
            return null;
        }
        return asJsonArray;
    }
}
