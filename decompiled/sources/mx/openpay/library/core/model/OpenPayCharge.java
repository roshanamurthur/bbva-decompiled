package mx.openpay.library.core.model;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.appsdk.AppSDKException;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0010HÆ\u0003JÛ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005HÆ\u0001J\u0013\u0010N\u001a\u00020\u000b2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006S"}, d2 = {"Lmx/openpay/library/core/model/OpenPayCharge;", "", PushConstants.AMOUNT, "", "authorization", "", ValidationConstantsKt.Card, "Lmx/openpay/library/core/model/OpenPayCard;", "cardPoints", "Lmx/openpay/library/core/model/OpenPayCardPoints;", "conciliated", "", Constants.creationDate, "currency", "description", "emvTerminalData", "Lmx/openpay/library/core/model/OpenPayEmvTerminalData;", "errorMessage", "fee", "Lmx/openpay/library/core/model/OpenPayFee;", "id", "method", "operationDate", AppSDKException.KEY_OPERATION_TYPE, "orderId", "status", "transactionType", "gatewayCardPresent", "readMode", "(DLjava/lang/String;Lmx/openpay/library/core/model/OpenPayCard;Lmx/openpay/library/core/model/OpenPayCardPoints;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayEmvTerminalData;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayFee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getCard", "()Lmx/openpay/library/core/model/OpenPayCard;", "getCardPoints", "()Lmx/openpay/library/core/model/OpenPayCardPoints;", "getConciliated", "()Z", "getCreationDate", "getCurrency", "getDescription", "getEmvTerminalData", "()Lmx/openpay/library/core/model/OpenPayEmvTerminalData;", "getErrorMessage", "getFee", "()Lmx/openpay/library/core/model/OpenPayFee;", "getGatewayCardPresent", "getId", "getMethod", "getOperationDate", "getOperationType", "getOrderId", "getReadMode", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayCharge {
    public static final int $stable = 0;
    private final double amount;

    @NotNull
    private final String authorization;

    @Nullable
    private final OpenPayCard card;

    @Nullable
    private final OpenPayCardPoints cardPoints;
    private final boolean conciliated;

    @NotNull
    private final String creationDate;

    @NotNull
    private final String currency;

    @NotNull
    private final String description;

    @Nullable
    private final OpenPayEmvTerminalData emvTerminalData;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final OpenPayFee fee;

    @NotNull
    private final String gatewayCardPresent;

    @NotNull
    private final String id;

    @NotNull
    private final String method;

    @NotNull
    private final String operationDate;

    @NotNull
    private final String operationType;

    @NotNull
    private final String orderId;

    @NotNull
    private final String readMode;

    @NotNull
    private final String status;

    @NotNull
    private final String transactionType;

    public OpenPayCharge(double d2, @NotNull String authorization, @Nullable OpenPayCard openPayCard, @Nullable OpenPayCardPoints openPayCardPoints, boolean z10, @NotNull String creationDate, @NotNull String currency, @NotNull String description, @Nullable OpenPayEmvTerminalData openPayEmvTerminalData, @Nullable String str, @Nullable OpenPayFee openPayFee, @NotNull String id, @NotNull String method, @NotNull String operationDate, @NotNull String operationType, @NotNull String orderId, @NotNull String status, @NotNull String transactionType, @NotNull String gatewayCardPresent, @NotNull String readMode) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(gatewayCardPresent, "gatewayCardPresent");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        this.amount = d2;
        this.authorization = authorization;
        this.card = openPayCard;
        this.cardPoints = openPayCardPoints;
        this.conciliated = z10;
        this.creationDate = creationDate;
        this.currency = currency;
        this.description = description;
        this.emvTerminalData = openPayEmvTerminalData;
        this.errorMessage = str;
        this.fee = openPayFee;
        this.id = id;
        this.method = method;
        this.operationDate = operationDate;
        this.operationType = operationType;
        this.orderId = orderId;
        this.status = status;
        this.transactionType = transactionType;
        this.gatewayCardPresent = gatewayCardPresent;
        this.readMode = readMode;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final OpenPayFee getFee() {
        return this.fee;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OpenPayCard getCard() {
        return this.card;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OpenPayCardPoints getCardPoints() {
        return this.cardPoints;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OpenPayEmvTerminalData getEmvTerminalData() {
        return this.emvTerminalData;
    }

    @NotNull
    public final OpenPayCharge copy(double amount, @NotNull String authorization, @Nullable OpenPayCard card, @Nullable OpenPayCardPoints cardPoints, boolean conciliated, @NotNull String creationDate, @NotNull String currency, @NotNull String description, @Nullable OpenPayEmvTerminalData emvTerminalData, @Nullable String errorMessage, @Nullable OpenPayFee fee, @NotNull String id, @NotNull String method, @NotNull String operationDate, @NotNull String operationType, @NotNull String orderId, @NotNull String status, @NotNull String transactionType, @NotNull String gatewayCardPresent, @NotNull String readMode) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(gatewayCardPresent, "gatewayCardPresent");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        return new OpenPayCharge(amount, authorization, card, cardPoints, conciliated, creationDate, currency, description, emvTerminalData, errorMessage, fee, id, method, operationDate, operationType, orderId, status, transactionType, gatewayCardPresent, readMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayCharge)) {
            return false;
        }
        OpenPayCharge openPayCharge = (OpenPayCharge) other;
        return Double.compare(this.amount, openPayCharge.amount) == 0 && Intrinsics.areEqual(this.authorization, openPayCharge.authorization) && Intrinsics.areEqual(this.card, openPayCharge.card) && Intrinsics.areEqual(this.cardPoints, openPayCharge.cardPoints) && this.conciliated == openPayCharge.conciliated && Intrinsics.areEqual(this.creationDate, openPayCharge.creationDate) && Intrinsics.areEqual(this.currency, openPayCharge.currency) && Intrinsics.areEqual(this.description, openPayCharge.description) && Intrinsics.areEqual(this.emvTerminalData, openPayCharge.emvTerminalData) && Intrinsics.areEqual(this.errorMessage, openPayCharge.errorMessage) && Intrinsics.areEqual(this.fee, openPayCharge.fee) && Intrinsics.areEqual(this.id, openPayCharge.id) && Intrinsics.areEqual(this.method, openPayCharge.method) && Intrinsics.areEqual(this.operationDate, openPayCharge.operationDate) && Intrinsics.areEqual(this.operationType, openPayCharge.operationType) && Intrinsics.areEqual(this.orderId, openPayCharge.orderId) && Intrinsics.areEqual(this.status, openPayCharge.status) && Intrinsics.areEqual(this.transactionType, openPayCharge.transactionType) && Intrinsics.areEqual(this.gatewayCardPresent, openPayCharge.gatewayCardPresent) && Intrinsics.areEqual(this.readMode, openPayCharge.readMode);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final OpenPayCard getCard() {
        return this.card;
    }

    @Nullable
    public final OpenPayCardPoints getCardPoints() {
        return this.cardPoints;
    }

    public final boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    public final String getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final OpenPayEmvTerminalData getEmvTerminalData() {
        return this.emvTerminalData;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final OpenPayFee getFee() {
        return this.fee;
    }

    @NotNull
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getReadMode() {
        return this.readMode;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v34 */
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iA = a.a(this.authorization, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31);
        OpenPayCard openPayCard = this.card;
        int iHashCode = (iA + (openPayCard == null ? 0 : openPayCard.hashCode())) * 31;
        OpenPayCardPoints openPayCardPoints = this.cardPoints;
        int iHashCode2 = (iHashCode + (openPayCardPoints == null ? 0 : openPayCardPoints.hashCode())) * 31;
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iA2 = a.a(this.description, a.a(this.currency, a.a(this.creationDate, (iHashCode2 + r3) * 31, 31), 31), 31);
        OpenPayEmvTerminalData openPayEmvTerminalData = this.emvTerminalData;
        int iHashCode3 = (iA2 + (openPayEmvTerminalData == null ? 0 : openPayEmvTerminalData.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OpenPayFee openPayFee = this.fee;
        return this.readMode.hashCode() + a.a(this.gatewayCardPresent, a.a(this.transactionType, a.a(this.status, a.a(this.orderId, a.a(this.operationType, a.a(this.operationDate, a.a(this.method, a.a(this.id, (iHashCode4 + (openPayFee != null ? openPayFee.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        double d2 = this.amount;
        String str = this.authorization;
        OpenPayCard openPayCard = this.card;
        OpenPayCardPoints openPayCardPoints = this.cardPoints;
        boolean z10 = this.conciliated;
        String str2 = this.creationDate;
        String str3 = this.currency;
        String str4 = this.description;
        OpenPayEmvTerminalData openPayEmvTerminalData = this.emvTerminalData;
        String str5 = this.errorMessage;
        OpenPayFee openPayFee = this.fee;
        String str6 = this.id;
        String str7 = this.method;
        String str8 = this.operationDate;
        String str9 = this.operationType;
        String str10 = this.orderId;
        String str11 = this.status;
        String str12 = this.transactionType;
        String str13 = this.gatewayCardPresent;
        String str14 = this.readMode;
        StringBuilder sb2 = new StringBuilder("OpenPayCharge(amount=");
        sb2.append(d2);
        sb2.append(", authorization=");
        sb2.append(str);
        sb2.append(", card=");
        sb2.append(openPayCard);
        sb2.append(", cardPoints=");
        sb2.append(openPayCardPoints);
        sb2.append(", conciliated=");
        sb2.append(z10);
        sb2.append(", creationDate=");
        sb2.append(str2);
        k.e(sb2, ", currency=", str3, ", description=", str4);
        sb2.append(", emvTerminalData=");
        sb2.append(openPayEmvTerminalData);
        sb2.append(", errorMessage=");
        sb2.append(str5);
        sb2.append(", fee=");
        sb2.append(openPayFee);
        sb2.append(", id=");
        sb2.append(str6);
        k.e(sb2, ", method=", str7, ", operationDate=", str8);
        k.e(sb2, ", operationType=", str9, ", orderId=", str10);
        k.e(sb2, ", status=", str11, ", transactionType=", str12);
        k.e(sb2, ", gatewayCardPresent=", str13, ", readMode=", str14);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ OpenPayCharge(double d2, String str, OpenPayCard openPayCard, OpenPayCardPoints openPayCardPoints, boolean z10, String str2, String str3, String str4, OpenPayEmvTerminalData openPayEmvTerminalData, String str5, OpenPayFee openPayFee, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, str, (i10 & 4) != 0 ? null : openPayCard, (i10 & 8) != 0 ? null : openPayCardPoints, z10, str2, str3, str4, (i10 & 256) != 0 ? null : openPayEmvTerminalData, str5, (i10 & 1024) != 0 ? null : openPayFee, str6, str7, str8, str9, str10, str11, str12, (i10 & 262144) != 0 ? "" : str13, str14);
    }
}
