package kotlin.reflect.jvm.internal.impl.types;

import bk.v;
import bk.x;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ErasureTypeAttributes.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nErasureTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasureTypeAttributes.kt\norg/jetbrains/kotlin/types/ErasureTypeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public class ErasureTypeAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeUsage f81913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Set<TypeParameterDescriptor> f81914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final SimpleType f81915c;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureTypeAttributes(@NotNull TypeUsage howThisTypeIsUsed, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f81913a = howThisTypeIsUsed;
        this.f81914b = set;
        this.f81915c = simpleType;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return Intrinsics.areEqual(erasureTypeAttributes.getDefaultType(), getDefaultType()) && erasureTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed();
    }

    @Nullable
    public SimpleType getDefaultType() {
        return this.f81915c;
    }

    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.f81913a;
    }

    @Nullable
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f81914b;
    }

    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        return getHowThisTypeIsUsed().hashCode() + (iHashCode * 31) + iHashCode;
    }

    @NotNull
    public ErasureTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameter) {
        Set of2;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        TypeUsage howThisTypeIsUsed = getHowThisTypeIsUsed();
        Set<TypeParameterDescriptor> visitedTypeParameters = getVisitedTypeParameters();
        if (visitedTypeParameters == null || (of2 = x.plus(visitedTypeParameters, typeParameter)) == null) {
            of2 = v.setOf(typeParameter);
        }
        return new ErasureTypeAttributes(howThisTypeIsUsed, of2, getDefaultType());
    }
}
