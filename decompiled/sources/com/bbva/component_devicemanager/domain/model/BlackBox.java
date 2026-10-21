package com.bbva.component_devicemanager.domain.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\bD\b\u0086\b\u0018\u00002\u00020\u0001BÄ\u0001\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010'\u001a\u00020\f\u0012\u0006\u0010(\u001a\u00020\u000e\u0012\u0006\u0010)\u001a\u00020\u0010\u0012\u0006\u0010*\u001a\u00020\u0010\u0012\u0006\u0010+\u001a\u00020\u0010\u0012\u0006\u0010,\u001a\u00020\u0010\u0012\u0006\u0010-\u001a\u00020\u0010\u0012\u0006\u0010.\u001a\u00020\u0010\u0012\u0006\u0010/\u001a\u00020\u0010\u0012\u0006\u00100\u001a\u00020\u0010\u0012\u0006\u00101\u001a\u00020\u0019\u0012\u0006\u00102\u001a\u00020\u0019\u0012\u0006\u00103\u001a\u00020\u0019\u0012\u0006\u00104\u001a\u00020\u0010\u0012\u0006\u00105\u001a\u00020\u0010\u0012\u0006\u00106\u001a\u00020\u0010\u0012\u0006\u00107\u001a\u00020\u0010\u0012\u0006\u00108\u001a\u00020\u0010¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0010HÆ\u0003J\t\u0010 \u001a\u00020\u0010HÆ\u0003J\t\u0010!\u001a\u00020\u0010HÆ\u0003Jó\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u00102\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00102\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010/\u001a\u00020\u00102\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u00020\u00192\b\b\u0002\u00102\u001a\u00020\u00192\b\b\u0002\u00103\u001a\u00020\u00192\b\b\u0002\u00104\u001a\u00020\u00102\b\b\u0002\u00105\u001a\u00020\u00102\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u00020\u0010HÆ\u0001J\t\u0010:\u001a\u00020\u0010HÖ\u0001J\t\u0010;\u001a\u00020\u0019HÖ\u0001J\u0013\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010$\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010%\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010&\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010(\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010)\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010*\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^R\u0017\u0010+\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^R\u0017\u0010,\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bc\u0010\\\u001a\u0004\bd\u0010^R\u0017\u0010-\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\be\u0010\\\u001a\u0004\bf\u0010^R\u0017\u0010.\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bg\u0010\\\u001a\u0004\bh\u0010^R\u0017\u0010/\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bi\u0010\\\u001a\u0004\bj\u0010^R\u0017\u00100\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bk\u0010\\\u001a\u0004\bl\u0010^R\u0017\u00101\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u00102\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bq\u0010n\u001a\u0004\br\u0010pR\u0017\u00103\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bs\u0010n\u001a\u0004\bt\u0010pR\u0017\u00104\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bu\u0010\\\u001a\u0004\bv\u0010^R\u0017\u00105\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bw\u0010\\\u001a\u0004\bx\u0010^R\u0017\u00106\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\by\u0010\\\u001a\u0004\bz\u0010^R\u0017\u00107\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b{\u0010\\\u001a\u0004\b|\u0010^R\u0017\u00108\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b}\u0010\\\u001a\u0004\b~\u0010^¨\u0006\u0081\u0001"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/BlackBox;", "", "Lcom/bbva/component_devicemanager/domain/model/Browser;", "component1", "Lcom/bbva/component_devicemanager/domain/model/Storage;", "component2", "Lcom/bbva/component_devicemanager/domain/model/NfcStatusType;", "component3", "Lcom/bbva/component_devicemanager/domain/model/GeolocationInfo;", "component4", "Lcom/bbva/component_devicemanager/domain/model/ScreenInfo;", "component5", "Lcom/bbva/component_devicemanager/domain/model/AlertsInfo;", "component6", "Lcom/bbva/component_devicemanager/domain/model/PhoneInfo;", "component7", "", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "browser", "storage", "nfcStatusType", "geolocation", "screen", "alerts", "phoneParameters", "mobileManufacturer", "mobileModel", "deviceConnectionDate", "ipAddress", "operativeSystem", "platformApplication", "appVersionNumber", "dalvikProperties", "currentBatteryLevelPercentage", "currentRamUsageLevelPercentage", "currentSignalStrengthPercentage", "defaultLanguage", "currentThemeType", "timeZone", "currentTime", "currentDate", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component_devicemanager/domain/model/Browser;", "getBrowser", "()Lcom/bbva/component_devicemanager/domain/model/Browser;", "b", "Lcom/bbva/component_devicemanager/domain/model/Storage;", "getStorage", "()Lcom/bbva/component_devicemanager/domain/model/Storage;", "c", "Lcom/bbva/component_devicemanager/domain/model/NfcStatusType;", "getNfcStatusType", "()Lcom/bbva/component_devicemanager/domain/model/NfcStatusType;", "d", "Lcom/bbva/component_devicemanager/domain/model/GeolocationInfo;", "getGeolocation", "()Lcom/bbva/component_devicemanager/domain/model/GeolocationInfo;", "e", "Lcom/bbva/component_devicemanager/domain/model/ScreenInfo;", "getScreen", "()Lcom/bbva/component_devicemanager/domain/model/ScreenInfo;", "f", "Lcom/bbva/component_devicemanager/domain/model/AlertsInfo;", "getAlerts", "()Lcom/bbva/component_devicemanager/domain/model/AlertsInfo;", "g", "Lcom/bbva/component_devicemanager/domain/model/PhoneInfo;", "getPhoneParameters", "()Lcom/bbva/component_devicemanager/domain/model/PhoneInfo;", "h", "Ljava/lang/String;", "getMobileManufacturer", "()Ljava/lang/String;", "i", "getMobileModel", "j", "getDeviceConnectionDate", "k", "getIpAddress", "l", "getOperativeSystem", "m", "getPlatformApplication", "n", "getAppVersionNumber", "o", "getDalvikProperties", "p", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCurrentBatteryLevelPercentage", "()I", "q", "getCurrentRamUsageLevelPercentage", "r", "getCurrentSignalStrengthPercentage", "s", "getDefaultLanguage", "t", "getCurrentThemeType", "u", "getTimeZone", SharedPrefsStorage.VERSION_KEY, "getCurrentTime", "w", "getCurrentDate", "<init>", "(Lcom/bbva/component_devicemanager/domain/model/Browser;Lcom/bbva/component_devicemanager/domain/model/Storage;Lcom/bbva/component_devicemanager/domain/model/NfcStatusType;Lcom/bbva/component_devicemanager/domain/model/GeolocationInfo;Lcom/bbva/component_devicemanager/domain/model/ScreenInfo;Lcom/bbva/component_devicemanager/domain/model/AlertsInfo;Lcom/bbva/component_devicemanager/domain/model/PhoneInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BlackBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Browser browser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Storage storage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NfcStatusType nfcStatusType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final GeolocationInfo geolocation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ScreenInfo screen;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AlertsInfo alerts;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PhoneInfo phoneParameters;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mobileManufacturer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mobileModel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceConnectionDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String ipAddress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operativeSystem;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String platformApplication;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String appVersionNumber;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String dalvikProperties;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final int currentBatteryLevelPercentage;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final int currentRamUsageLevelPercentage;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int currentSignalStrengthPercentage;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String defaultLanguage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currentThemeType;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String timeZone;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currentTime;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currentDate;

    public BlackBox(@Nullable Browser browser, @NotNull Storage storage, @NotNull NfcStatusType nfcStatusType, @Nullable GeolocationInfo geolocationInfo, @NotNull ScreenInfo screen, @NotNull AlertsInfo alerts, @NotNull PhoneInfo phoneParameters, @NotNull String mobileManufacturer, @NotNull String mobileModel, @NotNull String deviceConnectionDate, @NotNull String ipAddress, @NotNull String operativeSystem, @NotNull String platformApplication, @NotNull String appVersionNumber, @NotNull String dalvikProperties, int i10, int i11, int i12, @NotNull String defaultLanguage, @NotNull String currentThemeType, @NotNull String timeZone, @NotNull String currentTime, @NotNull String currentDate) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(nfcStatusType, "nfcStatusType");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(phoneParameters, "phoneParameters");
        Intrinsics.checkNotNullParameter(mobileManufacturer, "mobileManufacturer");
        Intrinsics.checkNotNullParameter(mobileModel, "mobileModel");
        Intrinsics.checkNotNullParameter(deviceConnectionDate, "deviceConnectionDate");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(operativeSystem, "operativeSystem");
        Intrinsics.checkNotNullParameter(platformApplication, "platformApplication");
        Intrinsics.checkNotNullParameter(appVersionNumber, "appVersionNumber");
        Intrinsics.checkNotNullParameter(dalvikProperties, "dalvikProperties");
        Intrinsics.checkNotNullParameter(defaultLanguage, "defaultLanguage");
        Intrinsics.checkNotNullParameter(currentThemeType, "currentThemeType");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.browser = browser;
        this.storage = storage;
        this.nfcStatusType = nfcStatusType;
        this.geolocation = geolocationInfo;
        this.screen = screen;
        this.alerts = alerts;
        this.phoneParameters = phoneParameters;
        this.mobileManufacturer = mobileManufacturer;
        this.mobileModel = mobileModel;
        this.deviceConnectionDate = deviceConnectionDate;
        this.ipAddress = ipAddress;
        this.operativeSystem = operativeSystem;
        this.platformApplication = platformApplication;
        this.appVersionNumber = appVersionNumber;
        this.dalvikProperties = dalvikProperties;
        this.currentBatteryLevelPercentage = i10;
        this.currentRamUsageLevelPercentage = i11;
        this.currentSignalStrengthPercentage = i12;
        this.defaultLanguage = defaultLanguage;
        this.currentThemeType = currentThemeType;
        this.timeZone = timeZone;
        this.currentTime = currentTime;
        this.currentDate = currentDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Browser getBrowser() {
        return this.browser;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeviceConnectionDate() {
        return this.deviceConnectionDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOperativeSystem() {
        return this.operativeSystem;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPlatformApplication() {
        return this.platformApplication;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAppVersionNumber() {
        return this.appVersionNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDalvikProperties() {
        return this.dalvikProperties;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getCurrentBatteryLevelPercentage() {
        return this.currentBatteryLevelPercentage;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getCurrentRamUsageLevelPercentage() {
        return this.currentRamUsageLevelPercentage;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getCurrentSignalStrengthPercentage() {
        return this.currentSignalStrengthPercentage;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Storage getStorage() {
        return this.storage;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCurrentThemeType() {
        return this.currentThemeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getCurrentDate() {
        return this.currentDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NfcStatusType getNfcStatusType() {
        return this.nfcStatusType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GeolocationInfo getGeolocation() {
        return this.geolocation;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ScreenInfo getScreen() {
        return this.screen;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AlertsInfo getAlerts() {
        return this.alerts;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PhoneInfo getPhoneParameters() {
        return this.phoneParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMobileManufacturer() {
        return this.mobileManufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMobileModel() {
        return this.mobileModel;
    }

    @NotNull
    public final BlackBox copy(@Nullable Browser browser, @NotNull Storage storage, @NotNull NfcStatusType nfcStatusType, @Nullable GeolocationInfo geolocation, @NotNull ScreenInfo screen, @NotNull AlertsInfo alerts, @NotNull PhoneInfo phoneParameters, @NotNull String mobileManufacturer, @NotNull String mobileModel, @NotNull String deviceConnectionDate, @NotNull String ipAddress, @NotNull String operativeSystem, @NotNull String platformApplication, @NotNull String appVersionNumber, @NotNull String dalvikProperties, int currentBatteryLevelPercentage, int currentRamUsageLevelPercentage, int currentSignalStrengthPercentage, @NotNull String defaultLanguage, @NotNull String currentThemeType, @NotNull String timeZone, @NotNull String currentTime, @NotNull String currentDate) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(nfcStatusType, "nfcStatusType");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(phoneParameters, "phoneParameters");
        Intrinsics.checkNotNullParameter(mobileManufacturer, "mobileManufacturer");
        Intrinsics.checkNotNullParameter(mobileModel, "mobileModel");
        Intrinsics.checkNotNullParameter(deviceConnectionDate, "deviceConnectionDate");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(operativeSystem, "operativeSystem");
        Intrinsics.checkNotNullParameter(platformApplication, "platformApplication");
        Intrinsics.checkNotNullParameter(appVersionNumber, "appVersionNumber");
        Intrinsics.checkNotNullParameter(dalvikProperties, "dalvikProperties");
        Intrinsics.checkNotNullParameter(defaultLanguage, "defaultLanguage");
        Intrinsics.checkNotNullParameter(currentThemeType, "currentThemeType");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        return new BlackBox(browser, storage, nfcStatusType, geolocation, screen, alerts, phoneParameters, mobileManufacturer, mobileModel, deviceConnectionDate, ipAddress, operativeSystem, platformApplication, appVersionNumber, dalvikProperties, currentBatteryLevelPercentage, currentRamUsageLevelPercentage, currentSignalStrengthPercentage, defaultLanguage, currentThemeType, timeZone, currentTime, currentDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackBox)) {
            return false;
        }
        BlackBox blackBox = (BlackBox) other;
        return Intrinsics.areEqual(this.browser, blackBox.browser) && Intrinsics.areEqual(this.storage, blackBox.storage) && Intrinsics.areEqual(this.nfcStatusType, blackBox.nfcStatusType) && Intrinsics.areEqual(this.geolocation, blackBox.geolocation) && Intrinsics.areEqual(this.screen, blackBox.screen) && Intrinsics.areEqual(this.alerts, blackBox.alerts) && Intrinsics.areEqual(this.phoneParameters, blackBox.phoneParameters) && Intrinsics.areEqual(this.mobileManufacturer, blackBox.mobileManufacturer) && Intrinsics.areEqual(this.mobileModel, blackBox.mobileModel) && Intrinsics.areEqual(this.deviceConnectionDate, blackBox.deviceConnectionDate) && Intrinsics.areEqual(this.ipAddress, blackBox.ipAddress) && Intrinsics.areEqual(this.operativeSystem, blackBox.operativeSystem) && Intrinsics.areEqual(this.platformApplication, blackBox.platformApplication) && Intrinsics.areEqual(this.appVersionNumber, blackBox.appVersionNumber) && Intrinsics.areEqual(this.dalvikProperties, blackBox.dalvikProperties) && this.currentBatteryLevelPercentage == blackBox.currentBatteryLevelPercentage && this.currentRamUsageLevelPercentage == blackBox.currentRamUsageLevelPercentage && this.currentSignalStrengthPercentage == blackBox.currentSignalStrengthPercentage && Intrinsics.areEqual(this.defaultLanguage, blackBox.defaultLanguage) && Intrinsics.areEqual(this.currentThemeType, blackBox.currentThemeType) && Intrinsics.areEqual(this.timeZone, blackBox.timeZone) && Intrinsics.areEqual(this.currentTime, blackBox.currentTime) && Intrinsics.areEqual(this.currentDate, blackBox.currentDate);
    }

    @NotNull
    public final AlertsInfo getAlerts() {
        return this.alerts;
    }

    @NotNull
    public final String getAppVersionNumber() {
        return this.appVersionNumber;
    }

    @Nullable
    public final Browser getBrowser() {
        return this.browser;
    }

    public final int getCurrentBatteryLevelPercentage() {
        return this.currentBatteryLevelPercentage;
    }

    @NotNull
    public final String getCurrentDate() {
        return this.currentDate;
    }

    public final int getCurrentRamUsageLevelPercentage() {
        return this.currentRamUsageLevelPercentage;
    }

    public final int getCurrentSignalStrengthPercentage() {
        return this.currentSignalStrengthPercentage;
    }

    @NotNull
    public final String getCurrentThemeType() {
        return this.currentThemeType;
    }

    @NotNull
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    public final String getDalvikProperties() {
        return this.dalvikProperties;
    }

    @NotNull
    public final String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    @NotNull
    public final String getDeviceConnectionDate() {
        return this.deviceConnectionDate;
    }

    @Nullable
    public final GeolocationInfo getGeolocation() {
        return this.geolocation;
    }

    @NotNull
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @NotNull
    public final String getMobileManufacturer() {
        return this.mobileManufacturer;
    }

    @NotNull
    public final String getMobileModel() {
        return this.mobileModel;
    }

    @NotNull
    public final NfcStatusType getNfcStatusType() {
        return this.nfcStatusType;
    }

    @NotNull
    public final String getOperativeSystem() {
        return this.operativeSystem;
    }

    @NotNull
    public final PhoneInfo getPhoneParameters() {
        return this.phoneParameters;
    }

    @NotNull
    public final String getPlatformApplication() {
        return this.platformApplication;
    }

    @NotNull
    public final ScreenInfo getScreen() {
        return this.screen;
    }

    @NotNull
    public final Storage getStorage() {
        return this.storage;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        Browser browser = this.browser;
        int iHashCode = (this.nfcStatusType.hashCode() + ((this.storage.hashCode() + ((browser == null ? 0 : browser.hashCode()) * 31)) * 31)) * 31;
        GeolocationInfo geolocationInfo = this.geolocation;
        return this.currentDate.hashCode() + n1.c(this.currentTime, n1.c(this.timeZone, n1.c(this.currentThemeType, n1.c(this.defaultLanguage, (((((n1.c(this.dalvikProperties, n1.c(this.appVersionNumber, n1.c(this.platformApplication, n1.c(this.operativeSystem, n1.c(this.ipAddress, n1.c(this.deviceConnectionDate, n1.c(this.mobileModel, n1.c(this.mobileManufacturer, (this.phoneParameters.hashCode() + ((this.alerts.hashCode() + ((this.screen.hashCode() + ((iHashCode + (geolocationInfo != null ? geolocationInfo.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31) + this.currentBatteryLevelPercentage) * 31) + this.currentRamUsageLevelPercentage) * 31) + this.currentSignalStrengthPercentage) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BlackBox(browser=");
        sb2.append(this.browser);
        sb2.append(", storage=");
        sb2.append(this.storage);
        sb2.append(", nfcStatusType=");
        sb2.append(this.nfcStatusType);
        sb2.append(", geolocation=");
        sb2.append(this.geolocation);
        sb2.append(", screen=");
        sb2.append(this.screen);
        sb2.append(", alerts=");
        sb2.append(this.alerts);
        sb2.append(", phoneParameters=");
        sb2.append(this.phoneParameters);
        sb2.append(", mobileManufacturer=");
        sb2.append(this.mobileManufacturer);
        sb2.append(", mobileModel=");
        sb2.append(this.mobileModel);
        sb2.append(", deviceConnectionDate=");
        sb2.append(this.deviceConnectionDate);
        sb2.append(", ipAddress=");
        sb2.append(this.ipAddress);
        sb2.append(", operativeSystem=");
        sb2.append(this.operativeSystem);
        sb2.append(", platformApplication=");
        sb2.append(this.platformApplication);
        sb2.append(", appVersionNumber=");
        sb2.append(this.appVersionNumber);
        sb2.append(", dalvikProperties=");
        sb2.append(this.dalvikProperties);
        sb2.append(", currentBatteryLevelPercentage=");
        sb2.append(this.currentBatteryLevelPercentage);
        sb2.append(", currentRamUsageLevelPercentage=");
        sb2.append(this.currentRamUsageLevelPercentage);
        sb2.append(", currentSignalStrengthPercentage=");
        sb2.append(this.currentSignalStrengthPercentage);
        sb2.append(", defaultLanguage=");
        sb2.append(this.defaultLanguage);
        sb2.append(", currentThemeType=");
        sb2.append(this.currentThemeType);
        sb2.append(", timeZone=");
        sb2.append(this.timeZone);
        sb2.append(", currentTime=");
        sb2.append(this.currentTime);
        sb2.append(", currentDate=");
        return d.f(sb2, this.currentDate, ")");
    }
}
