package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppVersionConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/InAppUpdates;", "", "Lcom/bbva/component/dm/settings/domain/model/InAppUpdateConfiguration;", "component1", "component2", "immediate", "flexible", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/dm/settings/domain/model/InAppUpdateConfiguration;", "getImmediate", "()Lcom/bbva/component/dm/settings/domain/model/InAppUpdateConfiguration;", "b", "getFlexible", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/InAppUpdateConfiguration;Lcom/bbva/component/dm/settings/domain/model/InAppUpdateConfiguration;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InAppUpdates {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InAppUpdateConfiguration immediate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InAppUpdateConfiguration flexible;

    public InAppUpdates(@Nullable InAppUpdateConfiguration inAppUpdateConfiguration, @Nullable InAppUpdateConfiguration inAppUpdateConfiguration2) {
        this.immediate = inAppUpdateConfiguration;
        this.flexible = inAppUpdateConfiguration2;
    }

    public static /* synthetic */ InAppUpdates copy$default(InAppUpdates inAppUpdates, InAppUpdateConfiguration inAppUpdateConfiguration, InAppUpdateConfiguration inAppUpdateConfiguration2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inAppUpdateConfiguration = inAppUpdates.immediate;
        }
        if ((i10 & 2) != 0) {
            inAppUpdateConfiguration2 = inAppUpdates.flexible;
        }
        return inAppUpdates.copy(inAppUpdateConfiguration, inAppUpdateConfiguration2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InAppUpdateConfiguration getImmediate() {
        return this.immediate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InAppUpdateConfiguration getFlexible() {
        return this.flexible;
    }

    @NotNull
    public final InAppUpdates copy(@Nullable InAppUpdateConfiguration immediate, @Nullable InAppUpdateConfiguration flexible) {
        return new InAppUpdates(immediate, flexible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppUpdates)) {
            return false;
        }
        InAppUpdates inAppUpdates = (InAppUpdates) other;
        return Intrinsics.areEqual(this.immediate, inAppUpdates.immediate) && Intrinsics.areEqual(this.flexible, inAppUpdates.flexible);
    }

    @Nullable
    public final InAppUpdateConfiguration getFlexible() {
        return this.flexible;
    }

    @Nullable
    public final InAppUpdateConfiguration getImmediate() {
        return this.immediate;
    }

    public int hashCode() {
        InAppUpdateConfiguration inAppUpdateConfiguration = this.immediate;
        int iHashCode = (inAppUpdateConfiguration == null ? 0 : inAppUpdateConfiguration.hashCode()) * 31;
        InAppUpdateConfiguration inAppUpdateConfiguration2 = this.flexible;
        return iHashCode + (inAppUpdateConfiguration2 != null ? inAppUpdateConfiguration2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InAppUpdates(immediate=" + this.immediate + ", flexible=" + this.flexible + ")";
    }
}
