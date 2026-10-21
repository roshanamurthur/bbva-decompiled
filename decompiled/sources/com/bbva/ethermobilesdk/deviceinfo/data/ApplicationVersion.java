package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/ApplicationVersion;", "", "versionName", "", "versionCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getVersionCode", "()Ljava/lang/String;", "getVersionName", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ApplicationVersion {

    @NotNull
    private final String versionCode;

    @NotNull
    private final String versionName;

    public ApplicationVersion(@NotNull String versionName, @NotNull String versionCode) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        this.versionName = versionName;
        this.versionCode = versionCode;
    }

    public static /* synthetic */ ApplicationVersion copy$default(ApplicationVersion applicationVersion, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applicationVersion.versionName;
        }
        if ((i10 & 2) != 0) {
            str2 = applicationVersion.versionCode;
        }
        return applicationVersion.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final ApplicationVersion copy(@NotNull String versionName, @NotNull String versionCode) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        return new ApplicationVersion(versionName, versionCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationVersion)) {
            return false;
        }
        ApplicationVersion applicationVersion = (ApplicationVersion) other;
        return Intrinsics.areEqual(this.versionName, applicationVersion.versionName) && Intrinsics.areEqual(this.versionCode, applicationVersion.versionCode);
    }

    @NotNull
    public final String getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.versionCode.hashCode() + (this.versionName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("ApplicationVersion(versionName=", this.versionName, ", versionCode=", this.versionCode, ")");
    }
}
