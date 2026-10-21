package o9;

import androidx.core.view.PointerIconCompat;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomohybrid.landing.domain.model.LandingLightAccessParams;
import com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$fetchProfileConfiguration$1", f = "LandingViewModel.kt", i = {0}, l = {241, 251}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85350p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f85351q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85352r0;

    /* JADX INFO: compiled from: LandingViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$fetchProfileConfiguration$1$1", f = "LandingViewModel.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f85353p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingViewModel f85354q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f85355r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LandingViewModel landingViewModel, UserProfileConfiguration userProfileConfiguration, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f85354q0 = landingViewModel;
            this.f85355r0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f85354q0, this.f85355r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f85353p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ConfigureWebViewProfileUseCase configureWebViewProfileUseCaseAccess$getConfigureWebProfileUseCase = LandingViewModel.access$getConfigureWebProfileUseCase(this.f85354q0);
                UserType type = this.f85355r0.getType();
                this.f85353p0 = 1;
                if (configureWebViewProfileUseCaseAccess$getConfigureWebProfileUseCase.execute(type, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LandingViewModel landingViewModel, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f85352r0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        m mVar = new m(this.f85352r0, continuation);
        mVar.f85351q0 = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Object objExecute$default;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85350p0;
        LandingViewModel landingViewModel = this.f85352r0;
        if (i10 != 0) {
            if (i10 == 1) {
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f85351q0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                objExecute$default = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LandingViewModel.access$configureDeeplinkChannelObservers(landingViewModel);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        coroutineScope = (CoroutineScope) this.f85351q0;
        GetUserConfigurationUseCase getUserConfigurationUseCaseAccess$getUserConfigurationUseCase = LandingViewModel.access$getUserConfigurationUseCase(landingViewModel);
        this.f85351q0 = coroutineScope;
        this.f85350p0 = 1;
        objExecute$default = GetUserConfigurationUseCase.execute$default(getUserConfigurationUseCaseAccess$getUserConfigurationUseCase, true, false, this, 2, null);
        if (objExecute$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        UserProfileConfiguration userProfileConfiguration = (UserProfileConfiguration) objExecute$default;
        boolean zBooleanValue = LandingViewModel.access$getCheckIsDeviceIsSecureUseCase(landingViewModel).execute().booleanValue();
        LandingLightAccessParams landingLightAccessParams = new LandingLightAccessParams(userProfileConfiguration, landingViewModel.P0);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(landingViewModel, userProfileConfiguration, null), 3, null);
        if (!LandingViewModel.access$needRefreshState(landingViewModel, userProfileConfiguration, zBooleanValue)) {
            landingViewModel.R0 = LandingViewModel.access$getLightAccessUseCase(landingViewModel).execute(landingLightAccessParams).booleanValue();
            LandingViewModel.access$checkFlexibleUpdates(landingViewModel, false, landingViewModel.R0);
            LandingViewModel.access$trackAnalyticForPageView(landingViewModel, landingViewModel.R0);
            LandingViewModel.access$configureDeeplinkChannelObservers(landingViewModel);
            return Unit.INSTANCE;
        }
        LandingViewModel.access$handleEmptyState(landingViewModel, new LandingHeaderState(LandingHeaderState.Type.INSTANCE.from(landingViewModel.L0), null, null, landingViewModel.a(), null, null, null, null, null, null, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, null));
        boolean z10 = landingViewModel.R0;
        this.f85351q0 = null;
        this.f85350p0 = 2;
        if (LandingViewModel.access$updateState(landingViewModel, userProfileConfiguration, false, z10, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        LandingViewModel.access$configureDeeplinkChannelObservers(landingViewModel);
        return Unit.INSTANCE;
    }
}
