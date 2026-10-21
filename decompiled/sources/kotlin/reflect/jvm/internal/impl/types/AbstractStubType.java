package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StubTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractStubType extends SimpleType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final NewTypeVariableConstructor f81881q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f81882r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ErrorScope f81883s0;

    /* JADX INFO: compiled from: StubTypes.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractStubType(@NotNull NewTypeVariableConstructor originalTypeVariable, boolean z10) {
        Intrinsics.checkNotNullParameter(originalTypeVariable, "originalTypeVariable");
        this.f81881q0 = originalTypeVariable;
        this.f81882r0 = z10;
        this.f81883s0 = ErrorUtils.createErrorScope(ErrorScopeKind.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.f81883s0;
    }

    @NotNull
    public final NewTypeVariableConstructor getOriginalTypeVariable() {
        return this.f81881q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f81882r0;
    }

    @NotNull
    public abstract AbstractStubType materialize(boolean z10);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public AbstractStubType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
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
        return z10 == isMarkedNullable() ? this : materialize(z10);
    }
}
