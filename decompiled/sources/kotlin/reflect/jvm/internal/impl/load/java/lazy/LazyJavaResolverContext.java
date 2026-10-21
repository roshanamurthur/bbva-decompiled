package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyJavaResolverContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JavaResolverComponents f80633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeParameterResolver f80634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> f80635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f80636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final JavaTypeResolver f80637e;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents components, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f80633a = components;
        this.f80634b = typeParameterResolver;
        this.f80635c = delegateForDefaultTypeQualifiers;
        this.f80636d = delegateForDefaultTypeQualifiers;
        this.f80637e = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.f80633a;
    }

    @Nullable
    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.f80636d.getValue();
    }

    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.f80635c;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.f80633a.getModule();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f80633a.getStorageManager();
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.f80634b;
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.f80637e;
    }
}
