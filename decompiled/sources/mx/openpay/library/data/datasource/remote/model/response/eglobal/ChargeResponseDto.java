package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.gson.annotations.SerializedName;
import com.noknok.android.client.appsdk.AppSDKException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.transaction.PaymentPlanResponseDto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChargeResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jë\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001J\u0013\u0010S\u001a\u00020\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\t\u0010W\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#¨\u0006X"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/ChargeResponseDto;", "", PushConstants.AMOUNT, "", "authorization", "", ValidationConstantsKt.Card, "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;", "cardPoints", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;", "conciliated", "", Constants.creationDate, "currency", "description", "emvTerminalData", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;", "errorMessage", "fee", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "id", "method", "gatewayCardPresent", "readMode", "operationDate", AppSDKException.KEY_OPERATION_TYPE, "orderId", "status", "transactionType", "paymentPlan", "Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;", "(DLjava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getCard", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;", "getCardPoints", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;", "getConciliated", "()Z", "getCreationDate", "getCurrency", "getDescription", "getEmvTerminalData", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;", "getErrorMessage", "getFee", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "getGatewayCardPresent", "getId", "getMethod", "getOperationDate", "getOperationType", "getOrderId", "getPaymentPlan", "()Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;", "getReadMode", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ChargeResponseDto {

    @SerializedName(PushConstants.AMOUNT)
    private final double amount;

    @SerializedName("authorization")
    @Nullable
    private final String authorization;

    @SerializedName(ValidationConstantsKt.Card)
    @Nullable
    private final CardResponseDto card;

    @SerializedName("card_points")
    @NotNull
    private final CardPointsResponseDto cardPoints;

    @SerializedName("conciliated")
    private final boolean conciliated;

    @SerializedName("creation_date")
    @NotNull
    private final String creationDate;

    @SerializedName("currency")
    @NotNull
    private final String currency;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("emvTerminalData")
    @Nullable
    private final EmvTerminalDataResponseDto emvTerminalData;

    @SerializedName("error_message")
    @Nullable
    private final String errorMessage;

    @SerializedName("fee")
    @Nullable
    private final FeeResponseDto fee;

    @SerializedName("gateway_card_present")
    @Nullable
    private final String gatewayCardPresent;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("method")
    @NotNull
    private final String method;

    @SerializedName("operation_date")
    @NotNull
    private final String operationDate;

    @SerializedName("operation_type")
    @NotNull
    private final String operationType;

    @SerializedName("order_id")
    @NotNull
    private final String orderId;

    @SerializedName("payment_plan")
    @Nullable
    private final PaymentPlanResponseDto paymentPlan;

    @SerializedName("read_mode")
    @Nullable
    private final String readMode;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName(SqlContracts.BulletEntry.TRANSACTION_TYPE)
    @NotNull
    private final String transactionType;

    public ChargeResponseDto(double d2, @Nullable String str, @Nullable CardResponseDto cardResponseDto, @NotNull CardPointsResponseDto cardPoints, boolean z10, @NotNull String creationDate, @NotNull String currency, @NotNull String description, @Nullable EmvTerminalDataResponseDto emvTerminalDataResponseDto, @Nullable String str2, @Nullable FeeResponseDto feeResponseDto, @NotNull String id, @NotNull String method, @Nullable String str3, @Nullable String str4, @NotNull String operationDate, @NotNull String operationType, @NotNull String orderId, @NotNull String status, @NotNull String transactionType, @Nullable PaymentPlanResponseDto paymentPlanResponseDto) {
        Intrinsics.checkNotNullParameter(cardPoints, "cardPoints");
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
        this.amount = d2;
        this.authorization = str;
        this.card = cardResponseDto;
        this.cardPoints = cardPoints;
        this.conciliated = z10;
        this.creationDate = creationDate;
        this.currency = currency;
        this.description = description;
        this.emvTerminalData = emvTerminalDataResponseDto;
        this.errorMessage = str2;
        this.fee = feeResponseDto;
        this.id = id;
        this.method = method;
        this.gatewayCardPresent = str3;
        this.readMode = str4;
        this.operationDate = operationDate;
        this.operationType = operationType;
        this.orderId = orderId;
        this.status = status;
        this.transactionType = transactionType;
        this.paymentPlan = paymentPlanResponseDto;
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
    public final FeeResponseDto getFee() {
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

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final PaymentPlanResponseDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CardResponseDto getCard() {
        return this.card;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CardPointsResponseDto getCardPoints() {
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
    public final EmvTerminalDataResponseDto getEmvTerminalData() {
        return this.emvTerminalData;
    }

    @NotNull
    public final ChargeResponseDto copy(double amount, @Nullable String authorization, @Nullable CardResponseDto card, @NotNull CardPointsResponseDto cardPoints, boolean conciliated, @NotNull String creationDate, @NotNull String currency, @NotNull String description, @Nullable EmvTerminalDataResponseDto emvTerminalData, @Nullable String errorMessage, @Nullable FeeResponseDto fee, @NotNull String id, @NotNull String method, @Nullable String gatewayCardPresent, @Nullable String readMode, @NotNull String operationDate, @NotNull String operationType, @NotNull String orderId, @NotNull String status, @NotNull String transactionType, @Nullable PaymentPlanResponseDto paymentPlan) {
        Intrinsics.checkNotNullParameter(cardPoints, "cardPoints");
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
        return new ChargeResponseDto(amount, authorization, card, cardPoints, conciliated, creationDate, currency, description, emvTerminalData, errorMessage, fee, id, method, gatewayCardPresent, readMode, operationDate, operationType, orderId, status, transactionType, paymentPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChargeResponseDto)) {
            return false;
        }
        ChargeResponseDto chargeResponseDto = (ChargeResponseDto) other;
        return Double.compare(this.amount, chargeResponseDto.amount) == 0 && Intrinsics.areEqual(this.authorization, chargeResponseDto.authorization) && Intrinsics.areEqual(this.card, chargeResponseDto.card) && Intrinsics.areEqual(this.cardPoints, chargeResponseDto.cardPoints) && this.conciliated == chargeResponseDto.conciliated && Intrinsics.areEqual(this.creationDate, chargeResponseDto.creationDate) && Intrinsics.areEqual(this.currency, chargeResponseDto.currency) && Intrinsics.areEqual(this.description, chargeResponseDto.description) && Intrinsics.areEqual(this.emvTerminalData, chargeResponseDto.emvTerminalData) && Intrinsics.areEqual(this.errorMessage, chargeResponseDto.errorMessage) && Intrinsics.areEqual(this.fee, chargeResponseDto.fee) && Intrinsics.areEqual(this.id, chargeResponseDto.id) && Intrinsics.areEqual(this.method, chargeResponseDto.method) && Intrinsics.areEqual(this.gatewayCardPresent, chargeResponseDto.gatewayCardPresent) && Intrinsics.areEqual(this.readMode, chargeResponseDto.readMode) && Intrinsics.areEqual(this.operationDate, chargeResponseDto.operationDate) && Intrinsics.areEqual(this.operationType, chargeResponseDto.operationType) && Intrinsics.areEqual(this.orderId, chargeResponseDto.orderId) && Intrinsics.areEqual(this.status, chargeResponseDto.status) && Intrinsics.areEqual(this.transactionType, chargeResponseDto.transactionType) && Intrinsics.areEqual(this.paymentPlan, chargeResponseDto.paymentPlan);
    }

    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final CardResponseDto getCard() {
        return this.card;
    }

    @NotNull
    public final CardPointsResponseDto getCardPoints() {
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
    public final EmvTerminalDataResponseDto getEmvTerminalData() {
        return this.emvTerminalData;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final FeeResponseDto getFee() {
        return this.fee;
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

    @Nullable
    public final PaymentPlanResponseDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
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
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        String str = this.authorization;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        CardResponseDto cardResponseDto = this.card;
        int iHashCode2 = (this.cardPoints.hashCode() + ((iHashCode + (cardResponseDto == null ? 0 : cardResponseDto.hashCode())) * 31)) * 31;
        boolean z10 = this.conciliated;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int iC = n1.c(this.description, n1.c(this.currency, n1.c(this.creationDate, (iHashCode2 + r1) * 31, 31), 31), 31);
        EmvTerminalDataResponseDto emvTerminalDataResponseDto = this.emvTerminalData;
        int iHashCode3 = (iC + (emvTerminalDataResponseDto == null ? 0 : emvTerminalDataResponseDto.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FeeResponseDto feeResponseDto = this.fee;
        int iC2 = n1.c(this.method, n1.c(this.id, (iHashCode4 + (feeResponseDto == null ? 0 : feeResponseDto.hashCode())) * 31, 31), 31);
        String str3 = this.gatewayCardPresent;
        int iHashCode5 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.readMode;
        int iC3 = n1.c(this.transactionType, n1.c(this.status, n1.c(this.orderId, n1.c(this.operationType, n1.c(this.operationDate, (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31), 31), 31);
        PaymentPlanResponseDto paymentPlanResponseDto = this.paymentPlan;
        return iC3 + (paymentPlanResponseDto != null ? paymentPlanResponseDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        double d2 = this.amount;
        String str = this.authorization;
        CardResponseDto cardResponseDto = this.card;
        CardPointsResponseDto cardPointsResponseDto = this.cardPoints;
        boolean z10 = this.conciliated;
        String str2 = this.creationDate;
        String str3 = this.currency;
        String str4 = this.description;
        EmvTerminalDataResponseDto emvTerminalDataResponseDto = this.emvTerminalData;
        String str5 = this.errorMessage;
        FeeResponseDto feeResponseDto = this.fee;
        String str6 = this.id;
        String str7 = this.method;
        String str8 = this.gatewayCardPresent;
        String str9 = this.readMode;
        String str10 = this.operationDate;
        String str11 = this.operationType;
        String str12 = this.orderId;
        String str13 = this.status;
        String str14 = this.transactionType;
        PaymentPlanResponseDto paymentPlanResponseDto = this.paymentPlan;
        StringBuilder sb2 = new StringBuilder("ChargeResponseDto(amount=");
        sb2.append(d2);
        sb2.append(", authorization=");
        sb2.append(str);
        sb2.append(", card=");
        sb2.append(cardResponseDto);
        sb2.append(", cardPoints=");
        sb2.append(cardPointsResponseDto);
        sb2.append(", conciliated=");
        sb2.append(z10);
        sb2.append(", creationDate=");
        sb2.append(str2);
        k.e(sb2, ", currency=", str3, ", description=", str4);
        sb2.append(", emvTerminalData=");
        sb2.append(emvTerminalDataResponseDto);
        sb2.append(", errorMessage=");
        sb2.append(str5);
        sb2.append(", fee=");
        sb2.append(feeResponseDto);
        sb2.append(", id=");
        sb2.append(str6);
        k.e(sb2, ", method=", str7, ", gatewayCardPresent=", str8);
        k.e(sb2, ", readMode=", str9, ", operationDate=", str10);
        k.e(sb2, ", operationType=", str11, ", orderId=", str12);
        k.e(sb2, ", status=", str13, ", transactionType=", str14);
        sb2.append(", paymentPlan=");
        sb2.append(paymentPlanResponseDto);
        sb2.append(")");
        return sb2.toString();
    }
}
