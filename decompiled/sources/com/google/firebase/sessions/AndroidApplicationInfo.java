package com.google.firebase.sessions;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003JK\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "", "component1", "component2", "component3", "component4", "Lcom/google/firebase/sessions/ProcessDetails;", "component5", "", "component6", "packageName", "versionName", "appBuildVersion", "deviceManufacturer", "currentProcessDetails", "appProcessDetails", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "getVersionName", "c", "getAppBuildVersion", "d", "getDeviceManufacturer", "e", "Lcom/google/firebase/sessions/ProcessDetails;", "getCurrentProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "f", "Ljava/util/List;", "getAppProcessDetails", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AndroidApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String versionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String appBuildVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceManufacturer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ProcessDetails currentProcessDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ProcessDetails> appProcessDetails;

    public AndroidApplicationInfo(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
        this.currentProcessDetails = currentProcessDetails;
        this.appProcessDetails = appProcessDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i10 & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        ProcessDetails processDetails2 = processDetails;
        if ((i10 & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        return androidApplicationInfo.copy(str, str5, str6, str7, processDetails2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) other;
        return Intrinsics.areEqual(this.packageName, androidApplicationInfo.packageName) && Intrinsics.areEqual(this.versionName, androidApplicationInfo.versionName) && Intrinsics.areEqual(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.areEqual(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && Intrinsics.areEqual(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && Intrinsics.areEqual(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.appProcessDetails.hashCode() + ((this.currentProcessDetails.hashCode() + n1.c(this.deviceManufacturer, n1.c(this.appBuildVersion, n1.c(this.versionName, this.packageName.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb2.append(this.packageName);
        sb2.append(", versionName=");
        sb2.append(this.versionName);
        sb2.append(", appBuildVersion=");
        sb2.append(this.appBuildVersion);
        sb2.append(", deviceManufacturer=");
        sb2.append(this.deviceManufacturer);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.currentProcessDetails);
        sb2.append(", appProcessDetails=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.c(sb2, this.appProcessDetails, RootService.CLOSE_BRACKET);
    }
}
