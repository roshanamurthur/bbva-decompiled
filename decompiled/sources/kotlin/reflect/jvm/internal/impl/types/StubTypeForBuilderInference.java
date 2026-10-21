package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StubTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final TypeConstructor f81956t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final MemberScope f81957u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(@NotNull NewTypeVariableConstructor originalTypeVariable, boolean z10, @NotNull TypeConstructor constructor) {
        super(originalTypeVariable, z10);
        Intrinsics.checkNotNullParameter(originalTypeVariable, "originalTypeVariable");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        this.f81956t0 = constructor;
        this.f81957u0 = originalTypeVariable.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.f81956t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.f81957u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    @NotNull
    public AbstractStubType materialize(boolean z10) {
        return new StubTypeForBuilderInference(getOriginalTypeVariable(), z10, getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Stub (BI): ");
        sb2.append(getOriginalTypeVariable());
        sb2.append(isMarkedNullable() ? "?" : "");
        return sb2.toString();
    }
}
