package kotlin.reflect.jvm.internal.impl.load.java.components;

import bk.q;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaAnnotationMapper {

    @NotNull
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Name f80574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Name f80575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Name f80576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<FqName, FqName> f80577d;

    static {
        Name nameIdentifier = Name.identifier("message");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        f80574a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        f80575b = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        f80576c = nameIdentifier3;
        f80577d = q.mapOf(TuplesKt.to(StandardNames.FqNames.target, JvmAnnotationNames.TARGET_ANNOTATION), TuplesKt.to(StandardNames.FqNames.retention, JvmAnnotationNames.RETENTION_ANNOTATION), TuplesKt.to(StandardNames.FqNames.mustBeDocumented, JvmAnnotationNames.DOCUMENTED_ANNOTATION));
    }

    public static /* synthetic */ AnnotationDescriptor mapOrResolveJavaAnnotation$default(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z10);
    }

    @Nullable
    public final AnnotationDescriptor findMappedJavaAnnotation(@NotNull FqName kotlinName, @NotNull JavaAnnotationOwner annotationOwner, @NotNull LazyJavaResolverContext c10) {
        JavaAnnotation javaAnnotationFindAnnotation;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c10, "c");
        if (Intrinsics.areEqual(kotlinName, StandardNames.FqNames.deprecated)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.DEPRECATED_ANNOTATION;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotationFindAnnotation2 = annotationOwner.findAnnotation(DEPRECATED_ANNOTATION);
            if (javaAnnotationFindAnnotation2 != null || annotationOwner.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationFindAnnotation2, c10);
            }
        }
        FqName fqName = f80577d.get(kotlinName);
        if (fqName == null || (javaAnnotationFindAnnotation = annotationOwner.findAnnotation(fqName)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, javaAnnotationFindAnnotation, c10, false, 4, null);
    }

    @NotNull
    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return f80574a;
    }

    @NotNull
    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return f80576c;
    }

    @NotNull
    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return f80575b;
    }

    @Nullable
    public final AnnotationDescriptor mapOrResolveJavaAnnotation(@NotNull JavaAnnotation annotation, @NotNull LazyJavaResolverContext c10, boolean z10) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c10, "c");
        ClassId classId = annotation.getClassId();
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(annotation, c10);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c10);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(c10, annotation, StandardNames.FqNames.mustBeDocumented);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c10, annotation, z10);
    }
}
