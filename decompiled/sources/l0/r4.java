package l0;

import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1", f = "TimePicker.kt", i = {}, l = {1317}, m = "invokeSuspend", n = {}, s = {})
public final class r4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82844p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82845q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f82846r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f82847s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Offset> f82848t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(TimePickerState timePickerState, float f6, boolean z10, MutableState<Offset> mutableState, Continuation<? super r4> continuation) {
        super(2, continuation);
        this.f82845q0 = timePickerState;
        this.f82846r0 = f6;
        this.f82847s0 = z10;
        this.f82848t0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new r4(this.f82845q0, this.f82846r0, this.f82847s0, this.f82848t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((r4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82844p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TimePickerState timePickerState = this.f82845q0;
            MutableState<Offset> mutableState = this.f82848t0;
            float fM2275getXimpl = Offset.m2275getXimpl(((Offset) mutableState.getValue()).getF15533a());
            float fM2276getYimpl = Offset.m2276getYimpl(((Offset) mutableState.getValue()).getF15533a());
            float f6 = this.f82846r0;
            boolean z10 = this.f82847s0;
            this.f82844p0 = 1;
            if (timePickerState.onTap$material3_release(fM2275getXimpl, fM2276getYimpl, f6, z10, this) == coroutine_suspended) {
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
