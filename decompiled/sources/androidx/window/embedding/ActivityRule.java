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

/* JADX INFO: compiled from: ActivityRule.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/ActivityRule;", "Landroidx/window/embedding/EmbeddingRule;", "Landroidx/window/embedding/ActivityFilter;", "filter", "plus$window_release", "(Landroidx/window/embedding/ActivityFilter;)Landroidx/window/embedding/ActivityRule;", "plus", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "Z", "getAlwaysExpand", "()Z", "alwaysExpand", "", "b", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "filters", "<init>", "(Ljava/util/Set;Z)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class ActivityRule extends EmbeddingRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean alwaysExpand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<ActivityFilter> filters;

    public /* synthetic */ ActivityRule(Set set, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? false : z10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) other;
        return Intrinsics.areEqual(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + (this.alwaysExpand ? 1231 : 1237);
    }

    @NotNull
    public final ActivityRule plus$window_release(@NotNull ActivityFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new ActivityRule(CollectionsKt___CollectionsKt.toSet(linkedHashSet), this.alwaysExpand);
    }

    public ActivityRule(@NotNull Set<ActivityFilter> filters, boolean z10) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.alwaysExpand = z10;
        this.filters = CollectionsKt___CollectionsKt.toSet(filters);
    }
}
