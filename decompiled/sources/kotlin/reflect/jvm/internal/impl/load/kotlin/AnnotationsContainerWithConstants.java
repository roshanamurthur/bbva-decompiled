package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<MemberSignature, List<A>> f80862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<MemberSignature, C> f80863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<MemberSignature, C> f80864c;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsContainerWithConstants(@NotNull Map<MemberSignature, ? extends List<? extends A>> memberAnnotations, @NotNull Map<MemberSignature, ? extends C> propertyConstants, @NotNull Map<MemberSignature, ? extends C> annotationParametersDefaultValues) {
        Intrinsics.checkNotNullParameter(memberAnnotations, "memberAnnotations");
        Intrinsics.checkNotNullParameter(propertyConstants, "propertyConstants");
        Intrinsics.checkNotNullParameter(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f80862a = memberAnnotations;
        this.f80863b = propertyConstants;
        this.f80864c = annotationParametersDefaultValues;
    }

    @NotNull
    public final Map<MemberSignature, C> getAnnotationParametersDefaultValues() {
        return this.f80864c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    @NotNull
    public Map<MemberSignature, List<A>> getMemberAnnotations() {
        return this.f80862a;
    }

    @NotNull
    public final Map<MemberSignature, C> getPropertyConstants() {
        return this.f80863b;
    }
}
