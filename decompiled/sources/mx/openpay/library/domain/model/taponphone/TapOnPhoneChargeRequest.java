package mx.openpay.library.domain.model.taponphone;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhoneChargeRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/domain/model/taponphone/TapOnPhoneChargeRequest;", "Lmx/openpay/library/domain/model/common/ChargeRequest;", "Ljava/math/BigDecimal;", "component1", "", "component2", "component3", PushConstants.AMOUNT, "description", "orderId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "d", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "e", "getOrderId", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TapOnPhoneChargeRequest extends ChargeRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BigDecimal amount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    public /* synthetic */ TapOnPhoneChargeRequest(BigDecimal bigDecimal, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i10 & 2) != 0 ? Constant.TAP_ON_PHONE_DESCRIPTION_DEFAULT : str, str2);
    }

    public static /* synthetic */ TapOnPhoneChargeRequest copy$default(TapOnPhoneChargeRequest tapOnPhoneChargeRequest, BigDecimal bigDecimal, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bigDecimal = tapOnPhoneChargeRequest.getAmount();
        }
        if ((i10 & 2) != 0) {
            str = tapOnPhoneChargeRequest.getDescription();
        }
        if ((i10 & 4) != 0) {
            str2 = tapOnPhoneChargeRequest.orderId;
        }
        return tapOnPhoneChargeRequest.copy(bigDecimal, str, str2);
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

    @NotNull
    public final TapOnPhoneChargeRequest copy(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new TapOnPhoneChargeRequest(amount, description, orderId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapOnPhoneChargeRequest)) {
            return false;
        }
        TapOnPhoneChargeRequest tapOnPhoneChargeRequest = (TapOnPhoneChargeRequest) other;
        return Intrinsics.areEqual(getAmount(), tapOnPhoneChargeRequest.getAmount()) && Intrinsics.areEqual(getDescription(), tapOnPhoneChargeRequest.getDescription()) && Intrinsics.areEqual(this.orderId, tapOnPhoneChargeRequest.orderId);
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

    public int hashCode() {
        return this.orderId.hashCode() + ((getDescription().hashCode() + (getAmount().hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        BigDecimal amount = getAmount();
        String description = getDescription();
        StringBuilder sb2 = new StringBuilder("TapOnPhoneChargeRequest(amount=");
        sb2.append(amount);
        sb2.append(", description=");
        sb2.append(description);
        sb2.append(", orderId=");
        return d.f(sb2, this.orderId, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapOnPhoneChargeRequest(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId) {
        super(amount, description);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.amount = amount;
        this.description = description;
        this.orderId = orderId;
    }
}
