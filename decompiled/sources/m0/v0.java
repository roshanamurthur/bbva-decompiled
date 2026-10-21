package m0;

import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotMutationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements SnapshotMutationPolicy<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f83334a = new v0();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean equivalent(@Nullable Object obj, @Nullable Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return h0.a(this, obj, obj2, obj3);
    }

    @NotNull
    public final String toString() {
        return "StructuralEqualityPolicy";
    }
}
