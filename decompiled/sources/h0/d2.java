package h0;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1067}, m = "invokeSuspend", n = {}, s = {})
public final class d2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68714p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ e2 f68715q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f68716r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Interaction f68717s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, boolean z10, Interaction interaction, Continuation<? super d2> continuation) {
        super(2, continuation);
        this.f68715q0 = e2Var;
        this.f68716r0 = z10;
        this.f68717s0 = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d2(this.f68715q0, this.f68716r0, this.f68717s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68714p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            e2 e2Var = this.f68715q0;
            MutableInteractionSource mutableInteractionSource = this.f68716r0 ? e2Var.f68731a : e2Var.f68732b;
            this.f68714p0 = 1;
            if (mutableInteractionSource.emit(this.f68717s0, this) == coroutine_suspended) {
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
