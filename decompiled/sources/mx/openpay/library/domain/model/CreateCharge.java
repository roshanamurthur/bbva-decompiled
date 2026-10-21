package mx.openpay.library.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.eglobal.EncryptedCard;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreateCharge.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lmx/openpay/library/domain/model/CreateCharge;", "", "Ljava/math/BigDecimal;", "component1", "", "component2", "component3", "Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "component4", "component5", "component6", "", "component7", "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "component8", PushConstants.AMOUNT, "currency", "description", "encryptedCard", "method", "orderId", "useCardPoints", "paymentPlan", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "b", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "c", "getDescription", "d", "Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "getEncryptedCard", "()Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "e", "getMethod", "f", "getOrderId", "g", "Z", "getUseCardPoints", "()Z", "setUseCardPoints", "(Z)V", "h", "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "getPaymentPlan", "()Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/EncryptedCard;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/domain/model/eglobal/PaymentPlan;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CreateCharge {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EncryptedCard encryptedCard;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String method;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean useCardPoints;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PaymentPlan paymentPlan;

    public CreateCharge(@NotNull BigDecimal amount, @NotNull String currency, @NotNull String description, @NotNull EncryptedCard encryptedCard, @NotNull String method, @NotNull String orderId, boolean z10, @Nullable PaymentPlan paymentPlan) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(encryptedCard, "encryptedCard");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.encryptedCard = encryptedCard;
        this.method = method;
        this.orderId = orderId;
        this.useCardPoints = z10;
        this.paymentPlan = paymentPlan;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EncryptedCard getEncryptedCard() {
        return this.encryptedCard;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getUseCardPoints() {
        return this.useCardPoints;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @NotNull
    public final CreateCharge copy(@NotNull BigDecimal amount, @NotNull String currency, @NotNull String description, @NotNull EncryptedCard encryptedCard, @NotNull String method, @NotNull String orderId, boolean useCardPoints, @Nullable PaymentPlan paymentPlan) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(encryptedCard, "encryptedCard");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new CreateCharge(amount, currency, description, encryptedCard, method, orderId, useCardPoints, paymentPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCharge)) {
            return false;
        }
        CreateCharge createCharge = (CreateCharge) other;
        return Intrinsics.areEqual(this.amount, createCharge.amount) && Intrinsics.areEqual(this.currency, createCharge.currency) && Intrinsics.areEqual(this.description, createCharge.description) && Intrinsics.areEqual(this.encryptedCard, createCharge.encryptedCard) && Intrinsics.areEqual(this.method, createCharge.method) && Intrinsics.areEqual(this.orderId, createCharge.orderId) && this.useCardPoints == createCharge.useCardPoints && Intrinsics.areEqual(this.paymentPlan, createCharge.paymentPlan);
    }

    @NotNull
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final EncryptedCard getEncryptedCard() {
        return this.encryptedCard;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final PaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    public final boolean getUseCardPoints() {
        return this.useCardPoints;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        int iC = n1.c(this.orderId, n1.c(this.method, (this.encryptedCard.hashCode() + n1.c(this.description, n1.c(this.currency, this.amount.hashCode() * 31, 31), 31)) * 31, 31), 31);
        boolean z10 = this.useCardPoints;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iC + r3) * 31;
        PaymentPlan paymentPlan = this.paymentPlan;
        return i10 + (paymentPlan == null ? 0 : paymentPlan.hashCode());
    }

    public final void setUseCardPoints(boolean z10) {
        this.useCardPoints = z10;
    }

    @NotNull
    public String toString() {
        return "CreateCharge(amount=" + this.amount + ", currency=" + this.currency + ", description=" + this.description + ", encryptedCard=" + this.encryptedCard + ", method=" + this.method + ", orderId=" + this.orderId + ", useCardPoints=" + this.useCardPoints + ", paymentPlan=" + this.paymentPlan + ")";
    }

    public /* synthetic */ CreateCharge(BigDecimal bigDecimal, String str, String str2, EncryptedCard encryptedCard, String str3, String str4, boolean z10, PaymentPlan paymentPlan, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, str2, encryptedCard, str3, str4, (i10 & 64) != 0 ? false : z10, paymentPlan);
    }
}
