package com.bbva.glomohybrid.provider.module;

import android.content.Context;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.repository.datasource.StorageDataSource;
import com.bbva.glomohybrid.base.webApp.WebAppConstants;
import com.bbva.glomohybrid.interceptors.UserAgentInterceptor;
import com.bbva.glomoutils.network.ImageFetcher;
import com.bbva.network.ConnectionChecker;
import com.bbva.network.NetworkWorker;
import com.bbva.network.impl.OkHttpNetworkWorker;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.ConnectionThreshold;
import com.bbva.network.model.pinning.PinningCatalog;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
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

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "networkModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Module.kt\norg/koin/core/module/Module\n+ 4 Module.kt\norg/koin/core/module/ModuleKt\n+ 5 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,110:1\n1855#2,2:111\n103#3,6:113\n109#3,5:140\n201#4,6:119\n207#4:139\n105#5,14:125\n*S KotlinDebug\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt\n*L\n90#1:111,2\n96#1:113,6\n96#1:140,5\n96#1:119,6\n96#1:139\n96#1:125,14\n*E\n"})
public final class NetworkModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33979a = ModuleDSLKt.module$default(false, a.f33980p0, 1, null);

    /* JADX INFO: compiled from: NetworkModule.kt */
    @SourceDebugExtension({"SMAP\nNetworkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt$networkModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,110:1\n103#2,6:111\n109#2,5:138\n147#2,14:143\n161#2,2:173\n147#2,14:175\n161#2,2:205\n103#2,6:207\n109#2,5:234\n151#2,10:239\n161#2,2:265\n147#2,14:267\n161#2,2:297\n201#3,6:117\n207#3:137\n216#3:157\n217#3:172\n216#3:189\n217#3:204\n201#3,6:213\n207#3:233\n216#3:249\n217#3:264\n216#3:281\n217#3:296\n105#4,14:123\n105#4,14:158\n105#4,14:190\n105#4,14:219\n105#4,14:250\n105#4,14:282\n*S KotlinDebug\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt$networkModule$1\n*L\n33#1:111,6\n33#1:138,5\n39#1:143,14\n39#1:173,2\n47#1:175,14\n47#1:205,2\n53#1:207,6\n53#1:234,5\n57#1:239,10\n57#1:265,2\n63#1:267,14\n63#1:297,2\n33#1:117,6\n33#1:137\n39#1:157\n39#1:172\n47#1:189\n47#1:204\n53#1:213,6\n53#1:233\n57#1:249\n57#1:264\n63#1:281\n63#1:296\n33#1:123,14\n39#1:158,14\n47#1:190,14\n53#1:219,14\n57#1:250,14\n63#1:282,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33980p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            y4 y4Var = y4.f34211p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(CookieManager.class), null, y4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(CookieHandler.class));
            z4 z4Var = z4.f34219p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, z4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            a5 a5Var = a5.f34006p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserAgentInterceptor.class), null, a5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            b5 b5Var = b5.f34015p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, b5Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            StringQualifier stringQualifierE = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF2, WebAppConstants.NETWORK_WORKER_WEB_APP);
            c5 c5Var = c5.f34024p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NetworkWorker.class), stringQualifierE, c5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            NetworkModuleKt.access$addPinningCatalog(module2);
            d5 d5Var = d5.f34033p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ImageFetcher.class), null, d5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    public static final void access$addPinningCatalog(Module module) {
        aa.a aVar = aa.a.f213p0;
        SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PinningCatalog.class), null, aVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryF);
        }
        new KoinDefinition(module, singleInstanceFactoryF);
    }

    public static final NetworkWorker access$privateNetworkWorkerFactory(Context context, OkHttpClient okHttpClient, PinningCatalog pinningCatalog, CookieManager cookieManager, List list, StorageDataSource storageDataSource) {
        ConnectionThreshold connectionThreshold;
        ConnectionChecker connectionChecker = null;
        AppSettings appSettings = storageDataSource.get();
        if (appSettings == null || (connectionThreshold = appSettings.getNetworkSpeedConfiguration()) == null) {
            connectionThreshold = new ConnectionThreshold(null, null, 3, null);
        }
        OkHttpNetworkWorker okHttpNetworkWorker = new OkHttpNetworkWorker(context, okHttpClient, pinningCatalog, cookieManager, connectionChecker, connectionThreshold, 16, null);
        Iterator it = CollectionsKt___CollectionsKt.filterNotNull(list).iterator();
        while (it.hasNext()) {
            okHttpNetworkWorker.addInterceptor((NetworkInterceptor) it.next());
        }
        return okHttpNetworkWorker;
    }

    @NotNull
    public static final Module getNetworkModule() {
        return f33979a;
    }
}
