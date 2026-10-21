package o9;

import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleOpenLinkTap$2", f = "LandingViewModel.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLandingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingViewModel.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/LandingViewModel$handleOpenLinkTap$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,594:1\n1#2:595\n*E\n"})
public final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f85378q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85379r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, LandingViewModel landingViewModel, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f85378q0 = str;
        this.f85379r0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new x(this.f85378q0, this.f85379r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85377p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f85378q0;
            if (str != null) {
                LandingViewModel landingViewModel = this.f85379r0;
                LandingAnalyticsHandler landingAnalyticsHandler = landingViewModel.f33130t0;
                LandingUserSegment segment = landingViewModel.P0.getSegment();
                this.f85377p0 = 1;
                if (landingAnalyticsHandler.trackFlow(str, segment, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
