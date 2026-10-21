package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes12.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeSubstitution f81908a;

    public DelegatedTypeSubstitution(@NotNull TypeSubstitution substitution) {
        Intrinsics.checkNotNullParameter(substitution, "substitution");
        this.f81908a = substitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.f81908a.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f81908a.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f81908a.filterAnnotations(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: get */
    public TypeProjection mo5782get(@NotNull KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f81908a.mo5782get(key);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.f81908a.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType topLevelType, @NotNull Variance position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f81908a.prepareTopLevelType(topLevelType, position);
    }
}
