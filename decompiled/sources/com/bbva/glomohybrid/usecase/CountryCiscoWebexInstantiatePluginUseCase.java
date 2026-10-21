package com.bbva.glomohybrid.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.cellscore.web.plugin.PluginFactory;
import com.bbva.glomohybrid.base.provider.DynamicModulePluginProvider;
import com.bbva.glomohybrid.base.usecase.CiscoWebexInstantiatePluginUseCase;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CountryCiscoWebexInstantiatePluginUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/usecase/CountryCiscoWebexInstantiatePluginUseCase;", "Lcom/bbva/glomohybrid/base/usecase/CiscoWebexInstantiatePluginUseCase;", "", "execute", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryCiscoWebexInstantiatePluginUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryCiscoWebexInstantiatePluginUseCase.kt\ncom/bbva/glomohybrid/usecase/CountryCiscoWebexInstantiatePluginUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,25:1\n56#2,6:26\n*S KotlinDebug\n*F\n+ 1 CountryCiscoWebexInstantiatePluginUseCase.kt\ncom/bbva/glomohybrid/usecase/CountryCiscoWebexInstantiatePluginUseCase\n*L\n13#1:26,6\n*E\n"})
public final class CountryCiscoWebexInstantiatePluginUseCase implements CiscoWebexInstantiatePluginUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f34717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DynamicModulePluginProvider f34718b;

    /* JADX INFO: compiled from: CountryCiscoWebexInstantiatePluginUseCase.kt */
    public static final class a extends Lambda implements Function0<Plugin> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return CountryCiscoWebexInstantiatePluginUseCase.this.f34718b.getPlugin();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountryCiscoWebexInstantiatePluginUseCase(@NotNull final ViewModelComponentsProviders provider) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34717a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PluginFactory>() { // from class: com.bbva.glomohybrid.usecase.CountryCiscoWebexInstantiatePluginUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.cellscore.web.plugin.PluginFactory, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PluginFactory invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(PluginFactory.class), qualifier, objArr);
            }
        });
        Class<?> cls = Class.forName("com.bbva.ciscowebex.provider.CiscoWebexDynamicModuleProvider");
        Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
        R rCall = ((KFunction) CollectionsKt___CollectionsKt.first(JvmClassMappingKt.getKotlinClass(cls).getConstructors())).call(provider);
        Intrinsics.checkNotNull(rCall, "null cannot be cast to non-null type com.bbva.glomohybrid.base.provider.DynamicModulePluginProvider");
        this.f34718b = (DynamicModulePluginProvider) rCall;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit execute() {
        execute2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2() {
        Lazy lazy = this.f34717a;
        if (((PluginFactory) lazy.getValue()).get("CiscoWebex") == null) {
            this.f34718b.loadDynamicModule();
            ((PluginFactory) lazy.getValue()).add("CiscoWebex", new a());
        }
    }
}
