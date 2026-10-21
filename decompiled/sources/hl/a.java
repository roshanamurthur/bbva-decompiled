package hl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends DelegatingSimpleTypeImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull SimpleType delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public a replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new a(delegate);
    }
}
