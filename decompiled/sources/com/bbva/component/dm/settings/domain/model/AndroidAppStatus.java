package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppStatusConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AndroidAppStatus;", "", "", "component1", "", "Lcom/bbva/component/dm/settings/domain/model/SdkStatus;", "component2", "Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;", "component3", "available", "bySdk", "scheduledShutdown", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getAvailable", "()Z", "b", "Ljava/util/List;", "getBySdk", "()Ljava/util/List;", "c", "Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;", "getScheduledShutdown", "()Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;", "<init>", "(ZLjava/util/List;Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AndroidAppStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean available;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<SdkStatus> bySdk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ScheduledShutdown scheduledShutdown;

    public AndroidAppStatus(boolean z10, @Nullable List<SdkStatus> list, @Nullable ScheduledShutdown scheduledShutdown) {
        this.available = z10;
        this.bySdk = list;
        this.scheduledShutdown = scheduledShutdown;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidAppStatus copy$default(AndroidAppStatus androidAppStatus, boolean z10, List list, ScheduledShutdown scheduledShutdown, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = androidAppStatus.available;
        }
        if ((i10 & 2) != 0) {
            list = androidAppStatus.bySdk;
        }
        if ((i10 & 4) != 0) {
            scheduledShutdown = androidAppStatus.scheduledShutdown;
        }
        return androidAppStatus.copy(z10, list, scheduledShutdown);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    @Nullable
    public final List<SdkStatus> component2() {
        return this.bySdk;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ScheduledShutdown getScheduledShutdown() {
        return this.scheduledShutdown;
    }

    @NotNull
    public final AndroidAppStatus copy(boolean available, @Nullable List<SdkStatus> bySdk, @Nullable ScheduledShutdown scheduledShutdown) {
        return new AndroidAppStatus(available, bySdk, scheduledShutdown);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidAppStatus)) {
            return false;
        }
        AndroidAppStatus androidAppStatus = (AndroidAppStatus) other;
        return this.available == androidAppStatus.available && Intrinsics.areEqual(this.bySdk, androidAppStatus.bySdk) && Intrinsics.areEqual(this.scheduledShutdown, androidAppStatus.scheduledShutdown);
    }

    public final boolean getAvailable() {
        return this.available;
    }

    @Nullable
    public final List<SdkStatus> getBySdk() {
        return this.bySdk;
    }

    @Nullable
    public final ScheduledShutdown getScheduledShutdown() {
        return this.scheduledShutdown;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.available;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        List<SdkStatus> list = this.bySdk;
        int iHashCode = (i10 + (list == null ? 0 : list.hashCode())) * 31;
        ScheduledShutdown scheduledShutdown = this.scheduledShutdown;
        return iHashCode + (scheduledShutdown != null ? scheduledShutdown.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AndroidAppStatus(available=" + this.available + ", bySdk=" + this.bySdk + ", scheduledShutdown=" + this.scheduledShutdown + ")";
    }

    public /* synthetic */ AndroidAppStatus(boolean z10, List list, ScheduledShutdown scheduledShutdown, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, list, (i10 & 4) != 0 ? null : scheduledShutdown);
    }
}
