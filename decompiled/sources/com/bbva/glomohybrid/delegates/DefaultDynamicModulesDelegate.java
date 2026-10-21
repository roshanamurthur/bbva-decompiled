package com.bbva.glomohybrid.delegates;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.cells.channels.CellsDynamicFeatureChannels;
import com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate;
import com.bbva.glomohybrid.base.usecase.CiscoWebexInstantiatePluginUseCase;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.constants.DynamicModulesConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: DefaultDynamicModulesDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/delegates/DefaultDynamicModulesDelegate;", "Lcom/bbva/glomohybrid/base/delegates/DynamicModulesDelegate;", "", "dynamicModule", "", "loadDynamicModule", "notifyIsDynamicModuleInstalled", "channel", "notifyEvent", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "a", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "getProvider", "()Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultDynamicModulesDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultDynamicModulesDelegate.kt\ncom/bbva/glomohybrid/delegates/DefaultDynamicModulesDelegate\n+ 2 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProviderKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,41:1\n188#2,5:42\n193#2,3:49\n107#3:47\n133#4:48\n*S KotlinDebug\n*F\n+ 1 DefaultDynamicModulesDelegate.kt\ncom/bbva/glomohybrid/delegates/DefaultDynamicModulesDelegate\n*L\n23#1:42,5\n23#1:49,3\n23#1:47\n23#1:48\n*E\n"})
public abstract class DefaultDynamicModulesDelegate implements DynamicModulesDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelComponentsProviders provider;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f32037b;

    /* JADX INFO: compiled from: DefaultDynamicModulesDelegate.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(DefaultDynamicModulesDelegate.this.getProvider());
        }
    }

    /* JADX INFO: compiled from: DefaultDynamicModulesDelegate.kt */
    public static final class b extends Lambda implements Function0<MessageDispatcher> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            return (MessageDispatcher) DefaultDynamicModulesDelegate.this.getProvider().provide("web-dispatcher");
        }
    }

    public DefaultDynamicModulesDelegate(@NotNull ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
        this.f32037b = LazyKt__LazyJVMKt.lazy(new b());
    }

    @NotNull
    public final ViewModelComponentsProviders getProvider() {
        return this.provider;
    }

    public final void loadDynamicModule(@NotNull String dynamicModule) {
        Intrinsics.checkNotNullParameter(dynamicModule, "dynamicModule");
        if (Intrinsics.areEqual(dynamicModule, DynamicModulesConstants.CISCO_WEBEX)) {
            ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
            Object obj = null;
            try {
                obj = viewModelComponentsProviders.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CiscoWebexInstantiatePluginUseCase.class), null, new a());
            } catch (Exception unused) {
            }
            CiscoWebexInstantiatePluginUseCase ciscoWebexInstantiatePluginUseCase = (CiscoWebexInstantiatePluginUseCase) obj;
            if (ciscoWebexInstantiatePluginUseCase != null) {
                ciscoWebexInstantiatePluginUseCase.execute();
            }
        }
    }

    public final void notifyEvent(@NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.f32037b.getValue();
        if (messageDispatcher != null) {
            messageDispatcher.notifyEvent(channel);
        }
    }

    @Override // com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate
    public void notifyIsDynamicModuleInstalled(@NotNull String dynamicModule) {
        Intrinsics.checkNotNullParameter(dynamicModule, "dynamicModule");
        boolean zIsDynamicModuleInstalled = isDynamicModuleInstalled(dynamicModule);
        if (zIsDynamicModuleInstalled) {
            loadDynamicModule(dynamicModule);
        }
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.f32037b.getValue();
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(CellsDynamicFeatureChannels.CELLS_IS_DYNAMIC_MODULE_INSTALLED_CHANNEL, Boolean.valueOf(zIsDynamicModuleInstalled));
        }
    }
}
