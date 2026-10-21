package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreateChargeRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003Jo\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/CreateChargeRequestDto;", "", PushConstants.AMOUNT, "Ljava/math/BigDecimal;", "currency", "", "description", "encryptedCard", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;", "method", "orderId", "useCardPoints", "", "paymentPlan", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanRequestDto;", "productType", "origin", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanRequestDto;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getCurrency", "()Ljava/lang/String;", "getDescription", "getEncryptedCard", "()Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;", "getMethod", "getOrderId", "getOrigin", "getPaymentPlan", "()Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanRequestDto;", "getProductType", "getUseCardPoints", "()Z", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreateChargeRequestDto {

    @SerializedName(PushConstants.AMOUNT)
    @NotNull
    private final BigDecimal amount;

    @SerializedName("currency")
    @NotNull
    private final String currency;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("encrypted_card")
    @NotNull
    private final EncryptedCardRequestDto encryptedCard;

    @SerializedName("method")
    @NotNull
    private final String method;

    @SerializedName("order_id")
    @NotNull
    private final String orderId;

    @SerializedName("origin_channel")
    @NotNull
    private final String origin;

    @SerializedName("payment_plan")
    @Nullable
    private final PaymentPlanRequestDto paymentPlan;

    @SerializedName("product_type")
    @NotNull
    private final String productType;

    @SerializedName("use_card_points")
    private final boolean useCardPoints;

    public CreateChargeRequestDto(@NotNull BigDecimal amount, @NotNull String currency, @NotNull String description, @NotNull EncryptedCardRequestDto encryptedCard, @NotNull String method, @NotNull String orderId, boolean z10, @Nullable PaymentPlanRequestDto paymentPlanRequestDto, @NotNull String productType, @NotNull String origin) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(encryptedCard, "encryptedCard");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.encryptedCard = encryptedCard;
        this.method = method;
        this.orderId = orderId;
        this.useCardPoints = z10;
        this.paymentPlan = paymentPlanRequestDto;
        this.productType = productType;
        this.origin = origin;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOrigin() {
        return this.origin;
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
    public final EncryptedCardRequestDto getEncryptedCard() {
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
    public final PaymentPlanRequestDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final CreateChargeRequestDto copy(@NotNull BigDecimal amount, @NotNull String currency, @NotNull String description, @NotNull EncryptedCardRequestDto encryptedCard, @NotNull String method, @NotNull String orderId, boolean useCardPoints, @Nullable PaymentPlanRequestDto paymentPlan, @NotNull String productType, @NotNull String origin) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(encryptedCard, "encryptedCard");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new CreateChargeRequestDto(amount, currency, description, encryptedCard, method, orderId, useCardPoints, paymentPlan, productType, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateChargeRequestDto)) {
            return false;
        }
        CreateChargeRequestDto createChargeRequestDto = (CreateChargeRequestDto) other;
        return Intrinsics.areEqual(this.amount, createChargeRequestDto.amount) && Intrinsics.areEqual(this.currency, createChargeRequestDto.currency) && Intrinsics.areEqual(this.description, createChargeRequestDto.description) && Intrinsics.areEqual(this.encryptedCard, createChargeRequestDto.encryptedCard) && Intrinsics.areEqual(this.method, createChargeRequestDto.method) && Intrinsics.areEqual(this.orderId, createChargeRequestDto.orderId) && this.useCardPoints == createChargeRequestDto.useCardPoints && Intrinsics.areEqual(this.paymentPlan, createChargeRequestDto.paymentPlan) && Intrinsics.areEqual(this.productType, createChargeRequestDto.productType) && Intrinsics.areEqual(this.origin, createChargeRequestDto.origin);
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
    public final EncryptedCardRequestDto getEncryptedCard() {
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

    @NotNull
    public final String getOrigin() {
        return this.origin;
    }

    @Nullable
    public final PaymentPlanRequestDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    public final boolean getUseCardPoints() {
        return this.useCardPoints;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public int hashCode() {
        int iC = n1.c(this.orderId, n1.c(this.method, (this.encryptedCard.hashCode() + n1.c(this.description, n1.c(this.currency, this.amount.hashCode() * 31, 31), 31)) * 31, 31), 31);
        boolean z10 = this.useCardPoints;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iC + r3) * 31;
        PaymentPlanRequestDto paymentPlanRequestDto = this.paymentPlan;
        return this.origin.hashCode() + n1.c(this.productType, (i10 + (paymentPlanRequestDto == null ? 0 : paymentPlanRequestDto.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.currency;
        String str2 = this.description;
        EncryptedCardRequestDto encryptedCardRequestDto = this.encryptedCard;
        String str3 = this.method;
        String str4 = this.orderId;
        boolean z10 = this.useCardPoints;
        PaymentPlanRequestDto paymentPlanRequestDto = this.paymentPlan;
        String str5 = this.productType;
        String str6 = this.origin;
        StringBuilder sb2 = new StringBuilder("CreateChargeRequestDto(amount=");
        sb2.append(bigDecimal);
        sb2.append(", currency=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        sb2.append(", encryptedCard=");
        sb2.append(encryptedCardRequestDto);
        sb2.append(", method=");
        k.e(sb2, str3, ", orderId=", str4, ", useCardPoints=");
        sb2.append(z10);
        sb2.append(", paymentPlan=");
        sb2.append(paymentPlanRequestDto);
        sb2.append(", productType=");
        return c.b(sb2, str5, ", origin=", str6, ")");
    }
}
