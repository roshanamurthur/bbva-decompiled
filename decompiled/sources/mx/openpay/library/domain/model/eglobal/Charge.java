package mx.openpay.library.domain.model.eglobal;

import androidx.camera.camera2.internal.n1;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.appsdk.AppSDKException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.Card;
import mx.openpay.library.domain.model.CardPoints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Charge.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b@\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\b\b\u0002\u00101\u001a\u00020\u0004\u0012\u0006\u00102\u001a\u00020\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bt\u0010uJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003Jé\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\t\u00105\u001a\u00020\u0004HÖ\u0001J\t\u00107\u001a\u000206HÖ\u0001J\u0013\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\"\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010#\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010?\u001a\u0004\bO\u0010AR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010AR\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bR\u0010?\u001a\u0004\bS\u0010AR\u0019\u0010'\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010(\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bX\u0010?\u001a\u0004\bY\u0010AR\u0019\u0010)\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010?\u001a\u0004\b_\u0010AR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010?\u001a\u0004\ba\u0010AR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010?\u001a\u0004\bc\u0010AR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010?\u001a\u0004\be\u0010AR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010?\u001a\u0004\bg\u0010AR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010?\u001a\u0004\bi\u0010AR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010?\u001a\u0004\bk\u0010AR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010?\u001a\u0004\bm\u0010AR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u0010?\u001a\u0004\bo\u0010AR\u0019\u00103\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s¨\u0006v"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/Charge;", "", "", "component1", "", "component2", "Lmx/openpay/library/domain/model/Card;", "component3", "Lmx/openpay/library/domain/model/CardPoints;", "component4", "", "component5", "component6", "component7", "component8", "Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;", "component9", "component10", "Lmx/openpay/library/domain/model/eglobal/Fee;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "component21", PushConstants.AMOUNT, "authorization", ValidationConstantsKt.Card, "cardPoints", "conciliated", Constants.creationDate, "currency", "description", "emvTerminalData", "errorMessage", "fee", "id", "method", "operationDate", AppSDKException.KEY_OPERATION_TYPE, "orderId", "status", "transactionType", "gatewayCardPresent", "readMode", "paymentPlan", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "D", "getAmount", "()D", "b", "Ljava/lang/String;", "getAuthorization", "()Ljava/lang/String;", "c", "Lmx/openpay/library/domain/model/Card;", "getCard", "()Lmx/openpay/library/domain/model/Card;", "d", "Lmx/openpay/library/domain/model/CardPoints;", "getCardPoints", "()Lmx/openpay/library/domain/model/CardPoints;", "e", "Z", "getConciliated", "()Z", "f", "getCreationDate", "g", "getCurrency", "h", "getDescription", "i", "Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;", "getEmvTerminalData", "()Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;", "j", "getErrorMessage", "k", "Lmx/openpay/library/domain/model/eglobal/Fee;", "getFee", "()Lmx/openpay/library/domain/model/eglobal/Fee;", "l", "getId", "m", "getMethod", "n", "getOperationDate", "o", "getOperationType", "p", "getOrderId", "q", "getStatus", "r", "getTransactionType", "s", "getGatewayCardPresent", "t", "getReadMode", "u", "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "getPaymentPlan", "()Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "<init>", "(DLjava/lang/String;Lmx/openpay/library/domain/model/Card;Lmx/openpay/library/domain/model/CardPoints;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/Fee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/PaymentPlan;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Charge {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authorization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Card card;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CardPoints cardPoints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean conciliated;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String creationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String description;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final EmvTerminalData emvTerminalData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String errorMessage;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Fee fee;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String method;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operationDate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operationType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String status;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String transactionType;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String gatewayCardPresent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String readMode;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PaymentPlan paymentPlan;

    public Charge(double d2, @NotNull String authorization, @Nullable Card card, @Nullable CardPoints cardPoints, boolean z10, @NotNull String creationDate, @NotNull String currency, @Nullable String str, @Nullable EmvTerminalData emvTerminalData, @Nullable String str2, @Nullable Fee fee, @NotNull String id, @NotNull String method, @NotNull String operationDate, @NotNull String operationType, @NotNull String orderId, @NotNull String status, @NotNull String transactionType, @NotNull String gatewayCardPresent, @NotNull String readMode, @Nullable PaymentPlan paymentPlan) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
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
        this.card = card;
        this.cardPoints = cardPoints;
        this.conciliated = z10;
        this.creationDate = creationDate;
        this.currency = currency;
        this.description = str;
        this.emvTerminalData = emvTerminalData;
        this.errorMessage = str2;
        this.fee = fee;
        this.id = id;
        this.method = method;
        this.operationDate = operationDate;
        this.operationType = operationType;
        this.orderId = orderId;
        this.status = status;
        this.transactionType = transactionType;
        this.gatewayCardPresent = gatewayCardPresent;
        this.readMode = readMode;
        this.paymentPlan = paymentPlan;
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
    public final Fee getFee() {
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
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final PaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CardPoints getCardPoints() {
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

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EmvTerminalData getEmvTerminalData() {
        return this.emvTerminalData;
    }

    @NotNull
    public final Charge copy(double amount, @NotNull String authorization, @Nullable Card card, @Nullable CardPoints cardPoints, boolean conciliated, @NotNull String creationDate, @NotNull String currency, @Nullable String description, @Nullable EmvTerminalData emvTerminalData, @Nullable String errorMessage, @Nullable Fee fee, @NotNull String id, @NotNull String method, @NotNull String operationDate, @NotNull String operationType, @NotNull String orderId, @NotNull String status, @NotNull String transactionType, @NotNull String gatewayCardPresent, @NotNull String readMode, @Nullable PaymentPlan paymentPlan) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(gatewayCardPresent, "gatewayCardPresent");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        return new Charge(amount, authorization, card, cardPoints, conciliated, creationDate, currency, description, emvTerminalData, errorMessage, fee, id, method, operationDate, operationType, orderId, status, transactionType, gatewayCardPresent, readMode, paymentPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Charge)) {
            return false;
        }
        Charge charge = (Charge) other;
        return Double.compare(this.amount, charge.amount) == 0 && Intrinsics.areEqual(this.authorization, charge.authorization) && Intrinsics.areEqual(this.card, charge.card) && Intrinsics.areEqual(this.cardPoints, charge.cardPoints) && this.conciliated == charge.conciliated && Intrinsics.areEqual(this.creationDate, charge.creationDate) && Intrinsics.areEqual(this.currency, charge.currency) && Intrinsics.areEqual(this.description, charge.description) && Intrinsics.areEqual(this.emvTerminalData, charge.emvTerminalData) && Intrinsics.areEqual(this.errorMessage, charge.errorMessage) && Intrinsics.areEqual(this.fee, charge.fee) && Intrinsics.areEqual(this.id, charge.id) && Intrinsics.areEqual(this.method, charge.method) && Intrinsics.areEqual(this.operationDate, charge.operationDate) && Intrinsics.areEqual(this.operationType, charge.operationType) && Intrinsics.areEqual(this.orderId, charge.orderId) && Intrinsics.areEqual(this.status, charge.status) && Intrinsics.areEqual(this.transactionType, charge.transactionType) && Intrinsics.areEqual(this.gatewayCardPresent, charge.gatewayCardPresent) && Intrinsics.areEqual(this.readMode, charge.readMode) && Intrinsics.areEqual(this.paymentPlan, charge.paymentPlan);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final Card getCard() {
        return this.card;
    }

    @Nullable
    public final CardPoints getCardPoints() {
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

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final EmvTerminalData getEmvTerminalData() {
        return this.emvTerminalData;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Fee getFee() {
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

    @Nullable
    public final PaymentPlan getPaymentPlan() {
        return this.paymentPlan;
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
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iC = n1.c(this.authorization, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31);
        Card card = this.card;
        int iHashCode = (iC + (card == null ? 0 : card.hashCode())) * 31;
        CardPoints cardPoints = this.cardPoints;
        int iHashCode2 = (iHashCode + (cardPoints == null ? 0 : cardPoints.hashCode())) * 31;
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iC2 = n1.c(this.currency, n1.c(this.creationDate, (iHashCode2 + r3) * 31, 31), 31);
        String str = this.description;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        EmvTerminalData emvTerminalData = this.emvTerminalData;
        int iHashCode4 = (iHashCode3 + (emvTerminalData == null ? 0 : emvTerminalData.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Fee fee = this.fee;
        int iC3 = n1.c(this.readMode, n1.c(this.gatewayCardPresent, n1.c(this.transactionType, n1.c(this.status, n1.c(this.orderId, n1.c(this.operationType, n1.c(this.operationDate, n1.c(this.method, n1.c(this.id, (iHashCode5 + (fee == null ? 0 : fee.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        PaymentPlan paymentPlan = this.paymentPlan;
        return iC3 + (paymentPlan != null ? paymentPlan.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Charge(amount=" + this.amount + ", authorization=" + this.authorization + ", card=" + this.card + ", cardPoints=" + this.cardPoints + ", conciliated=" + this.conciliated + ", creationDate=" + this.creationDate + ", currency=" + this.currency + ", description=" + this.description + ", emvTerminalData=" + this.emvTerminalData + ", errorMessage=" + this.errorMessage + ", fee=" + this.fee + ", id=" + this.id + ", method=" + this.method + ", operationDate=" + this.operationDate + ", operationType=" + this.operationType + ", orderId=" + this.orderId + ", status=" + this.status + ", transactionType=" + this.transactionType + ", gatewayCardPresent=" + this.gatewayCardPresent + ", readMode=" + this.readMode + ", paymentPlan=" + this.paymentPlan + ")";
    }

    public /* synthetic */ Charge(double d2, String str, Card card, CardPoints cardPoints, boolean z10, String str2, String str3, String str4, EmvTerminalData emvTerminalData, String str5, Fee fee, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, PaymentPlan paymentPlan, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, str, (i10 & 4) != 0 ? null : card, (i10 & 8) != 0 ? null : cardPoints, z10, str2, str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : emvTerminalData, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : fee, str6, str7, str8, str9, str10, str11, str12, (262144 & i10) != 0 ? "" : str13, str14, (i10 & 1048576) != 0 ? null : paymentPlan);
    }
}
