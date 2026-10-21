package com.bbva.glomohybrid.landing.domain.model;

import com.bbva.component.dm.settings.domain.model.VisualMessageConfiguration;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAppAccess.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "", "()V", "Available", "NotAvailable", "NotAvailableForUpdate", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess$Available;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess$NotAvailable;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess$NotAvailableForUpdate;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LandingAppAccess {

    /* JADX INFO: compiled from: LandingAppAccess.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess$Available;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Available extends LandingAppAccess {

        @NotNull
        public static final Available INSTANCE = new Available();

        public Available() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Available)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1643827963;
        }

        @NotNull
        public String toString() {
            return "Available";
        }
    }

    /* JADX INFO: compiled from: LandingAppAccess.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess$NotAvailable;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "component1", "message", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "getMessage", "()Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class NotAvailable extends LandingAppAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final VisualMessageConfiguration message;

        public NotAvailable(@Nullable VisualMessageConfiguration visualMessageConfiguration) {
            super(null);
            this.message = visualMessageConfiguration;
        }

        public static /* synthetic */ NotAvailable copy$default(NotAvailable notAvailable, VisualMessageConfiguration visualMessageConfiguration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                visualMessageConfiguration = notAvailable.message;
            }
            return notAvailable.copy(visualMessageConfiguration);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VisualMessageConfiguration getMessage() {
            return this.message;
        }

        @NotNull
        public final NotAvailable copy(@Nullable VisualMessageConfiguration message) {
            return new NotAvailable(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotAvailable) && Intrinsics.areEqual(this.message, ((NotAvailable) other).message);
        }

        @Nullable
        public final VisualMessageConfiguration getMessage() {
            return this.message;
        }

        public int hashCode() {
            VisualMessageConfiguration visualMessageConfiguration = this.message;
            if (visualMessageConfiguration == null) {
                return 0;
            }
            return visualMessageConfiguration.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotAvailable(message=" + this.message + ")";
        }
    }

    /* JADX INFO: compiled from: LandingAppAccess.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess$NotAvailableForUpdate;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "", "component1", "", "component2", "packageId", "isImmediateUpdateAvailable", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "b", "Z", "()Z", "<init>", "(Ljava/lang/String;Z)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class NotAvailableForUpdate extends LandingAppAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String packageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean isImmediateUpdateAvailable;

        public /* synthetic */ NotAvailableForUpdate(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? true : z10);
        }

        public static /* synthetic */ NotAvailableForUpdate copy$default(NotAvailableForUpdate notAvailableForUpdate, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notAvailableForUpdate.packageId;
            }
            if ((i10 & 2) != 0) {
                z10 = notAvailableForUpdate.isImmediateUpdateAvailable;
            }
            return notAvailableForUpdate.copy(str, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPackageId() {
            return this.packageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsImmediateUpdateAvailable() {
            return this.isImmediateUpdateAvailable;
        }

        @NotNull
        public final NotAvailableForUpdate copy(@NotNull String packageId, boolean isImmediateUpdateAvailable) {
            Intrinsics.checkNotNullParameter(packageId, "packageId");
            return new NotAvailableForUpdate(packageId, isImmediateUpdateAvailable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotAvailableForUpdate)) {
                return false;
            }
            NotAvailableForUpdate notAvailableForUpdate = (NotAvailableForUpdate) other;
            return Intrinsics.areEqual(this.packageId, notAvailableForUpdate.packageId) && this.isImmediateUpdateAvailable == notAvailableForUpdate.isImmediateUpdateAvailable;
        }

        @NotNull
        public final String getPackageId() {
            return this.packageId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.packageId.hashCode() * 31;
            boolean z10 = this.isImmediateUpdateAvailable;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        public final boolean isImmediateUpdateAvailable() {
            return this.isImmediateUpdateAvailable;
        }

        @NotNull
        public String toString() {
            return "NotAvailableForUpdate(packageId=" + this.packageId + ", isImmediateUpdateAvailable=" + this.isImmediateUpdateAvailable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAvailableForUpdate(@NotNull String packageId, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(packageId, "packageId");
            this.packageId = packageId;
            this.isImmediateUpdateAvailable = z10;
        }
    }

    public LandingAppAccess() {
    }

    public /* synthetic */ LandingAppAccess(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
