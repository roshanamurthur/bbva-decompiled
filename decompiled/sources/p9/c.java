package p9;

import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingActionsHandler;
import java.util.List;
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

/* JADX INFO: compiled from: LandingActionsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingActionsHandler$notifySections$1", f = "LandingActionsHandler.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92592p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingActionsHandler f92593q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ List<LandingSection> f92594r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(LandingActionsHandler landingActionsHandler, List<? extends LandingSection> list, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f92593q0 = landingActionsHandler;
        this.f92594r0 = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f92593q0, this.f92594r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92592p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f92593q0.f33239r0;
            this.f92592p0 = 1;
            if (channel.send(this.f92594r0, this) == coroutine_suspended) {
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
