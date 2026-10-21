package com.bbva.glomohybrid.welcome.presentation;

import androidx.camera.core.imagecapture.a;
import androidx.core.app.NotificationCompat;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import ja.b;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation;", "event", "", "openWeb", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "s0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState;", "u0", "getWebPageState", "webPageState", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "WebPageState", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWelcomeAccessesHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeAccessesHandler.kt\ncom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,78:1\n56#2,6:79\n*S KotlinDebug\n*F\n+ 1 WelcomeAccessesHandler.kt\ncom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler\n*L\n30#1:79,6\n*E\n"})
public final class WelcomeAccessesHandler implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34739p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f34740q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Channel<WelcomeContract.Event> f34741r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<WelcomeContract.Event> events;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<WebPageState> f34743t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow f34744u0;

    /* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState;", "", "()V", "Loading", "Ready", "Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState$Loading;", "Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState$Ready;", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class WebPageState {

        /* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState$Loading;", "Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "component1", NotificationCompat.CATEGORY_NAVIGATION, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "getNavigation", "()Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "<init>", "(Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;)V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Loading extends WebPageState {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final WelcomeContract.Event navigation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Loading(@NotNull WelcomeContract.Event navigation) {
                super(null);
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                this.navigation = navigation;
            }

            public static /* synthetic */ Loading copy$default(Loading loading, WelcomeContract.Event event, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    event = loading.navigation;
                }
                return loading.copy(event);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final WelcomeContract.Event getNavigation() {
                return this.navigation;
            }

            @NotNull
            public final Loading copy(@NotNull WelcomeContract.Event navigation) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return new Loading(navigation);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && Intrinsics.areEqual(this.navigation, ((Loading) other).navigation);
            }

            @NotNull
            public final WelcomeContract.Event getNavigation() {
                return this.navigation;
            }

            public int hashCode() {
                return this.navigation.hashCode();
            }

            @NotNull
            public String toString() {
                return "Loading(navigation=" + this.navigation + ")";
            }
        }

        /* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState$Ready;", "Lcom/bbva/glomohybrid/welcome/presentation/WelcomeAccessesHandler$WebPageState;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Ready extends WebPageState {

            @NotNull
            public static final Ready INSTANCE = new Ready();

            public Ready() {
                super(null);
            }
        }

        public WebPageState() {
        }

        public /* synthetic */ WebPageState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WelcomeContract.Event.Navigation.Type.values().length];
            try {
                iArr[WelcomeContract.Event.Navigation.Type.OPEN_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WelcomeContract.Event.Navigation.Type.OPEN_EXTERNAL_WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WelcomeContract.Event.Navigation.Type.OPEN_WEB_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeAccessesHandler(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f34739p0 = CoroutineScopeKt.MainScope();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34740q0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<NavigateDispatcher>() { // from class: com.bbva.glomohybrid.welcome.presentation.WelcomeAccessesHandler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.navigate.NavigateDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigateDispatcher invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), qualifier, objArr);
            }
        });
        Channel<WelcomeContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f34741r0 = channelChannel$default;
        this.events = FlowKt.receiveAsFlow(channelChannel$default);
        MutableSharedFlow<WebPageState> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34743t0 = mutableSharedFlowMutableSharedFlow$default;
        this.f34744u0 = mutableSharedFlowMutableSharedFlow$default;
    }

    public static final NavigateDispatcher access$getWebNavigationHandler(WelcomeAccessesHandler welcomeAccessesHandler) {
        return (NavigateDispatcher) welcomeAccessesHandler.f34740q0.getValue();
    }

    public static final Object access$handleLoadedWebNavigationState(WelcomeAccessesHandler welcomeAccessesHandler, Continuation continuation) {
        Object objEmit = welcomeAccessesHandler.f34743t0.emit(WebPageState.Ready.INSTANCE, continuation);
        return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    public static final Object access$handleNavigationState(WelcomeAccessesHandler welcomeAccessesHandler, WebNavigationState webNavigationState, WelcomeContract.Event.Navigation navigation, Continuation continuation) {
        welcomeAccessesHandler.getClass();
        boolean z10 = webNavigationState instanceof WebNavigationState.Loaded;
        MutableSharedFlow<WebPageState> mutableSharedFlow = welcomeAccessesHandler.f34743t0;
        if (z10) {
            Object objEmit = mutableSharedFlow.emit(WebPageState.Ready.INSTANCE, continuation);
            if (objEmit != ek.a.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
            return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        if (!(webNavigationState instanceof WebNavigationState.Loading)) {
            return Unit.INSTANCE;
        }
        Object objEmit2 = mutableSharedFlow.emit(new WebPageState.Loading(navigation), continuation);
        return objEmit2 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34739p0.getCoroutineContext();
    }

    @NotNull
    public final Flow<WelcomeContract.Event> getEvents() {
        return this.events;
    }

    @NotNull
    public final Flow<WebPageState> getWebPageState() {
        return this.f34744u0;
    }

    public final void openWeb(@NotNull WelcomeContract.Event.Navigation event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.getType().ordinal()];
        if (i10 == 1) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new ja.a(event, this, null), 3, null);
        } else if (i10 == 2 || i10 == 3) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(event, this, null), 3, null);
        }
    }
}
