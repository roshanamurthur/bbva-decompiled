package com.bbva.gp2.android.trustdevice.sdk.export.manager;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.tohu.android.core.crypto.PlatformCryptography;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserSharedPreferencesManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/UserSharedPreferencesManager;", "", Constants.deleteAll, "", "getDerivationId", "", "getDeviceCode", "getDeviceName", "getOsVersion", "getPushToken", "storeDerivationId", "", PlatformCryptography.DERIVATION_ID_KEY, "storeDeviceCode", "deviceCode", "storeDeviceName", "deviceName", "storeOsVersion", ContextualDataConstants.CD_OS_VERSION, "storePushToken", "pushToken", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface UserSharedPreferencesManager {
    boolean deleteAll();

    @Nullable
    String getDerivationId();

    @Nullable
    String getDeviceCode();

    @Nullable
    String getDeviceName();

    @Nullable
    String getOsVersion();

    @Nullable
    String getPushToken();

    void storeDerivationId(@NotNull String derivationId);

    void storeDeviceCode(@NotNull String deviceCode);

    void storeDeviceName(@NotNull String deviceName);

    void storeOsVersion(@NotNull String osVersion);

    void storePushToken(@NotNull String pushToken);
}
