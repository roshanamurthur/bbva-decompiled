package com.bbva.glomohybrid.landing.presentation.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingInAppUpdate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingInAppUpdate;", "", "", "component1", "Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;", "component2", "packageId", "info", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;", "getInfo", "()Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingInAppUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String packageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InAppUpdateInfo info;

    public LandingInAppUpdate(@NotNull String packageId, @Nullable InAppUpdateInfo inAppUpdateInfo) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.packageId = packageId;
        this.info = inAppUpdateInfo;
    }

    public static /* synthetic */ LandingInAppUpdate copy$default(LandingInAppUpdate landingInAppUpdate, String str, InAppUpdateInfo inAppUpdateInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingInAppUpdate.packageId;
        }
        if ((i10 & 2) != 0) {
            inAppUpdateInfo = landingInAppUpdate.info;
        }
        return landingInAppUpdate.copy(str, inAppUpdateInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InAppUpdateInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final LandingInAppUpdate copy(@NotNull String packageId, @Nullable InAppUpdateInfo info) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        return new LandingInAppUpdate(packageId, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingInAppUpdate)) {
            return false;
        }
        LandingInAppUpdate landingInAppUpdate = (LandingInAppUpdate) other;
        return Intrinsics.areEqual(this.packageId, landingInAppUpdate.packageId) && Intrinsics.areEqual(this.info, landingInAppUpdate.info);
    }

    @Nullable
    public final InAppUpdateInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final String getPackageId() {
        return this.packageId;
    }

    public int hashCode() {
        int iHashCode = this.packageId.hashCode() * 31;
        InAppUpdateInfo inAppUpdateInfo = this.info;
        return iHashCode + (inAppUpdateInfo == null ? 0 : inAppUpdateInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "LandingInAppUpdate(packageId=" + this.packageId + ", info=" + this.info + ")";
    }

    public /* synthetic */ LandingInAppUpdate(String str, InAppUpdateInfo inAppUpdateInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : inAppUpdateInfo);
    }
}
