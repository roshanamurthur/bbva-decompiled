package l0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
public final class x3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83036p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f83037q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f83038r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ AnimationSpec<Float> f83039s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f83040t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(Animatable<Float, AnimationVector1D> animatable, boolean z10, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Continuation<? super x3> continuation) {
        super(2, continuation);
        this.f83037q0 = animatable;
        this.f83038r0 = z10;
        this.f83039s0 = animationSpec;
        this.f83040t0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new x3(this.f83037q0, this.f83038r0, this.f83039s0, this.f83040t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((x3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83036p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVector1D> animatable = this.f83037q0;
            Float fBoxFloat = Boxing.boxFloat(this.f83038r0 ? 1.0f : 0.0f);
            AnimationSpec<Float> animationSpec = this.f83039s0;
            this.f83036p0 = 1;
            if (Animatable.animateTo$default(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f83040t0.invoke();
        return Unit.INSTANCE;
    }
}
