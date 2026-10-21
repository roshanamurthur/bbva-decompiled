package com.bbva.softtokenbase.ethertoken.module;

import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.network.model.pinning.PinningCatalog;
import com.bbva.softtokenbase.PluginProvider;
import com.bbva.softtokenbase.SoftToken;
import com.bbva.softtokenbase.ethertoken.GloMoEtherToken;
import com.bbva.softtokenbase.ethertoken.GlomoEtherTokenCompat;
import com.bbva.softtokenbase.ethertoken.plugin.GloMoEtherTokenPluginProvider;
import com.bbva.softtokenbase.ethertoken.plugin.GlomoEtherTokenCompatPluginProvider;
import com.bbva.softtokenbase.store.TOTPTokenDataStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003¨\u0006\u000b"}, d2 = {"getEtherTokenCompatModule", "Lorg/koin/core/module/Module;", "appId", "", "url", "pinningCatalog", "Lcom/bbva/network/model/pinning/PinningCatalog;", "timeout", "", "getEtherTokenModule", "group", "softtokenbase_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EtherTokenModuleKt {

    /* JADX INFO: compiled from: EtherTokenModule.kt */
    @SourceDebugExtension({"SMAP\nEtherTokenModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,103:1\n103#2,6:104\n109#2,5:131\n103#2,6:136\n109#2,5:163\n103#2,6:168\n109#2,5:195\n147#2,14:200\n161#2,2:230\n201#3,6:110\n207#3:130\n201#3,6:142\n207#3:162\n201#3,6:174\n207#3:194\n216#3:214\n217#3:229\n105#4,14:116\n105#4,14:148\n105#4,14:180\n105#4,14:215\n*S KotlinDebug\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1\n*L\n74#1:104,6\n74#1:131,5\n91#1:136,6\n91#1:163,5\n93#1:168,6\n93#1:195,5\n97#1:200,14\n97#1:230,2\n74#1:110,6\n74#1:130\n91#1:142,6\n91#1:162\n93#1:174,6\n93#1:194\n97#1:214\n97#1:229\n74#1:116,14\n91#1:148,14\n93#1:180,14\n97#1:215,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36867p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f36868q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f36869r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PinningCatalog f36870s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, PinningCatalog pinningCatalog, long j10) {
            super(1);
            this.f36867p0 = str;
            this.f36868q0 = str2;
            this.f36869r0 = j10;
            this.f36870s0 = pinningCatalog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.softtokenbase.ethertoken.module.a aVar = new com.bbva.softtokenbase.ethertoken.module.a(this.f36867p0, this.f36868q0, this.f36870s0, this.f36869r0);
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(TokenCompatConfig.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(TokenCompatConfig.class));
            com.bbva.softtokenbase.ethertoken.module.b bVar = com.bbva.softtokenbase.ethertoken.module.b.f36876p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GlomoEtherTokenCompat.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(SoftToken.class));
            c cVar = c.f36877p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GlomoEtherTokenCompatPluginProvider.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF3), Reflection.getOrCreateKotlinClass(PluginProvider.class));
            e eVar = e.f36879p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TOTPTokenDataStore.class), null, eVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EtherTokenModule.kt */
    @SourceDebugExtension({"SMAP\nEtherTokenModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,103:1\n147#2,14:104\n161#2,2:134\n103#2,6:136\n109#2,5:163\n147#2,14:168\n161#2,2:198\n216#3:118\n217#3:133\n201#3,6:142\n207#3:162\n216#3:182\n217#3:197\n105#4,14:119\n105#4,14:148\n105#4,14:183\n*S KotlinDebug\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenModule$1\n*L\n35#1:104,14\n35#1:134,2\n43#1:136,6\n43#1:163,5\n51#1:168,14\n51#1:198,2\n35#1:118\n35#1:133\n43#1:142,6\n43#1:162\n51#1:182\n51#1:197\n35#1:119,14\n43#1:148,14\n51#1:183,14\n*E\n"})
    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36871p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f36871p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            String str = this.f36871p0;
            f fVar = new f(str);
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(GloMoEtherToken.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(SoftToken.class));
            h hVar = new h(str);
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GloMoEtherTokenPluginProvider.class), null, hVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(PluginProvider.class));
            j jVar = j.f36884p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TOTPTokenDataStore.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getEtherTokenCompatModule(@NotNull String appId, @NotNull String url, @Nullable PinningCatalog pinningCatalog, long j10) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(url, "url");
        return ModuleDSLKt.module$default(false, new a(url, appId, pinningCatalog, j10), 1, null);
    }

    @NotNull
    public static final Module getEtherTokenModule(@NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return ModuleDSLKt.module$default(false, new b(group), 1, null);
    }
}
