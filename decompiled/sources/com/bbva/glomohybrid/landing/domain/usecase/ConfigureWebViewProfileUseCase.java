package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.bridge.core.WebProfileLoader;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.component.dm.naturalauth.NaturalAuthDataManager;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoconfig.consumerid.ConsumerIdSelector;
import com.bbva.glomoconfig.consumerid.ConsumerIdSelectorKt;
import com.bbva.glomoconfig.login.AuthConfiguration;
import com.bbva.glomohybrid.base.handler.SingleAppHostChangerHandler;
import com.bbva.glomohybrid.base.usecase.AbstractUpdateBioCatchUseCase;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: ConfigureWebViewProfileUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/ConfigureWebViewProfileUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomo/user/domain/model/UserType;", "", "Lcom/bbva/glomohybrid/base/handler/SingleAppHostChangerHandler;", "params", "execute", "(Lcom/bbva/glomo/user/domain/model/UserType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomohybrid/base/usecase/AbstractUpdateBioCatchUseCase;", "updateBioCatchUseCase", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/base/usecase/AbstractUpdateBioCatchUseCase;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nConfigureWebViewProfileUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigureWebViewProfileUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/ConfigureWebViewProfileUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,72:1\n56#2,6:73\n56#2,6:79\n56#2,6:85\n42#3,4:91\n42#3,4:97\n120#4:95\n120#4:101\n158#5:96\n158#5:102\n*S KotlinDebug\n*F\n+ 1 ConfigureWebViewProfileUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/ConfigureWebViewProfileUseCase\n*L\n26#1:73,6\n27#1:79,6\n28#1:85,6\n56#1:91,4\n62#1:97,4\n56#1:95\n62#1:101\n56#1:96\n62#1:102\n*E\n"})
public final class ConfigureWebViewProfileUseCase implements SuspendUseCaseWithParams<UserType, Unit>, SingleAppHostChangerHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f32800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AbstractUpdateBioCatchUseCase f32801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f32802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f32803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f32804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f32805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f32806g;

    /* JADX INFO: compiled from: ConfigureWebViewProfileUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase", f = "ConfigureWebViewProfileUseCase.kt", i = {0, 0}, l = {41}, m = "execute", n = {"this", "params"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ConfigureWebViewProfileUseCase f32807p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public UserType f32808q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f32809r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f32811t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32809r0 = obj;
            this.f32811t0 |= Integer.MIN_VALUE;
            return ConfigureWebViewProfileUseCase.this.execute((UserType) null, (Continuation<? super Unit>) this);
        }
    }

    /* JADX INFO: compiled from: ConfigureWebViewProfileUseCase.kt */
    public static final class b extends Lambda implements Function0<MessageDispatcher> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            Object objProvide = ConfigureWebViewProfileUseCase.this.f32800a.provide("web-dispatcher");
            if (objProvide != null) {
                return (MessageDispatcher) objProvide;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: ConfigureWebViewProfileUseCase.kt */
    @SourceDebugExtension({"SMAP\nConfigureWebViewProfileUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigureWebViewProfileUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/ConfigureWebViewProfileUseCase$naturalAuthDataManager$2\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,72:1\n42#2,4:73\n120#3:77\n158#4:78\n*S KotlinDebug\n*F\n+ 1 ConfigureWebViewProfileUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/ConfigureWebViewProfileUseCase$naturalAuthDataManager$2\n*L\n31#1:73,4\n31#1:77\n31#1:78\n*E\n"})
    public static final class c extends Lambda implements Function0<NaturalAuthDataManager> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NaturalAuthDataManager invoke() {
            Object orNull = ConfigureWebViewProfileUseCase.this.f32800a.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(FidoNetworkManager.class), null, null);
            if (orNull instanceof NaturalAuthDataManager) {
                return (NaturalAuthDataManager) orNull;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigureWebViewProfileUseCase(@NotNull final ViewModelComponentsProviders provider, @Nullable AbstractUpdateBioCatchUseCase abstractUpdateBioCatchUseCase) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f32800a = provider;
        this.f32801b = abstractUpdateBioCatchUseCase;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32802c = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<LoginDataManager>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase$special$$inlined$inject$default$1
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
        this.f32803d = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<WebProfileLoader>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase$special$$inlined$inject$default$2
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
        this.f32804e = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<MainStorage>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase$special$$inlined$inject$default$3
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
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MainStorage.class), objArr4, objArr5);
            }
        });
        this.f32805f = LazyKt__LazyJVMKt.lazy(new c());
        this.f32806g = LazyKt__LazyJVMKt.lazy(new b());
    }

    @Override // com.bbva.glomohybrid.base.handler.SingleAppHostChangerHandler
    public void handleHostChangeNotification(@NotNull MessageDispatcher messageDispatcher, @NotNull MainStorage mainStorage, @NotNull String str) {
        SingleAppHostChangerHandler.DefaultImpls.handleHostChangeNotification(this, messageDispatcher, mainStorage, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull UserType userType, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        ConfigureWebViewProfileUseCase configureWebViewProfileUseCase;
        NaturalAuthDataManager naturalAuthDataManager;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32811t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32811t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f32809r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32811t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            StringQualifier stringQualifierNamed = QualifierKt.named(userType.name());
            ViewModelComponentsProviders viewModelComponentsProviders = this.f32800a;
            AuthConfiguration authConfiguration = (AuthConfiguration) androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders).getOrNull(Reflection.getOrCreateKotlinClass(AuthConfiguration.class), stringQualifierNamed, null);
            Lazy lazy = this.f32805f;
            if (authConfiguration != null) {
                ((LoginDataManager) this.f32802c.getValue()).setProperties(authConfiguration.generateAuthConfig());
                String strConfiguredHost = authConfiguration.configuredHost(authConfiguration.generateSSOAuthConfig());
                handleHostChangeNotification((MessageDispatcher) this.f32806g.getValue(), (MainStorage) this.f32804e.getValue(), strConfiguredHost);
                NaturalAuthDataManager naturalAuthDataManager2 = (NaturalAuthDataManager) lazy.getValue();
                if (naturalAuthDataManager2 != null) {
                    naturalAuthDataManager2.refreshHost(strConfiguredHost);
                }
            }
            ConsumerIdSelector consumerIdSelector = (ConsumerIdSelector) androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders).getOrNull(Reflection.getOrCreateKotlinClass(ConsumerIdSelector.class), ConsumerIdSelectorKt.consumerIdNamed(userType.name()), null);
            if (consumerIdSelector != null && (naturalAuthDataManager = (NaturalAuthDataManager) lazy.getValue()) != null) {
                naturalAuthDataManager.setConsumerId(consumerIdSelector.getConsumerId());
            }
            if (!((WebProfileLoader) this.f32803d.getValue()).isLoaded(userType.getWebId())) {
                AbstractUpdateBioCatchUseCase abstractUpdateBioCatchUseCase = this.f32801b;
                if (abstractUpdateBioCatchUseCase != null) {
                    aVar.f32807p0 = this;
                    aVar.f32808q0 = userType;
                    aVar.f32811t0 = 1;
                    if (abstractUpdateBioCatchUseCase.execute(userType, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                configureWebViewProfileUseCase = this;
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        userType = aVar.f32808q0;
        configureWebViewProfileUseCase = aVar.f32807p0;
        ResultKt.throwOnFailure(obj);
        ((WebProfileLoader) configureWebViewProfileUseCase.f32803d.getValue()).loadWeb(userType.getWebId());
        return Unit.INSTANCE;
    }
}
