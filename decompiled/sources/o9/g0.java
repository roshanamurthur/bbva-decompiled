package o9;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.landing.domain.model.LandingBiometricsParams;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
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
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$performChangeUser$1", f = "LandingViewModel.kt", i = {}, l = {LoginHelperConstants.MAINTENANCE_RESPONSE_CODE}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLandingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingViewModel.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/LandingViewModel$performChangeUser$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,594:1\n1#2:595\n*E\n"})
public final class g0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85328p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85329q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingBiometricsParams f85330r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(LandingViewModel landingViewModel, LandingBiometricsParams landingBiometricsParams, Continuation<? super g0> continuation) {
        super(2, continuation);
        this.f85329q0 = landingViewModel;
        this.f85330r0 = landingBiometricsParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g0(this.f85329q0, this.f85330r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85328p0;
        LandingViewModel landingViewModel = this.f85329q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            UserProfileConfiguration userProfileConfigurationC = landingViewModel.c();
            landingViewModel.O0 = null;
            LandingBiometricsParams landingBiometricsParams = this.f85330r0;
            landingBiometricsParams.store(userProfileConfigurationC);
            this.f85328p0 = 1;
            if (LandingViewModel.access$removeUserData(landingViewModel, landingBiometricsParams, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        landingViewModel.setIntent(LandingContract.Intent.LoadProfile.INSTANCE);
        landingViewModel.f33131u0.notifyWebChannelClick(CellsChannels.SWITCH_USER_CHANNEL);
        return Unit.INSTANCE;
    }
}
