package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaDescriptorResolver.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaDescriptorResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaPackageFragmentProvider f81564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final JavaResolverCache f81565b;

    public JavaDescriptorResolver(@NotNull LazyJavaPackageFragmentProvider packageFragmentProvider, @NotNull JavaResolverCache javaResolverCache) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.f81564a = packageFragmentProvider;
        this.f81565b = javaResolverCache;
    }

    @NotNull
    public final LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.f81564a;
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        FqName fqName = javaClass.getFqName();
        if (fqName != null && javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
            return this.f81565b.getClassResolvedFromSource(fqName);
        }
        JavaClass outerClass = javaClass.getOuterClass();
        if (outerClass != null) {
            ClassDescriptor classDescriptorResolveClass = resolveClass(outerClass);
            MemberScope unsubstitutedInnerClassesScope = classDescriptorResolveClass != null ? classDescriptorResolveClass.getUnsubstitutedInnerClassesScope() : null;
            ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.mo5779getContributedClassifier(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            if (classifierDescriptorMo5779getContributedClassifier instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorMo5779getContributedClassifier;
            }
            return null;
        }
        if (fqName == null) {
            return null;
        }
        FqName fqNameParent = fqName.parent();
        Intrinsics.checkNotNullExpressionValue(fqNameParent, "parent(...)");
        LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt___CollectionsKt.firstOrNull((List) this.f81564a.getPackageFragments(fqNameParent));
        if (lazyJavaPackageFragment != null) {
            return lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
        }
        return null;
    }
}
