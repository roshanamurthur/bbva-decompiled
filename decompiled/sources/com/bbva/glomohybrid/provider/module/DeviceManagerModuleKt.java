package com.bbva.glomohybrid.provider.module;

import com.bbva.component_devicemanager.data.GlobalDeviceManagerData;
import com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource;
import com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceCheckerPlayIntegrityRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUIdRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: DeviceManagerModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getDeviceManagerModule", "()Lorg/koin/core/module/Module;", "deviceManagerModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class DeviceManagerModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33960a = ModuleDSLKt.module$default(false, a.f33961p0, 1, null);

    /* JADX INFO: compiled from: DeviceManagerModule.kt */
    @SourceDebugExtension({"SMAP\nDeviceManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerModule.kt\ncom/bbva/glomohybrid/provider/module/DeviceManagerModuleKt$deviceManagerModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,35:1\n103#2,6:36\n109#2,5:63\n103#2,6:68\n109#2,5:95\n103#2,6:100\n109#2,5:127\n103#2,6:132\n109#2,5:159\n201#3,6:42\n207#3:62\n201#3,6:74\n207#3:94\n201#3,6:106\n207#3:126\n201#3,6:138\n207#3:158\n105#4,14:48\n105#4,14:80\n105#4,14:112\n105#4,14:144\n*S KotlinDebug\n*F\n+ 1 DeviceManagerModule.kt\ncom/bbva/glomohybrid/provider/module/DeviceManagerModuleKt$deviceManagerModule$1\n*L\n15#1:36,6\n15#1:63,5\n16#1:68,6\n16#1:95,5\n24#1:100,6\n24#1:127,5\n33#1:132,6\n33#1:159,5\n15#1:42,6\n15#1:62\n16#1:74,6\n16#1:94\n24#1:106,6\n24#1:126\n33#1:138,6\n33#1:158\n15#1:48,14\n16#1:80,14\n24#1:112,14\n33#1:144,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33961p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            s2 s2Var = s2.f34161p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DeviceManagerGmsApi.class), null, s2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            t2 t2Var = t2.f34169p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GlobalDeviceManagerData.class), null, t2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(DeviceManagerDataSource.class));
            u2 u2Var = u2.f34177p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceCheckerPlayIntegrityRequest.class), null, u2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            v2 v2Var = v2.f34185p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceUIdRequest.class), null, v2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getDeviceManagerModule() {
        return f33960a;
    }
}
