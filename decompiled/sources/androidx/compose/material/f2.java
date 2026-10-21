package androidx.compose.material;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {ErrorCodes.ERR_CRY_BAD_PIN_SIZE}, m = "invokeSuspend", n = {}, s = {})
public final class f2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f8460p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ h0.m2 f8461q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f8462r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f8463s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f8464t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f8465u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(h0.m2 m2Var, float f6, float f10, float f11, Function0<Unit> function0, Continuation<? super f2> continuation) {
        super(2, continuation);
        this.f8461q0 = m2Var;
        this.f8462r0 = f6;
        this.f8463s0 = f10;
        this.f8464t0 = f11;
        this.f8465u0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f2(this.f8461q0, this.f8462r0, this.f8463s0, this.f8464t0, this.f8465u0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f8460p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f8460p0 = 1;
            if (SliderKt.access$animateToTarget(this.f8461q0, this.f8462r0, this.f8463s0, this.f8464t0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Function0<Unit> function0 = this.f8465u0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
