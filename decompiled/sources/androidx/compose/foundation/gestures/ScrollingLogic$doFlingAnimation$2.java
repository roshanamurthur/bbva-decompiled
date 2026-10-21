package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {500}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ScrollingLogic f3862p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Ref.LongRef f3863q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f3864r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f3865s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public /* synthetic */ Object f3866t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3867u0;
    public final /* synthetic */ Ref.LongRef v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ long f3868w0;

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class a extends Lambda implements Function1<Offset, Offset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ScrollingLogic f3869p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f3870q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScrollingLogic scrollingLogic, ScrollScope scrollScope) {
            super(1);
            this.f3869p0 = scrollingLogic;
            this.f3870q0 = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Offset invoke(Offset offset) {
            long f15533a = offset.getF15533a();
            ScrollingLogic scrollingLogic = this.f3869p0;
            if (scrollingLogic.f3841b) {
                f15533a = Offset.m2282timestuRUvjQ(f15533a, -1.0f);
            }
            long jA = scrollingLogic.a(this.f3870q0, f15533a, NestedScrollSource.INSTANCE.m3393getFlingWNlRxjI());
            if (scrollingLogic.f3841b) {
                jA = Offset.m2282timestuRUvjQ(jA, -1.0f);
            }
            return Offset.m2264boximpl(jA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j10, Continuation<? super ScrollingLogic$doFlingAnimation$2> continuation) {
        super(2, continuation);
        this.f3867u0 = scrollingLogic;
        this.v0 = longRef;
        this.f3868w0 = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f3867u0, this.v0, this.f3868w0, continuation);
        scrollingLogic$doFlingAnimation$2.f3866t0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        final ScrollingLogic scrollingLogic;
        long j10;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        float f6;
        int i10;
        Object obj2;
        float f10;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = this.f3865s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope = (ScrollScope) this.f3866t0;
            scrollingLogic = this.f3867u0;
            final a aVar = new a(scrollingLogic, scrollScope);
            ScrollScope scrollScope2 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    ScrollingLogic scrollingLogic3 = scrollingLogic;
                    return scrollingLogic3.f(aVar.invoke(Offset.m2264boximpl(scrollingLogic3.g(pixels))).getF15533a());
                }
            };
            FlingBehavior flingBehavior = scrollingLogic.f3844e;
            Ref.LongRef longRef2 = this.v0;
            long j11 = longRef2.element;
            Orientation orientation = Orientation.Horizontal;
            Orientation orientation2 = scrollingLogic.f3840a;
            long j12 = this.f3868w0;
            float fE = scrollingLogic.e(orientation2 == orientation ? Velocity.m4614getXimpl(j12) : Velocity.m4615getYimpl(j12));
            this.f3866t0 = scrollingLogic;
            this.f3862p0 = scrollingLogic;
            this.f3863q0 = longRef2;
            this.f3864r0 = j11;
            this.f3865s0 = 1;
            obj = flingBehavior.performFling(scrollScope2, fE, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j10 = j11;
            longRef = longRef2;
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f3864r0;
            Ref.LongRef longRef3 = this.f3863q0;
            scrollingLogic = this.f3862p0;
            scrollingLogic2 = (ScrollingLogic) this.f3866t0;
            ResultKt.throwOnFailure(obj);
            longRef = longRef3;
        }
        float fE2 = scrollingLogic2.e(((Number) obj).floatValue());
        if (scrollingLogic.f3840a == Orientation.Horizontal) {
            f10 = 0.0f;
            i10 = 2;
            obj2 = null;
            f6 = fE2;
        } else {
            f6 = 0.0f;
            i10 = 1;
            obj2 = null;
            f10 = fE2;
        }
        longRef.element = Velocity.m4610copyOhffZ5M$default(j10, f6, f10, i10, obj2);
        return Unit.INSTANCE;
    }
}
