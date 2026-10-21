package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SimpleType f81949q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final KotlinType f81950r0;

    public SimpleTypeWithEnhancement(@NotNull SimpleType delegate, @NotNull KotlinType enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f81949q0 = delegate;
        this.f81950r0 = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.f81949q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    public KotlinType getEnhancement() {
        return this.f81950r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + getEnhancement() + ")] " + getOrigin();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    public SimpleType getOrigin() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z10) {
        UnwrappedType unwrappedTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z10), getEnhancement().unwrap().makeNullableAsSpecified(z10));
        Intrinsics.checkNotNull(unwrappedTypeWrapEnhancement, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeWrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        UnwrappedType unwrappedTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAttributes(newAttributes), getEnhancement());
        Intrinsics.checkNotNull(unwrappedTypeWrapEnhancement, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeWrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleTypeWithEnhancement replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new SimpleTypeWithEnhancement(delegate, getEnhancement());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public SimpleTypeWithEnhancement refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getDelegate());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new SimpleTypeWithEnhancement((SimpleType) kotlinTypeRefineType, kotlinTypeRefiner.refineType((KotlinTypeMarker) getEnhancement()));
    }
}
