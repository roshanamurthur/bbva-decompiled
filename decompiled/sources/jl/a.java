package jl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeParameterDescriptor f79102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KotlinType f79103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final KotlinType f79104c;

    public a(@NotNull TypeParameterDescriptor typeParameter, @NotNull KotlinType inProjection, @NotNull KotlinType outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f79102a = typeParameter;
        this.f79103b = inProjection;
        this.f79104c = outProjection;
    }

    @NotNull
    public final KotlinType getInProjection() {
        return this.f79103b;
    }

    @NotNull
    public final KotlinType getOutProjection() {
        return this.f79104c;
    }

    @NotNull
    public final TypeParameterDescriptor getTypeParameter() {
        return this.f79102a;
    }

    public final boolean isConsistent() {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(this.f79103b, this.f79104c);
    }
}
