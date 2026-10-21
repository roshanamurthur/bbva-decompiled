package com.bbva.glomohybrid.biometric.v1;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomohybrid.base.extensions.LocalStorageExtensionsKt;
import com.bbva.glomohybrid.biometric.v0.FidoLocalStorageAdapterV0;
import com.bbva.localstorage.storage.Storage;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoLocalStorageAdapterV1.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/biometric/v1/FidoLocalStorageAdapterV1;", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoSettingsAdapter;", "", "value", "isAccessEnabled", "()Z", "setAccessEnabled", "(Z)V", "isFidoEnrolled", "setFidoEnrolled", "Lcom/bbva/localstorage/storage/Storage;", "storage", "Lcom/bbva/glomohybrid/biometric/v0/FidoLocalStorageAdapterV0;", "adapterV0", "<init>", "(Lcom/bbva/localstorage/storage/Storage;Lcom/bbva/glomohybrid/biometric/v0/FidoLocalStorageAdapterV0;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoLocalStorageAdapterV1 implements FidoSettingsAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f31632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FidoLocalStorageAdapterV0 f31633b;

    public FidoLocalStorageAdapterV1(@NotNull Storage storage, @NotNull FidoLocalStorageAdapterV0 adapterV0) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(adapterV0, "adapterV0");
        this.f31632a = storage;
        this.f31633b = adapterV0;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public boolean isAccessEnabled() {
        return this.f31633b.isAccessEnabled();
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public boolean isFidoEnrolled() {
        JsonElement jsonElement;
        JsonObject asJsonObject = LocalStorageExtensionsKt.getAsJson(this.f31632a, LocalStorageConstantsKt.KEY_MAP_DEVICE_ACCESSES).getAsJsonObject(IAppSDKPlus.EXTRA_KEY_SIGN_UP_FIDO);
        if (asJsonObject == null || (jsonElement = asJsonObject.get("enrolled")) == null) {
            return false;
        }
        return jsonElement.getAsBoolean();
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public void setAccessEnabled(boolean z10) {
        this.f31633b.setAccessEnabled(z10);
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public void setFidoEnrolled(boolean z10) {
        JsonObject asJson = LocalStorageExtensionsKt.getAsJson(this.f31632a, LocalStorageConstantsKt.KEY_MAP_DEVICE_ACCESSES);
        JsonObject jsonObject = LocalStorageExtensionsKt.getJsonObject(asJson, IAppSDKPlus.EXTRA_KEY_SIGN_UP_FIDO);
        jsonObject.addProperty("enrolled", Boolean.valueOf(z10));
        asJson.add(IAppSDKPlus.EXTRA_KEY_SIGN_UP_FIDO, jsonObject);
        Storage.DefaultImpls.set$default(this.f31632a, LocalStorageConstantsKt.KEY_MAP_DEVICE_ACCESSES, asJson.toString(), false, 4, (Object) null);
    }
}
