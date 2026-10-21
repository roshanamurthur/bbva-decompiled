package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import bk.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeProjection f81535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public NewCapturedTypeConstructor f81536b;

    public CapturedTypeConstructorImpl(@NotNull TypeProjection projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f81535a = projection;
        getProjection().getProjectionKind();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = getProjection().getType().getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Nullable
    public Void getDeclarationDescriptor() {
        return null;
    }

    @Nullable
    public final NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.f81536b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    public TypeProjection getProjection() {
        return this.f81535a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection<KotlinType> getSupertypes() {
        KotlinType type = getProjection().getProjectionKind() == Variance.OUT_VARIANCE ? getProjection().getType() : getBuiltIns().getNullableAnyType();
        Intrinsics.checkNotNull(type);
        return d.listOf(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public final void setNewTypeConstructor(@Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f81536b = newCapturedTypeConstructor;
    }

    @NotNull
    public String toString() {
        return "CapturedTypeConstructor(" + getProjection() + RootService.CLOSE_BRACKET;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo5778getDeclarationDescriptor() {
        return (ClassifierDescriptor) getDeclarationDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public CapturedTypeConstructorImpl refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = getProjection().refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(typeProjectionRefine, "refine(...)");
        return new CapturedTypeConstructorImpl(typeProjectionRefine);
    }
}
