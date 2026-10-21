package l0;

import androidx.compose.material3.TimePickerState;
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
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$2$1", f = "TimePicker.kt", i = {}, l = {1260}, m = "invokeSuspend", n = {}, s = {})
public final class k5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82667p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82668q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f82669r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f82670s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f82671t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(TimePickerState timePickerState, long j10, float f6, boolean z10, Continuation<? super k5> continuation) {
        super(2, continuation);
        this.f82668q0 = timePickerState;
        this.f82669r0 = j10;
        this.f82670s0 = f6;
        this.f82671t0 = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k5(this.f82668q0, this.f82669r0, this.f82670s0, this.f82671t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((k5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82667p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TimePickerState timePickerState = this.f82668q0;
            long j10 = this.f82669r0;
            float fM2275getXimpl = Offset.m2275getXimpl(j10);
            float fM2276getYimpl = Offset.m2276getYimpl(j10);
            float f6 = this.f82670s0;
            boolean z10 = this.f82671t0;
            this.f82667p0 = 1;
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
