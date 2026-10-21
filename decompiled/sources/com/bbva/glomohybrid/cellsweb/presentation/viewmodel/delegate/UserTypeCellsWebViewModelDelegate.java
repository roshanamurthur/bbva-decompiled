package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomoconfig.constants.GlobalAnalyticsConstants;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.session.Session;
import com.bbva.glomohybrid.base.usecase.UseCaseConstants;
import com.bbva.glomohybrid.base.viewmodel.Action;
import com.bbva.glomohybrid.base.viewmodel.OnCompleteAction;
import com.bbva.glomohybrid.base.viewmodel.PerformedAction;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow;
import com.bbva.glomohybrid.cellsweb.R;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel;
import com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeContract;
import com.bbva.glomohybrid.ui.options.profileselector.helper.AnalyticsViewModelDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.helper.ProfileSelectorHelper;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.SlideMenuViewModel;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\bq\u0010rJ2\u0010\u0007\u001a\u00020\u00042\u001e\u0010\u0006\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0004J\b\u0010\n\u001a\u00020\u0004H\u0004J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0013\u0010\u000f\u001a\u00020\u0004H\u0084@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\u00020\u0014*\u0004\u0018\u00010\u000bH\u0004J%\u0010\u001f\u001a\u00020\u00042\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001d\u00103\u001a\u0004\u0018\u00010.8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00108\u001a\u0004\u0018\u0001048DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001d\u0010=\u001a\u0004\u0018\u0001098DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u0004\u0018\u00010>8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bN\u00100\u001a\u0004\bO\u0010PR\"\u0010X\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010`\u001a\u0004\u0018\u00010Y8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020\u000b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010l\u001a\u00020g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u0002098DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bm\u0010<R\u0014\u0010p\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006s"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/UserTypeCellsWebViewModelDelegate;", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/CommonUserTypeViewModelDelegate;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "init", "(Lkotlin/jvm/functions/Function1;)V", "configNavigationEvents", "resetErrorAttempts", "", "value", "onChangeSelectedOption", "onProfilesChanged", "changeUserInitials", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStoreUserTypeInComponent", "onPersistedSelectorReset", "route", "", "hideLoading", "executeNavigationIfNeeded", "token", "storeToken", "onSwitchToEnterprise", "isEnterprise", "", "params", "loadNavigation$CellsWeb_mexicoRelease", "(Ljava/util/Map;)V", "loadNavigation", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "g", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "getProvider", "()Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "", "h", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSsoErrorAttempsCounts", "()I", "setSsoErrorAttempsCounts", "(I)V", "ssoErrorAttempsCounts", "Lcom/bbva/ui/component/menu/SlideMenuViewModel;", "i", "Lkotlin/Lazy;", "getMenuViewModel", "()Lcom/bbva/ui/component/menu/SlideMenuViewModel;", "menuViewModel", "Lcom/bbva/component/ui/loader/LoaderViewModel;", "j", "getLoader", "()Lcom/bbva/component/ui/loader/LoaderViewModel;", "loader", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "k", "getWebDispatcher", "()Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "webDispatcher", "Lcom/bbva/bridge/navigate/NavigateDispatcher;", "l", "getNavigateDispatcher", "()Lcom/bbva/bridge/navigate/NavigateDispatcher;", "navigateDispatcher", "Lcom/bbva/glomohybrid/cellsweb/usecase/ConfigureWebPrivateProfileUseCase;", "m", "getSwitchProfileUseCase", "()Lcom/bbva/glomohybrid/cellsweb/usecase/ConfigureWebPrivateProfileUseCase;", "switchProfileUseCase", "Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "p", "getZipComponent", "()Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "zipComponent", "Lcom/bbva/glomohybrid/base/session/Session;", "q", "getSession", "()Lcom/bbva/glomohybrid/base/session/Session;", "session", "r", "Z", "getResetRememberedUser", "()Z", "setResetRememberedUser", "(Z)V", "resetRememberedUser", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "s", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "getRememberedUser", "()Lcom/bbva/glomo/user/domain/model/RememberedUser;", "setRememberedUser", "(Lcom/bbva/glomo/user/domain/model/RememberedUser;)V", "rememberedUser", "tsec", "Ljava/lang/String;", "getTsec", "()Ljava/lang/String;", "setTsec", "(Ljava/lang/String;)V", "Lcom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate;", "t", "Lcom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate;", "getAnalyticsDelegate", "()Lcom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate;", "analyticsDelegate", "getMessageDispatcher", "messageDispatcher", "getId", "id", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserTypeCellsWebViewModelDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeCellsWebViewModelDelegate.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/UserTypeCellsWebViewModelDelegate\n+ 2 ViewModelComponentsProviders.kt\ncom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProvidersKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n1#1,231:1\n24#2,8:232\n101#3,6:240\n133#3:276\n158#3:281\n56#4,6:246\n56#4,6:252\n56#4,6:258\n56#4,6:264\n41#4,6:270\n47#4:277\n107#5:278\n120#5:280\n45#6:279\n215#7:282\n216#7:284\n12#8:283\n*S KotlinDebug\n*F\n+ 1 UserTypeCellsWebViewModelDelegate.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/UserTypeCellsWebViewModelDelegate\n*L\n66#1:232,8\n66#1:240,6\n79#1:276\n138#1:281\n70#1:246,6\n72#1:252,6\n74#1:258,6\n76#1:264,6\n79#1:270,6\n79#1:277\n79#1:278\n138#1:280\n138#1:279\n214#1:282\n214#1:284\n217#1:283\n*E\n"})
public abstract class UserTypeCellsWebViewModelDelegate extends CommonUserTypeViewModelDelegate {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelComponentsProviders provider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int ssoErrorAttempsCounts;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy menuViewModel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy loader;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy webDispatcher;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy navigateDispatcher;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy switchProfileUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f31932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f31933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy zipComponent;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy session;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean resetRememberedUser;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RememberedUser rememberedUser;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnalyticsViewModelDelegate analyticsDelegate;
    protected String tsec;

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate", f = "UserTypeCellsWebViewModelDelegate.kt", i = {0}, l = {147}, m = "changeUserInitials", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public UserTypeCellsWebViewModelDelegate f31939p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public UserTypeCellsWebViewModelDelegate f31940q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f31941r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f31943t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31941r0 = obj;
            this.f31943t0 |= Integer.MIN_VALUE;
            return UserTypeCellsWebViewModelDelegate.this.changeUserInitials(this);
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    public static final class b extends Lambda implements Function1<PerformedAction, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31944p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PerformedAction performedAction) {
            PerformedAction it = performedAction;
            Intrinsics.checkNotNullParameter(it, "it");
            LoggerKt.logDebug$default("[ZipActionsComponent][CellsWeb] - performed " + it.getAction(), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    public static final class c extends Lambda implements Function1<OnCompleteAction, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OnCompleteAction onCompleteAction) {
            OnCompleteAction it = onCompleteAction;
            Intrinsics.checkNotNullParameter(it, "it");
            LoggerKt.logDebug$default("[ZipActionsComponent][CellsWeb] - completed " + it, null, 2, null);
            UserTypeCellsWebViewModelDelegate.this.loadNavigation$CellsWeb_mexicoRelease(it.getActionsPerformed());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$executeNavigationIfNeeded$1", f = "UserTypeCellsWebViewModelDelegate.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31946p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f31948r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f31949s0;

        /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ boolean f31950p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ UserTypeCellsWebViewModelDelegate f31951q0;

            public a(boolean z10, UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate) {
                this.f31950p0 = z10;
                this.f31951q0 = userTypeCellsWebViewModelDelegate;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                if ((((WebNavigationState) obj) instanceof WebNavigationState.Loaded) && this.f31950p0) {
                    UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate = this.f31951q0;
                    LoaderViewModel loader = userTypeCellsWebViewModelDelegate.getLoader();
                    if (loader != null) {
                        loader.hide();
                    }
                    SlideMenuViewModel menuViewModel = userTypeCellsWebViewModelDelegate.getMenuViewModel();
                    if (menuViewModel != null) {
                        menuViewModel.lock(userTypeCellsWebViewModelDelegate.getCurrentUserType() != UserType.PERSONAL);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f31948r0 = str;
            this.f31949s0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserTypeCellsWebViewModelDelegate.this.new d(this.f31948r0, this.f31949s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Flow flowNavigate$default;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31946p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate = UserTypeCellsWebViewModelDelegate.this;
                NavigateDispatcher navigateDispatcher = userTypeCellsWebViewModelDelegate.getNavigateDispatcher();
                if (navigateDispatcher != null && (flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(navigateDispatcher, this.f31948r0, false, null, 6, null)) != null) {
                    a aVar = new a(this.f31949s0, userTypeCellsWebViewModelDelegate);
                    this.f31946p0 = 1;
                    if (flowNavigate$default.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$init$1", f = "UserTypeCellsWebViewModelDelegate.kt", i = {1}, l = {95, 96, 100, 101}, m = "invokeSuspend", n = {"optionSelected"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f31952p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f31953q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f31955s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f31955s0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserTypeCellsWebViewModelDelegate.this.new e(this.f31955s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0088 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x009d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ProfileSelectorHelper profileSelectorHelper;
            String strStringFrom;
            Function1<Continuation<? super Unit>, Object> function1;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31953q0;
            UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate = UserTypeCellsWebViewModelDelegate.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    profileSelectorHelper = (ProfileSelectorHelper) this.f31952p0;
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    strStringFrom = (String) this.f31952p0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        strStringFrom = userTypeCellsWebViewModelDelegate.getProfileSelectorHelper().getDefault();
                    }
                    userTypeCellsWebViewModelDelegate.onChangeSelectedOption(strStringFrom);
                    SuspendGetRememberedUserUseCase getRememberedUserUseCase = userTypeCellsWebViewModelDelegate.getGetRememberedUserUseCase();
                    this.f31952p0 = userTypeCellsWebViewModelDelegate;
                    this.f31953q0 = 3;
                    obj = getRememberedUserUseCase.execute(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    userTypeCellsWebViewModelDelegate.setRememberedUser((RememberedUser) obj);
                    function1 = this.f31955s0;
                    if (function1 != null) {
                        this.f31952p0 = null;
                        this.f31953q0 = 4;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i10 == 3) {
                    userTypeCellsWebViewModelDelegate = (UserTypeCellsWebViewModelDelegate) this.f31952p0;
                    ResultKt.throwOnFailure(obj);
                    userTypeCellsWebViewModelDelegate.setRememberedUser((RememberedUser) obj);
                    function1 = this.f31955s0;
                    if (function1 != null) {
                        this.f31952p0 = null;
                        this.f31953q0 = 4;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            profileSelectorHelper = userTypeCellsWebViewModelDelegate.getProfileSelectorHelper();
            GetUserTypeUseCase getUserTypeUseCase = userTypeCellsWebViewModelDelegate.getGetUserTypeUseCase();
            this.f31952p0 = profileSelectorHelper;
            this.f31953q0 = 1;
            obj = getUserTypeUseCase.execute(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            strStringFrom = profileSelectorHelper.stringFrom((UserType) obj);
            SuspendUseCase<Boolean> showUserTypeSelectorUseCase = userTypeCellsWebViewModelDelegate.getShowUserTypeSelectorUseCase();
            this.f31952p0 = strStringFrom;
            this.f31953q0 = 2;
            obj = showUserTypeSelectorUseCase.execute(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                strStringFrom = userTypeCellsWebViewModelDelegate.getProfileSelectorHelper().getDefault();
            }
            userTypeCellsWebViewModelDelegate.onChangeSelectedOption(strStringFrom);
            SuspendGetRememberedUserUseCase getRememberedUserUseCase2 = userTypeCellsWebViewModelDelegate.getGetRememberedUserUseCase();
            this.f31952p0 = userTypeCellsWebViewModelDelegate;
            this.f31953q0 = 3;
            obj = getRememberedUserUseCase2.execute(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            userTypeCellsWebViewModelDelegate.setRememberedUser((RememberedUser) obj);
            function1 = this.f31955s0;
            if (function1 != null) {
                this.f31952p0 = null;
                this.f31953q0 = 4;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    public static final class f extends Lambda implements Function0<LoaderViewModel> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderViewModel invoke() {
            return (LoaderViewModel) UserTypeCellsWebViewModelDelegate.this.getProvider().provide(String.valueOf(R.id.changeProfileSpinner));
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    public static final class g extends Lambda implements Function0<SlideMenuViewModel> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SlideMenuViewModel invoke() {
            return (SlideMenuViewModel) UserTypeCellsWebViewModelDelegate.this.getProvider().provide(String.valueOf(R.id.slideMenuViewDashboard));
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    public static final class h extends Lambda implements Function0<NavigateDispatcher> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NavigateDispatcher invoke() {
            return (NavigateDispatcher) UserTypeCellsWebViewModelDelegate.this.getProvider().provide("web-navigate-dispatcher");
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$onPersistedSelectorReset$1", f = "UserTypeCellsWebViewModelDelegate.kt", i = {}, l = {160, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31959p0;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserTypeCellsWebViewModelDelegate.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MessageDispatcher webDispatcher;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31959p0;
            UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate = UserTypeCellsWebViewModelDelegate.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                userTypeCellsWebViewModelDelegate.onChangeSelectedOption(userTypeCellsWebViewModelDelegate.getProfileSelectorHelper().getDefault());
                webDispatcher = userTypeCellsWebViewModelDelegate.getWebDispatcher();
                if (webDispatcher != null) {
                    webDispatcher.notifyEvent(CellsChannels.CLEAN_DATA_CHANGE_USER);
                }
                UserTypeCellsWebViewModelDelegate.access$cleanWebReadyChannelIfNeeded(userTypeCellsWebViewModelDelegate);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            userTypeCellsWebViewModelDelegate.setUserTypeSelectedOption(null);
            this.f31959p0 = 1;
            if (userTypeCellsWebViewModelDelegate.persistUserSelectedType(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31959p0 = 2;
            if (UserTypeCellsWebViewModelDelegate.access$resetRememberedUser(userTypeCellsWebViewModelDelegate, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            userTypeCellsWebViewModelDelegate.onChangeSelectedOption(userTypeCellsWebViewModelDelegate.getProfileSelectorHelper().getDefault());
            webDispatcher = userTypeCellsWebViewModelDelegate.getWebDispatcher();
            if (webDispatcher != null) {
                webDispatcher.notifyEvent(CellsChannels.CLEAN_DATA_CHANGE_USER);
            }
            UserTypeCellsWebViewModelDelegate.access$cleanWebReadyChannelIfNeeded(userTypeCellsWebViewModelDelegate);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$onProfilesChanged$1", f = "UserTypeCellsWebViewModelDelegate.kt", i = {}, l = {129, 130, 132, 133}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f31961p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public UserProfileConfiguration f31962q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f31963r0;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserTypeCellsWebViewModelDelegate.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x008f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UserProfileConfiguration userProfileConfiguration;
            Object obj2;
            Channel channel;
            UserTypeContract.Event.ShowModal showModal;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31963r0;
            UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate = UserTypeCellsWebViewModelDelegate.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    userProfileConfiguration = this.f31962q0;
                    obj2 = this.f31961p0;
                    ResultKt.throwOnFailure(obj);
                    userProfileConfiguration.setDigitalTokenEnabled(((Boolean) obj).booleanValue());
                    ChangeUserBehavior changeUserBehaviorAccess$getChangeUserBehavior = UserTypeCellsWebViewModelDelegate.access$getChangeUserBehavior(userTypeCellsWebViewModelDelegate);
                    this.f31961p0 = null;
                    this.f31962q0 = null;
                    this.f31963r0 = 3;
                    obj = changeUserBehaviorAccess$getChangeUserBehavior.compute((UserProfileConfiguration) obj2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel = userTypeCellsWebViewModelDelegate.get_userTypeEvents();
                    showModal = new UserTypeContract.Event.ShowModal((ModalType) obj);
                    this.f31963r0 = 4;
                    if (channel.send(showModal, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i10 == 3) {
                    ResultKt.throwOnFailure(obj);
                    channel = userTypeCellsWebViewModelDelegate.get_userTypeEvents();
                    showModal = new UserTypeContract.Event.ShowModal((ModalType) obj);
                    this.f31963r0 = 4;
                    if (channel.send(showModal, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            GetUserConfigurationUseCase getUserConfigurationUseCaseAccess$getGetUserProfileUseCase = UserTypeCellsWebViewModelDelegate.access$getGetUserProfileUseCase(userTypeCellsWebViewModelDelegate);
            this.f31963r0 = 1;
            obj = GetUserConfigurationUseCase.execute$default(getUserConfigurationUseCaseAccess$getGetUserProfileUseCase, false, false, this, 3, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            userProfileConfiguration = (UserProfileConfiguration) obj;
            RememberedUser rememberedUser = userProfileConfiguration.getRememberedUser();
            this.f31961p0 = obj;
            this.f31962q0 = userProfileConfiguration;
            this.f31963r0 = 2;
            Object objAccess$isTokenActive = UserTypeCellsWebViewModelDelegate.access$isTokenActive(userTypeCellsWebViewModelDelegate, rememberedUser, this);
            if (objAccess$isTokenActive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj;
            obj = objAccess$isTokenActive;
            userProfileConfiguration.setDigitalTokenEnabled(((Boolean) obj).booleanValue());
            ChangeUserBehavior changeUserBehaviorAccess$getChangeUserBehavior2 = UserTypeCellsWebViewModelDelegate.access$getChangeUserBehavior(userTypeCellsWebViewModelDelegate);
            this.f31961p0 = null;
            this.f31962q0 = null;
            this.f31963r0 = 3;
            obj = changeUserBehaviorAccess$getChangeUserBehavior2.compute((UserProfileConfiguration) obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            channel = userTypeCellsWebViewModelDelegate.get_userTypeEvents();
            showModal = new UserTypeContract.Event.ShowModal((ModalType) obj);
            this.f31963r0 = 4;
            if (channel.send(showModal, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    public static final class k extends Lambda implements Function0<ParametersHolder> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(UserTypeCellsWebViewModelDelegate.this.getProvider());
        }
    }

    /* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
    public static final class l extends Lambda implements Function0<MessageDispatcher> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            return (MessageDispatcher) UserTypeCellsWebViewModelDelegate.this.getProvider().provide("web-dispatcher");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserTypeCellsWebViewModelDelegate(@NotNull final ViewModelComponentsProviders provider) {
        super(provider);
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
        this.menuViewModel = LazyKt__LazyJVMKt.lazy(new g());
        this.loader = LazyKt__LazyJVMKt.lazy(new f());
        this.webDispatcher = LazyKt__LazyJVMKt.lazy(new l());
        this.navigateDispatcher = LazyKt__LazyJVMKt.lazy(new h());
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CellsWebActivity.class);
        final k kVar = new k();
        final Scope orCreateScope$default = Koin.getOrCreateScope$default(provider.getKoin(), KClassExtKt.getFullName(orCreateKotlinClass) + "@" + provider.getPageId(), new TypeQualifier(Reflection.getOrCreateKotlinClass(provider.getClass())), null, 4, null);
        final Qualifier qualifier = null;
        this.switchProfileUseCase = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ConfigureWebPrivateProfileUseCase>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$special$$inlined$injectByActivityScope$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ConfigureWebPrivateProfileUseCase invoke() {
                return orCreateScope$default.get(Reflection.getOrCreateKotlinClass(ConfigureWebPrivateProfileUseCase.class), qualifier, kVar);
            }
        });
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.f31932n = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ChangeUserBehavior>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$special$$inlined$inject$default$1
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
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ChangeUserBehavior.class), objArr, objArr2);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.f31933o = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<GetUserConfigurationUseCase>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$special$$inlined$inject$default$2
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
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetUserConfigurationUseCase.class), objArr3, objArr4);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr5 = 0 == true ? 1 : 0;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.zipComponent = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<ZipActionsFlow>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ZipActionsFlow invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ZipActionsFlow.class), objArr5, objArr6);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr7 = 0 == true ? 1 : 0;
        final Object[] objArr8 = 0 == true ? 1 : 0;
        this.session = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<Session>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.session.Session, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Session invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(Session.class), objArr7, objArr8);
            }
        });
        this.analyticsDelegate = new AnalyticsViewModelDelegate(provider, GlobalAnalyticsConstants.INSTANCE.getGLOBAL_POSITION());
    }

    public static final void access$cleanWebReadyChannelIfNeeded(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate) {
        if (userTypeCellsWebViewModelDelegate.isEnterprise(userTypeCellsWebViewModelDelegate.getUserTypeSelectedOption())) {
            CellsReactor.fire$default(userTypeCellsWebViewModelDelegate.getId(), CellsWebGlobalViewModel.INSTANCE.getCLEAN_WEB_READY_CHANNEL(), null, 4, null);
        }
    }

    public static final ChangeUserBehavior access$getChangeUserBehavior(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate) {
        return (ChangeUserBehavior) userTypeCellsWebViewModelDelegate.f31932n.getValue();
    }

    public static final GetUserConfigurationUseCase access$getGetUserProfileUseCase(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate) {
        return (GetUserConfigurationUseCase) userTypeCellsWebViewModelDelegate.f31933o.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$isTokenActive(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate, RememberedUser rememberedUser, Continuation continuation) {
        com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.c cVar;
        Boolean bool;
        boolean zBooleanValue;
        userTypeCellsWebViewModelDelegate.getClass();
        if (continuation instanceof com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.c) {
            cVar = (com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.c) continuation;
            int i10 = cVar.f31995r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f31995r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.c(userTypeCellsWebViewModelDelegate, continuation);
            }
        } else {
            cVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.c(userTypeCellsWebViewModelDelegate, continuation);
        }
        Object objExecute = cVar.f31993p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f31995r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            SuspendUseCase suspendUseCase = (SuspendUseCase) androidx.camera.core.impl.utils.c.f(userTypeCellsWebViewModelDelegate.provider).getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.d(rememberedUser));
            if (suspendUseCase != null) {
                cVar.f31995r0 = 1;
                objExecute = suspendUseCase.execute(cVar);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                bool = null;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objExecute);
        bool = (Boolean) objExecute;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$resetRememberedUser(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate, Continuation continuation) {
        com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.e eVar;
        userTypeCellsWebViewModelDelegate.getClass();
        if (continuation instanceof com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.e) {
            eVar = (com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.e) continuation;
            int i10 = eVar.f32000s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f32000s0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.e(userTypeCellsWebViewModelDelegate, continuation);
            }
        } else {
            eVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.e(userTypeCellsWebViewModelDelegate, continuation);
        }
        Object obj = eVar.f31998q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f32000s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (userTypeCellsWebViewModelDelegate.resetRememberedUser) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.f fVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.f(userTypeCellsWebViewModelDelegate, null);
                eVar.f31997p0 = userTypeCellsWebViewModelDelegate;
                eVar.f32000s0 = 1;
                if (BuildersKt.withContext(io2, fVar, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            userTypeCellsWebViewModelDelegate.resetRememberedUser = false;
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        userTypeCellsWebViewModelDelegate = eVar.f31997p0;
        ResultKt.throwOnFailure(obj);
        userTypeCellsWebViewModelDelegate.rememberedUser = null;
        userTypeCellsWebViewModelDelegate.resetRememberedUser = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object changeUserInitials(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate;
        UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate2;
        String strCapitalize;
        String username;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f31943t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31943t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objExecute = aVar.f31941r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31943t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            SuspendGetRememberedUserUseCase getRememberedUserUseCase = getGetRememberedUserUseCase();
            aVar.f31939p0 = this;
            aVar.f31940q0 = this;
            aVar.f31943t0 = 1;
            objExecute = getRememberedUserUseCase.execute(aVar);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            userTypeCellsWebViewModelDelegate = this;
            userTypeCellsWebViewModelDelegate2 = userTypeCellsWebViewModelDelegate;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userTypeCellsWebViewModelDelegate2 = aVar.f31940q0;
            userTypeCellsWebViewModelDelegate = aVar.f31939p0;
            ResultKt.throwOnFailure(objExecute);
        }
        userTypeCellsWebViewModelDelegate2.rememberedUser = (RememberedUser) objExecute;
        RememberedUser rememberedUser = userTypeCellsWebViewModelDelegate.rememberedUser;
        if (rememberedUser == null || (username = rememberedUser.getUsername()) == null || (strCapitalize = kotlin.text.l.capitalize(username)) == null) {
            strCapitalize = "";
        }
        SlideMenuViewModel menuViewModel = userTypeCellsWebViewModelDelegate.getMenuViewModel();
        if (menuViewModel != null) {
            menuViewModel.setHeaderInitials(strCapitalize);
        }
        return Unit.INSTANCE;
    }

    public final void configNavigationEvents() {
        getZipComponent().onActionPerformed(b.f31944p0);
        getZipComponent().onComplete(new c());
        ZipActionsFlow zipComponent = getZipComponent();
        String id = AppStartReadyChannel.INSTANCE.getACTION_APP_READY().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        zipComponent.addAction(new Action.JustAction(id));
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void executeNavigationIfNeeded(@NotNull String route, boolean hideLoading) {
        Intrinsics.checkNotNullParameter(route, "route");
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new d(route, hideLoading, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public AnalyticsViewModelDelegate getAnalyticsDelegate() {
        return this.analyticsDelegate;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate
    @NotNull
    public String getId() {
        return "cells-web-view-model";
    }

    @Nullable
    public final LoaderViewModel getLoader() {
        return (LoaderViewModel) this.loader.getValue();
    }

    @Nullable
    public final SlideMenuViewModel getMenuViewModel() {
        return (SlideMenuViewModel) this.menuViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MessageDispatcher getMessageDispatcher() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
        return (MessageDispatcher) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null);
    }

    @Nullable
    public final NavigateDispatcher getNavigateDispatcher() {
        return (NavigateDispatcher) this.navigateDispatcher.getValue();
    }

    @NotNull
    public final ViewModelComponentsProviders getProvider() {
        return this.provider;
    }

    @Nullable
    public final RememberedUser getRememberedUser() {
        return this.rememberedUser;
    }

    public final boolean getResetRememberedUser() {
        return this.resetRememberedUser;
    }

    @NotNull
    public final Session getSession() {
        return (Session) this.session.getValue();
    }

    public final int getSsoErrorAttempsCounts() {
        return this.ssoErrorAttempsCounts;
    }

    @NotNull
    public final ConfigureWebPrivateProfileUseCase getSwitchProfileUseCase() {
        return (ConfigureWebPrivateProfileUseCase) this.switchProfileUseCase.getValue();
    }

    @NotNull
    public final String getTsec() {
        String str = this.tsec;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tsec");
        return null;
    }

    @Nullable
    public final MessageDispatcher getWebDispatcher() {
        return (MessageDispatcher) this.webDispatcher.getValue();
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public ZipActionsFlow getZipComponent() {
        return (ZipActionsFlow) this.zipComponent.getValue();
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void init(@Nullable Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new e(block, null), 3, null);
    }

    public final boolean isEnterprise(@Nullable String str) {
        return Intrinsics.areEqual(str, getProfileSelectorHelper().stringFrom(UserType.ENTERPRISE));
    }

    public final void loadNavigation$CellsWeb_mexicoRelease(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            String key = entry.getKey();
            AppStartReadyChannel appStartReadyChannel = AppStartReadyChannel.INSTANCE;
            if (Intrinsics.areEqual(key, appStartReadyChannel.getACTION_APP_READY().getId())) {
                String id = appStartReadyChannel.getACTION_APP_READY().getId();
                Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                AppStartReadyChannel.AppReadyParams appReadyParams = new AppStartReadyChannel.AppReadyParams(RouteConstants.DASHBOARD);
                Object obj = params.get(id);
                AppStartReadyChannel.AppReadyParams appReadyParams2 = (AppStartReadyChannel.AppReadyParams) (obj instanceof AppStartReadyChannel.AppReadyParams ? obj : null);
                if (appReadyParams2 != null) {
                    appReadyParams = appReadyParams2;
                }
                String id2 = appStartReadyChannel.getACTION_APP_READY().getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                doAction(id2, appReadyParams.getPageId());
            } else {
                doAction(entry.getKey(), null);
            }
        }
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onChangeSelectedOption(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setUserTypeSelectedOption(value);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onPersistedSelectorReset() {
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new i(null), 3, null);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onProfilesChanged() {
        this.resetRememberedUser = true;
        SlideMenuViewModel menuViewModel = getMenuViewModel();
        if (menuViewModel != null) {
            SlideMenuViewModel.toggle$default(menuViewModel, false, false, 2, null);
        }
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new j(null), 3, null);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onStoreUserTypeInComponent() {
        super.onStoreUserTypeInComponent();
        SlideMenuViewModel menuViewModel = getMenuViewModel();
        if (menuViewModel != null) {
            menuViewModel.setHeaderInitials("");
        }
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onSwitchToEnterprise() {
        onUserTypeSelected(getProfileSelectorHelper().stringFrom(UserType.ENTERPRISE));
    }

    public final void resetErrorAttempts() {
        this.ssoErrorAttempsCounts = 0;
    }

    public final void setRememberedUser(@Nullable RememberedUser rememberedUser) {
        this.rememberedUser = rememberedUser;
    }

    public final void setResetRememberedUser(boolean z10) {
        this.resetRememberedUser = z10;
    }

    public final void setSsoErrorAttempsCounts(int i10) {
        this.ssoErrorAttempsCounts = i10;
    }

    public final void setTsec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tsec = str;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void storeToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        setTsec(token);
    }
}
