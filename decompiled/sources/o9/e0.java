package o9;

import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardModel;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleTap$4", f = "LandingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class e0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85323p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingECommerceCardModel f85324q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(LandingViewModel landingViewModel, LandingECommerceCardModel landingECommerceCardModel, Continuation<? super e0> continuation) {
        super(2, continuation);
        this.f85323p0 = landingViewModel;
        this.f85324q0 = landingECommerceCardModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e0(this.f85323p0, this.f85324q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LandingViewModel landingViewModel = this.f85323p0;
        landingViewModel.f33128r0.onTap(this.f85324q0, landingViewModel.c());
        return Unit.INSTANCE;
    }
}
