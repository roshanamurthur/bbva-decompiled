package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotationsTypeAttribute.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Annotations f81899a;

    public AnnotationsTypeAttribute(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f81899a = annotations;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.areEqual(((AnnotationsTypeAttribute) obj).f81899a, this.f81899a);
        }
        return false;
    }

    @NotNull
    public final Annotations getAnnotations() {
        return this.f81899a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public KClass<? extends AnnotationsTypeAttribute> getKey() {
        return Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class);
    }

    public int hashCode() {
        return this.f81899a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public AnnotationsTypeAttribute add(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.f81899a, annotationsTypeAttribute.f81899a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @Nullable
    public AnnotationsTypeAttribute intersect(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.areEqual(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}
