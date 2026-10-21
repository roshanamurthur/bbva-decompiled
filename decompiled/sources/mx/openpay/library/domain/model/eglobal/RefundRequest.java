package mx.openpay.library.domain.model.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RefundRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003Je\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%\"\u0004\b2\u00103R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%\"\u0004\b6\u00103R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010#\u001a\u0004\b8\u0010%\"\u0004\b9\u00103R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010#\u001a\u0004\b;\u0010%\"\u0004\b<\u00103¨\u0006?"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "", "Ljava/math/BigDecimal;", "component1", "", "component2", "component3", "component4", "Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "component5", "component6", "component7", "component8", "component9", PushConstants.AMOUNT, "description", "orderId", "transactionId", "encryptedCard", "tokenEy", "tokenEz", "tokenEs", "tokenCz", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "c", "getOrderId", "d", "getTransactionId", "e", "Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "getEncryptedCard", "()Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "setEncryptedCard", "(Lmx/openpay/library/domain/model/eglobal/EncryptedCard;)V", "f", "getTokenEy", "setTokenEy", "(Ljava/lang/String;)V", "g", "getTokenEz", "setTokenEz", "h", "getTokenEs", "setTokenEs", "i", "getTokenCz", "setTokenCz", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/EncryptedCard;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RefundRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String transactionId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public EncryptedCard encryptedCard;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String tokenEy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String tokenEz;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String tokenEs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String tokenCz;

    public RefundRequest(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId, @NotNull String transactionId, @Nullable EncryptedCard encryptedCard, @NotNull String tokenEy, @NotNull String tokenEz, @NotNull String tokenEs, @NotNull String tokenCz) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(tokenEy, "tokenEy");
        Intrinsics.checkNotNullParameter(tokenEz, "tokenEz");
        Intrinsics.checkNotNullParameter(tokenEs, "tokenEs");
        Intrinsics.checkNotNullParameter(tokenCz, "tokenCz");
        this.amount = amount;
        this.description = description;
        this.orderId = orderId;
        this.transactionId = transactionId;
        this.encryptedCard = encryptedCard;
        this.tokenEy = tokenEy;
        this.tokenEz = tokenEz;
        this.tokenEs = tokenEs;
        this.tokenCz = tokenCz;
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

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EncryptedCard getEncryptedCard() {
        return this.encryptedCard;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokenEy() {
        return this.tokenEy;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTokenEz() {
        return this.tokenEz;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTokenCz() {
        return this.tokenCz;
    }

    @NotNull
    public final RefundRequest copy(@NotNull BigDecimal amount, @NotNull String description, @NotNull String orderId, @NotNull String transactionId, @Nullable EncryptedCard encryptedCard, @NotNull String tokenEy, @NotNull String tokenEz, @NotNull String tokenEs, @NotNull String tokenCz) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(tokenEy, "tokenEy");
        Intrinsics.checkNotNullParameter(tokenEz, "tokenEz");
        Intrinsics.checkNotNullParameter(tokenEs, "tokenEs");
        Intrinsics.checkNotNullParameter(tokenCz, "tokenCz");
        return new RefundRequest(amount, description, orderId, transactionId, encryptedCard, tokenEy, tokenEz, tokenEs, tokenCz);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundRequest)) {
            return false;
        }
        RefundRequest refundRequest = (RefundRequest) other;
        return Intrinsics.areEqual(this.amount, refundRequest.amount) && Intrinsics.areEqual(this.description, refundRequest.description) && Intrinsics.areEqual(this.orderId, refundRequest.orderId) && Intrinsics.areEqual(this.transactionId, refundRequest.transactionId) && Intrinsics.areEqual(this.encryptedCard, refundRequest.encryptedCard) && Intrinsics.areEqual(this.tokenEy, refundRequest.tokenEy) && Intrinsics.areEqual(this.tokenEz, refundRequest.tokenEz) && Intrinsics.areEqual(this.tokenEs, refundRequest.tokenEs) && Intrinsics.areEqual(this.tokenCz, refundRequest.tokenCz);
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
    public final EncryptedCard getEncryptedCard() {
        return this.encryptedCard;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getTokenCz() {
        return this.tokenCz;
    }

    @NotNull
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @NotNull
    public final String getTokenEy() {
        return this.tokenEy;
    }

    @NotNull
    public final String getTokenEz() {
        return this.tokenEz;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int iC = n1.c(this.transactionId, n1.c(this.orderId, n1.c(this.description, this.amount.hashCode() * 31, 31), 31), 31);
        EncryptedCard encryptedCard = this.encryptedCard;
        return this.tokenCz.hashCode() + n1.c(this.tokenEs, n1.c(this.tokenEz, n1.c(this.tokenEy, (iC + (encryptedCard == null ? 0 : encryptedCard.hashCode())) * 31, 31), 31), 31);
    }

    public final void setEncryptedCard(@Nullable EncryptedCard encryptedCard) {
        this.encryptedCard = encryptedCard;
    }

    public final void setTokenCz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenCz = str;
    }

    public final void setTokenEs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenEs = str;
    }

    public final void setTokenEy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenEy = str;
    }

    public final void setTokenEz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenEz = str;
    }

    @NotNull
    public String toString() {
        EncryptedCard encryptedCard = this.encryptedCard;
        String str = this.tokenEy;
        String str2 = this.tokenEz;
        String str3 = this.tokenEs;
        String str4 = this.tokenCz;
        StringBuilder sb2 = new StringBuilder("RefundRequest(amount=");
        sb2.append(this.amount);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", orderId=");
        sb2.append(this.orderId);
        sb2.append(", transactionId=");
        sb2.append(this.transactionId);
        sb2.append(", encryptedCard=");
        sb2.append(encryptedCard);
        sb2.append(", tokenEy=");
        k.e(sb2, str, ", tokenEz=", str2, ", tokenEs=");
        return c.b(sb2, str3, ", tokenCz=", str4, ")");
    }

    public /* synthetic */ RefundRequest(BigDecimal bigDecimal, String str, String str2, String str3, EncryptedCard encryptedCard, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? null : encryptedCard, (i10 & 32) != 0 ? "" : str4, (i10 & 64) != 0 ? "" : str5, (i10 & 128) != 0 ? "" : str6, (i10 & 256) != 0 ? "" : str7);
    }
}
