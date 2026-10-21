package com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.model.output.NfcState;
import com.bbva.ethermobilesdk.devicemanager.model.output.SystemThemeStateResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceInfoRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H&J\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u00107J\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u00107J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u00107J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H¦@¢\u0006\u0002\u00107¨\u0006;"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "", "getAndroidId", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "getCollideFingerprint", Constants.backendRequestUserId, "applicationVersionCode", "applicationVersionName", "batteryLevel", "", "isBluetooth", "", "isMicrophonePresent", Constants.manufacturer, "model", "nfcStatus", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/NfcState;", "ramAvailable", "", "ramTotal", "ramUsed", "ramUsedPercent", "languageCode", "languageName", "isCaptivePortal", "isProxy", "isWifiSecured", "networkSignalStrength", "networkIpAddressVersion4", "networkIpAddressVersion6", "screenBrightnessLevel", "screenHeight", "screenWidth", "screenIsLocked", "storageTotal", "storageTotalUnit", "currentTimeZone", "systemCurrentTheme", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "isGmsAvailable", "systemPlatformName", "systemPlatformVersionName", "systemPlatformVersionCode", "systemPropertiesJavaVmName", "systemPropertiesJavaVmVersion", "systemPropertiesOsVersion", "systemPropertiesRuntimeName", "systemPropertiesRuntimeVersion", "isAutomaticZone", "isAutomaticDateAndTime", "currentDate", "currentDateIso", "currentTime", "currentDateTimeNtp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentDateTimeNtpIso", "currentDateNtp", "currentTimeNtp", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceInfoRepository {
    @NotNull
    Result<String> applicationVersionCode();

    @NotNull
    Result<String> applicationVersionName();

    @NotNull
    Result<Integer> batteryLevel();

    @NotNull
    Result<String> currentDate();

    @NotNull
    Result<String> currentDateIso();

    @Nullable
    Object currentDateNtp(@NotNull Continuation<? super Result<String>> continuation);

    @Nullable
    Object currentDateTimeNtp(@NotNull Continuation<? super Result<String>> continuation);

    @Nullable
    Object currentDateTimeNtpIso(@NotNull Continuation<? super Result<String>> continuation);

    @NotNull
    Result<Long> currentTime();

    @Nullable
    Object currentTimeNtp(@NotNull Continuation<? super Result<Long>> continuation);

    @NotNull
    Result<String> currentTimeZone();

    @NotNull
    Result<String> getAndroidId();

    @NotNull
    Result<String> getCollideFingerprint(@NotNull String userId);

    @NotNull
    Result<Boolean> isAutomaticDateAndTime();

    @NotNull
    Result<Boolean> isAutomaticZone();

    @NotNull
    Result<Boolean> isBluetooth();

    @NotNull
    Result<Boolean> isCaptivePortal();

    @NotNull
    Result<Boolean> isGmsAvailable();

    @NotNull
    Result<Boolean> isMicrophonePresent();

    @NotNull
    Result<Boolean> isProxy();

    @NotNull
    Result<Boolean> isWifiSecured();

    @NotNull
    Result<String> languageCode();

    @NotNull
    Result<String> languageName();

    @NotNull
    Result<String> manufacturer();

    @NotNull
    Result<String> model();

    @NotNull
    Result<String> networkIpAddressVersion4();

    @NotNull
    Result<String> networkIpAddressVersion6();

    @NotNull
    Result<Integer> networkSignalStrength();

    @NotNull
    Result<NfcState> nfcStatus();

    @NotNull
    Result<Long> ramAvailable();

    @NotNull
    Result<Long> ramTotal();

    @NotNull
    Result<Long> ramUsed();

    @NotNull
    Result<Integer> ramUsedPercent();

    @NotNull
    Result<Integer> screenBrightnessLevel();

    @NotNull
    Result<String> screenHeight();

    @NotNull
    Result<Boolean> screenIsLocked();

    @NotNull
    Result<String> screenWidth();

    @NotNull
    Result<String> storageTotal();

    @NotNull
    Result<String> storageTotalUnit();

    @NotNull
    Result<SystemThemeStateResponse> systemCurrentTheme();

    @NotNull
    Result<String> systemPlatformName();

    @NotNull
    Result<String> systemPlatformVersionCode();

    @NotNull
    Result<String> systemPlatformVersionName();

    @NotNull
    Result<String> systemPropertiesJavaVmName();

    @NotNull
    Result<String> systemPropertiesJavaVmVersion();

    @NotNull
    Result<String> systemPropertiesOsVersion();

    @NotNull
    Result<String> systemPropertiesRuntimeName();

    @NotNull
    Result<String> systemPropertiesRuntimeVersion();
}
