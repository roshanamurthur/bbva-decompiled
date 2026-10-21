package com.bbva.ethermobilesdk.pinning;

import android.content.Context;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.pinning.data.catalog.SiteCatalogDTO;
import com.bbva.ethermobilesdk.pinning.extension.ExceptionKt;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.ProviderProperties;
import com.bbva.ethermobilesdk.pinning.model.ProviderType;
import com.bbva.ethermobilesdk.pinning.model.catalog.Catalog;
import com.bbva.ethermobilesdk.pinning.model.catalog.Site;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningConfig;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningGlobalEnvironment;
import com.bbva.ethermobilesdk.pinning.provider.SiteProvider;
import com.bbva.ethermobilesdk.pinning.provider.site.CatalogProvider;
import com.bbva.ethermobilesdk.pinning.provider.site.InternalCatalogProvider;
import com.noknok.android.client.utils.UIConfigTags;
import ek.a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SiteManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004J\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\bJ\b\u0010\u001f\u001a\u00020\u000fH\u0002J\u0006\u0010 \u001a\u00020\u000fJ\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J\u0011\u0010$\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%J\u001d\u0010&\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0002\b(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/SiteManager;", "", "()V", "ERROR_LOADING_CATALOG", "", "catalog", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Catalog;", "configuration", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningConfig;", "provider", "Lcom/bbva/ethermobilesdk/pinning/provider/SiteProvider;", "timeStampLastReset", "", "timeStampLastUpdate", "configureProviderChain", "", "catalogConfig", "first", UIConfigTags.TAG_SECOND, "configureProviderChain$pinning_release", "getProviderProperties", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderProperties;", "type", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;", "getProviderProperties$pinning_release", "getSiteByHost", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Site;", "host", "init", "context", "Landroid/content/Context;", "loadCatalog", "loadCatalogSynchronized", "replaceCatalogIfNewer", "siteCatalog", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastModified", "lastModified", "setLastModified$pinning_release", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SiteManager {

    @NotNull
    private static final String ERROR_LOADING_CATALOG = "An error has happened while trying to load the catalog";

    @NotNull
    public static final SiteManager INSTANCE = new SiteManager();

    @Nullable
    private static Catalog catalog;

    @Nullable
    private static PinningConfig configuration;
    private static SiteProvider provider;
    private static long timeStampLastReset;
    private static long timeStampLastUpdate;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.pinning.SiteManager$init$1, reason: invalid class name */
    /* JADX INFO: compiled from: SiteManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.bbva.ethermobilesdk.pinning.SiteManager$init$1", f = "SiteManager.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.bbva.ethermobilesdk.pinning.SiteManager$init$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SiteManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.bbva.ethermobilesdk.pinning.SiteManager$init$1$1", f = "SiteManager.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        public static final class C01271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public C01271(Continuation<? super C01271> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C01271(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SiteManager siteManager = SiteManager.INSTANCE;
                    this.label = 1;
                    if (siteManager.reset(this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C01271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C01271 c01271 = new C01271(null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c01271, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SiteManager() {
    }

    private final synchronized void loadCatalog() {
        try {
            SiteProvider siteProvider = null;
            LoggerKt.log$default(null, "sitemanager load catalog", 1, null);
            if (catalog == null) {
                LoggerKt.log$default(null, "sitemanager catalog is null", 1, null);
                try {
                    SiteProvider siteProvider2 = provider;
                    if (siteProvider2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("provider");
                    } else {
                        siteProvider = siteProvider2;
                    }
                    PinningConfig pinningConfig = configuration;
                    Intrinsics.checkNotNull(pinningConfig);
                    Catalog catalogLoad = siteProvider.load(pinningConfig);
                    if (catalogLoad == null) {
                        ExceptionKt.throwError(ERROR_LOADING_CATALOG);
                        throw new KotlinNothingValueException();
                    }
                    catalog = catalogLoad;
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    if (message == null) {
                        message = ERROR_LOADING_CATALOG;
                    }
                    ExceptionKt.throwError("Load catalog: ".concat(message), th2);
                    throw new KotlinNothingValueException();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reset(Continuation<? super Unit> continuation) {
        synchronized (SiteManagerKt.getLock()) {
            try {
                LoggerKt.log$default(null, "sitemanager reset catalog", 1, null);
                timeStampLastReset = System.currentTimeMillis();
                SiteProvider siteProvider = provider;
                if (siteProvider == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("provider");
                    siteProvider = null;
                }
                SiteProvider.reset$default(siteProvider, null, 1, null);
                catalog = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    public final void configureProviderChain$pinning_release(@NotNull PinningConfig catalogConfig, @NotNull SiteProvider first, @Nullable SiteProvider second) {
        Intrinsics.checkNotNullParameter(catalogConfig, "catalogConfig");
        Intrinsics.checkNotNullParameter(first, "first");
        first.setNext(second);
        if (second != null) {
            second.setPrevious(first);
        }
        provider = first;
        configuration = catalogConfig;
    }

    @Nullable
    public final ProviderProperties getProviderProperties$pinning_release(@NotNull ProviderType type) {
        ProviderProperties properties;
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (SiteManagerKt.getLock()) {
            try {
                SiteProvider siteProvider = provider;
                if (siteProvider == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("provider");
                    siteProvider = null;
                }
                properties = siteProvider.getProperties(type);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return properties;
    }

    @NotNull
    public final synchronized Site getSiteByHost(@NotNull String host) {
        Site siteFindSiteFromHost;
        Intrinsics.checkNotNullParameter(host, "host");
        LoggerKt.log$default(null, "sitemanager get site by host: [" + host + Constant.BRACKET_CLOSE, 1, null);
        synchronized (SiteManagerKt.getLock()) {
            try {
                INSTANCE.loadCatalog();
                Catalog catalog2 = catalog;
                if (catalog2 == null || (siteFindSiteFromHost = catalog2.findSiteFromHost(host)) == null) {
                    ExceptionKt.throwError("Site definition [" + host + "] not found");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                try {
                    String message = th2.getMessage();
                    Catalog catalog3 = catalog;
                    List<Site> sites = catalog3 != null ? catalog3.getSites() : null;
                    ExceptionKt.throwError("SiteManager::getSiteByHost [site: " + host + "]: [" + message + "] for catalog definition [" + sites + "], Current Time[" + System.currentTimeMillis() + "]Last Update[" + timeStampLastUpdate + "] Last Reset[" + timeStampLastReset + Constant.BRACKET_CLOSE, th2);
                    throw new KotlinNothingValueException();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            throw th;
        }
        return siteFindSiteFromHost;
    }

    public final void init(@NotNull Context context, @NotNull PinningConfig catalogConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(catalogConfig, "catalogConfig");
        PinningConfig pinningConfig = configuration;
        if (pinningConfig == null || pinningConfig.getId() != catalogConfig.getId()) {
            configureProviderChain$pinning_release(catalogConfig, new CatalogProvider(context), catalogConfig.getMode() != PinningGlobalEnvironment.NONE ? new InternalCatalogProvider(context) : null);
        }
        if (catalogConfig.getResetCatalog()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(null), 3, null);
        }
    }

    public final synchronized void loadCatalogSynchronized() {
        LoggerKt.log$default(null, "sitemanager loadCatalogSynchronized", 1, null);
        synchronized (SiteManagerKt.getLock()) {
            INSTANCE.loadCatalog();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void replaceCatalogIfNewer(@NotNull ProviderType type, @NotNull SiteCatalogDTO siteCatalog) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        LoggerLevel loggerLevel = LoggerLevel.INFO;
        LoggerKt.log(loggerLevel, "sitemanager replace catalog with revision [" + siteCatalog.getRevision() + Constant.BRACKET_CLOSE);
        synchronized (SiteManagerKt.getLock()) {
            try {
                SiteProvider siteProvider = provider;
                if (siteProvider == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("provider");
                    siteProvider = null;
                }
                if (siteProvider.isNewer(type, siteCatalog)) {
                    LoggerKt.log(loggerLevel, "catalog was replaced with revision " + siteCatalog.getRevision());
                    LoggerKt.log$default(null, "sitemanager is going to reset provider", 1, null);
                    timeStampLastUpdate = System.currentTimeMillis();
                    SiteProvider siteProvider2 = provider;
                    if (siteProvider2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("provider");
                        siteProvider2 = null;
                    }
                    Catalog catalogUpdateCatalog = siteProvider2.updateCatalog(type, siteCatalog);
                    LoggerKt.log$default(null, "sitemanager did reset provider", 1, null);
                    catalog = catalogUpdateCatalog;
                } else {
                    LoggerKt.log(loggerLevel, "remote catalog is not newer, keeping existing catalog");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setLastModified$pinning_release(@NotNull ProviderType type, @NotNull String lastModified) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        synchronized (SiteManagerKt.getLock()) {
            try {
                SiteProvider siteProvider = provider;
                if (siteProvider == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("provider");
                    siteProvider = null;
                }
                siteProvider.setLastModified(type, lastModified);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
