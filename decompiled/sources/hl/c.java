package hl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final TypeAttributes f69470r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull SimpleType delegate, @NotNull TypeAttributes attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f69470r0 = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.f69470r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public c replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new c(delegate, getAttributes());
    }
}
