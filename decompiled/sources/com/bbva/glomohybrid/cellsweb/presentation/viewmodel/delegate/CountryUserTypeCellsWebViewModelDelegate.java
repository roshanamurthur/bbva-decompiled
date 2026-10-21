package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import bk.p;
import bk.q;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.TrackAction;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.LoginData;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.cellsweb.presentation.biocatch.BioCatchConstants;
import com.bbva.glomohybrid.cellsweb.presentation.channels.UserTypeChannels;
import com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase;
import com.bbva.glomohybrid.cellsweb.usecase.params.ConfigureWebPrivateProfileParams;
import com.bbva.glomohybrid.cellsweb.usecase.result.ProfileLoaded;
import com.bbva.glomohybrid.cellsweb.usecase.result.SwitchPrivateProfileResult;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeContract;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate;
import com.bbva.glomoutils.mappable.MappableEngineKt;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.ui.component.menu.SlideMenuViewModel;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CountryUserTypeCellsWebViewModelDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u0007\u001a\u00020\u00042\u001e\u0010\u0006\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0017H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/CountryUserTypeCellsWebViewModelDelegate;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/UserTypeCellsWebViewModelDelegate;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "init", "(Lkotlin/jvm/functions/Function1;)V", "", "text", "onUserTypeSelected", "sendWebReadyDataGema$CellsWeb_mexicoRelease", "()V", "sendWebReadyDataGema", "action", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "doAction", "route", "", "hideLoading", "executeNavigationIfNeeded", "onChangeProfileRetry", "Lcom/bbva/glomo/user/domain/model/TrackAction;", "trackAction", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryUserTypeCellsWebViewModelDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryUserTypeCellsWebViewModelDelegate.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/CountryUserTypeCellsWebViewModelDelegate\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n56#2,6:221\n56#2,6:227\n1#3:233\n*S KotlinDebug\n*F\n+ 1 CountryUserTypeCellsWebViewModelDelegate.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/CountryUserTypeCellsWebViewModelDelegate\n*L\n39#1:221,6\n40#1:227,6\n*E\n"})
public final class CountryUserTypeCellsWebViewModelDelegate extends UserTypeCellsWebViewModelDelegate {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f31868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f31869v;

    /* JADX INFO: compiled from: CountryUserTypeCellsWebViewModelDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: CountryUserTypeCellsWebViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate$executeNavigationIfNeeded$1", f = "CountryUserTypeCellsWebViewModelDelegate.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31870p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f31872r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f31873s0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CountryUserTypeCellsWebViewModelDelegate.kt */
        public static final class C0132a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ boolean f31874p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CountryUserTypeCellsWebViewModelDelegate f31875q0;

            /* JADX INFO: renamed from: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CountryUserTypeCellsWebViewModelDelegate.kt */
            @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate$executeNavigationIfNeeded$1$1", f = "CountryUserTypeCellsWebViewModelDelegate.kt", i = {0}, l = {175}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class C0133a extends ContinuationImpl {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public C0132a f31876p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public /* synthetic */ Object f31877q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ C0132a<T> f31878r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public int f31879s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0133a(C0132a<? super T> c0132a, Continuation<? super C0133a> continuation) {
                    super(continuation);
                    this.f31878r0 = c0132a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f31877q0 = obj;
                    this.f31879s0 |= Integer.MIN_VALUE;
                    return this.f31878r0.emit(null, this);
                }
            }

            public C0132a(boolean z10, CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate) {
                this.f31874p0 = z10;
                this.f31875q0 = countryUserTypeCellsWebViewModelDelegate;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull WebNavigationState webNavigationState, @NotNull Continuation<? super Unit> continuation) {
                C0133a c0133a;
                C0132a<T> c0132a;
                if (continuation instanceof C0133a) {
                    c0133a = (C0133a) continuation;
                    int i10 = c0133a.f31879s0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0133a.f31879s0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c0133a = new C0133a(this, continuation);
                    }
                } else {
                    c0133a = new C0133a(this, continuation);
                }
                Object obj = c0133a.f31877q0;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i11 = c0133a.f31879s0;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if ((webNavigationState instanceof WebNavigationState.Loaded) && this.f31874p0) {
                        c0133a.f31876p0 = this;
                        c0133a.f31879s0 = 1;
                        if (DelayKt.delay(5000L, c0133a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c0132a = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0132a = c0133a.f31876p0;
                ResultKt.throwOnFailure(obj);
                LoaderViewModel loader = c0132a.f31875q0.getLoader();
                if (loader != null) {
                    loader.hide();
                }
                CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate = c0132a.f31875q0;
                SlideMenuViewModel menuViewModel = countryUserTypeCellsWebViewModelDelegate.getMenuViewModel();
                if (menuViewModel != null) {
                    menuViewModel.lock(countryUserTypeCellsWebViewModelDelegate.getCurrentUserType() != UserType.PERSONAL);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31872r0 = str;
            this.f31873s0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CountryUserTypeCellsWebViewModelDelegate.this.new a(this.f31872r0, this.f31873s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Flow flowNavigate$default;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31870p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate = CountryUserTypeCellsWebViewModelDelegate.this;
                NavigateDispatcher navigateDispatcher = countryUserTypeCellsWebViewModelDelegate.getNavigateDispatcher();
                if (navigateDispatcher != null && (flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(navigateDispatcher, this.f31872r0, false, null, 6, null)) != null) {
                    C0132a c0132a = new C0132a(this.f31873s0, countryUserTypeCellsWebViewModelDelegate);
                    this.f31870p0 = 1;
                    if (flowNavigate$default.collect(c0132a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: CountryUserTypeCellsWebViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate$onUserTypeSelected$1", f = "CountryUserTypeCellsWebViewModelDelegate.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31880p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserType f31882r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f31883s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserType userType, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f31882r0 = userType;
            this.f31883s0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CountryUserTypeCellsWebViewModelDelegate.this.new b(this.f31882r0, this.f31883s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31880p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate = CountryUserTypeCellsWebViewModelDelegate.this;
                UserType currentUserType = countryUserTypeCellsWebViewModelDelegate.getCurrentUserType();
                this.f31880p0 = 1;
                if (CountryUserTypeCellsWebViewModelDelegate.access$handleSSO(countryUserTypeCellsWebViewModelDelegate, currentUserType, this.f31882r0, this.f31883s0, this) == coroutine_suspended) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public CountryUserTypeCellsWebViewModelDelegate(@NotNull final ViewModelComponentsProviders provider) {
        super(provider);
        Intrinsics.checkNotNullParameter(provider, "provider");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f31868u = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceIdDataSource>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.localstorage.DeviceIdDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceIdDataSource invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f31869v = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<MainStorage>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.storage.MainStorage, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MainStorage invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MainStorage.class), objArr2, objArr3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Code duplicated, block: B:40:0x0134  */
    /* JADX WARN: Code duplicated, block: B:51:0x0185  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$handleSSO(CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate, UserType userType, UserType userType2, String str, Continuation continuation) {
        com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.a aVar;
        ConfigureWebPrivateProfileParams configureWebPrivateProfileParams;
        Object objExecute;
        CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate2;
        UserType userType3;
        CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate3;
        ConfigureWebPrivateProfileParams configureWebPrivateProfileParams2;
        UserType userType4;
        UserType userType5;
        SlideMenuViewModel menuViewModel;
        LoaderViewModel loader;
        countryUserTypeCellsWebViewModelDelegate.getClass();
        if (continuation instanceof com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.a) {
            aVar = (com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.a) continuation;
            int i10 = aVar.f31988w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31988w0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.a(countryUserTypeCellsWebViewModelDelegate, continuation);
            }
        } else {
            aVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.a(countryUserTypeCellsWebViewModelDelegate, continuation);
        }
        Object obj = aVar.f31987u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31988w0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            RememberedUser rememberedUser = countryUserTypeCellsWebViewModelDelegate.getRememberedUser();
            String document = rememberedUser != null ? rememberedUser.getDocument() : null;
            if (document == null) {
                document = "";
            }
            configureWebPrivateProfileParams = new ConfigureWebPrivateProfileParams(userType2, document, countryUserTypeCellsWebViewModelDelegate.getTsec());
            ConfigureWebPrivateProfileUseCase switchProfileUseCase = countryUserTypeCellsWebViewModelDelegate.getSwitchProfileUseCase();
            aVar.f31982p0 = countryUserTypeCellsWebViewModelDelegate;
            aVar.f31983q0 = userType;
            aVar.f31984r0 = userType2;
            aVar.f31985s0 = str;
            aVar.f31986t0 = configureWebPrivateProfileParams;
            aVar.f31988w0 = 1;
            objExecute = switchProfileUseCase.execute(configureWebPrivateProfileParams, (Continuation<? super SwitchPrivateProfileResult>) aVar);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    userType3 = aVar.f31983q0;
                    countryUserTypeCellsWebViewModelDelegate2 = aVar.f31982p0;
                    ResultKt.throwOnFailure(obj);
                    menuViewModel = countryUserTypeCellsWebViewModelDelegate2.getMenuViewModel();
                    if (menuViewModel != null) {
                        menuViewModel.lock(userType3 != UserType.PERSONAL);
                    }
                    loader = countryUserTypeCellsWebViewModelDelegate2.getLoader();
                    if (loader != null) {
                        loader.hide();
                    }
                    return Unit.INSTANCE;
                }
                configureWebPrivateProfileParams2 = (ConfigureWebPrivateProfileParams) aVar.f31985s0;
                userType5 = aVar.f31984r0;
                userType4 = aVar.f31983q0;
                countryUserTypeCellsWebViewModelDelegate3 = aVar.f31982p0;
                ResultKt.throwOnFailure(obj);
                if (userType5 == UserType.PERSONAL) {
                    CellsReactor.fire$default(countryUserTypeCellsWebViewModelDelegate3.getId(), ActionConstants.INSTANCE.getACTION_RESTORE_GLOMO_TOKEN(), null, 4, null);
                    countryUserTypeCellsWebViewModelDelegate3.getMessageDispatcher().sendMessage(UserTypeChannels.GLOBAL_AUTH_GLOMO, new AccessToken(countryUserTypeCellsWebViewModelDelegate3.getTsec(), "tsec", null, AuthTokenInterceptorsIds.GLOMO.toString()));
                    MessageDispatcher messageDispatcher = countryUserTypeCellsWebViewModelDelegate3.getMessageDispatcher();
                    Map mutableMap = q.toMutableMap(countryUserTypeCellsWebViewModelDelegate3.getSession().getCustomer().getMap());
                    mutableMap.put(CustomerIdInterceptor.FAKE_CUSTOMER_ID, mutableMap.get("id"));
                    Unit unit = Unit.INSTANCE;
                    messageDispatcher.sendMessage(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL, MappableEngineKt.toMap(mutableMap));
                    MessageDispatcher messageDispatcher2 = countryUserTypeCellsWebViewModelDelegate3.getMessageDispatcher();
                    String deviceId = ((DeviceIdDataSource) countryUserTypeCellsWebViewModelDelegate3.f31868u.getValue()).getDeviceId();
                    messageDispatcher2.sendMessage(UserTypeChannels.DEVICE_ID, deviceId != null ? deviceId : "");
                    UserTypeViewModelDelegate.DefaultImpls.executeNavigationIfNeeded$default(countryUserTypeCellsWebViewModelDelegate3, RouteConstants.LOADING, false, 2, null);
                } else {
                    CellsReactor.fire(countryUserTypeCellsWebViewModelDelegate3.getId(), ActionConstants.INSTANCE.getACTION_SAVE_GLOMO_TOKEN(), configureWebPrivateProfileParams2.getPassword());
                }
                countryUserTypeCellsWebViewModelDelegate3.b(userType4, userType5);
                return Unit.INSTANCE;
            }
            ConfigureWebPrivateProfileParams configureWebPrivateProfileParams3 = aVar.f31986t0;
            str = (String) aVar.f31985s0;
            userType2 = aVar.f31984r0;
            userType = aVar.f31983q0;
            CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate4 = aVar.f31982p0;
            ResultKt.throwOnFailure(obj);
            configureWebPrivateProfileParams = configureWebPrivateProfileParams3;
            countryUserTypeCellsWebViewModelDelegate = countryUserTypeCellsWebViewModelDelegate4;
            objExecute = obj;
        }
        if (!(((SwitchPrivateProfileResult) objExecute) instanceof ProfileLoaded)) {
            int ssoErrorAttempsCounts = countryUserTypeCellsWebViewModelDelegate.getSsoErrorAttempsCounts();
            countryUserTypeCellsWebViewModelDelegate.setSsoErrorAttempsCounts(ssoErrorAttempsCounts + 1);
            aVar.f31982p0 = countryUserTypeCellsWebViewModelDelegate;
            aVar.f31983q0 = userType;
            aVar.f31984r0 = null;
            aVar.f31985s0 = null;
            aVar.f31986t0 = null;
            aVar.f31988w0 = 3;
            Object objSend = countryUserTypeCellsWebViewModelDelegate.get_userTypeEvents().send(new UserTypeContract.Event.ShowModal(new ModalType.ErrorSSONoPhone(ssoErrorAttempsCounts)), aVar);
            if (objSend != ek.a.getCOROUTINE_SUSPENDED()) {
                objSend = Unit.INSTANCE;
            }
            if (objSend == coroutine_suspended) {
                return coroutine_suspended;
            }
            UserType userType6 = userType;
            countryUserTypeCellsWebViewModelDelegate2 = countryUserTypeCellsWebViewModelDelegate;
            userType3 = userType6;
            menuViewModel = countryUserTypeCellsWebViewModelDelegate2.getMenuViewModel();
            if (menuViewModel != null) {
                menuViewModel.lock(userType3 != UserType.PERSONAL);
            }
            loader = countryUserTypeCellsWebViewModelDelegate2.getLoader();
            if (loader != null) {
                loader.hide();
            }
            return Unit.INSTANCE;
        }
        countryUserTypeCellsWebViewModelDelegate.resetErrorAttempts();
        countryUserTypeCellsWebViewModelDelegate.onChangeSelectedOption(str);
        aVar.f31982p0 = countryUserTypeCellsWebViewModelDelegate;
        aVar.f31983q0 = userType;
        aVar.f31984r0 = userType2;
        aVar.f31985s0 = configureWebPrivateProfileParams;
        aVar.f31986t0 = null;
        aVar.f31988w0 = 2;
        if (countryUserTypeCellsWebViewModelDelegate.persistUserSelectedType(aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        countryUserTypeCellsWebViewModelDelegate3 = countryUserTypeCellsWebViewModelDelegate;
        configureWebPrivateProfileParams2 = configureWebPrivateProfileParams;
        UserType userType7 = userType2;
        userType4 = userType;
        userType5 = userType7;
        if (userType5 == UserType.PERSONAL) {
            CellsReactor.fire$default(countryUserTypeCellsWebViewModelDelegate3.getId(), ActionConstants.INSTANCE.getACTION_RESTORE_GLOMO_TOKEN(), null, 4, null);
            countryUserTypeCellsWebViewModelDelegate3.getMessageDispatcher().sendMessage(UserTypeChannels.GLOBAL_AUTH_GLOMO, new AccessToken(countryUserTypeCellsWebViewModelDelegate3.getTsec(), "tsec", null, AuthTokenInterceptorsIds.GLOMO.toString()));
            MessageDispatcher messageDispatcher3 = countryUserTypeCellsWebViewModelDelegate3.getMessageDispatcher();
            Map mutableMap2 = q.toMutableMap(countryUserTypeCellsWebViewModelDelegate3.getSession().getCustomer().getMap());
            mutableMap2.put(CustomerIdInterceptor.FAKE_CUSTOMER_ID, mutableMap2.get("id"));
            Unit unit2 = Unit.INSTANCE;
            messageDispatcher3.sendMessage(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL, MappableEngineKt.toMap(mutableMap2));
            MessageDispatcher messageDispatcher4 = countryUserTypeCellsWebViewModelDelegate3.getMessageDispatcher();
            String deviceId2 = ((DeviceIdDataSource) countryUserTypeCellsWebViewModelDelegate3.f31868u.getValue()).getDeviceId();
            messageDispatcher4.sendMessage(UserTypeChannels.DEVICE_ID, deviceId2 != null ? deviceId2 : "");
            UserTypeViewModelDelegate.DefaultImpls.executeNavigationIfNeeded$default(countryUserTypeCellsWebViewModelDelegate3, RouteConstants.LOADING, false, 2, null);
        } else {
            CellsReactor.fire(countryUserTypeCellsWebViewModelDelegate3.getId(), ActionConstants.INSTANCE.getACTION_SAVE_GLOMO_TOKEN(), configureWebPrivateProfileParams2.getPassword());
        }
        countryUserTypeCellsWebViewModelDelegate3.b(userType4, userType5);
        return Unit.INSTANCE;
    }

    public static final Object access$sendSSoError(CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate, int i10, Continuation continuation) {
        Object objSend = countryUserTypeCellsWebViewModelDelegate.get_userTypeEvents().send(new UserTypeContract.Event.ShowModal(new ModalType.ErrorSSONoPhone(i10)), continuation);
        return objSend == ek.a.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    public final void b(UserType userType, UserType userType2) {
        WebMessage change_profile_personal_track;
        getAnalyticsDelegate().trackOptionSelectedEvent(AnalyticsEvent.WEB_USER_TYPE_OPTION_SELECTED, userType, userType2);
        int i10 = WhenMappings.$EnumSwitchMapping$0[userType2.ordinal()];
        if (i10 == 1) {
            change_profile_personal_track = BioCatchConstants.INSTANCE.getCHANGE_PROFILE_PERSONAL_TRACK();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            change_profile_personal_track = BioCatchConstants.INSTANCE.getCHANGE_PROFILE_BUSINESS_TRACK();
        }
        getMessageDispatcher().sendMessage(change_profile_personal_track);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void doAction(@NotNull String action, @Nullable String payload) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.doAction(action, payload);
        if (Intrinsics.areEqual(action, AppStartReadyChannel.INSTANCE.getACTION_APP_READY().getId())) {
            if (getCurrentUserType() == UserType.PERSONAL) {
                if (payload == null) {
                    payload = RouteConstants.DASHBOARD;
                }
                executeNavigationIfNeeded(payload, true);
                return;
            }
            if (payload != null) {
                if ((l.isBlank(payload) ^ true ? payload : null) != null) {
                    executeNavigationIfNeeded(payload, true);
                    return;
                }
            }
            LoaderViewModel loader = getLoader();
            if (loader != null) {
                loader.hide();
            }
            SlideMenuViewModel menuViewModel = getMenuViewModel();
            if (menuViewModel != null) {
                menuViewModel.lock(true);
            }
        }
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void executeNavigationIfNeeded(@NotNull String route, boolean hideLoading) {
        Intrinsics.checkNotNullParameter(route, "route");
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new a(route, hideLoading, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void init(@Nullable Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        super.init(block);
        configNavigationEvents();
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onChangeProfileRetry() {
        onUserTypeSelected(isEnterprise(getUserTypeSelectedOption()) ? getProfileSelectorHelper().stringFrom(UserType.PERSONAL) : getProfileSelectorHelper().stringFrom(UserType.ENTERPRISE));
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onUserTypeSelected(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (isEnterprise(getUserTypeSelectedOption())) {
            LoaderViewModel loader = getLoader();
            if (loader != null) {
                loader.setProperties(ViewComponentFactory.INSTANCE.changeProfilePersonal());
            }
        } else {
            LoaderViewModel loader2 = getLoader();
            if (loader2 != null) {
                loader2.setProperties(ViewComponentFactory.INSTANCE.changeProfileEnterprise());
            }
        }
        LoaderViewModel loader3 = getLoader();
        if (loader3 != null) {
            loader3.show();
        }
        SlideMenuViewModel menuViewModel = getMenuViewModel();
        if (menuViewModel != null) {
            SlideMenuViewModel.toggle$default(menuViewModel, false, false, 2, null);
        }
        SlideMenuViewModel menuViewModel2 = getMenuViewModel();
        if (menuViewModel2 != null) {
            menuViewModel2.lock(true);
        }
        if (Intrinsics.areEqual(text, getUserTypeSelectedOption()) || !(!l.isBlank(text))) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new b(getProfileSelectorHelper().userTypeFrom(text), text, null), 3, null);
    }

    public final void sendWebReadyDataGema$CellsWeb_mexicoRelease() {
        Map mapMapOf = p.mapOf(TuplesKt.to(CustomerIdInterceptor.CLIENT_ID, ((LoginData) new Gson().fromJson(MainStorage.getString$default((MainStorage) this.f31869v.getValue(), "loginData", null, false, TargetStorage.Local, 6, null), LoginData.class)).getGrantingTicketUserId()));
        MessageDispatcher messageDispatcher = getMessageDispatcher();
        String tsec = getTsec();
        AuthTokenInterceptorsIds authTokenInterceptorsIds = AuthTokenInterceptorsIds.GLOMO;
        messageDispatcher.sendMessage(UserTypeChannels.GLOBAL_AUTH_GEMA, new AccessToken(tsec, "tsec", null, authTokenInterceptorsIds.toString()));
        p.mapOf(TuplesKt.to("deviceId", ((DeviceIdDataSource) this.f31868u.getValue()).getDeviceId()));
        getMessageDispatcher().sendMessage(UserTypeChannels.GLOBAL_AUTH_GEMA, new AccessToken(getTsec(), "tsec", null, authTokenInterceptorsIds.toString()));
        getMessageDispatcher().sendMessage(UserTypeChannels.GEMA_CLIENT_ID, mapMapOf);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate, com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void trackAction(@NotNull TrackAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof TrackAction.ChangeProfile) {
            b(getCurrentUserType(), ((TrackAction.ChangeProfile) action).getCom.google.android.gms.common.Scopes.PROFILE java.lang.String());
        } else if (Intrinsics.areEqual(action, TrackAction.ChangeUser.INSTANCE)) {
            getAnalyticsDelegate().trackChangeProfile(AnalyticsEvent.WEB_USER_TYPE_OPTION_SELECTED, getCurrentUserType());
            getMessageDispatcher().sendMessage(BioCatchConstants.INSTANCE.getCHANGE_USER_TRACK());
        }
    }
}
