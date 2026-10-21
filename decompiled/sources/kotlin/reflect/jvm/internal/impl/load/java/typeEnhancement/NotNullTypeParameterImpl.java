package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SimpleType f80788q0;

    public NotNullTypeParameterImpl(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f80788q0 = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.f80788q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        if (!TypeUtilsKt.isTypeParameter(unwrappedTypeUnwrap) && !TypeUtils.isNullableType(unwrappedTypeUnwrap)) {
            return unwrappedTypeUnwrap;
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
            SimpleType simpleTypeMakeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
            return !TypeUtilsKt.isTypeParameter(simpleType) ? simpleTypeMakeNullableAsSpecified : new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified);
        }
        if (!(unwrappedTypeUnwrap instanceof FlexibleType)) {
            throw new IllegalStateException(("Incorrect type: " + unwrappedTypeUnwrap).toString());
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
        SimpleType lowerBound = flexibleType.getLowerBound();
        SimpleType simpleTypeMakeNullableAsSpecified2 = lowerBound.makeNullableAsSpecified(false);
        if (TypeUtilsKt.isTypeParameter(lowerBound)) {
            simpleTypeMakeNullableAsSpecified2 = new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified2);
        }
        SimpleType upperBound = flexibleType.getUpperBound();
        SimpleType simpleTypeMakeNullableAsSpecified3 = upperBound.makeNullableAsSpecified(false);
        if (TypeUtilsKt.isTypeParameter(upperBound)) {
            simpleTypeMakeNullableAsSpecified3 = new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified3);
        }
        return TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(simpleTypeMakeNullableAsSpecified2, simpleTypeMakeNullableAsSpecified3), TypeWithEnhancementKt.getEnhancement(unwrappedTypeUnwrap));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z10) {
        return z10 ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public NotNullTypeParameterImpl replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new NotNullTypeParameterImpl(delegate);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public NotNullTypeParameterImpl replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(getDelegate().replaceAttributes(newAttributes));
    }
}
