package l0;

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
@DebugMetadata(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1333}, m = "invokeSuspend", n = {}, s = {})
public final class v2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82990p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ w2 f82991q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f82992r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Interaction f82993s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var, boolean z10, Interaction interaction, Continuation<? super v2> continuation) {
        super(2, continuation);
        this.f82991q0 = w2Var;
        this.f82992r0 = z10;
        this.f82993s0 = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new v2(this.f82991q0, this.f82992r0, this.f82993s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((v2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82990p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            w2 w2Var = this.f82991q0;
            MutableInteractionSource mutableInteractionSource = this.f82992r0 ? w2Var.f83021a : w2Var.f83022b;
            this.f82990p0 = 1;
            if (mutableInteractionSource.emit(this.f82993s0, this) == coroutine_suspended) {
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
