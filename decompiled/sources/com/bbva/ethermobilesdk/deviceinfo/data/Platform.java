package com.bbva.ethermobilesdk.deviceinfo.data;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/Platform;", "", "platformName", "", "platformVersionName", "platformVersionCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatformName", "()Ljava/lang/String;", "getPlatformVersionCode", "getPlatformVersionName", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Platform {

    @NotNull
    private final String platformName;

    @SerializedName("versionCode")
    @NotNull
    private final String platformVersionCode;

    @SerializedName("versionName")
    @NotNull
    private final String platformVersionName;

    public Platform(@NotNull String platformName, @NotNull String platformVersionName, @NotNull String platformVersionCode) {
        Intrinsics.checkNotNullParameter(platformName, "platformName");
        Intrinsics.checkNotNullParameter(platformVersionName, "platformVersionName");
        Intrinsics.checkNotNullParameter(platformVersionCode, "platformVersionCode");
        this.platformName = platformName;
        this.platformVersionName = platformVersionName;
        this.platformVersionCode = platformVersionCode;
    }

    public static /* synthetic */ Platform copy$default(Platform platform, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = platform.platformName;
        }
        if ((i10 & 2) != 0) {
            str2 = platform.platformVersionName;
        }
        if ((i10 & 4) != 0) {
            str3 = platform.platformVersionCode;
        }
        return platform.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatformName() {
        return this.platformName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatformVersionName() {
        return this.platformVersionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatformVersionCode() {
        return this.platformVersionCode;
    }

    @NotNull
    public final Platform copy(@NotNull String platformName, @NotNull String platformVersionName, @NotNull String platformVersionCode) {
        Intrinsics.checkNotNullParameter(platformName, "platformName");
        Intrinsics.checkNotNullParameter(platformVersionName, "platformVersionName");
        Intrinsics.checkNotNullParameter(platformVersionCode, "platformVersionCode");
        return new Platform(platformName, platformVersionName, platformVersionCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Platform)) {
            return false;
        }
        Platform platform = (Platform) other;
        return Intrinsics.areEqual(this.platformName, platform.platformName) && Intrinsics.areEqual(this.platformVersionName, platform.platformVersionName) && Intrinsics.areEqual(this.platformVersionCode, platform.platformVersionCode);
    }

    @NotNull
    public final String getPlatformName() {
        return this.platformName;
    }

    @NotNull
    public final String getPlatformVersionCode() {
        return this.platformVersionCode;
    }

    @NotNull
    public final String getPlatformVersionName() {
        return this.platformVersionName;
    }

    public int hashCode() {
        return this.platformVersionCode.hashCode() + n1.c(this.platformVersionName, this.platformName.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.platformName;
        String str2 = this.platformVersionName;
        return d.f(a.c("Platform(platformName=", str, ", platformVersionName=", str2, ", platformVersionCode="), this.platformVersionCode, ")");
    }
}
