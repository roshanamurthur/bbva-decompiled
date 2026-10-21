package com.google.firebase.sessions;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", "", "", "component1", "component2", "component3", "component4", "Lcom/google/firebase/sessions/LogEnvironment;", "component5", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "component6", "appId", ContextualDataConstants.CD_DEVICE_MODEL, "sessionSdkVersion", ContextualDataConstants.CD_OS_VERSION, "logEnvironment", "androidAppInfo", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "b", "getDeviceModel", "c", "getSessionSdkVersion", "d", "getOsVersion", "e", "Lcom/google/firebase/sessions/LogEnvironment;", "getLogEnvironment", "()Lcom/google/firebase/sessions/LogEnvironment;", "f", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "getAndroidAppInfo", "()Lcom/google/firebase/sessions/AndroidApplicationInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String appId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionSdkVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String osVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LogEnvironment logEnvironment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidApplicationInfo androidAppInfo;

    public ApplicationInfo(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.appId = appId;
        this.deviceModel = deviceModel;
        this.sessionSdkVersion = sessionSdkVersion;
        this.osVersion = osVersion;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidAppInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applicationInfo.appId;
        }
        if ((i10 & 2) != 0) {
            str2 = applicationInfo.deviceModel;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = applicationInfo.sessionSdkVersion;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = applicationInfo.osVersion;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            logEnvironment = applicationInfo.logEnvironment;
        }
        LogEnvironment logEnvironment2 = logEnvironment;
        if ((i10 & 32) != 0) {
            androidApplicationInfo = applicationInfo.androidAppInfo;
        }
        return applicationInfo.copy(str, str5, str6, str7, logEnvironment2, androidApplicationInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @NotNull
    public final ApplicationInfo copy(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new ApplicationInfo(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) other;
        return Intrinsics.areEqual(this.appId, applicationInfo.appId) && Intrinsics.areEqual(this.deviceModel, applicationInfo.deviceModel) && Intrinsics.areEqual(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && Intrinsics.areEqual(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && Intrinsics.areEqual(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    @NotNull
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public int hashCode() {
        return this.androidAppInfo.hashCode() + ((this.logEnvironment.hashCode() + n1.c(this.osVersion, n1.c(this.sessionSdkVersion, n1.c(this.deviceModel, this.appId.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.appId + ", deviceModel=" + this.deviceModel + ", sessionSdkVersion=" + this.sessionSdkVersion + ", osVersion=" + this.osVersion + ", logEnvironment=" + this.logEnvironment + ", androidAppInfo=" + this.androidAppInfo + RootService.CLOSE_BRACKET;
    }
}
