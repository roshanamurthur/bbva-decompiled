package androidx.compose.material3;

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
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$1$1", f = "TimePicker.kt", i = {}, l = {1269, 1271}, m = "invokeSuspend", n = {}, s = {})
public final class c5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f12731p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12732q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f12733r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(TimePickerState timePickerState, boolean z10, Continuation<? super c5> continuation) {
        super(2, continuation);
        this.f12732q0 = timePickerState;
        this.f12733r0 = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c5(this.f12732q0, this.f12733r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f12731p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TimePickerState timePickerState = this.f12732q0;
            int iM1419getSelectionJiIwxys$material3_release = timePickerState.m1419getSelectionJiIwxys$material3_release();
            Selection.Companion companion = Selection.INSTANCE;
            if (Selection.m1237equalsimpl0(iM1419getSelectionJiIwxys$material3_release, companion.m1241getHourJiIwxys()) && this.f12733r0) {
                timePickerState.m1422setSelectioniHAOin8$material3_release(companion.m1242getMinuteJiIwxys());
                this.f12731p0 = 1;
                if (timePickerState.animateToCurrent$material3_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (Selection.m1237equalsimpl0(timePickerState.m1419getSelectionJiIwxys$material3_release(), companion.m1242getMinuteJiIwxys())) {
                this.f12731p0 = 2;
                if (timePickerState.settle(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
