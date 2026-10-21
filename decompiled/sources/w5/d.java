package w5;

import com.bbva.component.ui.modal.halfmodal.HalfModalContract;
import com.bbva.component.ui.modal.halfmodal.views.DefaultHalfModalView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultHalfModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.modal.halfmodal.views.DefaultHalfModalView$observeEvents$3$1", f = "DefaultHalfModalView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DefaultHalfModalView f94163p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DefaultHalfModalView defaultHalfModalView, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f94163p0 = defaultHalfModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f94163p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultHalfModalView defaultHalfModalView = this.f94163p0;
        defaultHalfModalView.getViewModel().buttonTapped(HalfModalContract.ButtonType.SECONDARY);
        defaultHalfModalView.dismiss();
        return Unit.INSTANCE;
    }
}
