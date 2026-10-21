package l0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.StateData;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1", f = "DatePicker.kt", i = {}, l = {ReturnCode.ERR_CRY_UNPADDING_METHOD}, m = "invokeSuspend", n = {}, s = {})
public final class k0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82648p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ StateData f82649q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f82650r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82651s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(StateData stateData, LazyListState lazyListState, int i10, Continuation<? super k0> continuation) {
        super(2, continuation);
        this.f82649q0 = stateData;
        this.f82650r0 = lazyListState;
        this.f82651s0 = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k0(this.f82649q0, this.f82650r0, this.f82651s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((k0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82648p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.f82650r0;
            StateData stateData = this.f82649q0;
            int month = (stateData.getDisplayedMonth().getMonth() + ((this.f82651s0 - stateData.getYearRange().getFirst()) * 12)) - 1;
            this.f82648p0 = 1;
            if (LazyListState.scrollToItem$default(lazyListState, month, 0, this, 2, null) == coroutine_suspended) {
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
