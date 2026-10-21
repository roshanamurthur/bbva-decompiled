package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"animateScrollBy", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "value", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScrollExtensionsKt {

    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {40}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.FloatRef f3799p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3800q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f3801r0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3800q0 = obj;
            this.f3801r0 |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3802p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3803q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f3804r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f3805s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f3806t0;

        /* JADX INFO: compiled from: ScrollExtensions.kt */
        public static final class a extends Lambda implements Function2<Float, Float, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f3807p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ScrollScope f3808q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.FloatRef floatRef, ScrollScope scrollScope) {
                super(2);
                this.f3807p0 = floatRef;
                this.f3808q0 = scrollScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Float f6, Float f10) {
                float fFloatValue = f6.floatValue();
                f10.floatValue();
                Ref.FloatRef floatRef = this.f3807p0;
                float f11 = floatRef.element;
                floatRef.element = this.f3808q0.scrollBy(fFloatValue - f11) + f11;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, AnimationSpec animationSpec, Continuation continuation, Ref.FloatRef floatRef) {
            super(2, continuation);
            this.f3804r0 = f6;
            this.f3805s0 = animationSpec;
            this.f3806t0 = floatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f3804r0, this.f3805s0, continuation, this.f3806t0);
            bVar.f3803q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((b) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3802p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollScope scrollScope = (ScrollScope) this.f3803q0;
                float f6 = this.f3804r0;
                AnimationSpec<Float> animationSpec = this.f3805s0;
                a aVar = new a(this.f3806t0, scrollScope);
                this.f3802p0 = 1;
                if (SuspendAnimationKt.animate$default(0.0f, f6, 0.0f, animationSpec, aVar, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {61}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.FloatRef f3809p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3810q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f3811r0;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3810q0 = obj;
            this.f3811r0 |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.scrollBy(null, 0.0f, this);
        }
    }

    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f3812p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f3813q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f3814r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.FloatRef floatRef, float f6, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f3813q0 = floatRef;
            this.f3814r0 = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f3813q0, this.f3814r0, continuation);
            dVar.f3812p0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((d) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f3813q0.element = ((ScrollScope) this.f3812p0).scrollBy(this.f3814r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((e) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final Object animateScrollBy(@NotNull ScrollableState scrollableState, float f6, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Float> continuation) {
        a aVar;
        Ref.FloatRef floatRef;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f3801r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3801r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f3800q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar2.f3801r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            b bVar = new b(f6, animationSpec, null, floatRef2);
            aVar2.f3799p0 = floatRef2;
            aVar2.f3801r0 = 1;
            if (o.e(scrollableState, null, bVar, aVar2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = aVar2.f3799p0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxFloat(floatRef.element);
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f6, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f6, animationSpec, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final Object scrollBy(@NotNull ScrollableState scrollableState, float f6, @NotNull Continuation<? super Float> continuation) {
        c cVar;
        Ref.FloatRef floatRef;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f3811r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f3811r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f3810q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar2.f3811r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            d dVar = new d(floatRef2, f6, null);
            cVar2.f3809p0 = floatRef2;
            cVar2.f3811r0 = 1;
            if (o.e(scrollableState, null, dVar, cVar2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = cVar2.f3809p0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxFloat(floatRef.element);
    }

    @Nullable
    public static final Object stopScroll(@NotNull ScrollableState scrollableState, @NotNull MutatePriority mutatePriority, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = scrollableState.scroll(mutatePriority, new e(2, null), continuation);
        return objScroll == ek.a.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, continuation);
    }
}
