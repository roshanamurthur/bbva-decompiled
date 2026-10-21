package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0001¨\u0006\u0006"}, d2 = {"findIndexByKey", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "key", "", "lastKnownIndex", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    public static final int findIndexByKey(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider, @Nullable Object obj, int i10) {
        int index;
        Intrinsics.checkNotNullParameter(lazyLayoutItemProvider, "<this>");
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i10 < lazyLayoutItemProvider.getItemCount() && Intrinsics.areEqual(obj, lazyLayoutItemProvider.getKey(i10))) || (index = lazyLayoutItemProvider.getIndex(obj)) == -1) ? i10 : index;
    }
}
