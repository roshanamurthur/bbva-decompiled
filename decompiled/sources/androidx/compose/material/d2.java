package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class d2 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ float f8423p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f8424q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d2(State<? extends Function1<? super Float, Unit>> state, Continuation<? super d2> continuation) {
        super(3, continuation);
        this.f8424q0 = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, Float f6, Continuation<? super Unit> continuation) {
        float fFloatValue = f6.floatValue();
        d2 d2Var = new d2(this.f8424q0, continuation);
        d2Var.f8423p0 = fFloatValue;
        return d2Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f8424q0.getValue().invoke(Boxing.boxFloat(this.f8423p0));
        return Unit.INSTANCE;
    }
}
