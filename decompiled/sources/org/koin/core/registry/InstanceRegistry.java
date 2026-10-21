package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import ci.a;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: InstanceRegistry.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010@\u001a\u00020;¢\u0006\u0004\bE\u0010FJ%\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0007J3\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J^\u0010(\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001d\u0018\u00012\u0006\u0010#\u001a\u00028\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\b\u0002\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150$2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\n\u0010'\u001a\u00060\u000ej\u0002`&H\u0081\b¢\u0006\u0004\b(\u0010)JJ\u0010*\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001d\u0018\u00012\u0006\u0010#\u001a\u00028\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\b\u0002\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150$2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0081\b¢\u0006\u0004\b*\u0010+J\u0017\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00102\u001a\u00020\u0007H\u0000¢\u0006\u0004\b1\u0010\fJ/\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u001d2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b6\u00107J\u0006\u0010:\u001a\u000209R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R%\u0010D\u001a\u0016\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lorg/koin/core/registry/InstanceRegistry;", "", "", "Lorg/koin/core/module/Module;", "modules", "", "allowOverride", "", "loadModules$koin_core", "(Ljava/util/Set;Z)V", "loadModules", "createAllEagerInstances$koin_core", "()V", "createAllEagerInstances", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "Lorg/koin/core/instance/InstanceFactory;", "factory", "logWarning", "saveMapping", "Lkotlin/reflect/KClass;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "scopeQualifier", "resolveDefinition$koin_core", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/instance/InstanceFactory;", "resolveDefinition", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/instance/InstanceContext;", "instanceContext", "resolveInstance$koin_core", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "resolveInstance", "instance", "", "secondaryTypes", "Lorg/koin/core/scope/ScopeID;", "scopeID", "declareScopedInstance", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;ZLorg/koin/core/qualifier/Qualifier;Ljava/lang/String;)V", "declareRootInstance", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "Lorg/koin/core/scope/Scope;", "scope", "dropScopeInstances$koin_core", "(Lorg/koin/core/scope/Scope;)V", "dropScopeInstances", "close$koin_core", HearingDisabilitiesConstants.CLOSE_MODAL, "getAll$koin_core", "(Lkotlin/reflect/KClass;Lorg/koin/core/instance/InstanceContext;)Ljava/util/List;", "getAll", "unloadModules$koin_core", "(Ljava/util/Set;)V", "unloadModules", "", "size", "Lorg/koin/core/Koin;", "a", "Lorg/koin/core/Koin;", "get_koin", "()Lorg/koin/core/Koin;", "_koin", "", "getInstances", "()Ljava/util/Map;", "instances", "<init>", "(Lorg/koin/core/Koin;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInstanceRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceRegistry.kt\norg/koin/core/registry/InstanceRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 Logger.kt\norg/koin/core/logger/Logger\n+ 5 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,204:1\n1855#2,2:205\n1855#2,2:207\n1855#2,2:227\n1855#2,2:236\n1855#2,2:245\n800#2,11:247\n1855#2,2:258\n766#2:262\n857#2,2:263\n766#2:265\n857#2,2:266\n1549#2:268\n1620#2,3:269\n1855#2,2:272\n1855#2,2:274\n215#3,2:209\n215#3,2:260\n36#4,12:211\n28#4:223\n46#4,2:224\n29#4:226\n112#5,7:229\n112#5,7:238\n*S KotlinDebug\n*F\n+ 1 InstanceRegistry.kt\norg/koin/core/registry/InstanceRegistry\n*L\n47#1:205,2\n54#1:207,2\n95#1:227,2\n136#1:236,2\n156#1:245,2\n164#1:247,11\n164#1:258,2\n176#1:262\n176#1:263,2\n179#1:265\n179#1:266,2\n185#1:268\n185#1:269,3\n189#1:272,2\n193#1:274,2\n69#1:209,2\n168#1:260,2\n85#1:211,12\n88#1:223\n88#1:224,2\n88#1:226\n128#1:229,7\n152#1:238,7\n*E\n"})
public final class InstanceRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Koin _koin;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, InstanceFactory<?>> f92454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, SingleInstanceFactory<?>> f92455c;

    public InstanceRegistry(@NotNull Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this.f92454b = KoinPlatformTools.INSTANCE.safeHashMap();
        this.f92455c = new HashMap<>();
    }

    public static /* synthetic */ void declareRootInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z10, int i10, Object obj2) {
        Qualifier qualifier2 = (i10 & 2) != 0 ? null : qualifier;
        List secondaryTypes = (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        boolean z11 = (i10 & 8) != 0 ? true : z10;
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Qualifier scopeQualifier = instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareRootInstance$def$1 instanceRegistry$declareRootInstance$def$1 = new InstanceRegistry$declareRootInstance$def$1(obj);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, instanceRegistry$declareRootInstance$def$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        saveMapping$default(instanceRegistry, z11, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(instanceRegistry, z11, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    public static /* synthetic */ void declareScopedInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z10, Qualifier scopeQualifier, String scopeID, int i10, Object obj2) {
        Qualifier qualifier2 = (i10 & 2) != 0 ? null : qualifier;
        List secondaryTypes = (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        boolean z11 = (i10 & 8) != 0 ? true : z10;
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareScopedInstance$def$1 instanceRegistry$declareScopedInstance$def$1 = new InstanceRegistry$declareScopedInstance$def$1(obj);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, instanceRegistry$declareScopedInstance$def$1, kind, secondaryTypes);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
        InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
        if (scopedInstanceFactory != null) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            scopedInstanceFactory.refreshInstance(scopeID, obj);
            return;
        }
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(instanceRegistry, z11, strIndexKey, scopedInstanceFactory2, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(instanceRegistry, z11, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
        }
    }

    public static /* synthetic */ void saveMapping$default(InstanceRegistry instanceRegistry, boolean z10, String str, InstanceFactory instanceFactory, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        instanceRegistry.saveMapping(z10, str, instanceFactory, z11);
    }

    public final void close$koin_core() {
        Map<String, InstanceFactory<?>> map = this.f92454b;
        for (Map.Entry<String, InstanceFactory<?>> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue().dropAll();
        }
        map.clear();
    }

    public final void createAllEagerInstances$koin_core() {
        HashMap<Integer, SingleInstanceFactory<?>> map = this.f92455c;
        Collection<SingleInstanceFactory<?>> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "eagerInstances.values");
        if (!collectionValues.isEmpty()) {
            Koin koin = this._koin;
            InstanceContext instanceContext = new InstanceContext(koin.getLogger(), koin.getScopeRegistry().getRootScope(), null, 4, null);
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((SingleInstanceFactory) it.next()).get(instanceContext);
            }
        }
        map.clear();
    }

    @PublishedApi
    public final /* synthetic */ <T> void declareRootInstance(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Qualifier scopeQualifier = get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareRootInstance$def$1 instanceRegistry$declareRootInstance$def$1 = new InstanceRegistry$declareRootInstance$def$1(instance);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, instanceRegistry$declareRootInstance$def$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    @PublishedApi
    public final /* synthetic */ <T> void declareScopedInstance(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride, Qualifier scopeQualifier, String scopeID) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareScopedInstance$def$1 instanceRegistry$declareScopedInstance$def$1 = new InstanceRegistry$declareScopedInstance$def$1(instance);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, instanceRegistry$declareScopedInstance$def$1, kind, secondaryTypes);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
        InstanceFactory<?> instanceFactory = getInstances().get(strIndexKey);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
        if (scopedInstanceFactory != null) {
            Intrinsics.checkNotNull(instance, "null cannot be cast to non-null type kotlin.Any");
            scopedInstanceFactory.refreshInstance(scopeID, instance);
            return;
        }
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(this, allowOverride, strIndexKey, scopedInstanceFactory2, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
        }
    }

    public final void dropScopeInstances$koin_core(@NotNull Scope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Collection<InstanceFactory<?>> collectionValues = this.f92454b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof ScopedInstanceFactory) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ScopedInstanceFactory) it.next()).drop(scope);
        }
    }

    @NotNull
    public final <T> List<T> getAll$koin_core(@NotNull KClass<?> clazz, @NotNull InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        Collection<InstanceFactory<?>> collectionValues = this.f92454b.values();
        ArrayList arrayList = new ArrayList();
        for (T t10 : collectionValues) {
            if (Intrinsics.areEqual(((InstanceFactory) t10).getBeanDefinition().getScopeQualifier(), instanceContext.getScope().getScopeQualifier())) {
                arrayList.add(t10);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : arrayList) {
            InstanceFactory instanceFactory = (InstanceFactory) t11;
            if (Intrinsics.areEqual(instanceFactory.getBeanDefinition().getPrimaryType(), clazz) || instanceFactory.getBeanDefinition().getSecondaryTypes().contains(clazz)) {
                arrayList2.add(t11);
            }
        }
        List listDistinct = CollectionsKt___CollectionsKt.distinct(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator<T> it = listDistinct.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InstanceFactory) it.next()).get(instanceContext));
        }
        return arrayList3;
    }

    @NotNull
    public final Map<String, InstanceFactory<?>> getInstances() {
        return this.f92454b;
    }

    @NotNull
    public final Koin get_koin() {
        return this._koin;
    }

    public final void loadModules$koin_core(@NotNull Set<Module> modules, boolean allowOverride) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        for (Module module : modules) {
            for (Map.Entry<String, InstanceFactory<?>> entry : module.getMappings().entrySet()) {
                saveMapping$default(this, allowOverride, entry.getKey(), entry.getValue(), false, 8, null);
            }
            for (SingleInstanceFactory<?> singleInstanceFactory : module.getEagerInstances()) {
                this.f92455c.put(Integer.valueOf(singleInstanceFactory.hashCode()), singleInstanceFactory);
            }
        }
    }

    @Nullable
    public final InstanceFactory<?> resolveDefinition$koin_core(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @NotNull Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        return this.f92454b.get(BeanDefinitionKt.indexKey(clazz, qualifier, scopeQualifier));
    }

    @Nullable
    public final <T> T resolveInstance$koin_core(@Nullable Qualifier qualifier, @NotNull KClass<?> clazz, @NotNull Qualifier scopeQualifier, @NotNull InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        InstanceFactory<?> instanceFactoryResolveDefinition$koin_core = resolveDefinition$koin_core(clazz, qualifier, scopeQualifier);
        Object obj = instanceFactoryResolveDefinition$koin_core != null ? instanceFactoryResolveDefinition$koin_core.get(instanceContext) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    @KoinInternalApi
    public final void saveMapping(boolean allowOverride, @NotNull String mapping, @NotNull InstanceFactory<?> factory, boolean logWarning) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Map<String, InstanceFactory<?>> map = this.f92454b;
        boolean zContainsKey = map.containsKey(mapping);
        Koin koin = this._koin;
        if (zContainsKey) {
            if (!allowOverride) {
                ModuleKt.overrideError(factory, mapping);
            } else if (logWarning) {
                Logger logger = koin.getLogger();
                StringBuilder sbD = a.d("(+) override index '", mapping, "' -> '");
                sbD.append(factory.getBeanDefinition());
                sbD.append('\'');
                String string = sbD.toString();
                Level level = Level.WARNING;
                if (logger.isAt(level)) {
                    logger.display(level, string);
                }
            }
        }
        Logger logger2 = koin.getLogger();
        StringBuilder sbD2 = a.d("(+) index '", mapping, "' -> '");
        sbD2.append(factory.getBeanDefinition());
        sbD2.append('\'');
        String string2 = sbD2.toString();
        Level level2 = Level.DEBUG;
        if (logger2.isAt(level2)) {
            logger2.display(level2, string2);
        }
        map.put(mapping, factory);
    }

    public final int size() {
        return this.f92454b.size();
    }

    public final void unloadModules$koin_core(@NotNull Set<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            Set<String> setKeySet = ((Module) it.next()).getMappings().keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "module.mappings.keys");
            for (String str : setKeySet) {
                Map<String, InstanceFactory<?>> map = this.f92454b;
                if (map.containsKey(str)) {
                    InstanceFactory<?> instanceFactory = map.get(str);
                    if (instanceFactory != null) {
                        instanceFactory.dropAll();
                    }
                    map.remove(str);
                }
            }
        }
    }
}
