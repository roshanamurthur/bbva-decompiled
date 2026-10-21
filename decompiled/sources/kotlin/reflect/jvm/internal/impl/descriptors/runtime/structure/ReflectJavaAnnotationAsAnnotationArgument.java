package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectJavaAnnotationAsAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaAnnotationAsAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Annotation f80438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaAnnotationAsAnnotationArgument(@Nullable Name name, @NotNull Annotation annotation) {
        super(name, null);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f80438b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument
    @NotNull
    public JavaAnnotation getAnnotation() {
        return new ReflectJavaAnnotation(this.f80438b);
    }
}
