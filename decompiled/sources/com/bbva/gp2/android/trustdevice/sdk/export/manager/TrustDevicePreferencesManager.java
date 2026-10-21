package com.bbva.gp2.android.trustdevice.sdk.export.manager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrustDevicePreferencesManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&¨\u0006\f"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/TrustDevicePreferencesManager;", "", "getDerivationId", "", "getDeviceCode", "getDeviceName", "getIntegrityCloudProjectNumber", "", "()Ljava/lang/Long;", "getKMConfig", "getOsVersion", "getPushToken", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface TrustDevicePreferencesManager {
    @Nullable
    String getDerivationId();

    @Nullable
    String getDeviceCode();

    @Nullable
    String getDeviceName();

    @Nullable
    Long getIntegrityCloudProjectNumber();

    @NotNull
    String getKMConfig();

    @Nullable
    String getOsVersion();

    @Nullable
    String getPushToken();
}
