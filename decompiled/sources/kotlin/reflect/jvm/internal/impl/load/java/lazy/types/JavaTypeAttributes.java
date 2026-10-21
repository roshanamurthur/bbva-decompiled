package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import bk.v;
import bk.x;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaTypeAttributes.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TypeUsage f80752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final JavaTypeFlexibility f80753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f80754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Set<TypeParameterDescriptor> f80756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final SimpleType f80757i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, boolean z11, Set set, SimpleType simpleType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i10 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : simpleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, boolean z11, Set set, SimpleType simpleType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeUsage = javaTypeAttributes.f80752d;
        }
        if ((i10 & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.f80753e;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i10 & 4) != 0) {
            z10 = javaTypeAttributes.f80754f;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = javaTypeAttributes.f80755g;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            set = javaTypeAttributes.f80756h;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            simpleType = javaTypeAttributes.f80757i;
        }
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility2, z12, z13, set2, simpleType);
    }

    @NotNull
    public final JavaTypeAttributes copy(@NotNull TypeUsage howThisTypeIsUsed, @NotNull JavaTypeFlexibility flexibility, boolean z10, boolean z11, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z10, z11, set, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return Intrinsics.areEqual(javaTypeAttributes.getDefaultType(), getDefaultType()) && javaTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && javaTypeAttributes.f80753e == this.f80753e && javaTypeAttributes.f80754f == this.f80754f && javaTypeAttributes.f80755g == this.f80755g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    public SimpleType getDefaultType() {
        return this.f80757i;
    }

    @NotNull
    public final JavaTypeFlexibility getFlexibility() {
        return this.f80753e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.f80752d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f80756h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        int iHashCode2 = getHowThisTypeIsUsed().hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f80753e.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i10 = (iHashCode3 * 31) + (this.f80754f ? 1 : 0) + iHashCode3;
        return (i10 * 31) + (this.f80755g ? 1 : 0) + i10;
    }

    public final boolean isForAnnotationParameter() {
        return this.f80755g;
    }

    public final boolean isRaw() {
        return this.f80754f;
    }

    @NotNull
    public final JavaTypeAttributes markIsRaw(boolean z10) {
        return copy$default(this, null, null, z10, false, null, null, 59, null);
    }

    @NotNull
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f80752d + ", flexibility=" + this.f80753e + ", isRaw=" + this.f80754f + ", isForAnnotationParameter=" + this.f80755g + ", visitedTypeParameters=" + this.f80756h + ", defaultType=" + this.f80757i + RootService.CLOSE_BRACKET;
    }

    @NotNull
    public JavaTypeAttributes withDefaultType(@Nullable SimpleType simpleType) {
        return copy$default(this, null, null, false, false, null, simpleType, 31, null);
    }

    @NotNull
    public final JavaTypeAttributes withFlexibility(@NotNull JavaTypeFlexibility flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return copy$default(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    public JavaTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? x.plus(getVisitedTypeParameters(), typeParameter) : v.setOf(typeParameter), null, 47, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(@NotNull TypeUsage howThisTypeIsUsed, @NotNull JavaTypeFlexibility flexibility, boolean z10, boolean z11, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        super(howThisTypeIsUsed, set, simpleType);
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        this.f80752d = howThisTypeIsUsed;
        this.f80753e = flexibility;
        this.f80754f = z10;
        this.f80755g = z11;
        this.f80756h = set;
        this.f80757i = simpleType;
    }
}
