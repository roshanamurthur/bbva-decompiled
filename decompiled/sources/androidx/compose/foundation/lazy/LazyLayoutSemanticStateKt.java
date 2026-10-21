package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutSemanticState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"LazyLayoutSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "isVertical", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutSemanticStateKt {
    @NotNull
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(@NotNull final LazyListState state, final boolean z10) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt.LazyLayoutSemanticState.1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @Nullable
            public Object animateScrollBy(float f6, @NotNull Continuation<? super Unit> continuation) {
                Object objAnimateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(state, f6, null, continuation, 2, null);
                return objAnimateScrollBy$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateScrollBy$default : Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @NotNull
            public CollectionInfo collectionInfo() {
                return z10 ? new CollectionInfo(-1, 1) : new CollectionInfo(1, -1);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public boolean getCanScrollForward() {
                return state.getCanScrollForward();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getCurrentPosition() {
                LazyListState lazyListState = state;
                return (lazyListState.getFirstVisibleItemScrollOffset() / 100000.0f) + lazyListState.getFirstVisibleItemIndex();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @Nullable
            public Object scrollToItem(int i10, @NotNull Continuation<? super Unit> continuation) {
                Object objScrollToItem$default = LazyListState.scrollToItem$default(state, i10, 0, continuation, 2, null);
                return objScrollToItem$default == ek.a.getCOROUTINE_SUSPENDED() ? objScrollToItem$default : Unit.INSTANCE;
            }
        };
    }
}
