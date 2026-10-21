package com.bbva.component.dm.naturalauth.data.mapper.service.version.v0;

import com.bbva.glomoutils.Mapper;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDeviceInfo;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceInfoV0Mapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/service/version/v0/DeviceInfoV0Mapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/google/gson/JsonObject;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDeviceInfo;", "()V", "map", "input", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceInfoV0Mapper implements Mapper<JsonObject, FidoDeviceInfo> {
    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public FidoDeviceInfo map(@NotNull JsonObject input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new FidoDeviceInfo(input.get("info").getAsString(), input.get("id").getAsString());
    }
}
