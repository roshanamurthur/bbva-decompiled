package l0;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", i = {}, l = {774}, m = "invokeSuspend", n = {}, s = {})
public final class q1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82811p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f82812q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(LazyListState lazyListState, Continuation<? super q1> continuation) {
        super(2, continuation);
        this.f82812q0 = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new q1(this.f82812q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((q1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82811p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.f82812q0;
            int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
            this.f82811p0 = 1;
            if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutine_suspended) {
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
