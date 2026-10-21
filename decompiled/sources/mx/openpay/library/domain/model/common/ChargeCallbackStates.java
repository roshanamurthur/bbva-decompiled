package mx.openpay.library.domain.model.common;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.CreateCharge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChargeCallback.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/domain/model/common/ChargeCallbackStates;", "", "()V", "Eglobal", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ChargeCallbackStates {

    /* JADX INFO: compiled from: ChargeCallback.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal;", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates;", "()V", "PayWithPlans", "PayWithPoints", "RequestDigitalSignature", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal$PayWithPlans;", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal$PayWithPoints;", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal$RequestDigitalSignature;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Eglobal extends ChargeCallbackStates {

        /* JADX INFO: compiled from: ChargeCallback.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal$PayWithPlans;", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal;", "Lmx/openpay/library/domain/model/CreateCharge;", "component1", "", "", "component2", "createCharge", "plans", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lmx/openpay/library/domain/model/CreateCharge;", "getCreateCharge", "()Lmx/openpay/library/domain/model/CreateCharge;", "b", "Ljava/util/List;", "getPlans", "()Ljava/util/List;", "<init>", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/util/List;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class PayWithPlans extends Eglobal {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final CreateCharge createCharge;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<Integer> plans;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PayWithPlans(@NotNull CreateCharge createCharge, @NotNull List<Integer> plans) {
                super(null);
                Intrinsics.checkNotNullParameter(createCharge, "createCharge");
                Intrinsics.checkNotNullParameter(plans, "plans");
                this.createCharge = createCharge;
                this.plans = plans;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PayWithPlans copy$default(PayWithPlans payWithPlans, CreateCharge createCharge, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    createCharge = payWithPlans.createCharge;
                }
                if ((i10 & 2) != 0) {
                    list = payWithPlans.plans;
                }
                return payWithPlans.copy(createCharge, list);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final CreateCharge getCreateCharge() {
                return this.createCharge;
            }

            @NotNull
            public final List<Integer> component2() {
                return this.plans;
            }

            @NotNull
            public final PayWithPlans copy(@NotNull CreateCharge createCharge, @NotNull List<Integer> plans) {
                Intrinsics.checkNotNullParameter(createCharge, "createCharge");
                Intrinsics.checkNotNullParameter(plans, "plans");
                return new PayWithPlans(createCharge, plans);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PayWithPlans)) {
                    return false;
                }
                PayWithPlans payWithPlans = (PayWithPlans) other;
                return Intrinsics.areEqual(this.createCharge, payWithPlans.createCharge) && Intrinsics.areEqual(this.plans, payWithPlans.plans);
            }

            @NotNull
            public final CreateCharge getCreateCharge() {
                return this.createCharge;
            }

            @NotNull
            public final List<Integer> getPlans() {
                return this.plans;
            }

            public int hashCode() {
                return this.plans.hashCode() + (this.createCharge.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "PayWithPlans(createCharge=" + this.createCharge + ", plans=" + this.plans + ")";
            }
        }

        /* JADX INFO: compiled from: ChargeCallback.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal$PayWithPoints;", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal;", "Lmx/openpay/library/domain/model/CreateCharge;", "component1", "createCharge", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lmx/openpay/library/domain/model/CreateCharge;", "getCreateCharge", "()Lmx/openpay/library/domain/model/CreateCharge;", "<init>", "(Lmx/openpay/library/domain/model/CreateCharge;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class PayWithPoints extends Eglobal {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final CreateCharge createCharge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PayWithPoints(@NotNull CreateCharge createCharge) {
                super(null);
                Intrinsics.checkNotNullParameter(createCharge, "createCharge");
                this.createCharge = createCharge;
            }

            public static /* synthetic */ PayWithPoints copy$default(PayWithPoints payWithPoints, CreateCharge createCharge, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    createCharge = payWithPoints.createCharge;
                }
                return payWithPoints.copy(createCharge);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final CreateCharge getCreateCharge() {
                return this.createCharge;
            }

            @NotNull
            public final PayWithPoints copy(@NotNull CreateCharge createCharge) {
                Intrinsics.checkNotNullParameter(createCharge, "createCharge");
                return new PayWithPoints(createCharge);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PayWithPoints) && Intrinsics.areEqual(this.createCharge, ((PayWithPoints) other).createCharge);
            }

            @NotNull
            public final CreateCharge getCreateCharge() {
                return this.createCharge;
            }

            public int hashCode() {
                return this.createCharge.hashCode();
            }

            @NotNull
            public String toString() {
                return "PayWithPoints(createCharge=" + this.createCharge + ")";
            }
        }

        /* JADX INFO: compiled from: ChargeCallback.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal$RequestDigitalSignature;", "Lmx/openpay/library/domain/model/common/ChargeCallbackStates$Eglobal;", "Lmx/openpay/library/domain/model/CreateCharge;", "component1", "createCharge", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lmx/openpay/library/domain/model/CreateCharge;", "getCreateCharge", "()Lmx/openpay/library/domain/model/CreateCharge;", "<init>", "(Lmx/openpay/library/domain/model/CreateCharge;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class RequestDigitalSignature extends Eglobal {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final CreateCharge createCharge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestDigitalSignature(@NotNull CreateCharge createCharge) {
                super(null);
                Intrinsics.checkNotNullParameter(createCharge, "createCharge");
                this.createCharge = createCharge;
            }

            public static /* synthetic */ RequestDigitalSignature copy$default(RequestDigitalSignature requestDigitalSignature, CreateCharge createCharge, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    createCharge = requestDigitalSignature.createCharge;
                }
                return requestDigitalSignature.copy(createCharge);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final CreateCharge getCreateCharge() {
                return this.createCharge;
            }

            @NotNull
            public final RequestDigitalSignature copy(@NotNull CreateCharge createCharge) {
                Intrinsics.checkNotNullParameter(createCharge, "createCharge");
                return new RequestDigitalSignature(createCharge);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequestDigitalSignature) && Intrinsics.areEqual(this.createCharge, ((RequestDigitalSignature) other).createCharge);
            }

            @NotNull
            public final CreateCharge getCreateCharge() {
                return this.createCharge;
            }

            public int hashCode() {
                return this.createCharge.hashCode();
            }

            @NotNull
            public String toString() {
                return "RequestDigitalSignature(createCharge=" + this.createCharge + ")";
            }
        }

        public /* synthetic */ Eglobal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Eglobal() {
            super(null);
        }
    }

    public ChargeCallbackStates() {
    }

    public /* synthetic */ ChargeCallbackStates(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
