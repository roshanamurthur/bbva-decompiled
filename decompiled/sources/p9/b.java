package p9;

import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.usecase.MarkLandingSectionAsDeletedUseCase;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingActionsHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingActionsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingActionsHandler$markAsDeleted$1", f = "LandingActionsHandler.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92589p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingActionsHandler f92590q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingMessageCardModel f92591r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LandingActionsHandler landingActionsHandler, LandingMessageCardModel landingMessageCardModel, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f92590q0 = landingActionsHandler;
        this.f92591r0 = landingMessageCardModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f92590q0, this.f92591r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92589p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MarkLandingSectionAsDeletedUseCase markLandingSectionAsDeletedUseCaseAccess$getMarkSectionAsDeletedUseCase = LandingActionsHandler.access$getMarkSectionAsDeletedUseCase(this.f92590q0);
            this.f92589p0 = 1;
            if (markLandingSectionAsDeletedUseCaseAccess$getMarkSectionAsDeletedUseCase.execute(this.f92591r0, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
