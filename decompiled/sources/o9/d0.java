package o9;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler;
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
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleTap$3", f = "LandingViewModel.kt", i = {}, l = {470}, m = "invokeSuspend", n = {}, s = {})
public final class d0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85317p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85318q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f85319r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ LandingMessageCardButtonModel f85320s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ LandingMessageCardModel f85321t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(LandingViewModel landingViewModel, String str, LandingMessageCardButtonModel landingMessageCardButtonModel, LandingMessageCardModel landingMessageCardModel, Continuation<? super d0> continuation) {
        super(2, continuation);
        this.f85318q0 = landingViewModel;
        this.f85319r0 = str;
        this.f85320s0 = landingMessageCardButtonModel;
        this.f85321t0 = landingMessageCardModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d0(this.f85318q0, this.f85319r0, this.f85320s0, this.f85321t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85317p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingViewModel landingViewModel = this.f85318q0;
            LandingUserSegment segment = landingViewModel.P0.getSegment();
            LandingAnalyticsHandler landingAnalyticsHandler = landingViewModel.f33130t0;
            String str = this.f85319r0;
            LandingMessageCardButtonModel landingMessageCardButtonModel = this.f85320s0;
            LandingMessageCardModel landingMessageCardModel = this.f85321t0;
            UserProfileConfiguration userProfileConfigurationC = landingViewModel.c();
            this.f85317p0 = 1;
            if (landingAnalyticsHandler.trackSection(str, landingMessageCardButtonModel, landingMessageCardModel, userProfileConfigurationC, segment, this) == coroutine_suspended) {
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
