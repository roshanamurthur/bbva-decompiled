package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
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
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$2$1", f = "TimePicker.kt", i = {}, l = {1278}, m = "invokeSuspend", n = {}, s = {})
public final class e5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f12810p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f12811q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12812r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f12813s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f12814t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(long j10, TimePickerState timePickerState, MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super e5> continuation) {
        super(2, continuation);
        this.f12811q0 = j10;
        this.f12812r0 = timePickerState;
        this.f12813s0 = mutableState;
        this.f12814t0 = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e5(this.f12811q0, this.f12812r0, this.f12813s0, this.f12814t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f12810p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<Float> mutableState = this.f12813s0;
            float fFloatValue = mutableState.getValue().floatValue();
            long j10 = this.f12811q0;
            mutableState.setValue(Float.valueOf(Offset.m2275getXimpl(j10) + fFloatValue));
            MutableState<Float> mutableState2 = this.f12814t0;
            mutableState2.setValue(Float.valueOf(Offset.m2276getYimpl(j10) + mutableState2.getValue().floatValue()));
            TimePickerState timePickerState = this.f12812r0;
            float fFloatValue2 = mutableState2.getValue().floatValue();
            TimePickerState timePickerState2 = this.f12812r0;
            float fAccess$atan = TimePickerKt.access$atan(fFloatValue2 - IntOffset.m4508getYimpl(timePickerState2.m1418getCenternOccac$material3_release()), mutableState.getValue().floatValue() - IntOffset.m4507getXimpl(timePickerState2.m1418getCenternOccac$material3_release()));
            this.f12810p0 = 1;
            if (TimePickerState.update$material3_release$default(timePickerState, fAccess$atan, false, this, 2, null) == coroutine_suspended) {
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
