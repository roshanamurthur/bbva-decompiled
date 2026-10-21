package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "a", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "getPrefetcher$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "setPrefetcher$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;)V", "prefetcher", "<init>", "()V", "PrefetchHandle", "Prefetcher", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Prefetcher prefetcher;

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$a;", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public interface PrefetchHandle {
        void cancel();
    }

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "", "schedulePrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", FirebaseAnalytics.Param.INDEX, "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Prefetcher {
        @NotNull
        /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
        PrefetchHandle mo417schedulePrefetch0kLqBqw(int index, long constraints);
    }

    @Nullable
    /* JADX INFO: renamed from: getPrefetcher$foundation_release, reason: from getter */
    public final Prefetcher getPrefetcher() {
        return this.prefetcher;
    }

    @NotNull
    /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    public final PrefetchHandle m416schedulePrefetch0kLqBqw(int index, long constraints) {
        PrefetchHandle prefetchHandleMo417schedulePrefetch0kLqBqw;
        Prefetcher prefetcher = this.prefetcher;
        return (prefetcher == null || (prefetchHandleMo417schedulePrefetch0kLqBqw = prefetcher.mo417schedulePrefetch0kLqBqw(index, constraints)) == null) ? a.f5081a : prefetchHandleMo417schedulePrefetch0kLqBqw;
    }

    public final void setPrefetcher$foundation_release(@Nullable Prefetcher prefetcher) {
        this.prefetcher = prefetcher;
    }
}
