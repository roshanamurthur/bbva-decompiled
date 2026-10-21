package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "a", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "getOriginalFlingBehavior", "()Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "originalFlingBehavior", "Landroidx/compose/foundation/pager/PagerState;", "b", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "pagerState", "<init>", "(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PagerWrapperFlingBehavior implements FlingBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SnapFlingBehavior originalFlingBehavior;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PagerState pagerState;

    /* JADX INFO: compiled from: Pager.kt */
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "Pager.kt", i = {}, l = {794}, m = "performFling", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f5552p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f5554r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f5552p0 = obj;
            this.f5554r0 |= Integer.MIN_VALUE;
            return PagerWrapperFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    /* JADX INFO: compiled from: Pager.kt */
    public static final class b extends Lambda implements Function1<Float, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f6) {
            PagerWrapperFlingBehavior.this.getPagerState().setSnapRemainingScrollOffset$foundation_release(f6.floatValue());
            return Unit.INSTANCE;
        }
    }

    public PagerWrapperFlingBehavior(@NotNull SnapFlingBehavior originalFlingBehavior, @NotNull PagerState pagerState) {
        Intrinsics.checkNotNullParameter(originalFlingBehavior, "originalFlingBehavior");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        this.originalFlingBehavior = originalFlingBehavior;
        this.pagerState = pagerState;
    }

    @NotNull
    public final SnapFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    @NotNull
    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope, float f6, @NotNull Continuation<? super Float> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f5554r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f5554r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objPerformFling = aVar.f5552p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f5554r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objPerformFling);
            b bVar = new b();
            aVar.f5554r0 = 1;
            objPerformFling = this.originalFlingBehavior.performFling(scrollScope, f6, bVar, aVar);
            if (objPerformFling == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPerformFling);
        }
        return Boxing.boxFloat(((Number) objPerformFling).floatValue());
    }
}
