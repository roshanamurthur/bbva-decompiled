package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class UnwrappedType extends KotlinType {
    public /* synthetic */ UnwrappedType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract UnwrappedType makeNullableAsSpecified(boolean z10);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public abstract UnwrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    public abstract UnwrappedType replaceAttributes(@NotNull TypeAttributes typeAttributes);

    public UnwrappedType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public final UnwrappedType unwrap() {
        return this;
    }
}
