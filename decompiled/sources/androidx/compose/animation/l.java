package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntSize;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f3236p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SizeAnimationModifier.AnimData f3237q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f3238r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SizeAnimationModifier f3239s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SizeAnimationModifier.AnimData animData, long j10, SizeAnimationModifier sizeAnimationModifier, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f3237q0 = animData;
        this.f3238r0 = j10;
        this.f3239s0 = sizeAnimationModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new l(this.f3237q0, this.f3238r0, this.f3239s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function2<? super IntSize, ? super IntSize, Unit> function2;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f3236p0;
        SizeAnimationModifier sizeAnimationModifier = this.f3239s0;
        SizeAnimationModifier.AnimData animData = this.f3237q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<IntSize, AnimationVector2D> anim = animData.getAnim();
            IntSize intSizeM4541boximpl = IntSize.m4541boximpl(this.f3238r0);
            AnimationSpec<IntSize> animationSpec = sizeAnimationModifier.f2801a;
            this.f3236p0 = 1;
            obj = Animatable.animateTo$default(anim, intSizeM4541boximpl, animationSpec, null, null, this, 12, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (function2 = sizeAnimationModifier.f2803c) != null) {
            function2.invoke(IntSize.m4541boximpl(animData.m62getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return Unit.INSTANCE;
    }
}
