package v8;

import com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal;
import com.bbva.glomohybrid.inappupdate.view.InAppUpdateModalView;
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

/* JADX INFO: compiled from: InAppUpdateModalView.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.inappupdate.view.InAppUpdateModalView$handleFragmentViewCreated$1$1", f = "InAppUpdateModalView.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93982p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ InAppUpdateModalView f93983q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InAppUpdateModalView inAppUpdateModalView, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f93983q0 = inAppUpdateModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f93983q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93982p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f93983q0.f32202u0;
            InAppUpdateModal.Intent.Install install = InAppUpdateModal.Intent.Install.INSTANCE;
            this.f93982p0 = 1;
            if (channel.send(install, this) == coroutine_suspended) {
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
