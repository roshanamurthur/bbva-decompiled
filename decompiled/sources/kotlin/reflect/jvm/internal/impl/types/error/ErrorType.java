package kotlin.reflect.jvm.internal.impl.types.error;

import ai.a;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ErrorType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorType extends SimpleType {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final TypeConstructor f82038q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MemberScope f82039r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ErrorTypeKind f82040s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final List<TypeProjection> f82041t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f82042u0;

    @NotNull
    public final String[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final String f82043w0;

    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i10 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return this.f82041t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.f82038q0;
    }

    @NotNull
    public final String getDebugMessage() {
        return this.f82043w0;
    }

    @NotNull
    public final ErrorTypeKind getKind() {
        return this.f82040s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.f82039r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f82042u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public ErrorType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public final ErrorType replaceArguments(@NotNull List<? extends TypeProjection> newArguments) {
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        ErrorTypeKind errorTypeKind = this.f82040s0;
        boolean zIsMarkedNullable = isMarkedNullable();
        String[] strArr = this.v0;
        return new ErrorType(constructor, memberScope, errorTypeKind, newArguments, zIsMarkedNullable, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z10) {
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        ErrorTypeKind errorTypeKind = this.f82040s0;
        List<TypeProjection> arguments = getArguments();
        String[] strArr = this.v0;
        return new ErrorType(constructor, memberScope, errorTypeKind, arguments, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ErrorType(@NotNull TypeConstructor constructor, @NotNull MemberScope memberScope, @NotNull ErrorTypeKind kind, @NotNull List<? extends TypeProjection> arguments, boolean z10, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f82038q0 = constructor;
        this.f82039r0 = memberScope;
        this.f82040s0 = kind;
        this.f82041t0 = arguments;
        this.f82042u0 = z10;
        this.v0 = formatParams;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f82043w0 = a.i(objArrCopyOf, objArrCopyOf.length, debugMessage, "format(...)");
    }
}
