package m0;

import androidx.compose.runtime.SnapshotMutationPolicy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotMutationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u implements SnapshotMutationPolicy<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f83324a = new u();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean equivalent(@Nullable Object obj, @Nullable Object obj2) {
        return false;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return h0.a(this, obj, obj2, obj3);
    }

    @NotNull
    public final String toString() {
        return "NeverEqualPolicy";
    }
}
