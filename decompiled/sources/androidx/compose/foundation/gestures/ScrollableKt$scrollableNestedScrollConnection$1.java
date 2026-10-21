package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
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

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<ScrollingLogic> f3832p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f3833q0;

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", i = {0, 0}, l = {574}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ScrollableKt$scrollableNestedScrollConnection$1 f3834p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f3835q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3836r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f3838t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3836r0 = obj;
            this.f3838t0 |= Integer.MIN_VALUE;
            return ScrollableKt$scrollableNestedScrollConnection$1.this.mo218onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    public ScrollableKt$scrollableNestedScrollConnection$1(State<ScrollingLogic> state, boolean z10) {
        this.f3832p0 = state;
        this.f3833q0 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    public Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        a aVar;
        long jM4625getZero9UxMQ8M;
        ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f3838t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3838t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.f3836r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f3838t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objB);
            if (this.f3833q0) {
                ScrollingLogic value = this.f3832p0.getValue();
                aVar.f3834p0 = this;
                aVar.f3835q0 = j11;
                aVar.f3838t0 = 1;
                objB = value.b(j11, aVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scrollableKt$scrollableNestedScrollConnection$1 = this;
            } else {
                jM4625getZero9UxMQ8M = Velocity.INSTANCE.m4625getZero9UxMQ8M();
                scrollableKt$scrollableNestedScrollConnection$1 = this;
            }
            Velocity velocityM4605boximpl = Velocity.m4605boximpl(jM4625getZero9UxMQ8M);
            State<ScrollingLogic> state = scrollableKt$scrollableNestedScrollConnection$1.f3832p0;
            velocityM4605boximpl.getF18328a();
            state.getValue().f3846g.setValue(Boolean.FALSE);
            return velocityM4605boximpl;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = aVar.f3835q0;
        scrollableKt$scrollableNestedScrollConnection$1 = aVar.f3834p0;
        ResultKt.throwOnFailure(objB);
        jM4625getZero9UxMQ8M = Velocity.m4617minusAH228Gc(j11, ((Velocity) objB).getF18328a());
        Velocity velocityM4605boximpl2 = Velocity.m4605boximpl(jM4625getZero9UxMQ8M);
        State<ScrollingLogic> state2 = scrollableKt$scrollableNestedScrollConnection$1.f3832p0;
        velocityM4605boximpl2.getF18328a();
        state2.getValue().f3846g.setValue(Boolean.FALSE);
        return velocityM4605boximpl2;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo219onPostScrollDzOQY0M(long consumed, long available, int source) {
        return this.f3833q0 ? this.f3832p0.getValue().d(available) : Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public final /* synthetic */ Object mo220onPreFlingQWom1Mo(long j10, Continuation continuation) {
        return d1.a.c(this, j10, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo221onPreScrollOzD1aCk(long available, int source) {
        if (NestedScrollSource.m3387equalsimpl0(source, NestedScrollSource.INSTANCE.m3393getFlingWNlRxjI())) {
            this.f3832p0.getValue().f3846g.setValue(Boolean.TRUE);
        }
        return Offset.INSTANCE.m2291getZeroF1C5BW0();
    }
}
