package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaAnnotations.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80624p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final JavaAnnotationOwner f80625q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f80626r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> f80627s0;

    /* JADX INFO: compiled from: LazyJavaAnnotations.kt */
    public static final class a extends Lambda implements Function1<JavaAnnotation, AnnotationDescriptor> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotationDescriptor invoke(@NotNull JavaAnnotation annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.INSTANCE;
            LazyJavaAnnotations lazyJavaAnnotations = LazyJavaAnnotations.this;
            return javaAnnotationMapper.mapOrResolveJavaAnnotation(annotation, lazyJavaAnnotations.f80624p0, lazyJavaAnnotations.f80626r0);
        }
    }

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext c10, @NotNull JavaAnnotationOwner annotationOwner, boolean z10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f80624p0 = c10;
        this.f80625q0 = annotationOwner;
        this.f80626r0 = z10;
        this.f80627s0 = c10.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo5773findAnnotation(@NotNull FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        JavaAnnotationOwner javaAnnotationOwner = this.f80625q0;
        JavaAnnotation javaAnnotationFindAnnotation = javaAnnotationOwner.findAnnotation(fqName);
        return (javaAnnotationFindAnnotation == null || (annotationDescriptorInvoke = this.f80627s0.invoke(javaAnnotationFindAnnotation)) == null) ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, javaAnnotationOwner, this.f80624p0) : annotationDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        JavaAnnotationOwner javaAnnotationOwner = this.f80625q0;
        return javaAnnotationOwner.getAnnotations().isEmpty() && !javaAnnotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        JavaAnnotationOwner javaAnnotationOwner = this.f80625q0;
        return SequencesKt___SequencesKt.filterNotNull(SequencesKt___SequencesKt.plus((Sequence<? extends AnnotationDescriptor>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(javaAnnotationOwner.getAnnotations()), this.f80627s0), JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(StandardNames.FqNames.deprecated, javaAnnotationOwner, this.f80624p0))).iterator();
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i10 & 4) != 0 ? false : z10);
    }
}
