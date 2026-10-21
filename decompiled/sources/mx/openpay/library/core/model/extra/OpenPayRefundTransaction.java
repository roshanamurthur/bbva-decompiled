package mx.openpay.library.core.model.extra;

import androidx.annotation.Keep;
import androidx.collection.f;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006%"}, d2 = {"Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;", "", "gatewayCardPresent", "", PushConstants.AMOUNT, "", "orderId", "description", "id", ValidationConstantsKt.Card, "Lmx/openpay/library/core/model/extra/CardDTO;", "readMode", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/extra/CardDTO;Ljava/lang/String;)V", "getAmount", "()D", "getCard", "()Lmx/openpay/library/core/model/extra/CardDTO;", "getDescription", "()Ljava/lang/String;", "getGatewayCardPresent", "getId", "getOrderId", "getReadMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayRefundTransaction {
    public static final int $stable = 0;
    private final double amount;

    @Nullable
    private final CardDTO card;

    @Nullable
    private final String description;

    @Nullable
    private final String gatewayCardPresent;

    @NotNull
    private final String id;

    @NotNull
    private final String orderId;

    @NotNull
    private final String readMode;

    public OpenPayRefundTransaction(@Nullable String str, double d2, @NotNull String orderId, @Nullable String str2, @NotNull String id, @Nullable CardDTO cardDTO, @NotNull String readMode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        this.gatewayCardPresent = str;
        this.amount = d2;
        this.orderId = orderId;
        this.description = str2;
        this.id = id;
        this.card = cardDTO;
        this.readMode = readMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardDTO getCard() {
        return this.card;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    @NotNull
    public final OpenPayRefundTransaction copy(@Nullable String gatewayCardPresent, double amount, @NotNull String orderId, @Nullable String description, @NotNull String id, @Nullable CardDTO card, @NotNull String readMode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        return new OpenPayRefundTransaction(gatewayCardPresent, amount, orderId, description, id, card, readMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayRefundTransaction)) {
            return false;
        }
        OpenPayRefundTransaction openPayRefundTransaction = (OpenPayRefundTransaction) other;
        return Intrinsics.areEqual(this.gatewayCardPresent, openPayRefundTransaction.gatewayCardPresent) && Double.compare(this.amount, openPayRefundTransaction.amount) == 0 && Intrinsics.areEqual(this.orderId, openPayRefundTransaction.orderId) && Intrinsics.areEqual(this.description, openPayRefundTransaction.description) && Intrinsics.areEqual(this.id, openPayRefundTransaction.id) && Intrinsics.areEqual(this.card, openPayRefundTransaction.card) && Intrinsics.areEqual(this.readMode, openPayRefundTransaction.readMode);
    }

    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    public final CardDTO getCard() {
        return this.card;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getReadMode() {
        return this.readMode;
    }

    public int hashCode() {
        String str = this.gatewayCardPresent;
        int iHashCode = str == null ? 0 : str.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iA = a.a(this.orderId, (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + (iHashCode * 31)) * 31, 31);
        String str2 = this.description;
        int iA2 = a.a(this.id, (iA + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        CardDTO cardDTO = this.card;
        return this.readMode.hashCode() + ((iA2 + (cardDTO != null ? cardDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.gatewayCardPresent;
        double d2 = this.amount;
        String str2 = this.orderId;
        String str3 = this.description;
        String str4 = this.id;
        CardDTO cardDTO = this.card;
        String str5 = this.readMode;
        StringBuilder sb2 = new StringBuilder("OpenPayRefundTransaction(gatewayCardPresent=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(d2);
        k.e(sb2, ", orderId=", str2, ", description=", str3);
        sb2.append(", id=");
        sb2.append(str4);
        sb2.append(", card=");
        sb2.append(cardDTO);
        return f.c(sb2, ", readMode=", str5, ")");
    }

    public /* synthetic */ OpenPayRefundTransaction(String str, double d2, String str2, String str3, String str4, CardDTO cardDTO, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, d2, str2, (i10 & 8) != 0 ? null : str3, str4, (i10 & 32) != 0 ? null : cardDTO, str5);
    }
}
