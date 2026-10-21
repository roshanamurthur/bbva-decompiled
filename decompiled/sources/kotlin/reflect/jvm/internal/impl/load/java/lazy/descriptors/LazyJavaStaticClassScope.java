package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.d;
import bk.g;
import bk.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLazyJavaStaticClassScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1#2:172\n1477#3:173\n1502#3,3:174\n1505#3,3:184\n1549#3:193\n1620#3,3:194\n372#4,7:177\n76#5:187\n96#5,5:188\n*S KotlinDebug\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n*L\n112#1:173\n112#1:174,3\n112#1:184,3\n168#1:193\n168#1:194,3\n112#1:177,7\n114#1:187\n114#1:188,5\n*E\n"})
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f80744o = 0;

    @NotNull
    public final JavaClass m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final JavaClassDescriptor f80745n;

    /* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
    public static final class a extends Lambda implements Function1<JavaMember, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80746p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull JavaMember it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.isStatic());
        }
    }

    /* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
    public static final class b extends Lambda implements Function1<MemberScope, Collection<? extends PropertyDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Name f80747p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Name name) {
            super(1);
            this.f80747p0 = name;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<? extends PropertyDescriptor> invoke(@NotNull MemberScope it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getContributedVariables(this.f80747p0, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
    public static final class c extends Lambda implements Function1<MemberScope, Collection<? extends Name>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f80748p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<Name> invoke(@NotNull MemberScope it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getVariableNames();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext c10, @NotNull JavaClass jClass, @NotNull JavaClassDescriptor ownerDescriptor) {
        super(c10);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.m = jClass;
        this.f80745n = ownerDescriptor;
    }

    public static PropertyDescriptor a(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends PropertyDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            Intrinsics.checkNotNull(propertyDescriptor2);
            arrayList.add(a(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt___CollectionsKt.single(CollectionsKt___CollectionsKt.distinct(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return w.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set<Name> mutableSet = CollectionsKt___CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getMethodNames());
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        Set<Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = w.emptySet();
        }
        mutableSet.addAll(functionNames);
        if (this.m.isEnum()) {
            mutableSet.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new Name[]{StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES}));
        }
        mutableSet.addAll(getC().getComponents().getSyntheticPartsProvider().getStaticFunctionNames(getC(), getOwnerDescriptor()));
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        getC().getComponents().getSyntheticPartsProvider().generateStaticFunctions(getC(), getOwnerDescriptor(), name, result);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, parentJavaStaticClassScope == null ? w.emptySet() : CollectionsKt___CollectionsKt.toSet(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS)), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionResolveOverridesForStaticMembers);
        if (this.m.isEnum()) {
            if (Intrinsics.areEqual(name, StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptorCreateEnumValueOfMethod, "createEnumValueOfMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValueOfMethod);
            } else if (Intrinsics.areEqual(name, StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptorCreateEnumValuesMethod, "createEnumValuesMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValuesMethod);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        JavaClassDescriptor ownerDescriptor = getOwnerDescriptor();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DFS.dfs(d.listOf(ownerDescriptor), yk.c.f94870a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ownerDescriptor, linkedHashSet, new b(name)));
        if (!result.isEmpty()) {
            Collection<? extends PropertyDescriptor> collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, linkedHashSet, result, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
            result.addAll(collectionResolveOverridesForStaticMembers);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                PropertyDescriptor propertyDescriptorA = a((PropertyDescriptor) obj);
                Object arrayList = linkedHashMap.get(propertyDescriptorA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(propertyDescriptorA, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionResolveOverridesForStaticMembers2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, (Collection) ((Map.Entry) it.next()).getValue(), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
                Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers2, "resolveOverridesForStaticMembers(...)");
                g.addAll(arrayList2, collectionResolveOverridesForStaticMembers2);
            }
            result.addAll(arrayList2);
        }
        if (this.m.isEnum() && Intrinsics.areEqual(name, StandardNames.ENUM_ENTRIES)) {
            CollectionsKt.addIfNotNull(result, DescriptorFactory.createEnumEntriesProperty(getOwnerDescriptor()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set<Name> mutableSet = CollectionsKt___CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getFieldNames());
        JavaClassDescriptor ownerDescriptor = getOwnerDescriptor();
        DFS.dfs(d.listOf(ownerDescriptor), yk.c.f94870a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ownerDescriptor, mutableSet, c.f80748p0));
        if (this.m.isEnum()) {
            mutableSet.add(StandardNames.ENUM_ENTRIES);
        }
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo5779getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.m, a.f80746p0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public JavaClassDescriptor getOwnerDescriptor() {
        return this.f80745n;
    }
}
