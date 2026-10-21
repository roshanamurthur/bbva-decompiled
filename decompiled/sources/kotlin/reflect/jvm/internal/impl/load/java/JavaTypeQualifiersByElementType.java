package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaTypeQualifiersByElementType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaTypeQualifiersByElementType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> f80517a;

    public JavaTypeQualifiersByElementType(@NotNull EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers) {
        Intrinsics.checkNotNullParameter(defaultQualifiers, "defaultQualifiers");
        this.f80517a = defaultQualifiers;
    }

    @Nullable
    public final JavaDefaultQualifiers get(@Nullable AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f80517a.get(annotationQualifierApplicabilityType);
    }

    @NotNull
    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> getDefaultQualifiers() {
        return this.f80517a;
    }
}
