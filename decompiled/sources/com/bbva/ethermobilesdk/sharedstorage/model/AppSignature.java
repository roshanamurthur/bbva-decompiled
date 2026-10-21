package com.bbva.ethermobilesdk.sharedstorage.model;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignature;", "", "", "component1", "component2", "applicationId", "sha256", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "b", "getSha256", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AppSignature {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationId")
    @NotNull
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sha256")
    @NotNull
    private final String sha256;

    public AppSignature(@NotNull String applicationId, @NotNull String sha256) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(sha256, "sha256");
        this.applicationId = applicationId;
        this.sha256 = sha256;
    }

    public static /* synthetic */ AppSignature copy$default(AppSignature appSignature, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appSignature.applicationId;
        }
        if ((i10 & 2) != 0) {
            str2 = appSignature.sha256;
        }
        return appSignature.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSha256() {
        return this.sha256;
    }

    @NotNull
    public final AppSignature copy(@NotNull String applicationId, @NotNull String sha256) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(sha256, "sha256");
        return new AppSignature(applicationId, sha256);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSignature)) {
            return false;
        }
        AppSignature appSignature = (AppSignature) other;
        return Intrinsics.areEqual(this.applicationId, appSignature.applicationId) && Intrinsics.areEqual(this.sha256, appSignature.sha256);
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        return this.sha256.hashCode() + (this.applicationId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("AppSignature(applicationId=", this.applicationId, ", sha256=", this.sha256, ")");
    }
}
