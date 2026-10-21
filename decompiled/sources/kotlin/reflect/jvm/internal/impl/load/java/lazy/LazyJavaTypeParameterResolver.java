package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: resolvers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeclarationDescriptor f80639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<JavaTypeParameter, Integer> f80641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> f80642e;

    /* JADX INFO: compiled from: resolvers.kt */
    public static final class a extends Lambda implements Function1<JavaTypeParameter, LazyJavaTypeParameterDescriptor> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final LazyJavaTypeParameterDescriptor invoke(@NotNull JavaTypeParameter typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = LazyJavaTypeParameterResolver.this;
            Integer num = (Integer) lazyJavaTypeParameterResolver.f80641d.get(typeParameter);
            if (num == null) {
                return null;
            }
            return new LazyJavaTypeParameterDescriptor(ContextKt.copyWithNewDefaultTypeQualifiers(ContextKt.child(lazyJavaTypeParameterResolver.f80638a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f80639b.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f80640c + num.intValue(), lazyJavaTypeParameterResolver.f80639b);
        }
    }

    public LazyJavaTypeParameterResolver(@NotNull LazyJavaResolverContext c10, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaTypeParameterListOwner typeParameterOwner, int i10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f80638a = c10;
        this.f80639b = containingDeclaration;
        this.f80640c = i10;
        this.f80641d = CollectionsKt.mapToIndex(typeParameterOwner.getTypeParameters());
        this.f80642e = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    @Nullable
    public TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.f80642e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke != null ? lazyJavaTypeParameterDescriptorInvoke : this.f80638a.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }
}
