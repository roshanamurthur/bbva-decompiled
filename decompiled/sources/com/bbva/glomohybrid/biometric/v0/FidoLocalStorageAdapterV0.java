package com.bbva.glomohybrid.biometric.v0;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomohybrid.base.extensions.LocalStorageExtensionsKt;
import com.bbva.localstorage.storage.Storage;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoLocalStorageAdapterV0.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/biometric/v0/FidoLocalStorageAdapterV0;", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoSettingsAdapter;", "", "value", "isAccessEnabled", "()Z", "setAccessEnabled", "(Z)V", "isFidoEnrolled", "setFidoEnrolled", "Lcom/bbva/localstorage/storage/Storage;", "storage", "<init>", "(Lcom/bbva/localstorage/storage/Storage;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoLocalStorageAdapterV0 implements FidoSettingsAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f31631a;

    public FidoLocalStorageAdapterV0(@NotNull Storage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f31631a = storage;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public boolean isAccessEnabled() {
        JsonElement jsonElement = LocalStorageExtensionsKt.getAsJson(this.f31631a, LocalStorageConstantsKt.KEY_ACTIVE_BIO_ACCESS).get(LocalStorageConstantsKt.KEY_ACTIVE_BIO_ACCESS);
        if (jsonElement != null) {
            return jsonElement.getAsBoolean();
        }
        return false;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public boolean isFidoEnrolled() {
        JsonElement jsonElement = LocalStorageExtensionsKt.getAsJson(this.f31631a, LocalStorageConstantsKt.KEY_MAP_DEVICE_ACCESSES).get("enrolledFIDO");
        if (jsonElement != null) {
            return jsonElement.getAsBoolean();
        }
        return false;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public void setAccessEnabled(boolean z10) {
        JsonObject asJson = LocalStorageExtensionsKt.getAsJson(this.f31631a, LocalStorageConstantsKt.KEY_ACTIVE_BIO_ACCESS);
        asJson.addProperty(LocalStorageConstantsKt.KEY_ACTIVE_BIO_ACCESS, Boolean.valueOf(z10));
        Storage.DefaultImpls.set$default(this.f31631a, LocalStorageConstantsKt.KEY_ACTIVE_BIO_ACCESS, asJson.toString(), false, 4, (Object) null);
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter
    public void setFidoEnrolled(boolean z10) {
        JsonObject asJson = LocalStorageExtensionsKt.getAsJson(this.f31631a, LocalStorageConstantsKt.KEY_MAP_DEVICE_ACCESSES);
        asJson.addProperty("enrolledFIDO", Boolean.valueOf(z10));
        Storage.DefaultImpls.set$default(this.f31631a, LocalStorageConstantsKt.KEY_MAP_DEVICE_ACCESSES, asJson.toString(), false, 4, (Object) null);
    }
}
