package mx.openpay.library.domain.model.eglobal;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalChargeRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/EglobalChargeRequest;", "Lmx/openpay/library/domain/model/common/ChargeRequest;", "Ljava/math/BigDecimal;", "component1", "", "component2", "component3", "", "component4", PushConstants.AMOUNT, "description", "orderId", "plan", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "d", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "e", "getOrderId", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPlan", "()I", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;I)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EglobalChargeRequest extends ChargeRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BigDecimal amount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final int plan;

    public /* synthetic */ EglobalChargeRequest(BigDecimal bigDecimal, String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i11 & 2) != 0 ? Constant.EGLOBAL_DESCRIPTION_DEFAULT : str, str2, i10);
    }

    public static /* synthetic */ EglobalChargeRequest copy$default(EglobalChargeRequest eglobalChargeRequest, BigDecimal bigDecimal, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = eglobalChargeRequest.getAmount();
        }
        if ((i11 & 2) != 0) {
            str = eglobalChargeRequest.getDescription();
        }
        if ((i11 & 4) != 0) {
            str2 = eglobalChargeRequest.orderId;
        }
        if ((i11 & 8) != 0) {
            i10 = eglobalChargeRequest.plan;
        }
        return eglobalChargeRequest.copy(bigDecimal, str, str2, i10);
    }

    @NotNull
    public final BigDecimal component1() {
        return getAmount();
    }

    @NotNull
    public final String component2() {
        return getDescription();
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPlan() {
        return this.plan;
    }

    @NotNull
    public final EglobalChargeRequest copy(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId, int plan) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new EglobalChargeRequest(amount, description, orderId, plan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EglobalChargeRequest)) {
            return false;
        }
        EglobalChargeRequest eglobalChargeRequest = (EglobalChargeRequest) other;
        return Intrinsics.areEqual(getAmount(), eglobalChargeRequest.getAmount()) && Intrinsics.areEqual(getDescription(), eglobalChargeRequest.getDescription()) && Intrinsics.areEqual(this.orderId, eglobalChargeRequest.orderId) && this.plan == eglobalChargeRequest.plan;
    }

    @Override // mx.openpay.library.domain.model.common.ChargeRequest
    @NotNull
    public BigDecimal getAmount() {
        return this.amount;
    }

    @Override // mx.openpay.library.domain.model.common.ChargeRequest
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPlan() {
        return this.plan;
    }

    public int hashCode() {
        return n1.c(this.orderId, (getDescription().hashCode() + (getAmount().hashCode() * 31)) * 31, 31) + this.plan;
    }

    @NotNull
    public String toString() {
        return "EglobalChargeRequest(amount=" + getAmount() + ", description=" + getDescription() + ", orderId=" + this.orderId + ", plan=" + this.plan + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EglobalChargeRequest(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId, int i10) {
        super(amount, description);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.amount = amount;
        this.description = description;
        this.orderId = orderId;
        this.plan = i10;
    }
}
