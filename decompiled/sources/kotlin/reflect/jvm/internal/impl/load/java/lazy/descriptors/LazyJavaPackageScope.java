package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaPackageScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1620#2,3:190\n1611#2:193\n1855#2:194\n1856#2:196\n1612#2:197\n766#2:198\n857#2,2:199\n1#3:195\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n*L\n160#1:190,3\n162#1:193\n162#1:194\n162#1:196\n162#1:197\n185#1:198\n185#1:199,2\n162#1:195\n*E\n"})
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    @NotNull
    public final JavaPackage m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final LazyJavaPackageFragment f80705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final NullableLazyValue<Set<String>> f80706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable<a, ClassDescriptor> f80707p;

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static abstract class KotlinClassLookupResult {

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class Found extends KotlinClassLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final ClassDescriptor f80708a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(@NotNull ClassDescriptor descriptor) {
                super(null);
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                this.f80708a = descriptor;
            }

            @NotNull
            public final ClassDescriptor getDescriptor() {
                return this.f80708a;
            }
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class NotFound extends KotlinClassLookupResult {

            @NotNull
            public static final NotFound INSTANCE = new NotFound();

            public NotFound() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class SyntheticClass extends KotlinClassLookupResult {

            @NotNull
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            public SyntheticClass() {
                super(null);
            }
        }

        public KotlinClassLookupResult() {
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Name f80709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final JavaClass f80710b;

        public a(@NotNull Name name, @Nullable JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f80709a = name;
            this.f80710b = javaClass;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                if (Intrinsics.areEqual(this.f80709a, ((a) obj).f80709a)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final JavaClass getJavaClass() {
            return this.f80710b;
        }

        @NotNull
        public final Name getName() {
            return this.f80709a;
        }

        public int hashCode() {
            return this.f80709a.hashCode();
        }
    }

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope$classes$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
    public static final class b extends Lambda implements Function1<a, ClassDescriptor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaPackageScope f80711p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80712q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
            super(1);
            this.f80711p0 = lazyJavaPackageScope;
            this.f80712q0 = lazyJavaResolverContext;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ClassDescriptor invoke(@NotNull a request) {
            Intrinsics.checkNotNullParameter(request, "request");
            LazyJavaPackageScope lazyJavaPackageScope = this.f80711p0;
            ClassId classId = new ClassId(lazyJavaPackageScope.getOwnerDescriptor().getFqName(), request.getName());
            JavaClass javaClass = request.getJavaClass();
            LazyJavaResolverContext lazyJavaResolverContext = this.f80712q0;
            KotlinClassFinder.Result resultFindKotlinClassOrContent = javaClass != null ? lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(request.getJavaClass(), LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope)) : lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId, LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope));
            KotlinJvmBinaryClass kotlinJvmBinaryClass = resultFindKotlinClassOrContent != null ? resultFindKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
            ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
            if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
                return null;
            }
            KotlinClassLookupResult kotlinClassLookupResultAccess$resolveKotlinBinaryClass = LazyJavaPackageScope.access$resolveKotlinBinaryClass(lazyJavaPackageScope, kotlinJvmBinaryClass);
            if (kotlinClassLookupResultAccess$resolveKotlinBinaryClass instanceof KotlinClassLookupResult.Found) {
                return ((KotlinClassLookupResult.Found) kotlinClassLookupResultAccess$resolveKotlinBinaryClass).getDescriptor();
            }
            if (kotlinClassLookupResultAccess$resolveKotlinBinaryClass instanceof KotlinClassLookupResult.SyntheticClass) {
                return null;
            }
            if (!(kotlinClassLookupResultAccess$resolveKotlinBinaryClass instanceof KotlinClassLookupResult.NotFound)) {
                throw new NoWhenBranchMatchedException();
            }
            JavaClass javaClass2 = request.getJavaClass();
            if (javaClass2 == null) {
                JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
                KotlinClassFinder.Result.ClassFileContent classFileContent = resultFindKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultFindKotlinClassOrContent : null;
                javaClass2 = finder.findClass(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
            }
            JavaClass javaClass3 = javaClass2;
            if ((javaClass3 != null ? javaClass3.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                FqName fqName = javaClass3 != null ? javaClass3.getFqName() : null;
                if (fqName == null || fqName.isRoot() || !Intrinsics.areEqual(fqName.parent(), lazyJavaPackageScope.getOwnerDescriptor().getFqName())) {
                    return null;
                }
                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.f80712q0, lazyJavaPackageScope.getOwnerDescriptor(), javaClass3, null, 8, null);
                lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                return lazyJavaClassDescriptor;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass3 + "\nClassId: " + classId + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), javaClass3, LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope)) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), classId, LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope)) + '\n');
        }
    }

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static final class c extends Lambda implements Function0<Set<? extends String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80713p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaPackageScope f80714q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
            super(0);
            this.f80713p0 = lazyJavaResolverContext;
            this.f80714q0 = lazyJavaPackageScope;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Set<? extends String> invoke() {
            return this.f80713p0.getComponents().getFinder().knownClassNamesInPackage(this.f80714q0.getOwnerDescriptor().getFqName());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(@NotNull LazyJavaResolverContext c10, @NotNull JavaPackage jPackage, @NotNull LazyJavaPackageFragment ownerDescriptor) {
        super(c10);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.m = jPackage;
        this.f80705n = ownerDescriptor;
        this.f80706o = c10.getStorageManager().createNullableLazyValue(new c(c10, this));
        this.f80707p = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new b(c10, this));
    }

    public static final JvmMetadataVersion access$getJvmMetadataVersion(LazyJavaPackageScope lazyJavaPackageScope) {
        return DeserializationHelpersKt.jvmMetadataVersionOrDefault(lazyJavaPackageScope.getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
    }

    public static final KotlinClassLookupResult access$resolveKotlinBinaryClass(LazyJavaPackageScope lazyJavaPackageScope, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        lazyJavaPackageScope.getClass();
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() != KotlinClassHeader.Kind.CLASS) {
            return KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        ClassDescriptor classDescriptorResolveClass = lazyJavaPackageScope.getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
        return classDescriptorResolveClass != null ? new KotlinClassLookupResult.Found(classDescriptorResolveClass) : KotlinClassLookupResult.NotFound.INSTANCE;
    }

    public final ClassDescriptor a(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.isSafeIdentifier(name)) {
            return null;
        }
        Set<String> setInvoke = this.f80706o.invoke();
        if (javaClass == null && setInvoke != null && !setInvoke.contains(name.asString())) {
            return null;
        }
        return this.f80707p.invoke(new a(name, javaClass));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return w.emptySet();
        }
        Set<String> setInvoke = this.f80706o.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.identifier((String) it.next()));
            }
            return hashSet;
        }
        if (function1 == null) {
            function1 = FunctionsKt.alwaysTrue();
        }
        Collection<JavaClass> classes = this.m.getClasses(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            Name name = javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return w.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return w.emptySet();
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return a(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!kindFilter.acceptsKinds(companion.getNON_SINGLETON_CLASSIFIERS_MASK() | companion.getCLASSIFIERS_MASK())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> collectionInvoke = getAllDescriptors().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassDescriptor mo5779getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return a(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public LazyJavaPackageFragment getOwnerDescriptor() {
        return this.f80705n;
    }
}
