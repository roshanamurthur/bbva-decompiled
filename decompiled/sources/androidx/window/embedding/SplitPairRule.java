package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplitPairRule.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Landroidx/window/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/SplitPairFilter;", "filter", "plus$window_release", "(Landroidx/window/embedding/SplitPairFilter;)Landroidx/window/embedding/SplitPairRule;", "plus", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "e", "Z", "getFinishPrimaryWithSecondary", "()Z", "finishPrimaryWithSecondary", "f", "getFinishSecondaryWithPrimary", "finishSecondaryWithPrimary", "g", "getClearTop", "clearTop", "", "h", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDir", "<init>", "(Ljava/util/Set;ZZZIIFI)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SplitPairRule extends SplitRule {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean finishPrimaryWithSecondary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean finishSecondaryWithPrimary;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean clearTop;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<SplitPairFilter> filters;

    public /* synthetic */ SplitPairRule(Set set, boolean z10, boolean z11, boolean z12, int i10, int i11, float f6, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? 0 : i10, (i13 & 32) == 0 ? i11 : 0, (i13 & 64) != 0 ? 0.5f : f6, (i13 & 128) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitPairRule) || !super.equals(other)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) other;
        return Intrinsics.areEqual(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    @NotNull
    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return ((((((this.filters.hashCode() + (super.hashCode() * 31)) * 31) + (this.finishPrimaryWithSecondary ? 1231 : 1237)) * 31) + (this.finishSecondaryWithPrimary ? 1231 : 1237)) * 31) + (this.clearTop ? 1231 : 1237);
    }

    @NotNull
    public final SplitPairRule plus$window_release(@NotNull SplitPairFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPairRule(CollectionsKt___CollectionsKt.toSet(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(@NotNull Set<SplitPairFilter> filters, boolean z10, boolean z11, boolean z12, int i10, int i11, float f6, int i12) {
        super(i10, i11, f6, i12);
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.finishPrimaryWithSecondary = z10;
        this.finishSecondaryWithPrimary = z11;
        this.clearTop = z12;
        this.filters = CollectionsKt___CollectionsKt.toSet(filters);
    }
}
