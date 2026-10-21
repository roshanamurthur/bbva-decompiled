package k8;

import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.cellsweb.presentation.model.ModalsContract;
import com.bbva.glomohybrid.cellsweb.presentation.view.SingleAppModalsView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleAppModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.view.SingleAppModalsView$emitPositiveIntent$1", f = "SingleAppModalsView.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f79253p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SingleAppModalsView f79254q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ModalType f79255r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SingleAppModalsView singleAppModalsView, ModalType modalType, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f79254q0 = singleAppModalsView;
        this.f79255r0 = modalType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g(this.f79254q0, this.f79255r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f79253p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f79254q0.f31754u0;
            ModalsContract.Intent.ConfirmClick confirmClick = new ModalsContract.Intent.ConfirmClick(this.f79255r0);
            this.f79253p0 = 1;
            if (channel.send(confirmClick, this) == coroutine_suspended) {
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
