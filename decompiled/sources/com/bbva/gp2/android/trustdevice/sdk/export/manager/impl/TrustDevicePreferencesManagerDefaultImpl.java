package com.bbva.gp2.android.trustdevice.sdk.export.manager.impl;

import com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrustDevicePreferencesManagerDefaultImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\bH\u0016J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/impl/TrustDevicePreferencesManagerDefaultImpl;", "Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/TrustDevicePreferencesManager;", "userSharedPreferencesManager", "Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/UserSharedPreferencesManager;", "propertyManager", "Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/PropertyManager;", "(Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/UserSharedPreferencesManager;Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/PropertyManager;)V", "getDerivationId", "", "getDeviceCode", "getDeviceName", "getIntegrityCloudProjectNumber", "", "()Ljava/lang/Long;", "getKMConfig", "getOsVersion", "getPushToken", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TrustDevicePreferencesManagerDefaultImpl implements TrustDevicePreferencesManager {

    @NotNull
    private final PropertyManager propertyManager;

    @NotNull
    private final UserSharedPreferencesManager userSharedPreferencesManager;

    public TrustDevicePreferencesManagerDefaultImpl(@NotNull UserSharedPreferencesManager userSharedPreferencesManager, @NotNull PropertyManager propertyManager) {
        Intrinsics.checkNotNullParameter(userSharedPreferencesManager, "userSharedPreferencesManager");
        Intrinsics.checkNotNullParameter(propertyManager, "propertyManager");
        this.userSharedPreferencesManager = userSharedPreferencesManager;
        this.propertyManager = propertyManager;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager
    @Nullable
    public String getDerivationId() {
        return this.userSharedPreferencesManager.getDerivationId();
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager
    @Nullable
    public String getDeviceCode() {
        return this.userSharedPreferencesManager.getDeviceCode();
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager
    @Nullable
    public String getDeviceName() {
        return this.userSharedPreferencesManager.getDeviceName();
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager
    @Nullable
    public Long getIntegrityCloudProjectNumber() {
        return this.propertyManager.getIntegrityCloudProjectNumber();
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager
    @NotNull
    public String getKMConfig() {
        return this.propertyManager.getKmconfig();
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager
    @Nullable
    public String getOsVersion() {
        return this.userSharedPreferencesManager.getOsVersion();
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager
    @Nullable
    public String getPushToken() {
        return this.userSharedPreferencesManager.getPushToken();
    }
}
