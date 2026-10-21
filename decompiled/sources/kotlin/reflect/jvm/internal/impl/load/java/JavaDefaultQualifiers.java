package kotlin.reflect.jvm.internal.impl.load.java;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotationQualifiersFqNames.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaDefaultQualifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NullabilityQualifierWithMigrationStatus f80500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Collection<AnnotationQualifierApplicabilityType> f80501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80502c;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifier, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f80500a = nullabilityQualifier;
        this.f80501b = qualifierApplicabilityTypes;
        this.f80502c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers copy$default(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f80500a;
        }
        if ((i10 & 2) != 0) {
            collection = javaDefaultQualifiers.f80501b;
        }
        if ((i10 & 4) != 0) {
            z10 = javaDefaultQualifiers.f80502c;
        }
        return javaDefaultQualifiers.copy(nullabilityQualifierWithMigrationStatus, collection, z10);
    }

    @NotNull
    public final JavaDefaultQualifiers copy(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifier, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new JavaDefaultQualifiers(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.areEqual(this.f80500a, javaDefaultQualifiers.f80500a) && Intrinsics.areEqual(this.f80501b, javaDefaultQualifiers.f80501b) && this.f80502c == javaDefaultQualifiers.f80502c;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f80502c;
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.f80500a;
    }

    @NotNull
    public final Collection<AnnotationQualifierApplicabilityType> getQualifierApplicabilityTypes() {
        return this.f80501b;
    }

    public int hashCode() {
        return ((this.f80501b.hashCode() + (this.f80500a.hashCode() * 31)) * 31) + (this.f80502c ? 1231 : 1237);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f80500a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f80501b);
        sb2.append(", definitelyNotNull=");
        return a.d(sb2, this.f80502c, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, (i10 & 4) != 0 ? nullabilityQualifierWithMigrationStatus.getQualifier() == NullabilityQualifier.NOT_NULL : z10);
    }
}
