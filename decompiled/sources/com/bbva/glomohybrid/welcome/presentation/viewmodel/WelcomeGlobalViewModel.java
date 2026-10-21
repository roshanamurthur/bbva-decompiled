package com.bbva.glomohybrid.welcome.presentation.viewmodel;

import androidx.camera.core.imagecapture.a;
import androidx.camera.core.impl.utils.c;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.usecase.version.GetAppVersionCodeUseCase;
import com.bbva.glomohybrid.base.usecase.version.GetRememberedVersionCodeUseCase;
import com.bbva.glomohybrid.base.usecase.version.RememberedVersionCodeParams;
import com.bbva.glomohybrid.base.usecase.version.SetRememberedVersionCodeUseCase;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomohybrid.welcome.model.domain.StartMode;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.WelcomeAccessesHandler;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: WelcomeGlobalViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 `2\u00020\u0001:\u0001`B\u0019\u0012\u0006\u0010&\u001a\u00020!\u0012\b\b\u0002\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J$\u0010\u0016\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0014H\u0016R\u001a\u0010&\u001a\u00020!8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010>\u001a\b\u0012\u0004\u0012\u000208078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\u0004\u001a\u0004\b;\u0010<R\"\u0010A\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010L\u001a\u0004\u0018\u00010E8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\f0\u00198F¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198F¢\u0006\u0006\u001a\u0004\bV\u0010RR\u0017\u0010X\u001a\b\u0012\u0004\u0012\u000201078F¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0014\u0010[\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006a"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/viewmodel/WelcomeGlobalViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "", "configure$Welcome_mexicoRelease", "()V", "configure", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent;", "intent", "setIntent", "", "currentVersionCode", "storedVersionCode", "Lcom/bbva/glomohybrid/welcome/model/domain/StartMode;", "getStartMode", "onBackButtonClick", "onEnterButtonClick", "", "route", "Lcom/bbva/glomohybrid/base/Animation;", "animation", "", "closeAfter", "navigateTo", "show", "showSpinner", "Landroidx/lifecycle/LiveData;", "spinnerState", "configureUserFromLegacyApp", "logActivityEvent", "openWeb", "getRegisterButtonConfigFromFeatureFlag", "status", "sendIsPageReadyStatus", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "q0", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "getProvider", "()Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Landroidx/lifecycle/MutableLiveData;", "w0", "Landroidx/lifecycle/MutableLiveData;", "get_loaderLiveData", "()Landroidx/lifecycle/MutableLiveData;", "_loaderLiveData", "y0", "get_isUserFromLegacyApp", "_isUserFromLegacyApp", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "E0", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "get_state", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "_state", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "G0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "getEvents$annotations", "events", "H0", "Z", "isLoadingPageReady", "()Z", "setLoadingPageReady", "(Z)V", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "I0", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "getRememberedUserData", "()Lcom/bbva/glomo/user/domain/model/RememberedUser;", "setRememberedUserData", "(Lcom/bbva/glomo/user/domain/model/RememberedUser;)V", "rememberedUserData", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "getThreadDispatchers", "()Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "getLoader", "()Landroidx/lifecycle/LiveData;", "loader", "getWelcomeConfig", "welcomeConfig", "isUserFromLegacyApp", "getState", "state", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler;", "accessesHandler", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler;)V", "Companion", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWelcomeGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeGlobalViewModel.kt\ncom/bbva/glomohybrid/welcome/presentation/viewmodel/WelcomeGlobalViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,252:1\n56#2,6:253\n56#2,6:259\n56#2,6:265\n56#2,6:271\n41#2,6:277\n47#2:284\n133#3:283\n107#4:285\n*S KotlinDebug\n*F\n+ 1 WelcomeGlobalViewModel.kt\ncom/bbva/glomohybrid/welcome/presentation/viewmodel/WelcomeGlobalViewModel\n*L\n55#1:253,6\n56#1:259,6\n58#1:265,6\n60#1:271,6\n53#1:277,6\n53#1:284\n53#1:283\n53#1:285\n*E\n"})
public class WelcomeGlobalViewModel extends BaseViewModel {

    @NotNull
    public static final String ID = "welcome-view-model";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final MutableSharedFlow<WelcomeContract.State> _state;

    @NotNull
    public final Channel<WelcomeContract.Event> F0;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @NotNull
    public final Flow<WelcomeContract.Event> events;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public boolean isLoadingPageReady;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @Nullable
    public RememberedUser rememberedUserData;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelComponentsProviders provider;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final WelcomeAccessesHandler f34820r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f34821s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f34822t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f34823u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> _loaderLiveData;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<StartMode> f34825x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> _isUserFromLegacyApp;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: WelcomeGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$observeDeeplinkChannel$1", f = "WelcomeGlobalViewModel.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<E> extends SuspendLambda implements Function2<E, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34827p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WelcomeGlobalViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34827p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = WelcomeGlobalViewModel.this.F0;
                WelcomeContract.Event.DeeplinkReceived deeplinkReceived = WelcomeContract.Event.DeeplinkReceived.INSTANCE;
                this.f34827p0 = 1;
                if (channel.send(deeplinkReceived, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: WelcomeGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$observeDeeplinkChannel$2", f = "WelcomeGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<E> extends SuspendLambda implements Function3<FlowCollector<? super E>, Throwable, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Throwable f34829p0;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(3, continuation);
            bVar.f34829p0 = th2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LoggerKt.logError$default("[WelcomeGlobalViewModel]: Error receiving deeplink", this.f34829p0, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WelcomeGlobalViewModel(ViewModelComponentsProviders viewModelComponentsProviders, WelcomeAccessesHandler welcomeAccessesHandler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new WelcomeAccessesHandler(viewModelComponentsProviders) : welcomeAccessesHandler);
    }

    public static final GetRememberedUserUseCase access$getRememberedUserUseCase(WelcomeGlobalViewModel welcomeGlobalViewModel) {
        return (GetRememberedUserUseCase) welcomeGlobalViewModel.f34821s0.getValue();
    }

    public static final Object access$handleWebAccessState(WelcomeGlobalViewModel welcomeGlobalViewModel, WelcomeAccessesHandler.WebPageState webPageState, Continuation continuation) {
        welcomeGlobalViewModel.getClass();
        if (webPageState instanceof WelcomeAccessesHandler.WebPageState.Loading) {
            Object objEmit = welcomeGlobalViewModel.get_state().emit(WelcomeContract.State.Loading.INSTANCE, continuation);
            if (objEmit != ek.a.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
            return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        if (!(webPageState instanceof WelcomeAccessesHandler.WebPageState.Ready)) {
            return Unit.INSTANCE;
        }
        Object objEmit2 = welcomeGlobalViewModel.get_state().emit(WelcomeContract.State.WebReady.INSTANCE, continuation);
        return objEmit2 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
    }

    public static final Object access$setLoadingState(WelcomeGlobalViewModel welcomeGlobalViewModel, Continuation continuation) {
        Object objEmit = welcomeGlobalViewModel.get_state().emit(WelcomeContract.State.Loading.INSTANCE, continuation);
        return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    public static final Object access$setState(WelcomeGlobalViewModel welcomeGlobalViewModel, WelcomeContract.State state, Continuation continuation) {
        Object objEmit = welcomeGlobalViewModel.get_state().emit(state, continuation);
        return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    public static final Object access$setWelcomeState(WelcomeGlobalViewModel welcomeGlobalViewModel, RememberedUser rememberedUser, Continuation continuation) {
        welcomeGlobalViewModel.getClass();
        if (rememberedUser != null) {
            Object objEmit = welcomeGlobalViewModel.get_state().emit(new WelcomeContract.State.RememberedUser(rememberedUser.getUsername()), continuation);
            if (objEmit != ek.a.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
            return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        Object objEmit2 = welcomeGlobalViewModel.get_state().emit(WelcomeContract.State.FirstStart.INSTANCE, continuation);
        if (objEmit2 != ek.a.getCOROUTINE_SUSPENDED()) {
            objEmit2 = Unit.INSTANCE;
        }
        return objEmit2 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
    }

    public static /* synthetic */ void navigateTo$default(WelcomeGlobalViewModel welcomeGlobalViewModel, String str, Animation animation, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateTo");
        }
        if ((i10 & 2) != 0) {
            animation = Animation.None.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        welcomeGlobalViewModel.navigateTo(str, animation, z10);
    }

    public final <E> void a(MutableSharedFlow<E> mutableSharedFlow) {
        FlowKt.launchIn(FlowKt.m5982catch(FlowKt.onEach(mutableSharedFlow, new a(null)), new b(3, null)), ViewModelKt.getViewModelScope(this));
    }

    public final void configure$Welcome_mexicoRelease() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ma.a(this, null), 3, null);
        CellsDeepLinkChannels cellsDeepLinkChannels = CellsDeepLinkChannels.INSTANCE;
        a(cellsDeepLinkChannels.getDeepLinkManager());
        a(cellsDeepLinkChannels.getQrLinkChannel());
        a(cellsDeepLinkChannels.getGoogleAssistantActionChannel());
        a(cellsDeepLinkChannels.getDeepLinkToAtm());
        long jLongValue = ((GetRememberedVersionCodeUseCase) this.f34823u0.getValue()).execute().longValue();
        long jLongValue2 = ((GetAppVersionCodeUseCase) this.f34822t0.getValue()).execute().longValue();
        StartMode startMode = getStartMode(jLongValue2, jLongValue);
        this.f34825x0.setValue(startMode);
        if (startMode != StartMode.REGULAR_START) {
            ((SetRememberedVersionCodeUseCase) this.v0.getValue()).execute2(new RememberedVersionCodeParams(jLongValue2));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ma.b(this, null), 3, null);
    }

    public void configureUserFromLegacyApp() {
        this._isUserFromLegacyApp.setValue(Boolean.FALSE);
    }

    @NotNull
    public final Flow<WelcomeContract.Event> getEvents() {
        return this.events;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return "welcome-view-model";
    }

    @NotNull
    public final LiveData<Boolean> getLoader() {
        return this._loaderLiveData;
    }

    @NotNull
    public final ViewModelComponentsProviders getProvider() {
        return this.provider;
    }

    @Nullable
    public final RememberedUser getRememberedUserData() {
        return this.rememberedUserData;
    }

    @NotNull
    public final StartMode getStartMode(long currentVersionCode, long storedVersionCode) {
        if (storedVersionCode == 0) {
            return StartMode.FIRST_START;
        }
        return storedVersionCode == currentVersionCode ? StartMode.REGULAR_START : StartMode.UPDATE_START;
    }

    @NotNull
    public final Flow<WelcomeContract.State> getState() {
        return get_state();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ThreadDispatchers getThreadDispatchers() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
        return (ThreadDispatchers) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, null);
    }

    @NotNull
    public final LiveData<StartMode> getWelcomeConfig() {
        return this.f34825x0;
    }

    @NotNull
    public final MutableLiveData<Boolean> get_isUserFromLegacyApp() {
        return this._isUserFromLegacyApp;
    }

    @NotNull
    public final MutableLiveData<Boolean> get_loaderLiveData() {
        return this._loaderLiveData;
    }

    @NotNull
    public MutableSharedFlow<WelcomeContract.State> get_state() {
        return this._state;
    }

    /* JADX INFO: renamed from: isLoadingPageReady, reason: from getter */
    public final boolean getIsLoadingPageReady() {
        return this.isLoadingPageReady;
    }

    @NotNull
    public final LiveData<Boolean> isUserFromLegacyApp() {
        return this._isUserFromLegacyApp;
    }

    public final void navigateTo(@Nullable String route, @NotNull Animation animation, boolean closeAfter) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (route != null) {
            CellsReactor.fire("welcome-view-model", Router.INSTANCE.getACTION_NAVIGATE(), new Route(route, animation, null, 4, null));
        }
        if (closeAfter) {
            CellsReactor.fire$default("welcome-view-model", Router.INSTANCE.getACTION_CLOSE_SCREEN(), null, 4, null);
        }
    }

    public final void onBackButtonClick() {
        navigateTo$default(this, "welcome", null, false, 6, null);
    }

    public final void onEnterButtonClick() {
        navigateTo$default(this, "landing", Animation.Fade.INSTANCE, false, 4, null);
    }

    public void openWeb(@NotNull WelcomeContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        setIntent(intent);
    }

    public final void setIntent(@NotNull WelcomeContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean z10 = intent instanceof WelcomeContract.Intent.OpenWeb;
        WelcomeAccessesHandler welcomeAccessesHandler = this.f34820r0;
        if (z10) {
            welcomeAccessesHandler.openWeb(new WelcomeContract.Event.Navigation(WelcomeContract.Event.Navigation.Type.OPEN_WEB, new Route(((WelcomeContract.Intent.OpenWeb) intent).getRoute(), null, null, 6, null), null, 4, null));
            return;
        }
        if (intent instanceof WelcomeContract.Intent.OpenExternalWeb) {
            welcomeAccessesHandler.openWeb(new WelcomeContract.Event.Navigation(WelcomeContract.Event.Navigation.Type.OPEN_EXTERNAL_WEB, null, ((WelcomeContract.Intent.OpenExternalWeb) intent).getBundle(), 2, null));
        } else if (intent instanceof WelcomeContract.Intent.OpenWebApp) {
            welcomeAccessesHandler.openWeb(new WelcomeContract.Event.Navigation(WelcomeContract.Event.Navigation.Type.OPEN_WEB_APP, null, ((WelcomeContract.Intent.OpenWebApp) intent).getBundle(), 2, null));
        }
    }

    public final void setLoadingPageReady(boolean z10) {
        this.isLoadingPageReady = z10;
    }

    public final void setRememberedUserData(@Nullable RememberedUser rememberedUser) {
        this.rememberedUserData = rememberedUser;
    }

    public final void showSpinner(boolean show) {
        this._loaderLiveData.setValue(Boolean.valueOf(show));
    }

    @NotNull
    public final LiveData<Boolean> spinnerState() {
        return this._loaderLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeGlobalViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull WelcomeAccessesHandler accessesHandler) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(accessesHandler, "accessesHandler");
        this.provider = provider;
        this.f34820r0 = accessesHandler;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34821s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<GetRememberedUserUseCase>() { // from class: com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetRememberedUserUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetRememberedUserUseCase.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f34822t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<GetAppVersionCodeUseCase>() { // from class: com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.usecase.version.GetAppVersionCodeUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetAppVersionCodeUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetAppVersionCodeUseCase.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f34823u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<GetRememberedVersionCodeUseCase>() { // from class: com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.usecase.version.GetRememberedVersionCodeUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetRememberedVersionCodeUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetRememberedVersionCodeUseCase.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<SetRememberedVersionCodeUseCase>() { // from class: com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.usecase.version.SetRememberedVersionCodeUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SetRememberedVersionCodeUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SetRememberedVersionCodeUseCase.class), objArr6, objArr7);
            }
        });
        this._loaderLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.f34825x0 = new MutableLiveData<>();
        this._isUserFromLegacyApp = new MutableLiveData<>();
        this._state = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        Channel<WelcomeContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.F0 = channelChannel$default;
        this.events = FlowKt.merge(FlowKt.receiveAsFlow(channelChannel$default), accessesHandler.getEvents());
        this.isLoadingPageReady = CellsDeepLinkChannels.INSTANCE.getWebReadyToExecuteDeeplinkFlow().getValue().booleanValue();
        configure$Welcome_mexicoRelease();
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getEvents$annotations() {
    }

    public void getRegisterButtonConfigFromFeatureFlag() {
    }

    public void logActivityEvent() {
    }

    public void sendIsPageReadyStatus(boolean status) {
    }
}
