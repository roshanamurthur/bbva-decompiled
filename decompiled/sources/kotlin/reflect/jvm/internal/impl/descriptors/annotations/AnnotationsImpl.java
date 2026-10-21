package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotationsImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationsImpl implements Annotations {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<AnnotationDescriptor> f80251p0;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsImpl(@NotNull List<? extends AnnotationDescriptor> annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f80251p0 = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo5773findAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f80251p0.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return this.f80251p0.iterator();
    }

    @NotNull
    public String toString() {
        return this.f80251p0.toString();
    }
}
