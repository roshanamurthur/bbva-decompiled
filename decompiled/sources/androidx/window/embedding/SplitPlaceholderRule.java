package androidx.window.embedding;

import android.content.Intent;
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

/* JADX INFO: compiled from: SplitPlaceholderRule.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/ActivityFilter;", "filter", "plus$window_release", "(Landroidx/window/embedding/ActivityFilter;)Landroidx/window/embedding/SplitPlaceholderRule;", "plus", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroid/content/Intent;", "e", "Landroid/content/Intent;", "getPlaceholderIntent", "()Landroid/content/Intent;", "placeholderIntent", "", "f", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", "<init>", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SplitPlaceholderRule extends SplitRule {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Intent placeholderIntent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<ActivityFilter> filters;

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i10, int i11, float f6, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, intent, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0.5f : f6, (i13 & 32) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitPlaceholderRule) || !super.equals(other) || !super.equals(other)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) other;
        return Intrinsics.areEqual(this.filters, splitPlaceholderRule.filters) && Intrinsics.areEqual(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    @NotNull
    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return this.placeholderIntent.hashCode() + ((this.filters.hashCode() + (super.hashCode() * 31)) * 31);
    }

    @NotNull
    public final SplitPlaceholderRule plus$window_release(@NotNull ActivityFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPlaceholderRule(CollectionsKt___CollectionsKt.toSet(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(@NotNull Set<ActivityFilter> filters, @NotNull Intent placeholderIntent, int i10, int i11, float f6, int i12) {
        super(i10, i11, f6, i12);
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        this.filters = CollectionsKt___CollectionsKt.toSet(filters);
    }
}
