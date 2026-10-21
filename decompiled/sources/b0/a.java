package b0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements NestedScrollConnection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Orientation f24744p0;

    public a(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f24744p0 = orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        Orientation orientation = this.f24744p0;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return Velocity.m4605boximpl(orientation == Orientation.Vertical ? Velocity.m4610copyOhffZ5M$default(j11, 0.0f, 0.0f, 2, null) : Velocity.m4610copyOhffZ5M$default(j11, 0.0f, 0.0f, 1, null));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo219onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (!NestedScrollSource.m3387equalsimpl0(i10, NestedScrollSource.INSTANCE.m3393getFlingWNlRxjI())) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        Orientation orientation = this.f24744p0;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? Offset.m2269copydBAh8RU$default(j11, 0.0f, 0.0f, 2, null) : Offset.m2269copydBAh8RU$default(j11, 0.0f, 0.0f, 1, null);
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
}
