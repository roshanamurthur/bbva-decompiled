package kotlin.reflect.jvm.internal.impl.types;

import hl.c;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends SimpleType {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final TypeConstructor f82001q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final List<TypeProjection> f82002r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f82003s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final MemberScope f82004t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Function1<KotlinTypeRefiner, SimpleType> f82005u0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.f82001q0 = constructor;
        this.f82002r0 = arguments;
        this.f82003s0 = z10;
        this.f82004t0 = memberScope;
        this.f82005u0 = refinedTypeFactory;
        if (!(getMemberScope() instanceof ErrorScope) || (getMemberScope() instanceof ThrowingScope)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + getMemberScope() + '\n' + getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return this.f82002r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.f82001q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.f82004t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f82003s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z10) {
        if (z10 == isMarkedNullable()) {
            return this;
        }
        return z10 ? new hl.b(this) : new hl.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new c(this, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public SimpleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleTypeInvoke = this.f82005u0.invoke(kotlinTypeRefiner);
        return simpleTypeInvoke == null ? this : simpleTypeInvoke;
    }
}
