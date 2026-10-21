package kotlin.reflect.jvm.internal.impl.types;

import hl.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SimpleType f81909q0;

    public DelegatingSimpleTypeImpl(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f81909q0 = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.f81909q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z10) {
        return z10 == isMarkedNullable() ? this : getDelegate().makeNullableAsSpecified(z10).replaceAttributes(getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != getAttributes() ? new c(this, newAttributes) : this;
    }
}
