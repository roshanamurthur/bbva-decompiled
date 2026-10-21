package com.bbva.glomohybrid.landing.presentation.viewmodel;

import androidx.camera.core.imagecapture.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModelKt;
import com.bbva.component.dm.biometriclogin.domain.usecase.GetIsBiometricAccessEnabledUseCase;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.base.usecase.UseCaseConstants;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.domain.model.LandingBiometricsParams;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderModel;
import com.bbva.glomohybrid.landing.domain.model.LandingLightAccessParams;
import com.bbva.glomohybrid.landing.domain.model.LandingRequestHeaderParams;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomohybrid.landing.domain.usecase.CheckIsDeviceSecureUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.CheckMobilePaymentEnabledUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingAccessStateUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingSectionsDataUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.LightAccessUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.extensions.UserProfileExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomohybrid.landing.presentation.model.LandingLink;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingActionsHandler;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingClickDispatcher;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o9.a0;
import o9.b0;
import o9.c0;
import o9.d0;
import o9.e0;
import o9.f0;
import o9.g0;
import o9.h0;
import o9.i0;
import o9.j0;
import o9.o;
import o9.p;
import o9.q;
import o9.r;
import o9.s;
import o9.t;
import o9.u;
import o9.v;
import o9.w;
import o9.x;
import o9.y;
import o9.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B7\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/LandingViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "intent", "", "setIntent", "cleanDeeplinkObservers", "", "v0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State;", "T0", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "V0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler;", "accessesHandler", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingActionsHandler;", "actionsHandler", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAnalyticsHandler;", "analyticsHandler", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingClickDispatcher;", "clickEventDispatcher", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler;Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingActionsHandler;Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAnalyticsHandler;Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingClickDispatcher;)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingViewModel.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/LandingViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n56#2,6:595\n56#2,6:601\n56#2,6:607\n56#2,6:613\n56#2,6:619\n56#2,6:625\n56#2,6:635\n56#2,6:641\n56#2,6:647\n41#2,6:653\n47#2:660\n41#2,6:662\n47#2:669\n29#3,4:631\n45#3:671\n133#4:659\n133#4:668\n158#4:673\n107#5:661\n107#5:670\n120#5:672\n1#6:674\n1855#7,2:675\n*S KotlinDebug\n*F\n+ 1 LandingViewModel.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/LandingViewModel\n*L\n83#1:595,6\n85#1:601,6\n89#1:607,6\n93#1:613,6\n97#1:619,6\n101#1:625,6\n109#1:635,6\n125#1:641,6\n129#1:647,6\n114#1:653,6\n114#1:660\n117#1:662,6\n117#1:669\n105#1:631,4\n120#1:671\n114#1:659\n117#1:668\n120#1:673\n114#1:661\n117#1:670\n120#1:672\n586#1:675,2\n*E\n"})
public final class LandingViewModel extends BaseViewModel {

    @NotNull
    public static final String ID = "landing_view_model";

    @NotNull
    public final Lazy E0;

    @NotNull
    public final Lazy F0;

    @NotNull
    public final Lazy G0;

    @NotNull
    public final Lazy H0;

    @NotNull
    public final Lazy I0;

    @NotNull
    public final Lazy J0;

    @NotNull
    public final Lazy K0;

    @NotNull
    public final LandingAppAccess L0;
    public boolean M0;
    public boolean N0;

    @Nullable
    public UserProfileConfiguration O0;

    @NotNull
    public LandingHeaderState P0;

    @Nullable
    public List<? extends LandingSection> Q0;
    public boolean R0;

    @NotNull
    public final MutableStateFlow<LandingContract.State> S0;

    @NotNull
    public final MutableStateFlow T0;

    @NotNull
    public final Channel<LandingContract.Event> U0;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @NotNull
    public final Flow<LandingContract.Event> events;

    @NotNull
    public final ArrayList W0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f33127q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LandingAccessesHandler f33128r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final LandingActionsHandler f33129s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final LandingAnalyticsHandler f33130t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final LandingClickDispatcher f33131u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f33132w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f33133x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f33134y0;

    /* JADX INFO: compiled from: LandingViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$1", f = "LandingViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33135p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33135p0;
            LandingViewModel landingViewModel = LandingViewModel.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GetUserConfigurationUseCase getUserConfigurationUseCaseAccess$getUserConfigurationUseCase = LandingViewModel.access$getUserConfigurationUseCase(landingViewModel);
                this.f33135p0 = 1;
                obj = getUserConfigurationUseCaseAccess$getUserConfigurationUseCase.execute(true, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UserProfileConfiguration userProfileConfiguration = (UserProfileConfiguration) obj;
            landingViewModel.R0 = LandingViewModel.access$getLightAccessUseCase(landingViewModel).execute(new LandingLightAccessParams(userProfileConfiguration, landingViewModel.P0)).booleanValue();
            if (landingViewModel.R0) {
                LandingViewModel.access$skipLanding(landingViewModel, userProfileConfiguration);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class c extends Lambda implements Function0<ParametersHolder> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class d extends Lambda implements Function0<ParametersHolder> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class e extends Lambda implements Function0<ParametersHolder> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class f extends Lambda implements Function0<ParametersHolder> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel", f = "LandingViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3}, l = {312, TypedValues.AttributesType.TYPE_PATH_ROTATE, 319, 320}, m = "fetchStateBy", n = {"this", Scopes.PROFILE, "fromProfileChange", "lightAccessEnabled", "this", Scopes.PROFILE, "headerData", "fromProfileChange", "lightAccessEnabled", "this", "sectionsData", "fromProfileChange", "lightAccessEnabled", "this", "fromProfileChange", "lightAccessEnabled"}, s = {"L$0", "L$1", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "Z$0", "Z$1", "L$0", "Z$0", "Z$1"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingViewModel f33142p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f33143q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f33144r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public UserProfileConfiguration f33145s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f33146t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f33147u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f33149x0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f33149x0 |= Integer.MIN_VALUE;
            return LandingViewModel.this.b(null, false, false, this);
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class h extends Lambda implements Function0<ParametersHolder> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleEnterpriseLogin$1", f = "LandingViewModel.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33151p0;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33151p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ConfigureWebViewProfileUseCase configureWebViewProfileUseCaseAccess$getConfigureWebProfileUseCase = LandingViewModel.access$getConfigureWebProfileUseCase(LandingViewModel.this);
                UserType userType = UserType.ENTERPRISE;
                this.f33151p0 = 1;
                if (configureWebViewProfileUseCaseAccess$getConfigureWebProfileUseCase.execute(userType, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: LandingViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleEnterpriseLogin$2", f = "LandingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingViewModel landingViewModel = LandingViewModel.this;
            landingViewModel.f33128r0.openLogin(UserProfileConfiguration.copy$default(landingViewModel.c(), null, UserType.ENTERPRISE, 1, null), true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class k extends Lambda implements Function0<ParametersHolder> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: LandingViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$observeDeeplinkChannel$1", f = "LandingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l<E> extends SuspendLambda implements Function2<E, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33155p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<E, LandingContract.Intent.Notification> f33157r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f33158s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow<E> f33159t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Function1<? super E, LandingContract.Intent.Notification> function1, boolean z10, MutableSharedFlow<E> mutableSharedFlow, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f33157r0 = function1;
            this.f33158s0 = z10;
            this.f33159t0 = mutableSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = LandingViewModel.this.new l(this.f33157r0, this.f33158s0, this.f33159t0, continuation);
            lVar.f33155p0 = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((l) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingViewModel.this.e(this.f33157r0.invoke((E) this.f33155p0));
            if (this.f33158s0) {
                this.f33159t0.resetReplayCache();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: LandingViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$observeDeeplinkChannel$2", f = "LandingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m<E> extends SuspendLambda implements Function3<FlowCollector<? super E>, Throwable, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Throwable f33160p0;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Throwable th2, Continuation<? super Unit> continuation) {
            m mVar = new m(3, continuation);
            mVar.f33160p0 = th2;
            return mVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LoggerKt.logError$default("[LandingViewModel]: Error receiving deeplink", this.f33160p0, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LandingViewModel.kt */
    public static final class n extends Lambda implements Function0<ParametersHolder> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LandingViewModel.this.f33127q0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ LandingViewModel(ViewModelComponentsProviders viewModelComponentsProviders, LandingAccessesHandler landingAccessesHandler, LandingActionsHandler landingActionsHandler, LandingAnalyticsHandler landingAnalyticsHandler, LandingClickDispatcher landingClickDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new LandingAccessesHandler(viewModelComponentsProviders) : landingAccessesHandler, (i10 & 4) != 0 ? new LandingActionsHandler(viewModelComponentsProviders) : landingActionsHandler, (i10 & 8) != 0 ? new LandingAnalyticsHandler(viewModelComponentsProviders, null, 2, 0 == true ? 1 : 0) : landingAnalyticsHandler, (i10 & 16) != 0 ? new LandingClickDispatcher(viewModelComponentsProviders) : landingClickDispatcher);
    }

    public static final void access$checkFlexibleUpdates(LandingViewModel landingViewModel, boolean z10, boolean z11) {
        landingViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel), null, null, new o9.a(z10, landingViewModel, z11, null), 3, null);
    }

    public static final void access$configureDeeplinkChannelObservers(LandingViewModel landingViewModel) {
        landingViewModel.getClass();
        CellsDeepLinkChannels cellsDeepLinkChannels = CellsDeepLinkChannels.INSTANCE;
        landingViewModel.g(cellsDeepLinkChannels.getDeepLinkManager(), false, o9.d.f85316p0);
        landingViewModel.g(cellsDeepLinkChannels.getQrLinkChannel(), true, o9.e.f85322p0);
        landingViewModel.g(cellsDeepLinkChannels.getGoogleAssistantActionChannel(), false, o9.f.f85325p0);
        landingViewModel.g(cellsDeepLinkChannels.getDeepLinkToMgm(), true, o9.g.f85327p0);
        landingViewModel.g(cellsDeepLinkChannels.getDeepLinkToAtm(), true, o9.h.f85331p0);
        landingViewModel.g(cellsDeepLinkChannels.getDeepLinkManagerPublic(), true, o9.i.f85336p0);
        landingViewModel.g(cellsDeepLinkChannels.getQrLinkNavigationChannel(), true, o9.j.f85340p0);
        FlowKt.launchIn(FlowKt.onEach(cellsDeepLinkChannels.getPrivateShortcutChannel(), new o9.k(landingViewModel, null)), ViewModelKt.getViewModelScope(landingViewModel));
    }

    public static final ChangeUserBehavior access$getChangeUserModalBehavior(LandingViewModel landingViewModel) {
        return (ChangeUserBehavior) landingViewModel.K0.getValue();
    }

    public static final CheckIsDeviceSecureUseCase access$getCheckIsDeviceIsSecureUseCase(LandingViewModel landingViewModel) {
        return (CheckIsDeviceSecureUseCase) landingViewModel.G0.getValue();
    }

    public static final CheckForFlexibleUpdateUseCase access$getCheckUpdateUseCase(LandingViewModel landingViewModel) {
        return (CheckForFlexibleUpdateUseCase) landingViewModel.H0.getValue();
    }

    public static final ConfigureWebViewProfileUseCase access$getConfigureWebProfileUseCase(LandingViewModel landingViewModel) {
        return (ConfigureWebViewProfileUseCase) landingViewModel.E0.getValue();
    }

    public static final LightAccessUseCase access$getLightAccessUseCase(LandingViewModel landingViewModel) {
        return (LightAccessUseCase) landingViewModel.f33134y0.getValue();
    }

    public static final GetUserConfigurationUseCase access$getUserConfigurationUseCase(LandingViewModel landingViewModel) {
        return (GetUserConfigurationUseCase) landingViewModel.f33132w0.getValue();
    }

    public static final void access$handleEmptyState(LandingViewModel landingViewModel, LandingHeaderState landingHeaderState) {
        landingViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel), null, null, new s(landingViewModel, landingHeaderState, null), 3, null);
    }

    public static final void access$handleShortcut(LandingViewModel landingViewModel, LandingContract.Intent.Shortcut shortcut) {
        landingViewModel.getClass();
        boolean needLogin = shortcut.getNeedLogin();
        ShortcutModel shortcut2 = shortcut.getShortcut();
        String route = shortcut.getRoute();
        Object payload = shortcut.getCom.bbva.notifications.model.constants.BanxicoConstants.KEY_HISTORICAL_PAYLOAD java.lang.String();
        LandingAccessesHandler landingAccessesHandler = landingViewModel.f33128r0;
        if (needLogin) {
            landingAccessesHandler.openLogin(landingViewModel.c(), false);
        } else {
            landingAccessesHandler.onShortcut(route, payload, shortcut2);
        }
    }

    public static final void access$handleWebAccessState(LandingViewModel landingViewModel, LandingAccessesHandler.AccessesState accessesState) {
        landingViewModel.getClass();
        boolean zAreEqual = Intrinsics.areEqual(accessesState, LandingAccessesHandler.AccessesState.NotAvailable.INSTANCE);
        MutableStateFlow<LandingContract.State> mutableStateFlow = landingViewModel.S0;
        if (zAreEqual) {
            mutableStateFlow.setValue(LandingContract.State.Loading.INSTANCE);
        } else if (Intrinsics.areEqual(accessesState, LandingAccessesHandler.AccessesState.Ready.INSTANCE)) {
            landingViewModel.f(landingViewModel.P0, landingViewModel.Q0, mutableStateFlow.getValue() instanceof LandingContract.State.Loading);
        }
    }

    public static final boolean access$needRefreshState(LandingViewModel landingViewModel, UserProfileConfiguration userProfileConfiguration, boolean z10) {
        boolean zBooleanValue;
        Boolean boolValueOf = Boolean.valueOf(landingViewModel.O0 == null || !Intrinsics.areEqual(landingViewModel.c().getRememberedUser(), userProfileConfiguration.getRememberedUser()));
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            boolValueOf.booleanValue();
            landingViewModel.O0 = userProfileConfiguration;
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean z11 = z10 != landingViewModel.M0;
        landingViewModel.M0 = z10;
        return zBooleanValue || z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$removeUserData(LandingViewModel landingViewModel, LandingBiometricsParams landingBiometricsParams, Continuation continuation) {
        h0 h0Var;
        landingViewModel.getClass();
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i10 = h0Var.f85335s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f85335s0 = i10 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(landingViewModel, continuation);
            }
        } else {
            h0Var = new h0(landingViewModel, continuation);
        }
        Object obj = h0Var.f85333q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = h0Var.f85335s0;
        if (i11 != 0) {
            if (i11 == 1) {
                landingViewModel = h0Var.f85332p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        RemoveUserDataUseCase removeUserDataUseCase = (RemoveUserDataUseCase) landingViewModel.f33133x0.getValue();
        h0Var.f85332p0 = landingViewModel;
        h0Var.f85335s0 = 1;
        if (removeUserDataUseCase.execute(landingBiometricsParams, (Continuation<? super Unit>) h0Var) == coroutine_suspended) {
            return coroutine_suspended;
        }
        ConfigureWebViewProfileUseCase configureWebViewProfileUseCase = (ConfigureWebViewProfileUseCase) landingViewModel.E0.getValue();
        UserType userType = UserType.PERSONAL;
        h0Var.f85332p0 = null;
        h0Var.f85335s0 = 2;
        if (configureWebViewProfileUseCase.execute(userType, (Continuation<? super Unit>) h0Var) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public static final void access$skipLanding(LandingViewModel landingViewModel, UserProfileConfiguration userProfileConfiguration) {
        landingViewModel.f33128r0.openLogin(userProfileConfiguration, false);
    }

    public static final void access$trackAnalyticForPageView(LandingViewModel landingViewModel, boolean z10) {
        landingViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel), null, null, new i0(z10, landingViewModel, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$updateState(LandingViewModel landingViewModel, UserProfileConfiguration userProfileConfiguration, boolean z10, boolean z11, Continuation continuation) {
        j0 j0Var;
        UserProfileConfiguration userProfileConfigurationC;
        LandingViewModel landingViewModel2;
        UserProfileConfiguration userProfileConfiguration2;
        landingViewModel.getClass();
        if (continuation instanceof j0) {
            j0Var = (j0) continuation;
            int i10 = j0Var.f85347w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j0Var.f85347w0 = i10 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(landingViewModel, continuation);
            }
        } else {
            j0Var = new j0(landingViewModel, continuation);
        }
        Object obj = j0Var.f85346u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = j0Var.f85347w0;
        boolean z12 = false;
        if (i11 != 0) {
            if (i11 == 1) {
                z11 = j0Var.f85345t0;
                z10 = j0Var.f85344s0;
                userProfileConfiguration2 = j0Var.f85343r0;
                userProfileConfiguration = j0Var.f85342q0;
                landingViewModel2 = j0Var.f85341p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        userProfileConfigurationC = landingViewModel.c();
        SuspendUseCase suspendUseCase = (SuspendUseCase) androidx.camera.core.impl.utils.c.f(landingViewModel.f33127q0).getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new o(landingViewModel));
        if (suspendUseCase != null) {
            j0Var.f85341p0 = landingViewModel;
            j0Var.f85342q0 = userProfileConfiguration;
            j0Var.f85343r0 = userProfileConfigurationC;
            j0Var.f85344s0 = z10;
            j0Var.f85345t0 = z11;
            j0Var.f85347w0 = 1;
            Object objExecute = suspendUseCase.execute(j0Var);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingViewModel2 = landingViewModel;
            userProfileConfiguration2 = userProfileConfigurationC;
            obj = objExecute;
        }
        userProfileConfigurationC.setDigitalTokenEnabled(z12);
        landingViewModel.c().setMobilePaymentEnabled(((CheckMobilePaymentEnabledUseCase) landingViewModel.J0.getValue()).execute().booleanValue());
        j0Var.f85341p0 = null;
        j0Var.f85342q0 = null;
        j0Var.f85343r0 = null;
        j0Var.f85347w0 = 2;
        if (landingViewModel.b(userProfileConfiguration, z10, z11, j0Var) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        if (((Boolean) obj).booleanValue()) {
            userProfileConfigurationC = userProfileConfiguration2;
            landingViewModel = landingViewModel2;
            z12 = true;
        } else {
            userProfileConfigurationC = userProfileConfiguration2;
            landingViewModel = landingViewModel2;
        }
        userProfileConfigurationC.setDigitalTokenEnabled(z12);
        landingViewModel.c().setMobilePaymentEnabled(((CheckMobilePaymentEnabledUseCase) landingViewModel.J0.getValue()).execute().booleanValue());
        j0Var.f85341p0 = null;
        j0Var.f85342q0 = null;
        j0Var.f85343r0 = null;
        j0Var.f85347w0 = 2;
        if (landingViewModel.b(userProfileConfiguration, z10, z11, j0Var) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final LandingHeaderState.AccessType a() {
        return LandingHeaderState.AccessType.INSTANCE.fromBiometricAvailability(((GetIsBiometricAccessEnabledUseCase) this.F0.getValue()).execute().booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x017a  */
    /* JADX WARN: Code duplicated, block: B:50:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x018f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0195  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(UserProfileConfiguration userProfileConfiguration, boolean z10, boolean z11, Continuation<? super Unit> continuation) {
        g gVar;
        boolean z12;
        LandingViewModel landingViewModel;
        Deferred deferred;
        Deferred deferred2;
        UserProfileConfiguration userProfileConfiguration2;
        Deferred deferred3;
        UserProfileConfiguration userProfileConfiguration3;
        boolean z13;
        UserProfileConfiguration userProfileConfiguration4;
        LandingViewModel landingViewModel2;
        boolean z14;
        List<? extends LandingSection> list;
        LandingViewModel landingViewModel3;
        LandingViewModel landingViewModel4;
        UserProfileConfiguration userProfileConfiguration5 = userProfileConfiguration;
        boolean z15 = z10;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f33149x0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f33149x0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objExecuteAsync = gVar.v0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f33149x0;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z16 = gVar.f33147u0;
                z15 = gVar.f33146t0;
                UserProfileConfiguration userProfileConfiguration6 = (UserProfileConfiguration) gVar.f33143q0;
                landingViewModel = gVar.f33142p0;
                ResultKt.throwOnFailure(objExecuteAsync);
                z12 = z16;
                userProfileConfiguration5 = userProfileConfiguration6;
            } else {
                if (i11 == 2) {
                    z13 = gVar.f33147u0;
                    z15 = gVar.f33146t0;
                    deferred = (Deferred) gVar.f33144r0;
                    userProfileConfiguration3 = (UserProfileConfiguration) gVar.f33143q0;
                    landingViewModel = gVar.f33142p0;
                    ResultKt.throwOnFailure(objExecuteAsync);
                    z12 = z13;
                    deferred3 = deferred;
                    userProfileConfiguration2 = userProfileConfiguration3;
                    deferred2 = (Deferred) objExecuteAsync;
                    gVar.f33142p0 = landingViewModel;
                    gVar.f33143q0 = deferred2;
                    gVar.f33144r0 = landingViewModel;
                    gVar.f33145s0 = userProfileConfiguration2;
                    gVar.f33146t0 = z15;
                    gVar.f33147u0 = z12;
                    gVar.f33149x0 = 3;
                    objExecuteAsync = deferred3.await(gVar);
                    if (objExecuteAsync == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    userProfileConfiguration4 = userProfileConfiguration2;
                    landingViewModel2 = landingViewModel;
                    z14 = z12;
                    LandingHeaderModel landingHeaderModel = (LandingHeaderModel) objExecuteAsync;
                    landingViewModel2.getClass();
                    LandingHeaderState.Type.Companion companion = LandingHeaderState.Type.INSTANCE;
                    LandingAppAccess landingAppAccess = landingViewModel2.L0;
                    landingViewModel2.P0 = new LandingHeaderState(companion.from(landingAppAccess), userProfileConfiguration4, landingHeaderModel.getSegment(), landingViewModel2.a(), landingHeaderModel.getAvatar(), landingHeaderModel.getShortcuts(), landingHeaderModel.getBackground(), landingHeaderModel.getMessage(), UserProfileExtensionsKt.getMenuConfiguration(userProfileConfiguration4, landingAppAccess), landingHeaderModel.getFeatures());
                    if (deferred2 != null) {
                        gVar.f33142p0 = landingViewModel;
                        gVar.f33143q0 = landingViewModel;
                        gVar.f33144r0 = null;
                        gVar.f33145s0 = null;
                        gVar.f33146t0 = z15;
                        gVar.f33147u0 = z14;
                        gVar.f33149x0 = 4;
                        objExecuteAsync = deferred2.await(gVar);
                        if (objExecuteAsync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        landingViewModel3 = landingViewModel;
                        landingViewModel4 = landingViewModel3;
                    } else {
                        list = null;
                        landingViewModel3 = landingViewModel;
                    }
                    landingViewModel.Q0 = list;
                    landingViewModel3.f(landingViewModel3.P0, landingViewModel3.Q0, false);
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new o9.a(z15, landingViewModel3, z14, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new i0(z14, landingViewModel3, null), 3, null);
                    return Unit.INSTANCE;
                }
                if (i11 == 3) {
                    z14 = gVar.f33147u0;
                    z15 = gVar.f33146t0;
                    UserProfileConfiguration userProfileConfiguration7 = gVar.f33145s0;
                    landingViewModel2 = (LandingViewModel) gVar.f33144r0;
                    deferred2 = (Deferred) gVar.f33143q0;
                    landingViewModel = gVar.f33142p0;
                    ResultKt.throwOnFailure(objExecuteAsync);
                    userProfileConfiguration4 = userProfileConfiguration7;
                    LandingHeaderModel landingHeaderModel2 = (LandingHeaderModel) objExecuteAsync;
                    landingViewModel2.getClass();
                    LandingHeaderState.Type.Companion companion2 = LandingHeaderState.Type.INSTANCE;
                    LandingAppAccess landingAppAccess2 = landingViewModel2.L0;
                    landingViewModel2.P0 = new LandingHeaderState(companion2.from(landingAppAccess2), userProfileConfiguration4, landingHeaderModel2.getSegment(), landingViewModel2.a(), landingHeaderModel2.getAvatar(), landingHeaderModel2.getShortcuts(), landingHeaderModel2.getBackground(), landingHeaderModel2.getMessage(), UserProfileExtensionsKt.getMenuConfiguration(userProfileConfiguration4, landingAppAccess2), landingHeaderModel2.getFeatures());
                    if (deferred2 != null) {
                        gVar.f33142p0 = landingViewModel;
                        gVar.f33143q0 = landingViewModel;
                        gVar.f33144r0 = null;
                        gVar.f33145s0 = null;
                        gVar.f33146t0 = z15;
                        gVar.f33147u0 = z14;
                        gVar.f33149x0 = 4;
                        objExecuteAsync = deferred2.await(gVar);
                        if (objExecuteAsync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        landingViewModel3 = landingViewModel;
                        landingViewModel4 = landingViewModel3;
                    } else {
                        list = null;
                        landingViewModel3 = landingViewModel;
                    }
                    landingViewModel.Q0 = list;
                    landingViewModel3.f(landingViewModel3.P0, landingViewModel3.Q0, false);
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new o9.a(z15, landingViewModel3, z14, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new i0(z14, landingViewModel3, null), 3, null);
                    return Unit.INSTANCE;
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z14 = gVar.f33147u0;
                z15 = gVar.f33146t0;
                landingViewModel4 = (LandingViewModel) gVar.f33143q0;
                landingViewModel3 = gVar.f33142p0;
                ResultKt.throwOnFailure(objExecuteAsync);
            }
            list = (List) objExecuteAsync;
            landingViewModel = landingViewModel4;
            landingViewModel.Q0 = list;
            landingViewModel3.f(landingViewModel3.P0, landingViewModel3.Q0, false);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new o9.a(z15, landingViewModel3, z14, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new i0(z14, landingViewModel3, null), 3, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objExecuteAsync);
        o9.l lVar = new o9.l(this);
        ViewModelComponentsProviders viewModelComponentsProviders = this.f33127q0;
        FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase = (FetchLandingHeaderDataUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(FetchLandingHeaderDataUseCase.class), null, lVar);
        LandingRequestHeaderParams landingRequestHeaderParams = new LandingRequestHeaderParams(this.L0, userProfileConfiguration5, z15);
        gVar.f33142p0 = this;
        gVar.f33143q0 = userProfileConfiguration5;
        gVar.f33146t0 = z15;
        z12 = z11;
        gVar.f33147u0 = z12;
        gVar.f33149x0 = 1;
        objExecuteAsync = fetchLandingHeaderDataUseCase.executeAsync(landingRequestHeaderParams, gVar);
        if (objExecuteAsync == coroutine_suspended) {
            return coroutine_suspended;
        }
        landingViewModel = this;
        deferred = (Deferred) objExecuteAsync;
        if (Intrinsics.areEqual(landingViewModel.L0, LandingAppAccess.Available.INSTANCE)) {
            o9.n nVar = new o9.n(landingViewModel);
            ViewModelComponentsProviders viewModelComponentsProviders2 = landingViewModel.f33127q0;
            FetchLandingSectionsDataUseCase fetchLandingSectionsDataUseCase = (FetchLandingSectionsDataUseCase) (viewModelComponentsProviders2 instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders2).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders2)).get(Reflection.getOrCreateKotlinClass(FetchLandingSectionsDataUseCase.class), null, nVar);
            gVar.f33142p0 = landingViewModel;
            gVar.f33143q0 = userProfileConfiguration5;
            gVar.f33144r0 = deferred;
            gVar.f33146t0 = z15;
            gVar.f33147u0 = z12;
            gVar.f33149x0 = 2;
            objExecuteAsync = fetchLandingSectionsDataUseCase.executeAsync(userProfileConfiguration5, gVar);
            if (objExecuteAsync == coroutine_suspended) {
                return coroutine_suspended;
            }
            userProfileConfiguration3 = userProfileConfiguration5;
            z13 = z12;
            z12 = z13;
            deferred3 = deferred;
            userProfileConfiguration2 = userProfileConfiguration3;
            deferred2 = (Deferred) objExecuteAsync;
        } else {
            deferred2 = null;
            userProfileConfiguration2 = userProfileConfiguration5;
            deferred3 = deferred;
        }
        gVar.f33142p0 = landingViewModel;
        gVar.f33143q0 = deferred2;
        gVar.f33144r0 = landingViewModel;
        gVar.f33145s0 = userProfileConfiguration2;
        gVar.f33146t0 = z15;
        gVar.f33147u0 = z12;
        gVar.f33149x0 = 3;
        objExecuteAsync = deferred3.await(gVar);
        if (objExecuteAsync == coroutine_suspended) {
            return coroutine_suspended;
        }
        userProfileConfiguration4 = userProfileConfiguration2;
        landingViewModel2 = landingViewModel;
        z14 = z12;
        LandingHeaderModel landingHeaderModel3 = (LandingHeaderModel) objExecuteAsync;
        landingViewModel2.getClass();
        LandingHeaderState.Type.Companion companion3 = LandingHeaderState.Type.INSTANCE;
        LandingAppAccess landingAppAccess3 = landingViewModel2.L0;
        landingViewModel2.P0 = new LandingHeaderState(companion3.from(landingAppAccess3), userProfileConfiguration4, landingHeaderModel3.getSegment(), landingViewModel2.a(), landingHeaderModel3.getAvatar(), landingHeaderModel3.getShortcuts(), landingHeaderModel3.getBackground(), landingHeaderModel3.getMessage(), UserProfileExtensionsKt.getMenuConfiguration(userProfileConfiguration4, landingAppAccess3), landingHeaderModel3.getFeatures());
        if (deferred2 != null) {
            gVar.f33142p0 = landingViewModel;
            gVar.f33143q0 = landingViewModel;
            gVar.f33144r0 = null;
            gVar.f33145s0 = null;
            gVar.f33146t0 = z15;
            gVar.f33147u0 = z14;
            gVar.f33149x0 = 4;
            objExecuteAsync = deferred2.await(gVar);
            if (objExecuteAsync == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingViewModel3 = landingViewModel;
            landingViewModel4 = landingViewModel3;
            list = (List) objExecuteAsync;
            landingViewModel = landingViewModel4;
        } else {
            list = null;
            landingViewModel3 = landingViewModel;
        }
        landingViewModel.Q0 = list;
        landingViewModel3.f(landingViewModel3.P0, landingViewModel3.Q0, false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new o9.a(z15, landingViewModel3, z14, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(landingViewModel3), null, null, new i0(z14, landingViewModel3, null), 3, null);
        return Unit.INSTANCE;
    }

    public final UserProfileConfiguration c() {
        UserProfileConfiguration userProfileConfiguration = this.O0;
        return userProfileConfiguration == null ? new UserProfileConfiguration(null, null, 3, null) : userProfileConfiguration;
    }

    public final void cleanDeeplinkObservers() {
        ArrayList<Job> arrayList = this.W0;
        for (Job job : arrayList) {
            if (job.isActive()) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
        arrayList.clear();
    }

    public final void d() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j(null), 3, null);
    }

    public final void e(LandingContract.Intent.Notification notification) {
        boolean needLogin = notification.getNeedLogin();
        DeepLinkModel deepLink = notification.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.DEEP_LINK java.lang.String();
        String route = notification.getRoute();
        Object payload = notification.getCom.bbva.notifications.model.constants.BanxicoConstants.KEY_HISTORICAL_PAYLOAD java.lang.String();
        LandingAccessesHandler landingAccessesHandler = this.f33128r0;
        if (!needLogin) {
            landingAccessesHandler.onNotification(route, payload, deepLink);
            return;
        }
        DeepLinkModel deepLink2 = notification.getDeepLink();
        if (deepLink2 == null || !DeepLinkExtensionsKt.isGemaLink(deepLink2)) {
            landingAccessesHandler.openLogin(c(), false);
        } else {
            d();
        }
    }

    public final void f(LandingHeaderState landingHeaderState, List<? extends LandingSection> list, boolean z10) {
        MutableStateFlow<LandingContract.State> mutableStateFlow = this.S0;
        LandingContract.State value = mutableStateFlow.getValue();
        if (landingHeaderState.isNotEmpty()) {
            mutableStateFlow.setValue(new LandingContract.State.Ready(landingHeaderState, list));
        }
        if (z10 || !(value instanceof LandingContract.State.Loading)) {
            return;
        }
        mutableStateFlow.setValue(LandingContract.State.Loading.INSTANCE);
    }

    public final <E> void g(MutableSharedFlow<E> mutableSharedFlow, boolean z10, Function1<? super E, LandingContract.Intent.Notification> function1) {
        this.W0.add(FlowKt.launchIn(FlowKt.m5982catch(FlowKt.onEach(mutableSharedFlow, new l(function1, z10, mutableSharedFlow, null)), new m(3, null)), ViewModelKt.getViewModelScope(this)));
    }

    @NotNull
    public final Flow<LandingContract.Event> getEvents() {
        return this.events;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final StateFlow<LandingContract.State> getState() {
        return this.T0;
    }

    public final void setIntent(@NotNull LandingContract.Intent intent) {
        LandingSection landingSection;
        Object next;
        LandingMessageCardButtonModel landingMessageCardButtonModel;
        String navigationType;
        LandingMessageCardButtonModel landingMessageCardButtonModel2;
        Object next2;
        Object next3;
        LandingShortcutItemModel landingShortcutItemModel;
        Object next4;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent, LandingContract.Intent.LoadProfile.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new o9.m(this, null), 3, null);
            return;
        }
        if (intent instanceof LandingContract.Intent.ChangeUserTap) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new q(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new r(this, null), 3, null);
            return;
        }
        if (intent instanceof LandingContract.Intent.PerformChangeUser) {
            LandingBiometricsParams params = ((LandingContract.Intent.PerformChangeUser) intent).getParams();
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new s(this, new LandingHeaderState(LandingHeaderState.Type.Enabled.INSTANCE, null, null, null, null, null, null, null, null, null, 1022, null), null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g0(this, params, null), 3, null);
            return;
        }
        if (intent instanceof LandingContract.Intent.ShortcutItemTap) {
            String id = ((LandingContract.Intent.ShortcutItemTap) intent).getId();
            List<LandingShortcutItemModel> shortcuts = this.P0.getShortcuts();
            if (shortcuts != null) {
                Iterator<T> it = shortcuts.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (!Intrinsics.areEqual(((LandingShortcutItemModel) next4).getRoute(), id));
                landingShortcutItemModel = (LandingShortcutItemModel) next4;
            } else {
                landingShortcutItemModel = null;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y(this, landingShortcutItemModel, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z(this, landingShortcutItemModel, null), 3, null);
            return;
        }
        if (intent instanceof LandingContract.Intent.SnackBarReceived) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a0(this, ((LandingContract.Intent.SnackBarReceived) intent).getConfig(), null), 3, null);
            return;
        }
        if (intent instanceof LandingContract.Intent.MenuItemTap) {
            LandingContract.Intent.MenuItemTap menuItemTap = (LandingContract.Intent.MenuItemTap) intent;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new t(this, menuItemTap, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new u(this, menuItemTap, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new v(this, menuItemTap, null), 3, null);
            return;
        }
        if (intent instanceof LandingContract.Intent.EnterpriseLogin) {
            d();
            return;
        }
        if (intent instanceof LandingContract.Intent.Notification) {
            e((LandingContract.Intent.Notification) intent);
            return;
        }
        boolean z10 = intent instanceof LandingContract.Intent.Shortcut;
        LandingAccessesHandler landingAccessesHandler = this.f33128r0;
        if (z10) {
            LandingContract.Intent.Shortcut shortcut = (LandingContract.Intent.Shortcut) intent;
            boolean needLogin = shortcut.getNeedLogin();
            ShortcutModel shortcut2 = shortcut.getShortcut();
            String route = shortcut.getRoute();
            Object payload = shortcut.getCom.bbva.notifications.model.constants.BanxicoConstants.KEY_HISTORICAL_PAYLOAD java.lang.String();
            if (needLogin) {
                landingAccessesHandler.openLogin(c(), false);
                return;
            } else {
                landingAccessesHandler.onShortcut(route, payload, shortcut2);
                return;
            }
        }
        if (!(intent instanceof LandingContract.Intent.SectionItemTap)) {
            if (intent instanceof LandingContract.Intent.OpenLink) {
                LandingContract.Intent.OpenLink openLink = (LandingContract.Intent.OpenLink) intent;
                LandingLink link = openLink.getCom.google.firebase.dynamiclinks.DynamicLink.Builder.KEY_LINK java.lang.String();
                String analyticsFlow = openLink.getAnalyticsFlow();
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new w(this, link, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new x(analyticsFlow, this, null), 3, null);
                return;
            }
            if (intent instanceof LandingContract.Intent.UpdateApp) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new p((LandingContract.Intent.UpdateApp) intent, this, null), 3, null);
                return;
            }
            if (intent instanceof LandingContract.Intent.LoginButtonTap) {
                landingAccessesHandler.openLogin(c(), true);
                return;
            } else if (intent instanceof LandingContract.Intent.CancelPendingNavigation) {
                landingAccessesHandler.cancelPendingNavigation();
                return;
            } else {
                if (intent instanceof LandingContract.Intent.ResumePendingNavigation) {
                    landingAccessesHandler.attemptPendingNavigation();
                    return;
                }
                return;
            }
        }
        LandingContract.Intent.SectionItemTap sectionItemTap = (LandingContract.Intent.SectionItemTap) intent;
        String id2 = sectionItemTap.getId();
        String param = sectionItemTap.getParam();
        List<? extends LandingSection> list = this.Q0;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!Intrinsics.areEqual(((LandingSection) next3).getId(), id2));
            landingSection = (LandingSection) next3;
        } else {
            landingSection = null;
        }
        if (!(landingSection instanceof LandingMessageCardModel)) {
            if (landingSection instanceof LandingECommerceCardsModel) {
                Iterator<T> it3 = ((LandingECommerceCardsModel) landingSection).getItems().iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.areEqual(((LandingECommerceCardModel) next).getId(), param));
                LandingECommerceCardModel landingECommerceCardModel = (LandingECommerceCardModel) next;
                if (landingECommerceCardModel == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e0(this, landingECommerceCardModel, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f0(this, null), 3, null);
                return;
            }
            return;
        }
        LandingMessageCardModel landingMessageCardModel = (LandingMessageCardModel) landingSection;
        LandingMessageCardButtonModel link2 = landingMessageCardModel.getLink();
        if (!Intrinsics.areEqual(link2 != null ? link2.getAction() : null, param)) {
            link2 = null;
        }
        if (link2 == null) {
            List<LandingMessageCardButtonModel> buttons = landingMessageCardModel.getButtons();
            if (buttons != null) {
                Iterator<T> it4 = buttons.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (!Intrinsics.areEqual(((LandingMessageCardButtonModel) next2).getAction(), param));
                landingMessageCardButtonModel2 = (LandingMessageCardButtonModel) next2;
            } else {
                landingMessageCardButtonModel2 = null;
            }
            landingMessageCardButtonModel = landingMessageCardButtonModel2;
        } else {
            landingMessageCardButtonModel = link2;
        }
        if (landingMessageCardButtonModel == null || (navigationType = landingMessageCardButtonModel.getNavigationType()) == null || !(Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.CELLS.getValue()) || Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.PRIVATE_CELLS.getValue()) || Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.SYSTEM.getValue()))) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c0(this, param, landingMessageCardModel, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b0(this, landingMessageCardButtonModel, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d0(this, param, landingMessageCardButtonModel, landingMessageCardModel, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull LandingAccessesHandler accessesHandler, @NotNull LandingActionsHandler actionsHandler, @NotNull LandingAnalyticsHandler analyticsHandler, @NotNull LandingClickDispatcher clickEventDispatcher) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(accessesHandler, "accessesHandler");
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(analyticsHandler, "analyticsHandler");
        Intrinsics.checkNotNullParameter(clickEventDispatcher, "clickEventDispatcher");
        this.f33127q0 = provider;
        this.f33128r0 = accessesHandler;
        this.f33129s0 = actionsHandler;
        this.f33130t0 = analyticsHandler;
        this.f33131u0 = clickEventDispatcher;
        this.id = ID;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33132w0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<GetUserConfigurationUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetUserConfigurationUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetUserConfigurationUseCase.class), qualifier, objArr);
            }
        });
        final n nVar = new n();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.f33133x0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<RemoveUserDataUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RemoveUserDataUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(RemoveUserDataUseCase.class), objArr2, nVar);
            }
        });
        final k kVar = new k();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f33134y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<LightAccessUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.domain.usecase.LightAccessUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LightAccessUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(LightAccessUseCase.class), objArr3, kVar);
            }
        });
        final e eVar = new e();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.E0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<ConfigureWebViewProfileUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ConfigureWebViewProfileUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ConfigureWebViewProfileUseCase.class), objArr4, eVar);
            }
        });
        final h hVar = new h();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.F0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<GetIsBiometricAccessEnabledUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.biometriclogin.domain.usecase.GetIsBiometricAccessEnabledUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetIsBiometricAccessEnabledUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetIsBiometricAccessEnabledUseCase.class), objArr5, hVar);
            }
        });
        final b bVar = new b();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.G0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<CheckIsDeviceSecureUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.domain.usecase.CheckIsDeviceSecureUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CheckIsDeviceSecureUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(CheckIsDeviceSecureUseCase.class), objArr6, bVar);
            }
        });
        final d dVar = new d();
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.H0 = LazyKt__LazyJVMKt.lazy(new Function0<CheckForFlexibleUpdateUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final CheckForFlexibleUpdateUseCase invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(CheckForFlexibleUpdateUseCase.class), objArr7, dVar);
            }
        });
        final f fVar = new f();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<FetchLandingAccessStateUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.domain.usecase.FetchLandingAccessStateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FetchLandingAccessStateUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FetchLandingAccessStateUseCase.class), objArr8, fVar);
            }
        });
        this.I0 = lazy;
        final c cVar = new c();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode8 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.J0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode8, (Function0) new Function0<CheckMobilePaymentEnabledUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.domain.usecase.CheckMobilePaymentEnabledUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CheckMobilePaymentEnabledUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(CheckMobilePaymentEnabledUseCase.class), objArr9, cVar);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode9 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.K0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode9, (Function0) new Function0<ChangeUserBehavior>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$special$$inlined$inject$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ChangeUserBehavior invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ChangeUserBehavior.class), objArr10, objArr11);
            }
        });
        LandingAppAccess landingAppAccessExecute = ((FetchLandingAccessStateUseCase) lazy.getValue()).execute();
        this.L0 = landingAppAccessExecute;
        LandingHeaderState landingHeaderState = new LandingHeaderState(LandingHeaderState.Type.INSTANCE.from(landingAppAccessExecute), null, null, a(), null, null, null, null, null, null, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, null);
        this.P0 = landingHeaderState;
        MutableStateFlow<LandingContract.State> MutableStateFlow = StateFlowKt.MutableStateFlow(new LandingContract.State.Skeleton(landingHeaderState));
        this.S0 = MutableStateFlow;
        this.T0 = MutableStateFlow;
        Channel<LandingContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.U0 = channelChannel$default;
        this.events = FlowKt.merge(FlowKt.receiveAsFlow(channelChannel$default), accessesHandler.getEvents());
        this.W0 = new ArrayList();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new o9.b(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new o9.c(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }
}
