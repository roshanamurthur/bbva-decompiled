package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/HeartCampaign;", "", "", "component1", "()Ljava/lang/Long;", LogKeysKt.END_DATE, "copy", "(Ljava/lang/Long;)Lcom/bbva/component/dm/settings/domain/model/HeartCampaign;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Long;", "getEndDate", "<init>", "(Ljava/lang/Long;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class HeartCampaign {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long endDate;

    public HeartCampaign(@Nullable Long l6) {
        this.endDate = l6;
    }

    public static /* synthetic */ HeartCampaign copy$default(HeartCampaign heartCampaign, Long l6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l6 = heartCampaign.endDate;
        }
        return heartCampaign.copy(l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final HeartCampaign copy(@Nullable Long endDate) {
        return new HeartCampaign(endDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HeartCampaign) && Intrinsics.areEqual(this.endDate, ((HeartCampaign) other).endDate);
    }

    @Nullable
    public final Long getEndDate() {
        return this.endDate;
    }

    public int hashCode() {
        Long l6 = this.endDate;
        if (l6 == null) {
            return 0;
        }
        return l6.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeartCampaign(endDate=" + this.endDate + ")";
    }
}
