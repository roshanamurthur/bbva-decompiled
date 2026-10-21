package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollInteropConnection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class NestedScrollInteropConnection implements NestedScrollConnection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final View f17253p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final NestedScrollingChildHelper f17254q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final int[] f17255r0;

    public NestedScrollInteropConnection(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f17253p0 = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.f17254q0 = nestedScrollingChildHelper;
        this.f17255r0 = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        float fAccess$toViewVelocity = NestedScrollInteropConnectionKt.access$toViewVelocity(Velocity.m4614getXimpl(j11));
        float fAccess$toViewVelocity2 = NestedScrollInteropConnectionKt.access$toViewVelocity(Velocity.m4615getYimpl(j11));
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f17254q0;
        if (!nestedScrollingChildHelper.dispatchNestedFling(fAccess$toViewVelocity, fAccess$toViewVelocity2, true)) {
            j11 = Velocity.INSTANCE.m4625getZero9UxMQ8M();
        }
        if (nestedScrollingChildHelper.hasNestedScrollingParent(0)) {
            nestedScrollingChildHelper.stopNestedScroll(0);
        }
        if (nestedScrollingChildHelper.hasNestedScrollingParent(1)) {
            nestedScrollingChildHelper.stopNestedScroll(1);
        }
        return Velocity.m4605boximpl(j11);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo219onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.f17254q0.startNestedScroll(NestedScrollInteropConnectionKt.m3808access$getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m3810access$toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        ArraysKt___ArraysJvmKt.fill$default(this.f17255r0, 0, 0, 0, 6, (Object) null);
        this.f17254q0.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2275getXimpl(consumed)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2276getYimpl(consumed)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2275getXimpl(available)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2276getYimpl(available)), null, NestedScrollInteropConnectionKt.m3810access$toViewTypeGyEprt8(source), this.f17255r0);
        int[] iArr = this.f17255r0;
        return OffsetKt.Offset(Offset.m2275getXimpl(available) >= 0.0f ? kotlin.ranges.c.coerceAtMost(iArr[0] * (-1.0f), Offset.m2275getXimpl(available)) : kotlin.ranges.c.coerceAtLeast(iArr[0] * (-1.0f), Offset.m2275getXimpl(available)), Offset.m2276getYimpl(available) >= 0.0f ? kotlin.ranges.c.coerceAtMost(iArr[1] * (-1.0f), Offset.m2276getYimpl(available)) : kotlin.ranges.c.coerceAtLeast(iArr[1] * (-1.0f), Offset.m2276getYimpl(available)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo220onPreFlingQWom1Mo(long j10, @NotNull Continuation<? super Velocity> continuation) {
        float fAccess$toViewVelocity = NestedScrollInteropConnectionKt.access$toViewVelocity(Velocity.m4614getXimpl(j10));
        float fAccess$toViewVelocity2 = NestedScrollInteropConnectionKt.access$toViewVelocity(Velocity.m4615getYimpl(j10));
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f17254q0;
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(fAccess$toViewVelocity, fAccess$toViewVelocity2)) {
            j10 = Velocity.INSTANCE.m4625getZero9UxMQ8M();
        }
        if (nestedScrollingChildHelper.hasNestedScrollingParent(0)) {
            nestedScrollingChildHelper.stopNestedScroll(0);
        }
        if (nestedScrollingChildHelper.hasNestedScrollingParent(1)) {
            nestedScrollingChildHelper.stopNestedScroll(1);
        }
        return Velocity.m4605boximpl(j10);
    }

    /* JADX WARN: Failed to inline method: androidx.compose.ui.platform.NestedScrollInteropConnectionKt.access$toOffset-Uv8p0NA(int[], long):long */
    /* JADX WARN: Unknown register number '(r19v0 'available' long)' in method call: androidx.compose.ui.platform.NestedScrollInteropConnectionKt.access$toOffset-Uv8p0NA(int[], long):long */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo221onPreScrollOzD1aCk(long available, int source) {
        if (!this.f17254q0.startNestedScroll(NestedScrollInteropConnectionKt.m3808access$getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m3810access$toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        ArraysKt___ArraysJvmKt.fill$default(this.f17255r0, 0, 0, 0, 6, (Object) null);
        this.f17254q0.dispatchNestedPreScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2275getXimpl(available)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2276getYimpl(available)), this.f17255r0, null, NestedScrollInteropConnectionKt.m3810access$toViewTypeGyEprt8(source));
        return NestedScrollInteropConnectionKt.m3809access$toOffsetUv8p0NA(this.f17255r0, available);
    }
}
