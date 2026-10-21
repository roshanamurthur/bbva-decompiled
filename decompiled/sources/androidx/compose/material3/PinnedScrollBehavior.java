package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PinnedScrollBehavior implements TopAppBarScrollBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TopAppBarState f11023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f11024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PinnedScrollBehavior$nestedScrollConnection$1 f11025c;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1] */
    public PinnedScrollBehavior(@NotNull TopAppBarState state, @NotNull Function0<Boolean> canScroll) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canScroll, "canScroll");
        this.f11023a = state;
        this.f11024b = canScroll;
        this.f11025c = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
            public final /* synthetic */ Object mo218onPostFlingRZ2iAVY(long j10, long j11, Continuation continuation) {
                return d1.a.a(this, j10, j11, continuation);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
            public long mo219onPostScrollDzOQY0M(long consumed, long available, int source) {
                PinnedScrollBehavior pinnedScrollBehavior = this.f11026p0;
                if (!pinnedScrollBehavior.f11024b.invoke().booleanValue()) {
                    return Offset.INSTANCE.m2291getZeroF1C5BW0();
                }
                if (Offset.m2276getYimpl(consumed) != 0.0f || Offset.m2276getYimpl(available) <= 0.0f) {
                    TopAppBarState topAppBarState = pinnedScrollBehavior.f11023a;
                    topAppBarState.setContentOffset(Offset.m2276getYimpl(consumed) + topAppBarState.getContentOffset());
                } else {
                    pinnedScrollBehavior.f11023a.setContentOffset(0.0f);
                }
                return Offset.INSTANCE.m2291getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPreFling-QWom1Mo */
            public final /* synthetic */ Object mo220onPreFlingQWom1Mo(long j10, Continuation continuation) {
                return d1.a.c(this, j10, continuation);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
            public final /* synthetic */ long mo221onPreScrollOzD1aCk(long j10, int i10) {
                return d1.a.d(this, j10, i10);
            }
        };
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public final DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return null;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.f11025c;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return null;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public final TopAppBarState getState() {
        return this.f11023a;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final boolean isPinned() {
        return true;
    }
}
