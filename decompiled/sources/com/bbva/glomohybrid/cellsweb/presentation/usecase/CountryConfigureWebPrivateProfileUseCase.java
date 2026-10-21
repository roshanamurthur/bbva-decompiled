package com.bbva.glomohybrid.cellsweb.presentation.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.bridge.core.WebProfileLoader;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.cells.componentkit.model.FetchResultKt;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.component.dm.login.domain.model.LoginResult;
import com.bbva.component.dm.naturalauth.NaturalAuthDataManager;
import com.bbva.component.dm.singlesignon.SingleSignOnDataManager;
import com.bbva.component.dm.singlesignon.data.model.Customer;
import com.bbva.component.dm.singlesignon.data.model.Data;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse;
import com.bbva.component.dm.singlesignon.data.model.Uac;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoconfig.consumerid.ConsumerIdSelector;
import com.bbva.glomoconfig.consumerid.ConsumerIdSelectorKt;
import com.bbva.glomoconfig.login.AuthConfiguration;
import com.bbva.glomohybrid.base.session.SessionTokenGenerator;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase;
import com.bbva.glomohybrid.cellsweb.usecase.params.ConfigureWebPrivateProfileParams;
import com.bbva.glomohybrid.cellsweb.usecase.result.ProfileAlreadyLoaded;
import com.bbva.glomohybrid.cellsweb.usecase.result.ProfileError;
import com.bbva.glomohybrid.cellsweb.usecase.result.ProfileLoaded;
import com.bbva.glomohybrid.cellsweb.usecase.result.SwitchPrivateProfileResult;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CountryConfigureWebPrivateProfileUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J+\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/usecase/CountryConfigureWebPrivateProfileUseCase;", "Lcom/bbva/glomohybrid/cellsweb/usecase/ConfigureWebPrivateProfileUseCase;", "Lcom/bbva/glomohybrid/cellsweb/usecase/params/ConfigureWebPrivateProfileParams;", "params", "Lcom/bbva/glomohybrid/cellsweb/usecase/result/SwitchPrivateProfileResult;", "execute", "(Lcom/bbva/glomohybrid/cellsweb/usecase/params/ConfigureWebPrivateProfileParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/domain/model/UserType;", "userType", "", "isProfileChanged", "", "document", "password", "Lcom/bbva/component/dm/login/domain/model/LoginResult;", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "doLogin", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "configureAuthenticationProfiles", "type", "configureLoginDataManager", "configureNaturalAuthDataManager", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryConfigureWebPrivateProfileUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryConfigureWebPrivateProfileUseCase.kt\ncom/bbva/glomohybrid/cellsweb/presentation/usecase/CountryConfigureWebPrivateProfileUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n*L\n1#1,104:1\n56#2,6:105\n56#2,6:111\n56#2,6:117\n56#2,6:123\n41#2,6:129\n47#2:136\n133#3:135\n158#3:143\n107#4:137\n120#4:142\n42#5,4:138\n*S KotlinDebug\n*F\n+ 1 CountryConfigureWebPrivateProfileUseCase.kt\ncom/bbva/glomohybrid/cellsweb/presentation/usecase/CountryConfigureWebPrivateProfileUseCase\n*L\n42#1:105,6\n43#1:111,6\n44#1:117,6\n48#1:123,6\n90#1:129,6\n90#1:136\n90#1:135\n95#1:143\n90#1:137\n95#1:142\n95#1:138,4\n*E\n"})
public final class CountryConfigureWebPrivateProfileUseCase implements ConfigureWebPrivateProfileUseCase {

    @NotNull
    public static final String SUBSTRING_REMOVE = "ADMINF";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f31687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f31688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f31689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f31690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f31691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f31692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f31693g;

    /* JADX INFO: compiled from: CountryConfigureWebPrivateProfileUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase$doLogin$2", f = "CountryConfigureWebPrivateProfileUseCase.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LoginResult<? extends LoginResponse>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31694p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f31696r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f31697s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31696r0 = str;
            this.f31697s0 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CountryConfigureWebPrivateProfileUseCase.this.new a(this.f31696r0, this.f31697s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LoginResult<? extends LoginResponse>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31694p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LoginDataManager loginDataManagerAccess$getLoginDataManager = CountryConfigureWebPrivateProfileUseCase.access$getLoginDataManager(CountryConfigureWebPrivateProfileUseCase.this);
                this.f31694p0 = 1;
                obj = loginDataManagerAccess$getLoginDataManager.getLogin(this.f31696r0, this.f31697s0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: CountryConfigureWebPrivateProfileUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase", f = "CountryConfigureWebPrivateProfileUseCase.kt", i = {0, 0, 1, 1, 2, 2}, l = {53, 59, 63}, m = "execute", n = {"this", "params", "this", "params", "this", "params"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CountryConfigureWebPrivateProfileUseCase f31698p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ConfigureWebPrivateProfileParams f31699q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f31700r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f31702t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31700r0 = obj;
            this.f31702t0 |= Integer.MIN_VALUE;
            return CountryConfigureWebPrivateProfileUseCase.this.execute((ConfigureWebPrivateProfileParams) null, (Continuation<? super SwitchPrivateProfileResult>) this);
        }
    }

    /* JADX INFO: compiled from: CountryConfigureWebPrivateProfileUseCase.kt */
    @SourceDebugExtension({"SMAP\nCountryConfigureWebPrivateProfileUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryConfigureWebPrivateProfileUseCase.kt\ncom/bbva/glomohybrid/cellsweb/presentation/usecase/CountryConfigureWebPrivateProfileUseCase$naturalAuthDataManager$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,104:1\n41#2,6:105\n47#2:112\n133#3:111\n107#4:113\n*S KotlinDebug\n*F\n+ 1 CountryConfigureWebPrivateProfileUseCase.kt\ncom/bbva/glomohybrid/cellsweb/presentation/usecase/CountryConfigureWebPrivateProfileUseCase$naturalAuthDataManager$2\n*L\n46#1:105,6\n46#1:112\n46#1:111\n46#1:113\n*E\n"})
    public static final class c extends Lambda implements Function0<NaturalAuthDataManager> {
        public c() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final NaturalAuthDataManager invoke() {
            ViewModelComponentsProviders viewModelComponentsProviders = CountryConfigureWebPrivateProfileUseCase.this.f31687a;
            Object obj = (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(FidoNetworkManager.class), null, null);
            if (obj instanceof NaturalAuthDataManager) {
                return (NaturalAuthDataManager) obj;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountryConfigureWebPrivateProfileUseCase(@NotNull final ViewModelComponentsProviders provider, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        this.f31687a = provider;
        this.f31688b = threadDispatchers;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f31689c = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<LoginDataManager>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.login.datamanager.LoginDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LoginDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(LoginDataManager.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f31690d = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<WebProfileLoader>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.core.WebProfileLoader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebProfileLoader invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(WebProfileLoader.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f31691e = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<SessionTokenGenerator>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.session.SessionTokenGenerator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SessionTokenGenerator invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SessionTokenGenerator.class), objArr4, objArr5);
            }
        });
        this.f31692f = LazyKt__LazyJVMKt.lazy(new c());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.f31693g = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<SingleSignOnDataManager<SingleSignOnResponse>>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.singlesignon.SingleSignOnDataManager<com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SingleSignOnDataManager<SingleSignOnResponse> invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SingleSignOnDataManager.class), objArr6, objArr7);
            }
        });
    }

    public static final LoginDataManager access$getLoginDataManager(CountryConfigureWebPrivateProfileUseCase countryConfigureWebPrivateProfileUseCase) {
        return (LoginDataManager) countryConfigureWebPrivateProfileUseCase.f31689c.getValue();
    }

    public static final SingleSignOnDataManager access$getSsoDataManager(CountryConfigureWebPrivateProfileUseCase countryConfigureWebPrivateProfileUseCase) {
        return (SingleSignOnDataManager) countryConfigureWebPrivateProfileUseCase.f31693g.getValue();
    }

    @Override // com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase
    public void configureAuthenticationProfiles(@NotNull UserType params) {
        Intrinsics.checkNotNullParameter(params, "params");
        configureLoginDataManager(params.name());
        configureNaturalAuthDataManager(params.name());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase
    public void configureLoginDataManager(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringQualifier stringQualifierNamed = QualifierKt.named(type);
        ViewModelComponentsProviders viewModelComponentsProviders = this.f31687a;
        ((LoginDataManager) this.f31689c.getValue()).setProperties(((AuthConfiguration) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(AuthConfiguration.class), stringQualifierNamed, null)).generateSSOAuthConfig());
    }

    @Override // com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase
    public void configureNaturalAuthDataManager(@NotNull String type) {
        NaturalAuthDataManager naturalAuthDataManager;
        Intrinsics.checkNotNullParameter(type, "type");
        ConsumerIdSelector consumerIdSelector = (ConsumerIdSelector) androidx.camera.core.impl.utils.c.f(this.f31687a).getOrNull(Reflection.getOrCreateKotlinClass(ConsumerIdSelector.class), ConsumerIdSelectorKt.consumerIdNamed(type), null);
        if (consumerIdSelector == null || (naturalAuthDataManager = (NaturalAuthDataManager) this.f31692f.getValue()) == null) {
            return;
        }
        naturalAuthDataManager.setConsumerId(consumerIdSelector.getConsumerId());
    }

    @Override // com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase
    @Nullable
    public Object doLogin(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super LoginResult<LoginResponse>> continuation) {
        return BuildersKt.withContext(this.f31688b.io(), new a(str, str2, null), continuation);
    }

    @Override // com.bbva.glomohybrid.base.handler.SingleAppHostChangerHandler
    public void handleHostChangeNotification(@NotNull MessageDispatcher messageDispatcher, @NotNull MainStorage mainStorage, @NotNull String str) {
        ConfigureWebPrivateProfileUseCase.DefaultImpls.handleHostChangeNotification(this, messageDispatcher, mainStorage, str);
    }

    @Override // com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase
    public boolean isProfileChanged(@NotNull UserType userType) {
        Intrinsics.checkNotNullParameter(userType, "userType");
        return !((WebProfileLoader) this.f31690d.getValue()).isLoaded(userType.getWebId());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull ConfigureWebPrivateProfileParams configureWebPrivateProfileParams, @NotNull Continuation<? super SwitchPrivateProfileResult> continuation) {
        b bVar;
        CountryConfigureWebPrivateProfileUseCase countryConfigureWebPrivateProfileUseCase;
        SingleSignOnResponse singleSignOnResponse;
        String pkcs7;
        SingleSignOnResponse singleSignOnResponse2;
        String id;
        String strReplace$default;
        CountryConfigureWebPrivateProfileUseCase countryConfigureWebPrivateProfileUseCase2;
        Data data;
        Customer customer;
        Uac uac;
        Data data2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f31702t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f31702t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithContext = bVar.f31700r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f31702t0;
        if (i11 != 0) {
            if (i11 == 1) {
                configureWebPrivateProfileParams = bVar.f31699q0;
                countryConfigureWebPrivateProfileUseCase = bVar.f31698p0;
                ResultKt.throwOnFailure(objWithContext);
            } else if (i11 == 2) {
                configureWebPrivateProfileParams = bVar.f31699q0;
                countryConfigureWebPrivateProfileUseCase = bVar.f31698p0;
                ResultKt.throwOnFailure(objWithContext);
                FetchResult fetchResult = (FetchResult) objWithContext;
                singleSignOnResponse = (SingleSignOnResponse) FetchResultKt.getOrNull(fetchResult);
                if (singleSignOnResponse != null || (data2 = singleSignOnResponse.getData()) == null) {
                    pkcs7 = null;
                } else {
                    pkcs7 = data2.getPkcs7();
                }
                singleSignOnResponse2 = (SingleSignOnResponse) FetchResultKt.getOrNull(fetchResult);
                if (singleSignOnResponse2 != null || (data = singleSignOnResponse2.getData()) == null || (customer = data.getCustomer()) == null || (uac = customer.getUac()) == null) {
                    id = null;
                } else {
                    id = uac.getId();
                }
                strReplace$default = id != null ? l.replace$default(id, SUBSTRING_REMOVE, "", false, 4, (Object) null) : null;
                if (strReplace$default == null) {
                    strReplace$default = "";
                }
                if (pkcs7 == null) {
                    pkcs7 = "";
                }
                bVar.f31698p0 = countryConfigureWebPrivateProfileUseCase;
                bVar.f31699q0 = configureWebPrivateProfileParams;
                bVar.f31702t0 = 3;
                objWithContext = countryConfigureWebPrivateProfileUseCase.doLogin(strReplace$default, pkcs7, bVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                countryConfigureWebPrivateProfileUseCase2 = countryConfigureWebPrivateProfileUseCase;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                configureWebPrivateProfileParams = bVar.f31699q0;
                countryConfigureWebPrivateProfileUseCase2 = bVar.f31698p0;
                ResultKt.throwOnFailure(objWithContext);
            }
            if (((LoginResult) objWithContext) instanceof LoginResult.Success) {
                return ProfileError.INSTANCE;
            }
            ((WebProfileLoader) countryConfigureWebPrivateProfileUseCase2.f31690d.getValue()).loadWeb(configureWebPrivateProfileParams.getProfile().getWebId());
            return new ProfileLoaded(configureWebPrivateProfileParams.getProfile());
        }
        ResultKt.throwOnFailure(objWithContext);
        configureAuthenticationProfiles(configureWebPrivateProfileParams.getProfile());
        SessionTokenGenerator sessionTokenGenerator = (SessionTokenGenerator) this.f31691e.getValue();
        UserType profile = configureWebPrivateProfileParams.getProfile();
        bVar.f31698p0 = this;
        bVar.f31699q0 = configureWebPrivateProfileParams;
        bVar.f31702t0 = 1;
        if (sessionTokenGenerator.generate(profile, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        countryConfigureWebPrivateProfileUseCase = this;
        if (!countryConfigureWebPrivateProfileUseCase.isProfileChanged(configureWebPrivateProfileParams.getProfile())) {
            return ProfileAlreadyLoaded.INSTANCE;
        }
        if (configureWebPrivateProfileParams.getProfile() == UserType.PERSONAL) {
            ((WebProfileLoader) countryConfigureWebPrivateProfileUseCase.f31690d.getValue()).loadWeb(configureWebPrivateProfileParams.getProfile().getWebId());
            return new ProfileLoaded(configureWebPrivateProfileParams.getProfile());
        }
        bVar.f31698p0 = countryConfigureWebPrivateProfileUseCase;
        bVar.f31699q0 = configureWebPrivateProfileParams;
        bVar.f31702t0 = 2;
        objWithContext = BuildersKt.withContext(countryConfigureWebPrivateProfileUseCase.f31688b.io(), new j8.a(countryConfigureWebPrivateProfileUseCase, null), bVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        FetchResult fetchResult2 = (FetchResult) objWithContext;
        singleSignOnResponse = (SingleSignOnResponse) FetchResultKt.getOrNull(fetchResult2);
        if (singleSignOnResponse != null) {
            pkcs7 = null;
        } else {
            pkcs7 = null;
        }
        singleSignOnResponse2 = (SingleSignOnResponse) FetchResultKt.getOrNull(fetchResult2);
        if (singleSignOnResponse2 != null) {
            id = null;
        } else {
            id = null;
        }
        if (id != null) {
        }
        if (strReplace$default == null) {
            strReplace$default = "";
        }
        if (pkcs7 == null) {
            pkcs7 = "";
        }
        bVar.f31698p0 = countryConfigureWebPrivateProfileUseCase;
        bVar.f31699q0 = configureWebPrivateProfileParams;
        bVar.f31702t0 = 3;
        objWithContext = countryConfigureWebPrivateProfileUseCase.doLogin(strReplace$default, pkcs7, bVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        countryConfigureWebPrivateProfileUseCase2 = countryConfigureWebPrivateProfileUseCase;
        if (((LoginResult) objWithContext) instanceof LoginResult.Success) {
            return ProfileError.INSTANCE;
        }
        ((WebProfileLoader) countryConfigureWebPrivateProfileUseCase2.f31690d.getValue()).loadWeb(configureWebPrivateProfileParams.getProfile().getWebId());
        return new ProfileLoaded(configureWebPrivateProfileParams.getProfile());
    }

    public /* synthetic */ CountryConfigureWebPrivateProfileUseCase(ViewModelComponentsProviders viewModelComponentsProviders, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
