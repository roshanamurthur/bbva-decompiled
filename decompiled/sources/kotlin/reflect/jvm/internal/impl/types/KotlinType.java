package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f81931p0;

    public KotlinType() {
    }

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return isMarkedNullable() == kotlinType.isMarkedNullable() && StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrap(), kotlinType.unwrap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.getAnnotations(getAttributes());
    }

    @NotNull
    public abstract List<TypeProjection> getArguments();

    @NotNull
    public abstract TypeAttributes getAttributes();

    @NotNull
    public abstract TypeConstructor getConstructor();

    @NotNull
    public abstract MemberScope getMemberScope();

    public final int hashCode() {
        int iHashCode;
        int i10 = this.f81931p0;
        if (i10 != 0) {
            return i10;
        }
        if (KotlinTypeKt.isError(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (isMarkedNullable() ? 1 : 0) + ((getArguments().hashCode() + (getConstructor().hashCode() * 31)) * 31);
        }
        this.f81931p0 = iHashCode;
        return iHashCode;
    }

    public abstract boolean isMarkedNullable();

    @NotNull
    public abstract KotlinType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    public abstract UnwrappedType unwrap();
}
