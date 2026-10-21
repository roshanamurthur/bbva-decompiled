package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeParameterDescriptor f81952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f81953b;

    /* JADX INFO: compiled from: StarProjectionImpl.kt */
    public static final class a extends Lambda implements Function0<KotlinType> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final KotlinType invoke() {
            return StarProjectionImplKt.starProjectionType(StarProjectionImpl.this.f81952a);
        }
    }

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f81952a = typeParameter;
        this.f81953b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return (KotlinType) this.f81953b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
