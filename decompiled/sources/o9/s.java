package o9;

import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleEmptyState$1", f = "LandingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85366p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingHeaderState f85367q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(LandingViewModel landingViewModel, LandingHeaderState landingHeaderState, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f85366p0 = landingViewModel;
        this.f85367q0 = landingHeaderState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new s(this.f85366p0, this.f85367q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LandingViewModel landingViewModel = this.f85366p0;
        LandingContract.State state = (LandingContract.State) landingViewModel.S0.getValue();
        landingViewModel.S0.setValue(new LandingContract.State.Skeleton(this.f85367q0));
        LandingContract.State.Loading loading = LandingContract.State.Loading.INSTANCE;
        if (Intrinsics.areEqual(state, loading)) {
            landingViewModel.S0.setValue(loading);
        }
        return Unit.INSTANCE;
    }
}
