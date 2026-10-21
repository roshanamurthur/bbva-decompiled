package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReflectAnnotationSource.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectAnnotationSource implements SourceElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Annotation f80406a;

    public ReflectAnnotationSource(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f80406a = annotation;
    }

    @NotNull
    public final Annotation getAnnotation() {
        return this.f80406a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }
}
