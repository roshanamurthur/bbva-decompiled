package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SimpleType f81916q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SimpleType f81917r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        super(null);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.f81916q0 = lowerBound;
        this.f81917r0 = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @NotNull
    public abstract SimpleType getDelegate();

    @NotNull
    public final SimpleType getLowerBound() {
        return this.f81916q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @NotNull
    public final SimpleType getUpperBound() {
        return this.f81917r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @NotNull
    public abstract String render(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions);

    @NotNull
    public String toString() {
        return DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }
}
