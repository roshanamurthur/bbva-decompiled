package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SimpleType f81879q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SimpleType f81880r0;

    public AbbreviatedType(@NotNull SimpleType delegate, @NotNull SimpleType abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.f81879q0 = delegate;
        this.f81880r0 = abbreviation;
    }

    @NotNull
    public final SimpleType getAbbreviation() {
        return this.f81880r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.f81879q0;
    }

    @NotNull
    public final SimpleType getExpandedType() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new AbbreviatedType(getDelegate().replaceAttributes(newAttributes), this.f81880r0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public AbbreviatedType replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new AbbreviatedType(delegate, this.f81880r0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public AbbreviatedType makeNullableAsSpecified(boolean z10) {
        return new AbbreviatedType(getDelegate().makeNullableAsSpecified(z10), this.f81880r0.makeNullableAsSpecified(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public AbbreviatedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getDelegate());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.f81880r0);
        Intrinsics.checkNotNull(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new AbbreviatedType((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2);
    }
}
