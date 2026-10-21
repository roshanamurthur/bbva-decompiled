package com.bbva.gp2.android.trustdevice.sdk.export.manager.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager;
import com.bbva.gp2.android.trustdevice.sdk.export.utils.SharedPreferencesManager;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.core.crypto.PlatformCryptography;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserSharedPreferencesManagerDefaultImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/impl/UserSharedPreferencesManagerDefaultImpl;", "Lcom/bbva/gp2/android/trustdevice/sdk/export/utils/SharedPreferencesManager;", "Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/UserSharedPreferencesManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DERIVATION_ID_PREFERENCES_KEY", "", "getDERIVATION_ID_PREFERENCES_KEY", "()Ljava/lang/String;", "DEVICE_CODE_KEY", "getDEVICE_CODE_KEY", "DEVICE_NAME_KEY", "getDEVICE_NAME_KEY", "OS_VERSION_KEY", "getOS_VERSION_KEY", "PUSH_TOKEN", "getPUSH_TOKEN", "getContext", "()Landroid/content/Context;", Constants.deleteAll, "", "getDerivationId", "getDeviceCode", "getDeviceName", "getOsVersion", "getPushToken", "storeDerivationId", "", PlatformCryptography.DERIVATION_ID_KEY, "storeDeviceCode", "deviceCode", "storeDeviceName", "deviceName", "storeOsVersion", ContextualDataConstants.CD_OS_VERSION, "storePushToken", "pushToken", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserSharedPreferencesManagerDefaultImpl extends SharedPreferencesManager implements UserSharedPreferencesManager {

    @NotNull
    private final String DERIVATION_ID_PREFERENCES_KEY;

    @NotNull
    private final String DEVICE_CODE_KEY;

    @NotNull
    private final String DEVICE_NAME_KEY;

    @NotNull
    private final String OS_VERSION_KEY;

    @NotNull
    private final String PUSH_TOKEN;

    @NotNull
    private final Context context;

    /* JADX WARN: Illegal instructions before constructor call */
    public UserSharedPreferencesManagerDefaultImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("trustDeviceUserSharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…s\", Context.MODE_PRIVATE)");
        super(sharedPreferences);
        this.context = context;
        this.DERIVATION_ID_PREFERENCES_KEY = "TOHU_DERIVATION_ID";
        this.DEVICE_CODE_KEY = DigipassManagerConstants.KEY_DEVICE_CODE;
        this.OS_VERSION_KEY = "OS_VERSION";
        this.DEVICE_NAME_KEY = "DEVICE_NAME";
        this.PUSH_TOKEN = "PUSH_TOKEN";
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.utils.SharedPreferencesManager, com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    public boolean deleteAll() {
        return super.deleteAll();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getDERIVATION_ID_PREFERENCES_KEY() {
        return this.DERIVATION_ID_PREFERENCES_KEY;
    }

    @NotNull
    public final String getDEVICE_CODE_KEY() {
        return this.DEVICE_CODE_KEY;
    }

    @NotNull
    public final String getDEVICE_NAME_KEY() {
        return this.DEVICE_NAME_KEY;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    @Nullable
    public String getDerivationId() {
        return retrieveString(this.DERIVATION_ID_PREFERENCES_KEY);
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    @Nullable
    public String getDeviceCode() {
        return retrieveString(this.DEVICE_CODE_KEY);
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    @Nullable
    public String getDeviceName() {
        return retrieveString(this.DEVICE_NAME_KEY);
    }

    @NotNull
    public final String getOS_VERSION_KEY() {
        return this.OS_VERSION_KEY;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    @Nullable
    public String getOsVersion() {
        return retrieveString(this.OS_VERSION_KEY);
    }

    @NotNull
    public final String getPUSH_TOKEN() {
        return this.PUSH_TOKEN;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    @Nullable
    public String getPushToken() {
        return retrieveString(this.PUSH_TOKEN);
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    public void storeDerivationId(@NotNull String derivationId) {
        Intrinsics.checkNotNullParameter(derivationId, "derivationId");
        store(buildTuple(this.DERIVATION_ID_PREFERENCES_KEY, derivationId));
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    public void storeDeviceCode(@NotNull String deviceCode) {
        Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
        store(buildTuple(this.DEVICE_CODE_KEY, deviceCode));
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    public void storeDeviceName(@NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        store(buildTuple(this.DEVICE_NAME_KEY, deviceName));
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    public void storeOsVersion(@NotNull String osVersion) {
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        store(buildTuple(this.OS_VERSION_KEY, osVersion));
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.UserSharedPreferencesManager
    public void storePushToken(@NotNull String pushToken) {
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        store(buildTuple(this.PUSH_TOKEN, pushToken));
    }
}
