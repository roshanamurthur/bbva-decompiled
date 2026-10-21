package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Orientation f3840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State<NestedScrollDispatcher> f3842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ScrollableState f3843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FlingBehavior f3844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final OverscrollEffect f3845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f3846g;

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class a extends Lambda implements Function1<Offset, Offset> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f3848q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f3849r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, ScrollScope scrollScope) {
            super(1);
            this.f3848q0 = i10;
            this.f3849r0 = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Offset invoke(Offset offset) {
            long f15533a = offset.getF15533a();
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            NestedScrollDispatcher value = scrollingLogic.f3842c.getValue();
            long jM3383dispatchPreScrollOzD1aCk = value.m3383dispatchPreScrollOzD1aCk(f15533a, this.f3848q0);
            long jM2279minusMKHz9U = Offset.m2279minusMKHz9U(f15533a, jM3383dispatchPreScrollOzD1aCk);
            boolean z10 = scrollingLogic.f3841b;
            long jG = scrollingLogic.g(this.f3849r0.scrollBy(scrollingLogic.f(z10 ? Offset.m2282timestuRUvjQ(jM2279minusMKHz9U, -1.0f) : jM2279minusMKHz9U)));
            if (z10) {
                jG = Offset.m2282timestuRUvjQ(jG, -1.0f);
            }
            long j10 = jG;
            return Offset.m2264boximpl(Offset.m2280plusMKHz9U(Offset.m2280plusMKHz9U(jM3383dispatchPreScrollOzD1aCk, j10), value.m3381dispatchPostScrollDzOQY0M(j10, Offset.m2279minusMKHz9U(jM2279minusMKHz9U, j10), this.f3848q0)));
        }
    }

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {488}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.LongRef f3850p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3851q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3853s0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3851q0 = obj;
            this.f3853s0 |= Integer.MIN_VALUE;
            return ScrollingLogic.this.b(0L, this);
        }
    }

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 1}, l = {477, 479}, m = "onDragStopped-sF-c-tU", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ScrollingLogic f3854p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3855q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3857s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3855q0 = obj;
            this.f3857s0 |= Integer.MIN_VALUE;
            return ScrollingLogic.this.c(0L, this);
        }
    }

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {464, 466, 468}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
    public static final class d extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f3858p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f3859q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ long f3860r0;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = ScrollingLogic.this.new d(continuation);
            dVar.f3860r0 = ((Velocity) obj).getF18328a();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
            return ((d) create(Velocity.m4605boximpl(velocity.getF18328a()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0087 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long j10;
            Object objM3382dispatchPreFlingQWom1Mo;
            Object objB;
            long j11;
            long f18328a;
            Object objM3380dispatchPostFlingRZ2iAVY;
            long j12;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3859q0;
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = this.f3860r0;
                    ResultKt.throwOnFailure(obj);
                    objM3382dispatchPreFlingQWom1Mo = obj;
                } else if (i10 == 2) {
                    j11 = this.f3858p0;
                    j10 = this.f3860r0;
                    ResultKt.throwOnFailure(obj);
                    objB = obj;
                    f18328a = ((Velocity) objB).getF18328a();
                    NestedScrollDispatcher value = scrollingLogic.f3842c.getValue();
                    long jM4617minusAH228Gc = Velocity.m4617minusAH228Gc(j11, f18328a);
                    this.f3860r0 = j10;
                    this.f3858p0 = f18328a;
                    this.f3859q0 = 3;
                    objM3380dispatchPostFlingRZ2iAVY = value.m3380dispatchPostFlingRZ2iAVY(jM4617minusAH228Gc, f18328a, this);
                    if (objM3380dispatchPostFlingRZ2iAVY == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j12 = j10;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j13 = this.f3858p0;
                    j12 = this.f3860r0;
                    ResultKt.throwOnFailure(obj);
                    f18328a = j13;
                    objM3380dispatchPostFlingRZ2iAVY = obj;
                }
                return Velocity.m4605boximpl(Velocity.m4617minusAH228Gc(j12, Velocity.m4617minusAH228Gc(f18328a, ((Velocity) objM3380dispatchPostFlingRZ2iAVY).getF18328a())));
            }
            ResultKt.throwOnFailure(obj);
            j10 = this.f3860r0;
            NestedScrollDispatcher value2 = scrollingLogic.f3842c.getValue();
            this.f3860r0 = j10;
            this.f3859q0 = 1;
            objM3382dispatchPreFlingQWom1Mo = value2.m3382dispatchPreFlingQWom1Mo(j10, this);
            if (objM3382dispatchPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            long jM4617minusAH228Gc2 = Velocity.m4617minusAH228Gc(j10, ((Velocity) objM3382dispatchPreFlingQWom1Mo).getF18328a());
            this.f3860r0 = j10;
            this.f3858p0 = jM4617minusAH228Gc2;
            this.f3859q0 = 2;
            objB = scrollingLogic.b(jM4617minusAH228Gc2, this);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            j11 = jM4617minusAH228Gc2;
            f18328a = ((Velocity) objB).getF18328a();
            NestedScrollDispatcher value3 = scrollingLogic.f3842c.getValue();
            long jM4617minusAH228Gc3 = Velocity.m4617minusAH228Gc(j11, f18328a);
            this.f3860r0 = j10;
            this.f3858p0 = f18328a;
            this.f3859q0 = 3;
            objM3380dispatchPostFlingRZ2iAVY = value3.m3380dispatchPostFlingRZ2iAVY(jM4617minusAH228Gc3, f18328a, this);
            if (objM3380dispatchPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            j12 = j10;
            return Velocity.m4605boximpl(Velocity.m4617minusAH228Gc(j12, Velocity.m4617minusAH228Gc(f18328a, ((Velocity) objM3380dispatchPostFlingRZ2iAVY).getF18328a())));
        }
    }

    public ScrollingLogic(@NotNull Orientation orientation, boolean z10, @NotNull MutableState nestedScrollDispatcher, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior, @Nullable OverscrollEffect overscrollEffect) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.f3840a = orientation;
        this.f3841b = z10;
        this.f3842c = nestedScrollDispatcher;
        this.f3843d = scrollableState;
        this.f3844e = flingBehavior;
        this.f3845f = overscrollEffect;
        this.f3846g = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final long a(@NotNull ScrollScope dispatchScroll, long j10, int i10) {
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        long jM2269copydBAh8RU$default = this.f3840a == Orientation.Horizontal ? Offset.m2269copydBAh8RU$default(j10, 0.0f, 0.0f, 1, null) : Offset.m2269copydBAh8RU$default(j10, 0.0f, 0.0f, 2, null);
        a aVar = new a(i10, dispatchScroll);
        OverscrollEffect overscrollEffect = this.f3845f;
        if (overscrollEffect != null) {
            ScrollableState scrollableState = this.f3843d;
            if (scrollableState.getCanScrollForward() || scrollableState.getCanScrollBackward()) {
                return overscrollEffect.mo120applyToScrollRhakbz0(jM2269copydBAh8RU$default, i10, aVar);
            }
        }
        return ((Offset) aVar.invoke(Offset.m2264boximpl(jM2269copydBAh8RU$default))).getF15533a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object b(long j10, @NotNull Continuation<? super Velocity> continuation) {
        b bVar;
        Ref.LongRef longRef;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f3853s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f3853s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f3851q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar2.f3853s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j10;
            ScrollableState scrollableState = this.f3843d;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j10, null);
            bVar2.f3850p0 = longRef2;
            bVar2.f3853s0 = 1;
            if (o.e(scrollableState, null, scrollingLogic$doFlingAnimation$2, bVar2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = bVar2.f3850p0;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.m4605boximpl(longRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(long j10, @NotNull Continuation<? super Unit> continuation) {
        c cVar;
        Velocity velocityM4605boximpl;
        ScrollingLogic scrollingLogic;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f3857s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f3857s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f3855q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f3857s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f3846g.setValue(Boolean.TRUE);
            long jM4610copyOhffZ5M$default = Velocity.m4610copyOhffZ5M$default(j10, 0.0f, 0.0f, this.f3840a == Orientation.Horizontal ? 1 : 2, null);
            d dVar = new d(null);
            OverscrollEffect overscrollEffect = this.f3845f;
            if (overscrollEffect != null) {
                ScrollableState scrollableState = this.f3843d;
                if (scrollableState.getCanScrollForward() || scrollableState.getCanScrollBackward()) {
                    cVar.f3854p0 = this;
                    cVar.f3857s0 = 1;
                    if (overscrollEffect.mo119applyToFlingBMRW4eQ(jM4610copyOhffZ5M$default, dVar, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    velocityM4605boximpl = Velocity.m4605boximpl(jM4610copyOhffZ5M$default);
                    cVar.f3854p0 = this;
                    cVar.f3857s0 = 2;
                    if (dVar.invoke(velocityM4605boximpl, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                velocityM4605boximpl = Velocity.m4605boximpl(jM4610copyOhffZ5M$default);
                cVar.f3854p0 = this;
                cVar.f3857s0 = 2;
                if (dVar.invoke(velocityM4605boximpl, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            scrollingLogic = this;
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollingLogic = cVar.f3854p0;
            ResultKt.throwOnFailure(obj);
        }
        scrollingLogic.f3846g.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final long d(long j10) {
        ScrollableState scrollableState = this.f3843d;
        return scrollableState.isScrollInProgress() ? Offset.INSTANCE.m2291getZeroF1C5BW0() : g(e(scrollableState.dispatchRawDelta(e(f(j10)))));
    }

    public final float e(float f6) {
        return this.f3841b ? f6 * (-1) : f6;
    }

    public final float f(long j10) {
        return this.f3840a == Orientation.Horizontal ? Offset.m2275getXimpl(j10) : Offset.m2276getYimpl(j10);
    }

    public final long g(float f6) {
        if (f6 == 0.0f) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        return this.f3840a == Orientation.Horizontal ? OffsetKt.Offset(f6, 0.0f) : OffsetKt.Offset(0.0f, f6);
    }
}
