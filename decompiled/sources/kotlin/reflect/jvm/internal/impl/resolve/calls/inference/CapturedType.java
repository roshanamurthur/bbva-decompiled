package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final TypeProjection f81531q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final CapturedTypeConstructor f81532r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f81533s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final TypeAttributes f81534t0;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z10, TypeAttributes typeAttributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i10 & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.f81534t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f81533s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f81531q0);
        sb2.append(RootService.CLOSE_BRACKET);
        sb2.append(isMarkedNullable() ? "?" : "");
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public CapturedTypeConstructor getConstructor() {
        return this.f81532r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new CapturedType(this.f81531q0, getConstructor(), isMarkedNullable(), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public CapturedType makeNullableAsSpecified(boolean z10) {
        if (z10 == isMarkedNullable()) {
            return this;
        }
        return new CapturedType(this.f81531q0, getConstructor(), z10, getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public CapturedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = this.f81531q0.refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(typeProjectionRefine, "refine(...)");
        return new CapturedType(typeProjectionRefine, getConstructor(), isMarkedNullable(), getAttributes());
    }

    public CapturedType(@NotNull TypeProjection typeProjection, @NotNull CapturedTypeConstructor constructor, boolean z10, @NotNull TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f81531q0 = typeProjection;
        this.f81532r0 = constructor;
        this.f81533s0 = z10;
        this.f81534t0 = attributes;
    }
}
