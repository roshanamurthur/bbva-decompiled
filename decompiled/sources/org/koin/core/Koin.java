package org.koin.core;

import androidx.camera.core.impl.utils.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.ScopeNotCreatedException;
import org.koin.core.extension.ExtensionManager;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: Koin.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b]\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007JL\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000JN\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000JC\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013JC\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0012\u0010\u0017JE\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0014\u0010\u0017JJ\u0010\u001d\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0018\u001a\u00028\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\bJ&\u0010%\u001a\u00020$2\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001J-\u0010%\u001a\u00020$\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\u0010\"\u001a\u00060 j\u0002`!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001H\u0086\bJ#\u0010%\u001a\u00020$\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\f\b\u0002\u0010\"\u001a\u00060 j\u0002`!H\u0086\bJ\u001f\u0010%\u001a\u00020$\"\b\b\u0000\u0010\u0006*\u00020&2\u0006\u0010'\u001a\u00028\u0000¢\u0006\u0004\b%\u0010(J&\u0010)\u001a\u00020$2\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001J!\u0010)\u001a\u00020$\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\u0010\"\u001a\u00060 j\u0002`!H\u0086\bJ\u0012\u0010*\u001a\u00020$2\n\u0010\"\u001a\u00060 j\u0002`!J\u0014\u0010+\u001a\u0004\u0018\u00010$2\n\u0010\"\u001a\u00060 j\u0002`!J\u0012\u0010,\u001a\u00020\u00042\n\u0010\"\u001a\u00060 j\u0002`!J'\u0010/\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J!\u0010/\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b/\u00101J\u0016\u00103\u001a\u00020\u00042\u0006\u0010-\u001a\u00020 2\u0006\u00102\u001a\u00020\u0001J\u000e\u00104\u001a\u00020\u00042\u0006\u0010-\u001a\u00020 J\u0006\u00105\u001a\u00020\u0004J\u001e\u00108\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0014\u00109\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0019J\u0006\u0010:\u001a\u00020\u0004R \u0010B\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R \u0010I\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010A\u001a\u0004\bF\u0010GR \u0010P\u001a\u00020J8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u0010A\u001a\u0004\bM\u0010NR \u0010W\u001a\u00020Q8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010A\u001a\u0004\bT\u0010UR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Lorg/koin/core/Koin;", "", "Lorg/koin/core/logger/Logger;", "logger", "", "setupLogger", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/LazyThreadSafetyMode;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "inject", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "Lkotlin/reflect/KClass;", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "instance", "", "secondaryTypes", "", "allowOverride", "declare", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "getAll", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "source", "Lorg/koin/core/scope/Scope;", "createScope", "Lorg/koin/core/component/KoinScopeComponent;", "t", "(Lorg/koin/core/component/KoinScopeComponent;)Lorg/koin/core/scope/Scope;", "getOrCreateScope", "getScope", "getScopeOrNull", "deleteScope", "key", "defaultValue", "getProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "setProperty", "deleteProperty", HearingDisabilitiesConstants.CLOSE_MODAL, "Lorg/koin/core/module/Module;", "modules", "loadModules", "unloadModules", "createEagerInstances", "Lorg/koin/core/registry/ScopeRegistry;", "a", "Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry", "()Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry$annotations", "()V", "scopeRegistry", "Lorg/koin/core/registry/InstanceRegistry;", "b", "Lorg/koin/core/registry/InstanceRegistry;", "getInstanceRegistry", "()Lorg/koin/core/registry/InstanceRegistry;", "getInstanceRegistry$annotations", "instanceRegistry", "Lorg/koin/core/registry/PropertyRegistry;", "c", "Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry", "()Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry$annotations", "propertyRegistry", "Lorg/koin/core/extension/ExtensionManager;", "d", "Lorg/koin/core/extension/ExtensionManager;", "getExtensionManager", "()Lorg/koin/core/extension/ExtensionManager;", "getExtensionManager$annotations", "extensionManager", "<set-?>", "e", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "<init>", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKoin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Koin.kt\norg/koin/core/Koin\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n+ 3 InstanceRegistry.kt\norg/koin/core/registry/InstanceRegistry\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Logger.kt\norg/koin/core/logger/Logger\n+ 7 Measure.kt\norg/koin/core/time/MeasureKt\n*L\n1#1,328:1\n106#2:329\n121#2:330\n133#2:331\n158#2:332\n352#2:360\n151#3,2:333\n153#3,4:342\n157#3,3:347\n160#3:351\n153#3,8:352\n112#4,7:335\n1855#5:346\n1856#5:350\n28#6:361\n46#6,2:362\n29#6:364\n28#6:370\n46#6,2:371\n29#6:373\n34#7:365\n48#7,4:366\n*S KotlinDebug\n*F\n+ 1 Koin.kt\norg/koin/core/Koin\n*L\n82#1:329\n96#1:330\n107#1:331\n120#1:332\n176#1:360\n168#1:333,2\n168#1:342,4\n168#1:347,3\n168#1:351\n168#1:352,8\n168#1:335,7\n168#1:346\n168#1:350\n321#1:361\n321#1:362,2\n321#1:364\n325#1:370\n325#1:371,2\n325#1:373\n322#1:365\n322#1:366,4\n*E\n"})
public final class Koin {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ScopeRegistry scopeRegistry = new ScopeRegistry(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InstanceRegistry instanceRegistry = new InstanceRegistry(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertyRegistry propertyRegistry = new PropertyRegistry(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ExtensionManager extensionManager = new ExtensionManager(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Logger logger = new EmptyLogger();

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return koin.createScope(str, qualifier, obj);
    }

    public static /* synthetic */ void declare$default(Koin koin, Object obj, Qualifier qualifier, List list, boolean z10, int i10, Object obj2) {
        Qualifier qualifier2 = (i10 & 2) != 0 ? null : qualifier;
        List secondaryTypes = (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        boolean z11 = (i10 & 8) != 0 ? true : z10;
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        InstanceRegistry instanceRegistry = koin.getInstanceRegistry();
        Qualifier scopeQualifier = instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        Koin$declare$$inlined$declareRootInstance$1 koin$declare$$inlined$declareRootInstance$1 = new Koin$declare$$inlined$declareRootInstance$1(obj);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, koin$declare$$inlined$declareRootInstance$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        InstanceRegistry.saveMapping$default(instanceRegistry, z11, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            InstanceRegistry.saveMapping$default(instanceRegistry, z11, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static /* synthetic */ Scope getOrCreateScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return koin.getOrCreateScope(str, qualifier, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static /* synthetic */ Lazy inject$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            mode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            mode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ void loadModules$default(Koin koin, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        koin.loadModules(list, z10);
    }

    public final void close() {
        this.scopeRegistry.close$koin_core();
        this.instanceRegistry.close$koin_core();
        this.propertyRegistry.close();
        this.extensionManager.close();
    }

    public final void createEagerInstances() {
        Logger logger = this.logger;
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, "Eager instances ...");
        }
        KoinPlatformTimeTools koinPlatformTimeTools = KoinPlatformTimeTools.INSTANCE;
        long timeInNanoSeconds = koinPlatformTimeTools.getTimeInNanoSeconds();
        this.instanceRegistry.createAllEagerInstances$koin_core();
        double dDoubleValue = ((Number) new Pair(Unit.INSTANCE, Double.valueOf((koinPlatformTimeTools.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d)).getSecond()).doubleValue();
        Logger logger2 = this.logger;
        String str = "Eager instances created in " + dDoubleValue + " ms";
        if (logger2.isAt(level)) {
            logger2.display(level, str);
        }
    }

    @NotNull
    public final Scope createScope(@NotNull String scopeId, @NotNull Qualifier qualifier, @Nullable Object source) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return this.scopeRegistry.createScope(scopeId, qualifier, source);
    }

    public final /* synthetic */ <T> void declare(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        InstanceRegistry instanceRegistry = getInstanceRegistry();
        Qualifier scopeQualifier = instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        Koin$declare$$inlined$declareRootInstance$1 koin$declare$$inlined$declareRootInstance$1 = new Koin$declare$$inlined$declareRootInstance$1(instance);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, koin$declare$$inlined$declareRootInstance$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        InstanceRegistry.saveMapping$default(instanceRegistry, allowOverride, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            InstanceRegistry.saveMapping$default(instanceRegistry, allowOverride, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    public final void deleteProperty(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.propertyRegistry.deleteProperty(key);
    }

    public final void deleteScope(@NotNull String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        this.scopeRegistry.deleteScope$koin_core(scopeId);
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    public final /* synthetic */ <T> List<T> getAll() {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    @NotNull
    public final ExtensionManager getExtensionManager() {
        return this.extensionManager;
    }

    @NotNull
    public final InstanceRegistry getInstanceRegistry() {
        return this.instanceRegistry;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final Scope getOrCreateScope(@NotNull String scopeId, @NotNull Qualifier qualifier, @Nullable Object source) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        return scopeOrNull == null ? createScope(scopeId, qualifier, source) : scopeOrNull;
    }

    public final /* synthetic */ <T> T getOrNull(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    @NotNull
    public final <T> T getProperty(@NotNull String key, @NotNull T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) this.propertyRegistry.getProperty(key);
        return t10 == null ? defaultValue : t10;
    }

    @NotNull
    public final PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    @NotNull
    public final Scope getScope(@NotNull String scopeId) throws ScopeNotCreatedException {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        if (scopeOrNull != null) {
            return scopeOrNull;
        }
        throw new ScopeNotCreatedException(a.a("No scope found for id '", scopeId, '\''));
    }

    @Nullable
    public final Scope getScopeOrNull(@NotNull String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        return this.scopeRegistry.getScopeOrNull(scopeId);
    }

    @NotNull
    public final ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, parameters));
    }

    public final /* synthetic */ <T> Lazy<T> injectOrNull(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, parameters));
    }

    public final void loadModules(@NotNull List<Module> modules, boolean allowOverride) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Set<Module> setFlatten$default = ModuleKt.flatten$default(modules, null, 2, null);
        this.instanceRegistry.loadModules$koin_core(setFlatten$default, allowOverride);
        this.scopeRegistry.loadScopes(setFlatten$default);
    }

    public final void setProperty(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.propertyRegistry.saveProperty$koin_core(key, value);
    }

    @KoinInternalApi
    public final void setupLogger(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void unloadModules(@NotNull List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.instanceRegistry.unloadModules$koin_core(ModuleKt.flatten$default(modules, null, 2, null));
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String scopeId, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return koin.getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), obj);
    }

    public final /* synthetic */ <T> Scope createScope(String scopeId, Object source) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), source);
    }

    public final /* synthetic */ <T> Scope getOrCreateScope(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        Scope scopeOrNull = getScopeRegistry().getScopeOrNull(scopeId);
        return scopeOrNull == null ? createScope$default(this, scopeId, typeQualifier, null, 4, null) : scopeOrNull;
    }

    @Nullable
    public final <T> T getProperty(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.propertyRegistry.getProperty(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return koin.get(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return koin.getOrNull(kClass, qualifier, function0);
    }

    public final <T> T get(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.scopeRegistry.getRootScope().get(clazz, qualifier, parameters);
    }

    @Nullable
    public final <T> T getOrNull(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.scopeRegistry.getRootScope().getOrNull(clazz, qualifier, parameters);
    }

    public final /* synthetic */ <T> Scope createScope(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), null);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String scopeId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            scopeId = KoinPlatformTools.INSTANCE.generateId();
        }
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return koin.getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), null);
    }

    @NotNull
    public final <T extends KoinScopeComponent> Scope createScope(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        return this.scopeRegistry.createScope(KoinScopeComponentKt.getScopeId(t10), KoinScopeComponentKt.getScopeName(t10), null);
    }

    @KoinInternalApi
    public static /* synthetic */ void getExtensionManager$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getInstanceRegistry$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getPropertyRegistry$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getScopeRegistry$annotations() {
    }
}
