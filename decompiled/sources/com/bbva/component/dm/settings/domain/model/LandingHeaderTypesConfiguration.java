package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.ApplicationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/LandingHeaderTypesConfiguration;", "", "Lcom/bbva/component/dm/settings/domain/model/LandingHeaderConfiguration;", "component1", "component2", "component3", "default", ApplicationStatus.STATUS_BLOCKED, "forceUpdate", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/dm/settings/domain/model/LandingHeaderConfiguration;", "getDefault", "()Lcom/bbva/component/dm/settings/domain/model/LandingHeaderConfiguration;", "b", "getBlocked", "c", "getForceUpdate", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/LandingHeaderConfiguration;Lcom/bbva/component/dm/settings/domain/model/LandingHeaderConfiguration;Lcom/bbva/component/dm/settings/domain/model/LandingHeaderConfiguration;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingHeaderTypesConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingHeaderConfiguration default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingHeaderConfiguration blocked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingHeaderConfiguration forceUpdate;

    public LandingHeaderTypesConfiguration() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LandingHeaderTypesConfiguration copy$default(LandingHeaderTypesConfiguration landingHeaderTypesConfiguration, LandingHeaderConfiguration landingHeaderConfiguration, LandingHeaderConfiguration landingHeaderConfiguration2, LandingHeaderConfiguration landingHeaderConfiguration3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            landingHeaderConfiguration = landingHeaderTypesConfiguration.default;
        }
        if ((i10 & 2) != 0) {
            landingHeaderConfiguration2 = landingHeaderTypesConfiguration.blocked;
        }
        if ((i10 & 4) != 0) {
            landingHeaderConfiguration3 = landingHeaderTypesConfiguration.forceUpdate;
        }
        return landingHeaderTypesConfiguration.copy(landingHeaderConfiguration, landingHeaderConfiguration2, landingHeaderConfiguration3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LandingHeaderConfiguration getDefault() {
        return this.default;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LandingHeaderConfiguration getBlocked() {
        return this.blocked;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LandingHeaderConfiguration getForceUpdate() {
        return this.forceUpdate;
    }

    @NotNull
    public final LandingHeaderTypesConfiguration copy(@Nullable LandingHeaderConfiguration landingHeaderConfiguration, @Nullable LandingHeaderConfiguration blocked, @Nullable LandingHeaderConfiguration forceUpdate) {
        return new LandingHeaderTypesConfiguration(landingHeaderConfiguration, blocked, forceUpdate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingHeaderTypesConfiguration)) {
            return false;
        }
        LandingHeaderTypesConfiguration landingHeaderTypesConfiguration = (LandingHeaderTypesConfiguration) other;
        return Intrinsics.areEqual(this.default, landingHeaderTypesConfiguration.default) && Intrinsics.areEqual(this.blocked, landingHeaderTypesConfiguration.blocked) && Intrinsics.areEqual(this.forceUpdate, landingHeaderTypesConfiguration.forceUpdate);
    }

    @Nullable
    public final LandingHeaderConfiguration getBlocked() {
        return this.blocked;
    }

    @Nullable
    public final LandingHeaderConfiguration getDefault() {
        return this.default;
    }

    @Nullable
    public final LandingHeaderConfiguration getForceUpdate() {
        return this.forceUpdate;
    }

    public int hashCode() {
        LandingHeaderConfiguration landingHeaderConfiguration = this.default;
        int iHashCode = (landingHeaderConfiguration == null ? 0 : landingHeaderConfiguration.hashCode()) * 31;
        LandingHeaderConfiguration landingHeaderConfiguration2 = this.blocked;
        int iHashCode2 = (iHashCode + (landingHeaderConfiguration2 == null ? 0 : landingHeaderConfiguration2.hashCode())) * 31;
        LandingHeaderConfiguration landingHeaderConfiguration3 = this.forceUpdate;
        return iHashCode2 + (landingHeaderConfiguration3 != null ? landingHeaderConfiguration3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LandingHeaderTypesConfiguration(default=" + this.default + ", blocked=" + this.blocked + ", forceUpdate=" + this.forceUpdate + ")";
    }

    public LandingHeaderTypesConfiguration(@Nullable LandingHeaderConfiguration landingHeaderConfiguration, @Nullable LandingHeaderConfiguration landingHeaderConfiguration2, @Nullable LandingHeaderConfiguration landingHeaderConfiguration3) {
        this.default = landingHeaderConfiguration;
        this.blocked = landingHeaderConfiguration2;
        this.forceUpdate = landingHeaderConfiguration3;
    }

    public /* synthetic */ LandingHeaderTypesConfiguration(LandingHeaderConfiguration landingHeaderConfiguration, LandingHeaderConfiguration landingHeaderConfiguration2, LandingHeaderConfiguration landingHeaderConfiguration3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : landingHeaderConfiguration, (i10 & 2) != 0 ? null : landingHeaderConfiguration2, (i10 & 4) != 0 ? null : landingHeaderConfiguration3);
    }
}
