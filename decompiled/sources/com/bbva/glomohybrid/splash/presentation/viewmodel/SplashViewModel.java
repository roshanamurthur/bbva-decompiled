package com.bbva.glomohybrid.splash.presentation.viewmodel;

import androidx.camera.core.imagecapture.a;
import androidx.camera.core.impl.utils.c;
import com.bbva.component.dm.biometriclogin.domain.handler.BiometricMigratorHandler;
import com.bbva.glomohybrid.base.behaviors.AppShortcutsCreator;
import com.bbva.glomohybrid.base.viewmodel.Action;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.domain.model.ProfilingStorePolicy;
import com.bbva.glomohybrid.profiling.domain.usecase.SyncProfilingUseCase;
import com.bbva.notifications.domain.TrackShortcutEventUseCase;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: SplashViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/viewmodel/SplashViewModel;", "Lcom/bbva/glomohybrid/splash/presentation/viewmodel/SplashGlobalViewModel;", "", "setupActions", "loadRememberedUser", "fetchProfiling", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shortcutId", "trackShortcutEvent", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "zipActionsFlow", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;)V", "Companion", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSplashViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashViewModel.kt\ncom/bbva/glomohybrid/splash/presentation/viewmodel/SplashViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n+ 6 Koin.kt\norg/koin/core/Koin\n*L\n1#1,56:1\n56#2,6:57\n41#2,6:69\n47#2:76\n41#2,6:78\n47#2:85\n29#3,4:63\n37#4,2:67\n133#5:75\n133#5:84\n107#6:77\n107#6:86\n*S KotlinDebug\n*F\n+ 1 SplashViewModel.kt\ncom/bbva/glomohybrid/splash/presentation/viewmodel/SplashViewModel\n*L\n23#1:57,6\n43#1:69,6\n43#1:76\n48#1:78,6\n48#1:85\n26#1:63,4\n32#1:67,2\n43#1:75\n48#1:84\n43#1:77\n48#1:86\n*E\n"})
public final class SplashViewModel extends SplashGlobalViewModel {

    @NotNull
    public static final String ID = "splash-view-model";

    @NotNull
    public final Lazy M0;

    @NotNull
    public final Lazy N0;

    /* JADX INFO: compiled from: SplashViewModel.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f34598p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f34598p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(this.f34598p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SplashViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull ZipActionsFlow zipActionsFlow) {
        super(provider, zipActionsFlow, null, 4, null);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(zipActionsFlow, "zipActionsFlow");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.M0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AppShortcutsCreator>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.behaviors.AppShortcutsCreator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppShortcutsCreator invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AppShortcutsCreator.class), qualifier, objArr);
            }
        });
        final a aVar = new a(provider);
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.N0 = LazyKt__LazyJVMKt.lazy(new Function0<TrackShortcutEventUseCase>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.notifications.domain.TrackShortcutEventUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final TrackShortcutEventUseCase invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(TrackShortcutEventUseCase.class), objArr2, aVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel
    @Nullable
    public Object fetchProfiling(@NotNull Continuation<? super Unit> continuation) {
        ViewModelComponentsProviders provider = getProvider();
        Object objExecute2 = ((SyncProfilingUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : c.f(provider)).get(Reflection.getOrCreateKotlinClass(SyncProfilingUseCase.class), null, null)).execute(ProfilingStorePolicy.REMOTE, (Continuation<? super Profiling>) continuation);
        return objExecute2 == ek.a.getCOROUTINE_SUSPENDED() ? objExecute2 : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel
    public void loadRememberedUser() {
        ViewModelComponentsProviders provider = getProvider();
        ((BiometricMigratorHandler) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : c.f(provider)).get(Reflection.getOrCreateKotlinClass(BiometricMigratorHandler.class), null, null)).execute();
        super.loadRememberedUser();
        ((AppShortcutsCreator) this.M0.getValue()).create();
    }

    @Override // com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel
    public void setupActions() {
        super.setupActions();
        ZipActionsFlow zipActionsFlow = getZipActionsFlow();
        Action[] actionArr = (Action[]) biometricActionsFlow().toArray(new Action[0]);
        zipActionsFlow.addActions((Action[]) Arrays.copyOf(actionArr, actionArr.length));
    }

    @Override // com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel
    public void trackShortcutEvent(@NotNull String shortcutId) {
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        TrackShortcutEventUseCase trackShortcutEventUseCase = (TrackShortcutEventUseCase) this.N0.getValue();
        if (trackShortcutEventUseCase != null) {
            trackShortcutEventUseCase.execute(shortcutId);
        }
    }
}
