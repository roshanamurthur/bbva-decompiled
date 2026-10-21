package com.bbva.glomohybrid.welcome.presentation.viewmodel;

import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.ViewModelKt;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: WelcomeViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/viewmodel/WelcomeViewModel;", "Lcom/bbva/glomohybrid/welcome/presentation/viewmodel/WelcomeGlobalViewModel;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent;", "intent", "", "openWeb", "getRegisterButtonConfigFromFeatureFlag", "", "status", "sendIsPageReadyStatus", "K0", "Z", "getTryToOpenOpenWeb", "()Z", "setTryToOpenOpenWeb", "(Z)V", "tryToOpenOpenWeb", "", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Companion", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWelcomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeViewModel.kt\ncom/bbva/glomohybrid/welcome/presentation/viewmodel/WelcomeViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,56:1\n56#2,6:57\n*S KotlinDebug\n*F\n+ 1 WelcomeViewModel.kt\ncom/bbva/glomohybrid/welcome/presentation/viewmodel/WelcomeViewModel\n*L\n23#1:57,6\n*E\n"})
public final class WelcomeViewModel extends WelcomeGlobalViewModel {

    @NotNull
    public static final String ID = "welcome-view-model";

    @NotNull
    public final Lazy J0;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public boolean tryToOpenOpenWeb;

    /* JADX INFO: compiled from: WelcomeViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeViewModel$getRegisterButtonConfigFromFeatureFlag$1", f = "WelcomeViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34842p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WelcomeViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34842p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                WelcomeViewModel welcomeViewModel = WelcomeViewModel.this;
                boolean zIsRefactorN2Enabled = FeatureFlagRepositoryExtensionKt.isRefactorN2Enabled(WelcomeViewModel.access$getFeatureFlagsRepository(welcomeViewModel));
                MutableSharedFlow<WelcomeContract.State> mutableSharedFlow = welcomeViewModel.get_state();
                WelcomeContract.State state = zIsRefactorN2Enabled ? WelcomeContract.State.RegisterUserEnabled.INSTANCE : WelcomeContract.State.RegisterUserDisabled.INSTANCE;
                this.f34842p0 = 1;
                if (mutableSharedFlow.emit(state, this) == coroutine_suspended) {
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
    public WelcomeViewModel(@NotNull final ViewModelComponentsProviders provider) {
        super(provider, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.J0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FeatureFlagsRepository>() { // from class: com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FeatureFlagsRepository invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), objArr, objArr2);
            }
        });
    }

    public static final FeatureFlagsRepository access$getFeatureFlagsRepository(WelcomeViewModel welcomeViewModel) {
        return (FeatureFlagsRepository) welcomeViewModel.J0.getValue();
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel, com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return "welcome-view-model";
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel
    public void getRegisterButtonConfigFromFeatureFlag() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    public final boolean getTryToOpenOpenWeb() {
        return this.tryToOpenOpenWeb;
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel
    public void openWeb(@NotNull WelcomeContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (getIsLoadingPageReady()) {
            setIntent(new WelcomeContract.Intent.OpenWeb(CountryRouteConstants.DIGITAL_ACCOUNT));
        } else {
            showSpinner(true);
            this.tryToOpenOpenWeb = true;
        }
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel
    public void sendIsPageReadyStatus(boolean status) {
        setLoadingPageReady(status);
        if (getIsLoadingPageReady() && this.tryToOpenOpenWeb) {
            setIntent(new WelcomeContract.Intent.OpenWeb(CountryRouteConstants.DIGITAL_ACCOUNT));
            showSpinner(false);
        }
    }

    public final void setTryToOpenOpenWeb(boolean z10) {
        this.tryToOpenOpenWeb = z10;
    }
}
