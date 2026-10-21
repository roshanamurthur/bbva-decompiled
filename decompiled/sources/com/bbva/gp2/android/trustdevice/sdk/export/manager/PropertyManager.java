package com.bbva.gp2.android.trustdevice.sdk.export.manager;

import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.LoadPropertiesException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PropertyManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/PropertyManager;", "", "getCountryCode", "", "getCountryName", "getGp2ArmadilloAuthBasic", "getGp2ArmadilloUrlBasic", "getIntegrityCloudProjectNumber", "", "()Ljava/lang/Long;", "getKmconfig", "getPlatformBaseUrl", "getPreRegisterUrl", "getSafetyNetApiKey", "getSendPushTokenUrl", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface PropertyManager {
    @NotNull
    String getCountryCode() throws LoadPropertiesException;

    @NotNull
    String getCountryName() throws LoadPropertiesException;

    @NotNull
    String getGp2ArmadilloAuthBasic() throws LoadPropertiesException;

    @NotNull
    String getGp2ArmadilloUrlBasic() throws LoadPropertiesException;

    @Nullable
    Long getIntegrityCloudProjectNumber() throws LoadPropertiesException;

    @NotNull
    String getKmconfig() throws LoadPropertiesException;

    @NotNull
    String getPlatformBaseUrl() throws LoadPropertiesException;

    @NotNull
    String getPreRegisterUrl() throws LoadPropertiesException;

    @NotNull
    String getSafetyNetApiKey() throws LoadPropertiesException;

    @NotNull
    String getSendPushTokenUrl() throws LoadPropertiesException;
}
