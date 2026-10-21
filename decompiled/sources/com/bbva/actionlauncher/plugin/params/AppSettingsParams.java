package com.bbva.actionlauncher.plugin.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/actionlauncher/plugin/params/AppSettingsParams;", "", "packageId", "", "(Ljava/lang/String;)V", "getPackageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppSettingsParams {

    @SerializedName("value")
    @Nullable
    private final String packageId;

    public AppSettingsParams(@Nullable String str) {
        this.packageId = str;
    }

    public static /* synthetic */ AppSettingsParams copy$default(AppSettingsParams appSettingsParams, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appSettingsParams.packageId;
        }
        return appSettingsParams.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    @NotNull
    public final AppSettingsParams copy(@Nullable String packageId) {
        return new AppSettingsParams(packageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppSettingsParams) && Intrinsics.areEqual(this.packageId, ((AppSettingsParams) other).packageId);
    }

    @Nullable
    public final String getPackageId() {
        return this.packageId;
    }

    public int hashCode() {
        String str = this.packageId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("AppSettingsParams(packageId=", this.packageId, ")");
    }
}
