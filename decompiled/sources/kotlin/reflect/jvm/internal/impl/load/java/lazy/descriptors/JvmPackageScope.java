package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.g;
import bk.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JvmPackageScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,109:1\n92#2,14:110\n60#2,5:124\n60#2,5:129\n60#2,5:134\n10394#3,5:139\n10394#3,5:144\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n*L\n58#1:110,14\n63#1:124,5\n68#1:129,5\n74#1:134,5\n76#1:139,5\n80#1:144,5\n*E\n"})
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80651e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyJavaPackageFragment f80653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LazyJavaPackageScope f80654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80655d;

    /* JADX INFO: compiled from: JvmPackageScope.kt */
    @SourceDebugExtension({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope$kotlinScopes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n1603#2,9:110\n1855#2:119\n1856#2:121\n1612#2:122\n1#3:120\n37#4,2:123\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope$kotlinScopes$2\n*L\n46#1:110,9\n46#1:119\n46#1:121\n46#1:122\n46#1:120\n49#1:123,2\n*E\n"})
    public static final class a extends Lambda implements Function0<MemberScope[]> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MemberScope[] invoke() {
            JvmPackageScope jvmPackageScope = JvmPackageScope.this;
            Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.f80653b.getBinaryClasses$descriptors_jvm().values();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                MemberScope memberScopeCreateKotlinPackagePartScope = jvmPackageScope.f80652a.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(jvmPackageScope.f80653b, (KotlinJvmBinaryClass) it.next());
                if (memberScopeCreateKotlinPackagePartScope != null) {
                    arrayList.add(memberScopeCreateKotlinPackagePartScope);
                }
            }
            return (MemberScope[]) ScopeUtilsKt.listOfNonEmptyScopes(arrayList).toArray(new MemberScope[0]);
        }
    }

    public JvmPackageScope(@NotNull LazyJavaResolverContext c10, @NotNull JavaPackage jPackage, @NotNull LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f80652a = c10;
        this.f80653b = packageFragment;
        this.f80654c = new LazyJavaPackageScope(c10, jPackage, packageFragment);
        this.f80655d = c10.getStorageManager().createLazyValue(new a());
    }

    public final MemberScope[] a() {
        return (MemberScope[]) StorageKt.getValue(this.f80655d, this, (KProperty<?>) f80651e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        Set<Name> setFlatMapClassifierNamesOrNull = MemberScopeKt.flatMapClassifierNamesOrNull(ArraysKt___ArraysKt.asIterable(a()));
        if (setFlatMapClassifierNamesOrNull == null) {
            return null;
        }
        setFlatMapClassifierNamesOrNull.addAll(this.f80654c.getClassifierNames());
        return setFlatMapClassifierNamesOrNull;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo5779getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo5783recordLookup(name, location);
        ClassDescriptor classDescriptorMo5779getContributedClassifier = this.f80654c.mo5779getContributedClassifier(name, location);
        if (classDescriptorMo5779getContributedClassifier != null) {
            return classDescriptorMo5779getContributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : a()) {
            ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier = memberScope.mo5779getContributedClassifier(name, location);
            if (classifierDescriptorMo5779getContributedClassifier != null) {
                if (!(classifierDescriptorMo5779getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) classifierDescriptorMo5779getContributedClassifier).isExpect()) {
                    return classifierDescriptorMo5779getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo5779getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        MemberScope[] memberScopeArrA = a();
        Collection<DeclarationDescriptor> contributedDescriptors = this.f80654c.getContributedDescriptors(kindFilter, nameFilter);
        for (MemberScope memberScope : memberScopeArrA) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return contributedDescriptors == null ? w.emptySet() : contributedDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo5783recordLookup(name, location);
        MemberScope[] memberScopeArrA = a();
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = this.f80654c.getContributedFunctions(name, location);
        int length = memberScopeArrA.length;
        int i10 = 0;
        Collection collection = contributedFunctions;
        while (i10 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrA[i10].getContributedFunctions(name, location));
            i10++;
            collection = collectionConcat;
        }
        return collection == null ? w.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo5783recordLookup(name, location);
        MemberScope[] memberScopeArrA = a();
        Collection<? extends PropertyDescriptor> contributedVariables = this.f80654c.getContributedVariables(name, location);
        int length = memberScopeArrA.length;
        int i10 = 0;
        Collection collection = contributedVariables;
        while (i10 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrA[i10].getContributedVariables(name, location));
            i10++;
            collection = collectionConcat;
        }
        return collection == null ? w.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArrA = a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrA) {
            g.addAll(linkedHashSet, memberScope.getFunctionNames());
        }
        linkedHashSet.addAll(this.f80654c.getFunctionNames());
        return linkedHashSet;
    }

    @NotNull
    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.f80654c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        MemberScope[] memberScopeArrA = a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrA) {
            g.addAll(linkedHashSet, memberScope.getVariableNames());
        }
        linkedHashSet.addAll(this.f80654c.getVariableNames());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo5783recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        UtilsKt.record(this.f80652a.getComponents().getLookupTracker(), location, this.f80653b, name);
    }

    @NotNull
    public String toString() {
        return "scope for " + this.f80653b;
    }
}
