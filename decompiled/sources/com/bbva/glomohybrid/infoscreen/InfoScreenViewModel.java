package com.bbva.glomohybrid.infoscreen;

import android.os.Bundle;
import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.mobileservices.craslytics.CrashReporter;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: InfoScreenViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u001c\u0010\u0016\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0006R(\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180$8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010.\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Landroid/os/Bundle;", "bundle", "", "handleExtraData", "", "route", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Lcom/bbva/glomohybrid/base/Animation;", "animation", "openWeb", "getRememberedUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "event", "trackEvent", "Lcom/bbva/cellscore/channel/model/Channel;", "Ljava/lang/Void;", "channel", "message", "sendMessageToWeb", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "q0", "Landroidx/lifecycle/MutableLiveData;", "get_loaderSpinner", "()Landroidx/lifecycle/MutableLiveData;", "_loaderSpinner", "Lcom/bbva/glomohybrid/base/models/common/Event;", "Lcom/bbva/glomohybrid/base/router/Route;", "r0", "get_screenNavigation", "_screenNavigation", "Landroidx/lifecycle/LiveData;", "s0", "Landroidx/lifecycle/LiveData;", "getScreenNavigation", "()Landroidx/lifecycle/LiveData;", "screenNavigation", "getLoaderSpinner", "loaderSpinner", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "viewModelComponentsProviders", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInfoScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoScreenViewModel.kt\ncom/bbva/glomohybrid/infoscreen/InfoScreenViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,98:1\n56#2,6:99\n56#2,6:105\n56#2,6:111\n56#2,6:117\n56#2,6:123\n*S KotlinDebug\n*F\n+ 1 InfoScreenViewModel.kt\ncom/bbva/glomohybrid/infoscreen/InfoScreenViewModel\n*L\n38#1:99,6\n40#1:105,6\n43#1:111,6\n45#1:117,6\n46#1:123,6\n*E\n"})
public final class InfoScreenViewModel extends BaseViewModel {

    @NotNull
    public static final String ID = "infoscreen-view-model";

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> _loaderSpinner;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Event<Route>> _screenNavigation;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f32241s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f32242t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f32243u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f32244w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f32245x0;

    /* JADX INFO: compiled from: InfoScreenViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.InfoScreenViewModel$getRememberedUser$2", f = "InfoScreenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InfoScreenViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            RememberedUser rememberedUserExecute = InfoScreenViewModel.access$getRememberedUserUseCase(InfoScreenViewModel.this).execute();
            if (rememberedUserExecute != null) {
                return rememberedUserExecute.getDocument();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: InfoScreenViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.InfoScreenViewModel$openWeb$1", f = "InfoScreenViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f32247p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f32249r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Object f32250s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Animation f32251t0;

        /* JADX INFO: compiled from: InfoScreenViewModel.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ InfoScreenViewModel f32252p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Animation f32253q0;

            public a(InfoScreenViewModel infoScreenViewModel, Animation animation) {
                this.f32252p0 = infoScreenViewModel;
                this.f32253q0 = animation;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                WebNavigationState webNavigationState = (WebNavigationState) obj;
                boolean z10 = webNavigationState instanceof WebNavigationState.Loading;
                InfoScreenViewModel infoScreenViewModel = this.f32252p0;
                if (z10) {
                    infoScreenViewModel.get_loaderSpinner().setValue(Boxing.boxBoolean(true));
                } else if (webNavigationState instanceof WebNavigationState.Loaded) {
                    infoScreenViewModel.get_loaderSpinner().setValue(Boxing.boxBoolean(false));
                    infoScreenViewModel.get_screenNavigation().setValue(new Event<>(new Route("cellsweb", this.f32253q0, null, 4, null)));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object obj, Animation animation, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f32249r0 = str;
            this.f32250s0 = obj;
            this.f32251t0 = animation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InfoScreenViewModel.this.new b(this.f32249r0, this.f32250s0, this.f32251t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32247p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InfoScreenViewModel infoScreenViewModel = InfoScreenViewModel.this;
                Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(InfoScreenViewModel.access$getNavigationDispatcher(infoScreenViewModel), this.f32249r0, false, this.f32250s0, 2, null);
                a aVar = new a(infoScreenViewModel, this.f32251t0);
                this.f32247p0 = 1;
                if (flowNavigate$default.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public InfoScreenViewModel(@NotNull final ViewModelComponentsProviders viewModelComponentsProviders) {
        Intrinsics.checkNotNullParameter(viewModelComponentsProviders, "viewModelComponentsProviders");
        this._loaderSpinner = new MutableLiveData<>(Boolean.FALSE);
        MutableLiveData<Event<Route>> mutableLiveData = new MutableLiveData<>();
        this._screenNavigation = mutableLiveData;
        this.f32241s0 = mutableLiveData;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32242t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<NavigateDispatcher>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.navigate.NavigateDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigateDispatcher invoke() {
                KoinComponent koinComponent = viewModelComponentsProviders;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f32243u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<CrashReporter>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomoutils.mobileservices.craslytics.CrashReporter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CrashReporter invoke() {
                KoinComponent koinComponent = viewModelComponentsProviders;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(CrashReporter.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<GetRememberedUserUseCase>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetRememberedUserUseCase invoke() {
                KoinComponent koinComponent = viewModelComponentsProviders;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetRememberedUserUseCase.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.f32244w0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                KoinComponent koinComponent = viewModelComponentsProviders;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.f32245x0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<MessageDispatcher>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.dispatcher.MessageDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageDispatcher invoke() {
                KoinComponent koinComponent = viewModelComponentsProviders;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), objArr8, objArr9);
            }
        });
    }

    public static final NavigateDispatcher access$getNavigationDispatcher(InfoScreenViewModel infoScreenViewModel) {
        return (NavigateDispatcher) infoScreenViewModel.f32242t0.getValue();
    }

    public static final GetRememberedUserUseCase access$getRememberedUserUseCase(InfoScreenViewModel infoScreenViewModel) {
        return (GetRememberedUserUseCase) infoScreenViewModel.v0.getValue();
    }

    public static /* synthetic */ void openWeb$default(InfoScreenViewModel infoScreenViewModel, String str, Object obj, Animation animation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            animation = Animation.None.INSTANCE;
        }
        infoScreenViewModel.openWeb(str, obj, animation);
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return ID;
    }

    @NotNull
    public final LiveData<Boolean> getLoaderSpinner() {
        return this._loaderSpinner;
    }

    @Nullable
    public final Object getRememberedUser(@NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(null), continuation);
    }

    @NotNull
    public final LiveData<Event<Route>> getScreenNavigation() {
        return this.f32241s0;
    }

    @NotNull
    public final MutableLiveData<Boolean> get_loaderSpinner() {
        return this._loaderSpinner;
    }

    @NotNull
    public final MutableLiveData<Event<Route>> get_screenNavigation() {
        return this._screenNavigation;
    }

    public final void handleExtraData(@Nullable Bundle bundle) {
        ((CrashReporter) this.f32243u0.getValue()).reportIfPendingCrashIsAvailable(bundle);
    }

    public final void openWeb(@NotNull String route, @Nullable Object payload, @NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(route, payload, animation, null), 3, null);
    }

    public final void sendMessageToWeb(@NotNull Channel<Void> channel, @NotNull String message) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(message, "message");
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.f32245x0.getValue();
        String name = channel.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        messageDispatcher.sendMessage(name, message);
    }

    public final void trackEvent(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((AnalyticsManager) this.f32244w0.getValue()).trackEvent(event);
    }
}
