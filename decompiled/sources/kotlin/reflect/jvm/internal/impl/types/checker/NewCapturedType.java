package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final CaptureStatus f82009q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final NewCapturedTypeConstructor f82010r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final UnwrappedType f82011s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final TypeAttributes f82012t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f82013u0;
    public final boolean v0;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i10 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.f82012t0;
    }

    @NotNull
    public final CaptureStatus getCaptureStatus() {
        return this.f82009q0;
    }

    @Nullable
    public final UnwrappedType getLowerType() {
        return this.f82011s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f82013u0;
    }

    public final boolean isProjectionNotNull() {
        return this.v0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public NewCapturedTypeConstructor getConstructor() {
        return this.f82010r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new NewCapturedType(this.f82009q0, getConstructor(), this.f82011s0, newAttributes, isMarkedNullable(), this.v0);
    }

    public NewCapturedType(@NotNull CaptureStatus captureStatus, @NotNull NewCapturedTypeConstructor constructor, @Nullable UnwrappedType unwrappedType, @NotNull TypeAttributes attributes, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f82009q0 = captureStatus;
        this.f82010r0 = constructor;
        this.f82011s0 = unwrappedType;
        this.f82012t0 = attributes;
        this.f82013u0 = z10;
        this.v0 = z11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public NewCapturedType makeNullableAsSpecified(boolean z10) {
        return new NewCapturedType(this.f82009q0, getConstructor(), this.f82011s0, getAttributes(), z10, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public NewCapturedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f82009q0;
        NewCapturedTypeConstructor newCapturedTypeConstructorRefine = getConstructor().refine(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.f82011s0;
        return new NewCapturedType(captureStatus, newCapturedTypeConstructorRefine, unwrappedType != null ? kotlinTypeRefiner.refineType((KotlinTypeMarker) unwrappedType).unwrap() : null, getAttributes(), isMarkedNullable(), false, 32, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType(@NotNull CaptureStatus captureStatus, @Nullable UnwrappedType unwrappedType, @NotNull TypeProjection projection, @NotNull TypeParameterDescriptor typeParameter) {
        this(captureStatus, new NewCapturedTypeConstructor(projection, null, null, typeParameter, 6, null), unwrappedType, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
    }
}
