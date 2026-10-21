package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ContextKt {

    /* JADX INFO: compiled from: context.kt */
    public static final class a extends Lambda implements Function0<JavaTypeQualifiersByElementType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80596p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ClassOrPackageFragmentDescriptor f80597q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
            super(0);
            this.f80596p0 = lazyJavaResolverContext;
            this.f80597q0 = classOrPackageFragmentDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final JavaTypeQualifiersByElementType invoke() {
            return ContextKt.computeNewDefaultTypeQualifiers(this.f80596p0, this.f80597q0.getAnnotations());
        }
    }

    /* JADX INFO: compiled from: context.kt */
    public static final class b extends Lambda implements Function0<JavaTypeQualifiersByElementType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80598p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Annotations f80599q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
            super(0);
            this.f80598p0 = lazyJavaResolverContext;
            this.f80599q0 = annotations;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final JavaTypeQualifiersByElementType invoke() {
            return ContextKt.computeNewDefaultTypeQualifiers(this.f80598p0, this.f80599q0);
        }
    }

    @NotNull
    public static final LazyJavaResolverContext child(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    @NotNull
    public static final LazyJavaResolverContext childForClassOrPackage(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassOrPackageFragmentDescriptor containingDeclaration, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner, int i10) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, containingDeclaration, javaTypeParameterListOwner, i10) : lazyJavaResolverContext.getTypeParameterResolver(), LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a(lazyJavaResolverContext, containingDeclaration)));
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i10);
    }

    @NotNull
    public static final LazyJavaResolverContext childForMethod(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaTypeParameterListOwner typeParameterOwner, int i10) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, containingDeclaration, typeParameterOwner, i10) : lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i10);
    }

    @Nullable
    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations additionalAnnotations) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(lazyJavaResolverContext.getDefaultTypeQualifiers(), additionalAnnotations);
    }

    @NotNull
    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations additionalAnnotations) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new b(lazyJavaResolverContext, additionalAnnotations)));
    }

    @NotNull
    public static final LazyJavaResolverContext replaceComponents(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaResolverComponents components) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return new LazyJavaResolverContext(components, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }
}
