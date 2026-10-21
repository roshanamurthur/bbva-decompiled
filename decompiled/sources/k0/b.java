package k0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material.ripple.RippleAnimation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f79144p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RippleAnimation f79145q0;

    /* JADX INFO: compiled from: RippleAnimation.kt */
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f79146p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f79147q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RippleAnimation rippleAnimation, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f79147q0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f79147q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f79146p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = this.f79147q0.f8963g;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                this.f79146p0 = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: k0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RippleAnimation.kt */
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0433b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f79148p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f79149q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0433b(RippleAnimation rippleAnimation, Continuation<? super C0433b> continuation) {
            super(2, continuation);
            this.f79149q0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0433b(this.f79149q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0433b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f79148p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = this.f79149q0.f8964h;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.f79148p0 = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: RippleAnimation.kt */
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f79150p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f79151q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RippleAnimation rippleAnimation, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f79151q0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f79151q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f79150p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = this.f79151q0.f8965i;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getLinearEasing(), 2, null);
                this.f79150p0 = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RippleAnimation rippleAnimation, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f79145q0 = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b bVar = new b(this.f79145q0, continuation);
        bVar.f79144p0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f79144p0;
        RippleAnimation rippleAnimation = this.f79145q0;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(rippleAnimation, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0433b(rippleAnimation, null), 3, null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(rippleAnimation, null), 3, null);
    }
}
