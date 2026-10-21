package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"androidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/foundation/gestures/Orientation;", "p0", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "material_release"}, k = 1, mv = {1, 8, 0})
public final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Orientation orientation = Orientation.Vertical;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState<?> f7068q0;

    /* JADX INFO: compiled from: Drawer.kt */
    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {912}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f7069p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f7070q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f7072s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f7070q0 = obj;
            this.f7072s0 |= Integer.MIN_VALUE;
            return DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.this.mo218onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {903}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f7073p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f7074q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f7076s0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f7074q0 = obj;
            this.f7076s0 |= Integer.MIN_VALUE;
            return DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.this.mo220onPreFlingQWom1Mo(0L, this);
        }
    }

    public DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState<?> anchoredDraggableState) {
        this.f7068q0 = anchoredDraggableState;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f7072s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f7072s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f7070q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f7072s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            float fM4614getXimpl = this.orientation == Orientation.Horizontal ? Velocity.m4614getXimpl(j11) : Velocity.m4615getYimpl(j11);
            aVar.f7069p0 = j11;
            aVar.f7072s0 = 1;
            if (this.f7068q0.settle(fM4614getXimpl, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = aVar.f7069p0;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.m4605boximpl(j11);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo219onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!NestedScrollSource.m3387equalsimpl0(source, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI())) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.orientation;
        float fDispatchRawDelta = this.f7068q0.dispatchRawDelta(orientation2 == orientation ? Offset.m2275getXimpl(available) : Offset.m2276getYimpl(available));
        float f6 = orientation2 == orientation ? fDispatchRawDelta : 0.0f;
        if (orientation2 != Orientation.Vertical) {
            fDispatchRawDelta = 0.0f;
        }
        return OffsetKt.Offset(f6, fDispatchRawDelta);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo220onPreFlingQWom1Mo(long j10, @NotNull Continuation<? super Velocity> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f7076s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f7076s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f7074q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f7076s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            float fM4614getXimpl = this.orientation == Orientation.Horizontal ? Velocity.m4614getXimpl(j10) : Velocity.m4615getYimpl(j10);
            AnchoredDraggableState<?> anchoredDraggableState = this.f7068q0;
            float fRequireOffset = anchoredDraggableState.requireOffset();
            if (fM4614getXimpl >= 0.0f || fRequireOffset <= anchoredDraggableState.getMinOffset()) {
                j10 = Velocity.INSTANCE.m4625getZero9UxMQ8M();
            } else {
                bVar.f7073p0 = j10;
                bVar.f7076s0 = 1;
                if (anchoredDraggableState.settle(fM4614getXimpl, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = bVar.f7073p0;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.m4605boximpl(j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo221onPreScrollOzD1aCk(long available, int source) {
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.orientation;
        float fM2275getXimpl = orientation2 == orientation ? Offset.m2275getXimpl(available) : Offset.m2276getYimpl(available);
        if (fM2275getXimpl >= 0.0f || !NestedScrollSource.m3387equalsimpl0(source, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI())) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        float fDispatchRawDelta = this.f7068q0.dispatchRawDelta(fM2275getXimpl);
        return OffsetKt.Offset(orientation2 == orientation ? fDispatchRawDelta : 0.0f, orientation2 == Orientation.Vertical ? fDispatchRawDelta : 0.0f);
    }
}
