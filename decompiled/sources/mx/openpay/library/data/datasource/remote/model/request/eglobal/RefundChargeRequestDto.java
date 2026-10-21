package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RefundChargeRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0019R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0019¨\u0006/"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/RefundChargeRequestDto;", "", PushConstants.AMOUNT, "Ljava/math/BigDecimal;", "description", "", "orderId", "encryptedCard", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;", "tokenEy", "tokenEz", "tokenEs", "tokenCz", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getDescription", "()Ljava/lang/String;", "getEncryptedCard", "()Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;", "setEncryptedCard", "(Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;)V", "getOrderId", "getTokenCz", "setTokenCz", "(Ljava/lang/String;)V", "getTokenEs", "setTokenEs", "getTokenEy", "setTokenEy", "getTokenEz", "setTokenEz", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RefundChargeRequestDto {

    @SerializedName(PushConstants.AMOUNT)
    @NotNull
    private final BigDecimal amount;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("encrypted_card")
    @Nullable
    private EncryptedCardRequestDto encryptedCard;

    @SerializedName("order_id")
    @NotNull
    private final String orderId;

    @SerializedName("tokenCz")
    @Nullable
    private String tokenCz;

    @SerializedName("tokenEs")
    @Nullable
    private String tokenEs;

    @SerializedName("tokenEy")
    @Nullable
    private String tokenEy;

    @SerializedName("tokenEz")
    @Nullable
    private String tokenEz;

    public RefundChargeRequestDto(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId, @Nullable EncryptedCardRequestDto encryptedCardRequestDto, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.amount = amount;
        this.description = description;
        this.orderId = orderId;
        this.encryptedCard = encryptedCardRequestDto;
        this.tokenEy = str;
        this.tokenEz = str2;
        this.tokenEs = str3;
        this.tokenCz = str4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EncryptedCardRequestDto getEncryptedCard() {
        return this.encryptedCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTokenEy() {
        return this.tokenEy;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokenEz() {
        return this.tokenEz;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTokenCz() {
        return this.tokenCz;
    }

    @NotNull
    public final RefundChargeRequestDto copy(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId, @Nullable EncryptedCardRequestDto encryptedCard, @Nullable String tokenEy, @Nullable String tokenEz, @Nullable String tokenEs, @Nullable String tokenCz) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new RefundChargeRequestDto(amount, description, orderId, encryptedCard, tokenEy, tokenEz, tokenEs, tokenCz);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundChargeRequestDto)) {
            return false;
        }
        RefundChargeRequestDto refundChargeRequestDto = (RefundChargeRequestDto) other;
        return Intrinsics.areEqual(this.amount, refundChargeRequestDto.amount) && Intrinsics.areEqual(this.description, refundChargeRequestDto.description) && Intrinsics.areEqual(this.orderId, refundChargeRequestDto.orderId) && Intrinsics.areEqual(this.encryptedCard, refundChargeRequestDto.encryptedCard) && Intrinsics.areEqual(this.tokenEy, refundChargeRequestDto.tokenEy) && Intrinsics.areEqual(this.tokenEz, refundChargeRequestDto.tokenEz) && Intrinsics.areEqual(this.tokenEs, refundChargeRequestDto.tokenEs) && Intrinsics.areEqual(this.tokenCz, refundChargeRequestDto.tokenCz);
    }

    @NotNull
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final EncryptedCardRequestDto getEncryptedCard() {
        return this.encryptedCard;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getTokenCz() {
        return this.tokenCz;
    }

    @Nullable
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @Nullable
    public final String getTokenEy() {
        return this.tokenEy;
    }

    @Nullable
    public final String getTokenEz() {
        return this.tokenEz;
    }

    public int hashCode() {
        int iC = n1.c(this.orderId, n1.c(this.description, this.amount.hashCode() * 31, 31), 31);
        EncryptedCardRequestDto encryptedCardRequestDto = this.encryptedCard;
        int iHashCode = (iC + (encryptedCardRequestDto == null ? 0 : encryptedCardRequestDto.hashCode())) * 31;
        String str = this.tokenEy;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tokenEz;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenEs;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tokenCz;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setEncryptedCard(@Nullable EncryptedCardRequestDto encryptedCardRequestDto) {
        this.encryptedCard = encryptedCardRequestDto;
    }

    public final void setTokenCz(@Nullable String str) {
        this.tokenCz = str;
    }

    public final void setTokenEs(@Nullable String str) {
        this.tokenEs = str;
    }

    public final void setTokenEy(@Nullable String str) {
        this.tokenEy = str;
    }

    public final void setTokenEz(@Nullable String str) {
        this.tokenEz = str;
    }

    @NotNull
    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.description;
        String str2 = this.orderId;
        EncryptedCardRequestDto encryptedCardRequestDto = this.encryptedCard;
        String str3 = this.tokenEy;
        String str4 = this.tokenEz;
        String str5 = this.tokenEs;
        String str6 = this.tokenCz;
        StringBuilder sb2 = new StringBuilder("RefundChargeRequestDto(amount=");
        sb2.append(bigDecimal);
        sb2.append(", description=");
        sb2.append(str);
        sb2.append(", orderId=");
        sb2.append(str2);
        sb2.append(", encryptedCard=");
        sb2.append(encryptedCardRequestDto);
        sb2.append(", tokenEy=");
        k.e(sb2, str3, ", tokenEz=", str4, ", tokenEs=");
        return c.b(sb2, str5, ", tokenCz=", str6, ")");
    }

    public /* synthetic */ RefundChargeRequestDto(BigDecimal bigDecimal, String str, String str2, EncryptedCardRequestDto encryptedCardRequestDto, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, str2, (i10 & 8) != 0 ? null : encryptedCardRequestDto, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6);
    }
}
