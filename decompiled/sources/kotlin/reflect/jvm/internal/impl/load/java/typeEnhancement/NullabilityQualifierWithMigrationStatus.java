package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NullabilityQualifier f80789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80790b;

    public NullabilityQualifierWithMigrationStatus(@NotNull NullabilityQualifier qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f80789a = qualifier;
        this.f80790b = z10;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f80789a;
        }
        if ((i10 & 2) != 0) {
            z10 = nullabilityQualifierWithMigrationStatus.f80790b;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z10);
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus copy(@NotNull NullabilityQualifier qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f80789a == nullabilityQualifierWithMigrationStatus.f80789a && this.f80790b == nullabilityQualifierWithMigrationStatus.f80790b;
    }

    @NotNull
    public final NullabilityQualifier getQualifier() {
        return this.f80789a;
    }

    public int hashCode() {
        return (this.f80789a.hashCode() * 31) + (this.f80790b ? 1231 : 1237);
    }

    public final boolean isForWarningOnly() {
        return this.f80790b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f80789a);
        sb2.append(", isForWarningOnly=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.f80790b, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i10 & 2) != 0 ? false : z10);
    }
}
