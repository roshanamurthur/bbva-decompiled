package com.bbva.component.dm.settings.domain.model;

import androidx.appcompat.widget.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppVersionConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/InAppUpdateConfiguration;", "", "", "component1", "", "component2", "component3", "available", TypedValues.CycleType.S_WAVE_PERIOD, "limit", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getAvailable", "()Z", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPeriod", "()I", "c", "getLimit", "<init>", "(ZII)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InAppUpdateConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean available;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int period;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int limit;

    public InAppUpdateConfiguration(boolean z10, int i10, int i11) {
        this.available = z10;
        this.period = i10;
        this.limit = i11;
    }

    public static /* synthetic */ InAppUpdateConfiguration copy$default(InAppUpdateConfiguration inAppUpdateConfiguration, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = inAppUpdateConfiguration.available;
        }
        if ((i12 & 2) != 0) {
            i10 = inAppUpdateConfiguration.period;
        }
        if ((i12 & 4) != 0) {
            i11 = inAppUpdateConfiguration.limit;
        }
        return inAppUpdateConfiguration.copy(z10, i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final InAppUpdateConfiguration copy(boolean available, int period, int limit) {
        return new InAppUpdateConfiguration(available, period, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppUpdateConfiguration)) {
            return false;
        }
        InAppUpdateConfiguration inAppUpdateConfiguration = (InAppUpdateConfiguration) other;
        return this.available == inAppUpdateConfiguration.available && this.period == inAppUpdateConfiguration.period && this.limit == inAppUpdateConfiguration.limit;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getPeriod() {
        return this.period;
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
        return (((r1 * 31) + this.period) * 31) + this.limit;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InAppUpdateConfiguration(available=");
        sb2.append(this.available);
        sb2.append(", period=");
        sb2.append(this.period);
        sb2.append(", limit=");
        return a.c(sb2, this.limit, ")");
    }

    public /* synthetic */ InAppUpdateConfiguration(boolean z10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? Integer.MAX_VALUE : i11);
    }
}
