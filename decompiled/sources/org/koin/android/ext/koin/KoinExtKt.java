package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import bk.d;
import java.io.InputStream;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.android.logger.AndroidLogger;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.registry.PropertyRegistryExtKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: KoinExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"androidContext", "Lorg/koin/core/KoinApplication;", "Landroid/content/Context;", "androidFileProperties", "koinPropertyFile", "", "androidLogger", "level", "Lorg/koin/core/logger/Level;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nKoinExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinExt.kt\norg/koin/android/ext/koin/KoinExtKt\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n32#2:109\n46#2,2:110\n33#2:112\n32#2:119\n46#2,2:120\n33#2:122\n40#2,8:123\n32#2:131\n46#2,2:132\n33#2:134\n40#2,8:135\n104#3,4:113\n133#4:117\n1#5:118\n*S KotlinDebug\n*F\n+ 1 KoinExt.kt\norg/koin/android/ext/koin/KoinExtKt\n*L\n58#1:109\n58#1:110,2\n58#1:112\n93#1:119\n93#1:120,2\n93#1:122\n96#1:123,8\n100#1:131\n100#1:132,2\n100#1:134\n104#1:135,8\n85#1:113,4\n85#1:117\n*E\n"})
public final class KoinExtKt {

    /* JADX INFO: compiled from: KoinExt.kt */
    @SourceDebugExtension({"SMAP\nKoinExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinExt.kt\norg/koin/android/ext/koin/KoinExtKt$androidContext$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,108:1\n103#2,6:109\n109#2,5:136\n201#3,6:115\n207#3:135\n105#4,14:121\n*S KotlinDebug\n*F\n+ 1 KoinExt.kt\norg/koin/android/ext/koin/KoinExtKt$androidContext$1\n*L\n63#1:109,6\n63#1:136,5\n63#1:115,6\n63#1:135\n63#1:121,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f92075p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(1);
            this.f92075p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Application.class), null, new org.koin.android.ext.koin.a(this.f92075p0), Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF), new KClass[]{Reflection.getOrCreateKotlinClass(Context.class), Reflection.getOrCreateKotlinClass(Application.class)});
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: KoinExt.kt */
    @SourceDebugExtension({"SMAP\nKoinExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinExt.kt\norg/koin/android/ext/koin/KoinExtKt$androidContext$2\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,108:1\n103#2,6:109\n109#2,5:136\n201#3,6:115\n207#3:135\n105#4,14:121\n*S KotlinDebug\n*F\n+ 1 KoinExt.kt\norg/koin/android/ext/koin/KoinExtKt$androidContext$2\n*L\n67#1:109,6\n67#1:136,5\n67#1:115,6\n67#1:135\n67#1:121,14\n*E\n"})
    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f92076p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(1);
            this.f92076p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            org.koin.android.ext.koin.b bVar = new org.koin.android.ext.koin.b(this.f92076p0);
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Context.class), null, bVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final KoinApplication androidContext(@NotNull KoinApplication koinApplication, @NotNull Context androidContext) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Logger logger = koinApplication.getKoin().getLogger();
        Level level = Level.INFO;
        if (logger.isAt(level)) {
            Logger logger2 = koinApplication.getKoin().getLogger();
            if (logger2.isAt(level)) {
                logger2.display(level, "[init] declare Android Context");
            }
        }
        if (androidContext instanceof Application) {
            Koin.loadModules$default(koinApplication.getKoin(), d.listOf(ModuleDSLKt.module$default(false, new a(androidContext), 1, null)), false, 2, null);
        } else {
            Koin.loadModules$default(koinApplication.getKoin(), d.listOf(ModuleDSLKt.module$default(false, new b(androidContext), 1, null)), false, 2, null);
        }
        return koinApplication;
    }

    @NotNull
    public static final KoinApplication androidFileProperties(@NotNull KoinApplication koinApplication, @NotNull String koinPropertyFile) {
        String[] list;
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(koinPropertyFile, "koinPropertyFile");
        Properties properties = new Properties();
        Context context = (Context) koinApplication.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        try {
            AssetManager assets = context.getAssets();
            if (assets == null || (list = assets.list("")) == null || !ArraysKt___ArraysKt.contains(list, koinPropertyFile)) {
                Logger logger = koinApplication.getKoin().getLogger();
                Level level = Level.INFO;
                if (logger.isAt(level)) {
                    Logger logger2 = koinApplication.getKoin().getLogger();
                    String str = "[Android-Properties] no assets/" + koinPropertyFile + " file to load";
                    if (logger2.isAt(level)) {
                        logger2.display(level, str);
                    }
                }
            } else {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(koinPropertyFile);
                    try {
                        properties.load(inputStreamOpen);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStreamOpen, null);
                        PropertyRegistryExtKt.saveProperties(koinApplication.getKoin().getPropertyRegistry(), properties);
                        Unit unit2 = Unit.INSTANCE;
                        Logger logger3 = koinApplication.getKoin().getLogger();
                        Level level2 = Level.INFO;
                        if (logger3.isAt(level2)) {
                            Logger logger4 = koinApplication.getKoin().getLogger();
                            String str2 = "[Android-Properties] loaded " + unit2 + " properties from assets/" + koinPropertyFile;
                            if (logger4.isAt(level2)) {
                                logger4.display(level2, str2);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(inputStreamOpen, th2);
                            throw th3;
                        }
                    }
                } catch (Exception e5) {
                    Logger logger5 = koinApplication.getKoin().getLogger();
                    String str3 = "[Android-Properties] error for binding properties : " + e5;
                    Level level3 = Level.ERROR;
                    if (logger5.isAt(level3)) {
                        logger5.display(level3, str3);
                    }
                }
            }
        } catch (Exception e7) {
            Logger logger6 = koinApplication.getKoin().getLogger();
            String str4 = "[Android-Properties] error while loading properties from assets/" + koinPropertyFile + " : " + e7;
            Level level4 = Level.ERROR;
            if (logger6.isAt(level4)) {
                logger6.display(level4, str4);
            }
        }
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidFileProperties$default(KoinApplication koinApplication, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "koin.properties";
        }
        return androidFileProperties(koinApplication, str);
    }

    @NotNull
    public static final KoinApplication androidLogger(@NotNull KoinApplication koinApplication, @NotNull Level level) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(level, "level");
        koinApplication.getKoin().setupLogger(new AndroidLogger(level));
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidLogger$default(KoinApplication koinApplication, Level level, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            level = Level.INFO;
        }
        return androidLogger(koinApplication, level);
    }
}
