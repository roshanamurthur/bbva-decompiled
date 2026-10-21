package com.salesforce.marketingcloud.registration;

import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.semaas.model.Properties;
import com.mypinpad.tsdk.isolation.y2;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.storage.db.k;
import com.veridas.contextualdata.ContextualDataConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/salesforce/marketingcloud/registration/f;", "", "", "a", "b", "c", "deviceId", "appId", Properties.APP_VERSION, "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "d", "e", "g", k.a.m, "h", k.a.f65035b, "i", "platformVersion", "j", ContextualDataConstants.CD_SDK_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String appId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String appVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String hwid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String platform;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String platformVersion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String sdkVersion;

    public f(@NotNull String deviceId, @NotNull String appId, @NotNull String appVersion) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.deviceId = deviceId;
        this.appId = appId;
        this.appVersion = appVersion;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        this.hwid = str;
        this.platform = "Android";
        String str2 = Build.VERSION.RELEASE;
        this.platformVersion = str2 == null ? "Unknown Release" : str2;
        String sdkVersionName = MarketingCloudSdk.getSdkVersionName();
        Intrinsics.checkNotNullExpressionValue(sdkVersionName, "getSdkVersionName()");
        this.sdkVersion = sdkVersionName;
    }

    public static /* synthetic */ f a(f fVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fVar.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = fVar.appId;
        }
        if ((i10 & 4) != 0) {
            str3 = fVar.appVersion;
        }
        return fVar.a(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String d() {
        return this.appId;
    }

    @NotNull
    public final String e() {
        return this.appVersion;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return Intrinsics.areEqual(this.deviceId, fVar.deviceId) && Intrinsics.areEqual(this.appId, fVar.appId) && Intrinsics.areEqual(this.appVersion, fVar.appVersion);
    }

    @NotNull
    public final String f() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHwid() {
        return this.hwid;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return this.appVersion.hashCode() + n1.c(this.appId, this.deviceId.hashCode() * 31, 31);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RegistrationMeta(deviceId=");
        sb2.append(this.deviceId);
        sb2.append(", appId=");
        sb2.append(this.appId);
        sb2.append(", appVersion=");
        return y2.b(sb2, this.appVersion, RootService.CLOSE_BRACKET);
    }

    @NotNull
    public final f a(@NotNull String deviceId, @NotNull String appId, @NotNull String appVersion) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new f(deviceId, appId, appVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }
}
