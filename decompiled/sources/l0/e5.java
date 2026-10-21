package l0;

import androidx.compose.material3.Selection;
import androidx.compose.material3.TimePickerState;
import androidx.compose.ui.focus.FocusRequester;
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
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class e5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82524p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f82525q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f82526r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(TimePickerState timePickerState, int i10, FocusRequester focusRequester, Continuation<? super e5> continuation) {
        super(2, continuation);
        this.f82524p0 = timePickerState;
        this.f82525q0 = i10;
        this.f82526r0 = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e5(this.f82524p0, this.f82525q0, this.f82526r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Selection.m1237equalsimpl0(this.f82524p0.m1419getSelectionJiIwxys$material3_release(), this.f82525q0)) {
            this.f82526r0.requestFocus();
        }
        return Unit.INSTANCE;
    }
}
